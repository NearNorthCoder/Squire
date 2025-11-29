package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Harpooning pools", priority = 600, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.k  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/k.class */
public class k extends l {
    private static /* synthetic */ String[] lIIlllIIIlllI;
    public static final /* synthetic */ int am;
    private final /* synthetic */ Random an;
    private /* synthetic */ boolean ao;
    public static final /* synthetic */ int al;
    private /* synthetic */ int aq;
    private /* synthetic */ int ap;
    private static /* synthetic */ int[] lIIlllIIlIIIl;

    private static boolean lIllIIlIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIlIlIIIllI(String llllllllllllllIlllIlIllllllIllll, String llllllllllllllIlllIlIllllllIlllI) {
        String llllllllllllllIlllIlIllllllIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIllllllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIllllllIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlIllllllIlllI.toCharArray();
        int llllllllllllllIlllIlIllllllIlIll = lIIlllIIlIIIl[0];
        char[] charArray2 = llllllllllllllIlllIlIllllllIllll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIlIllllllIIIll = lIIlllIIlIIIl[0];
        while (lIllIIlIlIllIlI(llllllllllllllIlllIlIllllllIIIll, length)) {
            llllllllllllllIlllIlIllllllIllIl.append((char) (charArray2[llllllllllllllIlllIlIllllllIIIll] ^ charArray[llllllllllllllIlllIlIllllllIlIll % charArray.length]));
            "".length();
            llllllllllllllIlllIlIllllllIlIll++;
            llllllllllllllIlllIlIllllllIIIll++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlIllllllIllIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    protected k(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
        this.an = new Random();
        this.ao = lIIlllIIlIIIl[0];
        this.aq = this.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
    }

    private static boolean lIllIIlIlIllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIlIlIlll(Object obj) {
        return obj == null;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlllI = new String[lIIlllIIlIIIl[9]];
        lIIlllIIIlllI[lIIlllIIlIIIl[0]] = lIllIIlIlIIIlII("yY5al3QSIYs=", "iuTjo");
        lIIlllIIIlllI[lIIlllIIlIIIl[3]] = lIllIIlIlIIIllI("Dg00Fyc=", "JbAdB");
    }

    static {
        lIllIIlIlIIlllI();
        lIllIIlIlIIIlll();
        am = lIIlllIIlIIIl[11];
        al = lIIlllIIlIIIl[10];
    }

    private static boolean lIllIIlIlIlIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (lIllIIlIlIlIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ak() {
        if (lIllIIlIlIlIlIl(this.ar.M() ? 1 : 0) && lIllIIlIlIlIllI(this.ar.L() ? 1 : 0) && lIllIIlIlIlIllI(this.ar.m() ? 1 : 0)) {
            if (lIllIIlIlIlIllI(this.as.solo() ? 1 : 0)) {
                int[] iArr = new int[lIIlllIIlIIIl[3]];
                iArr[lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[4];
                if (lIllIIlIlIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlllIIlIIIl[3]];
                    iArr2[lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[5];
                }
            }
            ?? r0 = lIIlllIIlIIIl[3];
            "".length();
            return "   ".length() >= (196 ^ 192) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIIlIIIl[0];
    }

    private static boolean lIllIIlIlIlllII(int i, int i2) {
        return i != i2;
    }

    private static void lIllIIlIlIIlllI() {
        lIIlllIIlIIIl = new int[14];
        lIIlllIIlIIIl[0] = (110 ^ 39) & ((143 ^ 198) ^ (-1));
        lIIlllIIlIIIl[1] = 32 ^ 42;
        lIIlllIIlIIIl[2] = (81 ^ 112) ^ (46 ^ 27);
        lIIlllIIlIIIl[3] = " ".length();
        lIIlllIIlIIIl[4] = (-((-24707) & 27811)) & (-1) & 28669;
        lIIlllIIlIIIl[5] = (-4131) & 29694;
        lIIlllIIlIIIl[6] = (-5813) & 16383;
        lIIlllIIlIIIl[7] = (-((-24955) & 25599)) & (-1074) & 12287;
        lIIlllIIlIIIl[8] = (((92 + 29) - 20) + 28) ^ (((61 + 38) - 98) + 131);
        lIIlllIIlIIIl[9] = "  ".length();
        lIIlllIIlIIIl[10] = (-13318) & 14149;
        lIIlllIIlIIIl[11] = (-((-11233) & 12269)) & (-4129) & 7935;
        lIIlllIIlIIIl[12] = (110 ^ 6) ^ (126 ^ 18);
        lIIlllIIlIIIl[13] = (-3641) & 12283;
    }

    private static boolean lIllIIlIlIllIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIllIIlIlIIIlII(String llllllllllllllIlllIlIlllllIllIlI, String llllllllllllllIlllIlIlllllIllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIlllllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIlllllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlIIIl[9], llllllllllllllIlllIlIlllllIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIlllllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIlllllIllIll) {
            llllllllllllllIlllIlIlllllIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        NPC npc;
        NPC npc2;
        WorldPoint ag = this.ar.N().ag();
        int[] iArr = new int[lIIlllIIlIIIl[3]];
        iArr[lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[6];
        NPC nearest = NPCs.getNearest(ag, iArr);
        WorldPoint ag2 = this.ar.N().ag();
        int[] iArr2 = new int[lIIlllIIlIIIl[3]];
        iArr2[lIIlllIIlIIIl[0]] = lIIlllIIlIIIl[7];
        NPC nearest2 = NPCs.getNearest(ag2, iArr2);
        Player local = Players.getLocal();
        if (lIllIIlIlIlIlll(local)) {
            return lIIlllIIlIIIl[0];
        }
        if (lIllIIlIlIlIlIl(Movement.isRunEnabled() ? 1 : 0) && ((!lIllIIlIlIlIlIl(local.isMoving() ? 1 : 0) || lIllIIlIlIlIllI(local.isAnimating() ? 1 : 0)) && lIllIIlIlIllIII(Movement.getRunEnergy(), this.aq))) {
            Movement.toggleRun();
            this.aq = this.an.nextInt(lIIlllIIlIIIl[1]) + lIIlllIIlIIIl[2];
        }
        if (lIllIIlIlIlIlll(nearest) && lIllIIlIlIlIlll(nearest2)) {
            c N = this.ar.N();
            if (lIllIIlIlIllIII(local.distanceTo(N.ag()), lIIlllIIlIIIl[8])) {
                return this.ar.f(N.ag());
            }
        }
        if (lIllIIlIlIlIllI(this.as.solo() ? 1 : 0)) {
            NPC nearest3 = NPCs.getNearest(npc3 -> {
                if (lIllIIlIlIllIIl(npc3.getId(), lIIlllIIlIIIl[13])) {
                    String[] strArr = new String[lIIlllIIlIIIl[3]];
                    strArr[lIIlllIIlIIIl[0]] = lIIlllIIIlllI[lIIlllIIlIIIl[3]];
                    if (lIllIIlIlIlIllI(npc3.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIlllIIlIIIl[3];
                        "".length();
                        return "  ".length() <= 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                }
                return lIIlllIIlIIIl[0];
            });
            int c = this.au.c();
            if (lIllIIlIlIlIlll(nearest3)) {
                int E = this.ar.E();
                if (lIllIIlIlIllIIl(E, lIIlllIIlIIIl[3]) && lIllIIlIlIllIlI(c, this.ar.F())) {
                    this.ar.d((boolean) lIIlllIIlIIIl[0]);
                    this.ar.u();
                    this.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                } else if (lIllIIlIlIllIIl(E, lIIlllIIlIIIl[9]) && lIllIIlIlIllIlI(c, this.ar.G())) {
                    this.ar.d((boolean) lIIlllIIlIIIl[0]);
                    this.ar.u();
                    this.ao = lIIlllIIlIIIl[0];
                    return lIIlllIIlIIIl[0];
                }
            }
        }
        if (lIllIIlIlIllIll(nearest) && lIllIIlIlIlIllI(nearest.equals(local.getInteracting()) ? 1 : 0)) {
            int animation = local.getAnimation();
            nearest.getWorldArea().distanceTo2D(local.getWorldLocation());
            "".length();
            if (lIllIIlIlIlIllI(local.isAnimating() ? 1 : 0) && lIllIIlIlIlllII(animation, lIIlllIIlIIIl[10]) && lIllIIlIlIlllII(animation, lIIlllIIlIIIl[11])) {
                this.ao = lIIlllIIlIIIl[3];
            }
            return lIIlllIIlIIIl[0];
        }
        if (lIllIIlIlIllIll(nearest)) {
            npc = nearest;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return ((95 ^ 67) ^ (169 ^ 137)) & (((((57 + 137) - 137) + 116) ^ (((80 + 139) - 80) + 6)) ^ (-" ".length()));
            }
        } else {
            npc = nearest2;
        }
        if (!lIllIIlIlIllIII(local.distanceTo(npc), lIIlllIIlIIIl[12])) {
            if (lIllIIlIlIlIlll(nearest)) {
                if (lIllIIlIlIlIllI(this.ao ? 1 : 0)) {
                    this.ar.d((boolean) lIIlllIIlIIIl[0]);
                    this.ar.u();
                    this.ao = lIIlllIIlIIIl[0];
                }
                return lIIlllIIlIIIl[0];
            }
            return this.ar.a(nearest, lIIlllIIIlllI[lIIlllIIlIIIl[0]]);
        } else if (lIllIIlIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
            a aVar = this.ar;
            if (lIllIIlIlIllIll(nearest)) {
                npc2 = nearest;
                "".length();
                if (0 != 0) {
                    return ((137 ^ 166) ^ (117 ^ 77)) & (((23 ^ 65) ^ (94 ^ 31)) ^ (-" ".length()));
                }
            } else {
                npc2 = nearest2;
            }
            return aVar.c(npc2);
        } else {
            return lIIlllIIlIIIl[3];
        }
    }

    private static boolean lIllIIlIlIllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIlIlIlIlIl(int i) {
        return i == 0;
    }
}
