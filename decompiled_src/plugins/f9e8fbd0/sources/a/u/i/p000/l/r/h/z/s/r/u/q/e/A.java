package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping recoil ring", priority = 2147483646, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.A  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/A.class */
public class A extends Task {
    private static /* synthetic */ int[] lIllIlllIIlIl;
    private static /* synthetic */ String[] lIllIlllIIlII;

    private static boolean llIIlIIlIllIllI(int i, int i2) {
        return i == i2;
    }

    private static void llIIlIIlIllIIll() {
        lIllIlllIIlII = new String[lIllIlllIIlIl[2]];
        lIllIlllIIlII[lIllIlllIIlIl[1]] = llIIlIIlIllIIlI("SPzhxUE2ALg=", "vNFhD");
    }

    private static boolean llIIlIIlIllIlll(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIlIllIlIl(Object obj) {
        return obj != null;
    }

    private static void llIIlIIlIllIlII() {
        lIllIlllIIlIl = new int[4];
        lIllIlllIIlIl[0] = (-((-2317) & 31502)) & (-1) & 31735;
        lIllIlllIIlIl[1] = ((((101 + 11) - 82) + 167) ^ (((142 + 157) - 242) + 137)) & (((((105 + 151) - 105) + 21) ^ (((92 + 62) - 79) + 96)) ^ (-" ".length()));
        lIllIlllIIlIl[2] = " ".length();
        lIllIlllIIlIl[3] = "  ".length();
    }

    static {
        llIIlIIlIllIlII();
        llIIlIIlIllIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.RING);
        if (llIIlIIlIllIlIl(fromSlot) && llIIlIIlIllIllI(fromSlot.getId(), lIllIlllIIlIl[0])) {
            return lIllIlllIIlIl[1];
        }
        int[] iArr = new int[lIllIlllIIlIl[2]];
        iArr[lIllIlllIIlIl[1]] = lIllIlllIIlIl[0];
        Item first = Inventory.getFirst(iArr);
        if (llIIlIIlIllIlll(first)) {
            return lIllIlllIIlIl[1];
        }
        first.interact(lIllIlllIIlII[lIllIlllIIlIl[1]]);
        return lIllIlllIIlIl[2];
    }

    private static String llIIlIIlIllIIlI(String llllllllllllllIllIIIlIIlIlllllIl, String llllllllllllllIllIIIlIIlIllllllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIllIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIllIIIIIIl.init(lIllIlllIIlIl[3], llllllllllllllIllIIIlIIllIIIIIlI);
            return new String(llllllllllllllIllIIIlIIllIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIllIIIIIII) {
            llllllllllllllIllIIIlIIllIIIIIII.printStackTrace();
            return null;
        }
    }
}
