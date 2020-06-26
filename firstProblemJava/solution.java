import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    String evenChar="";
    String oddChar="";
    
    //creating a constructor to use the obejectes independently
    public Solution(String stringPass){
        String stringCheck=stringPass;
        for(int i=0;i< stringCheck.length();i++){
            if (i%2==0){
                evenChar+=stringCheck.charAt(i);
            }
            else {
                this.oddChar+=stringCheck.charAt(i);
            }
        }

    }
    //the funtion to print as per the problem statement
    public void stringPrinter(){
        System.out.println(evenChar +" "+oddChar);
        //evenChar="";
        //oddChar="";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int StringNumber=sc.nextInt();
        
        for (int i=0;i<StringNumber;i++){
            String newString = sc.next();//taking string input one after another
            Solution x = new Solution(newString);
            x.stringPrinter();
            //System.out.println(newString);
        }
        

    }
}