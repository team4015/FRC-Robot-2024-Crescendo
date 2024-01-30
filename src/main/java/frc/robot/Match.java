/* ==================================================
 * Authors:
 * FIRST
 * --------------------------------------------------
 * Description:
 * This class simply creates an instance of
 * Robot.java so that the subsystems can be interacted
 * with. It also starts up the scheduler so that commands
 * can be scheduled.
 * ================================================== */

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
//import auto commands

public class Match extends TimedRobot{
  private Robot robot;
  private Command auto;
  private SendableChooser<Command> autoMode;

  @Override
  public void robotInit(){
    //Instantiate our RobotContainer. This will perform all our button bindings and put our auto chooser on the dashboard
    robot = new Robot();
    SmartDashboard.putData(CommandScheduler.getInstance());
    autoMode = new SendableChooser<>();
    //autoMode.setDefaultOption(name, actual auto command);
    SmartDashboard.putData(autoMode);
  }

  @Override
  public void robotPeriodic(){
    //Runs the Scheduler. This is responsible for pulling buttons, adding newly-shceduled
    //commands, running already-schduled commands, removing finished or interrupted commands,
    //and runnign subsystem periodic() methods. This must be called from the robot's periodic
    //block in order for anything in the Command-based framework to work
    CommandScheduler.getInstance().run();
    SmartDashboard.putNumber("Time Remaining:", Timer.getMatchTime());
  }
  @Override
  public void disabledInit(){}

  @Override
  public void disabledPeriodic(){}

  @Override
  public void autonomousInit(){
    SmartDashboard.putData(CommandScheduler.getInstance());
    if(auto!=null)
    {
      auto.schedule();
    }
    //auto = autoMode.getSelected();
  }
  @Override
  public void autonomousPeriodic(){}
  @Override
  public void teleopInit(){
    SmartDashboard.putData(CommandScheduler.getInstance());
    if(auto!=null){
      auto.cancel();
    }
    SmartDashboard.putString("Robot Mode:", "Teleop");
  }
  @Override
  public void teleopPeriodic(){}
  @Override
  public void testInit(){
    CommandScheduler.getInstance().cancelAll();
  }
  @Override
  public void testPeriodic() {}
  @Override
  public void simulationInit(){}
  @Override
  public void simulationPeriodic(){}
}

