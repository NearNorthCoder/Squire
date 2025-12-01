package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Pathing to Boss", priority = 2147483447, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.k  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/k.class */
public class k extends i {
    private static /* synthetic */ String[] lIIlIllIIllII;
    private final /* synthetic */ SquireScurrius R;
    private static /* synthetic */ int[] lIIlIllIIlllI;
    private final /* synthetic */ b S;
    private static /* synthetic */ WorldPoint Q;
    private final /* synthetic */ SquireScurriusConfig T;
    private final /* synthetic */ int U = lIIlIllIIlllI[0];
    private /* synthetic */ WorldArea V = new WorldArea(new WorldPoint(lIIlIllIIlllI[1], lIIlIllIIlllI[2], lIIlIllIIlllI[3]), new WorldPoint(lIIlIllIIlllI[4], lIIlIllIIlllI[5], lIIlIllIIlllI[3]));

    static {
        lIlIllIlIIIIIII();
        lIlIllIIlllllII();
        Q = new WorldPoint(lIIlIllIIlllI[9], lIIlIllIIlllI[10], lIIlIllIIlllI[3]);
    }

    private static boolean lIlIllIlIIIIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIlIIIIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    public boolean a() {
        if (lIlIllIlIIIIIIl(c() ? 1 : 0)) {
            return lIIlIllIIlllI[3];
        }
        if (lIlIllIlIIIIIIl(this.R.k() ? 1 : 0)) {
            this.R.forceStop();
            return lIIlIllIIlllI[6];
        }
        Player local = Players.getLocal();
        if (lIlIllIlIIIIIlI(local)) {
            return lIIlIllIIlllI[3];
        }
        if (!lIlIllIlIIIIIIl(this.V.contains(local) ? 1 : 0)) {
            Movement.walkTo(Q);
            "".length();
            return lIIlIllIIlllI[6];
        } else if (!lIlIllIlIIIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            a(lIIlIllIIllII[lIIlIllIIlllI[6]], lIIlIllIIllII[lIIlIllIIlllI[7]], lIIlIllIIlllI[8], local);
            return lIIlIllIIlllI[6];
        } else {
            String[] strArr = new String[lIIlIllIIlllI[6]];
            strArr[lIIlIllIIlllI[3]] = lIIlIllIIllII[lIIlIllIIlllI[3]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIIlIllIIlllI[6];
        }
    }

    private static String lIlIllIIllllIll(String llllllllllllllIllllIlIlIlllIlIlI, String llllllllllllllIllllIlIlIlllIlIIl) {
        String llllllllllllllIllllIlIlIlllIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIlIlllIlIII = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIlIlllIlIIl.toCharArray();
        int llllllllllllllIllllIlIlIlllIIllI = lIIlIllIIlllI[3];
        char[] charArray2 = llllllllllllllIllllIlIlIlllIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIIlllI[3];
        while (lIlIllIlIIIIlII(i, length)) {
            char llllllllllllllIllllIlIlIlllIlIll = charArray2[i];
            llllllllllllllIllllIlIlIlllIlIII.append((char) (llllllllllllllIllllIlIlIlllIlIll ^ charArray[llllllllllllllIllllIlIlIlllIIllI % charArray.length]));
            "".length();
            llllllllllllllIllllIlIlIlllIIllI++;
            i++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIlIlllIlIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    public boolean run() {
        return lIlIllIlIIIIIIl(this.R.m() ? 1 : 0) ? lIIlIllIIlllI[3] : a();
    }

    @Inject
    public k(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.R = squireScurrius;
        this.S = squireScurrius.n();
        this.T = squireScurriusConfig;
    }

    private static String lIlIllIIllllIlI(String llllllllllllllIllllIlIlIlllllIlI, String llllllllllllllIllllIlIlIlllllIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIlllllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlllI[12]), "DES");
            Cipher llllllllllllllIllllIlIlIllllllII = Cipher.getInstance("DES");
            llllllllllllllIllllIlIlIllllllII.init(lIIlIllIIlllI[7], llllllllllllllIllllIlIlIllllllIl);
            return new String(llllllllllllllIllllIlIlIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlIlllllIll) {
            llllllllllllllIllllIlIlIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIIIIl(int i) {
        return i != 0;
    }

    private static void lIlIllIlIIIIIII() {
        lIIlIllIIlllI = new int[13];
        lIIlIllIIlllI[0] = (-((-3333) & 19783)) & (-10377) & 31487;
        lIIlIllIIlllI[1] = (-((-11339) & 28287)) & (-259) & 20479;
        lIIlIllIIlllI[2] = (-4197) & 14063;
        lIIlIllIIlllI[3] = ((145 ^ 149) ^ (77 ^ 29)) & (((147 ^ 143) ^ (119 ^ 63)) ^ (-" ".length()));
        lIIlIllIIlllI[4] = (-24578) & 27859;
        lIIlIllIIlllI[5] = (-((-4625) & 21371)) & (-2) & 26623;
        lIIlIllIIlllI[6] = " ".length();
        lIIlIllIIlllI[7] = "  ".length();
        lIIlIllIIlllI[8] = (-18437) & 32639;
        lIIlIllIIlllI[9] = (-13092) & 16367;
        lIIlIllIIlllI[10] = (-((-8194) & 24867)) & (-6161) & 32703;
        lIIlIllIIlllI[11] = "   ".length();
        lIIlIllIIlllI[12] = 99 ^ 107;
    }

    private static void lIlIllIIlllllII() {
        lIIlIllIIllII = new String[lIIlIllIIlllI[11]];
        lIIlIllIIllII[lIIlIllIIlllI[3]] = lIlIllIIllllIIl("zKui5Oj6ks8=", "ipMjl");
        lIIlIllIIllII[lIIlIllIIlllI[6]] = lIlIllIIllllIlI("hwm0koL6FyI3b31EscXvNA==", "tQIqt");
        lIIlIllIIllII[lIIlIllIIlllI[7]] = lIlIllIIllllIll("GgsoAyt0EykcJiwAKU5hKRUoGCgtAmg=", "YgAnI");
    }

    private static String lIlIllIIllllIIl(String llllllllllllllIllllIlIlIllIlIlIl, String llllllllllllllIllllIlIlIllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIIlllI[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlIllIlIllI) {
            llllllllllllllIllllIlIlIllIlIllI.printStackTrace();
            return null;
        }
    }

    private void a(String str, String str2, int i, Player player) {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIlIllIlIIIIIll(tileObject.getId(), i) && lIlIllIlIIIIIIl(tileObject.getName().equals(str) ? 1 : 0)) {
                String[] strArr = new String[lIIlIllIIlllI[6]];
                strArr[lIIlIllIIlllI[3]] = str2;
                if (lIlIllIlIIIIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIlIllIIlllI[6];
                    "".length();
                    return (-"   ".length()) > 0 ? ((96 ^ 36) ^ (195 ^ 128)) & (((89 ^ 96) ^ (74 ^ 116)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlIllIIlllI[3];
        });
        if (lIlIllIlIIIIIlI(nearest) || lIlIllIlIIIIIIl(player.isMoving() ? 1 : 0)) {
            return;
        }
        nearest.interact(str2);
    }

    private static boolean lIlIllIlIIIIIlI(Object obj) {
        return obj == null;
    }
}
