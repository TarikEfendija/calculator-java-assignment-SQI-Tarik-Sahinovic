import java.util.ArrayList;
import java.util.List;


public class TestCalculator {
    
    public static void main(String[] args) {
        
        float expected = 4.0f;

        List<Float> numbers = new ArrayList<>();
        numbers.add(2f);
        numbers.add(2f);
        List<String> operations = new ArrayList<>();
        operations.add("+");

        Calculator.Calculate(numbers, operations);
        float result = numbers.get(0);

        if (Math.abs(result - expected) < 0.001f) {
            System.out.println("Test PASS");
        } else {
            System.out.println("Test FAILURE");
        }
    }
}
