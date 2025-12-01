package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching item", priority = 300)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.K  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/K.class */
public class K extends w {
    private static final /* synthetic */ int[] cq;
    private static /* synthetic */ int[] lIlIlIlllllIl;

    private static void lIlllllllllllII() {
        lIlIlIlllllIl = new int[19];
        lIlIlIlllllIl[0] = " ".length();
        lIlIlIlllllIl[1] = ((((91 + 29) - 63) + 181) ^ (((161 + 17) - 132) + 132)) & (((182 ^ 197) ^ (124 ^ 83)) ^ (-" ".length()));
        lIlIlIlllllIl[2] = (37 ^ 110) ^ (58 ^ 120);
        lIlIlIlllllIl[3] = (-6925) & 8125;
        lIlIlIlllllIl[4] = (-((-1071) & 17967)) & (-9237) & 30717;
        lIlIlIlllllIl[5] = "  ".length();
        lIlIlIlllllIl[6] = (-641) & 1943;
        lIlIlIlllllIl[7] = "   ".length();
        lIlIlIlllllIl[8] = (-((-881) & 25457)) & (-4105) & 32767;
        lIlIlIlllllIl[9] = (9 ^ 99) ^ (77 ^ 35);
        lIlIlIlllllIl[10] = (-28685) & 30061;
        lIlIlIlllllIl[11] = 104 ^ 109;
        lIlIlIlllllIl[12] = (-((-21041) & 31479)) & (-20993) & 32735;
        lIlIlIlllllIl[13] = 163 ^ 165;
        lIlIlIlllllIl[14] = (-12801) & 14119;
        lIlIlIlllllIl[15] = 55 ^ 48;
        lIlIlIlllllIl[16] = (-((-3081) & 32427)) & (-1) & 30719;
        lIlIlIlllllIl[17] = (221 ^ 150) ^ (38 ^ 101);
        lIlIlIlllllIl[18] = (-4693) & 5877;
    }

    private static boolean lIllllllllllllI(int i2) {
        return i2 == 0;
    }

    @Inject
    protected K(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    static {
        lIlllllllllllII();
        int[] iArr = new int[lIlIlIlllllIl[2]];
        iArr[lIlIlIlllllIl[1]] = lIlIlIlllllIl[3];
        iArr[lIlIlIlllllIl[0]] = lIlIlIlllllIl[4];
        iArr[lIlIlIlllllIl[5]] = lIlIlIlllllIl[6];
        iArr[lIlIlIlllllIl[7]] = lIlIlIlllllIl[8];
        iArr[lIlIlIlllllIl[9]] = lIlIlIlllllIl[10];
        iArr[lIlIlIlllllIl[11]] = lIlIlIlllllIl[12];
        iArr[lIlIlIlllllIl[13]] = lIlIlIlllllIl[14];
        iArr[lIlIlIlllllIl[15]] = lIlIlIlllllIl[16];
        iArr[lIlIlIlllllIl[17]] = lIlIlIlllllIl[18];
        cq = iArr;
    }

    private Item af() {
        return Inventory.getFirst(cq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (!lIlllllllllllIl(this.cg.c(lIlIlIlllllIl[0])) && !lIllllllllllllI(this.ce.alch() ? 1 : 0)) {
            SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            if (lIllllllllllllI(standard.canCast() ? 1 : 0)) {
                return lIlIlIlllllIl[1];
            }
            Item af = af();
            if (lIlllllllllllIl(af)) {
                return lIlIlIlllllIl[1];
            }
            Magic.cast(standard, af);
            return lIlIlIlllllIl[0];
        }
        return lIlIlIlllllIl[1];
    }

    private static boolean lIlllllllllllIl(Object obj) {
        return obj == null;
    }
}
