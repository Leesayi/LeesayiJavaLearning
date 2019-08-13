/*
    +:加法

    类型转换：
        隐式类型转换：   小转大的关系
            数据类型的范围从小到大如下：
              byte->short->char->int(默认的整型)->long->float->double(默认的浮点型)
              boolean类型不参与比较，它的值只有true和false两个

        强制类型转换：   大转小的关系
           目标类型 变量名 = （目标类型）要转换的值
           注意：强制类型转换在使用的时候可能会出现丢失精度的问题。
 */
public class Conversion {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        //能输出，证明计算没有问题
        int c = a + b;
        System.out.println(c);

        System.out.println("_______________________________________");

        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        int cc = aa + bb;
        // byte cc = aa + bb (报错)
        System.out.println(cc);

        //如果需要byte类型接受 aa+bb 的值，应用强制类型转换。
        //格式为 目标类型 变量名 = （目标类型） 要转换的值 ；
        byte dd = (byte)(aa + bb);       //强制类型转换 int转byte
        System.out.println(dd);

        System.out.println("----------------------------------------");

        double e =3.14;
        int ee = (int)e;             //此转换过程中由较大类型(double)转换为较小类型(int)，精度丢失（3.14->3）
        System.out.println(ee);
    }
}
