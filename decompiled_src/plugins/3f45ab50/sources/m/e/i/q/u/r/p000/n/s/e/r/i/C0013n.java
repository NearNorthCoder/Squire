package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Handling banking")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/n.class */
public class C0013n extends Task {
    private static /* synthetic */ int[] lllllIIIlIll;
    private static /* synthetic */ String[] lllllIIIlIlI;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

    private static boolean lIIlIIlIIlllIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    private boolean p() {
        NPC nearest = NPCs.getNearest(npc -> {
            String[] strArr = new String[lllllIIIlIll[4]];
            strArr[lllllIIIlIll[0]] = lllllIIIlIlI[lllllIIIlIll[4]];
            return npc.hasAction(strArr);
        });
        if (lIIlIIlIIlllIll(nearest)) {
            if (lIIlIIlIIlllIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(lllllIIIlIlI[lllllIIIlIll[0]]);
                return lllllIIIlIll[4];
            }
            Movement.walkTo(nearest);
            "".length();
            return lllllIIIlIll[4];
        } else if (lIIlIIlIIlllIIl(Locations.isRegionLoaded(lllllIIIlIll[6]) ? 1 : 0)) {
            Movement.walkTo(lllllIIIlIll[7], lllllIIIlIll[8]);
            "".length();
            return lllllIIIlIll[4];
        } else if (lIIlIIlIIlllIIl(Locations.isRegionLoaded(lllllIIIlIll[9]) ? 1 : 0)) {
            Movement.walkTo(lllllIIIlIll[10], lllllIIIlIll[11]);
            "".length();
            return lllllIIIlIll[4];
        } else {
            return lllllIIIlIll[0];
        }
    }

    static {
        lIIlIIlIIllIlll();
        lIIlIIlIIllIllI();
    }

    private static void lIIlIIlIIllIllI() {
        lllllIIIlIlI = new String[lllllIIIlIll[2]];
        lllllIIIlIlI[lllllIIIlIll[0]] = lIIlIIlIIllIlII("MgEZEj0JFgE=", "fduwM");
        lllllIIIlIlI[lllllIIIlIll[4]] = lIIlIIlIIllIlIl("sFfxRxPA9cApGJNOinJ4Eg==", "WaHyr");
    }

    private static String lIIlIIlIIllIlII(String lllllllllllllllIIlIIllIIllllIlIl, String lllllllllllllllIIlIIllIIllllIlII) {
        String lllllllllllllllIIlIIllIIllllIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIllllIIlI = lllllllllllllllIIlIIllIIllllIlII.toCharArray();
        int lllllllllllllllIIlIIllIIllllIIIl = lllllIIIlIll[0];
        char[] charArray = lllllllllllllllIIlIIllIIllllIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllllIIIlIll[0];
        while (lIIlIIlIIllllII(i, length)) {
            char lllllllllllllllIIlIIllIIllllIllI = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIllIIllllIllI ^ lllllllllllllllIIlIIllIIllllIIlI[lllllllllllllllIIlIIllIIllllIIIl % lllllllllllllllIIlIIllIIllllIIlI.length]));
            "".length();
            lllllllllllllllIIlIIllIIllllIIIl++;
            i++;
            "".length();
            if ("   ".length() == (((153 ^ 167) ^ (95 ^ 67)) & (((((18 + 114) - 90) + 112) ^ (((118 + 21) - 90) + 135)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIlIIlIIllIlll() {
        lllllIIIlIll = new int[13];
        lllllIIIlIll[0] = (31 ^ 26) & ((145 ^ 148) ^ (-1));
        lllllIIIlIll[1] = (-17077) & 28671;
        lllllIIIlIll[2] = "  ".length();
        lllllIIIlIll[3] = (-24681) & 32616;
        lllllIIIlIll[4] = " ".length();
        lllllIIIlIll[5] = (-((-2037) & 20471)) & (-12353) & 32222;
        lllllIIIlIll[6] = (-((-9313) & 28139)) & (-65) & 31743;
        lllllIIIlIll[7] = (-4611) & 7862;
        lllllIIIlIll[8] = (-((-19714) & 24501)) & (-16389) & 24575;
        lllllIIIlIll[9] = (-((-8209) & 9054)) & (-21635) & 32767;
        lllllIIIlIll[10] = (-26082) & 28671;
        lllllIIIlIll[11] = (-17137) & 20223;
        lllllIIIlIll[12] = (((100 + 27) - (-5)) + 13) ^ (((71 + 101) - 57) + 38);
    }

    private static boolean lIIlIIlIIlllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIlIIlIIllIlIl(String lllllllllllllllIIlIIllIIlllIIIII, String lllllllllllllllIIlIIllIIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIlllll.getBytes(StandardCharsets.UTF_8)), lllllIIIlIll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIIlIll[2], lllllllllllllllIIlIIllIIlllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIlllIIIIl) {
            lllllllllllllllIIlIIllIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIIlllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIIlIIlllIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlIIlllIII(this.f.activity(), EnumC0000a.ESSENCE) && !lIIlIIlIIlllIIl(Locations.isRegionLoaded(lllllIIIlIll[1]) ? 1 : 0)) {
            int[] iArr = new int[lllllIIIlIll[2]];
            iArr[lllllIIIlIll[0]] = lllllIIIlIll[3];
            iArr[lllllIIIlIll[4]] = lllllIIIlIll[5];
            if (lIIlIIlIIlllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                return p();
            }
            if (!lIIlIIlIIlllIIl(Bank.open() ? 1 : 0)) {
                Movement.walkTo(BankLocation.getNearest().getArea().getCenter());
                "".length();
                return lllllIIIlIll[4];
            }
            int[] iArr2 = new int[lllllIIIlIll[2]];
            iArr2[lllllIIIlIll[0]] = lllllIIIlIll[3];
            iArr2[lllllIIIlIll[4]] = lllllIIIlIll[5];
            Bank.depositAll(iArr2);
            return lllllIIIlIll[4];
        }
        return lllllIIIlIll[0];
    }

    private static boolean lIIlIIlIIllllII(int i, int i2) {
        return i < i2;
    }
}
