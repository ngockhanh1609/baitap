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
public class Circle {
    private int R;
    private int x,y;

    public Circle() {
    }

    public Circle(int R, int x, int y) {
        this.R = R;
        this.x = x;
        this.y = y;
    }
    
    public double C(){
    double  result = 2*Math.PI*this.R;
    return result;
    }
    public double S(){
    double result  = Math.PI*this.R*this.R;
    return result;    
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
