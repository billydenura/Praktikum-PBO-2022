package com.company.tugas7;

public class Trapesium extends BangunDatar implements Hitung{
    private int sisiAtas, sisiBawah, tinggi;

    public Trapesium(String nama, int sisiAtas, int sisiBawah, int tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        super.listBangunDatar[BangunDatar.isiNow] = nama;
        BangunDatar.isiNow++;
    }

    @Override
    public double hitungLuas() {
        double luas = tinggi*(sisiAtas+sisiBawah)/2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.pow((Math.pow(tinggi,2)+Math.pow((Math.abs(sisiBawah-sisiAtas))/2,2)),0.5)  ;
        double kll = sisiAtas+sisiBawah+(sisiMiring*2);
        return kll;
    }

    @Override
    public double hitungSpesial() {
        double luasPersegi = Math.min(sisiAtas,sisiBawah)*tinggi;
        return luasPersegi;
    }

    @Override
    void info() {
        System.out.println("====================================================");
        System.out.println("Nama Bangun Datar\t: Trapesium");
        System.out.println("Panjang Sisi Atas\t: "+ sisiAtas);
        System.out.println("Panjang Sisi Bawah \t: "+ sisiBawah);
        System.out.println("Panjang Tinggi\t\t: "+ tinggi);
        System.out.printf("Luas\t\t\t: %.2f\n",hitungLuas());
        System.out.printf("Keliling\t\t: %.2f\n",hitungKeliling());
        System.out.printf("Nilai Spesial\t: %.2f\n",hitungSpesial());
    }
}
