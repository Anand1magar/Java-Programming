public class First extends Thread{
    public void run(){
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args)
        {
         System.out.println(Thread.currentThread().getPriority());
         Thread.currentThread().setPriority(10);
         

         First f = new First();
         f.start();
        }
    }

