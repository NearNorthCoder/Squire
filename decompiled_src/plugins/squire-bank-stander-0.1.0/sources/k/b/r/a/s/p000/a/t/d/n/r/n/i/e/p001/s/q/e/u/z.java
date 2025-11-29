package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Molten Glass (Furnace)", register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.z  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/z.class */
public class z extends AbstractC0000a {
    private static /* synthetic */ String[] lllIlIIIlII;
    private static /* synthetic */ int[] lllIlIIIlIl;

    @Inject
    public z(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.FURNACE_GLASS);
    }

    private static boolean lIlIllllIIIlll(int i) {
        return i != 0;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIlIIIlIl[5];
    }

    private static void lIlIllllIIIllI() {
        lllIlIIIlIl = new int[7];
        lllIlIIIlIl[0] = (-((-17505) & 23913)) & (-8193) & 16383;
        lllIlIIIlIl[1] = " ".length();
        lllIlIIIlIl[2] = (-((-4999) & 21391)) & (-8449) & 26621;
        lllIlIIIlIl[3] = (94 ^ 25) & ((216 ^ 159) ^ (-1));
        lllIlIIIlIl[4] = 63 ^ 116;
        lllIlIIIlIl[5] = 8 ^ 13;
        lllIlIIIlIl[6] = "  ".length();
    }

    private static void lIlIllllIIIlIl() {
        lllIlIIIlII = new String[lllIlIIIlIl[1]];
        lllIlIIIlII[lllIlIIIlIl[3]] = lIlIllllIIIlII("mgF5vlKT0Qo=", "niokh");
    }

    private static boolean lIlIllllIIlIlI(Object obj) {
        return obj == null;
    }

    static {
        lIlIllllIIIllI();
        lIlIllllIIIlIl();
    }

    private static boolean lIlIllllIIlIll(int i, int i2) {
        return i == i2;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIlIIIlIl[0]), Integer.valueOf(lllIlIIIlIl[1]), Integer.valueOf(lllIlIIIlIl[2]), Integer.valueOf(lllIlIIIlIl[1]));
    }

    private static String lIlIllllIIIlII(String llllllllllllllllIIlIIllIIllllIlI, String llllllllllllllllIIlIIllIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIlllllII.init(lllIlIIIlIl[6], llllllllllllllllIIlIIllIIlllllIl);
            return new String(llllllllllllllllIIlIIllIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIllllIll) {
            llllllllllllllllIIlIIllIIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllllIIlIII(int i) {
        return i == 0;
    }

    private static boolean lIlIllllIIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllllIIIlll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lllIlIIIlIl[3]);
            return lllIlIIIlIl[1];
        } else if (lIlIllllIIIlll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIlIIIlIl[1];
        } else if (lIlIllllIIlIII(Movement.isRunEnabled() ? 1 : 0) && lIlIllllIIlIIl(Movement.getRunEnergy(), lllIlIIIlIl[4])) {
            Movement.toggleRun();
            return lllIlIIIlIl[3];
        } else {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIllllIIllII(tileObject.getActions())) {
                    String[] strArr = new String[lllIlIIIlIl[1]];
                    strArr[lllIlIIIlIl[3]] = lllIlIIIlII[lllIlIIIlIl[3]];
                    if (lIlIllllIIIlll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIlIIIlIl[1];
                        "".length();
                        return (((((138 + 124) - 199) + 105) ^ (((104 + 188) - 243) + 140)) & (((35 ^ 53) ^ "   ".length()) ^ (-" ".length()))) > 0 ? ((225 ^ 145) ^ (233 ^ 148)) & (((163 ^ 153) ^ (26 ^ 45)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIlIIIlIl[3];
            });
            if (lIlIllllIIlIlI(nearest)) {
                return lllIlIIIlIl[3];
            }
            Inventory.use(item -> {
                if (lIlIllllIIlIll(item.getId(), lllIlIIIlIl[0])) {
                    ?? r0 = lllIlIIIlIl[1];
                    "".length();
                    return (((77 ^ 95) ^ (198 ^ 193)) & (((((77 + 20) - 16) + 50) ^ (((30 + 24) - (-77)) + 19)) ^ (-" ".length()))) >= "  ".length() ? ((61 ^ 56) ^ (152 ^ 196)) & (((127 ^ 91) ^ (251 ^ 134)) ^ (-" ".length())) : r0;
                }
                return lllIlIIIlIl[3];
            }, nearest);
            "".length();
            return lllIlIIIlIl[1];
        }
    }
}
