package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Pickpocketing the target", priority = 3)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.F  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/F.class */
public class F extends AbstractC0000a {
    private static /* synthetic */ String[] lIIllIllIIIll;
    private static /* synthetic */ int[] lIIllIllIIlII;
    private final /* synthetic */ WorldPoint ay;
    private static final /* synthetic */ Logger ax;

    private static boolean lIllIIIlIIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIIIlIIIllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (!lIllIIIlIIIlllI(this.o.j() ? 1 : 0) && !lIllIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) {
            if (lIllIIIlIIIllll(Movement.isRunEnabled() ? 1 : 0) && lIllIIIlIIlIIII(Movement.getRunEnergy(), Rand.nextInt(lIIllIllIIlII[3], lIIllIllIIlII[4]))) {
                Movement.toggleRun();
            }
            EnumC0005f pickpocketTarget = this.p.pickpocketTarget();
            if (!lIllIIIlIIlIIIl(pickpocketTarget, EnumC0005f.VYRE) || (lIllIIIlIIIlllI(this.o.e()) && !lIllIIIlIIlIIlI(this.o.e(), lIIllIllIIlII[5]))) {
                NPC a = a(pickpocketTarget);
                if (lIllIIIlIIlIIll(a)) {
                    return lIIllIllIIlII[2];
                }
                if (lIllIIIlIIIlllI(Inventory.isFull() ? 1 : 0)) {
                    if (lIllIIIlIIlIlII(this.p.pickpocketTarget(), EnumC0005f.ARDY_KNIGHT)) {
                        return lIIllIllIIlII[2];
                    }
                    String[] strArr = new String[lIIllIllIIlII[6]];
                    strArr[lIIllIllIIlII[2]] = lIIllIllIIIll[lIIllIllIIlII[2]];
                    strArr[lIIllIllIIlII[7]] = lIIllIllIIIll[lIIllIllIIlII[7]];
                    if (lIllIIIlIIIllll(Inventory.contains(strArr) ? 1 : 0)) {
                        return lIIllIllIIlII[2];
                    }
                }
                Player local = Players.getLocal();
                if (lIllIIIlIIlIIll(local)) {
                    return lIIllIllIIlII[2];
                }
                if (lIllIIIlIIIlllI(o() ? 1 : 0)) {
                    sleep(Rand.nextInt(lIIllIllIIlII[7], lIIllIllIIlII[8]));
                    return lIIllIllIIlII[7];
                }
                if (lIllIIIlIIlIlII(pickpocketTarget, EnumC0005f.VYRE)) {
                    if (lIllIIIlIIlIIII(local.getWorldLocation().distanceTo(this.o.f()), this.p.wanderRange())) {
                        Movement.walkTo(this.o.f());
                        "".length();
                    }
                    if (!lIllIIIlIIlIIll(a) && !lIllIIIlIIlIIII(a.getWorldLocation().distanceTo(this.o.f()), this.p.wanderRange())) {
                        if (lIllIIIlIIIllll(Reachable.isInteractable(a) ? 1 : 0)) {
                            Movement.walkTo(a.getWorldLocation());
                            "".length();
                            return lIIllIllIIlII[7];
                        }
                    }
                    return lIIllIllIIlII[2];
                }
                a(a);
                return lIIllIllIIlII[7];
            }
            return lIIllIllIIlII[2];
        }
        return lIIllIllIIlII[2];
    }

    private static boolean lIllIIIlIIlIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIIIlIIIlIll(String llllllllllllllIlllIllllIlIlIIIII, String llllllllllllllIlllIllllIlIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllIIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIlIlIIIll) {
            llllllllllllllIlllIllllIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIlllI(int i) {
        return i != 0;
    }

    static {
        lIllIIIlIIIllIl();
        lIllIIIlIIIllII();
        ax = LoggerFactory.getLogger(F.class);
    }

    private static boolean lIllIIIlIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIllIIIlIIIllII() {
        lIIllIllIIIll = new String[lIIllIllIIlII[6]];
        lIIllIllIIIll[lIIllIllIIlII[2]] = lIllIIIlIIIlIlI("ExwGKlIgHBonGg==", "PsoDr");
        lIIllIllIIIll[lIIllIllIIlII[7]] = lIllIIIlIIIlIll("nz5uJEnDqBA=", "lqIKS");
    }

    private static boolean lIllIIIlIIlIIll(Object obj) {
        return obj == null;
    }

    @Inject
    public F(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        super(squireThieving, squireThievingConfig);
        this.ay = new WorldPoint(lIIllIllIIlII[0], lIIllIllIIlII[1], lIIllIllIIlII[2]);
    }

    private static String lIllIIIlIIIlIlI(String llllllllllllllIlllIllllIlIllIlll, String llllllllllllllIlllIllllIlIllIllI) {
        String llllllllllllllIlllIllllIlIllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllIlIllIlIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllIlIllIllI.toCharArray();
        int llllllllllllllIlllIllllIlIlIlllI = lIIllIllIIlII[2];
        char[] charArray2 = llllllllllllllIlllIllllIlIllIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIllIIlII[2];
        while (lIllIIIlIIlIlIl(i, length)) {
            char llllllllllllllIlllIllllIlIlllIII = charArray2[i];
            llllllllllllllIlllIllllIlIllIlIl.append((char) (llllllllllllllIlllIllllIlIlllIII ^ charArray[llllllllllllllIlllIllllIlIlIlllI % charArray.length]));
            "".length();
            llllllllllllllIlllIllllIlIlIlllI++;
            i++;
            "".length();
            if (((93 ^ 101) & ((189 ^ 133) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllllIlIllIlIl);
    }

    private static boolean lIllIIIlIIlIIII(int i, int i2) {
        return i > i2;
    }

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new int[9];
        lIIllIllIIlII[0] = (-((-6494) & 31231)) & (-4097) & 32495;
        lIIllIllIIlII[1] = (-12993) & 16369;
        lIIllIllIIlII[2] = ((((207 + 2) - 93) + 112) ^ (((180 + 109) - 272) + 165)) & (((((20 + 113) - 67) + 188) ^ (((166 + 11) - 26) + 21)) ^ (-" ".length()));
        lIIllIllIIlII[3] = 4 ^ 12;
        lIIllIllIIlII[4] = 186 ^ 172;
        lIIllIllIIlII[5] = -" ".length();
        lIIllIllIIlII[6] = "  ".length();
        lIIllIllIIlII[7] = " ".length();
        lIIllIllIIlII[8] = "   ".length();
    }

    private static boolean lIllIIIlIIlIlIl(int i, int i2) {
        return i < i2;
    }
}
