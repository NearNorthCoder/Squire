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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Grabbing uncharged cells", priority = 15, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.j  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/j.class */
public class j extends h {
    private static /* synthetic */ String[] llIIlllllIII;
    private static /* synthetic */ int[] llIIlllllIll;

    static {
        lllllllllIIIll();
        lllllllllIIIlI();
    }

    private static boolean lllllllllIlIII(Object obj) {
        return obj != null;
    }

    private static String llllllllIlllll(String lllllllllllllllIlIIlIllIIIllIIII, String lllllllllllllllIlIIlIllIIIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIIIlIllII) {
            lllllllllllllllIlIIlIllIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllllIIllI(int i) {
        return i != 0;
    }

    private static void lllllllllIIIlI() {
        llIIlllllIII = new String[llIIlllllIll[0]];
        llIIlllllIII[llIIlllllIll[1]] = llllllllIlllll("SsVtghVzyak=", "DMmGf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!lllllllllIIlIl(this.aV.d(), llIIlllllIll[2]) && !lllllllllIIllI(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            GameObject y = this.aV.y();
            if (lllllllllIlIII(y) && lllllllllIIllI(Reachable.isInteractable(y) ? 1 : 0)) {
                y.interact(llIIlllllIII[llIIlllllIll[1]]);
                return llIIlllllIll[0];
            }
            return llIIlllllIll[1];
        }
        return llIIlllllIll[1];
    }

    private static boolean lllllllllIIlIl(int i, int i2) {
        return i == i2;
    }

    private static void lllllllllIIIll() {
        llIIlllllIll = new int[4];
        llIIlllllIll[0] = " ".length();
        llIIlllllIll[1] = (183 ^ 170) & ((123 ^ 102) ^ (-1));
        llIIlllllIll[2] = 99 ^ 105;
        llIIlllllIll[3] = "  ".length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllllIll[0]];
        enumC0002cArr[llIIlllllIll[1]] = EnumC0002c.ACTIVATING;
    }
}
