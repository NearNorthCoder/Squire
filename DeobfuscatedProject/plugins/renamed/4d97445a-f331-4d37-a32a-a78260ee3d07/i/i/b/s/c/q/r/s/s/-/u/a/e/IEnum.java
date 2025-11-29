/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;

public final class IEnum
extends Enum<i> {
    private static /* synthetic */ String[] lIllIIIlI;
    public static final /* synthetic */ /* enum */ i GHOSTS;
    private final /* synthetic */ Color textColor;
    private final /* synthetic */ Skill type;
    public static final /* synthetic */ /* enum */ i TRIPLE;
    public static final /* synthetic */ /* enum */ i LAVA;
    public static final /* synthetic */ /* enum */ i AUTO;
    private static /* synthetic */ int[] lIllIIIll;
    private static final /* synthetic */ i[] $VALUES;
    private final /* synthetic */ int tickDelay;
    public static final /* synthetic */ /* enum */ i SPAWNING;

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public int S() {
        return this.tickDelay;
    }

    public String toString() {
        return "Phase{type=" + this.type + ", tickDelay=" + this.tickDelay + ", textColor=" + this.textColor + "}";
    }

    public Color T() {
        return this.textColor;
    }

    private static String lIIllIlllll(String lIllllIllIIIIll, String lIllllIllIIIIII) {
        try {
            SecretKeySpec lIllllIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIllIIIll[9]), "DES");
            Cipher lIllllIllIIIlIl = Cipher.getInstance("DES");
            lIllllIllIIIlIl.init(lIllIIIll[4], lIllllIllIIIllI);
            return new String(lIllllIllIIIlIl.doFinal(Base64.getDecoder().decode(lIllllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIllIIIlII) {
            lIllllIllIIIlII.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIlllIIIIl();
        i.lIIlllIIIII();
        SPAWNING = new i(null, lIllIIIll[1], null);
        AUTO = new i(Skill.ATTACK, lIllIIIll[3], null);
        TRIPLE = new i(Skill.FLETCHING, lIllIIIll[3], new Color(lIllIIIll[5], lIllIIIll[6], lIllIIIll[7]));
        GHOSTS = new i(Skill.PRAYER, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[7], lIllIIIll[7]));
        LAVA = new i(Skill.FIREMAKING, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[5], lIllIIIll[5]));
        i[] iArray = new i[lIllIIIll[10]];
        iArray[i.lIllIIIll[0]] = SPAWNING;
        iArray[i.lIllIIIll[2]] = AUTO;
        iArray[i.lIllIIIll[4]] = TRIPLE;
        iArray[i.lIllIIIll[8]] = GHOSTS;
        iArray[i.lIllIIIll[1]] = LAVA;
        $VALUES = iArray;
    }

    public Skill L() {
        return this.type;
    }

    private i(Skill skill, int n3, Color color) {
        this.type = skill;
        this.tickDelay = n3;
        this.textColor = color;
    }

    private static void lIIlllIIIIl() {
        lIllIIIll = new int[11];
        i.lIllIIIll[0] = (0x40 ^ 0x6C) & ~(0x49 ^ 0x65);
        i.lIllIIIll[1] = 118 + 172 - 262 + 153 ^ 38 + 142 - 47 + 44;
        i.lIllIIIll[2] = 1;
        i.lIllIIIll[3] = 0xA1 ^ 0xC0 ^ (0x7E ^ 0x19);
        i.lIllIIIll[4] = 2;
        i.lIllIIIll[5] = 16 + 74 - 73 + 136;
        i.lIllIIIll[6] = 7 + 131 - 1 + 16 + (0x6B ^ 0x72) - -(0x4D ^ 0x53) + (0x67 ^ 0x61);
        i.lIllIIIll[7] = 235 + 144 - 364 + 240;
        i.lIllIIIll[8] = 3;
        i.lIllIIIll[9] = 0x2E ^ 0x26;
        i.lIllIIIll[10] = 0xBF ^ 0xBA;
    }

    private static void lIIlllIIIII() {
        lIllIIIlI = new String[lIllIIIll[10]];
        i.lIllIIIlI[i.lIllIIIll[0]] = i."SPAWNING";
        i.lIllIIIlI[i.lIllIIIll[2]] = i."AUTO";
        i.lIllIIIlI[i.lIllIIIll[4]] = i."TRIPLE";
        i.lIllIIIlI[i.lIllIIIll[8]] = i."GHOSTS";
        i.lIllIIIlI[i.lIllIIIll[1]] = i."LAVA";
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static String lIIllIllllI(String lIllllIllIlIIII, String lIllllIllIIllIl) {
        try {
            SecretKeySpec lIllllIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIllIlIIlI = Cipher.getInstance("Blowfish");
            lIllllIllIlIIlI.init(lIllIIIll[4], lIllllIllIlIIll);
            return new String(lIllllIllIlIIlI.doFinal(Base64.getDecoder().decode(lIllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIllIlIIIl) {
            lIllllIllIlIIIl.printStackTrace();
            return null;
        }
    }
}

