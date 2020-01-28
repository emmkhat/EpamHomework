package homeworkv2.cargo.repo;

import homework.cargo.domain.Cargo;
import homework.cargo.repo.impl.CargoDefaultRepoImpl;
import homework.common.business.repo.CommonRepo;
import homeworkv2.cargo.domain.Cargo;

import java.util.List;

public interface CargoRepo extends CommonRepo {
    Cargo[] add(Cargo cargo);

    Cargo[] add(Cargo cargo);

    Cargo getById(long id);

    Cargo[] getByName(String name);

    boolean deleteById(long id);

    List<Cargo> getAll();
}
