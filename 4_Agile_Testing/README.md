# Definisi SDLC

Merupakan proses yang digunakan untuk merancang, 
mengembangkan, dan menguji software dengan kualitas tinggi. 
Tujuannya yaitu untuk menyediakan alur terstruktur guna 
menghasilkan software yang berkualitas tinggi dengan 
perkiraan waktu penyelesaiannya singkat serta biaya yang 
cenderung rendah. SDLC juga merupakan metode berulang, sehingga 
harus dipastikan kualitas kode di setiap siklusnya.

Fungsi SDLC:
1. Sarana komunikasi antara tim dev dengan pemegang 
kepentingan
2. Membagi tanggung jawab yang jelas antara developer, 
designer, business analyst, dan project manager
3. Dapat memberikan gambaran input dan output yang jelas 
di setiap tahap

Model SDLC
1. Waterfall Model -> satu fase selesai, fase berikutnya 
harus segera dijalankan
2. Agile Model -> mampu memisahkan produk dengan proses dan 
waktu pengerjaannya secara tepat
3. Iterative Model -> metode yang memiliki repetisi tinggi. 
Developer akan  membuat produk dengan versi cepat dan pasti 
murah
4. Fish Model -> lanjutan dari waterfall
5. Pick Bank Model -> memiliki resiko tinggi saat 
dijalankan, karena tim akan menginvestasikan sebuah bahan 
baku kedalam proyek
6. Spiral Model -> metode paling felsibel dan mirip dengan 
Iterative Model

# Fase SDLC

Tahapan SDLC:
1. Requirements Gathering -> menganalisis sistem akan
   dijalankan seperti bagaimana nantinya. Hasil analisis
   berupa kekurangan dan kelebihan, fungsi, hingga pembaharuan
   sistem (alokasi SDM, perencanaan kapasitas, estimasi biaya,
   dan penetapan)
2. Design -> tahap pembuatan model cara kerja dari aplikasi
   a. Communication: mendefisikan metode komunikasi
   aplikasi dengan asset lainnya
   b. Programming: metode pemecahan masalah dan
   tugas-tugas dalam aplikasi
   c. Arsitektur: menentukan bahasa pemrograman
   praktik dalam industri
   d. User Interface: mendefinisikan cara user
   berinteraksi dengan aplikasi
   e. Platform: mendefinisikan platform dimana
   aplikasi akan dijalankan
   f. Security: mendefinisikan langkah-langkah untuk
   mengamankan aplikasi
   g. Prototype: menjadi versi awal dari software
   dalam model pengembangan
3. Development -> kondisi dimana code mulai dibangun untuk
   membuat sebuah program aplikasi.
4. Testing -> kondisi yang harus dilakukan yaitu pengujian
   sebelum produk dipublish. Bagian paling penting dalam rangkaian 
   pembuatan sebuah software. 

   Testing yang harus dilalui:
   a. Kualitas kode
   b. Functional testing
   c. Integration testing
   d. Performers testing
   e. Security testing
5. Deployment -> aplikasi sudah tersedia pada user untuk
   digunakan.
6. Maintenance -> aplikasi sudah selesai dan dapat
   digunakan di lapangan. User bisa jadi menemukan bug yang
   tidak ditemukan selama proses testing.

# Agile Testing Manifesto

Perbedaan testing manifesto dan testing biasa: dengan 
kondisi adanyakebutuhan untuk mengukur dan meningkatkan 
upaya pengujian sebagai QE dapat meningkatkan dan 
mengevaluasi seberapa baik dalam melakukan software testing.

Hal-hal yang jauh dari istilah Manifesto:
1. QE tidak bisa bekerja sampai development selesai
2. Ada tekanan di akhir sprint
3. Saling blending kalau ada bug

5 Kunci Testing Manifesto:
1. Testing is an activity not a phase: melakukan testing 
beriringan dengan proses development (tidak lagi di akhir) 
misal membuat test case dulu
2. Prevent bugs rather than finding bugs: fokus mencegah 
munculnya bug dari pada menemukan atau mencari bug
   
   Faktor-faktor munculnya bug;
   1. Requirement kurang lengkap atau kurang detail

3. Don't be a checker, be a tester: tidak cukup jika hanya 
melakukan testing tanpa ada improvement atau masukan
4. Don'y try to break the system, instead help build the 
best possible system: jangan memaksa menemukan bug sampai 
merusak sistem yang diuji
5. The whole team is responsible for quality, not just the 
tester: seluruh tim mengutamakan kualitas produk bukan 
hanya sekedar testing

# Piramida Testing

Merupakan strategi yang mempermudah tim dev dan automation 
dalam membuat software testingyang berkualitas tinggi. 
Dapat mengurangi waktu yang dibutuhkan untuk 
mengidentifikasi peluang kerusakan sistem ketika dilakukan 
testing.

Testing pyramid 3 tingkat:
1. Unit Testing -> pengujian software yang menguji setiap 
unit software. Dilakukan saat masa development.
2. Integration Testing-> pengujian dari hasil penggabungan 
dari unit-unit software. Unit-unit diuji sebagai suatu 
kombinasi
3. UI Testing -> end to end test yang paling dekat dengan 
interaksi user. 