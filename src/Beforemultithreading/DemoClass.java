package Beforemultithreading;

public class DemoClass {
    public static void main(String[] args){
        System.out.println("part1");
        for(int i=1;i<=10;i++){
            System.out.println("i value is:" +i);
        }
        System.out.println("part2");
        for(int i=10;i>=0;i--){
            System.out.println("i value is:"+i);
        }
    }
}
