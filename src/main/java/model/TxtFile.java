/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ING MBAME MBAME
 */
public class TxtFile extends File {

    //constructor
    public TxtFile(String name) {
        super();
        this.name=name;
        this.type="TXT";
    }

    @Override
    public void describe() {
        System.out.println(this.name+" is a "+this.type+" file");
    }
    
}
