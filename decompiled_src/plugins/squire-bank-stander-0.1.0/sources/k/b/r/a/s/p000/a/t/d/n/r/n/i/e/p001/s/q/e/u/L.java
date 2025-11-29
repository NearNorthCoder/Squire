package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import net.runelite.api.events.ClientTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Enchanting Bolts", register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.L  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/L.class */
public class L extends Task {
    private final /* synthetic */ BankStanderConfig y;
    private /* synthetic */ double z;
    private static /* synthetic */ int[] lllIIIlllIl;

    private static boolean lIlIllIlIlllII(int i) {
        return i == 0;
    }

    @Inject
    public L(BankStanderConfig bankStanderConfig) {
        this.y = bankStanderConfig;
    }

    static {
        lIlIllIlIlIlll();
    }

    private boolean T() {
        int[] iArr = new int[lllIIIlllIl[0]];
        iArr[lllIIIlllIl[1]] = lllIIIlllIl[6];
        return Inventory.contains(iArr);
    }

    private static int lIlIllIlIllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIllIlIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIlIllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void a(ClientTick clientTick) {
        if (lIlIllIlIllIlI(this.y.activity(), EnumC0001b.ENCHANT_BOLTS)) {
            return;
        }
        Keyboard.type(lllIIIlllIl[2]);
        if (lIlIllIlIllIll(lIlIllIlIllIIl(this.z, 1.0d))) {
            this.z -= 0.05d;
        } else if (lIlIllIlIlllII(T() ? 1 : 0)) {
        } else {
            Widget widget = Static.getClient().getWidget(lllIIIlllIl[3]);
            if (lIlIllIlIlllIl(widget)) {
                return;
            }
            widget.interact(lllIIIlllIl[0], lllIIIlllIl[4], lllIIIlllIl[5], lllIIIlllIl[3]);
            this.z = 2.4d;
        }
    }

    private static boolean lIlIllIlIllIll(int i) {
        return i >= 0;
    }

    private static void lIlIllIlIlIlll() {
        lllIIIlllIl = new int[7];
        lllIIIlllIl[0] = " ".length();
        lllIIIlllIl[1] = (228 ^ 189) & ((237 ^ 180) ^ (-1));
        lllIIIlllIl[2] = 231 ^ 199;
        lllIIIlllIl[3] = (-12242) & 14299099;
        lllIIIlllIl[4] = 110 ^ 87;
        lllIIIlllIl[5] = -" ".length();
        lllIIIlllIl[6] = (-((-30244) & 32687)) & (-17409) & 20415;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIlIllIlIllIII(this.y.activity(), EnumC0001b.ENCHANT_BOLTS)) {
            ?? r0 = lllIIIlllIl[0];
            "".length();
            return "   ".length() < 0 ? ((((193 + 172) - 211) + 79) ^ (((49 + 74) - (-36)) + 31)) & (((((105 + 121) - 58) + 84) ^ (((91 + 26) - (-28)) + 26)) ^ (-" ".length())) : r0;
        }
        return lllIIIlllIl[1];
    }

    private static boolean lIlIllIlIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }
}
