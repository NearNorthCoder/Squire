/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.r;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Swapping gear", priority=50)
public class ac
extends ad {
    private static /* synthetic */ int[] lIlllIIIIIIlI;
    private final /* synthetic */ t ay;

    private static boolean llIIlIlIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static void llIIlIlIIIlIlIl() {
        lIlllIIIIIIlI = new int[2];
        ac.lIlllIIIIIIlI[0] = " ".length();
        ac.lIlllIIIIIIlI[1] = (0xBC ^ 0x80) & ~(0xB0 ^ 0x8C);
    }

    @Override
    public boolean ac() {
        int n2;
        ac llllllllllllllIllIIIIlllIIlIllll;
        int llllllllllllllIllIIIIlllIIlIlllI;
        int n3;
        if (ac.llIIlIlIIIlIllI((Object)this.az.V().C().w(), (Object)r.MAGIC)) {
            n3 = lIlllIIIIIIlI[0];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
            }
        } else {
            n3 = lIlllIIIIIIlI[1];
        }
        if (ac.llIIlIlIIIlIlll(llllllllllllllIllIIIIlllIIlIlllI = n3) && ac.llIIlIlIIIlIlll(llllllllllllllIllIIIIlllIIlIllll.ay.a(llllllllllllllIllIIIIlllIIlIllll.ay.P()) ? 1 : 0)) {
            return lIlllIIIIIIlI[0];
        }
        if (ac.llIIlIlIIIllIII(llllllllllllllIllIIIIlllIIlIlllI) && ac.llIIlIlIIIlIlll(llllllllllllllIllIIIIlllIIlIllll.ay.a(llllllllllllllIllIIIIlllIIlIllll.ay.O()) ? 1 : 0)) {
            n2 = lIlllIIIIIIlI[0];
            "".length();
            if (((0x36 ^ 0x74 ^ (0xBC ^ 0x9C)) & ("  ".length() ^ (0xFD ^ 0x9D) ^ -" ".length())) != 0) {
                return ((222 + 189 - 222 + 46 ^ 163 + 135 - 160 + 57) & (2 + 53 - -6 + 69 ^ 7 + 14 - -69 + 80 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlllIIIIIIlI[1];
        }
        return n2 != 0;
    }

    @Inject
    protected ac(v v2, Client client, SquireZulrahConfig squireZulrahConfig, t t2) {
        super(v2, client, squireZulrahConfig);
        this.ay = t2;
    }

    private static boolean llIIlIlIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        ac.llIIlIlIIIlIlIl();
    }
}

