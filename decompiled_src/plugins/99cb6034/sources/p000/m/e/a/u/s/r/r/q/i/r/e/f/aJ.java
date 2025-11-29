package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Seeding birdhouse", priority = 5)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aJ  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aJ.class */
public class aJ extends aG {
    private static /* synthetic */ int[] lIllllIIllII;
    private static /* synthetic */ String[] lIllllIIlIll;

    private static String lllIlllIIIllIl(String lllllllllllllllIlIllIIlIlIllIIII, String lllllllllllllllIlIllIIlIlIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIlIlIllII) {
            lllllllllllllllIlIllIIlIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static void lllIlllIIIlllI() {
        lIllllIIlIll = new String[lIllllIIllII[0]];
        lIllllIIlIll[lIllllIIllII[1]] = lllIlllIIIllIl("lyCAKL1f9Ps=", "YBPui");
    }

    private static boolean lllIlllIIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIlllIIlIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected aJ(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j) {
        super(squireFarmer, squireFarmerConfig, c0035j, r4);
        F[] fArr = new F[lIllllIIllII[0]];
        fArr[lIllllIIllII[1]] = F.BUILT;
    }

    private static boolean lllIlllIIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aG
    public boolean f(E e) {
        TileObject a = this.cu.a(e);
        if (!lllIlllIIlIIII(a) || lllIlllIIlIIIl(a.distanceTo(Players.getLocal()), lIllllIIllII[2])) {
            return lIllllIIllII[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (lllIlllIIlIIlI(item.isStackable() ? 1 : 0) && lllIlllIIlIIlI(item.getName().toLowerCase().contains(lIllllIIlIll[lIllllIIllII[1]]) ? 1 : 0)) {
                ?? r0 = lIllllIIllII[0];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIIllII[1];
        });
        if (lllIlllIIlIIII(first)) {
            first.useOn(a);
            this.cu.Q().add(e);
            "".length();
            return lIllllIIllII[0];
        }
        return lIllllIIllII[1];
    }

    private static void lllIlllIIIllll() {
        lIllllIIllII = new int[4];
        lIllllIIllII[0] = " ".length();
        lIllllIIllII[1] = (221 ^ 157) & ((111 ^ 47) ^ (-1));
        lIllllIIllII[2] = (43 ^ 49) ^ (127 ^ 117);
        lIllllIIllII[3] = "  ".length();
    }

    static {
        lllIlllIIIllll();
        lllIlllIIIlllI();
    }
}
