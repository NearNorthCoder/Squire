package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Leave Raid", priority = 2147483545, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ax  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ax.class */
public class C0024ax extends Y {
    private static /* synthetic */ String[] lIlIlIIllllI;
    private static /* synthetic */ int[] lIlIlIIlllll;
    private final /* synthetic */ SquireChambersPlugin dw;
    private final /* synthetic */ SquireChambersConfig dx;

    private static void llIlllIlIlllII() {
        lIlIlIIllllI = new String[lIlIlIIlllll[6]];
        lIlIlIIllllI[lIlIlIIlllll[0]] = llIlllIlIllIIl("Ai4YDjVg", "NKyxP");
        lIlIlIIllllI[lIlIlIIlllll[1]] = llIlllIlIllIIl("DhERHwZs", "Btpic");
        lIlIlIIllllI[lIlIlIIlllll[2]] = llIlllIlIllIlI("Uc/JUvR0XfsfsVoyXUb+aKYOuGiHI4IP", "jWCmx");
        lIlIlIIllllI[lIlIlIIlllll[3]] = llIlllIlIllIlI("UAOTomEQjSw=", "hSzbv");
        lIlIlIIllllI[lIlIlIIlllll[4]] = llIlllIlIllIll("A6HXIeJkbc8=", "msARt");
        lIlIlIIllllI[lIlIlIIlllll[5]] = llIlllIlIllIIl("LjUAGTQ=", "mYitV");
    }

    @Inject
    public C0024ax(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dw = squireChambersPlugin;
        this.dx = squireChambersConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.Y
    public boolean run() {
        return llIlllIlIllllI(C0046u.bh(), EnumC0048w.GET_OUT) ? lIlIlIIlllll[0] : cg();
    }

    private static void llIlllIlIlllIl() {
        lIlIlIIlllll = new int[8];
        lIlIlIIlllll[0] = (1 ^ 89) & ((8 ^ 80) ^ (-1));
        lIlIlIIlllll[1] = " ".length();
        lIlIlIIlllll[2] = "  ".length();
        lIlIlIIlllll[3] = "   ".length();
        lIlIlIIlllll[4] = (11 ^ 124) ^ (117 ^ 6);
        lIlIlIIlllll[5] = " ".length() ^ (22 ^ 18);
        lIlIlIIlllll[6] = 145 ^ 151;
        lIlIlIIlllll[7] = (208 ^ 178) ^ (226 ^ 136);
    }

    private static boolean llIlllIlIlllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.Y
    public boolean cg() {
        if (llIlllIlIlllll(this.dw.G() ? 1 : 0)) {
            return lIlIlIIlllll[0];
        }
        if (llIlllIllIIIII(Dialog.isViewingOptions() ? 1 : 0) && llIlllIllIIIII(Dialog.hasOption(lIlIlIIllllI[lIlIlIIlllll[0]]) ? 1 : 0)) {
            String[] strArr = new String[lIlIlIIlllll[1]];
            strArr[lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[1]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlIlIIlllll[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlllIllIIIII(tileObject.getName().equals(lIlIlIIllllI[lIlIlIIlllll[4]]) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIlIIlllll[1]];
                strArr2[lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[5]];
                if (llIlllIllIIIII(tileObject.hasAction(strArr2) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlllll[1];
                    "".length();
                    return ((244 ^ 145) ^ (87 ^ 54)) <= 0 ? ((47 ^ 34) ^ (239 ^ 178)) & (((67 ^ 111) ^ (112 ^ 12)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIlllll[0];
        });
        if (llIlllIllIIIIl(nearest)) {
            System.out.println(lIlIlIIllllI[lIlIlIIlllll[2]]);
            return lIlIlIIlllll[0];
        }
        nearest.interact(lIlIlIIllllI[lIlIlIIlllll[3]]);
        return lIlIlIIlllll[1];
    }

    private static boolean llIlllIllIIIII(int i) {
        return i != 0;
    }

    private static boolean llIlllIllIIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        llIlllIlIlllIl();
        llIlllIlIlllII();
    }

    private static boolean llIlllIlIllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlllIllIIIIl(Object obj) {
        return obj == null;
    }

    private static String llIlllIlIllIlI(String lllllllllllllllIllIlIIIlIIllIlll, String lllllllllllllllIllIlIIIlIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIlIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlllll[2], lllllllllllllllIllIlIIIlIIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIlIIlllIII) {
            lllllllllllllllIllIlIIIlIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String llIlllIlIllIll(String lllllllllllllllIllIlIIIlIIIlIIlI, String lllllllllllllllIllIlIIIlIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIlllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIlllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIIlIIIlIIll) {
            lllllllllllllllIllIlIIIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIlllIlIllIIl(String lllllllllllllllIllIlIIIlIIlIIlll, String lllllllllllllllIllIlIIIlIIlIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIIlIIlIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIIIlIIlIIllI.toCharArray();
        int lllllllllllllllIllIlIIIlIIlIIIll = lIlIlIIlllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlllll[0];
        while (llIlllIllIIIlI(i, length)) {
            lllllllllllllllIllIlIIIlIIlIIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIlIIIlIIlIIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIlIIIlIIlIIIll++;
            i++;
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIIIlIIlIIlIl);
    }
}
