/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import net.runelite.api.Client;

@TaskDesc(name="Opening bank", priority=75, blocking=true)
public class s
extends o {
    private static /* synthetic */ int[] lIlIlIlllllll;

    @Override
    public boolean Q() {
        if (s.llIIIIIIIIIIIII(this.R() ? 1 : 0)) {
            return lIlIlIlllllll[0];
        }
        return lIlIlIlllllll[0];
    }

    static {
        s.lIlllllllllllll();
    }

    private static boolean llIIIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static void lIlllllllllllll() {
        lIlIlIlllllll = new int[1];
        s.lIlIlIlllllll[0] = (0xFD ^ 0xC6) & ~(0x14 ^ 0x2F);
    }

    @Inject
    protected s(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }
}

