package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.util.Log;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.p000.e.s.q.t.i.r.b;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: m.u.a.-.e.s.q.t.i.r.w  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/w.class */
public abstract class w<T extends b> extends Task {
    protected final /* synthetic */ SquireMTA aC;
    private static /* synthetic */ int[] lllIlIlIIllI;
    private static /* synthetic */ String[] lllIlIlIIlIl;
    protected final /* synthetic */ T aB;

    static {
        lIIIllIIIIIIIlI();
        lIIIllIIIIIIIIl();
    }

    private static String lIIIlIlllllllll(String lllllllllllllllIIllIllIIlIIlllII, String lllllllllllllllIIllIllIIlIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIIllIll.getBytes(StandardCharsets.UTF_8)), lllIlIlIIllI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlIIllI[2], lllllllllllllllIIllIllIIlIIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIlIIlllIl) {
            lllllllllllllllIIllIllIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIIIIIIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIllIIIIIIIII(String lllllllllllllllIIllIllIIIlllllll, String lllllllllllllllIIllIllIIIllllllI) {
        String lllllllllllllllIIllIllIIIlllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIIlllllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIIIllllllI.toCharArray();
        int lllllllllllllllIIllIllIIIllllIll = lllIlIlIIllI[0];
        char[] charArray2 = lllllllllllllllIIllIllIIIlllllll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIIllI[0];
        while (lIIIllIIIIIlIIl(i, length)) {
            char lllllllllllllllIIllIllIIlIIIIIII = charArray2[i];
            lllllllllllllllIIllIllIIIlllllIl.append((char) (lllllllllllllllIIllIllIIlIIIIIII ^ charArray[lllllllllllllllIIllIllIIIllllIll % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIIIllllIll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllIIIlllllIl);
    }

    protected void P() {
    }

    private static void lIIIllIIIIIIIlI() {
        lllIlIlIIllI = new int[7];
        lllIlIlIIllI[0] = ((((42 + 171) - 180) + 184) ^ (((122 + 118) - 126) + 30)) & (((((45 + 181) - 14) + 7) ^ (((70 + 58) - 35) + 53)) ^ (-" ".length()));
        lllIlIlIIllI[1] = " ".length();
        lllIlIlIIllI[2] = "  ".length();
        lllIlIlIIllI[3] = "   ".length();
        lllIlIlIIllI[4] = (((41 + 100) - 2) + 37) ^ (((31 + 81) - 48) + 116);
        lllIlIlIIllI[5] = (240 ^ 135) ^ (59 ^ 73);
        lllIlIlIIllI[6] = 28 ^ 20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean run() {
        if (lIIIllIIIIIIIll(this.aB.c() ? 1 : 0)) {
            return O();
        }
        c d = this.aB.d();
        Widget widget = Widgets.get(d.f(), d.h());
        if (lIIIllIIIIIIlII(widget)) {
            return lllIlIlIIllI[0];
        }
        int parseInt = Integer.parseInt(widget.getText().replaceAll(lllIlIlIIlIl[lllIlIlIIllI[0]], lllIlIlIIlIl[lllIlIlIIllI[1]]));
        int d2 = this.aC.d(d);
        this.aC.a(d, parseInt);
        if (lIIIllIIIIIIlIl(parseInt, d2)) {
            Log.info(lllIlIlIIlIl[lllIlIlIIllI[2]]);
            Q();
            return lllIlIlIIllI[1];
        }
        Item first = Inventory.getFirst(this::a);
        if (lIIIllIIIIIIIll(L().canCast() ? 1 : 0)) {
            if (lIIIllIIIIIIllI(first)) {
                first.interact(lllIlIlIIlIl[lllIlIlIIllI[3]]);
                return lllIlIlIIllI[1];
            }
            Q();
            return lllIlIlIIllI[1];
        }
        return M();
    }

    private static boolean lIIIllIIIIIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIllIIIIIIIIl() {
        lllIlIlIIlIl = new String[lllIlIlIIllI[5]];
        lllIlIlIIlIl[lllIlIlIIllI[0]] = lIIIlIllllllllI("KhE68bLQjpY=", "LDnBB");
        lllIlIlIIlIl[lllIlIlIIllI[1]] = lIIIlIllllllllI("MWltfNhOGic=", "zYnuK");
        lllIlIlIIlIl[lllIlIlIIllI[2]] = lIIIlIlllllllll("4kHqB+IUoDX/ohxVjY8MU1PX1ueOJgOym/hJ0feG7II=", "Viycd");
        lllIlIlIIlIl[lllIlIlIIllI[3]] = lIIIllIIIIIIIII("PB0pGyw=", "ktLwH");
        lllIlIlIIlIl[lllIlIlIIllI[4]] = lIIIlIlllllllll("qa3Zu1GWNn5y8eUs/lRFyA==", "CFSVo");
    }

    private static boolean lIIIllIIIIIIllI(Object obj) {
        return obj != null;
    }

    protected void Q() {
        this.aC.a(this.aB.d());
        String[] strArr = new String[lllIlIlIIllI[1]];
        strArr[lllIlIlIIllI[0]] = lllIlIlIIlIl[lllIlIlIIllI[4]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIIllIIIIIIlII(nearest)) {
            return;
        }
        nearest.interact(lllIlIlIIllI[0]);
    }

    private static boolean lIIIllIIIIIIIll(int i) {
        return i == 0;
    }

    public abstract boolean a(Item item);

    public abstract Spell L();

    private static String lIIIlIllllllllI(String lllllllllllllllIIllIllIIlIIIllll, String lllllllllllllllIIllIllIIlIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIlIIlIIII) {
            lllllllllllllllIIllIllIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean O() {
        if (!lIIIllIIIIIIlll(this.aC.c(this.aB.d()), this.aC.d(this.aB.d())) || lIIIllIIIIIlIII(this.aC.b(this.aB.d()) ? 1 : 0)) {
            return lllIlIlIIllI[0];
        }
        String[] strArr = new String[lllIlIlIIllI[1]];
        strArr[lllIlIlIIllI[0]] = this.aB.d().g();
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIIllIIIIIIlII(nearest)) {
            return lllIlIlIIllI[0];
        }
        nearest.interact(lllIlIlIIllI[0]);
        return lllIlIlIIllI[1];
    }

    @Inject
    public w(T t, SquireMTA squireMTA) {
        this.aB = t;
        this.aC = squireMTA;
    }

    private static boolean lIIIllIIIIIlIII(int i) {
        return i != 0;
    }

    public abstract boolean M();
}
