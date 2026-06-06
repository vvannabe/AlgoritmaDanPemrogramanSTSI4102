import java.util.Scanner;

public class Menghitung_Gaji_Lembur {
    public static void main(String[] args) {
        int A = 5000000;
        int B = 6500000;
        int C = 9500000;
        int gajiPokok = 0;

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Golongan Karyawan : ");
            String golongan = input.nextLine();

        if(golongan.equals("A")) {
            gajiPokok = A;
        } else if(golongan.equals("B")) {
            gajiPokok = B;
        } else if(golongan.equals("C")) {
            gajiPokok = C;
        } else {
            System.out.println("Golongan Tidak Valid");
            return;
        }
        // Logika Golongan Karyawan

        int persen = 0;
        System.out.print("Jam Lembur : ");
        int lembur = input.nextInt();

        if(lembur == 0) {
            System.out.println("Tidak ada bonus");
        }
        else if(lembur == 1) {
            persen = 30;
        }else if(lembur == 2) {
            persen = 32;
        }else if(lembur == 3) {
            persen = 34;
        }else if(lembur == 4) {
            persen = 36;
        }else if(lembur >= 5) {
            persen = 38;
        }else {
            System.out.println("Jam Lembur tidak sesuai");
            return;
        }
        // Logika Jam Lembur

        double bonus = (persen / 100.0 * gajiPokok);
        double gaji = gajiPokok + bonus;
        // Perhitungan Gaji total

        System.out.println("============================");
        System.out.println("Gaji Golongan : " + golongan);
        System.out.println("Jam lembur : " + lembur);
        System.out.printf("Bonus lembur : Rp. %.0f%n", bonus);
        System.out.printf("Total Gaji Karyawan : Rp. %.0f%n", gaji);
        System.out.println("============================");
        // Tampilan Akhir
        }
    }
}

