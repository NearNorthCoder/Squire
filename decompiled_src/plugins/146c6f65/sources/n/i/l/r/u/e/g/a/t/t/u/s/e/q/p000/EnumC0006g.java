package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.WidgetInfo;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/g.class */
public final class EnumC0006g {
    public static final /* synthetic */ EnumC0006g BEAR;
    private final /* synthetic */ WidgetInfo widgetInfo;
    private final /* synthetic */ EnumC0008i drop;
    public static final /* synthetic */ EnumC0006g DARK_BEAST;
    private static /* synthetic */ int[] llIlIIIIlIIl;
    public static final /* synthetic */ EnumC0006g DRAGON;
    private static final /* synthetic */ EnumC0006g[] $VALUES;
    private final /* synthetic */ int range;
    private final /* synthetic */ Prayer defensive;
    private final /* synthetic */ int corruptedId;
    private final /* synthetic */ int normalId;
    private static /* synthetic */ String[] llIlIIIIlIII;

    public int am() {
        return this.corruptedId;
    }

    private static boolean lIIIIIIIllIlIll(int i, int i2) {
        return i != i2;
    }

    private static void lIIIIIIIllIlIIl() {
        llIlIIIIlIIl = new int[13];
        llIlIIIIlIIl[0] = ((((203 + 114) - 113) + 14) ^ (((76 + 81) - 89) + 87)) & (((57 ^ 2) ^ (37 ^ 95)) ^ (-" ".length()));
        llIlIIIIlIIl[1] = "  ".length();
        llIlIIIIlIIl[2] = " ".length();
        llIlIIIIlIIl[3] = 187 ^ 171;
        llIlIIIIlIIl[4] = (-22658) & 31691;
        llIlIIIIlIIl[5] = (-((-8962) & 27429)) & (-1153) & 28667;
        llIlIIIIlIIl[6] = (-((-12457) & 14511)) & (-5297) & 16383;
        llIlIIIIlIIl[7] = (-1193) & 10239;
        llIlIIIIlIIl[8] = (((149 + 31) - 145) + 159) ^ (((141 + 16) - 15) + 56);
        llIlIIIIlIIl[9] = (-((-3845) & 24487)) & (-3090) & 32763;
        llIlIIIIlIIl[10] = (-23562) & 32607;
        llIlIIIIlIIl[11] = "   ".length();
        llIlIIIIlIIl[12] = 161 ^ 169;
    }

    private static boolean lIIIIIIIllIlIlI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0006g valueOf(String str) {
        return (EnumC0006g) Enum.valueOf(EnumC0006g.class, str);
    }

    public WidgetInfo aj() {
        return this.widgetInfo;
    }

