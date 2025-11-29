/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class n
extends Enum<n> {
    public static final /* synthetic */ /* enum */ n FIRE;
    private static /* synthetic */ String[] lIlllIIlllI;
    private final /* synthetic */ int regionX;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n DEATH;
    private final /* synthetic */ int regionY;
    private static /* synthetic */ int[] lIlllIIllll;
    public static final /* synthetic */ /* enum */ n LIGHTNING;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ /* enum */ n AIR;

    private static String lIIllIIlIIIllI(String var16, String var13) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlllIIllll[9], var23);
            return new String(var19.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private n(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static void lIIllIIlIIlIII() {
        lIlllIIlllI = new String[lIlllIIllll[14]];
        n.lIlllIIlllI[n.lIlllIIllll[0]] = n."DEATH";
        n.lIlllIIlllI[n.lIlllIIllll[2]] = n."FIRE";
        n.lIlllIIlllI[n.lIlllIIllll[9]] = n."LIGHTNING";
        n.lIlllIIlllI[n.lIlllIIllll[12]] = n."AIR";
    }

    /*
     * WARNING - void declaration
     */
    public static n e(int n2) {
        void var7;
        n[] nArray = n.values();
        int n3 = nArray.length;
        int var22 = lIlllIIllll[0];
        while (n.lIIllIIlIIlIlI(var22, (int)var7)) {
            int var14;
            void var17;
            void var18 = var17[var22];
            if (n.lIIllIIlIIlIll(var18.L(), var14)) {
                return var18;
            }
            ++var22;
            0;
            if (3 == 3) continue;
            return null;
        }
        return null;
    }

    private static String lIIllIIlIIIlIl(String var15, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlllIIllll[15]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlllIIllll[9], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIIllII(Object object) {
        return object == null;
    }

    private static void lIIllIIlIIlIIl() {
        lIlllIIllll = new int[16];
        n.lIlllIIllll[0] = (0xE9 ^ 0xB5 ^ (0x83 ^ 0xC6)) & (78 + 59 - 58 + 97 ^ 76 + 44 - 1 + 50 ^ -1);
        n.lIlllIIllll[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        n.lIlllIIllll[2] = 1;
        n.lIlllIIllll[3] = -(0xFFFFE0FF & 0x5F24) & (0xFFFFFF7F & 0x79F7);
        n.lIlllIIllll[4] = 0xFFFFFBAF & 0xB77F;
        n.lIlllIIllll[5] = 0xA8 ^ 0x93 ^ (0x55 ^ 0x4C);
        n.lIlllIIllll[6] = 0x7B ^ 0x5A;
        n.lIlllIIllll[7] = 0xFFFFBBED & 0xF73E;
        n.lIlllIIllll[8] = 0x70 ^ 0x6F;
        n.lIlllIIllll[9] = 2;
        n.lIlllIIllll[10] = -(0xFFFFE8CF & 0x1FB3) & (0xFFFFFFBF & 0xBBEF);
        n.lIlllIIllll[11] = 4 ^ 0x2A ^ (0x12 ^ 0x22);
        n.lIlllIIllll[12] = 3;
        n.lIlllIIllll[13] = 0xFFFFF36E & 0xBFBF;
        n.lIlllIIllll[14] = 0x7B ^ 0x23 ^ (0x72 ^ 0x2E);
        n.lIlllIIllll[15] = 71 + 51 - 10 + 94 ^ 138 + 142 - 186 + 104;
    }

    static {
        n.lIIllIIlIIlIIl();
        n.lIIllIIlIIlIII();
        DEATH = new n(lIlllIIllll[4], lIlllIIllll[5], lIlllIIllll[6]);
        FIRE = new n(lIlllIIllll[7], lIlllIIllll[8], lIlllIIllll[6]);
        LIGHTNING = new n(lIlllIIllll[10], lIlllIIllll[5], lIlllIIllll[11]);
        AIR = new n(lIlllIIllll[13], lIlllIIllll[8], lIlllIIllll[11]);
        n[] nArray = new n[lIlllIIllll[14]];
        nArray[n.lIlllIIllll[0]] = DEATH;
        nArray[n.lIlllIIllll[2]] = FIRE;
        nArray[n.lIlllIIllll[9]] = LIGHTNING;
        nArray[n.lIlllIIllll[12]] = AIR;
        $VALUES = nArray;
    }

    private static boolean lIIllIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    public int L() {
        return this.objectId;
    }

    private static boolean lIIllIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static n a(Client client, WorldPoint worldPoint) {
        void var24;
        n n2 = null;
        int n3 = lIlllIIllll[1];
        n[] nArray = n.values();
        int n4 = nArray.length;
        int var9 = lIlllIIllll[0];
        while (n.lIIllIIlIIlIlI(var9, (int)var24)) {
            Client var21;
            void var1;
            void var5 = var1[var9];
            WorldPoint var4 = var5.a(var21);
            if (n.lIIllIIlIIllII(var4)) {
                0;
                if (1 == ((0xCF ^ 0x9E) & ~(0xC4 ^ 0x95))) {
                    return null;
                }
            } else {
                int var20;
                void var12;
                int var8 = var4.distanceTo((WorldPoint)var12);
                if (n.lIIllIIlIIlIlI(var8, var20)) {
                    void llllllllllllllllIlIIllIlllIlIlll = var5;
                    var20 = var8;
                }
            }
            ++var9;
            0;
            
            return null;
        }
        return n2;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, lIlllIIllll[2], lIlllIIllll[3]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

