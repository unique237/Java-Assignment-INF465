/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ING MBAME MBAME
 */
/*
*abstract classes inherits from other abstract classes
*/
public class PdfFile extends File {

    //in case u don't want it to be an abstract class, emplement the method describe
    /*we emplement this as polymorphism because there are many other types of files 
    *that are going to use that method
    *behaves defferentlydepending on the file
    */
    
    //constructor
    
    public PdfFile(String name) {
        super();
        this.name=name;
        this.type="PDF";
    }

    @Override
    public void describe() {
        System.out.println(this.name+" is a "+this.type+" file.");
    }
    
}
