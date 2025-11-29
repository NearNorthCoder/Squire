package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Prep Dropping Tools", priority = 21000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aZ  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aZ.class */
public class aZ extends bg {
    private static /* synthetic */ int[] lIlIIIIIlIlI;

    private static boolean llIlIlIIIIllll(int i, int i2) {
        return i < i2;
    }

    private static void llIlIlIIIIllIl() {
        lIlIIIIIlIlI = new int[21];
        lIlIIIIIlIlI[0] = " ".length() & (" ".length() ^ (-1));
        lIlIIIIIlIlI[1] = 4 ^ 14;
        lIlIIIIIlIlI[2] = (-((-18857) & 27067)) & (-1601) & 30719;
        lIlIIIIIlIlI[3] = " ".length();
        lIlIIIIIlIlI[4] = (-((-28751) & 32351)) & (-65) & 24575;
        lIlIIIIIlIlI[5] = "  ".length();
        lIlIIIIIlIlI[6] = (-((-13966) & 16095)) & (-8705) & 31743;
        lIlIIIIIlIlI[7] = "   ".length();
        lIlIIIIIlIlI[8] = (-24577) & 29917;
        lIlIIIIIlIlI[9] = 150 ^ 146;
        lIlIIIIIlIlI[10] = (-14406) & 15357;
        lIlIIIIIlIlI[11] = 193 ^ 196;
        lIlIIIIIlIlI[12] = (-16385) & 21727;
        lIlIIIIIlIlI[13] = (110 ^ 119) ^ (78 ^ 81);
        lIlIIIIIlIlI[14] = (-((-181) & 10941)) & (-1031) & 32591;
        lIlIIIIIlIlI[15] = 50 ^ 53;
        lIlIIIIIlIlI[16] = (-698) & 21497;
        lIlIIIIIlIlI[17] = (121 ^ 47) ^ (241 ^ 175);
        lIlIIIIIlIlI[18] = (-10245) & 31151;
        lIlIIIIIlIlI[19] = (59 ^ 90) ^ (125 ^ 21);
        lIlIIIIIlIlI[20] = (-((-4425) & 15707)) & (-1) & 32190;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (!llIlIlIIIIlllI(cq(), this.el) || llIlIlIIIIllll(cp(), ee())) {
            return lIlIIIIIlIlI[0];
        }
        int[] iArr = new int[lIlIIIIIlIlI[1]];
        iArr[lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        iArr[lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        iArr[lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        iArr[lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        iArr[lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        iArr[lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        iArr[lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        iArr[lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        iArr[lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        iArr[lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        if (llIlIlIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIIIIIlIlI[0];
        }
        int[] iArr2 = new int[lIlIIIIIlIlI[1]];
        iArr2[lIlIIIIIlIlI[0]] = lIlIIIIIlIlI[2];
        iArr2[lIlIIIIIlIlI[3]] = lIlIIIIIlIlI[4];
        iArr2[lIlIIIIIlIlI[5]] = lIlIIIIIlIlI[6];
        iArr2[lIlIIIIIlIlI[7]] = lIlIIIIIlIlI[8];
        iArr2[lIlIIIIIlIlI[9]] = lIlIIIIIlIlI[10];
        iArr2[lIlIIIIIlIlI[11]] = lIlIIIIIlIlI[12];
        iArr2[lIlIIIIIlIlI[13]] = lIlIIIIIlIlI[14];
        iArr2[lIlIIIIIlIlI[15]] = lIlIIIIIlIlI[16];
        iArr2[lIlIIIIIlIlI[17]] = lIlIIIIIlIlI[18];
        iArr2[lIlIIIIIlIlI[19]] = lIlIIIIIlIlI[20];
        Inventory.dropAll(iArr2);
        "".length();
        return lIlIIIIIlIlI[3];
    }

    static {
        llIlIlIIIIllIl();
    }

    private static boolean llIlIlIIIlIIII(int i) {
        return i == 0;
    }

    @Inject
    protected aZ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIIIIlllI(int i, int i2) {
        return i >= i2;
    }
}
