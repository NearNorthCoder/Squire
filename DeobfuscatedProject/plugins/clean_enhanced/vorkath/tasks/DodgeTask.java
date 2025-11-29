/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodge", priority=25)
public class DodgeTask
extends VorkathManager {
    
     int cc;
    
    @Inject
     d l;

    /*
     * WARNING - void declaration
     */
    private boolean i(WorldPoint worldPoint) {
        int n2;
        v var3;
        void var4;
        if ((Math.abs(this.cf.getTickCount() - this.cg.G()) < 5)) {
            return 0;
        }
        WorldPoint var5 = Players.getLocal().getWorldLocation();
        int var6 = Math.abs(var5.getY() - var4.getWorldY());
        WorldPoint var7 = var5.dy(1);
        int var8 = 6;
        if ((Equipment.contains(item -> item.getName( != 0).toLowerCase().contains(var1[0])) ? 1 : 0)) {
            var8 = 7;
        }
        if ((var3.cg.C( != 0) ? 1 : 0)) {
            var8 = 2;
        }
        if ((var6 >= var8) && (TileObjects.getAll(tileObject -> {
            int n2;
            if ((tileObject.getId( != 0) == 4) && (tileObject.getWorldLocation( != 0).equals((Object)var7) ? 1 : 0)) {
                n2 = 1;
                0;
                if (1 >= 2) {
                    return ((0x1D ^ 5) & ~(0x88 ^ 0x90)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            n2 = 1;
            0;
            
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    @Inject
    protected DodgeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
        this.cc = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(NPC nPC) {
        int n2;
        block3: {
            block2: {
                if (!(nPC.getAnimation() != 3)) break block2;
                int[] nArray = new int[1];
                nArray[0] = 4;
                if (!(TileObjects.getNearest((int[] != nunArray))) break block3;
            }
            n2 = 1;
            0;
            if null == null return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = 0;
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var5_5;
        WorldPoint var9;
        WorldPoint worldPoint;
        WorldPoint var10;
        void var11;
        v var12;
        NPC nPC = this.cg.c(1);
        if nPC == null {
            return 0;
        }
        int n2 = var12.b((NPC)var11);
        if ((Movement.isRunEnabled( != 0) ? 1 : 0) && n2) {
            Movement.toggleRun();
            0;
            if (1 < -1) {
                return ((0xC8 ^ 0xA4 ^ (0xB2 ^ 0x94)) & (1 ^ 0xF ^ (0x47 ^ 3) ^ -1)) != 0;
            }
        } else if ((Movement.isRunEnabled( == 0) ? 1 : 0) && (n2 == 0)) {
            Movement.toggleRun();
        }
        WorldPoint var13 = var12.l.n();
        if (n2 && (var12.cg.C( == 0) ? 1 : 0)) {
            var13 = var12.l.o();
        }
        if ((var13.equals(Object(var10 = Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return 0;
        }
        if ((n2 == 0) && (var12.cc % 2 != 0)) {
            var12.cc += 1;
            return 0;
        }
        if (n2 && (var12.i(var11.getWorldLocation( != 0)) ? 1 : 0)) {
            return 0;
        }
        if n2 {
            worldPoint = var12.l.p();
            0;
            if (1 >= (0x10 ^ 0x14)) {
                return ((0x72 ^ 0x49) & ~(0xBE ^ 0x85)) != 0;
            }
        } else {
            worldPoint = var9 = var12.l.n();
        }
        if ((var12.cg.z( != 0) ? 1 : 0)) {
            Movement.toggleRun();
            var9 = var12.l.t();
        }
        Movement.setDestination((WorldPoint)var5_5);
        this.cc += 1;
        return 1;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

}

