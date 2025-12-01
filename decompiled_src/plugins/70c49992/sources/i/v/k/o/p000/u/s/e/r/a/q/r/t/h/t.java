package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Teleporting to Relleka", priority = 5)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.t  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/t.class */
public class t extends AbstractC0014o {
    public static final /* synthetic */ int bY;
    private static /* synthetic */ int[] lIlIllIIIllIl;

    private static boolean llIIIIIIIlIllll(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        if (!llIIIIIIIlIllll(T().needsToBank() ? 1 : 0) && !llIIIIIIIlIllll(Bank.isOpen() ? 1 : 0)) {
            if (llIIIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIlIllIIIllIl[1]);
            }
            return lIlIllIIIllIl[2];
        }
        return lIlIllIIIllIl[1];
    }

    @Inject
    protected t(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        llIIIIIIIlIlllI();
        bY = lIlIllIIIllIl[0];
    }

    private static void llIIIIIIIlIlllI() {
        lIlIllIIIllIl = new int[3];
        lIlIllIIIllIl[0] = (-19601) & 32730;
        lIlIllIIIllIl[1] = ((((77 + 220) - 279) + 226) ^ (((8 + 104) - 66) + 104)) & (((106 ^ 33) ^ (30 ^ 55)) ^ (-" ".length()));
        lIlIllIIIllIl[2] = " ".length();
    }

    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public int U() {
        return lIlIllIIIllIl[0];
    }
}
