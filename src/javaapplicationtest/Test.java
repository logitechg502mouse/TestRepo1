/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationtest;

/**
 *
 * @author gen3r
 */
public class Test {
    private int Age;
    private String Name;
  
    public Test(int a, String n){
        this.Age = a;
        this.Name = n;
    
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    @Override
    public String toString(){
        return "Hello " + getName() +", you are " + getAge() +".";
    
    }
    
    public void epic(){
       int x =1;
    }
  
}
