/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Skills
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;

public final class HEnum
extends Enum<h> {
    private final /* synthetic */ int levelRequired;
    private static /* synthetic */ int[] lllIllIlllll;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ String[] lllIllIllllI;
    public static final /* synthetic */ /* enum */ h DASHING_KEBBIT;
    public static final /* synthetic */ /* enum */ h DARK_KEBBIT;
    public static final /* synthetic */ /* enum */ h SPOTTED_KEBBIT;
    private final /* synthetic */ int kebbitId;

    /*
     * WARNING - void declaration
     */
    public static NPC s() {
        void var1;
        int n2 = Skills.getLevel((Skill)Skill.HUNTER);
        ArrayList arrayList = new ArrayList();
        h[] hArray = h.values();
        int n3 = hArray.length;
        int var9 = lllIllIlllll[0];
        while (h.lIIIllIllIIllll(var9, (int)var1)) {
            void var18;
            void var3;
            void var7 = var3[var9];
            if (h.lIIIllIllIlIIII(var7.t(), (int)var18)) {
                0;
                if (1 <= 0) {
                    return null;
                }
            } else {
                void var15;
                var15.add(var7);
                0;
            }
            ++var9;
            0;
            if ((0x86 ^ 0x82) >= 0) continue;
            return null;
        }
        return NPCs.getNearest((int[])arrayList.stream().mapToInt(h::u).toArray());
    }

    public int u() {
        return this.kebbitId;
    }

    private static String lIIIllIllIIlIll(String var2, String var16) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var20 = var16.toCharArray();
        int var17 = lllIllIlllll[0];
        char[] var13 = var2.toCharArray();
        int var11 = var13.length;
        int var6 = lllIllIlllll[0];
        while (h.lIIIllIllIIllll(var6, var11)) {
            char var12 = var13[var6];
            var4.append((char)(var12 ^ var20[var17 % var20.length]));
            0;
            ++var17;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var4);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static String lIIIllIllIIllII(String var8, String var5) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIllIlllll[10]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lllIllIlllll[6], var19);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private h(int n3, int n4) {
        this.levelRequired = n3;
        this.kebbitId = n4;
    }

    static {
        h.lIIIllIllIIlllI();
        h.lIIIllIllIIllIl();
        DASHING_KEBBIT = new h(lllIllIlllll[1], lllIllIlllll[2]);
        DARK_KEBBIT = new h(lllIllIlllll[4], lllIllIlllll[5]);
        SPOTTED_KEBBIT = new h(lllIllIlllll[7], lllIllIlllll[8]);
        h[] hArray = new h[lllIllIlllll[9]];
        hArray[h.lllIllIlllll[0]] = DASHING_KEBBIT;
        hArray[h.lllIllIlllll[3]] = DARK_KEBBIT;
        hArray[h.lllIllIlllll[6]] = SPOTTED_KEBBIT;
        $VALUES = hArray;
    }

    public int t() {
        return this.levelRequired;
    }

    private static boolean lIIIllIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIllIIllIl() {
        lllIllIllllI = new String[lllIllIlllll[9]];
        h.lllIllIllllI[h.lllIllIlllll[0]] = h."DASHING_KEBBIT";
        h.lllIllIllllI[h.lllIllIlllll[3]] = h."DARK_KEBBIT";
        h.lllIllIllllI[h.lllIllIlllll[6]] = h."SPOTTED_KEBBIT";
    }

    private static void lIIIllIllIIlllI() {
        lllIllIlllll = new int[11];
        h.lllIllIlllll[0] = (0x23 ^ 0x4C ^ (0x31 ^ 0xA)) & (0xD0 ^ 0x95 ^ (0x94 ^ 0x85) ^ -1);
        h.lllIllIlllll[1] = 0x71 ^ 0x2A ^ (0xAF ^ 0xB1);
        h.lllIllIlllll[2] = 0xFFFFDDDF & 0x37BD;
        h.lllIllIlllll[3] = 1;
        h.lllIllIlllll[4] = 0xBD ^ 0xC6 ^ (0x6F ^ 0x2D);
        h.lllIllIlllll[5] = -(0xFFFFFB97 & 0x4E6B) & (0xFFFFFFDF & 0x5FBE);
        h.lllIllIlllll[6] = 2;
        h.lllIllIlllll[7] = 34 + 39 - 6 + 89 ^ 162 + 139 - 141 + 23;
        h.lllIllIlllll[8] = 0xFFFFDDDB & 0x37BF;
        h.lllIllIlllll[9] = 3;
        h.lllIllIlllll[10] = 4 ^ 0xC;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }
}

