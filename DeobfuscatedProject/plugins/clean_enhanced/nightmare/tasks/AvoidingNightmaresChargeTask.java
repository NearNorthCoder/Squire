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
import java.util.Comparator;
import java.util.Objects;
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
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.GameEnum;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Nightmares Charge", priority=2147483546, blocking=true)
public class AvoidingNightmaresChargeTask
extends NightmareManager {
    private static final  Logger eq;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cF() {
        void var4_4;
        at var17;
        if (at.var9(this.cM.aj())) {
            return null;
        }
        WorldArea var18 = var17.aj();
        int var19 = var18.getWidth();
        int var20 = var18.getHeight();
        WorldArea var21 = null;
        eq.debug(var1[var2[17]], (Object)var19, (Object)var20);
        av var22 = var17.cE();
        if (at.var9((Object)var22)) {
            return null;
        }
        switch (au.er[var22.ordinal()]) {
            case 1: {
                int var23 = -(var18.getHeight() - var2[17]);
                var21 = var17.cS.getWorldArea().dy(var23);
                0;
                if (3 != 1) break;
                return null;
            }
            case 2: {
                int var24 = var18.getHeight() - var2[17];
                var21 = var17.cS.getWorldArea().dy(var24);
                0;
                if (1 < 3) break;
                return null;
            }
            case 3: {
                int var25 = -(var18.getWidth() - var2[17]);
                var21 = var17.cS.getWorldArea().dx(var25);
                0;
                if (-1 <= 0) break;
                return null;
            }
            case 4: {
                int var26 = var18.getWidth() - var2[17];
                var21 = var17.cS.getWorldArea().dx(var26);
            }
        }
        this.cM.aj = var4_4;
        return var4_4.getMeleeTiles(this.cL).stream().filter(worldPoint -> {
            boolean bl;
            if (at.var27(this.cM.aj().contains(worldPoint) ? 1 : 0)) {
                bl = var2[16];
                0;
                if null != null {
                    return ((0x79 ^ 0x23) & ~(0xDE ^ 0x84)) != 0;
                }
            } else {
                bl = var2[4];
            }
            return bl;
        }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var28;
        void var29;
        ImmutableSet immutableSet = ImmutableSet.of((Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(var2[1], var2[9])), (Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(var2[2], var2[9])));
        int n2 = var2[15];
        NPC nPC = SquireNightmarePlugin.d();
        int n3 = nPC.getAnimation();
        RectangularArea rectangularArea = e.ay();
        if (at.var30(rectangularArea)) {
            this.cM.k(var2[4]);
            this.cM.aj = null;
            this.cM.b((WorldArea)null);
            return var2[4];
        }
        if (at.var10((int)var29, (int)var28)) {
            void var31;
            void var32;
            WorldArea[] worldAreaArray = new WorldArea[var2[16]];
            worldAreaArray[at.var2[4]] = var32.getWorldArea();
            if (at.var27(SquireNightmarePlugin.e().isInArea(worldAreaArray) ? 1 : 0) && at.var27(var31.contains((Object)SquireNightmarePlugin.e()) ? 1 : 0) && at.var27(var31.contains((Object)var32.getWorldArea().getCenter()) ? 1 : 0) && at.var27(var31.contains((Object)var32.getWorldLocation()) ? 1 : 0)) {
                at var33;
                WorldPoint var34;
                UnmodifiableIterator var35 = var31.iterator();
                while (at.var36(var35.hasNext() ? 1 : 0)) {
                    var34 = (WorldPoint)var35.next();
                    WorldArea[] worldAreaArray2 = new WorldArea[var2[16]];
                    worldAreaArray2[at.var2[4]] = var32.getWorldArea();
                    if (at.var36(var34.isInArea(worldAreaArray2) ? 1 : 0)) {
                        eq.debug(var1[var2[4]]);
                        var33.cM.k(var2[4]);
                        return var2[4];
                    }
                    0;
                    if (-3 <= 0) continue;
                    return ((0x32 ^ 0x6A ^ (0x2D ^ 0x3D)) & (0x51 ^ 0x69 ^ (0x3C ^ 0x4C) ^ -1)) != 0;
                }
                var35 = var33.aj();
                if (at.var27(var33.cM.AvoidingNightmaresChargeTask())) {
                    var33.cM.k(var2[17]);
                }
                var34 = e.aw();
                var33.cM.b((WorldArea)var35);
                int[] var37 = SquireNightmarePlugin.r.stream().mapToInt(Integer::intValue).toArray();
                NPC var38 = NPCs.getNearest((int[])var37);
                if (at.var30(var38)) {
                    WorldArea[] worldAreaArray3 = new WorldArea[var2[16]];
                    worldAreaArray3[at.var2[4]] = var35;
                    if (at.var36(Players.getLocal().getWorldLocation().isInArea(worldAreaArray3) ? 1 : 0)) {
                        WorldPoint var39 = var34.toWorldPointList().parallelStream().filter(arg_0 -> at.c((WorldArea)var35, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        return var33.j(var39);
                    }
                    WorldPoint var39 = var33.cF();
                    if (at.var9(var39)) {
                        eq.debug(var1[var2[16]]);
                        return var2[4];
                    }
                    var33.j(var39);
                    0;
                    0;
                    if (3 <= 1) {
                        return ((0xE4 ^ 0xA6) & ~(0x7F ^ 0x3D)) != 0;
                    }
                } else {
                    WorldPoint var39 = null;
                    Player var40 = Players.getLocal();
                    if (at.var9(var40)) {
                        return var2[4];
                    }
                    if (at.var27(var35.contains(var40.getWorldLocation()) ? 1 : 0) && at.var27(var40.isMoving() ? 1 : 0)) {
                        return var2[4];
                    }
                    var39 = var34.toWorldPointList().stream().filter(arg_0 -> at.b((WorldArea)var35, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                    if (at.var9(var39)) {
                        WorldArea var41 = SquireNightmarePlugin.e().toWorldArea(var2[18], var2[18]);
                        var39 = var41.toWorldPointList().stream().filter(arg_0 -> at.a((WorldArea)var35, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        eq.debug(var1[var2[19]], (Object)var39);
                    }
                    if (at.var9(var39)) {
                        eq.debug(var1[var2[20]]);
                        return var2[4];
                    }
                    eq.debug(var1[var2[21]], (Object)var39, (Object)Players.getLocal().getWorldLocation());
                    return var33.j(var39);
                }
            }
        }
        return var2[4];
    }

    private static  boolean c(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.var27(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = var2[16];
            0;
            if null != null {
                return ((0xF ^ 0x6D ^ (0x6A ^ 0x34)) & (133 + 73 - 198 + 175 ^ 50 + 7 - -3 + 79 ^ -1)) != 0;
            }
        } else {
            bl = var2[4];
        }
        return bl;
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    private static void var42() {
        var2 = new int[24];
        at.var2[0] = 0xFFFFA745 & 0x5FBA;
        at.var2[1] = 0xFFFFFE7B & 0x19C4;
        at.var2[2] = 0xFFFFFFF9 & 0x1C46;
        at.var2[3] = 0xFFFFCA3B & 0x3DC4;
        at.var2[4] = (0xCD ^ 0x8A) & ~(0x3A ^ 0x7D);
        at.var2[5] = 0xFFFFF5D8 & 0x1EE7;
        at.var2[6] = 0xFFFFFFC9 & 0x18F6;
        at.var2[7] = 0xFFFFA769 & 0x5996;
        at.var2[8] = 0x24 ^ 0x64;
        at.var2[9] = 0xFFFFBFD3 & 0x5BEC;
        at.var2[10] = -(0xFFFFA3BF & 0x7C6B) & (0xFFFFFFEA & 0x3FFF);
        at.var2[11] = 0xFFFFFFF9 & 0x1F46;
        at.var2[12] = 0xFFFFAF7A & 0x73C5;
        at.var2[13] = -(0xFFFF9976 & 0x7EBF) & (0xFFFFFFFF & 0x3BF5);
        at.var2[14] = -(0xFFFFE9A9 & 0x7E5F) & (0xFFFFFFEF & 0x7FD8);
        at.var2[15] = -(0xFFFFBE57 & 0x47EB) & (0xFFFFAFFF & 0x77E3);
        at.var2[16] = 1;
        at.var2[17] = 0xC5 ^ 0xC0;
        at.var2[18] = 0x28 ^ 0x25;
        at.var2[19] = 2;
        at.var2[20] = 3;
        at.var2[21] = 0x1B ^ 0x4A ^ (0x62 ^ 0x37);
        at.var2[22] = 0 ^ 0x35 ^ (0x82 ^ 0xB1);
        at.var2[23] = 0xBA ^ 0xA5 ^ (0x57 ^ 0x40);
    }

    @Inject
    public AvoidingNightmaresChargeTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    static {
        at.var42();
        at.var43();
        eq = LoggerFactory.getLogger(AvoidingNightmaresChargeTask.class);
    }

    private static boolean var30(Object object) {
        return object != null;
    }

    private static boolean var36(int n2) {
        return n2 != 0;
    }

    private static boolean var44(int n2, int n3) {
        return n2 != n3;
    }

    private static String var45(String var46, String var47) {
        var46 = new String(Base64.getDecoder().decode(var46.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var48 = new StringBuilder();
        char[] var49 = var47.toCharArray();
        int var50 = var2[4];
        char[] var51 = var46.toCharArray();
        int var52 = var51.length;
        int var53 = var2[4];
        while (at.var54(var53, var52)) {
            char var55 = var51[var53];
            var48.append((char)(var55 ^ var49[var50 % var49.length]));
            0;
            ++var50;
            ++var53;
            0;
            if ((0x23 ^ 0x27) == (0x1A ^ 0x1E)) continue;
            return null;
        }
        return String.valueOf(var48);
    }

    /*
     * WARNING - void declaration
     */
    public av cE() {
        void var56;
        void var57;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = var2[0];
        if (!at.var44(n2, var2[1]) || at.var10(n2, var2[2])) {
            int var58 = var2[3];
        }
        if (!at.var44((int)var57, var2[5]) || at.var10((int)var57, var2[6])) {
            return av.WEST;
        }
        if (!at.var44((int)var57, var2[9]) || at.var10((int)var57, var2[10])) {
            return av.EAST;
        }
        if (!at.var44((int)var56, var2[11]) || !at.var44((int)var56, var2[10]) || !at.var44((int)var56, var2[12]) || at.var10((int)var56, var2[13])) {
            return av.NORTH;
        }
        if (!at.var44((int)var56, var2[14]) || !at.var44((int)var56, var2[1]) || !at.var44((int)var56, var2[9]) || at.var10((int)var56, var2[2])) {
            return av.SOUTH;
        }
        return null;
    }

    private static boolean var54(int n2, int n3) {
        return n2 < n3;
    }

    private WorldArea aj() {
        return new WorldArea(at.y(var2[16]), at.y(var2[4]));
    }

    private static  boolean b(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.var27(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = var2[16];
            0;
            if ((0x98 ^ 0x9C ^ (0x68 ^ 0x78) & ~(0x2F ^ 0x3F)) < 2) {
                return ((0x74 ^ 0x4A ^ (0xB ^ 0x2F)) & (44 + 175 - 143 + 113 ^ 85 + 99 - 112 + 95 ^ -1)) != 0;
            }
        } else {
            bl = var2[4];
        }
        return bl;
    }

    private static  boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.var27(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = var2[16];
            0;
            if (1 >= 3) {
                return ((0x4C ^ 0x66) & ~(0x2F ^ 5)) != 0;
            }
        } else {
            bl = var2[4];
        }
        return bl;
    }

    public static WorldPoint a(LocalPoint localPoint) {
        WorldPoint worldPoint2 = WorldPoint.fromLocalInstance((Client)Static.getClient(), (LocalPoint)localPoint);
        WorldPoint worldPoint3 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)worldPoint2).stream().filter(Objects::nonNull).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(Players.getLocal().getWorldLocation()))).orElse(null);
        return worldPoint3;
    }

    private static void var43() {
        var1 = new String[var2[22]];
        at.var1[at.var2[4]] = "[AvoidCharge] PNM is in MIDDLE/multi area, which means we don't have to dodge?";
        at.var1[at.var2[16]] = "[AvoidCharge] Optimal chargepoint is null";
        at.var1[at.var2[19]] = "[AvoidCharge] safestPoint is null, trying second try: {}";
        at.var1[at.var2[20]] = "[AvoidCharge] safestPoint is still null after 2 attempts.";
        at.var1[at.var2[21]] = "[AvoidCharge] Safest charge point: {}; Player current location: {}";
        at.var1[at.var2[17]] = "[AvoidCharge]: Width = {}; Height = {}";
    }

    /*
     * WARNING - void declaration
     */
    public static WorldPoint y(boolean bl) {
        void var7_7;
        boolean var59;
        void var60;
        void var61;
        int var62;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = var2[0];
        if (!at.var44(n2, var2[1]) || at.var10(n2, var2[2])) {
            var62 = var2[3];
        }
        LocalPoint var63 = new LocalPoint(var2[4], var2[4]);
        LocalPoint var64 = new LocalPoint(var2[4], var2[4]);
        LocalPoint var65 = new LocalPoint(var2[4], var2[4]);
        LocalPoint var66 = new LocalPoint(var2[4], var2[4]);
        if (!at.var44((int)var61, var2[5]) || at.var10((int)var61, var2[6])) {
            var64 = new LocalPoint((int)(var61 + var62 + var2[7] + var2[8]), (int)(var60 + var2[7] + var2[8]));
            var63 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 + var2[7] + var2[8]));
            var65 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 - var2[7] - var2[8]));
            var66 = new LocalPoint((int)(var61 + var62 + var2[7] + var2[8]), (int)(var60 - var2[7] - var2[8]));
            0;
            if ((0xA2 ^ 0xAA ^ (0x51 ^ 0x5D)) <= 3) {
                return null;
            }
        } else if (!at.var44((int)var61, var2[9]) || at.var10((int)var61, var2[10])) {
            var64 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 + var2[7] + var2[8]));
            var63 = new LocalPoint((int)(var61 - var62 - var2[7] - var2[8]), (int)(var60 + var2[7] + var2[8]));
            var65 = new LocalPoint((int)(var61 - var62 - var2[7] - var2[8]), (int)(var60 - var2[7] - var2[8]));
            var66 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 - var2[7] - var2[8]));
            0;
            if (3 < 0) {
                return null;
            }
        } else if (!at.var44((int)var60, var2[11]) || !at.var44((int)var60, var2[10]) || !at.var44((int)var60, var2[12]) || at.var10((int)var60, var2[13])) {
            var64 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 + var2[7] + var2[8]));
            var63 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 + var2[7] + var2[8]));
            var65 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 - var62 - var2[7] - var2[8]));
            var66 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 - var62 - var2[7] - var2[8]));
            0;
            if (((0x29 ^ 0x2C) & ~(0x9D ^ 0x98)) != ((0x37 ^ 4) & ~(1 ^ 0x32))) {
                return null;
            }
        } else if (!at.var44((int)var60, var2[14]) || !at.var44((int)var60, var2[1]) || !at.var44((int)var60, var2[9]) || at.var10((int)var60, var2[2])) {
            var64 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 + var62 + var2[7] + var2[8]));
            var63 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 + var62 + var2[7] + var2[8]));
            var65 = new LocalPoint((int)(var61 - var2[7] - var2[8]), (int)(var60 - var2[7] - var2[8]));
            var66 = new LocalPoint((int)(var61 + var2[7] + var2[8]), (int)(var60 - var2[7] - var2[8]));
        }
        if (at.var36(var59)) {
            return at.a(var65);
        }
        return at.a((LocalPoint)var7_7);
    }
}

