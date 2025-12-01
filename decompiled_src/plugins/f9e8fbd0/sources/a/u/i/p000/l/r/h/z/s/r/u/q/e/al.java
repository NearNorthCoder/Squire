package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
@TaskDesc(name = "Equipping mage gear", priority = 10)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.al  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/al.class */
public class al extends am {
    private final /* synthetic */ C0019t aH;

    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.am
    public boolean ac() {
        return this.aH.a(this.aH.O());
    }

    @Inject
    protected al(Client client, C0019t c0019t, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
        this.aH = c0019t;
    }
}
