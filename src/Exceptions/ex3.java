/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author User
 */
public class ex3 {
    public static void main(String[] args) {
        try{
        throw new Exception("��� ����������");
       } catch (Exception e){
            System.out.println("��������� ����������");
            System.out.println(e.getMessage());
        }
        
    }
    
}
