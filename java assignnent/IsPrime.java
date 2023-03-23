package prime;

import java.util.Scanner;
public class IsPrime {


    public static void main(String[] args) {
System.out.println("Enter a number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 isPrime(n);
    }
  static void isPrime(int num)  
  {
     int count=0; 
     for(int i=1;i<=num;i++)
     {
         if(num%1==0)
         {
             count++;
         }
     }
      if(count==2)
      System.out.println("True");
            else
           System.out.println("False");
      for (int i = 1; i <= 500; i++) {
                  System.out.print(i + " ");
           }
      }
  }
 
     
          
      
  
  


    
    

