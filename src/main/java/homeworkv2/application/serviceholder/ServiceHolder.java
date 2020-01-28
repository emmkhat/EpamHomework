package homeworkv2.application.serviceholder;

import homeworkv2.cargo.repo.impl.CargoArrayRepoImpl;
import homeworkv2.cargo.repo.impl.CargoCollectionRepoImpl;
import homeworkv2.cargo.service.CargoService;
import homeworkv2.carrier.repo.impl.CarrierArrayRepoImpl;
import homeworkv2.carrier.repo.impl.CarrierCollectionRepoImpl;
import homeworkv2.carrier.service.CarrierService;
import homeworkv2.carrier.service.CarrierServiceImpl;
import homeworkv2.transportation.repo.impl.TransportationArrayRepoImpl;
import homeworkv2.transportation.repo.impl.TransportationCollectionRepoImpl;
import homeworkv2.transportation.service.TransportationService;
import homeworkv2.transportation.service.TransportationServiceImpl;

public final class ServiceHolder {
    private static ServiceHolder instance = null;

    private final CarrierService carrierService;
    private final CargoService cargoService;
    private final TransportationService transportationService;
    private CarrierService carrierService1
            ;
    private CargoService cargoService1
            ;
    private TransportationService transportationService1
            ;

    private ServiceHolder(StorageType storageType) {
        SimpleServiceHolder initedServiceHolder = getInitedServiceHolder(storageType);
        cargoService = initedServiceHolder.cargoService;
        carrierService = initedServiceHolder.carrierService;
        transportationService = initedServiceHolder.transportationService;
    }

    public static void initServiceHolder(StorageType storageType) {
        ServiceHolder.instance = new ServiceHolder(storageType);
    }

    public static ServiceHolder getInstance() {
        return instance;
    }

    private static class SimpleServiceHolder {

        private final CarrierService carrierService;
        private final CargoService cargoService;
        private final TransportationService transportationService;

        public SimpleServiceHolder(
                CarrierService carrierService,
                CargoService cargoService,
                TransportationService transportationService) {
            this.carrierService = carrierService;
            this.cargoService = cargoService;
            this.transportationService = transportationService;
        }

        public SimpleServiceHolder(CarrierServiceImpl carrierService, CargoServiceImpl cargoService, TransportationServiceImpl transportationService, CarrierService carrierService1, CargoService cargoService1, TransportationService transportationService1) {

            this.carrierService = carrierService1;
            this.cargoService = cargoService1;
            this.transportationService = transportationService1;
        }
    }

    private SimpleServiceHolder getInitedServiceHolder(StorageType storageType) {
        switch (storageType) {

            case ARRAY: {
                return new SimpleServiceHolder(
                        new CarrierServiceImpl(new CarrierArrayRepoImpl()),
                        new CargoServiceImpl(new CargoArrayRepoImpl() {
                            @Override
                            public boolean deleteById(long id) {


                                return false;
                            }
                        }),
                        new TransportationServiceImpl(new TransportationArrayRepoImpl()), carrierService1, cargoService1, transportationService1);
            }

            default: {
                return new SimpleServiceHolder(
                        new CarrierServiceImpl(new CarrierCollectionRepoImpl()),
                        new CargoServiceImpl(new CargoCollectionRepoImpl()),
                        new TransportationServiceImpl(new TransportationCollectionRepoImpl()), carrierService1, cargoService1, transportationService1);
            }
        }
    }

    public CarrierService getCarrierService() {
        return carrierService;
    }

    public CargoService getCargoService() {
        return cargoService;
    }

    public TransportationService getTransportationService() {
        return transportationService;
    }

    private class CargoServiceImpl {
        public CargoServiceImpl(CargoCollectionRepoImpl cargoCollectionRepo) {
        }

        public CargoServiceImpl(CargoArrayRepoImpl cargoArrayRepo) {

        }
    }
}



