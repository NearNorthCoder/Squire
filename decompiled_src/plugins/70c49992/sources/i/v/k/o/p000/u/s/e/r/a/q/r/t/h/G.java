package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eat", priority = 110)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.G  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/G.class */
public class G extends w {
    private static /* synthetic */ int[] lIlIlIlIIIllI;
    private static /* synthetic */ String[] lIlIlIlIIIlII;

    private static void lIlllllIIlllllI() {
        lIlIlIlIIIllI = new int[6];
        lIlIlIlIIIllI[0] = " ".length();
        lIlIlIlIIIllI[1] = (47 ^ 27) & ((108 ^ 88) ^ (-1));
        lIlIlIlIIIllI[2] = "   ".length();
        lIlIlIlIIIllI[3] = (-((-4681) & 12911)) & (-2065) & 11775;
        lIlIlIlIIIllI[4] = "  ".length();
        lIlIlIlIIIllI[5] = 97 ^ 105;
    }

    private static boolean lIlllllIlIIIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlllllIlIIIIIl(Object obj) {
        return obj != null;
    }

    static {
        lIlllllIIlllllI();
        lIlllllIIllllIl();
    }

    private static boolean lIlllllIIllllll(Object obj) {
        return obj == null;
    }

    private static String lIlllllIIlllIll(String llllllllllllllIllIlIllIlIlIlIIIl, String llllllllllllllIllIlIllIlIlIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIlIlIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIlIlIlIIll.init(lIlIlIlIIIllI[4], llllllllllllllIllIlIllIlIlIlIlII);
            return new String(llllllllllllllIllIlIllIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIlIlIlIIlI) {
            llllllllllllllIllIlIllIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected G(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static String lIlllllIIllllII(String llllllllllllllIllIlIllIlIlIllllI, String llllllllllllllIllIlIllIlIlIlllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIlIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIIIllI[4], llllllllllllllIllIlIllIlIllIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIlIlIllIlI) {
            llllllllllllllIllIlIllIlIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIlIIIIlI(int i2) {
        return i2 != 0;
    }

    private static void lIlllllIIllllIl() {
        lIlIlIlIIIlII = new String[lIlIlIlIIIllI[4]];
        lIlIlIlIIIlII[lIlIlIlIIIllI[1]] = lIlllllIIlllIll("nElNtiJ1i7U=", "vLFHx");
        lIlIlIlIIIlII[lIlIlIlIIIllI[0]] = lIlllllIIllllII("kOOtU6w053A=", "HLobI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (!lIlllllIIllllll(this.cg.c(lIlIlIlIIIllI[0])) && !lIlllllIlIIIIII(Math.abs(this.cf.getTickCount() - this.cg.G()), lIlIlIlIIIllI[2])) {
            int[] iArr = new int[lIlIlIlIIIllI[0]];
            iArr[lIlIlIlIIIllI[1]] = lIlIlIlIIIllI[3];
            if (lIlllllIlIIIIIl(Projectiles.getNearest(iArr))) {
                return lIlIlIlIIIllI[1];
            }
            Item first = Inventory.getFirst(item -> {
                String str = lIlIlIlIIIlII[lIlIlIlIIIllI[0]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (!lIlllllIIllllll(first) && !lIlllllIlIIIIIl(this.cg.A()) && !lIlllllIlIIIIIl(this.cg.A())) {
                int level = Skills.getLevel(Skill.HITPOINTS);
                int eatAtHP = this.ce.eatAtHP();
                int i2 = level - eatAtHP;
                if (lIlllllIlIIIIlI(this.cg.I() ? 1 : 0)) {
                    eatAtHP += i2 / lIlIlIlIIIllI[4];
                }
                if (lIlllllIlIIIIll(Combat.getCurrentHealth(), eatAtHP)) {
                    first.interact(lIlIlIlIIIlII[lIlIlIlIIIllI[1]]);
                    this.cg.a(this.cf.getTickCount());
                    this.cg.b(this.cf.getTickCount());
                    return lIlIlIlIIIllI[0];
                }
                return lIlIlIlIIIllI[1];
            }
            return lIlIlIlIIIllI[1];
        }
        return lIlIlIlIIIllI[1];
    }

    private static boolean lIlllllIlIIIIll(int i2, int i3) {
        return i2 <= i3;
    }
}
