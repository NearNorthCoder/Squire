package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.NPC;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Looting", priority = 500, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.az  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/az.class */
public class az extends Task {
    private final /* synthetic */ C0013j eE;
    private static /* synthetic */ String[] llllIlIlllIl;
    private final /* synthetic */ C0011h eG;
    private static final /* synthetic */ Logger eD;
    private final /* synthetic */ SquireNightmareConfig eF;
    private static /* synthetic */ int[] llllIlIllllI;
    private final /* synthetic */ SquireNightmarePlugin eH;

    private static void lIIlIIIlIIlIllI() {
        llllIlIlllIl = new String[llllIlIllllI[1]];
        llllIlIlllIl[llllIlIllllI[0]] = lIIlIIIlIIlIlIl("DREVDCU7Gg==", "IxfxP");
    }

    private static boolean lIIlIIIlIIllIII(int i) {
        return i == 0;
    }

    @Inject
    public az(SquireNightmarePlugin squireNightmarePlugin, C0013j c0013j, SquireNightmareConfig squireNightmareConfig, C0011h c0011h) {
        this.eH = squireNightmarePlugin;
        this.eE = c0013j;
        this.eF = squireNightmareConfig;
        this.eG = c0011h;
    }

    private static String lIIlIIIlIIlIlIl(String lllllllllllllllIIlIllIIIllIllIIl, String lllllllllllllllIIlIllIIIllIllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIIllIllIII.toCharArray();
        int lllllllllllllllIIlIllIIIllIlIlIl = llllIlIllllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIlIllllI[0];
        while (lIIlIIIlIIllIll(i, length)) {
            char lllllllllllllllIIlIllIIIllIllIlI = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIllIIIllIllIlI ^ charArray[lllllllllllllllIIlIllIIIllIlIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIIllIlIlIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIIlIIllIIl(int i) {
        return i != 0;
    }

    static {
        lIIlIIIlIIlIlll();
        lIIlIIIlIIlIllI();
        eD = LoggerFactory.getLogger(az.class);
    }

    private static boolean lIIlIIIlIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIIIlIIlIlll() {
        llllIlIllllI = new int[2];
        llllIlIllllI[0] = (5 ^ 38) & ((189 ^ 158) ^ (-1));
        llllIlIllllI[1] = " ".length();
    }

    private static boolean lIIlIIIlIIllIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean run() {
        if (!lIIlIIIlIIllIII(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIlIIIlIIllIIl(this.eF.assistantMode() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIlIIIlIIllIlI(d)) {
                return llllIlIllllI[0];
            }
            String[] strArr = new String[llllIlIllllI[1]];
            strArr[llllIlIllllI[0]] = llllIlIlllIl[llllIlIllllI[0]];
            if (lIIlIIIlIIllIII(d.hasAction(strArr) ? 1 : 0)) {
                return llllIlIllllI[0];
            }
            boolean aG = this.eG.aG();
            sleep(llllIlIllllI[1]);
            return aG;
        }
        return llllIlIllllI[0];
    }
}
