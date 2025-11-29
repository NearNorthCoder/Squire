package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import net.runelite.api.Client;
import net.runelite.api.Quest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Starting Quest")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.m  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/m.class */
public class m extends Task {
    private static /* synthetic */ int[] lIIIllIIlIllI;
    private static final /* synthetic */ Logger aj;
    private final /* synthetic */ SquireQuesterConfig al;
    private final /* synthetic */ Client ak;

    private static boolean lIlIIIIllllIlll(int i) {
        return i == 0;
    }

    @Inject
    public m(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ak = client;
        this.al = squireQuesterConfig;
    }

    private int a(int i) {
        Client client = this.ak;
        Object[] objArr = new Object[lIIIllIIlIllI[2]];
        objArr[lIIIllIIlIllI[0]] = Integer.valueOf(lIIIllIIlIllI[3]);
        objArr[lIIIllIIlIllI[1]] = Integer.valueOf(i);
        client.runScript(objArr);
        return this.ak.getIntStack()[lIIIllIIlIllI[0]];
    }

    private static void lIlIIIIllllIlIl() {
        lIIIllIIlIllI = new int[4];
        lIIIllIIlIllI[0] = (101 ^ 58) & ((118 ^ 41) ^ (-1));
        lIIIllIIlIllI[1] = " ".length();
        lIIIllIIlIllI[2] = "  ".length();
        lIIIllIIlIllI[3] = (-20546) & 24569;
    }

    static {
        lIlIIIIllllIlIl();
        aj = LoggerFactory.getLogger(m.class);
    }

    private static boolean lIlIIIIllllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIIIIllllIllI(this.al.quest(), h.BELOW_ICE_MOUNTAIN)) {
            return lIIIllIIlIllI[0];
        }
        if (lIlIIIIllllIlll(a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
        }
        System.out.println("Progress: " + a(Quest.BELOW_ICE_MOUNTAIN.getId()));
        return lIIIllIIlIllI[1];
    }
}
