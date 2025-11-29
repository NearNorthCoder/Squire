/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.UnmodifiableIterator
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.AUHelper;
import gg.squire.nightmare.tasks.GameEnum;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Nightmares Charge", priority=2147483546, blocking=true)
public class AvoidingNightmaresChargeTask
extends NightmareTaskBase {
    private static final  Logger eq;

    private static boolean lIIlIIIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cF() {
        void var4_4;
        at var1;
        if (at.lIIlIIIllIIllIl(this.cM.aj())) {
            return null;
        }
        WorldArea var2 = var1.aj();
        int var3 = var2.getWidth();
        int var4 = var2.getHeight();
        WorldArea var5 = null;
        eq.debug(llllIllIIlIl[llllIllIlIlI[17]], (Object)var3, (Object)var4);
        av var6 = var1.cE();
        if (at.lIIlIIIllIIllIl((Object)var6)) {
            return null;
        }
        switch (au.er[var6.ordinal()]) {
            case 1: {
                int var7 = -(var2.getHeight() - llllIllIlIlI[17]);
                var5 = var1.cS.getWorldArea().dy(var7);

                if (3 != 1) break;
                return null;
            }
            case 2: {
                int var8 = var2.getHeight() - llllIllIlIlI[17];
                var5 = var1.cS.getWorldArea().dy(var8);

                if (1 < 3) break;
                return null;
            }
            case 3: {
                int var9 = -(var2.getWidth() - llllIllIlIlI[17]);
                var5 = var1.cS.getWorldArea().dx(var9);

                if (-1 <= 0) break;
                return null;
            }
            case 4: {
                int var10 = var2.getWidth() - llllIllIlIlI[17];
                var5 = var1.cS.getWorldArea().dx(var10);
            }
        }
        this.cM.aj = var4_4;
        return var4_4.getMeleeTiles(this.cL).stream().filter(worldPoint -> {
            boolean bl;
            if (at.lIIlIIIllIIllII(this.cM.aj().contains(worldPoint) ? 1 : 0)) {
                bl = llllIllIlIlI[16];

                }
            } else {
                bl = llllIllIlIlI[4];
            }
            return bl;
        }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var11;
        void var12;
        ImmutableSet immutableSet = ImmutableSet.of((Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[1], llllIllIlIlI[9])), (Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[2], llllIllIlIlI[9])));
        int n2 = llllIllIlIlI[15];
        NPC nPC = SquireNightmarePlugin.d();
        int n3 = nPC.getAnimation();
        RectangularArea rectangularArea = e.ay();
        if (at.lIIlIIIllIIlIll(rectangularArea)) {
            this.cM.k(llllIllIlIlI[4]);
            this.cM.aj = null;
            this.cM.b((WorldArea)null);
            return llllIllIlIlI[4];
        }
        if (at.lIIlIIIllIIlIIl((int)var12, (int)var11)) {
            void var13;
            void var14;
            WorldArea[] worldAreaArray = new WorldArea[llllIllIlIlI[16]];
            worldAreaArray[at.llllIllIlIlI[4]] = var14.getWorldArea();
            if (at.lIIlIIIllIIllII(SquireNightmarePlugin.e().isInArea(worldAreaArray) ? 1 : 0) && at.lIIlIIIllIIllII(var13.contains((Object)SquireNightmarePlugin.e()) ? 1 : 0) && at.lIIlIIIllIIllII(var13.contains((Object)var14.getWorldArea().getCenter()) ? 1 : 0) && at.lIIlIIIllIIllII(var13.contains((Object)var14.getWorldLocation()) ? 1 : 0)) {
                at var15;
                WorldPoint var16;
                UnmodifiableIterator var17 = var13.iterator();
                while (at.lIIlIIIllIIlIlI(var17.hasNext() ? 1 : 0)) {
                    var16 = (WorldPoint)var17.next();
                    WorldArea[] worldAreaArray2 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray2[at.llllIllIlIlI[4]] = var14.getWorldArea();
                    if (at.lIIlIIIllIIlIlI(var16.isInArea(worldAreaArray2) ? 1 : 0)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[4]]);
                        var15.cM.k(llllIllIlIlI[4]);
                        return llllIllIlIlI[4];
                    }

                    if (-3 <= 0) continue;
                    return ((0x32 ^ 0x6A ^ (0x2D ^ 0x3D)) & (0x51 ^ 0x69 ^ (0x3C ^ 0x4C) ^ -1)) != 0;
                }
                var17 = var15.aj();
                if (at.lIIlIIIllIIllII(var15.cM.AvoidingNightmaresChargeTask())) {
                    var15.cM.k(llllIllIlIlI[17]);
                }
                var16 = e.aw();
                var15.cM.b((WorldArea)var17);
                int[] var18 = SquireNightmarePlugin.r.stream().mapToInt(Integer::intValue).toArray();
                NPC var19 = NPCs.getNearest((int[])var18);
                if (at.lIIlIIIllIIlIll(var19)) {
                    WorldArea[] worldAreaArray3 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray3[at.llllIllIlIlI[4]] = var17;
                    if (at.lIIlIIIllIIlIlI(Players.getLocal().getWorldLocation().isInArea(worldAreaArray3) ? 1 : 0)) {
                        WorldPoint var20 = var16.toWorldPointList().parallelStream().filter(arg_0 -> at.c((WorldArea)var17, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        return var15.j(var20);
                    }
                    WorldPoint var20 = var15.cF();
                    if (at.lIIlIIIllIIllIl(var20)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[16]]);
                        return llllIllIlIlI[4];
                    }
                    var15.j(var20);

                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    WorldPoint var20 = null;
                    Player var21 = Players.getLocal();
                    if (at.lIIlIIIllIIllIl(var21)) {
                        return llllIllIlIlI[4];
                    }
                    if (at.lIIlIIIllIIllII(var17.contains(var21.getWorldLocation()) ? 1 : 0) && at.lIIlIIIllIIllII(var21.isMoving() ? 1 : 0)) {
                        return llllIllIlIlI[4];
                    }
                    var20 = var16.toWorldPointList().stream().filter(arg_0 -> at.b((WorldArea)var17, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                    if (at.lIIlIIIllIIllIl(var20)) {
                        WorldArea var22 = SquireNightmarePlugin.e().toWorldArea(llllIllIlIlI[18], llllIllIlIlI[18]);
                        var20 = var22.toWorldPointList().stream().filter(arg_0 -> at.a((WorldArea)var17, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        eq.debug(llllIllIIlIl[llllIllIlIlI[19]], (Object)var20);
                    }
                    if (at.lIIlIIIllIIllIl(var20)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[20]]);
                        return llllIllIlIlI[4];
                    }
                    eq.debug(llllIllIIlIl[llllIllIlIlI[21]], (Object)var20, (Object)Players.getLocal().getWorldLocation());
                    return var15.j(var20);
                }
            }
        }
        return llllIllIlIlI[4];
    }

    private static  boolean c(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];

            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static boolean lIIlIIIllIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public AvoidingNightmaresChargeTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    static {
        at.lIIlIIIllIIIlll();
        at.lIIlIIIlIlllIll();
        eq = LoggerFactory.getLogger(AvoidingNightmaresChargeTask.class);
    }

    private static boolean lIIlIIIllIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIllIIlIII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var23);
    }

    /*
     * WARNING - void declaration
     */
    public av cE() {
        void var24;
        void var25;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            int var26 = llllIllIlIlI[3];
        }
        if (!at.lIIlIIIllIIlIII((int)var25, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)var25, llllIllIlIlI[6])) {
            return av.WEST;
        }
        if (!at.lIIlIIIllIIlIII((int)var25, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var25, llllIllIlIlI[10])) {
            return av.EAST;
        }
        if (!at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)var24, llllIllIlIlI[13])) {
            return av.NORTH;
        }
        if (!at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)var24, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var24, llllIllIlIlI[2])) {
            return av.SOUTH;
        }
        return null;
    }

    private static boolean lIIlIIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private WorldArea aj() {
        return new WorldArea(at.y(llllIllIlIlI[16]), at.y(llllIllIlIlI[4]));
    }

    private static  boolean b(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];

            if ((0x98 ^ 0x9C ^ (0x68 ^ 0x78) & ~(0x2F ^ 0x3F)) < 2) {
                return ((0x74 ^ 0x4A ^ (0xB ^ 0x2F)) & (44 + 175 - 143 + 113 ^ 85 + 99 - 112 + 95 ^ -1)) != 0;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static  boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];

            if (1 >= 3) {
                return false;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    public static WorldPoint a(LocalPoint localPoint) {
        WorldPoint worldPoint2 = WorldPoint.fromLocalInstance((Client)Static.getClient(), (LocalPoint)localPoint);
        WorldPoint worldPoint3 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)worldPoint2).stream().filter(Objects::nonNull).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(Players.getLocal().getWorldLocation()))).orElse(null);
        return worldPoint3;
    }

    private static void lIIlIIIlIlllIll() {
        llllIllIIlIl = new String[llllIllIlIlI[22]];
        at.llllIllIIlIl[at.llllIllIlIlI[4]] = "[AvoidCharge] PNM is in MIDDLE/multi area, which means we don't have to dodge?";
        at.llllIllIIlIl[at.llllIllIlIlI[16]] = "[AvoidCharge] Optimal chargepoint is null";
        at.llllIllIIlIl[at.llllIllIlIlI[19]] = "[AvoidCharge] safestPoint is null, trying second try: {}";
        at.llllIllIIlIl[at.llllIllIlIlI[20]] = "[AvoidCharge] safestPoint is still null after 2 attempts.";
        at.llllIllIIlIl[at.llllIllIlIlI[21]] = "[AvoidCharge] Safest charge point: {}; Player current location: {}";
        at.llllIllIIlIl[at.llllIllIlIlI[17]] = "[AvoidCharge]: Width = {}; Height = {}";
    }

    /*
     * WARNING - void declaration
     */
    public static WorldPoint y(boolean bl) {
        void var7_7;
        boolean var27;
        void var28;
        void var29;
        int var30;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            var30 = llllIllIlIlI[3];
        }
        LocalPoint var31 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var32 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var33 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint var34 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        if (!at.lIIlIIIllIIlIII((int)var29, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)var29, llllIllIlIlI[6])) {
            var32 = new LocalPoint((int)(var29 + var30 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var31 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var33 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var34 = new LocalPoint((int)(var29 + var30 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));

            if ((0xA2 ^ 0xAA ^ (0x51 ^ 0x5D)) <= 3) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var29, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var29, llllIllIlIlI[10])) {
            var32 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var31 = new LocalPoint((int)(var29 - var30 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var33 = new LocalPoint((int)(var29 - var30 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var34 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));

            if (3 < 0) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)var28, llllIllIlIlI[13])) {
            var32 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var31 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var33 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 - var30 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var34 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 - var30 - llllIllIlIlI[7] - llllIllIlIlI[8]));

            if (((0x29 ^ 0x2C) & ~(0x9D ^ 0x98)) != ((0x37 ^ 4) & ~(1 ^ 0x32))) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)var28, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)var28, llllIllIlIlI[2])) {
            var32 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 + var30 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var31 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 + var30 + llllIllIlIlI[7] + llllIllIlIlI[8]));
            var33 = new LocalPoint((int)(var29 - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));
            var34 = new LocalPoint((int)(var29 + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(var28 - llllIllIlIlI[7] - llllIllIlIlI[8]));
        }
        if (at.lIIlIIIllIIlIlI(var27 ? 1 : 0)) {
            return at.a(var33);
        }
        return at.a((LocalPoint)var7_7);
    }
}

