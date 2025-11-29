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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.e.a.i.z.m.r.-.q.s.y.u.k_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
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

/* TASK: Flicking prayers -> PrayerFlickingTask */
@TaskDesc(name="Flicking prayers", priority=25)
public class FlickingPrayersTask
extends Task {
    private final /* synthetic */ l ab;
    private final /* synthetic */ SquireZammyConfig ad;
    private final /* synthetic */ k ac;
    private static /* synthetic */ int[] lIllIIlIllIlI;
    private /* synthetic */ int ae;

    @Inject
    public s(l l2, k k2, SquireZammyConfig squireZammyConfig) {
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
        Iterator<Prayer> var8 = list.iterator();
        while (s.llIIIllIIIllllI(var8.hasNext() ? 1 : 0)) {
            void var18;
            Prayer var2 = var8.next();
            if (s.llIIIllIIlIIlII(var2, Prayer.PROTECT_ITEM)) {
                0;
                if (((0x72 ^ 0x39) & ~(0x42 ^ 9)) == 0) continue;
                return false;
            }
            if (!s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)var2) ? 1 : 0) || s.llIIIllIIIllllI((int)var18)) {
                Widget var4 = Widgets.get((WidgetInfo)var2.getWidgetInfo());
                if (s.llIIIllIIlIIlIl(var4)) {
                    0;
                    if (2 == 2) continue;
                    return false;
                }
                WidgetPackets.widgetFirstOption((Widget)var4);
                0;
                if (3 < 1) {
                    return ((0x36 ^ 0x6A ^ (0xE9 ^ 0x80)) & (0x7A ^ 0x13 ^ (7 ^ 0x5B) ^ -1)) != 0;
                }
            } else if (s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)var2) ? 1 : 0)) {
                int llllllllllllllIllIIlIIllIllIlIlI = lIllIIlIllIlI[2];
            }
            0;
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
        Widget var12;
        s var9;
        if (s.llIIIllIIIlllIl(this.ab.B() ? 1 : 0)) {
            return lIllIIlIllIlI[1];
        }
        int var11 = Static.getClient().getTickCount();
        Prayer var5 = var9.ac.a(lIllIIlIllIlI[1], var9.ab.A());
        Prayer var6 = var9.ac.a(lIllIIlIllIlI[2], var9.ab.A());
        if (s.llIIIllIIIllllI(var9.ab.A() ? 1 : 0)) {
            if (s.llIIIllIIIlllIl(var9.ab.G() ? 1 : 0)) {
                var6 = Prayer.PROTECT_FROM_MELEE;
                0;
                if (((0x95 ^ 0x99) & ~(0x24 ^ 0x28)) >= 3) {
                    return false;
                }
            } else if (s.llIIIllIIIllllI(var9.ab.G() ? 1 : 0) && s.llIIIllIIIlllll(var9.ae, lIllIIlIllIlI[0])) {
                var9.ae = var11;
                0;
                if (-1 > 3) {
                    return false;
                }
            } else if (s.llIIIllIIlIIIII(var11 - var9.ae, lIllIIlIllIlI[3])) {
                var6 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        Prayer[] var7 = var9.ad.rangePrayer().a();
        Item var17 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        Prayer var15 = var9.ad.magePrayer().a()[lIllIIlIllIlI[1]];
        if (s.llIIIllIIIllllI(var9.a(var17.getId()) ? 1 : 0)) {
            var7 = var9.ad.magePrayer().a();
            var15 = var9.ad.rangePrayer().a()[lIllIIlIllIlI[1]];
        }
        ArrayList<Prayer> var14 = new ArrayList<Prayer>(List.of(var7));
        var14.add(var6);
        0;
        if (s.llIIIllIIlIIIIl(var5) && s.llIIIllIIlIIIlI(var5, var6) && s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)var5) ? 1 : 0)) {
            var12 = Widgets.get((WidgetInfo)var5.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var12);
        }
        if (s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)var15) ? 1 : 0)) {
            var12 = Widgets.get((WidgetInfo)var15.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)var12);
        }
        if (s.llIIIllIIIllllI(var9.a(var14, lIllIIlIllIlI[1]) ? 1 : 0)) {
            var9.sleep(lIllIIlIllIlI[2]);
        }
        this.a((List<Prayer>)var7_7, lIllIIlIllIlI[2]);
        0;
        return lIllIIlIllIlI[2];
    }

    private static boolean llIIIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIllIIIlllII() {
        lIllIIlIllIlI = new int[4];
        s.lIllIIlIllIlI[0] = -1;
        s.lIllIIlIllIlI[1] = (0x80 ^ 0xC5 ^ (0xA7 ^ 0xA8)) & (0xA ^ 0x2F ^ (0xAC ^ 0xC3) ^ -1);
        s.lIllIIlIllIlI[2] = 1;
        s.lIllIIlIllIlI[3] = 0x18 ^ 0xC;
    }

    private int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (s.llIIIllIIlIIIIl(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
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
        void var13;
        int[] nArray = this.a(this.ad.mageGear());
        int n3 = nArray.length;
        int var10 = lIllIIlIllIlI[1];
        while (s.llIIIllIIlIIIll(var10, (int)var13)) {
            void var1;
            void var16;
            void var3 = var16[var10];
            if (s.llIIIllIIIlllll((int)var3, (int)var1)) {
                return lIllIIlIllIlI[2];
            }
            ++var10;
            0;
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

