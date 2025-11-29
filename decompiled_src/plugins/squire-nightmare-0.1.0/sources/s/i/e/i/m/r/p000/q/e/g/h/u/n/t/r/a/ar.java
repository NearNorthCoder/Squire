package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Restoring Prayer", priority = 2)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ar  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ar.class */
public class ar extends Task {
    private static final /* synthetic */ Logger en;
    private static /* synthetic */ String[] llllIIlIlllI;
    private final /* synthetic */ SquireNightmareConfig eo;
    private final /* synthetic */ SquireNightmarePlugin ep;
    private static /* synthetic */ int[] llllIIllIIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        if (!lIIIllllllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIIllllllIlllI(this.ep.aq() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String lowerCase = item.getName().toLowerCase();
                if (lIIIllllllIllIl(lowerCase.contains(llllIIlIlllI[llllIIllIIII[2]]) ? 1 : 0) && lIIIllllllIllIl(lowerCase.contains(llllIIlIlllI[llllIIllIIII[3]]) ? 1 : 0) && !lIIIllllllIlllI(lowerCase.contains(llllIIlIlllI[llllIIllIIII[1]]) ? 1 : 0)) {
                    return llllIIllIIII[0];
                }
                ?? r0 = llllIIllIIII[2];
                "".length();
                return "  ".length() == 0 ? ((66 ^ 70) ^ (4 ^ 15)) & (((253 ^ 186) ^ (118 ^ 62)) ^ (-" ".length())) : r0;
            });
            if (!lIIIllllllIllll(Prayers.getPoints(), this.eo.restorePrayerAt()) && !lIIIlllllllIIII(first)) {
                first.interact(llllIIlIlllI[llllIIllIIII[0]]);
                sleep(llllIIllIIII[1]);
                return llllIIllIIII[2];
            }
            return llllIIllIIII[0];
        }
        return llllIIllIIII[0];
    }

    static {
        lIIIllllllIlIll();
        lIIIllllllIlIlI();
        en = LoggerFactory.getLogger(ar.class);
    }

    private static void lIIIllllllIlIlI() {
        llllIIlIlllI = new String[llllIIllIIII[4]];
        llllIIlIlllI[llllIIllIIII[0]] = lIIIllllllIIlIl("UhRiaBjnlcc=", "nLDZg");
        llllIIlIlllI[llllIIllIIII[2]] = lIIIllllllIIlll("wQFzM0yzbmI=", "QvjId");
        llllIIlIlllI[llllIIllIIII[3]] = lIIIllllllIIlIl("M7sXonMqW1k=", "HAjNS");
        llllIIlIlllI[llllIIllIIII[1]] = lIIIllllllIIlll("YTvEj8PxbMU=", "PGsaa");
    }

    @Inject
    protected ar(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.eo = squireNightmareConfig;
        this.ep = squireNightmarePlugin;
    }

    private static boolean lIIIllllllIllll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIllllllIIlll(String lllllllllllllllIIlIlllIlIIlIlIlI, String lllllllllllllllIIlIlllIlIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlIIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlIIlIllII.init(llllIIllIIII[3], lllllllllllllllIIlIlllIlIIlIllIl);
            return new String(lllllllllllllllIIlIlllIlIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIIlIlIll) {
            lllllllllllllllIIlIlllIlIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIllllllIlIll() {
        llllIIllIIII = new int[6];
        llllIIllIIII[0] = ((106 ^ 74) ^ (210 ^ 186)) & (((((63 + 32) - (-39)) + 68) ^ (((23 + 94) - 56) + 69)) ^ (-" ".length()));
        llllIIllIIII[1] = "   ".length();
        llllIIllIIII[2] = " ".length();
        llllIIllIIII[3] = "  ".length();
        llllIIllIIII[4] = (112 ^ 67) ^ (124 ^ 75);
        llllIIllIIII[5] = (211 ^ 198) ^ (117 ^ 104);
    }

    private static boolean lIIIllllllIllIl(int i) {
        return i == 0;
    }

    private static String lIIIllllllIIlIl(String lllllllllllllllIIlIlllIlIIllIlll, String lllllllllllllllIIlIlllIlIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlIIllIllI.getBytes(StandardCharsets.UTF_8)), llllIIllIIII[5]), "DES");
            Cipher lllllllllllllllIIlIlllIlIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIlIIlllIIl.init(llllIIllIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIlIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIlIIlllIII) {
            lllllllllllllllIIlIlllIlIIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllIlllI(int i) {
        return i != 0;
    }

    private static boolean lIIIlllllllIIII(Object obj) {
        return obj == null;
    }
}
