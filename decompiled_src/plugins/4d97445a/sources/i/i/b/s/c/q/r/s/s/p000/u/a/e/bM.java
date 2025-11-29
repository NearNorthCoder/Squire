package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Banking Inventory")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bM  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bM.class */
public class bM extends Task {
    @Inject
    private /* synthetic */ SecondariesConfig gK;
    private static /* synthetic */ int[] llllIlIIl;

    private static boolean llIlIIIIIIl(int i2) {
        return i2 != 0;
    }

    private static boolean llIlIIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (llIlIIIIIII(cV() ? 1 : 0)) {
            return llllIlIIl[0];
        }
        if (llIlIIIIIIl(Bank.isOpen() ? 1 : 0)) {
            int[] iArr = new int[llllIlIIl[1]];
            iArr[llllIlIIl[0]] = llllIlIIl[2];
            Bank.depositAll(iArr);
            int[] iArr2 = new int[llllIlIIl[1]];
            iArr2[llllIlIIl[0]] = this.gK.secondary().P();
            Bank.depositAll(iArr2);
            "".length();
            if ("  ".length() > "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llIlIIIIIII(Bank.open() ? 1 : 0) && llIlIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(this.gK.bank().getArea());
            "".length();
        }
        return llllIlIIl[1];
    }

    static {
        llIIlllllll();
    }

    private static boolean llIlIIIIIII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean cV() {
        if (llIlIIIIIIl(Inventory.isFull() ? 1 : 0)) {
            return llllIlIIl[1];
        }
        if (llIlIIIIIlI(this.gK.secondary(), bO.FUNGUS) && llIlIIIIIII(Prayers.getPoints())) {
            ?? r0 = llllIlIIl[1];
            "".length();
            return (-" ".length()) > "  ".length() ? ((((111 + 42) - 10) + 13) ^ (((4 + 91) - 84) + 130)) & (((207 ^ 187) ^ (225 ^ 132)) ^ (-" ".length())) : r0;
        }
        return llllIlIIl[0];
    }

    private static void llIIlllllll() {
        llllIlIIl = new int[3];
        llllIlIIl[0] = (149 ^ 128) & ((83 ^ 70) ^ (-1));
        llllIlIIl[1] = " ".length();
        llllIlIIl[2] = (-((-1079) & 25919)) & (-5250) & 32239;
    }
}
