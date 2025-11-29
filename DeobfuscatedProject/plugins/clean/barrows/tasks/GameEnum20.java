/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.barrows.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class GameEnum20
extends Enum<d> {
    
    public static final  /* enum */ d TORAG;
    private final  int combatLevel;
    private static final  d[] $VALUES;
    private final  WorldPoint location;
    public static final  /* enum */ d VERAC;
    public static final  /* enum */ d DHAROK;
    private final  String name;
    public static final  /* enum */ d KARIL;
    public static final  /* enum */ d GUTHAN;
    public static final  /* enum */ d AHRIM;
    
    private final  int killedVarbit;

    private static void lIllIlIllIIIll() {
        llllIlIIlll = new String[llllIlIlIII[29]];
        d.llllIlIIlll[d.llllIlIlIII[0]] = "DHAROK";
        d.llllIlIIlll[d.llllIlIlIII[1]] = "Dharok";
        d.llllIlIIlll[d.llllIlIlIII[6]] = "GUTHAN";
        d.llllIlIIlll[d.llllIlIlIII[7]] = "Guthan";
        d.llllIlIIlll[d.llllIlIlIII[11]] = "KARIL";
        d.llllIlIIlll[d.llllIlIlIII[12]] = "Karil";
        d.llllIlIIlll[d.llllIlIlIII[17]] = "AHRIM";
        d.llllIlIIlll[d.llllIlIlIII[18]] = "Ahrim";
        d.llllIlIIlll[d.llllIlIlIII[21]] = "TORAG";
        d.llllIlIIlll[d.llllIlIlIII[22]] = "Torag";
        d.llllIlIIlll[d.llllIlIlIII[25]] = "VERAC";
        d.llllIlIIlll[d.llllIlIlIII[26]] = "Verac";
    }

    public int E() {
        return this.combatLevel;
    }

    private static boolean lIllIlIllIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private GameEnum20(String string2, int n3, WorldPoint worldPoint, int n4) {
        this.name = string2;
        this.combatLevel = n3;
        this.location = worldPoint;
        this.killedVarbit = n4;
    }

    private static boolean lIllIlIllIIlll(int n2) {
        return n2 != 0;
    }

    public int F() {
        return this.killedVarbit;
    }

    public static boolean a(Actor actor) {
        if (d.lIllIlIllIIlIl(actor.getInteracting(), Players.getLocal())) {
            return llllIlIlIII[0];
        }
        d[] var1 = d.values();
        int var2 = var1.length;
        int var3 = llllIlIlIII[0];
        while (d.lIllIlIllIIllI(var3, var2)) {
            Actor var4;
            d var5 = var1[var3];
            if (d.lIllIlIllIIlll(var4.getName().toLowerCase().contains(var5.C().toLowerCase()) ? 1 : 0)) {
                return llllIlIlIII[1];
            }
            ++var3;

            return ((221 + 185 - 348 + 192 ^ 65 + 126 - 108 + 86) & (0xE9 ^ 0x83 ^ (0x51 ^ 0x68) ^ -1)) != 0;
        }
        return llllIlIlIII[0];
    }

    private static boolean lIllIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

        return String.valueOf(var6);
    }

    public String C() {
        return this.name;
    }

    static {
        d.lIllIlIllIIlII();
        d.lIllIlIllIIIll();
        DHAROK = new GameEnum20(llllIlIIlll[llllIlIlIII[1]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[3], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[5]);
        GUTHAN = new GameEnum20(llllIlIIlll[llllIlIlIII[7]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[8], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[10]);
        KARIL = new GameEnum20(llllIlIIlll[llllIlIlIII[12]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[15], llllIlIlIII[0]), llllIlIlIII[16]);
        AHRIM = new GameEnum20(llllIlIIlll[llllIlIlIII[18]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[19], llllIlIlIII[0]), llllIlIlIII[20]);
        TORAG = new GameEnum20(llllIlIIlll[llllIlIlIII[22]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[23], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[24]);
        VERAC = new GameEnum20(llllIlIIlll[llllIlIlIII[26]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[27], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[28]);
        d[] dArray = new d[llllIlIlIII[17]];
        dArray[d.llllIlIlIII[0]] = DHAROK;
        dArray[d.llllIlIlIII[1]] = GUTHAN;
        dArray[d.llllIlIlIII[6]] = KARIL;
        dArray[d.llllIlIlIII[7]] = AHRIM;
        dArray[d.llllIlIlIII[11]] = TORAG;
        dArray[d.llllIlIlIII[12]] = VERAC;
        $VALUES = dArray;
    }

    public WorldPoint D() {
        return this.location;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }
}

