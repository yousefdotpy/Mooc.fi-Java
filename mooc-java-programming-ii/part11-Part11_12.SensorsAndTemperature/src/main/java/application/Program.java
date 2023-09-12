package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();


        helsinkiRegion.readings();
    }

}
