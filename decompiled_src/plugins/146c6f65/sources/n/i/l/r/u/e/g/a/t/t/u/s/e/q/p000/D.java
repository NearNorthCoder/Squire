package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Dropping some fish", blocking = true, priority = 10)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.D  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/D.class */
public class D extends AbstractC0013n {
    private static /* synthetic */ String[] llIIllIlllll;
    private static /* synthetic */ int[] llIIlllIIIII;

    private static boolean lllllllIlIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (lllllllIlIIlll(this.ba.A() ? 1 : 0) && lllllllIlIIlll(this.ba.V().av().e(local.getWorldLocation()) ? 1 : 0) && !lllllllIlIIlll(local.isMoving() ? 1 : 0)) {
            if (lllllllIlIlIII(this.ba.V().av().e(local.getWorldLocation()) ? 1 : 0)) {
                this.ba.a(this.ba.V().av(), local.getWorldLocation());
                "".length();
                return llIIlllIIIII[2];
            }
            List<Item> b = this.ba.b(EnumC0008i.FISH);
            if (lllllllIlIIlll(b.isEmpty() ? 1 : 0)) {
                return llIIlllIIIII[1];
            }
            C0007h V = this.ba.V();
            int i = llIIlllIIIII[3];
            int i2 = llIIlllIIIII[1];
            for (Item item : b) {
                i2++;
                if (lllllllIlIlIIl(i2, llIIlllIIIII[3])) {
                    return llIIlllIIIII[2];
                }
                item.interact(llIIllIlllll[llIIlllIIIII[1]]);
                V.av().k(llIIlllIIIII[2]);
                "".length();
                if ((((((184 + 154) - 223) + 85) ^ (((139 + 15) - 27) + 28)) & (((109 ^ 60) ^ "  ".length()) ^ (-" ".length()))) != 0) {
                    return ((46 ^ 33) ^ (151 ^ 147)) & (((99 ^ 72) ^ (96 ^ 64)) ^ (-" ".length()));
                }
            }
            return llIIlllIIIII[1];
        }
        return llIIlllIIIII[1];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIIIII[0]];
        enumC0003dArr[llIIlllIIIII[1]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIIlllIIIII[2]] = EnumC0003d.CREATING_T3_STAFF;
    }

    private static boolean lllllllIlIlIIl(int i, int i2) {
        return i > i2;
    }

    private static void lllllllIlIIlIl() {
        llIIllIlllll = new String[llIIlllIIIII[2]];
        llIIllIlllll[llIIlllIIIII[1]] = lllllllIlIIlII("jbyJouiJ5Ek=", "sQtRf");
    }

    private static void lllllllIlIIllI() {
        llIIlllIIIII = new int[4];
        llIIlllIIIII[0] = "  ".length();
        llIIlllIIIII[1] = ((15 ^ 16) ^ (45 ^ 125)) & (((((66 + 208) - 246) + 200) ^ (((122 + 160) - 176) + 65)) ^ (-" ".length()));
        llIIlllIIIII[2] = " ".length();
        llIIlllIIIII[3] = 49 ^ 55;
    }

    static {
        lllllllIlIIllI();
        lllllllIlIIlIl();
    }

    private static boolean lllllllIlIIlll(int i) {
        return i != 0;
    }

    private static String lllllllIlIIlII(String lllllllllllllllIlIIlIIlllllllIII, String lllllllllllllllIlIIlIIllllllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIlllllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIlllllllIlI.init(llIIlllIIIII[0], secretKeySpec);
            return new String(lllllllllllllllIlIIlIIlllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIlllllllIIl) {
            lllllllllllllllIlIIlIIlllllllIIl.printStackTrace();
            return null;
        }
    }
}
