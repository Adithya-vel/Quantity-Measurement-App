public class QunatityMeasurementApp {
    public class QuantityMeasurementApp {

        // Method to check equality of two feet values
        public static boolean isEqual(double value1, double value2) {

            // Validation (numeric check)
            if (Double.isNaN(value1) || Double.isNaN(value2)) {
                throw new IllegalArgumentException("Invalid input: Not a number");
            }

            // Equality check
            return Double.compare(value1, value2) == 0;
        }

        public static void main(String[] args) {

            // UC1 Inputs (Feet)
            double feet1 = 5.0;
            double feet2 = 5.0;

            boolean result = isEqual(feet1, feet2);

            System.out.println("Feet Equality: " + result);
        }
    }
}
