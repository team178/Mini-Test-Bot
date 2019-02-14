/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team178.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team178.robot.OI;
import org.usfirst.frc.team178.robot.Robot;
import org.usfirst.frc.team178.robot.subsystems.Arduino;
import org.usfirst.frc.team178.robot.subsystems.LinearActuator;
import org.usfirst.frc.team178.robot.subsystems.Pixy;

public class AlignHatchPanel extends Command {
  Pixy pixy1;
  Pixy pixy2;
  OI oi;
  LinearActuator linearactuator;

  public AlignHatchPanel() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    oi = Robot.oi;
    pixy1 = Robot.pixy1;
    pixy2 = Robot.pixy2;
    linearactuator = Robot.linearactuator;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    /*
    double desiredavg = 159;
    pixyArduino.checkForPixyValues();
    int firstLocation = pixyArduino.firstLoc;
    int secondLocation = pixyArduino.secondLoc;
    double x1 = (double) firstLocation;
    double x2 = (double) secondLocation; 
    double avg = (x1 + x2)/2;
    while(avg > (desiredavg  + 10) || avg < (desiredavg - 10)){
      double diff = desiredavg-avg;
      if (diff>desiredavg){
        linearactuator.moveActuator(false);
      } else {
        linearactuator.moveActuator(true);
      }
    }
    */
    //moved to pixy subsystem
  
    while (!Pixy.checkPixyAlign())
    {
      linearactuator.moveActuator(true);//true for moving actuator, false for not
    }
    linearactuator.moveActuator(false);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Pixy.checkPixyAlign();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }
  

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}