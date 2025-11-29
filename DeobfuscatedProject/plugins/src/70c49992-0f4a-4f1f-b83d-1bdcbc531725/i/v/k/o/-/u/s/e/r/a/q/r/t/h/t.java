/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Teleporting to Relleka", priority=5)
public class t
extends o {
    public static final /* synthetic */ int bY;
    private static /* synthetic */ int[] lIlIllIIIllIl;

    private static boolean llIIIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean Q() {
        if (t.llIIIIIIIlIllll(this.T().needsToBank() ? 1 : 0)) {
            return lIlIllIIIllIl[1];
        }
        if (t.llIIIIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            return lIlIllIIIllIl[1];
        }
        if (t.llIIIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIIIllIl[1]);
        }
        return lIlIllIIIllIl[2];
    }

    @Inject
    protected t(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        t.llIIIIIIIlIlllI();
        bY = lIlIllIIIllIl[0];
    }

    private static void llIIIIIIIlIlllI() {
        lIlIllIIIllIl = new int[3];
        t.lIlIllIIIllIl[0] = 0xFFFFB36F & 0x7FDA;
        t.lIlIllIIIllIl[1] = (77 + 220 - 279 + 226 ^ 8 + 104 - 66 + 104) & (0x6A ^ 0x21 ^ (0x1E ^ 0x37) ^ -" ".length());
        t.lIlIllIIIllIl[2] = " ".length();
    }

    @Override
    public int U() {
        return lIlIllIIIllIl[0];
    }
}

