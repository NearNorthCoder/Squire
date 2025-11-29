/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Poke", priority=250, blocking=true)
public class z
extends w {
    private static /* synthetic */ String[] lIlIlIlIllIIl;
    private static /* synthetic */ int[] lIlIlIlIllIlI;

    private static boolean lIllllllIlIIlII(Object object) {
        return object == null;
    }

    private static void lIllllllIlIIIlI() {
        lIlIlIlIllIIl = new String[lIlIlIlIllIlI[1]];
        z.lIlIlIlIllIIl[z.lIlIlIlIllIlI[0]] = z.lIllllllIlIIIIl("MigbCA==", "bGpmD");
    }

    private static String lIllllllIlIIIIl(String llllllllllllllIllIlIlIlIIIIIIIIl, String llllllllllllllIllIlIlIlIIIIIIlIl) {
        llllllllllllllIllIlIlIlIIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIlIIIIIIlII = new StringBuilder();
        char[] llllllllllllllIllIlIlIlIIIIIIIll = llllllllllllllIllIlIlIlIIIIIIlIl.toCharArray();
        int llllllllllllllIllIlIlIlIIIIIIIlI = lIlIlIlIllIlI[0];
        char[] llllllllllllllIllIlIlIIlllllllII = llllllllllllllIllIlIlIlIIIIIIIIl.toCharArray();
        int llllllllllllllIllIlIlIIllllllIll = llllllllllllllIllIlIlIIlllllllII.length;
        int llllllllllllllIllIlIlIIllllllIlI = lIlIlIlIllIlI[0];
        while (z.lIllllllIlIIlll(llllllllllllllIllIlIlIIllllllIlI, llllllllllllllIllIlIlIIllllllIll)) {
            char llllllllllllllIllIlIlIlIIIIIIlll = llllllllllllllIllIlIlIIlllllllII[llllllllllllllIllIlIlIIllllllIlI];
            llllllllllllllIllIlIlIlIIIIIIlII.append((char)(llllllllllllllIllIlIlIlIIIIIIlll ^ llllllllllllllIllIlIlIlIIIIIIIll[llllllllllllllIllIlIlIlIIIIIIIlI % llllllllllllllIllIlIlIlIIIIIIIll.length]));
            "".length();
            ++llllllllllllllIllIlIlIlIIIIIIIlI;
            ++llllllllllllllIllIlIlIIllllllIlI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIlIIIIIIlII);
    }

    @Override
    public boolean Q() {
        z llllllllllllllIllIlIlIlIIIIlIIlI;
        NPC nPC = this.cg.c(lIlIlIlIllIlI[0]);
        if (z.lIllllllIlIIlII(nPC)) {
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIlIl(llllllllllllllIllIlIlIlIIIIlIIlI.V() ? 1 : 0)) {
            llllllllllllllIllIlIlIlIIIIlIIlI.x.a(lIlIlIlIllIlI[1]);
            return lIlIlIlIllIlI[0];
        }
        if (z.lIllllllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIlIllIlI[0];
        }
        nPC.interact(lIlIlIlIllIIl[lIlIlIlIllIlI[0]]);
        return lIlIlIlIllIlI[1];
    }

    private static boolean lIllllllIlIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIllllllIlIIIll() {
        lIlIlIlIllIlI = new int[2];
        z.lIlIlIlIllIlI[0] = (0x94 ^ 0x8C) & ~(2 ^ 0x1A);
        z.lIlIlIlIllIlI[1] = " ".length();
    }

    @Inject
    protected z(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIllllllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.lIllllllIlIIIll();
        z.lIllllllIlIIIlI();
    }
}

