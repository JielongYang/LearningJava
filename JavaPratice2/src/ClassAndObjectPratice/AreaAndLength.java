package ClassAndObjectPratice;

public class AreaAndLength {
    public static void main(String args[])
    {
        double length,area;
        Trangle trangle = null;
        Lader lader;
        //创建对象trangle。
//        trangle = new Trangle(2,3,4);
        //创建对象lader。
        lader = new Lader(2,3,4);
        // trangle调用方法返回周长并赋值给length。
        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);
        // trangle调用方法返回面积并赋值给area。
        area = trangle.getArea();
        System.out.println("三角形的面积:"+area);
        // lader调用方法返回面积并赋值给area。
        area = lader.getArea();
        System.out.println("梯形的面积:"+area);
        // trangle调用方法返修改三个边的代码，要求将三个边修改为12,34,1。
        trangle.setABC(12,34,1);
        // trangle调用方法返回面积并赋值给area。
        area = trangle.getArea();
        System.out.println("三角形的面积:"+area);
        // trangle调用方法返回周长并赋值给length。
        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);
    }

}
