import java.util.*;
public class Area {

    String area;

    Area(double length,double breadth){
        area=String.format("%.3f", (length*breadth));
    }
    String returnArea() {
        return this.area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  length and breadth of rectangle :");
        double length = sc.nextDouble();
        double breadth=sc.nextDouble();
        Area obj = new Area(length,breadth);
        String area;
        area=obj.returnArea();

        System.out.println("Area of rectangle = "+area);

    }


}