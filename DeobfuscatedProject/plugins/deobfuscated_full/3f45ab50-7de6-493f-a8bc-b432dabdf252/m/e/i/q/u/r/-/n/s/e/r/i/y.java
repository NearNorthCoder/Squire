/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Doing ardy rocks -> DoingardyrocksTask */
@TaskDesc(name="Doing ardy rocks", priority=100, blocking=true)
public class y
extends Task {
    private static /* synthetic */ int[] lllllllIIIll;
    private static /* synthetic */ String[] lllllllIIIlI;
    private final /* synthetic */ int[] O;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

    private static boolean lIIlIlIlIIIIlII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIlIIIIIll() {
        lllllllIIIll = new int[18];
        y.lllllllIIIll[0] = 8 ^ 0xC;
        y.lllllllIIIll[1] = 2 & ~2;
        y.lllllllIIIll[2] = 108 + 57 - 128 + 212;
        y.lllllllIIIll[3] = 1;
        y.lllllllIIIll[4] = 211 + 110 - 156 + 86;
        y.lllllllIIIll[5] = 2;
        y.lllllllIIIll[6] = (0x12 ^ 0x21) + (127 + 117 - 154 + 122) - (160 + 176 - 228 + 70) + (135 + 75 - 99 + 57);
        y.lllllllIIIll[7] = 3;
        y.lllllllIIIll[8] = 22 + 142 - 32 + 123;
        y.lllllllIIIll[9] = 0xFFFFA1BF & 0x5FF8;
        y.lllllllIIIll[10] = 0xFFFFAFB7 & 0x57DB;
        y.lllllllIIIll[11] = 0xFFFFC3FB & 0x3FB6;
        y.lllllllIIIll[12] = 0xFFFFDBFF & 0x3CBC;
        y.lllllllIIIll[13] = -(0xFFFFD6EF & 0x6F53) & (0xFFFFFEFF & 0x5FFF);
        y.lllllllIIIll[14] = 24 + 115 - 81 + 175;
        y.lllllllIIIll[15] = -(0xFFFF9FA3 & 0x71DD) & (0xFFFFFFFD & 0x3DE6);
        y.lllllllIIIll[16] = -(0xFFFFFBDB & 0x1737) & (0xFFFFFFF7 & 0x3F7F);
        y.lllllllIIIll[17] = -(0xFFFFD769 & 0x78BF) & (0xFFFFDBBF & 0x7EFF);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var8;
        if (y.lIIlIlIlIIIIlII((Object)this.f.activity(), (Object)a.ARDY_IRON)) {
            return lllllllIIIll[1];
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIIlIlIlIIIIllI(List.of(Integer.valueOf(lllllllIIIll[15]), Integer.valueOf(lllllllIIIll[16])).contains(tileObject.getId()) ? 1 : 0) && y.lIIlIlIlIIIIlll(tileObject.getWorldX(), lllllllIIIll[17])) {
                n2 = lllllllIIIll[3];
                0;
                if (3 < 0) {
                    return false;
                }
            } else {
                n2 = lllllllIIIll[1];
            }
            return n2 != 0;
        });
        if (y.lIIlIlIlIIIIlIl(var16)) {
            return lllllllIIIll[1];
        }
        WorldPoint var5 = var16.getWorldLocation();
        WorldPoint var7 = Players.getLocal().getWorldLocation();
        if (y.lIIlIlIlIIIIllI(var7.toWorldArea().isInMeleeDistance(var5) ? 1 : 0)) {
            var16.interact(lllllllIIIlI[lllllllIIIll[1]]);
            return lllllllIIIll[3];
        }
        int[] nArray = new int[lllllllIIIll[3]];
        nArray[y.lllllllIIIll[1]] = lllllllIIIll[9];
        int var2 = Inventory.getCount((int[])nArray);
        if (y.lIIlIlIlIIIIlll(var2, lllllllIIIll[3])) {
            int[] nArray2 = new int[lllllllIIIll[3]];
            nArray2[y.lllllllIIIll[1]] = lllllllIIIll[9];
            Inventory.getAll((int[])nArray2).subList(lllllllIIIll[1], Math.min(lllllllIIIll[7], var2)).forEach(Item::drop);
        }
        if (y.lIIlIlIlIIIIllI(var8.n() ? 1 : 0)) {
            var8.r();
        }
        var1_1.interact(lllllllIIIlI[lllllllIIIll[3]]);
        this.sleep(lllllllIIIll[3]);
        return lllllllIIIll[3];
    }

    private static boolean lIIlIlIlIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.lIIlIlIlIIIIIll();
        y.lIIlIlIlIIIIIlI();
    }

    public y() {
        int[] nArray = new int[lllllllIIIll[0]];
        nArray[y.lllllllIIIll[1]] = lllllllIIIll[2];
        nArray[y.lllllllIIIll[3]] = lllllllIIIll[4];
        nArray[y.lllllllIIIll[5]] = lllllllIIIll[6];
        nArray[y.lllllllIIIll[7]] = lllllllIIIll[8];
        this.O = nArray;
    }

    private static boolean lIIlIlIlIIIlIII(int n2) {
        return n2 == 0;
    }

    private void r() {
        if (y.lIIlIlIlIIIIllI(Inventory.contains((int[])this.O) ? 1 : 0)) {
            int[] nArray = new int[lllllllIIIll[3]];
            nArray[y.lllllllIIIll[1]] = lllllllIIIll[10];
            Inventory.getFirst((int[])this.O).useOn(Inventory.getFirst((int[])nArray));
            0;
            if (((0x3F ^ 0x1E) & ~(0x65 ^ 0x44)) != 0) {
                return;
            }
        } else {
            int[] nArray = new int[lllllllIIIll[3]];
            nArray[y.lllllllIIIll[1]] = lllllllIIIll[11];
            int[] nArray2 = new int[lllllllIIIll[5]];
            nArray2[y.lllllllIIIll[1]] = lllllllIIIll[12];
            nArray2[y.lllllllIIIll[3]] = lllllllIIIll[13];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean lIIlIlIlIIIIlIl(Object object) {
        return object == null;
    }

    private static String lIIlIlIlIIIIIII(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var18 = var12.toCharArray();
        int var4 = lllllllIIIll[1];
        char[] var9 = var11.toCharArray();
        int var6 = var9.length;
        int var15 = lllllllIIIll[1];
        while (y.lIIlIlIlIIIlIIl(var15, var6)) {
            char var1 = var9[var15];
            var19.append((char)(var1 ^ var18[var4 % var18.length]));
            0;
            ++var4;
            ++var15;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIlIlIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])this.O) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllllIIIll[3]];
                    nArray[y.lllllllIIIll[1]] = lllllllIIIll[10];
                    if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllllIIIll[3]];
                    nArray2[y.lllllllIIIll[1]] = lllllllIIIll[14];
                    if (!y.lIIlIlIlIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllllIIIll[3]];
                nArray[y.lllllllIIIll[1]] = lllllllIIIll[11];
                if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllllIIIll[3]];
                nArray3[y.lllllllIIIll[1]] = lllllllIIIll[13];
                if (!y.lIIlIlIlIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllllIIIll[3]];
                nArray4[y.lllllllIIIll[1]] = lllllllIIIll[12];
                if (!y.lIIlIlIlIIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllllIIIll[3];
            0;
            if (null == null) return n2 != 0;
            return ((0x6F ^ 0x4F ^ (0xD ^ 0x37)) & (142 + 162 - 142 + 29 ^ 26 + 21 - 24 + 142 ^ -1)) != 0;
        }
        n2 = lllllllIIIll[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIlIIIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIlIIIIIlI() {
        lllllllIIIlI = new String[lllllllIIIll[5]];
        y.lllllllIIIlI[y.lllllllIIIll[1]] = y."Mine";
        y.lllllllIIIlI[y.lllllllIIIll[3]] = y."Mine";
    }

    private static String lIIlIlIlIIIIIIl(String var17, String var3) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lllllllIIIll[5], var14);
            return new String(var10.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }
}

