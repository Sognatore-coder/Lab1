public class Main {
    public static void main(String[] args){
        Greeter greeter = new Greeter();
        String name = greeter.askName();
        System.out.println("Hello, " + name + "!");
    }
}