public class Program {
    public static void main(String[] args) {
        Vulture vulture = new Vulture();
        vulture.dominate();
        output(vulture);
        System.out.println();
        Parrot parrot = new Parrot();
        output(parrot);
    }

    public static void output(Bird bird){
        bird.eat();
        bird.sleep();
    }
}
