/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ING MBAME MBAME
 */
public class Father extends FamilyMember{
    private String name;
    private String gender;
    private String dress;
    private List<FamilyMember> children;

    public Father(String name) {
        this.name = name;
        this.children = new ArrayList<FamilyMember>();
    }

    
    @Override
    public void describe() {
        System.out.println("My name is: "+name+", I am a "+gender+"and I wear "+dress);
        int i;
        for (i = 0; i < children.size(); i++) {
            if (children.get(i) instanceof Father) {
                //recursivity
                //describe the elements of a folder in a folder
                children.get(i).describe();
            } else if (children.get(i) instanceof Father) {
                //istance of a file
                children.get(i).describe();
            }

        }
    }
    
    public void Add(FamilyMember element){
        children.add(element);
    }
    
    public void Delete(FamilyMember element){
        int i;
        for (i=0;i<children.size();i++){
            if(children.get(i)==element){
                children.remove(i);
            }
        }
    }
    public FamilyMember Obtain(int i){
        return children.get(i);
    }
    
}
