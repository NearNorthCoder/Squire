package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Bank filling coal bag")
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.Q  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/Q.class */
public class Q extends T<v> {
    private static /* synthetic */ int[] lIIllIlIIllI;
    private static /* synthetic */ String[] lIIllIlIIlIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.T
    public boolean a(v vVar, C0014o c0014o) {
        Item first = Bank.Inventory.getFirst(vVar.I());
        if (llIIllllIllIIl(first)) {
            return lIIllIlIIllI[0];
        }
        String[] strArr = new String[lIIllIlIIllI[1]];
        strArr[lIIllIlIIllI[0]] = lIIllIlIIlIl[lIIllIlIIllI[0]];
        if (llIIllllIllIlI(first.hasAction(strArr) ? 1 : 0)) {
            first.interact(lIIllIlIIlIl[lIIllIlIIllI[1]]);
            return lIIllIlIIllI[0];
        }
        first.interact(lIIllIlIIlIl[lIIllIlIIllI[2]]);
        c0014o.k().u();
        return lIIllIlIIllI[1];
    }

    static {
        llIIllllIllIII();
        llIIllllIlIlll();
    }

    private static void llIIllllIllIII() {
        lIIllIlIIllI = new int[6];
        lIIllIlIIllI[0] = ((90 ^ 19) ^ (35 ^ 115)) & (((139 ^ 149) ^ (13 ^ 10)) ^ (-" ".length()));
        lIIllIlIIllI[1] = " ".length();
        lIIllIlIIllI[2] = "  ".length();
        lIIllIlIIllI[3] = "   ".length();
        lIIllIlIIllI[4] = 106 ^ 110;
        lIIllIlIIllI[5] = (86 ^ 62) ^ (103 ^ 7);
    }

    private static void llIIllllIlIlll() {
        lIIllIlIIlIl = new String[lIIllIlIIllI[4]];
        lIIllIlIIlIl[lIIllIlIIllI[0]] = llIIllllIlIlIl("iLNwO70iQB4=", "eWEpS");
        lIIllIlIIlIl[lIIllIlIIllI[1]] = llIIllllIlIllI("SEmLNKqayCo=", "eqeVJ");
        lIIllIlIIlIl[lIIllIlIIllI[2]] = llIIllllIlIllI("sPZ81qRrXmQ=", "CZoGT");
        lIIllIlIIlIl[lIIllIlIIllI[3]] = llIIllllIlIllI("y2Fmn8ikft8=", "Pxgim");
    }

    private static String llIIllllIlIlIl(String lllllllllllllllIlllIllIlIllIlllI, String lllllllllllllllIlllIllIlIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllIlIllIllll.getBytes(StandardCharsets.UTF_8)), lIIllIlIIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlIIllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIllIlIlllIIIl) {
            lllllllllllllllIlllIllIlIlllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public Q(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, v.class, str -> {
            return str.toLowerCase().contains(lIIllIlIIlIl[lIIllIlIIllI[3]]);
        });
    }

    private static boolean llIIllllIllIIl(Object obj) {
        return obj == null;
    }

    private static String llIIllllIlIllI(String lllllllllllllllIlllIllIlIllIIIll, String lllllllllllllllIlllIllIlIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIllIlIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIllIlIllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIllIlIllIIlIl.init(lIIllIlIIllI[2], lllllllllllllllIlllIllIlIllIIllI);
            return new String(lllllllllllllllIlllIllIlIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIllIlIllIIlII) {
            lllllllllllllllIlllIllIlIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllllIllIlI(int i) {
        return i != 0;
    }
}
