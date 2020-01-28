package homeworkv2.transportation.domain;

import homeworkv2.cargo.domain.Cargo;
import homeworkv2.carrier.domain.Carrier;
import homeworkv2.common.business.domain.BaseEntity;

import java.util.Date;

public class Transportation extends BaseEntity {
    private Cargo cargo;
    private Carrier carrier;
    private String description;
    private String billTo;
    private Date transportationBeginDate;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public Date getTransportationBeginDate() {
        return transportationBeginDate;
    }

    public void setTransportationBeginDate(Date transportationBeginDate) {
        this.transportationBeginDate = transportationBeginDate;

    }
}
