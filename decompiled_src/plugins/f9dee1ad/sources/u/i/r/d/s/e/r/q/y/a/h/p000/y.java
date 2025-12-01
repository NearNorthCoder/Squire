package u.i.r.d.s.e.r.q.y.a.h.p000;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching items", priority = 15, blocking = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.y  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/y.class */
public class y extends Task {
    private final /* synthetic */ C0000a aV;
    public static final /* synthetic */ ImmutableSet<String> aU;
    private static /* synthetic */ String[] llllIlIIIlll;
    private static /* synthetic */ int[] llllIlIIlIII;

    private static void lIIlIIIIlIIlIIl() {
        llllIlIIlIII = new int[9];
        llllIlIIlIII[0] = ((31 ^ 115) ^ (17 ^ 69)) & (((91 ^ 61) ^ (102 ^ 56)) ^ (-" ".length()));
        llllIlIIlIII[1] = (((30 + 110) - 104) + 102) ^ (((128 + 80) - 207) + 142);
        llllIlIIlIII[2] = " ".length();
        llllIlIIlIII[3] = "  ".length();
        llllIlIIlIII[4] = "   ".length();
        llllIlIIlIII[5] = 136 ^ 140;
        llllIlIIlIII[6] = 38 ^ 32;
        llllIlIIlIII[7] = (((170 + 30) - 105) + 104) ^ (((86 + 21) - (-50)) + 35);
        llllIlIIlIII[8] = 157 ^ 149;
    }

    private static boolean lIIlIIIIlIIlIll(int i) {
        return i == 0;
    }

    private static void lIIlIIIIlIIlIII() {
        llllIlIIIlll = new String[llllIlIIlIII[8]];
        llllIlIIIlll[llllIlIIlIII[0]] = lIIlIIIIlIIIlIl("PiopCQ==", "qZLgh");
        llllIlIIIlll[llllIlIIlIII[2]] = lIIlIIIIlIIIllI("D+nLZx1XPdE=", "JPytq");
        llllIlIIIlll[llllIlIIlIII[3]] = lIIlIIIIlIIIlIl("Ek0mIRYT", "vjNHr");
        llllIlIIIlll[llllIlIIlIII[4]] = lIIlIIIIlIIIlll("H/m2fvfCNRThxWGuEelyNQ==", "ObbQz");
        llllIlIIIlll[llllIlIIlIII[5]] = lIIlIIIIlIIIllI("Awk7ag2Qg0vKNRL82yCRAg==", "FmoLI");
        llllIlIIIlll[llllIlIIlIII[1]] = lIIlIIIIlIIIlIl("BRMFFVQ=", "Wfkpt");
        llllIlIIIlll[llllIlIIlIII[6]] = lIIlIIIIlIIIllI("QjoZcUTApcGAa/0icxuEvQ==", "FmPXa");
        llllIlIIIlll[llllIlIIlIII[7]] = lIIlIIIIlIIIlIl("HysLDAYx", "RRxxo");
    }

    static {
        lIIlIIIIlIIlIIl();
        lIIlIIIIlIIlIII();
        String str = llllIlIIIlll[llllIlIIlIII[2]];
        String str2 = llllIlIIIlll[llllIlIIlIII[3]];
        String str3 = llllIlIIIlll[llllIlIIlIII[4]];
        String str4 = llllIlIIIlll[llllIlIIlIII[5]];
        String str5 = llllIlIIIlll[llllIlIIlIII[1]];
        String str6 = llllIlIIIlll[llllIlIIlIII[6]];
        String[] strArr = new String[llllIlIIlIII[2]];
        strArr[llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[7]];
        aU = ImmutableSet.of(str, str2, str3, str4, str5, str6, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (lIIlIIIIlIIlIlI(SpellBook.getCurrent(), SpellBook.STANDARD)) {
            return llllIlIIlIII[0];
        }
        SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (lIIlIIIIlIIlIll(standard.canCast() ? 1 : 0)) {
            return llllIlIIlIII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llllIlIIlIII[2]];
            strArr[llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[0]];
            if (lIIlIIIIlIIlIll(item.hasAction(strArr) ? 1 : 0)) {
                Stream stream = aU.stream();
                String name = item.getName();
                Objects.requireNonNull(name);
                "".length();
                if (lIIlIIIIlIIllIl(stream.anyMatch((v1) -> {
                    return r1.contains(v1);
                }) ? 1 : 0)) {
                    ?? r0 = llllIlIIlIII[2];
                    "".length();
                    return (((166 ^ 155) ^ (86 ^ 54)) & (((((75 + 201) - 261) + 228) ^ (((83 + 32) - 64) + 123)) ^ (-" ".length()))) != (((((23 + 16) - (-107)) + 10) ^ (((110 + 69) - 102) + 54)) & (((181 ^ 130) ^ (15 ^ 39)) ^ (-" ".length()))) ? ((((111 + 19) - 10) + 7) ^ (164 ^ 145)) & (((104 ^ 122) ^ (89 ^ 1)) ^ (-" ".length())) : r0;
                }
            }
            return llllIlIIlIII[0];
        });
        if (lIIlIIIIlIIllII(first)) {
            return llllIlIIlIII[0];
        }
        Magic.cast(standard, first);
        sleep(llllIlIIlIII[1]);
        return llllIlIIlIII[2];
    }

    private static String lIIlIIIIlIIIlll(String lllllllllllllllIIlIlIIlIllIIllll, String lllllllllllllllIIlIlIIlIllIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIllIIlllI.getBytes(StandardCharsets.UTF_8)), llllIlIIlIII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIllIlIIII) {
            lllllllllllllllIIlIlIIlIllIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlIIIlIl(String lllllllllllllllIIlIlIIlIlIllllll, String lllllllllllllllIIlIlIIlIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIlIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIIlIlIIlIlIllllII = lllllllllllllllIIlIlIIlIlIlllllI.toCharArray();
        int lllllllllllllllIIlIlIIlIlIlllIll = llllIlIIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIlIIlIII[0];
        while (lIIlIIIIlIIlllI(i, length)) {
            lllllllllllllllIIlIlIIlIlIllllIl.append((char) (charArray[i] ^ lllllllllllllllIIlIlIIlIlIllllII[lllllllllllllllIIlIlIIlIlIlllIll % lllllllllllllllIIlIlIIlIlIllllII.length]));
            "".length();
            lllllllllllllllIIlIlIIlIlIlllIll++;
            i++;
            "".length();
            if ((-(51 ^ 55)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIIlIlIllllIl);
    }

    private static boolean lIIlIIIIlIIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIlIIIllI(String lllllllllllllllIIlIlIIlIllIlllII, String lllllllllllllllIIlIlIIlIllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIlIllIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIlIllIllllI.init(llllIlIIlIII[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlIIlIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIllIlllIl) {
            lllllllllllllllIIlIlIIlIllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIllII(Object obj) {
        return obj == null;
    }

    @Inject
    public y(C0000a c0000a) {
        this.aV = c0000a;
    }

    private static boolean lIIlIIIIlIIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIlIIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
