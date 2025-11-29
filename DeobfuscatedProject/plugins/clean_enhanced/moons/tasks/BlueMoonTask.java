/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
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
import net.unethicalite.client.Static;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Blue moon")
public class BlueMoonTask
extends Task {
     WorldArea E;
     WorldArea G;
     WorldArea F;
    private final  SquireMoonsOfPerilConfig z;
     WorldArea C;
     WorldArea D;
     WorldArea I;
    private  int A;
     WorldArea H;
    
     WorldArea q;
     WorldArea B;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[4];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[4];
        while (c.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var2 = new String[var1[52]];
        c.var2[c.var1[4]] = "Cooked bream";
        c.var2[c.var1[21]] = "Cooked bream";
        c.var2[c.var1[22]] = "Eat";
        c.var2[c.var1[23]] = "Cooked bream";
        c.var2[c.var1[24]] = "Out of food & low HP!!";
        c.var2[c.var1[25]] = "Quick-escape";
        c.var2[c.var1[26]] = "Move to safe spot";
        c.var2[c.var1[28]] = "Attacking";
        c.var2[c.var1[29]] = "Drink";
        c.var2[c.var1[30]] = "Attack";
        c.var2[c.var1[31]] = "Lighting brazier";
        c.var2[c.var1[32]] = "Light";
        c.var2[c.var1[35]] = "Lit, going to middle";
        c.var2[c.var1[38]] = "Avoiding ice";
        c.var2[c.var1[39]] = "Attacking frozen wep";
        c.var2[c.var1[40]] = "Attack";
        c.var2[c.var1[41]] = "Avoiding ice";
        c.var2[c.var1[42]] = "Brazier";
        c.var2[c.var1[43]] = "Light";
        c.var2[c.var1[44]] = "Moonlight potion";
        c.var2[c.var1[45]] = "Moonlight potion";
        c.var2[c.var1[47]] = "Stairs";
        c.var2[c.var1[48]] = "Quick-escape";
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static  boolean b(Set set, WorldPoint worldPoint) {
        int n;
        if (c.var16(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.var17(set.contains(worldPoint) ? 1 : 0)) {
            n = var1[21];
            0;
            if null != null {
                return ((0xC ^ 0x68 ^ (7 ^ 0x7B)) & (82 + 30 - 54 + 76 ^ 45 + 149 - 167 + 131 ^ -1)) != 0;
            }
        } else {
            n = var1[4];
        }
        return n != 0;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n, int n2) {
        return n > n2;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    @Inject
    public BlueMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.B = new WorldArea(new WorldPoint(var1[5], var1[6], var1[4]), new WorldPoint(var1[7], var1[8], var1[4]));
        this.C = new WorldArea(new WorldPoint(var1[9], var1[10], var1[4]), new WorldPoint(var1[11], var1[12], var1[4]));
        this.D = new WorldArea(new WorldPoint(var1[9], var1[13], var1[4]), new WorldPoint(var1[11], var1[14], var1[4]));
        this.E = new WorldArea(new WorldPoint(var1[5], var1[15], var1[4]), new WorldPoint(var1[7], var1[16], var1[4]));
        this.F = new WorldArea(new WorldPoint(var1[17], var1[15], var1[4]), new WorldPoint(var1[18], var1[16], var1[4]));
        this.G = new WorldArea(new WorldPoint(var1[19], var1[13], var1[4]), new WorldPoint(var1[20], var1[14], var1[4]));
        this.H = new WorldArea(new WorldPoint(var1[19], var1[10], var1[4]), new WorldPoint(var1[20], var1[12], var1[4]));
        this.I = new WorldArea(new WorldPoint(var1[17], var1[6], var1[4]), new WorldPoint(var1[18], var1[8], var1[4]));
        this.z = squireMoonsOfPerilConfig;
    }

    private static int var31(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean var32(int n, int n2) {
        return n == n2;
    }

    private static boolean var33(int n) {
        return n < 0;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.z.blueMoonGear().selected(EquipmentSetup.class);
    }

    static {
        c.var34();
        c.var14();
    }

    public boolean run() {
        List lllllllllllllllIIIlllllIlIlIIlll2;
        Collection<Object> var35;
        Object var36;
        NPC var37;
        c var38;
        if (c.var17(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var1[4];
        }
        if (c.var17(var38.b().isFullyEquipped() ? 1 : 0)) {
            if (c.var16(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var1[21]];
                stringArray[c.var1[4]] = var2[var1[4]];
                if (c.var16(Inventory.contains((String[])stringArray) ? 1 : 0) && c.var39(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && c.var40(var38.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[var1[21]];
                    stringArray2[c.var1[4]] = var2[var1[21]];
                    Inventory.getFirst((String[])stringArray2).interact(var2[var1[22]]);
                }
            }
            var38.b().swap();
        }
        NPC var41 = NPCs.getNearest(nPC -> {
            int n;
            if (c.var32(nPC.getId(), var1[51]) && c.var16(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[21];
                0;
                if (-(0x6D ^ 0x47 ^ (0x9A ^ 0xB4)) >= 0) {
                    return ((0x82 ^ 0x84 ^ (0x75 ^ 0x61)) & (136 + 56 - 94 + 65 ^ 78 + 28 - 14 + 85 ^ -1)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        });
        NPC var42 = NPCs.getNearest(nPC -> {
            int n;
            if (c.var32(nPC.getId(), var1[49]) && c.var32(nPC.getAnimation(), var1[50])) {
                n = var1[21];
                0;
                if (2 <= 1) {
                    return ((0x5E ^ 0x76 ^ (0x11 ^ 9)) & (0x90 ^ 0xBF ^ (0x84 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        });
        String[] stringArray = new String[var1[21]];
        stringArray[c.var1[4]] = var2[var1[23]];
        if (c.var17(Inventory.contains((String[])stringArray) ? 1 : 0) && c.var15(var41) && c.var15(var42) && c.var33(c.var31(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = var2[var1[24]];
            var37 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.var16(tileObject.getName().contains(var2[var1[47]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[21]];
                    stringArray[c.var1[4]] = var2[var1[48]];
                    if (c.var16(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = var1[21];
                        0;
                        if null == null return n != 0;
                        return ((0x83 ^ 0xB3) & ~(0x16 ^ 0x26)) != 0;
                    }
                }
                n = var1[4];
                return n != 0;
            });
            if (c.var39(var37)) {
                var37.interact(var2[var1[25]]);
                return var1[4];
            }
        }
        if (c.var39(var37 = NPCs.getNearest(nPC -> {
            int n;
            if (c.var32(nPC.getId(), var1[46]) && c.var16(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[21];
                0;
                if (2 == 1) {
                    return ((0xCC ^ 0xC1 ^ (0x99 ^ 0x9F)) & (0xC5 ^ 0x80 ^ (0x8B ^ 0xC5) ^ -1)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        }))) {
            var36 = var38.d(var37.getWorldLocation());
            if (c.var17(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = var2[var1[26]];
                Movement.setDestination((WorldPoint)var37.getWorldLocation());
                return var1[4];
            }
            if (c.var16(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[var1[21]];
                nArray[c.var1[4]] = var1[27];
                var35 = NPCs.getNearest((int[])nArray);
                if (c.var39(var35)) {
                    SquireMoonsOfPeril.g = var2[var1[28]];
                    if (c.var16(l.l() ? 1 : 0) && c.var16(Inventory.contains(item -> item.getName().contains(var2[var1[45]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(var2[var1[44]])).interact(var2[var1[29]]);
                        return var1[4];
                    }
                    var35.interact(var2[var1[30]]);
                    return var1[21];
                }
            }
        }
        if (c.var39(var41)) {
            if (c.var17(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return var1[21];
            }
            var36 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.var16(tileObject.getName().contains(var2[var1[42]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[21]];
                    stringArray[c.var1[4]] = var2[var1[43]];
                    if (c.var16(tileObject.hasAction(stringArray) ? 1 : 0) && c.var16(this.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n = var1[21];
                        0;
                        if (((0xA6 ^ 0xBF) & ~(0x5E ^ 0x47)) < 2) return n != 0;
                        return ((0x6F ^ 0x57) & ~(0x34 ^ 0xC)) != 0;
                    }
                }
                n = var1[4];
                return n != 0;
            });
            if (c.var39(var36)) {
                SquireMoonsOfPeril.g = var2[var1[31]];
                var36.interact(var2[var1[32]]);
                return var1[21];
            }
            if (c.var15(var36)) {
                var35 = new WorldPoint(var1[33], var1[34], var1[4]);
                if (c.var24(Players.getLocal().getWorldLocation().distanceTo(var35), var1[24])) {
                    WorldArea lllllllllllllllIIIlllllIlIlIIlll2 = new WorldArea(var1[5], var1[6], var1[24], var1[23], var1[4]);
                    SquireMoonsOfPeril.g = var2[var1[35]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2.getRandom());
                    return var1[21];
                }
            }
        }
        if (c.var39(var42)) {
            var36 = var38.BlueMoonTask(var1[36]);
            var35 = var38.BlueMoonTask(var1[37]);
            lllllllllllllllIIIlllllIlIlIIlll2 = Players.getLocal().getWorldLocation().createWorldArea(var1[26]).toWorldPointList();
            WorldPoint var43 = lllllllllllllllIIIlllllIlIlIIlll2.stream().filter(arg_0 -> c.BlueMoonTask((Set)var36, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.var17(var36.isEmpty() ? 1 : 0) && c.var39(var43)) {
                if (c.var12(var38.A, var1[22])) {
                    var38.A += var1[21];
                    Time.sleepTicks((int)var1[21]);
                    0;
                    Time.sleep((long)300L);
                    0;
                }
                if (c.var44(var38.A, var1[22])) {
                    SquireMoonsOfPeril.g = var2[var1[38]];
                    Movement.setDestination((WorldPoint)var43);
                    var38.A = var1[4];
                    return var1[4];
                }
            }
            if (!c.var17(var36.isEmpty() ? 1 : 0) || c.var16(var35.isEmpty() ? 1 : 0)) {
                var38.A = var1[4];
                SquireMoonsOfPeril.g = var2[var1[39]];
                var42.interact(var2[var1[40]]);
                return var1[21];
            }
        }
        if (c.var15(var42)) {
            var36 = var38.BlueMoonTask(var1[36]);
            var35 = Players.getLocal().getWorldLocation().createWorldArea(var1[26]).toWorldPointList();
            lllllllllllllllIIIlllllIlIlIIlll2 = var35.stream().filter(arg_0 -> c.b((Set)var36, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.var17(var36.isEmpty() ? 1 : 0) && c.var39(lllllllllllllllIIIlllllIlIlIIlll2)) {
                SquireMoonsOfPeril.g = var2[var1[41]];
                Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2);
                var38.A = var1[4];
                return var1[4];
            }
        }
        return var1[21];
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var45;
        WorldArea[] worldAreaArray = new WorldArea[var1[29]];
        worldAreaArray[c.var1[4]] = this.B;
        worldAreaArray[c.var1[21]] = this.C;
        worldAreaArray[c.var1[22]] = this.D;
        worldAreaArray[c.var1[23]] = this.E;
        worldAreaArray[c.var1[24]] = this.F;
        worldAreaArray[c.var1[25]] = this.G;
        worldAreaArray[c.var1[26]] = this.H;
        worldAreaArray[c.var1[28]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var46 = var1[4];
        while (c.var12(var46, var45.size())) {
            void var47;
            if (c.var16(((WorldArea)var45.get(var46)).contains((WorldPoint)var47) ? 1 : 0)) {
                WorldArea var48 = (WorldArea)var45.get(var46);
                0;
                if (-(0x94 ^ 0x90) < 0) break;
                return null;
            }
            ++var46;
            0;
            if (-(0x82 ^ 0x86) <= 0) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean var39(Object object) {
        return object != null;
    }

    private static boolean var12(int n, int n2) {
        return n < n2;
    }

    private static boolean var17(int n) {
        return n == 0;
    }

    private static  boolean BlueMoonTask(Set set, WorldPoint worldPoint) {
        int n;
        if (c.var16(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.var17(set.contains(worldPoint) ? 1 : 0)) {
            n = var1[21];
            0;
            if (((0xD ^ 0x38) & ~(0xAF ^ 0x9A)) > (0xB8 ^ 0xBC)) {
                return ((0x15 ^ 0x26) & ~(0x19 ^ 0x2A)) != 0;
            }
        } else {
            n = var1[4];
        }
        return n != 0;
    }

    private static boolean var16(int n) {
        return n != 0;
    }

    private static boolean var40(int n) {
        return n <= 0;
    }

    private static void var34() {
        var1 = new int[53];
        c.var1[0] = 0xFFFFE5CF & 0x1FBB;
        c.var1[1] = -(0xFFFFFA6B & 0x4FD5) & (0xFFFFEFFF & Short.MAX_VALUE);
        c.var1[2] = 27 + 66 - 77 + 119 ^ 46 + 63 - -61 + 4;
        c.var1[3] = 0x72 ^ 0x57;
        c.var1[4] = (0x81 ^ 0xA2) & ~(0x59 ^ 0x7A);
        c.var1[5] = -(0xFFFFFD2A & 0x3AF7) & (0xFFFFBFFF & 0x7DBF);
        c.var1[6] = 0xFFFFE7EE & 0x3DDD;
        c.var1[7] = -(0xFFFFA7FD & 0x7A63) & (0xFFFFAFFF & 0x77FF);
        c.var1[8] = -(0xFFFFFB77 & 0x4E89) & (0xFFFFFFED & 0x6FDF);
        c.var1[9] = 0xFFFFDFDE & 0x25BD;
        c.var1[10] = -(0xFFFF92EE & 0x7D13) & (0xFFFFF7EF & 0x3DDF);
        c.var1[11] = 0xFFFF859D & Short.MAX_VALUE;
        c.var1[12] = -(0xFFFFF857 & 0xFB9) & (0xFFFFADFF & 0x7FDF);
        c.var1[13] = -(0xFFFFFA6F & 0x5FB3) & (0xFFFFFFF7 & 0x7FFB);
        c.var1[14] = 0xFFFFF5D7 & 0x2FFA;
        c.var1[15] = -(0xFFFFFB39 & 0x44CF) & (0xFFFFF5DB & 0x6FFF);
        c.var1[16] = 0xFFFFB7FE & 0x6DD5;
        c.var1[17] = -(0xFFFFEECF & 0x733F) & (0xFFFFF7FF & 0x6FAF);
        c.var1[18] = 0xFFFFDFE6 & 0x25BB;
        c.var1[19] = 0xFFFFAFBB & 0x55E7;
        c.var1[20] = 0xFFFFC7F5 & 0x3DAE;
        c.var1[21] = 1;
        c.var1[22] = 2;
        c.var1[23] = 3;
        c.var1[24] = 0xB9 ^ 0xB0 ^ (0x6B ^ 0x66);
        c.var1[25] = 0x73 ^ 0x76;
        c.var1[26] = 0x92 ^ 0x94;
        c.var1[27] = 0xFFFFF2F5 & 0x3FDF;
        c.var1[28] = 0xA0 ^ 0xA7;
        c.var1[29] = 0x2D ^ 0x25;
        c.var1[30] = 0x6F ^ 0x40 ^ (0x1C ^ 0x3A);
        c.var1[31] = 0x39 ^ 0x33;
        c.var1[32] = 0x56 ^ 0x5D;
        c.var1[33] = 0xFFFFF5AF & 0xFF0;
        c.var1[34] = 0xFFFFEFCF & 0x35FB;
        c.var1[35] = 70 + 125 - 159 + 107 ^ 50 + 101 - 47 + 27;
        c.var1[36] = 0xFFFF8BFB & 0x7ED7;
        c.var1[37] = 0xFFFFAFD6 & 0x5AFB;
        c.var1[38] = 0x16 ^ 0x1B;
        c.var1[39] = 0xC0 ^ 0x81 ^ (0xDE ^ 0x91);
        c.var1[40] = 0xB0 ^ 0xBF;
        c.var1[41] = 0xEA ^ 0x97 ^ (0xE9 ^ 0x84);
        c.var1[42] = 123 + 5 - 122 + 146 ^ 49 + 68 - 64 + 84;
        c.var1[43] = 0x20 ^ 0x32;
        c.var1[44] = 0x2D ^ 0x3E;
        c.var1[45] = 0x77 ^ 0x63;
        c.var1[46] = -(0xFFFFD7F9 & 0x6D2F) & (0xFFFFF7FF & Short.MAX_VALUE);
        c.var1[47] = 43 + 2 - -76 + 56 ^ 154 + 50 - 138 + 98;
        c.var1[48] = 0x32 ^ 0x24;
        c.var1[49] = -(0xFFFFE55D & 0x1FBB) & (0xFFFFFFFD & 0x37FB);
        c.var1[50] = -(0xFFFFD2DB & 0x7DE5) & (0xFFFFFFFF & 0x7BD7);
        c.var1[51] = -(0xFFFFBD3F & 0x4FDD) & (0xFFFFFFFF & 0x3FFF);
        c.var1[52] = 155 + 93 - 204 + 137 ^ 9 + 98 - -46 + 9;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }

    private Set<WorldPoint> BlueMoonTask(int n) {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
            if (c.var32(graphicsObject.getId(), n)) {
                hashSet.add(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)graphicsObject.getLocation()));
                0;
            }
        });
        return hashSet;
    }

    private static boolean var44(int n, int n2) {
        return n >= n2;
    }
}

