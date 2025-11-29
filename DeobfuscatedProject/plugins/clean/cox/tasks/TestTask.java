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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
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

    private static boolean llIlIIllllIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public int[] aT() {
        void var2;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var3 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var3, (int)var2)) {
            void var4;
            void var5;
            void var6 = var5[var3];
            ItemStats var7 = var4.getItemStats((int)var6, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var7)) {
                if (X.llIlIIllllIIll(var7.isEquipable() ? 1 : 0)) {

                    if (((0xD ^ 0x30 ^ (0xE ^ 0x7B)) & (87 + 103 - 46 + 56 ^ 72 + 106 - 56 + 6 ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void var8;
                    int var9 = var7.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var8[var9])) {
                        var8[var9] = var6;

                        if (-1 > 3) {
                            return null;
                        }
                    } else {
                        ItemStats var10 = var4.getItemStats((int)var8[var9], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var10.getEquipment().getMdmg(), var7.getEquipment().getMdmg())) {
                            var8[var9] = var6;

                        } else if (X.llIlIIllllIIIl(var10.getEquipment().getAmagic(), var7.getEquipment().getAmagic())) {
                            var8[var9] = var6;
                        }
                    }
                }
            }
            ++var3;

            if (-2 < 0) continue;
            return null;
        }
        return nArray2;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[0]]));
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
        void var11;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var12 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var12, (int)var11)) {
            void var13;
            void var14;
            void var15 = var14[var12];
            ItemStats var16 = var13.getItemStats((int)var15, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var16)) {
                if (X.llIlIIllllIIll(var16.isEquipable() ? 1 : 0)) {

                } else {
                    void var17;
                    int var18 = var16.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var17[var18])) {
                        var17[var18] = var15;

                        if ((0x19 ^ 0x1C) <= 0) {
                            return null;
                        }
                    } else {
                        ItemStats var19 = var13.getItemStats((int)var17[var18], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var19.getEquipment().getRstr(), var16.getEquipment().getRstr())) {
                            var17[var18] = var15;

                            if (-(0xD2 ^ 0xBC ^ (0xC8 ^ 0xA2)) > 0) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(var19.getEquipment().getArange(), var16.getEquipment().getArange())) {
                            var17[var18] = var15;
                        }
                    }
                }
            }
            ++var12;

            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }

    public int[] aV() {
        int[] nArray = this.aS();
        return new int[lIlIIIIIIlII[0]];
    }

    protected BankLoadout q() {
        return (BankLoadout)this.cu.bankLoadout().selected(BankLoadout.class);
    }

    /*
     * WARNING - void declaration
     */
    private List<Integer> a(int[] nArray) {
        void var20;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var21 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var21, (int)var20)) {
            void var22;
            void var23;
            void var24 = var23[var21];
            var22.add((int)var24);

            ++var21;

            if (2 == 2) continue;
            return null;
        }
        return arrayList;
    }

    public boolean run() {
        return lIlIIIIIIlII[0];
    }

    private String a(WorldArea worldArea) {
        String string = "(" + worldArea.getX() + "," + worldArea.getY() + "," + worldArea.getPlane() + " | width/height: " + worldArea.getWidth() + "/" + worldArea.getHeight() + ")";
        return string;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[2]]));
    }

    private static void llIlIIlllIllll() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[3]];
        X.lIlIIIIIIIll[X.lIlIIIIIIlII[0]] = "Revitalisation";
        X.lIlIIIIIIIll[X.lIlIIIIIIlII[2]] = "Xeric's aid";
    }

    public int[] a(int[] nArray, int[] nArray2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(this.a(nArray));

        hashSet.addAll(this.a(nArray2));

        return hashSet.stream().mapToInt(Integer::intValue).toArray();
    }

    static {
        X.llIlIIllllIIII();
        X.llIlIIlllIllll();
    }

    /*
     * WARNING - void declaration
     */
    public int[] aU() {
        void var25;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var26 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var26, (int)var25)) {
            void var27;
            void var28;
            void var29 = var28[var26];
            ItemStats var30 = var27.getItemStats((int)var29, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var30)) {
                if (X.llIlIIllllIIll(var30.isEquipable() ? 1 : 0)) {

                    }
                } else {
                    void var31;
                    int var32 = var30.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var31[var32])) {
                        var31[var32] = var29;

                        if (1 <= ((0x8D ^ 0xB0 ^ (0x26 ^ 0x14)) & (0x19 ^ 0x32 ^ (0x11 ^ 0x35) ^ -1))) {
                            return null;
                        }
                    } else {
                        ItemStats var33 = var27.getItemStats((int)var31[var32], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var33.getEquipment().getRstr(), var30.getEquipment().getRstr())) {
                            var31[var32] = var29;

                            if (1 > 3) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(var33.getEquipment().getArange(), var30.getEquipment().getArange())) {
                            var31[var32] = var29;
                        }
                    }
                }
            }
            ++var26;

            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }
}

