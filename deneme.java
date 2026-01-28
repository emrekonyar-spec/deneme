import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bolme islemi hesap makinesi");
        System.out.print("Birinci sayi: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Gecersiz sayi.");
            scanner.close();
            return;
        }
        double first = scanner.nextDouble();

        System.out.print("Ikinci sayi: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Gecersiz sayi.");
            scanner.close();
            return;
        }
        double second = scanner.nextDouble();

        if (second == 0.0) {
            System.out.println("Sifira bolme hatasi.");
            scanner.close();
            return;
        }

        double result = first / second;

        System.out.println("Sonuc: " + result);
        scanner.close();
    }
}
