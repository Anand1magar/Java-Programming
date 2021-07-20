public class ThreadSleep extends Thread{


    public void run(){ 
     try {
         for(int i = 0; i < 5; i++){
             System.out.println(Thread.currentThread().getName());
             System.out.println(i);
             Thread.sleep(1000);   //Thread whill goes to dead state
         }
     } catch (Exception e) {
        System.out.println(e);
     }
    
    }

    public static void main(String[] args) {
    
      ThreadSleep t = new ThreadSleep();      
      t.run();
      
      ThreadSleep t2 = new ThreadSleep();
      t2.run();
           
    }
}
