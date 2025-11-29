/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.WidgetInfo
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.WidgetInfo;

public final class g
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g BEAR;
    private final /* synthetic */ WidgetInfo widgetInfo;
    private final /* synthetic */ i drop;
    public static final /* synthetic */ /* enum */ g DARK_BEAST;
    private static /* synthetic */ int[] llIlIIIIlIIl;
    public static final /* synthetic */ /* enum */ g DRAGON;
    private static final /* synthetic */ g[] $VALUES;
    private final /* synthetic */ int range;
    private final /* synthetic */ Prayer defensive;
    private final /* synthetic */ int corruptedId;
    private final /* synthetic */ int normalId;
    private static /* synthetic */ String[] llIlIIIIlIII;

    public int am() {
        return this.corruptedId;
    }

    private static boolean lIIIIIIIllIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIIIIIllIlIIl() {
        llIlIIIIlIIl = new int[13];
        g.llIlIIIIlIIl[0] = (203 + 114 - 113 + 14 ^ 76 + 81 - 89 + 87) & (0x39 ^ 2 ^ (0x25 ^ 0x5F) ^ -" ".length());
        g.llIlIIIIlIIl[1] = "  ".length();
        g.llIlIIIIlIIl[2] = " ".length();
        g.llIlIIIIlIIl[3] = 0xBB ^ 0xAB;
        g.llIlIIIIlIIl[4] = 0xFFFFA77E & 0x7BCB;
        g.llIlIIIIlIIl[5] = -(0xFFFFDCFE & 0x6B25) & (0xFFFFFB7F & 0x6FFB);
        g.llIlIIIIlIIl[6] = -(0xFFFFCF57 & 0x38AF) & (0xFFFFEB4F & 0x3FFF);
        g.llIlIIIIlIIl[7] = 0xFFFFFB57 & 0x27FF;
        g.llIlIIIIlIIl[8] = 149 + 31 - 145 + 159 ^ 141 + 16 - 15 + 56;
        g.llIlIIIIlIIl[9] = -(0xFFFFF0FB & 0x5FA7) & (0xFFFFF3EE & 0x7FFB);
        g.llIlIIIIlIIl[10] = 0xFFFFA3F6 & 0x7F5F;
        g.llIlIIIIlIIl[11] = "   ".length();
        g.llIlIIIIlIIl[12] = 0xA1 ^ 0xA9;
    }

    private static boolean lIIIIIIIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public WidgetInfo aj() {
        return this.widgetInfo;
    }

    public Prayer ai() {
        return this.defensive;
    }

    public boolean f(NPC nPC) {
        boolean bl;
        if (!g.lIIIIIIIllIlIll(nPC.getId(), this.normalId) || g.lIIIIIIIllIllII(nPC.getId(), this.corruptedId)) {
            bl = llIlIIIIlIIl[2];
            "".length();
            if (((180 + 7 - 46 + 56 ^ 142 + 2 - 95 + 102) & (" ".length() ^ (0x69 ^ 0x3A) ^ -" ".length())) != 0) {
                return ((0xDF ^ 0xA3 ^ (0xF4 ^ 0xA7)) & (135 + 47 - 44 + 3 ^ 23 + 19 - 20 + 140 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIlIIl[0];
        }
        return bl;
    }

    static {
        g.lIIIIIIIllIlIIl();
        g.lIIIIIIIllIlIII();
        DARK_BEAST = new g(Prayer.PROTECT_FROM_MISSILES, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES, llIlIIIIlIIl[3], llIlIIIIlIIl[4], llIlIIIIlIIl[5], i.CRYSTALLINE_BOWSTRING);
        DRAGON = new g(Prayer.PROTECT_FROM_MAGIC, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC, llIlIIIIlIIl[3], llIlIIIIlIIl[6], llIlIIIIlIIl[7], i.CRYSTAL_ORB);
        BEAR = new g(Prayer.PROTECT_FROM_MELEE, WidgetInfo.PRAYER_PROTECT_FROM_MELEE, llIlIIIIlIIl[8], llIlIIIIlIIl[9], llIlIIIIlIIl[10], null);
        g[] gArray = new g[llIlIIIIlIIl[11]];
        gArray[g.llIlIIIIlIIl[0]] = DARK_BEAST;
        gArray[g.llIlIIIIlIIl[2]] = DRAGON;
        gArray[g.llIlIIIIlIIl[1]] = BEAR;
        $VALUES = gArray;
    }

    private g(Prayer prayer, WidgetInfo widgetInfo, int n3, int n4, int n5, i i2) {
        this.defensive = prayer;
        this.widgetInfo = widgetInfo;
        this.range = n3;
        this.normalId = n4;
        this.corruptedId = n5;
        this.drop = i2;
    }

    public int al() {
        return this.normalId;
    }

    private static boolean lIIIIIIIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIIIIIllIIlll(String lllllllllllllllIlIIIllIlllllIlII, String lllllllllllllllIlIIIllIlllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlllllIIll.getBytes(StandardCharsets.UTF_8)), llIlIIIIlIIl[12]), "DES");
            Cipher lllllllllllllllIlIIIllIlllllIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIlllllIllI.init(llIlIIIIlIIl[1], lllllllllllllllIlIIIllIlllllIlll);
            return new String(lllllllllllllllIlIIIllIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIlllllIlIl) {
            lllllllllllllllIlIIIllIlllllIlIl.printStackTrace();
            return null;
        }
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public int[] ah() {
        int[] nArray = new int[llIlIIIIlIIl[1]];
        nArray[g.llIlIIIIlIIl[0]] = this.normalId;
        nArray[g.llIlIIIIlIIl[2]] = this.corruptedId;
        return nArray;
    }

    public int ak() {
        return this.range;
    }

    private static void lIIIIIIIllIlIII() {
        llIlIIIIlIII = new String[llIlIIIIlIIl[11]];
        g.llIlIIIIlIII[g.llIlIIIIlIIl[0]] = g.lIIIIIIIllIIllI("NRIROB0zFgIgFg==", "qSCsB");
        g.llIlIIIIlIII[g.llIlIIIIlIIl[2]] = g.lIIIIIIIllIIllI("EB8uHjUa", "TMoYz");
        g.llIlIIIIlIII[g.llIlIIIIlIIl[1]] = g.lIIIIIIIllIIlll("XWj6SjRzvlQ=", "xxWqx");
    }

    private static String lIIIIIIIllIIllI(String lllllllllllllllIlIIIllIlllIlllll, String lllllllllllllllIlIIIllIllllIIIll) {
        lllllllllllllllIlIIIllIlllIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIllllIIIlI = new StringBuilder();
        char[] lllllllllllllllIlIIIllIllllIIIIl = lllllllllllllllIlIIIllIllllIIIll.toCharArray();
        int lllllllllllllllIlIIIllIllllIIIII = llIlIIIIlIIl[0];
        char[] lllllllllllllllIlIIIllIlllIllIlI = lllllllllllllllIlIIIllIlllIlllll.toCharArray();
        int lllllllllllllllIlIIIllIlllIllIIl = lllllllllllllllIlIIIllIlllIllIlI.length;
        int lllllllllllllllIlIIIllIlllIllIII = llIlIIIIlIIl[0];
        while (g.lIIIIIIIllIlIlI(lllllllllllllllIlIIIllIlllIllIII, lllllllllllllllIlIIIllIlllIllIIl)) {
            char lllllllllllllllIlIIIllIllllIIlIl = lllllllllllllllIlIIIllIlllIllIlI[lllllllllllllllIlIIIllIlllIllIII];
            lllllllllllllllIlIIIllIllllIIIlI.append((char)(lllllllllllllllIlIIIllIllllIIlIl ^ lllllllllllllllIlIIIllIllllIIIIl[lllllllllllllllIlIIIllIllllIIIII % lllllllllllllllIlIIIllIllllIIIIl.length]));
            "".length();
            ++lllllllllllllllIlIIIllIllllIIIII;
            ++lllllllllllllllIlIIIllIlllIllIII;
            "".length();
            if ("   ".length() <= (0x80 ^ 0x84)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllIllllIIIlI);
    }

    /*
     * WARNING - void declaration
     */
    public static g i(int n2) {
        void lllllllllllllllIlIIIlllIIIIIIIlI;
        g[] gArray = g.values();
        int n3 = gArray.length;
        int lllllllllllllllIlIIIlllIIIIIIIIl = llIlIIIIlIIl[0];
        while (g.lIIIIIIIllIlIlI(lllllllllllllllIlIIIlllIIIIIIIIl, (int)lllllllllllllllIlIIIlllIIIIIIIlI)) {
            int lllllllllllllllIlIIIlllIIIIIIlII;
            void lllllllllllllllIlIIIlllIIIIIIIll;
            void lllllllllllllllIlIIIlllIIIIIIIII = lllllllllllllllIlIIIlllIIIIIIIll[lllllllllllllllIlIIIlllIIIIIIIIl];
            if (!g.lIIIIIIIllIlIll(lllllllllllllllIlIIIlllIIIIIIIII.am(), lllllllllllllllIlIIIlllIIIIIIlII) || g.lIIIIIIIllIllII(lllllllllllllllIlIIIlllIIIIIIIII.al(), lllllllllllllllIlIIIlllIIIIIIlII)) {
                return lllllllllllllllIlIIIlllIIIIIIIII;
            }
            ++lllllllllllllllIlIIIlllIIIIIIIIl;
            "".length();
            if (((151 + 117 - 193 + 91 ^ 12 + 84 - 61 + 108) & (0x47 ^ 0x37 ^ (0x12 ^ 0x4B) ^ -" ".length())) == 0) continue;
            return null;
        }
        return null;
    }

    public i an() {
        return this.drop;
    }
}

