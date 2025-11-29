package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Applying compost potion to the bin", priority = 31, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aL  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aL.class */
public class aL extends aN {
    private static /* synthetic */ String[] llIIIIIlIIll;
    private static /* synthetic */ int[] llIIIIIlIlII;

    @Inject
    public aL(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static String llllIIIllIIIII(String lllllllllllllllIlIlIllIlIlIllIII, String lllllllllllllllIlIlIllIlIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), llIIIIIlIlII[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIlIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllIlIlIllIIl) {
            lllllllllllllllIlIlIllIlIlIllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean I(N n) {
        if (llllIIIllIIIll(this.bS.applyCompostPotion() ? 1 : 0)) {
            return llIIIIIlIlII[0];
        }
        C0014an aI = n.aI();
        EnumC0021au aY = aI.aY();
        if (!llllIIIllIIlII(aI.aZ(), EnumC0039n.HARVESTABLE) || (llllIIIllIIlIl(aY, EnumC0021au.COMPOST) && !llllIIIllIIlII(aY, EnumC0021au.GIANT_COMPOST))) {
            return llIIIIIlIlII[0];
        }
        ?? r0 = llIIIIIlIlII[1];
        "".length();
        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aN
    public boolean b(TileObject tileObject) {
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIIIIIlIIll[llIIIIIlIlII[0]]);
        });
        if (llllIIIllIIllI(first)) {
            return llIIIIIlIlII[0];
        }
        first.useOn(tileObject);
        return llIIIIIlIlII[1];
    }

    private static boolean llllIIIllIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llllIIIllIIIlI() {
        llIIIIIlIlII = new int[4];
        llIIIIIlIlII[0] = (87 ^ 104) & ((148 ^ 171) ^ (-1));
        llIIIIIlIlII[1] = " ".length();
        llIIIIIlIlII[2] = 118 ^ 126;
        llIIIIIlIlII[3] = "  ".length();
    }

    private static boolean llllIIIllIIllI(Object obj) {
        return obj == null;
    }

    private static void llllIIIllIIIIl() {
        llIIIIIlIIll = new String[llIIIIIlIlII[1]];
        llIIIIIlIIll[llIIIIIlIlII[0]] = llllIIIllIIIII("bobjT2mYCrwHw0F7nO8baQ==", "OaRIG");
    }

    private static boolean llllIIIllIIIll(int i) {
        return i == 0;
    }

    static {
        llllIIIllIIIlI();
        llllIIIllIIIIl();
    }

    private static boolean llllIIIllIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }
}
