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
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Crafting a guardian", priority = 10, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.m  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/m.class */
public class m extends h {
    private static /* synthetic */ String[] llIIlllIlIll;
    private static /* synthetic */ int[] llIIlllIllIl;

    private static String lllllllIlIlIlI(String lllllllllllllllIlIIlIlllIlIIIlIl, String lllllllllllllllIlIIlIlllIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIlIIIlll.init(llIIlllIllIl[0], lllllllllllllllIlIIlIlllIlIIlIII);
            return new String(lllllllllllllllIlIIlIlllIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIlIIIllI) {
            lllllllllllllllIlIIlIlllIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIllIlII(Object obj) {
        return obj == null;
    }

    private static void lllllllIlIllII() {
        llIIlllIlIll = new String[llIIlllIllIl[2]];
        llIIlllIlIll[llIIlllIllIl[1]] = lllllllIlIlIlI("lebwsSFjYhX7aJVnDYQ+gA==", "hytXZ");
    }

    private static boolean lllllllIllIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllllIllIIll(int i) {
        return i != 0;
    }

    private static boolean lllllllIllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        GameObject B;
        if (lllllllIllIIll(this.aV.g() ? 1 : 0) && lllllllIllIIll(this.aW.craftGuardian() ? 1 : 0)) {
            int[] iArr = new int[llIIlllIllIl[2]];
            iArr[llIIlllIllIl[1]] = llIIlllIllIl[3];
            if (lllllllIllIIll(Inventory.contains(iArr) ? 1 : 0) && !lllllllIllIIll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
                if (lllllllIllIIll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
                    return llIIlllIllIl[1];
                }
                Item e = this.aV.e();
                if (!lllllllIllIlII(e) && !lllllllIllIlIl(e.getId(), llIIlllIllIl[4]) && !lllllllIllIllI(this.aV.O() ? 1 : 0)) {
                    d h = this.aV.h();
                    if (lllllllIllIlII(h)) {
                        return llIIlllIllIl[1];
                    }
                    if (lllllllIllIIll(h.Z() ? 1 : 0)) {
                        B = this.aV.A();
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        B = this.aV.B();
                    }
                    GameObject gameObject = B;
                    if (lllllllIllIlII(gameObject)) {
                        return llIIlllIllIl[1];
                    }
                    if (lllllllIllIlll(gameObject.distanceTo(Players.getLocal()), llIIlllIllIl[5]) && lllllllIllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                        return llIIlllIllIl[2];
                    }
                    gameObject.interact(llIIlllIlIll[llIIlllIllIl[1]]);
                    return llIIlllIllIl[2];
                }
                return llIIlllIllIl[1];
            }
        }
        return llIIlllIllIl[1];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIllIl[0]];
        enumC0002cArr[llIIlllIllIl[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIlllIllIl[2]] = EnumC0002c.FINISHING;
    }

    static {
        lllllllIllIIII();
        lllllllIlIllII();
    }

    private static void lllllllIllIIII() {
        llIIlllIllIl = new int[6];
        llIIlllIllIl[0] = "  ".length();
        llIIlllIllIl[1] = ((((81 + 185) - 126) + 46) ^ (((142 + 115) - 216) + 119)) & (((28 ^ 121) ^ (((126 + 76) - 132) + 57)) ^ (-" ".length()));
        llIIlllIllIl[2] = " ".length();
        llIIlllIllIl[3] = (-((-16089) & 16381)) & (-2049) & 4095;
        llIIlllIllIl[4] = (-4162) & 31047;
        llIIlllIllIl[5] = 16 ^ 20;
    }

    private static boolean lllllllIllIlIl(int i, int i2) {
        return i != i2;
    }
}
