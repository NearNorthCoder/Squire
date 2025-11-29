/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

/* TASK: Opening bank -> OpenBankTask */
@TaskDesc(name="Opening bank", priority=5, blocking=true)
public class I
extends E {
    private static /* synthetic */ int[] lIllIlllIIIIl;

    @Inject
    protected I(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    static {
        I.llIIlIIlIllIIIl();
    }

    @Override
    public boolean ac() {
        return lIllIlllIIIIl[0];
    }

    private static void llIIlIIlIllIIIl() {
        lIllIlllIIIIl = new int[1];
        I.lIllIlllIIIIl[0] = (0x94 ^ 0xA0) & ~(0x36 ^ 2);
    }
}

