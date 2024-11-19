/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ING MBAME MBAME
 */
public class Folder extends Component {

    private String name;
    private String type;
    private List<Component> subfolder;

    //this is bcz you just give the name of the folder when creation
    //composition
    public Folder(String name) {
        this.name = name;
        //this.type = "Folder";
        this.subfolder = new ArrayList<Component>();
    }

    @Override
    public void describe() {
        System.out.println(this.name + " is a" + " Folder");
        int i;
        //go through the sub elements
        for (i = 0; i < subfolder.size(); i++) {
            if (subfolder.get(i) instanceof Folder) {
                //recursivity
                //describe the elements of a folder in a folder
                subfolder.get(i).describe();
            } else if (subfolder.get(i) instanceof File) {
                //istance of a file
                subfolder.get(i).describe();
            }

        }
    }
    
    public void Add(Component element){
        subfolder.add(element);
    }
    
    public void Delete(Component element){
        int i;
        for (i=0;i<subfolder.size();i++){
            if(subfolder.get(i)==element){
                subfolder.remove(i);
            }
        }
    }
    public Component Obtain(int i){
        return subfolder.get(i);
    }

}
