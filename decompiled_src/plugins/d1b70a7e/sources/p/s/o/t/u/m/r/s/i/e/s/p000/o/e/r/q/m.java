package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Repairing mast", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.m  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/m.class */
public class m extends l {
    private static /* synthetic */ String[] lIIllIlllIlll;
    private static /* synthetic */ int[] lIIllIllllIIl;

    private static boolean lIllIIIlllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlllIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIllIIIllIllIIl(String llllllllllllllIlllIllIllIllIIIll, String llllllllllllllIlllIllIllIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher llllllllllllllIlllIllIllIllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIllIllIIlIl.init(lIIllIllllIIl[4], secretKeySpec);
            return new String(llllllllllllllIlllIllIllIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllIllIIlII) {
            llllllllllllllIlllIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        TileObject x = this.ar.x();
        if ((lIllIIIllIlllIl(this.ar.L() ? 1 : 0) && lIllIIIllIllllI(x) && lIllIIIllIlllll(this.ar.t() ? 1 : 0) && !lIllIIIlllIIIII(x.distanceTo(Players.getLocal()), lIIllIllllIIl[0])) || lIllIIIllIlllll(this.ar.K() ? 1 : 0)) {
            ?? r0 = lIIllIllllIIl[1];
            "".length();
            return (-" ".length()) > ((78 ^ 47) ^ (102 ^ 3)) ? ((175 ^ 188) ^ (54 ^ 30)) & (((((34 + 80) - (-20)) + 22) ^ (((63 + 68) - 60) + 96)) ^ (-" ".length())) : r0;
        }
        return lIIllIllllIIl[2];
    }

    private static boolean lIllIIIllIlllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        Player local = Players.getLocal();
        SceneEntity nearest = TileObjects.getNearest(tileObject -> {
            String[] strArr = new String[lIIllIllllIIl[1]];
            strArr[lIIllIllllIIl[2]] = lIIllIlllIlll[lIIllIllllIIl[1]];
            if (lIllIIIllIlllll(tileObject.hasAction(strArr) ? 1 : 0) && lIllIIIlllIIIlI(tileObject.distanceTo(local), lIIllIllllIIl[3])) {
                ?? r0 = lIIllIllllIIl[1];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllIllllIIl[2];
        });
        if (lIllIIIlllIIIIl(nearest)) {
            return lIIllIllllIIl[2];
        }
        if (lIllIIIllIlllll(this.au.a((Locatable) nearest) ? 1 : 0)) {
            return this.au.b(nearest);
        }
        nearest.interact(lIIllIlllIlll[lIIllIllllIIl[2]]);
        return lIIllIllllIIl[1];
    }

    private static String lIllIIIllIllIlI(String llllllllllllllIlllIllIllIllllIII, String llllllllllllllIlllIllIllIlllIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIllIlllIlll.toCharArray();
        int llllllllllllllIlllIllIllIlllIlII = lIIllIllllIIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIllllIIl[2];
        while (lIllIIIlllIIIlI(i, length)) {
            char llllllllllllllIlllIllIllIllllIIl = charArray2[i];
            sb.append((char) (llllllllllllllIlllIllIllIllllIIl ^ charArray[llllllllllllllIlllIllIllIlllIlII % charArray.length]));
            "".length();
            llllllllllllllIlllIllIllIlllIlII++;
            i++;
            "".length();
            if ((-" ".length()) >= (((105 ^ 40) ^ (105 ^ 34)) & (((((77 + 95) - 154) + 172) ^ (((144 + 83) - 194) + 147)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIllIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIIlllIIIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected m(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIllllI(Object obj) {
        return obj != null;
    }

    private static void lIllIIIllIllIll() {
        lIIllIlllIlll = new String[lIIllIllllIIl[4]];
        lIIllIlllIlll[lIIllIllllIIl[2]] = lIllIIIllIllIIl("Ofl4DRjZdfQ=", "LDBqY");
        lIIllIlllIlll[lIIllIllllIIl[1]] = lIllIIIllIllIlI("IjAJNB4C", "pUyUw");
    }

    private static void lIllIIIllIlllII() {
        lIIllIllllIIl = new int[6];
        lIIllIllllIIl[0] = 81 ^ 84;
        lIIllIllllIIl[1] = " ".length();
        lIIllIllllIIl[2] = ((15 ^ 116) ^ (70 ^ 115)) & (((133 ^ 180) ^ (((121 + 85) - 180) + 101)) ^ (-" ".length()));
        lIIllIllllIIl[3] = (68 ^ 67) ^ (36 ^ 44);
        lIIllIllllIIl[4] = "  ".length();
        lIIllIllllIIl[5] = 185 ^ 177;
    }

    static {
        lIllIIIllIlllII();
        lIllIIIllIllIll();
    }
}
