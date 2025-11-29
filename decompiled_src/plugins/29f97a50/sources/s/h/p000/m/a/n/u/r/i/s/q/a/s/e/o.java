package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking Range Potion")
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.o  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/o.class */
public class o extends Task {
    private final /* synthetic */ c aa;
    private static /* synthetic */ int[] lIIlIllllIllI;
    private static /* synthetic */ String[] lIIlIllllIlIl;
    private final /* synthetic */ SquireShamanConfig Z;

    private static void lIlIlllIIIIlIlI() {
        lIIlIllllIlIl = new String[lIIlIllllIllI[2]];
        lIIlIllllIlIl[lIIlIllllIllI[0]] = lIlIlllIIIIlIIl("CBkGLAw=", "LkoBg");
    }

    static {
        lIlIlllIIIIlIll();
        lIlIlllIIIIlIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (!lIlIlllIIIIllII(this.aa.s() ? 1 : 0) && !lIlIlllIIIIllIl(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), lIIlIllllIllI[1])) {
            Item first = Inventory.getFirst(this.Z.rangePotion().u());
            if (lIlIlllIIIIlllI(first)) {
                return lIIlIllllIllI[0];
            }
            first.interact(lIIlIllllIlIl[lIIlIllllIllI[0]]);
            return lIIlIllllIllI[2];
        }
        return lIIlIllllIllI[0];
    }

    private static void lIlIlllIIIIlIll() {
        lIIlIllllIllI = new int[3];
        lIIlIllllIllI[0] = (38 ^ 29) & ((187 ^ 128) ^ (-1));
        lIIlIllllIllI[1] = 131 ^ 133;
        lIIlIllllIllI[2] = " ".length();
    }

    private static boolean lIlIlllIIIIllll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIIIIlIIl(String llllllllllllllIllllIIlllIlllllll, String llllllllllllllIllllIIlllIllllllI) {
        String llllllllllllllIllllIIlllIlllllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlllIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlllIllllllI.toCharArray();
        int llllllllllllllIllllIIlllIllllIll = lIIlIllllIllI[0];
        char[] charArray2 = llllllllllllllIllllIIlllIlllllll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllllIIlllIlllIIll = lIIlIllllIllI[0];
        while (lIlIlllIIIIllll(llllllllllllllIllllIIlllIlllIIll, length)) {
            sb.append((char) (charArray2[llllllllllllllIllllIIlllIlllIIll] ^ charArray[llllllllllllllIllllIIlllIllllIll % charArray.length]));
            "".length();
            llllllllllllllIllllIIlllIllllIll++;
            llllllllllllllIllllIIlllIlllIIll++;
            "".length();
            if ((((92 ^ 5) ^ (171 ^ 164)) & (((93 ^ 116) ^ (((84 + 26) - 56) + 73)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIIIIllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlllIIIIlllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIIIllII(int i) {
        return i == 0;
    }

    @Inject
    public o(SquireShamanConfig squireShamanConfig, c cVar) {
        this.Z = squireShamanConfig;
        this.aa = cVar;
    }
}
