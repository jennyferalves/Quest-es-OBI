import java.util.Scanner;

public class quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String resultado = frase.replaceAll("(?i)[aeiou]", "*");

        System.out.println("Saída: " + resultado);

        scanner.close();
    }
}
