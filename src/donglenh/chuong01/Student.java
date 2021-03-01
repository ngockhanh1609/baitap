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
public class Student extends Person {
    private String truonghoc;

    public Student() {
    }

    public Student(String truonghoc, String HovaTen, int gioitinh, Date ngaysinhl) {
        super(HovaTen, gioitinh, ngaysinhl);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    void getNgaysinhl(Date parse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getHovaTen(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
