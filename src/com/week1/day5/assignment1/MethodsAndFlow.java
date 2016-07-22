package com.week1.day5.assignment1;

public class MethodsAndFlow
{
    //Data members
    int num;
    String words = "";
    
    String[] stringArray = {"This is cool"};
    
    //Constructor
    
    public MethodsAndFlow()
    {
        
    }
    
    public MethodsAndFlow(int num)
    {
       this(); 
       this.num = num;
    }
    
    public MethodsAndFlow(String words)
    {
       this(5); 
       this.words = words;
    
}
  
    public MethodsAndFlow(String[] stringArray)
    {
        
}
}