/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory4;

import Factory.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class GameDevCompany extends Company{
    
    
    @Override
    List getEmploees(){
        System.out.println("");
        System.out.println("Starting company activity" +GameDevCompany.class.getSimpleName() + "\n");
       List employee = new ArrayList();
         employee.add(new Designer ());
         employee.add(new Programmer ());
         employee.add(new Tester ());
         
        for (int i = 0; i <= 50; i++) {
            employee.add(new Builder());
            
        }
        
       return employee;
    }
}
