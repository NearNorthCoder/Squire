package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Mining extra fragments", priority = 1)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.o  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/o.class */
public class o extends h {
    private static /* synthetic */ String[] llIIllllIIlI;
    private static /* synthetic */ int[] llIIllllIIll;

    private static void llllllllIIIllI() {
        llIIllllIIll = new int[5];
        llIIllllIIll[0] = " ".length();
        llIIllllIIll[1] = (94 ^ 102) & ((113 ^ 73) ^ (-1));
        llIIllllIIll[2] = (-((-10857) & 15229)) & (-16386) & 64511;
        llIIllllIIll[3] = (-4411) & 48127;
        llIIllllIIll[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        WorldPoint worldLocation;
        if (llllllllIIIlll(Inventory.isFull() ? 1 : 0) && llllllllIIlIII(this.aV.g() ? 1 : 0) && llllllllIIIlll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0) && !llllllllIIlIII(SquireGOTRPlugin.h.contains(Players.getLocal()) ? 1 : 0)) {
            if (llllllllIIIlll(this.aV.c() ? 1 : 0)) {
                return llIIllllIIll[1];
            }
            int[] iArr = new int[llIIllllIIll[0]];
            iArr[llIIllllIIll[1]] = llIIllllIIll[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llllllllIIlIIl(nearest)) {
                worldLocation = Players.getLocal().getWorldLocation();
                "".length();
                if ((-"   ".length()) > 0) {
                    return "  ".length() & ("  ".length() ^ (-1));
                }
            } else {
                worldLocation = nearest.getWorldLocation();
            }
            int[] iArr2 = new int[llIIllllIIll[0]];
            iArr2[llIIllllIIll[1]] = llIIllllIIll[3];
            TileObject nearest2 = TileObjects.getNearest(worldLocation, iArr2);
            if (llllllllIIlIIl(nearest2)) {
                return llIIllllIIll[1];
            }
            if (llllllllIIlIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                return llIIllllIIll[0];
            }
            if (llllllllIIIlll(b((GameObject) nearest2) ? 1 : 0)) {
                nearest2.interact(llIIllllIIlI[llIIllllIIll[1]]);
                sleep(llIIllllIIll[4]);
            }
            return llIIllllIIll[0];
        }
        return llIIllllIIll[1];
    }

    private static boolean llllllllIIIlll(int i) {
        return i == 0;
    }

    static {
        llllllllIIIllI();
        llllllllIIIlIl();
    }

    private static String llllllllIIIlII(String lllllllllllllllIlIIlIllIllIllIIl, String lllllllllllllllIlIIlIllIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIllIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIllIllIll.init(llIIllllIIll[4], lllllllllllllllIlIIlIllIllIlllII);
            return new String(lllllllllllllllIlIIlIllIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIllIllIlI) {
            lllllllllllllllIlIIlIllIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static void llllllllIIIlIl() {
        llIIllllIIlI = new String[llIIllllIIll[0]];
        llIIllllIIlI[llIIllllIIll[1]] = llllllllIIIlII("hIH5GgWBJ+U=", "wozFh");
    }

    private static boolean llllllllIIlIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllllIIll[0]];
        enumC0002cArr[llIIllllIIll[1]] = EnumC0002c.ACTIVE;
    }

    private static boolean llllllllIIlIIl(Object obj) {
        return obj == null;
    }
}
