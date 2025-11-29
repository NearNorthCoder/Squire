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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Grabbing a weak cell", priority = 14, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.k  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/k.class */
public class k extends h {
    private static /* synthetic */ String[] llIlIIIIIIII;
    private static /* synthetic */ int[] llIlIIIIIIIl;

    private static boolean lIIIIIIIIIIIIll(Object obj) {
        return obj == null;
    }

    private static String lIIIIIIIIIIIIII(String lllllllllllllllIlIIlIlIlIllIlllI, String lllllllllllllllIlIIlIlIlIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIIIIIl[2], lllllllllllllllIlIIlIlIlIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlIllIllll) {
            lllllllllllllllIlIIlIlIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIIIlII(int i) {
        return i != 0;
    }

    static {
        lIIIIIIIIIIIIlI();
        lIIIIIIIIIIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!lIIIIIIIIIIIIll(this.aV.e()) || lIIIIIIIIIIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        if (lIIIIIIIIIIIlII(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        GameObject z = this.aV.z();
        if (lIIIIIIIIIIIlIl(z) && lIIIIIIIIIIIlII(Reachable.isInteractable(z) ? 1 : 0)) {
            z.interact(llIlIIIIIIII[llIlIIIIIIIl[1]]);
            return llIlIIIIIIIl[0];
        }
        return llIlIIIIIIIl[1];
    }

    private static void lIIIIIIIIIIIIIl() {
        llIlIIIIIIII = new String[llIlIIIIIIIl[0]];
        llIlIIIIIIII[llIlIIIIIIIl[1]] = lIIIIIIIIIIIIII("B2nCPsOnJDM=", "oUJzE");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIlIIIIIIIl[0]];
        enumC0002cArr[llIlIIIIIIIl[1]] = EnumC0002c.ACTIVATING;
    }

    private static boolean lIIIIIIIIIIIlIl(Object obj) {
        return obj != null;
    }

    private static void lIIIIIIIIIIIIlI() {
        llIlIIIIIIIl = new int[3];
        llIlIIIIIIIl[0] = " ".length();
        llIlIIIIIIIl[1] = (33 ^ 4) & ((139 ^ 174) ^ (-1));
        llIlIIIIIIIl[2] = "  ".length();
    }
}
