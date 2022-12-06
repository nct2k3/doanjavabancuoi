/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class listFlower {
    private String Name, Code, Type, Color;
    private int Amount, petalsFlowerNum, subFlowerNum;
    private int day, month, year;

    
    public listFlower(String Name, String Code, String Type, String Color, int Amount, int petalsFlowerNum, int subFlowerNum, int day, int month, int year) {
        this.Name = Name;
        this.Code = Code;
        this.Type = Type;
        this.Color = Color;
        this.Amount = Amount;
        this.petalsFlowerNum = petalsFlowerNum;
        this.subFlowerNum = subFlowerNum;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "listFlower{" + "Name=" + Name + ", Code=" + Code + ", Type=" + Type + ", Color=" + Color + ", Amount=" + Amount + ", petalsFlowerNum=" + petalsFlowerNum + ", subFlowerNum=" + subFlowerNum + ", day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    
    public int getPetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public int getSubFlowerNum() {
        return subFlowerNum;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getpetalsFlowerNum() {
        return petalsFlowerNum;
    }

    public void setpetalsFlowerNum(int petalsFlowerNum) {
        this.petalsFlowerNum = petalsFlowerNum;
    }

    public int getsubFlowerNum() {
        return subFlowerNum;
    }

    public void setsubFlowerNum(int subFlowerNum) {
        this.subFlowerNum = subFlowerNum;
    }
    
    
}
