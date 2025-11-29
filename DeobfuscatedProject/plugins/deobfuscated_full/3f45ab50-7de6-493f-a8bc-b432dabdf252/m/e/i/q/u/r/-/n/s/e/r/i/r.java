/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Doing gem rocks -> DoinggemrocksTask */
@TaskDesc(name="Doing gem rocks", priority=100, blocking=true)
public class r
extends Task {
    private static /* synthetic */ int[] llllllIlIlII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] llllllIlIIll;
    private final /* synthetic */ int[] w;

    private static String lIIlIlIIlIIlIII(String var16, String var18) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llllllIlIlII[5], var6);
            return new String(var1.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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
                    if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])this.w) ? 1 : 0)) break block2;
                    int[] nArray = new int[llllllIlIlII[3]];
                    nArray[r.llllllIlIlII[1]] = llllllIlIlII[9];
                    if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[llllllIlIlII[3]];
                    nArray2[r.llllllIlIlII[1]] = llllllIlIlII[13];
                    if (!r.lIIlIlIIlIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[llllllIlIlII[3]];
                nArray[r.llllllIlIlII[1]] = llllllIlIlII[10];
                if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[llllllIlIlII[3]];
                nArray3[r.llllllIlIlII[1]] = llllllIlIlII[12];
                if (!r.lIIlIlIIlIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llllllIlIlII[3]];
                nArray4[r.llllllIlIlII[1]] = llllllIlIlII[11];
                if (!r.lIIlIlIIlIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = llllllIlIlII[3];
            0;
            if (-(0xB0 ^ 0xB4) <= 0) return n2 != 0;
            return false;
        }
        n2 = llllllIlIlII[1];
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIIllIl(Object object) {
        return object == null;
    }

    private static void lIIlIlIIlIIlIlI() {
        llllllIlIlII = new int[16];
        r.llllllIlIlII[0] = 0xA ^ 0xE;
        r.llllllIlIlII[1] = (3 ^ (2 ^ 9)) & (93 + 128 - 171 + 105 ^ 139 + 41 - 93 + 60 ^ -1);
        r.llllllIlIlII[2] = 223 + 121 - 101 + 6;
        r.llllllIlIlII[3] = 1;
        r.llllllIlIlII[4] = 121 + 66 - 10 + 74;
        r.llllllIlIlII[5] = 2;
        r.llllllIlIlII[6] = 204 + 54 - 109 + 104;
        r.llllllIlIlII[7] = 3;
        r.llllllIlIlII[8] = 32 + 184 - 43 + 82;
        r.llllllIlIlII[9] = -(0xFFFFB869 & Short.MAX_VALUE) & (0xFFFFFFFB & 0x3FFF);
        r.llllllIlIlII[10] = 0xFFFFC3FF & 0x3FB2;
        r.llllllIlIlII[11] = -2 & (0xFFFFBBBD & 0x5CFF);
        r.llllllIlIlII[12] = -(0xFFFFE553 & 0x1FEF) & (0xFFFFDDFF & 0x3FFF);
        r.llllllIlIlII[13] = (0x93 ^ 0x8B) + (66 + 190 - 140 + 104) - (101 + 144 - 171 + 76) + (113 + 86 - 145 + 85);
        r.llllllIlIlII[14] = -(0xFFFFDCCF & 0x73BC) & (0xFFFFFEFF & 0x7DFF);
        r.llllllIlIlII[15] = 0xFFFF8F3F & 0x7BD3;
    }

    static {
        r.lIIlIlIIlIIlIlI();
        r.lIIlIlIIlIIlIIl();
    }

    private static boolean lIIlIlIIlIIllII(int n2) {
        return n2 != 0;
    }

    private void r() {
        if (r.lIIlIlIIlIIllII(Inventory.contains((int[])this.w) ? 1 : 0)) {
            int[] nArray = new int[llllllIlIlII[3]];
            nArray[r.llllllIlIlII[1]] = llllllIlIlII[9];
            Inventory.getFirst((int[])this.w).useOn(Inventory.getFirst((int[])nArray));
            0;
            if ((0xD3 ^ 0xA4 ^ (0x47 ^ 0x34)) < 3) {
                return;
            }
        } else {
            int[] nArray = new int[llllllIlIlII[3]];
            nArray[r.llllllIlIlII[1]] = llllllIlIlII[10];
            int[] nArray2 = new int[llllllIlIlII[5]];
            nArray2[r.llllllIlIlII[1]] = llllllIlIlII[11];
            nArray2[r.llllllIlIlII[3]] = llllllIlIlII[12];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static void lIIlIlIIlIIlIIl() {
        llllllIlIIll = new String[llllllIlIlII[5]];
        r.llllllIlIIll[r.llllllIlIlII[1]] = r."Mine";
        r.llllllIlIIll[r.llllllIlIlII[3]] = r."Mine";
    }

    private static boolean lIIlIlIIlIIllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var14;
        if (r.lIIlIlIIlIIlIll((Object)this.f.activity(), (Object)a.GEM_ROCKS)) {
            return llllllIlIlII[1];
        }
        if (r.lIIlIlIIlIIllII(Inventory.isFull() ? 1 : 0)) {
            return llllllIlIlII[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIlIlIIlIIllll(tileObject.getId(), llllllIlIlII[14]) && r.lIIlIlIIlIlIIII(tileObject.getWorldX(), llllllIlIlII[15])) {
                n2 = llllllIlIlII[3];
                0;
                if (3 <= 2) {
                    return ((0x6E ^ 0x25 ^ (3 ^ 0x77)) & (0x33 ^ 0x53 ^ (7 ^ 0x58) ^ -1)) != 0;
                }
            } else {
                n2 = llllllIlIlII[1];
            }
            return n2 != 0;
        });
        if (r.lIIlIlIIlIIllIl(var2)) {
            return llllllIlIlII[1];
        }
        WorldPoint var17 = var2.getWorldLocation();
        WorldPoint var9 = Players.getLocal().getWorldLocation();
        if (r.lIIlIlIIlIIllII(var9.toWorldArea().isInMeleeDistance(var17) ? 1 : 0)) {
            var2.interact(llllllIlIIll[llllllIlIlII[1]]);
            return llllllIlIlII[3];
        }
        if (r.lIIlIlIIlIIllII(var14.n() ? 1 : 0)) {
            var14.r();
        }
        var1_1.interact(llllllIlIIll[llllllIlIlII[3]]);
        this.sleep(llllllIlIlII[3]);
        return llllllIlIlII[3];
    }

    private static boolean lIIlIlIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlIIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public r() {
        int[] nArray = new int[llllllIlIlII[0]];
        nArray[r.llllllIlIlII[1]] = llllllIlIlII[2];
        nArray[r.llllllIlIlII[3]] = llllllIlIlII[4];
        nArray[r.llllllIlIlII[5]] = llllllIlIlII[6];
        nArray[r.llllllIlIlII[7]] = llllllIlIlII[8];
        this.w = nArray;
    }

    private static boolean lIIlIlIIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIIlIIIlll(String var15, String var7) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var3 = var7.toCharArray();
        int var8 = llllllIlIlII[1];
        char[] var12 = var15.toCharArray();
        int var11 = var12.length;
        int var4 = llllllIlIlII[1];
        while (r.lIIlIlIIlIlIIIl(var4, var11)) {
            char var13 = var12[var4];
            var10.append((char)(var13 ^ var3[var8 % var3.length]));
            0;
            ++var8;
            ++var4;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var10);
    }
}

