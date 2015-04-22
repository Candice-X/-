/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletecf;
import java.util.*;

/**
 *
 * @author Candice
 */
public class Deletecf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一串数字：");
        ArrayList<Integer> list=new ArrayList<>();
        
        do{
            list.add(input.nextInt());
        }while(input.hasNextInt());
        

       removeDuplicate(list);
       for (int i = 0;i<list.size();i++)
       {
           System.out.print(list.get(i) + " ");
       }
       

    }
    
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> mark= new ArrayList<>();
         for(int i=0;i<list.size();i++)
         { 
                if(mark.contains(list.get(i)))
                    continue;
                for(int j=i+1;j<list.size();j++)
                    if(list.get(i)==list.get(j))
                    list.remove(j);  
                     
                mark.add(list.get(i));
            }
    }
}
