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

public final class h
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
        void lllllllllllllllIIlIlllIlIlIlllIl;
        int n2 = Skills.getLevel((Skill)Skill.HUNTER);
        ArrayList arrayList = new ArrayList();
        h[] hArray = h.values();
        int n3 = hArray.length;
        int lllllllllllllllIIlIlllIlIlIlllII = lllIllIlllll[0];
        while (h.lIIIllIllIIllll(lllllllllllllllIIlIlllIlIlIlllII, (int)lllllllllllllllIIlIlllIlIlIlllIl)) {
            void lllllllllllllllIIlIlllIlIllIIIII;
            void lllllllllllllllIIlIlllIlIlIllllI;
            void lllllllllllllllIIlIlllIlIlIllIll = lllllllllllllllIIlIlllIlIlIllllI[lllllllllllllllIIlIlllIlIlIlllII];
            if (h.lIIIllIllIlIIII(lllllllllllllllIIlIlllIlIlIllIll.t(), (int)lllllllllllllllIIlIlllIlIllIIIII)) {
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            } else {
                void lllllllllllllllIIlIlllIlIlIlllll;
                lllllllllllllllIIlIlllIlIlIlllll.add(lllllllllllllllIIlIlllIlIlIllIll);
                "".length();
            }
            ++lllllllllllllllIIlIlllIlIlIlllII;
            "".length();
            if ((0x86 ^ 0x82) >= 0) continue;
            return null;
        }
        return NPCs.getNearest((int[])arrayList.stream().mapToInt(h::u).toArray());
    }

    public int u() {
        return this.kebbitId;
    }

    private static String lIIIllIllIIlIll(String lllllllllllllllIIlIlllIlIlIlIIII, String lllllllllllllllIIlIlllIlIlIIllll) {
        lllllllllllllllIIlIlllIlIlIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIlIlIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIlllIlIlIIllIl = lllllllllllllllIIlIlllIlIlIIllll.toCharArray();
        int lllllllllllllllIIlIlllIlIlIIllII = lllIllIlllll[0];
        char[] lllllllllllllllIIlIlllIlIlIIIllI = lllllllllllllllIIlIlllIlIlIlIIII.toCharArray();
        int lllllllllllllllIIlIlllIlIlIIIlIl = lllllllllllllllIIlIlllIlIlIIIllI.length;
        int lllllllllllllllIIlIlllIlIlIIIlII = lllIllIlllll[0];
        while (h.lIIIllIllIIllll(lllllllllllllllIIlIlllIlIlIIIlII, lllllllllllllllIIlIlllIlIlIIIlIl)) {
            char lllllllllllllllIIlIlllIlIlIlIIIl = lllllllllllllllIIlIlllIlIlIIIllI[lllllllllllllllIIlIlllIlIlIIIlII];
            lllllllllllllllIIlIlllIlIlIIlllI.append((char)(lllllllllllllllIIlIlllIlIlIlIIIl ^ lllllllllllllllIIlIlllIlIlIIllIl[lllllllllllllllIIlIlllIlIlIIllII % lllllllllllllllIIlIlllIlIlIIllIl.length]));
            "".length();
            ++lllllllllllllllIIlIlllIlIlIIllII;
            ++lllllllllllllllIIlIlllIlIlIIIlII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIlIlIIlllI);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static String lIIIllIllIIllII(String lllllllllllllllIIlIlllIlIIlllIll, String lllllllllllllllIIlIlllIlIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lllIllIlllll[10]), "DES");
            Cipher lllllllllllllllIIlIlllIlIIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlIIllllIl.init(lllIllIlllll[6], lllllllllllllllIIlIlllIlIIlllllI);
            return new String(lllllllllllllllIIlIlllIlIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlIIllllII) {
            lllllllllllllllIIlIlllIlIIllllII.printStackTrace();
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
        h.lllIllIllllI[h.lllIllIlllll[0]] = h.lIIIllIllIIlIll("IjYWDgooMBoNBiQ1DBI=", "fwEFC");
        h.lllIllIllllI[h.lllIllIlllll[3]] = h.lIIIllIllIIllII("8EBRn9F3Hx55hHyc7wA3nQ==", "ECNTu");
        h.lllIllIllllI[h.lllIllIlllll[6]] = h.lIIIllIllIIlIll("BigaNgcQPAopFhc6HDY=", "UxUbS");
    }

    private static void lIIIllIllIIlllI() {
        lllIllIlllll = new int[11];
        h.lllIllIlllll[0] = (0x23 ^ 0x4C ^ (0x31 ^ 0xA)) & (0xD0 ^ 0x95 ^ (0x94 ^ 0x85) ^ -" ".length());
        h.lllIllIlllll[1] = 0x71 ^ 0x2A ^ (0xAF ^ 0xB1);
        h.lllIllIlllll[2] = 0xFFFFDDDF & 0x37BD;
        h.lllIllIlllll[3] = " ".length();
        h.lllIllIlllll[4] = 0xBD ^ 0xC6 ^ (0x6F ^ 0x2D);
        h.lllIllIlllll[5] = -(0xFFFFFB97 & 0x4E6B) & (0xFFFFFFDF & 0x5FBE);
        h.lllIllIlllll[6] = "  ".length();
        h.lllIllIlllll[7] = 34 + 39 - 6 + 89 ^ 162 + 139 - 141 + 23;
        h.lllIllIlllll[8] = 0xFFFFDDDB & 0x37BF;
        h.lllIllIlllll[9] = "   ".length();
        h.lllIllIlllll[10] = 4 ^ 0xC;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }
}

