/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static  void Binary(int x){
        String newBinary = Integer.toBinaryString(x);
        int count =0;
        int temp =0;
        boolean flag=true;
        
        for(int i=0;i<newBinary.length();i++){
            if(newBinary.charAt(i)=='1' ){
               flag=true;
                if(flag=true){
                count++;
                }
            }
            else if(newBinary.charAt(i)=='0'){
                flag=false;
                if(count>temp){
                    temp=count;
                    count=0;
                }
                else{
                    count=0;
                }
            }
            if(i==newBinary.length()-1 ){
               
                if(temp==0 || temp<count){
                     System.out.println(count);
                }
                else if(temp!=0){
                    System.out.println(temp);
                }
                else if(temp>count){
                    System.out.println(temp);
                }
   
            }         
        }
    }


    public static void main(String[] args) {
        System.out.println("please give input");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Binary(n);
        scanner.close();
    }
}
