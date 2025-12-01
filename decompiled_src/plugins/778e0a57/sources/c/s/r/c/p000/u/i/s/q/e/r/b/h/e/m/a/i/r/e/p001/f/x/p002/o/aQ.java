package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
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
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Olm Melee Spec", priority = 20001, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aQ  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aQ.class */
public class aQ extends aR {
    private static /* synthetic */ String[] lIlIIIlIIlIl;
    private static /* synthetic */ int[] lIlIIIlIIllI;

    @Inject
    protected aQ(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlllllII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIlllllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aQ] */
    private boolean dp() {
        List arrayList = new ArrayList();
        int aA = this.ed.aA();
        if (llIlIlIlllllll(aA, lIlIIIlIIllI[5])) {
            arrayList = dH();
        }
        if (llIlIlIlllllll(aA, lIlIIIlIIllI[6])) {
            Movement.setDestination(dJ());
            return lIlIIIlIIllI[4];
        } else if (llIlIlIlllllll(aA, lIlIIIlIIllI[4])) {
            if (llIlIlIlllllll(this.ed.az(), lIlIIIlIIllI[7])) {
                Movement.setDestination(dK());
                return lIlIIIlIIllI[4];
            }
            Movement.setDestination(dJ());
            return lIlIIIlIIllI[4];
        } else {
            if (llIlIlIlllllll(aA, lIlIIIlIIllI[7])) {
                arrayList = dQ().toWorldPointList();
            }
            String k = k(lIlIIIlIIllI[4]);
            if (llIlIllIIIIIII(dI() ? 1 : 0) && llIlIllIIIIIII(k.equals(lIlIIIlIIlIl[lIlIIIlIIllI[4]]) ? 1 : 0)) {
                return dt();
            }
            if (llIlIlIllllIll(arrayList.size())) {
                arrayList = dH();
            }
            if (llIlIlIllllIll(arrayList.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                Movement.setDestination((WorldPoint) arrayList.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> {
                    return worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation());
                })).orElse(null));
                return lIlIIIlIIllI[4];
            }
            return lIlIIIlIIllI[4];
        }
    }

    private static boolean llIlIllIIIIIII(int i) {
        return i != 0;
    }

    private static void llIlIlIllllIIl() {
        lIlIIIlIIlIl = new String[lIlIIIlIIllI[6]];
        lIlIIIlIIlIl[lIlIIIlIIllI[0]] = llIlIlIlllIlll("GwY+ZgYnHT42VTsGPjRVMRkuJVU1DCo2GixJOCMBNxlrMRw2AWsnVTUMKjYaLEk/LhQ2SSMnBmIHJGYGMgwoZ1Rj", "BiKFu");
        lIlIIIlIIlIl[lIlIIIlIIllI[4]] = llIlIlIllllIII("j14j9O5t61w=", "VjoNZ");
    }

    static {
        llIlIlIllllIlI();
        llIlIlIllllIIl();
    }

    private static void llIlIlIllllIlI() {
        lIlIIIlIIllI = new int[9];
        lIlIIIlIIllI[0] = (133 ^ 137) & ((168 ^ 164) ^ (-1));
        lIlIIIlIIllI[1] = (-((-3252) & 16055)) & (-16393) & 29695;
        lIlIIIlIIllI[2] = -" ".length();
        lIlIIIlIIllI[3] = (-((-4657) & 31350)) & (-4097) & 31695;
        lIlIIIlIIllI[4] = " ".length();
        lIlIIIlIIllI[5] = (((123 + 120) - 129) + 77) ^ (((18 + 100) - 81) + 150);
        lIlIIIlIIllI[6] = "  ".length();
        lIlIIIlIIllI[7] = "   ".length();
        lIlIIIlIIllI[8] = (((124 + 11) - 108) + 102) ^ (((4 + 105) - 75) + 103);
    }

    private static String llIlIlIlllIlll(String lllllllllllllllIlllIIIIIIIlllIlI, String lllllllllllllllIlllIIIIIIIlllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIIIIIIlllIIl.toCharArray();
        int lllllllllllllllIlllIIIIIIIllIllI = lIlIIIlIIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIIllI[0];
        while (llIlIlIlllllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIIIIIIIllIllI % charArray.length]));
            "".length();
            lllllllllllllllIlllIIIIIIIllIllI++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIlIllllIII(String lllllllllllllllIlllIIIIIIIlIIlIl, String lllllllllllllllIlllIIIIIIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIllI[8]), "DES");
            Cipher lllllllllllllllIlllIIIIIIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIIIIlIIlll.init(lIlIIIlIIllI[6], lllllllllllllllIlllIIIIIIIlIlIII);
            return new String(lllllllllllllllIlllIIIIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIIIIlIIllI) {
            lllllllllllllllIlllIIIIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIlIlIllllllI(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static boolean llIlIlIllllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (llIlIlIllllIll(ds() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if ((!llIlIlIlllllII(this.ed.aG(), lIlIIIlIIllI[1]) || !llIlIlIlllllIl(this.ed.aG(), lIlIIIlIIllI[2])) && !llIlIlIllllllI(C0044s.aY())) {
            EquipmentSetup R = this.ea.R();
            int i = R.get(EquipmentInventorySlot.WEAPON);
            if (llIlIlIllllIll(Arrays.stream(Static.getClient().getEnum(lIlIIIlIIllI[3]).getKeys()).anyMatch(i2 -> {
                if (llIlIlIlllllll(i2, i)) {
                    ?? r0 = lIlIIIlIIllI[4];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIlIIllI[0];
            }) ? 1 : 0)) {
                Log.warn(lIlIIIlIIlIl[lIlIIIlIIllI[0]]);
                return lIlIIIlIIllI[0];
            }
            if (!llIlIlIllllIll(ct() ? 1 : 0) && !llIlIlIllllIll(dv() ? 1 : 0)) {
                if (llIlIlIllllIll(R.isEquipped() ? 1 : 0)) {
                    R.swap();
                }
                if (llIlIlIllllIll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
                if (llIlIlIllllIll(dT().contains(this.bS) ? 1 : 0)) {
                    Movement.setDestination(dL());
                    return lIlIIIlIIllI[4];
                }
                dt();
                "".length();
                return lIlIIIlIIllI[4];
            }
            return lIlIIIlIIllI[0];
        }
        return lIlIIIlIIllI[0];
    }

    private static boolean llIlIlIllllllI(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlIlllllIl(int i, int i2) {
        return i != i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return this.ea.R();
    }
}
