package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Attacking Cerberus", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/r.class */
public class C0069r extends Task {
    private final /* synthetic */ C0000a aA;
    private final /* synthetic */ SquireCerberusConfig aB;
    private static /* synthetic */ String[] lIIIIII;
    private static /* synthetic */ int[] lIIIIIl;

    private static void lllllIlI() {
        lIIIIII = new String[lIIIIIl[5]];
        lIIIIII[lIIIIIl[0]] = lllllIII("NjsQKTUc", "wOdHV");
        lIIIIII[lIIIIIl[2]] = lllllIIl("igQA3rsAClSTluXkDksoYES6FFBvZgrrQ3n6fajXgNA=", "ZMxfx");
        lIIIIII[lIIIIIl[4]] = lllllIIl("wuw6yQpCmOY=", "uapVq");
    }

    private static boolean lllllllI(int i2) {
        return i2 != 0;
    }

    private static boolean llllllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static String lllllIIl(String llllIIlIlIllIlI, String llllIIlIlIllIIl) {
        try {
            SecretKeySpec llllIIlIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIl[6]), "DES");
            Cipher llllIIlIlIlllII = Cipher.getInstance("DES");
            llllIIlIlIlllII.init(lIIIIIl[4], llllIIlIlIlllIl);
            return new String(llllIIlIlIlllII.doFinal(Base64.getDecoder().decode(llllIIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIlIlIllIll) {
            llllIIlIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIII(int i2, int i3) {
        return i2 > i3;
    }

    private static String lllllIII(String llllIIlIlIIIlIl, String llllIIlIlIIlIIl) {
        String llllIIlIlIIIlIl2 = new String(Base64.getDecoder().decode(llllIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIlIlIIlIII = new StringBuilder();
        char[] charArray = llllIIlIlIIlIIl.toCharArray();
        int llllIIlIlIIIllI = lIIIIIl[0];
        char[] charArray2 = llllIIlIlIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIIIl[0];
        while (lIIIIIIlI(i2, length)) {
            llllIIlIlIIlIII.append((char) (charArray2[i2] ^ charArray[llllIIlIlIIIllI % charArray.length]));
            "".length();
            llllIIlIlIIIllI++;
            i2++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllIIlIlIIlIII);
    }

    @Inject
    private C0069r(C0000a c0000a, SquireCerberusConfig squireCerberusConfig) {
        this.aA = c0000a;
        this.aB = squireCerberusConfig;
    }

    private static boolean lIIIIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llllllll(int i2) {
        return i2 == 0;
    }

    private static void lllllIll() {
        lIIIIIl = new int[7];
        lIIIIIl[0] = (86 ^ 4) & ((125 ^ 47) ^ (-1));
        lIIIIIl[1] = 40 ^ 39;
        lIIIIIl[2] = " ".length();
        lIIIIIl[3] = 18 ^ 23;
        lIIIIIl[4] = "  ".length();
        lIIIIIl[5] = "   ".length();
        lIIIIIl[6] = (189 ^ 131) ^ (0 ^ 54);
    }

    static {
        lllllIll();
        lllllIlI();
    }

    private static boolean llllllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    public boolean run() {
        if (!llllllII(this.aA.k()) || llllllIl(this.aA.k().y())) {
            return lIIIIIl[0];
        }
        if (!llllllIl(Players.getLocal().getInteracting()) || lllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIIIIl[0];
        }
        if (llllllll(Movement.isRunEnabled() ? 1 : 0) && lIIIIIIII(Movement.getRunEnergy(), lIIIIIl[1])) {
            Movement.toggleRun();
        }
        NPC y = this.aA.k().y();
        if (llllllIl(y)) {
            return lIIIIIl[0];
        }
        if (lllllllI(this.aA.l() ? 1 : 0)) {
            this.aA.a((boolean) lIIIIIl[0]);
        }
        if (llllllll(Reachable.isInteractable(y) ? 1 : 0)) {
            return this.aA.c();
        }
        String[] strArr = new String[lIIIIIl[2]];
        strArr[lIIIIIl[0]] = lIIIIII[lIIIIIl[0]];
        if (!llllllll(y.hasAction(strArr) ? 1 : 0)) {
            y.interact(lIIIIII[lIIIIIl[4]]);
            sleep(lIIIIIl[4]);
            return lIIIIIl[2];
        }
        Player local = Players.getLocal();
        if (llllllll(this.aA.l() ? 1 : 0) && lIIIIIIIl(local.getWorldLocation().distanceTo(y), lIIIIIl[3])) {
            Movement.setDestination(y.getWorldLocation());
            return lIIIIIl[2];
        }
        Log.info(lIIIIII[lIIIIIl[2]]);
        return lIIIIIl[0];
    }
}
