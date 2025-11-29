package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
@TaskDesc(name = "Handle alembic")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.k  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/k.class */
public class k extends Task {
    private final /* synthetic */ SquireMixologyConfig T;
    private static /* synthetic */ String[] lllllllIllIl;
    private static /* synthetic */ int[] lllllllIlllI;
    /* synthetic */ int S = lllllllIlllI[0];

    private static boolean lIIlIlIlIlllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIlIllIlIl(s.e() ? 1 : 0) && !lIIlIlIlIllIllI(this.T.pluginMode(), d.MINIGAME) && !lIIlIlIlIllIlIl(s.a(lllllllIlllI[2], lllllllIlllI[3], lllllllIlllI[4]) ? 1 : 0) && !lIIlIlIlIllIlIl(Players.getLocal().isIdle() ? 1 : 0)) {
            if (lIIlIlIlIllIlll(this.T.potionStrategy(), f.MULTI_ORDER)) {
                if (lIIlIlIlIllIlIl(s.g() ? 1 : 0) && lIIlIlIlIlllIII(Vars.getBit(lllllllIlllI[3]), lllllllIlllI[5])) {
                    return lllllllIlllI[1];
                }
                s.j();
                if (lIIlIlIlIlllIIl(SquireMixology.x, this.S)) {
                    return lllllllIlllI[1];
                }
            }
            if (lIIlIlIlIllIllI(this.T.potionStrategy(), f.MULTI_ORDER) && lIIlIlIlIlllIIl(SquireMixology.r, this.S)) {
                return lllllllIlllI[1];
            }
            SquireMixology.g = lllllllIllIl[lllllllIlllI[1]];
            int[] iArr = new int[lllllllIlllI[5]];
            iArr[lllllllIlllI[1]] = lllllllIlllI[4];
            TileObjects.getNearest(iArr).interact(lllllllIlllI[1]);
            return lllllllIlllI[1];
        }
        return lllllllIlllI[1];
    }

    private static boolean lIIlIlIlIllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlIlIllIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIlIlllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlIlIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIlIlIlIllIlII() {
        lllllllIlllI = new int[6];
        lllllllIlllI[0] = (-8597) & 14269;
        lllllllIlllI[1] = (103 ^ 95) & ((164 ^ 156) ^ (-1));
        lllllllIlllI[2] = (-17441) & 20395;
        lllllllIlllI[3] = (-((-9285) & 30431)) & (-293) & 32766;
        lllllllIlllI[4] = (-((-18639) & 28143)) & (-513) & 65407;
        lllllllIlllI[5] = " ".length();
    }

    @Inject
    public k(SquireMixologyConfig squireMixologyConfig) {
        this.T = squireMixologyConfig;
    }

    static {
        lIIlIlIlIllIlII();
        lIIlIlIlIllIIll();
    }

    private static String lIIlIlIlIllIIlI(String lllllllllllllllIIlIIIlIIIIIlllIl, String lllllllllllllllIIlIIIlIIIIIlllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIIIIIllIll = new StringBuilder();
        char[] lllllllllllllllIIlIIIlIIIIIllIlI = lllllllllllllllIIlIIIlIIIIIlllII.toCharArray();
        int lllllllllllllllIIlIIIlIIIIIllIIl = lllllllIlllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllllllIlllI[1];
        while (lIIlIlIlIlllIII(i, length)) {
            lllllllllllllllIIlIIIlIIIIIllIll.append((char) (charArray[i] ^ lllllllllllllllIIlIIIlIIIIIllIlI[lllllllllllllllIIlIIIlIIIIIllIIl % lllllllllllllllIIlIIIlIIIIIllIlI.length]));
            "".length();
            lllllllllllllllIIlIIIlIIIIIllIIl++;
            i++;
            "".length();
            if (" ".length() > (151 ^ 147)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIlIIIIIllIll);
    }

    private static void lIIlIlIlIllIIll() {
        lllllllIllIl = new String[lllllllIlllI[5]];
        lllllllIllIl[lllllllIlllI[1]] = lIIlIlIlIllIIlI("DTw9BxovIi0HByAp", "NNDtn");
    }
}
