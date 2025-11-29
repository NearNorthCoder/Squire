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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Teleporting to Zul'Andra", priority=5)
public class J
extends E {
    private static /* synthetic */ int[] lIllIlIllIIlI;
    public static final /* synthetic */ int ae;

    @Override
    public boolean ac() {
        if (J.llIIlIIIIIlllll(this.ae().needsToBank() ? 1 : 0)) {
            return lIllIlIllIIlI[1];
        }
        if (J.llIIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
            return lIllIlIllIIlI[1];
        }
        if (J.llIIlIIIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIllIlIllIIlI[1]);
        }
        return lIllIlIllIIlI[2];
    }

    private static boolean llIIlIIIIIlllll(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        return lIllIlIllIIlI[0];
    }

    private static void llIIlIIIIIllllI() {
        lIllIlIllIIlI = new int[3];
        J.lIllIlIllIIlI[0] = -(0xFFFF8CB7 & 0x7FFE) & (0xFFFFBFFF & Short.MAX_VALUE);
        J.lIllIlIllIIlI[1] = (0x11 ^ 0x1A) & ~(0x5C ^ 0x57);
        J.lIllIlIllIIlI[2] = " ".length();
    }

    static {
        J.llIIlIIIIIllllI();
        ae = lIllIlIllIIlI[0];
    }

    @Inject
    protected J(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }
}

