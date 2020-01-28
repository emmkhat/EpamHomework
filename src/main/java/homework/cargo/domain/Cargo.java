package homework.cargo.domain;


import homework.transportation.domain.Transportation;

public abstract class Cargo {
protected String name;
protected int weight;
protected Transportation[] transportations;
protected CargoType cargoType;

public Cargo() { cargoType = this.getCargoType(); }

    protected abstract CargoType getCargoType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

}
