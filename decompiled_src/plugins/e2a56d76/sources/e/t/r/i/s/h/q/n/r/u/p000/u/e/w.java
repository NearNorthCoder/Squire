package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Jumping Pitfall Trap", priority = 20, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.w  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/w.class */
public class w extends x {
    private static /* synthetic */ String[] lllIlllllIlI;
    private static /* synthetic */ int[] lllIlllllIll;

    static {
        lIIIlllIIIlllll();
        lIIIlllIIIllllI();
    }

    private static boolean lIIIlllIIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlllIIlIIIII(Object obj) {
        return obj == null;
    }

    private static void lIIIlllIIIllllI() {
        lllIlllllIlI = new String[lllIlllllIll[3]];
        lllIlllllIlI[lllIlllllIll[0]] = lIIIlllIIIlllIl("Jw8aOQ==", "mzwIL");
    }

    private static void lIIIlllIIIlllll() {
        lllIlllllIll = new int[4];
        lllIlllllIll[0] = (53 ^ 121) & ((69 ^ 9) ^ (-1));
        lllIlllllIll[1] = "  ".length();
        lllIlllllIll[2] = 47 ^ 41;
        lllIlllllIll[3] = " ".length();
    }

    private static String lIIIlllIIIlllIl(String lllllllllllllllIIlIllIllIIIlllIl, String lllllllllllllllIIlIllIllIIlIIIIl) {
        String lllllllllllllllIIlIllIllIIIlllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllIIlIIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIllIIlIIIIl.toCharArray();
        int lllllllllllllllIIlIllIllIIIllllI = lllIlllllIll[0];
        char[] charArray2 = lllllllllllllllIIlIllIllIIIlllIl2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIlIllIllIIIlIllI = lllIlllllIll[0];
        while (lIIIlllIIlIIIlI(lllllllllllllllIIlIllIllIIIlIllI, length)) {
            char lllllllllllllllIIlIllIllIIlIIIll = charArray2[lllllllllllllllIIlIllIllIIIlIllI];
            lllllllllllllllIIlIllIllIIlIIIII.append((char) (lllllllllllllllIIlIllIllIIlIIIll ^ charArray[lllllllllllllllIIlIllIllIIIllllI % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIllIIIllllI++;
            lllllllllllllllIIlIllIllIIIlIllI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIllIIlIIIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        GameObject F = F();
        if (lIIIlllIIlIIIII(F)) {
            return lllIlllllIll[0];
        }
        NPC E = E();
        if (!lIIIlllIIlIIIII(E) && !lIIIlllIIlIIIIl(F.getWorldArea().contains(E.getWorldLocation()) ? 1 : 0)) {
            F.interact(lllIlllllIlI[lllIlllllIll[0]]);
            if (lIIIlllIIlIIIlI(F.distanceTo(Players.getLocal()), lllIlllllIll[1]) && lIIIlllIIlIIIlI(E.distanceTo(Players.getLocal()), lllIlllllIll[1])) {
                sleep(lllIlllllIll[2]);
                return lllIlllllIll[3];
            }
            sleep(lllIlllllIll[1]);
            return lllIlllllIll[3];
        }
        return lllIlllllIll[0];
    }

    private static boolean lIIIlllIIlIIIIl(int i) {
        return i != 0;
    }

    @Inject
    public w(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig);
    }
}
