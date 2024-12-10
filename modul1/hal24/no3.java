package modul1.hal24;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tesAkademik, tesKopetensi, tesPsikologi;

        System.out.print("MASUKAN NILAI TES AKADEMIK ANDA : ");
        tesAkademik = input.nextInt();

        System.out.print("MASUKAN NILAI TES KOPETENSI ANDA : ");
        tesKopetensi = input.nextInt();

        System.out.print("MASUKAN NILAI TES PSIKOLOGI ANDA : ");
        tesPsikologi = input.nextInt();

        double ratarata = (tesAkademik + tesKopetensi + tesPsikologi) / 3.0;
        System.out.println("\n\t\t=== PENGUMUMAN ===");

        if (ratarata >= 75) {
            if (tesAkademik >= tesKopetensi && tesAkademik >= tesPsikologi) {
                System.out.println("\tANDA MASUK DI BAGIAN ADMINISTRASI");
            } else if (tesKopetensi >= tesAkademik && tesKopetensi >= tesPsikologi) {
                System.out.println("\tANDA MASUK DI BAGIAN PRODUKSI");
            } else {
                System.out.println("\tANDA MASUK DI BAGIAN PEMASARAN");
            }
        } else {
            System.out.println("ANDA TIDAK LULUS TES");
        }
    }
}
