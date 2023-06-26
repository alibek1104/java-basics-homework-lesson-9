public class Temperature {

    private double value;
    private char scale;

    public Temperature() {
        value = 0;
        scale = 'C';
    }

    public Temperature(double value) {
        this.value = 0;
        scale = 'C';
    }

    public Temperature(char scale) {
        value = 0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getDegreesC() {
        if (scale == 'C') {
            return value;
        } else {
            return 5*(value - 32) / 9;
        }
    }
    public double getDegreesF() {
        if (scale == 'F') {
            return value;
        } else {
            return (9*(value/5) + 32);
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    public char getScale() {
        return scale;
    }

    public void convertToF() {
        if (scale == 'C') {
            value = (9 * (value / 5)) + 32;
            scale = 'F';
        }
    }

    public void convertToC() {
        if (scale == 'F') {
            value = (5*(value - 32) / 9);
            scale = 'C';
        }
    }

    @Override
    public String toString() {
        if (scale == 'C') {
            return "Температура: " + value + ", Температура(в другой единице измерения): " + getDegreesC();
        } else {
            return "Температура: " + value + ", Температура(в другой единице измерения): " + getDegreesF();
        }
    }
}
