package org.hospitality.app.util;

import java.util.UUID;

public class GenericHelper {

    public static String generateContact(){
        return UUID.randomUUID().toString();
    }
}
