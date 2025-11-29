/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;

public final class d
extends Enum<d> {
    private final /* synthetic */ String name;
    private final /* synthetic */ int combat;
    public static final /* synthetic */ /* enum */ d MENAPHITE;
    private static final /* synthetic */ d[] $VALUES;
    private final /* synthetic */ c house;
    private static /* synthetic */ String[] lIIllIlIllIII;
    private static /* synthetic */ int[] lIIllIlIllIIl;
    public static final /* synthetic */ /* enum */ d BANDIT_56;
    public static final /* synthetic */ /* enum */ d BANDIT_41;
    public static final /* synthetic */ /* enum */ d HIGHEST_LEVEL;
    private final /* synthetic */ int thieving;

    public int w() {
        return this.combat;
    }

    private static String lIllIIIIlIlIIlI(String var17, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIllIlIllIIl[12]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIllIlIllIIl[3], var19);
            return new String(var3.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.lIllIIIIlIlIlII();
        d.lIllIIIIlIlIIll();
        HIGHEST_LEVEL = new d(lIIllIlIllIIl[0], lIIllIlIllIII[lIIllIlIllIIl[4]], lIIllIlIllIIl[0], null);
        MENAPHITE = new d(lIIllIlIllIIl[6], lIIllIlIllIII[lIIllIlIllIIl[7]], lIIllIlIllIIl[8], c.MENAPHITE_HOUSE);
        BANDIT_56 = new d(lIIllIlIllIIl[8], lIIllIlIllIII[lIIllIlIllIIl[10]], lIIllIlIllIIl[11], c.LADDER_HOUSE);
        BANDIT_41 = new d(lIIllIlIllIIl[13], lIIllIlIllIII[lIIllIlIllIIl[14]], lIIllIlIllIIl[15], c.LADDER_HOUSE);
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
        return Enum.valueOf(d.class, string);
    }

    public c t() {
        return this.house;
    }

    public NPC a(Predicate<NPC> predicate) {
        return NPCs.getNearest((WorldPoint)this.t().r(), nPC -> {
            int n2;
            if (d.lIllIIIIlIlIllI(this.b((NPC)nPC) ? 1 : 0) && d.lIllIIIIlIlIllI(predicate.test((NPC)nPC) ? 1 : 0)) {
                n2 = lIIllIlIllIIl[2];
                0;
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
                0;
                if (-1 != -1) {
                    return ((0x9C ^ 0xC1 ^ (0x72 ^ 0x7D)) & (0x86 ^ 0xC6 ^ (0x72 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIllIIl[1];
            }
            return n2 != 0;
        });
    }

    private d(int n3, String string2, int n4, c c2) {
        this.thieving = n3;
        this.name = string2;
        this.combat = n4;
        this.house = c2;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String lIllIIIIlIlIIII(String var16, String var9) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIllIlIllIIl[3], var11);
            return new String(var1.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public int u() {
        return this.thieving;
    }

    public boolean b(NPC nPC) {
        int n2;
        if (d.lIllIIIIlIlIllI(this.name.equals(nPC.getName()) ? 1 : 0) && d.lIllIIIIlIlIlll(this.combat, nPC.getCombatLevel())) {
            n2 = lIIllIlIllIIl[2];
            0;
            if (-1 > 0) {
                return ((0x99 ^ 0x9E ^ (0x27 ^ 0x34)) & (177 + 181 - 159 + 14 ^ 35 + 175 - 44 + 27 ^ -1)) != 0;
            }
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
        d.lIIllIlIllIII[d.lIIllIlIllIIl[1]] = d." (%d)";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[2]] = d."";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[3]] = d."HIGHEST_LEVEL";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[4]] = d."Highest Level";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[5]] = d."MENAPHITE";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[7]] = d."Menaphite Thug";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[9]] = d."BANDIT_56";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[10]] = d."Bandit";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[12]] = d."BANDIT_41";
        d.lIIllIlIllIII[d.lIIllIlIllIIl[14]] = d."Bandit";
    }

    public String toString() {
        String string;
        if (d.lIllIIIIlIlIlIl(this.thieving, lIIllIlIllIIl[0])) {
            Object[] objectArray = new Object[lIIllIlIllIIl[2]];
            objectArray[d.lIIllIlIllIIl[1]] = this.thieving;
            string = String.format(lIIllIlIllIII[lIIllIlIllIIl[1]], objectArray);
            0;
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

    private static String lIllIIIIlIlIIIl(String var8, String var6) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var14 = var6.toCharArray();
        int var5 = lIIllIlIllIIl[1];
        char[] var13 = var8.toCharArray();
        int var4 = var13.length;
        int var12 = lIIllIlIllIIl[1];
        while (d.lIllIIIlIIIlIIl(var12, var4)) {
            char var7 = var13[var12];
            var18.append((char)(var7 ^ var14[var5 % var14.length]));
            0;
            ++var5;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    public NPC b(c c2) {
        return NPCs.getNearest((WorldPoint)c2.p().getCenter(), nPC -> {
            int n2;
            if (d.lIllIIIIlIlIllI(c2.p().contains((Locatable)nPC) ? 1 : 0) && d.lIllIIIIlIlIllI(this.name.equals(nPC.getName()) ? 1 : 0) && d.lIllIIIIlIlIlll(nPC.getCombatLevel(), this.combat)) {
                n2 = lIIllIlIllIIl[2];
                0;
                if (2 <= 0) {
                    return ((0x7C ^ 0x20 ^ 1) & (0x5D ^ 0x2D ^ (0x9B ^ 0xB6) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIllIIl[1];
            }
            return n2 != 0;
        });
    }

    private static void lIllIIIIlIlIlII() {
        lIIllIlIllIIl = new int[17];
        d.lIIllIlIllIIl[0] = -1;
        d.lIIllIlIllIIl[1] = (0x66 ^ 0x2A ^ (0x1C ^ 0x1B)) & (95 + 54 - 16 + 114 ^ 101 + 85 - 171 + 173 ^ -1);
        d.lIIllIlIllIIl[2] = 1;
        d.lIIllIlIllIIl[3] = 2;
        d.lIIllIlIllIIl[4] = 3;
        d.lIIllIlIllIIl[5] = 0x9C ^ 0x98;
        d.lIIllIlIllIIl[6] = 0xC8 ^ 0x89;
        d.lIIllIlIllIIl[7] = 0xB6 ^ 0xB3;
        d.lIIllIlIllIIl[8] = 0x87 ^ 0xB0;
        d.lIIllIlIllIIl[9] = 0x67 ^ 0x61;
        d.lIIllIlIllIIl[10] = 89 + 19 - -8 + 15 ^ 40 + 86 - 6 + 12;
        d.lIIllIlIllIIl[11] = 0x41 ^ 0x79;
        d.lIIllIlIllIIl[12] = 175 + 68 - 97 + 59 ^ 187 + 130 - 288 + 168;
        d.lIIllIlIllIIl[13] = 236 + 108 - 300 + 193 ^ 147 + 12 - -1 + 32;
        d.lIIllIlIllIIl[14] = 0x35 ^ 0x3C;
        d.lIIllIlIllIIl[15] = 0xEE ^ 0xC7;
        d.lIIllIlIllIIl[16] = 0x9D ^ 0x97;
    }
}

