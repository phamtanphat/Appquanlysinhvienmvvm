package com.example.designpatternmvvm.model;

public class Sinhvien {
    private int id;
    private String ten;
    private String diachi;
    private int hinhanh;

    public Sinhvien(int id, String ten, String diachi, int hinhanh) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
