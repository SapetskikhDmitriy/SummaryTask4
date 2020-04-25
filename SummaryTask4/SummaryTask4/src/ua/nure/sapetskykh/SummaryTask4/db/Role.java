package ua.nure.sapetskykh.SummaryTask4.db;

import ua.nure.sapetskykh.SummaryTask4.db.entity.User;

/**
 * Role entity.
 *
 *
 */
public enum  Role {
    ADMIN, CLIENT;

    public static Role getRole(User user) {
        int roleId = user.getRoleId();
        return Role.values()[roleId - 1];
    }

    public String getName() {
        return name().toLowerCase();
    }
}
