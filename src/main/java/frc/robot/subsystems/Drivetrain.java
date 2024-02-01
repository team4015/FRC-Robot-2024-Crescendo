package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
//import edu.wpi.first.wpilibj.BuiltInAccelerometer;
//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.math.util.Units;
//import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends SubsystemBase {
    private final Talon rightMotor;
    private final Talon leftMotor;
    private DifferentialDrive drive;
    //private BuiltInAccelerometer accel;
    //private ADXRS450_Gyro gyro;
    //private Timer timer;
    //private double currentAngle;
    //private double currentGyroAngle;
    //private double offSetAngle;
    //private double timeElapsed;

    public static final int RIGHT_MOTOR = 0;
    public static final int LEFT_MOTOR = 1;

    public static final double WHEEL_RADIUS = Units.inchesToMeters(6)/2;
    //public static double distanceFromStartingPos = 0;
    public final static double GEAR_RATIO = 1/10.71;
    //public final static double driveStraightCorrectTime = 0.001;

    
    public Drivetrain(){
        rightMotor = new Talon(RIGHT_MOTOR);
        leftMotor = new Talon(LEFT_MOTOR);
        leftMotor.setInverted(true);
        drive = new DifferentialDrive(leftMotor,rightMotor);
    }
    public void moveMotors(double speed, double turn){
        drive.arcadeDrive(speed,turn);
    }
    public void stopMotors(){
        drive.stopMotor();
    }
}
