/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e TSTANON_KARLAK;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ e BALFRUG_KREEYATH;
    private static /* synthetic */ int[] lIllIIIllIllI;
    private final /* synthetic */ int projectile;
    private static final /* synthetic */ e[] $VALUES;
    private static /* synthetic */ String[] lIllIIIllIlIl;
    private final /* synthetic */ int animation;
    public static final /* synthetic */ /* enum */ e ZAKLN_GRITCH;
    private final /* synthetic */ Prayer protection;

    private e(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    private static String llIIIlIlIIllIII(String llllllllllllllIllIIlIllIlIlIIllI, String llllllllllllllIllIIlIllIlIlIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), lIllIIIllIllI[13]), "DES");
            Cipher llllllllllllllIllIIlIllIlIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIllIlIlIlIII.init(lIllIIIllIllI[8], llllllllllllllIllIIlIllIlIlIlIIl);
            return new String(llllllllllllllIllIIlIllIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIllIlIlIIlll) {
            llllllllllllllIllIIlIllIlIlIIlll.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int p() {
        return this.projectile;
    }

    private static boolean llIIIlIlIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        e.llIIIlIlIIlllII();
        e.llIIIlIlIIllIlI();
        TSTANON_KARLAK = new e(lIllIIIllIllI[1], Prayer.PROTECT_FROM_MELEE, lIllIIIllIllI[2], lIllIIIllIllI[3]);
        BALFRUG_KREEYATH = new e(lIllIIIllIllI[5], Prayer.PROTECT_FROM_MAGIC, lIllIIIllIllI[6], lIllIIIllIllI[7]);
        ZAKLN_GRITCH = new e(lIllIIIllIllI[9], Prayer.PROTECT_FROM_MISSILES, lIllIIIllIllI[10], lIllIIIllIllI[11]);
        e[] eArray = new e[lIllIIIllIllI[12]];
        eArray[e.lIllIIIllIllI[0]] = TSTANON_KARLAK;
        eArray[e.lIllIIIllIllI[4]] = BALFRUG_KREEYATH;
        eArray[e.lIllIIIllIllI[8]] = ZAKLN_GRITCH;
        $VALUES = eArray;
    }

    private static void llIIIlIlIIllIlI() {
        lIllIIIllIlIl = new String[lIllIIIllIllI[12]];
        e.lIllIIIllIlIl[e.lIllIIIllIllI[0]] = e."TSTANON_KARLAK";
        e.lIllIIIllIlIl[e.lIllIIIllIllI[4]] = e."BALFRUG_KREEYATH";
        e.lIllIIIllIlIl[e.lIllIIIllIllI[8]] = e."ZAKLN_GRITCH";
    }

    /*
     * WARNING - void declaration
     */
    public static e a(Projectile projectile) {
        void llllllllllllllIllIIlIllIlIllIIII;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int llllllllllllllIllIIlIllIlIlIllll = lIllIIIllIllI[0];
        while (e.llIIIlIlIIlllIl(llllllllllllllIllIIlIllIlIlIllll, (int)llllllllllllllIllIIlIllIlIllIIII)) {
            Projectile llllllllllllllIllIIlIllIlIllIIlI;
            void llllllllllllllIllIIlIllIlIllIIIl;
            void llllllllllllllIllIIlIllIlIlIlllI = llllllllllllllIllIIlIllIlIllIIIl[llllllllllllllIllIIlIllIlIlIllll];
            if (e.llIIIlIlIIllllI(llllllllllllllIllIIlIllIlIlIlllI.p(), llllllllllllllIllIIlIllIlIllIIlI.getId())) {
                return llllllllllllllIllIIlIllIlIlIlllI;
            }
            ++llllllllllllllIllIIlIllIlIlIllll;
            0;
            if ((0x4E ^ 0x4A) >= -1) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static e a(NPC nPC) {
        void llllllllllllllIllIIlIllIlIlllIlI;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int llllllllllllllIllIIlIllIlIlllIIl = lIllIIIllIllI[0];
        while (e.llIIIlIlIIlllIl(llllllllllllllIllIIlIllIlIlllIIl, (int)llllllllllllllIllIIlIllIlIlllIlI)) {
            NPC llllllllllllllIllIIlIllIlIllllII;
            void llllllllllllllIllIIlIllIlIlllIll;
            void llllllllllllllIllIIlIllIlIlllIII = llllllllllllllIllIIlIllIlIlllIll[llllllllllllllIllIIlIllIlIlllIIl];
            if (e.llIIIlIlIIllllI(llllllllllllllIllIIlIllIlIlllIII.n(), llllllllllllllIllIIlIllIlIllllII.getId())) {
                return llllllllllllllIllIIlIllIlIlllIII;
            }
            ++llllllllllllllIllIIlIllIlIlllIIl;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return null;
    }

    public int q() {
        return this.animation;
    }

    private static void llIIIlIlIIlllII() {
        lIllIIIllIllI = new int[14];
        e.lIllIIIllIllI[0] = (0x22 ^ 0x7F) & ~(0x4C ^ 0x11);
        e.lIllIIIllIllI[1] = -(0xFFFFC16F & 0x7ED5) & (0xFFFFDEFF & 0x6D7E);
        e.lIllIIIllIllI[2] = -1;
        e.lIllIIIllIllI[3] = 0x9E ^ 0xC1 ^ (0x28 ^ 0x37);
        e.lIllIIIllIllI[4] = 1;
        e.lIllIIIllIllI[5] = -(0xFFFFF7DB & 0x3867) & (0xFFFFFF7E & 0x3CFF);
        e.lIllIIIllIllI[6] = 0xFFFFFCFF & 0x7CB;
        e.lIllIIIllIllI[7] = 0xFFFFD65E & 0x3BB7;
        e.lIllIIIllIllI[8] = 2;
        e.lIllIIIllIllI[9] = -(0xFFFFB3FF & 0x7E01) & (0xFFFFBEFB & 0x7F3F);
        e.lIllIIIllIllI[10] = 0xFFFFE6DF & 0x1DE7;
        e.lIllIIIllIllI[11] = 0xFFFFDBF7 & 0x3FAD;
        e.lIllIIIllIllI[12] = 3;
        e.lIllIIIllIllI[13] = 0xAA ^ 0xC5 ^ (0x2B ^ 0x4C);
    }

    public Prayer o() {
        return this.protection;
    }

    public int n() {
        return this.id;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }
}

