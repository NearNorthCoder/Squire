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

    private static String llIlIIlllIlllI(String lllllllllllllllIlllIIlIlIlIIIIlI, String lllllllllllllllIlllIIlIlIlIIIllI) {
        lllllllllllllllIlllIIlIlIlIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIlIlIIIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIIlIlIlIIIlII = lllllllllllllllIlllIIlIlIlIIIllI.toCharArray();
        int lllllllllllllllIlllIIlIlIlIIIIll = lIlIIIIIIlII[0];
        char[] lllllllllllllllIlllIIlIlIIllllIl = lllllllllllllllIlllIIlIlIlIIIIlI.toCharArray();
        int lllllllllllllllIlllIIlIlIIllllII = lllllllllllllllIlllIIlIlIIllllIl.length;
        int lllllllllllllllIlllIIlIlIIlllIll = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIIlllIll, lllllllllllllllIlllIIlIlIIllllII)) {
            char lllllllllllllllIlllIIlIlIlIIlIII = lllllllllllllllIlllIIlIlIIllllIl[lllllllllllllllIlllIIlIlIIlllIll];
            lllllllllllllllIlllIIlIlIlIIIlIl.append((char)(lllllllllllllllIlllIIlIlIlIIlIII ^ lllllllllllllllIlllIIlIlIlIIIlII[lllllllllllllllIlllIIlIlIlIIIIll % lllllllllllllllIlllIIlIlIlIIIlII.length]));
            0;
            ++lllllllllllllllIlllIIlIlIlIIIIll;
            ++lllllllllllllllIlllIIlIlIIlllIll;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlIlIlIIIlIl);
    }

    /*
     * WARNING - void declaration
     */
    public int[] aT() {
        void lllllllllllllllIlllIIlIlIlllIIIl;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int lllllllllllllllIlllIIlIlIlllIIII = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIlllIIII, (int)lllllllllllllllIlllIIlIlIlllIIIl)) {
            void lllllllllllllllIlllIIlIlIlllIlll;
            void lllllllllllllllIlllIIlIlIlllIIlI;
            void lllllllllllllllIlllIIlIlIllIllll = lllllllllllllllIlllIIlIlIlllIIlI[lllllllllllllllIlllIIlIlIlllIIII];
            ItemStats lllllllllllllllIlllIIlIlIllIlllI = lllllllllllllllIlllIIlIlIlllIlll.getItemStats((int)lllllllllllllllIlllIIlIlIllIllll, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(lllllllllllllllIlllIIlIlIllIlllI)) {
                if (X.llIlIIllllIIll(lllllllllllllllIlllIIlIlIllIlllI.isEquipable() ? 1 : 0)) {
                    0;
                    if (((0xD ^ 0x30 ^ (0xE ^ 0x7B)) & (87 + 103 - 46 + 56 ^ 72 + 106 - 56 + 6 ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlllIIlIlIlllIllI;
                    int lllllllllllllllIlllIIlIlIllIllIl = lllllllllllllllIlllIIlIlIllIlllI.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)lllllllllllllllIlllIIlIlIlllIllI[lllllllllllllllIlllIIlIlIllIllIl])) {
                        lllllllllllllllIlllIIlIlIlllIllI[lllllllllllllllIlllIIlIlIllIllIl] = lllllllllllllllIlllIIlIlIllIllll;
                        0;
                        if (-1 > 3) {
                            return null;
                        }
                    } else {
                        ItemStats lllllllllllllllIlllIIlIlIllIllII = lllllllllllllllIlllIIlIlIlllIlll.getItemStats((int)lllllllllllllllIlllIIlIlIlllIllI[lllllllllllllllIlllIIlIlIllIllIl], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIllIllII.getEquipment().getMdmg(), lllllllllllllllIlllIIlIlIllIlllI.getEquipment().getMdmg())) {
                            lllllllllllllllIlllIIlIlIlllIllI[lllllllllllllllIlllIIlIlIllIllIl] = lllllllllllllllIlllIIlIlIllIllll;
                            0;
                            if (-2 > 0) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIllIllII.getEquipment().getAmagic(), lllllllllllllllIlllIIlIlIllIlllI.getEquipment().getAmagic())) {
                            lllllllllllllllIlllIIlIlIlllIllI[lllllllllllllllIlllIIlIlIllIllIl] = lllllllllllllllIlllIIlIlIllIllll;
                        }
                    }
                }
            }
            ++lllllllllllllllIlllIIlIlIlllIIII;
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
        void lllllllllllllllIlllIIlIllIIIlIll;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int lllllllllllllllIlllIIlIllIIIlIlI = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIllIIIlIlI, (int)lllllllllllllllIlllIIlIllIIIlIll)) {
            void lllllllllllllllIlllIIlIllIIlIIIl;
            void lllllllllllllllIlllIIlIllIIIllII;
            void lllllllllllllllIlllIIlIllIIIlIIl = lllllllllllllllIlllIIlIllIIIllII[lllllllllllllllIlllIIlIllIIIlIlI];
            ItemStats lllllllllllllllIlllIIlIllIIIlIII = lllllllllllllllIlllIIlIllIIlIIIl.getItemStats((int)lllllllllllllllIlllIIlIllIIIlIIl, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(lllllllllllllllIlllIIlIllIIIlIII)) {
                if (X.llIlIIllllIIll(lllllllllllllllIlllIIlIllIIIlIII.isEquipable() ? 1 : 0)) {
                    0;
                    if (-1 >= 0) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlllIIlIllIIlIIII;
                    int lllllllllllllllIlllIIlIllIIIIlll = lllllllllllllllIlllIIlIllIIIlIII.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)lllllllllllllllIlllIIlIllIIlIIII[lllllllllllllllIlllIIlIllIIIIlll])) {
                        lllllllllllllllIlllIIlIllIIlIIII[lllllllllllllllIlllIIlIllIIIIlll] = lllllllllllllllIlllIIlIllIIIlIIl;
                        0;
                        if ((0x19 ^ 0x1C) <= 0) {
                            return null;
                        }
                    } else {
                        ItemStats lllllllllllllllIlllIIlIllIIIIllI = lllllllllllllllIlllIIlIllIIlIIIl.getItemStats((int)lllllllllllllllIlllIIlIllIIlIIII[lllllllllllllllIlllIIlIllIIIIlll], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIllIIIIllI.getEquipment().getRstr(), lllllllllllllllIlllIIlIllIIIlIII.getEquipment().getRstr())) {
                            lllllllllllllllIlllIIlIllIIlIIII[lllllllllllllllIlllIIlIllIIIIlll] = lllllllllllllllIlllIIlIllIIIlIIl;
                            0;
                            if (-(0xD2 ^ 0xBC ^ (0xC8 ^ 0xA2)) > 0) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIllIIIIllI.getEquipment().getArange(), lllllllllllllllIlllIIlIllIIIlIII.getEquipment().getArange())) {
                            lllllllllllllllIlllIIlIllIIlIIII[lllllllllllllllIlllIIlIllIIIIlll] = lllllllllllllllIlllIIlIllIIIlIIl;
                        }
                    }
                }
            }
            ++lllllllllllllllIlllIIlIllIIIlIlI;
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
        void lllllllllllllllIlllIIlIllIlIIIlI;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int lllllllllllllllIlllIIlIllIlIIIIl = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIllIlIIIIl, (int)lllllllllllllllIlllIIlIllIlIIIlI)) {
            void lllllllllllllllIlllIIlIllIlIIlII;
            void lllllllllllllllIlllIIlIllIlIIIll;
            void lllllllllllllllIlllIIlIllIlIIIII = lllllllllllllllIlllIIlIllIlIIIll[lllllllllllllllIlllIIlIllIlIIIIl];
            lllllllllllllllIlllIIlIllIlIIlII.add((int)lllllllllllllllIlllIIlIllIlIIIII);
            0;
            ++lllllllllllllllIlllIIlIllIlIIIIl;
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
        void lllllllllllllllIlllIIlIlIlIlIlll;
        int[] nArray;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray2 = new int[lIlIIIIIIlII[1]];
        int[] nArray3 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray5 = nArray = this.a(nArray3, nArray4);
        int n2 = nArray5.length;
        int lllllllllllllllIlllIIlIlIlIlIllI = lIlIIIIIIlII[0];
        while (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIlIlIllI, (int)lllllllllllllllIlllIIlIlIlIlIlll)) {
            void lllllllllllllllIlllIIlIlIlIlllIl;
            void lllllllllllllllIlllIIlIlIlIllIII;
            void lllllllllllllllIlllIIlIlIlIlIlIl = lllllllllllllllIlllIIlIlIlIllIII[lllllllllllllllIlllIIlIlIlIlIllI];
            ItemStats lllllllllllllllIlllIIlIlIlIlIlII = lllllllllllllllIlllIIlIlIlIlllIl.getItemStats((int)lllllllllllllllIlllIIlIlIlIlIlIl, lIlIIIIIIlII[0]);
            if (X.llIlIIllllIIlI(lllllllllllllllIlllIIlIlIlIlIlII)) {
                if (X.llIlIIllllIIll(lllllllllllllllIlllIIlIlIlIlIlII.isEquipable() ? 1 : 0)) {
                    0;
                    if (null != null) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlllIIlIlIlIlllII;
                    int lllllllllllllllIlllIIlIlIlIlIIll = lllllllllllllllIlllIIlIlIlIlIlII.getEquipment().getSlot();
                    if (X.llIlIIllllIIll((int)lllllllllllllllIlllIIlIlIlIlllII[lllllllllllllllIlllIIlIlIlIlIIll])) {
                        lllllllllllllllIlllIIlIlIlIlllII[lllllllllllllllIlllIIlIlIlIlIIll] = lllllllllllllllIlllIIlIlIlIlIlIl;
                        0;
                        if (1 <= ((0x8D ^ 0xB0 ^ (0x26 ^ 0x14)) & (0x19 ^ 0x32 ^ (0x11 ^ 0x35) ^ -1))) {
                            return null;
                        }
                    } else {
                        ItemStats lllllllllllllllIlllIIlIlIlIlIIlI = lllllllllllllllIlllIIlIlIlIlllIl.getItemStats((int)lllllllllllllllIlllIIlIlIlIlllII[lllllllllllllllIlllIIlIlIlIlIIll], lIlIIIIIIlII[0]);
                        if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIlIlIIlI.getEquipment().getRstr(), lllllllllllllllIlllIIlIlIlIlIlII.getEquipment().getRstr())) {
                            lllllllllllllllIlllIIlIlIlIlllII[lllllllllllllllIlllIIlIlIlIlIIll] = lllllllllllllllIlllIIlIlIlIlIlIl;
                            0;
                            if (1 > 3) {
                                return null;
                            }
                        } else if (X.llIlIIllllIIIl(lllllllllllllllIlllIIlIlIlIlIIlI.getEquipment().getArange(), lllllllllllllllIlllIIlIlIlIlIlII.getEquipment().getArange())) {
                            lllllllllllllllIlllIIlIlIlIlllII[lllllllllllllllIlllIIlIlIlIlIIll] = lllllllllllllllIlllIIlIlIlIlIlIl;
                        }
                    }
                }
            }
            ++lllllllllllllllIlllIIlIlIlIlIllI;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return nArray2;
    }
}

