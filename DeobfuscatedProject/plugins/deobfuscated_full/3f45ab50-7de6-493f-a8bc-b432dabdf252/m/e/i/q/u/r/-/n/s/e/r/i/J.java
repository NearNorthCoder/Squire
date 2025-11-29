/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Mining sandstone -> MiningsandstoneTask */
@TaskDesc(name="Mining sandstone")
public class J
extends Task {
    private static /* synthetic */ int[] lllllIllllIl;
    private static /* synthetic */ String[] lllllIllllII;
    private final /* synthetic */ SquireMiner aj;
    private final /* synthetic */ SquireMinerConfig ak;
    public static final /* synthetic */ int ai;

    private static boolean lIIlIlIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public J(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        this.aj = squireMiner;
        this.ak = squireMinerConfig;
    }

    private static String lIIlIIlllllllll(String var5, String var13) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var3 = var13.toCharArray();
        int var15 = lllllIllllIl[0];
        char[] var7 = var5.toCharArray();
        int var6 = var7.length;
        int var17 = lllllIllllIl[0];
        while (J.lIIlIlIIIIIlIll(var17, var6)) {
            char var1 = var7[var17];
            var9.append((char)(var1 ^ var3[var15 % var3.length]));
            0;
            ++var15;
            ++var17;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlIlIIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIIllllllllI(String var4, String var2) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lllllIllllIl[9]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lllllIllllIl[8], var12);
            return new String(var14.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        J.lIIlIlIIIIIIIIl();
        J.lIIlIlIIIIIIIII();
        ai = lllllIllllIl[7];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        TileObject var10;
        J var11;
        if (J.lIIlIlIIIIIIIlI((Object)this.ak.activity(), (Object)a.SANDSTONE)) {
            return lllllIllllIl[0];
        }
        int[] nArray = new int[lllllIllllIl[1]];
        nArray[J.lllllIllllIl[0]] = lllllIllllIl[2];
        if (J.lIIlIlIIIIIIIll(Inventory.getCount((int[])nArray), var11.ak.waterskins())) {
            int[] nArray2 = new int[lllllIllllIl[1]];
            nArray2[J.lllllIllllIl[0]] = lllllIllllIl[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllllII[lllllIllllIl[0]]);
        }
        Player var8 = Players.getLocal();
        if (!J.lIIlIlIIIIIIlII(Inventory.isFull() ? 1 : 0) || !J.lIIlIlIIIIIIlIl(var8) || !J.lIIlIlIIIIIIlII(var8.isAnimating() ? 1 : 0) || J.lIIlIlIIIIIIllI(var8.isMoving() ? 1 : 0)) {
            return lllllIllllIl[0];
        }
        if (J.lIIlIlIIIIIIlII(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIIlll(Movement.getRunEnergy(), lllllIllllIl[3])) {
            Movement.toggleRun();
        }
        if (J.lIIlIlIIIIIlIII(var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.lIIlIlIIIIIlIlI(tileObject.getId(), lllllIllllIl[7]) && J.lIIlIlIIIIIIllI(this.ak.area().a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllllIl[1];
                0;
                if (((29 + 165 - 21 + 37 ^ 90 + 111 - 193 + 137) & (3 ^ (0x31 ^ 0x71) ^ -1)) != ((0x85 ^ 0xA5 ^ (0x40 ^ 0x6E)) & (0xD7 ^ 0xC0 ^ (0x3B ^ 0x22) ^ -1))) {
                    return ((0xE6 ^ 0x9D ^ (0x4B ^ 0)) & (0x28 ^ 0x23 ^ (0x31 ^ 0xA) ^ -1)) != 0;
                }
            } else {
                n2 = lllllIllllIl[0];
            }
            return n2 != 0;
        }))) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllllIl[4], lllllIllllIl[5], lllllIllllIl[0]), (boolean)lllllIllllIl[0]);
            0;
            return lllllIllllIl[1];
        }
        if (J.lIIlIlIIIIIIllI(Movement.isRunEnabled() ? 1 : 0) && J.lIIlIlIIIIIlIIl(Players.getLocal().distanceTo((Locatable)var10), lllllIllllIl[6])) {
            var11.aj.a();
        }
        var2_2.interact(lllllIllllII[lllllIllllIl[1]]);
        return lllllIllllIl[1];
    }

    private static boolean lIIlIlIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIlIIIIIIIIl() {
        lllllIllllIl = new int[10];
        J.lllllIllllIl[0] = (0x8C ^ 0x83) & ~(0x33 ^ 0x3C);
        J.lllllIllllIl[1] = 1;
        J.lllllIllllIl[2] = 0xFFFFD7FF & 0x2F1F;
        J.lllllIllllIl[3] = 0x56 ^ 0x4F;
        J.lllllIllllIl[4] = -(0xFFFFB38C & 0x5EFF) & (0xFFFF9FEB & 0x7EFF);
        J.lllllIllllIl[5] = -(0xFFFFBCAD & 0x53F2) & (0xFFFF9BFF & Short.MAX_VALUE);
        J.lllllIllllIl[6] = 150 + 54 - 64 + 34 ^ 168 + 50 - 141 + 93;
        J.lllllIllllIl[7] = -(0xFFFFD3ED & 0x7F97) & (0xFFFFFFFF & 0x7FFE);
        J.lllllIllllIl[8] = 2;
        J.lllllIllllIl[9] = 0x55 ^ 0x23 ^ (0x7D ^ 3);
    }

    private static boolean lIIlIlIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIIIIII() {
        lllllIllllII = new String[lllllIllllIl[8]];
        J.lllllIllllII[J.lllllIllllIl[0]] = J."Drop";
        J.lllllIllllII[J.lllllIllllIl[1]] = J."Mine";
    }

    private static boolean lIIlIlIIIIIIlIl(Object object) {
        return object != null;
    }
}

