package homeworkv2.carrier.service;

import homeworkv2.carrier.domain.Carrier;

import java.util.Collection;
import java.util.List;

public interface CarrierService {

    List<Carrier> getAll();

    boolean deleteById(Long id);

    void printAll();

    boolean getById(long l);

    void add(Carrier carrier);

    Carrier getById(Long id);

    Collection<?> getByName(String carrier_name);
}
