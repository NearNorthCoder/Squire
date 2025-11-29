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
package gg.squire.driftnet.tasks;

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
import gg.squire.driftnet.tasks.BHelper;

@TaskDesc(name="Chasing fish", priority=5, register=true)
public class ChasingFishTask
extends Task {
    private final  ArrayList<b> u;
    private final  SquireDriftNet s;
    private final  Client t;

    @Inject
    public ChasingFishTask(SquireDriftNet squireDriftNet, Client client) {
        this.u = new ArrayList();
        this.s = squireDriftNet;
        this.t = client;
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
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[0]] = "Drink";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[2]] = "Annette";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[3]] = "Chase";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[5]] = "Fish shoal";
        d.lIlIIIIIlIII[d.lIlIIIIIlIIl[7]] = "Stamina";
    }

    private static boolean llIlIIllIIlllI(Object object) {
        return object != null;
    }

    public boolean run() {
        d var1;
        Item var2;
        if (d.llIlIIllIIllII(this.t.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIl[0];
        }
        if (d.llIlIIllIIllIl(Movement.getRunEnergy(), lIlIIIIIlIIl[1])) {
            var2 = Inventory.getFirst(item -> item.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[7]]));
            if (d.llIlIIllIIlllI(var2)) {
                var2.interact(lIlIIIIIlIII[lIlIIIIIlIIl[0]]);
            }

            }
        } else if (d.llIlIIllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (d.llIlIIllIIllll(var1.s.c() ? 1 : 0)) {
            var1.u.clear();
            var1.s.a(lIlIIIIIlIIl[0]);
        }
        String[] stringArray = new String[lIlIIIIIlIIl[2]];
        stringArray[d.lIlIIIIIlIIl[0]] = lIlIIIIIlIII[lIlIIIIIlIIl[2]];
        var2 = TileObjects.getNearest((String[])stringArray);
        var1.u.removeIf(arg_0 -> d.a((TileObject)var2, arg_0));

        NPC var3 = NPCs.getNearest(nPC -> {
            d var4;
            if (d.llIlIIllIIllII(nPC.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[5]]) ? 1 : 0)) {
                return lIlIIIIIlIIl[0];
            }
            Iterator<b> var5 = var4.u.iterator();
            while (d.llIlIIllIIllll(var5.hasNext() ? 1 : 0)) {
                void var6;
                b var7 = var5.next();
                if (d.llIlIIllIIllll(var6.equals(var7.j()) ? 1 : 0)) {
                    return lIlIIIIIlIIl[0];
                }

                if (-2 <= 0) continue;
                return ((0xD7 ^ 0xB3 ^ (0xD0 ^ 0x93)) & (116 + 132 - 198 + 136 ^ 15 + 148 - 30 + 24 ^ -1)) != 0;
            }
            return lIlIIIIIlIIl[2];
        });
        if (d.llIlIIllIIlllI(var3)) {
            var3.interact(lIlIIIIIlIII[lIlIIIIIlIIl[3]]);
            var1.sleepWhile(lIlIIIIIlIIl[4], () -> {
                boolean bl;
                if (d.llIlIIllIIlllI(Players.getLocal().getInteracting())) {
                    bl = lIlIIIIIlIIl[2];

                    if (1 > 3) {
                        return false;
                    }
                } else {
                    bl = lIlIIIIIlIIl[0];
                }
                return bl;
            });
            if (d.llIlIIllIIllll(var1.s.e() ? 1 : 0)) {
                b var8 = new BHelper(var3);
                var8.k();
                var1.u.add(var8);

                var1.s.b(lIlIIIIIlIIl[0]);
            }
        }
        return lIlIIIIIlIIl[2];
    }

        return String.valueOf(var9);
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
    private static  boolean a(TileObject tileObject, b b2) {
        boolean bl;
        void var10;
        WorldArea var11;
        TileObject var12;
        if (d.llIlIIllIlIIIl(b2.j())) {
            return lIlIIIIIlIIl[2];
        }
        if (d.llIlIIllIIlllI(var12) && d.llIlIIllIIllll((var11 = new WorldArea(new WorldPoint(var12.getX() - lIlIIIIIlIIl[5], var12.getY() - lIlIIIIIlIIl[6], var12.getPlane()), new WorldPoint(var12.getX() + lIlIIIIIlIIl[7], var12.getY(), var12.getPlane()))).contains((Locatable)var10.j()) ? 1 : 0)) {
            boolean bl2;
            if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(var10.l().getElapsed().getSeconds(), 24L))) {
                bl2 = lIlIIIIIlIIl[2];

                if (-(98 + 26 - 75 + 78 ^ (0x38 ^ 0x43)) >= 0) {
                    return ((0x28 ^ 0x12 ^ (0x8E ^ 0x9E)) & (0xF9 ^ 0x8A ^ (0xC6 ^ 0x9F) ^ -1)) != 0;
                }
            } else {
                bl2 = lIlIIIIIlIIl[0];
            }
            return bl2;
        }
        if (d.llIlIIllIlIIlI(d.llIlIIllIlIIII(var10.l().getElapsed().getSeconds(), 12L))) {
            bl = lIlIIIIIlIIl[2];

            if (-(0x45 ^ 0x40) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIl[0];
        }
        return bl;
    }
}

