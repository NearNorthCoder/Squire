package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import gg.squire.driftnet.SquireDriftNetConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Start Banking", priority = 2147483646, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.f  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/f.class */
public class f extends Task {
    private final /* synthetic */ SquireDriftNetConfig A;
    private final /* synthetic */ SquireDriftNet y;
    private static /* synthetic */ String[] lIlIIIIIIIll;
    private final /* synthetic */ Client z;
    private static /* synthetic */ int[] lIlIIIIIIlII;

    private static void llIlIIlIllIIlI() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[2]];
        lIlIIIIIIIll[lIlIIIIIIlII[0]] = llIlIIlIllIIII("WU+r/Zh6EBiFcyLvm7rigiHMSQJ3Zr1hi/GskOeYIv4=", "xSoxv");
        lIlIIIIIIIll[lIlIIIIIIlII[1]] = llIlIIlIllIIIl("T6RBPNxfPQo=", "bVUTJ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (!llIlIIlIllIlIl(this.z.isInInstancedRegion() ? 1 : 0) && !llIlIIlIllIlIl(this.A.stamina()) && !llIlIIlIllIllI(Inventory.getFirst(item -> {
            return item.getName().contains(lIlIIIIIIIll[lIlIIIIIIlII[1]]);
        }))) {
            Game.logout();
            System.out.println(lIlIIIIIIIll[lIlIIIIIIlII[0]]);
            return lIlIIIIIIlII[1];
        }
        return lIlIIIIIIlII[0];
    }

    private static boolean llIlIIlIllIlIl(int i) {
        return i == 0;
    }

    private static boolean llIlIIlIllIllI(Object obj) {
        return obj != null;
    }

    static {
        llIlIIlIllIlII();
        llIlIIlIllIIlI();
    }

    @Inject
    public f(SquireDriftNet squireDriftNet, Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.y = squireDriftNet;
        this.z = client;
        this.A = squireDriftNetConfig;
    }

    private static String llIlIIlIllIIII(String lllllllllllllllIlllIlIIlIlIIIIll, String lllllllllllllllIlllIlIIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlII[3]), "DES");
            Cipher lllllllllllllllIlllIlIIlIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlIlIIIlIl.init(lIlIIIIIIlII[2], lllllllllllllllIlllIlIIlIlIIIllI);
            return new String(lllllllllllllllIlllIlIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIlIIIlII) {
            lllllllllllllllIlllIlIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIllIIIl(String lllllllllllllllIlllIlIIlIlIlIIII, String lllllllllllllllIlllIlIIlIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIlIlIIlI.init(lIlIIIIIIlII[2], lllllllllllllllIlllIlIIlIlIlIIll);
            return new String(lllllllllllllllIlllIlIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIlIlIIIl) {
            lllllllllllllllIlllIlIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIllIlII() {
        lIlIIIIIIlII = new int[4];
        lIlIIIIIIlII[0] = ((80 ^ 32) ^ (3 ^ 75)) & (((77 ^ 106) ^ (163 ^ 188)) ^ (-" ".length()));
        lIlIIIIIIlII[1] = " ".length();
        lIlIIIIIIlII[2] = "  ".length();
        lIlIIIIIIlII[3] = (((183 + 138) - 249) + 128) ^ (((2 + 135) - 80) + 135);
    }
}
