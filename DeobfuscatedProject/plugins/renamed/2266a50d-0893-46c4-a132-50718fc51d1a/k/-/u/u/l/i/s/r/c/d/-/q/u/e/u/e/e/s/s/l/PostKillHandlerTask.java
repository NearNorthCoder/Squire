/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h_Unknown;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Post Kill Handler -> PostkillhandlerTask */
@TaskDesc(name="Post Kill Handler", blocking=true, priority=4999)
public class PostKillHandlerTask
extends Task {
    private final /* synthetic */ SquireDukeSucellusConfig aY;
    private static /* synthetic */ int[] lIllIlllIlll;
    private /* synthetic */ a u;
    private final /* synthetic */ SquireDukeSucellus aX;
    private static /* synthetic */ String[] lIllIlllIllI;

    @Inject
    public z(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aY = squireDukeSucellusConfig;
        this.aX = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static void lllIlIIllllIIl() {
        lIllIlllIlll = new int[9];
        z.lIllIlllIlll[0] = (0xA9 ^ 0xA6) & ~(0xC ^ 3);
        z.lIllIlllIlll[1] = 1;
        z.lIllIlllIlll[2] = 2;
        z.lIllIlllIlll[3] = 3;
        z.lIllIlllIlll[4] = 0xEA ^ 0xA7 ^ (0xDC ^ 0x95);
        z.lIllIlllIlll[5] = 51 + 8 - -52 + 21 ^ 0 + 73 - -30 + 26;
        z.lIllIlllIlll[6] = 0x14 ^ 0x4A ^ (0x2E ^ 0x76);
        z.lIllIlllIlll[7] = 0x6C ^ 0xC ^ (0x4C ^ 0x2B);
        z.lIllIlllIlll[8] = 0x7F ^ 0x77;
    }

    static {
        z.lllIlIIllllIIl();
        z.lllIlIIllllIII();
    }

    private static String lllIlIIlllIlll(String var12, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIllIlllIlll[2], var6);
            return new String(var13.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIllllIlI(int n2) {
        return n2 == 0;
    }

    private static String lllIlIIlllIllI(String var4, String var19) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var8 = var19.toCharArray();
        int var15 = lIllIlllIlll[0];
        char[] var21 = var4.toCharArray();
        int var2 = var21.length;
        int var17 = lIllIlllIlll[0];
        while (z.lllIlIIlllllII(var17, var2)) {
            char var1 = var21[var17];
            var10.append((char)(var1 ^ var8[var15 % var8.length]));
            0;
            ++var15;
            ++var17;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var7;
        if (z.lllIlIIllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIllllIlI(var7.aX.l() ? 1 : 0)) {
            return lIllIlllIlll[0];
        }
        TileObject var22 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (z.lllIlIIlllllIl(tileObject.getName().equals(lIllIlllIllI[lIllIlllIlll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllIlll[1]];
                stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[7]];
                if (z.lllIlIIlllllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllIlll[1];
                    0;
                    if (2 > ((69 + 25 - 79 + 134 ^ 58 + 78 - 66 + 61) & (131 + 102 - 145 + 100 ^ 3 + 42 - -5 + 120 ^ -1))) return n2 != 0;
                    return ((0xCF ^ 0xAB ^ (0x64 ^ 0x15)) & (0x21 ^ 0x6A ^ (0x9B ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = lIllIlllIlll[0];
            return n2 != 0;
        });
        if (z.lllIlIIllllIll(var22)) {
            var7.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int var18 = Inventory.getAll(item -> {
            int n2;
            if (!z.lllIlIIllllIlI(item.getName().contains(lIllIlllIllI[lIllIlllIlll[4]]) ? 1 : 0) || z.lllIlIIlllllIl(item.getName().contains(lIllIlllIllI[lIllIlllIlll[5]]) ? 1 : 0)) {
                n2 = lIllIlllIlll[1];
                0;
                
                }
            } else {
                n2 = lIllIlllIlll[0];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIllIlllIllI[lIllIlllIlll[1]])[lIllIlllIlll[1]].replace(lIllIlllIllI[lIllIlllIlll[2]], lIllIlllIllI[lIllIlllIlll[3]]))).sum();
        if (z.lllIlIIlllllII(var18, var7.aY.prayDoses())) {
            var7.aX.f(lIllIlllIlll[1]);
            var7.aX.g(lIllIlllIlll[1]);
            var7.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        int var5 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlllIlll[1]];
            stringArray[z.lIllIlllIlll[0]] = lIllIlllIllI[lIllIlllIlll[0]];
            return item.hasAction(stringArray);
        });
        if (z.lllIlIIlllllII(var5, var7.aY.food())) {
            var7.aX.f(lIllIlllIlll[1]);
            var7.aX.g(lIllIlllIlll[1]);
            var7.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        if (z.lllIlIIlllllIl(Players.getLocal().getWorldLocation().equals((Object)h.e(var22)) ? 1 : 0)) {
            var7.aX.d(lIllIlllIlll[0]);
            return lIllIlllIlll[0];
        }
        Movement.setDestination((WorldPoint)h.e((TileObject)var1_1));
        return lIllIlllIlll[1];
    }

    private static boolean lllIlIIllllIll(Object object) {
        return object == null;
    }

    private static void lllIlIIllllIII() {
        lIllIlllIllI = new String[lIllIlllIlll[8]];
        z.lIllIlllIllI[z.lIllIlllIlll[0]] = z."Eat";
        z.lIllIlllIllI[z.lIllIlllIlll[1]] = z."\\(";
        z.lIllIlllIllI[z.lIllIlllIlll[2]] = z.")";
        z.lIllIlllIllI[z.lIllIlllIlll[3]] = z."";
        z.lIllIlllIllI[z.lIllIlllIlll[4]] = z."Prayer";
        z.lIllIlllIllI[z.lIllIlllIlll[5]] = z."restore";
        z.lIllIlllIllI[z.lIllIlllIlll[6]] = z."Gate";
        z.lIllIlllIllI[z.lIllIlllIlll[7]] = z."Leave";
    }

    private static String lllIlIIlllIlIl(String var20, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllIlllIlll[8]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIllIlllIlll[2], var9);
            return new String(var16.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIIlllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIlllllII(int n2, int n3) {
        return n2 < n3;
    }
}

