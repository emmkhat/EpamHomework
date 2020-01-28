package homework.common.business.repo;

import homework.cargo.domain.Cargo;

public interface CommonRepo {
    Cargo[] deleteById(long id);
}
