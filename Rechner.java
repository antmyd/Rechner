
import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double zahl1;
        Double zahl2;
        Double ergebnis = 0.0;

        String input;

        char plus = '+';
        char minus = '-';
        char mal = '*';
        char geteilt = '/';


        System.out.println("Zahl1 :");
        zahl1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Operator: +, -, * oder /");
        input = sc.nextLine();
        char operator = input.charAt(0);

        System.out.println("Zahl1 :");
        zahl2 = sc.nextDouble();

        switch (operator) {
            case '+': ergebnis = zahl1 + zahl2;
            break;
            case '-': ergebnis = zahl1 - zahl2;
            break;
            case '*':  ergebnis = zahl1 * zahl2;
            break;
            case '/': ergebnis = zahl1 / zahl2;
            break;
            default: System.out.println("Ungültiger Operator. Wiederhole Eingabe");
        }

        System.out.println("Ergebnis: " + ergebnis);


        
    }
}
