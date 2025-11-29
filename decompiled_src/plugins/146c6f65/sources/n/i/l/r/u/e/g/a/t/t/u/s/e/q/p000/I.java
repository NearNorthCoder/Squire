package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Pathing to Demiboss", priority = 1)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.I  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/I.class */
public class I extends AbstractC0013n {
    private static /* synthetic */ String[] llIlIIlIIIIl;
    private final /* synthetic */ C0002c bU;
    private static /* synthetic */ int[] llIlIIlIIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (!lIIIIIIllIlIlII(local) || lIIIIIIllIlIlII(local.getInteracting())) {
            return llIlIIlIIIlI[1];
        }
        if (lIIIIIIllIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIIlIIIlI[1];
        }
        EnumC0006g J = this.bU.J();
        if (!lIIIIIIllIlIllI(J) && !lIIIIIIllIlIlll(Inventory.getCount((boolean) llIlIIlIIIlI[0], J.an().aB()))) {
            C0007h V = this.bU.V();
            if (lIIIIIIllIlIllI(V)) {
                Log.info(llIlIIlIIIIl[llIlIIlIIIlI[1]]);
                return llIlIIlIIIlI[1];
            }
            List<C0011l> b = V.b(c0011l -> {
                if (lIIIIIIllIllIIl(c0011l.aZ(), J)) {
                    ?? r0 = llIlIIlIIIlI[0];
                    "".length();
                    return (((250 ^ 179) ^ (63 ^ 100)) & (((((43 + 156) - 77) + 61) ^ (((57 + 99) - 17) + 26)) ^ (-" ".length()))) > 0 ? ((158 ^ 192) ^ "   ".length()) & (((83 ^ 7) ^ (184 ^ 177)) ^ (-" ".length())) : r0;
                }
                return llIlIIlIIIlI[1];
            });
            if (!lIIIIIIllIlIlIl(b.isEmpty() ? 1 : 0)) {
                List<C0011l> b2 = V.b(c0011l2 -> {
                    if (lIIIIIIllIlIlIl(c0011l2.aY() ? 1 : 0) && lIIIIIIllIllIII(c0011l2.aS() ? 1 : 0)) {
                        ?? r0 = llIlIIlIIIlI[0];
                        "".length();
                        return "  ".length() == ((100 ^ 59) ^ (90 ^ 1)) ? ((233 ^ 190) ^ (101 ^ 105)) & (((120 ^ 105) ^ (22 ^ 92)) ^ (-" ".length())) : r0;
                    }
                    return llIlIIlIIIlI[1];
                });
                if (lIIIIIIllIllIII(b2.isEmpty() ? 1 : 0)) {
                    Log.info(llIlIIlIIIIl[llIlIIlIIIlI[2]]);
                    return llIlIIlIIIlI[1];
                }
                b2.sort(Comparator.comparingInt(c0011l3 -> {
                    return c0011l3.aW().distanceTo(local.getWorldLocation());
                }));
                C0011l c0011l4 = b2.get(llIlIIlIIIlI[1]);
                Log.info(llIlIIlIIIIl[llIlIIlIIIlI[3]]);
                return this.bU.a(c0011l4, local.getWorldLocation());
            }
            C0011l c0011l5 = b.get(llIlIIlIIIlI[1]);
            if (lIIIIIIllIlIlIl(c0011l5.e(local.getWorldLocation()) ? 1 : 0)) {
                if (lIIIIIIllIlIlll(lIIIIIIllIlIIll(c0011l5.aQ().distanceTo(local), 1.5d * c0011l5.aQ().distanceTo(V.av().aQ())))) {
                    Item first = Inventory.getFirst(item -> {
                        return C0004e.ab.contains(Integer.valueOf(item.getId()));
                    });
                    if (lIIIIIIllIlIlII(first)) {
                        first.interact(llIlIIlIIIIl[llIlIIlIIIlI[0]]);
                        "".length();
                        if (((16 ^ 66) ^ (88 ^ 14)) == "   ".length()) {
                            return ((200 ^ 190) ^ (185 ^ 139)) & (((((130 + 125) - 39) + 16) ^ (((133 + 17) - 103) + 125)) ^ (-" ".length()));
                        }
                    } else {
                        this.bU.a(V.av(), local.getWorldLocation());
                        "".length();
                    }
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    this.bU.a(c0011l5, local.getWorldLocation());
                    "".length();
                }
                return llIlIIlIIIlI[0];
            }
            return llIlIIlIIIlI[1];
        }
        return llIlIIlIIIlI[1];
    }

    private static void lIIIIIIllIlIIIl() {
        llIlIIlIIIIl = new String[llIlIIlIIIlI[4]];
        llIlIIlIIIIl[llIlIIlIIIlI[1]] = lIIIIIIllIIIIlI("3zAz/SFNef7CKpkgSQIfiZf0GC9Llovt", "gKhMo");
        llIlIIlIIIIl[llIlIIlIIIlI[0]] = lIIIIIIllIIIIll("IhYcPS8CAQ0=", "cuhTY");
        llIlIIlIIIIl[llIlIIlIIIlI[2]] = lIIIIIIllIIIIll("Jy4BACkDKBQJNFcgBwBnEiwFET4=", "wAueG");
        llIlIIlIIIIl[llIlIIlIIIlI[3]] = lIIIIIIllIIIIlI("jjSjcA8cig/FnUPA1MZMoVOGdombHl4RUNOfPk78ks8=", "XLcWT");
    }

    private static boolean lIIIIIIllIlIlll(int i) {
        return i > 0;
    }

    private static void lIIIIIIllIlIIlI() {
        llIlIIlIIIlI = new int[5];
        llIlIIlIIIlI[0] = " ".length();
        llIlIIlIIIlI[1] = (82 ^ 123) & ((50 ^ 27) ^ (-1));
        llIlIIlIIIlI[2] = "  ".length();
        llIlIIlIIIlI[3] = "   ".length();
        llIlIIlIIIlI[4] = 4 ^ 0;
    }

    private static boolean lIIIIIIllIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIIllIlIlIl(int i) {
        return i == 0;
    }

    static {
        lIIIIIIllIlIIlI();
        lIIIIIIllIlIIIl();
    }

    private static boolean lIIIIIIllIlIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIlIIIlI[0]];
        enumC0003dArr[llIlIIlIIIlI[1]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        this.bU = c0002c;
    }

    private static String lIIIIIIllIIIIll(String lllllllllllllllIlIIIlIlIIlIllllI, String lllllllllllllllIlIIIlIlIIlIlllIl) {
        String lllllllllllllllIlIIIlIlIIlIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlIlIIlIlllII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIlIlIIlIlllIl.toCharArray();
        int lllllllllllllllIlIIIlIlIIlIllIlI = llIlIIlIIIlI[1];
        char[] charArray2 = lllllllllllllllIlIIIlIlIIlIllllI2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIlIIIlI[1];
        while (lIIIIIIllIllIlI(i, length)) {
            char lllllllllllllllIlIIIlIlIIlIlllll = charArray2[i];
            lllllllllllllllIlIIIlIlIIlIlllII.append((char) (lllllllllllllllIlIIIlIlIIlIlllll ^ charArray[lllllllllllllllIlIIIlIlIIlIllIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIIIlIlIIlIllIlI++;
            i++;
            "".length();
            if ((-(93 ^ 88)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIlIlIIlIlllII);
    }

    private static boolean lIIIIIIllIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIIllIlIlII(Object obj) {
        return obj != null;
    }

    private static String lIIIIIIllIIIIlI(String lllllllllllllllIlIIIlIlIIlIIlIIl, String lllllllllllllllIlIIIlIlIIlIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlIlIIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIlIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIlIIIlI[2], lllllllllllllllIlIIIlIlIIlIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlIlIIlIIIlIl) {
            lllllllllllllllIlIIIlIlIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIllIllIII(int i) {
        return i != 0;
    }

    private static int lIIIIIIllIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
