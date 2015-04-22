/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Candice
 */
public class TestLocation{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int row,col;
        row=input.nextInt();
        double[][] array=new double[row][];
        for(int i=0;i<row;i++){
            col=input.nextInt();
            array[i]=new double[col];
            for(int j=0;j<col;j++)
                array[i][j]=input.nextDouble();
        }
        
     Location loca=Location.locateLargest(array);
     System.out.println("最大值的坐标和大小是 [ " + loca.row + " , " + loca.col+ " ]  " + loca.maxValue);
     
     
        
    }
} 
class Location{
    public int row,col;
    public double maxValue;
    Location(){
    }
    Location(int row,int col,double maxValue){
        this.row=row;
        this.col=col;
        this.maxValue=maxValue;
    }
 
    
    public static Location locateLargest(double[][] a){
        int i=0,j=0,row=0,col=0;
        double max=a[0][0];
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
                if(max<a[i][j])
                {
                    max=a[i][j];
                    row=i;
                    col=j;
                }
        
        Location loc=new Location(row,col,max);
        return loc;
                    
    }
}