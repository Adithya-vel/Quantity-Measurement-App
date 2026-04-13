public class QunatityMeasurementApp {
    public class QuantityMeasurementApp {

        // 🔹 Enum for Units (conversion to base: FEET)
        enum Unit {
            FEET(1.0),
            INCH(1.0 / 12.0); // 1 inch = 1/12 feet

            private final double toFeet;

            Unit(double toFeet) {
                this.toFeet = toFeet;
            }

            public double toBase(double value) {
                return value * toFeet;
            }
        }

        // 🔹 Generic Quantity Class (DRY)
        static class Quantity {
            private double value;
            private Unit unit;

            public Quantity(double value, Unit unit) {
                if (Double.isNaN(value)) {
                    throw new IllegalArgumentException("Invalid value");
                }
                if (unit == null) {
                    throw new IllegalArgumentException("Invalid unit");
                }
                this.value = value;
                this.unit = unit;
            }

            public boolean equals(Quantity other) {
                if (other == null) return false;

                // Convert both to base unit (FEET)
                double thisValue = this.unit.toBase(this.value);
                double otherValue = other.unit.toBase(other.value);

                return Double.compare(thisValue, otherValue) == 0;
            }
        }

        // 🔹 Main Method
        public static void main(String[] args) {

            // Inputs with units
            Quantity q1 = new Quantity(1, Unit.FEET);
            Quantity q2 = new Quantity(12, Unit.INCH);

            boolean result = q1.equals(q2);

            System.out.println("Equality Result: " + result);
        }
    }
}
