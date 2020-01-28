package homework.carrier.repo;

import homework.carrier.domain.Carrier;

public interface CarrierRepo {
    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);
}
