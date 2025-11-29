package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(priority = 4, name = "Making potion")
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.U  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/U.class */
public class U extends AbstractC0013n {
    private static /* synthetic */ String[] llIIlIllIIlI;
    private final /* synthetic */ C0001b cd;
    private static /* synthetic */ int[] llIIlIllIIll;

    private static boolean lllllIllIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllIllIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllllIlllIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIlllIIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean q(Item item) {
        if (lllllIllIlllll(item)) {
            return llIIlIllIIll[1];
        }
        Item first = Inventory.getFirst(EnumC0008i.CRYSTAL_DUST.aB());
        if (!lllllIllIllIlI(first) || lllllIlllIIIII(first.getQuantity(), bE() * llIIlIllIIll[8])) {
            return llIIlIllIIll[1];
        }
        first.useOn(item);
        return llIIlIllIIll[2];
    }

    private static String lllllIllIlIllI(String lllllllllllllllIlIIllIIlllIlllII, String lllllllllllllllIlIIllIIlllIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIlllIllIll.getBytes(StandardCharsets.UTF_8)), llIIlIllIIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllIIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIlllIlllIl) {
            lllllllllllllllIlIIllIIlllIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public U(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIllIIll[0]];
        enumC0003dArr[llIIlIllIIll[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIIlIllIIll[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIlIllIIll[3]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIIlIllIIll[4]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        enumC0003dArr[llIIlIllIIll[5]] = EnumC0003d.AFK;
        enumC0003dArr[llIIlIllIIll[6]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
        enumC0003dArr[llIIlIllIIll[7]] = EnumC0003d.BOSS_FIGHT;
        this.cd = c0001b;
    }

    private static boolean lllllIlllIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllIllIllllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean bF() {
        int H = this.ba.H();
        if (lllllIlllIIIII(EnumC0008i.CRYSTAL_DUST.aC(), llIIlIllIIll[8] * H) && lllllIlllIIIII(Inventory.getCount(item -> {
            return C0004e.aa.contains(Integer.valueOf(item.getId()));
        }), H)) {
            ?? r0 = llIIlIllIIll[2];
            "".length();
            return (-(13 ^ 8)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIllIIll[1];
    }

    private static void lllllIllIllIIl() {
        llIIlIllIIll = new int[11];
        llIIlIllIIll[0] = (((180 + 195) - 220) + 42) ^ (((187 + 128) - 201) + 80);
        llIIlIllIIll[1] = (252 ^ 175) & ((237 ^ 190) ^ (-1));
        llIIlIllIIll[2] = " ".length();
        llIIlIllIIll[3] = "  ".length();
        llIIlIllIIll[4] = "   ".length();
        llIIlIllIIll[5] = 46 ^ 42;
        llIIlIllIIll[6] = (8 ^ 79) ^ (109 ^ 47);
        llIIlIllIIll[7] = (45 ^ 35) ^ (30 ^ 22);
        llIIlIllIIll[8] = (((22 + 57) - (-28)) + 46) ^ (((104 + 126) - 192) + 109);
        llIIlIllIIll[9] = 162 ^ 182;
        llIIlIllIIll[10] = (146 ^ 184) ^ (173 ^ 143);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (!lllllIllIllIlI(local) || (lllllIllIllIll(local.isMoving() ? 1 : 0) && lllllIllIlllII(this.ba.S() ? 1 : 0))) {
            return llIIlIllIIll[1];
        }
        if (lllllIllIllIll(this.ba.S() ? 1 : 0) && lllllIllIlllII(this.cd.p() ? 1 : 0)) {
            return llIIlIllIIll[1];
        }
        int lllllllllllllllIlIIllIlIIIIIllll = this.ba.H() - Inventory.getCount(item -> {
            return C0004e.aa.contains(Integer.valueOf(item.getId()));
        });
        if (lllllIllIlllIl(this.ba.W(), EnumC0003d.EXTRA_FOOD_EXPLORE) && lllllIllIllIll(lllllllllllllllIlIIllIlIIIIIllll) && lllllIllIllllI(EnumC0008i.CRYSTAL_DUST.aC())) {
            Item first = Inventory.getFirst(EnumC0008i.CRYSTAL_DUST.aB());
            if (lllllIllIllIlI(first)) {
                first.interact(llIIlIllIIlI[llIIlIllIIll[1]]);
                return llIIlIllIIll[2];
            }
        }
        if (lllllIllIllIll(bF() ? 1 : 0)) {
            Item first2 = Inventory.getFirst(item2 -> {
                return C0004e.Y.contains(Integer.valueOf(item2.getId()));
            });
            if (lllllIllIllIlI(first2)) {
                first2.interact(llIIlIllIIlI[llIIlIllIIll[2]]);
                return llIIlIllIIll[2];
            }
        }
        if (lllllIllIllIll(this.ba.H())) {
            return llIIlIllIIll[1];
        }
        if (lllllIllIlllII(bG() ? 1 : 0)) {
            return llIIlIllIIll[2];
        }
        Item first3 = Inventory.getFirst(item3 -> {
            return EnumC0008i.HERB.aA().contains(Integer.valueOf(item3.getId()));
        });
        Item first4 = Inventory.getFirst(item4 -> {
            return C0004e.Z.contains(Integer.valueOf(item4.getId()));
        });
        if (lllllIllIlllll(first3) && lllllIllIlllll(first4)) {
            return llIIlIllIIll[1];
        }
        if (!lllllIllIllIll(r(first3) ? 1 : 0) || lllllIllIlllII(q(first4) ? 1 : 0)) {
            this.cd.e(llIIlIllIIll[4]);
            return llIIlIllIIll[2];
        }
        return llIIlIllIIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean r(Item item) {
        if (lllllIllIlllll(item)) {
            return llIIlIllIIll[1];
        }
        Item first = Inventory.getFirst(item2 -> {
            return EnumC0005f.VIAL.ac().contains(Integer.valueOf(item2.getId() - llIIlIllIIll[2]));
        });
        if (lllllIllIlllll(first)) {
            return llIIlIllIIll[1];
        }
        item.useOn(first);
        return llIIlIllIIll[2];
    }

    static {
        lllllIllIllIIl();
        lllllIllIllIII();
    }

    private static String lllllIllIlIlll(String lllllllllllllllIlIIllIIllllIlIIl, String lllllllllllllllIlIIllIIllllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIllllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIllllIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIllllIlIll.init(llIIlIllIIll[3], secretKeySpec);
            return new String(lllllllllllllllIlIIllIIllllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIllllIlIlI) {
            lllllllllllllllIlIIllIIllllIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIllIII() {
        llIIlIllIIlI = new String[llIIlIllIIll[3]];
        llIIlIllIIlI[llIIlIllIIll[1]] = lllllIllIlIllI("vxXvwlnll7E=", "AdxpO");
        llIIlIllIIlI[llIIlIllIIll[2]] = lllllIllIlIlll("cJ+ngNnfYGU=", "MflJA");
    }

    private static boolean lllllIllIlllII(int i) {
        return i != 0;
    }

    private int bE() {
        return Inventory.getCount(EnumC0005f.VIAL.ad()) + Inventory.getCount(item -> {
            return C0004e.Z.contains(Integer.valueOf(item.getId()));
        });
    }

    private static boolean lllllIllIlllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    private boolean bG() {
        int lllllllllllllllIlIIllIlIIIIIIIII = this.ba.H();
        if (lllllIlllIIIII(EnumC0008i.CRYSTAL_SHARD.aC(), ((lllllllllllllllIlIIllIlIIIIIIIII + llIIlIllIIll[2]) * llIIlIllIIll[9]) + (bE() * llIIlIllIIll[8])) && lllllIlllIIIIl(this.ba.W(), EnumC0003d.EXTRA_FOOD_EXPLORE)) {
            return llIIlIllIIll[1];
        }
        if (lllllIlllIIIlI(EnumC0008i.CRYSTAL_DUST.aC(), (lllllllllllllllIlIIllIlIIIIIIIII - Inventory.getCount(item -> {
            return C0004e.aa.contains(Integer.valueOf(item.getId()));
        })) * llIIlIllIIll[8])) {
            return llIIlIllIIll[1];
        }
        Item first = Inventory.getFirst(EnumC0008i.CRYSTAL_SHARD.aB());
        if (!lllllIllIllIlI(first) || lllllIlllIIIII(first.getQuantity(), llIIlIllIIll[8] * bE())) {
            return llIIlIllIIll[1];
        }
        Item first2 = Inventory.getFirst(item2 -> {
            return C0004e.Y.contains(Integer.valueOf(item2.getId()));
        });
        if (lllllIllIlllll(first2)) {
            return llIIlIllIIll[1];
        }
        first.useOn(first2);
        return llIIlIllIIll[2];
    }

    private static boolean lllllIllIllIll(int i) {
        return i == 0;
    }
}
