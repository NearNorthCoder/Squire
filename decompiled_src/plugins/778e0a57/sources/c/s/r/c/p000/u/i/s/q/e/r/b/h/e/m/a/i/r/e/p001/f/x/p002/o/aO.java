package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Olm Melee Hand", priority = 20000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aO  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aO.class */
public class aO extends aR {
    private static /* synthetic */ int[] lIlIIlIIlIll;
    private static /* synthetic */ String[] lIlIIlIIlIlI;
    private /* synthetic */ boolean dZ;

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIllIIIlIllII(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static void llIllIIIlIIllI() {
        lIlIIlIIlIlI = new String[lIlIIlIIlIll[7]];
        lIlIIlIIlIlI[lIlIIlIIlIll[0]] = llIllIIIlIIlII("BB+r110ZBoY=", "XTiph");
        lIlIIlIIlIlI[lIlIIlIIlIll[3]] = llIllIIIlIIlIl("BwopNwoP", "JCmsF");
        lIlIIlIIlIlI[lIlIIlIIlIll[4]] = llIllIIIlIIlII("ZVokModijRo=", "tkDyD");
        lIlIIlIIlIlI[lIlIIlIIlIll[2]] = llIllIIIlIIlIl("Ly0ILxUn", "bdLkY");
        lIlIIlIIlIlI[lIlIIlIIlIll[1]] = llIllIIIlIIlII("wL9WD7oKOqg=", "qbHQm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aO] */
    private boolean dp() {
        List arrayList = new ArrayList();
        int lllllllllllllllIllIllIlllIIllIll = this.ed.aA();
        if (llIllIIIlIlIlI(lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[1])) {
            arrayList = dH();
        }
        if (llIllIIIlIlIlI(lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[4])) {
            Movement.setDestination(dJ());
            return lIlIIlIIlIll[3];
        } else if (llIllIIIlIlIlI(lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[3])) {
            if (!llIllIIIlIlIll(this.ed.az(), lIlIIlIIlIll[2]) || llIllIIIlIlIlI(this.ed.az(), lIlIIlIIlIll[4])) {
                Movement.setDestination(dK());
                return lIlIIlIIlIll[3];
            }
            Movement.setDestination(dJ());
            return lIlIIlIIlIll[3];
        } else {
            if (llIllIIIlIlIlI(lllllllllllllllIllIllIlllIIllIll, lIlIIlIIlIll[2])) {
                if (llIllIIIlIlIIl(this.ed.am().equals(lIlIIlIIlIlI[lIlIIlIIlIll[2]]) ? 1 : 0)) {
                    Movement.setDestination(dJ());
                    return lIlIIlIIlIll[3];
                }
                arrayList = dQ().toWorldPointList();
            }
            String k = k(lIlIIlIIlIll[3]);
            if (llIllIIIlIlIIl(dI() ? 1 : 0) && llIllIIIlIlIIl(k.equals(lIlIIlIIlIlI[lIlIIlIIlIll[1]]) ? 1 : 0)) {
                return dt();
            }
            if (llIllIIIlIlIII(arrayList.size())) {
                arrayList = dH();
            }
            if (llIllIIIlIlIII(arrayList.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination((WorldPoint) arrayList.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> {
                    return worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation());
                })).orElse(null));
                return lIlIIlIIlIll[3];
            }
            return lIlIIlIIlIll[3];
        }
    }

    private static boolean llIllIIIlIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIIlIlIII(int i) {
        return i == 0;
    }

    private static boolean llIllIIIlIlIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllIIIlIlIIl(int i) {
        return i != 0;
    }

    static {
        llIllIIIlIIlll();
        llIllIIIlIIllI();
    }

    private static boolean llIllIIIlIlIlI(int i, int i2) {
        return i == i2;
    }

    public void db() {
        if (llIllIIIlIlIIl(cj().isFullyEquipped() ? 1 : 0) && llIllIIIlIllIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] iArr = new int[lIlIIlIIlIll[4]];
            iArr[lIlIIlIIlIll[0]] = lIlIIlIIlIll[5];
            iArr[lIlIIlIIlIll[3]] = lIlIIlIIlIll[6];
            if (llIllIIIlIlIIl(Equipment.contains(iArr) ? 1 : 0)) {
                Combat.setAttackStyle(Combat.AttackStyle.FIRST);
            }
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return this.ea.Q();
    }

    private static boolean llIllIIIlIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected aO(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIlIIlIll[0];
    }

    private static void llIllIIIlIIlll() {
        lIlIIlIIlIll = new int[9];
        lIlIIlIIlIll[0] = ((71 ^ 65) ^ (65 ^ 6)) & (((18 ^ 44) ^ (((1 + 57) - (-57)) + 12)) ^ (-" ".length()));
        lIlIIlIIlIll[1] = 71 ^ 67;
        lIlIIlIIlIll[2] = "   ".length();
        lIlIIlIIlIll[3] = " ".length();
        lIlIIlIIlIll[4] = "  ".length();
        lIlIIlIIlIll[5] = (-9222) & 32199;
        lIlIIlIIlIll[6] = (-269) & 12157;
        lIlIIlIIlIll[7] = (51 ^ 10) ^ (38 ^ 26);
        lIlIIlIIlIll[8] = (((65 + 63) - 88) + 91) ^ (((122 + 91) - 104) + 30);
    }

    private static String llIllIIIlIIlII(String lllllllllllllllIllIllIlllIIIIlll, String lllllllllllllllIllIllIlllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIll[8]), "DES");
            Cipher lllllllllllllllIllIllIlllIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlllIIIlIIl.init(lIlIIlIIlIll[4], lllllllllllllllIllIllIlllIIIlIlI);
            return new String(lllllllllllllllIllIllIlllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlllIIIlIII) {
            lllllllllllllllIllIllIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIlIllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        boolean z;
        if (!llIllIIIlIlIII(ct() ? 1 : 0) && !llIllIIIlIlIIl(du() ? 1 : 0) && !llIllIIIlIlIII(ds() ? 1 : 0)) {
            cm();
            db();
            if (llIllIIIlIlIII(this.ed.aG())) {
                dt();
                "".length();
                return lIlIIlIIlIll[0];
            }
            String am = this.ed.am();
            if (llIllIIIlIlIlI(this.ed.az(), lIlIIlIIlIll[1])) {
                return dt();
            }
            if (llIllIIIlIlIlI(this.ed.aA(), lIlIIlIIlIll[2])) {
                if (!llIllIIIlIlIII(am.equals(lIlIIlIIlIlI[lIlIIlIIlIll[0]]) ? 1 : 0) || llIllIIIlIlIIl(am.equals(lIlIIlIIlIlI[lIlIIlIIlIll[3]]) ? 1 : 0)) {
                    int i = lIlIIlIIlIll[3];
                    "".length();
                    z = i;
                    if (0 != 0) {
                        return ((67 ^ 32) ^ (25 ^ 43)) & (((((21 + 219) - 161) + 144) ^ (((122 + 52) - 113) + 81)) ^ (-" ".length()));
                    }
                } else {
                    z = lIlIIlIIlIll[0];
                }
                this.dZ = z;
            }
            if (llIllIIIlIlIIl(this.dZ ? 1 : 0)) {
                return dp();
            }
            if (llIllIIIlIlIIl(am.equals(lIlIIlIIlIlI[lIlIIlIIlIll[4]]) ? 1 : 0) && llIllIIIlIlIII(this.bS.getWorldLocation().equals(dJ()) ? 1 : 0)) {
                Movement.setDestination(dJ());
                return lIlIIlIIlIll[3];
            } else if (llIllIIIlIlIII(this.bS.getWorldLocation().equals(dJ()) ? 1 : 0)) {
                Movement.setDestination(dL());
                return lIlIIlIIlIll[3];
            } else {
                return lIlIIlIIlIll[0];
            }
        }
        return lIlIIlIIlIll[0];
    }

    private static String llIllIIIlIIlIl(String lllllllllllllllIllIllIllIlllIlll, String lllllllllllllllIllIllIllIlllIllI) {
        String lllllllllllllllIllIllIllIlllIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIllIlllIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIllIlllIllI.toCharArray();
        int lllllllllllllllIllIllIllIlllIIll = lIlIIlIIlIll[0];
        char[] charArray2 = lllllllllllllllIllIllIllIlllIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIlIll[0];
        while (llIllIIIlIlllI(i, length)) {
            lllllllllllllllIllIllIllIlllIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIllIlllIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIllIllIlllIIll++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllIllIlllIlIl);
    }
}
