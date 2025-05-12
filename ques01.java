import java.util.Scanner;

public class ques01 {
    public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine();
        String semEspacos = input.replace(" ", "");
        System.out.println("Número de caracteres (sem espaços): " + semEspacos.length());
        scanner.close();
    }
}
}
