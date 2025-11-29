package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.n  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/n.class */
public class n extends Task {
    private final /* synthetic */ f Q;
    private static /* synthetic */ String[] lllIIIIllIl;
    private final /* synthetic */ r R;
    private static /* synthetic */ int[] lllIIIIlllI;
    private final /* synthetic */ e O;
    private final /* synthetic */ d P;

    private static String lIlIllIlIlIllI(String llllllllllllllllIIlIIllllllIllII, String llllllllllllllllIIlIIllllllIlIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlllI[4], llllllllllllllllIIlIIllllllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllllllIllIl) {
            llllllllllllllllIIlIIllllllIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIllIlIllIIl(this.O.t() ? 1 : 0) || lIlIllIlIllIlI(this.O.y() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (!lIlIllIlIllIIl(this.O.s() ? 1 : 0) || lIlIllIlIllIll(this.P.m())) {
            return lllIIIIlllI[0];
        }
        if (!lIlIllIlIlllII(Movement.getRunEnergy(), lllIIIIlllI[1]) || lIlIllIlIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        if (lIlIllIlIllIIl(this.R.O() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lllIIIIllIl[lllIIIIlllI[3]]);
        });
        if (!lIlIllIlIllIll(first) || lIlIllIlIllIlI(this.Q.E() ? 1 : 0)) {
            return lllIIIIlllI[0];
        }
        first.interact(lllIIIIllIl[lllIIIIlllI[0]]);
        this.Q.B();
        sleep(lllIIIIlllI[2]);
        return lllIIIIlllI[3];
    }

    private static boolean lIlIllIlIlllII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIlIlIlIl(String llllllllllllllllIIlIIlllllIlllII, String llllllllllllllllIIlIIlllllIllIll) {
        String llllllllllllllllIIlIIlllllIlllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlllllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIlllllIllIIl = llllllllllllllllIIlIIlllllIllIll.toCharArray();
        int llllllllllllllllIIlIIlllllIllIII = lllIIIIlllI[0];
        char[] charArray = llllllllllllllllIIlIIlllllIlllII2.toCharArray();
        int length = charArray.length;
        int i = lllIIIIlllI[0];
        while (lIlIllIlIlllII(i, length)) {
            char llllllllllllllllIIlIIlllllIlllIl = charArray[i];
            sb.append((char) (llllllllllllllllIIlIIlllllIlllIl ^ llllllllllllllllIIlIIlllllIllIIl[llllllllllllllllIIlIIlllllIllIII % llllllllllllllllIIlIIlllllIllIIl.length]));
            "".length();
            llllllllllllllllIIlIIlllllIllIII++;
            i++;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIllIlIlIlll() {
        lllIIIIllIl = new String[lllIIIIlllI[4]];
        lllIIIIllIl[lllIIIIlllI[0]] = lIlIllIlIlIlIl("IDcIGic=", "dEatL");
        lllIIIIllIl[lllIIIIlllI[3]] = lIlIllIlIlIllI("D616Rsr/ryk=", "xXYze");
    }

    @Inject
    public n(e eVar, d dVar, f fVar, r rVar) {
        this.O = eVar;
        this.P = dVar;
        this.Q = fVar;
        this.R = rVar;
    }

    private static boolean lIlIllIlIllIlI(int i) {
        return i == 0;
    }

    static {
        lIlIllIlIllIII();
        lIlIllIlIlIlll();
    }

    private static boolean lIlIllIlIllIIl(int i) {
        return i != 0;
    }

    private static void lIlIllIlIllIII() {
        lllIIIIlllI = new int[5];
        lllIIIIlllI[0] = ((93 ^ 60) ^ (180 ^ 134)) & (((((129 + 69) - 125) + 166) ^ (((138 + 135) - 135) + 50)) ^ (-" ".length()));
        lllIIIIlllI[1] = 136 ^ 150;
        lllIIIIlllI[2] = "   ".length();
        lllIIIIlllI[3] = " ".length();
        lllIIIIlllI[4] = "  ".length();
    }

    private static boolean lIlIllIlIllIll(Object obj) {
        return obj != null;
    }
}
