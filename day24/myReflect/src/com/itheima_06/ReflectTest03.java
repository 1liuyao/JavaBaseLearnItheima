package com.itheima_06;

/*
    【通过反射操作泛型】
    由于java只是在编译阶段进行了泛型检查，在实际的class文件中仍然使用Object接收任意对象，完成
    类型强转，那么如何通过反射获取泛型类型呢？

    为了通过反射操作操作泛型，java新增了四种类型表示不能被归一到Class类中的类型。
    （1）ParameterizedType：表示一种参数化类型，比如Collection<String>
    （2）GenericArrayType：表示一种元素类型是参数化类型或者类型变量的数组类型
    （3）TypeVariable：是各种类型变量的公共父接口
    （4）WildcardType：代表一种通配符类型表达式
 */

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class ReflectTest03 {
    public void test01(Map<String, String> map, List<Integer> list) {
        System.out.println("test01");
    }

    public Map<String, String> test02() {
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<ReflectTest03> reflectTest03Class = ReflectTest03.class;
        Method test01 = reflectTest03Class.getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = test01.getGenericParameterTypes();

        for (Type genericParameterType : genericParameterTypes) {
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                System.out.println(actualTypeArguments);
            }
        }


        Method test02 = reflectTest03Class.getMethod("test02");
        Type genericReturnType = test02.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            System.out.println(actualTypeArguments);
        }
    }

}
