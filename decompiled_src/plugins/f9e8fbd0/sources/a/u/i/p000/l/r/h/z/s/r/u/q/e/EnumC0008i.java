package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.i  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/i.class */
public final class EnumC0008i {
    private static final /* synthetic */ EnumC0008i[] $VALUES;
    private final /* synthetic */ Skill skill;
    public static final /* synthetic */ EnumC0008i NONE;
    public static final /* synthetic */ EnumC0008i DIVINE_BASTION;
    private static /* synthetic */ int[] lIllIlllllllI;
    public static final /* synthetic */ EnumC0008i RANGING_POTION;
    public static final /* synthetic */ EnumC0008i BASTION_POTION;
    private final /* synthetic */ String name;
    private static /* synthetic */ String[] lIllIlllllIll;
    public static final /* synthetic */ EnumC0008i MAGIC_POTION;
    public static final /* synthetic */ EnumC0008i DIVINE_RANGING;
    public static final /* synthetic */ EnumC0008i DIVINE_MAGIC_POTION;

    static {
        llIIlIlIIIIllIl();
        llIIlIlIIIIllII();
        RANGING_POTION = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[2]], lIllIlllllllI[2], lIllIlllllIll[lIllIlllllllI[0]], Skill.RANGED);
        DIVINE_RANGING = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[3]], lIllIlllllllI[0], lIllIlllllIll[lIllIlllllllI[4]], Skill.RANGED);
        BASTION_POTION = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[5]], lIllIlllllllI[3], lIllIlllllIll[lIllIlllllllI[6]], Skill.RANGED);
        DIVINE_BASTION = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[1]], lIllIlllllllI[4], lIllIlllllIll[lIllIlllllllI[7]], Skill.RANGED);
        MAGIC_POTION = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[8]], lIllIlllllllI[5], lIllIlllllIll[lIllIlllllllI[9]], Skill.MAGIC);
        DIVINE_MAGIC_POTION = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[10]], lIllIlllllllI[6], lIllIlllllIll[lIllIlllllllI[11]], Skill.MAGIC);
        NONE = new EnumC0008i(lIllIlllllIll[lIllIlllllllI[12]], lIllIlllllllI[1], lIllIlllllIll[lIllIlllllllI[13]], null);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lIllIlllllllI[7]];
        enumC0008iArr[lIllIlllllllI[2]] = RANGING_POTION;
        enumC0008iArr[lIllIlllllllI[0]] = DIVINE_RANGING;
        enumC0008iArr[lIllIlllllllI[3]] = BASTION_POTION;
        enumC0008iArr[lIllIlllllllI[4]] = DIVINE_BASTION;
        enumC0008iArr[lIllIlllllllI[5]] = MAGIC_POTION;
        enumC0008iArr[lIllIlllllllI[6]] = DIVINE_MAGIC_POTION;
        enumC0008iArr[lIllIlllllllI[1]] = NONE;
        $VALUES = enumC0008iArr;
    }

    private static boolean llIIlIlIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    private static boolean llIIlIlIIIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlIlIIIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIlIIllllllIl(String llllllllllllllIllIIIIlllIlIIlIll, String llllllllllllllIllIIIIlllIlIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlllllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIlllIlIIIlll) {
            llllllllllllllIllIIIIlllIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIIlIlIIIIlIll(String llllllllllllllIllIIIIlllIllIllIl, String llllllllllllllIllIIIIlllIllIllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIIlllIllIlIll = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIIlllIllIllII.toCharArray();
        int llllllllllllllIllIIIIlllIllIlIIl = lIllIlllllllI[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlllllllI[2];
        while (llIIlIlIIIlIIIl(i, length)) {
            llllllllllllllIllIIIIlllIllIlIll.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIIlllIllIlIIl % charArray.length]));
            "".length();
            llllllllllllllIllIIIIlllIllIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIIlllIllIlIll);
    }

    private static boolean llIIlIlIIIIlllI(Object obj) {
        return obj == null;
    }

    private static void llIIlIlIIIIllIl() {
        lIllIlllllllI = new int[15];
        lIllIlllllllI[0] = " ".length();
        lIllIlllllllI[1] = 138 ^ 140;
        lIllIlllllllI[2] = (35 ^ 67) & ((30 ^ 126) ^ (-1));
        lIllIlllllllI[3] = "  ".length();
        lIllIlllllllI[4] = "   ".length();
        lIllIlllllllI[5] = 20 ^ 16;
        lIllIlllllllI[6] = (((141 + 54) - 46) + 5) ^ (((86 + 55) - (-3)) + 15);
        lIllIlllllllI[7] = 189 ^ 186;
        lIllIlllllllI[8] = 75 ^ 67;
        lIllIlllllllI[9] = (((182 + 183) - 314) + 150) ^ (((182 + 153) - 283) + 140);
        lIllIlllllllI[10] = 155 ^ 145;
        lIllIlllllllI[11] = 47 ^ 36;
        lIllIlllllllI[12] = 65 ^ 77;
        lIllIlllllllI[13] = 143 ^ 130;
        lIllIlllllllI[14] = (((128 + 33) - 93) + 106) ^ (((147 + 55) - 165) + 123);
    }

    public String k() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean v() {
        int i;
        if (llIIlIlIIIIlllI(this.skill)) {
            return lIllIlllllllI[0];
        }
        int boostedLevel = Skills.getBoostedLevel(this.skill);
        int level = Skills.getLevel(this.skill);
        if (llIIlIlIIIIllll(this, MAGIC_POTION)) {
            i = lIllIlllllllI[0];
            "".length();
            if ("  ".length() < ((53 ^ 22) & ((146 ^ 177) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIllIlllllllI[1];
        }
        if (llIIlIlIIIlIIII(boostedLevel, level + i)) {
            ?? r0 = lIllIlllllllI[0];
            "".length();
            return (-"   ".length()) >= 0 ? ((5 ^ 79) ^ (21 ^ 1)) & ((" ".length() ^ (106 ^ 53)) ^ (-" ".length())) : r0;
        }
        return lIllIlllllllI[2];
    }

    private EnumC0008i(String str, int i, String str2, Skill skill) {
        this.name = str2;
        this.skill = skill;
    }

    private static String llIIlIIllllllII(String llllllllllllllIllIIIIlllIlIllIII, String llllllllllllllIllIIIIlllIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIlllllllI[8]), "DES");
            Cipher llllllllllllllIllIIIIlllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIIIlllIlIllIlI.init(lIllIlllllllI[3], secretKeySpec);
            return new String(llllllllllllllIllIIIIlllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIlllIlIllIIl) {
            llllllllllllllIllIIIIlllIlIllIIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private static void llIIlIlIIIIllII() {
        lIllIlllllIll = new String[lIllIlllllllI[14]];
        lIllIlllllIll[lIllIlllllllI[2]] = llIIlIIllllllII("GHilZdlCfD23dJdHxNMAAA==", "NQqBr");
        lIllIlllllIll[lIllIlllllllI[0]] = llIIlIIllllllII("jlF/XeJ0bFwyUIt6A1FcCw==", "VrhFL");
        lIllIlllllIll[lIllIlllllllI[3]] = llIIlIIllllllIl("ZVNsqTkcsCFe1qPN2VRX1g==", "Hysml");
        lIllIlllllIll[lIllIlllllllI[4]] = llIIlIIllllllII("h9S6uVP/8EUl267cPZGqwvrY4MHA5YSr", "jNrGD");
        lIllIlllllIll[lIllIlllllllI[5]] = llIIlIIllllllII("ra5cL6cLd+N6DP9mEobtug==", "SuyzK");
        lIllIlllllIll[lIllIlllllllI[6]] = llIIlIIllllllIl("Bcvy2bNQ4DSwNCTPB6ZSTQ==", "YXymW");
        lIllIlllllIll[lIllIlllllllI[1]] = llIIlIIllllllIl("xe0V1eyrLJ3kq6H+bY0tjQ==", "fyQNb");
        lIllIlllllIll[lIllIlllllllI[7]] = llIIlIIllllllII("wkvu8t/NF1B74c0Xe844Tb0tI6tGV5p+", "MACJW");
        lIllIlllllIll[lIllIlllllllI[8]] = llIIlIIllllllIl("ylr/vswOZ2ZT4/e5sGcoUg==", "iMgdr");
        lIllIlllllIll[lIllIlllllllI[9]] = llIIlIIllllllIl("6Zxnnc/a9onE7EGJ0Y6M7g==", "VpAJs");
        lIllIlllllIll[lIllIlllllllI[10]] = llIIlIIllllllIl("hQ3DBEbWSpFD9i53c3Jvd7CVtXamVcot", "jPCDP");
        lIllIlllllIll[lIllIlllllllI[11]] = llIIlIIllllllIl("3nyVCwrPcacjOF4VmJbzUKhAdlyDGqNn", "JGVGb");
        lIllIlllllIll[lIllIlllllllI[12]] = llIIlIlIIIIlIll("Nwg9Pw==", "yGszt");
        lIllIlllllIll[lIllIlllllllI[13]] = llIIlIIllllllII("+TUGQHOshQ4=", "sfJwZ");
    }
}
