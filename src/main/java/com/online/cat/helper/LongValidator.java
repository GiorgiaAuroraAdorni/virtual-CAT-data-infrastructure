package com.online.cat.helper;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LongValidator {
    public static Long validate(String value) {
        if (value == null) {
            return null;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
