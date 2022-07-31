package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheit = (double) (temperatureCelsius * 1.8) + 32;
        System.out.println(temperatureFahrenheit);
    }
}
