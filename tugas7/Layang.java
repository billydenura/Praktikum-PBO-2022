package com.company.tugas7;

public class Layang extends BangunDatar implements Hitung{
    int diag1, diag2, miring1, miring2;

    public Layang(String nama, int diag1, int diag2, int miring1, int miring2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
        this.miring1 = miring1;
        this.miring2 = miring2;
        super.listBangunDatar[BangunDatar.isiNow] = nama;
        BangunDatar.isiNow++;
    }

    @Override
    public double hitungLuas() {
        double luas = diag1*diag2/2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double kll = (miring1+miring2)*2;
        return kll;
    }

    @Override
    public double hitungSpesial() {
        double miringMin = Math.min(miring1,miring2);
        double diagMin = (Math.min(diag1,diag2))/2;
        double tinggiSementara = Math.pow(Math.pow(miringMin,2)-Math.pow((diagMin),2),0.5);
        double luasSegitiga = tinggiSementara*diagMin;
        return luasSegitiga;
    }

    @Override
    void info() {
        System.out.println("====================================================");
        System.out.println("Nama Bangun Datar\t: Layang");
        System.out.println("Panjang Diagonal 1\t: "+ diag1);
        System.out.println("Panjang Diagonal 2\t: "+ diag2);
        System.out.println("Panjang Sisi Miring 1 : "+ miring1);
        System.out.println("Panjang Sisi Miring 2 : "+ miring2);
        System.out.printf("Luas\t\t\t: %.2f\n",hitungLuas());
        System.out.printf("Keliling\t\t: %.2f\n",hitungKeliling());
        System.out.printf("Nilai Spesial\t: %.2f\n",hitungSpesial());
    }
}
