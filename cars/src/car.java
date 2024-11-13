public class car {
    private String model;
    private String brand;
    private int maxSpeed;
    private engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public engine getEngine() {
        return engine;
    }

    public void setEngine(engine engine) {
        this.engine = engine;
    }

    public car(String model, String brand, int maxSpeed, engine engine) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + this.model + '\'' +
                ", brand='" + this.brand + '\'' +
                ", maxSpeed=" + this.maxSpeed +
                ", engine=" + this.engine +
                '}';
    }

}
