import java.util.Random;

public class AnimalThread extends Thread{
    String name;
    int priority;

    static boolean finish = true;



    AnimalThread(String name, int priority){
        this.name = name;
        this.priority = priority;
        setPriority(priority);
    }
    @Override
    public void run(){
        for (int i = 1; i<11; i++) {
            System.out.println(name + " пробежала " + i + " метров ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " финишировала");
    }
}