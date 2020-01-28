package homeworkv2.transportation.repo.impl;

import homeworkv2.cargo.domain.Cargo;
import homeworkv2.transportation.domain.Transportation;
import homeworkv2.transportation.repo.TransportationRepo;

import java.util.List;

public class TransportationCollectionRepoImpl implements TransportationRepo {
    @Override
    public void add(Transportation transportation) {

    }

    @Override
    public Transportation getById(long id) {
        return null;
    }

    @Override
    public List<Transportation> getAll() {
        return null;
    }

    @Override
    public Cargo[] deleteById(long id) {
        return new Cargo[0];
    }
}
