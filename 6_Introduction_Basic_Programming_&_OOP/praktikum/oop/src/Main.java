import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        char ulang;

        do{
            System.out.println();
            System.out.println("!!!SOAL OBJECT ORIENTED PROGRAMMING!!!");
            System.out.println("1. OOP Prioritas 1");
            System.out.println("2. OOP Prioritas 2");
            System.out.println("3. OOP Eksplorasi");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Masukkan Pilihan: ");
            pilih = input.nextInt();

            switch (pilih){
                case 1:
                    Prioritas1 pri1 = new Prioritas1("Lipstik", "Maybeline", 200000, 19);

                    pri1.setNama("Velvet Matte Ink");
                    pri1.setDeskripsi("Matte Lipstick");
                    pri1.setHarga(205000);
                    pri1.setStok(61);

                    String nama = pri1.getNama();
                    String deskripsi = pri1.getDeskripsi();
                    double harga = pri1.getHarga();
                    int stok = pri1.getStok();

                    pri1.getInfo();
                    break;
                case 2:
                    Prioritas2 pri2 = new Prioritas2();
                    pri2.calculator();
                    break;
                case 3:
                    Buku buku = new Buku();
                    while (true) {
                        System.out.println("PILIH MENU:");
                        System.out.println("1. Tambah Data Buku");
                        System.out.println("2. Tampilkan Semua Data Buku");
                        System.out.println("3. Tampilkan Buku Berdasarkan ID");
                        System.out.println("4. Ubah Buku Berdasarkan ID");
                        System.out.println("5. Hapus Buku Berdasarkan ID");
                        System.out.println("6. Keluar");

                        int pilihan = input.nextInt();
                        input.nextLine();

                        switch (pilihan) {
                            case 1:
                                System.out.print("Masukkan Judul: ");
                                String judul = input.nextLine();
                                System.out.print("Masukkan Penulis: ");
                                String penulis = input.nextLine();
                                System.out.print("Masukkan Kategori: ");
                                String kategori = input.nextLine();
                                buku.tambahBuku(judul, penulis, kategori);
                                break;

                            case 2:
                                buku.tampildatabuku();
                                break;

                            case 3:
                                //buku.tampilBukuById();
                                break;

                            case 4:
                                //buku.ubahBuku();
                                break;

                            case 5:
                                //buku.hapusBuku();
                                break;

                            case 6:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("!!!!!! MENU TIDAK TERSEDIA !!!!!!");
                                System.exit(0);
                                break;

                        }
                    }
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("!!!!!! MENU TIDAK TERSEDIA !!!!!!");
                    System.exit(0);
                    break;
            }

            System.out.println();
            System.out.println("Ingin Masuk Ke Manu Lain? (y/t)");
            ulang = input.next().charAt(0);

            System.out.println();
        }

            while(ulang != 't');
            System.exit(0);
    }
}