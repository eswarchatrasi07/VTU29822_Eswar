public class First {
    static void method1(){
     System.out.println("this is static method");

    }
    void method(){
        System.out.println("this is the method in First class  ");
    }
    public static void main(String []args){
First f=new First();
System.out.println("this is main method");
f.method();
method1();


    }
    
}
