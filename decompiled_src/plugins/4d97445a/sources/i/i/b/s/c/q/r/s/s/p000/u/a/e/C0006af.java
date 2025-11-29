package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.af  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/af.class */
public class C0006af extends Task {
    private static /* synthetic */ String[] llllIIIl;
    private static /* synthetic */ int[] llllIIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llllIIlI[0]];
        iArr[llllIIlI[1]] = llllIIlI[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!llIlIIIlll(new WorldArea(llllIIlI[3], llllIIlI[4], llllIIlI[5], llllIIlI[6], llllIIlI[1]).contains(Players.getLocal()) ? 1 : 0) && !llIlIIlIII(nearest)) {
            if (!llIlIIlIIl(nearest) || llIlIIlIlI(nearest.isDead() ? 1 : 0)) {
                return llllIIlI[1];
            }
            if (llIlIIlIll(Players.getLocal().getInteracting(), nearest)) {
                nearest.interact(llllIIIl[llllIIlI[1]]);
            }
            return llllIIlI[0];
        }
        return llllIIlI[1];
    }

    private static boolean llIlIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIlll(int i2) {
        return i2 == 0;
    }

    private static void llIlIIIllI() {
        llllIIlI = new int[9];
        llllIIlI[0] = " ".length();
        llllIIlI[1] = (92 ^ 84) & ((168 ^ 160) ^ (-1));
        llllIIlI[2] = (-23717) & 32429;
        llllIIlI[3] = (-24602) & 26431;
        llllIIlI[4] = (-4117) & 14005;
        llllIIlI[5] = 86 ^ 78;
        llllIIlI[6] = (162 ^ 151) ^ (100 ^ 70);
        llllIIlI[7] = 110 ^ 102;
        llllIIlI[8] = "  ".length();
    }

    private static void llIlIIIlIl() {
        llllIIIl = new String[llllIIlI[0]];
        llllIIIl[llllIIlI[1]] = llIlIIIlII("ybk2+Tmw2jk=", "WKIYI");
    }

    private static String llIlIIIlII(String llIlIIlIlIIlIll, String llIlIIlIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), llllIIlI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIlIIllII) {
            llIlIIlIlIIllII.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIIllI();
        llIlIIIlIl();
    }

    private static boolean llIlIIlIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIlIlI(int i2) {
        return i2 != 0;
    }

    private static boolean llIlIIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
