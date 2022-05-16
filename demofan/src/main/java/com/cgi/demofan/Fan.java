package com.cgi.demofan;

/*
 *  Fan class
 */

public class Fan {
    private boolean clockWiseDirection;
    private int fanSpeed;

    /*
     *  Constructor for Fan
     */
    public Fan()
    {
        fanSpeed =1;
        clockWiseDirection=true;
    }

    /*
     *  Method for First cord
     *  Maintain order either clockwise or anti-clockwise and increase/decrease speed of fan.
     */
    public void pullCordOne()
    {
        if(clockWiseDirection)
        {
            if(fanSpeed ==3 )
                fanSpeed = 0;
            else
                fanSpeed++;
        }
        else
        {
            if(fanSpeed == 0 )
                fanSpeed = 3;
            else
                fanSpeed--;
        }

    }
    /*
     *  Method for Second cord.
     *  Logic to change direction of speed setting such as clockwise and anti-clockwise.
     */
    public void pullCordTwo()
    {
        clockWiseDirection=!clockWiseDirection;
    }
    /*
     *  Method to display status of fan
     */
    public void displayStatus()
    {
        if(fanSpeed !=0)
            System.out.println("Fan is running at speed : "+fanSpeed);
        else
            System.out.println("Fan is off");
    }
}
