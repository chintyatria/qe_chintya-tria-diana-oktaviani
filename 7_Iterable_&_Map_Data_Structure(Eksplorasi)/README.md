# Materi 1 - Iterable 
## Iterable
Interface yang memungkinkan suatu objek untuk diiterasi, yaitu 
memungkinkan objek tersebut dilintasi elemen per elemen.
## Collection
Interface yang merepresentasikan kumpulan objek. Collection merupakan 
turunan dari iterable.
## List
Sebuah jenis kumpulan objek yang disusun secara berurutan dan memiliki 
indeks untuk setiap elemen di dalamnya.
#### Array List
Kumpulan objek yang diimplementasikan sebagai array. Memiliki kecepatan 
akses cepat tetapi lambat saat memanipulasi elemen tengah atau depan list.
#### Linked List
Kumpulan objek yang diimplementasikan sebagai linked list. Memiliki 
kecepatan memanipulasi elemen tengah atau depan list cepat, tetapi 
lambat saat mengakses elemen secara acak.
#### Immutable List
Kumpulan objek yang tidak dapat diubah (immutable), artinya setelah 
dibuat, elemen-elemennya tidak bisa ditambahkan, diubah, atau dihapus.
## Set
Kumpulan objek yang tidak memiliki elemen duplikat.
#### Hash Set
Kumpulan objek yang tidak memiliki urutan tertentu dan diimplementasikan 
sebagai tabel hash.
#### LinkedHashSet
Kumpulan objek yang diimplementasikan sebagai hash table dengan linked 
list yang menjaga urutan penambahan elemen.
#### Immutable Set
Kumpulan objek yang tidak dapat diubah (immutable), artinya setelah 
dibuat, elemen-elemennya tidak bisa ditambahkan, diubah, atau dihapus. 
## Sorted Set
Kumpulan objek yang tidak memiliki elemen duplikat dan disusun secara 
alami (natural order) atau berdasarkan komparator yang ditentukan.
#### TreeSet
Kumpulan objek yang disusun secara alami (natural order) atau berdasarkan 
komparator yang ditentukan, dan diimplementasikan sebagai pohon biner 
pencarian.#### NavigableSet
#### NavigableSet
Menyediakan method untuk melakukan traversal dalam berbagai bentuk, 
seperti traversal berdasarkan range, traversal dari awal atau akhir, 
traversal berdasarkan subset, dan lain sebagainya.
## Queue
Merupakan kumpulan objek yang mirip dengan antrian atau queue pada 
kehidupan sehari-hari. Objek yang dimasukkan pertama kali akan keluar 
atau diambil pertama kali juga (first-in-first-out/FIFO).
## Deque
Merupakan kumpulan objek yang mirip dengan antrian atau queue, tetapi 
dapat mengakses elemen dari kedua ujung antrian (head dan tail). Objek 
yang dimasukkan pertama kali ke head antrian, akan keluar pertama kali 
dari head antrian juga (first-in-first-out/FIFO), begitu juga dengan 
objek yang dimasukkan terakhir ke tail antrian.
## Stack
Kumpulan objek  yang bersifat Last-In-First-Out (LIFO), artinya objek 
yang terakhir dimasukkan ke dalam stack, akan menjadi objek pertama 
yang diambil atau dihapus dari stack.

# Materi 2 - Map

## Map
Kumpulan objek yang terdiri dari pasangan key-value (atau disebut juga 
sebagai entry). Setiap key hanya dapat muncul sekali pada map, namun 
value dapat muncul beberapa kali pada map.
#### HashMap
Sebuah implementasi dari Map yang memetakan keys ke values. Setiap key 
hanya dapat muncul sekali pada HashMap, namun value dapat muncul 
beberapa kali pada HashMap.
#### WeakHashMap
Sebuah implementasi dari Map yang mirip dengan HashMap, namun 
memungkinkan entry yang tidak lagi digunakan oleh program untuk dihapus 
oleh garbage collector. Entry-entry yang dihapus tersebut biasanya 
dipicu oleh keberadaan objek-objek yang merupakan key pada entry tersebut, 
dan tidak lagi direferensikan oleh program.
#### IdentityHashMap
Sebuah implementasi dari Map yang menggunakan identitas objek sebagai 
kunci (key) untuk setiap entry-nya, bukan berdasarkan kesamaan nilai 
(value) seperti yang dilakukan oleh implementasi lain seperti HashMap.
#### LinkedHashMap
Sebuah implementasi dari Map yang mirip dengan HashMap, namun menjamin 
urutan key dan value saat diakses. LinkedHashMap merupakan subclass dari 
HashMap dan menyimpan key dan value seperti HashMap, namun juga 
menyimpan urutan key saat diakses.
#### ImmutableMap
Sebuah implementasi dari Map yang bersifat tidak dapat diubah (immutable), 
artinya setelah ImmutableMap dibuat, tidak dapat lagi menambah, mengubah, 
atau menghapus entry pada ImmutableMap tersebut.
## SortedMap
Sebuah sub-interface dari Map  yang memperbolehkan key pada map diurutkan. 
SortedMap menyimpan entry pada urutan key yang ditentukan oleh 
implementasi yang digunakan, dan dapat melakukan operasi-operasi 
terkait pengurutan.
#### With Comparator
Sebuah interface pada Java yang digunakan untuk membandingkan dua objek 
dan menentukan urutan pengurutan. Untuk menggunakan Comparator pada 
SortedMap, pengguna dapat menggunakan konstruktor pada implementasi 
SortedMap yang ingin digunakan dan memberikan sebuah instance dari 
Comparator sebagai parameter.
## Navigable Map
Sub-interface dari SortedMap. NavigableMap menyediakan fungsi-fungsi 
navigasi yang lebih lengkap dibandingkan dengan SortedMap.


