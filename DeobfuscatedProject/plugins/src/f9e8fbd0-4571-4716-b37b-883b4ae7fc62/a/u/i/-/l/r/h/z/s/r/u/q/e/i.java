/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class i
extends Enum<i> {
    private static final /* synthetic */ i[] $VALUES;
    private final /* synthetic */ Skill skill;
    public static final /* synthetic */ /* enum */ i NONE;
    public static final /* synthetic */ /* enum */ i DIVINE_BASTION;
    private static /* synthetic */ int[] lIllIlllllllI;
    public static final /* synthetic */ /* enum */ i RANGING_POTION;
    public static final /* synthetic */ /* enum */ i BASTION_POTION;
    private final /* synthetic */ String name;
    private static /* synthetic */ String[] lIllIlllllIll;
    public static final /* synthetic */ /* enum */ i MAGIC_POTION;
    public static final /* synthetic */ /* enum */ i DIVINE_RANGING;
    public static final /* synthetic */ /* enum */ i DIVINE_MAGIC_POTION;

    static {
        i.llIIlIlIIIIllIl();
        i.llIIlIlIIIIllII();
        RANGING_POTION = new i(lIllIlllllIll[lIllIlllllllI[0]], Skill.RANGED);
        DIVINE_RANGING = new i(lIllIlllllIll[lIllIlllllllI[4]], Skill.RANGED);
        BASTION_POTION = new i(lIllIlllllIll[lIllIlllllllI[6]], Skill.RANGED);
        DIVINE_BASTION = new i(lIllIlllllIll[lIllIlllllllI[7]], Skill.RANGED);
        MAGIC_POTION = new i(lIllIlllllIll[lIllIlllllllI[9]], Skill.MAGIC);
        DIVINE_MAGIC_POTION = new i(lIllIlllllIll[lIllIlllllllI[11]], Skill.MAGIC);
        NONE = new i(lIllIlllllIll[lIllIlllllllI[13]], null);
        i[] iArray = new i[lIllIlllllllI[7]];
        iArray[i.lIllIlllllllI[2]] = RANGING_POTION;
        iArray[i.lIllIlllllllI[0]] = DIVINE_RANGING;
        iArray[i.lIllIlllllllI[3]] = BASTION_POTION;
        iArray[i.lIllIlllllllI[4]] = DIVINE_BASTION;
        iArray[i.lIllIlllllllI[5]] = MAGIC_POTION;
        iArray[i.lIllIlllllllI[6]] = DIVINE_MAGIC_POTION;
        iArray[i.lIllIlllllllI[1]] = NONE;
        $VALUES = iArray;
    }

    private static boolean llIIlIlIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean llIIlIlIIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIlIIIIllll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIlIIllllllIl(String llllllllllllllIllIIIIlllIlIIlIll, String llllllllllllllIllIIIIlllIlIIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIIIlllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIIlllIlIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIIlllIlIIllIl.init(lIllIlllllllI[3], llllllllllllllIllIIIIlllIlIIlllI);
            return new String(llllllllllllllIllIIIIlllIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIIlllIlIIllII) {
            llllllllllllllIllIIIIlllIlIIllII.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIIIIlIll(String llllllllllllllIllIIIIlllIllIllIl, String llllllllllllllIllIIIIlllIllIIlll) {
        llllllllllllllIllIIIIlllIllIllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIIlllIllIlIll = new StringBuilder();
        char[] llllllllllllllIllIIIIlllIllIlIlI = llllllllllllllIllIIIIlllIllIIlll.toCharArray();
        int llllllllllllllIllIIIIlllIllIlIIl = lIllIlllllllI[2];
        char[] llllllllllllllIllIIIIlllIllIIIll = llllllllllllllIllIIIIlllIllIllIl.toCharArray();
        int llllllllllllllIllIIIIlllIllIIIlI = llllllllllllllIllIIIIlllIllIIIll.length;
        int llllllllllllllIllIIIIlllIllIIIIl = lIllIlllllllI[2];
        while (i.llIIlIlIIIlIIIl(llllllllllllllIllIIIIlllIllIIIIl, llllllllllllllIllIIIIlllIllIIIlI)) {
            char llllllllllllllIllIIIIlllIllIlllI = llllllllllllllIllIIIIlllIllIIIll[llllllllllllllIllIIIIlllIllIIIIl];
            llllllllllllllIllIIIIlllIllIlIll.append((char)(llllllllllllllIllIIIIlllIllIlllI ^ llllllllllllllIllIIIIlllIllIlIlI[llllllllllllllIllIIIIlllIllIlIIl % llllllllllllllIllIIIIlllIllIlIlI.length]));
            "".length();
            ++llllllllllllllIllIIIIlllIllIlIIl;
            ++llllllllllllllIllIIIIlllIllIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIIlllIllIlIll);
    }

    private static boolean llIIlIlIIIIlllI(Object object) {
        return object == null;
    }

    private static void llIIlIlIIIIllIl() {
        lIllIlllllllI = new int[15];
        i.lIllIlllllllI[0] = " ".length();
        i.lIllIlllllllI[1] = 0x8A ^ 0x8C;
        i.lIllIlllllllI[2] = (0x23 ^ 0x43) & ~(0x1E ^ 0x7E);
        i.lIllIlllllllI[3] = "  ".length();
        i.lIllIlllllllI[4] = "   ".length();
        i.lIllIlllllllI[5] = 0x14 ^ 0x10;
        i.lIllIlllllllI[6] = 141 + 54 - 46 + 5 ^ 86 + 55 - -3 + 15;
        i.lIllIlllllllI[7] = 0xBD ^ 0xBA;
        i.lIllIlllllllI[8] = 0x4B ^ 0x43;
        i.lIllIlllllllI[9] = 182 + 183 - 314 + 150 ^ 182 + 153 - 283 + 140;
        i.lIllIlllllllI[10] = 0x9B ^ 0x91;
        i.lIllIlllllllI[11] = 0x2F ^ 0x24;
        i.lIllIlllllllI[12] = 0x41 ^ 0x4D;
        i.lIllIlllllllI[13] = 0x8F ^ 0x82;
        i.lIllIlllllllI[14] = 128 + 33 - 93 + 106 ^ 147 + 55 - 165 + 123;
    }

    public String k() {
        return this.name;
    }

    public boolean v() {
        boolean bl;
        int n2;
        i llllllllllllllIllIIIIlllIllllIII;
        if (i.llIIlIlIIIIlllI(this.skill)) {
            return lIllIlllllllI[0];
        }
        int n3 = Skills.getBoostedLevel((Skill)llllllllllllllIllIIIIlllIllllIII.skill);
        int n4 = Skills.getLevel((Skill)llllllllllllllIllIIIIlllIllllIII.skill);
        if (i.llIIlIlIIIIllll((Object)llllllllllllllIllIIIIlllIllllIII, (Object)MAGIC_POTION)) {
            n2 = lIllIlllllllI[0];
            "".length();
            if ("  ".length() < ((0x35 ^ 0x16) & ~(0x92 ^ 0xB1))) {
                return ((0x6D ^ 0x57) & ~(0xD ^ 0x37)) != 0;
            }
        } else {
            n2 = lIllIlllllllI[1];
        }
        if (i.llIIlIlIIIlIIII(n3, n4 + n2)) {
            bl = lIllIlllllllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((5 ^ 0x4F ^ (0x15 ^ 1)) & (" ".length() ^ (0x6A ^ 0x35) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIlllllllI[2];
        }
        return bl;
    }

    private i(String string2, Skill skill) {
        this.name = string2;
        this.skill = skill;
    }

    private static String llIIlIIllllllII(String llllllllllllllIllIIIIlllIlIllIII, String llllllllllllllIllIIIIlllIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIIlllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIllIlllllllI[8]), "DES");
            Cipher llllllllllllllIllIIIIlllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIIIlllIlIllIlI.init(lIllIlllllllI[3], llllllllllllllIllIIIIlllIlIllIll);
            return new String(llllllllllllllIllIIIIlllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIIlllIlIllIIl) {
            llllllllllllllIllIIIIlllIlIllIIl.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static void llIIlIlIIIIllII() {
        lIllIlllllIll = new String[lIllIlllllllI[14]];
        i.lIllIlllllIll[i.lIllIlllllllI[2]] = i.llIIlIIllllllII("GHilZdlCfD23dJdHxNMAAA==", "NQqBr");
        i.lIllIlllllIll[i.lIllIlllllllI[0]] = i.llIIlIIllllllII("jlF/XeJ0bFwyUIt6A1FcCw==", "VrhFL");
        i.lIllIlllllIll[i.lIllIlllllllI[3]] = i.llIIlIIllllllIl("ZVNsqTkcsCFe1qPN2VRX1g==", "Hysml");
        i.lIllIlllllIll[i.lIllIlllllllI[4]] = i.llIIlIIllllllII("h9S6uVP/8EUl267cPZGqwvrY4MHA5YSr", "jNrGD");
        i.lIllIlllllIll[i.lIllIlllllllI[5]] = i.llIIlIIllllllII("ra5cL6cLd+N6DP9mEobtug==", "SuyzK");
        i.lIllIlllllIll[i.lIllIlllllllI[6]] = i.llIIlIIllllllIl("Bcvy2bNQ4DSwNCTPB6ZSTQ==", "YXymW");
        i.lIllIlllllIll[i.lIllIlllllllI[1]] = i.llIIlIIllllllIl("xe0V1eyrLJ3kq6H+bY0tjQ==", "fyQNb");
        i.lIllIlllllIll[i.lIllIlllllllI[7]] = i.llIIlIIllllllII("wkvu8t/NF1B74c0Xe844Tb0tI6tGV5p+", "MACJW");
        i.lIllIlllllIll[i.lIllIlllllllI[8]] = i.llIIlIIllllllIl("ylr/vswOZ2ZT4/e5sGcoUg==", "iMgdr");
        i.lIllIlllllIll[i.lIllIlllllllI[9]] = i.llIIlIIllllllIl("6Zxnnc/a9onE7EGJ0Y6M7g==", "VpAJs");
        i.lIllIlllllIll[i.lIllIlllllllI[10]] = i.llIIlIIllllllIl("hQ3DBEbWSpFD9i53c3Jvd7CVtXamVcot", "jPCDP");
        i.lIllIlllllIll[i.lIllIlllllllI[11]] = i.llIIlIIllllllIl("3nyVCwrPcacjOF4VmJbzUKhAdlyDGqNn", "JGVGb");
        i.lIllIlllllIll[i.lIllIlllllllI[12]] = i.llIIlIlIIIIlIll("Nwg9Pw==", "yGszt");
        i.lIllIlllllIll[i.lIllIlllllllI[13]] = i.llIIlIIllllllII("+TUGQHOshQ4=", "sfJwZ");
    }
}

