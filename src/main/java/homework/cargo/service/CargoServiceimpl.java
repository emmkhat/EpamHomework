package homework.cargo.service;

import homework.cargo.domain.Cargo;

public class CargoServiceimpl implements CargoService {
    @Override
    public void add(Cargo cargo) {
        System.out.println("Begin tpo add cargo");
    }

    @Override
    public Cargo getById(Long id) {
        if (id != null) {

        }
        return null;
    }
}
