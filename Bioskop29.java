import java.util.Scanner;

public class Bioskop29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlah, diskonPersen, totalBayar;
        int totalTiket = 0, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            if (jumlah > 10) {
                diskonPersen = 15;
            } else if (jumlah > 4) {
                diskonPersen = 10;
            } else {
                diskonPersen = 0;
            }

            int hargaAwal = jumlah * hargaTiket;
            totalBayar = hargaAwal - (hargaAwal * diskonPersen / 100);

            System.out.println("Diskon: " + diskonPersen + "%");
            System.out.println("Total bayar: Rp " + totalBayar);

            totalTiket += jumlah;
            totalPenjualan += totalBayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        sc.close();
    }
}