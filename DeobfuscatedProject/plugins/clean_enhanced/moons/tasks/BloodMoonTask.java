/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Animation
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.scene.Tiles
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Blood moon")
public class BloodMoonTask
extends Task {
     List<WorldPoint> v;
     List<WorldPoint> s;
    private  long p;
     List<WorldPoint> y;
     List<WorldPoint> u;
    
     List<WorldPoint> w;
     WorldArea q;
     List<WorldPoint> r;
    
     List<WorldPoint> t;
     List<WorldPoint> x;
    private final  SquireMoonsOfPerilConfig o;

    @Inject
    public BloodMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        WorldPoint[] worldPointArray = new WorldPoint[var1[5]];
        worldPointArray[b.var1[4]] = new WorldPoint(var1[6], var1[7], var1[4]);
        worldPointArray[b.var1[8]] = new WorldPoint(var1[9], var1[10], var1[4]);
        worldPointArray[b.var1[11]] = new WorldPoint(var1[6], var1[10], var1[4]);
        worldPointArray[b.var1[12]] = new WorldPoint(var1[9], var1[7], var1[4]);
        this.r = Arrays.asList(worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[var1[5]];
        worldPointArray2[b.var1[4]] = new WorldPoint(var1[13], var1[14], var1[4]);
        worldPointArray2[b.var1[8]] = new WorldPoint(var1[15], var1[16], var1[4]);
        worldPointArray2[b.var1[11]] = new WorldPoint(var1[13], var1[16], var1[4]);
        worldPointArray2[b.var1[12]] = new WorldPoint(var1[15], var1[14], var1[4]);
        this.s = Arrays.asList(worldPointArray2);
        WorldPoint[] worldPointArray3 = new WorldPoint[var1[5]];
        worldPointArray3[b.var1[4]] = new WorldPoint(var1[17], var1[14], var1[4]);
        worldPointArray3[b.var1[8]] = new WorldPoint(var1[18], var1[16], var1[4]);
        worldPointArray3[b.var1[11]] = new WorldPoint(var1[17], var1[16], var1[4]);
        worldPointArray3[b.var1[12]] = new WorldPoint(var1[18], var1[14], var1[4]);
        this.t = Arrays.asList(worldPointArray3);
        WorldPoint[] worldPointArray4 = new WorldPoint[var1[5]];
        worldPointArray4[b.var1[4]] = new WorldPoint(var1[19], var1[7], var1[4]);
        worldPointArray4[b.var1[8]] = new WorldPoint(var1[20], var1[10], var1[4]);
        worldPointArray4[b.var1[11]] = new WorldPoint(var1[19], var1[10], var1[4]);
        worldPointArray4[b.var1[12]] = new WorldPoint(var1[20], var1[7], var1[4]);
        this.u = Arrays.asList(worldPointArray4);
        WorldPoint[] worldPointArray5 = new WorldPoint[var1[5]];
        worldPointArray5[b.var1[4]] = new WorldPoint(var1[19], var1[21], var1[4]);
        worldPointArray5[b.var1[8]] = new WorldPoint(var1[20], var1[22], var1[4]);
        worldPointArray5[b.var1[11]] = new WorldPoint(var1[19], var1[22], var1[4]);
        worldPointArray5[b.var1[12]] = new WorldPoint(var1[20], var1[21], var1[4]);
        this.v = Arrays.asList(worldPointArray5);
        WorldPoint[] worldPointArray6 = new WorldPoint[var1[5]];
        worldPointArray6[b.var1[4]] = new WorldPoint(var1[17], var1[23], var1[4]);
        worldPointArray6[b.var1[8]] = new WorldPoint(var1[18], var1[24], var1[4]);
        worldPointArray6[b.var1[11]] = new WorldPoint(var1[17], var1[24], var1[4]);
        worldPointArray6[b.var1[12]] = new WorldPoint(var1[18], var1[23], var1[4]);
        this.w = Arrays.asList(worldPointArray6);
        WorldPoint[] worldPointArray7 = new WorldPoint[var1[5]];
        worldPointArray7[b.var1[4]] = new WorldPoint(var1[13], var1[23], var1[4]);
        worldPointArray7[b.var1[8]] = new WorldPoint(var1[15], var1[24], var1[4]);
        worldPointArray7[b.var1[11]] = new WorldPoint(var1[13], var1[24], var1[4]);
        worldPointArray7[b.var1[12]] = new WorldPoint(var1[15], var1[23], var1[4]);
        this.x = Arrays.asList(worldPointArray7);
        WorldPoint[] worldPointArray8 = new WorldPoint[var1[5]];
        worldPointArray8[b.var1[4]] = new WorldPoint(var1[6], var1[21], var1[4]);
        worldPointArray8[b.var1[8]] = new WorldPoint(var1[9], var1[22], var1[4]);
        worldPointArray8[b.var1[11]] = new WorldPoint(var1[6], var1[22], var1[4]);
        worldPointArray8[b.var1[12]] = new WorldPoint(var1[9], var1[21], var1[4]);
        this.y = Arrays.asList(worldPointArray8);
        this.o = squireMoonsOfPerilConfig;
    }

    private static void var3() {
        var1 = new int[49];
        b.var1[0] = -(0xFFFFAEE1 & 0x7BBF) & (0xFFFFBFFF & 0x6FFB);
        b.var1[1] = 0xFFFFA5AA & 0x7FDF;
        b.var1[2] = 0x33 ^ 0x5F ^ (0x1D ^ 0x57);
        b.var1[3] = 0x12 ^ 4 ^ (0xAC ^ 0x96);
        b.var1[4] = (0xC3 ^ 0x8C ^ (0xBE ^ 0xB3)) & (83 + 131 - 97 + 121 ^ 47 + 44 - -41 + 40 ^ -1);
        b.var1[5] = 24 + 145 - 112 + 134 ^ 101 + 117 - 155 + 124;
        b.var1[6] = -(0xFFFFCD95 & 0x3AEB) & (0xFFFFBFFF & 0x4DF4);
        b.var1[7] = -(0xFFFFAF25 & 0x5ADB) & (0xFFFFFFBF & 0x2FDF);
        b.var1[8] = 1;
        b.var1[9] = 0xFFFFD7F3 & 0x2D7F;
        b.var1[10] = 0xFFFFEDFF & 0x379E;
        b.var1[11] = 2;
        b.var1[12] = 3;
        b.var1[13] = -(0xFFFFFE9E & 0x79E7) & (0xFFFFFDF7 & Short.MAX_VALUE);
        b.var1[14] = 0xFFFFE5BF & 0x3FDD;
        b.var1[15] = 0xFFFFFDFD & 0x773;
        b.var1[16] = -(0xFFFFBA7F & 0x5FC1) & (0xFFFFBFFF & 0x7FDC);
        b.var1[17] = 0xFFFFFDFF & 0x76F;
        b.var1[18] = 0xFFFFA7EF & 0x5D7E;
        b.var1[19] = -(0xFFFFDADD & 0x7F23) & (0xFFFFFFFD & 0x5F6F);
        b.var1[20] = 0xFFFFE7EE & 0x1D7D;
        b.var1[21] = -(0xFFFFDC5E & 0x6BFB) & (0xFFFFFDFB & 0x6FFF);
        b.var1[22] = -(0xFFFF96B7 & 0x6B4F) & (0xFFFFA7AF & 0x7FF7);
        b.var1[23] = 0xFFFFFFFE & 0x25A5;
        b.var1[24] = 0xFFFFEDAF & 0x37F3;
        b.var1[25] = 0xFFFFE776 & 0xDFEF;
        b.var1[26] = 0x42 ^ 0x30 ^ (0xB3 ^ 0xC4);
        b.var1[27] = 0xBA ^ 0xBC;
        b.var1[28] = -(0xFFFFCF6F & 0x7CB9) & (0xFFFFFFFB & 0x7EFF);
        b.var1[29] = 167 + 135 - 125 + 12 ^ 7 + 104 - 40 + 115;
        b.var1[30] = 0x35 ^ 0x17 ^ (0x7A ^ 0x50);
        b.var1[31] = 0xFFFFDF3E & 0x77F5;
        b.var1[32] = 0x1B ^ 0x12;
        b.var1[33] = 0x7C ^ 0x76;
        b.var1[34] = 0x86 ^ 0x8D;
        b.var1[35] = -(0xFFFFFDE7 & 0x4B19) & (0xFFFFFFDD & 0x7BFF);
        b.var1[36] = 0xFFFFAFFF & 0x7AD6;
        b.var1[37] = 126 + 126 - 121 + 6 ^ 33 + 33 - -23 + 44;
        b.var1[38] = 0x1B ^ 0x16;
        b.var1[39] = 0xAC ^ 0xA2;
        b.var1[40] = 0x25 ^ 0x2A;
        b.var1[41] = -1;
        b.var1[42] = 0x1B ^ 0x1C ^ (0x34 ^ 0x2D);
        b.var1[43] = 0xF9 ^ 0x92 ^ (0x6C ^ 0x17);
        b.var1[44] = 0x9B ^ 0x8A;
        b.var1[45] = 0x56 ^ 0x44;
        b.var1[46] = 0xAB ^ 0xB8;
        b.var1[47] = 0xFFFFBBFF & 0x76D7;
        b.var1[48] = 119 + 58 - 43 + 24 ^ 94 + 5 - -37 + 2;
    }

    private static boolean var4(int n) {
        return n <= 0;
    }

    private static void var5() {
        var2 = new String[var1[48]];
        b.var2[b.var1[4]] = "Cooked bream";
        b.var2[b.var1[8]] = "Cooked bream";
        b.var2[b.var1[11]] = "Eat";
        b.var2[b.var1[12]] = "Cooked bream";
        b.var2[b.var1[5]] = "Out of food & low HP!!";
        b.var2[b.var1[26]] = "Quick-escape";
        b.var2[b.var1[27]] = "Move to safe spot";
        b.var2[b.var1[29]] = "Attacking";
        b.var2[b.var1[30]] = "Drink";
        b.var2[b.var1[32]] = "Attack";
        b.var2[b.var1[33]] = "Avoiding explosions";
        b.var2[b.var1[34]] = "Move to safe spot";
        b.var2[b.var1[37]] = "Avoiding cat attack";
        b.var2[b.var1[38]] = "halberd";
        b.var2[b.var1[39]] = "Attacking cat";
        b.var2[b.var1[40]] = "Attack";
        b.var2[b.var1[43]] = "Moonlight potion";
        b.var2[b.var1[44]] = "Moonlight potion";
        b.var2[b.var1[45]] = "Stairs";
        b.var2[b.var1[46]] = "Quick-escape";
    }

    private  boolean a(NPC nPC, Tile tile) {
        int n;
        if (b.var6(this.BloodMoonTask(tile.getWorldLocation()) ? 1 : 0) && b.var7(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), var1[8])) {
            n = var1[8];
            0;
            if (-(0x1B ^ 0x1E) >= 0) {
                return ((0x12 ^ 0x26) & ~(0x5E ^ 0x6A)) != 0;
            }
        } else {
            n = var1[4];
        }
        return n != 0;
    }

    private static boolean var7(int n, int n2) {
        return n <= n2;
    }

    private static int var8(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean var9(int n, int n2) {
        return n > n2;
    }

    private static  boolean a(Set set, WorldPoint worldPoint) {
        int n;
        if (b.var6(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && b.var10(set.contains(worldPoint) ? 1 : 0)) {
            n = var1[8];
            0;
            if null != null {
                return ((1 ^ (0x1B ^ 7)) & (58 + 167 - 164 + 128 ^ 75 + 70 - 33 + 48 ^ -1)) != 0;
            }
        } else {
            n = var1[4];
        }
        return n != 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n) {
        return n < 0;
    }

    private static boolean var13(int n) {
        return n >= 0;
    }

    private static boolean var14(int n, int n2) {
        return n == n2;
    }

    public boolean run() {
        WorldPoint var15;
        List var16;
        TileObject lllllllllllllllIIIllllIlllIlllII2;
        b var17;
        if (b.var10(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var1[4];
        }
        if (b.var10(var17.BloodMoonTask().isFullyEquipped() ? 1 : 0)) {
            if (b.var6(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var1[8]];
                stringArray[b.var1[4]] = var2[var1[4]];
                if (b.var6(Inventory.contains((String[])stringArray) ? 1 : 0) && b.var18(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && b.var4(var17.BloodMoonTask().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[var1[8]];
                    stringArray2[b.var1[4]] = var2[var1[8]];
                    Inventory.getFirst((String[])stringArray2).interact(var2[var1[11]]);
                }
            }
            var17.BloodMoonTask().swap();
        }
        NPC var19 = NPCs.getNearest(nPC -> {
            int n;
            if (b.var14(nPC.getId(), var1[35]) && b.var6(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[8];
                0;
                if null != null {
                    return ((0x1B ^ 0x12) & ~(0x86 ^ 0x8F)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        });
        NPC var20 = NPCs.getNearest(nPC -> {
            int n;
            if (b.var14(nPC.getId(), var1[47]) && b.var6(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[8];
                0;
                if (((0xE6 ^ 0xBD) & ~(0x3A ^ 0x61)) != 0) {
                    return ((0x4D ^ 0x69) & ~(0x26 ^ 2)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        });
        int[] nArray = new int[var1[8]];
        nArray[b.var1[4]] = var1[25];
        TileObject var21 = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[var1[8]];
        stringArray[b.var1[4]] = var2[var1[12]];
        if (b.var10(Inventory.contains((String[])stringArray) ? 1 : 0) && b.var11(var19) && b.var11(var21) && b.var12(b.var8(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = var2[var1[5]];
            lllllllllllllllIIIllllIlllIlllII2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (b.var6(tileObject.getName().contains(var2[var1[45]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[8]];
                    stringArray[b.var1[4]] = var2[var1[46]];
                    if (b.var6(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = var1[8];
                        0;
                        if (-1 < 0) return n != 0;
                        return ((0x3D ^ 0x1A) & ~(0xB7 ^ 0x90)) != 0;
                    }
                }
                n = var1[4];
                return n != 0;
            });
            if (b.var18(lllllllllllllllIIIllllIlllIlllII2)) {
                lllllllllllllllIIIllllIlllIlllII2.interact(var2[var1[26]]);
                return var1[4];
            }
        }
        if (b.var11(var19) && b.var18(var20)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var17.BloodMoonTask(var20.getWorldLocation()) ? 1 : 0;
            if (b.var10(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = var2[var1[27]];
                Movement.setDestination((WorldPoint)var20.getWorldLocation());
                return var1[4];
            }
            if (b.var6(lllllllllllllllIIIllllIlllIlllII2)) {
                int[] nArray2 = new int[var1[8]];
                nArray2[b.var1[4]] = var1[28];
                var16 = NPCs.getNearest((int[])nArray2);
                if (b.var18(var16)) {
                    SquireMoonsOfPeril.g = var2[var1[29]];
                    if (b.var6(l.l() ? 1 : 0) && b.var6(Inventory.contains(item -> item.getName().contains(var2[var1[44]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(var2[var1[43]])).interact(var2[var1[30]]);
                        return var1[4];
                    }
                    int[] nArray3 = new int[var1[8]];
                    nArray3[b.var1[4]] = var1[31];
                    if (b.var6(Equipment.contains((int[])nArray3) ? 1 : 0) && b.var22(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
                        return var1[4];
                    }
                    var16.interact(var2[var1[32]]);
                    return var1[8];
                }
            }
        }
        if (b.var11(var19) && b.var18(var21)) {
            lllllllllllllllIIIllllIlllIlllII2 = var17.c();
            var16 = Players.getLocal().getWorldLocation().createWorldArea(var1[27]).toWorldPointList();
            var15 = var16.stream().filter(arg_0 -> b.a((Set)lllllllllllllllIIIllllIlllIlllII2, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (b.var10(lllllllllllllllIIIllllIlllIlllII2.isEmpty() ? 1 : 0) && b.var18(var15)) {
                SquireMoonsOfPeril.g = var2[var1[33]];
                Movement.setDestination((WorldPoint)var15);
                return var1[4];
            }
        }
        if (b.var18(var19) && b.var18(var20)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var17.BloodMoonTask(var20.getWorldLocation()) ? 1 : 0;
            if (b.var10(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = var2[var1[34]];
                Movement.setDestination((WorldPoint)var20.getWorldLocation());
                return var1[4];
            }
            if (b.var6(lllllllllllllllIIIllllIlllIlllII2)) {
                Object var23;
                int[] nArray4 = new int[var1[8]];
                nArray4[b.var1[4]] = var1[35];
                var16 = NPCs.getNearest((int[])nArray4);
                int[] nArray5 = new int[var1[8]];
                nArray5[b.var1[4]] = var1[25];
                var15 = TileObjects.getNearest((int[])nArray5);
                if (b.var18(var15)) {
                    int var24 = b.a((TileObject)var15);
                    if (b.var14(var24, var1[36])) {
                        ++var17.p;
                    }
                    if (b.var13(b.var25(var17.p, 3L))) {
                        int[] nArray6 = new int[var1[8]];
                        nArray6[b.var1[4]] = var1[25];
                        var23 = TileObjects.getNearest((int[])nArray6);
                        if (b.var18(var23)) {
                            SquireMoonsOfPeril.g = var2[var1[37]];
                            Movement.setDestination((WorldPoint)var23.getWorldLocation());
                            Time.sleepTicks((int)var1[8]);
                            0;
                            var17.p = 0L;
                            return var1[8];
                        }
                    }
                }
                if (b.var18(var16)) {
                    List var24;
                    String[] stringArray3 = new String[var1[8]];
                    stringArray3[b.var1[4]] = var2[var1[38]];
                    if (b.var6(Equipment.contains((String[])stringArray3) ? 1 : 0) && b.var9(Players.getLocal().getWorldLocation().distanceTo(var16.getWorldLocation()), var1[8]) && b.var10((var23 = (var24 = Tiles.getAll().stream().filter(arg_0 -> b.BloodMoonTask((NPC)var16, arg_0)).collect(Collectors.toList())).stream().filter(arg_0 -> var17.a((NPC)var16, arg_0)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)((Tile)var23.get(var1[4])).getWorldLocation());
                        return var1[4];
                    }
                    SquireMoonsOfPeril.g = var2[var1[39]];
                    var16.interact(var2[var1[40]]);
                    return var1[8];
                }
            }
        }
        return var1[8];
    }

    public static int a(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (b.var18(gameObject) && b.var6(gameObject.getRenderable() instanceof DynamicObject) && b.var18(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return var1[41];
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public EquipmentSetup BloodMoonTask() {
        return (EquipmentSetup)this.o.bloodMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean var18(Object object) {
        return object != null;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static int var25(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean var6(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean BloodMoonTask(WorldPoint worldPoint) {
        List[] listArray = new List[var1[30]];
        listArray[b.var1[4]] = this.r;
        listArray[b.var1[8]] = this.s;
        listArray[b.var1[11]] = this.t;
        listArray[b.var1[12]] = this.u;
        listArray[b.var1[5]] = this.v;
        listArray[b.var1[26]] = this.w;
        listArray[b.var1[27]] = this.x;
        listArray[b.var1[29]] = this.y;
        Iterator<List> var38 = Arrays.asList(listArray).iterator();
        while (b.var6(var38.hasNext() ? 1 : 0)) {
            void var39;
            List var40 = var38.next();
            if (b.var6(var40.contains(var39) ? 1 : 0) && b.var6(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return var1[8];
            }
            0;
            
            return ((0xAB ^ 0x8A ^ (0xDA ^ 0xB6)) & (178 + 134 - 230 + 134 ^ 32 + 96 - 122 + 143 ^ -1)) != 0;
        }
        return var1[4];
    }

    private static  boolean BloodMoonTask(NPC nPC, Tile tile) {
        boolean bl;
        if (b.var41(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), var1[42])) {
            bl = var1[8];
            0;
            if (((0xA6 ^ 0xB0) & ~(6 ^ 0x10)) != 0) {
                return ((0x6A ^ 0x24) & ~(0x2F ^ 0x61)) != 0;
            }
        } else {
            bl = var1[4];
        }
        return bl;
    }

    private static String var42(String var43, String var44) {
        var43 = new String(Base64.getDecoder().decode(var43.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var45 = new StringBuilder();
        char[] var46 = var44.toCharArray();
        int var47 = var1[4];
        char[] var48 = var43.toCharArray();
        int var49 = var48.length;
        int var50 = var1[4];
        while (b.var41(var50, var49)) {
            char var51 = var48[var50];
            var45.append((char)(var51 ^ var46[var47 % var46.length]));
            0;
            ++var47;
            ++var50;
            0;
            if ((0xB5 ^ 0xA5 ^ (0x98 ^ 0x8C)) >= 0) continue;
            return null;
        }
        return String.valueOf(var45);
    }

    private Set<WorldPoint> c() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        int[] nArray = new int[var1[8]];
        nArray[b.var1[4]] = var1[25];
        List list = TileObjects.getAll((int[])nArray);
        list.forEach(tileObject -> {
            hashSet.add(tileObject.getWorldLocation());
            0;
        });
        return hashSet;
    }

    private static boolean var10(int n) {
        return n == 0;
    }

    static {
        b.var3();
        b.var5();
    }

    private static boolean var22(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var41(int n, int n2) {
        return n < n2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }
}

