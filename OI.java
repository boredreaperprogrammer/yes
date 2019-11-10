import yes.nanobotMap;
public class OI {
public static final int JOYSTICK = 2;

public static final int BUTTON_1 = 1;
public static final int BUTTON_2 = 3;
  
static Joystick = new Joystick;

  public final Button autoforwardbutton = new JoystickButton(Joystick BUTTON_1);
  public final Button turnonbutton = new JoystickButton(Joystick BUTTON_2);


public OI() {
  autoforwardbutton.whenPressed(new AutoForward(3.3,0)):
  turnonbutton.whenPressed (new turnon);
}
public static Joystick = getJoystick() {
  return joystick;
}
}

