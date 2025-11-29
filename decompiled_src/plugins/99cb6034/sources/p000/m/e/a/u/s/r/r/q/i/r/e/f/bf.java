package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Picking up produce", priority = 6, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.bf  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/bf.class */
public class bf extends AbstractC0026az {
    private static /* synthetic */ int[] lIllllIllIIl;
    private static /* synthetic */ String[] lIllllIllIII;

    static {
        lllIlllIlIlllI();
        lllIlllIlIllIl();
    }

    private static String lllIlllIlIllII(String lllllllllllllllIlIllIIIlllllllIl, String lllllllllllllllIlIllIIIlllllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlllllllII.getBytes(StandardCharsets.UTF_8)), lIllllIllIIl[2]), "DES");
            Cipher lllllllllllllllIlIllIIIlllllllll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIlllllllll.init(lIllllIllIIl[3], lllllllllllllllIlIllIIlIIIIIIIII);
            return new String(lllllllllllllllIlIllIIIlllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIllllllllI) {
            lllllllllllllllIlIllIIIllllllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public bf(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static boolean lllIlllIlIllll(int i) {
        return i != 0;
    }

    private static void lllIlllIlIlllI() {
        lIllllIllIIl = new int[4];
        lIllllIllIIl[0] = ((((15 + 110) - 47) + 70) ^ (((140 + 160) - 187) + 56)) & (((120 ^ 8) ^ (67 ^ 14)) ^ (-" ".length()));
        lIllllIllIIl[1] = " ".length();
        lIllllIllIIl[2] = (82 ^ 1) ^ (231 ^ 188);
        lIllllIllIIl[3] = "  ".length();
    }

    private static void lllIlllIlIllIl() {
        lIllllIllIII = new String[lIllllIllIIl[1]];
        lIllllIllIII[lIllllIllIIl[0]] = lllIlllIlIllII("RQSPFhUUGko=", "eowAb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (lllIlllIlIllll(Inventory.isFull() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        int[] iArr = new int[lIllllIllIIl[1]];
        iArr[lIllllIllIIl[0]] = EnumC0021au.LIMPWURT.au();
        List all = TileItems.getAll(iArr);
        if (lllIlllIlIllll(all.isEmpty() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        ((TileItem) all.get(lIllllIllIIl[0])).interact(lIllllIllIII[lIllllIllIIl[0]]);
        return lIllllIllIIl[1];
    }
}
