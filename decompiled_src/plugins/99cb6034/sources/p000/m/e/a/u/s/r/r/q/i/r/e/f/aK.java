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
@TaskDesc(name = "Setting up birdhouse", priority = 5)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aK  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aK.class */
public class aK extends aG {
    private static /* synthetic */ String[] lIllllllIIIl;
    private static /* synthetic */ int[] lIllllllIIlI;

    private static boolean llllIIIIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static void llllIIIIIIIIIl() {
        lIllllllIIIl = new String[lIllllllIIlI[5]];
        lIllllllIIIl[lIllllllIIlI[1]] = lllIllllllllll("CyI7JR0=", "IWRIy");
        lIllllllIIIl[lIllllllIIlI[0]] = lllIllllllllll("Ji4RN2osKBYgLw==", "DGcSJ");
        lIllllllIIIl[lIllllllIIlI[4]] = llllIIIIIIIIII("uNkA/jp5szw=", "mpRfl");
    }

    static {
        llllIIIIIIIIlI();
        llllIIIIIIIIIl();
    }

    private static boolean llllIIIIIIIIll(Object obj) {
        return obj != null;
    }

    private static String llllIIIIIIIIII(String lllllllllllllllIlIlIlllllIllllII, String lllllllllllllllIlIlIlllllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlllllIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlllllIlllllI.init(lIllllllIIlI[4], lllllllllllllllIlIlIlllllIllllll);
            return new String(lllllllllllllllIlIlIlllllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlllllIlllIII) {
            lllllllllllllllIlIlIlllllIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static String lllIllllllllll(String lllllllllllllllIlIlIlllllIlIllII, String lllllllllllllllIlIlIlllllIlIlIll) {
        String lllllllllllllllIlIlIlllllIlIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIlllllIlIlIIl = lllllllllllllllIlIlIlllllIlIlIll.toCharArray();
        int lllllllllllllllIlIlIlllllIlIlIII = lIllllllIIlI[1];
        char[] charArray = lllllllllllllllIlIlIlllllIlIllII2.toCharArray();
        int length = charArray.length;
        int i = lIllllllIIlI[1];
        while (llllIIIIIIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIlIlllllIlIlIIl[lllllllllllllllIlIlIlllllIlIlIII % lllllllllllllllIlIlIlllllIlIlIIl.length]));
            "".length();
            lllllllllllllllIlIlIlllllIlIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected aK(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j) {
        super(squireFarmer, squireFarmerConfig, c0035j, r4);
        F[] fArr = new F[lIllllllIIlI[0]];
        fArr[lIllllllIIlI[1]] = F.EMPTY;
    }

    private static boolean llllIIIIIIIlIl(int i) {
        return i == 0;
    }

    private static void llllIIIIIIIIlI() {
        lIllllllIIlI = new int[6];
        lIllllllIIlI[0] = " ".length();
        lIllllllIIlI[1] = (134 ^ 187) & ((26 ^ 39) ^ (-1));
        lIllllllIIlI[2] = 147 ^ 131;
        lIllllllIIlI[3] = (-((-7177) & 23977)) & (-5127) & 30718;
        lIllllllIIlI[4] = "  ".length();
        lIllllllIIlI[5] = "   ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aG
    public boolean f(E e) {
        TileObject a = this.cu.a(e);
        if (!llllIIIIIIIIll(a) || llllIIIIIIIlII(a.distanceTo(Players.getLocal()), lIllllllIIlI[2])) {
            return lIllllllIIlI[1];
        }
        int[] iArr = new int[lIllllllIIlI[0]];
        iArr[lIllllllIIlI[1]] = lIllllllIIlI[3];
        Item first = Inventory.getFirst(iArr);
        if (!llllIIIIIIIIll(first)) {
            if (llllIIIIIIIlIl(Inventory.contains(item -> {
                return item.getName().toLowerCase().contains(lIllllllIIIl[lIllllllIIlI[0]]);
            }) ? 1 : 0)) {
                return lIllllllIIlI[1];
            }
            a.interact(lIllllllIIIl[lIllllllIIlI[1]]);
            return lIllllllIIlI[0];
        }
        Item first2 = Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().endsWith(lIllllllIIIl[lIllllllIIlI[4]]);
        });
        if (llllIIIIIIIIll(first2)) {
            first2.useOn(first);
            sleep(lIllllllIIlI[4]);
            return lIllllllIIlI[0];
        }
        return lIllllllIIlI[1];
    }
}
