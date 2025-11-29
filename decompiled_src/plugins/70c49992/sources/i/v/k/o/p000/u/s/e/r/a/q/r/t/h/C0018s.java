package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Client;
@TaskDesc(name = "Opening bank", priority = 75, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/s.class */
public class C0018s extends AbstractC0014o {
    private static /* synthetic */ int[] lIlIlIlllllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        return llIIIIIIIIIIIII(R() ? 1 : 0) ? lIlIlIlllllll[0] : lIlIlIlllllll[0];
    }

    static {
        lIlllllllllllll();
    }

    private static boolean llIIIIIIIIIIIII(int i2) {
        return i2 == 0;
    }

    private static void lIlllllllllllll() {
        lIlIlIlllllll = new int[1];
        lIlIlIlllllll[0] = (253 ^ 198) & ((20 ^ 47) ^ (-1));
    }

    @Inject
    protected C0018s(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }
}
