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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.k;

@TaskDesc(name="Returning to the blackjack house", priority=2, blocking=true)
public class q
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
        NPC llllllllllllllIlllIlllllIllllIII;
        List llllllllllllllIlllIlllllIllllIIl;
        q llllllllllllllIlllIlllllIlllllll;
        if (q.lIllIIIlIIIIIII((Object)this.Z.method(), (Object)b.BLACK_JACK)) {
            return lIIllIllIIIIl[0];
        }
        Player llllllllllllllIlllIlllllIllllllI = Players.getLocal();
        if (q.lIllIIIlIIIIIIl(llllllllllllllIlllIlllllIllllllI)) {
            return lIIllIllIIIIl[0];
        }
        if (q.lIllIIIlIIIIIlI(llllllllllllllIlllIlllllIlllllll.Y.i() ? 1 : 0)) {
            return lIIllIllIIIIl[0];
        }
        int llllllllllllllIlllIlllllIlllllIl = Inventory.getCount(item -> item.hasAction(k.z));
        if (q.lIllIIIlIIIIIll(llllllllllllllIlllIlllllIlllllIl)) {
            return lIIllIllIIIIl[0];
        }
        WorldPoint llllllllllllllIlllIlllllIlllllII = llllllllllllllIlllIlllllIllllllI.getWorldLocation();
        c llllllllllllllIlllIlllllIllllIll = llllllllllllllIlllIlllllIlllllll.Y.b().t();
        c llllllllllllllIlllIlllllIllllIlI = c.b(llllllllllllllIlllIlllllIlllllII);
        if (q.lIllIIIlIIIIlII((Object)llllllllllllllIlllIlllllIllllIlI) && q.lIllIIIlIIIIIII((Object)llllllllllllllIlllIlllllIllllIll, (Object)llllllllllllllIlllIlllllIllllIlI)) {
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[0]]);
            llllllllllllllIlllIlllllIllllIIl = llllllllllllllIlllIlllllIlllllll.Y.a(llllllllllllllIlllIlllllIllllIlI, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(llllllllllllllIlllIlllllIllllIIl)) {
                return llllllllllllllIlllIlllllIlllllll.Y.a(llllllllllllllIlllIlllllIllllllI, lIIllIllIIIIl[1]);
            }
            llllllllllllllIlllIlllllIllllIII = NPCs.getNearest(nPC -> {
                int n2;
                if (q.lIllIIIlIIIIlII(nPC)) {
                    WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                    worldAreaArray[q.lIIllIllIIIIl[0]] = llllllllllllllIlllIlllllIllllIlI.p();
                    if (q.lIllIIIlIIIIIll(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIllIIIIl[1]];
                        stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[12]];
                        if (q.lIllIIIlIIIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIllIllIIIIl[1];
                            0;
                            if (((0x29 ^ 0x3B) & ~(0x89 ^ 0x9B)) <= ((0x7A ^ 0x41) & ~(0x40 ^ 0x7B))) return n2 != 0;
                            return ((0x90 ^ 0x9D) & ~(0x23 ^ 0x2E)) != 0;
                        }
                    }
                }
                n2 = lIIllIllIIIIl[0];
                return n2 != 0;
            });
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[1]]);
            if (q.lIllIIIlIIIIlII(llllllllllllllIlllIlllllIllllIII)) {
                llllllllllllllIlllIlllllIllllIII.interact(lIIllIllIIIII[lIIllIllIIIIl[2]]);
                return lIIllIllIIIIl[0];
            }
        }
        if (q.lIllIIIlIIIIlIl((llllllllllllllIlllIlllllIllllIIl = NPCs.getAll(nPC -> {
            int n2;
            if (q.lIllIIIlIIIIlII(nPC) && q.lIllIIIlIIIIIlI(nPC.getName().equals(this.Y.b().v()) ? 1 : 0)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                worldAreaArray[q.lIIllIllIIIIl[0]] = llllllllllllllIlllIlllllIllllIll.p();
                if (q.lIllIIIlIIIIIlI(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = lIIllIllIIIIl[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0xF2 ^ 0xA2) & ~(0xD9 ^ 0x89)) != 0;
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
        worldAreaArray[q.lIIllIllIIIIl[0]] = llllllllllllllIlllIlllllIllllIll.p();
        if (q.lIllIIIlIIIIIll(llllllllllllllIlllIlllllIlllllII.isInArea(worldAreaArray) ? 1 : 0)) {
            int llllllllllllllIlllIlllllIlllIlll;
            int n2;
            llllllllllllllIlllIlllllIllllIII = llllllllllllllIlllIlllllIlllllll.Y.a(llllllllllllllIlllIlllllIllllIll, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(llllllllllllllIlllIlllllIllllIII)) {
                return llllllllllllllIlllIlllllIlllllll.Y.a(llllllllllllllIlllIlllllIllllllI, lIIllIllIIIIl[1]);
            }
            if (q.lIllIIIlIIIIlIl(llllllllllllllIlllIlllllIlllllII.distanceTo(llllllllllllllIlllIlllllIllllIll.p().getRandom()), lIIllIllIIIIl[5])) {
                n2 = lIIllIllIIIIl[1];
                0;
                if (3 != 3) {
                    return ((0xE7 ^ 0xBA) & ~(0x29 ^ 0x74)) != 0;
                }
            } else {
                n2 = lIIllIllIIIIl[0];
            }
            if (q.lIllIIIlIIIIIlI(llllllllllllllIlllIlllllIlllIlll = n2)) {
                Object[] objectArray = new Object[lIIllIllIIIIl[1]];
                objectArray[q.lIIllIllIIIIl[0]] = llllllllllllllIlllIlllllIllllIll;
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[6]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)llllllllllllllIlllIlllllIllllIll.p().getRandom());
                0;
                return lIIllIllIIIIl[1];
            }
            TileObject llllllllllllllIlllIlllllIlllIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                block2: {
                    block3: {
                        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                        worldAreaArray[q.lIIllIllIIIIl[0]] = llllllllllllllIlllIlllllIllllIll.p();
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
            if (q.lIllIIIlIIIIlII(llllllllllllllIlllIlllllIlllIllI)) {
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[7]]);
                String[] stringArray = new String[lIIllIllIIIIl[2]];
                stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[8]];
                stringArray[q.lIIllIllIIIIl[1]] = lIIllIllIIIII[lIIllIllIIIIl[9]];
                llllllllllllllIlllIlllllIlllIllI.interact(stringArray);
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

    private static String lIllIIIIlllllII(String llllllllllllllIlllIlllllIlIllllI, String llllllllllllllIlllIlllllIlIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllllIllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllllIllIIIlI.init(lIIllIllIIIIl[2], llllllllllllllIlllIlllllIllIIIll);
            return new String(llllllllllllllIlllIlllllIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllllIllIIIIl) {
            llllllllllllllIlllIlllllIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIIlllllIl(String llllllllllllllIlllIlllllIlIIlIll, String llllllllllllllIlllIlllllIlIIllll) {
        llllllllllllllIlllIlllllIlIIlIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllllIlIIlllI = new StringBuilder();
        char[] llllllllllllllIlllIlllllIlIIllIl = llllllllllllllIlllIlllllIlIIllll.toCharArray();
        int llllllllllllllIlllIlllllIlIIllII = lIIllIllIIIIl[0];
        char[] llllllllllllllIlllIlllllIlIIIllI = llllllllllllllIlllIlllllIlIIlIll.toCharArray();
        int llllllllllllllIlllIlllllIlIIIlIl = llllllllllllllIlllIlllllIlIIIllI.length;
        int llllllllllllllIlllIlllllIlIIIlII = lIIllIllIIIIl[0];
        while (q.lIllIIIlIIIIllI(llllllllllllllIlllIlllllIlIIIlII, llllllllllllllIlllIlllllIlIIIlIl)) {
            char llllllllllllllIlllIlllllIlIlIIIl = llllllllllllllIlllIlllllIlIIIllI[llllllllllllllIlllIlllllIlIIIlII];
            llllllllllllllIlllIlllllIlIIlllI.append((char)(llllllllllllllIlllIlllllIlIlIIIl ^ llllllllllllllIlllIlllllIlIIllIl[llllllllllllllIlllIlllllIlIIllII % llllllllllllllIlllIlllllIlIIllIl.length]));
            0;
            ++llllllllllllllIlllIlllllIlIIllII;
            ++llllllllllllllIlllIlllllIlIIIlII;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllllIlIIlllI);
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

    private static String lIllIIIIllllIll(String llllllllllllllIlllIlllllIIlllIIl, String llllllllllllllIlllIlllllIIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllllIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllllIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIllIllIIIIl[10]), "DES");
            Cipher llllllllllllllIlllIlllllIIllllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllllIIllllIl.init(lIIllIllIIIIl[2], llllllllllllllIlllIlllllIIlllllI);
            return new String(llllllllllllllIlllIlllllIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllllIIllllII) {
            llllllllllllllIlllIlllllIIllllII.printStackTrace();
            return null;
        }
    }
}

