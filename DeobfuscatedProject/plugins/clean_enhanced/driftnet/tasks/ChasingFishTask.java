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
import java.util.ArrayList;
import java.util.Iterator;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public ChasingFishTask(SquireDriftNet squireDriftNet, Client client) {
        this.u = new ArrayList();
        this.s = squireDriftNet;
        this.t = client;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        d var15;
        Item var16;
        if ((this.t.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.getRunEnergy() < Movement.getRunEnergy()2)) {
            var16 = Inventory.getFirst(item -> item.getName().contains(var1[7]));
            if var16 != null {
                var16.interact(var1[0]);
            }
            0;
            if null != null {
                return ((0x22 ^ 0x28) & ~(0xBC ^ 0xB6)) != 0;
            }
        } else if ((Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
        }
        if ((var15.s.c( != 0) ? 1 : 0)) {
            var15.u.clear();
            var15.s.a(0);
        }
        String[] stringArray = new String[2];
        stringArray[0] = var1[2];
        var16 = TileObjects.getNearest((String[])stringArray);
        var15.u.removeIf(arg_0 -> d.a((TileObject)var16, arg_0));
        0;
        NPC var17 = NPCs.getNearest(nPC -> {
            d var18;
            if ((nPC.getName( == 0).contains(var1[5]) ? 1 : 0)) {
                return 0;
            }
            Iterator<b> var19 = var18.u.iterator();
            while ((var19.hasNext( != 0) ? 1 : 0)) {
                void var20;
                b var21 = var19.next();
                if ((var20.equals(var21.j( != 0)) ? 1 : 0)) {
                    return 0;
                }
                0;
                if (-2 <= 0) continue;
                return ((0xD7 ^ 0xB3 ^ (0xD0 ^ 0x93)) & (116 + 132 - 198 + 136 ^ 15 + 148 - 30 + 24 ^ -1)) != 0;
            }
            return 2;
        });
        if var17 != null {
            var17.interact(var1[3]);
            var15.sleepWhile(4, () -> {
                boolean bl;
                if ((Players.getLocal( != null).getInteracting())) {
                    bl = 2;
                    0;
                    if (1 > 3) {
                        return ((0x36 ^ 0x27) & ~(0x5E ^ 0x4F)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            });
            if ((var15.s.e( != 0) ? 1 : 0)) {
                b var22 = new BHelper(var17);
                var22.k();
                var15.u.add(var22);
                0;
                var15.s.b(0);
            }
        }
        return 2;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = 0;
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = 0;
        while (var31 < lllllllllllllllIlllIlIIIIllIIlIl2) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static int var33(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(TileObject tileObject, b b2) {
        boolean bl;
        void var34;
        WorldArea var35;
        TileObject var36;
        if ((b2.j( == null))) {
            return 2;
        }
        if (var36 != null && ((var35 = new WorldArea(new WorldPoint(var36.getX( != 0) - 5, var36.getY() - 6, var36.getPlane()), new WorldPoint(var36.getX() + 7, var36.getY(), var36.getPlane()))).contains((Locatable)var34.j()) ? 1 : 0)) {
            boolean bl2;
            if ((d.var33(var34.l( >= 0).getElapsed().getSeconds(), 24L))) {
                bl2 = 2;
                0;
                if (-(98 + 26 - 75 + 78 ^ (0x38 ^ 0x43)) >= 0) {
                    return ((0x28 ^ 0x12 ^ (0x8E ^ 0x9E)) & (0xF9 ^ 0x8A ^ (0xC6 ^ 0x9F) ^ -1)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        }
        if ((d.var33(var34.l( >= 0).getElapsed().getSeconds(), 12L))) {
            bl = 2;
            0;
            if (-(0x45 ^ 0x40) >= 0) {
                return ((0x6F ^ 0x53) & ~(0xA6 ^ 0x9A)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }
}

