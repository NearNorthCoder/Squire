package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@Singleton
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/a.class */
public class a {
    private static /* synthetic */ int[] lIllIIllIllIl;
    private /* synthetic */ int l;
    private final /* synthetic */ SquireZeahRunecrafter k;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ int j;
    private static /* synthetic */ String[] lIllIIllIlIll;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ int f0h;

    private static boolean llIIIllIllIlIll(Object obj) {
        return obj == null;
    }

    public int j() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public void a(String str) {
        if (llIIIllIllIlIll(str)) {
            c(lIllIIllIllIl[3]);
            return;
        }
        try {
            c(b(str));
            this.k.a((boolean) lIllIIllIllIl[0]);
            "".length();
            if ("   ".length() <= 0) {
            }
        } catch (NumberFormatException e) {
            c(lIllIIllIllIl[3]);
        }
    }

    private static boolean llIIIllIllIllII(int i2, int i3) {
        return i2 < i3;
    }

    public int h() {
        return lIllIIllIllIl[5] - i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private void e() {
        this.k.a((boolean) lIllIIllIllIl[0]);
        c(lIllIIllIllIl[1]);
    }

    static {
        llIIIllIllIIlll();
        llIIIllIlIlllll();
        i = lIllIIllIllIl[5];
        j = lIllIIllIllIl[10];
        f0h = lIllIIllIllIl[3];
    }

    private static String llIIIllIlIllllI(String llllllllllllllIllIIlIIIlIllllIII, String llllllllllllllIllIIlIIIlIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lIllIIllIllIl[11]), "DES");
            Cipher llllllllllllllIllIIlIIIlIllllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIIlIllllIlI.init(lIllIIllIllIl[4], secretKeySpec);
            return new String(llllllllllllllIllIIlIIIlIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIlIllllIIl) {
            llllllllllllllIllIIlIIIlIllllIIl.printStackTrace();
            return null;
        }
    }

    private int b(String str) {
        return Integer.parseInt(str.split(lIllIIllIlIll[lIllIIllIllIl[0]])[lIllIIllIllIl[1]].split(lIllIIllIlIll[lIllIIllIllIl[4]])[lIllIIllIllIl[0]]);
    }

    private static String llIIIllIlIlllIl(String llllllllllllllIllIIlIIIllIIIllIl, String llllllllllllllIllIIlIIIllIIIllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIIllIIIlIll = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIIIllIIIllII.toCharArray();
        int llllllllllllllIllIIlIIIllIIIlIIl = lIllIIllIllIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIIlIIIllIIIIIIl = lIllIIllIllIl[1];
        while (llIIIllIllIllII(llllllllllllllIllIIlIIIllIIIIIIl, length)) {
            char llllllllllllllIllIIlIIIllIIIlllI = charArray2[llllllllllllllIllIIlIIIllIIIIIIl];
            llllllllllllllIllIIlIIIllIIIlIll.append((char) (llllllllllllllIllIIlIIIllIIIlllI ^ charArray[llllllllllllllIllIIlIIIllIIIlIIl % charArray.length]));
            "".length();
            llllllllllllllIllIIlIIIllIIIlIIl++;
            llllllllllllllIllIIlIIIllIIIIIIl++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIIllIIIlIll);
    }

    @Inject
    public a(SquireZeahRunecrafter squireZeahRunecrafter) {
        this.k = squireZeahRunecrafter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean f() {
        if (llIIIllIllIlIlI(Widgets.get(WidgetInfo.DIALOG_SPRITE_TEXT))) {
            ?? r0 = lIllIIllIllIl[0];
            "".length();
            return " ".length() == ((58 ^ 26) & ((31 ^ 63) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllIllIl[1];
    }

    private static boolean llIIIllIllIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIllIllIlIII(int i2) {
        return i2 == 0;
    }

    private int i() {
        int llllllllllllllIllIIlIIIllIIllIII = lIllIIllIllIl[1];
        int[] iArr = new int[lIllIIllIllIl[0]];
        iArr[lIllIIllIllIl[1]] = lIllIIllIllIl[6];
        if (llIIIllIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            llllllllllllllIllIIlIIIllIIllIII += 4;
        }
        if (llIIIllIllIlIIl(Inventory.contains(item -> {
            return item.getName().contains(lIllIIllIlIll[lIllIIllIllIl[9]]);
        }) ? 1 : 0)) {
            llllllllllllllIllIIlIIIllIIllIII += 4;
        }
        int[] iArr2 = new int[lIllIIllIllIl[0]];
        iArr2[lIllIIllIllIl[1]] = lIllIIllIllIl[7];
        if (llIIIllIllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            llllllllllllllIllIIlIIIllIIllIII += 4;
        }
        int[] iArr3 = new int[lIllIIllIllIl[0]];
        iArr3[lIllIIllIllIl[1]] = lIllIIllIllIl[8];
        if (llIIIllIllIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
            llllllllllllllIllIIlIIIllIIllIII += 4;
        }
        return llllllllllllllIllIIlIIIllIIllIII;
    }

    public void c(int i2) {
        this.l = i2;
    }

    public void d() {
        int[] iArr = new int[lIllIIllIllIl[0]];
        iArr[lIllIIllIllIl[1]] = lIllIIllIllIl[2];
        if (llIIIllIllIlIII(Inventory.contains(iArr) ? 1 : 0)) {
            e();
        } else if (llIIIllIllIlIIl(f() ? 1 : 0)) {
            a(Widgets.get(WidgetInfo.DIALOG_SPRITE_TEXT).getText());
        } else {
            g();
        }
    }

    private static void llIIIllIllIIlll() {
        lIllIIllIllIl = new int[12];
        lIllIIllIllIl[0] = " ".length();
        lIllIIllIllIl[1] = ((3 ^ 69) ^ (8 ^ 6)) & (((((31 + 38) - (-85)) + 58) ^ (((84 + 35) - 106) + 143)) ^ (-" ".length()));
        lIllIIllIllIl[2] = (-(((207 + 30) - 55) + 48)) & (-8209) & 16375;
        lIllIIllIllIl[3] = -(19 ^ 22);
        lIllIIllIllIl[4] = "  ".length();
        lIllIIllIllIl[5] = 216 ^ 180;
        lIllIIllIllIl[6] = (-10443) & 11007;
        lIllIIllIllIl[7] = (-2209) & 28598;
        lIllIIllIllIl[8] = (-(35 ^ 64)) & (-4101) & 30590;
        lIllIIllIllIl[9] = "   ".length();
        lIllIIllIllIl[10] = 115 ^ 119;
        lIllIIllIllIl[11] = 156 ^ 148;
    }

    private static boolean llIIIllIllIlIIl(int i2) {
        return i2 != 0;
    }

    private void g() {
        int[] iArr = new int[lIllIIllIllIl[0]];
        iArr[lIllIIllIllIl[1]] = lIllIIllIllIl[2];
        Inventory.getFirst(iArr).interact(lIllIIllIlIll[lIllIIllIllIl[1]]);
    }

    private static void llIIIllIlIlllll() {
        lIllIIllIlIll = new String[lIllIIllIllIl[10]];
        lIllIIllIlIll[lIllIIllIllIl[1]] = llIIIllIlIlllIl("KhYfFyc=", "iyjyS");
        lIllIIllIlIll[lIllIIllIllIl[0]] = llIIIllIlIllllI("Ju4RnNzcEDk=", "ZVtms");
        lIllIIllIlIll[lIllIIllIllIl[4]] = llIIIllIlIlllIl("GyhM", "oGlVZ");
        lIllIIllIlIll[lIllIIllIllIl[9]] = llIIIllIlIlllIl("ByMZKSwPLw==", "wJzBM");
    }
}
