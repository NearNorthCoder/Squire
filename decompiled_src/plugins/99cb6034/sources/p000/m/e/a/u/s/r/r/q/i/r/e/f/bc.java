package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to next region", priority = 25, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.bc  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/bc.class */
public class bc extends AbstractC0026az {
    private static /* synthetic */ String[] llIIIIllllII;
    private static /* synthetic */ int[] llIIIIlllllI;

    private static boolean llllIIlllIIlIl(int i) {
        return i == 0;
    }

    private static boolean llllIIlllIIlII(int i) {
        return i != 0;
    }

    @Inject
    public bc(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client);
    }

    private static String llllIIllIlllIl(String lllllllllllllllIlIlIlIIlllIlIIlI, String lllllllllllllllIlIlIlIIlllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIIlllIlIIll) {
            lllllllllllllllIlIlIlIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        llllIIlllIIIlI();
        llllIIllIllllI();
    }

    private static void llllIIllIllllI() {
        llIIIIllllII = new String[llIIIIlllllI[1]];
        llIIIIllllII[llIIIIlllllI[0]] = llllIIllIlllIl("W41XLoo5VhE=", "WHzPB");
    }

    private static boolean llllIIlllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (!llllIIlllIIIll(local) || llllIIlllIIlII(local.isAnimating() ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        WorldPoint u = this.bR.u();
        WorldPoint worldLocation = local.getWorldLocation();
        if (!llllIIlllIIIll(u) || llllIIlllIIlII(this.bR.b(worldLocation) ? 1 : 0)) {
            return llIIIIlllllI[0];
        }
        if (!llllIIlllIIlIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(u);
            "".length();
            return llIIIIlllllI[1];
        }
        int[] iArr = new int[llIIIIlllllI[1]];
        iArr[llIIIIlllllI[0]] = llIIIIlllllI[2];
        Item first = Inventory.getFirst(iArr);
        if (llllIIlllIIIll(first)) {
            first.interact(llIIIIllllII[llIIIIlllllI[0]]);
        }
        return llIIIIlllllI[1];
    }

    private static void llllIIlllIIIlI() {
        llIIIIlllllI = new int[4];
        llIIIIlllllI[0] = ((42 ^ 16) ^ (160 ^ 194)) & (((((185 + 105) - 140) + 91) ^ (((39 + 48) - 14) + 96)) ^ (-" ".length()));
        llIIIIlllllI[1] = " ".length();
        llIIIIlllllI[2] = (-28771) & 30695;
        llIIIIlllllI[3] = "  ".length();
    }
}
