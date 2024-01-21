package model;

import java.util.Date;
import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String queQuan;
	private Date ngaySinh;
	private String khoiThi;
	private String SDT;
	private int gioiTinh;
	public Student() {
		
	}
	public Student(int id, String name, String queQuan, Date ngaySinh, String khoiThi, String sDT, int gioiTinh) {
		super();
		this.id = id;
		this.name = name;
		this.queQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.khoiThi = khoiThi;
		this.SDT = sDT;
		this.gioiTinh = gioiTinh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getKhoiThi() {
		return khoiThi;
	}
	public void setKhoiThi(String khoiThi) {
		this.khoiThi = khoiThi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + ", khoiThi="
				+ khoiThi + ", SDT=" + SDT + ", gioiTinh=" + gioiTinh + "]";
	}
	
	
}
