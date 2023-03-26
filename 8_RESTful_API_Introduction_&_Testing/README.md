# RESTful API Introduction & Testing

#### API & REST API
1. API, suatu penghubung yang memungkinkan suatu aplikasi untuk 
berinteraksi satu sama lain. Tujuannya untuk mempercepat proses 
development
2. API Workflow, menerima request dari client untuk diteruskan kepada 
sistem/ server yang kemudian akan memberikan response yang dikembalikan 
kepada client melalui API.
3. REST API, sering dikembangkan dalam layanan berbasis web. Umumnya 
menggunakan protokol HTTP sebagai komunikasi data. Data yang digunakan 
umumnya berupa json.
#### HTTP Method
HTTP dirancang untuk memungkinkan kemunikasi antara client dan server. 
HTTP Method:
1. GET, membaca data
2. PUT, membuat atau mengganti data
3. POST, membuat data baru
4. DELETE, menghapus data yang ada
#### REST API Component
1. Method -> get, put, post, delete
2. URL (base URL + path) -> cara untuk dapat melakukan request
3. Header -> kumpulan feed dan value yang terkait dengan pemberian 
informasi tentang pesan ke penerima.
4. Body -> mendefinisikan parameter apa yang dikirim ke server, 
untuk menentukan informasi yang akan didapat itu akan dibuata atau 
dihapus

Biasanya dalam API terdapat JSON,

JSON (JavaScript Object Notation) adalah sebuah format data untuk 
pertukaran dan penimpanan data.

#### HTTP Response Code
1. 200 OK = Menandakan bahwa request berhasil dikirim
2. 201 Created = Menandakan bahwa request berhasil dikirim dan resource 
berhasil juga dibuat (POST & PUT)
3. 400 Bad Request = Terjadi ketika melakukan request POST atau PUT lalu 
data tidak sesuai atau terdapat kesalahan dalam format
4. 404 Not Found = Terjadi ketika resource yang diperlukan tidak 
ditemukan
5. 401 Unauthorized = Terjadi karena user tidak melakukan authentikasi 
sebelum melakukan request
6. 405 Method Not Allowed = HTTP yang digunakan tidak support atau salah 
HTTP methodnya. Misal ingin POST tp pagai method GET
7. 500 Internal = Terdapat kesalahan pada server

### API Testing
Test yang dilakukan pada layer dimana API yang didesain untuk berinteraksi 
atau komunikasi pada aplikasi dipastikan funsionalitasnya.
Jenis API Testing:
1. Functionality, untuk memvalidasi suatu fitur apakah sudah berfungsi 
atau belum.
2. Load Test, untuk menguji kekuatan suatu sistem. Apakah mampu mengolah 
data dari beban yang diberikan.
3. Security, untuk menguji keamanan dari suatu sistem.

API Testing Tools:
1. Postman
2. JMeter
3. Frisby
4. REST-assured

API Testing Process:
1. Specification Review, untuk mereview spesifikasi dari spesifikasi API 
dan use case document
2. Test Specification Development, untuk memastikan detail dokumen 
mengenai test condition dan spesifikasi hasilnya di setiap test case
3. Test Framework Development, harus memilih akan menggunakan tools apa 
dalam API testing nanti
4. Test Case Development, membuat test scenario maupun test case nya
5. Execution & Repost, mengeksekusi test skenario yang telah dibuat dan 
membuat report dari hasil testing


