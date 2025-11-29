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

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Disabling prayers", priority=100)
public class DisablingPrayersTask
extends ZulrahTaskBase {

    private static boolean llIIIlllllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected DisablingPrayersTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        ae.llIIIlllllIlIlI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var1;
        boolean bl = lIllIlIIlllll[0];
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int var2 = lIllIlIIlllll[0];
        while (ae.llIIIlllllIlIll(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (ae.llIIIlllllIllII(Prayers.isEnabled((Prayer)var4) ? 1 : 0)) {
                Prayers.toggle((Prayer)var4);
                int var5 = lIllIlIIlllll[1];
            }
            ++var2;

            if (1 != 0) continue;
            return false;
        }
        return bl;
    }

    private static boolean llIIIlllllIllII(int n2) {
        return n2 != 0;
    }
}

