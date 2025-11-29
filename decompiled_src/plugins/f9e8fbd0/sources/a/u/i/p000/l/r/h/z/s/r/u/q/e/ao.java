package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Teleporting to Zul-andra")
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ao  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ao.class */
public class ao extends Task {
    private static /* synthetic */ String[] lIllIlIlIllII;
    @Inject
    private /* synthetic */ C0020u ab;
    private final /* synthetic */ SquireZulrahConfig aN;
    private final /* synthetic */ Client aM;
    private final /* synthetic */ SquireZulrah aL;
    private static /* synthetic */ int[] lIllIlIlIllIl;

    private static boolean llIIlIIIIIlIlII(Object obj) {
        return obj == null;
    }

    private static void llIIlIIIIIIlllI() {
        lIllIlIlIllII = new String[lIllIlIlIllIl[2]];
        lIllIlIlIllII[lIllIlIlIllIl[0]] = llIIlIIIIIIllIl("youP0hCR5X+MI6zphW+AAA==", "TzkYR");
    }

    private static boolean llIIlIIIIIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIlIIIIIlIIll(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIIIlIIIl(int i) {
        return i != 0;
    }

    private static void llIIlIIIIIIllll() {
        lIllIlIlIllIl = new int[6];
        lIllIlIlIllIl[0] = (5 ^ 39) & ((50 ^ 16) ^ (-1));
        lIllIlIlIllIl[1] = (-18465) & 31594;
        lIllIlIlIllIl[2] = " ".length();
        lIllIlIlIllIl[3] = (-((-5938) & 22327)) & (-17) & 29343;
        lIllIlIlIllIl[4] = 20 ^ 28;
        lIllIlIlIllIl[5] = "  ".length();
    }

    static {
        llIIlIIIIIIllll();
        llIIlIIIIIIlllI();
    }

    @Inject
    public ao(SquireZulrah squireZulrah, Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aL = squireZulrah;
        this.aM = client;
        this.aN = squireZulrahConfig;
    }

    private InventorySetup aj() {
        return new InventorySetup();
    }

    private static boolean llIIlIIIIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIlIIIIIlIIII(this.aL.a(), EnumC0002c.DONE) || llIIlIIIIIlIIIl(this.aL.d() ? 1 : 0)) {
            return lIllIlIlIllIl[0];
        }
        if (!llIIlIIIIIlIIlI(this.aN.transport(), EnumC0016q.ZUL_ANDRA_TELEPORT) && !llIIlIIIIIlIIll(this.ab.h(lIllIlIlIllIl[1]) ? 1 : 0)) {
            int[] iArr = new int[lIllIlIlIllIl[2]];
            iArr[lIllIlIlIllIl[0]] = lIllIlIlIllIl[3];
            Item first = Inventory.getFirst(iArr);
            if (llIIlIIIIIlIlII(first)) {
                return lIllIlIlIllIl[0];
            }
            first.interact(lIllIlIlIllII[lIllIlIlIllIl[0]]);
            return lIllIlIlIllIl[2];
        }
        return lIllIlIlIllIl[0];
    }

    private static String llIIlIIIIIIllIl(String llllllllllllllIllIIIllIllIIlIlll, String llllllllllllllIllIIIllIllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), lIllIlIlIllIl[4]), "DES");
            Cipher llllllllllllllIllIIIllIllIIllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIllIllIIllIIl.init(lIllIlIlIllIl[5], llllllllllllllIllIIIllIllIIllIlI);
            return new String(llllllllllllllIllIIIllIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIllIIllIII) {
            llllllllllllllIllIIIllIllIIllIII.printStackTrace();
            return null;
        }
    }
}
