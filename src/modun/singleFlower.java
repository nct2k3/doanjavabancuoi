/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class singleFlower extends Flower{
    private int petalsFlowerNum;
    
    public singleFlower(int petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public singleFlower(int petalsFlowerNum, String Name, String Code, String Type, int Amount, String Color) {
        super(Name, Code, Type, Amount, Color);
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public int getPetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public void setPetalsFlowerNum(int petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }
 
}
