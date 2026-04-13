public class QunatityMeasurementApp {
    public class QuantityMeasurementApp {

        // 🔹 Feet Class
        static class Feet {
            private double value;

            public Feet(double value) {
                if (Double.isNaN(value)) {
                    throw new IllegalArgumentException("Invalid Feet value");
                }
                this.value = value;
            }

            public boolean equals(Feet other) {
                if (other == null) return false;
                return Double.compare(this.value, other.value) == 0;
            }
        }

        // 🔹 Inches Class
        static class Inches {
            private double value;

            public Inches(double value) {
                if (Double.isNaN(value)) {
                    throw new IllegalArgumentException("Invalid Inches value");
                }
                this.value = value;
            }

            public boolean equals(Inches other) {
                if (other == null) return false;
                return Double.compare(this.value, other.value) == 0;
            }
        }

        // 🔹 Static methods (as per UC2 flow)
        public static boolean compareFeet(double v1, double v2) {
            Feet f1 = new Feet(v1);
            Feet f2 = new Feet(v2);
            return f1.equals(f2);
        }

        public static boolean compareInches(double v1, double v2) {
            Inches i1 = new Inches(v1);
            Inches i2 = new Inches(v2);
            return i1.equals(i2);
        }

        // 🔹 Main Method
        public static void main(String[] args) {

            // Hardcoded values (as per UC2)
            double feet1 = 5.0;
            double feet2 = 5.0;

            double inch1 = 12.0;
            double inch2 = 12.0;

            boolean feetResult = compareFeet(feet1, feet2);
            boolean inchResult = compareInches(inch1, inch2);

            System.out.println("Feet Equality: " + feetResult);
            System.out.println("Inches Equality: " + inchResult);
        }
    }
}
