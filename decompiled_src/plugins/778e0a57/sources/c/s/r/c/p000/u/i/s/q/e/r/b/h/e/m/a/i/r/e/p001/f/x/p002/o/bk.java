package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Thieving", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bk  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bk.class */
public class bk extends U {
    private static /* synthetic */ int[] lIlIIllIIIII;
    private /* synthetic */ int am;
    private final /* synthetic */ int es = 7603;
    private /* synthetic */ C0039n ak;
    private final /* synthetic */ int er = 29742;
    private static /* synthetic */ String[] lIlIIlIlllll;
    private /* synthetic */ C0039n al;

    private static String llIllIIllIllll(String lllllllllllllllIllIllIIlIIlllIII, String lllllllllllllllIllIllIIlIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIllIIIII[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIlIIlllIIl) {
            lllllllllllllllIllIllIIlIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlllIlIl(int i) {
        return i > 0;
    }

    @Inject
    protected bk(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIllIIIII[0];
        this.er = lIlIIllIIIII[1];
        this.es = lIlIIllIIIII[2];
    }

    static {
        llIllIIlllIIll();
        llIllIIlllIIlI();
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllIIlllllII(int i, int i2) {
        return i != i2;
    }

    private static void llIllIIlllIIlI() {
        lIlIIlIlllll = new String[lIlIIllIIIII[18]];
        lIlIIlIlllll[lIlIIllIIIII[7]] = llIllIIllIllll("3lY+2GEDSt8=", "mGGkA");
        lIlIIlIlllll[lIlIIllIIIII[6]] = llIllIIlllIIII("KT8uNw==", "fOKYn");
        lIlIIlIlllll[lIlIIllIIIII[11]] = llIllIIlllIIIl("/N3PMxRVM8w=", "nuRBw");
        lIlIIlIlllll[lIlIIllIIIII[12]] = llIllIIlllIIII("PgY6CRcJAg==", "ngIzv");
        lIlIIlIlllll[lIlIIllIIIII[13]] = llIllIIlllIIII("PTgEEx8=", "xVpvm");
        lIlIIlIlllll[lIlIIllIIIII[14]] = llIllIIllIllll("bp2aiwuZ82o=", "xfGmL");
        lIlIIlIlllll[lIlIIllIIIII[15]] = llIllIIllIllll("QTtDaCW0hfk=", "dvOQa");
        lIlIIlIlllll[lIlIIllIIIII[16]] = llIllIIlllIIIl("cebsgpuebX3WqMwLVPZ3DtsPDGMTXPky", "gclvG");
    }

    private static boolean llIllIIllllIII(Object obj) {
        return obj == null;
    }

    private static boolean llIllIIlllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllIIlllllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIllIIlllIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllIIllllIll(this.ak.bw, N.THIEVING)) {
            ?? r0 = lIlIIllIIIII[6];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIllIIIII[7];
    }

    private static boolean llIllIIlllIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIllIIlllIIII(String lllllllllllllllIllIllIIlIlIllIlI, String lllllllllllllllIllIllIIlIlIllIIl) {
        String lllllllllllllllIllIllIIlIlIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIlIlIllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIIlIlIllIIl.toCharArray();
        int lllllllllllllllIllIllIIlIlIlIllI = lIlIIllIIIII[7];
        char[] charArray2 = lllllllllllllllIllIllIIlIlIllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIIIII[7];
        while (llIllIIlllIllI(i, length)) {
            lllllllllllllllIllIllIIlIlIllIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIIlIlIlIllI % charArray.length]));
            "".length();
            lllllllllllllllIllIllIIlIlIlIllI++;
            i++;
            "".length();
            if (((95 ^ 4) & ((60 ^ 103) ^ (-1))) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllIIlIlIllIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIIlllIlII(NPCs.getNearest(npc -> {
            if (!llIllIIllllIlI(npc.getName().contains(lIlIIlIlllll[lIlIIllIIIII[16]]) ? 1 : 0) || (llIllIIlllllII(npc.getAnimation(), lIlIIllIIIII[17]) && !llIllIIlllllIl(npc.getId(), lIlIIllIIIII[2]))) {
                return lIlIIllIIIII[7];
            }
            ?? r0 = lIlIIllIIIII[6];
            "".length();
            return (198 ^ 194) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }))) {
            return cS();
        }
        int J = (lIlIIllIIIII[3] - this.co.J()) + ((lIlIIllIIIII[4] - Skills.getLevel(Skill.THIEVING)) / lIlIIllIIIII[5]);
        if (!llIllIIlllIlIl(J)) {
            cS();
            "".length();
            return lIlIIllIIIII[6];
        }
        ?? r0 = lIlIIllIIIII[6];
        int[] iArr = new int[lIlIIllIIIII[6]];
        iArr[lIlIIllIIIII[7]] = lIlIIllIIIII[8];
        int count = Inventory.getCount((boolean) r0, iArr);
        if (!llIllIIlllIllI(count, J) || llIllIIlllIlll(count, lIlIIllIIIII[9])) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIllIIllllIlI(tileObject.getName().contains(lIlIIlIlllll[lIlIIllIIIII[14]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIllIIIII[6]];
                    strArr[lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[15]];
                    if (llIllIIllllIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r02 = lIlIIllIIIII[6];
                        "".length();
                        return (((((172 + 178) - 303) + 187) ^ (((57 + 153) - 187) + 155)) & (((((126 + 38) - 47) + 108) ^ (((13 + 173) - 3) + 2)) ^ (-" ".length()))) > 0 ? ((105 ^ 88) ^ (48 ^ 58)) & (((71 ^ 65) ^ (30 ^ 35)) ^ (-" ".length())) : r02;
                    }
                }
                return lIlIIllIIIII[7];
            });
            if (llIllIIllllIII(nearest)) {
                return lIlIIllIIIII[7];
            }
            if (!llIllIIllllIIl(this.bS.isMoving() ? 1 : 0) || llIllIIllllIlI(this.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            nearest.interact(lIlIIlIlllll[lIlIIllIIIII[7]]);
            return lIlIIllIIIII[6];
        }
        if (llIllIIllllIlI(Inventory.isFull() ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIllIIIII[6]];
            iArr2[lIlIIllIIIII[7]] = lIlIIllIIIII[8];
            if (llIllIIllllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIIllIIIII[6];
            }
        }
        int[] iArr3 = new int[lIlIIllIIIII[6]];
        iArr3[lIlIIllIIIII[7]] = lIlIIllIIIII[1];
        TileObject nearest2 = TileObjects.getNearest(iArr3);
        if (llIllIIllllIII(nearest2)) {
            return lIlIIllIIIII[7];
        }
        if (!llIllIIllllIIl(this.bS.isMoving() ? 1 : 0) || llIllIIllllIlI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIIIII[7];
        }
        nearest2.interact(lIlIIlIlllll[lIlIIllIIIII[6]]);
        return lIlIIllIIIII[6];
    }

