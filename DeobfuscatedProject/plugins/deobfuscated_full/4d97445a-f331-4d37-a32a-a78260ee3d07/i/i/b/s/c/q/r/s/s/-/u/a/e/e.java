/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class e
extends Enum<e> {
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ /* enum */ e MELEE;
    public static final /* synthetic */ /* enum */ e GHOST_RANGED;
    private static /* synthetic */ String[] lIlIlIll;
    public static final /* synthetic */ /* enum */ e GHOST_MELEE;
    public static final /* synthetic */ /* enum */ e LAVA;
    public static final /* synthetic */ /* enum */ e GHOST_MAGIC;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e GHOSTS;
    public static final /* synthetic */ /* enum */ e MAGIC;
    public static final /* synthetic */ /* enum */ e SPAWN;
    private static /* synthetic */ int[] lIlIllII;
    public static final /* synthetic */ /* enum */ e RANGED;
    public static final /* synthetic */ /* enum */ e AUTO;
    private final /* synthetic */ int priority;

    static {
        e.lIIllIlllI();
        e.lIIllIllIl();
        SPAWN = new e(null, lIlIllII[1]);
        AUTO = new e(null, lIlIllII[0]);
        MELEE = new e(Prayer.PROTECT_FROM_MELEE, lIlIllII[0]);
        RANGED = new e(Prayer.PROTECT_FROM_MISSILES, lIlIllII[0]);
        MAGIC = new e(Prayer.PROTECT_FROM_MAGIC, lIlIllII[0]);
        LAVA = new e(null, lIlIllII[1]);
        GHOSTS = new e(null, lIlIllII[1]);
        GHOST_MELEE = new e(Prayer.PROTECT_FROM_MELEE, lIlIllII[2]);
        GHOST_RANGED = new e(Prayer.PROTECT_FROM_MISSILES, lIlIllII[2]);
        GHOST_MAGIC = new e(Prayer.PROTECT_FROM_MAGIC, lIlIllII[2]);
        e[] eArray = new e[lIlIllII[10]];
        eArray[e.lIlIllII[1]] = SPAWN;
        eArray[e.lIlIllII[0]] = AUTO;
        eArray[e.lIlIllII[2]] = MELEE;
        eArray[e.lIlIllII[3]] = RANGED;
        eArray[e.lIlIllII[4]] = MAGIC;
        eArray[e.lIlIllII[5]] = LAVA;
        eArray[e.lIlIllII[6]] = GHOSTS;
        eArray[e.lIlIllII[7]] = GHOST_MELEE;
        eArray[e.lIlIllII[8]] = GHOST_RANGED;
        eArray[e.lIlIllII[9]] = GHOST_MAGIC;
        $VALUES = eArray;
    }

    private static boolean lIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private e(Prayer prayer, int n3) {
        this.prayer = prayer;
        this.priority = n3;
    }

    private static void lIIllIllIl() {
        lIlIlIll = new String[lIlIllII[10]];
        e.lIlIlIll[e.lIlIllII[1]] = e."SPAWN";
        e.lIlIlIll[e.lIlIllII[0]] = e."AUTO";
        e.lIlIlIll[e.lIlIllII[2]] = e."MELEE";
        e.lIlIlIll[e.lIlIllII[3]] = e."RANGED";
        e.lIlIlIll[e.lIlIllII[4]] = e."MAGIC";
        e.lIlIlIll[e.lIlIllII[5]] = e."LAVA";
        e.lIlIlIll[e.lIlIllII[6]] = e."GHOSTS";
        e.lIlIlIll[e.lIlIllII[7]] = e."GHOST_MELEE";
        e.lIlIlIll[e.lIlIllII[8]] = e."GHOST_RANGED";
        e.lIlIlIll[e.lIlIllII[9]] = e."GHOST_MAGIC";
    }

    public int H() {
        return this.priority;
    }

    private static String lIIllIlIlI(String llIlllllIIIlIll, String llIlllllIIIllII) {
        try {
            SecretKeySpec llIlllllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllllIIIllll = Cipher.getInstance("Blowfish");
            llIlllllIIIllll.init(lIlIllII[2], llIlllllIIlIIII);
            return new String(llIlllllIIIllll.doFinal(Base64.getDecoder().decode(llIlllllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllllIIIlllI) {
            llIlllllIIIlllI.printStackTrace();
            return null;
        }
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIIllIllII(String llIlllllIIllIlI, String llIlllllIIlIlll) {
        try {
            SecretKeySpec llIlllllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllllIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIllII[8]), "DES");
            Cipher llIlllllIIlllII = Cipher.getInstance("DES");
            llIlllllIIlllII.init(lIlIllII[2], llIlllllIIlllIl);
            return new String(llIlllllIIlllII.doFinal(Base64.getDecoder().decode(llIlllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllllIIllIll) {
            llIlllllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    public String toString() {
        return "Attack{prayer=" + this.prayer + ", priority=" + this.priority + "}";
    }

    private static String lIIllIlIll(String llIllllIlllllIl, String llIllllIlllllII) {
        llIllllIlllllIl = new String(Base64.getDecoder().decode(llIllllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllIllllIll = new StringBuilder();
        char[] llIllllIllllIlI = llIllllIlllllII.toCharArray();
        int llIllllIllllIIl = lIlIllII[1];
        char[] llIllllIlllIIll = llIllllIlllllIl.toCharArray();
        int llIllllIlllIIlI = llIllllIlllIIll.length;
        int llIllllIlllIIIl = lIlIllII[1];
        while (e.lIIlllIIIl(llIllllIlllIIIl, llIllllIlllIIlI)) {
            char llIllllIllllllI = llIllllIlllIIll[llIllllIlllIIIl];
            llIllllIllllIll.append((char)(llIllllIllllllI ^ llIllllIllllIlI[llIllllIllllIIl % llIllllIllllIlI.length]));
            0;
            ++llIllllIllllIIl;
            ++llIllllIlllIIIl;
            0;
            if (((93 + 132 - 147 + 95 ^ 113 + 46 - 132 + 107) & (196 + 19 - 100 + 121 ^ 58 + 87 - -8 + 46 ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(llIllllIllllIll);
    }

    private static void lIIllIlllI() {
        lIlIllII = new int[11];
        e.lIlIllII[0] = 1;
        e.lIlIllII[1] = (10 + 192 - 5 + 52 ^ 78 + 81 - 83 + 87) & (1 ^ (0x5E ^ 5) ^ -1);
        e.lIlIllII[2] = 2;
        e.lIlIllII[3] = 3;
        e.lIlIllII[4] = 0x2E ^ 0x41 ^ (0x15 ^ 0x7E);
        e.lIlIllII[5] = 102 + 134 - 137 + 71 ^ 67 + 116 - 119 + 111;
        e.lIlIllII[6] = 81 + 5 - 24 + 84 ^ 84 + 83 - 114 + 95;
        e.lIlIllII[7] = 0x2D ^ 0x7D ^ (0xE1 ^ 0xB6);
        e.lIlIllII[8] = 0x84 ^ 0x99 ^ (0x61 ^ 0x74);
        e.lIlIllII[9] = 0x61 ^ 0x68;
        e.lIlIllII[10] = 0x6E ^ 0x64;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static boolean lIIllIllll(Object object, Object object2) {
        return object != object2;
    }

    public boolean G() {
        boolean bl2;
        if (!e.lIIllIllll((Object)this, (Object)GHOST_MAGIC) || !e.lIIllIllll((Object)this, (Object)GHOST_RANGED) || e.lIIlllIIII((Object)this, (Object)GHOST_MELEE)) {
            bl2 = lIlIllII[0];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            bl2 = lIlIllII[1];
        }
        return bl2;
    }
}

