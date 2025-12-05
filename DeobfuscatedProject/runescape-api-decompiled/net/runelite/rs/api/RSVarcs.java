/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.util.Map;
import net.runelite.mapping.Import;

public interface RSVarcs {
    @Import(value="map")
    public Map<Integer, Object> getVarcMap();
}

