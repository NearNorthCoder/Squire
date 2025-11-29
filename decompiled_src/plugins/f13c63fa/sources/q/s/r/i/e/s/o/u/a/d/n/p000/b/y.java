package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping Bowfa")
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.y  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/y.class */
public class y extends Task {
    private static /* synthetic */ int[] llIlllIllII;
    private final /* synthetic */ SquireBandosConfig ay;
    private static /* synthetic */ String[] llIlllIlIlI;
    private final /* synthetic */ e az;

    private static boolean lIlIlIlllIlIII(int i) {
        return i != 0;
    }

    private static String lIlIlIllIllIlI(String llllllllllllllllIIlIlIlIIllIIIll, String llllllllllllllllIIlIlIlIIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIIllIIlIl.init(llIlllIllII[2], secretKeySpec);
            return new String(llllllllllllllllIIlIlIlIIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIllIIlII) {
            llllllllllllllllIIlIlIlIIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIIlll(int i) {
        return i == 0;
    }

    private static String lIlIlIllIllIIl(String llllllllllllllllIIlIlIlIIlllIIII, String llllllllllllllllIIlIlIlIIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIIllIllll.getBytes(StandardCharsets.UTF_8)), llIlllIllII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIlIIlllIIIl) {
            llllllllllllllllIIlIlIlIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIlllII() {
        llIlllIlIlI = new String[llIlllIllII[3]];
        llIlllIlIlI[llIlllIllII[0]] = lIlIlIllIllIIl("71E5o3oKiUA=", "PrnLp");
        llIlllIlIlI[llIlllIllII[1]] = lIlIlIllIllIlI("ZzbU9x7GVqIKTVRkYtYzMw==", "YxoxU");
        llIlllIlIlI[llIlllIllII[2]] = lIlIlIllIllIIl("TZHWpIK2PrQkpTaemhLxeA==", "jsWaV");
    }

    @Inject
    public y(SquireBandosConfig squireBandosConfig, e eVar) {
        this.ay = squireBandosConfig;
        this.az = eVar;
    }

    static {
        lIlIlIlllIIllI();
        lIlIlIllIlllII();
    }

    private static void lIlIlIlllIIllI() {
        llIlllIllII = new int[5];
        llIlllIllII[0] = ((244 ^ 193) ^ (175 ^ 166)) & (((((17 + 145) - 42) + 62) ^ (((115 + 84) - 193) + 132)) ^ (-" ".length()));
        llIlllIllII[1] = " ".length();
        llIlllIllII[2] = "  ".length();
        llIlllIllII[3] = "   ".length();
        llIlllIllII[4] = 98 ^ 106;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        if (lIlIlIlllIIlll(this.ay.useBlowpipe() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        if (lIlIlIlllIlIII(this.az.v() ? 1 : 0) && lIlIlIlllIIlll(this.az.s() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIlIlllIIlll(item.getName().contains(llIlllIlIlI[llIlllIllII[1]]) ? 1 : 0) || lIlIlIlllIlIII(item.getName().contains(llIlllIlIlI[llIlllIllII[2]]) ? 1 : 0)) {
                ?? r0 = llIlllIllII[1];
                "".length();
                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlllIllII[0];
        });
        if (lIlIlIlllIlIIl(first)) {
            first.interact(llIlllIlIlI[llIlllIllII[0]]);
            return llIlllIllII[1];
        }
        return llIlllIllII[0];
    }

    private static boolean lIlIlIlllIlIIl(Object obj) {
        return obj != null;
    }
}
