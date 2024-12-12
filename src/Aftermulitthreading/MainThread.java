package Aftermulitthreading;

public class MainThread {
    public static void main(String[] args){
        SampleThread sampleThread=new SampleThread();
   try {
       System.out.println("part1");
       for (int i = 1; i <= 10; i++) {
           System.out.println("i value is:" + i);
          Thread.sleep(1000);
       }

   }catch(Exception e){
       System.out.println("exception occured :" +e.getMessage());
   }

    }
}
