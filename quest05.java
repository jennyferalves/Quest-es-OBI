import java.util.Scanner;

public class quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine();
        String limpo = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String invertido = new StringBuilder(limpo).reverse().toString();
        if (limpo.equals(invertido)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        scanner.close();
    }
}

