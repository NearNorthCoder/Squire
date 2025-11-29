package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Exploring further", priority = 1)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.H  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/H.class */
public class H extends AbstractC0013n {
    private static /* synthetic */ String[] llIIllIlIIlI;
    private static /* synthetic */ int[] llIIllIlIIll;

    private static boolean lllllllIIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllllIIIIIlI(Object obj) {
        return obj != null;
    }

    private static void lllllllIIIIIII() {
        llIIllIlIIll = new int[3];
        llIIllIlIIll[0] = "  ".length();
        llIIllIlIIll[1] = ((10 ^ 122) ^ (116 ^ 81)) & (((21 ^ 24) ^ (26 ^ 66)) ^ (-" ".length()));
        llIIllIlIIll[2] = " ".length();
    }

    private static boolean lllllllIIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lllllllIIIIlll(int i) {
        return i > 0;
    }

    private static boolean lllllllIIIIlIl(int i) {
        return i == 0;
    }

    static {
        lllllllIIIIIII();
        llllllIlllllll();
    }

    private static boolean lllllllIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void llllllIlllllll() {
        llIIllIlIIlI = new String[llIIllIlIIll[2]];
        llIIllIlIIlI[llIIllIlIIll[1]] = llllllIllllllI("IAw7JxsAGyo=", "aoONm");
    }

    private static boolean lllllllIIIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        Player local = Players.getLocal();
        if (lllllllIIIIIlI(local.getInteracting())) {
            return llIIllIlIIll[1];
        }
        C0007h V = this.ba.V();
        if (lllllllIIIIIll(V)) {
            return llIIllIlIIll[1];
        }
        if (lllllllIIIIlII(this.ba.W(), EnumC0003d.EXTRA_FOOD_EXPLORE)) {
            i = llIIllIlIIll[2];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIllIlIIll[1];
        }
        int i2 = i;
        EnumC0006g J = this.ba.J();
        if ((!lllllllIIIIIlI(J) || !lllllllIIIIlIl(J.an().aC()) || !lllllllIIIIlIl(i2)) && !lllllllIIIIllI(this.ba.N() ? 1 : 0) && !lllllllIIIIllI(this.ba.O() ? 1 : 0)) {
            Optional<C0011l> min = V.b(c0011l -> {
                if (lllllllIIIIlIl(c0011l.aY() ? 1 : 0) && lllllllIIIIlIl(c0011l.aS() ? 1 : 0)) {
                    ?? r0 = llIIllIlIIll[2];
                    "".length();
                    return "   ".length() <= ((16 ^ 56) & ((31 ^ 55) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIlIIll[1];
            }).stream().min(Comparator.comparing((v0) -> {
                return v0.aU();
            }));
            if (lllllllIIIIllI(min.isEmpty() ? 1 : 0)) {
                min = V.b(c0011l2 -> {
                    if (lllllllIIIIlIl(c0011l2.aY() ? 1 : 0)) {
                        ?? r0 = llIIllIlIIll[2];
                        "".length();
                        return ((19 ^ 95) & ((126 ^ 50) ^ (-1))) > 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                    }
                    return llIIllIlIIll[1];
                }).stream().min(Comparator.comparing((v0) -> {
                    return v0.aU();
                }));
                if (lllllllIIIIllI(min.isEmpty() ? 1 : 0)) {
                    C0012m av = this.ba.V().av();
                    WorldPoint worldLocation = local.getWorldLocation();
                    if (lllllllIIIIllI(av.e(worldLocation) ? 1 : 0)) {
                        this.ba.a(EnumC0003d.PREPARE_BOSS_FIGHT);
                        "".length();
                        if (((8 ^ 73) ^ (229 ^ 160)) <= 0) {
                            return ((82 ^ 23) ^ (237 ^ 179)) & (((65 ^ 79) ^ (13 ^ 24)) ^ (-" ".length()));
                        }
                    } else {
                        this.ba.a(av, worldLocation);
                        "".length();
                    }
                    return llIIllIlIIll[2];
                }
            }
            C0011l c0011l3 = min.get();
            if (lllllllIIIIlll(lllllllIIIIIIl(c0011l3.aQ().distanceToHypotenuse(local.getWorldLocation()) - c0011l3.aQ().distanceToHypotenuse(V.av().aQ()), 32.0f))) {
                Item first = Inventory.getFirst(item -> {
                    return C0004e.ab.contains(Integer.valueOf(item.getId()));
                });
                if (lllllllIIIIIlI(first)) {
                    first.interact(llIIllIlIIlI[llIIllIlIIll[1]]);
                    return llIIllIlIIll[2];
                }
            }
            return this.ba.a(c0011l3, local.getWorldLocation());
        }
        return llIIllIlIIll[1];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIlIIll[0]];
        enumC0003dArr[llIIllIlIIll[1]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIllIlIIll[2]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
    }

    private static int lllllllIIIIIIl(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private static String llllllIllllllI(String lllllllllllllllIlIIlIlIIllIlIIII, String lllllllllllllllIlIIlIlIIllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlIIllIIlIlI.toCharArray();
        int lllllllllllllllIlIIlIlIIllIIIlll = llIIllIlIIll[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIIlIlIIllIIIlIl = charArray2.length;
        int i = llIIllIlIIll[1];
        while (lllllllIIIlIII(i, lllllllllllllllIlIIlIlIIllIIIlIl)) {
            char lllllllllllllllIlIIlIlIIllIlIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIlIlIIllIlIIIl ^ charArray[lllllllllllllllIlIIlIlIIllIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlIIllIIIlll++;
            i++;
            "".length();
            if ("  ".length() == (((72 ^ 70) ^ (130 ^ 135)) & (((120 ^ 99) ^ (20 ^ 4)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
