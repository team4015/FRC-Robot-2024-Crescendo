package frc.robot.commands.driver;

import frc.robot.Robot;

import edu.wpi.first.wpilibj2.command.Command;

public class LowSpeed extends Command
{
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private Robot robot;
  
  // CONSTANTS //
  
  
  
  // VARIABLES //
  
  
  
  public LowSpeed(Robot robot)
  {
    this.robot = robot;
    
    // Use addRequirements() here to declare subsystem dependencies.
    
    //addRequirements(robot.mySubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize()
  {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute()
  {
    robot.driver.useLowSpeed();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted)
  {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished()
  {
    return true;
  }
}