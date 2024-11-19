/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author ING MBAME MBAME
 */
public class Member {

    public static void main(String[] args) {

        //creating a child
        System.out.println("*******creation of a Boy********");

        FamilyMember James = new Boy("James");

        James.describe();
        
        
        //creating a child
        System.out.println("*******creation of a Girl********");

        FamilyMember Erika = new Boy("Erika");

        Erika.describe();
        
        //creating a Parent
        System.out.println("*******creation of a Boy********");

        FamilyMember Daddy = new Boy("Martin");

        Daddy.describe();

    }

}
