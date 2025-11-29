package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Prep Pick Herbs", priority = 21000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.be  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/be.class */
public class be extends bg {
    private static /* synthetic */ int[] lIlIIIIIlIII;
    private static /* synthetic */ String[] lIlIIIIIIlll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        int[] iArr = new int[lIlIIIIIlIII[0]];
        iArr[lIlIIIIIlIII[1]] = lIlIIIIIlIII[2];
        if (llIlIlIIIIlIII(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIIIIIlIII[1];
        }
        int[] iArr2 = new int[lIlIIIIIlIII[0]];
        iArr2[lIlIIIIIlIII[1]] = em;
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!llIlIlIIIIlIIl(eh(), ed()) && !llIlIlIIIIlIlI(nearest)) {
            if (!llIlIlIIIIlIll(Inventory.isFull() ? 1 : 0) || llIlIlIIIIllII(eg(), ek())) {
                return lIlIIIIIlIII[1];
            }
            if (llIlIlIIIIlIII(this.bS.isAnimating() ? 1 : 0)) {
                System.out.println(lIlIIIIIIlll[lIlIIIIIlIII[1]]);
                return lIlIIIIIlIII[0];
            }
            nearest.interact(lIlIIIIIIlll[lIlIIIIIlIII[0]]);
            sleep(lIlIIIIIlIII[3]);
            return lIlIIIIIlIII[0];
        }
        return lIlIIIIIlIII[1];
    }

    private static boolean llIlIlIIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIIIIlIlI(Object obj) {
        return obj == null;
    }

    @Inject
    protected be(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String llIlIlIIIIIlII(String lllllllllllllllIlllIIlIIlIllIlIl, String lllllllllllllllIlllIIlIIlIllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIIlIllIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIlIIlIllIlII.toCharArray();
        int lllllllllllllllIlllIIlIIlIllIIIl = lIlIIIIIlIII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlllIIlIIlIlIlIIl = lIlIIIIIlIII[1];
        while (llIlIlIIIIlIIl(lllllllllllllllIlllIIlIIlIlIlIIl, length)) {
            char lllllllllllllllIlllIIlIIlIllIllI = charArray2[lllllllllllllllIlllIIlIIlIlIlIIl];
            lllllllllllllllIlllIIlIIlIllIIll.append((char) (lllllllllllllllIlllIIlIIlIllIllI ^ charArray[lllllllllllllllIlllIIlIIlIllIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlllIIlIIlIllIIIl++;
            lllllllllllllllIlllIIlIIlIlIlIIl++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIlIIlIllIIll);
    }

    private static String llIlIlIIIIIlIl(String lllllllllllllllIlllIIlIIlIlIIIII, String lllllllllllllllIlllIIlIIlIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIIlIlIIIIl) {
            lllllllllllllllIlllIIlIIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIlll() {
        lIlIIIIIlIII = new int[4];
        lIlIIIIIlIII[0] = " ".length();
        lIlIIIIIlIII[1] = ((138 ^ 161) ^ (51 ^ 1)) & (((120 ^ 5) ^ (49 ^ 85)) ^ (-" ".length()));
        lIlIIIIIlIII[2] = (-((-417) & 12273)) & (-4) & 32767;
        lIlIIIIIlIII[3] = "  ".length();
    }

    private static void llIlIlIIIIIllI() {
        lIlIIIIIIlll = new String[lIlIIIIIlIII[3]];
        lIlIIIIIIlll[lIlIIIIIlIII[1]] = llIlIlIIIIIlII("JDgADSYaNkMTP1Q5BhQtBw==", "tQcfO");
        lIlIIIIIIlll[lIlIIIIIlIII[0]] = llIlIlIIIIIlIl("ZjXTJGuthxA=", "eiLaO");
    }

    static {
        llIlIlIIIIIlll();
        llIlIlIIIIIllI();
    }

    private static boolean llIlIlIIIIlIII(int i) {
        return i != 0;
    }

    private static boolean llIlIlIIIIlIll(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIIIllII(int i, int i2) {
        return i <= i2;
    }
}
