package homework.cargo.repo;

import homework.cargo.domain.Cargo;
import homework.cargo.repo.impl.CargoDefaultRepoImpl;
import homework.common.business.repo.CommonRepo;

public interface CargoRepo extends CommonRepo {
    void add(Cargo cargo);
    Cargo getById(long id);

    Cargo[] getByName(String name);
}
