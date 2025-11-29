package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.v  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/v.class */
public class v implements InterfaceC0011l {
    private final /* synthetic */ String ak;
    private static /* synthetic */ int[] lIlIIIllIllll;
    private final /* synthetic */ boolean al;
    private final /* synthetic */ boolean am;
    private final /* synthetic */ String aj;
    private static /* synthetic */ int ah;
    private static /* synthetic */ String[] lIlIIIllIlllI;

    private static void lIlllIIIIlllIIl() {
        lIlIIIllIlllI = new String[lIlIIIllIllll[6]];
        lIlIIIllIlllI[lIlIIIllIllll[1]] = lIlllIIIIllIlll("hQaQGkj8h8sQBcbOxRbJTy8AyZEjQO8Z", "IQiTk");
        lIlIIIllIlllI[lIlIIIllIllll[0]] = lIlllIIIIlllIII("ibLD2+ToTM3imvGRPAq8Xw==", "hZZBx");
    }

    private static void lIlllIIIIlllIlI() {
        lIlIIIllIllll = new int[8];
        lIlIIIllIllll[0] = " ".length();
        lIlIIIllIllll[1] = (100 ^ 83) & ((180 ^ 131) ^ (-1));
        lIlIIIllIllll[2] = -" ".length();
        lIlIIIllIllll[3] = (((53 + 87) - 41) + 36) ^ (((126 + 2) - 48) + 48);
        lIlIIIllIllll[4] = 1 ^ 5;
        lIlIIIllIllll[5] = "   ".length();
        lIlIIIllIllll[6] = "  ".length();
        lIlIIIllIllll[7] = 171 ^ 163;
    }

    private static boolean lIlllIIIIllllll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlllIIIIllllII(int i) {
        return i != 0;
    }

    private static boolean lIlllIIIIlllllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIlllIIIIllllII(npc.getName().equals(this.aj) ? 1 : 0) && lIlllIIIIllllII(npc.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIIIlllIll(npc.getInteracting()) && lIlllIIIlIIIIII(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIlIIIllIllll[0];
                "".length();
                return ((86 ^ 88) ^ (203 ^ 193)) < 0 ? ((245 ^ 145) ^ (123 ^ 1)) & (((65 ^ 80) ^ (126 ^ 113)) ^ (-" ".length())) : r0;
            }
            return lIlIIIllIllll[1];
        });
        if (lIlllIIIIlllIll(nearest)) {
            if (lIlllIIIIllllII(this.am ? 1 : 0)) {
                String[] strArr = new String[lIlIIIllIllll[0]];
                strArr[lIlIIIllIllll[1]] = lIlIIIllIlllI[lIlIIIllIllll[1]];
                Movement.walkTo(NPCs.getNearest(strArr));
                "".length();
                return lIlIIIllIllll[1];
            }
            return lIlIIIllIllll[1];
        } else if (lIlllIIIIllllIl(Players.getLocal().getInteracting())) {
            return lIlIIIllIllll[1];
        } else {
            if (lIlllIIIIlllllI(ah, lIlIIIllIllll[0])) {
                ah -= lIlIIIllIllll[0];
                return lIlIIIllIllll[1];
            }
            if (!lIlllIIIIllllll(Players.getLocal().getAnimation(), lIlIIIllIllll[2]) && !lIlllIIIlIIIIII(Movement.shouldWalk() ? 1 : 0)) {
                if (lIlllIIIlIIIIII(this.al ? 1 : 0) && lIlllIIIlIIIIII(this.am ? 1 : 0) && lIlllIIIlIIIIII(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    System.out.println(lIlIIIllIlllI[lIlIIIllIllll[0]]);
                    a(nearest);
                    return lIlIIIllIllll[0];
                } else if (lIlllIIIlIIIIII(this.am ? 1 : 0) && lIlllIIIIlllllI(nearest.getWorldLocation().distanceTo(Players.getLocal()), lIlIIIllIllll[3])) {
                    a(nearest);
                    return lIlIIIllIllll[0];
                } else if (lIlllIIIIllllII(this.am ? 1 : 0)) {
                    Magic.cast(SpellBook.Standard.WIND_STRIKE, nearest);
                    return lIlIIIllIllll[0];
                } else {
                    nearest.interact(this.ak);
                    ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
                    return lIlIIIllIllll[0];
                }
            }
            return lIlIIIllIllll[1];
        }
    }

    private static String lIlllIIIIlllIII(String llllllllllllllIlllIIIlIIIIIllllI, String llllllllllllllIlllIIIlIIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllIllll[7]), "DES");
            Cipher llllllllllllllIlllIIIlIIIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIIIIlIIIII.init(lIlIIIllIllll[6], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIIIIlllll) {
            llllllllllllllIlllIIIlIIIIIlllll.printStackTrace();
            return null;
        }
    }

    static {
        lIlllIIIIlllIlI();
        lIlllIIIIlllIIl();
    }

    private static boolean lIlllIIIIlllIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIIIIllllIl(Object obj) {
        return obj != null;
    }

    private static String lIlllIIIIllIlll(String llllllllllllllIlllIIIlIIIIIlIIIl, String llllllllllllllIlllIIIlIIIIIIlllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIllIllll[6], llllllllllllllIlllIIIlIIIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIIIIlIIlI) {
            llllllllllllllIlllIIIlIIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    public void a(NPC npc) {
        if (lIlllIIIIlllIll(npc)) {
            return;
        }
        WorldPoint worldLocation = npc.getWorldLocation();
        Random random = new Random();
        int nextInt = random.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        int nextInt2 = random.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        if (lIlllIIIlIIIIII(nextInt) && lIlllIIIlIIIIII(nextInt2)) {
            nextInt = lIlIIIllIllll[0];
        }
        Walker.walkTo(new WorldPoint(worldLocation.getX() + nextInt, worldLocation.getY() + nextInt2, worldLocation.getPlane()));
        "".length();
        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
    }

    private static boolean lIlllIIIlIIIIII(int i) {
        return i == 0;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0011l
    public String y() {
        return this.aj;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0011l
    public String z() {
        return this.ak;
    }

    public v(String str, String str2, boolean z, boolean z2) {
        this.aj = str;
        this.ak = str2;
        this.al = z;
        this.am = z2;
    }
}
