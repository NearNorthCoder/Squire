/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping gear (deathwalk)", priority=0x7FFFFFFF, blocking=true)
public class R
extends P {
    private static /* synthetic */ int[] lIlllIIIIIlII;
    private final /* synthetic */ t ap;

    private static boolean llIIlIlIIIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void llIIlIlIIIllIIl() {
        lIlllIIIIIlII = new int[3];
        R.lIlllIIIIIlII[0] = (0x56 ^ 0x6C) & ~(0x26 ^ 0x1C);
        R.lIlllIIIIIlII[1] = " ".length();
        R.lIlllIIIIIlII[2] = 0xFFFFB9FF & 0x4FF6;
    }

    @Override
    public boolean ac() {
        if (R.llIIlIlIIIllIlI(Inventory.contains(item -> IntStream.of(this.ap.O()).anyMatch(n2 -> {
            int n3;
            if (R.llIIlIlIIIllIll(n2, item.getId()) && R.llIIlIlIIIlllII(n2, lIlllIIIIIlII[2])) {
                n3 = lIlllIIIIIlII[1];
                "".length();
                if (null != null) {
                    return ((0x9D ^ 0xB1 ^ (0x18 ^ 0xD)) & (0x8A ^ 0x9F ^ (0xAA ^ 0x86) ^ -" ".length())) != 0;
                }
            } else {
                n3 = lIlllIIIIIlII[0];
            }
            return n3 != 0;
        })) ? 1 : 0)) {
            return lIlllIIIIIlII[0];
        }
        this.ap.a(this.ap.O());
        "".length();
        return lIlllIIIIIlII[1];
    }

    static {
        R.llIIlIlIIIllIIl();
    }

    @Inject
    public R(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, t t2) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
        this.ap = t2;
    }

    private static boolean llIIlIlIIIllIll(int n2, int n3) {
        return n2 == n3;
    }
}

