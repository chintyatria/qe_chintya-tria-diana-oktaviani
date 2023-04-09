# REST API Testing
Standar arsitektur komunikasi berbasis web yang sering diterapkan dalam 
pengembangan layanan berbasis web. Umumnya menggunakan HTTP sebagai 
protokol untuk komunikasi data. Salah satu implementasi dari web service 
sebagai standar yang digunakan untuk pertukaran data antar aplikasi. 
Data yang digunakan dalam API umumnya berupa JSON

## API Concept & Fundamental
### API Concept
User (Mobile App) >request/response< Waiter (API) >request/response< Kitchen (APP/System/Server)

### Fundamental API
##### Test Process
1. Definisikan API yang akan dites
2. Input data yang dibutuhkan baik di header maupun di body requestnya
3. Send request ke server
4. Lakukan validasi terhadap response yang diberikan
