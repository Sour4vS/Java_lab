//program to check whther the giver string is palindrom or not

import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        int flag=0;
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String str= sc.nextLine();
       int len = str.length();
       for(int i=0;i<len/2;i++){
           if(str.charAt(i)!=str.charAt(len-i-1)){
               flag = 1;
               break;
           }
       }
      if(flag==1){
          System.out.println("The given string is not a palindrome");
      }
              else{
                  System.out.println("The given string is a palindrome");
              }
          }
      }
    
