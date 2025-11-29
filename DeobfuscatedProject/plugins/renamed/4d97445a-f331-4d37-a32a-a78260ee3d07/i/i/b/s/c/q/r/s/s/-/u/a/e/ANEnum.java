/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class ANEnum
extends Enum<an> {
    private static /* synthetic */ String[] llIIllIIl;
    private static final /* synthetic */ an[] $VALUES;
    private final /* synthetic */ Predicate<Item> predicate;
    private static /* synthetic */ int[] llIIllIlI;
    private final /* synthetic */ String interaction;
    public static final /* synthetic */ /* enum */ an FISHING_CAPE;
    private final /* synthetic */ int regionId;
    private final /* synthetic */ WorldPoint bankTile;

    private static void lIllIlIIIII() {
        llIIllIlI = new int[9];
        an.llIIllIlI[0] = 1;
        an.llIIllIlI[1] = (0x17 ^ 0x1F ^ (0xC6 ^ 0x8C)) & (5 ^ 0x73 ^ (0x8C ^ 0xB8) ^ -1);
        an.llIIllIlI[2] = -(0xFFFFE2FE & 0x5DBB) & (0xFFFFF7FF & 0x6EFF);
        an.llIIllIlI[3] = 0xFFFFFF77 & 0x26CF;
        an.llIIllIlI[4] = -(0xFFFF9547 & 0x7EF9) & (0xFFFFBF75 & 0x7CFF);
        an.llIIllIlI[5] = -(0xFFFFF4B7 & 0x6FEA) & (0xFFFFFEBB & 0x6FFF);
        an.llIIllIlI[6] = -(0xFFFFFFED & 0x52B3) & (0xFFFFDFFF & 0x7FFA);
        an.llIIllIlI[7] = 2;
        an.llIIllIlI[8] = 0x92 ^ 0x9A;
    }

    public static an[] values() {
        return (an[])$VALUES.clone();
    }

    public WorldPoint bt() {
        return this.bankTile;
    }

    public String bs() {
        return this.interaction;
    }

    private static String lIllIIlllIl(String lIllIIlIlllIIll, String lIllIIlIlllIIlI) {
        try {
            SecretKeySpec lIllIIlIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), llIIllIlI[8]), "DES");
            Cipher lIllIIlIlllIlll = Cipher.getInstance("DES");
            lIllIIlIlllIlll.init(llIIllIlI[7], lIllIIlIllllIII);
            return new String(lIllIIlIlllIlll.doFinal(Base64.getDecoder().decode(lIllIIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIlllIllI) {
            lIllIIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private an(Predicate<Item> predicate, String string2, int n3, WorldPoint worldPoint) {
        this.predicate = predicate;
        this.interaction = string2;
        this.regionId = n3;
        this.bankTile = worldPoint;
    }

    private static boolean lIllIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean t(int n2) {
        boolean bl2;
        if (an.lIllIlIIIIl(this.regionId, n2)) {
            bl2 = llIIllIlI[0];
            0;
            if (-3 >= 0) {
                return ((0xE7 ^ 0x9C ^ (0x5D ^ 0x2D)) & (0x8A ^ 0x85 ^ (0x93 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIllIlI[1];
        }
        return bl2;
    }

    public boolean bq() {
        return this.t(Players.getLocal().getWorldLocation().getRegionID());
    }

    private static void lIllIIlllll() {
        llIIllIIl = new String[llIIllIlI[7]];
        an.llIIllIIl[an.llIIllIlI[1]] = an."FISHING_CAPE";
        an.llIIllIIl[an.llIIllIlI[0]] = an."Fishing Guild";
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static String lIllIIllllI(String lIllIIlIllIIlIl, String lIllIIlIllIIlII) {
        lIllIIlIllIIlIl = new String(Base64.getDecoder().decode(lIllIIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIllIIIll = new StringBuilder();
        char[] lIllIIlIllIIIlI = lIllIIlIllIIlII.toCharArray();
        int lIllIIlIllIIIIl = llIIllIlI[1];
        char[] lIllIIlIlIllIll = lIllIIlIllIIlIl.toCharArray();
        int lIllIIlIlIllIlI = lIllIIlIlIllIll.length;
        int lIllIIlIlIllIIl = llIIllIlI[1];
        while (an.lIllIlIIIll(lIllIIlIlIllIIl, lIllIIlIlIllIlI)) {
            char lIllIIlIllIIllI = lIllIIlIlIllIll[lIllIIlIlIllIIl];
            lIllIIlIllIIIll.append((char)(lIllIIlIllIIllI ^ lIllIIlIllIIIlI[lIllIIlIllIIIIl % lIllIIlIllIIIlI.length]));
            0;
            ++lIllIIlIllIIIIl;
            ++lIllIIlIlIllIIl;
            0;
            if (-(0x63 ^ 0x67) <= 0) continue;
            return null;
        }
        return String.valueOf(lIllIIlIllIIIll);
    }

    public static an valueOf(String string) {
        return Enum.valueOf(ANEnum.class, string);
    }

    static {
        an.lIllIlIIIII();
        an.lIllIIlllll();
        FISHING_CAPE = new an(item -> {
            boolean bl2;
            if (!an.lIllIlIIIlI(item.getId(), llIIllIlI[2]) || an.lIllIlIIIIl(item.getId(), llIIllIlI[3])) {
                bl2 = llIIllIlI[0];
                0;
                if ((114 + 71 - 84 + 26 ^ (0xDB ^ 0xA0)) <= 2) {
                    return ((0x8C ^ 0xA4 ^ (0x13 ^ 0x5B)) & (0x58 ^ 0x4D ^ (0xF ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIlI[1];
            }
            return bl2;
        }, llIIllIIl[llIIllIlI[0]], llIIllIlI[4], new WorldPoint(llIIllIlI[5], llIIllIlI[6], llIIllIlI[1]));
        an[] anArray = new an[llIIllIlI[0]];
        anArray[an.llIIllIlI[1]] = FISHING_CAPE;
        $VALUES = anArray;
    }

    private static boolean lIllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }
}

