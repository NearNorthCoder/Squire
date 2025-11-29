/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum60
extends Enum<E> {
    private final  WorldPoint location;
    private final  String name;
    public static final  /* enum */ E MEADOW_NORTH;
    
    private static final  E[] $VALUES;
    public static final  /* enum */ E VALLEY_NORTH;
    private final  int varp;
    public static final  /* enum */ E MEADOW_SOUTH;
    
    public static final  /* enum */ E VALLEY_SOUTH;

    public static E valueOf(String string) {
        return Enum.valueOf(GameEnum60.class, string);
    }

        return String.valueOf(var1);
    }

    public static E[] values() {
        return (E[])$VALUES.clone();
    }

    private GameEnum60(String string2, int n3, WorldPoint worldPoint) {
        this.name = string2;
        this.varp = n3;
        this.location = worldPoint;
    }

    public int ax() {
        return this.varp;
    }

    static {
        E.llllIlIllIIlII();
        E.llllIlIllIIIll();
        MEADOW_NORTH = new GameEnum60(llIIIlIllllI[llIIIlIlllll[1]], llIIIlIlllll[2], new WorldPoint(llIIIlIlllll[3], llIIIlIlllll[4], llIIIlIlllll[0]));
        MEADOW_SOUTH = new GameEnum60(llIIIlIllllI[llIIIlIlllll[6]], llIIIlIlllll[7], new WorldPoint(llIIIlIlllll[8], llIIIlIlllll[9], llIIIlIlllll[0]));
        VALLEY_NORTH = new GameEnum60(llIIIlIllllI[llIIIlIlllll[11]], llIIIlIlllll[12], new WorldPoint(llIIIlIlllll[13], llIIIlIlllll[14], llIIIlIlllll[0]));
        VALLEY_SOUTH = new GameEnum60(llIIIlIllllI[llIIIlIlllll[16]], llIIIlIlllll[17], new WorldPoint(llIIIlIlllll[18], llIIIlIlllll[19], llIIIlIlllll[0]));
        E[] eArray = new E[llIIIlIlllll[10]];
        eArray[E.llIIIlIlllll[0]] = MEADOW_NORTH;
        eArray[E.llIIIlIlllll[1]] = MEADOW_SOUTH;
        eArray[E.llIIIlIlllll[5]] = VALLEY_NORTH;
        eArray[E.llIIIlIlllll[6]] = VALLEY_SOUTH;
        $VALUES = eArray;
    }

    public String ac() {
        return this.name;
    }

    public WorldPoint az() {
        return this.location;
    }

    private static boolean llllIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIlIllIIIll() {
        llIIIlIllllI = new String[llIIIlIlllll[20]];
        E.llIIIlIllllI[E.llIIIlIlllll[0]] = "MEADOW_NORTH";
        E.llIIIlIllllI[E.llIIIlIlllll[1]] = "Mushroom Meadow (North)";
        E.llIIIlIllllI[E.llIIIlIlllll[5]] = "MEADOW_SOUTH";
        E.llIIIlIllllI[E.llIIIlIlllll[6]] = "Mushroom Meadow (South)";
        E.llIIIlIllllI[E.llIIIlIlllll[10]] = "VALLEY_NORTH";
        E.llIIIlIllllI[E.llIIIlIlllll[11]] = "Verdant Valley (Northeast)";
        E.llIIIlIllllI[E.llIIIlIlllll[15]] = "VALLEY_SOUTH";
        E.llIIIlIllllI[E.llIIIlIlllll[16]] = "Verdant Valley (Southwest)";
    }
}

