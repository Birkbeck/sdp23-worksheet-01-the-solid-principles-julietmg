public class WeatherTracker {
    String currentConditions;
    AlertGeneratorInterface sunnyGenerator;
    AlertGeneratorInterface rainyGenerator;


    public WeatherTracker(AlertGeneratorInterface sunnyGenerator, AlertGeneratorInterface rainyGenerator) {
        this.sunnyGenerator = sunnyGenerator;
        this.rainyGenerator = rainyGenerator;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = rainyGenerator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = sunnyGenerator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
