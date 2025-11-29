package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Looting Items", priority = 5, blocking = true)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.v  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/v.class */
public class v extends Task {
    private static /* synthetic */ String[] lIllIIIlIlIlI;
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireZammyConfig aq;
    private final /* synthetic */ l an;
    private static /* synthetic */ int[] lIllIIIlIlIll;

    private static boolean llIIIlIlIIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlIIllllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        int i;
        if (!llIIIlIIllllIll(this.an.B() ? 1 : 0) || llIIIlIIllllIll(this.an.A() ? 1 : 0)) {
            return lIllIIIlIlIll[0];
        }
        TileItem P = P();
        if (llIIIlIIlllllII(P) && llIIIlIIlllllIl(this.ao.a(P), lIllIIIlIlIll[1])) {
            i = lIllIIIlIlIll[2];
            "".length();
            if ((92 ^ 88) == "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIllIIIlIlIll[0];
        }
        int i2 = i;
        if (llIIIlIIllllIll(this.an.D() ? 1 : 0) && llIIIlIIllllllI(i2)) {
            return lIllIIIlIlIll[0];
        }
        if (llIIIlIIlllllll(this.an.z(), lIllIIIlIlIll[3]) && llIIIlIIllllllI(i2)) {
            return lIllIIIlIlIll[0];
        }
        if (llIIIlIIllllIll(Movement.isRunEnabled() ? 1 : 0) && llIIIlIIllllIll(this.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (llIIIlIlIIIIIII(P)) {
            return lIllIIIlIlIll[0];
        }
        if (llIIIlIIllllIll(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lIllIIIlIlIll[2]];
            iArr[lIllIIIlIlIll[0]] = P.getId();
            if (!llIIIlIIllllIll(Inventory.contains(iArr) ? 1 : 0) || llIIIlIIllllllI(P.isStackable() ? 1 : 0)) {
                Item w = this.ap.w();
                if (llIIIlIIlllllII(w)) {
                    w.interact(lIllIIIlIlIlI[lIllIIIlIlIll[0]]);
                    return lIllIIIlIlIll[2];
                }
                Item orElse = this.ao.y().orElse(null);
                if (!llIIIlIlIIIIIII(orElse) && !llIIIlIIllllllI(this.ao.a(orElse, P) ? 1 : 0)) {
                    orElse.interact(lIllIIIlIlIlI[lIllIIIlIlIll[2]]);
                }
                return lIllIIIlIlIll[0];
            }
        }
        if (llIIIlIIllllIll(Movement.shouldWalk() ? 1 : 0)) {
            P.interact(lIllIIIlIlIlI[lIllIIIlIlIll[4]]);
            sleep(lIllIIIlIlIll[2]);
        }
        return lIllIIIlIlIll[2];
    }

    private static void llIIIlIIllllIIl() {
        lIllIIIlIlIlI = new String[lIllIIIlIlIll[5]];
        lIllIIIlIlIlI[lIllIIIlIlIll[0]] = llIIIlIIlllIlll("ChA2", "OqBDG");
        lIllIIIlIlIlI[lIllIIIlIlIll[2]] = llIIIlIIllllIII("xydPxwinKBc=", "PlDoS");
        lIllIIIlIlIlI[lIllIIIlIlIll[4]] = llIIIlIIllllIII("i6KladLUkx0=", "fCpkx");
    }

    private static boolean llIIIlIIlllllII(Object obj) {
        return obj != null;
    }

    private static void llIIIlIIllllIlI() {
        lIllIIIlIlIll = new int[7];
        lIllIIIlIlIll[0] = (103 ^ 67) & ((115 ^ 87) ^ (-1));
        lIllIIIlIlIll[1] = (-1) & Integer.MAX_VALUE;
        lIllIIIlIlIll[2] = " ".length();
        lIllIIIlIlIll[3] = (((90 + 108) - 129) + 76) ^ (((104 + 134) - 91) + 8);
        lIllIIIlIlIll[4] = "  ".length();
        lIllIIIlIlIll[5] = "   ".length();
        lIllIIIlIlIll[6] = (130 ^ 146) ^ (18 ^ 10);
    }

    private static boolean llIIIlIIlllllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlIIlllllll(int i, int i2) {
        return i <= i2;
    }

    private TileItem P() {
        return this.ao.x().orElse(null);
    }

    private static String llIIIlIIllllIII(String llllllllllllllIllIIlIlllIllIlIII, String llllllllllllllIllIIlIlllIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlllIllIIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIlIll[6]), "DES");
            Cipher llllllllllllllIllIIlIlllIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlllIllIlIlI.init(lIllIIIlIlIll[4], secretKeySpec);
            return new String(llllllllllllllIllIIlIlllIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlllIllIlIIl) {
            llllllllllllllIllIIlIlllIllIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIIllllIlI();
        llIIIlIIllllIIl();
    }

    private static String llIIIlIIlllIlll(String llllllllllllllIllIIlIlllIlIllIII, String llllllllllllllIllIIlIlllIlIlIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlllIlIlIllI = new StringBuilder();
        char[] llllllllllllllIllIIlIlllIlIlIlIl = llllllllllllllIllIIlIlllIlIlIlll.toCharArray();
        int llllllllllllllIllIIlIlllIlIlIlII = lIllIIIlIlIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIlIlIll[0];
        while (llIIIlIlIIIIIIl(i, length)) {
            llllllllllllllIllIIlIlllIlIlIllI.append((char) (charArray[i] ^ llllllllllllllIllIIlIlllIlIlIlIl[llllllllllllllIllIIlIlllIlIlIlII % llllllllllllllIllIIlIlllIlIlIlIl.length]));
            "".length();
            llllllllllllllIllIIlIlllIlIlIlII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIlllIlIlIllI);
    }

    @Inject
    public v(l lVar, i iVar, g gVar, SquireZammyConfig squireZammyConfig) {
        this.an = lVar;
        this.ao = iVar;
        this.ap = gVar;
        this.aq = squireZammyConfig;
    }

    private static boolean llIIIlIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIlIIllllllI(int i) {
        return i == 0;
    }
}
