package ua.nure.sapetskykh.SummaryTask4.db;

import ua.nure.sapetskykh.SummaryTask4.db.entity.Order;

/**
 * Status entity.
 *
 *
 */
public enum Status {
    UNPAID, PAID;
    public static Status getStatus(Order order) {
        int statusId = order.getStatusId();
        return Status.values()[statusId - 1];
    }
    public String getName() {
        return name().toLowerCase();
    }
}
