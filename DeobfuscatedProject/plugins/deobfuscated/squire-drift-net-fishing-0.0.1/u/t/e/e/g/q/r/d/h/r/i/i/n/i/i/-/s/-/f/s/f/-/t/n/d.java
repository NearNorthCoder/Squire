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

@TaskDesc(name="Chasing fish", priority=5, register=true)
public class d
extends Task {
    private final /* synthetic */ ArrayList<b> u;
    private final /* synthetic */ SquireDriftNet s;
    private final /* synthetic */ Client t;
    private static /* synthetic */ String[] lIlIIIIIlIII;
    private static /* synthetic */ int[] lIlIIIIIlIIl;

    private static String llIlIIllIIlIII(String lllllllllllllllIlllIlIIIlIIIIIIl, String lllllllllllllllIlllIlIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIl[4]), "DES");
            Cipher lllllllllllllllIlllIlIIIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIlIIIIIll.init(lIlIIIIIlIIl[3], lllllllllllllllIlllIlIIIlIIIIlII);
            return new String(lllllllllllllllIlllIlIIIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlIIIIIlI) {
            lllllllllllllllIlllIlIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public d(SquireDriftNet squireDriftNet, Client client) {
        this.u = new ArrayList();
        this.s = squireDriftNet;
        this.t = client;
    }

    private static String llIlIIllIIlIIl(String lllllllllllllllIlllIlIIIlIIIlllI, String lllllllllllllllIlllIlIIIlIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIlIIlIIII.init(lIlIIIIIlIIl[3], lllllllllllllllIlllIlIIIlIIlIIIl);
            return new String(lllllllllllllllIlllIlIIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlIIIllll) {
            lllllllllllllllIlllIlIIIlIIIllll.printStackTrace();
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
        d lllllllllllllllIlllIlIIIlIlIIlll;
        Item lllllllllllllllIlllIlIIIlIlIIllI;
        if (d.llIlIIllIIllII(this.t.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIl[0];
        }
        if (d.llIlIIllIIllIl(Movement.getRunEnergy(), lIlIIIIIlIIl[1])) {
            lllllllllllllllIlllIlIIIlIlIIllI = Inventory.getFirst(item -> item.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[7]]));
            if (d.llIlIIllIIlllI(lllllllllllllllIlllIlIIIlIlIIllI)) {
                lllllllllllllllIlllIlIIIlIlIIllI.interact(lIlIIIIIlIII[lIlIIIIIlIIl[0]]);
            }
            0;
            if (null != null) {
                return ((0x22 ^ 0x28) & ~(0xBC ^ 0xB6)) != 0;
            }
        } else if (d.llIlIIllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (d.llIlIIllIIllll(lllllllllllllllIlllIlIIIlIlIIlll.s.c() ? 1 : 0)) {
            lllllllllllllllIlllIlIIIlIlIIlll.u.clear();
            lllllllllllllllIlllIlIIIlIlIIlll.s.a(lIlIIIIIlIIl[0]);
        }
        String[] stringArray = new String[lIlIIIIIlIIl[2]];
        stringArray[d.lIlIIIIIlIIl[0]] = lIlIIIIIlIII[lIlIIIIIlIIl[2]];
        lllllllllllllllIlllIlIIIlIlIIllI = TileObjects.getNearest((String[])stringArray);
        lllllllllllllllIlllIlIIIlIlIIlll.u.removeIf(arg_0 -> d.a((TileObject)lllllllllllllllIlllIlIIIlIlIIllI, arg_0));
        0;
        NPC lllllllllllllllIlllIlIIIlIlIIlIl = NPCs.getNearest(nPC -> {
            d lllllllllllllllIlllIlIIIlIIlllll;
            if (d.llIlIIllIIllII(nPC.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[5]]) ? 1 : 0)) {
                return lIlIIIIIlIIl[0];
            }
            Iterator<b> lllllllllllllllIlllIlIIIlIIlllIl = lllllllllllllllIlllIlIIIlIIlllll.u.iterator();
            while (d.llIlIIllIIllll(lllllllllllllllIlllIlIIIlIIlllIl.hasNext() ? 1 : 0)) {
                void lllllllllllllllIlllIlIIIlIIllllI;
                b lllllllllllllllIlllIlIIIlIIlllII = lllllllllllllllIlllIlIIIlIIlllIl.next();
                if (d.llIlIIllIIllll(lllllllllllllllIlllIlIIIlIIllllI.equals(lllllllllllllllIlllIlIIIlIIlllII.j()) ? 1 : 0)) {
                    return lIlIIIIIlIIl[0];
                }
                0;
                if (-2 <= 0) continue;
                return ((0xD7 ^ 0xB3 ^ (0xD0 ^ 0x93)) & (116 + 132 - 198 + 136 ^ 15 + 148 - 30 + 24 ^ -1)) != 0;
            }
            return lIlIIIIIlIIl[2];
        });
        if (d.llIlIIllIIlllI(lllllllllllllllIlllIlIIIlIlIIlIl)) {
            lllllllllllllllIlllIlIIIlIlIIlIl.interact(lIlIIIIIlIII[lIlIIIIIlIIl[3]]);
            lllllllllllllllIlllIlIIIlIlIIlll.sleepWhile(lIlIIIIIlIIl[4], () -> {
                boolean bl;
                if (d.llIlIIllIIlllI(Players.getLocal().getInteracting())) {
                    bl = lIlIIIIIlIIl[2];
                    0;
                    if (1 > 3) {
                        return ((0x36 ^ 0x27) & ~(0x5E ^ 0x4F)) != 0;
                    }
                } else {
                    bl = lIlIIIIIlIIl[0];
                }
                return bl;
            });
            if (d.llIlIIllIIllll(lllllllllllllllIlllIlIIIlIlIIlll.s.e() ? 1 : 0)) {
                b lllllllllllllllIlllIlIIIlIlIIlII = new b(lllllllllllllllIlllIlIIIlIlIIlIl);
                lllllllllllllllIlllIlIIIlIlIIlII.k();
                lllllllllllllllIlllIlIIIlIlIIlll.u.add(lllllllllllllllIlllIlIIIlIlIIlII);
                0;
                lllllllllllllllIlllIlIIIlIlIIlll.s.b(lIlIIIIIlIIl[0]);
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

    private static String llIlIIllIIIlll(String lllllllllllllllIlllIlIIIIllIllII, String lllllllllllllllIlllIlIIIIllIlIll) {
        lllllllllllllllIlllIlIIIIllIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIllIlllI = lllllllllllllllIlllIlIIIIllIlIll.toCharArray();
        int lllllllllllllllIlllIlIIIIllIllIl = lIlIIIIIlIIl[0];
        char[] lllllllllllllllIlllIlIIIIllIIlll = lllllllllllllllIlllIlIIIIllIllII.toCharArray();
        int lllllllllllllllIlllIlIIIIllIIllI = lllllllllllllllIlllIlIIIIllIIlll.length;
        int lllllllllllllllIlllIlIIIIllIIlIl = lIlIIIIIlIIl[0];
        while (d.llIlIIllIIllIl(lllllllllllllllIlllIlIIIIllIIlIl, lllllllllllllllIlllIlIIIIllIIllI)) {
            char lllllllllllllllIlllIlIIIIlllIIlI = lllllllllllllllIlllIlIIIIllIIlll[lllllllllllllllIlllIlIIIIllIIlIl];
            lllllllllllllllIlllIlIIIIllIllll.append((char)(lllllllllllllllIlllIlIIIIlllIIlI ^ lllllllllllllllIlllIlIIIIllIlllI[lllllllllllllllIlllIlIIIIllIllIl % lllllllllllllllIlllIlIIIIllIlllI.length]));
            0;
            ++lllllllllllllllIlllIlIIIIllIllIl;
            ++lllllllllllllllIlllIlIIIIllIIlIl;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIllIllll);
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
        void lllllllllllllllIlllIlIIIlIIlIlll;
        WorldArea lllllllllllllllIlllIlIIIlIIlIllI;
        TileObject lllllllllllllllIlllIlIIIlIIllIII;
        if (d.llIlIIllIlIIIl(b2.j())) {
            return lIlIIIIIlIIl[2];
        }
        if (d.llIlIIllIIlllI(lllllllllllllllIlllIlIIIlIIllIII) && d.llIlIIllIIllll((lllllllllllllllIlllIlIIIlIIlIllI = new WorldArea(new WorldPoint(lllllllllllllllIlllIlIIIlIIllIII.getX() - lIlIIIIIlIIl[5], lllllllllllllllIlllIlIIIlIIllIII.getY() - lIlIIIIIlIIl[6], lllllllllllllllIlllIlIIIlIIllIII.getPlane()), new WorldPoint(lllllllllllllllIlllIlIIIlIIllIII.getX() + lIlIIIIIlIIl[7], lllllllllllllllIlllIlIIIlIIllIII.getY(), lllllllllllllllIlllIlIIIlIIllIII.getPlane()))).contains((Locatable)lllllllllllllllIlllIlIIIlIIlIlll.j()) ? 1 : 0)) {
            boolean bl2;
            if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(lllllllllllllllIlllIlIIIlIIlIlll.l().getElapsed().getSeconds(), 24L))) {
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
        if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(lllllllllllllllIlllIlIIIlIIlIlll.l().getElapsed().getSeconds(), 12L))) {
            bl = lIlIIIIIlIIl[2];
            0;
            if (-(0x45 ^ 0x40) >= 0) {
                return ((0x6F ^ 0x53) & ~(0xA6 ^ 0x9A)) != 0;
            }
        } else {
            bl = lIlIIIIIlIIl[0];
        }
        return bl;
    }
}

