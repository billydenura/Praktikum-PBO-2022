package com.company.tugas7;

public class Persegi extends BangunDatar implements Hitung{
    private int sisi;

    public Persegi(String nama, int sisi) {
        this.sisi = sisi;
        super.listBangunDatar[BangunDatar.isiNow] = nama;
        BangunDatar.isiNow++;
    }

    @Override
    public double hitungSpesial() {
        double diagonal = Math.pow(2*(Math.pow(sisi,2)),0.5);
        return diagonal;
    }

    @Override
    public double hitungLuas() {
        double luas = sisi*sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double kll = sisi*4;
        return kll;
    }

    @Override
    void info() {
        System.out.println("====================================================");
        System.out.println("Nama Bangun Datar\t: Persegi");
        System.out.println("Panjang Sisi\t\t: "+ sisi);
        System.out.printf("Luas\t\t\t: %.2f\n",hitungLuas());
        System.out.printf("Keliling\t\t: %.2f\n",hitungKeliling());
        System.out.printf("Nilai Spesial\t: %.2f\n",hitungSpesial());
    }
}
