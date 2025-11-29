package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@Singleton
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.a  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/a.class */
public class a {
    private static /* synthetic */ int[] lIIIlIIlIIIll;
    private final /* synthetic */ SquireNightmareZoneConfig j;

    @Inject
    public a(SquireNightmareZoneConfig squireNightmareZoneConfig) {
        this.j = squireNightmareZoneConfig;
    }

    private static boolean lIIllllIllIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIIllllIllIlIII() {
        lIIIlIIlIIIll = new int[1];
        lIIIlIIlIIIll[0] = ((4 ^ 12) ^ (207 ^ 165)) & (((131 ^ 188) ^ (200 ^ 149)) ^ (-" ".length()));
    }

    public int[] i() {
        return a(this.j.specGear());
    }

    static {
        lIIllllIllIlIII();
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIIllllIllIlIIl(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if ((((((36 + 26) - 12) + 88) ^ (((42 + 129) - 36) + 15)) & (((107 ^ 89) ^ (9 ^ 39)) ^ (-" ".length()))) != 0) {
                return null;
            }
            return ids;
        }
        return new int[lIIIlIIlIIIll[0]];
    }
}
