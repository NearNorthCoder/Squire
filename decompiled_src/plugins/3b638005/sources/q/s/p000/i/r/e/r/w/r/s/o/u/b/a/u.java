package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Teleporting to barrows", priority = 100)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.u  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/u.class */
public class u extends Task {
    private static /* synthetic */ int[] llllIIlllll;
    private static /* synthetic */ String[] llllIIllllI;
    private final /* synthetic */ SquireBarrows ag;

    static {
        lIllIlIIllIlIl();
        lIllIlIIllIlII();
    }

    private static boolean lIllIlIIllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIllIlIIllIlII() {
        llllIIllllI = new String[llllIIlllll[6]];
        llllIIllllI[llllIIlllll[0]] = lIllIlIIllIIlI("0Uips7x5/cF1iYxrVxD+zA==", "oprbP");
        llllIIllllI[llllIIlllll[2]] = lIllIlIIllIIll("LSkAEDUYOw==", "oHrbZ");
        llllIIllllI[llllIIlllll[3]] = lIllIlIIllIIll("IDMDIT4VIQ==", "bRqSQ");
    }

    private static void lIllIlIIllIlIl() {
        llllIIlllll = new int[8];
        llllIIlllll[0] = ((33 ^ 95) ^ (18 ^ 44)) & (((106 ^ 15) ^ (144 ^ 181)) ^ (-" ".length()));
        llllIIlllll[1] = (16 ^ 75) ^ (196 ^ 139);
        llllIIlllll[2] = " ".length();
        llllIIlllll[3] = "  ".length();
        llllIIlllll[4] = (-20501) & 24063;
        llllIIlllll[5] = (-24845) & 28157;
        llllIIlllll[6] = "   ".length();
        llllIIlllll[7] = 161 ^ 169;
    }

    private static boolean lIllIlIIlllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIlllll[4], llllIIlllll[5], llllIIlllll[0]);
        if (lIllIlIIlllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIlllll[2];
        }
        Movement.walkTo(worldPoint);
        "".length();
        return llllIIlllll[2];
    }

    private static boolean lIllIlIIlllIII(int i) {
        return i == 0;
    }

    private static String lIllIlIIllIIll(String llllllllllllllllIIIllIllIIllIlII, String llllllllllllllllIIIllIllIIllIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIllIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIllIIllIIll.toCharArray();
        int llllllllllllllllIIIllIllIIllIIII = llllIIlllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIlllll[0];
        while (lIllIlIIlllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIIllIllIIllIIII % charArray.length]));
            "".length();
            llllllllllllllllIIIllIllIIllIIII++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIlIIllIIlI(String llllllllllllllllIIIllIllIIIlllll, String llllllllllllllllIIIllIllIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIllIIIllllI.getBytes(StandardCharsets.UTF_8)), llllIIlllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIllIIlIIIII) {
            llllllllllllllllIIIllIllIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIlllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlllIIl(int i, int i2) {
        return i > i2;
    }

    @Inject
    public u(SquireBarrows squireBarrows) {
        this.ag = squireBarrows;
    }

    private static boolean lIllIlIIllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    public boolean run() {
        if (!lIllIlIIllIllI(Game.getState(), GameState.LOGGED_IN) && !lIllIlIIllIlll(this.ag.u() ? 1 : 0)) {
            if (lIllIlIIlllIII(Movement.isRunEnabled() ? 1 : 0) && lIllIlIIlllIIl(Movement.getRunEnergy(), llllIIlllll[1])) {
                Movement.toggleRun();
            }
            if (!lIllIlIIlllIII(this.ag.h() ? 1 : 0) || lIllIlIIllIlll(this.ag.m() ? 1 : 0)) {
                return llllIIlllll[0];
            }
            String[] strArr = new String[llllIIlllll[2]];
            strArr[llllIIlllll[0]] = llllIIllllI[llllIIlllll[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIllIlIIlllIlI(nearest)) {
                String[] strArr2 = new String[llllIIlllll[2]];
                strArr2[llllIIlllll[0]] = llllIIllllI[llllIIlllll[2]];
                if (!lIllIlIIlllIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                    if (lIllIlIIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                        return llllIIlllll[0];
                    }
                    nearest.interact(llllIIllllI[llllIIlllll[3]]);
                    return llllIIlllll[2];
                }
            }
            return J();
        }
        return llllIIlllll[0];
    }
}
