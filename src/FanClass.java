public class FanClass {
    public static final int SLOW = 1 ,  MEDIUM = 2, FAST =3;
    private int speed = SLOW ;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public FanClass(){

    }

    public String toString() {
       if (isOn() == on){
           return "Speed :" +speed +"\n + Color: "  +color +"\n + Radius: "+radius + "\n fan is on";

       }else {
           return "color: "+color+"\n + Radius : "+radius +"\n fan is off";
       }
    }
}
