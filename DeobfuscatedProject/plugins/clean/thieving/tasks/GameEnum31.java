/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import gg.squire.thieving.tasks.GameEnum19;

public final class GameEnum31
extends Enum<d> {
    private final  String name;
    private final  int combat;
    public static final  /* enum */ d MENAPHITE;
    private static final  d[] $VALUES;
    private final  c house;

    public static final  /* enum */ d BANDIT_56;
    public static final  /* enum */ d BANDIT_41;
    public static final  /* enum */ d HIGHEST_LEVEL;
    private final  int thieving;

    public int w() {
        return this.combat;
    }

    private static boolean lIllIIIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lIllIIIIlIlIlII();
        d.lIllIIIIlIlIIll();
        HIGHEST_LEVEL = new GameEnum31(lIIllIlIllIIl[0], lIIllIlIllIII[lIIllIlIllIIl[4]], lIIllIlIllIIl[0], null);
        MENAPHITE = new GameEnum31(lIIllIlIllIIl[6], lIIllIlIllIII[lIIllIlIllIIl[7]], lIIllIlIllIIl[8], c.MENAPHITE_HOUSE);
        BANDIT_56 = new GameEnum31(lIIllIlIllIIl[8], lIIllIlIllIII[lIIllIlIllIIl[10]], lIIllIlIllIIl[11], c.LADDER_HOUSE);
        BANDIT_41 = new GameEnum31(lIIllIlIllIIl[13], lIIllIlIllIII[lIIllIlIllIIl[14]], lIIllIlIllIIl[15], c.LADDER_HOUSE);
        d[] dArray = new d[lIIllIlIllIIl[5]];
        dArray[d.lIIllIlIllIIl[1]] = HIGHEST_LEVEL;
        dArray[d.lIIllIlIllIIl[2]] = MENAPHITE;
        dArray[d.lIIllIlIllIIl[3]] = BANDIT_56;
        dArray[d.lIIllIlIllIIl[4]] = BANDIT_41;
        $VALUES = dArray;
    }

    public String v() {
        return this.name;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum31.class, string);
    }

    public c t() {
        return this.house;
    }

    public NPC a(Predicate<NPC> predicate) {
        return NPCs.getNearest((WorldPoint)this.t().r(), nPC -> {
            int n2;
            if (d.lIllIIIIlIlIllI(this.b((NPC)nPC) ? 1 : 0) && d.lIllIIIIlIlIllI(predicate.test((NPC)nPC) ? 1 : 0)) {
                n2 = lIIllIlIllIIl[2];

                if (-1 < -1) {
                    return ((31 + 115 - 107 + 115 ^ 48 + 60 - -20 + 9) & (0x85 ^ 0xBF ^ (0x16 ^ 0x3F) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIllIIl[1];
            }
            return n2 != 0;
        });
    }

    public NPC a(d d2) {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (d.lIllIIIIlIlIllI(this.name.equals(d2.name) ? 1 : 0) && d.lIllIIIIlIlIlll(nPC.getCombatLevel(), d2.combat)) {
                n2 = lIIllIlIllIIl[2];

                if (-1 != -1) {
                    return ((0x9C ^ 0xC1 ^ (0x72 ^ 0x7D)) & (0x86 ^ 0xC6 ^ (0x72 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIllIIl[1];
            }
            return n2 != 0;
        });
    }

    private GameEnum31(int n3, String string2, int n4, c c2) {
        this.thieving = n3;
        this.name = string2;
        this.combat = n4;
        this.house = c2;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public int u() {
        return this.thieving;
    }

    public boolean b(NPC nPC) {
        int n2;
        if (d.lIllIIIIlIlIllI(this.name.equals(nPC.getName()) ? 1 : 0) && d.lIllIIIIlIlIlll(this.combat, nPC.getCombatLevel())) {
            n2 = lIIllIlIllIIl[2];

        } else {
            n2 = lIIllIlIllIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIIlIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIIIlIlIIll() {
        lIIllIlIllIII = new String[lIIllIlIllIIl[16]];
        d.lIIllIlIllIII[d.lIIllIlIllIIl[1]] = " (%d)";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[2]] = d.lIllIIIIlIlIIIl("", "oiTVF");
        d.lIIllIlIllIII[d.lIIllIlIllIIl[3]] = "HIGHEST_LEVEL";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[4]] = "Highest Level";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[5]] = "MENAPHITE";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[7]] = "Menaphite Thug";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[9]] = "BANDIT_56";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[10]] = "Bandit";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[12]] = "BANDIT_41";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[14]] = "Bandit";
    }

    public String toString() {
        String string;
        if (d.lIllIIIIlIlIlIl(this.thieving, lIIllIlIllIIl[0])) {
            Object[] objectArray = new Object[lIIllIlIllIIl[2]];
            objectArray[d.lIIllIlIllIIl[1]] = this.thieving;
            string = String.format(lIIllIlIllIII[lIIllIlIllIIl[1]], objectArray);

            if (((0x74 ^ 0x72 ^ (0xF6 ^ 0xBC)) & (123 + 188 - 219 + 109 ^ 106 + 127 - 221 + 121 ^ -1)) >= 1) {
                return null;
            }
        } else {
            string = lIIllIlIllIII[lIIllIlIllIIl[2]];
        }
        return this.name + string;
    }

    private static boolean lIllIIIIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIlIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var1);
    }

    public NPC b(c c2) {
        return NPCs.getNearest((WorldPoint)c2.p().getCenter(), nPC -> {
            int n2;
            if (d.lIllIIIIlIlIllI(c2.p().contains((Locatable)nPC) ? 1 : 0) && d.lIllIIIIlIlIllI(this.name.equals(nPC.getName()) ? 1 : 0) && d.lIllIIIIlIlIlll(nPC.getCombatLevel(), this.combat)) {
                n2 = lIIllIlIllIIl[2];

                if (2 <= 0) {
                    return ((0x7C ^ 0x20 ^ 1) & (0x5D ^ 0x2D ^ (0x9B ^ 0xB6) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIllIIl[1];
            }
            return n2 != 0;
        });
    }

}

