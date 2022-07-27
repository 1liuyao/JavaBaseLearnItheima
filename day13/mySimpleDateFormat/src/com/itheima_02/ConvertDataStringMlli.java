package com.itheima_02;

public class ConvertDataStringMlli {
    /*
        Data String 毫秒值之间的转化

        1、Data转成毫秒值：new Data().getTime();

        2、毫秒值转成Data：
        （1）方式一使用set方法：new Data().setTime();
        （2）方式二使用带参构造函数：new Data(Long time)

        3、Data转换成String：通过SimpleDataFormat这个格式化工具
        （1）使用默认格式显示Data：
            String s=new SimpleDataFormat.format(date)
        （2）使用自定义的格式显示Data：
            String s=new SimpleDataFormat("yyyy年MM月dd日 HH:mm:ss").format(date)

        4、String类型转成Data：通过SimpleDataFormat这个格式化工具
           Data data=new SimpleDataFormat(pattern).parse(String pattern)
           注：SimpleDataFormat初始化的pattern要和String保持一致，否则报ParseException



     */
}
