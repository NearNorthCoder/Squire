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
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aZ;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
extends FarmerTaskBase {
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
            if (aY.lllIllllIIIlIl((Object)an2.aZ(), (Object)n.HARVESTABLE)) {
                bl = lIllllIlllll[3];

                if ((0x95 ^ 0x90) == 0) {
                    return false;
                }
            } else {
                bl = lIllllIlllll[1];
            }
            return bl;
        });
        this.cF = lIllllIlllll[0];
        this.cI = lIllllIlllll[1];
        this.cJ = lIllllIlllll[2];
        this.cP = lIllllIlllll[3];
        this.cD = client;
        this.cE = executorService;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        void var2_2;
        aY var1;
        if (aY.lllIllllIIIIIl(itemContainerChanged.getItemContainer(), this.cD.getItemContainer(InventoryID.INVENTORY))) {
            return;
        }
        int var2 = var1.cD.getTickCount();
        if (aY.lllIllllIIIllI(var2 - lIllllIlllll[3], var1.cN) && aY.lllIllllIIIIlI(var2 - var1.cI, lIllllIlllll[7])) {
            var1.cG = lIllllIlllll[3];

            if (1 < 0) {
                return;
            }
        } else if (aY.lllIllllIIIlll(var2 - var1.cN, var1.cP)) {
            var1.cG = lIllllIlllll[1];
        }
        this.cN = var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var3;
        void var4;
        aY var5;
        TileObject tileObject2 = n2.b(this.cD);
        if (!aY.lllIlllIlllllI(Inventory.isFull() ? 1 : 0) || !aY.lllIlllIllllll(tileObject2) || aY.lllIlllIlllllI(tileObject2.hasAction(N.br) ? 1 : 0)) {
            return lIllllIlllll[1];
        }
        var5.cO = Players.getLocal();
        if (aY.lllIllllIIIIII(var5.cO.getAnimation(), lIllllIlllll[0]) && aY.lllIllllIIIIIl((Object)var4.aL(), (Object)P.HERB)) {
            return lIllllIlllll[1];
        }
        int[] nArray = new int[lIllllIlllll[3]];
        nArray[aY.lIllllIlllll[1]] = lIllllIlllll[4];
        Item var6 = Inventory.getFirst((int[])nArray);
        if (aY.lllIlllIllllll(var6)) {
            var6.interact(lIllllIlIlII[lIllllIlllll[1]]);
            return lIllllIlllll[3];
        }
        int[] nArray2 = new int[lIllllIlllll[3]];
        nArray2[aY.lIllllIlllll[1]] = lIllllIlllll[5];
        Item var7 = Inventory.getFirst((int[])nArray2);
        if (aY.lllIlllIllllll(var7)) {
            var7.interact(lIllllIlIlII[lIllllIlllll[3]]);
        }
        if (aY.lllIllllIIIIlI(var3.distanceTo((Locatable)var5.cO), lIllllIlllll[6])) {
            int n3;
            P var8 = var4.aL();
            if (aY.lllIllllIIIIll(var5.cG ? 1 : 0) && aY.lllIllllIIIIlI(var5.cD.getTickCount() - var5.cI, lIllllIlllll[7])) {
                return lIllllIlllll[1];
            }
            TileObject var9 = var4.b(var5.cD);
            if (aY.lllIllllIIIlII(var9)) {
                return lIllllIlllll[1];
            }
            var5.cE.submit(() -> {
                void var10;
                int n2;
                if (!aY.lllIllllIIIIIl((Object)var8, (Object)P.ALLOTMENT) || aY.lllIllllIIIlIl((Object)var8, (Object)P.HERB)) {
                    n2 = Rand.nextInt((int)lIllllIlllll[9], (int)lIllllIlllll[10]);

                } else {
                    n2 = lIllllIlllll[3];
                }
                int var11 = n2;
                do {
                    var10.interact(lIllllIlllll[1]);
                    Time.sleep((long)Rand.nextInt((int)lIllllIlllll[11], (int)lIllllIlllll[12]));

                } while (!aY.lllIlllIlllllI(Players.getLocal().isMoving() ? 1 : 0));
                int var12 = lIllllIlllll[1];
                while (aY.lllIllllIIlIII(var12, var11)) {
                    var10.interact(lIllllIlllll[1]);
                    Time.sleep((long)Rand.nextInt((int)lIllllIlllll[11], (int)lIllllIlllll[12]));

                    ++var12;

                    if (((0x62 ^ 0x24) & ~(0x40 ^ 6)) == 0) continue;
                    return;
                }
            });

            if (aY.lllIllllIIIlIl((Object)var8, (Object)P.ALLOTMENT)) {
                n3 = lIllllIlllll[3];

                if (-(12 + 112 - 44 + 62 ^ 18 + 93 - 63 + 90) > 0) {
                    return ((0xAA ^ 0x86 ^ (0x8F ^ 0xC2)) & (203 + 51 - 156 + 123 ^ 152 + 49 - 29 + 16 ^ -1)) != 0;
                }
            } else {
                n3 = lIllllIlllll[6];
            }
            var5.cP = n3;
            var5.sleep(lIllllIlllll[8]);
            var5.cG = lIllllIlllll[3];
            return lIllllIlllll[3];
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
                void var13;
                return var13.isIdle();
            }
            case 2: {
                void var13;
                return var13.isAnimating();
            }
        }
        return lIllllIlllll[3];
    }

    private static boolean lllIlllIlllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllllIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllllIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIllllIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIllllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlllIllllll(Object object) {
        return object != null;
    }

    private static boolean lllIllllIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIllllIIIIll(int n2) {
        return n2 != 0;
    }

    static {
        aY.lllIlllIllllIl();
        aY.lllIlllIlllIll();
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.cG = lIllllIlllll[1];
    }

    @Subscribe
    public void a(ClientTick clientTick) {
        aY var14;
        if (aY.lllIllllIIIlII(this.cO)) {
            return;
        }
        O var15 = O.e(var14.cF);
        if (aY.lllIllllIIIIIl((Object)var15, (Object)O.HERB)) {
            return;
        }
        if (aY.lllIllllIIIllI(var14.cO.getAnimationFrame(), lIllllIlllll[3])) {
            int var16 = var14.cD.getTickCount();
            if (aY.lllIllllIIIIlI(var16 - var14.cI, lIllllIlllll[6]) && aY.lllIlllIlllllI(var14.cG ? 1 : 0)) {
                var14.cG = lIllllIlllll[3];
                return;
            }
            var14.cI = var16;
        }
    }

    private static void lllIlllIlllIll() {
        lIllllIlIlII = new String[lIllllIlllll[13]];
        aY.lIllllIlIlII[aY.lIllllIlllll[1]] = "Wield";
        aY.lIllllIlIlII[aY.lIllllIlllll[3]] = "Drop";
    }

    private static boolean lllIllllIIIlII(Object object) {
        return object == null;
    }

    private static boolean lllIllllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIllllIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2_2;
        aY var17;
        void var18;
        if (aY.lllIllllIIIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        int var19 = var18.getActor().getAnimation();
        if (aY.lllIllllIIIllI(var19, lIllllIlllll[0]) && aY.lllIlllIllllll((Object)O.e(var17.cF))) {
            var17.cJ = var17.cD.getTickCount();

            if (((0x3A ^ 0x7D) & ~(0x6F ^ 0x28)) != 0) {
                return;
            }
        } else if (aY.lllIlllIllllll((Object)O.e(var19))) {
            var17.cI = var17.cD.getTickCount();
        }
        this.cF = var2_2;
    }

    @Override
    public boolean bv() {
        boolean bl;
        if (aY.lllIlllIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            bl = lIllllIlllll[3];

            }
        } else {
            bl = lIllllIlllll[1];
        }
        return bl;
    }
}

