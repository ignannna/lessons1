/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartTest;

/**
 *
 * @author User
 */
public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + '}';
    }
        
        void sayHello(){
        System.out.println("Hello from" + name + " " + lastName);
    }
        
      void sayBye(){
        System.out.println(name + " " + lastName + "Bye");
    }  
    }
    
    
   
    

