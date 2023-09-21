public class RabbitAndTurtle{
    public static void main(String[] args) throws InterruptedException {
        AnimalThread Turtle = new AnimalThread("Turtle", 1);
        AnimalThread Rabbit = new AnimalThread("Rabbit", 2);
        //Turtle.setPriority(10);
        Turtle.start();
        Rabbit.start();

    }
}