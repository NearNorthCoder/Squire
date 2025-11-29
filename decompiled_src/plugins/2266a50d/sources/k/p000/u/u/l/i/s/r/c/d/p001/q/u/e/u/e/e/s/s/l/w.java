package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 10000)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.w  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/w.class */
public class w extends Task {
    private final /* synthetic */ C0000a aR;
    private static /* synthetic */ int[] lIllIIlIlllI;
    private static /* synthetic */ String[] lIllIIlIllIl;
    private final /* synthetic */ SquireDukeSucellus aP;
    private final /* synthetic */ SquireDukeSucellusConfig aQ;

    private static boolean lllIIlIllIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lllIIlIllIIllI(int i, int i2) {
        return i > i2;
    }

    private static void lllIIlIllIIlIl() {
        lIllIIlIlllI = new int[5];
        lIllIIlIlllI[0] = ((((134 + 189) - 322) + 193) ^ (((81 + 140) - 118) + 49)) & (((((186 + 161) - 146) + 54) ^ (((24 + 42) - (-49)) + 50)) ^ (-" ".length()));
        lIllIIlIlllI[1] = " ".length();
        lIllIIlIlllI[2] = "   ".length();
        lIllIIlIlllI[3] = "  ".length();
        lIllIIlIlllI[4] = (195 ^ 136) ^ (251 ^ 184);
    }

    private static boolean lllIIlIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lllIIlIllIIIlI(String lllllllllllllllIllIIIIIllllIlIII, String lllllllllllllllIllIIIIIllllIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIIIllllIIlll.toCharArray();
        int lllllllllllllllIllIIIIIllllIIlII = lIllIIlIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIlllI[0];
        while (lllIIlIllIlIII(i, length)) {
            char lllllllllllllllIllIIIIIlllIllIll = charArray2[i];
            sb.append((char) (lllllllllllllllIllIIIIIlllIllIll ^ charArray[lllllllllllllllIllIIIIIllllIIlII % charArray.length]));
            "".length();
            lllllllllllllllIllIIIIIllllIIlII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public w(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aP = squireDukeSucellus;
        this.aQ = squireDukeSucellusConfig;
        this.aR = squireDukeSucellus.s();
    }

    private static void lllIIlIllIIlII() {
        lIllIIlIllIl = new String[lIllIIlIlllI[2]];
        lIllIIlIllIl[lIllIIlIlllI[0]] = lllIIlIllIIIlI("GwRyEz46Dw==", "UkRuQ");
        lIllIIlIllIl[lIllIIlIlllI[1]] = lllIIlIllIIIlI("IjQf", "gUkDI");
        lIllIIlIllIl[lIllIIlIlllI[3]] = lllIIlIllIIIll("AFpv2Ex4nAI=", "STBHw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public boolean run() {
        if (lllIIlIllIIllI(Combat.getCurrentHealth(), this.aQ.eatAt())) {
            return lIllIIlIlllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIllIIlIlllI[1]];
            strArr[lIllIIlIlllI[0]] = lIllIIlIllIl[lIllIIlIlllI[3]];
            return item.hasAction(strArr);
        });
        if (lllIIlIllIIlll(first)) {
            Log.error(lIllIIlIllIl[lIllIIlIlllI[0]]);
            this.aP.g(lIllIIlIlllI[1]);
            return lIllIIlIlllI[0];
        }
        first.interact(lIllIIlIllIl[lIllIIlIlllI[1]]);
        sleep(lIllIIlIlllI[2]);
        return lIllIIlIlllI[1];
    }

    static {
        lllIIlIllIIlIl();
        lllIIlIllIIlII();
    }

    private static String lllIIlIllIIIll(String lllllllllllllllIllIIIIIlllIlIIll, String lllllllllllllllIllIIIIIlllIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), lIllIIlIlllI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIIlllIlIlII) {
            lllllllllllllllIllIIIIIlllIlIlII.printStackTrace();
            return null;
        }
    }
}
