package com.itheima_06;

/*
    ��ͨ������������͡�
    ����javaֻ���ڱ���׶ν����˷��ͼ�飬��ʵ�ʵ�class�ļ�����Ȼʹ��Object��������������
    ����ǿת����ô���ͨ�������ȡ���������أ�

    Ϊ��ͨ����������������ͣ�java�������������ͱ�ʾ���ܱ���һ��Class���е����͡�
    ��1��ParameterizedType����ʾһ�ֲ��������ͣ�����Collection<String>
    ��2��GenericArrayType����ʾһ��Ԫ�������ǲ��������ͻ������ͱ�������������
    ��3��TypeVariable���Ǹ������ͱ����Ĺ������ӿ�
    ��4��WildcardType������һ��ͨ������ͱ��ʽ
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
