public class Hangar {

    public static void main(String[] args) {

        Boat yacht = new Boat ("yacht");

        System.out.println("je suis " + yacht.getBrand() + yacht.doStuff());

        Car ferrari = new Car ("Ferrari");

        System.out.println("je suis " + ferrari.getBrand() + ferrari.doStuff());
    }
}
