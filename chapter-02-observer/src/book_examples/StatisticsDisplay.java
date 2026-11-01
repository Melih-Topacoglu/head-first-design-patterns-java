package book_examples;

public class StatisticsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float minTemp = Float.MAX_VALUE;
    private float maxTemp = -Float.MAX_VALUE;
    private float tempSum = 0;
    private int numReadings = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;
        minTemp = Math.min(minTemp, temperature);
        maxTemp = Math.max(maxTemp, temperature);
        display();
    }

    public void display() {
        System.out.println("Avg/Min/Max Temperatures: " + tempSum / numReadings + " " + minTemp + " " + maxTemp);
    }

}
