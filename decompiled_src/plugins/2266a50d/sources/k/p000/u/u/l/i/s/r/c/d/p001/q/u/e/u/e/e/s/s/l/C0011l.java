package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Stamina handler", priority = 2137483647)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/l.class */
public class C0011l extends Task {
    private final /* synthetic */ SquireDukeSucellusConfig am;
    private final /* synthetic */ SquireDukeSucellus al;
    private static /* synthetic */ String[] lIllIllIIlIl;
    private static /* synthetic */ int[] lIllIllIIlll;

    private static boolean lllIlIIlIIlIll(int i) {
        return i != 0;
    }

    static {
        lllIlIIlIIlIII();
        lllIlIIlIIIlIl();
    }

    private static void lllIlIIlIIlIII() {
        lIllIllIIlll = new int[6];
        lIllIllIIlll[0] = (65 ^ 80) & ((80 ^ 65) ^ (-1));
        lIllIllIIlll[1] = 28 ^ 2;
        lIllIllIIlll[2] = (214 ^ 157) ^ (95 ^ 30);
        lIllIllIIlll[3] = " ".length();
        lIllIllIIlll[4] = "  ".length();
        lIllIllIIlll[5] = "   ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIllIllIIlIl[lIllIllIIlll[4]]);
        });
        if (!lllIlIIlIIlIIl(first) && !lllIlIIlIIlIlI(Movement.getRunEnergy(), lIllIllIIlll[1])) {
            if (!lllIlIIlIIlIll(Movement.isStaminaBoosted() ? 1 : 0)) {
                first.interact(lIllIllIIlIl[lIllIllIIlll[3]]);
                return lIllIllIIlll[3];
            } else if (lllIlIIlIIllII(Movement.getRunEnergy(), lIllIllIIlll[2])) {
                first.interact(lIllIllIIlIl[lIllIllIIlll[0]]);
                return lIllIllIIlll[3];
            } else {
                return lIllIllIIlll[0];
            }
        }
        return lIllIllIIlll[0];
    }

    private static String lllIlIIlIIIlII(String lllllllllllllllIlIlllIllIlIlIlII, String lllllllllllllllIlIlllIllIlIlIIll) {
        String lllllllllllllllIlIlllIllIlIlIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIllIlIlIIlI = new StringBuilder();
        char[] lllllllllllllllIlIlllIllIlIlIIIl = lllllllllllllllIlIlllIllIlIlIIll.toCharArray();
        int lllllllllllllllIlIlllIllIlIlIIII = lIllIllIIlll[0];
        char[] charArray = lllllllllllllllIlIlllIllIlIlIlII2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIlllIllIlIIlIII = lIllIllIIlll[0];
        while (lllIlIIlIIllII(lllllllllllllllIlIlllIllIlIIlIII, length)) {
            char lllllllllllllllIlIlllIllIlIlIlIl = charArray[lllllllllllllllIlIlllIllIlIIlIII];
            lllllllllllllllIlIlllIllIlIlIIlI.append((char) (lllllllllllllllIlIlllIllIlIlIlIl ^ lllllllllllllllIlIlllIllIlIlIIIl[lllllllllllllllIlIlllIllIlIlIIII % lllllllllllllllIlIlllIllIlIlIIIl.length]));
            "".length();
            lllllllllllllllIlIlllIllIlIlIIII++;
            lllllllllllllllIlIlllIllIlIIlIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIllIlIlIIlI);
    }

    private static boolean lllIlIIlIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIlIIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    C0011l(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.al = squireDukeSucellus;
        this.am = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static void lllIlIIlIIIlIl() {
        lIllIllIIlIl = new String[lIllIllIIlll[5]];
        lIllIllIIlIl[lIllIllIIlll[0]] = lllIlIIlIIIlII("BxwxKhs=", "CnXDp");
        lIllIllIIlIl[lIllIllIIlll[3]] = lllIlIIlIIIlII("DzMKBig=", "KAchC");
        lIllIllIIlIl[lIllIllIIlll[4]] = lllIlIIlIIIlII("FyQQKRgqMQ==", "DPqDq");
    }
}
