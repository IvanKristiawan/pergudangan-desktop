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
    private Supplier kodeSupplier;
    private Gudang kodeGudang;

    public Stok(String kodeStok, String namaStok, int kuantitas, Supplier kodeSupplier, Gudang kodeGudang) {
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

    public Supplier getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(Supplier kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public Gudang getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(Gudang kodeGudang) {
        this.kodeGudang = kodeGudang;
    }
    
    public String showDataStok() {
        return this.kodeStok + " | " + this.namaStok + " | " + this.kuantitas + " | " + this.kodeSupplier + " | " + this.kodeGudang;
    }
}
