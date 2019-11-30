/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamlet.sistemserviskomputer.Model;

/**
 *
 * @author hamlet
 */
public class Servis {
    private int idServis;
    private String namaPelanggan;
    private String barangServis;
    private int totalHarga;
    private String status;

    public Servis(int idServis, String namaPelanggan, String barangServis, int totalHarga, String status) {
        this.idServis = idServis;
        this.namaPelanggan = namaPelanggan;
        this.barangServis = barangServis;
        this.totalHarga = totalHarga;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdServis() {
        return idServis;
    }

    public void setIdServis(int idServis) {
        this.idServis = idServis;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getBarangServis() {
        return barangServis;
    }

    public void setBarangServis(String barangServis) {
        this.barangServis = barangServis;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    
}
