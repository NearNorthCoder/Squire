/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Disabling prayers", priority=100)
public class DisablingPrayersTask
extends ag {

    @Inject
    protected DisablingPrayersTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        ae.var2();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var3;
        boolean bl = 0;
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int var4 = 0;
        while ((var4 < (int)var3)) {
            void var5;
            void var6 = var5[var4];
            if ((Prayers.isEnabled(PrayerllllllllllllllIllIIIlllIIllllllI) ? 1 : 0)) {
                Prayers.toggle((Prayer)var6);
                int var7 = 1;
            }
            ++var4;
            0;
            if (1 != 0) continue;
            return ((0x22 ^ 0x36) & ~(0x34 ^ 0x20)) != 0;
        }
        return bl;
    }

}

