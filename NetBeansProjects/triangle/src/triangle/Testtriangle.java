/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;
import java.util.Scanner;

public class Testtriangle {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("input 3 numbers for the sides of a triangle :");
        
        double x=input.nextDouble();
        double y=input.nextDouble();        
        double z=input.nextDouble();
        Triangle tri=new Triangle(x,y,z);
        
        System.out.println("please input the color :");
        tri.setColor(input.next());
        System.out.println("filled or not? please input true or false :");
        tri.setFilled(input.nextBoolean());
        
        System.out.print(tri.toString() + "\n" +
                "The area of the triangle is " + tri.getArea() +" .\n"
                +"The perimeter of the triangle is " + tri.getPerimeter() + " .\n"
                + "The color of the triangle is " + tri.getColor() + " .\n");
        if(tri.isFilled())
            System.out.println("The triangle is filled");
        else System.out.println("The triangle isn't filled");
    }
}
    class Triangle extends GeometricObject{
        private double a,b,c;
        Triangle(){
            a=b=c=1.0;
        }
        Triangle(double x,double y,double z){
            a=x;b=y;c=z;
        }
        @Override
        public double getArea(){
            double p=(a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        @Override
        public double getPerimeter(){
            return a+b+c;
        }
        @Override
        public String toString(){
            return "Triangle: side1 = " + a + "  side2 = " + b + "  side3 = " + c ;
        }
    }

