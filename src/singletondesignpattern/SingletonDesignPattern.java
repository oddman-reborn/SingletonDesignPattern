/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;

import demo.ObjectClass;

/**
 *
 * @author Monirul Islam
 */
public class SingletonDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectClass obj=ObjectClass.getObj();
        obj.msg();
    }
    
}
