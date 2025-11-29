package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 100, blocking = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.g  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/g.class */
public class g extends a {
    private static /* synthetic */ int[] lIlIlllIllII;
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ s f1a;
    private static /* synthetic */ String[] lIlIlllIlIll;

    static {
        lllIIIIlllIlII();
        lllIIIIlllIIll();
    }

    private static String lllIIIIlllIIlI(String lllllllllllllllIllIIIlllllllIlIl, String lllllllllllllllIllIIIlllllllIlII) {
        String lllllllllllllllIllIIIlllllllIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlllllllIIll = new StringBuilder();
        char[] lllllllllllllllIllIIIlllllllIIlI = lllllllllllllllIllIIIlllllllIlII.toCharArray();
        int lllllllllllllllIllIIIlllllllIIIl = lIlIlllIllII[1];
        char[] charArray = lllllllllllllllIllIIIlllllllIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIllII[1];
        while (lllIIIIllllIII(i, length)) {
            lllllllllllllllIllIIIlllllllIIll.append((char) (charArray[i] ^ lllllllllllllllIllIIIlllllllIIlI[lllllllllllllllIllIIIlllllllIIIl % lllllllllllllllIllIIIlllllllIIlI.length]));
            "".length();
            lllllllllllllllIllIIIlllllllIIIl++;
            i++;
            "".length();
            if ((((188 ^ 137) ^ (128 ^ 138)) & (((136 ^ 196) ^ (251 ^ 136)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIlllllllIIll);
    }

    private static void lllIIIIlllIIll() {
        lIlIlllIlIll = new String[lIlIlllIllII[3]];
        lIlIlllIlIll[lIlIlllIllII[1]] = lllIIIIlllIIlI("MSAf", "tAkmi");
        lIlIlllIlIll[lIlIlllIllII[2]] = lllIIIIlllIIlI("HDEs", "YPXnK");
    }

    private static boolean lllIIIIlllIllI(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIIlllIlIl(int i, int i2) {
        return i != i2;
    }

    private static void lllIIIIlllIlII() {
        lIlIlllIllII = new int[4];
        lIlIlllIllII[0] = -" ".length();
        lIlIlllIllII[1] = ((((134 + 167) - 212) + 134) ^ (((121 + 73) - 132) + 89)) & (((218 ^ 185) ^ (56 ^ 19)) ^ (-" ".length()));
        lIlIlllIllII[2] = " ".length();
        lIlIlllIllII[3] = "  ".length();
    }

    private static boolean lllIIIIllllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean run() {
        if (lllIIIIlllIlIl(this.f1a.u(), lIlIlllIllII[0])) {
            return lIlIlllIllII[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlllIllII[2]];
            strArr[lIlIlllIllII[1]] = lIlIlllIlIll[lIlIlllIllII[2]];
            return item.hasAction(strArr);
        });
        if (!lllIIIIlllIllI(first) && !lllIIIIlllIlll(Combat.getCurrentHealth(), this.o.eatAt())) {
            first.interact(lIlIlllIlIll[lIlIlllIllII[1]]);
            return lIlIlllIllII[2];
        }
        return lIlIlllIllII[1];
    }

    private static boolean lllIIIIlllIlll(int i, int i2) {
        return i > i2;
    }
}
