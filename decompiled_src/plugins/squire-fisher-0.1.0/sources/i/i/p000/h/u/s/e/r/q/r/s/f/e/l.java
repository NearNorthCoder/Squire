package i.i.p000.h.u.s.e.r.q.r.s.f.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Using Special Attack")
/* renamed from: i.i.-.h.u.s.e.r.q.r.s.f.e.l  reason: invalid package */
/* loaded from: squire-fisher-0.1.0.jar:i/i/-/h/u/s/e/r/q/r/s/f/e/l.class */
public class l extends Task {
    private static /* synthetic */ String[] lIlllIllIllI;
    private static /* synthetic */ int[] lIlllIllIlll;

    private static void lllIlIlllllIlI() {
        lIlllIllIllI = new String[lIlllIllIlll[5]];
        lIlllIllIllI[lIlllIllIlll[1]] = lllIlIlllllIIl("uknjobqS4PqWb1PJHulZ0jN7i6vxfnhf", "UshoG");
    }

    private static boolean lllIlIllllllII(int i2, int i3) {
        return i2 < i3;
    }

    private static void lllIlIlllllIll() {
        lIlllIllIlll = new int[7];
        lIlllIllIlll[0] = (((169 + 128) - 226) + 131) ^ (((42 + 153) - 108) + 87);
        lIlllIllIlll[1] = (84 ^ 73) & ((66 ^ 95) ^ (-1));
        lIlllIllIlll[2] = (-466) & 21493;
        lIlllIllIlll[3] = (((166 ^ 154) + (((16 + 33) - (-7)) + 84)) - (68 ^ 12)) + (151 ^ 183);
        lIlllIllIlll[4] = (((93 + 22) - (-8)) + 46) ^ (((46 + 113) - 124) + 103);
        lIlllIllIlll[5] = " ".length();
        lIlllIllIlll[6] = "  ".length();
    }

    private static boolean lllIllIIIIIIII(Object obj) {
        return obj != null;
    }

    private static String lllIlIlllllIIl(String lllllllllllllllIlIlllIlIIIlllllI, String lllllllllllllllIlIlllIlIIIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIIlIIIIII.init(lIlllIllIlll[6], secretKeySpec);
            return new String(lllllllllllllllIlIlllIlIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlIIIllllll) {
            lllllllllllllllIlIlllIlIIIllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllllllll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lllIlIlllllllI(Object obj) {
        return obj == null;
    }

    static {
        lllIlIlllllIll();
        lllIlIlllllIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (lllIlIllllllII(Combat.getSpecEnergy(), lIlllIllIlll[0])) {
            return lIlllIllIlll[1];
        }
        if (lllIlIllllllIl(Combat.isSpecEnabled() ? 1 : 0)) {
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (!lllIlIlllllllI(fromSlot) && lllIlIllllllll(fromSlot.getId(), lIlllIllIlll[2])) {
                Widget widget = Widgets.get(lIlllIllIlll[3], lIlllIllIlll[4]);
                if (lllIllIIIIIIII(widget)) {
                    System.out.println(lIlllIllIllI[lIlllIllIlll[1]]);
                    widget.interact(lIlllIllIlll[1]);
                }
                "".length();
                if ("   ".length() <= ((246 ^ 167) & ((31 ^ 78) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIlllIllIlll[1];
        }
        return lIlllIllIlll[5];
    }

    private static boolean lllIlIllllllIl(int i2) {
        return i2 == 0;
    }
}
