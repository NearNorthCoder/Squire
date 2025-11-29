package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Exploring the gauntlet", priority = 1)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Q  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/Q.class */
public class Q extends AbstractC0013n {
    private static /* synthetic */ int[] llIIllIlllIl;
    private static /* synthetic */ String[] llIIllIlllII;

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIlllIl[0]];
        enumC0003dArr[llIIllIlllIl[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        C0007h V = this.ba.V();
        if (lllllllIlIIIII(local) && lllllllIlIIIII(V) && lllllllIlIIIIl(local.isMoving() ? 1 : 0) && !lllllllIlIIIII(local.getInteracting())) {
            Optional<C0011l> ar = V.ar();
            if (lllllllIlIIIlI(ar.isEmpty() ? 1 : 0)) {
                Log.info(llIIllIlllII[llIIllIlllIl[1]]);
                return llIIllIlllIl[1];
            }
            C0011l as = V.as();
            if (lllllllIlIIIII(as)) {
                Optional<C0011l> findFirst = V.c(as).stream().filter(c0011l -> {
                    if (lllllllIlIIIIl(c0011l.aY() ? 1 : 0) && lllllllIlIIIlI(c0011l.aS() ? 1 : 0)) {
                        ?? r0 = llIIllIlllIl[0];
                        "".length();
                        return ((240 ^ 147) & ((255 ^ 156) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIlllIl[1];
                }).findFirst();
                EnumC0006g J = this.ba.J();
                C0011l c0011l2 = ar.get();
                if (lllllllIlIIIlI(V.b(c0011l3 -> {
                    if (lllllllIlIIIlI(c0011l3.aY() ? 1 : 0) && lllllllIlIIIll(c0011l3.aZ(), J)) {
                        ?? r0 = llIIllIlllIl[0];
                        "".length();
                        return (115 ^ 119) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIlllIl[1];
                }).isEmpty() ? 1 : 0) && lllllllIlIIIlI(findFirst.isPresent() ? 1 : 0)) {
                    c0011l2 = findFirst.get();
                }
                WorldArea aR = c0011l2.aR();
                Comparator comparingInt = Comparator.comparingInt(tileObject -> {
                    return (int) tileObject.getWorldLocation().distanceToHypotenuse(local.getWorldLocation());
                });
                TileObjects.getAll(C0004e.U).stream().filter(tileObject2 -> {
                    return as.e(tileObject2.getWorldLocation());
                }).min(Comparator.comparingInt(tileObject3 -> {
                    return (int) aR.getCenter().distanceToHypotenuse(tileObject3.getWorldLocation());
                }).thenComparing(comparingInt)).ifPresent(tileObject4 -> {
                    tileObject4.interact(llIIllIlllII[llIIllIlllIl[0]]);
                });
                return llIIllIlllIl[0];
            }
            return llIIllIlllIl[1];
        }
        return llIIllIlllIl[1];
    }

    private static boolean lllllllIlIIIIl(int i) {
        return i == 0;
    }

    private static void lllllllIIllllI() {
        llIIllIlllII = new String[llIIllIlllIl[2]];
        llIIllIlllII[llIIllIlllIl[1]] = lllllllIIlllIl("2Ml7hnoRlBVnHWnGwUZI9iF7NQgvWyIJTJJ7TTKKyGQ=", "vOmgU");
        llIIllIlllII[llIIllIlllIl[0]] = lllllllIIlllIl("BakbpYnbjgw=", "qtlPY");
    }

    static {
        lllllllIIlllll();
        lllllllIIllllI();
    }

    private static void lllllllIIlllll() {
        llIIllIlllIl = new int[3];
        llIIllIlllIl[0] = " ".length();
        llIIllIlllIl[1] = (150 ^ 133) & ((123 ^ 104) ^ (-1));
        llIIllIlllIl[2] = "  ".length();
    }

    private static String lllllllIIlllIl(String lllllllllllllllIlIIlIlIIIIIlllll, String lllllllllllllllIlIIlIlIIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIlllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIIIIlIIIII) {
            lllllllllllllllIlIIlIlIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIlIIIlI(int i) {
        return i != 0;
    }

    private static boolean lllllllIlIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllllIlIIIII(Object obj) {
        return obj != null;
    }
}
