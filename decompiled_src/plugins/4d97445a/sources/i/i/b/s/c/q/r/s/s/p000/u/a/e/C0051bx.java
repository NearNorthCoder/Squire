package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Shooting Target")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bx  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bx.class */
public class C0051bx extends Task {
    private static /* synthetic */ int[] lIIIIlll;
    private static /* synthetic */ String[] lIIIIllI;
    private final /* synthetic */ SquireRangingGuild ga;

    private static void lIIIIIIlll() {
        lIIIIlll = new int[5];
        lIIIIlll[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIIIIlll[1] = " ".length();
        lIIIIlll[2] = (-((-295) & 6575)) & (-8194) & 15355;
        lIIIIlll[3] = (-4609) & 16271;
        lIIIIlll[4] = "  ".length();
    }

    private static void lIIIIIIllI() {
        lIIIIllI = new String[lIIIIlll[4]];
        lIIIIllI[lIIIIlll[0]] = lIIIIIIlII("Jy4ADwg=", "pGecl");
        lIIIIllI[lIIIIlll[1]] = lIIIIIIlIl("MyMemqdCOe0=", "uXCmn");
    }

    private static String lIIIIIIlIl(String lllIIIlllllIlIl, String lllIIIlllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlllllIlll = Cipher.getInstance("Blowfish");
            lllIIIlllllIlll.init(lIIIIlll[4], secretKeySpec);
            return new String(lllIIIlllllIlll.doFinal(Base64.getDecoder().decode(lllIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlllllIllI) {
            lllIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIIIIIlll();
        lIIIIIIllI();
    }

    private static boolean lIIIIIlIII(int i2) {
        return i2 != 0;
    }

    private static String lIIIIIIlII(String lllIIlIIIIIlIlI, String lllIIlIIIIIlIIl) {
        String lllIIlIIIIIlIlI2 = new String(Base64.getDecoder().decode(lllIIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIIIIIlIII = new StringBuilder();
        char[] lllIIlIIIIIIlll = lllIIlIIIIIlIIl.toCharArray();
        int lllIIlIIIIIIllI = lIIIIlll[0];
        char[] charArray = lllIIlIIIIIlIlI2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIIlll[0];
        while (lIIIIIlIll(i2, length)) {
            char lllIIlIIIIIlIll = charArray[i2];
            lllIIlIIIIIlIII.append((char) (lllIIlIIIIIlIll ^ lllIIlIIIIIIlll[lllIIlIIIIIIllI % lllIIlIIIIIIlll.length]));
            "".length();
            lllIIlIIIIIIllI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllIIlIIIIIlIII);
    }

    private static boolean lIIIIIlIIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIIlIll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (lIIIIIlIII(this.ga.cq() ? 1 : 0)) {
            return lIIIIlll[0];
        }
        int[] iArr = new int[lIIIIlll[1]];
        iArr[lIIIIlll[0]] = lIIIIlll[2];
        if (lIIIIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIlll[1]];
            iArr2[lIIIIlll[0]] = lIIIIlll[2];
            if (lIIIIIlIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIIlll[1]];
                iArr3[lIIIIlll[0]] = lIIIIlll[2];
                Inventory.getFirst(iArr3).interact(lIIIIllI[lIIIIlll[0]]);
            }
        }
        int[] iArr4 = new int[lIIIIlll[1]];
        iArr4[lIIIIlll[0]] = lIIIIlll[3];
        TileObject nearest = TileObjects.getNearest(iArr4);
        if (lIIIIIlIlI(nearest)) {
            nearest.interact(lIIIIllI[lIIIIlll[1]]);
        }
        return lIIIIlll[1];
    }

    @Inject
    public C0051bx(SquireRangingGuild squireRangingGuild) {
        this.ga = squireRangingGuild;
    }

    private static boolean lIIIIIlIlI(Object obj) {
        return obj != null;
    }
}
