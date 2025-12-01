package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using imbued heart")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.A  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/A.class */
public class A extends u {
    private static /* synthetic */ int[] lIlIlllIllIIl;
    private static /* synthetic */ String[] lIlIlllIllIII;

    private static void llIIIIlIlIIIIlI() {
        lIlIlllIllIII = new String[lIlIlllIllIIl[3]];
        lIlIlllIllIII[lIlIlllIllIIl[1]] = llIIIIlIlIIIIIl("OSQOHAQfOBkBBg==", "pJxuc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        int[] iArr = new int[lIlIlllIllIIl[0]];
        iArr[lIlIlllIllIIl[1]] = lIlIlllIllIIl[2];
        iArr[lIlIlllIllIIl[3]] = lIlIlllIllIIl[4];
        Item first = Inventory.getFirst(iArr);
        if (!llIIIIlIlIIIlII(first) && !llIIIIlIlIIIlIl(Vars.getBit(lIlIlllIllIIl[5]))) {
            first.interact(lIlIlllIllIII[lIlIlllIllIIl[1]]);
            return lIlIlllIllIIl[3];
        }
        return lIlIlllIllIIl[1];
    }

    private static boolean llIIIIlIlIIIlIl(int i) {
        return i > 0;
    }

    private static boolean llIIIIlIlIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void llIIIIlIlIIIIll() {
        lIlIlllIllIIl = new int[6];
        lIlIlllIllIIl[0] = "  ".length();
        lIlIlllIllIIl[1] = ((((173 + 78) - 65) + 37) ^ (((116 + 120) - 227) + 188)) & (((((52 + 60) - (-26)) + 14) ^ (((1 + 38) - (-20)) + 71)) ^ (-" ".length()));
        lIlIlllIllIIl[2] = (-3841) & 24564;
        lIlIlllIllIIl[3] = " ".length();
        lIlIlllIllIIl[4] = (-(96 ^ 101)) & (-1027) & 28671;
        lIlIlllIllIIl[5] = (-((-145) & 2463)) & (-16897) & 24575;
    }

    private static String llIIIIlIlIIIIIl(String llllllllllllllIllIIlllllIlllIIlI, String llllllllllllllIllIIlllllIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlllllIllIllll = llllllllllllllIllIIlllllIlllIIIl.toCharArray();
        int llllllllllllllIllIIlllllIllIlllI = lIlIlllIllIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIllIIl[1];
        while (llIIIIlIlIIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIlllllIllIllll[llllllllllllllIllIIlllllIllIlllI % llllllllllllllIllIIlllllIllIllll.length]));
            "".length();
            llllllllllllllIllIIlllllIllIlllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIIIIlIlIIIIll();
        llIIIIlIlIIIIlI();
    }
}
