package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@TaskDesc(name = "Mixing vessel")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.n  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/n.class */
public class n extends Task {
    private final /* synthetic */ SquireMixologyConfig X;
    private static /* synthetic */ int[] lIIIIIIIIllll;
    private static /* synthetic */ String[] lIIIIIIIIlllI;

    private static boolean lIIlIllIlIIIlII(int i) {
        return i == 0;
    }

    private static void lIIlIllIlIIIIll() {
        lIIIIIIIIllll = new int[4];
        lIIIIIIIIllll[0] = (250 ^ 161) & ((126 ^ 37) ^ (-1));
        lIIIIIIIIllll[1] = (-289) & 11627;
        lIIIIIIIIllll[2] = " ".length();
        lIIIIIIIIllll[3] = (-((-8373) & 9917)) & (-8337) & 65275;
    }

    private static void lIIlIllIlIIIIlI() {
        lIIIIIIIIlllI = new String[lIIIIIIIIllll[2]];
        lIIIIIIIIlllI[lIIIIIIIIllll[0]] = lIIlIllIlIIIIIl("NQc9CBwGRjATHQxGIAQBEgM6", "afVar");
    }

    static {
        lIIlIllIlIIIIll();
        lIIlIllIlIIIIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (!lIIlIllIlIIIlII(s.e() ? 1 : 0) && !lIIlIllIlIIIlIl(this.X.pluginMode(), d.MINIGAME)) {
            if ((!lIIlIllIlIIIlII(SquireMixology.k ? 1 : 0) || !lIIlIllIlIIIllI(s.g() ? 1 : 0)) && !lIIlIllIlIIIllI(SquireMixology.k ? 1 : 0)) {
                if ((!lIIlIllIlIIIlll(this.X.potionStrategy(), f.SINGLE_ORDER) || !lIIlIllIlIIIllI(s.f() ? 1 : 0)) && !lIIlIllIlIIlIII(Vars.getBit(lIIIIIIIIllll[1]), lIIIIIIIIllll[2])) {
                    SquireMixology.g = lIIIIIIIIlllI[lIIIIIIIIllll[0]];
                    int[] iArr = new int[lIIIIIIIIllll[2]];
                    iArr[lIIIIIIIIllll[0]] = lIIIIIIIIllll[3];
                    TileObjects.getNearest(iArr).interact(lIIIIIIIIllll[0]);
                    return lIIIIIIIIllll[0];
                }
                return lIIIIIIIIllll[0];
            }
            return lIIIIIIIIllll[0];
        }
        return lIIIIIIIIllll[0];
    }

    @Inject
    public n(SquireMixologyConfig squireMixologyConfig) {
        this.X = squireMixologyConfig;
    }

    private static String lIIlIllIlIIIIIl(String lllllllllllllllIIIlllllllIlIIlIl, String lllllllllllllllIIIlllllllIlIIlII) {
        String lllllllllllllllIIIlllllllIlIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIlllllllIlIIIlI = lllllllllllllllIIIlllllllIlIIlII.toCharArray();
        int lllllllllllllllIIIlllllllIlIIIIl = lIIIIIIIIllll[0];
        char[] charArray = lllllllllllllllIIIlllllllIlIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIIIllll[0];
        while (lIIlIllIlIIlIII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIlllllllIlIIIlI[lllllllllllllllIIIlllllllIlIIIIl % lllllllllllllllIIIlllllllIlIIIlI.length]));
            "".length();
            lllllllllllllllIIIlllllllIlIIIIl++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIllIlIIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIllIlIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIlIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlIllIlIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }
}
