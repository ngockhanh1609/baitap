/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donglenh.chuong01;

/**
 *
 * @author Admin
 */
public class bai04 {
    public static void main(String[]args){
        Circle hinhtron = new Circle(5,1,2);
        System.out.println("Chu vi cua hinh tron la: "+hinhtron.C());
        System.out.println("Dien tich cua hinh tron la: "+hinhtron.S());
        
        retangle hcn = new retangle(3,15,8,5);
        System.out.println("Chu vi hinh chu nhat la: "+hcn.C());
        System.out.println("Chu vi hinh chu nhat la: "+hcn.S());
    }
}
