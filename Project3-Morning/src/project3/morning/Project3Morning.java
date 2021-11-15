package project3.morning;

public class Project3Morning {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(null, "", "", 0, 0);
        try {
            vehicle.addGas(10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

}
