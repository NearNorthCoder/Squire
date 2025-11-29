/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.HEnum;

/* TASK: Stealing from stall -> StealingfromstallTask */
@TaskDesc(name="Stealing from stall")
public class StealingFromStallTask
extends Task {
    private final /* synthetic */ int[] aL;
    private static /* synthetic */ String[] lIIllIlIllIlI;
    private static /* synthetic */ int[] lIIllIlIllIll;
    private final /* synthetic */ SquireThievingConfig aK;

    private static boolean lIllIIIIllIIIlI(Object object) {
        return object != null;
    }

    private static void lIllIIIIlIlllII() {
        lIIllIlIllIll = new int[20];
        J.lIIllIlIllIll[0] = 0x69 ^ 0x17 ^ (0x6C ^ 0x15);
        J.lIIllIlIllIll[1] = (0x78 ^ 0x2D) & ~(0x47 ^ 0x12);
        J.lIIllIlIllIll[2] = 0xFFFF9F84 & 0x75FB;
        J.lIIllIlIllIll[3] = 1;
        J.lIIllIlIllIll[4] = 0xFFFFFF9F & 0x7FF;
        J.lIIllIlIllIll[5] = 2;
        J.lIIllIlIllIll[6] = 0xFFFFE7EF & 0x1FBB;
        J.lIIllIlIllIll[7] = 3;
        J.lIIllIlIllIll[8] = 0xFFFF9FE3 & 0x67BF;
        J.lIIllIlIllIll[9] = 0x2B ^ 0x51 ^ (0x22 ^ 0x5C);
        J.lIIllIlIllIll[10] = 0xFFFFAD6D & 0x5ADA;
        J.lIIllIlIllIll[11] = 0xBC ^ 0x9F ^ (0x1E ^ 0x38);
        J.lIIllIlIllIll[12] = 79 + 48 - 30 + 52 + (0xEE ^ 0xC5) - -(0x3C ^ 0x1F) + (0xA7 ^ 0xB3);
        J.lIIllIlIllIll[13] = 0x23 ^ 0x25;
        J.lIIllIlIllIll[14] = -(0xFFFFF5FE & 0x5E8B) & (0xFFFFDCFF & 0x7FBF);
        J.lIIllIlIllIll[15] = 112 + 92 - 84 + 9 ^ 111 + 101 - 155 + 85;
        J.lIIllIlIllIll[16] = -(0xFFFFF337 & 0x6ECB) & (0xFFFFFFD3 & 0x63FE);
        J.lIIllIlIllIll[17] = 0x93 ^ 0xBB;
        J.lIIllIlIllIll[18] = 0xE0 ^ 0x89 ^ (0x37 ^ 0x40);
        J.lIIllIlIllIll[19] = 0x76 ^ 0x7E;
    }

    private static String lIllIIIIlIllIlI(String var17, String var4) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var21 = var4.toCharArray();
        int var13 = lIIllIlIllIll[1];
        char[] var5 = var17.toCharArray();
        int var12 = var5.length;
        int var15 = lIIllIlIllIll[1];
        while (J.lIllIIIIllIIIll(var15, var12)) {
            char var19 = var5[var15];
            var11.append((char)(var19 ^ var21[var13 % var21.length]));
            0;
            ++var13;
            ++var15;
            0;
            if (((0x7B ^ 0x42) & ~(0x70 ^ 0x49)) == 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIllIIIIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIllIIIII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIlIllIll() {
        lIIllIlIllIlI = new String[lIIllIlIllIll[19]];
        J.lIIllIlIllIlI[J.lIIllIlIllIll[1]] = J."Someone is crashing us, hopping worlds.";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[3]] = J."Eat";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[5]] = J."Drink";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[7]] = J."Can't reach stall";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[9]] = J."Steal-from";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[11]] = J."Stamina";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[13]] = J."Steal-from";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[0]] = J."Steal-from";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_6;
        TileObject llllllllllllllIllllIIIIIlIIIllIl2;
        TileObject tileObject2;
        J var24;
        if (J.lIllIIIIlIlllIl((Object)this.aK.method(), (Object)b.STALLS)) {
            return lIIllIlIllIll[1];
        }
        Player var20 = Players.getLocal();
        if (J.lIllIIIIlIllllI(var20)) {
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(Inventory.isFull() ? 1 : 0)) {
            return lIIllIlIllIll[1];
        }
        h var22 = var24.aK.stallTarget();
        WorldPoint var26 = var22.z();
        List var6 = Players.getAll(player2 -> {
            int n2;
            if (J.lIllIIIIllIIIlI(player2) && J.lIllIIIIlIlllIl(player2, var20)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIlIllIll[3]];
                worldAreaArray[J.lIIllIlIllIll[1]] = var22.p();
                if (J.lIllIIIIlIlllll(player2.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (-1 < (0xA0 ^ 0xC6 ^ (0x6B ^ 9))) return n2 != 0;
                    return ((0x77 ^ 0x1E ^ (0xD9 ^ 0xA1)) & (0xDD ^ 0x9D ^ (0xDD ^ 0x8C) ^ -1)) != 0;
                }
            }
            n2 = lIIllIlIllIll[1];
            return n2 != 0;
        });
        if (J.lIllIIIIlIlllll(var22.equals((Object)h.FRUIT_HOSIDIUS) ? 1 : 0) && J.lIllIIIIllIIIII(var6.isEmpty() ? 1 : 0)) {
            Log.info((String)lIIllIlIllIlI[lIIllIlIllIll[1]]);
            if (J.lIllIIIIllIIIII(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return lIIllIlIllIll[3];
            }
            World llllllllllllllIllllIIIIIlIIIllIl2 = Worlds.getRandom(world -> {
                int n2;
                if (J.lIllIIIIlIlllll(world.isNormal() ? 1 : 0) && J.lIllIIIIlIlllll(world.isMembers() ? 1 : 0) && J.lIllIIIIllIIlII(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (2 < 0) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
            Worlds.hopTo((World)llllllllllllllIllllIIIIIlIIIllIl2);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIlIlllll(var22.A() ? 1 : 0)) {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[0]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(var22.v()) ? 1 : 0) && J.lIllIIIIllIIIll(tileObject.distanceTo(var26), lIIllIlIllIll[7])) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (((0x75 ^ 0x78) & ~(0xCF ^ 0xC2)) > 2) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
            0;
            if (((48 + 164 - 107 + 81 ^ 110 + 137 - 110 + 25) & (0x89 ^ 0x9A ^ (0x50 ^ 0x5B) ^ -1)) != 0) {
                return false;
            }
        } else {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[13]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(var22.v()) ? 1 : 0)) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (((0x62 ^ 0x28) & ~(0xD5 ^ 0x9F)) > 2) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
        }
        if (J.lIllIIIIlIllllI(llllllllllllllIllllIIIIIlIIIllIl2 = tileObject2)) {
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(var24.aK.dropFruit() ? 1 : 0) && J.lIllIIIIlIlllll(Inventory.contains((int[])var24.aL) ? 1 : 0) && J.lIllIIIIlIlllll(var20.isMoving() ? 1 : 0)) {
            Inventory.dropAll((int[])var24.aL);
            0;
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlIllIll[15]) && J.lIllIIIIllIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        int[] nArray = new int[lIIllIlIllIll[3]];
        nArray[J.lIIllIlIllIll[1]] = lIIllIlIllIll[16];
        Item var9 = Inventory.getFirst((int[])nArray);
        if (J.lIllIIIIllIIIlI(var9) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[17])) {
            var9.interact(lIIllIlIllIlI[lIIllIlIllIll[3]]);
            return lIIllIlIllIll[3];
        }
        Item var14 = Inventory.getFirst(item -> item.getName().startsWith(lIIllIlIllIlI[lIIllIlIllIll[11]]));
        if (J.lIllIIIIllIIIlI(var14) && J.lIllIIIIllIIIII(Movement.isStaminaBoosted() ? 1 : 0) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[18])) {
            var14.interact(lIIllIlIllIlI[lIIllIlIllIll[5]]);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIII(Reachable.isInteractable((Locatable)llllllllllllllIllllIIIIIlIIIllIl2) ? 1 : 0)) {
            Log.info((String)lIIllIlIllIlI[lIIllIlIllIll[7]]);
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(var22.A() ? 1 : 0) && J.lIllIIIIllIIIII(var20.getWorldLocation().equals((Object)var26) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var26);
            0;
            return lIIllIlIllIll[3];
        }
        var5_6.interact(lIIllIlIllIlI[lIIllIlIllIll[9]]);
        return lIIllIlIllIll[3];
    }

    private static boolean lIllIIIIlIllllI(Object object) {
        return object == null;
    }

    @Inject
    public J(SquireThievingConfig squireThievingConfig) {
        int[] nArray = new int[lIIllIlIllIll[0]];
        nArray[J.lIIllIlIllIll[1]] = lIIllIlIllIll[2];
        nArray[J.lIIllIlIllIll[3]] = lIIllIlIllIll[4];
        nArray[J.lIIllIlIllIll[5]] = lIIllIlIllIll[6];
        nArray[J.lIIllIlIllIll[7]] = lIIllIlIllIll[8];
        nArray[J.lIIllIlIllIll[9]] = lIIllIlIllIll[10];
        nArray[J.lIIllIlIllIll[11]] = lIIllIlIllIll[12];
        nArray[J.lIIllIlIllIll[13]] = lIIllIlIllIll[14];
        this.aL = nArray;
        this.aK = squireThievingConfig;
    }

    private static String lIllIIIIlIllIIl(String var10, String var2) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIIllIlIllIll[5], var25);
            return new String(var16.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIllIII(String var18, String var1) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIllIlIllIll[19]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIllIlIllIll[5], var23);
            return new String(var7.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        J.lIllIIIIlIlllII();
        J.lIllIIIIlIllIll();
    }

    private static boolean lIllIIIIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIlIlllll(int n2) {
        return n2 != 0;
    }
}

