/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modun;

/**
 *
 * @author LAM
 */
public class account {
    private int Id;
    private String Gmail, Name, Pass;

    public account() {
    }

    public account(int Id, String Gmail, String Name, String Pass) {
        this.Id = Id;
        this.Gmail = Gmail;
        this.Name = Name;
        this.Pass = Pass;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}
