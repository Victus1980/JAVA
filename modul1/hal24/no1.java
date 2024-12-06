package hal24;

import java.util.*;

public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiNormal, gajiLembur, gajiBolos, totalGaji, jamKerja;

        System.out.print("MASUKAN TOTAL JAM KERJA (50 - 60 JAM) ");
        jamKerja = input.nextInt();

        if (jamKerja >= 50 && jamKerja <= 60) {
            totalGaji = jamKerja * 5000;

        } else if (jamKerja > 60) {
            gajiLembur = jamKerja - 60;
            totalGaji = 300000 + (gajiLembur * 7500);

        } else {
            gajiBolos = (50 - jamKerja) * 2500;
            totalGaji = (300000) - gajiBolos;

        }
        System.out.println("\n\t===== GAJI ANDA BULAN INI =====");
        System.out.println("\tGAJI ANDA ADALAH = Rp. " + totalGaji);

    }
}
