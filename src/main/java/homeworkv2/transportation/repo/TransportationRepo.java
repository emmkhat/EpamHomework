package homeworkv2.transportation.repo;

import homeworkv2.common.business.repo.CommonRepo;
import homeworkv2.transportation.domain.Transportation;

import java.util.List;

public interface TransportationRepo extends CommonRepo {
 void add(Transportation transportation);
 Transportation getById(long id);
 List<Transportation> getAll();

}


