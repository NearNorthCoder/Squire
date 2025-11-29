/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import gg.squire.cox.SquireChambersConfig;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;

public class c_Unknown
extends InfoBox {
    private final /* synthetic */ SquireChambersConfig k;
    private /* synthetic */ LocalTime m;
    private /* synthetic */ LocalTime o;
    private /* synthetic */ LocalTime q;
    private static /* synthetic */ String[] lIlIIIlllIlI;
    private /* synthetic */ LocalTime n;
    private /* synthetic */ Instant l;
    private /* synthetic */ boolean r;
    private final /* synthetic */ Instant j;
    private static /* synthetic */ int[] lIlIIIlllIll;
    private /* synthetic */ LocalTime p;

    private static void llIlIlllIIlllI() {
        lIlIIIlllIlI = new String[lIlIIIlllIll[13]];
        c.lIlIIIlllIlI[c.lIlIIIlllIll[0]] = c."";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[1]] = c."HH:mm";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[2]] = c."mm:ss";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[3]] = c."Elapsed raid time: ";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[4]] = c."HH:mm:ss";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[5]] = c."</br>First floor: ";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[6]] = c."mm:ss";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[7]] = c."</br>Second floor: ";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[8]] = c."mm:ss";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[9]] = c."</br>Third floor: ";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[10]] = c."mm:ss";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[11]] = c."</br>Olm: ";
        c.lIlIIIlllIlI[c.lIlIIIlllIll[12]] = c."mm:ss";
    }

    public String getText() {
        c var13;
        if (c.llIlIlllIlIIII(this.j)) {
            return lIlIIIlllIlI[lIlIIIlllIll[0]];
        }
        if (c.llIlIlllIlIIIl(var13.r ? 1 : 0)) {
            Duration var7 = Duration.between(var13.j, Instant.now());
            var13.m = LocalTime.ofSecondOfDay(var7.getSeconds());
        }
        if (c.llIlIlllIlIIlI(var13.m.getHour())) {
            return var13.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[1]]));
        }
        return this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[2]]));
    }

    public void o() {
        Duration duration = Duration.between(this.l, Instant.now());
        this.q = LocalTime.ofSecondOfDay(duration.getSeconds());
    }

    static {
        c.llIlIlllIIllll();
        c.llIlIlllIIlllI();
    }

    private static boolean llIlIlllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public void a(boolean bl2) {
        this.r = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public String getTooltip() {
        void var19;
        c var3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lIlIIIlllIlI[lIlIIIlllIll[3]]);
        0;
        stringBuilder.append(this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[4]])));
        0;
        if (c.llIlIlllIlIlII(this.n)) {
            stringBuilder.append(lIlIIIlllIlI[lIlIIIlllIll[5]]);
            0;
            stringBuilder.append(this.n.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[6]])));
            0;
        }
        if (c.llIlIlllIlIlII(var3.o)) {
            var19.append(lIlIIIlllIlI[lIlIIIlllIll[7]]);
            0;
            var19.append(var3.o.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[8]])));
            0;
        }
        if (c.llIlIlllIlIlII(var3.p)) {
            var19.append(lIlIIIlllIlI[lIlIIIlllIll[9]]);
            0;
            var19.append(var3.p.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[10]])));
            0;
        }
        if (c.llIlIlllIlIlII(var3.q)) {
            var19.append(lIlIIIlllIlI[lIlIIIlllIll[11]]);
            0;
            var19.append(var3.q.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[12]])));
            0;
        }
        return String.valueOf(stringBuilder);
    }

    private static boolean llIlIlllIlIIll(int n2) {
        return n2 != 0;
    }

    public Color getTextColor() {
        if (c.llIlIlllIlIIll(this.r ? 1 : 0)) {
            return Color.GREEN;
        }
        return Color.WHITE;
    }

    private static String llIlIlllIIllII(String var11, String var18) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIIlllIll[2], var21);
            return new String(var8.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIlIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public void n() {
        void var22;
        c var12;
        Duration duration = Duration.between(this.l, Instant.now());
        if (c.llIlIlllIlIIII(this.n)) {
            this.n = LocalTime.ofSecondOfDay(duration.getSeconds());
            0;
            if (-(0xE ^ 0x15 ^ (0x83 ^ 0x9D)) >= 0) {
                return;
            }
        } else if (c.llIlIlllIlIIII(var12.o)) {
            var12.o = LocalTime.ofSecondOfDay(var22.getSeconds());
            0;
            if (((0x6F ^ 0x1E ^ (0xD1 ^ 0x86)) & (163 + 42 - 40 + 22 ^ 107 + 7 - 10 + 53 ^ -1)) > 0) {
                return;
            }
        } else if (c.llIlIlllIlIIII(var12.p)) {
            var12.p = LocalTime.ofSecondOfDay(var22.getSeconds());
        }
        this.l = Instant.now();
    }

    private static boolean llIlIlllIlIlII(Object object) {
        return object != null;
    }

    private static boolean llIlIlllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIlllIIllIl(String var17, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIIIlllIll[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIIIlllIll[2], var16);
            return new String(var15.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String llIlIlllIIlIll(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var5 = var4.toCharArray();
        int var25 = lIlIIIlllIll[0];
        char[] var24 = var6.toCharArray();
        int var1 = var24.length;
        int var2 = lIlIIIlllIll[0];
        while (c.llIlIlllIlIlIl(var2, var1)) {
            char var9 = var24[var2];
            var10.append((char)(var9 ^ var5[var25 % var5.length]));
            0;
            ++var25;
            ++var2;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void llIlIlllIIllll() {
        lIlIIIlllIll = new int[14];
        c.lIlIIIlllIll[0] = (9 ^ 0x5A ^ (1 ^ 0x1C) & ~(0x18 ^ 5)) & (0x82 ^ 0xB6 ^ (0xC ^ 0x6B) ^ -1);
        c.lIlIIIlllIll[1] = 1;
        c.lIlIIIlllIll[2] = 2;
        c.lIlIIIlllIll[3] = 3;
        c.lIlIIIlllIll[4] = 21 + 21 - -17 + 73 ^ 90 + 40 - 104 + 102;
        c.lIlIIIlllIll[5] = 127 + 146 - 236 + 114 ^ 134 + 21 - 26 + 17;
        c.lIlIIIlllIll[6] = 166 + 182 - 177 + 21 ^ 66 + 36 - 20 + 116;
        c.lIlIIIlllIll[7] = 5 ^ 2;
        c.lIlIIIlllIll[8] = 0x30 ^ 1 ^ (0x6A ^ 0x53);
        c.lIlIIIlllIll[9] = 0x7F ^ 0x47 ^ (0x71 ^ 0x40);
        c.lIlIIIlllIll[10] = 0x4E ^ 0x3A ^ (0xEE ^ 0x90);
        c.lIlIIIlllIll[11] = 0x20 ^ 0x16 ^ (0x8F ^ 0xB2);
        c.lIlIIIlllIll[12] = 0x2E ^ 0x49 ^ (0x3C ^ 0x57);
        c.lIlIIIlllIll[13] = 4 ^ 9;
    }

    private static boolean llIlIlllIlIIlI(int n2) {
        return n2 > 0;
    }

    public c(Plugin plugin, Instant instant, SquireChambersConfig squireChambersConfig) {
        super(null, plugin);
        this.j = instant;
        this.k = squireChambersConfig;
        this.l = instant;
        this.r = lIlIIIlllIll[0];
    }
}

