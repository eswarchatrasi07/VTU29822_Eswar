import java.util.Scanner;
public class Factorial {
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    if (num==0){
        System.out.println("factorial of 0 is 1");
    }
    int fac=1;
    for(int i=num;i<=num;i++){
        fac*=num;
    }
    System.out.println("factorial of "+num+" is "+fac);
    sc.close();
}    
}
