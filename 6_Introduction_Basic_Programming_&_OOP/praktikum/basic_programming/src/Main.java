import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        char ulang, ulang2, ulang3, ulang4;

        System.out.println();
        System.out.println("!!!SOAL BASIC PROGRAMMING!!!");
        System.out.println("1. Basic Programming Prioritas 1");
        System.out.println("2. Basic Programming Prioritas 2");
        System.out.println("3. Basic Programming Eksplorasi");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.print("Masukkan Pilihan: ");
        pilih = input.nextInt();

        do{
            switch (pilih){

                case 1:
                    do {
                        int pilih2 = 0;
                        System.out.println("1. Luas Segitiga");
                        System.out.println("2. Luas Persegi Panjang");
                        System.out.println("3. Luas Lingkaran");
                        System.out.println("4. Hasil Penjualan");
                        System.out.println("5. Keluar");
                        System.out.println();
                        System.out.print("Masukkan Pilihan: ");
                        pilih2 = input.nextInt();

                        switch(pilih2){
                            case 1:
                                float alas = 20;
                                float tinggi = 25;
                                System.out.println("---------- JAWABAN ----------");
                                System.out.println();
                                System.out.println("Rumus = 1/2 * alas * tinggi");
                                System.out.println("Luas Segitiga = "+ 0.5 * alas * tinggi);
                                break;

                            case 2:
                                float panjang = 40;
                                float lebar = 6;
                                System.out.println("---------- JAWABAN ----------");
                                System.out.println();
                                System.out.println("Rumus = panjang * lebar");
                                System.out.println("Luas Persegi Panjang = "+ panjang * lebar);
                                break;

                            case 3:
                                double jari = 7;
                                System.out.println("---------- JAWABAN ----------");
                                System.out.println();
                                System.out.println("Rumus = phi * r * r");
                                System.out.println("Luas Lingkaran = "+ 3.14 * jari * jari);
                                break;

                            case 4:
                                do{
                                    int hargaBeli = 0;
                                    int hargaJual = 0;
                                    int total;

                                    System.out.println("SAMPEL 1. Harga Beli = 15.000 Harga Jual = 30.000");
                                    System.out.println("SAMPEL 2. Harga Beli = 12.000 Harga Jual = 9.000");
                                    System.out.println("SAMPEL 3. Harga Beli = 12.000 Harga Jual = 12.000");

                                    System.out.println("Masukkan Harga Sesuai Sampel!!");
                                    System.out.println();
                                    System.out.print("Masukkan Harga Beli: ");
                                    hargaBeli = input.nextInt();
                                    System.out.print("Masukkan Harga Jual: ");
                                    hargaJual = input.nextInt();

                                    if(hargaJual < hargaBeli){
                                        total = hargaJual - hargaBeli;
                                        System.out.println("Rugi Sebesar: "+ total);
                                    }
                                    else if(hargaJual > hargaBeli){
                                        total = hargaJual - hargaBeli;
                                        System.out.println("Untung Sebesar: "+ total);
                                    }
                                    else if(hargaJual == hargaBeli){
                                        System.out.println("Sama Saja");
                                    }

                                    System.out.println();
                                    System.out.println("Ingin Masukkan Sampel Harga Lain? (y/t)");
                                    ulang2 = input.next().charAt(0);

                                    System.out.println();

                                }

                                while(ulang2 != 't');
                                System.exit(0);

                            case 5:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("!!!!!! MENU TIDAK TERSEDIA !!!");
                        }

                        System.out.println();
                        System.out.println("Ingin Melihat Jawaban Luas Bangun Datar Lain? (y/t)");
                        ulang = input.next().charAt(0);

                        System.out.println();

                    }

                    while(ulang != 't');
                    System.exit(0);

                case 2:
                    do{
                        int pilih3 = 0;
                        System.out.println("1. Random XYZ");
                        System.out.println("2. Segitiga Asetrik");
                        System.out.println("3. Keluar");
                        System.out.println();
                        System.out.print("Masukkan Pilihan: ");
                        pilih3 = input.nextInt();

                        switch(pilih3){
                            case 1:
                                drawXYZ(5);
                                break;
                            case 2:
                                System.out.print("Masukkan tinggi segitiga: ");
                                int a = input.nextInt();
                                for (int i = 1; i <= a; i++) {
                                    for (int j = a - i; j >= 1; j--) {
                                        System.out.print("  ");
                                    }
                                    for (int k = 1; k <= 2 * i - 1; k++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("!!!!!! MENU TIDAK TERSEDIA !!!");
                        }
                        System.out.println();
                        System.out.println("Ingin Melihat Jawaban Prioritas 2 Lain? (y/t)");
                        ulang3 = input.next().charAt(0);

                        System.out.println();
                    }

                    while(ulang3 != 't');
                    System.exit(0);

                case 3:
                    do{
                        String teks;
                        String teksEnkripsi = "";
                        System.out.print("Masukkan teks yang ingin dienkripsi: ");
                        teks = input.next();


                        for (int i = 0; i < teks.length(); i++) {
                            char karakter = teks.charAt(i);
                            if (karakter >= 'A' && karakter <= 'Z') {
                                karakter = (char) (karakter + 10);
                                if (karakter > 'Z') {
                                    karakter = (char) (karakter - 26);
                                }
                            }
                            teksEnkripsi += karakter;
                        }

                        System.out.println();
                        System.out.println("Hasil enkripsi: " + teksEnkripsi);

                        System.out.println();
                        System.out.println("Ingin Input Ulang Teks? (y/t)");
                        ulang4 = input.next().charAt(0);

                        System.out.println();
                    }

                    while(ulang4 != 't');
                    System.exit(0);


                default:
                    System.out.println("!!!!!! MENU TIDAK TERSEDIA !!!");
            }

            System.out.println();
            System.out.println("Ingin Melihat Jawaban Basic Programming Lain? (y/t)");
            ulang = input.next().charAt(0);

            System.out.println();
        }

        while(ulang != 't');
        System.exit(0);


    }
    public static void drawXYZ(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("X");
            } else {
                if (i % 2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
            }
            if (i == n) {
                System.out.println();
            }
        }
    }
}