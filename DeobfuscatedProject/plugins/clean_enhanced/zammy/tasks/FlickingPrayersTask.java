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
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
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
        this.ae = 0;
        this.ab = l2;
        this.ac = k2;
        this.ad = squireZammyConfig;
    }

    static {
        s.var2();
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(List<Prayer> list, boolean bl) {
        boolean bl2 = 1;
        Iterator<Prayer> var3 = list.iterator();
        while ((var3.hasNext( != 0) ? 1 : 0)) {
            void var4;
            Prayer var5 = var3.next();
            if (var5 == llllllllllllllIllIIlIIllIllIlIII2) {
                0;
                if (((0x72 ^ 0x39) & ~(0x42 ^ 9)) == 0) continue;
                return ((0x48 ^ 0x44) & ~(0xCE ^ 0xC2)) != 0;
            }
            if (!(Prayers.isEnabled((Prayer == 0)var5) ? 1 : 0) || (intllllllllllllllIllIIlIIllIllIlIll)) {
                Widget var6 = Widgets.get((WidgetInfo)var5.getWidgetInfo());
                if var6 == null {
                    0;
                    if (2 == 2) continue;
                    return ((0x69 ^ 0x77) & ~(0x7D ^ 0x63)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)var6);
                0;
                if (3 < 1) {
                    return ((0x36 ^ 0x6A ^ (0xE9 ^ 0x80)) & (0x7A ^ 0x13 ^ (7 ^ 0x5B) ^ -1)) != 0;
                }
            } else if ((Prayers.isEnabled((Prayer == 0)var5) ? 1 : 0)) {
                int var7 = 2;
            }
            0;
            if (((0x59 ^ 0x39) & ~(0xC2 ^ 0xA2)) == 0) continue;
            return ((0x55 ^ 0x11) & ~(0x1F ^ 0x5B)) != 0;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_7;
        Widget var8;
        s var9;
        if ((this.ab.B( == 0) ? 1 : 0)) {
            return 1;
        }
        int var10 = Static.getClient().getTickCount();
        Prayer var11 = var9.ac.a(1, var9.ab.A());
        Prayer var12 = var9.ac.a(2, var9.ab.A());
        if ((var9.ab.A( != 0) ? 1 : 0)) {
            if ((var9.ab.G( == 0) ? 1 : 0)) {
                var12 = Prayer.PROTECT_FROM_MELEE;
                0;
                if (((0x95 ^ 0x99) & ~(0x24 ^ 0x28)) >= 3) {
                    return ((0xA1 ^ 0x85) & ~(0x20 ^ 4)) != 0;
                }
            } else if ((var9.ab.G( != 0) ? 1 : 0) && (var9.ae == 0)) {
                var9.ae = var10;
                0;
                if (-1 > 3) {
                    return ((0x5D ^ 0x75) & ~(0x80 ^ 0xA8)) != 0;
                }
            } else if (var10 - var9.ae <= 3) {
                var12 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        Prayer[] var13 = var9.ad.rangePrayer().a();
        Item var14 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        Prayer var15 = var9.ad.magePrayer().a()[1];
        if ((var9.a(var14.getId( != 0)) ? 1 : 0)) {
            var13 = var9.ad.magePrayer().a();
            var15 = var9.ad.rangePrayer().a()[1];
        }
        ArrayList<Prayer> var16 = new ArrayList<Prayer>(List.of(var13));
        var16.add(var12);
        0;
        if (var11 != null && (var11 != llllllllllllllIllIIlIIlllIIIlIIl2) && (Prayers.isEnabled(PrayerllllllllllllllIllIIlIIlllIIIlIIl) ? 1 : 0)) {
            var8 = Widgets.get((WidgetInfo)var11.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var8);
        }
        if ((Prayers.isEnabled(PrayerllllllllllllllIllIIlIIlllIIIIlIl) ? 1 : 0)) {
            var8 = Widgets.get((WidgetInfo)var15.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var8);
        }
        if ((var9.a(var16, 1 != 0) ? 1 : 0)) {
            var9.sleep(2);
        }
        this.a((List<Prayer>)var7_7, 2);
        0;
        return 2;
    }

    private int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if equipmentSetup != null {
            nArray = equipmentSetup.getIds();
            0;
            if (((0xCE ^ 0x8E ^ (0x62 ^ 4)) & (138 + 108 - 216 + 153 ^ 21 + 32 - 5 + 97 ^ -1)) >= 1) {
                return null;
            }
        } else {
            nArray = new int[1];
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void var17;
        int[] nArray = this.a(this.ad.mageGear());
        int n3 = nArray.length;
        int var18 = 1;
        while ((var18 < (int)var17)) {
            void var19;
            void var20;
            void var21 = var20[var18];
            if (((int)var21 == (int)var19)) {
                return 2;
            }
            ++var18;
            0;
            
            return ((0xF ^ 0x74 ^ (0xF6 ^ 0x81)) & (0x90 ^ 0xA0 ^ (7 ^ 0x3B) ^ -1)) != 0;
        }
        return 1;
    }

}

