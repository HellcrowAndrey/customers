package com.github.customers.entity;

public enum EntityStatus {
    off, on;

    public static EntityStatus choose(boolean isLocked) {
        return isLocked ? off : on;
    }

}
