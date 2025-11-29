package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Bulk Cleaning Herbs", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bA  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bA.class */
public class bA extends AbstractC0053bz {
    private static /* synthetic */ String[] llIlllIIl;
    private static /* synthetic */ int[] llIlllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return llIlllIlI[0];
    }

    @Inject
    public bA(Client client, ExecutorService executorService) {
        super(client, executorService, llIlllIIl[llIlllIlI[0]]);
    }

    private static void lIlllllIlII() {
        llIlllIIl = new String[llIlllIlI[2]];
        llIlllIIl[llIlllIlI[0]] = lIlllllIIlI("JyeC2DMXWsyT6UI1HegtXQ==", "RHIJb");
        llIlllIIl[llIlllIlI[1]] = lIlllllIIll("EjNJg7qYVpY=", "ggEuh");
    }

    private static void lIlllllIlIl() {
        llIlllIlI = new int[4];
        llIlllIlI[0] = (18 ^ 70) & ((2 ^ 86) ^ (-1));
        llIlllIlI[1] = " ".length();
        llIlllIlI[2] = "  ".length();
        llIlllIlI[3] = (20 ^ 24) ^ (143 ^ 139);
    }

    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0053bz
    public boolean c(String str, String str2) {
        return str.contains(llIlllIIl[llIlllIlI[1]]);
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    private static String lIlllllIIll(String lIlIlllIIllIlll, String lIlIlllIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIIllIllI.getBytes(StandardCharsets.UTF_8)), llIlllIlI[3]), "DES");
            Cipher lIlIlllIIlllIIl = Cipher.getInstance("DES");
            lIlIlllIIlllIIl.init(llIlllIlI[2], secretKeySpec);
            return new String(lIlIlllIIlllIIl.doFinal(Base64.getDecoder().decode(lIlIlllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIIlllIII) {
            lIlIlllIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIIlI(String lIlIlllIIlIlIlI, String lIlIlllIIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIIlIllII = Cipher.getInstance("Blowfish");
            lIlIlllIIlIllII.init(llIlllIlI[2], secretKeySpec);
            return new String(lIlIlllIIlIllII.doFinal(Base64.getDecoder().decode(lIlIlllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIIlIlIll) {
            lIlIlllIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIlIl();
        lIlllllIlII();
    }
}
