package StaicAndThisPratice;

public class Example {
    public static void main(String args[])
    {
        //通过类名操作类变量b,并赋值100。
        A.b = 100;
        //通过类名调用方法inputB()。
        A.inputB();
        A cat=new A();
        A dog=new A();
        //cat象调用方法setA(int a)将cat的成员a的值设置为200。
        cat.setA(200);
        //cat调用方法setB(int b)将cat的成员b的值设置为400。
        cat.setB(400);
        //dog象调用方法setA(int a)将dog的成员a的值设置为200。
        dog.setA(200);
        //dog调用方法setB(int b)将dog的成员b的值设置为400。
        dog.setB(400);
        //cat调用inputA()。
        cat.inputA();
        //cat调用inputB()。
        cat.inputB();
        //dog调用inputA()。
        dog.inputA();
        //dog调用inputB()。
        dog.inputB();
    }

}
