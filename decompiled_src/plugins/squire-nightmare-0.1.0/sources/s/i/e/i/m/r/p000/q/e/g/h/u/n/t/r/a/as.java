package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Using imbued heart", priority = 6)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.as  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/as.class */
public class as extends C {
    private static /* synthetic */ int[] llllIIllllIl;
    private static /* synthetic */ String[] llllIIllllII;

    private static boolean lIIlIIIIIIlIlll(int i) {
        return i != 0;
    }

    private static String lIIlIIIIIIlIlII(String lllllllllllllllIIlIlllIIIIIIlIII, String lllllllllllllllIIlIlllIIIIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), llllIIllllIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIllllIl[1], lllllllllllllllIIlIlllIIIIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIIIlIIl) {
            lllllllllllllllIIlIlllIIIIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIIIIlIllI();
        lIIlIIIIIIlIlIl();
    }

    private static void lIIlIIIIIIlIlIl() {
        llllIIllllII = new String[llllIIllllIl[3]];
        llllIIllllII[llllIIllllIl[0]] = lIIlIIIIIIlIlII("jTFyiDbcvh3Eh1dhgCJY/w==", "tmJyl");
    }

    @Inject
    protected as(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void lIIlIIIIIIlIllI() {
        llllIIllllIl = new int[7];
        llllIIllllIl[0] = ((((1 + 82) - 49) + 144) ^ (((102 + 6) - (-18)) + 24)) & (((((60 + 97) - 79) + 69) ^ (((102 + 86) - 82) + 77)) ^ (-" ".length()));
        llllIIllllIl[1] = "  ".length();
        llllIIllllIl[2] = (-1548) & 22271;
        llllIIllllIl[3] = " ".length();
        llllIIllllIl[4] = (-" ".length()) & (-4101) & 31741;
        llllIIllllIl[5] = (-((-5457) & 5983)) & (-24577) & 30463;
        llllIIllllIl[6] = 172 ^ 164;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (lIIlIIIIIIlIlll(bZ() ? 1 : 0) && lIIlIIIIIIllIII(Magic.canCast(necromancy) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        int[] iArr = new int[llllIIllllIl[1]];
        iArr[llllIIllllIl[0]] = llllIIllllIl[2];
        iArr[llllIIllllIl[3]] = llllIIllllIl[4];
        Item first = Inventory.getFirst(iArr);
        if (!lIIlIIIIIIllIIl(first) && !lIIlIIIIIIllIlI(Vars.getBit(llllIIllllIl[5]))) {
            first.interact(llllIIllllII[llllIIllllIl[0]]);
            return llllIIllllIl[3];
        }
        return llllIIllllIl[0];
    }

    private static boolean lIIlIIIIIIllIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIIIllIlI(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIIIIllIIl(Object obj) {
        return obj == null;
    }
}
