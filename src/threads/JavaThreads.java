package threads;

class Za{

}

// class A extends Thread{
class  A implements Runnable{
    public void run (){
        for(int i=1; i<10; i++){
        System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        }

class  B implements Runnable{
    public void run (){
        for(int i=1; i<10; i++){
            System.out.println("Hellow");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }

public class JavaThreads {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2= new B();

        Runnable obj3 = ()->{

            for(int i=1; i<10; i++){
                System.out.println("Lambda");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

//        System.out.println(obj1.getPriority());
//obj2.setPriority(Thread.MAX_PRIORITY);


Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);


        t1.start();

//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//e.printStackTrace();
//        }
        t2.start();
        t3.start();



    }


}
