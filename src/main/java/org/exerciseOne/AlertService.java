package org.exerciseOne;

import java.util.Date;
import java.util.UUID;

public class AlertService {
    private final AlertDAO alertDAO;

    // Public constructor that accepts an AlertDAO object
    public AlertService(AlertDAO alertDAO) {
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        return this.alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alertDAO.getAlert(id);
    }

}
