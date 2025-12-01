package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Flicking prayers", priority = 25)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.s  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/s.class */
public class s extends Task {
    private final /* synthetic */ l ab;
    private final /* synthetic */ SquireZammyConfig ad;
    private final /* synthetic */ k ac;
    private static /* synthetic */ int[] lIllIIlIllIlI;
    private /* synthetic */ int ae = lIllIIlIllIlI[0];

    @Inject
    public s(l lVar, k kVar, SquireZammyConfig squireZammyConfig) {
        this.ab = lVar;
        this.ac = kVar;
        this.ad = squireZammyConfig;
    }

    static {
        llIIIllIIIlllII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(List<Prayer> list, boolean z) {
        int i = lIllIIlIllIlI[1];
        for (Prayer prayer : list) {
            if (llIIIllIIlIIlII(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                if (llIIIllIIIlllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    int llllllllllllllIllIIlIIllIllIlIll = z ? 1 : 0;
                    if (!llIIIllIIIllllI(llllllllllllllIllIIlIIllIllIlIll)) {
                        if (llIIIllIIIlllIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                            i = lIllIIlIllIlI[2];
                        }
                        "".length();
                        if (!((true ^ true) & ((true ^ true) ^ true))) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    }
                }
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (llIIIllIIlIIlIl(widget)) {
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return ((54 ^ 106) ^ (233 ^ 128)) & (((122 ^ 19) ^ (7 ^ 91)) ^ (-" ".length()));
                    }
                    "".length();
                    if (!((true ^ true) & ((true ^ true) ^ true))) {
                    }
                }
            }
        }
        return i;
    }

    private static boolean llIIIllIIlIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIllIIIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIllIIlIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIIIllIIlIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIIIlllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public boolean run() {
        if (llIIIllIIIlllIl(this.ab.B() ? 1 : 0)) {
            return lIllIIlIllIlI[1];
        }
        int tickCount = Static.getClient().getTickCount();
        Prayer a = this.ac.a(lIllIIlIllIlI[1], this.ab.A());
        Prayer a2 = this.ac.a(lIllIIlIllIlI[2], this.ab.A());
        if (llIIIllIIIllllI(this.ab.A() ? 1 : 0)) {
            if (llIIIllIIIlllIl(this.ab.G() ? 1 : 0)) {
                a2 = Prayer.PROTECT_FROM_MELEE;
                "".length();
                if (((149 ^ 153) & ((36 ^ 40) ^ (-1))) >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (llIIIllIIIllllI(this.ab.G() ? 1 : 0) && llIIIllIIIlllll(this.ae, lIllIIlIllIlI[0])) {
                this.ae = tickCount;
                "".length();
                if ((-" ".length()) > "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (llIIIllIIlIIIII(tickCount - this.ae, lIllIIlIllIlI[3])) {
                a2 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        Prayer[] a3 = this.ad.rangePrayer().a();
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        Prayer prayer = this.ad.magePrayer().a()[lIllIIlIllIlI[1]];
        if (llIIIllIIIllllI(a(fromSlot.getId()) ? 1 : 0)) {
            a3 = this.ad.magePrayer().a();
            prayer = this.ad.rangePrayer().a()[lIllIIlIllIlI[1]];
        }
        ArrayList arrayList = new ArrayList(List.of((Object[]) a3));
        arrayList.add(a2);
        "".length();
        if (llIIIllIIlIIIIl(a) && llIIIllIIlIIIlI(a, a2) && llIIIllIIIllllI(Prayers.isEnabled(a) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(Widgets.get(a.getWidgetInfo()));
        }
        if (llIIIllIIIllllI(Prayers.isEnabled(prayer) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption(Widgets.get(prayer.getWidgetInfo()));
        }
        if (llIIIllIIIllllI(a(arrayList, lIllIIlIllIlI[1]) ? 1 : 0)) {
            sleep(lIllIIlIllIlI[2]);
        }
        a(arrayList, lIllIIlIllIlI[2]);
        "".length();
        return lIllIIlIllIlI[2];
    }

    private static boolean llIIIllIIlIIIII(int i, int i2) {
        return i <= i2;
    }

    private static void llIIIllIIIlllII() {
        lIllIIlIllIlI = new int[4];
        lIllIIlIllIlI[0] = -" ".length();
        lIllIIlIllIlI[1] = ((128 ^ 197) ^ (167 ^ 168)) & (((10 ^ 47) ^ (172 ^ 195)) ^ (-" ".length()));
        lIllIIlIllIlI[2] = " ".length();
        lIllIIlIllIlI[3] = 24 ^ 12;
    }

    private int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (llIIIllIIlIIIIl(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if ((((206 ^ 142) ^ (98 ^ 4)) & (((((138 + 108) - 216) + 153) ^ (((21 + 32) - 5) + 97)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
            return ids;
        }
        return new int[lIllIIlIllIlI[1]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(int i) {
        int[] a = a(this.ad.mageGear());
        int length = a.length;
        int i2 = lIllIIlIllIlI[1];
        while (llIIIllIIlIIIll(i2, length)) {
            if (llIIIllIIIlllll(a[i2], i)) {
                return lIllIIlIllIlI[2];
            }
            i2++;
            "".length();
            if ("  ".length() < 0) {
                return ((15 ^ 116) ^ (246 ^ 129)) & (((144 ^ 160) ^ (7 ^ 59)) ^ (-" ".length()));
            }
        }
        return lIllIIlIllIlI[1];
    }

    private static boolean llIIIllIIlIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIllIIIllllI(int i) {
        return i != 0;
    }

    private static boolean llIIIllIIlIIlIl(Object obj) {
        return obj == null;
    }
}
