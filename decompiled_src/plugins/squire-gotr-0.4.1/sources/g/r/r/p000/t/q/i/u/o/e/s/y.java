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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Mining huge remains", priority = 6, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.y  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/y.class */
public class y extends h {
    private static /* synthetic */ int[] llIIlllIllII;
    private static /* synthetic */ String[] llIIlllIlIlI;

    private static boolean lllllllIlIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!lllllllIlIlllI(this.aV.g() ? 1 : 0) || lllllllIlIllll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        if (lllllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        int[] iArr = new int[llIIlllIllII[0]];
        iArr[llIIlllIllII[1]] = llIIlllIllII[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lllllllIllIIIl(nearest)) {
            return llIIlllIllII[1];
        }
        if (lllllllIlIlllI(Players.getLocal().isMoving() ? 1 : 0) && lllllllIlIlllI(b((GameObject) nearest) ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        if (lllllllIllIIlI(this.aV.o(), llIIlllIllII[3]) && lllllllIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        nearest.interact(llIIlllIlIlI[llIIlllIllII[1]]);
        return llIIlllIllII[0];
    }

    private static void lllllllIlIlIll() {
        llIIlllIlIlI = new String[llIIlllIllII[0]];
        llIIlllIlIlI[llIIlllIllII[1]] = lllllllIlIlIIl("w5UAwoTpyxQ=", "uzMSK");
    }

    private static String lllllllIlIlIIl(String lllllllllllllllIlIIlIlllIlIllIIl, String lllllllllllllllIlIIlIlllIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIlIlllIl.init(llIIlllIllII[3], lllllllllllllllIlIIlIlllIlIllllI);
            return new String(lllllllllllllllIlIIlIlllIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIlIlllII) {
            lllllllllllllllIlIIlIlllIlIlllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIllII[0]];
        enumC0002cArr[llIIlllIllII[1]] = EnumC0002c.ACTIVE;
    }

    private static boolean lllllllIllIIlI(int i, int i2) {
        return i > i2;
    }

    static {
        lllllllIlIllIl();
        lllllllIlIlIll();
    }

    private static void lllllllIlIllIl() {
        llIIlllIllII = new int[4];
        llIIlllIllII[0] = " ".length();
        llIIlllIllII[1] = (130 ^ 177) & ((100 ^ 87) ^ (-1));
        llIIlllIllII[2] = (-((-4249) & 5565)) & (-3) & 45038;
        llIIlllIllII[3] = "  ".length();
    }

    private static boolean lllllllIllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllllllIlIllll(int i) {
        return i == 0;
    }
}
