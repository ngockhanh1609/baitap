/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh.chuong01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xuatnhap {
    public static void main(String[] args){
        boolean flag = true;
        int a= 15;
        byte b= 2;
        double c= 12.6;
        float d = 4.5f;
        String s = "Hello World!!";
        char ch='A';
        
        Scanner sc = new Scanner(System.in);
//        System.out.print("Hay nhap ho ten: ");
//        String hoten = sc.nextLine();
//        System.out.println("Ten cua ban la: "+hoten);
//        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input=sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen ban da nhap la: "+a);
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("So nguyen ban da nhap la: "+c);    
    }
}
