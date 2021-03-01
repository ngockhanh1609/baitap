/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh.chuong01;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Person {
    private String HovaTen;
    private int gioitinh;
    private Date  ngaysinhl;

    public Person() {
    }

    public Person(String HovaTen, int gioitinh, Date ngaysinhl) {
        this.HovaTen = HovaTen;
        this.gioitinh = gioitinh;
        this.ngaysinhl = ngaysinhl;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinhl() {
        return ngaysinhl;
    }

    public void setNgaysinhl(Date ngaysinhl) {
        this.ngaysinhl = ngaysinhl;
    }
    
    
            
}
