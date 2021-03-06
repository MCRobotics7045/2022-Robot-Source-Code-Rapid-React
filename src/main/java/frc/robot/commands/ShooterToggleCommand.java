/*----------------------------------------------------------------------------*/
/* Copyright (c) 2022 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.subsystems.ShooterPID;
import frc.robot.subsystems.Shooter;
//Toggle SHooter Motor ON or OFF
public class ShooterToggleCommand extends CommandBase {
  //private final ShooterPID m_shooter;
  private final Shooter m_shooter;

  // Creates a new ShooterCommand.

  //public ShooterToggleCommand(ShooterPID shooter) {
  public ShooterToggleCommand(Shooter shooter) {
    super();
    m_shooter = shooter;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // System.out.println("FIntake-Init");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_shooter.isRunning()) {

      m_shooter.disable();

      if (Constants.kDebug) {
        System.out.println("Shooter Toggle CMD - Exec - stop");
      }

    } else {

      m_shooter.enable();

      if (Constants.kDebug) {
        System.out.println("Shooter Toggle  CMD - Exec - start");
      }

    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // System.out.println("FIntake-Exec-END");
  }

  // Returns true when the command should end. True to run once.
  @Override
  public boolean isFinished() {
    return true;
  }
}
