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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Creating essence", priority = 1, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.n  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/n.class */
public class n extends h {
    private static /* synthetic */ String[] llIIllIlIIIl;
    private static /* synthetic */ int[] llIIllIlIIlI;

    private static boolean llllllIIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIlIIIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllIlIIlI[0]];
        enumC0002cArr[llIIllIlIIlI[1]] = EnumC0002c.COUNTDOWN;
        enumC0002cArr[llIIllIlIIlI[2]] = EnumC0002c.ACTIVE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    public boolean ak() {
        if (llllllIIllllIl(this.aV.m(), EnumC0002c.ACTIVATING) && llllllIIlllllI(this.aV.a(), this.aW.fragmentAmount())) {
            return llIIllIlIIlI[1];
        }
        int[] iArr = new int[llIIllIlIIlI[2]];
        iArr[llIIllIlIIlI[1]] = llIIllIlIIlI[3];
        TileObject nearest = TileObjects.getNearest(iArr);
        Player local = Players.getLocal();
        if (llllllIIllllll(Inventory.isFull() ? 1 : 0) && llllllIlIIIIII(nearest) && !llllllIlIIIIIl(SquireGOTRPlugin.f0g.contains(local) ? 1 : 0)) {
            if ((!llllllIlIIIIIl(SquireGOTRPlugin.h.contains(local) ? 1 : 0) || !llllllIIlllllI(this.aV.a(), this.aW.fragmentAmount())) && !llllllIlIIIIIl(this.aV.c() ? 1 : 0)) {
                if (llllllIlIIIIlI(this.aV.o(), llIIllIlIIlI[0]) && llllllIlIIIIll(Players.getLocal().getAnimation(), llIIllIlIIlI[4])) {
                    return llIIllIlIIlI[2];
                }
                if (llllllIIllllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    Movement.walkTo(nearest.getWorldLocation(), (boolean) llIIllIlIIlI[1]);
                    "".length();
                    return llIIllIlIIlI[2];
                } else if (llllllIlIIIIIl(b((GameObject) nearest) ? 1 : 0)) {
                    return llIIllIlIIlI[1];
                } else {
                    nearest.interact(llIIllIlIIIl[llIIllIlIIlI[1]]);
                    sleep(llIIllIlIIlI[2]);
                    return llIIllIlIIlI[2];
                }
            }
            return llIIllIlIIlI[1];
        }
        return llIIllIlIIlI[1];
    }

    private static boolean llllllIIllllll(int i) {
        return i == 0;
    }

    private static boolean llllllIlIIIIIl(int i) {
        return i != 0;
    }

    private static void llllllIIlllIll() {
        llIIllIlIIIl = new String[llIIllIlIIlI[2]];
        llIIllIlIIIl[llIIllIlIIlI[1]] = llllllIIlllIlI("dDU30m/ET2c=", "KUjYu");
    }

    static {
        llllllIIllllII();
        llllllIIlllIll();
    }

    private static boolean llllllIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llllllIIllllII() {
        llIIllIlIIlI = new int[5];
        llIIllIlIIlI[0] = "  ".length();
        llIIllIlIIlI[1] = (198 ^ 134) & ((226 ^ 162) ^ (-1));
        llIIllIlIIlI[2] = " ".length();
        llIIllIlIIlI[3] = (-((-18658) & 19943)) & (-16385) & 61423;
        llIIllIlIIlI[4] = (-((-9729) & 28257)) & (-523) & 28415;
    }

    private static boolean llllllIIllllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIlIIIIll(int i, int i2) {
        return i == i2;
    }

    private static String llllllIIlllIlI(String lllllllllllllllIlIIllIlIlIIIlIII, String lllllllllllllllIlIIllIlIlIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIlIIlI[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIlIIIlIIl) {
            lllllllllllllllIlIIllIlIlIIIlIIl.printStackTrace();
            return null;
        }
    }
}
