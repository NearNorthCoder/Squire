package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Opening Hallowed sacks", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.U  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/U.class */
public class U extends V {
    private static /* synthetic */ int[] lllIIIIIlllI;
    private /* synthetic */ CompletableFuture<Boolean> ag;
    private /* synthetic */ Player ai;
    private static /* synthetic */ String[] lllIIIIIllIl;

    private static boolean lIIIlIIIIlIIllI(Object obj) {
        return obj == null;
    }

    private static void lIIIlIIIIlIIlII() {
        lllIIIIIllIl = new String[lllIIIIIlllI[3]];
        lllIIIIIllIl[lllIIIIIlllI[0]] = lIIIlIIIIlIIIll("Z4tGVA1va3c=", "aVxpS");
    }

    private static void lIIIlIIIIlIIlIl() {
        lllIIIIIlllI = new int[6];
        lllIIIIIlllI[0] = (176 ^ 182) & ((3 ^ 5) ^ (-1));
        lllIIIIIlllI[1] = (-1037) & 25982;
        lllIIIIIlllI[2] = "   ".length();
        lllIIIIIlllI[3] = " ".length();
        lllIIIIIlllI[4] = (131 ^ 189) ^ (17 ^ 39);
        lllIIIIIlllI[5] = "  ".length();
    }

    private static String lIIIlIIIIlIIIll(String lllllllllllllllIIlllIIlIlIllIIII, String lllllllllllllllIIlllIIlIlIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), lllIIIIIlllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIlllI[5], lllllllllllllllIIlllIIlIlIllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIlIllIIIl) {
            lllllllllllllllIIlllIIlIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIlIlIII(int i) {
        return i != 0;
    }

    static {
        lIIIlIIIIlIIlIl();
        lIIIlIIIIlIIlII();
    }

    private static boolean lIIIlIIIIlIlIIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected U(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        super(squireSepulchre, squireSepulchreConfig);
        this.ag = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.V
    public boolean J() {
        this.ai = Players.getLocal();
        if (!lIIIlIIIIlIIllI(this.ai) && !lIIIlIIIIlIIlll(C0001b.B.contains(this.ai) ? 1 : 0)) {
            InventorySetup inventorySetup = new InventorySetup();
            inventorySetup.add(lllIIIIIlllI[1], lllIIIIIlllI[2]);
            "".length();
            if (!lIIIlIIIIlIlIII(inventorySetup.matchesInventory() ? 1 : 0)) {
                if (lIIIlIIIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                    Bank.open();
                    "".length();
                    return lllIIIIIlllI[3];
                }
                inventorySetup.withdraw();
                "".length();
                return lllIIIIIlllI[3];
            } else if (lIIIlIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lllIIIIIlllI[3];
            } else {
                Predicate predicate = item -> {
                    if (lIIIlIIIIlIlIIl(item.getId(), lllIIIIIlllI[1])) {
                        ?? r0 = lllIIIIIlllI[3];
                        "".length();
                        return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIIIIlllI[0];
                };
                String[] strArr = new String[lllIIIIIlllI[3]];
                strArr[lllIIIIIlllI[0]] = lllIIIIIllIl[lllIIIIIlllI[0]];
                Inventory.doActions(predicate, strArr);
                return lllIIIIIlllI[3];
            }
        }
        return lllIIIIIlllI[0];
    }

    private static boolean lIIIlIIIIlIIlll(int i) {
        return i == 0;
    }
}
