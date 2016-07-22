
/*
 * I received a lot of assistance from fellow boot-campers for this optional assignment
 * 
 * 
 * 
 */



package com.week1.day5.assignment1;

public class MethodsAndFlow
{
    // Data member

    private String[] stringArray;

    // Constructor

    public MethodsAndFlow(String[] stringArray)
    {
        this.stringArray = stringArray;
    }

    // methods

    public void outputSubset(int startPosition, int numberOfValues)
    {

        if (startPosition > 0 && startPosition < stringArray.length)
        {
            for (int i = startPosition; i < (startPosition + numberOfValues); i++)
            {
                System.out.println(stringArray[i]);
            }

        } else
        {
            System.out.println("Error");
        }
    }

    public void outputAll()
    {
        outputSubset(0, stringArray.length);
    }

}
