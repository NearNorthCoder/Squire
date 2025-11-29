package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Banking", priority = 50, blocking = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.N  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/N.class */
public class N extends Task {
    private /* synthetic */ Client aj;
    private /* synthetic */ int ah;
    private final /* synthetic */ SquireSepulchre af;
    private /* synthetic */ CompletableFuture<Boolean> ag = null;
    private /* synthetic */ Player ai;
    private static /* synthetic */ int[] lllIIIIIIIII;
    private final /* synthetic */ SquireSepulchreConfig ae;
    private static /* synthetic */ String[] llIlllllllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        this.ai = Players.getLocal();
        if (!lIIIIllllllllll(this.ai) && !lIIIlIIIIIIIIII(C0001b.B.contains(this.ai) ? 1 : 0)) {
            if (lIIIlIIIIIIIIIl(this.af.j().matchesInventory() ? 1 : 0)) {
                System.out.println(llIlllllllll[lllIIIIIIIII[0]]);
                return lllIIIIIIIII[0];
            } else if (lIIIlIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return lllIIIIIIIII[1];
            } else {
                this.af.j().withdraw();
                "".length();
                sleep(lllIIIIIIIII[2]);
                return lllIIIIIIIII[1];
            }
        }
        return lllIIIIIIIII[0];
    }

    private static String lIIIIllllllllII(String lllllllllllllllIIlllIIlllIllIIlI, String lllllllllllllllIIlllIIlllIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlllIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIIIIII[4], lllllllllllllllIIlllIIlllIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlllIllIIll) {
            lllllllllllllllIIlllIIlllIllIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public N(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ae = squireSepulchreConfig;
        this.af = squireSepulchre;
    }

    private static void lIIIIlllllllllI() {
        lllIIIIIIIII = new int[5];
        lllIIIIIIIII[0] = ((((17 + 72) - 53) + 96) ^ (((27 + 36) - 9) + 95)) & (((((127 + 1) - 100) + 104) ^ (((96 + 41) - 101) + 113)) ^ (-" ".length()));
        lllIIIIIIIII[1] = " ".length();
        lllIIIIIIIII[2] = 44 ^ 42;
        lllIIIIIIIII[3] = -" ".length();
        lllIIIIIIIII[4] = "  ".length();
    }

    private static boolean lIIIlIIIIIIIIII(int i) {
        return i == 0;
    }

    static {
        lIIIIlllllllllI();
        lIIIIllllllllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean a(BankLoadout bankLoadout) {
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] ids = inventorySetup.getIds();
        int length = ids.length;
        int i = lllIIIIIIIII[0];
        while (lIIIlIIIIIIIIlI(i, length)) {
            int i2 = ids[i];
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(i2), Integer.valueOf(lllIIIIIIIII[0]))).intValue() + lllIIIIIIIII[1]));
            "".length();
            i++;
            "".length();
            if ("  ".length() > "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            if (lIIIlIIIIIIIIll(intValue, lllIIIIIIIII[3])) {
                "".length();
                if (" ".length() != " ".length()) {
                    return ((132 ^ 144) ^ (160 ^ 146)) & (((((37 + 125) - 79) + 45) ^ (((4 + 78) - (-54)) + 30)) ^ (-" ".length()));
                }
            } else {
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
                int[] iArr = new int[lllIIIIIIIII[1]];
                iArr[lllIIIIIIIII[0]] = intValue;
                if (lIIIlIIIIIIIIlI(Inventory.getCount(iArr), intValue2)) {
                    System.out.println(intValue);
                    return lllIIIIIIIII[1];
                }
                "".length();
                if ("   ".length() < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lllIIIIIIIII[0];
    }

    private static boolean lIIIIllllllllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIIIIIIIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIIIIIIIIIl(int i) {
        return i != 0;
    }

    private static void lIIIIllllllllIl() {
        llIlllllllll = new String[lllIIIIIIIII[1]];
        llIlllllllll[lllIIIIIIIII[0]] = lIIIIllllllllII("MwuNERsc1iperDHCjNpK7Q==", "FObpb");
    }

    private static boolean lIIIlIIIIIIIIlI(int i, int i2) {
        return i < i2;
    }
}
