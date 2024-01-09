package Lab6;

public abstract class Aircraft {
    protected int liftingCapacity;
    private double capacity;
    protected double flightRange;
    protected double fuelConsumption;

    public Aircraft(int liftingCapacity, double capacity, double flightRange, double fuelConsumption) {
        this.liftingCapacity = liftingCapacity;
        this.setCapacity(capacity);
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        String clas = this.getClass().toString();
        return clas.substring(clas.indexOf(".")+1)
                + " {cap:" + capacity + ", liftCap:" + liftingCapacity
                + ", range:" + flightRange + ", consume:" + fuelConsumption + "}";
    }

}
