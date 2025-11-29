package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using imbued heart", priority = 13337, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.r  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/r.class */
public class r extends Task {
    private static /* synthetic */ int[] llllIIIllll;
    private final /* synthetic */ SquireBarrows aa;
    private static /* synthetic */ String[] llllIIIlllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (lIllIIlllllIIl(this.aa.m() ? 1 : 0) && lIllIIlllllIIl(this.aa.h() ? 1 : 0)) {
            return llllIIIllll[0];
        }
        int[] iArr = new int[llllIIIllll[1]];
        iArr[llllIIIllll[0]] = llllIIIllll[2];
        iArr[llllIIIllll[3]] = llllIIIllll[4];
        Item first = Inventory.getFirst(iArr);
        if (!lIllIIlllllIlI(first) && !lIllIIlllllIll(Vars.getBit(llllIIIllll[5]))) {
            first.interact(llllIIIlllI[llllIIIllll[0]]);
            return llllIIIllll[3];
        }
        return llllIIIllll[0];
    }

    private static boolean lIllIIlllllIll(int i) {
        return i > 0;
    }

    private static void lIllIIllllIlll() {
        llllIIIlllI = new String[llllIIIllll[3]];
        llllIIIlllI[llllIIIllll[0]] = lIllIIllllIllI("/xmqs3aJcBbJBgG/qk4MaQ==", "lEGFK");
    }

    private static String lIllIIllllIllI(String llllllllllllllllIIIlllIIllIlIIIl, String llllllllllllllllIIIlllIIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIIllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIIllIlIIll.init(llllIIIllll[1], secretKeySpec);
            return new String(llllllllllllllllIIIlllIIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIIllIlIIlI) {
            llllllllllllllllIIIlllIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllllIIl(int i) {
        return i == 0;
    }

    static {
        lIllIIlllllIII();
        lIllIIllllIlll();
    }

    @Inject
    public r(SquireBarrows squireBarrows) {
        this.aa = squireBarrows;
    }

    private static boolean lIllIIlllllIlI(Object obj) {
        return obj == null;
    }

    private static void lIllIIlllllIII() {
        llllIIIllll = new int[6];
        llllIIIllll[0] = (119 ^ 48) & ((67 ^ 4) ^ (-1));
        llllIIIllll[1] = "  ".length();
        llllIIIllll[2] = (-((-89) & 11867)) & (-1) & 32502;
        llllIIIllll[3] = " ".length();
        llllIIIllll[4] = (-" ".length()) & (-1029) & 28669;
        llllIIIllll[5] = (-((-5251) & 32651)) & (-3) & 32763;
    }
}
