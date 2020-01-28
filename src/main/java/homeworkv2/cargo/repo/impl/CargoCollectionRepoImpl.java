package homeworkv2.cargo.repo.impl;

import homeworkv2.cargo.domain.Cargo;
import homeworkv2.cargo.repo.CargoRepo;
import homeworkv2.common.solutions.utils.ArrayUtils;
import homeworkv2.storage.IdGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static homeworkv2.storage.Storage.cargoArray;
import static homeworkv2.storage.Storage.cargoIndex;

public class CargoCollectionRepoImpl implements CargoRepo {

    private static final Cargo[] EMPTY_CARGO_ARRAY = new Cargo[0];

    @Override
    public Cargo[] add(Cargo cargo) {
        if (cargoIndex == cargoArray.length) {
            Cargo[] newCargos = new Cargo[cargoArray.length * 2];
            ArrayUtils.copyArray(cargoArray, newCargos);
            cargoArray = newCargos;
        }

        cargo.setId(IdGenerator.generateId());
        cargoArray[cargoIndex] = cargo;
        cargoIndex++;
        return new Cargo[0];
    }

    @Override
    public Cargo getById(long id) {
        return null;
    }


    @Override
    public Cargo[] getByName(String name) {
        Cargo[] searchResultWithNullableElems = getByNameIncludingNullElements(name);
        if (searchResultWithNullableElems == null
                || searchResultWithNullableElems.length == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            return excludeNullableElementsFromArray(searchResultWithNullableElems);
        }
    }

    private Cargo[] getByNameIncludingNullElements(String name) {
        Cargo[] result = new Cargo[cargoArray.length];

        int curIndex = 0;
        for (Cargo carrier : cargoArray) {
            if (carrier != null && Objects.equals(carrier.getName(), name)) {
                result[curIndex++] = carrier;
            }
        }

        return result;
    }

    /**
     * [A,B,C, null, null] [A,B,C, null, null, null, D] [A,B,C]
     *
     * new String[3]
     */
    private Cargo[] excludeNullableElementsFromArray(Cargo[] cargos) {
        int sizeOfArrWithNotNullElems = 0;

        for (Cargo cargo : cargos) {
            if (cargo != null) {
                sizeOfArrWithNotNullElems++;
            }
        }

        if (sizeOfArrWithNotNullElems == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            Cargo[] result = new Cargo[sizeOfArrWithNotNullElems];
            int index = 0;
            for (Cargo cargo : cargos) {
                if (cargo != null) {
                    result[index++] = cargo;
                }
            }

            return result;
        }
    }

    @Override
    public boolean deleteById(long id) {
        Integer indexToDelete = findEntityIndexInArrayStorageById(cargoArray, id);

        if (indexToDelete == null) {
            return false;
        } else {
            ArrayUtils.removeElement(cargoArray, indexToDelete);
            return true;
        }
    }

    private Integer findEntityIndexInArrayStorageById(Cargo[] cargoArray, long id) {


        return null;
    }

    @Override
    public List<Cargo> getAll() {
        return Arrays.asList(cargoArray);
    }
}
