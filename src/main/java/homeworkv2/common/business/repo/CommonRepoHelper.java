package homeworkv2.common.business.repo;

import homeworkv2.common.business.domain.BaseEntity;
import homeworkv2.common.business.domain.BaseEntity;

public class CommonRepoHelper {
    private CommonRepoHelper() {

    }

    public static Integer findEntityIndexInArrayStorageById(BaseEntity[] data, long entityId) {
        for (int i = 0; i < data.length; i++) {
            if (Long.valueOf(entityId).equals(data[i].getId())) {
                return i;
            }
        }

        return null;
    }
}
