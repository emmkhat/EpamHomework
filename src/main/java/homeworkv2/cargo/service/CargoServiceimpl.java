package homeworkv2.cargo.service;

import homeworkv2.cargo.domain.Cargo;

import java.util.List;

   public abstract class CargoServiceimpl implements CargoService {
    private homeworkv2.cargo.service.CargoService cargoRepo;
    private Cargo cargo;

    @Override
    public void add(Cargo cargo) {
        System.out.println("Begin tpo add cargo");
    }

    @Override
    public Cargo getById(Long id) {
        {
            cargoRepo.add(cargo);
        }
        if (id != null) {
            return cargoRepo.getById(id);
        }
        return null;
    }

    @Override
    public List<Cargo> getAll() {
        return cargoRepo.getAll();


    }
}
