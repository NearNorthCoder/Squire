package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Traversing to Cerberus", priority = 155)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.A  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/A.class */
public class A extends Task {
    private final /* synthetic */ SquireCerberus aQ;
    private final /* synthetic */ C0000a aS;
    private static /* synthetic */ String[] lIlIIllIl;
    private final /* synthetic */ SquireCerberusConfig aR;
    private static /* synthetic */ int[] lIlIIlllI;

    @Inject
    public A(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.aQ = squireCerberus;
        this.aR = squireCerberusConfig;
        this.aS = c0000a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlIlll(this.aQ.r() ? 1 : 0) && !lIIlIIlIlll(this.aS.l() ? 1 : 0) && !lIIlIIllIII(Movement.shouldWalk() ? 1 : 0)) {
            String[] strArr = new String[lIlIIlllI[1]];
            strArr[lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[0]];
            NPC nearest = NPCs.getNearest(strArr);
            if (lIIlIIllIIl(this.aS.k()) && lIIlIIllIlI(nearest)) {
                this.aS.a(nearest);
            }
            if (lIIlIIllIlI(nearest)) {
                return lIlIIlllI[0];
            }
            if (lIIlIIllIlI(this.aS.b())) {
                Log.info(lIlIIllIl[lIlIIlllI[1]]);
                return this.aS.c();
            }
            String[] strArr2 = new String[lIlIIlllI[1]];
            strArr2[lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[2]];
            if (lIIlIIllIlI(TileObjects.getNearest(strArr2))) {
                Log.info(lIlIIllIl[lIlIIlllI[3]]);
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                Movement.setDestination(new WorldPoint(worldLocation.getX(), worldLocation.getY() + lIlIIlllI[4], worldLocation.getPlane()));
                return lIlIIlllI[1];
            }
            String[] strArr3 = new String[lIlIIlllI[1]];
            strArr3[lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[5]];
            TileObject nearest2 = TileObjects.getNearest(strArr3);
            if (lIIlIIllIIl(nearest2)) {
                return Movement.walkTo(new WorldPoint(lIlIIlllI[6], lIlIIlllI[7], lIlIIlllI[0]));
            }
            Log.info(lIlIIllIl[lIlIIlllI[8]]);
            nearest2.interact(lIlIIllIl[lIlIIlllI[9]]);
            sleep(lIlIIlllI[9]);
            return lIlIIlllI[1];
        }
        return lIlIIlllI[0];
    }

    private static String lIIlIIlIIlI(String llIIIIIlIIIlIII, String llIIIIIlIIIIIlI) {
        String str = new String(Base64.getDecoder().decode(llIIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIIIIlIIIIlIl = llIIIIIlIIIIIlI.toCharArray();
        int llIIIIIlIIIIlII = lIlIIlllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIIlllI[0];
        while (lIIlIIllIll(i2, length)) {
            char llIIIIIlIIIlIIl = charArray[i2];
            sb.append((char) (llIIIIIlIIIlIIl ^ llIIIIIlIIIIlIl[llIIIIIlIIIIlII % llIIIIIlIIIIlIl.length]));
            "".length();
            llIIIIIlIIIIlII++;
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlIlll(int i2) {
        return i2 != 0;
    }

    private static void lIIlIIlIlIl() {
        lIlIIllIl = new String[lIlIIlllI[10]];
        lIlIIllIl[lIlIIlllI[0]] = lIIlIIlIIlI("FAIWFRAlEhc=", "Wgdwu");
        lIlIIllIl[lIlIIlllI[1]] = lIIlIIlIIlI("MQQROSAPAkIsJQAIBzk=", "aebJI");
        lIlIIllIl[lIlIIlllI[2]] = lIIlIIlIIll("45lYWzelToecbkG/Y8uHdQ==", "QkKZu");
        lIlIIllIl[lIlIIlllI[3]] = lIIlIIlIlII("j1PAiFiaq4AZP1s7b3/s6yOL6XDOB2K8Q/l6AJok9D5L3+r0/OVIeESrDRdG3TJ14T/R+Rds9Uk=", "IiFJv");
        lIlIIllIl[lIlIIlllI[5]] = lIIlIIlIlII("dZBPkBKZhoE7O7OjaRbkKQ==", "HzzAk");
        lIlIIllIl[lIlIIlllI[8]] = lIIlIIlIIlI("LAM0PzgWEWYmOBYVLg==", "xvFQQ");
        lIlIIllIl[lIlIIlllI[9]] = lIIlIIlIIlI("DjsZLA==", "ZNkBj");
    }

    private static boolean lIIlIIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIlIIlIlII(String llIIIIIIlllIIll, String llIIIIIIlllIIlI) {
        try {
            SecretKeySpec llIIIIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlllI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlllI[2], llIIIIIIlllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIlllIlII) {
            llIIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIIll(String llIIIIIlIIllIII, String llIIIIIlIIlIlll) {
        try {
            SecretKeySpec llIIIIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlllI[2], llIIIIIlIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlIIllIIl) {
            llIIIIIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlIllI() {
        lIlIIlllI = new int[12];
        lIlIIlllI[0] = (18 ^ 79) & ((194 ^ 159) ^ (-1));
        lIlIIlllI[1] = " ".length();
        lIlIIlllI[2] = "  ".length();
        lIlIIlllI[3] = "   ".length();
        lIlIIlllI[4] = (((92 + 2) - 73) + 110) ^ (((32 + 127) - 55) + 36);
        lIlIIlllI[5] = (140 ^ 177) ^ (3 ^ 58);
        lIlIIlllI[6] = (-((-397) & 31677)) & (-3) & 32575;
        lIlIIlllI[7] = (-10770) & 12021;
        lIlIIlllI[8] = (((80 + 138) - 153) + 93) ^ (((147 + 86) - 199) + 121);
        lIlIIlllI[9] = 32 ^ 38;
        lIlIIlllI[10] = 140 ^ 139;
        lIlIIlllI[11] = (101 ^ 94) ^ (101 ^ 86);
    }

    static {
        lIIlIIlIllI();
        lIIlIIlIlIl();
    }

    private static boolean lIIlIIllIII(int i2) {
        return i2 == 0;
    }

    private static boolean lIIlIIllIlI(Object obj) {
        return obj != null;
    }
}
