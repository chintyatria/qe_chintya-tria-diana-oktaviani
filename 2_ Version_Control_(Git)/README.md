# (1) Versioning Control and Branch Management (Git)


## A. What is Versioning?
Mengatur versi atau pelacakan perubahan dari setiap code program. 
Dilakukan untuk mengetahui sebuah perubahan, gunanya untuk 
melacak kesalahan dalam code program untuk tujuan peningkatan 
performa program. Version control system digunakan untuk 
mengetahui setiap langkah yang dilakukan. 

GIT: salah satu VCS yang paling populer yang digunakan developer 
untuk mengembangkan software bersama-sama.

## B. Git Install
Download git versi terbaru melalui search engine yang dimiliki 
kemudian lakukan instalasi seperti biasa.

## C. Setting Up

### Git Init
Digunakan untuk membuat file git agar bisa melakukan uploading 
project ke github atau aplikasi git lainnya. Command = git init

### Git Clone
Digunakan untuk melakukan kloning projek dengan cara yang lebih 
mudah dan command yang lebih singkat. Command = git clone 
(link https dari github)


## D. Saving Changes

### Git Status
Melacak riwayat perubahan dan informasi lokasi project saat ini. 
Command = git status

### Git Add
Membuat file atau folder yang mengalami perubahan dari work 
directory menjadi berada pada staging area. Command = git add 
(nama file)atau git add . (ini digunakan untuk adding seluruh 
perubahan yang ada)

### Git Commit
Pesan yang berisi informasi perubahan yang telah dilakukan pada 
sebuah file atau folder project sebelum dilakukan push ke 
repository. Command = git commint -m ("nama pesan")

### Git Diff
Untuk melihat perunahan yang terjadi secara detail melalui 
terminal. Command = git diff

### Git Ignore
Melakukan pengecualian beberaoa file tertentu untuk tidak diikutkan. 
Seperti file-file atau folder-folder modul dari framework.


## E. Inspecting Repository and Undoing

### Git Checkout
Untuk melakukan perpindahan atau moving branch. 
Command = git checkout ("nanam branch tujuan").


## F. Syncing

### Git Fetch
Refreshing atau mengambil perubahan yang ada untuk memastikan ada atau 
tidaknya perubahan terbaru dari suatu code program.

### Git Remote
Sinkronasi untuk menghubungkan repostitori github dengan folder
project. Command = git remote add oringin (paste link https dari
repositori github)

### Git Push
Melakukan uploading project atau perubahan yang ada pada work 
repository yang tentunya sudah dilakukan commit. 
Command = git push origin master

### Git Pull
Menarik project atau perubahan terbaru yang ada di repository 
untuk melanjutkan pengerjaan. Pastikan untuk pull project 
terbaru untuk menghindari ketertinggalan update code program 
terbaru.


## G. Branches
Lokasi ketika sebuah project dipush untuk menjadi repository lain tetapi 
dengan code program yang sama. Pembuata branch yang berbeda-beda dilakukan 
untuk menghindari conflict ketika beberapa developer melakukan pushing 
project di waktu yang bersamaan, jadi dapat diketahui conflict antara 
branch yang mana sehingga dapat dipertanggungjawabkan.

## H. Pull Request
Menyatukan anatara branch satu dan lainnya yang dilakukan pada branch 
master. Ketika terjadi conflict maka harus solved dahulu lalu bisa 
dilanjutkan pull request.