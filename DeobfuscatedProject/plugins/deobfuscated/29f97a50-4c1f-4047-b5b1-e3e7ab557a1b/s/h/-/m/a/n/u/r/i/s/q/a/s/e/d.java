/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class d
extends Enum<d> {
    private final /* synthetic */ int itemID;
    private final /* synthetic */ Predicate<Item> test;
    public static final /* synthetic */ /* enum */ d ANTIPOISON;
    public static final /* synthetic */ /* enum */ d SUPERANTIPOISON;
    public static final /* synthetic */ /* enum */ d ANTIDOTE;
    private static /* synthetic */ String[] lIIllIIIIIllI;
    private static /* synthetic */ int[] lIIllIIIIIlll;
    private static final /* synthetic */ d[] $VALUES;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static String lIlIlllIlIIIlll(String llllllllllllllIllllIIlIllIlIlIlI, String llllllllllllllIllllIIlIllIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIlIllIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIlIllIlIlllI.init(lIIllIIIIIlll[2], llllllllllllllIllllIIlIllIlIllll);
            return new String(llllllllllllllIllllIIlIllIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIllIlIllIl) {
            llllllllllllllIllllIIlIllIlIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIlIIlIlI() {
        lIIllIIIIIllI = new String[lIIllIIIIIlll[9]];
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[0]] = d."Antidote+";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[1]] = d."Superantipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[2]] = d."Antipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[3]] = d."ANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[5]] = d."SUPERANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[7]] = d."ANTIDOTE";
    }

    private static String lIlIlllIlIIlIIl(String llllllllllllllIllllIIlIlllIIlIIl, String llllllllllllllIllllIIlIlllIIlIII) {
        llllllllllllllIllllIIlIlllIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlIlllIIllII = new StringBuilder();
        char[] llllllllllllllIllllIIlIlllIIlIll = llllllllllllllIllllIIlIlllIIlIII.toCharArray();
        int llllllllllllllIllllIIlIlllIIlIlI = lIIllIIIIIlll[0];
        char[] llllllllllllllIllllIIlIlllIIIlII = llllllllllllllIllllIIlIlllIIlIIl.toCharArray();
        int llllllllllllllIllllIIlIlllIIIIll = llllllllllllllIllllIIlIlllIIIlII.length;
        int llllllllllllllIllllIIlIlllIIIIlI = lIIllIIIIIlll[0];
        while (d.lIlIlllIlIIllII(llllllllllllllIllllIIlIlllIIIIlI, llllllllllllllIllllIIlIlllIIIIll)) {
            char llllllllllllllIllllIIlIlllIIllll = llllllllllllllIllllIIlIlllIIIlII[llllllllllllllIllllIIlIlllIIIIlI];
            llllllllllllllIllllIIlIlllIIllII.append((char)(llllllllllllllIllllIIlIlllIIllll ^ llllllllllllllIllllIIlIlllIIlIll[llllllllllllllIllllIIlIlllIIlIlI % llllllllllllllIllllIIlIlllIIlIll.length]));
            0;
            ++llllllllllllllIllllIIlIlllIIlIlI;
            ++llllllllllllllIllllIIlIlllIIIIlI;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIlIlllIIllII);
    }

    static {
        d.lIlIlllIlIIlIll();
        d.lIlIlllIlIIlIlI();
        ANTIPOISON = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[2]]), lIIllIIIIIlll[4]);
        SUPERANTIPOISON = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[1]]), lIIllIIIIIlll[6]);
        ANTIDOTE = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[0]]), lIIllIIIIIlll[8]);
        d[] dArray = new d[lIIllIIIIIlll[3]];
        dArray[d.lIIllIIIIIlll[0]] = ANTIPOISON;
        dArray[d.lIIllIIIIIlll[1]] = SUPERANTIPOISON;
        dArray[d.lIIllIIIIIlll[2]] = ANTIDOTE;
        $VALUES = dArray;
    }

    private d(Predicate<Item> predicate, int n3) {
        this.test = predicate;
        this.itemID = n3;
    }

    private static void lIlIlllIlIIlIll() {
        lIIllIIIIIlll = new int[11];
        d.lIIllIIIIIlll[0] = (0xCF ^ 0x83 ^ (0x20 ^ 0x64)) & (125 + 57 - 119 + 79 ^ 37 + 50 - -22 + 25 ^ -1);
        d.lIIllIIIIIlll[1] = 1;
        d.lIIllIIIIIlll[2] = 2;
        d.lIIllIIIIIlll[3] = 3;
        d.lIIllIIIIIlll[4] = -(0xFFFF950A & 0x7EF7) & (0xFFFFBFAF & 0x5DDF);
        d.lIIllIIIIIlll[5] = 0x53 ^ 0x54 ^ 3;
        d.lIIllIIIIIlll[6] = -(0xFFFFDD07 & 0x76FD) & (0xFFFFDFBE & 0x7DD5);
        d.lIIllIIIIIlll[7] = 0xAD ^ 0xA8;
        d.lIIllIIIIIlll[8] = 0xFFFFDF77 & 0x37BF;
        d.lIIllIIIIIlll[9] = 0x57 ^ 0x21 ^ (0x46 ^ 0x36);
        d.lIIllIIIIIlll[10] = 8 ^ 0;
    }

    private static boolean lIlIlllIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIlIIlIII(String llllllllllllllIllllIIlIllIllIlll, String llllllllllllllIllllIIlIllIllIllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIllIllIllI.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIlll[10]), "DES");
            Cipher llllllllllllllIllllIIlIllIlllIll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIllIlllIll.init(lIIllIIIIIlll[2], llllllllllllllIllllIIlIllIllllII);
            return new String(llllllllllllllIllllIIlIllIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlIllIlllIlI) {
            llllllllllllllIllllIIlIllIlllIlI.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public int v() {
        return this.itemID;
    }
}

