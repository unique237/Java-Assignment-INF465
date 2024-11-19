/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author ING MBAME MBAME
 */
public class Girl extends Child{

    public Girl() {
        super();
        this.name=name;
        this.gender=gender;
        this.dress=dress;
        
    }

    @Override
    public void describe() {
        System.out.println("My name is: "+name+", I am a "+gender+"and I wear "+dress);
    }
    
    
}
