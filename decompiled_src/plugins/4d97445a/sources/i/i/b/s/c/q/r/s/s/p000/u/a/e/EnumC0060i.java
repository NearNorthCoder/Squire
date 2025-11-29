package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/i.class */
public final class EnumC0060i {
    private static /* synthetic */ String[] lIllIIIlI;
    public static final /* synthetic */ EnumC0060i GHOSTS;
    private final /* synthetic */ Color textColor;
    private final /* synthetic */ Skill type;
    public static final /* synthetic */ EnumC0060i TRIPLE;
    public static final /* synthetic */ EnumC0060i LAVA;
    public static final /* synthetic */ EnumC0060i AUTO;
    private static /* synthetic */ int[] lIllIIIll;
    private static final /* synthetic */ EnumC0060i[] $VALUES;
    private final /* synthetic */ int tickDelay;
    public static final /* synthetic */ EnumC0060i SPAWNING;

    public static EnumC0060i valueOf(String str) {
        return (EnumC0060i) Enum.valueOf(EnumC0060i.class, str);
    }

    public int S() {
        return this.tickDelay;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Phase{type=" + this.type + ", tickDelay=" + this.tickDelay + ", textColor=" + this.textColor + "}";
    }

    public Color T() {
        return this.textColor;
    }

    private static String lIIllIlllll(String lIllllIllIIIIll, String lIllllIllIIIIlI) {
        try {
            SecretKeySpec lIllllIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIIll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIll[4], lIllllIllIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIllIIIlII) {
            lIllllIllIIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlllIIIIl();
        lIIlllIIIII();
        SPAWNING = new EnumC0060i(lIllIIIlI[lIllIIIll[0]], lIllIIIll[0], null, lIllIIIll[1], null);
        AUTO = new EnumC0060i(lIllIIIlI[lIllIIIll[2]], lIllIIIll[2], Skill.ATTACK, lIllIIIll[3], null);
        TRIPLE = new EnumC0060i(lIllIIIlI[lIllIIIll[4]], lIllIIIll[4], Skill.FLETCHING, lIllIIIll[3], new Color(lIllIIIll[5], lIllIIIll[6], lIllIIIll[7]));
        GHOSTS = new EnumC0060i(lIllIIIlI[lIllIIIll[8]], lIllIIIll[8], Skill.PRAYER, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[7], lIllIIIll[7]));
        LAVA = new EnumC0060i(lIllIIIlI[lIllIIIll[1]], lIllIIIll[1], Skill.FIREMAKING, lIllIIIll[9], new Color(lIllIIIll[7], lIllIIIll[5], lIllIIIll[5]));
        EnumC0060i[] enumC0060iArr = new EnumC0060i[lIllIIIll[10]];
        enumC0060iArr[lIllIIIll[0]] = SPAWNING;
        enumC0060iArr[lIllIIIll[2]] = AUTO;
        enumC0060iArr[lIllIIIll[4]] = TRIPLE;
        enumC0060iArr[lIllIIIll[8]] = GHOSTS;
        enumC0060iArr[lIllIIIll[1]] = LAVA;
        $VALUES = enumC0060iArr;
    }

    public Skill L() {
        return this.type;
    }

    private EnumC0060i(String str, int i2, Skill skill, int i3, Color color) {
        this.type = skill;
        this.tickDelay = i3;
        this.textColor = color;
    }

    private static void lIIlllIIIIl() {
        lIllIIIll = new int[11];
        lIllIIIll[0] = (64 ^ 108) & ((73 ^ 101) ^ (-1));
        lIllIIIll[1] = (((118 + 172) - 262) + 153) ^ (((38 + 142) - 47) + 44);
        lIllIIIll[2] = " ".length();
        lIllIIIll[3] = (161 ^ 192) ^ (126 ^ 25);
        lIllIIIll[4] = "  ".length();
        lIllIIIll[5] = ((16 + 74) - 73) + 136;
        lIllIIIll[6] = (((((7 + 131) - 1) + 16) + (107 ^ 114)) - (-(77 ^ 83))) + (103 ^ 97);
        lIllIIIll[7] = ((235 + 144) - 364) + 240;
        lIllIIIll[8] = "   ".length();
        lIllIIIll[9] = 46 ^ 38;
        lIllIIIll[10] = 191 ^ 186;
    }

    private static void lIIlllIIIII() {
        lIllIIIlI = new String[lIllIIIll[10]];
        lIllIIIlI[lIllIIIll[0]] = lIIllIllllI("QWQQ3QtJch44l4uCDUJqng==", "AIhFC");
        lIllIIIlI[lIllIIIll[2]] = lIIllIlllll("SmzRKahGkzo=", "jUmBY");
        lIllIIIlI[lIllIIIll[4]] = lIIllIllllI("voSRIklkp9Y=", "jNSFw");
        lIllIIIlI[lIllIIIll[8]] = lIIllIlllll("8I9ILRAb+6o=", "HKXhE");
        lIllIIIlI[lIllIIIll[1]] = lIIllIllllI("21J7E01Z/PQ=", "hVchb");
    }

    public static EnumC0060i[] values() {
        return (EnumC0060i[]) $VALUES.clone();
    }

    private static String lIIllIllllI(String lIllllIllIlIIII, String lIllllIllIIllll) {
        try {
            SecretKeySpec lIllllIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIll[4], lIllllIllIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIllIlIIIl) {
            lIllllIllIlIIIl.printStackTrace();
            return null;
        }
    }
}
