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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.h;

@TaskDesc(name="Stealing from stall")
public class J
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

    private static String lIllIIIIlIllIlI(String llllllllllllllIllllIIIIIIlIIllll, String llllllllllllllIllllIIIIIIlIIlllI) {
        llllllllllllllIllllIIIIIIlIIllll = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIIlIlIIlI = new StringBuilder();
        char[] llllllllllllllIllllIIIIIIlIlIIIl = llllllllllllllIllllIIIIIIlIIlllI.toCharArray();
        int llllllllllllllIllllIIIIIIlIlIIII = lIIllIlIllIll[1];
        char[] llllllllllllllIllllIIIIIIlIIlIlI = llllllllllllllIllllIIIIIIlIIllll.toCharArray();
        int llllllllllllllIllllIIIIIIlIIlIIl = llllllllllllllIllllIIIIIIlIIlIlI.length;
        int llllllllllllllIllllIIIIIIlIIlIII = lIIllIlIllIll[1];
        while (J.lIllIIIIllIIIll(llllllllllllllIllllIIIIIIlIIlIII, llllllllllllllIllllIIIIIIlIIlIIl)) {
            char llllllllllllllIllllIIIIIIlIlIlIl = llllllllllllllIllllIIIIIIlIIlIlI[llllllllllllllIllllIIIIIIlIIlIII];
            llllllllllllllIllllIIIIIIlIlIIlI.append((char)(llllllllllllllIllllIIIIIIlIlIlIl ^ llllllllllllllIllllIIIIIIlIlIIIl[llllllllllllllIllllIIIIIIlIlIIII % llllllllllllllIllllIIIIIIlIlIIIl.length]));
            0;
            ++llllllllllllllIllllIIIIIIlIlIIII;
            ++llllllllllllllIllllIIIIIIlIIlIII;
            0;
            if (((0x7B ^ 0x42) & ~(0x70 ^ 0x49)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIIIlIlIIlI);
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
        J llllllllllllllIllllIIIIIlIIlIIlI;
        if (J.lIllIIIIlIlllIl((Object)this.aK.method(), (Object)b.STALLS)) {
            return lIIllIlIllIll[1];
        }
        Player llllllllllllllIllllIIIIIlIIlIIIl = Players.getLocal();
        if (J.lIllIIIIlIllllI(llllllllllllllIllllIIIIIlIIlIIIl)) {
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(Inventory.isFull() ? 1 : 0)) {
            return lIIllIlIllIll[1];
        }
        h llllllllllllllIllllIIIIIlIIlIIII = llllllllllllllIllllIIIIIlIIlIIlI.aK.stallTarget();
        WorldPoint llllllllllllllIllllIIIIIlIIIllll = llllllllllllllIllllIIIIIlIIlIIII.z();
        List llllllllllllllIllllIIIIIlIIIlllI = Players.getAll(player2 -> {
            int n2;
            if (J.lIllIIIIllIIIlI(player2) && J.lIllIIIIlIlllIl(player2, llllllllllllllIllllIIIIIlIIlIIIl)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIlIllIll[3]];
                worldAreaArray[J.lIIllIlIllIll[1]] = llllllllllllllIllllIIIIIlIIlIIII.p();
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
        if (J.lIllIIIIlIlllll(llllllllllllllIllllIIIIIlIIlIIII.equals((Object)h.FRUIT_HOSIDIUS) ? 1 : 0) && J.lIllIIIIllIIIII(llllllllllllllIllllIIIIIlIIIlllI.isEmpty() ? 1 : 0)) {
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
                        return ((0x44 ^ 0x75) & ~(0x79 ^ 0x48)) != 0;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
            Worlds.hopTo((World)llllllllllllllIllllIIIIIlIIIllIl2);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIlIlllll(llllllllllllllIllllIIIIIlIIlIIII.A() ? 1 : 0)) {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[0]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(llllllllllllllIllllIIIIIlIIlIIII.v()) ? 1 : 0) && J.lIllIIIIllIIIll(tileObject.distanceTo(llllllllllllllIllllIIIIIlIIIllll), lIIllIlIllIll[7])) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (((0x75 ^ 0x78) & ~(0xCF ^ 0xC2)) > 2) {
                        return ((0x2A ^ 1) & ~(0x90 ^ 0xBB)) != 0;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
            0;
            if (((48 + 164 - 107 + 81 ^ 110 + 137 - 110 + 25) & (0x89 ^ 0x9A ^ (0x50 ^ 0x5B) ^ -1)) != 0) {
                return ((13 + 174 - 100 + 151 ^ 188 + 93 - 266 + 181) & (116 + 75 - 137 + 110 ^ 94 + 98 - 52 + 2 ^ -1)) != 0;
            }
        } else {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[13]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(llllllllllllllIllllIIIIIlIIlIIII.v()) ? 1 : 0)) {
                    n2 = lIIllIlIllIll[3];
                    0;
                    if (((0x62 ^ 0x28) & ~(0xD5 ^ 0x9F)) > 2) {
                        return ((0x80 ^ 0x96) & ~(0x1D ^ 0xB)) != 0;
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
        if (J.lIllIIIIlIlllll(llllllllllllllIllllIIIIIlIIlIIlI.aK.dropFruit() ? 1 : 0) && J.lIllIIIIlIlllll(Inventory.contains((int[])llllllllllllllIllllIIIIIlIIlIIlI.aL) ? 1 : 0) && J.lIllIIIIlIlllll(llllllllllllllIllllIIIIIlIIlIIIl.isMoving() ? 1 : 0)) {
            Inventory.dropAll((int[])llllllllllllllIllllIIIIIlIIlIIlI.aL);
            0;
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlIllIll[15]) && J.lIllIIIIllIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        int[] nArray = new int[lIIllIlIllIll[3]];
        nArray[J.lIIllIlIllIll[1]] = lIIllIlIllIll[16];
        Item llllllllllllllIllllIIIIIlIIIllII = Inventory.getFirst((int[])nArray);
        if (J.lIllIIIIllIIIlI(llllllllllllllIllllIIIIIlIIIllII) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[17])) {
            llllllllllllllIllllIIIIIlIIIllII.interact(lIIllIlIllIlI[lIIllIlIllIll[3]]);
            return lIIllIlIllIll[3];
        }
        Item llllllllllllllIllllIIIIIlIIIlIll = Inventory.getFirst(item -> item.getName().startsWith(lIIllIlIllIlI[lIIllIlIllIll[11]]));
        if (J.lIllIIIIllIIIlI(llllllllllllllIllllIIIIIlIIIlIll) && J.lIllIIIIllIIIII(Movement.isStaminaBoosted() ? 1 : 0) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[18])) {
            llllllllllllllIllllIIIIIlIIIlIll.interact(lIIllIlIllIlI[lIIllIlIllIll[5]]);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIII(Reachable.isInteractable((Locatable)llllllllllllllIllllIIIIIlIIIllIl2) ? 1 : 0)) {
            Log.info((String)lIIllIlIllIlI[lIIllIlIllIll[7]]);
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(llllllllllllllIllllIIIIIlIIlIIII.A() ? 1 : 0) && J.lIllIIIIllIIIII(llllllllllllllIllllIIIIIlIIlIIIl.getWorldLocation().equals((Object)llllllllllllllIllllIIIIIlIIIllll) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIllllIIIIIlIIIllll);
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

    private static String lIllIIIIlIllIIl(String llllllllllllllIllllIIIIIIllIIIlI, String llllllllllllllIllllIIIIIIllIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIIllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIIllIIllI.init(lIIllIlIllIll[5], llllllllllllllIllllIIIIIIllIIlll);
            return new String(llllllllllllllIllllIIIIIIllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIIllIIlIl) {
            llllllllllllllIllllIIIIIIllIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIllIII(String llllllllllllllIllllIIIIIIlllIIIl, String llllllllllllllIllllIIIIIIllIlllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIllIlllI.getBytes(StandardCharsets.UTF_8)), lIIllIlIllIll[19]), "DES");
            Cipher llllllllllllllIllllIIIIIIlllIIll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIIlllIIll.init(lIIllIlIllIll[5], llllllllllllllIllllIIIIIIlllIlII);
            return new String(llllllllllllllIllllIIIIIIlllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIIlllIIlI) {
            llllllllllllllIllllIIIIIIlllIIlI.printStackTrace();
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

