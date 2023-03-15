public class Mazda extends Car {
    public Mazda(String name,int hp, int maxSpeed, double engine) {
        super(name,hp, maxSpeed, engine);
    }
@Override
    public String MyCar(){
    var a ="my car "+getName()+" Horse "+getHp()+" Max speed "+getMaxSpeed()+" Engine "+getEngine();
    return a;
}
@Override
    public double StageOne(){
      return   getEngine()*1.1;
}
@Override
    public String Colour(){
        return "RED";
}
}
