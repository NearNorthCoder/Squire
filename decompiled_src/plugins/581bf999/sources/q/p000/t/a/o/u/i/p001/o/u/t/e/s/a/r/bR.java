package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging poison splat", priority = 160)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bR  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bR.class */
public class bR extends bX {
    private static /* synthetic */ String[] llIlIlllIll;
    private static /* synthetic */ int[] llIlIllllII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        Player local = Players.getLocal();
        List<WorldPoint> cE = cE();
        if (!lIlIlIIIIIllIl(cE.isEmpty() ? 1 : 0) && !lIlIlIIIIIllIl(cE.stream().noneMatch(worldPoint -> {
            return worldPoint.equals(local.getWorldLocation());
        }) ? 1 : 0)) {
            Log.info(llIlIlllIll[llIlIllllII[0]]);
            WorldPoint worldPoint2 = (WorldPoint) local.getWorldArea().offset(llIlIllllII[1]).toWorldPointList().stream().filter(worldPoint3 -> {
                return cE.stream().noneMatch(worldPoint3 -> {
                    return worldPoint3.equals(worldPoint3);
                });
            }).filter(Reachable::isWalkable).filter(worldPoint4 -> {
                if (lIlIlIIIIlIIII(worldPoint4.distanceTo(cB()), llIlIllllII[3])) {
                    ?? r0 = llIlIllllII[2];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIllllII[0];
            }).min(Comparator.comparingInt(worldPoint5 -> {
                return worldPoint5.distanceTo2D(local.getWorldLocation());
            })).orElse(null);
            if (lIlIlIIIIIlllI(worldPoint2)) {
                return llIlIllllII[0];
            }
            List<TileObject> cC = cC();
            Movement.setDestination(b(local.getWorldLocation(), worldPoint2, worldPoint6 -> {
                if (lIlIlIIIIIllIl(cC.stream().noneMatch(tileObject -> {
                    return worldPoint6.equals(tileObject.getWorldLocation());
                }) ? 1 : 0) && lIlIlIIIIIllll(cE.contains(worldPoint6) ? 1 : 0)) {
                    ?? r0 = llIlIllllII[2];
                    "".length();
                    return ((174 ^ 179) & ((124 ^ 97) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIllllII[0];
            }));
            return llIlIllllII[2];
        }
        return llIlIllllII[0];
    }

    private static boolean lIlIlIIIIlIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIIIIIllIl(int i) {
        return i != 0;
    }

    @Inject
    protected bR(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static String lIlIlIIIIIlIlI(String llllllllllllllllIIllIIIIlIlIllIl, String llllllllllllllllIIllIIIIlIlIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), llIlIllllII[4]), "DES");
            Cipher llllllllllllllllIIllIIIIlIlIllll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIIlIlIllll.init(llIlIllllII[5], llllllllllllllllIIllIIIIlIllIIII);
            return new String(llllllllllllllllIIllIIIIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIlIlIlllI) {
            llllllllllllllllIIllIIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIIIIIlIll() {
        llIlIlllIll = new String[llIlIllllII[2]];
        llIlIlllIll[llIlIllllII[0]] = lIlIlIIIIIlIlI("qDj0fmK7oGDBOxGyJSgjsXuZ2307NkyP8cqluCGGlDA=", "xiCQW");
    }

    static {
        lIlIlIIIIIllII();
        lIlIlIIIIIlIll();
    }

    private static boolean lIlIlIIIIIlllI(Object obj) {
        return obj == null;
    }

    private static void lIlIlIIIIIllII() {
        llIlIllllII = new int[6];
        llIlIllllII[0] = (72 ^ 85) & ((120 ^ 101) ^ (-1));
        llIlIllllII[1] = 130 ^ 142;
        llIlIllllII[2] = " ".length();
        llIlIllllII[3] = 103 ^ 99;
        llIlIllllII[4] = 159 ^ 151;
        llIlIllllII[5] = "  ".length();
    }

    private static boolean lIlIlIIIIIllll(int i) {
        return i == 0;
    }
}
