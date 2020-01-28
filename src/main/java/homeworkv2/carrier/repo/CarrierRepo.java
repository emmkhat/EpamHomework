package homeworkv2.carrier.repo;

import homeworkv2.carrier.domain.Carrier;
import homeworkv2.carrier.domain.Carrier;

import java.util.Iterator;
import java.util.List;

public interface CarrierRepo {
    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);

    boolean deleteById(long id);

    List<Carrier> getAll();

    Iterator<Carrier> iterator();

}
