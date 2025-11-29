/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Eclipse moon")
public class EclipseMoonTask
extends Task {
    
     WorldArea Q;
     WorldArea E;
     WorldArea G;
     WorldArea H;
    private static  Set<WorldPoint> P;
     WorldArea F;
     WorldArea C;
    private final  SquireMoonsOfPerilConfig O;
     WorldArea B;
    
     WorldArea D;
     WorldArea I;

    private static boolean var3(int n, int n2) {
        return n < n2;
    }

    static {
        g.var4();
        g.var5();
        P = new HashSet<WorldPoint>();
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public EclipseMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.Q = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.B = new WorldArea(new WorldPoint(var1[5], var1[6], var1[4]), new WorldPoint(var1[7], var1[8], var1[4]));
        this.C = new WorldArea(new WorldPoint(var1[9], var1[10], var1[4]), new WorldPoint(var1[11], var1[12], var1[4]));
        this.D = new WorldArea(new WorldPoint(var1[13], var1[10], var1[4]), new WorldPoint(var1[14], var1[12], var1[4]));
        this.E = new WorldArea(new WorldPoint(var1[15], var1[6], var1[4]), new WorldPoint(var1[16], var1[8], var1[4]));
        this.F = new WorldArea(new WorldPoint(var1[15], var1[17], var1[4]), new WorldPoint(var1[16], var1[18], var1[4]));
        this.G = new WorldArea(new WorldPoint(var1[13], var1[19], var1[4]), new WorldPoint(var1[14], var1[20], var1[4]));
        this.H = new WorldArea(new WorldPoint(var1[9], var1[19], var1[4]), new WorldPoint(var1[11], var1[20], var1[4]));
        this.I = new WorldArea(new WorldPoint(var1[5], var1[17], var1[4]), new WorldPoint(var1[7], var1[18], var1[4]));
        this.O = squireMoonsOfPerilConfig;
    }

    private static void var4() {
        var1 = new int[41];
        g.var1[0] = 0xFFFFBFFF & 0x45BF;
        g.var1[1] = -(0xD0 ^ 0xB2) & (0xFFFFF7EB & 0x2DFF);
        g.var1[2] = 0x66 ^ 0x44 ^ (0x7A ^ 0x7E);
        g.var1[3] = 53 + 16 - -65 + 22 ^ 163 + 175 - 251 + 89;
        g.var1[4] = (0x56 ^ 0x14 ^ (0x41 ^ 0x32)) & (0x12 ^ 0x72 ^ (0x1C ^ 0x4D) ^ -1);
        g.var1[5] = 0xFFFFA7DD & 0x5DEE;
        g.var1[6] = -(0xFFFFF11F & 0x4EFF) & (0xFFFFEDFF & 0x77BF);
        g.var1[7] = 0xFFFFB7CF & 0x4DFD;
        g.var1[8] = -(0xFFFFFAD5 & 0x557F) & (0xFFFFFDFF & 0x77F6);
        g.var1[9] = 0xFFFF9DDE & 0x67EF;
        g.var1[10] = -(0xFFFFF777 & 0x5ACD) & (0xFFFFFFF7 & 0x77EF);
        g.var1[11] = 0xFFFFEDFF & 0x17CF;
        g.var1[12] = -(0xFFFFC76C & 0x78DF) & (0xFFFFE5FF & 0x7FEF);
        g.var1[13] = -(0x93 ^ 0x94) & (0xFFFFCDFF & 0x37D7);
        g.var1[14] = 0xFFFFF7F3 & 0xDDE;
        g.var1[15] = 0xFFFFF7DB & 0xDF7;
        g.var1[16] = 0xFFFFD7DE & 0x2DF5;
        g.var1[17] = 0xFFFFBFFE & 0x659F;
        g.var1[18] = 0xFFFFE7BF & 0x3DDF;
        g.var1[19] = -(0xFFFFEA0F & 0x5FF2) & (0xFFFFFFBD & 0x6FDF);
        g.var1[20] = -(0xFFFFF7FB & 0x4A67) & (0xFFFFEFFF & 0x77FF);
        g.var1[21] = 1;
        g.var1[22] = 2;
        g.var1[23] = 3;
        g.var1[24] = -(0xFFFFCEE9 & 0x7D37) & (0xFFFFFEF5 & 0x7FFE);
        g.var1[25] = 131 + 101 - 193 + 145 ^ 0 + 95 - -15 + 78;
        g.var1[26] = 0xB3 ^ 0xB6;
        g.var1[27] = -(0xFFFFE7EB & 0x3897) & (0xFFFFFFFE & 0x77B7);
        g.var1[28] = 0x15 ^ 0x53 ^ (0xC7 ^ 0x87);
        g.var1[29] = 24 + 110 - 84 + 93 ^ 22 + 26 - 20 + 108;
        g.var1[30] = -1;
        g.var1[31] = 0xFFFFBDE7 & 0x67BD;
        g.var1[32] = 0xFFFFBFEF & 0x45DB;
        g.var1[33] = 0xFFFFBDFA & 0x47D5;
        g.var1[34] = 0xFFFFAFB3 & 0x75EC;
        g.var1[35] = 61 + 16 - -98 + 16 ^ 27 + 30 - 15 + 141;
        g.var1[36] = -(0xFFFFC932 & 0x77EF) & (0xFFFFFFFF & 0x73FD);
        g.var1[37] = 0xC6 ^ 0xAD ^ (0x19 ^ 0x7B);
        g.var1[38] = 0x22 ^ 0x28;
        g.var1[39] = 0xFFFFBEFF & 0x73D7;
        g.var1[40] = 0xA6 ^ 0xAD;
    }

    private static boolean var12(int n, int n2) {
        return n != n2;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[4];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[4];
        while (g.var3(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (1 <= 3) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var23;
        WorldArea[] worldAreaArray = new WorldArea[var1[35]];
        worldAreaArray[g.var1[4]] = this.B;
        worldAreaArray[g.var1[21]] = this.C;
        worldAreaArray[g.var1[22]] = this.D;
        worldAreaArray[g.var1[23]] = this.E;
        worldAreaArray[g.var1[25]] = this.F;
        worldAreaArray[g.var1[26]] = this.G;
        worldAreaArray[g.var1[28]] = this.H;
        worldAreaArray[g.var1[29]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var24 = var1[4];
        while (g.var3(var24, var23.size())) {
            void var25;
            if (g.var26(((WorldArea)var23.get(var24)).contains((WorldPoint)var25) ? 1 : 0)) {
                WorldArea var27 = (WorldArea)var23.get(var24);
                0;
                if null == null break;
                return null;
            }
            ++var24;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean var28(int n) {
        return n == 0;
    }

    private static boolean var26(int n) {
        return n != 0;
    }

    public boolean run() {
        WorldPoint var29;
        WorldPoint lllllllllllllllIIIllllIIlIIllIII2;
        NPC lllllllllllllllIIIllllIIlIIllIIl2;
        WorldPoint lllllllllllllllIIIllllIIlIIllIlI2;
        NPC var30;
        NPC var31;
        g var32;
        if (g.var28(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var1[4];
        }
        if (g.var28(var32.b().isFullyEquipped() ? 1 : 0)) {
            if (g.var26(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var1[21]];
                stringArray[g.var1[4]] = var2[var1[4]];
                if (g.var26(Inventory.contains((String[])stringArray) ? 1 : 0) && g.var33(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && g.var34(var32.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[var1[21]];
                    stringArray2[g.var1[4]] = var2[var1[21]];
                    Inventory.getFirst((String[])stringArray2).interact(var2[var1[22]]);
                }
            }
            var32.b().swap();
        }
        if (g.var33(var31 = NPCs.getNearest(nPC -> {
            int n;
            if (g.var35(nPC.getId(), var1[39]) && g.var26(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[21];
                0;
                if ((0x1F ^ 0x1B) < 0) {
                    return ((0xD6 ^ 0xC7) & ~(0x15 ^ 4)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        })) && g.var33(var30 = var32.d(var31.getWorldLocation()))) {
            if (g.var28(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = var2[var1[23]];
                Movement.setDestination((WorldPoint)var31.getWorldLocation());
                return var1[4];
            }
            if (g.var26(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[var1[21]];
                nArray[g.var1[4]] = var1[24];
                lllllllllllllllIIIllllIIlIIllIlI2 = NPCs.getNearest((int[])nArray);
                if (g.var33(lllllllllllllllIIIllllIIlIIllIlI2)) {
                    SquireMoonsOfPeril.g = var2[var1[25]];
                    if (g.var26(l.l() ? 1 : 0) && g.var26(Inventory.contains(item -> item.getName().contains(var2[var1[38]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(var2[var1[37]])).interact(var2[var1[26]]);
                        return var1[4];
                    }
                    int[] nArray2 = new int[var1[21]];
                    nArray2[g.var1[4]] = var1[27];
                    if (g.var26(Equipment.contains((int[])nArray2) ? 1 : 0) && g.var36(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
                        return var1[4];
                    }
                    lllllllllllllllIIIllllIIlIIllIlI2.interact(var2[var1[28]]);
                    return var1[21];
                }
            }
        }
        if (g.var33(var30 = NPCs.getNearest(nPC -> {
            int n;
            if (g.var35(nPC.getId(), var1[36]) && g.var26(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = var1[21];
                0;
                if (((105 + 46 - 94 + 97 ^ 95 + 147 - 126 + 78) & (0xC ^ 0x5F ^ (0xAF ^ 0xA4) ^ -1)) != 0) {
                    return ((0x5A ^ 0x5F ^ (0x96 ^ 0xC5)) & (47 + 211 - 249 + 203 ^ 82 + 56 - 89 + 81 ^ -1)) != 0;
                }
            } else {
                n = var1[4];
            }
            return n != 0;
        }))) {
            if (g.var26(var30.isMoving() ? 1 : 0)) {
                SquireMoonsOfPeril.g = var2[var1[29]];
                if (g.var28(Players.getLocal().getWorldLocation().equals((Object)var30.getWorldLocation()) ? 1 : 0)) {
                    int lllllllllllllllIIIllllIIlIIllIlI2 = var1[4];
                    int lllllllllllllllIIIllllIIlIIllIIl2 = var1[4];
                    if (g.var35(var30.getWorldLocation().getY(), var1[19]) && g.var12(var30.getWorldLocation().getX(), var1[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = var1[30];
                    }
                    if (g.var35(var30.getWorldLocation().getX(), var1[5])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = var1[21];
                    }
                    if (g.var35(var30.getWorldLocation().getY(), var1[10]) && g.var12(var30.getWorldLocation().getX(), var1[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = var1[21];
                    }
                    if (g.var35(var30.getWorldLocation().getX(), var1[15])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = var1[30];
                    }
                    WorldPoint lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(var30.getWorldLocation().getX() + lllllllllllllllIIIllllIIlIIllIlI2, var30.getWorldLocation().getY() + lllllllllllllllIIIllllIIlIIllIIl2, var1[4]);
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                    return var1[21];
                }
            }
            if (g.var28(var30.isMoving() ? 1 : 0)) {
                lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(var1[15], var1[10], var1[4]);
                if (g.var26(var30.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(var1[16], var1[10], var1[4]);
                    if (g.var28(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIIl2);
                        return var1[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(var1[5], var1[10], var1[4]);
                if (g.var26(var30.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(var1[7], var1[31], var1[4]);
                    if (g.var28(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                        return var1[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(var1[5], var1[19], var1[4]);
                if (g.var26(var30.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                    var29 = new WorldPoint(var1[32], var1[20], var1[4]);
                    if (g.var28(Players.getLocal().getWorldLocation().equals((Object)var29) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var29);
                        return var1[21];
                    }
                }
            }
        }
        lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(var1[33], var1[34], var1[4]);
        if (g.var26(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
            SquireMoonsOfPeril.g = var2[var1[35]];
            int[] nArray = new int[var1[21]];
            nArray[g.var1[4]] = var1[24];
            lllllllllllllllIIIllllIIlIIllIIl2 = NPCs.getNearest((int[])nArray);
            if (g.var33(lllllllllllllllIIIllllIIlIIllIIl2)) {
                P.add(lllllllllllllllIIIllllIIlIIllIIl2.getWorldLocation());
                0;
            }
            if (g.var28(SquireMoonsOfPeril.j.isEmpty() ? 1 : 0) && g.var26((lllllllllllllllIIIllllIIlIIllIII2 = SquireMoonsOfPeril.j.iterator()).hasNext() ? 1 : 0)) {
                var29 = lllllllllllllllIIIllllIIlIIllIII2.next();
                Movement.setDestination((WorldPoint)var29);
                lllllllllllllllIIIllllIIlIIllIII2.remove();
                Time.sleepTicks((int)var1[21]);
                0;
                return var1[21];
            }
        }
        return var1[21];
    }

    private static boolean var36(Object object, Object object2) {
        return object != object2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.Q.contains(worldPoint);
    }

    private static boolean var34(int n) {
        return n <= 0;
    }

    private static void var5() {
        var2 = new String[var1[40]];
        g.var2[g.var1[4]] = "Cooked bream";
        g.var2[g.var1[21]] = "Cooked bream";
        g.var2[g.var1[22]] = "Eat";
        g.var2[g.var1[23]] = "Move to safe spot";
        g.var2[g.var1[25]] = "Attacking";
        g.var2[g.var1[26]] = "Drink";
        g.var2[g.var1[28]] = "Attack";
        g.var2[g.var1[29]] = "Walking with moon";
        g.var2[g.var1[35]] = "Turning spec";
        g.var2[g.var1[37]] = "Moonlight potion";
        g.var2[g.var1[38]] = "Moonlight potion";
    }

    private static boolean var35(int n, int n2) {
        return n == n2;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.O.eclipseGear().selected(EquipmentSetup.class);
    }

    private static boolean var33(Object object) {
        return object != null;
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }
}

