/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.nightmarezone.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@Singleton
public class AHelper {
    
    private final  SquireNightmareZoneConfig j;

    @Inject
    public AHelper(SquireNightmareZoneConfig squireNightmareZoneConfig) {
        this.j = squireNightmareZoneConfig;
    }

    private static boolean lIIllllIllIlIIl(Object object) {
        return object != null;
    }

    public int[] i() {
        return this.AHelper(this.j.specGear());
    }

    static {
        a.lIIllllIllIlIII();
    }

    public int[] AHelper(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (a.lIIllllIllIlIIl(equipmentSetup)) {
            nArray = equipmentSetup.getIds();

            if (((36 + 26 - 12 + 88 ^ 42 + 129 - 36 + 15) & (0x6B ^ 0x59 ^ (9 ^ 0x27) ^ -1)) != 0) {
                return null;
            }
        } else {
            nArray = new int[lIIIlIIlIIIll[0]];
        }
        return nArray;
    }
}

