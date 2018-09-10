/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Monirul Islam
 */
public class ObjectClass {
    
    private static ObjectClass instance=new ObjectClass();
    
    private ObjectClass()
    {
        
    };
    
    public static ObjectClass getObj()
    {
        return instance;
    }
    
    public void msg()
    {
        System.out.println("Object Created...");
    }
}
