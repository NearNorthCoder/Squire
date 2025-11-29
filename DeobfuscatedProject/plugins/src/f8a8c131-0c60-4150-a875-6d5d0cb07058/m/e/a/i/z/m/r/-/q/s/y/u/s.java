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
import m.e.a.i.z.m.r.-.q.s.y.u.k;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
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
public class s
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
        Iterator<Prayer> llllllllllllllIllIIlIIllIllIlIIl = list.iterator();
        while (s.llIIIllIIIllllI(llllllllllllllIllIIlIIllIllIlIIl.hasNext() ? 1 : 0)) {
            void llllllllllllllIllIIlIIllIllIlIll;
            Prayer llllllllllllllIllIIlIIllIllIlIII = llllllllllllllIllIIlIIllIllIlIIl.next();
            if (s.llIIIllIIlIIlII(llllllllllllllIllIIlIIllIllIlIII, Prayer.PROTECT_ITEM)) {
                "".length();
                if (((0x72 ^ 0x39) & ~(0x42 ^ 9)) == 0) continue;
                return ((0x48 ^ 0x44) & ~(0xCE ^ 0xC2)) != 0;
            }
            if (!s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)llllllllllllllIllIIlIIllIllIlIII) ? 1 : 0) || s.llIIIllIIIllllI((int)llllllllllllllIllIIlIIllIllIlIll)) {
                Widget llllllllllllllIllIIlIIllIllIIlll = Widgets.get((WidgetInfo)llllllllllllllIllIIlIIllIllIlIII.getWidgetInfo());
                if (s.llIIIllIIlIIlIl(llllllllllllllIllIIlIIllIllIIlll)) {
                    "".length();
                    if ("  ".length() == "  ".length()) continue;
                    return ((0x69 ^ 0x77) & ~(0x7D ^ 0x63)) != 0;
                }
                WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllIIlIIllIllIIlll);
                "".length();
                if ("   ".length() < " ".length()) {
                    return ((0x36 ^ 0x6A ^ (0xE9 ^ 0x80)) & (0x7A ^ 0x13 ^ (7 ^ 0x5B) ^ -" ".length())) != 0;
                }
            } else if (s.llIIIllIIIlllIl(Prayers.isEnabled((Prayer)llllllllllllllIllIIlIIllIllIlIII) ? 1 : 0)) {
                int llllllllllllllIllIIlIIllIllIlIlI = lIllIIlIllIlI[2];
            }
            "".length();
            if (((0x59 ^ 0x39) & ~(0xC2 ^ 0xA2)) == 0) continue;
            return ((0x55 ^ 0x11) & ~(0x1F ^ 0x5B)) != 0;
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
        Widget llllllllllllllIllIIlIIlllIIIIIll;
        s llllllllllllllIllIIlIIlllIIIlIll;
        if (s.llIIIllIIIlllIl(this.ab.B() ? 1 : 0)) {
            return lIllIIlIllIlI[1];
        }
        int llllllllllllllIllIIlIIlllIIIlIlI = Static.getClient().getTickCount();
        Prayer llllllllllllllIllIIlIIlllIIIlIIl = llllllllllllllIllIIlIIlllIIIlIll.ac.a(lIllIIlIllIlI[1], llllllllllllllIllIIlIIlllIIIlIll.ab.A());
        Prayer llllllllllllllIllIIlIIlllIIIlIII = llllllllllllllIllIIlIIlllIIIlIll.ac.a(lIllIIlIllIlI[2], llllllllllllllIllIIlIIlllIIIlIll.ab.A());
        if (s.llIIIllIIIllllI(llllllllllllllIllIIlIIlllIIIlIll.ab.A() ? 1 : 0)) {
            if (s.llIIIllIIIlllIl(llllllllllllllIllIIlIIlllIIIlIll.ab.G() ? 1 : 0)) {
                llllllllllllllIllIIlIIlllIIIlIII = Prayer.PROTECT_FROM_MELEE;
                "".length();
                if (((0x95 ^ 0x99) & ~(0x24 ^ 0x28)) >= "   ".length()) {
                    return ((0xA1 ^ 0x85) & ~(0x20 ^ 4)) != 0;
                }
            } else if (s.llIIIllIIIllllI(llllllllllllllIllIIlIIlllIIIlIll.ab.G() ? 1 : 0) && s.llIIIllIIIlllll(llllllllllllllIllIIlIIlllIIIlIll.ae, lIllIIlIllIlI[0])) {
                llllllllllllllIllIIlIIlllIIIlIll.ae = llllllllllllllIllIIlIIlllIIIlIlI;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return ((0x5D ^ 0x75) & ~(0x80 ^ 0xA8)) != 0;
                }
            } else if (s.llIIIllIIlIIIII(llllllllllllllIllIIlIIlllIIIlIlI - llllllllllllllIllIIlIIlllIIIlIll.ae, lIllIIlIllIlI[3])) {
                llllllllllllllIllIIlIIlllIIIlIII = Prayer.PROTECT_FROM_MELEE;
            }
        }
        Prayer[] llllllllllllllIllIIlIIlllIIIIlll = llllllllllllllIllIIlIIlllIIIlIll.ad.rangePrayer().a();
        Item llllllllllllllIllIIlIIlllIIIIllI = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        Prayer llllllllllllllIllIIlIIlllIIIIlIl = llllllllllllllIllIIlIIlllIIIlIll.ad.magePrayer().a()[lIllIIlIllIlI[1]];
        if (s.llIIIllIIIllllI(llllllllllllllIllIIlIIlllIIIlIll.a(llllllllllllllIllIIlIIlllIIIIllI.getId()) ? 1 : 0)) {
            llllllllllllllIllIIlIIlllIIIIlll = llllllllllllllIllIIlIIlllIIIlIll.ad.magePrayer().a();
            llllllllllllllIllIIlIIlllIIIIlIl = llllllllllllllIllIIlIIlllIIIlIll.ad.rangePrayer().a()[lIllIIlIllIlI[1]];
        }
        ArrayList<Prayer> llllllllllllllIllIIlIIlllIIIIlII = new ArrayList<Prayer>(List.of(llllllllllllllIllIIlIIlllIIIIlll));
        llllllllllllllIllIIlIIlllIIIIlII.add(llllllllllllllIllIIlIIlllIIIlIII);
        "".length();
        if (s.llIIIllIIlIIIIl(llllllllllllllIllIIlIIlllIIIlIIl) && s.llIIIllIIlIIIlI(llllllllllllllIllIIlIIlllIIIlIIl, llllllllllllllIllIIlIIlllIIIlIII) && s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)llllllllllllllIllIIlIIlllIIIlIIl) ? 1 : 0)) {
            llllllllllllllIllIIlIIlllIIIIIll = Widgets.get((WidgetInfo)llllllllllllllIllIIlIIlllIIIlIIl.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllIIlIIlllIIIIIll);
        }
        if (s.llIIIllIIIllllI(Prayers.isEnabled((Prayer)llllllllllllllIllIIlIIlllIIIIlIl) ? 1 : 0)) {
            llllllllllllllIllIIlIIlllIIIIIll = Widgets.get((WidgetInfo)llllllllllllllIllIIlIIlllIIIIlIl.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)llllllllllllllIllIIlIIlllIIIIIll);
        }
        if (s.llIIIllIIIllllI(llllllllllllllIllIIlIIlllIIIlIll.a(llllllllllllllIllIIlIIlllIIIIlII, lIllIIlIllIlI[1]) ? 1 : 0)) {
            llllllllllllllIllIIlIIlllIIIlIll.sleep(lIllIIlIllIlI[2]);
        }
        this.a((List<Prayer>)var7_7, lIllIIlIllIlI[2]);
        "".length();
        return lIllIIlIllIlI[2];
    }

    private static boolean llIIIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIllIIIlllII() {
        lIllIIlIllIlI = new int[4];
        s.lIllIIlIllIlI[0] = -" ".length();
        s.lIllIIlIllIlI[1] = (0x80 ^ 0xC5 ^ (0xA7 ^ 0xA8)) & (0xA ^ 0x2F ^ (0xAC ^ 0xC3) ^ -" ".length());
        s.lIllIIlIllIlI[2] = " ".length();
        s.lIllIIlIllIlI[3] = 0x18 ^ 0xC;
    }

    private int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (s.llIIIllIIlIIIIl(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            "".length();
            if (((0xCE ^ 0x8E ^ (0x62 ^ 4)) & (138 + 108 - 216 + 153 ^ 21 + 32 - 5 + 97 ^ -" ".length())) >= " ".length()) {
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
        void llllllllllllllIllIIlIIllIllllIIl;
        int[] nArray = this.a(this.ad.mageGear());
        int n3 = nArray.length;
        int llllllllllllllIllIIlIIllIllllIII = lIllIIlIllIlI[1];
        while (s.llIIIllIIlIIIll(llllllllllllllIllIIlIIllIllllIII, (int)llllllllllllllIllIIlIIllIllllIIl)) {
            void llllllllllllllIllIIlIIllIllllIll;
            void llllllllllllllIllIIlIIllIllllIlI;
            void llllllllllllllIllIIlIIllIlllIlll = llllllllllllllIllIIlIIllIllllIlI[llllllllllllllIllIIlIIllIllllIII];
            if (s.llIIIllIIIlllll((int)llllllllllllllIllIIlIIllIlllIlll, (int)llllllllllllllIllIIlIIllIllllIll)) {
                return lIllIIlIllIlI[2];
            }
            ++llllllllllllllIllIIlIIllIllllIII;
            "".length();
            if ("  ".length() >= 0) continue;
            return ((0xF ^ 0x74 ^ (0xF6 ^ 0x81)) & (0x90 ^ 0xA0 ^ (7 ^ 0x3B) ^ -" ".length())) != 0;
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

