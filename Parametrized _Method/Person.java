
package com;

/**
 *
 * @author Azhar
 */
public class Person {
    
    String name,gender;
    int phone;
    
    void setInfo(String n,String g,int ph){
        name = n;
        gender =g;
        phone = ph;
        
    }
    void dispalyInfo(){
        System.out.println("Name : "+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone : "+phone);
        
    }
}
