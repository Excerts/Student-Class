/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

/**
 *
 * @author User
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student me = new student();
        me.setName = ("Ryan");
        me.setAddress = ("1647 55th ST");
        me.setAge = ("20");
        me.setPhoneNum = ("6468889828");

        student friend1 = new student();
        friend1.setName = ("Annie");
        friend1.setAddress = ("1123 50th ST");
        friend1.setAge = ("21");
        friend1.setPhoneNum = ("9172234525");

        student friend2 = new student();
        friend2.setName = ("Kenne");
        friend2.setAddress = ("863 88th ST");
        friend2.setAge = ("22");
        friend2.setPhoneNum = ("6467788907");

        System.out.println("My name is: " + me.setName());
        System.out.println("My address is: " + me.setAddress());
        System.out.println("My age is: " + me.setAge());
        System.out.println("My nphone number is: " + me.setPhoneNum());

        System.out.println("My friend1's name is: " + friend1.setName());
        System.out.println("My friend1's address is: " + friend1.setAddress());
        System.out.println("My friend1's age is: " + friend1.setAge());
        System.out.println("My friend1's phone number is: " + friend1.setPhoneNum());

        System.out.println("My friend2's name is: " + friend2.setName());
        System.out.println("My friend2's address is: " + friend2.setAddress());
        System.out.println("My friend2's age is: " + friend2.setAge());
        System.out.println("My friend2's phone number is: " + friend2.setPhoneNum());
        
        

    

    public String getName() {
        return name;
    }
    public void setName(String name) {
         this.name = name;

}
