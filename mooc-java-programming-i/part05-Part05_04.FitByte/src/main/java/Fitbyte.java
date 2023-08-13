public class Fitbyte {
    private int age;
    private int restingHeartRate;
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    public double getMaximumHeartRate(int age){
        return  206.3 - (0.711 * age);
    }
    public double targetHeartRate(double percentageOfMaximum){
        return  (getMaximumHeartRate(age) - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
