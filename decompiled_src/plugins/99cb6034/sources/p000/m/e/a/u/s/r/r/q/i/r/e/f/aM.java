package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Applying volcanic ash", priority = 30, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aM  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aM.class */
public class aM extends aN {
    private static /* synthetic */ int[] lIlllIlIlIlI;
    private static /* synthetic */ String[] lIlllIlIlIIl;

    private static void lllIllIIIlllIl() {
        lIlllIlIlIlI = new int[5];
        lIlllIlIlIlI[0] = ((((114 + 145) - 174) + 66) ^ (((119 + 122) - 67) + 7)) & (((((29 + 13) - (-62)) + 58) ^ (((15 + 44) - (-66)) + 3)) ^ (-" ".length()));
        lIlllIlIlIlI[1] = " ".length();
        lIlllIlIlIlI[2] = (103 ^ 11) ^ (31 ^ 65);
        lIlllIlIlIlI[3] = 74 ^ 83;
        lIlllIlIlIlI[4] = (-((-29473) & 31529)) & (-385) & 24062;
    }

    private static boolean lllIllIIlIIIlI(int i) {
        return i != 0;
    }

    private static boolean lllIllIIIllllI(int i) {
        return i == 0;
    }

    private static boolean lllIllIIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lllIllIIIllIll(String lllllllllllllllIlIllIlIllIlIllIl, String lllllllllllllllIlIllIlIllIlIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIllIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllIlIllIlIlIlI = lllllllllllllllIlIllIlIllIlIllII.toCharArray();
        int lllllllllllllllIlIllIlIllIlIlIIl = lIlllIlIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlllIlIlIlI[0];
        while (lllIllIIlIIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIllIlIllIlIlIlI[lllllllllllllllIlIllIlIllIlIlIIl % lllllllllllllllIlIllIlIllIlIlIlI.length]));
            "".length();
            lllllllllllllllIlIllIlIllIlIlIIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public aM(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static boolean lllIllIIlIIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lllIllIIIlllII() {
        lIlllIlIlIIl = new String[lIlllIlIlIlI[1]];
        lIlllIlIlIIl[lIlllIlIlIlI[0]] = lllIllIIIllIll("FCcWBBU=", "SNwja");
    }

    private static boolean lllIllIIlIIIIl(Object obj) {
        return obj == null;
    }

    static {
        lllIllIIIlllIl();
        lllIllIIIlllII();
    }

    private static boolean lllIllIIlIIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        int i;
        Item first = Inventory.getFirst(item -> {
            if (lllIllIIlIIlII(item.getId(), lIlllIlIlIlI[4])) {
                ?? r0 = lIlllIlIlIlI[1];
                "".length();
                return (35 ^ 39) <= ((120 ^ 93) & ((113 ^ 84) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIlIlIlI[0];
        });
        if (lllIllIIlIIIIl(first)) {
            return lIlllIlIlIlI[0];
        }
        if (lllIllIIlIIIlI(tileObject.getName().contains(lIlllIlIlIIl[lIlllIlIlIlI[0]]) ? 1 : 0)) {
            i = lIlllIlIlIlI[2];
            "".length();
            if (0 != 0) {
                return ((((22 + 8) - (-25)) + 101) ^ (((118 + 38) - 1) + 27)) & (((149 ^ 147) ^ (236 ^ 192)) ^ (-" ".length()));
            }
        } else {
            i = lIlllIlIlIlI[3];
        }
        if (lllIllIIlIIIll(first.getQuantity(), i)) {
            return lIlllIlIlIlI[0];
        }
        first.useOn(tileObject);
        return lIlllIlIlIlI[1];
    }

    private static boolean lllIllIIlIIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        if (lllIllIIIllllI(this.bS.applyVolcanicAsh() ? 1 : 0)) {
            return lIlllIlIlIlI[0];
        }
        C0014an aI = n.aI();
        EnumC0021au aY = aI.aY();
        if (!lllIllIIIlllll(aI.aZ(), EnumC0039n.HARVESTABLE) || (lllIllIIlIIIII(aY, EnumC0021au.SUPERCOMPOST) && !lllIllIIIlllll(aY, EnumC0021au.GIANT_SUPERCOMPOST))) {
            return lIlllIlIlIlI[0];
        }
        ?? r0 = lIlllIlIlIlI[1];
        "".length();
        return " ".length() <= 0 ? ((39 ^ 73) ^ (55 ^ 106)) & (((((82 + 58) - 72) + 80) ^ (((71 + 45) - (-24)) + 27)) ^ (-" ".length())) : r0;
    }
}
