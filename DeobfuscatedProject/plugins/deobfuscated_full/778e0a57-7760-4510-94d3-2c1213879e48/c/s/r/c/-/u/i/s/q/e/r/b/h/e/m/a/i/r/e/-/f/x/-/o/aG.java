/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;

public class aG {
    private static /* synthetic */ String[] lIlIlIIllIII;
    public static final /* synthetic */ int dS;
    public static final /* synthetic */ int dV;
    private static /* synthetic */ int[] lIlIlIIllIIl;
    public static final /* synthetic */ int dT;
    public static final /* synthetic */ int dU;
    public static final /* synthetic */ int dW;

    private static void llIlllIlIIllII() {
        lIlIlIIllIIl = new int[7];
        aG.lIlIlIIllIIl[0] = (0xFF ^ 0xA9) & ~(0x37 ^ 0x61);
        aG.lIlIlIIllIIl[1] = 1;
        aG.lIlIlIIllIIl[2] = 2;
        aG.lIlIlIIllIIl[3] = 0x2B ^ 0x2F;
        aG.lIlIlIIllIIl[4] = 3;
        aG.lIlIlIIllIIl[5] = -(0xFFFF9BDD & 0x6DA3) & (0xFFFFFDDF & 0x7FEF);
        aG.lIlIlIIllIIl[6] = 0x2E ^ 0x26;
    }

    private static void llIlllIlIIlIll() {
        lIlIlIIllIII = new String[lIlIlIIllIIl[4]];
        aG.lIlIlIIllIII[aG.lIlIlIIllIIl[0]] = aG."Glowing crystal";
        aG.lIlIlIIllIII[aG.lIlIlIIllIIl[1]] = aG."Attack";
        aG.lIlIlIIllIII[aG.lIlIlIIllIIl[2]] = aG."Vasa";
    }

    private static boolean llIlllIlIIllIl(Object object) {
        return object == null;
    }

    private static String llIlllIlIIlIlI(String var6, String var15) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIlIIllIIl[6]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIlIIllIIl[2], var16);
            return new String(var4.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int dk() {
        void var12;
        int var7;
        int n2;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIllIII[lIlIlIIllIIl[2]]));
        if (aG.llIlllIlIIllIl(nPC2)) {
            return lIlIlIIllIIl[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (aG.llIlllIlIIllll(nPC.getName().contains(lIlIlIIllIII[lIlIlIIllIIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIllIIl[1]];
                stringArray[aG.lIlIlIIllIIl[0]] = lIlIlIIllIII[lIlIlIIllIIl[1]];
                if (aG.llIlllIlIIllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIllIIl[1];
                    0;
                    if (((0x2B ^ 0xF ^ (0xB8 ^ 0xAB)) & (0x6C ^ 0x76 ^ (0x92 ^ 0xBF) ^ -1)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIllIIl[0];
            return n2 != 0;
        });
        if (aG.llIlllIlIIlllI(var1)) {
            n2 = lIlIlIIllIIl[1];
            0;
            if (3 != 3) {
                return (5 ^ 0x71 ^ (0x39 ^ 0x78)) & (0x21 ^ 0x11 ^ (0x6F ^ 0x6A) ^ -1);
            }
        } else {
            n2 = var7 = lIlIlIIllIIl[0];
        }
        if (aG.llIlllIlIIlllI(var1)) {
            System.out.print("Crystal scale: " + var1.getHealthScale() + " | ratio: " + var1.getHealthRatio());
        }
        if (aG.llIlllIlIIllll(var7) && aG.llIlllIlIIllll(var12.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[2];
        }
        if (aG.llIlllIlIlIIII(var7) && aG.llIlllIlIIllll(var12.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[3];
        }
        if (aG.llIlllIlIIllll(var7) && aG.llIlllIlIlIIII(var12.isMoving() ? 1 : 0)) {
            return lIlIlIIllIIl[4];
        }
        if (aG.llIlllIlIlIIII(var7) && aG.llIlllIlIlIIII(var12.isMoving() ? 1 : 0)) {
            int[] nArray = new int[lIlIlIIllIIl[1]];
            nArray[aG.lIlIlIIllIIl[0]] = lIlIlIIllIIl[5];
            TileObject var9 = TileObjects.getNearest((WorldPoint)var12.getWorldArea().getCenter(), (int[])nArray);
            if (aG.llIlllIlIIlllI(var9) && aG.llIlllIlIlIIIl(var12.getWorldArea().distanceTo((Locatable)var9), lIlIlIIllIIl[4])) {
                return lIlIlIIllIIl[3];
            }
            return lIlIlIIllIIl[1];
        }
        return lIlIlIIllIIl[0];
    }

    private static String llIlllIlIIlIIl(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var18 = var11.toCharArray();
        int var3 = lIlIlIIllIIl[0];
        char[] var17 = var10.toCharArray();
        int var14 = var17.length;
        int var5 = lIlIlIIllIIl[0];
        while (aG.llIlllIlIlIIlI(var5, var14)) {
            char var13 = var17[var5];
            var8.append((char)(var13 ^ var18[var3 % var18.length]));
            0;
            ++var3;
            ++var5;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean llIlllIlIlIIII(int n2) {
        return n2 == 0;
    }

    static {
        aG.llIlllIlIIllII();
        aG.llIlllIlIIlIll();
        dV = lIlIlIIllIIl[1];
        dW = lIlIlIIllIIl[0];
        dS = lIlIlIIllIIl[4];
        dU = lIlIlIIllIIl[2];
        dT = lIlIlIIllIIl[3];
    }

    private static boolean llIlllIlIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIlllIlIIlllI(Object object) {
        return object != null;
    }

    private static boolean llIlllIlIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

