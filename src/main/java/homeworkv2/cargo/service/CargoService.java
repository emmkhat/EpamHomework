package homeworkv2.cargo.service;

import homeworkv2.cargo.domain.Cargo;
import homeworkv2.cargo.domain.Cargo;

import java.util.List;

public interface CargoService {
    void add(Cargo cargo);

    Cargo getById(Long id);
    List<Cargo> getAll();

    List<Cargo> getByName(String name);

    void printAll();

}
