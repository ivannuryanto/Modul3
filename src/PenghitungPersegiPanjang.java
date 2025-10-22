import java.util.Scanner;

public class PenghitungPersegiPanjang {

    public static void main(String[] args) {
        try ( // Membuat objek Scanner untuk menerima input dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Program Penghitung Persegi Panjang ===");
            // Meminta input panjang
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble(); // Menggunakan double untuk mengakomodasi nilai desimal
            // Meminta input lebar
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble(); // Menggunakan double untuk mengakomodasi nilai desimal
            // Menghitung luas (Rumus: Panjang * Lebar)
            double luas = hitungLuas(panjang, lebar);
            // Menghitung keliling (Rumus: 2 * (Panjang + Lebar))
            double keliling = hitungKeliling(panjang, lebar);
            // Menampilkan hasil
            System.out.println("\n--- Hasil Perhitungan ---");
            System.out.println("Panjang: " + panjang);
            System.out.println("Lebar: " + lebar);
            System.out.println("Luas persegi panjang: " + luas);
            System.out.println("Keliling persegi panjang: " + keliling);
            System.out.println("-------------------------");
            // Menutup objek Scanner
        }
    }

    /**
     * Metode untuk menghitung luas persegi panjang.
     * @param p Panjang persegi panjang.
     * @param l Lebar persegi panjang.
     * @return Luas persegi panjang.
     */
    public static double hitungLuas(double p, double l) {
        return p * l;
    }

    /**
     * Metode untuk menghitung keliling persegi panjang.
     * @param p Panjang persegi panjang.
     * @param l Lebar persegi panjang.
     * @return Keliling persegi panjang.
     */
    public static double hitungKeliling(double p, double l) {
        return 2 * (p + l);
    }
}