import com.itheima_03.MyService;

module myTwo {
    requires myOne;//声明自己依赖的模块，可以操作所依赖包exports出的包下的类

    uses MyService;
}