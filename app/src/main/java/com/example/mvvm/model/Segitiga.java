package com.example.mvvm.model;

public class Segitiga {
    private Double alas;
    private Double tinggi;
    private Double sisiA;
    private Double sisiB;
    private Double sisiC;
    private Double hasil;

    public Double getSisiA() {
        return sisiA;
    }

    public void setSisiA(Double sisiA) {
        this.sisiA = sisiA;
    }

    public Double getSisiB() {
        return sisiB;
    }

    public void setSisiB(Double sisiB) {
        this.sisiB = sisiB;
    }

    public Double getSisiC() {
        return sisiC;
    }

    public void setSisiC(Double sisiC) {
        this.sisiC = sisiC;
    }

    public Double getAlas() {
        return alas;
    }

    public void setAlas(Double alas) {
        this.alas = alas;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public Segitiga(Double alas, Double tinggi, Double hasil) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.hasil = hasil;
    }

    public Segitiga(Double sisiA, Double sisiB, Double sisiC, Double hasil) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.hasil = hasil;
    }
}
