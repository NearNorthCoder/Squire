package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Entering PNM", priority = 500, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aA  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aA.class */
public class aA extends D {
    private static final /* synthetic */ Logger eI;
    private static /* synthetic */ String[] llllIIIlIIll;
    private static /* synthetic */ int[] llllIIIlIlIl;

    @Inject
    protected aA(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static void lIIIllllIIIlIII() {
        llllIIIlIlIl = new int[7];
        llllIIIlIlIl[0] = (199 ^ 132) & ((243 ^ 176) ^ (-1));
        llllIIIlIlIl[1] = " ".length();
        llllIIIlIlIl[2] = "  ".length();
        llllIIIlIlIl[3] = "   ".length();
        llllIIIlIlIl[4] = (230 ^ 165) ^ (90 ^ 29);
        llllIIIlIlIl[5] = (202 ^ 144) ^ (42 ^ 117);
        llllIIIlIlIl[6] = (20 ^ 42) ^ (22 ^ 32);
    }

    private static void lIIIllllIIIIlII() {
        llllIIIlIIll = new String[llllIIIlIlIl[5]];
        llllIIIlIIll[llllIIIlIlIl[0]] = lIIIllllIIIIIIl("IgCEpJvFLhPsgjrgI70xNQMZcqnUSq4O", "OMNNC");
        llllIIIlIIll[llllIIIlIlIl[1]] = lIIIllllIIIIIlI("szrDifS+I9g2ihvmLZrC8g==", "XIIjF");
        llllIIIlIIll[llllIIIlIlIl[2]] = lIIIllllIIIIIIl("Bbnw3ZoAwn+hcVQVhzULSTSqIp+fqAShELSXgUc7LfE=", "yUJoz");
        llllIIIlIIll[llllIIIlIlIl[3]] = lIIIllllIIIIIll("LAEjOzhFFTg6Pg==", "hsJUS");
        llllIIIlIIll[llllIIIlIlIl[4]] = lIIIllllIIIIIlI("LviZXW+jjUeHcMsJQya1+B7fKI7iijWp", "kNhIR");
    }

    private static String lIIIllllIIIIIll(String lllllllllllllllIIllIIIIIIIIIIIII, String lllllllllllllllIIlIlllllllllllll) {
        String lllllllllllllllIIllIIIIIIIIIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllllllllllll.toCharArray();
        int lllllllllllllllIIlIlllllllllllII = llllIIIlIlIl[0];
        char[] charArray2 = lllllllllllllllIIllIIIIIIIIIIIII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIlIlIl[0];
        while (lIIIllllIIIllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlllllllllllII % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllllllllllII++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllllIIIlIIl(this.cV.assistantMode() ? 1 : 0) && !lIIIllllIIIlIIl(this.cW.ad() ? 1 : 0)) {
            if ((!lIIIllllIIIlIIl(this.cV.useFireSpells() ? 1 : 0) || !lIIIllllIIIlIIl(this.cW.av() ? 1 : 0)) && !lIIIllllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                if (!lIIIllllIIIlIlI(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[0]]) ? 1 : 0) || lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[1]]) ? 1 : 0)) {
                    Dialog.chooseOption(llllIIIlIlIl[1]);
                    "".length();
                    return llllIIIlIlIl[1];
                } else if (lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[2]]) ? 1 : 0)) {
                    Dialog.chooseOption(llllIIIlIlIl[2]);
                    "".length();
                    return llllIIIlIlIl[1];
                } else {
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        return tileObject.getName().contains(llllIIIlIIll[llllIIIlIlIl[4]]);
                    });
                    if (lIIIllllIIIlIll(nearest)) {
                        nearest.interact(llllIIIlIIll[llllIIIlIlIl[3]]);
                        return llllIIIlIlIl[1];
                    }
                    return llllIIIlIlIl[0];
                }
            }
            return llllIIIlIlIl[0];
        }
        return llllIIIlIlIl[0];
    }

    private static String lIIIllllIIIIIlI(String lllllllllllllllIIllIIIIIIIIlIIII, String lllllllllllllllIIllIIIIIIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIIIIlIIIl) {
            lllllllllllllllIIllIIIIIIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllllIIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIllllIIIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIllllIIIllII(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllllIIIIIIl(String lllllllllllllllIIllIIIIIIIIlllIl, String lllllllllllllllIIllIIIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIlIl[2], lllllllllllllllIIllIIIIIIIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIIIIllllI) {
            lllllllllllllllIIllIIIIIIIIllllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllllIIIlIII();
        lIIIllllIIIIlII();
        eI = LoggerFactory.getLogger(aA.class);
    }
}
