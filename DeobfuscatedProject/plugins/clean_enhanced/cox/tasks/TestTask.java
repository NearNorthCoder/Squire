/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.NPCManager
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.http.api.item.ItemStats
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.http.api.item.ItemStats;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Test Task", priority=0x7FFFFFFF, blocking=true)
public class TestTask
extends Task {
    
    private final  SquireChambersPlugin ct;
    
    private final  NPCManager cv;
    private final  SquireChambersConfig cu;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public int[] aT() {
        void var13;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[1];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var14 = 0;
        while ((var14 < (int)var13)) {
            void var15;
            void var16;
            void var17 = var16[var14];
            ItemStats var18 = var15.getItemStats((int)var17, 0);
            if var18 != null {
                if ((var18.isEquipable( == 0) ? 1 : 0)) {
                    0;
                    if (((0xD ^ 0x30 ^ (0xE ^ 0x7B)) & (87 + 103 - 46 + 56 ^ 72 + 106 - 56 + 6 ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void var19;
                    int var20 = var18.getEquipment().getSlot();
                    if (((int == 0)var19[var20])) {
                        var19[var20] = var17;
                        0;
                        if (-1 > 3) {
                            return null;
                        }
                    } else {
                        ItemStats var21 = var15.getItemStats((int)var19[var20], 0);
                        if ((var21.getEquipment().getMdmg() < var18.getEquipment().getMdmg())) {
                            var19[var20] = var17;
                            0;
                            if (-2 > 0) {
                                return null;
                            }
                        } else if ((var21.getEquipment().getAmagic() < var18.getEquipment().getAmagic())) {
                            var19[var20] = var17;
                        }
                    }
                }
            }
            ++var14;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return nArray2;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[0]));
    }

    @Inject
    public TestTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, NPCManager nPCManager) {
        this.ct = squireChambersPlugin;
        this.cu = squireChambersConfig;
        this.cv = nPCManager;
    }

    /*
     * WARNING - void declaration
     */
    public int[] aS() {
        void var22;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[1];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var23 = 0;
        while ((var23 < (int)var22)) {
            void var24;
            void var25;
            void var26 = var25[var23];
            ItemStats var27 = var24.getItemStats((int)var26, 0);
            if var27 != null {
                if ((var27.isEquipable( == 0) ? 1 : 0)) {
                    0;
                    if (-1 >= 0) {
                        return null;
                    }
                } else {
                    void var28;
                    int var29 = var27.getEquipment().getSlot();
                    if (((int == 0)var28[var29])) {
                        var28[var29] = var26;
                        0;
                        if ((0x19 ^ 0x1C) <= 0) {
                            return null;
                        }
                    } else {
                        ItemStats var30 = var24.getItemStats((int)var28[var29], 0);
                        if ((var30.getEquipment().getRstr() < var27.getEquipment().getRstr())) {
                            var28[var29] = var26;
                            0;
                            if (-(0xD2 ^ 0xBC ^ (0xC8 ^ 0xA2)) > 0) {
                                return null;
                            }
                        } else if ((var30.getEquipment().getArange() < var27.getEquipment().getArange())) {
                            var28[var29] = var26;
                        }
                    }
                }
            }
            ++var23;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }

    public int[] aV() {
        int[] nArray = this.aS();
        return new int[0];
    }

    protected BankLoadout q() {
        return (BankLoadout)this.cu.bankLoadout().selected(BankLoadout.class);
    }

    /*
     * WARNING - void declaration
     */
    private List<Integer> a(int[] nArray) {
        void var31;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var32 = 0;
        while ((var32 < (int)var31)) {
            void var33;
            void var34;
            void var35 = var34[var32];
            var33.add((int)var35);
            0;
            ++var32;
            0;
            if (2 == 2) continue;
            return null;
        }
        return arrayList;
    }

    public boolean run() {
        return 0;
    }

    private String a(WorldArea worldArea) {
        String string = "(" + worldArea.getX() + "," + worldArea.getY() + "," + worldArea.getPlane() + " | width/height: " + worldArea.getWidth() + "/" + worldArea.getHeight() + ")";
        return string;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(var1[2]));
    }

    public int[] a(int[] nArray, int[] nArray2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(this.a(nArray));
        0;
        hashSet.addAll(this.a(nArray2));
        0;
        return hashSet.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * WARNING - void declaration
     */
    public int[] aU() {
        void var36;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[1];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var37 = 0;
        while ((var37 < (int)var36)) {
            void var38;
            void var39;
            void var40 = var39[var37];
            ItemStats var41 = var38.getItemStats((int)var40, 0);
            if var41 != null {
                if ((var41.isEquipable( == 0) ? 1 : 0)) {
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    void var42;
                    int var43 = var41.getEquipment().getSlot();
                    if (((int == 0)var42[var43])) {
                        var42[var43] = var40;
                        0;
                        if (1 <= ((0x8D ^ 0xB0 ^ (0x26 ^ 0x14)) & (0x19 ^ 0x32 ^ (0x11 ^ 0x35) ^ -1))) {
                            return null;
                        }
                    } else {
                        ItemStats var44 = var38.getItemStats((int)var42[var43], 0);
                        if ((var44.getEquipment().getRstr() < var41.getEquipment().getRstr())) {
                            var42[var43] = var40;
                            0;
                            if (1 > 3) {
                                return null;
                            }
                        } else if ((var44.getEquipment().getArange() < var41.getEquipment().getArange())) {
                            var42[var43] = var40;
                        }
                    }
                }
            }
            ++var37;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }
}

