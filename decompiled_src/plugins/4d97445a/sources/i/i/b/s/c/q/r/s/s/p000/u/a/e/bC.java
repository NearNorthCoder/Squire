package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Bulk search", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bC  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bC.class */
public class bC extends AbstractC0053bz {
    private static /* synthetic */ String[] lIlllIIII;
    private static /* synthetic */ int[] lIlllIllI;

    private static void lIlIIIlIlll() {
        lIlllIIII = new String[lIlllIllI[3]];
        lIlllIIII[lIlllIllI[0]] = lIIllllllIl("UIZjKds76e3hYAV9MMSaYA==", "vZhYk");
        lIlllIIII[lIlllIllI[1]] = lIIllllllIl("14mI69v6Lx0=", "EzkIj");
        lIlllIIII[lIlllIllI[2]] = lIlIIIlIllI("LSA3Jw==", "oIECk");
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    private static String lIlIIIlIllI(String lIlllIlIIlllIIl, String lIlllIlIIlllIII) {
        String str = new String(Base64.getDecoder().decode(lIlllIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlllIlIIllIllI = lIlllIlIIlllIII.toCharArray();
        int lIlllIlIIllIlIl = lIlllIllI[0];
        char[] charArray = str.toCharArray();
        int lIlllIlIIlIlllI = charArray.length;
        int i2 = lIlllIllI[0];
        while (lIlIIIllIlI(i2, lIlllIlIIlIlllI)) {
            sb.append((char) (charArray[i2] ^ lIlllIlIIllIllI[lIlllIlIIllIlIl % lIlllIlIIllIllI.length]));
            "".length();
            lIlllIlIIllIlIl++;
            i2++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0053bz
    public boolean c(String str, String str2) {
        if (lIlIIIllIIl(str.equals(lIlllIIII[lIlllIllI[1]]) ? 1 : 0) && lIlIIIllIIl(str2.contains(lIlllIIII[lIlllIllI[2]]) ? 1 : 0)) {
            ?? r0 = lIlllIllI[1];
            "".length();
            return 0 != 0 ? ((64 ^ 6) ^ (93 ^ 73)) & (((((99 + 3) - (-30)) + 83) ^ (((8 + 92) - (-20)) + 13)) ^ (-" ".length())) : r0;
        }
        return lIlllIllI[0];
    }

    static {
        lIlIIIllIII();
        lIlIIIlIlll();
    }

    private static boolean lIlIIIllIIl(int i2) {
        return i2 != 0;
    }

    private static void lIlIIIllIII() {
        lIlllIllI = new int[4];
        lIlllIllI[0] = (71 ^ 81) & ((156 ^ 138) ^ (-1));
        lIlllIllI[1] = " ".length();
        lIlllIllI[2] = "  ".length();
        lIlllIllI[3] = "   ".length();
    }

    private static String lIIllllllIl(String lIlllIlIlIIlIIl, String lIlllIlIlIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlIlIIlIll = Cipher.getInstance("Blowfish");
            lIlllIlIlIIlIll.init(lIlllIllI[2], secretKeySpec);
            return new String(lIlllIlIlIIlIll.doFinal(Base64.getDecoder().decode(lIlllIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlIlIIlIlI) {
            lIlllIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIlI(int i2, int i3) {
        return i2 < i3;
    }

    @Inject
    public bC(Client client, ExecutorService executorService) {
        super(client, executorService, lIlllIIII[lIlllIllI[0]]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lIlllIllI[0];
    }
}
