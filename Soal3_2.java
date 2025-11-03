import java.util.Scanner;

public class Soal3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Aplikasi Penjumlahan Dua Matriks ===");
        
        // Input dimensi matriks
        System.out.print("Masukkan Jumlah Baris Matriks (m): ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks (n): ");
        int kolom = scanner.nextInt();
        
        // Inisialisasi Matriks A, B, dan Hasil
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] matriksHasil = new int[baris][kolom];

        // 1. Input Elemen Matriks A
        System.out.println("\n--- Masukkan Elemen Matriks A ---");
        masukkanElemenMatriks(scanner, matriksA, baris, kolom);

        // 2. Input Elemen Matriks B
        System.out.println("\n--- Masukkan Elemen Matriks B ---");
        masukkanElemenMatriks(scanner, matriksB, baris, kolom);

        // 3. Lakukan Penjumlahan Matriks
        matriksHasil = jumlahkanMatriks(matriksA, matriksB, baris, kolom);
        
        // 4. Tampilkan Hasil
        System.out.println("\n--- Matriks A ---");
        cetakMatriks(matriksA, baris, kolom);
        
        System.out.println("\n--- Matriks B ---");
        cetakMatriks(matriksB, baris, kolom);
        
        System.out.println("\n--- Hasil Penjumlahan (A + B) ---");
        cetakMatriks(matriksHasil, baris, kolom);

        scanner.close();
    }

    /**
     * Membantu pengguna memasukkan elemen-elemen untuk sebuah matriks.
     */
    public static void masukkanElemenMatriks(Scanner scanner, int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Masukkan elemen [%d][%d]: ", i, j);
                matriks[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * Melakukan operasi penjumlahan dua matriks.
     */
    public static int[][] jumlahkanMatriks(int[][] A, int[][] B, int baris, int kolom) {
        int[][] Hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                // Penjumlahan elemen pada posisi yang sama
                Hasil[i][j] = A[i][j] + B[i][j];
            }
        }
        return Hasil;
    }

    /**
     * Mencetak elemen-elemen matriks ke layar.
     */
    public static void cetakMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println(); // Pindah baris setelah mencetak satu baris penuh
        }
    }
}

