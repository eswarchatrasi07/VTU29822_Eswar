import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int found=0;
        System.out.println("enter arr size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter element to sarch");
        int ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
              found=found+1;  
            }
            
        }
        if(found==0)
            System.out.println("element not is found");
        else 
            System.out.println("element is found");

        sc.close();
    }
    
}
