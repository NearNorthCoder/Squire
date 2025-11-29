/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.BoostingPotion
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.BoostingPotion;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing boulder dash", priority=100, blocking=true, register=true)
public class DoingBoulderDashTask
extends AutotoaManager {
    private  int dZ;
    
    private static final  int dT;
    private  NPC dW;
    private final  Set<NPC> dU;
    private  int dY;
    private static final  Point[] dQ;
    private final  Set<NPC> dV;
    private static final  int dR;
    private  int ea;
    private static final  int[] dS;
    private  boolean dX;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public void r() {
        this.dW = null;
        this.dV.clear();
        this.dU.clear();
        this.dX = var2[0];
        this.ea = var2[0];
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

    private static  boolean a(NPC nPC, int n2, NPC nPC2) {
        int n3;
        if (aJ.var4(nPC2.getId(), nPC.getId()) && aJ.var6(nPC2.getWorldLocation().getX(), nPC.getWorldLocation().getX()) && aJ.var7(nPC2.getWorldArea().getX() + nPC2.getWorldArea().getWidth(), nPC.getWorldLocation().getX()) && aJ.var8(nPC2.getWorldArea().getX(), n2)) {
            n3 = var2[1];
            0;
            if (2 <= 1) {
                return ((0x28 ^ 0x6F) & ~(0x1F ^ 0x58)) != 0;
            }
        } else {
            n3 = var2[0];
        }
        return n3 != 0;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void b(StatChanged statChanged) {
        if (aJ.var10(this.dW)) {
            this.dU.add(this.dW);
            0;
        }
    }

    static {
        aJ.var11();
        aJ.var12();
        dR = var2[14];
        dT = var2[13];
        Point[] pointArray = new Point[var2[15]];
        pointArray[aJ.var2[0]] = new Point(var2[16], var2[17]);
        pointArray[aJ.var2[1]] = new Point(var2[18], var2[17]);
        pointArray[aJ.var2[3]] = new Point(var2[17], var2[19]);
        pointArray[aJ.var2[4]] = new Point(var2[17], var2[17]);
        pointArray[aJ.var2[2]] = new Point(var2[17], var2[18]);
        pointArray[aJ.var2[10]] = new Point(var2[20], var2[7]);
        pointArray[aJ.var2[11]] = new Point(var2[20], var2[8]);
        dQ = pointArray;
        int[] nArray = new int[var2[3]];
        nArray[aJ.var2[0]] = var2[21];
        nArray[aJ.var2[1]] = var2[14];
        dS = nArray;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private void bE() {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[3]]));
        if (aJ.var19(item2)) {
            return;
        }
        int var20 = BoostingPotion.RANGING_POTION.getBoostAmount(Skill.RANGED);
        if (aJ.var21(Skills.getBoostedLevel((SkiSkill.RANGED), Skills.getLevel((SkiSkill.RANGED) + var20 - var2[4])) {
            return;
        }
        item2.interact(var1[var2[1]]);
    }

    private static boolean var8(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var22(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var23(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var11() {
        var2 = new int[22];
        aJ.var2[0] = (0xD8 ^ 0xA1 ^ (8 ^ 0x7D)) & (0x40 ^ 0x33 ^ 69 + 11 - -11 + 36 ^ -1);
        aJ.var2[1] = 1;
        aJ.var2[2] = 0x55 ^ 0x51;
        aJ.var2[3] = 2;
        aJ.var2[4] = 3;
        aJ.var2[5] = 0xFFFFBF56 & 0x6EAD;
        aJ.var2[6] = 0x2D ^ 0x3B;
        aJ.var2[7] = 0x62 ^ 0x55 ^ (0x4E ^ 0x64);
        aJ.var2[8] = 0x3E ^ 0x1D;
        aJ.var2[9] = 235 + 140 - 147 + 17;
        aJ.var2[10] = 136 + 73 - 186 + 119 ^ 39 + 12 - -82 + 6;
        aJ.var2[11] = 0xCB ^ 0x9E ^ (0xFD ^ 0xAE);
        aJ.var2[12] = 0x17 ^ 0x1F;
        aJ.var2[13] = 0xFFFFF69D & 0x2F77;
        aJ.var2[14] = -(0xFFFFEDBF & 0x53C9) & (0xFFFFFFDF & 0x6FAF);
        aJ.var2[15] = 0x70 ^ 0x77;
        aJ.var2[16] = 0x3E ^ 0x22;
        aJ.var2[17] = 0xC4 ^ 0x8B ^ (3 ^ 0x6C);
        aJ.var2[18] = 137 + 54 - 43 + 2 ^ 101 + 40 - 108 + 103;
        aJ.var2[19] = 0x2B ^ 0xF ^ (0x7D ^ 0x7B);
        aJ.var2[20] = 0xB1 ^ 0x99;
        aJ.var2[21] = 0xFFFFBE06 & 0x6FFF;
    }

    @Override
    public boolean bq() {
        return var2[1];
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static int var25(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var8_12;
        void var32;
        aJ var33;
        NPC nPC2 = this.bB();
        if (aJ.var19(nPC2)) {
            this.r();
            return var2[0];
        }
        var33.bE();
        if (aJ.var5(var33.ea)) {
            var33.ea -= var2[1];
            if (!aJ.var10(var33.dW) || aJ.var7(var33.dW.distanceTo((Locatable)Players.getLocal()), var2[2])) {
                return var2[1];
            }
        }
        if (aJ.var4(var33.dZ, var2[3]) && !aJ.var6(var33.bA(), var2[4]) || aJ.var4(var33.dZ, var2[1]) && aJ.var4(var33.bA(), var2[3])) {
            var33.dX = var2[1];
        }
        WorldPoint var34 = Players.getLocal().getWorldLocation();
        var33.dZ = var33.bA();
        if (aJ.var24(var33.dX) && aJ.var6(var32.getId(), var2[5])) {
            if (aJ.var9(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint var35 = var33.a(new Point(var2[6], var2[7]));
            WorldPoint var36 = var33.a(new Point(var2[6], var2[8]));
            WorldPoint var37 = Players.getLocal().getWorldLocation();
            if (aJ.var5(aJ.var25(var35.distanceTo2DHypotenuse(var37), var36.distanceTo2DHypotenuse(var37)))) {
                var35 = var36;
            }
            Movement.setDestination((WorldPoint)var35);
            return var2[1];
        }
        if (aJ.var4(Players.getLocal().getGraphic(), var2[9])) {
            var33.dX = var2[1];
        }
        if (aJ.var9(var33.dX)) {
            return var2[0];
        }
        if (aJ.var23(var32.getWorldArea().getX(), var34.getWorldX()) && aJ.var24(var33.cW.redX() ? 1 : 0)) {
            if (aJ.var8(var33.a(dQ[var2[10]]).getWorldX(), var34.getWorldX())) {
                Movement.setDestination((WorldPoint)var34.dx(var2[1]));
                return var2[1];
            }
            var33.dX = var2[0];
            return var2[0];
        }
        var33.bp();
        if (aJ.var9(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        List<NPC> var35 = var33.bD();
        WorldPoint var36 = var33.a(dQ[var2[0]]);
        if (aJ.var21(var36.getWorldX(), var34.getWorldX())) {
            Movement.setDestination((WorldPoint)var36);
            return var2[1];
        }
        List<WorldPoint> var37 = List.of(var33.a(dQ[var2[4]]), var33.a(dQ[var2[3]]), var33.a(dQ[var2[2]]));
        List<WorldPoint> var38 = List.of(var33.a(dQ[var2[10]]), var33.a(dQ[var2[11]]));
        int var39 = NPCs.getAll((int[])dS).size();
        if (aJ.var24(var35.isEmpty() ? 1 : 0)) {
            WorldPoint var40 = var33.a(dQ[var2[1]]);
            if (!aJ.var6(var39, var2[12]) || aJ.var10(var33.dW) && aJ.var24(var33.dW.getWorldArea().contains(var34) ? 1 : 0) && aJ.var21(var39, var2[10])) {
                var40 = var38.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var34))).orElse(null);
            }
            if (aJ.var21(var40.getWorldX(), var34.getWorldX())) {
                Movement.setDestination((WorldPoint)var40);
            }
            return var2[1];
        }
        NPC var40 = var35.stream().filter(nPC -> {
            int n2;
            if (aJ.var4(nPC.getId(), var2[14]) && aJ.var9(nPC.isDead() ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (3 <= ((25 + 141 - 78 + 64 ^ 80 + 58 - 81 + 85) & (0x8E ^ 0x82 ^ (0xD9 ^ 0xC3) ^ -1))) {
                    return ((0x9E ^ 0x91 ^ (0x47 ^ 0x1E)) & (132 + 46 - 26 + 64 ^ 4 + 16 - -29 + 93 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.var9(this.dV.contains(nPC) ? 1 : 0)) {
                bl2 = var2[1];
                0;
                if (((0xB ^ 0x54) & ~(0x7B ^ 0x24)) != 0) {
                    return (1 & ~1) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).filter(nPC -> {
            boolean bl2;
            if (aJ.var3(nPC, this.dW)) {
                bl2 = var2[1];
                0;
                if ((0x24 ^ 0x20) == 0) {
                    return ((0xF3 ^ 0xBA) & ~(0x13 ^ 0x5A)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).findFirst().orElse(null);
        if (aJ.var19(var40)) {
            WorldPoint var41 = var33.a(dQ[var2[4]]);
            WorldPoint var42 = var33.a(dQ[var2[3]]);
            WorldPoint var43 = var33.a(dQ[var2[2]]);
            if (aJ.var19(var33.dW)) {
                return var2[0];
            }
            WorldArea var44 = var33.dW.getWorldArea();
            WorldPoint[] worldPointArray = new WorldPoint[var2[4]];
            worldPointArray[aJ.var2[0]] = var41;
            worldPointArray[aJ.var2[1]] = var42;
            worldPointArray[aJ.var2[3]] = var43;
            WorldPoint var45 = Stream.of(worldPointArray).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(var44.getCenter()))).orElse(null);
            if (aJ.var24(var37.stream().allMatch(worldPoint2 -> {
                boolean bl2;
                if (aJ.var23(worldPoint2.getWorldX(), var34.getWorldX())) {
                    bl2 = var2[1];
                    0;
                    if (-1 > 1) {
                        return ((0x7A ^ 0x12 ^ (0x87 ^ 0xB4)) & (101 + 183 - 250 + 206 ^ 140 + 97 - 110 + 44 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var2[0];
                }
                return bl2;
            }) ? 1 : 0)) {
                if (aJ.var24(var37.contains(var34) ? 1 : 0)) {
                    var45 = var34.dx(var2[1]);
                    0;
                    if (-1 > -1) {
                        return ((0x60 ^ 0x41) & ~(1 ^ 0x20)) != 0;
                    }
                } else if (aJ.var24(var44.contains(var34) ? 1 : 0) && aJ.var21(var39, var2[10])) {
                    var45 = var38.stream().min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var34))).orElse(null);
                    0;
                    if ((123 + 116 - 104 + 30 ^ 145 + 104 - 148 + 60) <= 0) {
                        return ((0x1F ^ 0x74 ^ (0xD5 ^ 0x97)) & (57 + 125 - 52 + 25 ^ 119 + 23 - -20 + 16 ^ -1)) != 0;
                    }
                } else if (aJ.var21(Math.abs(var44.getCenter().getWorldY() - var34.getWorldY()), var2[1])) {
                    var45 = new WorldPoint(var34.getWorldX() + var2[3], var44.getCenter().getWorldY(), var33.cu.getPlane());
                    0;
                    if null != null {
                        return ((76 + 111 - 108 + 49 ^ 60 + 85 - 47 + 59) & (81 + 49 - 100 + 110 ^ 140 + 49 - 45 + 1 ^ -1)) != 0;
                    }
                } else {
                    if (aJ.var23(var39, var2[10])) {
                        return var2[1];
                    }
                    var45 = var44.getCenter();
                }
            }
            Movement.setDestination((WorldPoint)var45);
            return var2[1];
        }
        var40.interact(var1[var2[0]]);
        if (aJ.var24(Equipment.contains(item -> item.getName().contains(var1[var2[4]])) ? 1 : 0)) {
            var33.ea = var2[1];
        }
        this.dW = var8_12;
        return var2[1];
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBoulderAttackStyle();
    }

    private static void var12() {
        var1 = new String[var2[2]];
        aJ.var1[aJ.var2[0]] = "Attack";
        aJ.var1[aJ.var2[1]] = "Drink";
        aJ.var1[aJ.var2[3]] = "ranging";
        aJ.var1[aJ.var2[4]] = "faerdhinen";
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (aJ.var22(animationChanged.getActor(), this.bB()) && aJ.var4(animationChanged.getActor().getAnimation(), var2[13])) {
            this.dY = Static.getClient().getTickCount();
        }
    }

    @Inject
    protected DoingBoulderDashTask(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.dU = new HashSet<NPC>();
        this.dV = new HashSet<NPC>();
        this.dX = var2[0];
        this.dZ = var2[0];
        this.ea = var2[0];
        this.aY = squireAutoTOA;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> bD() {
        int n2;
        List list = NPCs.getAll((int[])dS);
        int n3 = n2 = Players.getLocal().getWorldX();
        Iterator var46 = list.iterator();
        while (aJ.var24(var46.hasNext() ? 1 : 0)) {
            void var47;
            NPC var48 = (NPC)var46.next();
            if (aJ.var8(var48.getWorldLocation().getX(), (int)var47) && aJ.var24(NPCs.getAll(arg_0 -> aJ.a(var48, (int)var47, arg_0)).isEmpty() ? 1 : 0)) {
                int var49 = var48.getWorldLocation().getX();
                0;
                if (((0x15 ^ 0x4A ^ (0x1E ^ 0x70)) & (2 ^ 0x38 ^ (0x5D ^ 0x56) ^ -1)) == 0) break;
                return null;
            }
            0;
            if ((21 + 187 - 25 + 6 ^ 128 + 112 - 74 + 18) != 0) continue;
            return null;
        }
        int n4 = n3;
        return list.stream().filter(nPC -> {
            boolean bl2;
            if (aJ.var4(nPC.getWorldLocation().getX(), n4)) {
                bl2 = var2[1];
                0;
                if (-3 > 0) {
                    return ((0xC2 ^ 0x94 ^ (0x14 ^ 0x7A)) & (0x17 ^ 0xE ^ (0x40 ^ 0x61) ^ -1)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).collect(Collectors.toList());
    }

    private static String var50(String var51, String var52) {
        var51 = new String(Base64.getDecoder().decode(var51.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var53 = new StringBuilder();
        char[] var54 = var52.toCharArray();
        int var55 = var2[0];
        char[] var56 = var51.toCharArray();
        int var57 = var56.length;
        int var58 = var2[0];
        while (aJ.var7(var58, var57)) {
            char var59 = var56[var58];
            var53.append((char)(var59 ^ var54[var55 % var54.length]));
            0;
            ++var55;
            ++var58;
            0;
            if ((0x3B ^ 0x3F) >= 1) continue;
            return null;
        }
        return String.valueOf(var53);
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }
}

