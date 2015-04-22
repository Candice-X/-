/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawl;
import java.util.*;
import java.net.URL;

public class Crawl {

    public static void main(String[] args) {
       String url="http://www.xmu.edu.cn";
       ArrayList<String> details = new ArrayList<>();
       details=getSubURLs(url);
       for(int i=0;i<details.size();i++)
           System.out.println("["+ (i+1) +"]" + details.get(i));
    }

 public static ArrayList<String> getSubURLs(String urlString) {
         ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current =-1,mark=-1;
            int title1=-1,title2=-1;
            while (input.hasNext()&&current==-1) {
                String line = input.nextLine();
                current = line.indexOf("快速链接");
            }
            
             while (input.hasNext()&&mark==-1) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                
                while (current > 0) {
                     
                int endIndex = line.indexOf("\"", current);
                if (endIndex > 0) {
                    // Ensure that a correct URL is found
                    String a=line.substring(current, endIndex);
                    title1=line.indexOf("</i>", endIndex)+4;
                    title2=line.indexOf("</a>",title1);
                    String b=line.substring(title1, title2);
                    
                    list.add(b+a);
                   
                    current = line.indexOf("http:", title2);
                }
                else
                    current = -1;
                }
                mark=line.indexOf("End");
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
 }
            
        
       
    

