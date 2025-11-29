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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Disabling prayers -> DisablePrayersTask */
@TaskDesc(name="Disabling prayers", priority=100)
public class ae
extends ag {
    private static /* synthetic */ int[] lIllIlIIlllll;

    private static boolean llIIIlllllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ae(Client client, SquireZulrahConfig squireZulrahConfig) {
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
        int var3 = lIllIlIIlllll[0];
        while (ae.llIIIlllllIlIll(var3, (int)var1)) {
            void var2;
            void var4 = var2[var3];
            if (ae.llIIIlllllIllII(Prayers.isEnabled((Prayer)var4) ? 1 : 0)) {
                Prayers.toggle((Prayer)var4);
                int llllllllllllllIllIIIlllIlIIIIIlI = lIllIlIIlllll[1];
            }
            ++var3;
            0;
            if (1 != 0) continue;
            return false;
        }
        return bl;
    }

    private static void llIIIlllllIlIlI() {
        lIllIlIIlllll = new int[2];
        ae.lIllIlIIlllll[0] = (0x57 ^ 0x7E) & ~(9 ^ 0x20);
        ae.lIllIlIIlllll[1] = 1;
    }

    private static boolean llIIIlllllIllII(int n2) {
        return n2 != 0;
    }
}

