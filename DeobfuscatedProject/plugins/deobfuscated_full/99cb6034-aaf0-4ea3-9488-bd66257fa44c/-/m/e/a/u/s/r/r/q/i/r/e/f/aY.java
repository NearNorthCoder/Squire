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
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.O;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aZ;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
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

/* TASK: Harvesting crops -> HarvestingcropsTask */
@TaskDesc(name="Harvesting crops", priority=5, blocking=true, register=true)
public class aY
extends aX {
    private /* synthetic */ boolean cG;
    private /* synthetic */ int cI;
    private /* synthetic */ N cH;
    private /* synthetic */ int cL;
    private /* synthetic */ Player cO;
    private /* synthetic */ int cN;
    private /* synthetic */ boolean cK;
    private static /* synthetic */ int[] lIllllIlllll;
    private /* synthetic */ int cJ;
    private static /* synthetic */ String[] lIllllIlIlII;
    private final /* synthetic */ ExecutorService cE;
    private /* synthetic */ boolean cM;
    private /* synthetic */ int cF;
    private /* synthetic */ int cP;
    private final /* synthetic */ Client cD;

    @Inject
    public aY(f f2, SquireFarmerConfig squireFarmerConfig, Client client, ExecutorService executorService) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (aY.lllIllllIIIlIl((Object)an2.aZ(), (Object)n.HARVESTABLE)) {
                bl = lIllllIlllll[3];
                0;
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
        aY var9;
        if (aY.lllIllllIIIIIl(itemContainerChanged.getItemContainer(), this.cD.getItemContainer(InventoryID.INVENTORY))) {
            return;
        }
        int var14 = var9.cD.getTickCount();
        if (aY.lllIllllIIIllI(var14 - lIllllIlllll[3], var9.cN) && aY.lllIllllIIIIlI(var14 - var9.cI, lIllllIlllll[7])) {
            var9.cG = lIllllIlllll[3];
            0;
            if (1 < 0) {
                return;
            }
        } else if (aY.lllIllllIIIlll(var14 - var9.cN, var9.cP)) {
            var9.cG = lIllllIlllll[1];
        }
        this.cN = var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        void var1;
        void var13;
        aY var10;
        TileObject tileObject2 = n2.b(this.cD);
        if (!aY.lllIlllIlllllI(Inventory.isFull() ? 1 : 0) || !aY.lllIlllIllllll(tileObject2) || aY.lllIlllIlllllI(tileObject2.hasAction(N.br) ? 1 : 0)) {
            return lIllllIlllll[1];
        }
        var10.cO = Players.getLocal();
        if (aY.lllIllllIIIIII(var10.cO.getAnimation(), lIllllIlllll[0]) && aY.lllIllllIIIIIl((Object)var13.aL(), (Object)P.HERB)) {
            return lIllllIlllll[1];
        }
        int[] nArray = new int[lIllllIlllll[3]];
        nArray[aY.lIllllIlllll[1]] = lIllllIlllll[4];
        Item var17 = Inventory.getFirst((int[])nArray);
        if (aY.lllIlllIllllll(var17)) {
            var17.interact(lIllllIlIlII[lIllllIlllll[1]]);
            return lIllllIlllll[3];
        }
        int[] nArray2 = new int[lIllllIlllll[3]];
        nArray2[aY.lIllllIlllll[1]] = lIllllIlllll[5];
        Item var22 = Inventory.getFirst((int[])nArray2);
        if (aY.lllIlllIllllll(var22)) {
            var22.interact(lIllllIlIlII[lIllllIlllll[3]]);
        }
        if (aY.lllIllllIIIIlI(var1.distanceTo((Locatable)var10.cO), lIllllIlllll[6])) {
            int n3;
            P var11 = var13.aL();
            if (aY.lllIllllIIIIll(var10.cG ? 1 : 0) && aY.lllIllllIIIIlI(var10.cD.getTickCount() - var10.cI, lIllllIlllll[7])) {
                return lIllllIlllll[1];
            }
            TileObject var19 = var13.b(var10.cD);
            if (aY.lllIllllIIIlII(var19)) {
                return lIllllIlllll[1];
            }
            var10.cE.submit(() -> {
                void var21;
                int n2;
                if (!aY.lllIllllIIIIIl((Object)var11, (Object)P.ALLOTMENT) || aY.lllIllllIIIlIl((Object)var11, (Object)P.HERB)) {
                    n2 = Rand.nextInt((int)lIllllIlllll[9], (int)lIllllIlllll[10]);
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else {
                    n2 = lIllllIlllll[3];
                }
                int var8 = n2;
                do {
                    var21.interact(lIllllIlllll[1]);
                    Time.sleep((long)Rand.nextInt((int)lIllllIlllll[11], (int)lIllllIlllll[12]));
                    0;
                } while (!aY.lllIlllIlllllI(Players.getLocal().isMoving() ? 1 : 0));
                int var4 = lIllllIlllll[1];
                while (aY.lllIllllIIlIII(var4, var8)) {
                    var21.interact(lIllllIlllll[1]);
                    Time.sleep((long)Rand.nextInt((int)lIllllIlllll[11], (int)lIllllIlllll[12]));
                    0;
                    ++var4;
                    0;
                    if (((0x62 ^ 0x24) & ~(0x40 ^ 6)) == 0) continue;
                    return;
                }
            });
            0;
            if (aY.lllIllllIIIlIl((Object)var11, (Object)P.ALLOTMENT)) {
                n3 = lIllllIlllll[3];
                0;
                if (-(12 + 112 - 44 + 62 ^ 18 + 93 - 63 + 90) > 0) {
                    return ((0xAA ^ 0x86 ^ (0x8F ^ 0xC2)) & (203 + 51 - 156 + 123 ^ 152 + 49 - 29 + 16 ^ -1)) != 0;
                }
            } else {
                n3 = lIllllIlllll[6];
            }
            var10.cP = n3;
            var10.sleep(lIllllIlllll[8]);
            var10.cG = lIllllIlllll[3];
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
                void var3;
                return var3.isIdle();
            }
            case 2: {
                void var3;
                return var3.isAnimating();
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

    private static String lllIlllIlIIIIl(String var15, String var24) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllllIlllll[13], var20);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
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
        aY var6;
        if (aY.lllIllllIIIlII(this.cO)) {
            return;
        }
        O var7 = O.e(var6.cF);
        if (aY.lllIllllIIIIIl((Object)var7, (Object)O.HERB)) {
            return;
        }
        if (aY.lllIllllIIIllI(var6.cO.getAnimationFrame(), lIllllIlllll[3])) {
            int var18 = var6.cD.getTickCount();
            if (aY.lllIllllIIIIlI(var18 - var6.cI, lIllllIlllll[6]) && aY.lllIlllIlllllI(var6.cG ? 1 : 0)) {
                var6.cG = lIllllIlllll[3];
                return;
            }
            var6.cI = var18;
        }
    }

    private static void lllIlllIlllIll() {
        lIllllIlIlII = new String[lIllllIlllll[13]];
        aY.lIllllIlIlII[aY.lIllllIlllll[1]] = aY."Wield";
        aY.lIllllIlIlII[aY.lIllllIlllll[3]] = aY."Drop";
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

    private static void lllIlllIllllIl() {
        lIllllIlllll = new int[14];
        aY.lIllllIlllll[0] = -1;
        aY.lIllllIlllll[1] = (112 + 18 - 86 + 143 ^ 99 + 104 - 181 + 137) & (0xF7 ^ 0xC0 ^ (0x76 ^ 0x65) ^ -1);
        aY.lIllllIlllll[2] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        aY.lIllllIlllll[3] = 1;
        aY.lIllllIlllll[4] = -(0xFFFFB30F & 0x6EFD) & (0xFFFFBFFF & 0x7EFD);
        aY.lIllllIlllll[5] = -(0xFFFFF4AD & 0x7B53) & (0xFFFFF787 & 0x7FFD);
        aY.lIllllIlllll[6] = 3;
        aY.lIllllIlllll[7] = 0xF9 ^ 0xC7 ^ (0x7A ^ 0x40);
        aY.lIllllIlllll[8] = 0xAC ^ 0xA1 ^ (0xB0 ^ 0xBB);
        aY.lIllllIlllll[9] = 0x75 ^ 0x70;
        aY.lIllllIlllll[10] = 0xC4 ^ 0xC3;
        aY.lIllllIlllll[11] = 0xFFFFC3FE & 0x3D2D;
        aY.lIllllIlllll[12] = 0xFFFFBB78 & 0x46DF;
        aY.lIllllIlllll[13] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2_2;
        aY var23;
        void var5;
        if (aY.lllIllllIIIIIl(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        int var16 = var5.getActor().getAnimation();
        if (aY.lllIllllIIIllI(var16, lIllllIlllll[0]) && aY.lllIlllIllllll((Object)O.e(var23.cF))) {
            var23.cJ = var23.cD.getTickCount();
            0;
            if (((0x3A ^ 0x7D) & ~(0x6F ^ 0x28)) != 0) {
                return;
            }
        } else if (aY.lllIlllIllllll((Object)O.e(var16))) {
            var23.cI = var23.cD.getTickCount();
        }
        this.cF = var2_2;
    }

    @Override
    public boolean bv() {
        boolean bl;
        if (aY.lllIlllIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            bl = lIllllIlllll[3];
            0;
            
            }
        } else {
            bl = lIllllIlllll[1];
        }
        return bl;
    }
}

