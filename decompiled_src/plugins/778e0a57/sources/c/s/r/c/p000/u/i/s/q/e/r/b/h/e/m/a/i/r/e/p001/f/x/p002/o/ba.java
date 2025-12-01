package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Prep Get Seeds", priority = 21020, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ba  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ba.class */
public class ba extends bg {
    private static /* synthetic */ int[] lIlIIllIlIlI;
    /* synthetic */ C0039n ee;
    private static /* synthetic */ String[] lIlIIllIlIIl;
    /* synthetic */ C0039n ef;

    private static String llIllIlIIlIlll(String lllllllllllllllIllIllIIIIlIIIlIl, String lllllllllllllllIllIllIIIIlIIIlII) {
        String lllllllllllllllIllIllIIIIlIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIIIIlIIIlII.toCharArray();
        int lllllllllllllllIllIllIIIIlIIIIIl = lIlIIllIlIlI[0];
        char[] charArray2 = lllllllllllllllIllIllIIIIlIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIlIlI[0];
        while (llIllIlIlIIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIIIIlIIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIllIllIIIIlIIIIIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (llIllIlIIllIll(C0046u.bh(), EnumC0048w.REACHED_BOTTOM)) {
            return lIlIIllIlIlI[0];
        }
        ?? r0 = lIlIIllIlIlI[1];
        int[] iArr = new int[lIlIIllIlIlI[1]];
        iArr[lIlIIllIlIlI[0]] = lIlIIllIlIlI[2];
        if (!llIllIlIIlllII(Inventory.getCount((boolean) r0, iArr), lIlIIllIlIlI[3])) {
            if (llIllIlIIllIll(this.ak.bw, N.FARMING)) {
                Movement.setDestination(this.al.bs);
                return lIlIIllIlIlI[1];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIllIlIIlllIl(tileObject.getName().contains(lIlIIllIlIIl[lIlIIllIlIlI[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIllIlIlI[1]];
                    strArr[lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[9]];
                    if (llIllIlIIlllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r02 = lIlIIllIlIlI[1];
                        "".length();
                        return " ".length() < 0 ? ((62 ^ 127) ^ (((27 + 29) - (-22)) + 49)) & (((83 ^ 23) ^ (108 ^ 22)) ^ (-" ".length())) : r02;
                    }
                }
                return lIlIIllIlIlI[0];
            });
            if (llIllIlIlIIIII(nearest) && !llIllIlIIlllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                if (!llIllIlIIlllll(this.bS.isMoving() ? 1 : 0) || llIllIlIIlllIl(this.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIllIlIlI[1];
                }
                nearest.interact(lIlIIllIlIIl[lIlIIllIlIlI[6]]);
                return lIlIIllIlIlI[1];
            }
            TileObject cR = cR();
            if (llIllIlIIllllI(cR)) {
                Movement.setDestination(this.ef.bs);
                return lIlIIllIlIlI[1];
            } else if (!llIllIlIIlllll(this.bS.isMoving() ? 1 : 0) || llIllIlIIlllIl(this.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            } else {
                cR.interact(lIlIIllIlIIl[lIlIIllIlIlI[1]]);
                return lIlIIllIlIlI[1];
            }
        } else if (llIllIlIIllIll(this.ak.bw, N.FARMING)) {
            int[] iArr2 = new int[lIlIIllIlIlI[1]];
            iArr2[lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
            if (llIllIlIIlllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIllIlIlI[1]];
                iArr3[lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
                Inventory.dropAll(iArr3);
                "".length();
            }
            return lIlIIllIlIlI[0];
        } else if (llIllIlIIlllIl(Reachable.isWalkable(this.ee.bt) ? 1 : 0)) {
            Movement.setDestination(this.ee.bq.dx(lIlIIllIlIlI[5]).dy(lIlIIllIlIlI[5]));
            return lIlIIllIlIlI[1];
        } else {
            TileObject cR2 = cR();
            if (llIllIlIIllllI(cR2)) {
                Movement.setDestination(this.ef.bs);
                return lIlIIllIlIlI[1];
            } else if (!llIllIlIIlllll(this.bS.isMoving() ? 1 : 0) || llIllIlIIlllIl(this.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            } else {
                cR2.interact(lIlIIllIlIIl[lIlIIllIlIlI[0]]);
                return lIlIIllIlIlI[1];
            }
        }
    }

    private static boolean llIllIlIIlllIl(int i) {
        return i != 0;
    }

    private static boolean llIllIlIlIIIII(Object obj) {
        return obj != null;
    }

    private static void llIllIlIIllIlI() {
        lIlIIllIlIlI = new int[12];
        lIlIIllIlIlI[0] = ((159 ^ 141) ^ (95 ^ 112)) & (((134 ^ 150) ^ (181 ^ 152)) ^ (-" ".length()));
        lIlIIllIlIlI[1] = " ".length();
        lIlIIllIlIlI[2] = (-2067) & 22975;
        lIlIIllIlIlI[3] = (80 ^ 85) ^ ((52 ^ 104) & ((233 ^ 181) ^ (-1)));
        lIlIIllIlIlI[4] = (-((-18141) & 26623)) & (-513) & 14335;
        lIlIIllIlIlI[5] = (((142 + 114) - 175) + 68) ^ (((38 + 133) - 138) + 121);
        lIlIIllIlIlI[6] = "  ".length();
        lIlIIllIlIlI[7] = "   ".length();
        lIlIIllIlIlI[8] = (9 ^ 25) ^ (210 ^ 198);
        lIlIIllIlIlI[9] = 75 ^ 77;
        lIlIIllIlIlI[10] = 108 ^ 107;
        lIlIIllIlIlI[11] = (152 ^ 166) ^ (181 ^ 131);
    }

    static {
        llIllIlIIllIlI();
        llIllIlIIllIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg, c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllIlIlIIIIl(this.bS.getPlane(), lIlIIllIlIlI[6])) {
            return lIlIIllIlIlI[0];
        }
        int[] iArr = new int[lIlIIllIlIlI[1]];
        iArr[lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
        if (llIllIlIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIIllIlIlI[0];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        this.ee = eb();
        this.ef = ec();
        if (!llIllIlIlIIIlI(this.ak.bw, N.FARMING) || llIllIlIIllIll(this.ak.bw, N.END)) {
            ?? r0 = lIlIIllIlIlI[1];
            "".length();
            return ("  ".length() & ("  ".length() ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIllIlIlI[0];
    }

    private static boolean llIllIlIlIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIllIlIIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIllIlIIlllII(int i, int i2) {
        return i > i2;
    }

    private static String llIllIlIIlIllI(String lllllllllllllllIllIllIIIIIllIIII, String lllllllllllllllIllIllIIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIIllIlIlI[11]), "DES");
            Cipher lllllllllllllllIllIllIIIIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIIIllIIlI.init(lIlIIllIlIlI[6], lllllllllllllllIllIllIIIIIllIIll);
            return new String(lllllllllllllllIllIllIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIIIllIIIl) {
            lllllllllllllllIllIllIIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllIlIIlllIl(tileObject.getName().equals(lIlIIllIlIIl[lIlIIllIlIlI[7]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIllIlIlI[1]];
                strArr[lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[8]];
                if (llIllIlIIlllIl(tileObject.hasAction(strArr) ? 1 : 0) && llIllIlIIlllIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIllIlIlI[1];
                    "".length();
                    return " ".length() == 0 ? ((((188 + 120) - 182) + 82) ^ (((20 + 84) - 87) + 133)) & (((((14 + 24) - (-35)) + 56) ^ (((9 + 44) - (-54)) + 92)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIllIlIlI[0];
        });
    }

    private static boolean llIllIlIIllllI(Object obj) {
        return obj == null;
    }

    @Inject
    protected ba(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIllIlIIllIIl() {
        lIlIIllIlIIl = new String[lIlIIllIlIlI[10]];
        lIlIIllIlIIl[lIlIIllIlIlI[0]] = llIllIlIIlIllI("1B5eCR5K4PU=", "DyQsw");
        lIlIIllIlIIl[lIlIIllIlIlI[1]] = llIllIlIIlIlll("MQ0YKQM=", "tclLq");
        lIlIIllIlIIl[lIlIIllIlIlI[6]] = llIllIlIIlIlll("JjQMFw==", "tUgrT");
        lIlIIllIlIIl[lIlIIllIlIlI[7]] = llIllIlIIlIlll("KDkRFiUfPQ==", "xXbeD");
        lIlIIllIlIIl[lIlIIllIlIlI[8]] = llIllIlIIlIlll("Ih81Iio=", "gqAGX");
        lIlIIllIlIIl[lIlIIllIlIlI[3]] = llIllIlIIlIlll("IwcqCzs=", "tbOoH");
        lIlIIllIlIIl[lIlIIllIlIlI[9]] = llIllIlIIllIII("z7Mu5LwM/S4=", "rcFFv");
    }

    private static boolean llIllIlIlIIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllIlIlIIIll(int i, int i2) {
        return i < i2;
    }

    private C0039n ec() {
        List<C0039n> D = this.co.D();
        return D.get(D.size() - lIlIIllIlIlI[1]);
    }

    private C0039n eb() {
        List<C0039n> D = this.co.D();
        return D.get(D.size() - lIlIIllIlIlI[6]);
    }

    private static String llIllIlIIllIII(String lllllllllllllllIllIllIIIIlIlIlIl, String lllllllllllllllIllIllIIIIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIllIlIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIIlIlIllI) {
            lllllllllllllllIllIllIIIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlllll(int i) {
        return i == 0;
    }
}
