package homeworkv2.cargo.repo.impl;

import homeworkv2.cargo.domain.Cargo;
import homeworkv2.cargo.repo.CargoRepo;

import java.util.List;

public abstract class CargoArrayRepoImpl implements CargoRepo {
    @Override
    public Cargo[] add(Cargo cargo) {

        return cargo;
    }

    @Override
    public Cargo getById(long id) {
        return null;
    }

    @Override
    public Cargo[] getByName(String name) {
        return new Cargo[0];
    }

    @Override
    public List<Cargo> getAll() {
        return null;
    }
}
