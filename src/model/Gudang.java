/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Gudang {
    private String kodeGudang;
    private String namaGudang;
    private String alamatGudang;

    public Gudang(String kodeGudang, String namaGudang, String alamatGudang) {
        this.kodeGudang = kodeGudang;
        this.namaGudang = namaGudang;
        this.alamatGudang = alamatGudang;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getNamaGudang() {
        return namaGudang;
    }

    public void setNamaGudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }

    public String getAlamatGudang() {
        return alamatGudang;
    }

    public void setAlamatGudang(String alamatGudang) {
        this.alamatGudang = alamatGudang;
    }

    public String showDataGudang() {
        return this.kodeGudang + " | " + this.namaGudang + " | " + this.alamatGudang;
    }

    @Override
    public String toString() {

        return kodeGudang;
    }
}
