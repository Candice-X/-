/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Candice
 */
public class TestQuadraticEquation{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please input the values of a,b,c");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation equation1=new QuadraticEquation(a,b,c);
        System.out.println("The value of a is " + equation1.getA() + "\n" + "The value of b is " + equation1.getB() + "\n" + "The value of c is " + equation1.getC() + "\n" +
        "The value of b^2-4ac " + equation1.getDiscriminant()+"\n" + "The roots of the equation is  " + equation1.getRoot1() + " and " +equation1.getRoot2());
        
    }
}

class QuadraticEquation {
       private double a,b,c;
       QuadraticEquation(){
    }
       QuadraticEquation(double a,double b,double c){
           this.a=a;
           this.b=b;
           this.c=c;
    }
       double getA(){
       return a;
       }
       double getB(){
       return b;
       }
       double getC(){
       return c;
       }
       double getDiscriminant(){
           return b*b-4*a*c;
       }
       String getRoot1(){
           if(getDiscriminant()>=0)
               return String.valueOf((-b+Math.sqrt(getDiscriminant()))/(2*a));
           else return "Error";
       }
       String getRoot2(){
           if(getDiscriminant()>=0)
               return String.valueOf((-b-Math.sqrt(getDiscriminant()))/(2*a));
           else return "Error";
       }
}
    

