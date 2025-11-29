/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import gg.squire.zammy.tasks.KHelper;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    private final  l ab;
    private final  SquireZammyConfig ad;
    private final  k ac;
    
    private  int ae;

    @Inject
    public FlickingPrayersTask(l l2, k k2, SquireZammyConfig squireZammyConfig) {
        this.ae = lIllIIlIllIlI[0];
        this.ab = l2;
        this.ac = k2;
        this.ad = squireZammyConfig;
    }

    static {
        s.llIIIllIIIlllII();
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = lIllIIlIllIlI[1];
        Iterator<Prayer> var1 = list.iterator();
        while (s.llIIIllIIIllllI(var1.hasNext() ? 1 : 0)) {
            void var2;
            Prayer var3 = var1.next();
            if (s.llIIIllIIlIIlII(var3, Prayer.PROTECT_ITEM)) {

                if (((0x72 ^ 0x39) & ~(0x42 ^ 9)) == 0) continue;
                return false;
            }
            if (!s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0) || s.llIIIllIIIllllI((int)var2)) {
                Widget var4 = Widgets.get((WidgetInfo)var3.getWidgetInfo());
                if (s.llIIIllIIlIIlIl(var4)) {

                    if (2 == 2) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var4);

                if (3 < 1) {
                    return ((0x36 ^ 0x6A ^ (0xE9 ^ 0x80)) & (0x7A ^ 0x13 ^ (7 ^ 0x5B) ^ -1)) != 0;
                }
            } else if (s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)var3) ? 1 : 0)) {
                int var5 = lIllIIlIllIlI[2];
            }

            if (((0x59 ^ 0x39) & ~(0xC2 ^ 0xA2)) == 0) continue;
            return false;
        }
        return bl2;
    }

    private static boolean llIIIllIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIllIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIllIIlIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIIllIIlIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIIIllIIIlllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_7;
        Widget var6;
        s var7;
        if (s.llIIIllIIIlllIl(this.ab.B() ? 1 : 0)) {
            return lIllIIlIllIlI[1];
        }
        int var8 = Static.getClient().getTickCount();
        Prayer var9 = var7.ac.a(lIllIIlIllIlI[1], var7.ab.A());
        Prayer var10 = var7.ac.a(lIllIIlIllIlI[2], var7.ab.A());
        if (s.llIIIllIIIllllI(var7.ab.A() ? 1 : 0)) {
            if (s.llIIIllIIIlllIl(var7.ab.G() ? 1 : 0)) {
                var10 = Prayer.PROTECT_FROM_MELEE;

                if (((0x95 ^ 0x99) & ~(0x24 ^ 0x28)) >= 3) {
                    return false;
                }
            } else if (s.llIIIllIIIllllI(var7.ab.G() ? 1 : 0) && s.llIIIllIIIlllll(var7.ae, lIllIIlIllIlI[0])) {
                var7.ae = var8;

                if (-1 > 3) {
                    return false;
                }
            } else if (s.llIIIllIIlIIIII(var8 - var7.ae, lIllIIlIllIlI[3])) {
                var10 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        Prayer[] var11 = var7.ad.rangePrayer().a();
        Item var12 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        Prayer var13 = var7.ad.magePrayer().a()[lIllIIlIllIlI[1]];
        if (s.llIIIllIIIllllI(var7.a(var12.getId()) ? 1 : 0)) {
            var11 = var7.ad.magePrayer().a();
            var13 = var7.ad.rangePrayer().a()[lIllIIlIllIlI[1]];
        }
        ArrayList<Prayer> var14 = new ArrayList<Prayer>(List.of(var11));
        var14.add(var10);

        if (s.llIIIllIIlIIIIl(var9) && s.llIIIllIIlIIIlI(var9, var10) && s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)var9) ? 1 : 0)) {
            var6 = Widgets.get((WidgetInfo)var9.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var6);
        }
        if (s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)var13) ? 1 : 0)) {
            var6 = Widgets.get((WidgetInfo)var13.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var6);
        }
        if (s.llIIIllIIIllllI(var7.a(var14, lIllIIlIllIlI[1]) ? 1 : 0)) {
            var7.sleep(lIllIIlIllIlI[2]);
        }
        this.a((List<Prayer>)var7_7, lIllIIlIllIlI[2]);

        return lIllIIlIllIlI[2];
    }

    private static boolean llIIIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (s.llIIIllIIlIIIIl(equipmentSetup)) {
            nArray = equipmentSetup.getIds();

            if (((0xCE ^ 0x8E ^ (0x62 ^ 4)) & (138 + 108 - 216 + 153 ^ 21 + 32 - 5 + 97 ^ -1)) >= 1) {
                return null;
            }
        } else {
            nArray = new int[lIllIIlIllIlI[1]];
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var15;
        int[] nArray = this.a(this.ad.mageGear());
        int n3 = nArray.length;
        int var16 = lIllIIlIllIlI[1];
        while (s.llIIIllIIlIIIll(var16, (int)var15)) {
            void var17;
            void var18;
            void var19 = var18[var16];
            if (s.llIIIllIIIlllll((int)var19, (int)var17)) {
                return lIllIIlIllIlI[2];
            }
            ++var16;

            if (2 >= 0) continue;
            return ((0xF ^ 0x74 ^ (0xF6 ^ 0x81)) & (0x90 ^ 0xA0 ^ (7 ^ 0x3B) ^ -1)) != 0;
        }
        return lIllIIlIllIlI[1];
    }

    private static boolean llIIIllIIlIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIllIIIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIlIIlIl(Object object) {
        return object == null;
    }
}

