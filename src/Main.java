public class Main {
    public static void main(String[] args) {

        Car mazda6 =new Mazda("6,GJ",165,210,2.0);
        Car bmw5 = new Bmw("520",170,215,3.0);
        Car VwPassat = new Vw("Passat",190,230,2.0);
        System.out.println(VwPassat.MyCar());
        System.out.println(bmw5.StageOne());
        System.out.println(mazda6.StageOne());
        System.out.println(VwPassat.StageOne());
        System.out.println(mazda6.Colour());

    }

}