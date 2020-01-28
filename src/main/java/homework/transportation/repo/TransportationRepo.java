package homework.transportation.repo;

import homework.common.business.repo.CommonRepo;
import homework.transportation.domain.Transportation;

public interface TransportationRepo extends CommonRepo {
 void add(Transportation transportation);
 Transportation getById(long id);
}


