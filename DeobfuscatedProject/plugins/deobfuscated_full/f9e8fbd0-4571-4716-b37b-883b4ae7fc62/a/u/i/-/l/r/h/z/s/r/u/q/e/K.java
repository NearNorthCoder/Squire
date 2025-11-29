/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.P;
import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import com.google.inject.Inject;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

public class K
extends P {
    private static /* synthetic */ int[] lIllIlIIIllll;

    private static void llIIIllllIIIlll() {
        lIllIlIIIllll = new int[1];
        K.lIllIlIIIllll[0] = (0 ^ 0x1F ^ (0x41 ^ 0x60)) & (178 + 124 - 149 + 99 ^ 191 + 114 - 155 + 44 ^ -1);
    }

    static {
        K.llIIIllllIIIlll();
    }

    @Override
    public boolean ac() {
        return lIllIlIIIllll[0];
    }

    @Inject
    public K(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, c c2) {
        super(squireZulrahConfig, squireZulrah, client, c2);
    }
}

