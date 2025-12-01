package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
@TaskDesc(name = "Entering portal", priority = 1000, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/p.class */
public class C0015p extends AbstractC0014o {
    private static /* synthetic */ String[] lIlIlIlIIllII;
    private static /* synthetic */ int[] lIlIlIlIIllIl;

    private static boolean lIlllllIlIlllII(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllllIlIllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllllIlIllllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlllllIlIllIlI(int i2) {
        return i2 == 0;
    }

    @Inject
    protected C0015p(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static String lIlllllIlIlIlll(String llllllllllllllIllIlIllIIlIIIllII, String llllllllllllllIllIlIllIIlIIIlIll) {
        String llllllllllllllIllIlIllIIlIIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIIlIIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIllIIlIIIlIll.toCharArray();
        int llllllllllllllIllIlIllIIlIIIlIII = lIlIlIlIIllIl[0];
        char[] charArray2 = llllllllllllllIllIlIllIIlIIIllII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIlIlIIllIl[0];
        while (lIlllllIlIlllll(i2, length)) {
            char llllllllllllllIllIlIllIIlIIIllIl = charArray2[i2];
            llllllllllllllIllIlIllIIlIIIlIlI.append((char) (llllllllllllllIllIlIllIIlIIIllIl ^ charArray[llllllllllllllIllIlIllIIlIIIlIII % charArray.length]));
            "".length();
            llllllllllllllIllIlIllIIlIIIlIII++;
            i2++;
            "".length();
            if (((111 ^ 1) ^ (242 ^ 153)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIllIIlIIIlIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean run() {
        if (!lIlllllIlIllIlI(this.bU.c() ? 1 : 0) || lIlllllIlIllIlI(R() ? 1 : 0)) {
            return lIlIlIlIIllIl[0];
        }
        int[] iArr = new int[lIlIlIlIIllIl[1]];
        iArr[lIlIlIlIIllIl[0]] = lIlIlIlIIllIl[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!lIlllllIlIllIll(nearest) && !lIlllllIlIlllII(T().needsToBank() ? 1 : 0)) {
            if (lIlllllIlIlllIl(Combat.getMissingHealth()) && lIlllllIlIllllI(Skills.getBoostedLevel(Skill.PRAYER), Skills.getLevel(Skill.PRAYER))) {
                this.bU.a((boolean) lIlIlIlIIllIl[0]);
                return lIlIlIlIIllIl[0];
            }
            nearest.interact(lIlIlIlIIllII[lIlIlIlIIllIl[0]]);
            return lIlIlIlIIllIl[1];
        }
        return lIlIlIlIIllIl[0];
    }

    private static boolean lIlllllIlIlllIl(int i2) {
        return i2 <= 0;
    }

    private static void lIlllllIlIllIII() {
        lIlIlIlIIllII = new String[lIlIlIlIIllIl[1]];
        lIlIlIlIIllII[lIlIlIlIIllIl[0]] = lIlllllIlIlIlll("Bjo+JwY=", "CTJBt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        return lIlIlIlIIllIl[0];
    }

    private static void lIlllllIlIllIIl() {
        lIlIlIlIIllIl = new int[3];
        lIlIlIlIIllIl[0] = (128 ^ 167) & ((52 ^ 19) ^ (-1));
        lIlIlIlIIllIl[1] = " ".length();
        lIlIlIlIIllIl[2] = (-129) & 26773;
    }

    private static boolean lIlllllIlIlllll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIlllllIlIllIIl();
        lIlllllIlIllIII();
    }
}
