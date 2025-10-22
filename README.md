

-----

# 📐 Penghitung Persegi Panjang Java

Sebuah program konsol sederhana yang ditulis dalam bahasa Java untuk menghitung **luas** dan **keliling** dari persegi panjang berdasarkan input panjang dan lebar yang diberikan oleh pengguna.

## 🚀 Fitur Utama

  * **Input Interaktif:** Menerima input panjang dan lebar melalui konsol.
  * **Perhitungan Luas:** Menggunakan rumus $L = P \times L$.
  * **Perhitungan Keliling:** Menggunakan rumus $K = 2 \times (P + L)$.
  * **Kode Terstruktur:** Memisahkan logika perhitungan ke dalam fungsi (`hitungLuas` dan `hitungKeliling`) untuk keterbacaan yang lebih baik.

## 🛠️ Persyaratan

  * **Java Development Kit (JDK):** Versi 8 atau lebih tinggi.

## 💻 Cara Menjalankan Program

Ikuti langkah-langkah berikut untuk mengkompilasi dan menjalankan program di lingkungan lokal Anda:

### 1\. Kompilasi

Buka terminal atau command prompt, navigasikan ke direktori tempat Anda menyimpan file `PenghitungPersegiPanjang.java`, dan jalankan perintah kompilasi:

```bash
javac PenghitungPersegiPanjang.java
```

### 2\. Eksekusi

Setelah kompilasi berhasil, jalankan program menggunakan perintah berikut:

```bash
java PenghitungPersegiPanjang
```

### 3\. Contoh Penggunaan

Program akan meminta Anda memasukkan nilai.

```
=== Program Penghitung Persegi Panjang ===
Masukkan panjang persegi panjang: 10.5
Masukkan lebar persegi panjang: 4
```

### 4\. Output

Program akan menampilkan hasil perhitungannya:

```
--- Hasil Perhitungan ---
Panjang: 10.5
Lebar: 4.0
Luas persegi panjang: 42.0
Keliling persegi panjang: 29.0
-------------------------
```

## 📄 Struktur Kode

Program terdiri dari satu kelas utama, `PenghitungPersegiPanjang`, dengan tiga bagian utama:

| Metode | Deskripsi |
| :--- | :--- |
| `main(String[] args)` | Titik masuk utama program. Bertanggung jawab untuk inisialisasi `Scanner`, menerima input, memanggil metode perhitungan, dan menampilkan hasil. |
| `hitungLuas(double p, double l)` | Fungsi statis yang mengambil panjang (`p`) dan lebar (`l`), lalu mengembalikan nilai luas. |
| `hitungKeliling(double p, double l)` | Fungsi statis yang mengambil panjang (`p`) dan lebar (`l`), lalu mengembalikan nilai keliling. |

-----

## 💡 Kontribusi

Jika Anda memiliki saran atau ingin menambahkan fitur (misalnya, validasi input), silakan buka **issue** atau buat **Pull Request**\!

## 🤙 Informasi Developer
- Nama : Ivan Nuryanto
- NIM : 202410370110156
- Kelas : Pemrograman Lanjut 3/D

-----

## ⚖️ Lisensi

Proyek ini dilisensikan di bawah **MIT License**. Lihat file `LICENSE` (jika ada) untuk detail lebih lanjut.

