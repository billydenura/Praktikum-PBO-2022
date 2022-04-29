package com.company.tugas7;

public class Segitiga extends BangunDatar implements Hitung{
    private int alas, tinggi;

    public Segitiga(String nama, int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        super.listBangunDatar[BangunDatar.isiNow] = nama;
        BangunDatar.isiNow++;
    }

    @Override
    public double hitungLuas() {
        double luas = alas*tinggi*0.5;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double kll = alas+tinggi+hitungSpesial();
        return kll;
    }

    @Override
    public double hitungSpesial() {
        double sisiMiring = Math.pow((Math.pow(alas,2)+Math.pow(tinggi,2)),0.5);
        return sisiMiring;
    }

    @Override
    void info() {
        System.out.println("====================================================");
        System.out.println("Nama Bangun Datar\t: Segitiga");
        System.out.println("Panjang Tinggi\t\t: "+ tinggi);
        System.out.println("Panjang Alas\t\t: "+ alas);
        System.out.printf("Luas\t\t\t: %.2f\n",hitungLuas());
        System.out.printf("Keliling\t\t: %.2f\n",hitungKeliling());
        System.out.printf("Nilai Spesial\t: %.2f\n",hitungSpesial());
    }
}
