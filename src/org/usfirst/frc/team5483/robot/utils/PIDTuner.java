package org.usfirst.frc.team5483.robot.utils;

public class PIDTuner {
	
	private double accumError = 0;
	private double lastError = 0;
	
	public double pidTuned(double setpoint, double current, 
			double Kp, double Ki, double Kd) {
		
		double error = setpoint - current;
		
		double P = Kp * error;
		accumError += error;
		double I = Ki * accumError;
		double errorDiff = error - lastError;
		lastError = error;
		double D = Kd * errorDiff;
		
		return P + I + D;
	}
}
