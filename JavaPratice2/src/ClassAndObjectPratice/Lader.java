package ClassAndObjectPratice;

class Lader
{
    double above,bottom,height,area;
    Lader(double a,double b,double h)
    {
        //方法体。
        above = a;
        bottom = b;
        height = h;
    }
    double getArea()
    {
        //方法体，,要求计算出area返回。
        area = (above + bottom)*height/2;
        return area;
    }
}

