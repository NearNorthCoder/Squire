/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.Area
 *  net.unethicalite.api.coords.RectangularArea
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.Area;
import net.unethicalite.api.coords.RectangularArea;
import gg.squire.pvm.tasks.CHelper;

public final class GameEnum
extends Enum<g> {
    private final  Area area;
    
    private final  List<WorldPoint> safeSpots;
    public static final  /* enum */ g FIRST_ROOM;
    private final  WorldPoint origin;
    private static final  g[] $VALUES;
    
    private final  WorldPoint center;

    public Area x() {
        return this.area;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIlIllIllIIllll() {
        lIIlIlllIIIll = new String[lIIlIlllIIlII[6]];
        g.lIIlIlllIIIll[g.lIIlIlllIIlII[0]] = "FIRST_ROOM";
    }

    public WorldPoint A() {
        return this.center;
    }

    public WorldPoint y() {
        return this.origin;
    }

    static {
        g.lIlIllIllIlIIII();
        g.lIlIllIllIIllll();
        WorldPoint[] worldPointArray = new WorldPoint[lIIlIlllIIlII[5]];
        worldPointArray[g.lIIlIlllIIlII[0]] = c.D.dy(lIIlIlllIIlII[6]);
        worldPointArray[g.lIIlIlllIIlII[6]] = c.D.dy(lIIlIlllIIlII[7]);
        worldPointArray[g.lIIlIlllIIlII[7]] = c.D.dy(lIIlIlllIIlII[8]);
        worldPointArray[g.lIIlIlllIIlII[8]] = c.D.dy(lIIlIlllIIlII[9]);
        worldPointArray[g.lIIlIlllIIlII[9]] = c.D.dy(lIIlIlllIIlII[10]);
        worldPointArray[g.lIIlIlllIIlII[10]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[7]);
        worldPointArray[g.lIIlIlllIIlII[12]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[8]);
        worldPointArray[g.lIIlIlllIIlII[13]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[9]);
        worldPointArray[g.lIIlIlllIIlII[14]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[10]);
        worldPointArray[g.lIIlIlllIIlII[15]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[12]);
        FIRST_ROOM = new GameEnum((Area)new RectangularArea(lIIlIlllIIlII[1], lIIlIlllIIlII[2], lIIlIlllIIlII[3], lIIlIlllIIlII[4], lIIlIlllIIlII[0]), c.D, Arrays.asList(worldPointArray), c.G);
        g[] gArray = new g[lIIlIlllIIlII[6]];
        gArray[g.lIIlIlllIIlII[0]] = FIRST_ROOM;
        $VALUES = gArray;
    }

    private GameEnum(Area area, WorldPoint worldPoint, List<WorldPoint> list, WorldPoint worldPoint2) {
        this.area = area;
        this.origin = worldPoint;
        this.safeSpots = list;
        this.center = worldPoint2;
    }

    public List<WorldPoint> z() {
        return this.safeSpots;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }
}

