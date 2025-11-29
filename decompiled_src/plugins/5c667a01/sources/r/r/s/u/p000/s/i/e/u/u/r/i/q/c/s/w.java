package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Prayer Flicking", priority = 2147483646)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.w  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/w.class */
public class w extends Task {
    private final /* synthetic */ SquireScurrius ak;
    private static /* synthetic */ String[] lIIlIllIlIIlI;
    private static /* synthetic */ int[] lIIlIllIlIlIl;

    @Inject
    public w(SquireScurrius squireScurrius) {
        this.ak = squireScurrius;
    }

    private static boolean lIlIllIlIIlllIl(int i, int i2) {
        return i <= i2;
    }

    private static void lIlIllIlIIlIIll() {
        lIIlIllIlIIlI = new String[lIIlIllIlIlIl[1]];
        lIIlIllIlIIlI[lIIlIllIlIlIl[0]] = lIlIllIlIIlIIIl("ofO7G0yudZaGEx/U3VQXAQ==", "WGSoy");
        lIIlIllIlIIlI[lIIlIllIlIlIl[2]] = lIlIllIlIIlIIlI("BgYoKjdhHSgw", "AoIDC");
    }

    private static void lIlIllIlIIlIlll() {
        lIIlIllIlIlIl = new int[4];
        lIIlIllIlIlIl[0] = ((((88 + 16) - 42) + 82) ^ (((60 + 28) - 12) + 52)) & (((175 ^ 180) ^ (204 ^ 199)) ^ (-" ".length()));
        lIIlIllIlIlIl[1] = "  ".length();
        lIIlIllIlIlIl[2] = " ".length();
        lIIlIllIlIlIl[3] = (29 ^ 94) ^ (37 ^ 75);
    }

    private List<Prayer> x() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        int[] iArr = new int[lIIlIllIlIlIl[1]];
        iArr[lIIlIllIlIlIl[0]] = d.C;
        iArr[lIIlIllIlIlIl[2]] = d.D;
        Projectile nearest = Projectiles.getNearest(iArr);
        if (!lIlIllIlIIlllII(nearest) || !lIlIllIlIIlllIl(nearest.getRemainingCycles(), lIIlIllIlIlIl[3])) {
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        } else if (lIlIllIlIIllllI(nearest.getId(), d.C)) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if (0 != 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if (((((128 + 51) - 60) + 42) ^ (((69 + 102) - 157) + 151)) == (-" ".length())) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lIlIllIlIIlllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIlIIllIll(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public boolean run() {
        if (lIlIllIlIIllIIl(this.ak.c() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        String[] strArr = new String[lIIlIllIlIlIl[1]];
        strArr[lIIlIllIlIlIl[0]] = lIIlIllIlIIlI[lIIlIllIlIlIl[0]];
        strArr[lIIlIllIlIlIl[2]] = lIIlIllIlIIlI[lIIlIllIlIlIl[2]];
        if (lIlIllIlIIllIlI(NPCs.getNearest(strArr))) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        } else if (lIlIllIlIIllIll(Prayers.getPoints())) {
            this.ak.e((boolean) lIIlIllIlIlIl[2]);
            return lIIlIllIlIlIl[0];
        } else {
            Prayers.flick(x());
            "".length();
            return lIIlIllIlIlIl[0];
        }
    }

    static {
        lIlIllIlIIlIlll();
        lIlIllIlIIlIIll();
    }

    private static boolean lIlIllIlIIllIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIllIlIIlIIlI(String llllllllllllllIllllIlIlIIIllIIII, String llllllllllllllIllllIlIlIIIllIlII) {
        String llllllllllllllIllllIlIlIIIllIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIlIIIllIIll = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlIlIIIllIlII.toCharArray();
        int llllllllllllllIllllIlIlIIIllIIIl = lIIlIllIlIlIl[0];
        char[] charArray2 = llllllllllllllIllllIlIlIIIllIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllIlIlIl[0];
        while (lIlIllIlIIlllll(i, length)) {
            char llllllllllllllIllllIlIlIIIllIllI = charArray2[i];
            llllllllllllllIllllIlIlIIIllIIll.append((char) (llllllllllllllIllllIlIlIIIllIllI ^ charArray[llllllllllllllIllllIlIlIIIllIIIl % charArray.length]));
            "".length();
            llllllllllllllIllllIlIlIIIllIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIlIIIllIIll);
    }

    private static boolean lIlIllIlIIlllll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIlIIlIIIl(String llllllllllllllIllllIlIlIIlIIIlIl, String llllllllllllllIllllIlIlIIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlIIlIIIlll.init(lIIlIllIlIlIl[1], secretKeySpec);
            return new String(llllllllllllllIllllIlIlIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlIIlIIIllI) {
            llllllllllllllIllllIlIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlIIllllI(int i, int i2) {
        return i == i2;
    }
}
