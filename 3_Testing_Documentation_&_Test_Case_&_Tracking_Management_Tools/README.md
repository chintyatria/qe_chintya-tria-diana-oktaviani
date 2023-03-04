# Testing Documentation

## Test Scenario
Merupakan dokumen yang berisi sekumpulan langkah-langkah sistematis yang 
disusun oleh software tester agar sistem yang akan dites memenuhi ketentuan 
yang diinginkan oleh user dan memiliki standar tertentu. Test scenario 
merupakan tingkatan tertinggi dari sebuah test case. 

Tujuan test scenario:
1. Memudahkan developer dan tester untuk melakukan testing
2. Menjadi dasar pengembangan bagi pengerjaan projek
3. Sebagai dasar client atau PO menyesuaikan dengan system requirement

Beberapa tools yang digunakan untuk melakukan test scenario:
1. Google Spreadsheet
2. TestRail
3. TestLink
4. TestIO

Kriteria test scenario yang tergolong baik:
1. In-Line With System Requirement = system requirement adalah kunci untuk 
menyusun screnario test sesuai dengan flow yang sudah ditentukan
2. Give Context = user bersikap seolah-olah perlu melakukan hal tersebut
3. Give Details = memberikan rincian secara spesifik hal-hal yang perlu 
diketahui oleh user
4. Crystal Clear Easy To Understand = memberikan penjelasan secara detail 
terkait test step dan spesifikasi expected result
5. Complete = user dapat melakukan apapun sesuai dengan system requirement 
yang telah diberikan
6. Coherent = antara skenario dan step satu dengan yang lain harus saling 
berkesinambungan
7. Proof = lengkapi dengan hasil yang didapatkan dari skenario yang telah 
dilakukan (past or failed)
8. Consistant = penggunaan kata harus konsisten dari step satu dengan step 
selanjutnya
9. End User Mind, Don't Assume = contoh, dalam pembuatan notifikasi harus 
dipastikan bahwa client menginginkan notifikasi berupa pop up massage atau 
alert
10. Don't Forget Cover Negative Test = tidak semua test yang dilakukan dalam 
kondisi positif, tulis semua kemungkinan yang ada
11. Update = catat perubahan dan perbarui versi pembuatannya


## Test Case

Test case atau uji kasus merupakan rancangan atau rangkaian tindakan yang 
dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur atau 
fungsi tertentu dari sebuah perangkat lunak. Pembuatan test case bertujuan 
untuk memastikan bahwa suatu sistem dapat dijalankan dengan baik sesuai dengan 
kebutuhan awal serta mampu memberikan respon ketika terdapat suatu input yang 
tidak valid. 

Komponen test case:
1. Test Case ID
2. Test Case Description
3. Pre-Condition
4. Test Step
5. Expected Result
6. Actual Result
7. Status

Test case bekerja sebagai titik awal dalam pelaksanaan pengujian sebuah sistem. 

Beberapa hal yang perlu diperhatikan ketika membuat test case:
1. Test Case Sederhana dan Transparan = penguji harus membuat test case yang 
sederhana dengan penjelasan yang jelas dan ringkas agar orang lain dapat 
mengeksekusi serta gunakan bahasa yang mudah dipahami
2. Test Case Berdasarkan End User In Mind = mampu membuat kasus dengan 
mengingat prespektif dari pengguna
3. Hindari Looping Test Case = jika diperlukan untuk menguji test case lain, 
penguji dapat memanggil test case tersebut ke dalam kolom pre-condition
4. Don't Assume = jangan mengasumsikan mengenai fitur dalam fungsi dari 
perangkat yang sedang diuji. Pengujian harus sesuai dengan ketentuan dan 
dokumen spesifikasi.
5. Pastikan Pengujian Telah Mencakup Semua = pastikan bahwa software tester 
telah melakukan testing secara keseluruhan serta memenuhi persyaratan 
perangkat lunak seperti yang disebutkan dalam dokumen spesifikasi
6. Test Case Harus Bisa Diidentifikasi = nama dari test case id harus bisa 
diidentifikasi sehingga memudahkan software tester ketika akan melacak error 
atau mengidentifikasi persiapan perangkat lunak pada tahap selanjutnya
7. Repeatable and Soft Standing = dalam membuat test case harus menghasilkan 
hasil yang sama tidak peduli siapapun pengujinya
8. Peer Review = test case yang dibuat harus bisa ditinjau oleh orang lain, 
memungkinkan orang lain menemukan sebuuah cacat yang terlewatkan


# Test Case Management Tools

Merupakan situs atau software yang digunakan oleh software tester untuk 
menyimpan informasi terkait bagaimana pengujian produk harus dilakukan, 
perencanaan kegiatan pengujian serta dokumen terkait laporan status kegiatan 
penjaminan kualitas produk. 

Keunggulan test case management tools:
1. Plan and Estimate = yang telah dibuat diinformasikan dalam sebuah test 
plan yang berisi fitur apa saja yang akan di tes.
2. Monitoring and Controlling = dapat memonitoring proses collecting, 
recording, dan reporting.
3. Reporting and Integrate With Another Tools = untuk mempermudah pembuatan 
dokumen report

Tools-Tools dalam aplikasi TestRail:
1. Mailstone = salah satu cara terbaik untuk melacak progres dan timeline 
suatu projek
2. Test Run = step untuk mengeksekusi test case yang sudah dipilih untuk 
milestone yang telah ditentukan sebelumnya
3. Test Plan = sebuah blueprint untuk melakukan proses pengujian. Dokumen 
yang berisi rencana untuk semua kegiatan pengujian yang harus dilakukan 
untuk memperoleh produk yang berkualitas

# Tracking Management Tools