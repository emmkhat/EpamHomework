package homeworkv2.cargo.domain;

import java.util.Date;

public class FoodCargo extends Cargo {
    private Date expirationDate;
    private int storeTemperature;

    public FoodCargo(Date expirationDate, int storeTemperature) {
        this.expirationDate = expirationDate;
        switch (this.storeTemperature = storeTemperature) {
        }
    }
    @Override
    public CargoType getCargoType() {
        return CargoType.FOOD;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getStoreTemperature() {
        return storeTemperature;
    }

    public void setStoreTemperature(int storeTemperature) {
        this.storeTemperature = storeTemperature;
    }
}
