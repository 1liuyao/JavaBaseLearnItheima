import com.itheima_03.MyService;
import com.itheima_03.impl.Czxy;
import com.itheima_03.impl.Itheima;

module myOne {
    exports com.itheima_01;//���߱��ģ����Է����Լ��ĸ���
    exports com.itheima_03;

//    provides MyService with Itheima;
    provides MyService with Czxy;
}