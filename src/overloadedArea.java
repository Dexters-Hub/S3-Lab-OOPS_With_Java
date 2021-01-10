class overloadedArea {

    double calculateArea (int length, int breadth)
    {
        System.out.println("Area of Rectangle:");
        return length * breadth;
    }

    double calculateArea(int radius)
    {
        System.out.println("Area of Circle:");
        return 3.14 * radius *radius;
    }

    public static void main(String[] args) {
        overloadedArea ola = new overloadedArea();
        System.out.println(ola.calculateArea(2));
        System.out.println(ola.calculateArea(5,4));
    }
}
