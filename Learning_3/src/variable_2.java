/*
   变量的定义格式：
       数据类型 变量名 = 初始化值；

   数据类型：
   byte,short,int,long,float,double,char,boolean

   定义变量的注意事项：
       1.整型默认是int类型，定义long类型变量的时候，后面要加字母L（大小写不敏感）。
       2.浮点型默认是double类型，定义float类型变量的时候，后面要加字母f（大小写不敏感）。

   使用变量的注意事项：
       1.变量未赋值，不能使用。
       2.变量只在它所属的范围内有效（即变量的作用域）。
       3.一行上可以定义多个变量，但不建议这样写。
 */
public class variable_2 {
    public static void main(String[] args) {
        //byte类型
        byte a = 10;
        System.out.println(a);

        //short类型
        short b = 20;
        System.out.println(b);

        //int类型
        int c = 30;
        System.out.println(c);

        //long类型
        long d = 10000000000L;
        System.out.println(d);

        //float类型
        float e =10.3f;
        System.out.println(e);

        //doubl类型
        double f =10.2;
        System.out.println(f);

        //char类型
        char g = 'a';
        System.out.println(g);

        //boolean类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("-----------------------------------------------");

        //代码块：用大括号括起来的内容就是代码块
        {
            int aa =100;
            System.out.println(aa);
        }
        /*
           System.out.println(aa);
           错误的写法，aa和sout语句在不同的代码块内；
         */
    }
}
