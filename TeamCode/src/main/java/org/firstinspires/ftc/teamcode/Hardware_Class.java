package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware_Class {
    public DcMotorEx lfront = null;
    public DcMotorEx rfront = null;
    public DcMotorEx lback = null;
    public DcMotorEx rback = null;

    public Servo intake = null;
    public CRServo contServo = null;

    HardwareMap access = null;


    public Hardware_Class(){

    }
}
