# PERFORMANCE TESTING

Merupakan non functional test untuk menentukan parameter sistem dalam hal 
responsif dan stabilitas dibawah berbagai beban kerja. Apakah sistem tetap 
dapat bekerja dengan baik meskipun diberikan berbagai request yang banyak. 
Untuk mengukur penggunaan sumber daya dari sebuah sistem.

Hal-Hal yang diukur:
1. Performa aplikasi (sampai batas tertentu)
2. Bukan functional test
3. Dalam bentuk lain (response time saat diberi banyak request, 
bagaimana sistem berinteraksi saat diberi data yang besar)

Kenapa Performance Test Jarang Dilakukan?
1. Butuh biaya mahal (membagi environment menjadi testing dan production)

Yang Perlu Diperhatikan Dari Performance Test:
1. Troughput: satuan waktu (req per second)
2. Response data

Langkah Performance Test:
1. Membuat test plan (Mengenali endpoint yang akan di test ,Menyediakan 
kebutuhan masing-masing endpoint)
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test

Metode Performance Testing:
1. Pilih berdasarkan kondisi sistem (awali dengan load test)
2. Pilih berdasarkan situasi yang akan dihadapi

Tipe Performance Test:
1. Smoke Test (untuk melakukan verifikasi script yg telah dibuat atau 
testing pemanasan. 1-2 VUs)
2. Load Test (memberi beban kerja tertentu dalam jumlah wajar untuk 
mengukur proses transaksinya seperti apa. pakai acuan table tier jika 
fitur belum pernah masuk ke production)
3. Endurance Test/ Soak Test (memberi beban kerja yang cukup banyak 
dalam waktu yang panjang. dapat diketahui apakah sistem ini ada bug 
atau kondisi race cond, memory leaks, dsb. jika di production maka 
dilakukan dijam-jam sepi yg tidak ada transaksi)
4. Stress Test (untuk mengamati sebuah kemampuan sistem dalam kondisi 
ekstrim. beri beban kerja normal lalu dinaikkan terus sampai melebihi 
puncaknya. lalu memberi scale down/ menurunkan beban kerja untuk melihat 
proses recovery dari sistem)
5. Peak Test ()
6. Spike Test (sama seperti stress test namun kenaikan beban kerjanya 
langsung drastis. seperti waktu flash sale.)
7. Volume Test (menguji ketahanan sistem ketika diberi banyak database 
atau dikenal juga sebagai float test. Berbeda dengan load test yang 
bersifat umum, test ini berfokus pada databasenya saja)
