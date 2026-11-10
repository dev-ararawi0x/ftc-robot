package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "FTC Learning Template", group = "Tutorial")
public class HelloWorld extends OpMode {

    // ==========================================
    // 1. General Variables & Objects
    // ==========================================

    // TODO: In the future, we will declare motors here, for example:
    // private DcMotor leftDrive;

    // TODO: In the future, we will declare I2C sensors here, for example:
    // private DistanceSensor distanceSensor;

    @Override
    public void init() {
        // ==========================================
        // 2. Initialization Phase (Runs once when initialized)
        // ==========================================

        // Prevent screen from clearing automatically so retained messages stay visible
        telemetry.setAutoClear(false);

        // Set a persistent header message that stays at the top of the screen
        telemetry.addData("System Status", "Initializing and preparing...").setRetained(true);
        telemetry.update();

        // Log an event to record that the system started successfully
        telemetry.log().add("System booted up, waiting for Start button");
    }

    @Override
    public void start() {
        // ==========================================
        // 3. Start Phase (Runs once immediately when Start is pressed)
        // ==========================================
        telemetry.log().add("Match started!");
    }

    @Override
    public void loop() {
        // ==========================================
        // 4. Continuous Loop Phase (Repeats hundreds of times per second)
        // ==========================================

        // TODO: In the future, we will read Gamepad inputs here for movement control
        // float drive = -gamepad1.left_stick_y;

        // TODO: In the future, we will read sensor values here, e.g., obstacle distance
        // double distance = distanceSensor.getDistance(DistanceUnit.CM);

        // Display dynamic data that updates every loop cycle
        telemetry.addData("Loop Status", "Robot running smoothly...");

        // Example of printing a formatted decimal number (to 2 decimal places to prevent clutter)
        double mockSpeed = 0.8452;
        telemetry.addData("Target Speed", "%.2f", mockSpeed);

        // Send and update data to appear on the Driver Hub screen
        telemetry.update();
    }

    @Override
    public void stop() {
        // ==========================================
        // 5. Stop Phase (Runs once when the OpMode is shut down)
        // ==========================================
        telemetry.log().add("Robot stopped successfully.");
    }
}