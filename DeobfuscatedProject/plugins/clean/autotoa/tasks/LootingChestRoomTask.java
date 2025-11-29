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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Looting chest room", priority=1000, blocking=true)
public class LootingChestRoomTask
extends AutotoaTaskBase {
    private static final  int ey;
    private  boolean eA;
    
    private static final  int ez;
    private static final  int ew;
    
    private static final  int ex;

    @Override
    public boolean bj() {
        int n2;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[19]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];

                    if (-1 == -1) return n2 != 0;
                    return (2 & ~2) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        })) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(this.eA ? 1 : 0)) {
            n2 = llIlIllIIlI[1];

            if (2 < 1) {
                return ((14 + 59 - -69 + 29 ^ 58 + 63 - 6 + 58) & (0 ^ 0x3E ^ (0x55 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = llIlIllIIlI[2];
        }
        return n2 != 0;
    }

    @Override
    public void r() {
        this.eA = llIlIllIIlI[2];
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
        Widget widget = Widgets.get((int)llIlIllIIlI[4], (int)llIlIllIIlI[5]);
        ItemContainer itemContainer = this.cu.getItemContainer(InventoryID.TOA_REWARD_CHEST);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Widgets.isVisible((Widget)widget) ? 1 : 0) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(itemContainer)) {
            void var1;
            int var2;
            void var3;
            int n2 = llIlIllIIlI[1];
            Item[] itemArray = itemContainer.getItems();
            int n3 = itemArray.length;
            int var4 = llIlIllIIlI[2];
            while (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllIl(var4, (int)var3)) {
                void var5;
                void var6 = var5[var4];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlllI(var6.getId(), llIlIllIIlI[1])) {

                    if (3 <= 1) {
                        return false;
                    }
                } else {
                    var2 = llIlIllIIlI[2];
                }
                ++var4;

                if (2 < 3) continue;
                return false;
            }
            var7.eA = var2;
            var1.interact(llIlIllIIIl[llIlIllIIlI[2]]);
            return llIlIllIIlI[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[17])) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[18]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];

                    if (((132 + 143 - 178 + 54 ^ 14 + 177 - 135 + 137) & (0x52 ^ 0x3A ^ (0x36 ^ 8) ^ -1)) == 0) return n2 != 0;
                    return ((0xAC ^ 0xB6 ^ (0xCB ^ 0x98)) & (0x7D ^ 0x48 ^ (0x2C ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(List.of(Integer.valueOf(llIlIllIIlI[13]), Integer.valueOf(llIlIllIIlI[14]), Integer.valueOf(llIlIllIIlI[15])).contains(tileObject.getId()) ? 1 : 0)) {
                String[] stringArray = new String[llIlIllIIlI[1]];
                stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[16]];
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIllIIlI[1];

                    if (null == null) return n2 != 0;
                    return ((0x64 ^ 0x46 ^ (0x89 ^ 0xB1)) & (0x3C ^ 0x2E ^ (2 ^ 0xA) ^ -1)) != 0;
                }
            }
            n2 = llIlIllIIlI[2];
            return n2 != 0;
        });
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var2) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var5)) {
            TileObject var3 = TileObjects.getNearest(tileObject -> {
                boolean bl2;
                if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllll(tileObject.getId(), llIlIllIIlI[12])) {
                    bl2 = llIlIllIIlI[1];

                    if (1 == ((0x3E ^ 0x2C ^ (0x80 ^ 0x86)) & (29 + 106 - 72 + 106 ^ 80 + 166 - 146 + 89 ^ -1))) {
                        return ((0x5D ^ 0x55 ^ (0x80 ^ 0xAD)) & (183 + 112 - 272 + 202 ^ 86 + 14 - 92 + 188 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIllIIlI[2];
                }
                return bl2;
            });
            if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var3) && q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var3 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(llIlIllIIIl[llIlIllIIlI[11]])))) {
                return llIlIllIIlI[2];
            }
            String[] stringArray = new String[llIlIllIIlI[6]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = llIlIllIIIl[llIlIllIIlI[6]];
            var3.interact(stringArray);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(var2)) {
            var2.interact(llIlIllIIIl[llIlIllIIlI[7]]);

            if (((0x1C ^ 6 ^ (0x6B ^ 0x3A)) & (0xB ^ 0x15 ^ (0x2F ^ 0x7A) ^ -1)) > 0) {
                return ((79 + 94 - 29 + 52 ^ 108 + 35 - 104 + 153) & (0x53 ^ 0x1F ^ (0x11 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            var5.interact(llIlIllIIIl[llIlIllIIlI[5]]);
        }
        return llIlIllIIlI[1];
    }

    private static boolean lIlIIllllIllII(Object object) {
        return object != null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        int[] nArray = new int[llIlIllIIlI[1]];
        nArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIlI[3];
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIllII(TileObjects.getNearest((int[])nArray))) {
            bl2 = llIlIllIIlI[1];

            if (-1 == 3) {
                return ((0x94 ^ 0x8F ^ (0xAA ^ 0x82)) & (0x18 ^ 0x79 ^ (0x73 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl2 = llIlIllIIlI[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bn() {
        void var1_1;
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIlIllIIlI[1]];
            stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[8]];
            Dialog.chooseOption((String[])stringArray);

            this.sleep(llIlIllIIlI[8]);
            return llIlIllIIlI[1];
        }
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIlIllIIlI[1];
        }
        String[] stringArray = new String[llIlIllIIlI[1]];
        stringArray[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = llIlIllIIIl[llIlIllIIlI[9]];
        NPC var8 = NPCs.getNearest((String[])stringArray);
        if (q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIlI(var8)) {
            return llIlIllIIlI[2];
        }
        var1_1.interact(llIlIllIIIl[llIlIllIIlI[10]]);
        return llIlIllIIlI[1];
    }

    static {
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIIl();
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.lIlIIllllIlIII();
        ez = llIlIllIIlI[12];
        ey = llIlIllIIlI[5];
        ex = llIlIllIIlI[4];
        ew = llIlIllIIlI[3];
    }

        return String.valueOf(var9);
    }

    private static void lIlIIllllIlIII() {
        llIlIllIIIl = new String[llIlIllIIlI[20]];
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[2]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Bank-all";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[1]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[6]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[7]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[5]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[8]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Yes";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[9]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Osmumten";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[10]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Leave";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[11]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."sarcophagus";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[16]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Search";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[18]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
        q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIIl[q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY.llIlIllIIlI[19]] = q.-.t.a.o.u.i.-.o.u.t.e.s.a.r."Open";
    }

    private static boolean lIlIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllllIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllllIlIlI(Object object) {
        return object == null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int bi() {
        return llIlIllIIlI[0];
    }

    private static boolean lIlIIllllIlllI(int n2, int n3) {
        return n2 <= n3;
    }
}

