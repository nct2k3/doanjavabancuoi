/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class banyanFlower extends Flower{
    private int subFlowerNum;

    public banyanFlower() {
    }

    public banyanFlower(int subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }

    public banyanFlower(int subFlowerNum, String Name, String Code, String Type, int Amount, String Color) {
        super(Name, Code, Type, Amount, Color);
        this.subFlowerNum = subFlowerNum;
    }

    public int getSubFlowerNum() {
        return subFlowerNum;
    }

    public void setSubFlowerNum(int subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }
    
}
