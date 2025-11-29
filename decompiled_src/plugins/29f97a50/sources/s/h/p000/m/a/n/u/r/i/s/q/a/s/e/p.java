package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Eating", priority = 100)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.p  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/p.class */
public class p extends Task {
    private final /* synthetic */ SquireShamanConfig ac;
    private static /* synthetic */ int[] lIIllIIIlIIII;
    private static final /* synthetic */ Logger ab;
    private static /* synthetic */ String[] lIIllIIIIllll;

    static {
        lIlIlllIlllIlIl();
        lIlIlllIlllIIll();
        ab = LoggerFactory.getLogger(p.class);
    }

    private static String lIlIlllIlllIIlI(String llllllllllllllIllllIIlIIIlllIIII, String llllllllllllllIllllIIlIIIllIllll) {
        String llllllllllllllIllllIIlIIIlllIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlIIIllIllll.toCharArray();
        int llllllllllllllIllllIIlIIIllIllII = lIIllIIIlIIII[0];
        char[] charArray2 = llllllllllllllIllllIIlIIIlllIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIlIIII[0];
        while (lIlIlllIllllIII(i, length)) {
            char llllllllllllllIllllIIlIIIlllIIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllllIIlIIIlllIIIl ^ charArray[llllllllllllllIllllIIlIIIllIllII % charArray.length]));
            "".length();
            llllllllllllllIllllIIlIIIllIllII++;
            i++;
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIlllIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIlllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlllIllllIII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public p(SquireShamanConfig squireShamanConfig) {
        this.ac = squireShamanConfig;
    }

    private static void lIlIlllIlllIIll() {
        lIIllIIIIllll = new String[lIIllIIIlIIII[2]];
        lIIllIIIIllll[lIIllIIIlIIII[0]] = lIlIlllIlllIIlI("IwQS", "feftW");
        lIIllIIIIllll[lIIllIIIlIIII[1]] = lIlIlllIlllIIlI("Jxce", "bvjLA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            String str = lIIllIIIIllll[lIIllIIIlIIII[1]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        });
        if (!lIlIlllIlllIllI(first) && !lIlIlllIlllIlll(Combat.getCurrentHealth(), this.ac.eatAt())) {
            first.interact(lIIllIIIIllll[lIIllIIIlIIII[0]]);
            return lIIllIIIlIIII[1];
        }
        return lIIllIIIlIIII[0];
    }

    private static void lIlIlllIlllIlIl() {
        lIIllIIIlIIII = new int[3];
        lIIllIIIlIIII[0] = (((109 ^ 36) & ((48 ^ 121) ^ (-1))) ^ (222 ^ 138)) & (((32 ^ 43) ^ (227 ^ 188)) ^ (-" ".length()));
        lIIllIIIlIIII[1] = " ".length();
        lIIllIIIlIIII[2] = "  ".length();
    }
}
