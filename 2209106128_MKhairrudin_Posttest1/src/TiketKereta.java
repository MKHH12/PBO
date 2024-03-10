import java.util.Scanner;

public class TiketKereta {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tujuan = new String[10];
        String[] jam = new String[10];
        int[] jumlahTiket = new int[10];
        int[] hargaTiket = new int[10];
        int jumlahData = 0;

        boolean Running =true;

        while(Running){

            System.out.println("\n========== Sistem Pendataan Tiket Kereta ==========");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Tampilkan Tiket");
            System.out.println("3. Edit Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Keluar");
            System.out.println("Pilihan anda: ");

            int pilihan = sc.nextInt();
            sc.nextLine();
        
            

            switch(pilihan){
                case 1:
                    System.out.println("\n========== Masukkan Data ==========");
                    System.out.print("Masukkan tujuan: ");
                    tujuan[jumlahData] = sc.nextLine();
                    System.out.print("Masukkan Jam Keberangkatan: ");
                    jam[jumlahData] = sc.nextLine();
                    System.out.print("Masukkan jumlah tiket: ");
                    jumlahTiket[jumlahData] = sc.nextInt();
                    System.out.print("Masukkan harga tiket: ");
                    hargaTiket[jumlahData] = sc.nextInt();
                    jumlahData++;
                    System.out.println("Tiket berhasil ditambahkan!");
                    break;
                case 2:
                    if(jumlahData == 0){
                        System.out.println("Data tidak ditemukan");
                    }else{
                        System.out.println("========== Data Tiket Kereta ==========");
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.println("Tujuan: " + tujuan[i]);
                            System.out.println("Jam Keberangkatan: " + jam[i]);
                            System.out.println("Jumlah Tiket: " + jumlahTiket[i]);
                            System.out.println("Harga Tiket: " + hargaTiket[i]);
                            System.out.println("======================================");

                        }
                    }
                    break;
                    
                    
                    
                case 3:
                    System.out.println("\n========== Edit Data ==========");
                    System.out.print("Masukkan nomor tiket yang akan diedit: ");
                    int nomorEdit = sc.nextInt();
                    sc.nextLine();
                    if (nomorEdit >= 1 && nomorEdit <= jumlahData) {
                        System.out.print("Masukkan tujuan baru: ");
                        tujuan[nomorEdit - 1] = sc.nextLine();
                        System.out.print("Masukkan jam keberangkatan baru: ");
                        jam[nomorEdit - 1] = sc.nextLine();
                        System.out.print("Masukkan jumlah tiket baru: ");
                        jumlahTiket[nomorEdit - 1] = sc.nextInt();
                        System.out.print("Masukkan harga tiket baru: ");
                        hargaTiket[nomorEdit - 1] = sc.nextInt();
                        System.out.println("Data tiket berhasil diubah!");
                    } else {
                        System.out.println("Nomor tiket tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("\n========== Hapus  Data ==========");
                    System.out.print("Masukkan nomor tiket yang akan dihapus: ");
                    int nomorHapus = sc.nextInt();
                    sc.nextLine();
                    if (nomorHapus >= 1 && nomorHapus <= jumlahData) {
                        for (int i = nomorHapus - 1; i < jumlahData - 1; i++) {
                            tujuan[i] = tujuan[i + 1];
                            jam[i] = jam[i + 1];
                            jumlahTiket[i] = jumlahTiket[i + 1];
                            hargaTiket[i] = hargaTiket[i + 1];
                        }
                        jumlahData--;
                        System.out.println("Data tiket berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tiket tidak valid!");
                    }
                    break;

                case 5:
                    Running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                System.out.println("Pilihan tidak valid!");
                break;

            }

        }


    }
}
