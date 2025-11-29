package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
@TaskDesc(name = "Walking to chest", priority = 50, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.z  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/z.class */
public class z extends Task {
    private static /* synthetic */ int[] llllIIlIlIl;
    private static final /* synthetic */ List<WorldPoint> ap;
    private final /* synthetic */ SquireBarrows ar;
    private static /* synthetic */ String[] llllIIlIlII;
    private static final /* synthetic */ WorldPoint aq;

    private static boolean lIllIlIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIIlIIII(Object obj) {
        return obj == null;
    }

    private static String lIllIlIIIIlIll(String llllllllllllllllIIIlllIIIlIllIll, String llllllllllllllllIIIlllIIIlIllIlI) {
        String llllllllllllllllIIIlllIIIlIllIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIlllIIIlIllIlI.toCharArray();
        int llllllllllllllllIIIlllIIIlIlIlll = llllIIlIlIl[0];
        char[] charArray2 = llllllllllllllllIIIlllIIIlIllIll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIIlllIIIlIIllll = llllIIlIlIl[0];
        while (lIllIlIIIlIIlI(llllllllllllllllIIIlllIIIlIIllll, length)) {
            char llllllllllllllllIIIlllIIIlIlllII = charArray2[llllllllllllllllIIIlllIIIlIIllll];
            sb.append((char) (llllllllllllllllIIIlllIIIlIlllII ^ charArray[llllllllllllllllIIIlllIIIlIlIlll % charArray.length]));
            "".length();
            llllllllllllllllIIIlllIIIlIlIlll++;
            llllllllllllllllIIIlllIIIlIIllll++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIlIIIIllII() {
        llllIIlIlII = new String[llllIIlIlIl[10]];
        llllIIlIlII[llllIIlIlIl[0]] = lIllIlIIIIlIlI("pOXRijsyq1g=", "uyXhG");
        llllIIlIlII[llllIIlIlIl[2]] = lIllIlIIIIlIll("AggKBgMhARkCGSI=", "Qixel");
        llllIIlIlII[llllIIlIlIl[3]] = lIllIlIIIIlIlI("ySDe7An0wV8=", "nACxY");
        llllIIlIlII[llllIIlIlIl[4]] = lIllIlIIIIlIll("IB0hFg==", "omDxV");
    }

    @Inject
    public z(SquireBarrows squireBarrows) {
        this.ar = squireBarrows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    public boolean run() {
        if (!lIllIlIIIIlllI(this.ar.u() ? 1 : 0) && !lIllIlIIIIllll(this.ar.h() ? 1 : 0)) {
            WorldPoint worldPoint = aq;
            int i = llllIIlIlIl[1];
            String[] strArr = new String[llllIIlIlIl[2]];
            strArr[llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[0]];
            TileObject firstSurrounding = TileObjects.getFirstSurrounding(worldPoint, i, strArr);
            if (lIllIlIIIlIIII(firstSurrounding)) {
                return llllIIlIlIl[0];
            }
            String[] strArr2 = new String[llllIIlIlIl[2]];
            strArr2[llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[2]];
            TileObject nearest = TileObjects.getNearest(strArr2);
            if (lIllIlIIIlIIIl(nearest) && lIllIlIIIIlllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
                return llllIIlIlIl[0];
            }
            Player local = Players.getLocal();
            if ((!lIllIlIIIlIIIl(local.getInteracting()) || !lIllIlIIIIlllI(this.ar.f() ? 1 : 0) || !lIllIlIIIIllll(this.ar.g() ? 1 : 0)) && !lIllIlIIIIlllI(Reachable.isInteractable(firstSurrounding) ? 1 : 0)) {
                if (lIllIlIIIIlllI(ap.contains(local.getWorldLocation()) ? 1 : 0)) {
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        String[] strArr3 = new String[llllIIlIlIl[2]];
                        strArr3[llllIIlIlIl[0]] = llllIIlIlII[llllIIlIlIl[4]];
                        if (lIllIlIIIIlllI(tileObject.hasAction(strArr3) ? 1 : 0) && lIllIlIIIIlllI(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                            ?? r0 = llllIIlIlIl[2];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((((51 + 137) - (-12)) + 25) ^ (((177 + 83) - 204) + 133)) & (((((53 + 165) - 58) + 32) ^ (((38 + 54) - 81) + 145)) ^ (-" ".length())) : r0;
                        }
                        return llllIIlIlIl[0];
                    });
                    if (lIllIlIIIlIIIl(nearest2)) {
                        nearest2.interact(llllIIlIlII[llllIIlIlIl[3]]);
                        sleep(llllIIlIlIl[1]);
                        return llllIIlIlIl[2];
                    }
                }
                CollisionMap globalWithLocalCollisions = Static.getGlobalWithLocalCollisions();
                GlobalCollisionMap globalCollisionMap = Static.getGlobalCollisionMap();
                if (lIllIlIIIIlllI(globalCollisionMap instanceof GlobalCollisionMap ? 1 : 0)) {
                    globalWithLocalCollisions = new LocalCollisionMap(globalCollisionMap, (boolean) llllIIlIlIl[0]);
                }
                Walker.walkAlong(Walker.calculateTilePath(List.of(local.getWorldLocation()), firstSurrounding.getWorldLocation().toWorldArea(), globalWithLocalCollisions), Collections.emptyMap());
                "".length();
                return llllIIlIlIl[2];
            }
            return llllIIlIlIl[0];
        }
        return llllIIlIlIl[0];
    }

    private static boolean lIllIlIIIIllll(int i) {
        return i == 0;
    }

    static {
        lIllIlIIIIllIl();
        lIllIlIIIIllII();
        ap = List.of(new WorldPoint(llllIIlIlIl[5], llllIIlIlIl[6], llllIIlIlIl[0]), new WorldPoint(llllIIlIlIl[7], llllIIlIlIl[6], llllIIlIlIl[0]));
        aq = new WorldPoint(llllIIlIlIl[8], llllIIlIlIl[9], llllIIlIlIl[0]);
    }

    private static boolean lIllIlIIIlIIIl(Object obj) {
        return obj != null;
    }

    private static String lIllIlIIIIlIlI(String llllllllllllllllIIIlllIIIlIIIllI, String llllllllllllllllIIIlllIIIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIlIl[3], llllllllllllllllIIIlllIIIlIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIIIlIIIlll) {
            llllllllllllllllIIIlllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIIlllI(int i) {
        return i != 0;
    }

    private static void lIllIlIIIIllIl() {
        llllIIlIlIl = new int[11];
        llllIIlIlIl[0] = ((62 ^ 50) ^ (97 ^ 47)) & (((((96 + 111) - (-24)) + 13) ^ (((159 + 3) - 76) + 96)) ^ (-" ".length()));
        llllIIlIlIl[1] = (4 ^ 37) ^ (43 ^ 0);
        llllIIlIlIl[2] = " ".length();
        llllIIlIlIl[3] = "  ".length();
        llllIIlIlIl[4] = "   ".length();
        llllIIlIlIl[5] = (-((-13537) & 13799)) & (-24593) & 28510;
        llllIIlIlIl[6] = (-((-12521) & 15083)) & (-20481) & 32751;
        llllIIlIlIl[7] = (-((-3753) & 32427)) & (-529) & 32767;
        llllIIlIlIl[8] = (-4641) & 8191;
        llllIIlIlIl[9] = (-23041) & 32734;
        llllIIlIlIl[10] = 7 ^ 3;
    }
}
