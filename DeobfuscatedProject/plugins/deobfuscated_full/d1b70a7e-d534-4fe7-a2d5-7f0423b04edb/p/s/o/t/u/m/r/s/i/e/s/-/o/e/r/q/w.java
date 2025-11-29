/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.x;

/* TASK: Boarding ship -> BoardingshipTask */
@TaskDesc(name="Boarding ship", priority=10, blocking=true)
public class w
extends x {
    private static /* synthetic */ int[] lIIllIlllIIll;
    private /* synthetic */ int ak;
    private static /* synthetic */ String[] lIIllIlllIIlI;

    private static boolean lIllIIIllIIlIIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIllIIIIll(String var13, String var22) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIll[10]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIllIlllIIll[6], var14);
            return new String(var6.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        w.lIllIIIllIIIlll();
        w.lIllIIIllIIIllI();
    }

    private static boolean lIllIIIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        void var21;
        Player player = Players.getLocal();
        if (w.lIllIIIllIIlIII(player)) {
            return lIIllIlllIIll[0];
        }
        if (w.lIllIIIllIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIIllIlllIIll[0];
        }
        String[] stringArray = new String[lIIllIlllIIll[1]];
        stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[0]];
        if (w.lIllIIIllIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            llllllllllllllIlllIllIlllllllIII.ak = lIIllIlllIIll[0];
            return lIIllIlllIIll[0];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (w.lIllIIIllIIlIIl(tileObject.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlllIIll[1]];
                stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[8]];
                if (w.lIllIIIllIIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIlllIIll[1];
                    0;
                    if ((0x71 ^ 0x75) != 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIlllIIll[0];
            return n2 != 0;
        });
        if (w.lIllIIIllIIlIII(var5)) {
            return lIIllIlllIIll[0];
        }
        int[] nArray = new int[lIIllIlllIIll[1]];
        nArray[w.lIIllIlllIIll[0]] = lIIllIlllIIll[4];
        TileObject var3 = TileObjects.getFirstAt((int)lIIllIlllIIll[2], (int)lIIllIlllIIll[3], (int)lIIllIlllIIll[0], (int[])nArray);
        if (w.lIllIIIllIIlIII(var3)) {
            return lIIllIlllIIll[0];
        }
        if (!w.lIllIIIllIIlIll(var21.getWorldLocation().getX(), var3.getWorldLocation().getX()) || w.lIllIIIllIIlIIl(var21.isMoving() ? 1 : 0)) {
            return lIIllIlllIIll[0];
        }
        var2_2.interact(lIIllIlllIIlI[lIIllIlllIIll[1]]);
        this.sleepWhile(lIIllIlllIIll[5], () -> {
            boolean bl;
            if (!w.lIllIIIllIIlIlI(player.isMoving() ? 1 : 0) || w.lIllIIIllIIlIIl(Inventory.contains(item -> {
                int n2;
                if (w.lIllIIIllIIlIIl(item.getName().contains(lIIllIlllIIlI[lIIllIlllIIll[6]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlllIIll[1]];
                    stringArray[w.lIIllIlllIIll[0]] = lIIllIlllIIlI[lIIllIlllIIll[5]];
                    if (w.lIllIIIllIIlIlI(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIlllIIll[1];
                        0;
                        if ((0x7E ^ 0x7A) > 1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIllIlllIIll[0];
                return n2 != 0;
            }) ? 1 : 0)) {
                bl = lIIllIlllIIll[1];
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                bl = lIIllIlllIIll[0];
            }
            return bl;
        });
        return lIIllIlllIIll[1];
    }

    private static boolean lIllIIIllIIlIlI(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIllIIIlII(String var1, String var11) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var12 = var11.toCharArray();
        int var16 = lIIllIlllIIll[0];
        char[] var4 = var1.toCharArray();
        int var10 = var4.length;
        int var20 = lIIllIlllIIll[0];
        while (w.lIllIIIllIIllII(var20, var10)) {
            char var8 = var4[var20];
            var19.append((char)(var8 ^ var12[var16 % var12.length]));
            0;
            ++var16;
            ++var20;
            0;
            if ((0x46 ^ 0x42) != 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static String lIllIIIllIIIlIl(String var15, String var2) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIllIlllIIll[6], var9);
            return new String(var17.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIllIIIllI() {
        lIIllIlllIIlI = new String[lIIllIlllIIll[9]];
        w.lIIllIlllIIlI[w.lIIllIlllIIll[0]] = w."Bucket";
        w.lIIllIlllIIlI[w.lIIllIlllIIll[1]] = w."Use";
        w.lIIllIlllIIlI[w.lIIllIlllIIll[6]] = w."Bucket";
        w.lIIllIlllIIlI[w.lIIllIlllIIll[5]] = w."Empty";
        w.lIIllIlllIIlI[w.lIIllIlllIIll[7]] = w."Water pump";
        w.lIIllIlllIIlI[w.lIIllIlllIIll[8]] = w."Use";
    }

    @Inject
    protected w(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIllIlllIIll[0];
    }

    private static boolean lIllIIIllIIlIII(Object object) {
        return object == null;
    }

    private static void lIllIIIllIIIlll() {
        lIIllIlllIIll = new int[11];
        w.lIIllIlllIIll[0] = (0xE3 ^ 0xB2 ^ (0x8D ^ 0x83)) & (0x53 ^ 0 ^ (0x82 ^ 0x8E) ^ -1);
        w.lIIllIlllIIll[1] = 1;
        w.lIIllIlllIIll[2] = -(0xFFFFFAFF & 0x37C1) & (0xFFFFBFFF & 0x7EFF);
        w.lIIllIlllIIll[3] = -(0xFFFFF623 & 0x7DDE) & (0xFFFFFFFB & 0x7F1D);
        w.lIIllIlllIIll[4] = 0xFFFFE15D & 0xBFFB;
        w.lIIllIlllIIll[5] = 3;
        w.lIIllIlllIIll[6] = 2;
        w.lIIllIlllIIll[7] = 0x75 ^ 0x71;
        w.lIIllIlllIIll[8] = 88 + 125 - 176 + 109 ^ 105 + 149 - 107 + 4;
        w.lIIllIlllIIll[9] = 0x2E ^ 0x28;
        w.lIIllIlllIIll[10] = 0xD2 ^ 0x85 ^ (0x4D ^ 0x12);
    }
}

