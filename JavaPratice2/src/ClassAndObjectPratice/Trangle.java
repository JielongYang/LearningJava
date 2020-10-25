package ClassAndObjectPratice;

class Trangle
{
    double sideA,sideB,sideC,area,length;
    boolean boo;

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public  Trangle(double a, double b, double c)
    {
        //参数a,b,c分别赋值给sideA,sideB,sideC。
        sideA = a;
        sideB = b;
        sideC = c;
        if(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) //a,b,c构成三角形的条件表达式。
        {
            //给boo赋值。
            boo = true;
        }
    else
        {
            //给boo赋值。
            boo = false;
        }
    }
    double getLength()
    {
        //方法体，要求计算出length的值并返回。
        if(boo) {
            length = sideA + sideB + sideC;
            return  length;
        }else {
            System.out.println("不是一个三角形,不能计算周长");
            return 0;
        }
    }
    public double  getArea()
    {
        if(boo)
        {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
        }
        else
        {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }
    public void setABC(double a,double b,double c)
    {
        //参数a,b,c分别赋值给sideA,sideB,sideC。
        sideA = a;
        sideB = b;
        sideC = c;
        if(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) //a,b,c构成三角形的条件表达式。
        {
            //给boo赋值。
            boo = true;
        }
        else
        {
            //给boo赋值。
            boo = false;
        }
    }
}

