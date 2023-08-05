/*1. Write a program in Java with class Rectangle with the data fields width, length, area and color.
The length, width and area are of double type and color is of string type. The methods are set_
length (), set_width (), set_ color (), and find_ area (). Create two object of Rectangle and
compare their area and color. If area and color both are the same for the objects then display
“Matching Rectangles”, otherwise display “Non matching Rectangle”.*/

import java.util.Scanner;

class Rectangle {
    double width, length, area;
    String color;

    void set_length() {
        Scanner ob = new Scanner(System.in);
        System.out.println("\n Enter the Area of Length:");
        length = ob.nextDouble();
        ob.close();
    }

    void set_width() {
        Scanner ob = new Scanner(System.in);
        System.out.println("\n Enter the Area of Width:");
        width = ob.nextDouble();
        ob.close();
    }

    void set_color() {
        Scanner ob = new Scanner(System.in);
        System.out.println("\n Enter the Area of Color:");
        color = ob.next();
        ob.close();
    }

    double find_area() {
        area = length * width;
        return area;
    }

    void compare(Rectangle ob) {
        if (area == ob.area && color.equals(ob.color))
            System.out.println("Matching Rectangle\n");
        else
            System.out.println("Non Matching Rectangles\n");
    }
}

class rectangle_prgm {
    public static void main(String args[]) {
        double area;
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter the 1st Area dimension\n");
        r1.set_length();
        r1.set_width();
        r1.set_color();
        area = r1.find_area();
        System.out.println("\n2st Area Rectangle:" + area);

        System.out.println("Enter the 2st Area dimension\n");
        r2.set_length();
        r2.set_width();
        r2.set_color();
        area = r2.find_area();
        System.out.println("\n2st Area Rectangle:" + area);

        r1.compare(r2);
    }
}
