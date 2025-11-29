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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

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

/* TASK: Test Task -> TesttaskTask */
@TaskDesc(name="Test Task", priority=0x7FFFFFFF, blocking=true)
public class X
extends Task {
    private static /* synthetic */ String[] lIlIIIIIIIll;
    private final /* synthetic */ SquireChambersPlugin ct;
    private static /* synthetic */ int[] lIlIIIIIIlII;
    private final /* synthetic */ NPCManager cv;
    private final /* synthetic */ SquireChambersConfig cu;

    private static boolean llIlIIllllIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIIlllIlllI(String var36, String var14) {
        var36 = new String(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var19 = var14.toCharArray();
        int var5 = lIlIIIIIIlII[0];
        char[] var37 = var36.toCharArray();
        int var15 = var37.length;
        int var41 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var41, var15)) {
            char var40 = var37[var41];
            var10.append((char)(var40 ^ var19[var5 % var19.length]));
            0;
            ++var5;
            ++var41;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    public int[] aT() {
        void var30;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var11 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var11, (int)var30)) {
            void var28;
            void var34;
            void var24 = var34[var11];
            ItemStats var32 = var28.getItemStats((int)var24, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var32)) {
                if (X.llIlIIllllIIll(var32.isEquipable() ? 1 : 0)) {
                    0;
                    if (((0xD ^ 0x30 ^ (0xE ^ 0x7B)) & (87 + 103 - 46 + 56 ^ 72 + 106 - 56 + 6 ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void var23;
                    int var20 = var32.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var23[var20])) {
                        var23[var20] = var24;
                        0;
                        if (-1 > 3) {
                            return null;
                        }
                    } else {
                        ItemStats var17 = var28.getItemStats((int)var23[var20], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var17.getEquipment().getMdmg(), var32.getEquipment().getMdmg())) {
                            var23[var20] = var24;
                            0;
                            if (-2 > 0) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(var17.getEquipment().getAmagic(), var32.getEquipment().getAmagic())) {
                            var23[var20] = var24;
                        }
                    }
                }
            }
            ++var11;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return nArray2;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[0]]));
    }

    @Inject
    public X(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, NPCManager nPCManager) {
        this.ct = squireChambersPlugin;
        this.cu = squireChambersConfig;
        this.cv = nPCManager;
    }

    /*
     * WARNING - void declaration
     */
    public int[] aS() {
        void var29;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var13 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var13, (int)var29)) {
            void var8;
            void var4;
            void var2 = var4[var13];
            ItemStats var9 = var8.getItemStats((int)var2, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var9)) {
                if (X.llIlIIllllIIll(var9.isEquipable() ? 1 : 0)) {
                    0;
                    if (-1 >= 0) {
                        return null;
                    }
                } else {
                    void var16;
                    int var7 = var9.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var16[var7])) {
                        var16[var7] = var2;
                        0;
                        if ((0x19 ^ 0x1C) <= 0) {
                            return null;
                        }
                    } else {
                        ItemStats var27 = var8.getItemStats((int)var16[var7], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var27.getEquipment().getRstr(), var9.getEquipment().getRstr())) {
                            var16[var7] = var2;
                            0;
                            if (-(0xD2 ^ 0xBC ^ (0xC8 ^ 0xA2)) > 0) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(var27.getEquipment().getArange(), var9.getEquipment().getArange())) {
                            var16[var7] = var2;
                        }
                    }
                }
            }
            ++var13;
            0;
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
        void var6;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var35 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var35, (int)var6)) {
            void var21;
            void var18;
            void var31 = var18[var35];
            var21.add((int)var31);
            0;
            ++var35;
            0;
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

    private static void llIlIIllllIIII() {
        lIlIIIIIIlII = new int[4];
        X.lIlIIIIIIlII[0] = (0x12 ^ 0x1A ^ (0x56 ^ 0x49) & ~(0x78 ^ 0x67)) & (0xE0 ^ 0x8E ^ (0x28 ^ 0x4E) ^ -1);
        X.lIlIIIIIIlII[1] = 0x29 ^ 0x27;
        X.lIlIIIIIIlII[2] = 1;
        X.lIlIIIIIIlII[3] = 2;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[2]]));
    }

    private static void llIlIIlllIllll() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[3]];
        X.lIlIIIIIIIll[X.lIlIIIIIIlII[0]] = X."Revitalisation";
        X.lIlIIIIIIIll[X.lIlIIIIIIlII[2]] = X."Xeric's aid";
    }

    public int[] a(int[] nArray, int[] nArray2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(this.a(nArray));
        0;
        hashSet.addAll(this.a(nArray2));
        0;
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
        void var38;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int var33 = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(var33, (int)var38)) {
            void var3;
            void var25;
            void var12 = var25[var33];
            ItemStats var1 = var3.getItemStats((int)var12, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(var1)) {
                if (X.llIlIIllllIIll(var1.isEquipable() ? 1 : 0)) {
                    0;
                    
                    }
                } else {
                    void var26;
                    int var39 = var1.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)var26[var39])) {
                        var26[var39] = var12;
                        0;
                        if (1 <= ((0x8D ^ 0xB0 ^ (0x26 ^ 0x14)) & (0x19 ^ 0x32 ^ (0x11 ^ 0x35) ^ -1))) {
                            return null;
                        }
                    } else {
                        ItemStats var22 = var3.getItemStats((int)var26[var39], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(var22.getEquipment().getRstr(), var1.getEquipment().getRstr())) {
                            var26[var39] = var12;
                            0;
                            if (1 > 3) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(var22.getEquipment().getArange(), var1.getEquipment().getArange())) {
                            var26[var39] = var12;
                        }
                    }
                }
            }
            ++var33;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }
}

