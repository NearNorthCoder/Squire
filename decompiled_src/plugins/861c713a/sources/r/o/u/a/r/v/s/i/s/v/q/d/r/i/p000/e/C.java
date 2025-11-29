package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Prayer Flicking", priority = 2147483646)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.C  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/C.class */
public class C extends Task {
    private static /* synthetic */ String[] lIlIlIIIIlllI;
    private static /* synthetic */ int[] lIlIlIIIIllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIlIIIIllll[0]];
        iArr[lIlIlIIIIllll[1]] = C0006g.T;
        iArr[lIlIlIIIIllll[2]] = C0006g.U;
        TileObject nearest = TileObjects.getNearest(iArr);
        String[] strArr = new String[lIlIlIIIIllll[2]];
        strArr[lIlIlIIIIllll[1]] = lIlIlIIIIlllI[lIlIlIIIIllll[1]];
        NPC nearest2 = NPCs.getNearest(strArr);
        if (!lIllllIlIIllIlI(nearest2) || !lIllllIlIIllIlI(nearest2.getInteracting()) || lIllllIlIIllIll(nearest)) {
            Prayers.disableAll();
            return lIlIlIIIIllll[1];
        } else if (lIllllIlIIlllII(Prayers.getPoints())) {
            return lIlIlIIIIllll[1];
        } else {
            Prayers.flick(W());
            "".length();
            return lIlIlIIIIllll[1];
        }
    }

    private static boolean lIllllIlIIllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIlIIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIlIIlllII(int i) {
        return i <= 0;
    }

    private static void lIllllIlIIllIIl() {
        lIlIlIIIIllll = new int[7];
        lIlIlIIIIllll[0] = "  ".length();
        lIlIlIIIIllll[1] = " ".length() & (" ".length() ^ (-1));
        lIlIlIIIIllll[2] = " ".length();
        lIlIlIIIIllll[3] = (-((-2565) & 19007)) & (-4097) & 24447;
        lIlIlIIIIllll[4] = (89 ^ 12) ^ (219 ^ 134);
        lIlIlIIIIllll[5] = "   ".length();
        lIlIlIIIIllll[6] = 166 ^ 154;
    }

    static {
        lIllllIlIIllIIl();
        lIllllIlIIllIII();
    }

    private List<Prayer> W() {
        ArrayList arrayList = new ArrayList();
        if (lIllllIlIIlllIl(Static.getClient().getVarbitValue(lIlIlIIIIllll[3]), lIlIlIIIIllll[4])) {
            Prayer[] prayerArr = new Prayer[lIlIlIIIIllll[5]];
            prayerArr[lIlIlIIIIllll[1]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArr[lIlIlIIIIllll[2]] = Prayer.ULTIMATE_STRENGTH;
            prayerArr[lIlIlIIIIllll[0]] = Prayer.STEEL_SKIN;
            arrayList.addAll(Arrays.asList(prayerArr));
            "".length();
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PIETY);
            "".length();
        }
        int[] iArr = new int[lIlIlIIIIllll[2]];
        iArr[lIlIlIIIIllll[1]] = C0006g.S;
        Projectile nearest = Projectiles.getNearest(iArr);
        if (lIllllIlIIllIlI(nearest) && lIllllIlIIllllI(nearest.getRemainingCycles(), lIlIlIIIIllll[6]) && lIllllIlIIlllll(nearest.getRemainingCycles())) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        }
        return arrayList;
    }

    private static boolean lIllllIlIIlllll(int i) {
        return i > 0;
    }

    private static boolean lIllllIlIIllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllllIlIIlIlll(String llllllllllllllIllIllIIIlllIlIlII, String llllllllllllllIllIllIIIlllIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIIllll[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIlllIlIlIl) {
            llllllllllllllIllIllIIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIIllIII() {
        lIlIlIIIIlllI = new String[lIlIlIIIIllll[2]];
        lIlIlIIIIlllI[lIlIlIIIIllll[1]] = lIllllIlIIlIlll("gsXjIw6fQ95tB44g6qc5SA==", "wcFxv");
    }

    private static boolean lIllllIlIIlllIl(int i, int i2) {
        return i != i2;
    }
}
