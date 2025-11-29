package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Enabling special attack", priority = 10)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.s  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/s.class */
public class s extends Task {
    private static /* synthetic */ int[] lIIllIIIllIIl;
    private static /* synthetic */ String[] lIIllIIIllIII;
    private final /* synthetic */ SquireShamanConfig al;
    private final /* synthetic */ c ak;

    private static boolean lIlIllllIIlllIl(Object obj) {
        return obj == null;
    }

    private static void lIlIllllIIllIlI() {
        lIIllIIIllIIl = new int[6];
        lIIllIIIllIIl[0] = (16 ^ 115) & ((59 ^ 88) ^ (-1));
        lIIllIIIllIIl[1] = 84 ^ 102;
        lIIllIIIllIIl[2] = (53 ^ 62) ^ " ".length();
        lIIllIIIllIIl[3] = " ".length();
        lIIllIIIllIIl[4] = (89 ^ 79) ^ (87 ^ 118);
        lIIllIIIllIIl[5] = "  ".length();
    }

    private static boolean lIlIllllIIlllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllllIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllllIIllIIl() {
        lIIllIIIllIII = new String[lIIllIIIllIIl[5]];
        lIIllIIIllIII[lIIllIIIllIIl[0]] = lIlIllllIIllIII("Dy8bPzgEMxE=", "mCtHH");
        lIIllIIIllIII[lIIllIIIllIIl[3]] = lIlIllllIIllIII("CwoJJCFGGAYiMBIJATo=", "fknMB");
    }

    static {
        lIlIllllIIllIlI();
        lIlIllllIIllIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (!lIlIllllIIllIll(this.al.room().x().contains(Players.getLocal()) ? 1 : 0) && !lIlIllllIIlllII(Combat.isSpecEnabled() ? 1 : 0)) {
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (lIlIllllIIlllIl(fromSlot)) {
                return lIIllIIIllIIl[0];
            }
            String lowerCase = fromSlot.getName().toLowerCase();
            if (lIlIllllIIlllII(lowerCase.contains(lIIllIIIllIII[lIIllIIIllIIl[0]]) ? 1 : 0) && lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[1]) && lIlIllllIIlllll(Combat.getMissingHealth(), lIIllIIIllIIl[2])) {
                Combat.toggleSpec();
                return lIIllIIIllIIl[3];
            } else if (lIlIllllIIlllII(lowerCase.contains(lIIllIIIllIII[lIIllIIIllIIl[3]]) ? 1 : 0) && lIlIllllIIllllI(Combat.getSpecEnergy(), lIIllIIIllIIl[4])) {
                Combat.toggleSpec();
                return lIIllIIIllIIl[3];
            } else {
                return lIIllIIIllIIl[0];
            }
        }
        return lIIllIIIllIIl[0];
    }

    private static String lIlIllllIIllIII(String llllllllllllllIllllIIIllIlllIlll, String llllllllllllllIllllIIIllIlllIllI) {
        String llllllllllllllIllllIIIllIlllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIllIlllIlIl = new StringBuilder();
        char[] llllllllllllllIllllIIIllIlllIlII = llllllllllllllIllllIIIllIlllIllI.toCharArray();
        int llllllllllllllIllllIIIllIlllIIll = lIIllIIIllIIl[0];
        char[] charArray = llllllllllllllIllllIIIllIlllIlll2.toCharArray();
        int length = charArray.length;
        int i = lIIllIIIllIIl[0];
        while (lIlIllllIlIIIII(i, length)) {
            char llllllllllllllIllllIIIllIllllIII = charArray[i];
            llllllllllllllIllllIIIllIlllIlIl.append((char) (llllllllllllllIllllIIIllIllllIII ^ llllllllllllllIllllIIIllIlllIlII[llllllllllllllIllllIIIllIlllIIll % llllllllllllllIllllIIIllIlllIlII.length]));
            "".length();
            llllllllllllllIllllIIIllIlllIIll++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIllIlllIlIl);
    }

    private static boolean lIlIllllIIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIllllIIlllII(int i) {
        return i != 0;
    }

    @Inject
    public s(c cVar, SquireShamanConfig squireShamanConfig) {
        this.ak = cVar;
        this.al = squireShamanConfig;
    }

    private static boolean lIlIllllIIllIll(int i) {
        return i == 0;
    }
}
