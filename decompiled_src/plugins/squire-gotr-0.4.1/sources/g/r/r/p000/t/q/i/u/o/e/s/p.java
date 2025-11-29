package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Crafting runes", priority = 5, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.p  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/p.class */
public class p extends h {
    private static /* synthetic */ String[] llIIllllllIl;
    private static /* synthetic */ int[] llIIlllllllI;

    private static boolean llllllllllIlIl(int i) {
        return i <= 0;
    }

    static {
        llllllllllIlII();
        llllllllllIIIl();
    }

    private static boolean llllllllllIlll(int i) {
        return i != 0;
    }

    private static boolean lllllllllllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        int i;
        int[] iArr = new int[llIIlllllllI[2]];
        iArr[llIIlllllllI[1]] = llIIlllllllI[3];
        if (!llllllllllIlIl(Inventory.getCount(iArr)) || llllllllllIllI(this.aV.S(), Static.getClient().getTickCount())) {
            i = llIIlllllllI[2];
            "".length();
            if (" ".length() < 0) {
                return ((((187 + 68) - 215) + 171) ^ (((9 + 69) - 77) + 138)) & (((208 ^ 169) ^ (20 ^ 53)) ^ (-" ".length()));
            }
        } else {
            i = llIIlllllllI[1];
        }
        if (!llllllllllIlll(i) || llllllllllIlll(this.aV.g() ? 1 : 0)) {
            return llIIlllllllI[1];
        }
        String[] strArr = new String[llIIlllllllI[2]];
        strArr[llIIlllllllI[1]] = llIIllllllIl[llIIlllllllI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lllllllllllIII(nearest)) {
            return llIIlllllllI[1];
        }
        if (llllllllllIlll(b((GameObject) nearest) ? 1 : 0)) {
            return llIIlllllllI[2];
        }
        nearest.interact(llIIllllllIl[llIIlllllllI[2]]);
        return llIIlllllllI[2];
    }

    private static void llllllllllIIIl() {
        llIIllllllIl = new String[llIIlllllllI[0]];
        llIIllllllIl[llIIlllllllI[1]] = llllllllllIIII("CSAwFD8=", "HLDuM");
        llIIllllllIl[llIIlllllllI[2]] = llllllllllIIII("CCIEIBFmIhAoAA==", "KPeFe");
    }

    private static boolean llllllllllIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lllllllllllIII(Object obj) {
        return obj == null;
    }

    private static String llllllllllIIII(String lllllllllllllllIlIIlIlIlllIllllI, String lllllllllllllllIlIIlIlIlllIlllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlllIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlllIllIll = lllllllllllllllIlIIlIlIlllIlllIl.toCharArray();
        int lllllllllllllllIlIIlIlIlllIllIlI = llIIlllllllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlllllllI[1];
        while (lllllllllllIIl(i, length)) {
            char lllllllllllllllIlIIlIlIlllIlIIIl = charArray[i];
            lllllllllllllllIlIIlIlIlllIlllII.append((char) (lllllllllllllllIlIIlIlIlllIlIIIl ^ lllllllllllllllIlIIlIlIlllIllIll[lllllllllllllllIlIIlIlIlllIllIlI % lllllllllllllllIlIIlIlIlllIllIll.length]));
            "".length();
            lllllllllllllllIlIIlIlIlllIllIlI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlllIlllII);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllllllI[0]];
        enumC0002cArr[llIIlllllllI[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIlllllllI[2]] = EnumC0002c.FINISHING;
    }

    private static void llllllllllIlII() {
        llIIlllllllI = new int[4];
        llIIlllllllI[0] = "  ".length();
        llIIlllllllI[1] = (34 ^ 56) & ((129 ^ 155) ^ (-1));
        llIIlllllllI[2] = " ".length();
        llIIlllllllI[3] = (-5633) & 32511;
    }
}
