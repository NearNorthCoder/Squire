package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Banking")
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.k  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/k.class */
public class k extends Task {
    private final /* synthetic */ c U;
    private final /* synthetic */ SquireShamansPlugin T;
    public static final /* synthetic */ int S;
    private final /* synthetic */ SquireShamanConfig V;
    private static final /* synthetic */ Logger R;
    private static /* synthetic */ int[] lIIllIIIlIlll;
    private static /* synthetic */ String[] lIIllIIIlIllI;

    private static String lIlIllllIIIllIl(String llllllllllllllIllllIIIlllIllllII, String llllllllllllllIllllIIIlllIlllIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIlllIlllIll.toCharArray();
        int llllllllllllllIllllIIIlllIlllIII = lIIllIIIlIlll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIlIlll[1];
        while (lIlIllllIIlIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIlllIlllIII % charArray.length]));
            "".length();
            llllllllllllllIllllIIIlllIlllIII++;
            i++;
            "".length();
            if ((186 ^ 191) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public k(SquireShamansPlugin squireShamansPlugin, c cVar, SquireShamanConfig squireShamanConfig) {
        this.T = squireShamansPlugin;
        this.U = cVar;
        this.V = squireShamanConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIIllIIIlIlll[0]];
        strArr[lIIllIIIlIlll[1]] = lIIllIIIlIllI[lIIllIIIlIlll[1]];
        if (!lIlIllllIIlIIII(NPCs.getNearest(strArr)) || lIlIllllIIlIIIl(this.U.s() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        InventorySetup r = this.U.r();
        if (lIlIllllIIlIIIl(r.matchesInventory() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        int[] iArr = new int[lIIllIIIlIlll[0]];
        iArr[lIIllIIIlIlll[1]] = lIIllIIIlIlll[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIlIllllIIlIIlI(nearest) || lIlIllllIIlIIll(nearest.distanceTo(Players.getLocal()), lIIllIIIlIlll[3])) {
            return lIIllIIIlIlll[1];
        }
        if (lIlIllllIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIIlIlll[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIllllIIlIlIl(item.getId(), this.V.weapon()) || lIlIllllIIlIllI(item.getId(), this.T.d())) {
                ?? r0 = lIIllIIIlIlll[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIIIlIlll[1];
        });
        if (lIlIllllIIlIIlI(first)) {
            int[] iArr2 = new int[lIIllIIIlIlll[0]];
            iArr2[lIIllIIIlIlll[1]] = first.getId();
            if (lIlIllllIIlIlII(Equipment.contains(iArr2) ? 1 : 0)) {
                first.interact(lIIllIIIlIllI[lIIllIIIlIlll[0]]);
                return lIIllIIIlIlll[0];
            }
        }
        if (lIlIllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
            nearest.interact(lIIllIIIlIllI[lIIllIIIlIlll[4]]);
            return lIIllIIIlIlll[0];
        }
        r.withdraw();
        "".length();
        sleep(lIIllIIIlIlll[4]);
        return lIIllIIIlIlll[0];
    }

    private static String lIlIllllIIIllII(String llllllllllllllIllllIIIllllIIllII, String llllllllllllllIllllIIIllllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIllllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlll[6]), "DES");
            Cipher llllllllllllllIllllIIIllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIllllIIlllI.init(lIIllIIIlIlll[4], llllllllllllllIllllIIIllllIIllll);
            return new String(llllllllllllllIllllIIIllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIllllIIllIl) {
            llllllllllllllIllllIIIllllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllllIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllllIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllllIIlIIII(Object obj) {
        return obj == null;
    }

    static {
        lIlIllllIIIllll();
        lIlIllllIIIlllI();
        S = lIIllIIIlIlll[2];
        R = LoggerFactory.getLogger(k.class);
    }

    private static boolean lIlIllllIIlIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIllllIIlIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIllllIIlIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIllllIIIlIll(String llllllllllllllIllllIIIlllIlIIlll, String llllllllllllllIllllIIIlllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIlllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIlllIlIlIIl.init(lIIllIIIlIlll[4], secretKeySpec);
            return new String(llllllllllllllIllllIIIlllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlllIlIlIII) {
            llllllllllllllIllllIIIlllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIllllIIIllll() {
        lIIllIIIlIlll = new int[7];
        lIIllIIIlIlll[0] = " ".length();
        lIIllIIIlIlll[1] = ((197 ^ 142) ^ (38 ^ 104)) & (((((82 + 108) - 168) + 126) ^ (((138 + 70) - 183) + 120)) ^ (-" ".length()));
        lIIllIIIlIlll[2] = (-((-9815) & 14207)) & (-641) & 31743;
        lIIllIIIlIlll[3] = 22 ^ 28;
        lIIllIIIlIlll[4] = "  ".length();
        lIIllIIIlIlll[5] = "   ".length();
        lIIllIIIlIlll[6] = 95 ^ 87;
    }

    private static boolean lIlIllllIIlIIll(int i, int i2) {
        return i > i2;
    }

    private static void lIlIllllIIIlllI() {
        lIIllIIIlIllI = new String[lIIllIIIlIlll[5]];
        lIIllIIIlIllI[lIIllIIIlIlll[1]] = lIlIllllIIIlIll("uPAscXpQXy3W05S3GZ3JZYwmFFTTLmrf", "evfxD");
        lIIllIIIlIllI[lIIllIIIlIlll[0]] = lIlIllllIIIllII("ul1INeuzU8c=", "pGPab");
        lIIllIIIlIllI[lIIllIIIlIlll[4]] = lIlIllllIIIllIl("GjsR", "OHtEC");
    }
}
