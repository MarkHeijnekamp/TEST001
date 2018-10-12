import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age ?");
        System.out.println();
        String age = scanner.nextLine();

        if(age.equals("admin")) {
            System.out.println("you ARE 6");
        }
    }}