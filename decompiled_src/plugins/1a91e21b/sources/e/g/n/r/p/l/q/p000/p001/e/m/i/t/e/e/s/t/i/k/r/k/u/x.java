package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/x.class */
public abstract class x extends Task {
    private final /* synthetic */ List<Integer> ai;
    private static final /* synthetic */ int af;
    private static final /* synthetic */ int ag;
    protected final /* synthetic */ TempleTrekkingPlugin ah;
    private static /* synthetic */ int[] lIIllIlIIllII;
    private static /* synthetic */ String[] lIIllIlIIlIll;

    private static boolean lIllIIIIlIIIllI(int i) {
        return i == 0;
    }

    static {
        lIllIIIIlIIIIll();
        lIllIIIIlIIIIlI();
        ag = lIIllIlIIllII[2];
        af = lIIllIlIIllII[1];
    }

    public TileObject A() {
        return TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIlIIllII[4]];
            strArr[lIIllIlIIllII[0]] = lIIllIlIIlIll[lIIllIlIIllII[0]];
            return tileObject.hasAction(strArr);
        });
    }

    public abstract boolean z();

    private static boolean lIllIIIIlIIIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIIlIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x(TempleTrekkingPlugin templeTrekkingPlugin, int... iArr) {
        this.ah = templeTrekkingPlugin;
        this.ai = (List) IntStream.of(iArr).boxed().collect(Collectors.toList());
    }

    private static boolean lIllIIIIlIIIlII(int i) {
        return i != 0;
    }

    private static void lIllIIIIlIIIIll() {
        lIIllIlIIllII = new int[5];
        lIIllIlIIllII[0] = ((103 ^ 95) ^ (75 ^ 84)) & (((56 ^ 65) ^ (82 ^ 12)) ^ (-" ".length()));
        lIIllIlIIllII[1] = (-26697) & 28653;
        lIIllIlIIllII[2] = (-((-6611) & 24019)) & (-449) & 24575;
        lIIllIlIIllII[3] = "  ".length();
        lIIllIlIIllII[4] = " ".length();
    }

    private static void lIllIIIIlIIIIlI() {
        lIIllIlIIlIll = new String[lIIllIlIIllII[4]];
        lIIllIlIIlIll[lIIllIlIIllII[0]] = lIllIIIIlIIIIIl("DykDJwQiMwh+GT4jBg==", "LFmSm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (lIllIIIIlIIIlII(this.ah.e() ? 1 : 0)) {
            return lIIllIlIIllII[0];
        }
        this.ah.a(Static.getClient().getVarbitValue(lIIllIlIIllII[1]));
        this.ah.b(Static.getClient().getVarbitValue(lIIllIlIIllII[2]));
        if (!lIllIIIIlIIIlIl(this.ah.c(), lIIllIlIIllII[3]) && !lIllIIIIlIIIllI(this.ai.contains(Integer.valueOf(this.ah.b())) ? 1 : 0)) {
            return z();
        }
        return lIIllIlIIllII[0];
    }

    private static String lIllIIIIlIIIIIl(String llllllllllllllIlllIlllllIlIlIlll, String llllllllllllllIlllIlllllIlIlIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlllllIlIlIlII = llllllllllllllIlllIlllllIlIlIllI.toCharArray();
        int llllllllllllllIlllIlllllIlIlIIll = lIIllIlIIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlIIllII[0];
        while (lIllIIIIlIIIlll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIlllllIlIlIlII[llllllllllllllIlllIlllllIlIlIIll % llllllllllllllIlllIlllllIlIlIlII.length]));
            "".length();
            llllllllllllllIlllIlllllIlIlIIll++;
            i++;
            "".length();
            if (((50 ^ 15) ^ (28 ^ 37)) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
