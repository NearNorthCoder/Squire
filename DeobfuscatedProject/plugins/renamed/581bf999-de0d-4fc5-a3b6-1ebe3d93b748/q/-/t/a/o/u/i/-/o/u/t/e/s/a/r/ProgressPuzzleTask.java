/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Progress Puzzle -> ProgresspuzzleTask */
@TaskDesc(name="Progress Puzzle")
public class ProgressPuzzleTask
extends bm_Unknown {
    private static /* synthetic */ String[] llIlIlIlIlI;
    private static /* synthetic */ int[] llIlIlIlIll;

    private static boolean lIlIIlllIIIlll(Object object) {
        return object != null;
    }

    @Inject
    protected bt(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

    private static String lIlIIllIlllllI(String var19, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIlIlIll[3], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlllIIIIII(String var23, String var15) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIlIlIlIll[7]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIlIlIlIll[3], var9);
            return new String(var1.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlllIIIIIl() {
        llIlIlIlIlI = new String[llIlIlIlIll[4]];
        bt.llIlIlIlIlI[bt.llIlIlIlIll[1]] = bt."Barrier";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[0]] = bt."Crawl-through";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[3]] = bt."Platform";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[2]] = bt."Jump-to";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[5]] = bt."Quick-pass";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[6]] = bt."Passage";
    }

    private static boolean lIlIIlllIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var6;
        bt var14;
        String[] stringArray = new String[llIlIlIlIll[0]];
        stringArray[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[1]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        if (bt.lIlIIlllIIIIll(tileObject2)) {
            return llIlIlIlIll[1];
        }
        int var21 = var14.cu.getLocalPlayer().getWorldX();
        if (bt.lIlIIlllIIIlII(var6.getWorldX(), var21)) {
            if (bt.lIlIIlllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIlIlIll[1];
            }
            if (bt.lIlIIlllIIIllI(var21, var14.fh.Z())) {
                return llIlIlIlIll[1];
            }
            TileObject var12 = TileObjects.getNearest(tileObject -> tileObject.getName().equals(llIlIlIlIlI[llIlIlIlIll[6]]));
            if (bt.lIlIIlllIIIlll(var12) && bt.lIlIIlllIIlIII(Math.abs(var12.getWorldX() - var14.fh.Z()), llIlIlIlIll[2])) {
                var12.interact(llIlIlIlIlI[llIlIlIlIll[0]]);
                return llIlIlIlIll[0];
            }
            String[] stringArray2 = new String[llIlIlIlIll[0]];
            stringArray2[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[3]];
            TileObject var20 = TileObjects.getNearest((String[])stringArray2);
            if (bt.lIlIIlllIIIlll(var20) && bt.lIlIIlllIIIlII(var20.getWorldX(), var14.fh.Z()) && bt.lIlIIlllIIlIII(Math.abs(var20.getWorldX() - var14.fh.Z()), llIlIlIlIll[4])) {
                var20.interact(llIlIlIlIlI[llIlIlIlIll[2]]);
                return llIlIlIlIll[0];
            }
            return llIlIlIlIll[1];
        }
        tileObject2.interact(llIlIlIlIlI[llIlIlIlIll[5]]);
        return llIlIlIlIll[0];
    }

    private static boolean lIlIIlllIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIIIIll(Object object) {
        return object == null;
    }

    private static void lIlIIlllIIIIlI() {
        llIlIlIlIll = new int[8];
        bt.llIlIlIlIll[0] = 1;
        bt.llIlIlIlIll[1] = (0x87 ^ 0x82) & ~(0xC ^ 9);
        bt.llIlIlIlIll[2] = 3;
        bt.llIlIlIlIll[3] = 2;
        bt.llIlIlIlIll[4] = 35 + 53 - -49 + 0 ^ 37 + 73 - -11 + 22;
        bt.llIlIlIlIll[5] = 0xA6 ^ 0xA2;
        bt.llIlIlIlIll[6] = 0x37 ^ 0x32;
        bt.llIlIlIlIll[7] = 15 + 57 - -29 + 32 ^ 51 + 80 - 3 + 13;
    }

    private static String lIlIIllIllllll(String var24, String var22) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var7 = var22.toCharArray();
        int var17 = llIlIlIlIll[1];
        char[] var18 = var24.toCharArray();
        int var3 = var18.length;
        int var4 = llIlIlIlIll[1];
        while (bt.lIlIIlllIIIlII(var4, var3)) {
            char var11 = var18[var4];
            var2.append((char)(var11 ^ var7[var17 % var7.length]));
            0;
            ++var17;
            ++var4;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIlIIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        bt.lIlIIlllIIIIlI();
        bt.lIlIIlllIIIIIl();
    }

    @Override
    public int bZ() {
        return this.fh.Z() + llIlIlIlIll[0];
    }
}

