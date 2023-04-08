
import java.util.ArrayList;
import java.util.UUID;

public class Eksplorasi {
    private UUID id;
    private String judul;
    private String penulis;
    private String kategori;

    public Eksplorasi (String judul, String penulis, String kategori){
        this.id = UUID.randomUUID();
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }
    public UUID getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String toString() {
        return "ID: " + id + "\njudul: " + judul + "\npenulis: " + penulis + "\nkategori: " + kategori;
    }
}

class Buku {
    private ArrayList<Eksplorasi> databuku = new ArrayList<>();

    public void tambahBuku(String judul, String penulis, String kategori) {
        Eksplorasi eksplorasi = new Eksplorasi(judul, penulis, kategori);
        databuku.add(eksplorasi);
        System.out.println("Buku Berhasil Ditambah.");
    }

    public void tampildatabuku() {
        if (databuku.size() == 0) {
            System.out.println("Tidak Ada Data Buku.");
        } else {
            System.out.println("Daftar Semua Data Buku:");
            for (Eksplorasi Buku : databuku) {
                System.out.println(Buku);
            }
        }
    }

    public void tampilBukuById(UUID id) {
        for (Eksplorasi eksplorasi : databuku) {
            if (eksplorasi.getId().equals(id)) {
                System.out.println(eksplorasi);
                return;
            }
        }
        System.out.println("Buku Tidak Ditemukan.");
    }

    public void ubahBuku(UUID id, String judul, String penulis, String kategori) {
        for (Eksplorasi buku : databuku) {
            if (buku.getId().equals(id)) {
                buku.setJudul(judul);
                buku.setPenulis(penulis);
                buku.setKategori(kategori);
                System.out.println("Buku Berhasil Diubah.");
                return;
            }
        }
        System.out.println("Buku Tidak Ditemukan.");
    }

    public void hapusBuku(UUID id) {
        for (int i = 0; i < databuku.size(); i++) {
            if (databuku.get(i).getId().equals(id)) {
                databuku.remove(i);
                System.out.println("Buku Berhasil Dihapus.");
                return;
            }
        }
        System.out.println("Buku Tidak Ditemukan.");
    }
}
