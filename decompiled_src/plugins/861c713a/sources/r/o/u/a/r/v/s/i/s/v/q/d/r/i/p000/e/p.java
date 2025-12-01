package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Start Fight", priority = 10000, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/p.class */
public class p extends AbstractC0000a {
    private static /* synthetic */ int[] lIlIlIIlllIll;
    private static /* synthetic */ String[] lIlIlIIlllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        if (lIlllllIIIlllII(this.z ? 1 : 0)) {
            return lIlIlIIlllIll[0];
        }
        if (lIlllllIIIlllIl(this.x.getInteracting()) && lIlllllIIIlllII(this.x.getInteracting().getName().equals(lIlIlIIlllIlI[lIlIlIIlllIll[0]]) ? 1 : 0)) {
            return lIlIlIIlllIll[1];
        }
        if (lIlllllIIIllllI(Inventory.getCount(item -> {
            String[] strArr = new String[lIlIlIIlllIll[1]];
            strArr[lIlIlIIlllIll[0]] = lIlIlIIlllIlI[lIlIlIIlllIll[2]];
            return item.hasAction(strArr);
        }), this.t.food())) {
            this.s.c((boolean) lIlIlIIlllIll[1]);
            return lIlIlIIlllIll[0];
        }
        this.y.interact(lIlIlIIlllIlI[lIlIlIIlllIll[1]]);
        return lIlIlIIlllIll[1];
    }

    private static void lIlllllIIIllIll() {
        lIlIlIIlllIll = new int[4];
        lIlIlIIlllIll[0] = (46 ^ 50) & ((6 ^ 26) ^ (-1));
        lIlIlIIlllIll[1] = " ".length();
        lIlIlIIlllIll[2] = "  ".length();
        lIlIlIIlllIll[3] = "   ".length();
    }

    private static boolean lIlllllIIIllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIlllllIIIllIIl(String llllllllllllllIllIlIlllIIIlIllll, String llllllllllllllIllIlIlllIIIlIlIIl) {
        String llllllllllllllIllIlIlllIIIlIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllIIIlIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlllIIIlIlIIl.toCharArray();
        int llllllllllllllIllIlIlllIIIlIlIll = lIlIlIIlllIll[0];
        char[] charArray2 = llllllllllllllIllIlIlllIIIlIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlllIll[0];
        while (lIlllllIIIllllI(i, length)) {
            char llllllllllllllIllIlIlllIIIlIIIlI = charArray2[i];
            llllllllllllllIllIlIlllIIIlIllIl.append((char) (llllllllllllllIllIlIlllIIIlIIIlI ^ charArray[llllllllllllllIllIlIlllIIIlIlIll % charArray.length]));
            "".length();
            llllllllllllllIllIlIlllIIIlIlIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlllIIIlIllIl);
    }

    private static void lIlllllIIIllIlI() {
        lIlIlIIlllIlI = new String[lIlIlIIlllIll[3]];
        lIlIlIIlllIlI[lIlIlIIlllIll[0]] = lIlllllIIIllIIl("OzUBFyMfIhoA", "mTssL");
        lIlIlIIlllIlI[lIlIlIIlllIll[1]] = lIlllllIIIllIIl("DD0xKDUm", "MIEIV");
        lIlIlIIlllIlI[lIlIlIIlllIll[2]] = lIlllllIIIllIIl("KiMb", "oBoSy");
    }

    @Inject
    protected p(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
    }

    static {
        lIlllllIIIllIll();
        lIlllllIIIllIlI();
    }

    private static boolean lIlllllIIIlllII(int i) {
        return i != 0;
    }

    private static boolean lIlllllIIIlllIl(Object obj) {
        return obj != null;
    }
}
