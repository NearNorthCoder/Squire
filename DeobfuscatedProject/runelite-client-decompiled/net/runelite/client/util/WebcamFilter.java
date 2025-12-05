/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.Marker;

public class WebcamFilter
extends TurboFilter {
    @Override
    public FilterReply decide(Marker marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        if (format == null) {
            return FilterReply.NEUTRAL;
        }
        format = format.toLowerCase();
        if (format.contains("webcam") || logger.getName().toLowerCase().contains("webcam")) {
            return FilterReply.DENY;
        }
        return FilterReply.NEUTRAL;
    }
}

