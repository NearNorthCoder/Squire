package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attack Boss", priority = 4000, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.m  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/m.class */
public class m extends a {
    private /* synthetic */ List<Widget> X;
    private static /* synthetic */ String[] lIIlIlIllllII;
    private static /* synthetic */ int W;
    private static /* synthetic */ int[] lIIlIlIllllIl;

    private static boolean lIlIllIIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        int i;
        Actor interacting = Players.getLocal().getInteracting();
        if (lIlIllIIlIIIIll(interacting)) {
            String str = lIIlIlIllllII[lIIlIlIllllIl[0]];
            if (lIlIllIIlIIIlII(interacting.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                i = lIIlIlIllllIl[1];
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                if (lIlIllIIlIIIlII(i) && !lIlIllIIlIIIlII(this.f.isDead() ? 1 : 0)) {
                    this.f.interact(lIIlIlIllllII[lIIlIlIllllIl[1]]);
                    return lIIlIlIllllIl[1];
                }
                return lIIlIlIllllIl[0];
            }
        }
        i = lIIlIlIllllIl[0];
        if (lIlIllIIlIIIlII(i)) {
            return lIIlIlIllllIl[0];
        }
        this.f.interact(lIIlIlIllllII[lIIlIlIllllIl[1]]);
        return lIIlIlIllllIl[1];
    }

    private static void lIlIllIIlIIIIlI() {
        lIIlIlIllllIl = new int[5];
        lIIlIlIllllIl[0] = (38 ^ 105) & ((122 ^ 53) ^ (-1));
        lIIlIlIllllIl[1] = " ".length();
        lIIlIlIllllIl[2] = (-((-11299) & 31991)) & (-2337) & 54614527;
        lIIlIlIllllIl[3] = "  ".length();
        lIIlIlIllllIl[4] = 80 ^ 88;
    }

    private static boolean lIlIllIIlIIIIll(Object obj) {
        return obj != null;
    }

    static {
        lIlIllIIlIIIIlI();
        lIlIllIIlIIIIIl();
        W = lIIlIlIllllIl[2];
    }

    @Inject
    protected m(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
        this.X = new ArrayList();
    }

    private static String lIlIllIIIllllll(String llllllllllllllIllllIllIIlIllIIlI, String llllllllllllllIllllIllIIlIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIllllIl[4]), "DES");
            Cipher llllllllllllllIllllIllIIlIllIlII = Cipher.getInstance("DES");
            llllllllllllllIllllIllIIlIllIlII.init(lIIlIlIllllIl[3], llllllllllllllIllllIllIIlIllIlIl);
            return new String(llllllllllllllIllllIllIIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIlIllIIll) {
            llllllllllllllIllllIllIIlIllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIlIIIIIl() {
        lIIlIlIllllII = new String[lIIlIlIllllIl[3]];
        lIIlIlIllllII[lIIlIlIllllIl[0]] = lIlIllIIIllllll("vFWrFmI/Pug=", "Corbc");
        lIIlIlIllllII[lIIlIlIllllIl[1]] = lIlIllIIlIIIIII("KBY8JSQC", "ibHDG");
    }

    private static String lIlIllIIlIIIIII(String llllllllllllllIllllIllIIlIlIIIlI, String llllllllllllllIllllIllIIlIIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIllIIlIIlllll = llllllllllllllIllllIllIIlIIlllII.toCharArray();
        int llllllllllllllIllllIllIIlIIllllI = lIIlIlIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIllllIl[0];
        while (lIlIllIIlIIIlIl(i, length)) {
            char llllllllllllllIllllIllIIlIlIIIll = charArray[i];
            sb.append((char) (llllllllllllllIllllIllIIlIlIIIll ^ llllllllllllllIllllIllIIlIIlllll[llllllllllllllIllllIllIIlIIllllI % llllllllllllllIllllIllIIlIIlllll.length]));
            "".length();
            llllllllllllllIllllIllIIlIIllllI++;
            i++;
            "".length();
            if ((-((((54 + 123) - 20) + 26) ^ (((137 + 66) - 176) + 152))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIlIIIlII(int i) {
        return i != 0;
    }
}
