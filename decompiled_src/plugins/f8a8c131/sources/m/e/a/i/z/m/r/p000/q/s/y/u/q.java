package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drinking stamina dose", priority = 8)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.q  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/q.class */
public class q extends Task {
    private static /* synthetic */ String[] lIllIIllIIIIl;
    private final /* synthetic */ f U;
    private final /* synthetic */ l S;
    private final /* synthetic */ C0002c T;
    private final /* synthetic */ u V;
    private static /* synthetic */ int[] lIllIIllIIIlI;

    private static String llIIIllIIlllIlI(String llllllllllllllIllIIlIIlIlIlIllII, String llllllllllllllIllIIlIIlIlIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlIlIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIlIlIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIlIlIlIlllI.init(lIllIIllIIIlI[4], secretKeySpec);
            return new String(llllllllllllllIllIIlIIlIlIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIlIlIlIllIl) {
            llllllllllllllIllIIlIIlIlIlIllIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIllllII() {
        lIllIIllIIIlI = new int[5];
        lIllIIllIIIlI[0] = (192 ^ 158) & ((82 ^ 12) ^ (-1));
        lIllIIllIIIlI[1] = 39 ^ 57;
        lIllIIllIIIlI[2] = "   ".length();
        lIllIIllIIIlI[3] = " ".length();
        lIllIIllIIIlI[4] = "  ".length();
    }

    private static boolean llIIIllIlIIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIllIIllllII();
        llIIIllIIlllIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIllIIllllIl(this.S.B() ? 1 : 0) || llIIIllIIlllllI(this.S.G() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (!llIIIllIIllllIl(this.S.A() ? 1 : 0) || llIIIllIIllllll(this.T.e())) {
            return lIllIIllIIIlI[0];
        }
        if (!llIIIllIlIIIIII(Movement.getRunEnergy(), lIllIIllIIIlI[1]) || llIIIllIIllllIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        if (llIIIllIIllllIl(this.V.O() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIllIIllIIIIl[lIllIIllIIIlI[3]]);
        });
        if (!llIIIllIIllllll(first) || llIIIllIIlllllI(this.U.u() ? 1 : 0)) {
            return lIllIIllIIIlI[0];
        }
        first.interact(lIllIIllIIIIl[lIllIIllIIIlI[0]]);
        this.U.r();
        sleep(lIllIIllIIIlI[2]);
        return lIllIIllIIIlI[3];
    }

    private static boolean llIIIllIIllllll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIIllllIl(int i) {
        return i != 0;
    }

    @Inject
    public q(l lVar, C0002c c0002c, f fVar, u uVar) {
        this.S = lVar;
        this.T = c0002c;
        this.U = fVar;
        this.V = uVar;
    }

    private static void llIIIllIIlllIll() {
        lIllIIllIIIIl = new String[lIllIIllIIIlI[4]];
        lIllIIllIIIIl[lIllIIllIIIlI[0]] = llIIIllIIlllIlI("lY0OUGha7ck=", "bNuNq");
        lIllIIllIIIIl[lIllIIllIIIlI[3]] = llIIIllIIlllIlI("tWWU3rgwNKc=", "JlepP");
    }

    private static boolean llIIIllIIlllllI(int i) {
        return i == 0;
    }
}
