/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum ItemType {
    DEFAULT;

    private static final Logger logger;

    public static ItemType of(String type) {
        try {
            return ItemType.valueOf(type.toUpperCase());
        }
        catch (IllegalArgumentException ex) {
            logger.warn("unable to convert type", ex);
            return DEFAULT;
        }
    }

    static {
        logger = LoggerFactory.getLogger(ItemType.class);
    }
}

