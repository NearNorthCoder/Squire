package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing seeds", priority = 100, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.x  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/x.class */
public class x extends Task {
    private static final /* synthetic */ int ah;
    private final /* synthetic */ Client ak;
    private static /* synthetic */ String[] lIIlllIIllIll;
    private final /* synthetic */ SquireThievingConfig ai;
    private final /* synthetic */ SquireThieving aj;
    private static /* synthetic */ int[] lIIlllIIlllII;

    private static boolean lIllIIllIIlIlll(int i) {
        return i == 0;
    }

    private static boolean lIllIIllIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIIllIIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIllIIllIIlIIll() {
        lIIlllIIllIll = new String[lIIlllIIlllII[2]];
        lIIlllIIllIll[lIIlllIIlllII[0]] = lIllIIllIIlIIlI("ICIgIw==", "oREMJ");
    }

    private static void lIllIIllIIlIlII() {
        lIIlllIIlllII = new int[6];
        lIIlllIIlllII[0] = ((78 ^ 124) ^ (22 ^ 114)) & (((((150 + 192) - 154) + 29) ^ (((75 + 64) - 76) + 80)) ^ (-" ".length()));
        lIIlllIIlllII[1] = (-((-26705) & 31607)) & (-8321) & 41366463;
        lIIlllIIlllII[2] = " ".length();
        lIIlllIIlllII[3] = (-((-24670) & 30847)) & (-129) & 32511;
        lIIlllIIlllII[4] = (148 ^ 167) ^ (9 ^ 62);
        lIIlllIIlllII[5] = "  ".length();
    }

    static {
        lIllIIllIIlIlII();
        lIllIIllIIlIIll();
        ah = lIIlllIIlllII[1];
    }

    private static boolean lIllIIllIIlIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIllIIllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIllIIllIIlIlIl(this.ai.method(), EnumC0001b.PICKPOCKETING) || lIllIIllIIlIllI(this.ai.pickpocketTarget(), EnumC0005f.MASTER_FARMER)) {
            return lIIlllIIlllII[0];
        }
        if (!lIllIIllIIlIlll(this.ai.depositSeedVault() ? 1 : 0) && !lIllIIllIIlIlll(Inventory.isFull() ? 1 : 0)) {
            Widget widget = this.ak.getWidget(lIIlllIIlllII[1]);
            if (lIllIIllIIllIII(widget) && !lIllIIllIIllIIl(widget.isHidden() ? 1 : 0)) {
                widget.interact(lIIlllIIlllII[0]);
                sleep(lIIlllIIlllII[5]);
                return lIIlllIIlllII[2];
            }
            int[] iArr = new int[lIIlllIIlllII[2]];
            iArr[lIIlllIIlllII[0]] = lIIlllIIlllII[3];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIllIIllIIllIlI(nearest)) {
                return lIIlllIIlllII[0];
            }
            nearest.interact(lIIlllIIllIll[lIIlllIIlllII[0]]);
            sleep(lIIlllIIlllII[4]);
            return lIIlllIIlllII[2];
        }
        return lIIlllIIlllII[0];
    }

    private static boolean lIllIIllIIllIlI(Object obj) {
        return obj == null;
    }

    @Inject
    public x(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, Client client) {
        this.ai = squireThievingConfig;
        this.aj = squireThieving;
        this.ak = client;
    }

    private static String lIllIIllIIlIIlI(String llllllllllllllIlllIlIlllllIllIIl, String llllllllllllllIlllIlIlllllIllIII) {
        String llllllllllllllIlllIlIlllllIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIlllllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlIlllllIlIllI = llllllllllllllIlllIlIlllllIllIII.toCharArray();
        int llllllllllllllIlllIlIlllllIlIlIl = lIIlllIIlllII[0];
        char[] charArray = llllllllllllllIlllIlIlllllIllIIl2.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIlllII[0];
        while (lIllIIllIIllIll(i, length)) {
            char llllllllllllllIlllIlIlllllIllIlI = charArray[i];
            sb.append((char) (llllllllllllllIlllIlIlllllIllIlI ^ llllllllllllllIlllIlIlllllIlIllI[llllllllllllllIlllIlIlllllIlIlIl % llllllllllllllIlllIlIlllllIlIllI.length]));
            "".length();
            llllllllllllllIlllIlIlllllIlIlIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIllIIllIII(Object obj) {
        return obj != null;
    }
}
