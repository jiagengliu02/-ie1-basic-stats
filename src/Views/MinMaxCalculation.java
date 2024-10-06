package Views;
// import java.util.Arrays;

public class MinMaxCalculation {
    public static double min(double... numbers) {
        //   int size = numbers.length;
        double min = Double.MAX_VALUE;

        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }
    public static double max(double ... numbers) {
    //   int size = numbers.length;
      double max = Double.MIN_VALUE;

      for (double number: numbers) {
        if (number > max) {
            max = number;
        }
    }

      return max;
    }
}
