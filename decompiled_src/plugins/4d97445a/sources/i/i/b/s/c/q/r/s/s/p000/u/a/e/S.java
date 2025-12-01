package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping bracelets")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.S  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/S.class */
public class S extends Task {
    private static /* synthetic */ String[] lllIllIll;
    private static /* synthetic */ int[] lllIlllII;

    private static void llIIllIIllI() {
        lllIlllII = new int[7];
        lllIlllII[0] = (92 ^ 29) & ((84 ^ 21) ^ (-1));
        lllIlllII[1] = "  ".length();
        lllIlllII[2] = (-11329) & 32511;
        lllIlllII[3] = " ".length();
        lllIlllII[4] = (-((-17921) & 28485)) & (-1) & 31741;
        lllIlllII[5] = "   ".length();
        lllIlllII[6] = 155 ^ 147;
    }

    private static String llIIllIIlII(String lIlIlIIIIlIlllI, String lIlIlIIIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIlllII[6]), "DES");
            Cipher lIlIlIIIIllIIII = Cipher.getInstance("DES");
            lIlIlIIIIllIIII.init(lllIlllII[1], secretKeySpec);
            return new String(lIlIlIIIIllIIII.doFinal(Base64.getDecoder().decode(lIlIlIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIlIllll) {
            lIlIlIIIIlIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.GLOVES);
        if (llIIllIIlll(fromSlot) && llIIllIIlll(fromSlot.getName())) {
            return lllIlllII[0];
        }
        int[] iArr = new int[lllIlllII[1]];
        iArr[lllIlllII[0]] = lllIlllII[2];
        iArr[lllIlllII[3]] = lllIlllII[4];
        Item first = Inventory.getFirst(iArr);
        if (llIIllIlIII(first)) {
            return lllIlllII[0];
        }
        String[] strArr = new String[lllIlllII[5]];
        strArr[lllIlllII[0]] = lllIllIll[lllIlllII[0]];
        strArr[lllIlllII[3]] = lllIllIll[lllIlllII[3]];
        strArr[lllIlllII[1]] = lllIllIll[lllIlllII[1]];
        first.interact(strArr);
        return lllIlllII[3];
    }

    static {
        llIIllIIllI();
        llIIllIIlIl();
    }

    private static boolean llIIllIlIII(Object obj) {
        return obj == null;
    }

    private static String llIIllIIIll(String lIlIlIIIIlllIIl, String lIlIlIIIIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIllllIl = Cipher.getInstance("Blowfish");
            lIlIlIIIIllllIl.init(lllIlllII[1], secretKeySpec);
            return new String(lIlIlIIIIllllIl.doFinal(Base64.getDecoder().decode(lIlIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIllllII) {
            lIlIlIIIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlll(Object obj) {
        return obj != null;
    }

    private static void llIIllIIlIl() {
        lllIllIll = new String[lllIlllII[5]];
        lllIllIll[lllIlllII[0]] = llIIllIIIll("Lqfh83unmcs=", "wrmsT");
        lllIllIll[lllIlllII[3]] = llIIllIIIll("bI+y4TvLKN8=", "nVxdB");
        lllIllIll[lllIlllII[1]] = llIIllIIlII("j2JBZLpd1LY=", "WacVc");
    }
}
