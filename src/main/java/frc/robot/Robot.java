/* ==================================================
 * Authors: 
 * FIRST
 * --------------------------------------------------
 * Description:
 * This class that contains all the necessary things
 * to make a robot instance. This class will make
 * instances of each subsystem, initialize a startup
 * function for each subsystem, and then set a default
 * command for each subsystem to use. It will also
 * instantiate Driver.java to allow driver input via
 * joysticks to control the robot.
 * ================================================== */
package frc.robot;

//import subsystems here
//import frc.robot.commands.ExampleSubsytem.*;
import frc.robot.commands.drivetrain.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.controls.*;
import frc.robot.subsystems.*;

public class Robot {
  public Operator operator;
  public Driver driver;
  //CONSTANTS//

  //VARIABLES//

  //SUBSYSTEMS//
  //public ExampleSubsystem examplesubsystem;

  public Drivetrain drivetrain;

  //declare all subsystems here

  //CONSTRUCTORS//

  public Robot()
  {
    //instantiate all subsystems
    //examplesubsystem = new ExampleSubsystem();
    drivetrain = new Drivetrain();

    //instantiate Controls
    operator = new Operator(this);
    driver = new Driver(this);

    //configure the trigger binding
    //set default commands for subsystems;
    initialize();
    setDefaultCommands();
  }
  private void initialize(){
    //initial methods
    //examplesubsystem.initialMethod();
    drivetrain.stopMotors();
  }
  private void setDefaultCommands(){
    drivetrain.setDefaultCommand(new Drive(this));
    //examplesubssytem.setDefaultCommand(new ExampleSubsystem(this));
  }
  //METHODS//
  //additional helper methods
}