/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzhuoyichang;
import java.util.*;

public class Buzhuoyichang {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double[] m1=new double[100];
        boolean continueInput = true;
        
        for(int i=0;i<100;i++)
            m1[i]=Math.random()*100;
        System.out.println("请输入一个下标，为整数0—99");
        do{
            try{
                int index=input.nextInt();
                System.out.println(m1[index]);
                continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Input Mismatch.Please try again:");
                input.nextLine();//discard input
            }
            catch(IndexOutOfBoundsException ex){
                System.out.println("Out of Bounds. Please try again:");
                input.nextLine();
            }
        }while(continueInput);
    }
    
}
