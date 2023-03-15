public class Vw extends Car{
    public Vw(String name,int hp, int maxSpeed, double engine) {
        super(name,hp, maxSpeed, engine);
    }
    @Override
    public String MyCar() {
        var a = "my car PASSSSAT " + getName() + " Horse TURBO VAAAAGGGG  STAGE 28 " + getHp() + " Max speed " + getMaxSpeed() + " Engine " + getEngine();
        return a;
    }
@Override
    public double StageOne(){
        return getEngine()*1.5;
}
}
