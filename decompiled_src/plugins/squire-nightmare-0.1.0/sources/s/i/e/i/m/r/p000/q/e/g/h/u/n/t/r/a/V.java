package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Withdrawing loot (Restocking)", priority = 1346674, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.V  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/V.class */
public class V extends S {
    private static /* synthetic */ String[] llllIIIIIIlI;
    private static /* synthetic */ int[] llllIIIIIIll;

    private static String lIIIlllIlIIIIII(String lllllllllllllllIIllIIIlIIIIIllII, String lllllllllllllllIIllIIIlIIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIlIIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIlIIIIIlllI.init(llllIIIIIIll[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIIlIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIlIIIIIllIl) {
            lllllllllllllllIIllIIIlIIIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlllIlIIIIlI();
        lIIIlllIlIIIIIl();
    }

    private static void lIIIlllIlIIIIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[1]];
        llllIIIIIIlI[llllIIIIIIll[0]] = lIIIlllIlIIIIII("x7n9sJ008yd1l8xCU0IG8vA973wfPypLmn3opai9qCMBFR9FUQ9XGhGQd9aJw3NY9uMVXX96cqL6R+7QahzGeQ==", "Jhrzb");
    }

    @Inject
    protected V(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static void lIIIlllIlIIIIlI() {
        llllIIIIIIll = new int[4];
        llllIIIIIIll[0] = ((((99 + 68) - 65) + 52) ^ (((91 + 16) - 7) + 42)) & (((((29 + 132) - 27) + 30) ^ (((113 + 164) - 263) + 162)) ^ (-" ".length()));
        llllIIIIIIll[1] = " ".length();
        llllIIIIIIll[2] = (-1) & Integer.MAX_VALUE;
        llllIIIIIIll[3] = "  ".length();
    }

    private static boolean lIIIlllIlIIIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.S
    public boolean ci() {
        if (!lIIIlllIlIIIIll(this.cW.D() ? 1 : 0) && !lIIIlllIlIIIIll(Inventory.isFull() ? 1 : 0) && !lIIIlllIlIIIlII(cn() ? 1 : 0)) {
            if (lIIIlllIlIIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return llllIIIIIIll[1];
            } else if (lIIIlllIlIIIlII(Inventory.contains(item -> {
                return ca().contains(Integer.valueOf(item.getId()));
            }) ? 1 : 0)) {
                Bank.withdraw(item2 -> {
                    return ca().contains(Integer.valueOf(item2.getId()));
                }, llllIIIIIIll[1], Bank.WithdrawMode.ITEM);
                return llllIIIIIIll[1];
            } else if (lIIIlllIlIIIlII(Bank.contains(item3 -> {
                return dt.contains(Integer.valueOf(item3.getId()));
            }) ? 1 : 0)) {
                this.cW.f((boolean) llllIIIIIIll[1]);
                Log.info(llllIIIIIIlI[llllIIIIIIll[0]]);
                return llllIIIIIIll[1];
            } else if (!lIIIlllIlIIIlII(Equipment.getAll().isEmpty() ? 1 : 0) || !lIIIlllIlIIIlII(Inventory.isEmpty() ? 1 : 0)) {
                Bank.withdraw(item4 -> {
                    return dt.contains(Integer.valueOf(item4.getId()));
                }, llllIIIIIIll[2], Bank.WithdrawMode.NOTED);
                return llllIIIIIIll[1];
            } else {
                Bank.depositInventory();
                Bank.depositEquipment();
                return llllIIIIIIll[1];
            }
        }
        return llllIIIIIIll[0];
    }

    private static boolean lIIIlllIlIIIIll(int i) {
        return i != 0;
    }
}
