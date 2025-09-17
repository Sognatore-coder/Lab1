import java.util.Scanner;

public class Greeter {
    public String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print(">");
        return scanner.nextLine();
    }
}