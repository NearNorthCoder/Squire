/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.g;
import m.e.a.i.z.m.r.-.q.s.y.u.i;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Looting Items -> LootingTask */
@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class v
extends Task {
    private static /* synthetic */ String[] lIllIIIlIlIlI;
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireZammyConfig aq;
    private final /* synthetic */ l an;
    private static /* synthetic */ int[] lIllIIIlIlIll;

    private static boolean llIIIlIlIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIllllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        int var11;
        int n2;
        v var8;
        if (!v.llIIIlIIllllIll(this.an.B() ? 1 : 0) || v.llIIIlIIllllIll(this.an.A() ? 1 : 0)) {
            return lIllIIIlIlIll[0];
        }
        TileItem var4 = var8.P();
        if (v.llIIIlIIlllllII(var4) && v.llIIIlIIlllllIl(var8.ao.a(var4), lIllIIIlIlIll[1])) {
            n2 = lIllIIIlIlIll[2];
            0;
            if ((0x5C ^ 0x58) == 2) {
                return false;
            }
        } else {
            n2 = var11 = lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(var8.an.D() ? 1 : 0) && v.llIIIlIIllllllI(var11)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIlllllll(var8.an.z(), lIllIIIlIlIll[3]) && v.llIIIlIIllllllI(var11)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Movement.isRunEnabled() ? 1 : 0) && v.llIIIlIIllllIll(var8.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.llIIIlIlIIIIIII(var4)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllIIIlIlIll[2]];
            nArray[v.lIllIIIlIlIll[0]] = var4.getId();
            if (!v.llIIIlIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) || v.llIIIlIIllllllI(var4.isStackable() ? 1 : 0)) {
                Item var5 = var8.ap.w();
                if (v.llIIIlIIlllllII(var5)) {
                    var5.interact(lIllIIIlIlIlI[lIllIIIlIlIll[0]]);
                    return lIllIIIlIlIll[2];
                }
                Item var9 = var8.ao.y().orElse(null);
                if (v.llIIIlIlIIIIIII(var9)) {
                    return lIllIIIlIlIll[0];
                }
                if (v.llIIIlIIllllllI(var8.ao.a(var9, var4) ? 1 : 0)) {
                    return lIllIIIlIlIll[0];
                }
                var9.interact(lIllIIIlIlIlI[lIllIIIlIlIll[2]]);
            }
        }
        if (v.llIIIlIIllllIll(Movement.shouldWalk() ? 1 : 0)) {
            var4.interact(lIllIIIlIlIlI[lIllIIIlIlIll[4]]);
            var8.sleep(lIllIIIlIlIll[2]);
        }
        return lIllIIIlIlIll[2];
    }

    private static void llIIIlIIllllIIl() {
        lIllIIIlIlIlI = new String[lIllIIIlIlIll[5]];
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[0]] = v."Eat";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[2]] = v."Drop";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[4]] = v."Take";
    }

    private static boolean llIIIlIIlllllII(Object object) {
        return object != null;
    }

    private static void llIIIlIIllllIlI() {
        lIllIIIlIlIll = new int[7];
        v.lIllIIIlIlIll[0] = (0x67 ^ 0x43) & ~(0x73 ^ 0x57);
        v.lIllIIIlIlIll[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        v.lIllIIIlIlIll[2] = 1;
        v.lIllIIIlIlIll[3] = 90 + 108 - 129 + 76 ^ 104 + 134 - 91 + 8;
        v.lIllIIIlIlIll[4] = 2;
        v.lIllIIIlIlIll[5] = 3;
        v.lIllIIIlIlIll[6] = 0x82 ^ 0x92 ^ (0x12 ^ 0xA);
    }

    private static boolean llIIIlIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private TileItem P() {
        return this.ao.x().orElse(null);
    }

    private static String llIIIlIIllllIII(String var3, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIIIlIlIll[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIllIIIlIlIll[4], var12);
            return new String(var16.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        v.llIIIlIIllllIlI();
        v.llIIIlIIllllIIl();
    }

    private static String llIIIlIIlllIlll(String var1, String var17) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var6 = lIllIIIlIlIll[0];
        char[] var10 = var1.toCharArray();
        int var14 = var10.length;
        int var2 = lIllIIIlIlIll[0];
        while (v.llIIIlIlIIIIIIl(var2, var14)) {
            char var13 = var10[var2];
            var7.append((char)(var13 ^ var19[var6 % var19.length]));
            0;
            ++var6;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    @Inject
    public v(l l2, i i2, g g2, SquireZammyConfig squireZammyConfig) {
        this.an = l2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireZammyConfig;
    }

    private static boolean llIIIlIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIIllllllI(int n2) {
        return n2 == 0;
    }
}

