import java.util.Random;

public class WeatherMan {
    private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = this.random.nextDouble();

        // There is 0.1 probability it rains (10%)
        if (probability <= 0.1) {
            return "It rains";
        // There is 0.3 probability it snows (30%)
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "It snows";
        // There is 0.6 probability the sun shines (60%)
        } else { // rest, 1.0 - 0.4 = 0.6
            return "The sun shines";
        }
    }

    public int makeAForecast() {
        return (int)(4 * this.random.nextGaussian() - 3);
    }
}
