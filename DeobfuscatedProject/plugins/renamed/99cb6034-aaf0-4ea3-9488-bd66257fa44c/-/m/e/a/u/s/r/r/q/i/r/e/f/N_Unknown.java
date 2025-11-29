/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;

public class N_Unknown {
    private /* synthetic */ q bv;
    private /* synthetic */ int bw;
    private final /* synthetic */ P bu;
    private static /* synthetic */ int[] lIllllIIIlII;
    private final /* synthetic */ String bs;
    private static /* synthetic */ String[] lIllllIIIIll;
    private final /* synthetic */ int bt;
    public static final /* synthetic */ Predicate<String> br;

    public q aM() {
        return this.bv;
    }

    private static boolean lllIllIllIlIIl(int n2) {
        return n2 != 0;
    }

    public void d(q q2) {
        this.bv = q2;
    }

    private static String lllIllIllIIlII(String var13, String var11) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var3 = var11.toCharArray();
        int var4 = lIllllIIIlII[1];
        char[] var20 = var13.toCharArray();
        int var14 = var20.length;
        int var16 = lIllllIIIlII[1];
        while (N.lllIllIllIllIl(var16, var14)) {
            char var19 = var20[var16];
            var1.append((char)(var19 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var16;
            0;
            if (2 != ((0x87 ^ 0xA3) & ~(0x18 ^ 0x3C))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public N(String string, int n2, P p2) {
        this.bw = lIllllIIIlII[2];
        this.bs = string;
        this.bt = n2;
        this.bu = p2;
    }

    public TileObject b(Client client) {
        if (!N.lllIllIllIIlll((Object)this.bu, (Object)P.COMPOST) || N.lllIllIllIlIII((Object)this.bu, (Object)P.GIANT_COMPOST)) {
            N var15;
            String[] stringArray = new String[lIllllIIIlII[0]];
            stringArray[N.lIllllIIIlII[1]] = var15.bu.ac();
            return TileObjects.getNearest((String[])stringArray);
        }
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (N.lllIllIllIlIIl(tileObject.hasAction(lIllllIIIIll[lIllllIIIlII[1]]::equals) ? 1 : 0) && N.lllIllIllIlIlI(client.getObjectDefinition(tileObject.getId()).getVarbitId(), this.bt)) {
                n2 = lIllllIIIlII[0];
                0;
                if (-2 > 0) {
                    return ((0x1C ^ 0x2F ^ (0x73 ^ 0x23)) & (98 + 8 - -79 + 11 ^ 130 + 95 - 213 + 155 ^ -1)) != 0;
                }
            } else {
                n2 = lIllllIIIlII[1];
            }
            return n2 != 0;
        });
    }

    static {
        N.lllIllIllIIllI();
        N.lllIllIllIIlIl();
        br = string -> {
            int n2;
            if (N.lllIllIllIlIll(string) && (!N.lllIllIllIllII(string.equals(lIllllIIIIll[lIllllIIIlII[0]]) ? 1 : 0) || !N.lllIllIllIllII(string.equals(lIllllIIIIll[lIllllIIIlII[3]]) ? 1 : 0) || N.lllIllIllIlIIl(string.equals(lIllllIIIIll[lIllllIIIlII[4]]) ? 1 : 0))) {
                n2 = lIllllIIIlII[0];
                0;
                if (-2 >= 0) {
                    return ((7 ^ 0x53 ^ (0xBB ^ 0xAF)) & (67 + 204 - 268 + 230 ^ 14 + 40 - -87 + 28 ^ -1)) != 0;
                }
            } else {
                n2 = lIllllIIIlII[1];
            }
            return n2 != 0;
        };
    }

    private static boolean lllIllIllIlIII(Object object, Object object2) {
        return object == object2;
    }

    public an aI() {
        return this.bu.f(Vars.getBit((int)this.bt));
    }

    private static boolean lllIllIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIllIlIll(Object object) {
        return object != null;
    }

    private static boolean lllIllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public P aL() {
        return this.bu;
    }

    private static void lllIllIllIIllI() {
        lIllllIIIlII = new int[7];
        N.lIllllIIIlII[0] = 1;
        N.lIllllIIIlII[1] = (0x49 ^ 0x14 ^ (0x6E ^ 0x17)) & (101 + 9 - 29 + 54 ^ 41 + 153 - 32 + 1 ^ -1);
        N.lIllllIIIlII[2] = -1;
        N.lIllllIIIlII[3] = 2;
        N.lIllllIIIlII[4] = 3;
        N.lIllllIIIlII[5] = 0xAE ^ 0xAA;
        N.lIllllIIIlII[6] = 0xA8 ^ 0xA0;
    }

    private static void lllIllIllIIlIl() {
        lIllllIIIIll = new String[lIllllIIIlII[5]];
        N.lIllllIIIIll[N.lIllllIIIlII[1]] = N."Inspect";
        N.lIllllIIIIll[N.lIllllIIIlII[0]] = N."Harvest";
        N.lIllllIIIIll[N.lIllllIIIlII[3]] = N."Pick";
        N.lIllllIIIIll[N.lIllllIIIlII[4]] = N."Pick-from";
    }

    public N(String string, int n2, P p2, int n3) {
        this(string, n2, p2);
        this.bw = n3;
    }

    public String aJ() {
        return this.bv.X() + "." + this.bt;
    }

    private static String lllIllIllIIIll(String var10, String var12) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllllIIIlII[3], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int aN() {
        return this.bw;
    }

    private static boolean lllIllIllIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static String lllIllIllIIIlI(String var7, String var17) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllllIIIlII[6]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllllIIIlII[3], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public p aK() {
        return p.b(this.bv.X());
    }

    public String toString() {
        return "FarmingPatch(name=" + this.ac() + ", implementation=" + String.valueOf((Object)this.aL()) + ", region=" + String.valueOf(this.aM()) + ")";
    }

    public int aO() {
        return this.bt;
    }

    public String ac() {
        return this.bs;
    }
}

