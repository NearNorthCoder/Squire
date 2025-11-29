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

public class c
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
        c.lIlIIIlllIlI[c.lIlIIIlllIll[0]] = c.llIlIlllIIlIll("", "tdKit");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[1]] = c.llIlIlllIIllII("NMC0M05vXlk=", "vxdZh");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[2]] = c.llIlIlllIIllIl("cebuoPdaTRQ=", "AtFFv");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[3]] = c.llIlIlllIIlIll("Lis2KScOI3crNQIjdy09BiJteQ==", "kGWYT");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[4]] = c.llIlIlllIIllII("9ueX+f+gzzb33D1aYeb9uw==", "aeYvR");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[5]] = c.llIlIlllIIllII("vqdeHBtM6YGJ7sJm6t5k1FRl6J8tzYn7", "vOxXm");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[6]] = c.llIlIlllIIllII("d4yKjA8Tlqo=", "uMAhH");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[7]] = c.llIlIlllIIlIll("bn83H0QBNTYCFDZwMwEVPSJvTQ==", "RPUmz");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[8]] = c.llIlIlllIIlIll("Hh1uGRA=", "spTjc");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[9]] = c.llIlIlllIIllIl("3L5EWkQKmndBoDuBuKD+AJQ7IzYSCdbw", "AKXwi");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[10]] = c.llIlIlllIIlIll("BBhqFAM=", "iuPgp");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[11]] = c.llIlIlllIIllIl("Kj+sGSnKpHu9H94O76B7uw==", "HtcRj");
        c.lIlIIIlllIlI[c.lIlIIIlllIll[12]] = c.llIlIlllIIlIll("JyFYFj0=", "JLbeN");
    }

    public String getText() {
        c lllllllllllllllIllIllllIlIlllIlI;
        if (c.llIlIlllIlIIII(this.j)) {
            return lIlIIIlllIlI[lIlIIIlllIll[0]];
        }
        if (c.llIlIlllIlIIIl(lllllllllllllllIllIllllIlIlllIlI.r ? 1 : 0)) {
            Duration lllllllllllllllIllIllllIlIlllIIl = Duration.between(lllllllllllllllIllIllllIlIlllIlI.j, Instant.now());
            lllllllllllllllIllIllllIlIlllIlI.m = LocalTime.ofSecondOfDay(lllllllllllllllIllIllllIlIlllIIl.getSeconds());
        }
        if (c.llIlIlllIlIIlI(lllllllllllllllIllIllllIlIlllIlI.m.getHour())) {
            return lllllllllllllllIllIllllIlIlllIlI.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[1]]));
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
        void lllllllllllllllIllIllllIlIllIIll;
        c lllllllllllllllIllIllllIlIllIlII;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lIlIIIlllIlI[lIlIIIlllIll[3]]);
        "".length();
        stringBuilder.append(this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[4]])));
        "".length();
        if (c.llIlIlllIlIlII(this.n)) {
            stringBuilder.append(lIlIIIlllIlI[lIlIIIlllIll[5]]);
            "".length();
            stringBuilder.append(this.n.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[6]])));
            "".length();
        }
        if (c.llIlIlllIlIlII(lllllllllllllllIllIllllIlIllIlII.o)) {
            lllllllllllllllIllIllllIlIllIIll.append(lIlIIIlllIlI[lIlIIIlllIll[7]]);
            "".length();
            lllllllllllllllIllIllllIlIllIIll.append(lllllllllllllllIllIllllIlIllIlII.o.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[8]])));
            "".length();
        }
        if (c.llIlIlllIlIlII(lllllllllllllllIllIllllIlIllIlII.p)) {
            lllllllllllllllIllIllllIlIllIIll.append(lIlIIIlllIlI[lIlIIIlllIll[9]]);
            "".length();
            lllllllllllllllIllIllllIlIllIIll.append(lllllllllllllllIllIllllIlIllIlII.p.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[10]])));
            "".length();
        }
        if (c.llIlIlllIlIlII(lllllllllllllllIllIllllIlIllIlII.q)) {
            lllllllllllllllIllIllllIlIllIIll.append(lIlIIIlllIlI[lIlIIIlllIll[11]]);
            "".length();
            lllllllllllllllIllIllllIlIllIIll.append(lllllllllllllllIllIllllIlIllIlII.q.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[12]])));
            "".length();
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

    private static String llIlIlllIIllII(String lllllllllllllllIllIllllIlIIIIllI, String lllllllllllllllIllIllllIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllllIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllllIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllllIlIIIlIII.init(lIlIIIlllIll[2], lllllllllllllllIllIllllIlIIIlIIl);
            return new String(lllllllllllllllIllIllllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllllIlIIIIlll) {
            lllllllllllllllIllIllllIlIIIIlll.printStackTrace();
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
        void lllllllllllllllIllIllllIlIllllIl;
        c lllllllllllllllIllIllllIlIlllllI;
        Duration duration = Duration.between(this.l, Instant.now());
        if (c.llIlIlllIlIIII(this.n)) {
            this.n = LocalTime.ofSecondOfDay(duration.getSeconds());
            "".length();
            if (-(0xE ^ 0x15 ^ (0x83 ^ 0x9D)) >= 0) {
                return;
            }
        } else if (c.llIlIlllIlIIII(lllllllllllllllIllIllllIlIlllllI.o)) {
            lllllllllllllllIllIllllIlIlllllI.o = LocalTime.ofSecondOfDay(lllllllllllllllIllIllllIlIllllIl.getSeconds());
            "".length();
            if (((0x6F ^ 0x1E ^ (0xD1 ^ 0x86)) & (163 + 42 - 40 + 22 ^ 107 + 7 - 10 + 53 ^ -" ".length())) > 0) {
                return;
            }
        } else if (c.llIlIlllIlIIII(lllllllllllllllIllIllllIlIlllllI.p)) {
            lllllllllllllllIllIllllIlIlllllI.p = LocalTime.ofSecondOfDay(lllllllllllllllIllIllllIlIllllIl.getSeconds());
        }
        this.l = Instant.now();
    }

    private static boolean llIlIlllIlIlII(Object object) {
        return object != null;
    }

    private static boolean llIlIlllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIlllIIllIl(String lllllllllllllllIllIllllIlIIlIIIl, String lllllllllllllllIllIllllIlIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIllllIlIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIlllIll[8]), "DES");
            Cipher lllllllllllllllIllIllllIlIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllllIlIIlIlIl.init(lIlIIIlllIll[2], lllllllllllllllIllIllllIlIIlIllI);
            return new String(lllllllllllllllIllIllllIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllllIlIIlIlII) {
            lllllllllllllllIllIllllIlIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIlllIIlIll(String lllllllllllllllIllIllllIlIlIlIII, String lllllllllllllllIllIllllIlIlIIlll) {
        lllllllllllllllIllIllllIlIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIlIlIIllI = new StringBuilder();
        char[] lllllllllllllllIllIllllIlIlIIlIl = lllllllllllllllIllIllllIlIlIIlll.toCharArray();
        int lllllllllllllllIllIllllIlIlIIlII = lIlIIIlllIll[0];
        char[] lllllllllllllllIllIllllIlIIllllI = lllllllllllllllIllIllllIlIlIlIII.toCharArray();
        int lllllllllllllllIllIllllIlIIlllIl = lllllllllllllllIllIllllIlIIllllI.length;
        int lllllllllllllllIllIllllIlIIlllII = lIlIIIlllIll[0];
        while (c.llIlIlllIlIlIl(lllllllllllllllIllIllllIlIIlllII, lllllllllllllllIllIllllIlIIlllIl)) {
            char lllllllllllllllIllIllllIlIlIlIIl = lllllllllllllllIllIllllIlIIllllI[lllllllllllllllIllIllllIlIIlllII];
            lllllllllllllllIllIllllIlIlIIllI.append((char)(lllllllllllllllIllIllllIlIlIlIIl ^ lllllllllllllllIllIllllIlIlIIlIl[lllllllllllllllIllIllllIlIlIIlII % lllllllllllllllIllIllllIlIlIIlIl.length]));
            "".length();
            ++lllllllllllllllIllIllllIlIlIIlII;
            ++lllllllllllllllIllIllllIlIIlllII;
            "".length();
            if ("   ".length() > " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllllIlIlIIllI);
    }

    private static void llIlIlllIIllll() {
        lIlIIIlllIll = new int[14];
        c.lIlIIIlllIll[0] = (9 ^ 0x5A ^ (1 ^ 0x1C) & ~(0x18 ^ 5)) & (0x82 ^ 0xB6 ^ (0xC ^ 0x6B) ^ -" ".length());
        c.lIlIIIlllIll[1] = " ".length();
        c.lIlIIIlllIll[2] = "  ".length();
        c.lIlIIIlllIll[3] = "   ".length();
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

