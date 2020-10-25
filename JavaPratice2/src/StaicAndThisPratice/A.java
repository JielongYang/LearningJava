package StaicAndThisPratice;

class A
{
    //声明一个float型实例变量：a。
    float a;
    //声明一个float型类变量：b。
    static float b;
    void setA(float a)
    {
        //将参数a的值赋值给成员变量a。
        this.a = a;
    }
    void setB(float b)
    {
        //将参数b的值赋值给成员变量b。
        this.b = b;
    }
    float getA()
    {
        return a;
    }
    float getB()
    {
        return b;
    }
    void inputA()
    {
        System.out.println(a);
    }
    static void inputB()
    {
        System.out.println(b);
    }
}

