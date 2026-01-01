public class Third {
    Third(){
        System.out.println("this is constructor");
    }
    void method(){
        System.out.println("this is method");
    }
    public static void main(String[] args){
        Third t=new Third();
        t.method();
    }
}
