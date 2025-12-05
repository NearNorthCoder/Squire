/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api;

import java.util.Collection;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

public class Locations {
    public static boolean isRegionLoaded(int regionId) {
        Client client = Static.getClient();
        if (client.getMapRegions() == null) {
            return false;
        }
        for (int region : client.getMapRegions()) {
            if (region != regionId) continue;
            return true;
        }
        return false;
    }

    public static WorldPoint fromRegionPoint(RegionPoint regionPoint) {
        Client client = Static.getClient();
        WorldPoint converted = regionPoint.toWorld();
        Collection instanceMapped = WorldPoint.toLocalInstance((Client)client, (WorldPoint)converted);
        return instanceMapped.stream().filter(wp -> wp.getPlane() == client.getPlane()).min(Comparator.comparingInt(wp -> wp.distanceTo((Locatable)Players.getLocal()))).orElse(null);
    }

    public static WorldPoint fromRegionPoint(Point point) {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int regionId = worldLocation.getRegionID();
        int plane = worldLocation.getPlane();
        return Locations.fromRegionPoint(new RegionPoint(point.getX(), point.getY(), plane, regionId));
    }

    public static boolean isInRegion(int regionId) {
        return Locations.getRegionId() == regionId;
    }

    public static int getRegionId() {
        Client client = Static.getClient();
        WorldPoint localWorld = client.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = client.getLocalPlayer().getLocalLocation();
        if (client.isInInstancedRegion()) {
            return WorldPoint.fromLocalInstance((Client)client, (LocalPoint)localPoint).getRegionID();
        }
        return localWorld.getRegionID();
    }
}

