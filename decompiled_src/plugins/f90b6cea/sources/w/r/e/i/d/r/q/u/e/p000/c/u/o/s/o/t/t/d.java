package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping logs", priority = 5, blocking = true)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.d  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/d.class */
public class d extends Task {
    private final /* synthetic */ SquireWoodcutterPlugin z;
    private static /* synthetic */ String[] lIllIIIIlllII;
    private final /* synthetic */ SquireWoodcutterConfig A;
    private static /* synthetic */ int[] lIllIIIIllllI;

    private static boolean llIIIlIIlIIlIll(Object obj) {
        return obj == null;
    }

    private static void llIIIlIIlIIIlll() {
        lIllIIIIlllII = new String[lIllIIIIllllI[1]];
        lIllIIIIlllII[lIllIIIIllllI[0]] = llIIIlIIlIIIIll("IrMKKuwqlZc=", "CDuBr");
    }

    static {
        llIIIlIIlIIlIII();
        llIIIlIIlIIIlll();
    }

    private static boolean llIIIlIIlIIlIlI(int i) {
        return i != 0;
    }

    private static void llIIIlIIlIIlIII() {
        lIllIIIIllllI = new int[3];
        lIllIIIIllllI[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIllIIIIllllI[1] = " ".length();
        lIllIIIIllllI[2] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (llIIIlIIlIIlIIl(this.A.bank() ? 1 : 0) && llIIIlIIlIIlIIl(this.A.fastTickChop() ? 1 : 0) && !llIIIlIIlIIlIlI(this.A.cutLogs() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                return tileObject.getName().contains(this.A.tree().r());
            });
            Predicate predicate = item -> {
                if (!llIIIlIIlIIlIIl(item.getName().toLowerCase().contains(this.A.tree().r().toLowerCase()) ? 1 : 0) || llIIIlIIlIIlIlI(item.getName().equals(lIllIIIIlllII[lIllIIIIllllI[0]]) ? 1 : 0)) {
                    ?? r0 = lIllIIIIllllI[1];
                    "".length();
                    return (167 ^ 163) > (170 ^ 174) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIIIllllI[0];
            };
            if ((!llIIIlIIlIIlIIl(Inventory.isFull() ? 1 : 0) || llIIIlIIlIIlIll(nearest)) && !llIIIlIIlIIlIll(Inventory.getFirst(predicate))) {
                Inventory.dropAll(predicate);
                "".length();
                return lIllIIIIllllI[1];
            }
            return lIllIIIIllllI[0];
        }
        return lIllIIIIllllI[0];
    }

    private static String llIIIlIIlIIIIll(String llllllllllllllIllIIllIIIlIllIIll, String llllllllllllllIllIIllIIIlIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIllllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIIlIllIlII) {
            llllllllllllllIllIIllIIIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIlIIlIIl(int i) {
        return i == 0;
    }

    @Inject
    public d(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.z = squireWoodcutterPlugin;
        this.A = squireWoodcutterConfig;
    }
}
