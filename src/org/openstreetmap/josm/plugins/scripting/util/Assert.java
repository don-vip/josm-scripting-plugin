package org.openstreetmap.josm.plugins.scripting.util;

import java.text.MessageFormat;

public class Assert {

    public static void assertArgNotNull(Object arg, String name){
        if (arg == null){
            throw new IllegalArgumentException(
                    MessageFormat.format("parameter ''{0}'' must not be null", name)
            );
        }
    }

    public static void assertArgNotNull(Object arg){
        assertArgNotNull(arg, arg == null? null: arg.getClass().getSimpleName());
    }

    public static void assertArg(boolean condition, String message, Object...objs) {
        if (!condition){
            throw new IllegalArgumentException(
                    MessageFormat.format(message, objs)
            );
        }
    }

    public static void assertNotNull(Object o, String message, Object...objs) {
        if (o == null){
            throw new AssertionError(
                    MessageFormat.format(message,objs)
            );
        }
    }

    public static void assertState(boolean condition, String message, Object... objs) {
        if (!condition) {
            throw new IllegalStateException(
                    MessageFormat.format(message, objs)
            );
        }
    }
}
