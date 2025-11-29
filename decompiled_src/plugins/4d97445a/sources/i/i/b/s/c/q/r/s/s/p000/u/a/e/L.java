package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Repairing cannon", priority = 5, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.L  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/L.class */
public class L extends Task {
    private static /* synthetic */ String[] lIIIIllIl;
    private final /* synthetic */ CannonReloader bS;
    private static /* synthetic */ int[] lIIIIlllI;

    @Inject
    public L(CannonReloader cannonReloader) {
        this.bS = cannonReloader;
    }

    private static boolean lllIlIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIllIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lllIlIlIII(String llIIllIIlllIIIl, String llIIllIIlllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIIlllIIII.getBytes(StandardCharsets.UTF_8)), lIIIIlllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIllIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIIlllIIlI) {
            llIIllIIlllIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIIIIlllI[0]];
        strArr[lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lllIlIllIl(nearest)) {
            return lIIIIlllI[1];
        }
        String[] strArr2 = new String[lIIIIlllI[0]];
        strArr2[lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[0]];
        if (lllIlIlllI(nearest.hasAction(strArr2) ? 1 : 0)) {
            return lIIIIlllI[1];
        }
        if (lllIlIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIIIIlllI[0];
        }
        nearest.interact(lIIIIllIl[lIIIIlllI[2]]);
        return lIIIIlllI[0];
    }

    private static boolean lllIlIllll(int i2) {
        return i2 != 0;
    }

    private static String lllIlIlIlI(String llIIllIlIIlIllI, String llIIllIlIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIlIIllIII = Cipher.getInstance("Blowfish");
            llIIllIlIIllIII.init(lIIIIlllI[2], secretKeySpec);
            return new String(llIIllIlIIllIII.doFinal(Base64.getDecoder().decode(llIIllIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIlIIlIIlI) {
            llIIllIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIllII();
        lllIlIlIll();
    }

    private static String lllIlIlIIl(String llIIllIlIIIIllI, String llIIllIlIIIIlIl) {
        String llIIllIlIIIIllI2 = new String(Base64.getDecoder().decode(llIIllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIllIlIIIIIll = llIIllIlIIIIlIl.toCharArray();
        int llIIllIlIIIIIlI = lIIIIlllI[1];
        char[] charArray = llIIllIlIIIIllI2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIIlllI[1];
        while (lllIllIIII(i2, length)) {
            sb.append((char) (charArray[i2] ^ llIIllIlIIIIIll[llIIllIlIIIIIlI % llIIllIlIIIIIll.length]));
            "".length();
            llIIllIlIIIIIlI++;
            i2++;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlIlllI(int i2) {
        return i2 == 0;
    }

    private static void lllIlIllII() {
        lIIIIlllI = new int[5];
        lIIIIlllI[0] = " ".length();
        lIIIIlllI[1] = ((((42 + 24) - 57) + 158) ^ (((139 + 58) - 172) + 172)) & (((225 ^ 146) ^ (208 ^ 193)) ^ (-" ".length()));
        lIIIIlllI[2] = "  ".length();
        lIIIIlllI[3] = "   ".length();
        lIIIIlllI[4] = (((124 + 19) - 8) + 22) ^ (((107 + 88) - 93) + 47);
    }

    private static void lllIlIlIll() {
        lIIIIllIl = new String[lIIIIlllI[3]];
        lIIIIllIl[lIIIIlllI[1]] = lllIlIlIII("sw2vpbz2s25E6mMsXzrtEAXt6bl+HY/W", "YmKnH");
        lIIIIllIl[lIIIIlllI[0]] = lllIlIlIIl("KhM8ABAK", "xvLay");
        lIIIIllIl[lIIIIlllI[2]] = lllIlIlIlI("NnxI6t0cmlo=", "LAIlg");
    }
}
