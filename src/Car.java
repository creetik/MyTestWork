public class Car {
    private String Name;
    private int Hp;
    private int MaxSpeed;
    private double Engine;

    public Car(String name , int hp, int maxSpeed, double engine) {
        this.Hp = hp;
        this.MaxSpeed = maxSpeed;
        this.Engine = engine;
        this.Name=name;

    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public double getEngine() {
        return Engine;
    }

    public void setEngine(double engine) {
        Engine = engine;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

   public String MyCar(){
        var a ="my car "+getName()+" Horse "+getHp()+" Max speed "+getMaxSpeed()+" Engine "+getEngine();

return a;
    }
public double StageOne(){
        double StageOne=1.2;
        return getEngine()*StageOne;
}
public String Colour(){
        return "Grey";
}
}
