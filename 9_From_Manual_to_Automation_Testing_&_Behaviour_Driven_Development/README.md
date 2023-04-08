# From Manual To Automation Testing

## Manual Test
Merupakan sebuah pengujian yang dilakukan secara manual.

Kegunaan manual testing:
1. Exploratory, menjelajah fitur yang sudah dikembangkan
2. Velocity, cepat dilakukan jika terdapat perubahan kecil pada sebuah 
aplikasi
3. Usability, untuk memastikan sebuah aplikasi dapat digunakan

Kelebihan manual testing:
1. Mendapat feedback dengan cepat dana kurat
2. Lebih murah karena tidak perlu mengeluarkan biaya untuk automation 
tools
3. Sangat cocok untuk menguji perubahan yang sifatnya kecil karena tidak 
perlu ngoding

Kelemahan manual testing:
1. Manual testing sering terjadi error
2. Tidak bisa direkam, tidak reuseable


## Automation Test
Merupakan pengujian yang dilakukan secara otomatis dengan sebuah 
automation tools seperti, Katalon, Selenium, JMeter
Tujuan utama dari automation adalah efisiensi.

Kegunaan autonation testing:
1. Flexibility, menggunakan kembali testing yang sudah dibuat sebelumnya
2. Velocity, sangat cepat untuk menguji fitur yang banyak dan kompleks
3. Coverage, mengukur seberapa banyak fitur yang telah diuji
4. Error-Avoidance, potensi error dapat diminimalisir

Test case yang cocok di otomasi:
1. Test case yang dieksekusi berulang
2. Test case yang susah dilakukan dengan manual
3. Test case yang memakan waktu lama jika dilakukan dengan manual

Test case yang tidak cocok di otomasi:
1. Test case yang baru dirancang dan belum dieksekusi secara manual
2. Test case yang memiliki banyak perubahan

Proses automation testing:
1. Test tool selection (Usability, Simplicity, Cost)
2. Define scope of automation (menentukan test case apa saja yang cocok 
dilakukan otomasi)
3. Planning, design and development (strategi & plan otomasi lalu membuat 
otomasi script)
4. Test Execution 
5. Maintenance

Automation best practices:
1. Scope of automation
2. Select the right automation tools
3. Scripting standards
4. Measure metrics

# Behaviour Driven Development

## BDD
TDD adalah proses development yang menerapkan test case sebelum developer 
menuliskan production code. TDD berfokus pada komponen-komponen sistem, 
test case ditulis dengan bahasa program. BDD menerapkan test first juga, 
tetapi berbeda fokus.

BDD Test:
1. Developer menjelaskan test skenario yg menjelaskan behaviour dalam 
perspective user
2. Skenario ditulis dengan bahasa yg mudah dipahami
3. Tujuan: meningkatkan komunikasi dan kolaborasi antara stakeholder, 
tim bisnis, dan technical yang terlibat
4. Prinsip Dasar: mendeskripsikan behaviour sistem tanpa menjelaskan 
implementasinya secara rinci 
5. Stakeholder, technical, dan non-tech berkolaborasi untuk 
mendeskripsikan kebutuhan user dan func sistem, ditulis melalui feature 
file deskripsi dlm file ini berguna sbg test logic sbg dasar unt QA dlm 
menulis test script & tim dev dlm penulisan implementasi code unt 
membangun sistem

BDD Format:
1. Dituliskan dalam bagasa gerkins dg format bahasa inggris
2. User Story, menjelasakan kebutuhan user dan func sistem yg diharapkan
3. As A [X], I Want [Y], So That [Z], gerkin syntax berdasar user stories
4. Scenario, mengimplementasikan test script dalam setiap files berdasar 
skenario
5. Given (konteks skenario), When (tindakan yang dilakukan), 
Then (outcome dari tindakan yang dilakukan user), berhubungan dg nomor 2

## Cucumber
Sebuah tools untuk melakukan serangkaian behaviour test. Cucumber adalah 
sebuah tools yang mendukung BDD. Membaca semacam ketentuan yang dapat 
dieksekusi, yg ditulis dengan teks biasa. Memfalidasi bahwa sistem 
melakukan sesuatu sesuai dengan ketentuan tersebut