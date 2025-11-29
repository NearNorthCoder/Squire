package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/a.class */
public abstract class a extends Task {
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int m;
    private static /* synthetic */ String[] lIlIlllIllll;
    @Inject
    protected /* synthetic */ SquireCorpConfig o;
    private static /* synthetic */ int[] lIlIllllIIII;

    private static String lllIIIlIIIIlII(String lllllllllllllllIllIIIllllIIIlIll, String lllllllllllllllIllIIIllllIIIlIlI) {
        String lllllllllllllllIllIIIllllIIIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIIllllIIIlIII = lllllllllllllllIllIIIllllIIIlIlI.toCharArray();
        int lllllllllllllllIllIIIllllIIIIlll = lIlIllllIIII[1];
        char[] charArray = lllllllllllllllIllIIIllllIIIlIll2.toCharArray();
        int length = charArray.length;
        int i = lIlIllllIIII[1];
        while (lllIIIlIIIIlll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIIllllIIIlIII[lllllllllllllllIllIIIllllIIIIlll % lllllllllllllllIllIIIllllIIIlIII.length]));
            "".length();
            lllllllllllllllIllIIIllllIIIIlll++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lllIIIlIIIIllI();
        lllIIIlIIIIlIl();
        n = lIlIllllIIII[3];
        m = lIlIllllIIII[2];
    }

    private static boolean lllIIIlIIIlIII(int i, int i2) {
        return i != i2;
    }

    private static void lllIIIlIIIIlIl() {
        lIlIlllIllll = new String[lIlIllllIIII[0]];
        lIlIlllIllll[lIlIllllIIII[1]] = lllIIIlIIIIlII("AAo2IgUxACU+SgEAJSEe", "CeDRj");
    }

    private static void lllIIIlIIIIllI() {
        lIlIllllIIII = new int[4];
        lIlIllllIIII[0] = " ".length();
        lIlIllllIIII[1] = (20 ^ 92) & ((12 ^ 68) ^ (-1));
        lIlIllllIIII[2] = (-((-26961) & 31222)) & (-16385) & 32487;
        lIlIllllIIII[3] = (-((-9797) & 26581)) & (-36) & 28663;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean g() {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i = lIlIllllIIII[1];
        while (lllIIIlIIIIlll(i, length)) {
            int i2 = mapRegions[i];
            if (!lllIIIlIIIlIII(i2, lIlIllllIIII[2]) || lllIIIlIIIlIIl(i2, lIlIllllIIII[3])) {
                return lIlIllllIIII[0];
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIllllIIII[1];
    }

    public NPC f() {
        String[] strArr = new String[lIlIllllIIII[0]];
        strArr[lIlIllllIIII[1]] = lIlIlllIllll[lIlIllllIIII[1]];
        return NPCs.getNearest(strArr);
    }

    private static boolean lllIIIlIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIIIlIIl(int i, int i2) {
        return i == i2;
    }
}
