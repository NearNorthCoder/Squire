package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Teasing Animal", priority = 10, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.z  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/z.class */
public class z extends x {
    public static final /* synthetic */ int G;
    private static /* synthetic */ String[] llllIIIIIIlI;
    private static /* synthetic */ int[] llllIIIIIIll;

    private static void lIIIlllIIlllIlI() {
        llllIIIIIIll = new int[4];
        llllIIIIIIll[0] = (-" ".length()) & (-20481) & 23547;
        llllIIIIIIll[1] = (30 ^ 14) ^ (177 ^ 165);
        llllIIIIIIll[2] = (((182 ^ 173) & ((98 ^ 121) ^ (-1))) ^ (58 ^ 124)) & (((125 ^ 120) ^ (6 ^ 69)) ^ (-" ".length()));
        llllIIIIIIll[3] = " ".length();
    }

    static {
        lIIIlllIIlllIlI();
        lIIIlllIIlllIIl();
        G = llllIIIIIIll[0];
    }

    private static boolean lIIIlllIIllllll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public z(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        if (lIIIlllIIlllIll(Players.getLocal().getAnimation(), llllIIIIIIll[0])) {
            sleep(llllIIIIIIll[1]);
            return llllIIIIIIll[2];
        }
        GameObject F = F();
        if (!lIIIlllIIllllII(F) && !lIIIlllIIllllIl(E())) {
            NPC D = D();
            if (!lIIIlllIIllllII(D) && !lIIIlllIIlllllI(F.getWorldArea().contains(D.getWorldLocation()) ? 1 : 0)) {
                D.interact(llllIIIIIIlI[llllIIIIIIll[2]]);
                return llllIIIIIIll[3];
            }
            return llllIIIIIIll[2];
        }
        return llllIIIIIIll[2];
    }

    private static boolean lIIIlllIIllllII(Object obj) {
        return obj == null;
    }

    private static void lIIIlllIIlllIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[3]];
        llllIIIIIIlI[llllIIIIIIll[2]] = lIIIlllIIlllIII("JigzNBM=", "rMRGv");
    }

    private static boolean lIIIlllIIlllIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlllIIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIIlllllI(int i) {
        return i != 0;
    }

    private static String lIIIlllIIlllIII(String lllllllllllllllIIlIllIlIIllllIlI, String lllllllllllllllIIlIllIlIIllllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIIllllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIlIIllllIIl.toCharArray();
        int lllllllllllllllIIlIllIlIIlllIllI = llllIIIIIIll[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIIIll[2];
        while (lIIIlllIIllllll(i, length)) {
            char lllllllllllllllIIlIllIlIIllllIll = charArray2[i];
            lllllllllllllllIIlIllIlIIllllIII.append((char) (lllllllllllllllIIlIllIlIIllllIll ^ charArray[lllllllllllllllIIlIllIlIIlllIllI % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIlIIlllIllI++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIlIIllllIII);
    }
}
