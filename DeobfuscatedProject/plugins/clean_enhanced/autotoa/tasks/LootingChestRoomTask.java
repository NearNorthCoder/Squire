/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Looting chest room", priority=1000, blocking=true)
public class LootingChestRoomTask
extends AutotoaManager {
    private static final  int ey;
    private  boolean eA;
    
    private static final  int ez;
    private static final  int ew;
    
    private static final  int ex;

    @Override
    public boolean bj() {
        int n2;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var4(tileObject.getId(), var1[17])) {
                String[] stringArray = new String[var1[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[19]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-1 == -1) return n2 != 0;
                    return (2 & ~2) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        })) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(this.eA)) {
            n2 = var1[1];
            0;
            if (2 < 1) {
                return ((14 + 59 - -69 + 29 ^ 58 + 63 - 6 + 58) & (0 ^ 0x3E ^ (0x55 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    @Override
    public void r() {
        this.eA = var1[2];
    }

    @Inject
    protected LootingChestRoomTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        Widget widget = Widgets.get((int)var1[4], (int)var1[5]);
        ItemContainer itemContainer = this.cu.getItemContainer(InventoryID.TOA_REWARD_CHEST);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(Widgets.isVisible((Widget)widget) ? 1 : 0) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var6(itemContainer)) {
            void var7;
            int var8;
            void var9;
            int n2 = var1[1];
            Item[] itemArray = itemContainer.getItems();
            int n3 = itemArray.length;
            int var10 = var1[2];
            while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var11(var10, (int)var9)) {
                void var12;
                void var13 = var12[var10];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var14(var13.getId(), var1[1])) {
                    0;
                    if (3 <= 1) {
                        return ((0x11 ^ 0x1F) & ~(0xBC ^ 0xB2)) != 0;
                    }
                } else {
                    var8 = var1[2];
                }
                ++var10;
                0;
                if (2 < 3) continue;
                return ((0x48 ^ 0x45) & ~(0x59 ^ 0x54)) != 0;
            }
            var15.eA = var8;
            var7.interact(var2[var1[2]]);
            return var1[1];
        }
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var4(tileObject.getId(), var1[17])) {
                String[] stringArray = new String[var1[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[18]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (((132 + 143 - 178 + 54 ^ 14 + 177 - 135 + 137) & (0x52 ^ 0x3A ^ (0x36 ^ 8) ^ -1)) == 0) return n2 != 0;
                    return ((0xAC ^ 0xB6 ^ (0xCB ^ 0x98)) & (0x7D ^ 0x48 ^ (0x2C ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        });
        TileObject var12 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(List.of(Integer.valueOf(var1[13]), Integer.valueOf(var1[14]), Integer.valueOf(var1[15])).contains(tileObject.getId()) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[16]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0x64 ^ 0x46 ^ (0x89 ^ 0xB1)) & (0x3C ^ 0x2E ^ (2 ^ 0xA) ^ -1)) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        });
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(var8) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(var12)) {
            TileObject var9 = TileObjects.getNearest(tileObject -> {
                boolean bl2;
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var4(tileObject.getId(), var1[12])) {
                    bl2 = var1[1];
                    0;
                    if (1 == ((0x3E ^ 0x2C ^ (0x80 ^ 0x86)) & (29 + 106 - 72 + 106 ^ 80 + 166 - 146 + 89 ^ -1))) {
                        return ((0x5D ^ 0x55 ^ (0x80 ^ 0xAD)) & (183 + 112 - 272 + 202 ^ 86 + 14 - 92 + 188 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[2];
                }
                return bl2;
            });
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(var9) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(var9 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(var2[var1[11]])))) {
                return var1[2];
            }
            String[] stringArray = new String[var1[6]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[1]] = var2[var1[6]];
            var9.interact(stringArray);
            return var1[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var6(var8)) {
            var8.interact(var2[var1[7]]);
            0;
            if (((0x1C ^ 6 ^ (0x6B ^ 0x3A)) & (0xB ^ 0x15 ^ (0x2F ^ 0x7A) ^ -1)) > 0) {
                return ((79 + 94 - 29 + 52 ^ 108 + 35 - 104 + 153) & (0x53 ^ 0x1F ^ (0x11 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            var12.interact(var2[var1[5]]);
        }
        return var1[1];
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        int[] nArray = new int[var1[1]];
        nArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var1[3];
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var6(TileObjects.getNearest((int[])nArray))) {
            bl2 = var1[1];
            0;
            if (-1 == 3) {
                return ((0x94 ^ 0x8F ^ (0xAA ^ 0x82)) & (0x18 ^ 0x79 ^ (0x73 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[2];
        }
        return bl2;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[8]];
            Dialog.chooseOption((String[])stringArray);
            0;
            this.sleep(var1[8]);
            return var1[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var5(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[1];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = var2[var1[9]];
        NPC var28 = NPCs.getNearest((String[])stringArray);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var3(var28)) {
            return var1[2];
        }
        var1_1.interact(var2[var1[10]]);
        return var1[1];
    }

    private static String var31(String var32, String var33) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var34 = new StringBuilder();
        char[] var35 = var33.toCharArray();
        int var36 = var1[2];
        char[] var37 = var32.toCharArray();
        int var38 = var37.length;
        int var39 = var1[2];
        while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var11(var39, var38)) {
            char var40 = var37[var39];
            var34.append((char)(var40 ^ var35[var36 % var35.length]));
            0;
            ++var36;
            ++var39;
            0;
            if (((0x3D ^ 0x1D) & ~(0xB2 ^ 0x92)) == 0) continue;
            return null;
        }
        return String.valueOf(var34);
    }

    private static void var30() {
        var2 = new String[var1[20]];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Bank-all";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[1]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[6]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[7]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[5]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[8]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Yes";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[9]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Osmumten";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[10]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Leave";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[11]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."sarcophagus";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[16]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[18]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var2[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[19]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static void var29() {
        var1 = new int[21];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[0] = -(0xFFFFFE2C & 0x47FB) & (0xFFFFFF7F & 0x7FF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[1] = 1;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[2] = (187 + 117 - 171 + 70 ^ 119 + 35 - 145 + 127) & (116 + 36 - 49 + 31 ^ 190 + 146 - 144 + 5 ^ -1);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[3] = 0xFFFFBFEF & 0xEF9E;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[4] = 0xFFFF9793 & 0x6B6F;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[5] = 0xAD ^ 0xA9;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[6] = 2;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[7] = 3;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[8] = 1 ^ 0x15 ^ (0x82 ^ 0x93);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[9] = 0x4B ^ 0x4D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[10] = 0xEF ^ 0x94 ^ (0xC6 ^ 0xBA);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[11] = 0x85 ^ 0x8D;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[12] = 0xFFFFB4EF & 0xFF9C;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[13] = -1 & (0xFFFFBFFF & 0xEEF3);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[14] = -1 & (0xFFFFFEF7 & 0xAFFC);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[15] = -(0xFFFFDD5D & 0x62A3) & (0xFFFFFFFD & 0xEEF7);
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[16] = 127 + 75 - 131 + 114 ^ 131 + 114 - 181 + 112;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[17] = 0xFFFFFF2F & 0x75FA;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[18] = 58 + 106 - 26 + 63 ^ 105 + 62 - 44 + 72;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[19] = 33 + 69 - -13 + 27 ^ 44 + 102 - 87 + 74;
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.var1[20] = 56 + 19 - 29 + 157 ^ 30 + 16 - -4 + 149;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bi() {
        return var1[0];
    }

    private static boolean var14(int n2, int n3) {
        return n2 <= n3;
    }
}

