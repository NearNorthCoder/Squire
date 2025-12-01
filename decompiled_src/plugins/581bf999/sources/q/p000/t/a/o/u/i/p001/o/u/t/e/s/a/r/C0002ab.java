package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Applying Silk", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ab  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ab.class */
public class C0002ab extends Z {
    private /* synthetic */ int cA;
    private final /* synthetic */ C cy;
    private static /* synthetic */ String[] llIIIIllIIl;
    private final /* synthetic */ SquireAutoTOA cz;
    private static /* synthetic */ int[] llIIIIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean run() {
        if (!lIIlllIllIIIll(this.cz.e() ? 1 : 0) && !lIIlllIllIIlII(aq() ? 1 : 0)) {
            if (!lIIlllIllIIlIl(Combat.getMissingHealth(), llIIIIllIlI[1]) || lIIlllIllIIlII(this.cy.al() ? 1 : 0)) {
                return llIIIIllIlI[0];
            }
            if (lIIlllIllIIllI(this.cu.getTickCount() - this.cA, llIIIIllIlI[2])) {
                return llIIIIllIlI[0];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(llIIIIllIIl[llIIIIllIlI[3]]);
            });
            if (lIIlllIllIIlll(first)) {
                first.interact(llIIIIllIIl[llIIIIllIlI[0]]);
                this.cA = this.cu.getTickCount();
                this.cy.an();
                return llIIIIllIlI[3];
            }
            return llIIIIllIlI[0];
        }
        return llIIIIllIlI[0];
    }

    private static boolean lIIlllIllIIlll(Object obj) {
        return obj != null;
    }

    private static void lIIlllIllIIIlI() {
        llIIIIllIlI = new int[6];
        llIIIIllIlI[0] = (119 ^ 50) & ((55 ^ 114) ^ (-1));
        llIIIIllIlI[1] = 60 ^ 34;
        llIIIIllIlI[2] = (((79 + 5) - (-21)) + 61) ^ (((42 + 97) - 130) + 185);
        llIIIIllIlI[3] = " ".length();
        llIIIIllIlI[4] = "  ".length();
        llIIIIllIlI[5] = (127 ^ 22) ^ (86 ^ 55);
    }

    private static boolean lIIlllIllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllIllIIlII(int i) {
        return i == 0;
    }

    private static String lIIlllIllIIIII(String llllllllllllllllIlIIIllIIIlIlIll, String llllllllllllllllIlIIIllIIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIIIllIlI[5]), "DES");
            Cipher llllllllllllllllIlIIIllIIIlIllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIIllIIIlIllIl.init(llIIIIllIlI[4], llllllllllllllllIlIIIllIIIlIlllI);
            return new String(llllllllllllllllIlIIIllIIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIllIIIlIllII) {
            llllllllllllllllIlIIIllIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIllIIllI(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected C0002ab(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cy = c;
        this.cz = squireAutoTOA;
    }

    static {
        lIIlllIllIIIlI();
        lIIlllIllIIIIl();
    }

    private static boolean lIIlllIllIIIll(int i) {
        return i != 0;
    }

    private static void lIIlllIllIIIIl() {
        llIIIIllIIl = new String[llIIIIllIlI[4]];
        llIIIIllIIl[llIIIIllIlI[0]] = lIIlllIllIIIII("RtihVYBjm5Y=", "PQAlB");
        llIIIIllIIl[llIIIIllIlI[3]] = lIIlllIllIIIII("YKqlvxPVznxui//2WT5++w==", "rxzfJ");
    }
}
