/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class Flower {
    private String Name, Code, Type, Color;
    private int Amount;
    
    public Flower() {
    }

    public Flower(String Name, String Code, String Type, int Amount, String Color) {
        this.Name = Name;
        this.Code = Code;
        this.Type = Type;
        this.Amount = Amount;
        this.Color = Color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    
}
