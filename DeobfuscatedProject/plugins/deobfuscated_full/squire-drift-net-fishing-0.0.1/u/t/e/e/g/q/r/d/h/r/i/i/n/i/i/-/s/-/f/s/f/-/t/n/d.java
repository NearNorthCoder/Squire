/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.b;

/* TASK: Chasing fish -> ChasingfishTask */
@TaskDesc(name="Chasing fish", priority=5, register=true)
public class d
extends Task {
    private final /* synthetic */ ArrayList<b> u;
    private final /* synthetic */ SquireDriftNet s;
    private final /* synthetic */ Client t;
    private static /* synthetic */ String[] lIlIIIIIlIII;
    private static /* synthetic */ int[] lIlIIIIIlIIl;

    private static String llIlIIllIIlIII(String var6, String var18) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIl[4]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlIIIIIlIIl[3], var2);
            return new String(var16.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public d(SquireDriftNet squireDriftNet, Client client) {
        this.u = new ArrayList();
        this.s = squireDriftNet;
        this.t = client;
    }

    private static String llIlIIllIIlIIl(String var22, String var29) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(lIlIIIIIlIIl[3], var20);
            return new String(var30.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIlIIlI(int n) {
        return n >= 0;
    }

    private static boolean llIlIIllIIllII(int n) {
        return n == 0;
    }

    private static boolean llIlIIllIlIIIl(Object object) {
        return object == null;
    }

    static {
        d.llIlIIllIIlIll();
        d.llIlIIllIIlIlI();
    }

    private static void llIlIIllIIlIlI() {
        lIlIIIIIlIII = new String[lIlIIIIIlIIl[8]];
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[0]] = d."Drink";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[2]] = d."Annette";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[3]] = d."Chase";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[5]] = d."Fish shoal";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[7]] = d."Stamina";
    }

    private static boolean llIlIIllIIlllI(Object object) {
        return object != null;
    }

    public boolean run() {
        d var3;
        Item var25;
        if (d.llIlIIllIIllII(this.t.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIl[0];
        }
        if (d.llIlIIllIIllIl(Movement.getRunEnergy(), lIlIIIIIlIIl[1])) {
            var25 = Inventory.getFirst(item -> item.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[7]]));
            if (d.llIlIIllIIlllI(var25)) {
                var25.interact(lIlIIIIIlIII[lIlIIIIIlIIl[0]]);
            }
            0;
            
            }
        } else if (d.llIlIIllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (d.llIlIIllIIllll(var3.s.c() ? 1 : 0)) {
            var3.u.clear();
            var3.s.a(lIlIIIIIlIIl[0]);
        }
        String[] stringArray = new String[lIlIIIIIlIIl[2]];
        stringArray[d.lIlIIIIIlIIl[0]] = lIlIIIIIlIII[lIlIIIIIlIIl[2]];
        var25 = TileObjects.getNearest((String[])stringArray);
        var3.u.removeIf(arg_0 -> d.a((TileObject)var25, arg_0));
        0;
        NPC var8 = NPCs.getNearest(nPC -> {
            d var15;
            if (d.llIlIIllIIllII(nPC.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[5]]) ? 1 : 0)) {
                return lIlIIIIIlIIl[0];
            }
            Iterator<b> var21 = var15.u.iterator();
            while (d.llIlIIllIIllll(var21.hasNext() ? 1 : 0)) {
                void var10;
                b var24 = var21.next();
                if (d.llIlIIllIIllll(var10.equals(var24.j()) ? 1 : 0)) {
                    return lIlIIIIIlIIl[0];
                }
                0;
                if (-2 <= 0) continue;
                return ((0xD7 ^ 0xB3 ^ (0xD0 ^ 0x93)) & (116 + 132 - 198 + 136 ^ 15 + 148 - 30 + 24 ^ -1)) != 0;
            }
            return lIlIIIIIlIIl[2];
        });
        if (d.llIlIIllIIlllI(var8)) {
            var8.interact(lIlIIIIIlIII[lIlIIIIIlIIl[3]]);
            var3.sleepWhile(lIlIIIIIlIIl[4], () -> {
                boolean bl;
                if (d.llIlIIllIIlllI(Players.getLocal().getInteracting())) {
                    bl = lIlIIIIIlIIl[2];
                    0;
                    if (1 > 3) {
                        return false;
                    }
                } else {
                    bl = lIlIIIIIlIIl[0];
                }
                return bl;
            });
            if (d.llIlIIllIIllll(var3.s.e() ? 1 : 0)) {
                b var13 = new b(var8);
                var13.k();
                var3.u.add(var13);
                0;
                var3.s.b(lIlIIIIIlIIl[0]);
            }
        }
        return lIlIIIIIlIIl[2];
    }

    private static void llIlIIllIIlIll() {
        lIlIIIIIlIIl = new int[9];
        d.lIlIIIIIlIIl[0] = (0x6C ^ 0x7B) & ~(0x94 ^ 0x83);
        d.lIlIIIIIlIIl[1] = 70 + 121 - 183 + 155 ^ 132 + 36 - 62 + 39;
        d.lIlIIIIIlIIl[2] = 1;
        d.lIlIIIIIlIIl[3] = 2;
        d.lIlIIIIIlIIl[4] = 0x90 ^ 0x98;
        d.lIlIIIIIlIIl[5] = 3;
        d.lIlIIIIIlIIl[6] = 20 + 55 - -72 + 34 ^ 1 + 148 - 3 + 32;
        d.lIlIIIIIlIIl[7] = 188 + 55 - 92 + 43 ^ 161 + 21 - 28 + 44;
        d.lIlIIIIIlIIl[8] = 14 + 75 - 1 + 40 ^ 41 + 20 - -36 + 36;
    }

    private static String llIlIIllIIIlll(String var11, String var27) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var23 = var27.toCharArray();
        int var26 = lIlIIIIIlIIl[0];
        char[] var19 = var11.toCharArray();
        int var4 = var19.length;
        int var5 = lIlIIIIIlIIl[0];
        while (d.llIlIIllIIllIl(var5, var4)) {
            char var17 = var19[var5];
            var1.append((char)(var17 ^ var23[var26 % var23.length]));
            0;
            ++var26;
            ++var5;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean llIlIIllIIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIllIIllll(int n) {
        return n != 0;
    }

    private static int llIlIIllIlIIII(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(TileObject tileObject, b b2) {
        boolean bl;
        void var28;
        WorldArea var7;
        TileObject var12;
        if (d.llIlIIllIlIIIl(b2.j())) {
            return lIlIIIIIlIIl[2];
        }
        if (d.llIlIIllIIlllI(var12) && d.llIlIIllIIllll((var7 = new WorldArea(new WorldPoint(var12.getX() - lIlIIIIIlIIl[5], var12.getY() - lIlIIIIIlIIl[6], var12.getPlane()), new WorldPoint(var12.getX() + lIlIIIIIlIIl[7], var12.getY(), var12.getPlane()))).contains((Locatable)var28.j()) ? 1 : 0)) {
            boolean bl2;
            if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(var28.l().getElapsed().getSeconds(), 24L))) {
                bl2 = lIlIIIIIlIIl[2];
                0;
                if (-(98 + 26 - 75 + 78 ^ (0x38 ^ 0x43)) >= 0) {
                    return ((0x28 ^ 0x12 ^ (0x8E ^ 0x9E)) & (0xF9 ^ 0x8A ^ (0xC6 ^ 0x9F) ^ -1)) != 0;
                }
            } else {
                bl2 = lIlIIIIIlIIl[0];
            }
            return bl2;
        }
        if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(var28.l().getElapsed().getSeconds(), 12L))) {
            bl = lIlIIIIIlIIl[2];
            0;
            if (-(0x45 ^ 0x40) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIl[0];
        }
        return bl;
    }
}

