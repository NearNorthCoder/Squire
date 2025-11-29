package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Teleporting to Zul'Andra", priority = 5)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.J  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/J.class */
public class J extends E {
    private static /* synthetic */ int[] lIllIlIllIIlI;
    public static final /* synthetic */ int ae;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        if (!llIIlIIIIIlllll(ae().needsToBank() ? 1 : 0) && !llIIlIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
            if (llIIlIIIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIllIlIllIIlI[1]);
            }
            return lIllIlIllIIlI[2];
        }
        return lIllIlIllIIlI[1];
    }

    private static boolean llIIlIIIIIlllll(int i) {
        return i != 0;
    }

    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public int af() {
        return lIllIlIllIIlI[0];
    }

    private static void llIIlIIIIIllllI() {
        lIllIlIllIIlI = new int[3];
        lIllIlIllIIlI[0] = (-((-29513) & 32766)) & (-16385) & 32767;
        lIllIlIllIIlI[1] = (17 ^ 26) & ((92 ^ 87) ^ (-1));
        lIllIlIllIIlI[2] = " ".length();
    }

    static {
        llIIlIIIIIllllI();
        ae = lIllIlIllIIlI[0];
    }

    @Inject
    protected J(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
    }
}
