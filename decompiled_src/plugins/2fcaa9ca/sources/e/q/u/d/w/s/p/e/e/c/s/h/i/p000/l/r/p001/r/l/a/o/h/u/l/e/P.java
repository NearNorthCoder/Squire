package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Enter Sepulchre", priority = 25, blocking = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.P  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/P.class */
public class P extends Task {
    private /* synthetic */ TileObject ap;
    private static /* synthetic */ String[] lllIIIlIlIIl;
    private /* synthetic */ J aq;
    private final /* synthetic */ SquireSepulchre am;
    private final /* synthetic */ SquireSepulchreConfig an;
    private static /* synthetic */ int[] lllIIIlIllII;
    private /* synthetic */ Player ai;
    private final /* synthetic */ C0003d ao;

    private static boolean lIIIlIIlIIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlIIlIIlIllI(int i) {
        return i != 0;
    }

    @Inject
    public P(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, C0003d c0003d) {
        this.an = squireSepulchreConfig;
        this.am = squireSepulchre;
        this.ao = c0003d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (!lIIIlIIlIIlIlII(local) && !lIIIlIIlIIlIlIl(C0001b.B.contains(local) ? 1 : 0) && !lIIIlIIlIIlIlIl(this.am.j().matchesInventory() ? 1 : 0)) {
            if (lIIIlIIlIIlIllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lllIIIlIllII[0]);
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lllIIIlIllII[1]];
                strArr[lllIIIlIllII[0]] = lllIIIlIlIIl[lllIIIlIllII[1]];
                if (lIIIlIIlIIlIllI(tileObject.hasAction(strArr) ? 1 : 0) && lIIIlIIlIIlIllI(tileObject.getName().startsWith(lllIIIlIlIIl[lllIIIlIllII[2]]) ? 1 : 0)) {
                    ?? r0 = lllIIIlIllII[1];
                    "".length();
                    return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlIllII[0];
            });
            if (lIIIlIIlIIlIlII(nearest)) {
                return lllIIIlIllII[0];
            }
            nearest.interact(lllIIIlIlIIl[lllIIIlIllII[0]]);
            return lllIIIlIllII[1];
        }
        return lllIIIlIllII[0];
    }

    static {
        lIIIlIIlIIlIIll();
        lIIIlIIlIIlIIlI();
    }

    private static void lIIIlIIlIIlIIlI() {
        lllIIIlIlIIl = new String[lllIIIlIllII[3]];
        lllIIIlIlIIl[lllIIIlIllII[0]] = lIIIlIIlIIlIIIl("KiACGihEKAQAJA==", "iLkwJ");
        lllIIIlIlIIl[lllIIIlIllII[1]] = lIIIlIIlIIlIIIl("MxkaCBVdERwSGQ==", "pusew");
        lllIIIlIlIIl[lllIIIlIllII[2]] = lIIIlIIlIIlIIIl("EjUXATky", "AAvhK");
    }

    private static String lIIIlIIlIIlIIIl(String lllllllllllllllIIllIlllIlllIlIII, String lllllllllllllllIIllIlllIlllIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlllIlllIIllI = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlllIlllIIlll.toCharArray();
        int lllllllllllllllIIllIlllIlllIIlII = lllIIIlIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlIllII[0];
        while (lIIIlIIlIIllIIl(i, length)) {
            char lllllllllllllllIIllIlllIlllIlIIl = charArray2[i];
            lllllllllllllllIIllIlllIlllIIllI.append((char) (lllllllllllllllIIllIlllIlllIlIIl ^ charArray[lllllllllllllllIIllIlllIlllIIlII % charArray.length]));
            "".length();
            lllllllllllllllIIllIlllIlllIIlII++;
            i++;
            "".length();
            if ((((82 ^ 24) ^ (31 ^ 114)) & (((109 ^ 90) ^ (150 ^ 134)) ^ (-" ".length()))) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlllIlllIIllI);
    }

    private static boolean lIIIlIIlIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIlIIlIIll() {
        lllIIIlIllII = new int[4];
        lllIIIlIllII[0] = (119 ^ 102) & ((168 ^ 185) ^ (-1));
        lllIIIlIllII[1] = " ".length();
        lllIIIlIllII[2] = "  ".length();
        lllIIIlIllII[3] = "   ".length();
    }

    private static boolean lIIIlIIlIIlIlII(Object obj) {
        return obj == null;
    }
}
