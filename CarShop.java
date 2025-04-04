public class CarShop {
    public static void main(String[] args) {
         // basic real car
        Car realCar = new RealCar();
        realCar.assemble();
        // real sports car
        Car sportsCar = new SportsDecorator(new RealCar());
        sportsCar.assemble();
        // real sports car with luxury interior
        Car sportsLuxuryCar = new SportsDecorator(new LuxuryDecorator(new RealCar()));
        sportsLuxuryCar.assemble();
        // real painted car with luxury interior and sports mode
        Car sportsLuxuryPaintedCar = new SportsDecorator(new LuxuryDecorator(new 
        PaintDecorator(new RealCar())));
        sportsLuxuryPaintedCar.assemble();
        // real painted luxury car
        Car luxuryPaintedCar = new LuxuryDecorator(new PaintDecorator(new RealCar()));
        luxuryPaintedCar.assemble();
        // painted toy car
        Car paintedToyCar = new PaintDecorator(new ToyCar());
        paintedToyCar.assemble();
    }
}

