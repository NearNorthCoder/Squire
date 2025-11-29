package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Thralls;
@TaskDesc(name = "Using thrall", priority = 4999)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.D  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/D.class */
public class D extends AbstractC0000a {
    private static /* synthetic */ String[] lIlIlIIllllII;
    private static /* synthetic */ int[] lIlIlIIllllIl;

    private static void lIlllllIIlIIIII() {
        lIlIlIIllllII = new String[lIlIlIIllllIl[2]];
        lIlIlIIllllII[lIlIlIIllllIl[0]] = lIlllllIIIlllll("q7c1uFPfpxfUBkk3hwE7UQ==", "Wfmci");
        lIlIlIIllllII[lIlIlIIllllIl[1]] = lIlllllIIIlllll("p18Pi7GtptE=", "bYJnG");
    }

    @Inject
    protected D(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
    }

    private static String lIlllllIIIlllll(String llllllllllllllIllIlIlllIIIIIllII, String llllllllllllllIllIlIlllIIIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIlIIllllIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIllllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIIIIIllIl) {
            llllllllllllllIllIlIlllIIIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIIlIIIIl();
        lIlllllIIlIIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        if (!lIlllllIIlIIIlI(Thralls.canUse() ? 1 : 0) && !lIlllllIIlIIIll(NPCs.getNearest(npc -> {
            if (lIlllllIIlIIlII(npc.getName().equalsIgnoreCase(lIlIlIIllllII[lIlIlIIllllIl[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIllllIl[1]];
                strArr[lIlIlIIllllIl[0]] = lIlIlIIllllII[lIlIlIIllllIl[1]];
                if (lIlllllIIlIIlII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIllllIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIIllllIl[0];
        })) && !lIlllllIIlIIIll(Players.getLocal())) {
            return Thralls.useBestThrall();
        }
        return lIlIlIIllllIl[0];
    }

    private static boolean lIlllllIIlIIIll(Object obj) {
        return obj == null;
    }

    private static void lIlllllIIlIIIIl() {
        lIlIlIIllllIl = new int[4];
        lIlIlIIllllIl[0] = (125 ^ 102) & ((147 ^ 136) ^ (-1));
        lIlIlIIllllIl[1] = " ".length();
        lIlIlIIllllIl[2] = "  ".length();
        lIlIlIIllllIl[3] = (((65 + 7) - 12) + 76) ^ (((37 + 117) - 143) + 117);
    }

    private static boolean lIlllllIIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIlllllIIlIIIlI(int i) {
        return i == 0;
    }
}
