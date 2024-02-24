import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static double result;
    static List<Double> all=new ArrayList<Double>();
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       // int add , sub , multi,mod,min,max;
        System.out.println("please enter first number : ");
        int num1=s.nextInt();
        System.out.println("please enter second number : ");
        int num2=s.nextInt();
      loop:  while(true) {
            System.out.println();
            System.out.println("Enter 1 to addition the numbers .");
            System.out.println("Enter 2 to substraction the numbers .");
            System.out.println("Enter 3 to multiplication the numbers .");
            System.out.println("Enter 4 to division the numbers .");
            System.out.println("Enter 5 to modulus the numbers .");
            System.out.println("Enter 6 to find minimum the numbers .");
            System.out.println("Enter 7 to maximum the numbers .");
            System.out.println("Enter 8 to average of the numbers .");
            System.out.println("Enter 9 to print the last result in calculater .");
            System.out.println("Enter 10 to print the list of all results in calculater .");
            System.out.println("Enter 11 to exit .");

            System.out.println("Enter a number : ");
            int choice = s.nextInt();
            switch (choice) {
                case 1 :
               // System.out.println("Addition of number is  " + addNum(num1, num2));
                 result=addNum(num1, num2);
                 System.out.println(result);
                 all.add(result);
                break;
                case 2 :
              //  System.out.println("Subtraction of number is " + subNum(num1, num2));
                    result= subNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                break;
                case 3 :
             //   System.out.println("Multiplication of number is " + multiNum(num1, num2));
                    result=multiNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                break;
                case 4 :
              //  System.out.println("Divition of number is " + divNum(num1, num2));
                    result=divNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                break;
                case 5 :
               // System.out.println("module of number is " + modNum(num1, num2));
                    result=modNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                break;
                case 6 :
                    // System.out.println("Minimum number is " + minNum(num1, num2));
                    result=minNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                    break;
                case 7 :
                //System.out.println("Maximum number is " + maxNum(num1, num2));
                    result=maxNum(num1, num2);
                    System.out.println(result);
                    all.add(result);
                break;
                case 8 :
                // System.out.println("The average of numbers is "+avg(num1,num2));
                    result=avg(num1, num2);
                    System.out.println(result);
                    all.add(result);
                    break;
                case 9 :
                    System.out.println(result);
                    all.add(result);
                    break;
                case 10 :
                    for (int i = 0; i < all.size(); i++) {
                        System.out.print(String.valueOf(all.get(i))+",");
                    }
                    break;
                case 11:
                    System.out.println("program terminated");
                 break loop;
            }
        }
    }
    public static int addNum (int num1,int num2){
        int add = num1+num2;
        return add;
    }
    public static int subNum (int num1,int num2){
        int sub = num1-num2;
        return sub;
    }
    public static int multiNum (int num1,int num2){
        int multi = num1*num2;
        return multi;
    }
    public static int divNum (int num1,int num2){
        int div = num1/num2;
        return div;
    }
    public static int modNum (int num1,int num2){
        int mod = num1%num2;
        return mod;
    }
    public static int minNum (int num1,int num2){
        int min=0;
        if(num1>num2)
        min= num2;
        else
            min=num1;
        return min;
    }
    public static int maxNum (int num1,int num2){
        int max=0;
        if(num1>num2)
            max= num1;
        else
            max=num2;
        return max;
    }
    public static double avg (int num1,int num2){
        double average=(num1+num2)/2;
        return average;
    }
}