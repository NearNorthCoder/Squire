package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/u.class */
public class u extends AbstractC0000a {
    private /* synthetic */ List<Widget> ap;
    private static /* synthetic */ int[] lIlIlIlIIIIII;
    private static /* synthetic */ int ao;
    private static /* synthetic */ String[] lIlIlIIllllll;

    private static boolean lIlllllIIllIIIl(Object obj) {
        return obj != null;
    }

    private static String lIlllllIIlIllII(String llllllllllllllIllIlIllIllIlIllIl, String llllllllllllllIllIlIllIllIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIllIlIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIIIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIllIlIlllI) {
            llllllllllllllIllIlIllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.AbstractC0000a
    public boolean l() {
        int i;
        int llllllllllllllIllIlIllIllIllIlIl;
        if (lIlllllIIllIIII(this.z ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        if (lIlllllIIllIIII(this.x.getWorldLocation().equals(p) ? 1 : 0) && lIlllllIIllIIII(this.x.getWorldLocation().equals(q) ? 1 : 0) && lIlllllIIllIIII(this.x.getWorldLocation().equals(f0r) ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (lIlllllIIllIIIl(interacting)) {
            String str = lIlIlIIllllll[lIlIlIlIIIIII[0]];
            if (lIlllllIIllIIlI(interacting.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                i = lIlIlIlIIIIII[1];
                "".length();
                if (" ".length() <= ((130 ^ 177) & ((104 ^ 91) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                llllllllllllllIllIlIllIllIllIlIl = i;
                if (lIlllllIIllIIlI(llllllllllllllIllIlIllIllIllIlIl) && lIlllllIIllIIlI(this.y.getWorldArea().getMeleeTiles(this.w).contains(this.x.getWorldLocation()) ? 1 : 0)) {
                    this.y.interact(lIlIlIIllllll[lIlIlIlIIIIII[1]]);
                    return lIlIlIlIIIIII[1];
                }
                return lIlIlIlIIIIII[0];
            }
        }
        i = lIlIlIlIIIIII[0];
        llllllllllllllIllIlIllIllIllIlIl = i;
        if (lIlllllIIllIIlI(llllllllllllllIllIlIllIllIllIlIl)) {
            return lIlIlIlIIIIII[0];
        }
        this.y.interact(lIlIlIIllllll[lIlIlIlIIIIII[1]]);
        return lIlIlIlIIIIII[1];
    }

    private static void lIlllllIIlIllll() {
        lIlIlIlIIIIII = new int[5];
        lIlIlIlIIIIII[0] = (203 ^ 147) & ((52 ^ 108) ^ (-1));
        lIlIlIlIIIIII[1] = " ".length();
        lIlIlIlIIIIII[2] = (-((-4339) & 21491)) & (-12325) & 54620975;
        lIlIlIlIIIIII[3] = "  ".length();
        lIlIlIlIIIIII[4] = 165 ^ 173;
    }

    private static String lIlllllIIlIllIl(String llllllllllllllIllIlIllIllIIlllIl, String llllllllllllllIllIlIllIllIIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIllIllIIlllII.toCharArray();
        int llllllllllllllIllIlIllIllIIllIIl = lIlIlIlIIIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIlIllIllIIlIIIl = lIlIlIlIIIIII[0];
        while (lIlllllIIllIIll(llllllllllllllIllIlIllIllIIlIIIl, length)) {
            char llllllllllllllIllIlIllIllIIllllI = charArray2[llllllllllllllIllIlIllIllIIlIIIl];
            sb.append((char) (llllllllllllllIllIlIllIllIIllllI ^ charArray[llllllllllllllIllIlIllIllIIllIIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIllIllIIllIIl++;
            llllllllllllllIllIlIllIllIIlIIIl++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllllIIllIIlI(int i) {
        return i != 0;
    }

    @Inject
    protected u(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, C0004e c0004e, C0001b c0001b, Client client) {
        super(squireVardorvis, squireVardorvisConfig, c0004e, c0001b, client);
        this.ap = new ArrayList();
    }

    private static void lIlllllIIlIlllI() {
        lIlIlIIllllll = new String[lIlIlIlIIIIII[3]];
        lIlIlIIllllll[lIlIlIlIIIIII[0]] = lIlllllIIlIllII("2vKoLSdNjxA=", "nhXvd");
        lIlIlIIllllll[lIlIlIlIIIIII[1]] = lIlllllIIlIllIl("FiQgJxE8", "WPTFr");
    }

    private static boolean lIlllllIIllIIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIlllllIIlIllll();
        lIlllllIIlIlllI();
        ao = lIlIlIlIIIIII[2];
    }

    private static boolean lIlllllIIllIIII(int i) {
        return i == 0;
    }
}
