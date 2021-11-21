package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Students> danhSach;
//khai bao 1 ArrayList trong truong hop nguoi ta k truyen vao 1 ArrayList
    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<Students>();
    }

    public DanhSachSinhVien(ArrayList<Students> danhSach) {
        this.danhSach = danhSach;
    }
//"1. Them Sinh Vien Vao Danh Sach.\n"
    public void themSinhVien(Students sv){
        this.danhSach.add(sv);
    }
//2. In ra danh sach sinh vien
    public void inDanhSachSinhVien(){
        for(Students sinhVien:danhSach){
            System.out.println(sinhVien);
        }
    }
//3. Kiem tra danh sach sinh vien co rong hay khong
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
//4 Lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
//5. Lam rong danh sach sinh vien
public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
}
//6.Kiem tra ton tai Sinh Vien
    public boolean kiemTraTonTai(Students sv){
        return this.danhSach.contains(sv);
    }
// 7. Xoa mot ban  sinh vien ra khoi danh sach danh sinh vien
    public boolean xoaSinhVien(Students sv){
        return this.danhSach.remove(sv);
    }
// 8. Tim sinh vien
public void timSinhVien(String ten) {
    for (Students sinhVien : danhSach
    ) {
        if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
            System.out.println(sinhVien);
        }
    }
}
//9. Xuat ra sinh vien tu cao den thap
    public void sapXepSinhVienTheoDiemTangDan(){
        Collections.sort(this.danhSach, new Comparator<Students>() {
            @Override
            public int compare(Students sv1, Students sv2) {
                if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh())
                    return -1;
                else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return 1;
                }else
                    return 0;
            }
        });
    }
}
