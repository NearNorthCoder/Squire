/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Attacking")
public class AttackingTask
extends Task {

    private final  SquireSkipperConfig s;
    private final  SquireSkipperPlugin r;

    @Inject
    public AttackingTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.r = squireSkipperPlugin;
        this.s = squireSkipperConfig;
    }

    static {
        c.var3();
        c.var4();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (c.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        c var24;
        if (c.var25(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        if (c.var26((Object)var24.r.b(), (Object)b.MINOTAURS)) {
            if (c.var23(Dialog.isOpen() ? 1 : 0) && c.var23(Dialog.getName().contains(var2[var1[0]]) ? 1 : 0) && c.var23(Dialog.canContinue() ? 1 : 0)) {
                System.out.println(var2[var1[1]]);
                Dialog.continueSpace();
                return var1[1];
            }
            if (c.var23(Dialog.hasOption(string -> string.contains(var2[var1[20]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(var2[var1[19]]));
                0;
                return var1[1];
            }
            if (c.var23(Dialog.hasOption(string -> string.contains(var2[var1[18]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(var2[var1[17]]));
                0;
                return var1[1];
            }
            if (c.var23(Dialog.hasOption(string -> string.contains(var2[var1[5]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(var2[var1[16]]));
                0;
                return var1[1];
            }
        }
        String[] stringArray = new String[var1[1]];
        stringArray[c.var1[0]] = var2[var1[2]];
        if (c.var23(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[var1[1]];
            stringArray2[c.var1[0]] = var2[var1[3]];
            Inventory.getFirst((String[])stringArray2).interact(var2[var1[4]]);
            return var1[1];
        }
        if (c.var23(var24.r.h() ? 1 : 0)) {
            return var1[0];
        }
        if (c.var11(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        b var27 = var24.r.b();
        if (c.var28((Object)var27)) {
            return var1[0];
        }
        if (c.var29(Movement.getRunEnergy(), var1[5]) && c.var11(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return var1[1];
        }
        if (c.var11(var27.l() ? 1 : 0)) {
            var27.p().forEach(n2 -> {
                block2: {
                    void var30;
                    block3: {
                        int[] nArray = new int[var1[1]];
                        nArray[c.var1[0]] = n2;
                        if (!c.var23(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                        int[] nArray2 = new int[var1[1]];
                        nArray2[c.var1[0]] = n2;
                        Item item = Inventory.getFirst((int[])nArray2);
                        String[] stringArray = new String[var1[1]];
                        stringArray[c.var1[0]] = var2[var1[12]];
                        if (!c.var11(item.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[var1[1]];
                        stringArray2[c.var1[0]] = var2[var1[13]];
                        if (!c.var23(item.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    String[] stringArray = new String[var1[2]];
                    stringArray[c.var1[0]] = var2[var1[14]];
                    stringArray[c.var1[1]] = var2[var1[15]];
                    var30.interact(stringArray);
                }
            });
            return var1[1];
        }
        NPC var31 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (c.var23(nPC.getName().toLowerCase().contains(var27.m().toLowerCase()) ? 1 : 0) && c.var11(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (c.var28(var31) && c.var23(var24.b(var27) ? 1 : 0)) {
            Log.info((String)var2[var1[6]]);
            return var1[0];
        }
        if (c.var28(var31) && c.var11(var24.b(var27) ? 1 : 0)) {
            Log.info((String)var2[var1[7]]);
            if (c.var23(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var27.n().getCenter());
                0;
            }
            return var1[1];
        }
        Player var32 = Players.getLocal();
        if (!c.var21(var32.getWorldLocation().distanceTo(var27.n().getCenter()), var1[8]) || c.var25(var31) && c.var11(Reachable.isInteractable((Locatable)var31) ? 1 : 0)) {
            Log.info((String)var2[var1[9]]);
            if (c.var23(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var27.n().getCenter());
                0;
            }
            return var1[1];
        }
        var24.r.a(var24.r.g());
        0;
        Item var33 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.var25(var33) && c.var34(var33.getId(), var24.r.i())) {
            System.out.println("Swapping to " + var24.r.i());
            int[] nArray = new int[var1[1]];
            nArray[c.var1[0]] = var24.r.i();
            Inventory.getFirst((int[])nArray).interact(var2[var1[10]]);
            var24.r.d(var1[0]);
            return var1[1];
        }
        if (c.var28(var31)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[11]]);
        return var1[1];
    }

    private static boolean var29(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var28(Object object) {
        return object == null;
    }

    private static boolean var25(Object object) {
        return object != null;
    }

    private static void var3() {
        var1 = new int[22];
        c.var1[0] = (0xB8 ^ 0x8E ^ (2 ^ 0x16)) & (0xF8 ^ 0xB3 ^ (0xF6 ^ 0x9F) ^ -1);
        c.var1[1] = 1;
        c.var1[2] = 2;
        c.var1[3] = 3;
        c.var1[4] = 0x21 ^ 0x70 ^ (0x55 ^ 0);
        c.var1[5] = 0xD ^ 0x78 ^ (0xE2 ^ 0x98);
        c.var1[6] = 0x24 ^ 0x29 ^ (0x83 ^ 0x8B);
        c.var1[7] = 0x8A ^ 0x8C;
        c.var1[8] = 0xB1 ^ 0x84 ^ (0x8A ^ 0xA6);
        c.var1[9] = 0x92 ^ 0x95;
        c.var1[10] = 6 ^ 0x6B ^ (0x6F ^ 0xA);
        c.var1[11] = 0x16 ^ 0x1F;
        c.var1[12] = 125 + 43 - 153 + 168 ^ 174 + 25 - 171 + 161;
        c.var1[13] = 0x8C ^ 0x87;
        c.var1[14] = 0xF3 ^ 0x81 ^ (0x24 ^ 0x5A);
        c.var1[15] = 0xF6 ^ 0xC5 ^ (0xB1 ^ 0x8F);
        c.var1[16] = 0x50 ^ 0x5E;
        c.var1[17] = 0x5D ^ 0x4D;
        c.var1[18] = 60 + 60 - 12 + 32 ^ 7 + 135 - 9 + 24;
        c.var1[19] = 0xC ^ 0x50 ^ (0xC9 ^ 0x87);
        c.var1[20] = 0x8D ^ 0x9E;
        c.var1[21] = 0x23 ^ 0x37;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    public boolean b(b b2) {
        return b2.n().contains((Locatable)Players.getLocal());
    }

    private static void var4() {
        var2 = new String[var1[21]];
        c.var2[c.var1[0]] = "Gate of War";
        c.var2[c.var1[1]] = "Trying to continue on Gate of War dialog";
        c.var2[c.var1[2]] = "Waterskin(0)";
        c.var2[c.var1[3]] = "Waterskin(0)";
        c.var2[c.var1[4]] = "Drop";
        c.var2[c.var1[6]] = "Waiting for respawns";
        c.var2[c.var1[7]] = "Walking towards task location";
        c.var2[c.var1[9]] = "Walking to location";
        c.var2[c.var1[10]] = "Wield";
        c.var2[c.var1[11]] = "Attack";
        c.var2[c.var1[12]] = "Equip";
        c.var2[c.var1[13]] = "Wield";
        c.var2[c.var1[14]] = "Equip";
        c.var2[c.var1[15]] = "Wield";
        c.var2[c.var1[16]] = "decline";
        c.var2[c.var1[5]] = "decline";
        c.var2[c.var1[17]] = "no";
        c.var2[c.var1[18]] = "no";
        c.var2[c.var1[19]] = "report";
        c.var2[c.var1[20]] = "report";
    }

    private static boolean var26(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var34(int n2, int n3) {
        return n2 != n3;
    }
}

