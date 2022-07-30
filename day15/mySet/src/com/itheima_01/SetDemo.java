package com.itheima_01;

import java.util.HashSet;
import java.util.Set;

/*
    public interface Set<E>extends Collection<E>
    Set集合特点
        （1）不包含重复元素的集合
        （2）没有带索引的方法，所以不能使用普通for循环遍历
        （3）对集合的迭代顺序不作任何保证，即元素的存入顺序和取出顺序是不一致的
            例如：下面的代码虽然添加顺序是[hello,world,java],但是遍历集合时输出结果为[world,java,hello]

         注意：Set集合的方法和Collection一样，无特别的增删改查方法，但是没有索引。

         问题：怎么实现在add元素时去重呢？
         回答：add方法中根据对象的hash值和对象的equals方法共同判断。
              如果两个对象A,B的hash值相同，并且A.equals(B)为true则认为两个对象相同，不会存入Set集合。

         注意：删除某一个元素的前提是先判断集合中是否存在该元素。
              例如：要在集合B中删除元素A，那么需要先判断B.contains(A)，那么根据什么判断集合中是否有元素与A相同呢？
              （1）针对List集合，根据重写的equals方法判断
              （2）针对Set结合，根据重写的hashCode()和equals()方法共同判断
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");

        //遍历
        for(String s : set) {
            System.out.println(s);
        }

    }
}
