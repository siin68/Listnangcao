package com.example.listnangcao;

public class Nuocuong {
    private String Ten;
    private String mota;
    private  int hinh;

    public Nuocuong(String ten, String mota, int hinh) {
        Ten = ten;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}

