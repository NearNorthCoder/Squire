package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Buying Bones")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aK  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aK.class */
public class aK extends Task {
    private static /* synthetic */ String[] lllIIlll;
    private static /* synthetic */ int[] lllIlIll;
    private final /* synthetic */ LooterConfig ez;

    private static void llIIllIlII() {
        lllIIlll = new String[lllIlIll[6]];
        lllIIlll[lllIlIll[0]] = llIIllIIIl("eS2GfpJogk8=", "COALP");
        lllIIlll[lllIlIll[1]] = llIIllIIIl("rfcMPM2Mh+A=", "GzomI");
        lllIIlll[lllIlIll[2]] = llIIllIIlI("JgUdKxY=", "GvuNe");
        lllIIlll[lllIlIll[3]] = llIIllIIIl("pxN9B8ZDa7U=", "SLlkv");
        lllIIlll[lllIlIll[4]] = llIIllIIIl("3cieJrFg210=", "gMVKg");
        lllIIlll[lllIlIll[5]] = llIIllIIIl("pSvekD8/zOo=", "lBouS");
    }

    private static String llIIllIIIl(String llIlIIlIIlIlllI, String llIlIIlIIlIllIl) {
        try {
            SecretKeySpec llIlIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIlIll[7]), "DES");
            Cipher llIlIIlIIllIIII = Cipher.getInstance("DES");
            llIlIIlIIllIIII.init(lllIlIll[2], llIlIIlIIllIIIl);
            return new String(llIlIIlIIllIIII.doFinal(Base64.getDecoder().decode(llIlIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIIlIllll) {
            llIlIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIlll(int i2) {
        return i2 != 0;
    }

    private static String llIIllIIlI(String llIlIIlIIIllllI, String llIlIIlIIIlllIl) {
        String llIlIIlIIIllllI2 = new String(Base64.getDecoder().decode(llIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIlIIIlllII = new StringBuilder();
        char[] charArray = llIlIIlIIIlllIl.toCharArray();
        int llIlIIlIIIllIlI = lllIlIll[0];
        char[] charArray2 = llIlIIlIIIllllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lllIlIll[0];
        while (llIlIlIIII(i2, length)) {
            char llIlIIlIIIlllll = charArray2[i2];
            llIlIIlIIIlllII.append((char) (llIlIIlIIIlllll ^ charArray[llIlIIlIIIllIlI % charArray.length]));
            "".length();
            llIlIIlIIIllIlI++;
            i2++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llIlIIlIIIlllII);
    }

    static {
        llIIllIlIl();
        llIIllIlII();
    }

    private static boolean llIlIlIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIIllIlIl() {
        lllIlIll = new int[8];
        lllIlIll[0] = ((228 ^ 128) ^ (185 ^ 137)) & (((((161 + 6) - 62) + 92) ^ (((87 + 61) - 98) + 95)) ^ (-" ".length()));
        lllIlIll[1] = " ".length();
        lllIlIll[2] = "  ".length();
        lllIlIll[3] = "   ".length();
        lllIlIll[4] = (((63 + 28) - (-45)) + 3) ^ (((40 + 128) - 58) + 33);
        lllIlIll[5] = (61 ^ 88) ^ (116 ^ 20);
        lllIlIll[6] = (((58 + 13) - 28) + 98) ^ (((113 + 83) - 126) + 69);
        lllIlIll[7] = (((127 + 24) - 101) + 90) ^ (((115 + 101) - 141) + 57);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        if (llIIllIllI(this.ez.buryBones() ? 1 : 0)) {
            return lllIlIll[0];
        }
        if (llIIllIlll(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIlll[lllIlIll[5]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item2 -> {
                return item2.getName().toLowerCase().contains(lllIIlll[lllIlIll[4]]);
            }).interact(lllIIlll[lllIlIll[0]]);
        }
        if (llIIllIlll(Inventory.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lllIIlll[lllIlIll[3]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item4 -> {
                return item4.getName().contains(lllIIlll[lllIlIll[2]]);
            }).interact(lllIIlll[lllIlIll[1]]);
        }
        return lllIlIll[1];
    }

    private static boolean llIIllIllI(int i2) {
        return i2 == 0;
    }

    @Inject
    public aK(LooterConfig looterConfig) {
        this.ez = looterConfig;
    }
}
