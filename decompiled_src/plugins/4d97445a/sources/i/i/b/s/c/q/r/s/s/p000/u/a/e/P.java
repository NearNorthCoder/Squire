package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@Singleton
@TaskDesc(name = "Attacking lurable", priority = 2, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.P  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/P.class */
public class P extends Task {
    private static /* synthetic */ String[] lIIIllI;
    private final /* synthetic */ LureConfig cb;
    private static /* synthetic */ int[] lIIIlll;
    private final /* synthetic */ M ca;

    static {
        lIIIlllII();
        lIIIllIll();
    }

    @Inject
    public P(M m, LureConfig lureConfig) {
        this.ca = m;
        this.cb = lureConfig;
    }

    private static boolean lIIIlllIl(int i2) {
        return i2 == 0;
    }

    private static void lIIIlllII() {
        lIIIlll = new int[4];
        lIIIlll[0] = ((53 ^ 91) ^ (70 ^ 47)) & (((166 ^ 139) ^ (164 ^ 142)) ^ (-" ".length()));
        lIIIlll[1] = " ".length();
        lIIIlll[2] = "  ".length();
        lIIIlll[3] = (66 ^ 94) ^ (24 ^ 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean run() {
        if (lIIIlllIl(this.ca.aI() ? 1 : 0)) {
            return lIIIlll[0];
        }
        Player local = Players.getLocal();
        if (lIIIllllI(local)) {
            return lIIIlll[0];
        }
        NPC a = this.ca.a((boolean) lIIIlll[1], local.getInteracting());
        if (lIIIllllI(a)) {
            return lIIIlll[0];
        }
        int[] iArr = new int[lIIIlll[1]];
        iArr[lIIIlll[0]] = this.cb.tagging();
        if (!lIIIlllIl(Equipment.contains(iArr) ? 1 : 0)) {
            a.interact(lIIIllI[lIIIlll[1]]);
            return lIIIlll[1];
        }
        int[] iArr2 = new int[lIIIlll[1]];
        iArr2[lIIIlll[0]] = this.cb.tagging();
        Inventory.getFirst(iArr2).interact(lIIIllI[lIIIlll[0]]);
        return lIIIlll[0];
    }

    private static String lIIIllIlI(String llllIIIlIIlIllI, String llllIIIlIIlIlIl) {
        try {
            SecretKeySpec llllIIIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlll[2], llllIIIlIIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIlIIlIlll) {
            llllIIIlIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllI(Object obj) {
        return obj == null;
    }

    private static void lIIIllIll() {
        lIIIllI = new String[lIIIlll[2]];
        lIIIllI[lIIIlll[0]] = lIIIllIlI("Fi3gfrvWBRk=", "KJcMe");
        lIIIllI[lIIIlll[1]] = lIIIllIlI("u9+etbQ4xYI=", "DgOlq");
    }
}
