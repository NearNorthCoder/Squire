package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Going back through pass", priority = 100, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.P  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/P.class */
public class P extends S {
    private static /* synthetic */ int[] lllllIlIIIII;
    private static /* synthetic */ String[] lllllIIlllll;

    private static void lIIlIIllIIIlIlI() {
        lllllIIlllll = new String[lllllIlIIIII[1]];
        lllllIIlllll[lllllIlIIIII[0]] = lIIlIIllIIIlIIl("MANUDBoFAwwfGg==", "wlyxr");
    }

    private static void lIIlIIllIIIlIll() {
        lllllIlIIIII = new int[3];
        lllllIlIIIII[0] = ((((142 + 88) - 220) + 197) ^ (((100 + 25) - 70) + 139)) & (((((58 + 57) - 100) + 145) ^ (((138 + 41) - 40) + 34)) ^ (-" ".length()));
        lllllIlIIIII[1] = " ".length();
        lllllIlIIIII[2] = (-" ".length()) & (-6658) & 47983;
    }

    private static boolean lIIlIIllIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIllIIIlllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIllIIIlIll();
        lIIlIIllIIIlIlI();
    }

    @Inject
    protected P(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static String lIIlIIllIIIlIIl(String lllllllllllllllIIlIIlIllIIIIlIlI, String lllllllllllllllIIlIIlIllIIIIlIIl) {
        String lllllllllllllllIIlIIlIllIIIIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIllIIIIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIlIllIIIIlIIl.toCharArray();
        int lllllllllllllllIIlIIlIllIIIIIllI = lllllIlIIIII[0];
        char[] charArray2 = lllllllllllllllIIlIIlIllIIIIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lllllIlIIIII[0];
        while (lIIlIIllIIIlllI(i, length)) {
            lllllllllllllllIIlIIlIllIIIIlIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIlIllIIIIIllI % charArray.length]));
            "".length();
            lllllllllllllllIIlIIlIllIIIIIllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIlIllIIIIlIII);
    }

    private static boolean lIIlIIllIIIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.S
    public boolean t() {
        if (!lIIlIIllIIIllII(y()) || lIIlIIllIIIllII(z() ? 1 : 0)) {
            return lllllIlIIIII[0];
        }
        int[] iArr = new int[lllllIlIIIII[1]];
        iArr[lllllIlIIIII[0]] = lllllIlIIIII[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIlIIllIIIllIl(nearest)) {
            return lllllIlIIIII[0];
        }
        nearest.interact(lllllIIlllll[lllllIlIIIII[0]]);
        return lllllIlIIIII[1];
    }
}
