package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.cox.SquireChambersConfig;
import java.awt.Color;
import java.awt.image.BufferedImage;
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
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/c.class */
public class C0028c extends InfoBox {
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
        lIlIIIlllIlI[lIlIIIlllIll[0]] = llIlIlllIIlIll("", "tdKit");
        lIlIIIlllIlI[lIlIIIlllIll[1]] = llIlIlllIIllII("NMC0M05vXlk=", "vxdZh");
        lIlIIIlllIlI[lIlIIIlllIll[2]] = llIlIlllIIllIl("cebuoPdaTRQ=", "AtFFv");
        lIlIIIlllIlI[lIlIIIlllIll[3]] = llIlIlllIIlIll("Lis2KScOI3crNQIjdy09BiJteQ==", "kGWYT");
        lIlIIIlllIlI[lIlIIIlllIll[4]] = llIlIlllIIllII("9ueX+f+gzzb33D1aYeb9uw==", "aeYvR");
        lIlIIIlllIlI[lIlIIIlllIll[5]] = llIlIlllIIllII("vqdeHBtM6YGJ7sJm6t5k1FRl6J8tzYn7", "vOxXm");
        lIlIIIlllIlI[lIlIIIlllIll[6]] = llIlIlllIIllII("d4yKjA8Tlqo=", "uMAhH");
        lIlIIIlllIlI[lIlIIIlllIll[7]] = llIlIlllIIlIll("bn83H0QBNTYCFDZwMwEVPSJvTQ==", "RPUmz");
        lIlIIIlllIlI[lIlIIIlllIll[8]] = llIlIlllIIlIll("Hh1uGRA=", "spTjc");
        lIlIIIlllIlI[lIlIIIlllIll[9]] = llIlIlllIIllIl("3L5EWkQKmndBoDuBuKD+AJQ7IzYSCdbw", "AKXwi");
        lIlIIIlllIlI[lIlIIIlllIll[10]] = llIlIlllIIlIll("BBhqFAM=", "iuPgp");
        lIlIIIlllIlI[lIlIIIlllIll[11]] = llIlIlllIIllIl("Kj+sGSnKpHu9H94O76B7uw==", "HtcRj");
        lIlIIIlllIlI[lIlIIIlllIll[12]] = llIlIlllIIlIll("JyFYFj0=", "JLbeN");
    }

    public String getText() {
        if (llIlIlllIlIIII(this.j)) {
            return lIlIIIlllIlI[lIlIIIlllIll[0]];
        }
        if (llIlIlllIlIIIl(this.r ? 1 : 0)) {
            this.m = LocalTime.ofSecondOfDay(Duration.between(this.j, Instant.now()).getSeconds());
        }
        return llIlIlllIlIIlI(this.m.getHour()) ? this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[1]])) : this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[2]]));
    }

    public void o() {
        this.q = LocalTime.ofSecondOfDay(Duration.between(this.l, Instant.now()).getSeconds());
    }

    static {
        llIlIlllIIllll();
        llIlIlllIIlllI();
    }

    private static boolean llIlIlllIlIlIl(int i, int i2) {
        return i < i2;
    }

    public void a(boolean z) {
        this.r = z;
    }

    public String getTooltip() {
        StringBuilder sb = new StringBuilder();
        sb.append(lIlIIIlllIlI[lIlIIIlllIll[3]]);
        "".length();
        sb.append(this.m.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[4]])));
        "".length();
        if (llIlIlllIlIlII(this.n)) {
            sb.append(lIlIIIlllIlI[lIlIIIlllIll[5]]);
            "".length();
            sb.append(this.n.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[6]])));
            "".length();
        }
        if (llIlIlllIlIlII(this.o)) {
            sb.append(lIlIIIlllIlI[lIlIIIlllIll[7]]);
            "".length();
            sb.append(this.o.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[8]])));
            "".length();
        }
        if (llIlIlllIlIlII(this.p)) {
            sb.append(lIlIIIlllIlI[lIlIIIlllIll[9]]);
            "".length();
            sb.append(this.p.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[10]])));
            "".length();
        }
        if (llIlIlllIlIlII(this.q)) {
            sb.append(lIlIIIlllIlI[lIlIIIlllIll[11]]);
            "".length();
            sb.append(this.q.format(DateTimeFormatter.ofPattern(lIlIIIlllIlI[lIlIIIlllIll[12]])));
            "".length();
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIlllIlIIll(int i) {
        return i != 0;
    }

    public Color getTextColor() {
        return llIlIlllIlIIll(this.r ? 1 : 0) ? Color.GREEN : Color.WHITE;
    }

    private static String llIlIlllIIllII(String lllllllllllllllIllIllllIlIIIIllI, String lllllllllllllllIllIllllIlIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllllIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllllIlIIIlIII.init(lIlIIIlllIll[2], secretKeySpec);
            return new String(lllllllllllllllIllIllllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllllIlIIIIlll) {
            lllllllllllllllIllIllllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIlIIII(Object obj) {
        return obj == null;
    }

    public void n() {
        Duration between = Duration.between(this.l, Instant.now());
        if (llIlIlllIlIIII(this.n)) {
            this.n = LocalTime.ofSecondOfDay(between.getSeconds());
            "".length();
            if ((-((14 ^ 21) ^ (131 ^ 157))) >= 0) {
                return;
            }
        } else if (llIlIlllIlIIII(this.o)) {
            this.o = LocalTime.ofSecondOfDay(between.getSeconds());
            "".length();
            if ((((111 ^ 30) ^ (209 ^ 134)) & (((((163 + 42) - 40) + 22) ^ (((107 + 7) - 10) + 53)) ^ (-" ".length()))) > 0) {
                return;
            }
        } else if (llIlIlllIlIIII(this.p)) {
            this.p = LocalTime.ofSecondOfDay(between.getSeconds());
        }
        this.l = Instant.now();
    }

    private static boolean llIlIlllIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean llIlIlllIlIIIl(int i) {
        return i == 0;
    }

    private static String llIlIlllIIllIl(String lllllllllllllllIllIllllIlIIlIIll, String lllllllllllllllIllIllllIlIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllllIlIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIlllIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlllIll[2], lllllllllllllllIllIllllIlIIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllllIlIIlIlII) {
            lllllllllllllllIllIllllIlIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIlllIIlIll(String lllllllllllllllIllIllllIlIlIlIII, String lllllllllllllllIllIllllIlIlIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIlIlIIllI = new StringBuilder();
        char[] lllllllllllllllIllIllllIlIlIIlIl = lllllllllllllllIllIllllIlIlIIlll.toCharArray();
        int lllllllllllllllIllIllllIlIlIIlII = lIlIIIlllIll[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIllIllllIlIIlllIl = charArray.length;
        int i = lIlIIIlllIll[0];
        while (llIlIlllIlIlIl(i, lllllllllllllllIllIllllIlIIlllIl)) {
            char lllllllllllllllIllIllllIlIIllIll = charArray[i];
            lllllllllllllllIllIllllIlIlIIllI.append((char) (lllllllllllllllIllIllllIlIIllIll ^ lllllllllllllllIllIllllIlIlIIlIl[lllllllllllllllIllIllllIlIlIIlII % lllllllllllllllIllIllllIlIlIIlIl.length]));
            "".length();
            lllllllllllllllIllIllllIlIlIIlII++;
            i++;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllllIlIlIIllI);
    }

    private static void llIlIlllIIllll() {
        lIlIIIlllIll = new int[14];
        lIlIIIlllIll[0] = ((9 ^ 90) ^ ((1 ^ 28) & ((24 ^ 5) ^ (-1)))) & (((130 ^ 182) ^ (12 ^ 107)) ^ (-" ".length()));
        lIlIIIlllIll[1] = " ".length();
        lIlIIIlllIll[2] = "  ".length();
        lIlIIIlllIll[3] = "   ".length();
        lIlIIIlllIll[4] = (((21 + 21) - (-17)) + 73) ^ (((90 + 40) - 104) + 102);
        lIlIIIlllIll[5] = (((127 + 146) - 236) + 114) ^ (((134 + 21) - 26) + 17);
        lIlIIIlllIll[6] = (((166 + 182) - 177) + 21) ^ (((66 + 36) - 20) + 116);
        lIlIIIlllIll[7] = 5 ^ 2;
        lIlIIIlllIll[8] = (48 ^ 1) ^ (106 ^ 83);
        lIlIIIlllIll[9] = (127 ^ 71) ^ (113 ^ 64);
        lIlIIIlllIll[10] = (78 ^ 58) ^ (238 ^ 144);
        lIlIIIlllIll[11] = (32 ^ 22) ^ (143 ^ 178);
        lIlIIIlllIll[12] = (46 ^ 73) ^ (60 ^ 87);
        lIlIIIlllIll[13] = 4 ^ 9;
    }

    private static boolean llIlIlllIlIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public C0028c(Plugin plugin, Instant instant, SquireChambersConfig squireChambersConfig) {
        super((BufferedImage) null, plugin);
        this.j = instant;
        this.k = squireChambersConfig;
        this.l = instant;
        this.r = lIlIIIlllIll[0];
    }
}
