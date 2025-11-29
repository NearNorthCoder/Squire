package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Withdrawing teleport", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.S  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/S.class */
public class S extends P {
    private static /* synthetic */ int[] lIllIllIIIlll;

    static {
        llIIlIIIllIIIII();
    }

    private static boolean llIIlIIIllIIIlI(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIllIIIIl(int i) {
        return i != 0;
    }

    @Inject
    public S(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.BANKING);
    }

    private static void llIIlIIIllIIIII() {
        lIllIllIIIlll = new int[3];
        lIllIllIIIlll[0] = " ".length();
        lIllIllIIIlll[1] = ((137 ^ 151) ^ (22 ^ 59)) & (((((91 + 153) - 232) + 164) ^ (((3 + 125) - 102) + 105)) ^ (-" ".length()));
        lIllIllIIIlll[2] = (-3409) & 16346;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        if (llIIlIIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
            int[] iArr = new int[lIllIllIIIlll[0]];
            iArr[lIllIllIIIlll[1]] = lIllIllIIIlll[2];
            if (llIIlIIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                Bank.withdraw(lIllIllIIIlll[2], lIllIllIIIlll[0], Bank.WithdrawMode.ITEM);
                return lIllIllIIIlll[0];
            }
        }
        if (llIIlIIIllIIIIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            return lIllIllIIIlll[0];
        }
        return lIllIllIIIlll[1];
    }
}
