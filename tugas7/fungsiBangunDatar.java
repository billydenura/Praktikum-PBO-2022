package com.company.tugas7;

public class fungsiBangunDatar extends BangunDatar{

    @Override
    void info() {
        System.out.println("\nLoading List Bangun Datar...");
        System.out.println("Terdapat "+ isiNow +" Bangun Datar yang telah Didaftarkan di dalam List");
        System.out.println("Sisa Slot Bangun Datar yang Dapat Ditambahkan : "+(max-isiNow));
        for (int i = 0 ; i < isiNow ; i++) {
            System.out.println((i+1)+". "+listBangunDatar[i]);
        }
    }
}
