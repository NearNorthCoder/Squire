/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum5;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aZ;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Harvesting crops", priority=5, blocking=true, register=true)
public class HarvestingCropsTask
extends aX {
    private  boolean cG;
    private  int cI;
    private  N cH;
    private  int cL;
    private  Player cO;
    private  int cN;
    private  boolean cK;
    
    private  int cJ;
    
    private final  ExecutorService cE;
    private  boolean cM;
    private  int cF;
    private  int cP;
    private final  Client cD;

    @Inject
    public HarvestingCropsTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, ExecutorService executorService) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (((Object)an2.aZ() == (Object)an2.aZ()2)n.HARVESTABLE)) {
                bl = 3;
                0;
                if ((0x95 ^ 0x90) == 0) {
                    return ((0x29 ^ 0x3A) & ~(0x19 ^ 0xA)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        this.cF = 0;
        this.cI = 1;
        this.cJ = 2;
        this.cP = 3;
        this.cD = client;
        this.cE = executorService;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        void var2_2;
        aY var3;
        if ((itemContainerChanged.getItemContainer() != itemContainerChanged.getItemContainer()2))) {
            return;
        }
        int var4 = var3.cD.getTickCount();
        if ((var4 - 3 == var3.cN) && (var4 - var3.cI <= 7)) {
            var3.cG = 3;
            0;
            if (1 < 0) {
                return;
            }
        } else if (var4 - var3.cN > var3.cP) {
            var3.cG = 1;
        }
        this.cN = var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var5;
        void var6;
        aY var7;
        TileObject tileObject2 = n2.b(this.cD);
        if (!(Inventory.isFull( == 0) ? 1 : 0) || !tileObject2 != null || (tileObject2.hasAction(N.br == 0) ? 1 : 0)) {
            return 1;
        }
        var7.cO = Players.getLocal();
        if ((var7.cO.getAnimation() != 0) && ((Object)var6.aL() != (Object)var6.aL()2)P.HERB)) {
            return 1;
        }
        int[] nArray = new int[3];
        nArray[1] = 4;
        Item var8 = Inventory.getFirst((int[])nArray);
        if var8 != null {
            var8.interact(var2[1]);
            return 3;
        }
        int[] nArray2 = new int[3];
        nArray2[1] = 5;
        Item var9 = Inventory.getFirst((int[])nArray2);
        if var9 != null {
            var9.interact(var2[3]);
        }
        if ((var5.distanceTo((Locatable)var7.cO) <= 6)) {
            int n3;
            P var10 = var6.aL();
            if ((var7.cG != 0) && (var7.cD.getTickCount() - var7.cI <= 7)) {
                return 1;
            }
            TileObject var11 = var6.b(var7.cD);
            if var11 == null {
                return 1;
            }
            var7.cE.submit(() -> {
                void var12;
                int n2;
                if (!((Object)var10 != (Object)P.ALLOTMENT) || ((Object)var10 == (Object)P.HERB)) {
                    n2 = Rand.nextInt((int)9, (int)var1[10]);
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else {
                    n2 = 3;
                }
                int var13 = n2;
                do {
                    var12.interact(1);
                    Time.sleep((long)Rand.nextInt((int)var1[11], (int)var1[12]));
                    0;
                } while (!(Players.getLocal( == 0).isMoving() ? 1 : 0));
                int var14 = 1;
                while (var14 < var13) {
                    var12.interact(1);
                    Time.sleep((long)Rand.nextInt((int)var1[11], (int)var1[12]));
                    0;
                    ++var14;
                    0;
                    if (((0x62 ^ 0x24) & ~(0x40 ^ 6)) == 0) continue;
                    return;
                }
            });
            0;
            if (((Object)var10 == (Object)P.ALLOTMENT)) {
                n3 = 3;
                0;
                if (-(12 + 112 - 44 + 62 ^ 18 + 93 - 63 + 90) > 0) {
                    return ((0xAA ^ 0x86 ^ (0x8F ^ 0xC2)) & (203 + 51 - 156 + 123 ^ 152 + 49 - 29 + 16 ^ -1)) != 0;
                }
            } else {
                n3 = 6;
            }
            var7.cP = n3;
            var7.sleep(8);
            var7.cG = 3;
            return 3;
        }
        this.cH = n2;
        return this.a(n2, (TileObject tileObject) -> tileObject.interact(N.br));
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Player player, N n2) {
        switch (aZ.cQ[n2.aL().ordinal()]) {
            case 1: {
                void var15;
                return var15.isIdle();
            }
            case 2: {
                void var15;
                return var15.isAnimating();
            }
        }
        return 3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.cG = 1;
    }

    @Subscribe
    public void a(ClientTick clientTick) {
        aY var22;
        if (this.cO == null) {
            return;
        }
        O var23 = O.e(var22.cF);
        if (((Object)var23 != (Object)O.HERB)) {
            return;
        }
        if ((var22.cO.getAnimationFrame() == 3)) {
            int var24 = var22.cD.getTickCount();
            if ((var24 - var22.cI <= 6) && (var22.cG == 0)) {
                var22.cG = 3;
                return;
            }
            var22.cI = var24;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2_2;
        aY var25;
        void var26;
        if ((animationChanged.getActor() != animationChanged.getActor()2))) {
            return;
        }
        int var27 = var26.getActor().getAnimation();
        if ((var27 == 0) && (Object != nullO.e(var25.cF))) {
            var25.cJ = var25.cD.getTickCount();
            0;
            if (((0x3A ^ 0x7D) & ~(0x6F ^ 0x28)) != 0) {
                return;
            }
        } else if ((Object != nullO.e(var27))) {
            var25.cI = var25.cD.getTickCount();
        }
        this.cF = var2_2;
    }

    @Override
    public boolean bv() {
        boolean bl;
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            bl = 3;
            0;
            if null != null {
                return ((0x27 ^ 0x1D) & ~(0xBF ^ 0x85)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }
}

