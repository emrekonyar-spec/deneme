import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basit hesap makinesi");
        System.out.print("Birinci sayi: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Gecersiz sayi.");
            scanner.close();
            return;
        }
        double first = scanner.nextDouble();

        System.out.print("Islem secin (+ - * /): ");
        String op = scanner.next().trim();

        System.out.print("Ikinci sayi: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Gecersiz sayi.");
            scanner.close();
            return;
        }
        double second = scanner.nextDouble();

        if (op.equals("/") && second == 0.0) {
            System.out.println("Sifira bolme hatasi.");
            scanner.close();
            return;
        }

        double result;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Gecersiz islem.");
                scanner.close();
                return;
        }

        System.out.println("Sonuc: " + result);
        scanner.close();
    }
}
