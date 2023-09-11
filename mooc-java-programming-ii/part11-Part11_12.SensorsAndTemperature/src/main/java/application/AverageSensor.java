package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream()
                .map(s -> s.isOn())
                .allMatch(s -> s);
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream()
                .forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException("Sensors list is empty");
        } else {
            double  avg = this.sensors.stream()
                    .map(sensor -> sensor.read())
                    .mapToDouble(a -> a)
                    .average()
                    .getAsDouble();
            int average = (int) avg;
            readings.add(average);
            return average;
        }
    }
    public List<Integer> readings(){
        return readings;
    }
}
