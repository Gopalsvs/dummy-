package SciCal;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class My_Main 
{
 private static final Logger logger = LogManager.getLogger(My_Main.class);
 public My_Main() {}
 public static void main(String[] args) 
 {
   try
   {
   My_Main calculator=new My_Main();
   Scanner scanner=new Scanner(System.in);
   System.out.println("----CALCULATOR----");
   System.out.println("SELECT one of the 4 options:");
   System.out.println("Press 1 to get square root \nPress 2 to get factorial\nPress 3 to get natural logarithm\nPress 4 to get power function");
   int input=scanner.nextInt();;
   if(input==4)
   {
   System.out.println("Enter the base");
   double n1=scanner.nextDouble();
   System.out.println("Enter the power of base");
   double n2=scanner.nextDouble();
   logger.info("[POWER] - " + n1 + ", " + n2);     
   double val = Math.pow(n1 , n2);
   logger.info("[RESULT - POWER] - " + val); 
   System.out.println("BASE TO THE POWER OF GIVEN NUMBERS IS : " +   val);
   }
   else if(input==3)
   {
   System.out.println("Enter the number");
   double n1=scanner.nextDouble();
   logger.info("[LOG] - " + n1);    
   double val = Math.log(n1);
   logger.info("[RESULT - LOG] - " + val);
   System.out.println("NATURAL ALG OF GIVEN NUMBER IS : " + val);
   }
   else if(input==2)
   {
   System.out.println("Enter the number");
   double n1=scanner.nextInt();
   logger.info("[FACTORIAL] - " + n1);  
   double fact=1;
   if(n1<0)
    fact= Double.NaN;
    
   else
   {  
   for(int i=1;i<=n1;i++)    
    fact=fact*i;   
   }
   logger.info("[RESULT - FACTORIAL] - " + fact);
   System.out.println("FACTORIAL OF THE GIVEN NUMBER IS : " + fact);
   }
   else if(input==1)
   {
   System.out.println("Enter the number");
   double n1=scanner.nextDouble();
   logger.info("[ROOT] - " + n1); 
   double val = Math.sqrt(n1);
   logger.info("[RESULT - ROOT] - " + val);
   System.out.println("SQUARE ROOT OF THE GIVEN NUMBER IS : " + val);
   }
   else
   System.out.println("INPUT IS INVALID, GIVE CORRECT INPUT");
   System.out.println("TASK DONE");
   }
   catch(InputMismatchException error)
   {
   System.out.println("Invalid input, Entered input is not of the expected type");
   logger.error("Invalid input, Entered input is not of the expected type");
   return;
   }           
 }

//FOR TESTING PURPOSE
public double power(double n1, double n2) 
 {
  logger.info("[POWER] - " + n1 + ", " + n2);     
  double val = Math.pow(n1 , n2);
  logger.info("[RESULT - POWER] - " + val);  
  return val;
 }
 public double log(double n1) 
 {
  logger.info("[LOG] - " + n1);    
  double val = Math.log(n1);
  logger.info("[RESULT - LOG] - " + val); 
  return val;
 }
 public double root(double n1) 
 {
  logger.info("[ROOT] - " + n1); 
  double val = Math.sqrt(n1);
  logger.info("[RESULT - ROOT] - " + val);
  return val;
 }
 public double factorial(int n1) 
 {
  logger.info("[FACTORIAL] - " + n1);  
  if(n1<0)
   return Double.NaN;
  double fact=1;  
  for(int i=1;i<=n1;i++)    
   fact=fact*i;   
  logger.info("[RESULT - FACTORIAL] - " + fact);  
  return fact;
 }
 
 
}
