package com.myannotation;
/*
    ��ע�������
    1��ע����ʵ���Ǵ����е������ǣ���Щ��ǿ����ڱ��롢����ء�����ʱ����ȡ����ִ����Ӧ�Ĵ���
    ͨ��ʹ��ע�⣬����Ա�����ڲ��ı�ԭ���߼�������£���Դ�ļ���Ƕ��һЩ������Ϣ������������ߡ�
    �������ߺͲ��𹤾߿���ͨ����Щ������Ϣ������֤�Ͳ���
    2��ע����������η�һ����ʹ�ã����������ΰ����࣬����������������Ա�������������ֲ�������������
    ��Щ��Ϣ��������Annotation��"name=value"���С�
    3��δ���Ŀ���ģʽ���ǻ���ע��ģ�һ���̶��Ͽ���˵�����=ע��+����+���ģʽ
    4��ʹ��AnnotationʱҪ��ǰ������@���ţ����Ѹ�Annotation����һ�����η�ʹ�á�����������֧�ֵĳ���Ԫ�ء�

    ��������Annotationʾ����
    1���ĵ�ע��
    2���ڱ���ʱ���и�ʽ��飨JDK���õ���������ע�⣩
        ��Override���޶���д���෽������ע��ֻ�����ڷ���
        ��Deprecated����ʾ�����ε���򷽷��Ѿ���ʱ���и��õ�ѡ��
        ��SuppressWarnings�����Ʊ���������
    3�����ٴ��������ԣ�ʵ����������ļ����ܣ�������и�����ע�͡�

    ���Զ���Annotation��������@SuppressWarningsע�ⶨ��
    1��ע������Ϊ@interface
    2���Զ���ע���Զ��̳���java.lang.annotation.Annotation�ӿ�
    3������ʹ��default�ؼ��ֶ����Ա������ʼֵ
    4����������ע�⺬�����ò�������ôʹ��ʱ����ָ������ֵ����������Ĭ��ֵ����ʽ�ǡ�������=����ֵ��
       ���ֻ��һ��������Ա��������Ϊvalue�������ʡ�ԡ�value=��
    5�����ֻ��һ��������Ա������ʹ�ò�����Ϊvalue
    6��û�г�Ա�����Annotation��Ϊ��ǣ�������Ա������Annotation��ΪԪ����Annotation��
    7���Զ���ע���������ע�����Ϣ�������̣�ʹ�÷��䣩�������壬��Ҫ��Ԫע�����Ρ�

    ��JDK�е�Ԫע�⡿:������������Annotation��ע��
    1��Retention������ע�͵��������ڣ��ڲ�����һ��RetentionPolicy���͵ĳ�Ա������
        public enum RetentionPolicy {
                SOURCE,//��Դ�ļ�����Ч��������ֱ�Ӷ������ֲ��Ե�ע��
                CLASS,//��class�ļ�����Ч����java��������ʱ��JVM���ᱣ��ע�ͣ�����Ĭ��ֵ,����ʹ��ע�ͱ��������ڵ�ע�⣬����class�׶ε�ע�⡣
                RUNTIME//������ʱ��Ч����java��������ʱ��JVM�ᱣ��ע�͡��������ͨ�������ȡ��ע��
        }
    2��Target������ָ�������ε�Annotation������������Щ����Ԫ�ء�@TargetҲ����һ����Ϊvalue�ĳ�Ա����
        public enum ElementType {
            TYPE,  //���������ࡢ�ӿڡ�ע�͡�ö�ٵ�����
            FIELD,  //����������Ա����
            METHOD,  //������������
            PARAMETER, //������������
            CONSTRUCTOR, //��������������
            LOCAL_VARIABLE, //���������ֲ�����
            ANNOTATION_TYPE, //��������ע��
            PACKAGE,        //����������
            TYPE_PARAMETER,
            TYPE_USE
            }
    3��Documented:���ֵ�Ƶ�ʽϵͣ������ע�����ε�A��notation����ʹ��javadoc������ȡ���ĵ�
      ��1�����ע�ⲻ��@Documented���Σ��򲻻ᱻjavadoc��ȡ����ˣ�javadocĬ���ǲ�����ע��ġ�
      ��2������ΪDocumented��ע���������RetentionֵΪRUNTIME��
      ��3��ע����û�ж����Ա��Ϊ��ǡ�
    4��Inherited����@Inherited���ε�Annotation�߱��̳��ԡ�ע����û�ж����Ա��Ϊ���.
       ���磺���౻@Inherited���ε�Annotation���Σ���ô����Ҳ�ͱ�@Inherited���ε�Annotation���Σ�������Ҫ����������ʽ��д����

    5��ͨ�������ȡע����Ϣ
       Annotation[] getAnnotations()

    ��JDK8��ע��������ԡ�
    1�����ظ�ע��
       ����һ�������µ�ע�⣬value����Ϊ��Ҫ�ظ�ʹ�õ�ע�����飺MyAnnotationDemo3[] value();
       �����������Ҫ�ظ�ʹ�õ�ע�����@Repeatable(MyRepeatDemo.class)
       ��������@MyAnnotationDemo3��@MyRepeatDemo�ϵ�Ԫע�Ᵽ����ͬ
    2������ע�⡾@Target����������������ֵ��
    ��ElementType.TYPE_PARAMETER����ʾ��ע����д�����ͱ�������������У��磺����������
    ��ElementType.TYPE_USE����ʾ��ע����д��ʹ�����͵��κ�����С�
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �ĵ�ע��
 * @author  liuyao,wangmeng
 * @Version 1.0
 * @see ���ο�ת��Ҳ����������⡰
 * @since ���ĸ�������ʼ���ӵ�
 */

public class MyAnnotationDemo {

    public static void main(String[] args)  {

    }

    //�ĵ�ע��֮��������ע��
    /**
     * @param path �ļ�·�� ������β�д��
     * @return fileInputStream �ļ�����������  ������ֵ��void��д��
     * @exception ����ȡ�ļ�������ʱ���׳�FileNotFoundException�쳣��
     */
    public static FileInputStream methodAnnotation(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        return fileInputStream;
    }
}