    public Prayer ai() {
        return this.defensive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean f(NPC npc) {
        if (!lIIIIIIIllIlIll(npc.getId(), this.normalId) || lIIIIIIIllIllII(npc.getId(), this.corruptedId)) {
            ?? r0 = llIlIIIIlIIl[2];
            "".length();
            return (((((180 + 7) - 46) + 56) ^ (((142 + 2) - 95) + 102)) & ((" ".length() ^ (105 ^ 58)) ^ (-" ".length()))) != 0 ? ((223 ^ 163) ^ (244 ^ 167)) & (((((135 + 47) - 44) + 3) ^ (((23 + 19) - 20) + 140)) ^ (-" ".length())) : r0;
        }
        return llIlIIIIlIIl[0];
    }

    static {
        lIIIIIIIllIlIIl();
        lIIIIIIIllIlIII();
        DARK_BEAST = new EnumC0006g(llIlIIIIlIII[llIlIIIIlIIl[0]], llIlIIIIlIIl[0], Prayer.PROTECT_FROM_MISSILES, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES, llIlIIIIlIIl[3], llIlIIIIlIIl[4], llIlIIIIlIIl[5], EnumC0008i.CRYSTALLINE_BOWSTRING);
        DRAGON = new EnumC0006g(llIlIIIIlIII[llIlIIIIlIIl[2]], llIlIIIIlIIl[2], Prayer.PROTECT_FROM_MAGIC, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC, llIlIIIIlIIl[3], llIlIIIIlIIl[6], llIlIIIIlIIl[7], EnumC0008i.CRYSTAL_ORB);
        BEAR = new EnumC0006g(llIlIIIIlIII[llIlIIIIlIIl[1]], llIlIIIIlIIl[1], Prayer.PROTECT_FROM_MELEE, WidgetInfo.PRAYER_PROTECT_FROM_MELEE, llIlIIIIlIIl[8], llIlIIIIlIIl[9], llIlIIIIlIIl[10], null);
        EnumC0006g[] enumC0006gArr = new EnumC0006g[llIlIIIIlIIl[11]];
        enumC0006gArr[llIlIIIIlIIl[0]] = DARK_BEAST;
        enumC0006gArr[llIlIIIIlIIl[2]] = DRAGON;
        enumC0006gArr[llIlIIIIlIIl[1]] = BEAR;
        $VALUES = enumC0006gArr;
    }

    private EnumC0006g(String str, int i, Prayer prayer, WidgetInfo widgetInfo, int i2, int i3, int i4, EnumC0008i enumC0008i) {
        this.defensive = prayer;
        this.widgetInfo = widgetInfo;
        this.range = i2;
        this.normalId = i3;
        this.corruptedId = i4;
        this.drop = enumC0008i;
    }

    public int al() {
        return this.normalId;
    }

    private static boolean lIIIIIIIllIllII(int i, int i2) {
        return i == i2;
    }

    private static String lIIIIIIIllIIlll(String lllllllllllllllIlIIIllIlllllIlII, String lllllllllllllllIlIIIllIlllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlllllIIll.getBytes(StandardCharsets.UTF_8)), llIlIIIIlIIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIIlIIl[1], lllllllllllllllIlIIIllIlllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIlllllIlIl) {
            lllllllllllllllIlIIIllIlllllIlIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0006g[] values() {
        return (EnumC0006g[]) $VALUES.clone();
    }

    public int[] ah() {
        int[] iArr = new int[llIlIIIIlIIl[1]];
        iArr[llIlIIIIlIIl[0]] = this.normalId;
        iArr[llIlIIIIlIIl[2]] = this.corruptedId;
        return iArr;
    }

    public int ak() {
        return this.range;
    }

    private static void lIIIIIIIllIlIII() {
        llIlIIIIlIII = new String[llIlIIIIlIIl[11]];
        llIlIIIIlIII[llIlIIIIlIIl[0]] = lIIIIIIIllIIllI("NRIROB0zFgIgFg==", "qSCsB");
        llIlIIIIlIII[llIlIIIIlIIl[2]] = lIIIIIIIllIIllI("EB8uHjUa", "TMoYz");
        llIlIIIIlIII[llIlIIIIlIIl[1]] = lIIIIIIIllIIlll("XWj6SjRzvlQ=", "xxWqx");
    }

    private static String lIIIIIIIllIIllI(String lllllllllllllllIlIIIllIllllIIlII, String lllllllllllllllIlIIIllIllllIIIll) {
        String lllllllllllllllIlIIIllIllllIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIllllIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIllIllllIIIll.toCharArray();
        int lllllllllllllllIlIIIllIllllIIIII = llIlIIIIlIIl[0];
        char[] charArray2 = lllllllllllllllIlIIIllIllllIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIlIIl[0];
        while (lIIIIIIIllIlIlI(i, length)) {
            char lllllllllllllllIlIIIllIllllIIlIl = charArray2[i];
            lllllllllllllllIlIIIllIllllIIIlI.append((char) (lllllllllllllllIlIIIllIllllIIlIl ^ charArray[lllllllllllllllIlIIIllIllllIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIIllIllllIIIII++;
            i++;
            "".length();
            if ("   ".length() > (128 ^ 132)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIllIllllIIIlI);
    }

    public static EnumC0006g i(int lllllllllllllllIlIIIlllIIIIIIlII) {
        EnumC0006g[] values = values();
        int length = values.length;
        int i = llIlIIIIlIIl[0];
        while (lIIIIIIIllIlIlI(i, length)) {
            EnumC0006g enumC0006g = values[i];
            if (!lIIIIIIIllIlIll(enumC0006g.am(), lllllllllllllllIlIIIlllIIIIIIlII) || lIIIIIIIllIllII(enumC0006g.al(), lllllllllllllllIlIIIlllIIIIIIlII)) {
                return enumC0006g;
            }
            i++;
            "".length();
            if ((((((151 + 117) - 193) + 91) ^ (((12 + 84) - 61) + 108)) & (((71 ^ 55) ^ (18 ^ 75)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return null;
    }

    public EnumC0008i an() {
        return this.drop;
    }
}
