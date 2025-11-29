package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drinking Stamina")
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.g  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/g.class */
public class g extends Task {
    private static /* synthetic */ int[] lIlIIlIIlIIll;
    private static /* synthetic */ String[] lIlIIlIIlIIlI;
    private final /* synthetic */ SquireSkipperConfig B;

    private static boolean lIlllIlIIllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIlIIllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIlIIllIIll(int i, int i2) {
        return i > i2;
    }

    private static void lIlllIlIIlIllll() {
        lIlIIlIIlIIlI = new String[lIlIIlIIlIIll[3]];
        lIlIIlIIlIIlI[lIlIIlIIlIIll[0]] = lIlllIlIIlIlllI("Mhk/LS0=", "vkVCF");
        lIlIIlIIlIIlI[lIlIIlIIlIIll[2]] = lIlllIlIIlIlllI("IxwlIAIeCQ==", "phDMk");
    }

    private static boolean lIlllIlIIllIlII(int i) {
        return i != 0;
    }

    private static void lIlllIlIIllIIII() {
        lIlIIlIIlIIll = new int[4];
        lIlIIlIIlIIll[0] = ((227 ^ 150) ^ (133 ^ 170)) & (((64 ^ 59) ^ (10 ^ 43)) ^ (-" ".length()));
        lIlIIlIIlIIll[1] = (((11 + 108) - 51) + 77) ^ (((108 + 47) - 119) + 122);
        lIlIIlIIlIIll[2] = " ".length();
        lIlIIlIIlIIll[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (lIlllIlIIllIIIl(this.B.sipStam() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (lIlllIlIIllIIll(Movement.getRunEnergy(), lIlIIlIIlIIll[1]) && lIlllIlIIllIlII(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIlIIlIIlIIlI[lIlIIlIIlIIll[2]]);
        });
        if (lIlllIlIIllIlIl(first)) {
            return lIlIIlIIlIIll[0];
        }
        first.interact(lIlIIlIIlIIlI[lIlIIlIIlIIll[0]]);
        return lIlIIlIIlIIll[2];
    }

    @Inject
    public g(SquireSkipperConfig squireSkipperConfig) {
        this.B = squireSkipperConfig;
    }

    private static String lIlllIlIIlIlllI(String llllllllllllllIllIlllIlllIIlllII, String llllllllllllllIllIlllIlllIIllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlllIlllIIllIlI.toCharArray();
        int llllllllllllllIllIlllIlllIIlIlIl = lIlIIlIIlIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIlIIll[0];
        while (lIlllIlIIlllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIlllIlllIIlIlIl % charArray.length]));
            "".length();
            llllllllllllllIllIlllIlllIIlIlIl++;
            i++;
            "".length();
            if ((26 ^ 31) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlllIlIIllIIII();
        lIlllIlIIlIllll();
    }

    private static boolean lIlllIlIIlllIII(int i, int i2) {
        return i < i2;
    }
}
