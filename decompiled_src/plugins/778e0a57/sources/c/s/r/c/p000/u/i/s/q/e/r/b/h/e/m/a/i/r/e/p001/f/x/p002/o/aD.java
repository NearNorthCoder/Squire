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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Shamans", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aD  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aD.class */
public class aD extends U {
    private static /* synthetic */ String[] lIlIlIlIlIII;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ C0039n al;
    private static /* synthetic */ int[] lIlIlIlIlIIl;
    private /* synthetic */ int am;

    static {
        llIllllIIIIIlI();
        llIllllIIIIIIl();
    }

    private static boolean llIllllIIIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIllllIIIIllI(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIllllIIIIlll(Movement.getDestination()) && llIllllIIIIllI(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIlIlIlIIl[2];
            }
            Movement.setDestination(this.al.bs);
            return lIlIlIlIlIIl[1];
        }
        TileObject cR = cR();
        if (llIllllIIIIlII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIlIlIlIIl[4]).dy(lIlIlIlIlIIl[4]));
            return lIlIlIlIlIIl[1];
        } else if (!llIllllIIIlIII(this.bS.isMoving() ? 1 : 0) || llIllllIIIIllI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIlIlIIl[2];
        } else {
            cR.interact(lIlIlIlIlIII[lIlIlIlIlIIl[2]]);
            return lIlIlIlIlIIl[1];
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllllIIIIllI(tileObject.getName().equals(lIlIlIlIlIII[lIlIlIlIlIIl[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIlIlIIl[1]];
                strArr[lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[5]];
                if (llIllllIIIIllI(tileObject.hasAction(strArr) ? 1 : 0) && llIllllIIIIllI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIlIlIlIIl[1];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIlIlIIl[2];
        });
    }

    @Inject
    protected aD(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIlIlIIl[0];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static String llIlllIlllllll(String lllllllllllllllIllIIllllllIllIII, String lllllllllllllllIllIIllllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllllllIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllllllIllIIl) {
            lllllllllllllllIllIIllllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static String llIllllIIIIIII(String lllllllllllllllIllIIlllllllIllIl, String lllllllllllllllIllIIlllllllIllII) {
        String lllllllllllllllIllIIlllllllIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlllllllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlllllllIlIll = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIlllllllIllII.toCharArray();
        int lllllllllllllllIllIIlllllllIlIIl = lIlIlIlIlIIl[2];
        char[] charArray2 = lllllllllllllllIllIIlllllllIllIl2.toCharArray();
        int lllllllllllllllIllIIlllllllIIIlI = charArray2.length;
        int i = lIlIlIlIlIIl[2];
        while (llIllllIIIlIIl(i, lllllllllllllllIllIIlllllllIIIlI)) {
            lllllllllllllllIllIIlllllllIlIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIlllllllIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIllIIlllllllIlIIl++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIlllllllIlIll);
    }

    private static boolean llIllllIIIIlll(Object obj) {
        return obj != null;
    }

    private static boolean llIllllIIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlllIllllllI(String lllllllllllllllIllIIllllllllllIl, String lllllllllllllllIllIIllllllllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllllllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllllllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllllllllllll.init(lIlIlIlIlIIl[5], lllllllllllllllIllIlIIIIIIIIIIII);
            return new String(lllllllllllllllIllIIllllllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlllllllllllI) {
            lllllllllllllllIllIIlllllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        return lIlIlIlIlIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllllIIIIIll(this.ak.bw, N.SHAMANS)) {
            ?? r0 = lIlIlIlIlIIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIlIlIIl[2];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIllllIIIIllI(npc.getName().contains(lIlIlIlIlIII[lIlIlIlIlIIl[6]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIlIlIIl[1]];
                strArr[lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[7]];
                if (llIllllIIIIllI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIlIlIIl[1];
                    "".length();
                    return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIlIlIIl[2];
        });
        if (llIllllIIIIlII(nearest) || llIllllIIIIlIl(nearest.getWorldLocation().distanceTo(this.bS), lIlIlIlIlIIl[3])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static void llIllllIIIIIIl() {
        lIlIlIlIlIII = new String[lIlIlIlIlIIl[3]];
        lIlIlIlIlIII[lIlIlIlIlIIl[2]] = llIlllIllllllI("d+mAZwqPmS4=", "baZgF");
        lIlIlIlIlIII[lIlIlIlIlIIl[1]] = llIlllIlllllll("UCVbRp2xWok=", "uFLjc");
        lIlIlIlIlIII[lIlIlIlIlIIl[5]] = llIllllIIIIIII("MTozFxE=", "tTGrc");
        lIlIlIlIlIII[lIlIlIlIlIIl[6]] = llIlllIlllllll("60/87xYlZvdktM3nM5sAaQ==", "QLCvU");
        lIlIlIlIlIII[lIlIlIlIlIIl[7]] = llIllllIIIIIII("DDsfNikm", "MOkWJ");
    }

    private static boolean llIllllIIIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIllllIIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void llIllllIIIIIlI() {
        lIlIlIlIlIIl = new int[9];
        lIlIlIlIlIIl[0] = -" ".length();
        lIlIlIlIlIIl[1] = " ".length();
        lIlIlIlIlIIl[2] = ((((136 + 79) - 192) + 131) ^ (((31 + 103) - 103) + 152)) & (((((64 + 40) - 68) + 129) ^ (((112 + 117) - 188) + 95)) ^ (-" ".length()));
        lIlIlIlIlIIl[3] = 7 ^ 2;
        lIlIlIlIlIIl[4] = 213 ^ 197;
        lIlIlIlIlIIl[5] = "  ".length();
        lIlIlIlIlIIl[6] = "   ".length();
        lIlIlIlIlIIl[7] = 174 ^ 170;
        lIlIlIlIlIIl[8] = (177 ^ 130) ^ (122 ^ 65);
    }
}
