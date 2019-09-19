package com.kai.util;

/**
 * A general-use priority enum that signals the weight of a setting.
 *
 * The use of PriorityLevel.NULL entails that the priority is nonexistent and the action should never happen.
 */
public enum PriorityLevel {
    HIGH,
    MEDIUM,
    LOW,
    NULL
}
