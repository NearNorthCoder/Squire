package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Cleansing parasite", priority = Integer.MAX_VALUE, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ao  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ao.class */
public class ao extends Task {
    private final /* synthetic */ C0011h eh;
    private final /* synthetic */ SquireNightmarePlugin eg;
    private static /* synthetic */ String[] llllIIIlllll;
    private static final /* synthetic */ Logger ef;
    private final /* synthetic */ SquireNightmareConfig ei;
    private static /* synthetic */ int[] llllIIlIIIII;

    private static void lIIIllllIlIlllI() {
        llllIIlIIIII = new int[7];
        llllIIlIIIII[0] = ((195 ^ 145) ^ ((101 ^ 5) & ((50 ^ 82) ^ (-1)))) & (((((133 + 87) - 146) + 157) ^ (((35 + 122) - 8) + 32)) ^ (-" ".length()));
        llllIIlIIIII[1] = (-((-25007) & 27119)) & (-16409) & 28671;
        llllIIlIIIII[2] = " ".length();
        llllIIlIIIII[3] = "  ".length();
        llllIIlIIIII[4] = "   ".length();
        llllIIlIIIII[5] = (223 ^ 167) ^ (46 ^ 82);
        llllIIlIIIII[6] = (((13 + 25) - 30) + 175) ^ (((132 + 65) - 175) + 156);
    }

    static {
        lIIIllllIlIlllI();
        lIIIllllIlIllIl();
        ef = LoggerFactory.getLogger(ao.class);
    }

    private static boolean lIIIllllIlIllll(int i) {
        return i == 0;
    }

    private static String lIIIllllIlIlIll(String lllllllllllllllIIlIlllllIIIIIlIl, String lllllllllllllllIIlIlllllIIIIIlII) {
        String lllllllllllllllIIlIlllllIIIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIlllllIIIIIIlI = lllllllllllllllIIlIlllllIIIIIlII.toCharArray();
        int lllllllllllllllIIlIlllllIIIIIIIl = llllIIlIIIII[0];
        char[] charArray = lllllllllllllllIIlIlllllIIIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = llllIIlIIIII[0];
        while (lIIIllllIllIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIlllllIIIIIIlI[lllllllllllllllIIlIlllllIIIIIIIl % lllllllllllllllIIlIlllllIIIIIIlI.length]));
            "".length();
            lllllllllllllllIIlIlllllIIIIIIIl++;
            i++;
            "".length();
            if ((-(161 ^ 165)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIllllIlIllIl() {
        llllIIIlllll = new String[llllIIlIIIII[6]];
        llllIIIlllll[llllIIlIIIII[0]] = lIIIllllIlIlIll("EQAxCiQsCzNPJjYKdwAyLE44CWc7GyUKNHZOFgM0N04ZAGcrDzkJIi9OMQAyNgp3Bil4BzkZIjYaOB0+eAElTyg2TiMHIngJJQAyNgp7TzM9AjIfKCoaPgEgeAEiGw==", "XnWoG");
        llllIIIlllll[llllIIlIIIII[2]] = lIIIllllIlIlIll("IR0AGD4=", "eoivU");
        llllIIIlllll[llllIIlIIIII[3]] = lIIIllllIlIllII("c8RBO3xQHiNYzTCb7Ed8/v09DFCfbjB8", "cTzqQ");
        llllIIIlllll[llllIIlIIIII[4]] = lIIIllllIlIllII("nc32kxFQK9g=", "VvbvT");
        llllIIIlllll[llllIIlIIIII[5]] = lIIIllllIlIllII("EHgaOH7tuOE=", "BRdGD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (!lIIIllllIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIIllllIllIIII(this.eg.aq() ? 1 : 0) && !lIIIllllIlIllll(Static.getClient().getVarbitValue(llllIIlIIIII[1]))) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[5]]);
            });
            if (lIIIllllIllIIIl(first)) {
                first = Inventory.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[4]]);
                });
            }
            if (lIIIllllIllIIIl(first)) {
                Log.info(llllIIIlllll[llllIIlIIIII[0]]);
                return this.eg.m();
            }
            first.interact(llllIIIlllll[llllIIlIIIII[2]]);
            ef.info(llllIIIlllll[llllIIlIIIII[3]]);
            sleep(llllIIlIIIII[4]);
            this.eg.p(llllIIlIIIII[0]);
            return llllIIlIIIII[2];
        }
        return llllIIlIIIII[0];
    }

    private static boolean lIIIllllIllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllllIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllllIlIllII(String lllllllllllllllIIlIllllIllllIIII, String lllllllllllllllIIlIllllIlllIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIIIII[3], lllllllllllllllIIlIllllIllllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllllIllllIIIl) {
            lllllllllllllllIIlIllllIllllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public ao(SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h, SquireNightmareConfig squireNightmareConfig) {
        this.eg = squireNightmarePlugin;
        this.eh = c0011h;
        this.ei = squireNightmareConfig;
    }

    private static boolean lIIIllllIllIIII(int i) {
        return i != 0;
    }
}
