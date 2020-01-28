package homeworkv2.application;

import homeworkv2.application.serviceholder.ServiceHolder;
import homeworkv2.application.serviceholder.StorageType;
import homeworkv2.cargo.service.CargoService;
import homeworkv2.carrier.service.CarrierService;
import homeworkv2.common.solutions.utils.CollectionUtils;
import homeworkv2.storage.initor.InMemoryStorageInitor;
import homeworkv2.storage.initor.StorageInitor;
import homeworkv2.transportation.service.TransportationService;

public class Application {

        private static final String SEPARATOR = "--------------";
        private static CargoService cargoService;
        private static CarrierService carrierService;
        private static TransportationService transportationService;

        public static void main(String[] args) {
            ServiceHolder.initServiceHolder(StorageType.COLLECTION);
            cargoService = ServiceHolder.getInstance().getCargoService();
            carrierService = ServiceHolder.getInstance().getCarrierService();
            transportationService = ServiceHolder.getInstance().getTransportationService();

            StorageInitor storageInitor = (StorageInitor) new InMemoryStorageInitor();
            storageInitor.initStorage();

            printStorageData();
            doSearchOperations();
        }

        private static void printStorageData() {
            System.out.println("ALL CARGOS");
            cargoService.printAll();
            printSeparator();

            System.out.println("ALL CARRIERS");
            carrierService.printAll();
            printSeparator();

            System.out.println("ALL TRANSPOORTATIONS");
            transportationService.printAll();
            printSeparator();
        }

        private static void doSearchOperations() {
            System.out.println("SEARCH CARGO BY ID = 1");
            System.out.println(cargoService.getById(1L));
            printSeparator();

            System.out.println("SEARCH CARRIER BY ID = 8");
            System.out.println(carrierService.getById(8L));
            printSeparator();

            System.out.println("SEARCH CARGOES BY NAME = 'Clothers_Name_1'");
            CollectionUtils.printCollection(cargoService.getByName("Clothers_Name_1"));
            printSeparator();

            System.out.println("SEARCH CARRIERS BY NAME = 'Carrier_Name'");
            CollectionUtils.printCollection(carrierService.getByName("Carrier_Name"));
        }

        private static void printSeparator() {
            System.out.println(SEPARATOR);
        }

    }



