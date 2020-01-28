package homeworkv2.carrier.service;

import homeworkv2.carrier.domain.Carrier;
import homeworkv2.carrier.repo.CarrierRepo;
import homeworkv2.carrier.repo.impl.CarrierArrayRepoImpl;
import homeworkv2.carrier.repo.impl.CarrierCollectionRepoImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarrierServiceImpl implements CarrierService {

    private CarrierRepo carrierRepo;

    public CarrierServiceImpl(
            CarrierRepo carrierRepo) {
        this.carrierRepo = carrierRepo;
    }

    @Override
    public void add(Carrier carrier) {
        carrierRepo.add(carrier);
    }

    @Override
    public Carrier getById(Long id) {
        if (id != null) {
            return carrierRepo.getById(id);
        }
        return null;
    }

    @Override
    public List<Carrier> getByName(String name) {
        Carrier[] found = carrierRepo.getByName(name);
        return (found == null || found.length == 0) ? Collections.emptyList() : Arrays.asList(found);

    }

    @Override
    public List<Carrier> getAll() {
        return carrierRepo.getAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return carrierRepo.deleteById(id);
    }

    @Override
    public void printAll() {
        List<Carrier> carriers = carrierRepo.getAll();
        for (Carrier carrier : carriers) {
            System.out.println(carrier);
        }
    }

    @Override
    public boolean getById(long l) {
        return false;
    }
}

