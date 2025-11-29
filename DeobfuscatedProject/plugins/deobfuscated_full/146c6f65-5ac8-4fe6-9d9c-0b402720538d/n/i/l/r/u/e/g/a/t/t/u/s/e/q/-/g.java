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
        g.llIlIIIIlIIl[0] = (203 + 114 - 113 + 14 ^ 76 + 81 - 89 + 87) & (0x39 ^ 2 ^ (0x25 ^ 0x5F) ^ -1);
        g.llIlIIIIlIIl[1] = 2;
        g.llIlIIIIlIIl[2] = 1;
        g.llIlIIIIlIIl[3] = 0xBB ^ 0xAB;
        g.llIlIIIIlIIl[4] = 0xFFFFA77E & 0x7BCB;
        g.llIlIIIIlIIl[5] = -(0xFFFFDCFE & 0x6B25) & (0xFFFFFB7F & 0x6FFB);
        g.llIlIIIIlIIl[6] = -(0xFFFFCF57 & 0x38AF) & (0xFFFFEB4F & 0x3FFF);
        g.llIlIIIIlIIl[7] = 0xFFFFFB57 & 0x27FF;
        g.llIlIIIIlIIl[8] = 149 + 31 - 145 + 159 ^ 141 + 16 - 15 + 56;
        g.llIlIIIIlIIl[9] = -(0xFFFFF0FB & 0x5FA7) & (0xFFFFF3EE & 0x7FFB);
        g.llIlIIIIlIIl[10] = 0xFFFFA3F6 & 0x7F5F;
        g.llIlIIIIlIIl[11] = 3;
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
            0;
            if (((180 + 7 - 46 + 56 ^ 142 + 2 - 95 + 102) & (1 ^ (0x69 ^ 0x3A) ^ -1)) != 0) {
                return ((0xDF ^ 0xA3 ^ (0xF4 ^ 0xA7)) & (135 + 47 - 44 + 3 ^ 23 + 19 - 20 + 140 ^ -1)) != 0;
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

    private static String lIIIIIIIllIIlll(String var2, String var12) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIlIIIIlIIl[12]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIlIIIIlIIl[1], var15);
            return new String(var14.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
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
        g.llIlIIIIlIII[g.llIlIIIIlIIl[0]] = g."DARK_BEAST";
        g.llIlIIIIlIII[g.llIlIIIIlIIl[2]] = g."DRAGON";
        g.llIlIIIIlIII[g.llIlIIIIlIIl[1]] = g."BEAR";
    }

    private static String lIIIIIIIllIIllI(String var3, String var1) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var19 = var1.toCharArray();
        int var9 = llIlIIIIlIIl[0];
        char[] var18 = var3.toCharArray();
        int var11 = var18.length;
        int var4 = llIlIIIIlIIl[0];
        while (g.lIIIIIIIllIlIlI(var4, var11)) {
            char var8 = var18[var4];
            var17.append((char)(var8 ^ var19[var9 % var19.length]));
            0;
            ++var9;
            ++var4;
            0;
            if (3 <= (0x80 ^ 0x84)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    public static g i(int n2) {
        void var6;
        g[] gArray = g.values();
        int n3 = gArray.length;
        int var10 = llIlIIIIlIIl[0];
        while (g.lIIIIIIIllIlIlI(var10, (int)var6)) {
            int var13;
            void var5;
            void var7 = var5[var10];
            if (!g.lIIIIIIIllIlIll(var7.am(), var13) || g.lIIIIIIIllIllII(var7.al(), var13)) {
                return var7;
            }
            ++var10;
            0;
            if (((151 + 117 - 193 + 91 ^ 12 + 84 - 61 + 108) & (0x47 ^ 0x37 ^ (0x12 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        return null;
    }

    public i an() {
        return this.drop;
    }
}

