package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Harvesting the compost bin", priority = 30, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aQ  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aQ.class */
public class aQ extends aN {
    private static /* synthetic */ int[] lIllllIIlllI;

    private static boolean lllIlllIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        Item first;
        if (lllIlllIIlIlll(this.bS.bottomless() ? 1 : 0)) {
            int[] iArr = new int[lIllllIIlllI[1]];
            iArr[lIllllIIlllI[0]] = lIllllIIlllI[2];
            first = Inventory.getFirst(iArr);
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            int[] iArr2 = new int[lIllllIIlllI[1]];
            iArr2[lIllllIIlllI[0]] = lIllllIIlllI[3];
            first = Inventory.getFirst(iArr2);
        }
        if (lllIlllIIllIII(first)) {
            return lIllllIIlllI[0];
        }
        first.useOn(tileObject);
        return lIllllIIlllI[1];
    }

    private static boolean lllIlllIIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lllIlllIIllIII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlllIIlIlll(int i) {
        return i != 0;
    }

    private static boolean lllIlllIIlIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        C0014an aI = n.aI();
        H c = H.c(aI.aY());
        if (!lllIlllIIlIlII(c) || lllIlllIIlIlIl(c, this.bS.compostType())) {
            return lIllllIIlllI[0];
        }
        if (lllIlllIIlIllI(aI.aZ(), EnumC0039n.HARVESTABLE)) {
            ?? r0 = lIllllIIlllI[1];
            "".length();
            return (((113 ^ 87) ^ (94 ^ 67)) & (((100 ^ 44) ^ (72 ^ 59)) ^ (-" ".length()))) == "   ".length() ? ((((138 + 18) - 110) + 118) ^ (((129 + 158) - 201) + 92)) & (((((66 + 82) - 47) + 66) ^ (((108 + 141) - 112) + 40)) ^ (-" ".length())) : r0;
        }
        return lIllllIIlllI[0];
    }

    static {
        lllIlllIIlIIll();
    }

    @Inject
    public aQ(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static void lllIlllIIlIIll() {
        lIllllIIlllI = new int[4];
        lIllllIIlllI[0] = ((((139 + 6) - (-2)) + 9) ^ (((136 + 70) - 160) + 146)) & (((((140 + 152) - 139) + 86) ^ (((15 + 173) - 125) + 116)) ^ (-" ".length()));
        lIllllIIlllI[1] = " ".length();
        lIllllIIlllI[2] = (-1027) & 24023;
        lIllllIIlllI[3] = (-16417) & 18341;
    }
}
