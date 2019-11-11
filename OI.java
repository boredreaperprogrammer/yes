import yes.nanobotMap;
public class OI {
public static final int JOYSTICK = 2;

public static final int BUTTON_1 = 1;
public static final int BUTTON_2 = 3;
public static final int BUTTON_3 = 4;
  
static Joystick = new Joystick;

  public final Button autoforwardbutton = new JoystickButton(Joystick BUTTON_1);
  public final Button turnonbutton = new JoystickButton(Joystick BUTTON_2);
  public final Button turncamonbutton = new JoystickButton(Joystick BUTTON_3);


public OI() {
  autoforwardbutton.whenPressed(new AutoForward(3.3,0)):
  turnonbutton.whenPressed (new turnon);
  turncamonbutton.whenpressed(new turncamon);
  
}
public static Joystick = getJoystick() {
  return joystick;
}
}

