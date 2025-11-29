package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Cleaning herbs")
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.h  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/h.class */
public class h extends d {
    private static /* synthetic */ String[] lllIlIIIIIlI;
    private static /* synthetic */ int[] lllIlIIIIIll;

    static {
        lIIIlIllIllllII();
        lIIIlIllIlllIll();
    }

    private static boolean lIIIlIllIllllIl(int i) {
        return i != 0;
    }

    private static void lIIIlIllIllllII() {
        lllIlIIIIIll = new int[4];
        lllIlIIIIIll[0] = "   ".length();
        lllIlIIIIIll[1] = (11 ^ 91) & ((45 ^ 125) ^ (-1));
        lllIlIIIIIll[2] = " ".length();
        lllIlIIIIIll[3] = "  ".length();
    }

    private static String lIIIlIllIlllIlI(String lllllllllllllllIIllIIlIIllIIlIlI, String lllllllllllllllIIllIIlIIllIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIllIIlIII = new StringBuilder();
        char[] lllllllllllllllIIllIIlIIllIIIlll = lllllllllllllllIIllIIlIIllIIlIIl.toCharArray();
        int lllllllllllllllIIllIIlIIllIIIllI = lllIlIIIIIll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIIIIIll[1];
        while (lIIIlIllIlllllI(i, length)) {
            char lllllllllllllllIIllIIlIIlIllllIl = charArray[i];
            lllllllllllllllIIllIIlIIllIIlIII.append((char) (lllllllllllllllIIllIIlIIlIllllIl ^ lllllllllllllllIIllIIlIIllIIIlll[lllllllllllllllIIllIIlIIllIIIllI % lllllllllllllllIIllIIlIIllIIIlll.length]));
            "".length();
            lllllllllllllllIIllIIlIIllIIIllI++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIIllIIlIII);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        super(squireHerblore, herbloreConfig, r3);
        c[] cVarArr = new c[lllIlIIIIIll[0]];
        cVarArr[lllIlIIIIIll[1]] = c.CLEAN_HERBS;
        cVarArr[lllIlIIIIIll[2]] = c.ALL_STAGES;
        cVarArr[lllIlIIIIIll[3]] = c.ALL_STAGES_ALL_HERBS;
    }

    private static void lIIIlIllIlllIll() {
        lllIlIIIIIlI = new String[lllIlIIIIIll[2]];
        lllIlIIIIIlI[lllIlIIIIIll[1]] = lIIIlIllIlllIlI("CC4xBQo=", "KBTdd");
    }

    private static boolean lIIIlIllIlllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.d
    public boolean h() {
        int e = j().herb().e();
        int[] iArr = new int[lllIlIIIIIll[2]];
        iArr[lllIlIIIIIll[1]] = e;
        List all = Inventory.getAll(iArr);
        if (lIIIlIllIllllIl(all.isEmpty() ? 1 : 0)) {
            return lllIlIIIIIll[1];
        }
        int i = lllIlIIIIIll[1];
        while (lIIIlIllIlllllI(i, Math.min(j().perTick(), all.size()))) {
            ((Item) all.get(i)).interact(lllIlIIIIIlI[lllIlIIIIIll[1]]);
            i++;
            "".length();
            if ((-(30 ^ 26)) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIlIIIIIll[2];
    }
}
