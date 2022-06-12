/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Manager {
    private String kodeManager;
    private String namaManager;
    private String kodeGudang;

    public Manager(String kodeManager, String namaManager, String kodeGudang) {
        this.kodeManager = kodeManager;
        this.namaManager = namaManager;
        this.kodeGudang = kodeGudang;
    }

    public String getKodeManager() {
        return kodeManager;
    }

    public void setKodeManager(String kodeManager) {
        this.kodeManager = kodeManager;
    }

    public String getNamaManager() {
        return namaManager;
    }

    public void setNamaManager(String namaManager) {
        this.namaManager = namaManager;
    }

    public String getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(String kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String showDataManager() {
        return this.kodeManager + " | " + this.namaManager + " | " + this.kodeGudang;
    }
}
