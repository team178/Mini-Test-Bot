/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team178.robot.RobotMap.SubsystemIndex;
import org.usfirst.frc.team178.robot.commands.SendMessage;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team178.robot.subsystems.Arduino;


public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    Arduino arduino;
    public Joystick joystickMain = new Joystick(0);
    public Button button1 = new JoystickButton(joystickMain, 1);
	public Button button2 = new JoystickButton(joystickMain, 2);
	public Button button3 = new JoystickButton(joystickMain, 3);
	public Button button4 = new JoystickButton(joystickMain, 4);
	public Button button5 = new JoystickButton(joystickMain, 5);
	public Button button6 = new JoystickButton(joystickMain, 6);
    public Button button7 = new JoystickButton(joystickMain, 7);
    
    public Joystick xbox = new Joystick(1);
    public Button buttonA = new JoystickButton(xbox, 1);
	public Button buttonB = new JoystickButton(xbox, 2);
	public Button buttonX = new JoystickButton(xbox, 3);
	public Button buttonY = new JoystickButton(xbox, 4);
	public Button lBumper = new JoystickButton(xbox, 5);
	public Button rBumper = new JoystickButton(xbox, 6);
	public Button backButton = new JoystickButton(xbox, 7);
    public Button startButton = new JoystickButton(xbox, 8);
    
    public double getX () {
		return joystickMain.getX();
	}
	
	public double getY () {
		return joystickMain.getY();
	}
	
	public double getTwist () {
		return joystickMain.getRawAxis(3);
    }
    
    public OI()
    {
        buttonA.whenPressed(new SendMessage());
        arduino = new Arduino();
        arduino.sendMessage(SubsystemIndex.ALL, "test");
    }
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
// This is a test comment. I haven't started this project yet
