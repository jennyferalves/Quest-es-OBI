import java.util.Scanner;

public class quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();
        System.out.println("Maiúsculas: " + input.toUpperCase());
        System.out.println("Minúsculas: " + input.toLowerCase());
        scanner.close();
    }
}

