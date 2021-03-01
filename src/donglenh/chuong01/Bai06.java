/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class Bai06 {
    public static void main(String[]args) throws ParseException{
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "15-05-2001";
        Date ngaysinh=df.parse(input);
        Person person = new Person("Nguyen van A", 1, ngaysinh);
        
        System.out.println("Ho va ten: " + person.getHovaTen()+"; gioi tinh: "+person.getGioitinh()+"; Ngay sinh: " + df.format(person.getNgaysinhl()));
        Student sinhvien = new Student();
        sinhvien.setHovaTen("Nguyen van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinhl(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("Dai hoc hue");
        System.out.println("Ho va ten: "+sinhvien.getHovaTen()+ 
                "; Gioi tinh: "+ sinhvien.getGioitinh()+
                "; Ngay sinh: "+df.format(sinhvien.getNgaysinhl())+"; Truong hoc: "+sinhvien.getTruonghoc());
        
        Worker congnhan = new Worker();
        congnhan.setHovaTen("Pham Le Ngoc Khanh");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinhl(df.parse("16-09-2000"));
        congnhan.setCongty("IBM");
        System.out.println("Ho va ten: "+congnhan.getHovaTen()+"; Gioi tinh: "
                +congnhan.getGioitinh()+"; Ngay sinh: "+df.format(congnhan.getNgaysinhl())+"; Cong ty: "+congnhan.getCongty());
    }   
    
    
}
