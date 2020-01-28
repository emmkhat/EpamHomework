package homeworkv2.cargo.domain;


import homeworkv2.transportation.domain.Transportation;

import java.util.Arrays;

public abstract class Cargo {
    protected String name;
    protected int weight;
    protected Transportation[] transportations;
    protected CargoType cargoType;
    private int id;

    public Cargo() {
        cargoType = this.getCargoType();
    }

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

    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                ", transportations=" + Arrays.toString(transportations) +
                '}';
    }

    public void setId(Long generateId) {

    }

    public void getId() {


    }
}
