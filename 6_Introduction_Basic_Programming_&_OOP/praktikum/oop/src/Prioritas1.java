public class Prioritas1 {
    private String nama;
    private String deskripsi;
    private double harga;
    private int stok;

    public Prioritas1(String nama, String deskripsi, double harga, int stok){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // getters
    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // method to get information of the product
    public void getInfo() {
        System.out.println();
        System.out.println("INFO PRODUK");
        System.out.println("Nama Produk: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
