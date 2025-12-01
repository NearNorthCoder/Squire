package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Spec", priority = 11)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.B  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/B.class */
public class B extends w {
    private static /* synthetic */ String[] lIlIllIIlIlII;
    private static /* synthetic */ int[] lIlIllIIlIlIl;

    @Inject
    protected B(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static boolean llIIIIIIlIIlIlI(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIIIlIIlIIl(Object obj) {
        return obj != null;
    }

    private static void llIIIIIIlIIIllI() {
        lIlIllIIlIlII = new String[lIlIllIIlIlIl[0]];
        lIlIllIIlIlII[lIlIllIIlIlIl[1]] = llIIIIIIlIIIlIl("g92QvHqS6Vw=", "AaOLs");
    }

    private static String llIIIIIIlIIIlIl(String llllllllllllllIllIlIIllIIIllIIlI, String llllllllllllllIllIlIIllIIIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIIlIlIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllIIIllIlIl) {
            llllllllllllllIllIlIIllIIIllIlIl.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIIlIIIlll();
        llIIIIIIlIIIllI();
    }

    private static boolean llIIIIIIlIIlIII(Object obj) {
        return obj == null;
    }

    private static void llIIIIIIlIIIlll() {
        lIlIllIIlIlIl = new int[8];
        lIlIllIIlIlIl[0] = " ".length();
        lIlIllIIlIlIl[1] = ((((97 + 214) - 240) + 183) ^ (((99 + 11) - 74) + 120)) & (((((127 + 28) - 110) + 205) ^ (((64 + 0) - (-72)) + 16)) ^ (-" ".length()));
        lIlIllIIlIlIl[2] = (-((-913) & 23479)) & (-8705) & 32751;
        lIlIllIIlIlIl[3] = (102 ^ 44) ^ (19 ^ 107);
        lIlIllIIlIlIl[4] = (-((-20643) & 31915)) & (-20481) & 32127;
        lIlIllIIlIlIl[5] = "  ".length();
        lIlIllIIlIlIl[6] = (-((-14033) & 30452)) & (-4161) & 32383;
        lIlIllIIlIlIl[7] = (-((-27355) & 31487)) & (-73) & 24574;
    }

    private static boolean llIIIIIIlIIlIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (llIIIIIIlIIlIII(this.cg.c(lIlIllIIlIlIl[0]))) {
            return lIlIllIIlIlIl[1];
        }
        int[] iArr = new int[lIlIllIIlIlIl[0]];
        iArr[lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[2];
        if (!llIIIIIIlIIlIIl(Projectiles.getNearest(iArr)) && !llIIIIIIlIIlIlI(this.cg.y() ? 1 : 0)) {
            if (!llIIIIIIlIIlIll(Combat.isSpecEnabled() ? 1 : 0) || llIIIIIIlIIllII(Combat.getSpecEnergy(), lIlIllIIlIlIl[3])) {
                return lIlIllIIlIlIl[1];
            }
            if (llIIIIIIlIIllII(this.cg.x(), lIlIllIIlIlIl[4])) {
                return lIlIllIIlIlIl[1];
            }
            int[] iArr2 = new int[lIlIllIIlIlIl[5]];
            iArr2[lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[6];
            iArr2[lIlIllIIlIlIl[0]] = lIlIllIIlIlIl[7];
            Item first = Inventory.getFirst(iArr2);
            if (llIIIIIIlIIlIIl(first)) {
                if (llIIIIIIlIIlIlI(Inventory.isFull() ? 1 : 0)) {
                    this.ch.K();
                    return lIlIllIIlIlIl[0];
                }
                first.interact(lIlIllIIlIlII[lIlIllIIlIlIl[1]]);
            }
            Combat.toggleSpec();
            return lIlIllIIlIlIl[0];
        }
        return lIlIllIIlIlIl[1];
    }

    private static boolean llIIIIIIlIIllII(int i2, int i3) {
        return i2 < i3;
    }
}
