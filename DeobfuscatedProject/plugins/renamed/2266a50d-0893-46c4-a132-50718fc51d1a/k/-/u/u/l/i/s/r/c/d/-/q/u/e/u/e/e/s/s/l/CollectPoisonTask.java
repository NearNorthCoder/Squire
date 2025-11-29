/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Collect Poison -> CollectpoisonTask */
@TaskDesc(name="Collect Poison", priority=200, blocking=true)
public class CollectPoisonTask
extends Task {
    final /* synthetic */ a bg;
    final /* synthetic */ SquireDukeSucellus bf;
    private static /* synthetic */ String[] lIllIllIIIIl;
    private static /* synthetic */ int[] lIllIllIIIlI;

    private static String lllIlIIIlllIII(String var9, String var19) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var24 = Cipher.getInstance("Blowfish");
            var24.init(lIllIllIIIlI[0], var14);
            return new String(var24.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlllIlI() {
        lIllIllIIIIl = new String[lIllIllIIIlI[5]];
        D.lIllIllIIIIl[D.lIllIllIIIlI[1]] = D."Collect-from";
        D.lIllIllIIIIl[D.lIllIllIIIlI[2]] = D."Collect-from";
        D.lIllIllIIIIl[D.lIllIllIIIlI[0]] = D."Fermentation Vat";
        D.lIllIllIIIIl[D.lIllIllIIIlI[3]] = D."Gate";
        D.lIllIllIIIIl[D.lIllIllIIIlI[4]] = D."Quick-escape";
    }

    private static boolean lllIlIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIlIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var2;
        if (!D.lllIlIIIlllllI(this.bg.y(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.x(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.w(), lIllIllIIIlI[0]) || D.lllIlIIIlllllI(this.bg.v(), lIllIllIIIlI[0])) {
            return lIllIllIIIlI[1];
        }
        TileObject var22 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (D.lllIlIIlIIIIIl(tileObject.getName().equals(lIllIllIIIIl[lIllIllIIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIlI[2]];
                stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[4]];
                if (D.lllIlIIlIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIlI[2];
                    0;
                    if ((0x6F ^ 0x3C ^ (0xF0 ^ 0xA7)) >= 0) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = lIllIllIIIlI[1];
            return n2 != 0;
        });
        if (D.lllIlIIlIIIIII(var22)) {
            return lIllIllIIIlI[1];
        }
        int lllllllllllllllIlIlllIlllIlIlllI = var2.bg.y();
        TileObject var11 = TileObjects.getNearest(tileObject2 -> {
            boolean bl;
            void var21;
            void var7;
            int var3;
            String[] stringArray = new String[lIllIllIIIlI[2]];
            stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[2]];
            if (!D.lllIlIIlIIIIIl(tileObject2.hasAction(stringArray) ? 1 : 0) || D.lllIlIIlIIIIlI(tileObject2.getName().equals(lIllIllIIIIl[lIllIllIIIlI[0]]) ? 1 : 0)) {
                return lIllIllIIIlI[1];
            }
            if (D.lllIlIIlIIIIlI(var3)) {
                boolean bl2;
                if (D.lllIlIIlIIIIll(var7.getWorldX(), var21.getWorldX())) {
                    bl2 = lIllIllIIIlI[2];
                    0;
                    if (((0xD5 ^ 0xB5) & ~(0xDB ^ 0xBB)) < 0) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    bl2 = lIllIllIIIlI[1];
                }
                return bl2;
            }
            if (D.lllIlIIIlllllI(var7.getWorldX(), var21.getWorldX())) {
                bl = lIllIllIIIlI[2];
                0;
                if (2 <= 0) {
                    return false;
                }
            } else {
                bl = lIllIllIIIlI[1];
            }
            return bl;
        });
        if (D.lllIlIIlIIIIII(var11)) {
            return lIllIllIIIlI[1];
        }
        var3_3.interact(lIllIllIIIIl[lIllIllIIIlI[1]]);
        return lIllIllIIIlI[2];
    }

    private static void lllIlIIIllllII() {
        lIllIllIIIlI = new int[7];
        D.lIllIllIIIlI[0] = 2;
        D.lIllIllIIIlI[1] = (98 + 49 - -12 + 38 ^ 54 + 151 - 169 + 130) & ((0x14 ^ 0x3C) & ~(0x13 ^ 0x3B) ^ (0xA4 ^ 0xC7) ^ -1);
        D.lIllIllIIIlI[2] = 1;
        D.lIllIllIIIlI[3] = 3;
        D.lIllIllIIIlI[4] = 47 + 95 - 2 + 40 ^ 126 + 40 - 110 + 120;
        D.lIllIllIIIlI[5] = 89 + 114 - 114 + 74 ^ 113 + 54 - 128 + 127;
        D.lIllIllIIIlI[6] = 0x40 ^ 0x48;
    }

    private static boolean lllIlIIIllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIlIIIllIlll(String var17, String var16) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var5 = var16.toCharArray();
        int var4 = lIllIllIIIlI[1];
        char[] var10 = var17.toCharArray();
        int var12 = var10.length;
        int var25 = lIllIllIIIlI[1];
        while (D.lllIlIIIlllllI(var25, var12)) {
            char var23 = var10[var25];
            var20.append((char)(var23 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var25;
            0;
            
            return null;
        }
        return String.valueOf(var20);
    }

    private static String lllIlIIIlllIIl(String var18, String var15) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIllIIIlI[6]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllIllIIIlI[0], var8);
            return new String(var13.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        D.lllIlIIIllllII();
        D.lllIlIIIlllIlI();
    }

    @Inject
    public D(SquireDukeSucellus squireDukeSucellus) {
        this.bf = squireDukeSucellus;
        this.bg = squireDukeSucellus.s();
    }

    private static boolean lllIlIIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIlIIIIlI(int n2) {
        return n2 == 0;
    }
}

