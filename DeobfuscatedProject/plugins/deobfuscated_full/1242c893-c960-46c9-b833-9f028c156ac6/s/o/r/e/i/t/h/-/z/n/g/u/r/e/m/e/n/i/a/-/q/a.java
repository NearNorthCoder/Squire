/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@Singleton
public class a {
    private static /* synthetic */ int[] lIIIlIIlIIIll;
    private final /* synthetic */ SquireNightmareZoneConfig j;

    @Inject
    public a(SquireNightmareZoneConfig squireNightmareZoneConfig) {
        this.j = squireNightmareZoneConfig;
    }

    private static boolean lIIllllIllIlIIl(Object object) {
        return object != null;
    }

    private static void lIIllllIllIlIII() {
        lIIIlIIlIIIll = new int[1];
        a.lIIIlIIlIIIll[0] = (4 ^ 0xC ^ (0xCF ^ 0xA5)) & (0x83 ^ 0xBC ^ (0xC8 ^ 0x95) ^ -1);
    }

    public int[] i() {
        return this.a(this.j.specGear());
    }

    static {
        a.lIIllllIllIlIII();
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (a.lIIllllIllIlIIl(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (((36 + 26 - 12 + 88 ^ 42 + 129 - 36 + 15) & (0x6B ^ 0x59 ^ (9 ^ 0x27) ^ -1)) != 0) {
                return null;
            }
        } else {
            nArray = new int[lIIIlIIlIIIll[0]];
        }
        return nArray;
    }
}

