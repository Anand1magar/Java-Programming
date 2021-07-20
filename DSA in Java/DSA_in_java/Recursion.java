public class Recursion {

     void fun1(int n){

        if(n == 0)
          return;
        System.out.println("Anand");
        fun1(n -1);
          
    }   

    public static void main(String[] args) {
        Recursion obj = new Recursion();
        obj.fun1(2);
    }
}
