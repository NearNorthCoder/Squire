package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Poke", priority = 250, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.z  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/z.class */
public class z extends w {
    private static /* synthetic */ String[] lIlIlIlIllIIl;
    private static /* synthetic */ int[] lIlIlIlIllIlI;

    private static boolean lIllllllIlIIlII(Object obj) {
        return obj == null;
    }

    private static void lIllllllIlIIIlI() {
        lIlIlIlIllIIl = new String[lIlIlIlIllIlI[1]];
        lIlIlIlIllIIl[lIlIlIlIllIlI[0]] = lIllllllIlIIIIl("MigbCA==", "bGpmD");
    }

    private static String lIllllllIlIIIIl(String llllllllllllllIllIlIlIlIIIIIIllI, String llllllllllllllIllIlIlIlIIIIIIlIl) {
        String llllllllllllllIllIlIlIlIIIIIIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIlIIIIIIlII = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIlIIIIIIlIl.toCharArray();
        int llllllllllllllIllIlIlIlIIIIIIIlI = lIlIlIlIllIlI[0];
        char[] charArray2 = llllllllllllllIllIlIlIlIIIIIIllI2.toCharArray();
        int llllllllllllllIllIlIlIIllllllIll = charArray2.length;
        int i2 = lIlIlIlIllIlI[0];
        while (lIllllllIlIIlll(i2, llllllllllllllIllIlIlIIllllllIll)) {
            char llllllllllllllIllIlIlIlIIIIIIlll = charArray2[i2];
            llllllllllllllIllIlIlIlIIIIIIlII.append((char) (llllllllllllllIllIlIlIlIIIIIIlll ^ charArray[llllllllllllllIllIlIlIlIIIIIIIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIlIIIIIIIlI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIlIIIIIIlII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        NPC c = this.cg.c(lIlIlIlIllIlI[0]);
        if (lIllllllIlIIlII(c)) {
            return lIlIlIlIllIlI[0];
        }
        if (lIllllllIlIIlIl(V() ? 1 : 0)) {
            this.x.a((boolean) lIlIlIlIllIlI[1]);
            return lIlIlIlIllIlI[0];
        } else if (lIllllllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIlIllIlI[0];
        } else {
            c.interact(lIlIlIlIllIIl[lIlIlIlIllIlI[0]]);
            return lIlIlIlIllIlI[1];
        }
    }

    private static boolean lIllllllIlIIllI(int i2) {
        return i2 != 0;
    }

    private static void lIllllllIlIIIll() {
        lIlIlIlIllIlI = new int[2];
        lIlIlIlIllIlI[0] = (148 ^ 140) & ((2 ^ 26) ^ (-1));
        lIlIlIlIllIlI[1] = " ".length();
    }

    @Inject
    protected z(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static boolean lIllllllIlIIlIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllllIlIIlll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIllllllIlIIIll();
        lIllllllIlIIIlI();
    }
}