    private static boolean llIllIIllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIllIIllllIlI(int i) {
        return i != 0;
    }

    private static void llIllIIlllIIll() {
        lIlIIllIIIII = new int[19];
        lIlIIllIIIII[0] = -" ".length();
        lIlIIllIIIII[1] = (-((-10243) & 11219)) & (-2049) & 32766;
        lIlIIllIIIII[2] = (-1) & 7603;
        lIlIIllIIIII[3] = (64 ^ 13) ^ (11 ^ 88);
        lIlIIllIIIII[4] = (173 ^ 168) ^ (76 ^ 45);
        lIlIIllIIIII[5] = (((114 + 8) - (-19)) + 41) ^ (((61 + 72) - (-13)) + 42);
        lIlIIllIIIII[6] = " ".length();
        lIlIIllIIIII[7] = ((23 ^ 123) ^ (1 ^ 101)) & (((14 ^ 96) ^ (1 ^ 103)) ^ (-" ".length()));
        lIlIIllIIIII[8] = (-((-18817) & 27619)) & (-2049) & 31735;
        lIlIIllIIIII[9] = (3 ^ 28) ^ (76 ^ 69);
        lIlIIllIIIII[10] = 191 ^ 177;
        lIlIIllIIIII[11] = "  ".length();
        lIlIIllIIIII[12] = "   ".length();
        lIlIIllIIIII[13] = 131 ^ 135;
        lIlIIllIIIII[14] = 43 ^ 46;
        lIlIIllIIIII[15] = (47 ^ 125) ^ (206 ^ 154);
        lIlIIllIIIII[16] = 15 ^ 8;
        lIlIIllIIIII[17] = (-((-4161) & 12917)) & (-129) & 16381;
        lIlIIllIIIII[18] = 127 ^ 119;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIllIIllllIlI(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIllIIlllIlII(Movement.getDestination()) && llIllIIllllIlI(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIllIIIII[6];
        }
        TileObject cR = cR();
        if (llIllIIllllIII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIllIIIII[10]).dy(lIlIIllIIIII[10]));
            return lIlIIllIIIII[6];
        } else if (!llIllIIllllIIl(this.bS.isMoving() ? 1 : 0) || llIllIIllllIlI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIIIII[7];
        } else {
            cR.interact(lIlIIlIlllll[lIlIIllIIIII[11]]);
            return lIlIIllIIIII[6];
        }
    }

    private static String llIllIIlllIIIl(String lllllllllllllllIllIllIIlIlIIIIll, String lllllllllllllllIllIllIIlIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIII[18]), "DES");
            Cipher lllllllllllllllIllIllIIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIlIlIIIlll.init(lIlIIllIIIII[11], secretKeySpec);
            return new String(lllllllllllllllIllIllIIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIlIlIIIllI) {
            lllllllllllllllIllIllIIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllllIIl(int i) {
        return i == 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllIIllllIlI(tileObject.getName().equals(lIlIIlIlllll[lIlIIllIIIII[12]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIllIIIII[6]];
                strArr[lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[13]];
                if (llIllIIllllIlI(tileObject.hasAction(strArr) ? 1 : 0) && llIllIIllllIlI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIllIIIII[6];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? ((227 ^ 199) ^ (34 ^ 58)) & (((113 ^ 37) ^ (19 ^ 123)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIllIIIII[7];
        });
    }
}
