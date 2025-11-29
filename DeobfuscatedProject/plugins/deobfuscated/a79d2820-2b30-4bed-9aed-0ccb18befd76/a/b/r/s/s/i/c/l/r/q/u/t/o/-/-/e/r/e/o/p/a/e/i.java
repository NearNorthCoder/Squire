/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Killing core", priority=500, blocking=true, register=true)
public class i
extends a {
    private static /* synthetic */ String[] lIllIIIIIIII;
    private static final /* synthetic */ int u;
    private static /* synthetic */ int[] lIllIIIIIIIl;

    private static void lllIIIllIIlllI() {
        lIllIIIIIIII = new String[lIllIIIIIIIl[9]];
        i.lIllIIIIIIII[i.lIllIIIIIIIl[0]] = i."Dark energy core";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[1]] = i."Wield";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[5]] = i."Attack";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[6]] = i."Dark energy core";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[7]] = i."Wield";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[8]] = i."Attack";
    }

    private static void lllIIIllIIllll() {
        lIllIIIIIIIl = new int[11];
        i.lIllIIIIIIIl[0] = (0x42 ^ 6) & ~(0x56 ^ 0x12);
        i.lIllIIIIIIIl[1] = 1;
        i.lIllIIIIIIIl[2] = -(0xFFFFF94F & 0x1EF1) & (0xFFFFBDFF & 0x5B7F);
        i.lIllIIIIIIIl[3] = 0xFFFFFEFF & 0x2F1C;
        i.lIllIIIIIIIl[4] = 106 + 68 - 168 + 125 ^ 99 + 128 - 109 + 56;
        i.lIllIIIIIIIl[5] = 2;
        i.lIllIIIIIIIl[6] = 3;
        i.lIllIIIIIIIl[7] = 0xD0 ^ 0x85 ^ (0x7C ^ 0x2D);
        i.lIllIIIIIIIl[8] = 102 + 48 - 27 + 8 ^ 124 + 2 - 18 + 26;
        i.lIllIIIIIIIl[9] = 0x84 ^ 0x82;
        i.lIllIIIIIIIl[10] = 129 + 151 - 229 + 130 ^ 180 + 48 - 226 + 187;
    }

    private static boolean lllIIIllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if (i.lllIIIllIlIIlI(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl = lIllIIIIIIIl[1];
            0;
            if (2 < -1) {
                return ((23 + 148 - 162 + 219 ^ 50 + 92 - 100 + 134) & (209 + 54 - 87 + 70 ^ 93 + 98 - 163 + 134 ^ -1)) != 0;
            }
        } else {
            bl = lIllIIIIIIIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        NPC nPC = this.f();
        if (i.lllIIIllIlIIII(nPC)) {
            return lIllIIIIIIIl[0];
        }
        String[] stringArray = new String[lIllIIIIIIIl[1]];
        stringArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIII[lIllIIIIIIIl[0]];
        NPC lllllllllllllllIllIIIlIlllIIllIl = NPCs.getNearest((String[])stringArray);
        if (!i.lllIIIllIlIIIl(lllllllllllllllIllIIIlIlllIIllIl) || i.lllIIIllIlIIlI(Reachable.isInteractable((Locatable)lllllllllllllllIllIIIlIlllIIllIl) ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIIIIl[1]];
            nArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[2];
            if (i.lllIIIllIlIIIl(Projectiles.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIIIIIl[1]];
                nArray2[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
                Item lllllllllllllllIllIIIlIlllIIllII = Inventory.getFirst((int[])nArray2);
                if (i.lllIIIllIlIIIl(lllllllllllllllIllIIIlIlllIIllII)) {
                    lllllllllllllllIllIIIlIlllIIllII.interact(lIllIIIIIIII[lIllIIIIIIIl[1]]);
                }
                return lIllIIIIIIIl[1];
            }
            return lIllIIIIIIIl[0];
        }
        if (i.lllIIIllIlIIll(Combat.getCurrentHealth(), lIllIIIIIIIl[4])) {
            TeleportLoader.enterHouse();
            0;
            return lIllIIIIIIIl[0];
        }
        if (i.lllIIIllIlIIlI(lllllllllllllllIllIIIlIlllIIllIl.getWorldLocation().distanceTo((Locatable)Players.getLocal()))) {
            lllllllllllllllIllIIIlIlllIIllIl.interact(lIllIIIIIIII[lIllIIIIIIIl[5]]);
            0;
            if (-1 >= 2) {
                return ((0x4A ^ 0x56) & ~(0xD8 ^ 0xC4)) != 0;
            }
        } else if (i.lllIIIllIlIlII(lllllllllllllllIllIIIlIlllIIllIl.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIllIIIIIIIl[1])) {
            void lllllllllllllllIllIIIlIlllIIlllI;
            WorldPoint lllllllllllllllIllIIIlIlllIIllII = Players.getLocal().getWorldLocation().createWorldArea(lIllIIIIIIIl[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (i.lllIIIllIlIllI(worldPoint.distanceTo(lllllllllllllllIllIIIlIlllIIllIl.getWorldLocation()), lIllIIIIIIIl[5])) {
                    bl = lIllIIIIIIIl[1];
                    0;
                    if (null != null) {
                        return ((0x68 ^ 0xA) & ~(0x36 ^ 0x54)) != 0;
                    }
                } else {
                    bl = lIllIIIIIIIl[0];
                }
                return bl;
            }).filter(arg_0 -> i.a((NPC)lllllllllllllllIllIIIlIlllIIlllI, arg_0)).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (i.lllIIIllIlIIII(lllllllllllllllIllIIIlIlllIIllII)) {
                return lIllIIIIIIIl[0];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIIlIlllIIllII);
        }
        return lIllIIIIIIIl[1];
    }

    private static boolean lllIIIllIlIIII(Object object) {
        return object == null;
    }

    private static String lllIIIllIIllII(String lllllllllllllllIllIIIlIllIlIIlll, String lllllllllllllllIllIIIlIllIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIl[10]), "DES");
            Cipher lllllllllllllllIllIIIlIllIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIlIllIlIlIll.init(lIllIIIIIIIl[5], lllllllllllllllIllIIIlIllIlIllII);
            return new String(lllllllllllllllIllIIIlIllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIlIllIlIlIlI) {
            lllllllllllllllIllIIIlIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void lllllllllllllllIllIIIlIlllIIIlll;
        NPC nPC = npcSpawned.getNpc();
        if (i.lllIIIllIlIlIl(nPC.getName().equals(lIllIIIIIIII[lIllIIIIIIIl[6]]) ? 1 : 0)) {
            return;
        }
        if (i.lllIIIllIlIIlI(lllllllllllllllIllIIIlIlllIIIlll.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIllIIIIIIIl[1]];
        nArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
        Item lllllllllllllllIllIIIlIlllIIIllI = Inventory.getFirst((int[])nArray);
        if (i.lllIIIllIlIIIl(lllllllllllllllIllIIIlIlllIIIllI)) {
            lllllllllllllllIllIIIlIlllIIIllI.interact(lIllIIIIIIII[lIllIIIIIIIl[7]]);
        }
        nPC.interact(lIllIIIIIIII[lIllIIIIIIIl[8]]);
    }

    private static boolean lllIIIllIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIIllIIllIl(String lllllllllllllllIllIIIlIllIllIlII, String lllllllllllllllIllIIIlIllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlIllIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlIllIlllIII.init(lIllIIIIIIIl[5], lllllllllllllllIllIIIlIllIlllIIl);
            return new String(lllllllllllllllIllIIIlIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIlIllIllIlll) {
            lllllllllllllllIllIIIlIllIllIlll.printStackTrace();
            return null;
        }
    }

    static {
        i.lllIIIllIIllll();
        i.lllIIIllIIlllI();
        u = lIllIIIIIIIl[2];
    }

    private static boolean lllIIIllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lllIIIllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lllIIIllIIlIll(String lllllllllllllllIllIIIlIllIIlIlII, String lllllllllllllllIllIIIlIllIIlIIll) {
        lllllllllllllllIllIIIlIllIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlIllIIlIlll = new StringBuilder();
        char[] lllllllllllllllIllIIIlIllIIlIllI = lllllllllllllllIllIIIlIllIIlIIll.toCharArray();
        int lllllllllllllllIllIIIlIllIIlIlIl = lIllIIIIIIIl[0];
        char[] lllllllllllllllIllIIIlIllIIIllll = lllllllllllllllIllIIIlIllIIlIlII.toCharArray();
        int lllllllllllllllIllIIIlIllIIIlllI = lllllllllllllllIllIIIlIllIIIllll.length;
        int lllllllllllllllIllIIIlIllIIIllIl = lIllIIIIIIIl[0];
        while (i.lllIIIllIlIIll(lllllllllllllllIllIIIlIllIIIllIl, lllllllllllllllIllIIIlIllIIIlllI)) {
            char lllllllllllllllIllIIIlIllIIllIlI = lllllllllllllllIllIIIlIllIIIllll[lllllllllllllllIllIIIlIllIIIllIl];
            lllllllllllllllIllIIIlIllIIlIlll.append((char)(lllllllllllllllIllIIIlIllIIllIlI ^ lllllllllllllllIllIIIlIllIIlIllI[lllllllllllllllIllIIIlIllIIlIlIl % lllllllllllllllIllIIIlIllIIlIllI.length]));
            0;
            ++lllllllllllllllIllIIIlIllIIlIlIl;
            ++lllllllllllllllIllIIIlIllIIIllIl;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIlIllIIlIlll);
    }
}

