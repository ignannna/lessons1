/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kollektsiimas2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class MassivTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
                     
        }
        
//        System.out.println(arrayList.toString());
//        
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//        
//        System.out.println(arrayList.get(arrayList.size()-1));
//        
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//           }
//        for (Integer x : arrayList){
//            System.out.println(x);
//        }
//        arrayList.forEach((x) ->{
////            System.out.println(x);
//      });
for (Integer x : arrayList){
           linkedList.add(x);
      }
        
        
        System.out.println(linkedList.toString());
        
           }
    
}

