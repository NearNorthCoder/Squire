/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ActorDeath
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving to right spot with charging", priority=100, register=true)
public class MovingToRightSpotWithChargingTask
extends AutotoaManager {
    
    private static final  Point fE;
    
    private static final  Point fD;
    private  boolean fG;
    private static final  int fF;

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (bx.var3(actorDeath.getActor().equals(Players.getLocal()) ? 1 : 0)) {
            this.fG = var2[0];
        }
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean bn() {
        return var2[0];
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var11;
        bx var12;
        WorldPoint worldPoint = this.a(fD);
        if (bx.var3(this.fG) && bx.var13(Players.getLocal().getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            return var2[0];
        }
        if (bx.var3(var12.fG)) {
            WorldPoint var14 = var12.a(fE);
            if (bx.var3(Players.getLocal().getWorldLocation().equals((Object)var14) ? 1 : 0)) {
                return var2[0];
            }
            Movement.setDestination((WorldPoint)var14);
            return var2[1];
        }
        if (bx.var3(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
            return var2[0];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return var2[1];
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        if (bx.var15(NPCs.getNearest(nPC -> {
            int n2;
            if (bx.var3(nPC.getName().contains(var1[var2[0]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[bx.var2[0]] = var1[var2[1]];
                if (bx.var3(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if ((0x4E ^ 0x4A) >= 2) return n2 != 0;
                    return ((0x54 ^ 0x17) & ~(0x37 ^ 0x74)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        }))) {
            bl2 = var2[1];
            0;
            if null != null {
                return ((0xD9 ^ 0x8E) & ~(0xFA ^ 0xAD)) != 0;
            }
        } else {
            bl2 = var2[0];
        }
        return bl2;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static void var16() {
        var1 = new String[var2[5]];
        bx.var1[bx.var2[0]] = "Obelisk";
        bx.var1[bx.var2[1]] = "Attack";
    }

    @Override
    public void r() {
        this.fG = var2[0];
    }

    private static void var17() {
        var2 = new int[7];
        bx.var2[0] = (0x8F ^ 0xB4 ^ (0x6A ^ 5)) & (0x33 ^ 0x1C ^ (0x7D ^ 6) ^ -1);
        bx.var2[1] = 1;
        bx.var2[2] = -(0xFFFFBC2E & 0x4FDB) & (0xFFFFBEBF & 0xFFFF);
        bx.var2[3] = 0x6E ^ 0x3F ^ (0x46 ^ 0x35);
        bx.var2[4] = 0x25 ^ 6;
        bx.var2[5] = 2;
        bx.var2[6] = 0x3C ^ 0x34;
    }

    @Inject
    protected MovingToRightSpotWithChargingTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.fG = var2[0];
    }

    @Override
    protected boolean aS() {
        return var2[1];
    }

    static {
        bx.var17();
        bx.var16();
        fF = var2[2];
        fD = new Point(var2[3], var2[3]);
        fE = new Point(var2[3], var2[4]);
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (bx.var4(gameObjectSpawned.getGameObject().getId(), var2[2])) {
            this.fG = var2[1];
        }
    }
}

