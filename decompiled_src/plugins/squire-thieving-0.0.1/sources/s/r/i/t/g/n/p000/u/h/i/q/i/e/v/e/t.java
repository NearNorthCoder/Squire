package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking antipoison", priority = 2147483646, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.t  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/t.class */
public class t extends s {
    private static /* synthetic */ int[] lIIllIllllIIl;
    private static /* synthetic */ String[] lIIllIllllIII;

    private static String lIllIIIlllllIIl(String llllllllllllllIlllIllIllIlllIIII, String llllllllllllllIlllIllIllIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIllll.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllIlllIIIl) {
            llllllllllllllIlllIllIllIlllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.s
    public boolean l() {
        if (lIllIIIllllllIl(Inventory.contains(item -> {
            return item.getName().contains(lIIllIllllIII[lIIllIllllIIl[3]]);
        }) ? 1 : 0)) {
            Log.error(lIIllIllllIII[lIIllIllllIIl[0]]);
            this.ad.forceStop();
        }
        if (lIllIIIllllllIl(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIllllIIl[0];
        }
        Inventory.getFirst(item2 -> {
            return item2.getName().contains(lIIllIllllIII[lIIllIllllIIl[2]]);
        }).interact(lIIllIllllIII[lIIllIllllIIl[1]]);
        return lIIllIllllIIl[1];
    }

    private static void lIllIIIlllllIll() {
        lIIllIllllIII = new String[lIIllIllllIIl[4]];
        lIIllIllllIII[lIIllIllllIIl[0]] = lIllIIIlllllIIl("IgG3rGgMyM9FCgTw99j+dSQ+f8qwU2AOXX0dA42J1FE=", "VpWll");
        lIIllIllllIII[lIIllIllllIIl[1]] = lIllIIIlllllIlI("gkQJVBQzQpM=", "qmvQb");
        lIIllIllllIII[lIIllIllllIIl[2]] = lIllIIIlllllIlI("UkTprALDmuCzvukh2ps7xw==", "SRePq");
        lIIllIllllIII[lIIllIllllIIl[3]] = lIllIIIlllllIlI("EtmgsD0EE2qC4HNqtQApwg==", "eqvnq");
    }

    @Inject
    public t(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String lIllIIIlllllIlI(String llllllllllllllIlllIllIllIllIIIll, String llllllllllllllIlllIllIllIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllllIIl[2], llllllllllllllIlllIllIllIllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllIllIIlII) {
            llllllllllllllIlllIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllllllIl(int i) {
        return i == 0;
    }

    static {
        lIllIIIllllllII();
        lIllIIIlllllIll();
    }

    private static void lIllIIIllllllII() {
        lIIllIllllIIl = new int[6];
        lIIllIllllIIl[0] = (146 ^ 154) & ((189 ^ 181) ^ (-1));
        lIIllIllllIIl[1] = " ".length();
        lIIllIllllIIl[2] = "  ".length();
        lIIllIllllIIl[3] = "   ".length();
        lIIllIllllIIl[4] = 188 ^ 184;
        lIIllIllllIIl[5] = (221 ^ 143) ^ (250 ^ 160);
    }
}
