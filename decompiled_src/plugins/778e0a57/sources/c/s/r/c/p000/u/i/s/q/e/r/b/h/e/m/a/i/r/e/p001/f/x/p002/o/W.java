package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Setting up raid", priority = 20000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.W  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/W.class */
public class W extends U {
    private static /* synthetic */ int[] lIlIIllIIIIl;
    private static /* synthetic */ String[] lIlIIlIllIlI;

    private static boolean llIllIIlllllll(int i) {
        return i == 0;
    }

    private static boolean llIllIlIIIIIII(int i) {
        return i != 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllIIlllllll(C0046u.bf() ? 1 : 0)) {
            ?? r0 = lIlIIllIIIIl[1];
            "".length();
            return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIllIIIIl[0];
    }

    private static void llIllIIllIIlII() {
        lIlIIlIllIlI = new String[lIlIIllIIIIl[6]];
        lIlIIlIllIlI[lIlIIllIIIIl[0]] = llIllIIllIIIIl("ABQxJwpiBT4rRDAQPypK", "BqVNd");
        lIlIIlIllIlI[lIlIIllIIIIl[1]] = llIllIIllIIIlI("xIkk006zszBRPJCYzG5EYQ==", "dPLGA");
        lIlIIlIllIlI[lIlIIllIIIIl[4]] = llIllIIllIIIIl("Fi4MGDI7NVkSPzslWRYjITUWGg==", "UAytV");
        lIlIIlIllIlI[lIlIIllIIIIl[5]] = llIllIIllIIIll("89+tNCRAitgm0cV3g4CzFA==", "Veogb");
    }

    static {
        llIllIIllllllI();
        llIllIIllIIlII();
    }

    private static String llIllIIllIIIlI(String lllllllllllllllIllIllIIIllllIIIl, String lllllllllllllllIllIllIIIllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIllllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIllllIIll.init(lIlIIllIIIIl[4], lllllllllllllllIllIllIIIllllIlII);
            return new String(lllllllllllllllIllIllIIIllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIllllIIlI) {
            lllllllllllllllIllIllIIIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static String llIllIIllIIIIl(String lllllllllllllllIllIllIIlIIIIIllI, String lllllllllllllllIllIllIIlIIIIIlIl) {
        String lllllllllllllllIllIllIIlIIIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIlIIIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIIlIIIIIlIl.toCharArray();
        int lllllllllllllllIllIllIIlIIIIIIlI = lIlIIllIIIIl[0];
        char[] charArray2 = lllllllllllllllIllIllIIlIIIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIIIIl[0];
        while (llIllIlIIIIIlI(i, length)) {
            lllllllllllllllIllIllIIlIIIIIlII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIIlIIIIIIlI % charArray.length]));
            "".length();
            lllllllllllllllIllIllIIlIIIIIIlI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllIIlIIIIIlII);
    }

    private static String llIllIIllIIIll(String lllllllllllllllIllIllIIIlllIIlII, String lllllllllllllllIllIllIIIlllIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIIl[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIllIIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIlllIIlIl) {
            lllllllllllllllIllIllIIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (!llIllIIlllllll(ck() ? 1 : 0) && !llIllIlIIIIIII(this.co.G() ? 1 : 0)) {
            if (llIllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0) && llIllIlIIIIIII(Dialog.hasOption(lIlIIlIllIlI[lIlIIllIIIIl[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIllIIIIl[1]];
                strArr[lIlIIllIIIIl[0]] = lIlIIlIllIlI[lIlIIllIIIIl[1]];
                Dialog.chooseOption(strArr);
                "".length();
                System.out.println("[StartRaid] Starting raid, layout: " + String.valueOf(aa.e()));
                return lIlIIllIIIIl[1];
            }
            Widget widget = Widgets.get(lIlIIllIIIIl[2], lIlIIllIIIIl[3]);
            if (llIllIlIIIIIIl(widget)) {
                System.out.println(lIlIIlIllIlI[lIlIIllIIIIl[4]]);
                return lIlIIllIIIIl[0];
            }
            this.co.b(C0044s.ba());
            this.co.a(C0044s.bc());
            this.co.c(C0044s.bb());
            this.co.d(C0044s.b(C0044s.aZ()));
            widget.interact(lIlIIlIllIlI[lIlIIllIIIIl[5]]);
            sleep(this.cr.nextInt(lIlIIllIIIIl[4]) + lIlIIllIIIIl[1]);
            return lIlIIllIIIIl[1];
        }
        return lIlIIllIIIIl[0];
    }

    @Inject
    protected W(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIllIIllllllI() {
        lIlIIllIIIIl = new int[8];
        lIlIIllIIIIl[0] = (43 ^ 1) & ((15 ^ 37) ^ (-1));
        lIlIIllIIIIl[1] = " ".length();
        lIlIIllIIIIl[2] = (-((-8357) & 32431)) & (-8193) & 32766;
        lIlIIllIIIIl[3] = 152 ^ 150;
        lIlIIllIIIIl[4] = "  ".length();
        lIlIIllIIIIl[5] = "   ".length();
        lIlIIllIIIIl[6] = (((87 + 5) - (-50)) + 39) ^ (((31 + 145) - 160) + 161);
        lIlIIllIIIIl[7] = 7 ^ 15;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIlIIIIIIl(Object obj) {
        return obj == null;
    }
}
