package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Boarding boat", priority = 105, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.M  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/M.class */
public class M extends N {
    private static /* synthetic */ String[] lIlIlIllllIlI;
    private static final /* synthetic */ WorldPoint cs;
    private static /* synthetic */ int[] lIlIlIllllIll;
    private final /* synthetic */ SquireVorkathPlugin ct;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.N
    public boolean Q() {
        if (lIllllllllllIIl(this.ct.f() ? 1 : 0)) {
            return lIlIlIllllIll[0];
        }
        String[] strArr = new String[lIlIlIllllIll[1]];
        strArr[lIlIlIllllIll[0]] = lIlIlIllllIlI[lIlIlIllllIll[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIllllllllllIlI(nearest)) {
            nearest.interact(lIlIlIllllIlI[lIlIlIllllIll[1]]);
            return lIlIlIllllIll[1];
        }
        Movement.walkTo(cs);
        "".length();
        return lIlIlIllllIll[1];
    }

    @Inject
    protected M(Client client, SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        super(client, squireVorkathConfig);
        this.ct = squireVorkathPlugin;
    }

    private static boolean lIllllllllllIll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIllllllllllIII();
        lIlllllllllIlll();
        cs = new WorldPoint(lIlIlIllllIll[2], lIlIlIllllIll[3], lIlIlIllllIll[0]);
    }

    private static boolean lIllllllllllIlI(Object obj) {
        return obj == null;
    }

    private static void lIllllllllllIII() {
        lIlIlIllllIll = new int[5];
        lIlIlIllllIll[0] = ((178 ^ 191) ^ (161 ^ 179)) & ((" ".length() ^ (92 ^ 66)) ^ (-" ".length()));
        lIlIlIllllIll[1] = " ".length();
        lIlIlIllllIll[2] = (-8236) & 10875;
        lIlIlIllllIll[3] = (-24961) & 28654;
        lIlIlIllllIll[4] = "  ".length();
    }

    private static void lIlllllllllIlll() {
        lIlIlIllllIlI = new String[lIlIlIllllIll[4]];
        lIlIlIllllIlI[lIlIlIllllIll[0]] = lIlllllllllIllI("Nzs2ET4NOg==", "cTDwW");
        lIlIlIllllIlI[lIlIlIllllIll[1]] = lIlllllllllIllI("NwshGw4O", "beFzk");
    }

    private static String lIlllllllllIllI(String llllllllllllllIllIlIlIIIIIIIIlII, String llllllllllllllIllIlIlIIIIIIIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIIIIIIIIlI = new StringBuilder();
        char[] llllllllllllllIllIlIlIIIIIIIIIIl = llllllllllllllIllIlIlIIIIIIIIIll.toCharArray();
        int llllllllllllllIllIlIlIIIIIIIIIII = lIlIlIllllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIllllIll[0];
        while (lIllllllllllIll(i2, length)) {
            char llllllllllllllIllIlIlIIIIIIIIlIl = charArray[i2];
            llllllllllllllIllIlIlIIIIIIIIIlI.append((char) (llllllllllllllIllIlIlIIIIIIIIlIl ^ llllllllllllllIllIlIlIIIIIIIIIIl[llllllllllllllIllIlIlIIIIIIIIIII % llllllllllllllIllIlIlIIIIIIIIIIl.length]));
            "".length();
            llllllllllllllIllIlIlIIIIIIIIIII++;
            i2++;
            "".length();
            if (" ".length() >= ((((77 + 44) - (-16)) + 17) ^ (((34 + 140) - 135) + 119))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIIIIIIIIIlI);
    }

    private static boolean lIllllllllllIIl(int i2) {
        return i2 != 0;
    }
}
