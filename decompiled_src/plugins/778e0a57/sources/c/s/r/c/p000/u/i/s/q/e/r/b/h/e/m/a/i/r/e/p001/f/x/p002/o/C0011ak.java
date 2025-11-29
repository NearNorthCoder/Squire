package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Restoring prayer", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ak  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ak.class */
public class C0011ak extends Task {
    private static /* synthetic */ int[] lIlIIIlIlIIl;
    private static /* synthetic */ String[] lIlIIIlIlIII;
    private final /* synthetic */ SquireChambersPlugin cR;
    /* synthetic */ int cD = lIlIIIlIlIIl[0];
    /* synthetic */ boolean cE = lIlIIIlIlIIl[0];
    private final /* synthetic */ int cS = lIlIIIlIlIIl[1];

    private static String llIlIllIIIlIIl(String lllllllllllllllIlllIIIIIlllIIIll, String lllllllllllllllIlllIIIIIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIIl[7]), "DES");
            Cipher lllllllllllllllIlllIIIIIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIIlllIIlIl.init(lIlIIIlIlIIl[5], secretKeySpec);
            return new String(lllllllllllllllIlllIIIIIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIIlllIIlII) {
            lllllllllllllllIlllIIIIIlllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (!llIlIllIIIllIl(this.cR.E() ? 1 : 0) && !llIlIllIIIlllI(Prayers.getPoints(), lIlIIIlIlIIl[2])) {
            if (llIlIllIIIllll(this.cR.L().a((Locatable) Players.getLocal()) ? 1 : 0) && llIlIllIIlIIII(Static.getClient().getVarbitValue(lIlIIIlIlIIl[1])) && llIlIllIIlIIIl(this.cR.L().aM(), N.VESPULA)) {
                return lIlIIIlIlIIl[0];
            }
            Item first = Inventory.getFirst(item -> {
                if (llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[4]]) ? 1 : 0) && llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[5]]) ? 1 : 0) && !llIlIllIIIllll(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[3]]) ? 1 : 0)) {
                    return lIlIIIlIlIIl[0];
                }
                ?? r0 = lIlIIIlIlIIl[4];
                "".length();
                return " ".length() <= 0 ? ((62 ^ 104) ^ (1 ^ 122)) & (((100 ^ 67) ^ (98 ^ 104)) ^ (-" ".length())) : r0;
            });
            if (llIlIllIIlIIlI(first)) {
                return lIlIIIlIlIIl[0];
            }
            first.interact(lIlIIIlIlIII[lIlIIIlIlIIl[0]]);
            sleep(lIlIIIlIlIIl[3]);
            return lIlIIIlIlIIl[4];
        }
        return lIlIIIlIlIIl[0];
    }

    private static void llIlIllIIIlIll() {
        lIlIIIlIlIII = new String[lIlIIIlIlIIl[6]];
        lIlIIIlIlIII[lIlIIIlIlIIl[0]] = llIlIllIIIlIII("KCIsAwc=", "lPEml");
        lIlIIIlIlIII[lIlIIIlIlIIl[4]] = llIlIllIIIlIIl("7P1y4DouekNceaE/v1iVsw==", "IqYXL");
        lIlIIIlIlIII[lIlIIIlIlIIl[5]] = llIlIllIIIlIIl("cy3jSz9wYV4mnbwegb5RkA==", "IXFjZ");
        lIlIIIlIlIII[lIlIIIlIlIIl[3]] = llIlIllIIIlIlI("3seV9AXtAG9WJLDrYgCXuQ==", "XgLip");
    }

    private static void llIlIllIIIllII() {
        lIlIIIlIlIIl = new int[8];
        lIlIIIlIlIIl[0] = ((((58 + 30) - 66) + 118) ^ (((48 + 113) - 98) + 105)) & (((155 ^ 182) ^ (144 ^ 153)) ^ (-" ".length()));
        lIlIIIlIlIIl[1] = (-18561) & 23977;
        lIlIIIlIlIIl[2] = 98 ^ 103;
        lIlIIIlIlIIl[3] = "   ".length();
        lIlIIIlIlIIl[4] = " ".length();
        lIlIIIlIlIIl[5] = "  ".length();
        lIlIIIlIlIIl[6] = 16 ^ 20;
        lIlIIIlIlIIl[7] = (((121 + 3) - 115) + 150) ^ (((108 + 64) - 83) + 62);
    }

    private static boolean llIlIllIIIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public C0011ak(SquireChambersPlugin squireChambersPlugin) {
        this.cR = squireChambersPlugin;
    }

    private static String llIlIllIIIlIlI(String lllllllllllllllIlllIIIIIlllIlllI, String lllllllllllllllIlllIIIIIlllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIIllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIIllllIIlI.init(lIlIIIlIlIIl[5], secretKeySpec);
            return new String(lllllllllllllllIlllIIIIIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIIllllIIIl) {
            lllllllllllllllIlllIIIIIllllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIIlIIII(int i) {
        return i > 0;
    }

    private static boolean llIlIllIIIlllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIllIIIllll(int i) {
        return i != 0;
    }

    private static boolean llIlIllIIlIIlI(Object obj) {
        return obj == null;
    }

    static {
        llIlIllIIIllII();
        llIlIllIIIlIll();
    }

    private static boolean llIlIllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIllIIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIllIIIlIII(String lllllllllllllllIlllIIIIIllIlIIll, String lllllllllllllllIlllIIIIIllIlIIlI) {
        String lllllllllllllllIlllIIIIIllIlIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIIllIlIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIIIIIllIlIIII = lllllllllllllllIlllIIIIIllIlIIlI.toCharArray();
        int lllllllllllllllIlllIIIIIllIIllll = lIlIIIlIlIIl[0];
        char[] charArray = lllllllllllllllIlllIIIIIllIlIIll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIlIlIIl[0];
        while (llIlIllIIlIIll(i, length)) {
            char lllllllllllllllIlllIIIIIllIlIlII = charArray[i];
            lllllllllllllllIlllIIIIIllIlIIIl.append((char) (lllllllllllllllIlllIIIIIllIlIlII ^ lllllllllllllllIlllIIIIIllIlIIII[lllllllllllllllIlllIIIIIllIIllll % lllllllllllllllIlllIIIIIllIlIIII.length]));
            "".length();
            lllllllllllllllIlllIIIIIllIIllll++;
            i++;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIIIllIlIIIl);
    }
}
