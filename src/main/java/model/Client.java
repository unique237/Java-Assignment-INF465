/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *WE DON'T INSTANTIATE AN ABSTRACT CLASS
 * @author ING MBAME MBAME
 */

//implementing compostion
public class Client {
    public static void main(String [] args){
        //lets create some stuffs
        
        //creation of a pdf file
        
        System.out.println("________ creation of a file: content1.Pdf______");
        
        File content1 = new PdfFile("content1");
        
        content1.describe();
        
        
        //creatin a text file
        
        System.out.println("________ creation of a file: content2.txt______");
        
        File content2 = new TxtFile("content2");
        
        content2.describe();
        
        //creating a folder
        
        System.out.println("________ creation of a folder:INF465______");
        
        Folder inf465 = new Folder("inf465");
        
        //inf465.describe();
        
        inf465.Add(content2);
        inf465.Add(content1);
        
        //inf465.describe();
        
        inf465.Obtain(1).describe();
        
        inf465.Delete(content2);
        
        inf465.describe();
        
        Folder branch = new Folder("branch");
        
        //adding the branch in folder
        inf465.Add(branch);
        
        inf465.describe();
        
        System.out.println();
        
        
    }
}
