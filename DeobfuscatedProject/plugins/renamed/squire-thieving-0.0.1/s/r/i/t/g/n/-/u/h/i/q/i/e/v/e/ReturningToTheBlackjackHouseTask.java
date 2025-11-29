/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.CEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BlackjackingTask;

/* TASK: Returning to the blackjack house -> ReturningtotheblackjackhouseTask */
@TaskDesc(name="Returning to the blackjack house", priority=2, blocking=true)
public class ReturningToTheBlackjackHouseTask
extends Task {
    private static /* synthetic */ String[] lIIllIllIIIII;
    private final /* synthetic */ SquireThieving Y;
    private final /* synthetic */ SquireThievingConfig Z;
    private static /* synthetic */ int[] lIIllIllIIIIl;

    static {
        q.lIllIIIIlllllll();
        q.lIllIIIIllllllI();
    }

    public boolean run() {
        NPC var9;
        List var4;
        q var8;
        if (q.lIllIIIlIIIIIII((Object)this.Z.method(), (Object)b.BLACK_JACK)) {
            return lIIllIllIIIIl[0];
        }
        Player var6 = Players.getLocal();
        if (q.lIllIIIlIIIIIIl(var6)) {
            return lIIllIllIIIIl[0];
        }
        if (q.lIllIIIlIIIIIlI(var8.Y.i() ? 1 : 0)) {
            return lIIllIllIIIIl[0];
        }
        int var29 = Inventory.getCount(item -> item.hasAction(k.z));
        if (q.lIllIIIlIIIIIll(var29)) {
            return lIIllIllIIIIl[0];
        }
        WorldPoint var1 = var6.getWorldLocation();
        c var28 = var8.Y.b().t();
        c var14 = c.b(var1);
        if (q.lIllIIIlIIIIlII((Object)var14) && q.lIllIIIlIIIIIII((Object)var28, (Object)var14)) {
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[0]]);
            var4 = var8.Y.a(var14, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(var4)) {
                return var8.Y.a(var6, lIIllIllIIIIl[1]);
            }
            var9 = NPCs.getNearest(nPC -> {
                int n2;
                if (q.lIllIIIlIIIIlII(nPC)) {
                    WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                    worldAreaArray[q.lIIllIllIIIIl[0]] = var14.p();
                    if (q.lIllIIIlIIIIIll(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIllIIIIl[1]];
                        stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[12]];
                        if (q.lIllIIIlIIIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIllIllIIIIl[1];
                            0;
                            if (((0x29 ^ 0x3B) & ~(0x89 ^ 0x9B)) <= ((0x7A ^ 0x41) & ~(0x40 ^ 0x7B))) return n2 != 0;
                            return false;
                        }
                    }
                }
                n2 = lIIllIllIIIIl[0];
                return n2 != 0;
            });
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[1]]);
            if (q.lIllIIIlIIIIlII(var9)) {
                var9.interact(lIIllIllIIIII[lIIllIllIIIIl[2]]);
                return lIIllIllIIIIl[0];
            }
        }
        if (q.lIllIIIlIIIIlIl((var4 = NPCs.getAll(nPC -> {
            int n2;
            if (q.lIllIIIlIIIIlII(nPC) && q.lIllIIIlIIIIIlI(nPC.getName().equals(this.Y.b().v()) ? 1 : 0)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                worldAreaArray[q.lIIllIllIIIIl[0]] = var28.p();
                if (q.lIllIIIlIIIIIlI(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = lIIllIllIIIIl[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIllIIIIl[0];
            return n2 != 0;
        })).size(), lIIllIllIIIIl[1])) {
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[3]]);
            return lIIllIllIIIIl[0];
        }
        if (q.lIllIIIlIIIIIll(Movement.isRunEnabled() ? 1 : 0) && q.lIllIIIlIIIIlIl(Movement.getRunEnergy(), lIIllIllIIIIl[4])) {
            Movement.toggleRun();
        }
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
        worldAreaArray[q.lIIllIllIIIIl[0]] = var28.p();
        if (q.lIllIIIlIIIIIll(var1.isInArea(worldAreaArray) ? 1 : 0)) {
            int var12;
            int n2;
            var9 = var8.Y.a(var28, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(var9)) {
                return var8.Y.a(var6, lIIllIllIIIIl[1]);
            }
            if (q.lIllIIIlIIIIlIl(var1.distanceTo(var28.p().getRandom()), lIIllIllIIIIl[5])) {
                n2 = lIIllIllIIIIl[1];
                0;
                if (3 != 3) {
                    return false;
                }
            } else {
                n2 = lIIllIllIIIIl[0];
            }
            if (q.lIllIIIlIIIIIlI(var12 = n2)) {
                Object[] objectArray = new Object[lIIllIllIIIIl[1]];
                objectArray[q.lIIllIllIIIIl[0]] = var28;
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[6]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)var28.p().getRandom());
                0;
                return lIIllIllIIIIl[1];
            }
            TileObject var18 = TileObjects.getNearest(tileObject -> {
                int n2;
                block2: {
                    block3: {
                        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                        worldAreaArray[q.lIIllIllIIIIl[0]] = var28.p();
                        if (!q.lIllIIIlIIIIIlI(tileObject.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[lIIllIllIIIIl[1]];
                        stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[10]];
                        if (!q.lIllIIIlIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIIllIllIIIIl[1]];
                        stringArray2[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[11]];
                        if (!q.lIllIIIlIIIIIlI(tileObject.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    n2 = lIIllIllIIIIl[1];
                    0;
                    if (-1 <= -1) return n2 != 0;
                    return ((0xD6 ^ 0xAC ^ (0x87 ^ 0xB0)) & (0xBA ^ 0xC4 ^ (0x64 ^ 0x57) ^ -1)) != 0;
                }
                n2 = lIIllIllIIIIl[0];
                return n2 != 0;
            });
            if (q.lIllIIIlIIIIlII(var18)) {
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[7]]);
                String[] stringArray = new String[lIIllIllIIIIl[2]];
                stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[8]];
                stringArray[q.lIIllIllIIIIl[1]] = lIIllIllIIIII[lIIllIllIIIIl[9]];
                var18.interact(stringArray);
                return lIIllIllIIIIl[1];
            }
        }
        return lIIllIllIIIIl[0];
    }

    private static void lIllIIIIlllllll() {
        lIIllIllIIIIl = new int[14];
        q.lIIllIllIIIIl[0] = (0x14 ^ 0x62 ^ (0x1B ^ 0x73)) & (0x36 ^ 0x70 ^ (7 ^ 0x5F) ^ -1);
        q.lIIllIllIIIIl[1] = 1;
        q.lIIllIllIIIIl[2] = 2;
        q.lIIllIllIIIIl[3] = 3;
        q.lIIllIllIIIIl[4] = 2 ^ 0x1C;
        q.lIIllIllIIIIl[5] = 131 + 88 - 204 + 117 ^ 5 + 93 - -35 + 6;
        q.lIIllIllIIIIl[6] = 0x5E ^ 0x46 ^ (0x48 ^ 0x54);
        q.lIIllIllIIIIl[7] = 10 + 80 - 73 + 110 ^ (0xB8 ^ 0xC2);
        q.lIIllIllIIIIl[8] = 56 + 38 - 80 + 166 ^ 134 + 75 - 151 + 120;
        q.lIIllIllIIIIl[9] = 0x7E ^ 0x79;
        q.lIIllIllIIIIl[10] = 0xAB ^ 0xA3;
        q.lIIllIllIIIIl[11] = 0x75 ^ 0x40 ^ (0x6F ^ 0x53);
        q.lIIllIllIIIIl[12] = 0x37 ^ 0x3D;
        q.lIIllIllIIIIl[13] = 0x70 ^ 0x48 ^ (0xAA ^ 0x99);
    }

    private static String lIllIIIIlllllII(String var11, String var15) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIIllIllIIIIl[2], var13);
            return new String(var21.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIIlllllIl(String var17, String var2) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var16 = var2.toCharArray();
        int var3 = lIIllIllIIIIl[0];
        char[] var7 = var17.toCharArray();
        int var27 = var7.length;
        int var24 = lIIllIllIIIIl[0];
        while (q.lIllIIIlIIIIllI(var24, var27)) {
            char var23 = var7[var24];
            var20.append((char)(var23 ^ var16[var3 % var16.length]));
            0;
            ++var3;
            ++var24;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIllIIIlIIIIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public q(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.Y = squireThieving;
        this.Z = squireThievingConfig;
    }

    private static boolean lIllIIIlIIIIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIIIIllllllI() {
        lIIllIllIIIII = new String[lIIllIllIIIIl[13]];
        q.lIIllIllIIIII[q.lIIllIllIIIIl[0]] = q."We're not currently inside the right house, trying to move out.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[1]] = q."Searching for nearest npc outside house to lure.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[2]] = q."Lure";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[3]] = q."Mismatched amount of NPCs in our current house, returning false.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[6]] = q."(Far away): Walking towards current target house. {}";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[7]] = q."Interacting with the inside object.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[8]] = q."Search";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[9]] = q."Climb-up";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[10]] = q."Search";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[11]] = q."Climb-up";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[12]] = q."Lure";
    }

    private static boolean lIllIIIlIIIIIIl(Object object) {
        return object == null;
    }

    private static String lIllIIIIllllIll(String var19, String var25) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lIIllIllIIIIl[10]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIllIllIIIIl[2], var5);
            return new String(var22.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }
}

