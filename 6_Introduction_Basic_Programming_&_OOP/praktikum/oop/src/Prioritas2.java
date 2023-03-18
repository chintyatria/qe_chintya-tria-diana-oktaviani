import java.util.Scanner;

public class Prioritas2 {
    public void calculator(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();

        System.out.println("Pilih perhitungan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan Pilihan: ");
        int op = input.nextInt();

        double hasil = 0;
        switch (op) {
            case 1:
                hasil = tambah(bil1, bil2);
                break;
            case 2:
                hasil = kurang(bil1, bil2);
                break;
            case 3:
                hasil = kali(bil1, bil2);
                break;
            case 4:
                hasil = bagi(bil1, bil2);
                break;
            default:
                System.out.println("Operasi yang dimasukkan tidak valid");
                System.exit(0);
        }

        System.out.println("Hasil: " + hasil);
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Tidak dapat melakukan pembagian dengan nol");
            System.exit(0);
        }
        return a / b;
    }
}
