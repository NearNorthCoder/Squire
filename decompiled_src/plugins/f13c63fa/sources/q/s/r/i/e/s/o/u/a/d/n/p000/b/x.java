package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking range potion")
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.x  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/x.class */
public class x extends Task {
    private static /* synthetic */ String[] lllIIIIllll;
    private static /* synthetic */ int[] lllIIIlIIIl;
    private final /* synthetic */ e ax;

    private static boolean lIlIllIllIIlII(int i) {
        return i != 0;
    }

    @Inject
    public x(e eVar) {
        this.ax = eVar;
    }

    private static boolean lIlIllIllIIlll(int i) {
        return i == 0;
    }

    private static String lIlIllIlIllllI(String llllllllllllllllIIlIIlllIllIlIIl, String llllllllllllllllIIlIIlllIllIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIllIlIll.init(lllIIIlIIIl[4], llllllllllllllllIIlIIlllIllIllII);
            return new String(llllllllllllllllIIlIIlllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIllIlIlI) {
            llllllllllllllllIIlIIlllIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllIIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIllIIllI(Object obj) {
        return obj == null;
    }

    private static void lIlIllIllIIIlI() {
        lllIIIIllll = new String[lllIIIlIIIl[5]];
        lllIIIIllll[lllIIIlIIIl[0]] = lIlIllIlIlllIl("Kvv2BhGQxSc=", "vyEVi");
        lllIIIIllll[lllIIIlIIIl[3]] = lIlIllIlIllllI("PNYySuQCDVM=", "vKQnf");
        lllIIIIllll[lllIIIlIIIl[4]] = lIlIllIlIllllI("KADTKeOZKwA=", "cpFBa");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIllIllIIlII(this.ax.t() ? 1 : 0) || lIlIllIllIIlII(this.ax.s() ? 1 : 0)) {
            return lllIIIlIIIl[0];
        }
        if (lIlIllIllIIlIl(this.ax.r(), lllIIIlIIIl[1])) {
            return lllIIIlIIIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIllIllIIlll(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[3]]) ? 1 : 0) || lIlIllIllIIlII(item.getName().toLowerCase().contains(lllIIIIllll[lllIIIlIIIl[4]]) ? 1 : 0)) {
                ?? r0 = lllIIIlIIIl[3];
                "".length();
                return (171 ^ 175) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIlIIIl[0];
        });
        if (!lIlIllIllIIllI(first) && !lIlIllIllIIlIl(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), lllIIIlIIIl[2])) {
            first.interact(lllIIIIllll[lllIIIlIIIl[0]]);
            return lllIIIlIIIl[3];
        }
        return lllIIIlIIIl[0];
    }

    private static String lIlIllIlIlllIl(String llllllllllllllllIIlIIlllIlIlllII, String llllllllllllllllIIlIIlllIlIllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlIllIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIl[6]), "DES");
            Cipher llllllllllllllllIIlIIlllIlIllllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIlIllllI.init(lllIIIlIIIl[4], llllllllllllllllIIlIIlllIlIlllll);
            return new String(llllllllllllllllIIlIIlllIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIlIlllIl) {
            llllllllllllllllIIlIIlllIlIlllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIllIIIll();
        lIlIllIllIIIlI();
    }

    private static void lIlIllIllIIIll() {
        lllIIIlIIIl = new int[7];
        lllIIIlIIIl[0] = ((217 ^ 135) ^ (26 ^ 67)) & (((19 ^ 43) ^ (20 ^ 43)) ^ (-" ".length()));
        lllIIIlIIIl[1] = 148 ^ 145;
        lllIIIlIIIl[2] = 20 ^ 18;
        lllIIIlIIIl[3] = " ".length();
        lllIIIlIIIl[4] = "  ".length();
        lllIIIlIIIl[5] = "   ".length();
        lllIIIlIIIl[6] = (154 ^ 149) ^ (67 ^ 68);
    }
}
