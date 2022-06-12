/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Stok {
    private String kodeStok;
    private String namaStok;
    private int kuantitas;
    private String kodeSupplier;
    private String kodeGudang;

    public Stok(String kodeStok, String namaStok, int kuantitas, String kodeSupplier, String kodeGudang) {
        this.kodeStok = kodeStok;
        this.namaStok = namaStok;
        this.kuantitas = kuantitas;
        this.kodeSupplier = kodeSupplier;
        this.kodeGudang = kodeGudang;
    }

    public String getKodeStok() {
        return kodeStok;
    }

    public void setKodeStok(String kodeStok) {
        this.kodeStok = kodeStok;
    }

    public String getNamaStok() {
        return namaStok;
    }

    public void setNamaStok(String namaStok) {
        this.namaStok = namaStok;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }
    
    public String showDataStok() {
        return this.kodeStok + " | " + this.namaStok + " | " + this.kuantitas + " | " + this.kodeSupplier + " | " + this.kodeGudang;
    }
}
