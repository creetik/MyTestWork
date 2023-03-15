public class Bmw extends Car{

    public Bmw(String name, int hp, int maxSpeed, double engine) {
        super(name,hp, maxSpeed, engine);
    }
@Override
   public String MyCar(){
    var a ="my car IS FASTERSSS CARRRRR "+getName()+" Horse 1 MILOIN HORSE "+getHp()+" Max speed 1 MILONE SPEED "+getMaxSpeed()+" Engine 28 LITRES "+getEngine();
    return a;
}
@Override
public double StageOne(){
        return getEngine()*1.4;
}
}
