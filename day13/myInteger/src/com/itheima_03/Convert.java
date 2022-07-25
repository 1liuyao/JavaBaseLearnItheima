package com.itheima_03;

public class Convert {
    /*
        �ܽ�����������Ͱ�װ�ࡢ�����������͡��ַ���֮���ת��

        1����װ��ת���ɻ�����������
       ��1����װ��Byte Short Integer Long Float Double�̳и��ࡾ������Number��
           �����˽����������װ��ת���ɻ����������͵ķ������������и����˾���ʵ�֡�
           �����������£�������������Value()�����磺int intValue()
       ��2����װ��Characterֱ�Ӽ̳�Object���߱�������char charValue()
       ��3����װ��Booleanֱ�Ӽ̳�Object���߱�������boolean booleanValue()
       ��ˣ�����װ��ת���ɻ����������Ͳ��ã���װ�����.��������������Value()��

       2.������������ת���ɰ�װ��
       ��1����װ��Byte Short Integer Long Float Double���ã�
            static Integer valueOf(int i)��������������ת���ɰ�װ��
           ���磺Integer.valueOf(int i)��������װ������.valueOf(������������)��
       ��2����װ��Characterʹ�ã�static Character valueOf(char c)��charתCharacter
       ��3����װ��Booleanʹ�ã�static Boolean valueOf(boolean b)��booleanװBoolean
       ��ˣ���������������ת���ɰ�װ����ã���װ����.valueOf(������������)

       3��������������ת��String
       ��1����ʽһ��String.valueOf(������������)
       ��2����ʽ������װ��.toString()��ʵ���Ϸ�ʽһֻ�Ƿ�װ�˷�ʽ����

       4��Stringת�ɻ�����������
       ��1��byte short int long float double���ã���װ��.parse��װ�������ַ�����
        ���磺Short.parseShort(String)���ַ���ת����short����
       ��2��char��new String().charAt(int index) ����ָ��λ���ַ�
       ��3������һ�ַ�ʽ��������������+�մ�������:s=10+"";
       ��4��char[]ת��String��ֱ��ʹ��String���췽��String(char[] value)
       ��5��Stringת��char[]��new String().toCharArray()
                            String.valueOf()
       ��6��byte[]ת��String��ֱ��ʹ��String���췽��String(byte[] bytes)
       ��7��Stringת��byte[]��new String().getBytes();

       5����װ��ת��String����װ�����.toString()
       6��Stringת�ɰ�װ��
       ��1����ʽһ����ת�ɻ�������������ת�ɰ�װ�ࡾCharacterֻ�ܲ��ô˷�ʽ��
       ��2������Character��װ���⣬�ɲ�������һ�ַ�ʽ����װ������.valueOf(String)
           ���磺Integer.valueOf(String s)

        ע��char Character String֮���ת����Ҫ�ر�ע��
           ����String�����Ƕ���ַ��������������Stringת��Character����charʱ��
           ����Ҫ�����ķ�����������char��Characterת��String����С����Ϳ�����ѭһ�㷽��


     */
    public static void main(String[] args) {
        char a='a';
        byte b=1;
        String s="100";
        Double d=1.0;
        Boolean ff=true;
        Character uu='b';
        System.out.println(Byte.toString(b));
        System.out.println(Character.toString(a));
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(Integer.parseInt(s));
        System.out.println(d.toString());
        System.out.println(ff.toString());
        System.out.println(uu.toString());

    }
}
