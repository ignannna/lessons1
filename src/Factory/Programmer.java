/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author User
 */
public class Programmer implements Employee{

    @Override
    public void doWork() {
        System.out.println("I programmer. Programming code!");
    }
    
}
