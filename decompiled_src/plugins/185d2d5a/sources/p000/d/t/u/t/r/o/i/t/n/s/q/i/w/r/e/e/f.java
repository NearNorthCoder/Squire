package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Chopping bruma tree")
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.f  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/f.class */
public class f extends Task {
    private final /* synthetic */ b F;
    private static /* synthetic */ String[] lIlIllllIlIlI;
    private static /* synthetic */ int[] lIlIllllIllIl;
    public static final /* synthetic */ String D;
    private final /* synthetic */ SquireWintertodtConfig E;

    private static boolean llIIIIllIIlIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIllIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llIIIIllIIIlllI() {
        lIlIllllIllIl = new int[10];
        lIlIllllIllIl[0] = (7 ^ 60) & ((149 ^ 174) ^ (-1));
        lIlIllllIllIl[1] = " ".length();
        lIlIllllIllIl[2] = (((39 + 26) - 50) + 129) ^ (((2 + 130) - 32) + 37);
        lIlIllllIllIl[3] = (62 ^ 31) ^ (51 ^ 118);
        lIlIllllIllIl[4] = "  ".length();
        lIlIllllIllIl[5] = "   ".length();
        lIlIllllIllIl[6] = (105 ^ 64) ^ (142 ^ 163);
        lIlIllllIllIl[7] = (((143 + 131) - 104) + 25) ^ (((177 + 164) - 169) + 26);
        lIlIllllIllIl[8] = (((20 + 8) - (-18)) + 128) ^ (((31 + 103) - 45) + 79);
        lIlIllllIllIl[9] = 154 ^ 146;
    }

    @Inject
    public f(SquireWintertodtConfig squireWintertodtConfig, b bVar) {
        this.E = squireWintertodtConfig;
        this.F = bVar;
    }

    static {
        llIIIIllIIIlllI();
        llIIIIllIIIIIll();
        D = lIlIllllIlIlI[lIlIllllIllIl[7]];
    }

    private static void llIIIIllIIIIIll() {
        lIlIllllIlIlI = new String[lIlIllllIllIl[8]];
        lIlIllllIlIlI[lIlIllllIllIl[0]] = llIIIIlIlllllIl("EP84ftDodcrQf3uOq09qPg==", "KzBeM");
        lIlIllllIlIlI[lIlIllllIllIl[1]] = llIIIIlIlllllIl("9nMSRHq+NtQ=", "iMPQi");
        lIlIllllIlIlI[lIlIllllIllIl[4]] = llIIIIlIlllllIl("habKwYx+cm0zpW0V+FFSJzW2Feo9RzTe", "oLQlp");
        lIlIllllIlIlI[lIlIllllIllIl[5]] = llIIIIllIIIIIIl("VORvwV5Q3oQhmEuV0/3TLQ==", "wOpfO");
        lIlIllllIlIlI[lIlIllllIllIl[6]] = llIIIIllIIIIIIl("umRmHfaKM6mL5EN6lbxMdQ==", "hbtsE");
        lIlIllllIlIlI[lIlIllllIllIl[7]] = llIIIIllIIIIIIl("3XQ7UAbSwdqJFwQhVCz0fg==", "aSNWt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        if (llIIIIllIIIllll(this.F.i() ? 1 : 0) && llIIIIllIIIllll(this.F.u() ? 1 : 0) && !llIIIIllIIIllll(this.F.j() ? 1 : 0)) {
            a q = this.F.q();
            WorldPoint c = q.c();
            String[] strArr = new String[lIlIllllIllIl[1]];
            strArr[lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[0]];
            TileObject nearest = TileObjects.getNearest(c, strArr);
            if (llIIIIllIIlIIII(nearest)) {
                return lIlIllllIllIl[0];
            }
            Player local = Players.getLocal();
            if (!llIIIIllIIlIIIl(local.isAnimating() ? 1 : 0) || llIIIIllIIIllll(local.isMoving() ? 1 : 0)) {
                return lIlIllllIllIl[0];
            }
            if (llIIIIllIIlIIIl(Movement.isRunEnabled() ? 1 : 0) && llIIIIllIIlIIlI(Movement.getRunEnergy(), lIlIllllIllIl[2])) {
                Movement.toggleRun();
            }
            if (llIIIIllIIIllll(this.E.spec() ? 1 : 0) && llIIIIllIIlIIll(Combat.getSpecEnergy(), lIlIllllIllIl[3]) && llIIIIllIIIllll(B() ? 1 : 0)) {
                Combat.toggleSpec();
                return lIlIllllIllIl[0];
            } else if (llIIIIllIIlIIIl(local.getWorldLocation().equals(q.c()) ? 1 : 0)) {
                Movement.walk(q.c());
                return lIlIllllIllIl[1];
            } else {
                nearest.interact(lIlIllllIlIlI[lIlIllllIllIl[1]]);
                return lIlIllllIllIl[1];
            }
        }
        return lIlIllllIllIl[0];
    }

    private static boolean llIIIIllIIIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean B() {
        if (llIIIIllIIlIIIl(Equipment.contains(item -> {
            return item.getName().contains(lIlIllllIlIlI[lIlIllllIllIl[6]]);
        }) ? 1 : 0)) {
            String[] strArr = new String[lIlIllllIllIl[1]];
            strArr[lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[4]];
            if (llIIIIllIIlIIIl(Equipment.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIllllIllIl[1]];
                strArr2[lIlIllllIllIl[0]] = lIlIllllIlIlI[lIlIllllIllIl[5]];
                if (!llIIIIllIIIllll(Equipment.contains(strArr2) ? 1 : 0)) {
                    return lIlIllllIllIl[0];
                }
            }
        }
        ?? r0 = lIlIllllIllIl[1];
        "".length();
        return (((((114 + 121) - 214) + 143) ^ (((87 + 123) - 110) + 74)) & (((((107 + 144) - 230) + 159) ^ (((31 + 86) - 84) + 157)) ^ (-" ".length()))) != 0 ? ((132 ^ 170) ^ (119 ^ 17)) & (((((113 + 71) - 18) + 49) ^ (((72 + 146) - 173) + 114)) ^ (-" ".length())) : r0;
    }

    private static boolean llIIIIllIIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static String llIIIIllIIIIIIl(String llllllllllllllIllIIlllIlIllllIlI, String llllllllllllllIllIIlllIlIllllIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIllllIII.getBytes(StandardCharsets.UTF_8)), lIlIllllIllIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllllIllIl[4], llllllllllllllIllIIlllIlIllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlIllllIll) {
            llllllllllllllIllIIlllIlIllllIll.printStackTrace();
            return null;
        }
    }

    private static String llIIIIlIlllllIl(String llllllllllllllIllIIlllIlIllIlIlI, String llllllllllllllIllIIlllIlIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIlIllIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIlIllIllII.init(lIlIllllIllIl[4], llllllllllllllIllIIlllIlIllIllIl);
            return new String(llllllllllllllIllIIlllIlIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlIllIlIll) {
            llllllllllllllIllIIlllIlIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIIlIIII(Object obj) {
        return obj == null;
    }
}
