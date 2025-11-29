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
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/t.class */
public class C0071t extends Task {
    private static /* synthetic */ String[] llllIlIl;
    private final /* synthetic */ SquireCerberusConfig aE;
    private final /* synthetic */ C0000a aD;
    private static /* synthetic */ int[] llllIllI;

    private static String llIlIlIlIl(String llIlIIIlIlIlIII, String llIlIIIlIlIIlll) {
        String str = new String(Base64.getDecoder().decode(llIlIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIlIlIIllI = new StringBuilder();
        char[] charArray = llIlIIIlIlIIlll.toCharArray();
        int llIlIIIlIlIIlII = llllIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llllIllI[1];
        while (llIlIllllI(i2, length)) {
            char llIlIIIlIlIlIIl = charArray2[i2];
            llIlIIIlIlIIllI.append((char) (llIlIIIlIlIlIIl ^ charArray[llIlIIIlIlIIlII % charArray.length]));
            "".length();
            llIlIIIlIlIIlII++;
            i2++;
            "".length();
            if ("   ".length() < (((28 ^ 19) ^ (243 ^ 185)) & (((((96 + 69) - 11) + 71) ^ (((96 + 27) - 46) + 87)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llIlIIIlIlIIllI);
    }

    private static boolean llIlIllIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIlIllIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static String llIlIlIlII(String llIlIIIllIIIlIl, String llIlIIIllIIIlII) {
        try {
            SecretKeySpec llIlIIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIllIIIlll = Cipher.getInstance("Blowfish");
            llIlIIIllIIIlll.init(llllIllI[3], llIlIIIllIIlIII);
            return new String(llIlIIIllIIIlll.doFinal(Base64.getDecoder().decode(llIlIIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIllIIIllI) {
            llIlIIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIII(Object obj) {
        return obj != null;
    }

    private static void llIlIlIllI() {
        llllIlIl = new String[llllIllI[7]];
        llllIlIl[llllIllI[1]] = llIlIlIIll("ERPzg8f3b7s63D9qNxI3h+q3Z4Ebt97Hyk6RwkMY0Aj3fZIynzAgjA8a/dMuW0lgrKIyoDszTis=", "HBFOG");
        llllIlIl[llllIllI[2]] = llIlIlIlII("GI1h/ZI1Ljg=", "IOhLh");
        llllIlIl[llllIllI[3]] = llIlIlIlII("qpoEPVUXq7Y=", "sbRWY");
        llllIlIl[llllIllI[4]] = llIlIlIlIl("HwQtKA==", "hmALE");
        llllIlIl[llllIllI[5]] = llIlIlIIll("L1m64Bg+qBI=", "jhwgW");
        llllIlIl[llllIllI[6]] = llIlIlIlII("wXuQse3w5hU=", "lEPby");
    }

    private static void llIlIlIlll() {
        llllIllI = new int[9];
        llllIllI[0] = 5 ^ 28;
        llllIllI[1] = (132 ^ 195) & ((34 ^ 101) ^ (-1));
        llllIllI[2] = " ".length();
        llllIllI[3] = "  ".length();
        llllIllI[4] = "   ".length();
        llllIllI[5] = (30 ^ 43) ^ (52 ^ 5);
        llllIllI[6] = (((95 + 52) - 49) + 51) ^ (((45 + 133) - 120) + 86);
        llllIllI[7] = (((67 + 7) - 6) + 98) ^ (((127 + 56) - 157) + 134);
        llllIllI[8] = 95 ^ 87;
    }

    private static String llIlIlIIll(String llIlIIIlIlllIII, String llIlIIIlIllIlll) {
        try {
            SecretKeySpec llIlIIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), llllIllI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllI[3], llIlIIIlIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIlIlllIIl) {
            llIlIIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private C0071t(C0000a c0000a, SquireCerberusConfig squireCerberusConfig) {
        this.aD = c0000a;
        this.aE = squireCerberusConfig;
    }

    private static boolean llIlIllllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIlIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlllII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            if (llIlIlllII(item.getName().toLowerCase().contains(llllIlIl[llllIllI[4]]) ? 1 : 0) && llIlIlllII(item.getName().toLowerCase().contains(llllIlIl[llllIllI[5]]) ? 1 : 0)) {
                String str = llllIlIl[llllIllI[6]];
                if (llIlIlllIl(item.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = llllIllI[2];
                    "".length();
                    return ((((9 + 154) - 44) + 47) ^ (((79 + 29) - (-38)) + 16)) <= 0 ? ((((41 + 127) - 154) + 180) ^ (((68 + 83) - 141) + 128)) & (((206 ^ 148) ^ (67 ^ 81)) ^ (-" ".length())) : r0;
                }
            }
            return llllIllI[1];
        });
        if (llIlIllIII(this.aD.k()) && !llIlIllIIl(this.aD.k().y())) {
            if (!llIlIllIll(Combat.getCurrentHealth(), this.aE.eatAtHealth()) && !llIlIllIIl(first)) {
                first.interact(llllIlIl[llllIllI[3]]);
                sleep(llllIllI[3]);
                return llllIllI[2];
            }
            return llllIllI[1];
        } else if (llIlIllIlI(Combat.getMissingHealth(), llllIllI[0]) && llIlIllIII(first)) {
            Log.info(llllIlIl[llllIllI[1]]);
            first.interact(llllIlIl[llllIllI[2]]);
            sleep(llllIllI[3]);
            return llllIllI[2];
        } else {
            return llllIllI[1];
        }
    }

    private static boolean llIlIlllIl(int i2) {
        return i2 != 0;
    }

    static {
        llIlIlIlll();
        llIlIlIllI();
    }
}
