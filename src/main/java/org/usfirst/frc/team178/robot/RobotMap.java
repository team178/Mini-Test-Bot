/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot;

public class RobotMap {
	
    public static int left = 1;
    public static int right = 0;

    public static int pixy1Address = 8;
    public static int pixy2Address = 9;
    public static int tofAddressL = 18;
    public static int tofAddressR = 19;
    public static int lightsAddress = 7;
    public static int linearActuator = 3;
    

    public enum SubsystemIndex
    {
        ALL, BUMPER
    }
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
