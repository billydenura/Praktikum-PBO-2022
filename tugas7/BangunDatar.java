package com.company.tugas7;

public abstract class BangunDatar {
    String nama;
    static int isiNow = 0;
    static final int max = 10;
    static String [] listBangunDatar = new String[max];

    abstract void info();

    void search(String a){
        int jumlah =0;
        String b = a.toLowerCase();

        System.out.println("====================================================");
        System.out.println("Hasil pencarian bangun datar :");

        for (int i = 0 ; i < isiNow ; i++){
            String c = listBangunDatar[i].toLowerCase();
            if (c.equals(b)){
                jumlah++;
            }
        }
        for (int i = 0 ; i < isiNow ; i++) {
            String c = listBangunDatar[i].toLowerCase();
            if (c.equals(b)){
                System.out.println("Bangun Datar " + a + " ditemukan!!");
                System.out.println("Jumlah Bangun Datar dalam list = "+jumlah);
                switch (b){
                    case "persegi":
                    case "layang":
                    case "trapesium":
                        System.out.println("Sisi Bangun Datar   = 4");
                        System.out.println("Sudut Bangun Datar  = 4");
                        break;
                    case "segitiga":
                        System.out.println("Sisi Bangun Datar   = 3");
                        System.out.println("Sudut Bangun Datar  = 3");
                        break;
                    case "lingkaran":
                        System.out.println("Sisi Bangun Datar   = 1");
                        System.out.println("Sudut Bangun Datar  = 0");
                        break;
                }
                break;
            }
            else if (i == isiNow-1){
                System.out.println("Bangun Datar "+ a +" tidak ditemukan di dalam list!!");
            }
        }
    }

    public static BangunDatar getInstanceBangunDatarOf(Hitung bangun){
        BangunDatar bangunDatar = null;
        if(bangun instanceof Persegi)
            bangunDatar = (Persegi)bangun;
        else if(bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if(bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
        else if(bangun instanceof Trapesium)
            bangunDatar = (Trapesium) bangun;
        else if(bangun instanceof Layang)
            bangunDatar = (Layang)bangun;
        return bangunDatar;
    }
}
