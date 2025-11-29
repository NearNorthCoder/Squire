package g.r.r.p000.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Force Leaving Altar")
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.g  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/g.class */
public class g extends Task {
    private static /* synthetic */ int[] llIIllIllIII;
    private static /* synthetic */ String[] llIIllIlIlll;
    private final /* synthetic */ SquireGOTRPlugin aQ;

    @Inject
    public g(SquireGOTRPlugin squireGOTRPlugin) {
        this.aQ = squireGOTRPlugin;
    }

    private static boolean llllllIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static String llllllIlIlIIll(String lllllllllllllllIlIIllIIllllIlllI, String lllllllllllllllIlIIllIIllllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIllIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIllllIllll) {
            lllllllllllllllIlIIllIIllllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIllIIl(Object obj) {
        return obj != null;
    }

    static {
        llllllIlIlIlIl();
        llllllIlIlIlII();
    }

    private static boolean llllllIlIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean llllllIlIlIllI(int i) {
        return i != 0;
    }

    private static void llllllIlIlIlIl() {
        llIIllIllIII = new int[5];
        llIIllIllIII[0] = ((((253 + 208) - 265) + 59) ^ (((155 + 146) - 210) + 77)) & (((((46 + 120) - 116) + 168) ^ (((120 + 20) - 93) + 94)) ^ (-" ".length())) & ((((66 ^ 88) ^ " ".length()) & (((((142 + 86) - 118) + 72) ^ (((56 + 172) - 175) + 120)) ^ (-" ".length()))) ^ (-" ".length()));
        llIIllIllIII[1] = " ".length();
        llIIllIllIII[2] = (-5889) & 32767;
        llIIllIllIII[3] = "  ".length();
        llIIllIllIII[4] = "   ".length();
    }

    private static boolean llllllIlIllIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (llllllIlIlIllI(this.aQ.g() ? 1 : 0)) {
            return llIIllIllIII[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llllllIlIlIllI(tileObject.getName().contains(llIIllIlIlll[llIIllIllIII[1]]) ? 1 : 0) && llllllIlIlIllI(tileObject.hasAction(str -> {
                if (llllllIlIllIIl(str) && llllllIlIlIllI(str.equals(llIIllIlIlll[llIIllIllIII[3]]) ? 1 : 0)) {
                    ?? r0 = llIIllIllIII[1];
                    "".length();
                    return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIllIII[0];
            }) ? 1 : 0)) {
                ?? r0 = llIIllIllIII[1];
                "".length();
                return 0 != 0 ? ((((68 + 11) - 25) + 78) ^ (((168 + 101) - 220) + 126)) & (((42 ^ 58) ^ (167 ^ 156)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIII[0];
        });
        if (llllllIlIlIlll(nearest)) {
            return llIIllIllIII[0];
        }
        int[] iArr = new int[llIIllIllIII[1]];
        iArr[llIIllIllIII[0]] = llIIllIllIII[2];
        if (llllllIlIllIII(Inventory.getCount(iArr))) {
            return llIIllIllIII[0];
        }
        nearest.interact(llIIllIlIlll[llIIllIllIII[0]]);
        return llIIllIllIII[1];
    }

    private static String llllllIlIlIIlI(String lllllllllllllllIlIIllIIlllIllllI, String lllllllllllllllIlIIllIIlllIlllIl) {
        String lllllllllllllllIlIIllIIlllIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIllIIlllIllIll = lllllllllllllllIlIIllIIlllIlllIl.toCharArray();
        int lllllllllllllllIlIIllIIlllIllIlI = llIIllIllIII[0];
        char[] charArray = lllllllllllllllIlIIllIIlllIllllI2.toCharArray();
        int length = charArray.length;
        int i = llIIllIllIII[0];
        while (llllllIlIllIlI(i, length)) {
            char lllllllllllllllIlIIllIIlllIlllll = charArray[i];
            sb.append((char) (lllllllllllllllIlIIllIIlllIlllll ^ lllllllllllllllIlIIllIIlllIllIll[lllllllllllllllIlIIllIIlllIllIlI % lllllllllllllllIlIIllIIlllIllIll.length]));
            "".length();
            lllllllllllllllIlIIllIIlllIllIlI++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llllllIlIlIlII() {
        llIIllIlIlll = new String[llIIllIllIII[4]];
        llIIllIlIlll[llIIllIllIII[0]] = llllllIlIlIIlI("LgE+DDw=", "koJiN");
        llIIllIlIlll[llIIllIllIII[1]] = llllllIlIlIIlI("IhkHFjIe", "rvubS");
        llIIllIlIlll[llIIllIllIII[3]] = llllllIlIlIIll("s3oRhtgkxNU=", "TaEbb");
    }
}
