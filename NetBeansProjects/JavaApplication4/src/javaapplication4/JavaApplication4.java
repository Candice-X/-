/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author Candice*/
public class JavaApplication4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please input the dimension of the matrix:");
        int n=input.nextInt();  
        int[][] matrix=new int[n][n];
        System.out.println("please input the number by rows");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j]=input.nextInt();
        int[] answer=findLargestBlock(matrix);
        System.out.println("[ " + answer[0] + " , " + answer[1] + " ]   阶数为 " + answer[2]);
        
    }

public static int[] findLargestBlock(int[][] m){
    int[] a={0,0,0};
    for(int i=1;i<m.length;i++)
        for(int j=1;j<m.length;j++){
            if(m[i][j]==1){
                m[i][j] += min(m[i-1][j],m[i-1][j-1],m[i][j-1]);
                if(a[2]<m[i][j]){
                    a[2]=m[i][j];
                    a[0]=i+1-a[2];
                    a[1]=j+1-a[2];
                }
            }
            }
      return a;
}
static int min(int a,int b,int c){
    return ((a>b?b:a)>c)?c:(a<b?a:b);
}
}