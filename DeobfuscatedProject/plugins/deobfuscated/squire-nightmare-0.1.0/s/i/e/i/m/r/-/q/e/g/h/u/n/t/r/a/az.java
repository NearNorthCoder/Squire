/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Looting", priority=500, blocking=true)
public class az
extends Task {
    private final /* synthetic */ j eE;
    private static /* synthetic */ String[] llllIlIlllIl;
    private final /* synthetic */ h eG;
    private static final /* synthetic */ Logger eD;
    private final /* synthetic */ SquireNightmareConfig eF;
    private static /* synthetic */ int[] llllIlIllllI;
    private final /* synthetic */ SquireNightmarePlugin eH;

    private static void lIIlIIIlIIlIllI() {
        llllIlIlllIl = new String[llllIlIllllI[1]];
        az.llllIlIlllIl[az.llllIlIllllI[0]] = az."Disturb";
    }

    private static boolean lIIlIIIlIIllIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public az(SquireNightmarePlugin squireNightmarePlugin, j j2, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.eH = squireNightmarePlugin;
        this.eE = j2;
        this.eF = squireNightmareConfig;
        this.eG = h2;
    }

    private static String lIIlIIIlIIlIlIl(String lllllllllllllllIIlIllIIIllIllIIl, String lllllllllllllllIIlIllIIIllIllIII) {
        lllllllllllllllIIlIllIIIllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIllIlIlll = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIllIlIllI = lllllllllllllllIIlIllIIIllIllIII.toCharArray();
        int lllllllllllllllIIlIllIIIllIlIlIl = llllIlIllllI[0];
        char[] lllllllllllllllIIlIllIIIllIIllll = lllllllllllllllIIlIllIIIllIllIIl.toCharArray();
        int lllllllllllllllIIlIllIIIllIIlllI = lllllllllllllllIIlIllIIIllIIllll.length;
        int lllllllllllllllIIlIllIIIllIIllIl = llllIlIllllI[0];
        while (az.lIIlIIIlIIllIll(lllllllllllllllIIlIllIIIllIIllIl, lllllllllllllllIIlIllIIIllIIlllI)) {
            char lllllllllllllllIIlIllIIIllIllIlI = lllllllllllllllIIlIllIIIllIIllll[lllllllllllllllIIlIllIIIllIIllIl];
            lllllllllllllllIIlIllIIIllIlIlll.append((char)(lllllllllllllllIIlIllIIIllIllIlI ^ lllllllllllllllIIlIllIIIllIlIllI[lllllllllllllllIIlIllIIIllIlIlIl % lllllllllllllllIIlIllIIIllIlIllI.length]));
            0;
            ++lllllllllllllllIIlIllIIIllIlIlIl;
            ++lllllllllllllllIIlIllIIIllIIllIl;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIIllIlIlll);
    }

    private static boolean lIIlIIIlIIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        az.lIIlIIIlIIlIlll();
        az.lIIlIIIlIIlIllI();
        eD = LoggerFactory.getLogger(az.class);
    }

    private static boolean lIIlIIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIlIIlIlll() {
        llllIlIllllI = new int[2];
        az.llllIlIllllI[0] = (5 ^ 0x26) & ~(0xBD ^ 0x9E);
        az.llllIlIllllI[1] = 1;
    }

    private static boolean lIIlIIIlIIllIlI(Object object) {
        return object == null;
    }

    public boolean run() {
        az lllllllllllllllIIlIllIIIlllIIllI;
        if (az.lIIlIIIlIIllIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        if (az.lIIlIIIlIIllIIl(lllllllllllllllIIlIllIIIlllIIllI.eF.assistantMode() ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        NPC lllllllllllllllIIlIllIIIlllIIlIl = SquireNightmarePlugin.d();
        if (az.lIIlIIIlIIllIlI(lllllllllllllllIIlIllIIIlllIIlIl)) {
            return llllIlIllllI[0];
        }
        String[] stringArray = new String[llllIlIllllI[1]];
        stringArray[az.llllIlIllllI[0]] = llllIlIlllIl[llllIlIllllI[0]];
        if (az.lIIlIIIlIIllIII(lllllllllllllllIIlIllIIIlllIIlIl.hasAction(stringArray) ? 1 : 0)) {
            return llllIlIllllI[0];
        }
        boolean bl = this.eG.aG();
        this.sleep(llllIlIllllI[1]);
        return bl;
    }
}

