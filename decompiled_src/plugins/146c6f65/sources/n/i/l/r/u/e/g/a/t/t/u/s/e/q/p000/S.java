package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Enabling Run", priority = 5)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.S  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/S.class */
public class S extends Task {
    private static /* synthetic */ String[] llIIlllIlllI;
    private static /* synthetic */ int[] llIIlllIllll;

    private static boolean lIIIIIIIIIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIIIIIIIIll(Object obj) {
        return obj != null;
    }

    static {
        lIIIIIIIIIIIIII();
        llllllllllllll();
    }

    private static void llllllllllllll() {
        llIIlllIlllI = new String[llIIlllIllll[2]];
        llIIlllIlllI[llIIlllIllll[1]] = lllllllllllllI("6uDKN5p0KSU=", "ouHOK");
    }

    private static boolean lIIIIIIIIIIIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIIIIIIIIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0) && lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[0])) {
            Item first = Inventory.getFirst(item -> {
                return C0004e.aa.contains(Integer.valueOf(item.getId()));
            });
            if (lIIIIIIIIIIIIll(first)) {
                first.interact(llIIlllIlllI[llIIlllIllll[1]]);
                return llIIlllIllll[2];
            }
        }
        if (!lIIIIIIIIIIIIlI(Movement.getRunEnergy(), llIIlllIllll[3]) && lIIIIIIIIIIIIIl(Movement.isRunEnabled() ? 1 : 0) && !lIIIIIIIIIIIlII(Widgets.get(WidgetInfo.MINIMAP_TOGGLE_RUN_ORB))) {
            Movement.toggleRun();
            return llIIlllIllll[2];
        }
        return llIIlllIllll[1];
    }

    private static boolean lIIIIIIIIIIIIIl(int i) {
        return i == 0;
    }

    private static String lllllllllllllI(String lllllllllllllllIlIIlIIIIllIIIlIl, String lllllllllllllllIlIIlIIIIllIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), llIIlllIllll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIIllIIIIll) {
            lllllllllllllllIlIIlIIIIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIIIIIIII() {
        llIIlllIllll = new int[6];
        llIIlllIllll[0] = 184 ^ 178;
        llIIlllIllll[1] = (15 ^ 81) & ((100 ^ 58) ^ (-1));
        llIIlllIllll[2] = " ".length();
        llIIlllIllll[3] = 98 ^ 109;
        llIIlllIllll[4] = (242 ^ 190) ^ (252 ^ 184);
        llIIlllIllll[5] = "  ".length();
    }
}
