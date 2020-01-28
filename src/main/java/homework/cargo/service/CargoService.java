package homework.cargo.service;

import homework.cargo.domain.Cargo;

public interface CargoService {
    void add(Cargo cargo);

    Cargo getById(Long id);
}
