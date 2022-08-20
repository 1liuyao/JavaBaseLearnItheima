package com.myannotation;
/*
    【注解概述】
    1、注解其实就是代码中的特殊标记，这些标记可以在编译、类加载、运行时被读取，并执行相应的处理。
    通过使用注解，程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息。代码分析工具、
    开发工具和部署工具可以通过这些补充信息进行验证和部署。
    2、注解可以像修饰符一样被使用，可用于修饰包，类，构造器，方法，成员变量，参数，局部变量的声明，
    这些信息被保存在Annotation的"name=value"对中。
    3、未来的开发模式都是基于注解的，一定程度上可以说：框架=注解+反射+设计模式
    4、使用Annotation时要在前面增加@符号，并把该Annotation当成一个修饰符使用。用于修饰它支持的程序元素。

    【常见的Annotation示例】
    1、文档注释
    2、在编译时进行格式检查（JDK内置的三个基本注解）
        ①Override：限定重写父类方法，该注解只能用于方法
        ②Deprecated：表示所修饰的类或方法已经过时，有更好的选择。
        ③SuppressWarnings：抑制编译器警告
    3、跟踪代码依赖性，实现替代配置文件功能，即框架中给出的注释。

    【自定义Annotation】：参照@SuppressWarnings注解定义
    1、注解声明为@interface
    2、自定义注解自动继承了java.lang.annotation.Annotation接口
    3、可是使用default关键字定义成员变量初始值
    4、如果定义的注解含有配置参数，那么使用时必须指定参数值，除非它有默认值。格式是”参数名=参数值“
       如果只有一个参数成员，且名称为value，则可以省略”value=“
    5、如果只有一个参数成员，建议使用参数名为value
    6、没有成员定义的Annotation称为标记；包含成员变量的Annotation称为元数据Annotation。
    7、自定义注解必须配上注解的信息处理流程（使用反射）才有意义，需要被元注解修饰。

    【JDK中的元注解】:用于修饰其他Annotation的注解
    1、Retention：修饰注释的声明周期，内部包含一个RetentionPolicy类型的成员变量。
        public enum RetentionPolicy {
                SOURCE,//在源文件中有效，编译器直接丢弃这种策略的注释
                CLASS,//在class文件中有效，当java程序运行时，JVM不会保留注释，这是默认值,即不使用注释标明生命期的注解，都是class阶段的注解。
                RUNTIME//在运行时有效，当java程序运行时，JVM会保留注释。程序可以通过反射获取该注释
        }
    2、Target：用于指定被修饰的Annotation能用于修饰哪些程序元素。@Target也包含一个名为value的成员变量
        public enum ElementType {
            TYPE,  //用于描述类、接口、注释、枚举的声明
            FIELD,  //用于描述成员属性
            METHOD,  //用于描述方法
            PARAMETER, //用于描述参数
            CONSTRUCTOR, //用于描述构造器
            LOCAL_VARIABLE, //用于描述局部变量
            ANNOTATION_TYPE, //用于描述注解
            PACKAGE,        //用于描述包
            TYPE_PARAMETER,
            TYPE_USE
            }
    3、Documented:出现的频率较低，被这个注解修饰的A你notation可以使用javadoc工具提取成文档
      （1）如果注解不被@Documented修饰，则不会被javadoc提取，因此，javadoc默认是不包括注解的。
      （2）定义为Documented的注解必须设置Retention值为RUNTIME。
      （3）注释中没有定义成员，为标记。
    4、Inherited：被@Inherited修饰的Annotation具备继承性。注释中没有定义成员，为标记.
       例如：父类被@Inherited修饰的Annotation修饰，那么子类也就被@Inherited修饰的Annotation修饰，并不需要在子类上显式的写明。

    5、通过反射获取注解信息
       Annotation[] getAnnotations()

    【JDK8中注解的新特性】
    1、可重复注解
       步骤一：定义新的注解，value类型为需要重复使用的注解数组：MyAnnotationDemo3[] value();
       步骤二：对需要重复使用的注解添加@Repeatable(MyRepeatDemo.class)
       步骤三：@MyAnnotationDemo3和@MyRepeatDemo上的元注解保持相同
    2、类型注解【@Target中增加了两个属性值】
    ①ElementType.TYPE_PARAMETER：表示该注解能写在类型变量的声明语句中（如：泛型声明）
    ②ElementType.TYPE_USE：表示该注解能写在使用类型的任何语句中。
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 文档注释
 * @author  liuyao,wangmeng
 * @Version 1.0
 * @see ”参考转向，也就是相关主题“
 * @since 从哪个范本开始增加的
 */

public class MyAnnotationDemo {

    public static void main(String[] args)  {

    }

    //文档注释之方法参数注释
    /**
     * @param path 文件路径 【无入参不写】
     * @return fileInputStream 文件输入流对象  【返回值是void不写】
     * @exception ”读取文件不存在时，抛出FileNotFoundException异常“
     */
    public static FileInputStream methodAnnotation(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        return fileInputStream;
    }
}
