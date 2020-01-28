package homework.cargo.repo.impl;

import homework.cargo.domain.Cargo;
import homework.cargo.repo.CargoRepo;
import java.util.Objects;

  public class CargoDefaultRepoImpl implements CargoRepo {
    private static final Cargo[] EMPTY_CARGO_ARRAY = new Cargo[0];

      @Override
      public void add(Cargo cargo) {

      }

      @Override
      public Cargo[] deleteById(long id) {
          return new Cargo[0];
      }
  }
