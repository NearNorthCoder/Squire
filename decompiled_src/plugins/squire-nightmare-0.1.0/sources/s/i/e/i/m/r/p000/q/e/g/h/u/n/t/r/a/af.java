package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Attacking Nightmare", priority = 1)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.af  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/af.class */
public class af extends al {
    private static final /* synthetic */ Logger dQ;
    private static /* synthetic */ int[] lllIllllIllI;
    protected final /* synthetic */ C0008e dR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    protected boolean ct() {
        if (lIIIlllIIlIIIII(this.cO ? 1 : 0) && lIIIlllIIlIIIIl(cx() ? 1 : 0) && lIIIlllIIlIIIIl(cw() ? 1 : 0) && lIIIlllIIlIIIIl(this.cP ? 1 : 0) && lIIIlllIIlIIIIl(this.cR ? 1 : 0) && lIIIlllIIlIIIIl(this.cQ ? 1 : 0) && lIIIlllIIlIIIIl(this.cM.T() ? 1 : 0) && lIIIlllIIlIIIIl(this.cM.at()) && lIIIlllIIlIIIII(cu() ? 1 : 0) && lIIIlllIIlIIlIl(this.cS.getAnimation(), lllIllllIllI[3]) && lIIIlllIIlIIlIl(this.cS.getId(), lllIllllIllI[4])) {
            ?? r0 = lllIllllIllI[2];
            "".length();
            return (12 ^ 8) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllllIllI[0];
    }

    private static boolean lIIIlllIIlIIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        if (!lIIIlllIIlIIIII(this.cK.assistantMode() ? 1 : 0) && !lIIIlllIIlIIIIl(cs() ? 1 : 0)) {
            return lIIIlllIIlIIIlI(this.cS.getId(), lllIllllIllI[1]) ? lIIIlllIIlIIIII(cu() ? 1 : 0) ? x(this.cS) : lllIllllIllI[0] : lIIIlllIIlIIIII(ct() ? 1 : 0) ? x(this.cS) : lllIllllIllI[0];
        }
        return lllIllllIllI[0];
    }

    private static boolean lIIIlllIIlIIIIl(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean cs() {
        if (!lIIIlllIIlIIIll(SquireNightmarePlugin.d()) && !lIIIlllIIlIIIIl(cu() ? 1 : 0) && !lIIIlllIIlIIIII(cw() ? 1 : 0) && !lIIIlllIIlIIIII(cx() ? 1 : 0) && !lIIIlllIIlIIlII(this.cM.at()) && lIIIlllIIlIIIIl(this.cM.aq() ? 1 : 0)) {
            ?? r0 = lllIllllIllI[2];
            "".length();
            return " ".length() == ((51 ^ 114) & ((93 ^ 28) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllllIllI[0];
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return ((BankLoadout) this.cK.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
    }

    static {
        lIIIlllIIIlllll();
        dQ = LoggerFactory.getLogger(af.class);
    }

    private static void lIIIlllIIIlllll() {
        lllIllllIllI = new int[5];
        lllIllllIllI[0] = (129 ^ 139) & ((9 ^ 3) ^ (-1));
        lllIllllIllI[1] = (-((-8209) & 29749)) & (-10) & 32703;
        lllIllllIllI[2] = " ".length();
        lllIllllIllI[3] = (-((-8225) & 14947)) & (-33) & 15358;
        lllIllllIllI[4] = (-18961) & 28382;
    }

    private static boolean lIIIlllIIlIIlII(int i) {
        return i > 0;
    }

    @Inject
    public af(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
        this.dR = c0008e;
    }

    private static boolean lIIIlllIIlIIIII(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIIlIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIIlIIlIl(int i, int i2) {
        return i != i2;
    }
}
