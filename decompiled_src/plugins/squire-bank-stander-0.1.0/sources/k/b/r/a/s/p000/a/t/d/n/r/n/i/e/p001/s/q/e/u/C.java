package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Making Jewelry")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.C  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/C.class */
public class C extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIlIllll;
    private static /* synthetic */ String[] lllIIlIlllI;

    private static boolean lIlIlllIIIllll(int i, int i2) {
        return i == i2;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return lIlIlllIIIllll(this.j.jewelryProduct().H(), lllIIlIllll[0]) ? Map.of(Integer.valueOf(this.j.jewelryProduct().z()), Integer.valueOf(lllIIlIllll[1]), Integer.valueOf(this.j.jewelryProduct().I()), Integer.valueOf(lllIIlIllll[1])) : Map.of(Integer.valueOf(this.j.jewelryProduct().z()), Integer.valueOf(lllIIlIllll[1]), Integer.valueOf(this.j.jewelryProduct().H()), Integer.valueOf(lllIIlIllll[1]), Integer.valueOf(this.j.jewelryProduct().I()), Integer.valueOf(lllIIlIllll[1]));
    }

    private static void lIlIlllIIIlllI() {
        lllIIlIllll = new int[8];
        lllIIlIllll[0] = -" ".length();
        lllIIlIllll[1] = " ".length();
        lllIIlIllll[2] = (((86 + 77) - 160) + 138) ^ (((67 + 54) - 89) + 107);
        lllIIlIllll[3] = (-26689) & 27134;
        lllIIlIllll[4] = ((54 ^ 7) ^ (96 ^ 102)) & (((79 ^ 106) ^ (112 ^ 98)) ^ (-" ".length()));
        lllIIlIllll[5] = (((77 + 23) - 39) + 128) ^ (((51 + 162) - 195) + 166);
        lllIIlIllll[6] = "  ".length();
        lllIIlIllll[7] = (183 ^ 169) ^ (137 ^ 159);
    }

    @Inject
    public C(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.JEWELRY);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlIllll[5];
    }

    static {
        lIlIlllIIIlllI();
        lIlIlllIIIllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        Widget widget = Widgets.get(lllIIlIllll[2], lllIIlIllll[1]);
        Widget widget2 = Widgets.get(lllIIlIllll[3], lllIIlIllll[4]);
        if (lIlIlllIIlIIII(widget)) {
            System.out.println("Group: " + this.j.jewelryProduct().J());
            System.out.println("ID: " + this.j.jewelryProduct().K());
            System.out.println("Option: " + this.j.jewelryProduct().L());
            Widgets.get(this.j.jewelryProduct().J(), this.j.jewelryProduct().K()).interact(this.j.jewelryProduct().L());
        }
        if (lIlIlllIIlIIII(widget2)) {
            System.out.println("Group: " + this.j.jewelryProduct().J());
            System.out.println("ID: " + this.j.jewelryProduct().K());
            System.out.println("Option: " + this.j.jewelryProduct().L());
            Widgets.get(this.j.jewelryProduct().J(), this.j.jewelryProduct().K()).interact(lllIIlIllll[4]);
        }
        if (lIlIlllIIlIIIl(widget) && lIlIlllIIlIIIl(widget2)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIlllIIlIIII(tileObject.getActions())) {
                    String[] strArr = new String[lllIIlIllll[1]];
                    strArr[lllIIlIllll[4]] = lllIIlIlllI[lllIIlIllll[1]];
                    if (lIlIlllIIlIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIlIllll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIlIllll[4];
            });
            if (lIlIlllIIlIIIl(nearest)) {
                return lllIIlIllll[4];
            }
            nearest.interact(lllIIlIlllI[lllIIlIllll[4]]);
        }
        return lllIIlIllll[1];
    }

    private static boolean lIlIlllIIlIIII(Object obj) {
        return obj != null;
    }

    private static void lIlIlllIIIllIl() {
        lllIIlIlllI = new String[lllIIlIllll[6]];
        lllIIlIlllI[lllIIlIllll[4]] = lIlIlllIIIlIll("HyULDhU=", "LHnba");
        lllIIlIlllI[lllIIlIllll[1]] = lIlIlllIIIllII("3gXrEXMAK4Q=", "zFEaG");
    }

    private static String lIlIlllIIIllII(String llllllllllllllllIIlIIlllllIlIIII, String llllllllllllllllIIlIIlllllIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllllIIllll.getBytes(StandardCharsets.UTF_8)), lllIIlIllll[7]), "DES");
            Cipher llllllllllllllllIIlIIlllllIlIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllllIlIIlI.init(lllIIlIllll[6], secretKeySpec);
            return new String(llllllllllllllllIIlIIlllllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllllIlIIIl) {
            llllllllllllllllIIlIIlllllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIIIlIll(String llllllllllllllllIIlIIllllllIIlIl, String llllllllllllllllIIlIIllllllIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllllllIIIll = new StringBuilder();
        char[] llllllllllllllllIIlIIllllllIIIlI = llllllllllllllllIIlIIllllllIIlII.toCharArray();
        int llllllllllllllllIIlIIllllllIIIIl = lllIIlIllll[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIlIllll[4];
        while (lIlIlllIIlIIll(i, length)) {
            char llllllllllllllllIIlIIllllllIIllI = charArray[i];
            llllllllllllllllIIlIIllllllIIIll.append((char) (llllllllllllllllIIlIIllllllIIllI ^ llllllllllllllllIIlIIllllllIIIlI[llllllllllllllllIIlIIllllllIIIIl % llllllllllllllllIIlIIllllllIIIlI.length]));
            "".length();
            llllllllllllllllIIlIIllllllIIIIl++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIllllllIIIll);
    }

    private static boolean lIlIlllIIlIIIl(Object obj) {
        return obj == null;
    }
}
