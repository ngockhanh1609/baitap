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
public class Worker extends Person {
    private String congty;

    public Worker() {
    }

    public Worker(String congty, String HovaTen, int gioitinh, Date ngaysinhl) {
        super(HovaTen, gioitinh, ngaysinhl);
        this.congty = congty;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }
    
}
