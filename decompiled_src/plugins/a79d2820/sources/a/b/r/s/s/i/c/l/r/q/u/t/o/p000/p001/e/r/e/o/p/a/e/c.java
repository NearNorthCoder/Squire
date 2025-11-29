package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Handling Prayers", priority = Integer.MAX_VALUE)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.c  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/c.class */
public class c extends Task {
    private static /* synthetic */ String[] lIllIIIIIllI;
    private static /* synthetic */ int[] lIllIIIIIlll;

    static {
        lllIIIlllIIlll();
        lllIIIlllIIllI();
    }

    private static void lllIIIlllIIllI() {
        lIllIIIIIllI = new String[lIllIIIIIlll[0]];
        lIllIIIIIllI[lIllIIIIIlll[1]] = lllIIIlllIIlIl("gC+dTF+3Loig8RCSjeLhKQ==", "sbYuV");
    }

    private static boolean lllIIIlllIlIII(Object obj) {
        return obj == null;
    }

    private static void lllIIIlllIIlll() {
        lIllIIIIIlll = new int[4];
        lIllIIIIIlll[0] = " ".length();
        lIllIIIIIlll[1] = ((((39 + 83) - 103) + 110) ^ (((120 + 34) - 76) + 77)) & (((((5 + 34) - 12) + 116) ^ (((148 + 66) - 161) + 96)) ^ (-" ".length()));
        lIllIIIIIlll[2] = 65 ^ 73;
        lIllIIIIIlll[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIllIIIIIlll[0]];
        strArr[lIllIIIIIlll[1]] = lIllIIIIIllI[lIllIIIIIlll[1]];
        if (lllIIIlllIlIII(NPCs.getNearest(strArr))) {
            Prayers.disableAll();
            return lIllIIIIIlll[1];
        }
        ArrayList arrayList = new ArrayList(List.of(Prayer.PROTECT_FROM_MAGIC));
        arrayList.addAll(Prayers.getMeleePrayer());
        "".length();
        if (lllIIIlllIlIIl(Prayers.flick(arrayList) ? 1 : 0)) {
            sleep(lIllIIIIIlll[0]);
        }
        return lIllIIIIIlll[0];
    }

    private static boolean lllIIIlllIlIIl(int i) {
        return i != 0;
    }

    private static String lllIIIlllIIlIl(String lllllllllllllllIllIIIlIlIIIllIII, String lllllllllllllllIllIIIlIlIIIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlll[2]), "DES");
            Cipher lllllllllllllllIllIIIlIlIIIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIlIlIIIllIlI.init(lIllIIIIIlll[3], secretKeySpec);
            return new String(lllllllllllllllIllIIIlIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlIlIIIllIIl) {
            lllllllllllllllIllIIIlIlIIIllIIl.printStackTrace();
            return null;
        }
    }
}
