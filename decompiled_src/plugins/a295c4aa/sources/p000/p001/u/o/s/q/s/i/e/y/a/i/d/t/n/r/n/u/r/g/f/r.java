package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Filling crucible", priority = 150)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.r  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/r.class */
public class r extends j {
    private static /* synthetic */ int[] llIlIllIlllI;
    private static /* synthetic */ String[] llIlIllIllIl;
    @Inject
    private /* synthetic */ b aq;

    static {
        lIIIIIllllIlIIl();
        lIIIIIllllIlIII();
    }

    private static boolean lIIIIIllllIllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIllllIIlll(String lllllllllllllllIlIIIIIlIlIllllIl, String lllllllllllllllIlIIIIIlIlIllllII) {
        String lllllllllllllllIlIIIIIlIlIllllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIIlIlIllllII.toCharArray();
        int lllllllllllllllIlIIIIIlIlIlllIIl = llIlIllIlllI[0];
        char[] charArray2 = lllllllllllllllIlIIIIIlIlIllllIl2.toCharArray();
        int length = charArray2.length;
        int i = llIlIllIlllI[0];
        while (lIIIIIllllIllIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIIIIlIlIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIIlIlIlllIIl++;
            i++;
            "".length();
            if ((5 ^ 0) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIIllllIlIlI(int i) {
        return i != 0;
    }

    private static void lIIIIIllllIlIII() {
        llIlIllIllIl = new String[llIlIllIlllI[1]];
        llIlIllIllIl[llIlIllIlllI[0]] = lIIIIIllllIIlll("JwMKCA==", "ajfdb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (!lIIIIIllllIlIlI(this.T.e() ? 1 : 0) && !lIIIIIllllIlIlI(this.aq.u() ? 1 : 0) && !lIIIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
            int[] iArr = new int[llIlIllIlllI[1]];
            iArr[llIlIllIlllI[0]] = llIlIllIlllI[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIIIllllIlIll(nearest)) {
                return llIlIllIlllI[0];
            }
            int[] iArr2 = new int[llIlIllIlllI[1]];
            iArr2[llIlIllIlllI[0]] = this.V.primaryBar().v();
            if (lIIIIIllllIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIlIllIlllI[1]];
                iArr3[llIlIllIlllI[0]] = this.V.secondaryBar().v();
                if (lIIIIIllllIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                    return llIlIllIlllI[0];
                }
            }
            if (lIIIIIllllIlIlI(Production.isOpen() ? 1 : 0)) {
                int[] iArr4 = new int[llIlIllIlllI[1]];
                iArr4[llIlIllIlllI[0]] = this.V.primaryBar().v();
                if (lIIIIIllllIlIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                    Production.chooseOption(this.V.primaryBar().w());
                    sleep(llIlIllIlllI[3]);
                    return llIlIllIlllI[1];
                }
                int[] iArr5 = new int[llIlIllIlllI[1]];
                iArr5[llIlIllIlllI[0]] = this.V.secondaryBar().v();
                if (lIIIIIllllIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                    Production.chooseOption(this.V.secondaryBar().w());
                    sleep(llIlIllIlllI[3]);
                    return llIlIllIlllI[1];
                }
            }
            nearest.interact(llIlIllIllIl[llIlIllIlllI[0]]);
            return llIlIllIlllI[1];
        }
        return llIlIllIlllI[0];
    }

    @Inject
    public r(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean lIIIIIllllIllII(int i) {
        return i == 0;
    }

    private static void lIIIIIllllIlIIl() {
        llIlIllIlllI = new int[4];
        llIlIllIlllI[0] = (24 ^ 50) & ((62 ^ 20) ^ (-1));
        llIlIllIlllI[1] = " ".length();
        llIlIllIlllI[2] = (-((-8714) & 25373)) & (-1) & 61435;
        llIlIllIlllI[3] = 1 ^ 5;
    }

    private static boolean lIIIIIllllIlIll(Object obj) {
        return obj == null;
    }
}
