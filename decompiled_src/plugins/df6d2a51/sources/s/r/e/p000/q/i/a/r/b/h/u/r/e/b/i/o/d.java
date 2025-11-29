package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;
@TaskDesc(name = "Checking Supplies", priority = 1337)
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.d  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/d.class */
public class d extends Task {
    private final /* synthetic */ b q;
    private final /* synthetic */ SquireHerbiboarPlugin o;
    private final /* synthetic */ SquireHerbiboarConfig p;
    private static /* synthetic */ String[] lllIIllIlIlI;
    private static /* synthetic */ int[] lllIIllIlIll;

    private static boolean lIIIlIlIlIlllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public d(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b bVar) {
        this.o = squireHerbiboarPlugin;
        this.p = squireHerbiboarConfig;
        this.q = bVar;
    }

    private static void lIIIlIlIlIllIll() {
        lllIIllIlIll = new int[4];
        lllIIllIlIll[0] = (98 ^ 87) & ((2 ^ 55) ^ (-1));
        lllIIllIlIll[1] = " ".length();
        lllIIllIlIll[2] = (15 ^ 45) ^ (189 ^ 154);
        lllIIllIlIll[3] = "  ".length();
    }

    private static boolean lIIIlIlIlIlllll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIlIlIllIlI() {
        lllIIllIlIlI = new String[lllIIllIlIll[3]];
        lllIIllIlIlI[lllIIllIlIll[0]] = lIIIlIlIlIllIII("Pg1kFgMMDGQMCUkfLQwODRolD0YMBiEKARBINBcSAAcqC0YPGisVRh0AIVgECAYv", "ihDxf");
        lllIIllIlIlI[lllIIllIlIll[1]] = lIIIlIlIlIllIIl("t2dlLa2AR6DyyI/cxK+r5k2SlVIRvGP6VgBLLUYI88i/lv6xNi4BKA==", "YiCAg");
    }

    private static String lIIIlIlIlIllIII(String lllllllllllllllIIllIIlllllllIIII, String lllllllllllllllIIllIIllllllIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIllllllIllll.toCharArray();
        int lllllllllllllllIIllIIllllllIllII = lllIIllIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIllIlIll[0];
        while (lIIIlIlIlIlllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIllllllIllII % charArray.length]));
            "".length();
            lllllllllllllllIIllIIllllllIllII++;
            i++;
            "".length();
            if ((80 ^ 85) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlIlIlIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlIlIlIllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean run() {
        if (lIIIlIlIlIlllII(this.q.i(), c.STARTING)) {
            return lllIIllIlIll[0];
        }
        e useEnergyRestoration = this.p.useEnergyRestoration();
        if (lIIIlIlIlIlllII(useEnergyRestoration, e.NONE) && lIIIlIlIlIlllIl(Inventory.getCount(useEnergyRestoration.j()))) {
            Log.info(lllIIllIlIlI[lllIIllIlIll[0]]);
            this.o.a((boolean) lllIIllIlIll[1]);
            return lllIIllIlIll[0];
        }
        if (lIIIlIlIlIllllI(Inventory.getFreeSlots(), lllIIllIlIll[2])) {
            Log.info(lllIIllIlIlI[lllIIllIlIll[1]]);
            this.o.a((boolean) lllIIllIlIll[1]);
        }
        return lllIIllIlIll[0];
    }

    private static String lIIIlIlIlIllIIl(String lllllllllllllllIIllIIlllllIllIll, String lllllllllllllllIIllIIlllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlllllIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlllllIlllIl.init(lllIIllIlIll[3], lllllllllllllllIIllIIlllllIllllI);
            return new String(lllllllllllllllIIllIIlllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllllIlllII) {
            lllllllllllllllIIllIIlllllIlllII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIlIlIllIll();
        lIIIlIlIlIllIlI();
    }
}
