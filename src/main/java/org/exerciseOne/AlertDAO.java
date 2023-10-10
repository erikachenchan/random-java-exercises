package org.exerciseOne;

import java.util.UUID;
import java.util.Date;

public interface AlertDAO {
    UUID addAlert(Date time);

    Date getAlert(UUID id);

}
