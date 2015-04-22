/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLinearEquation;
import java.util.Scanner;
/**
 *
 * @author Candice
 */
public class TestLinearEquation1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please input the values of a,b,c,d,e,f");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();
        LinearEquation equation1=new LinearEquation(a,b,c,d,e,f);
        System.out.println("The value of a,b,c,d,e,f " + equation1.getA()+" "+equation1.getB()+" "+equation1.getC()+" "+equation1.getD()+" "+equation1.getE()+" "+equation1.getF());
        if(equation1.isSolvable())
            System.out.println("The solution x and y are "+equation1.getX() + " "+equation1.getY());
        else System.out.println("The equations don't have solutions"); 
    }
}

class LinearEquation{
    private double a,b,c,d,e,f;
    LinearEquation(){    
    }
    LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
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
    double getD(){
        return d;
    }
    double getE(){
        return e;
    }
    double getF(){
        return f;
    }
    boolean isSolvable(){
        if((a*d-b*c)==0)
            if((e*d-b*f)==0)
                return true;
            else return false;
        else return true;
    }
    double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}