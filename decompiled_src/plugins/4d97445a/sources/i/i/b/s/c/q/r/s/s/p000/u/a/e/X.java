package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Banking", priority = 1, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.X  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/X.class */
public class X extends Task {
    private static /* synthetic */ String[] lIIlIlIII;
    private static /* synthetic */ int[] lIIlIlIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean aY() {
        String[] strArr = new String[lIIlIlIIl[0]];
        strArr[lIIlIlIIl[1]] = lIIlIlIII[lIIlIlIIl[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIIIIIlIIl(nearest)) {
            return lIIlIlIIl[1];
        }
        nearest.interact(lIIlIlIII[lIIlIlIIl[0]]);
        return lIIlIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    private boolean b(int i2, int i3) {
        int i4 = lIIlIlIIl[4] - i2;
        int llIIlIIIlIlIIlI = lIIlIlIIl[4] - i3;
        int[] iArr = new int[lIIlIlIIl[5]];
        iArr[lIIlIlIIl[1]] = lIIlIlIIl[6];
        iArr[lIIlIlIIl[0]] = lIIlIlIIl[7];
        if (!lIIIIIIlIlI(Inventory.contains(iArr) ? 1 : 0) || (lIIIIIIlIII(Inventory.isFull() ? 1 : 0) && (!lIIIIIIIlIl(i4) || lIIIIIIIllI(llIIlIIIlIlIIlI)))) {
            Bank.depositInventory();
            return lIIlIlIIl[0];
        }
        if (lIIIIIIIllI(i4)) {
            int[] iArr2 = new int[lIIlIlIIl[0]];
            iArr2[lIIlIlIIl[1]] = lIIlIlIIl[2];
            if (lIIIIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                Bank.withdraw(lIIlIlIIl[2], i4, Bank.WithdrawMode.ITEM);
                return lIIlIlIIl[0];
            }
        }
        if (lIIIIIIIllI(llIIlIIIlIlIIlI)) {
            int[] iArr3 = new int[lIIlIlIIl[0]];
            iArr3[lIIlIlIIl[1]] = lIIlIlIIl[3];
            if (lIIIIIIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                Bank.withdraw(lIIlIlIIl[3], llIIlIIIlIlIIlI, Bank.WithdrawMode.ITEM);
                return lIIlIlIIl[0];
            }
        }
        return lIIlIlIIl[1];
    }

    private static String lIIIIIIIIlI(String llIIlIIIlIIlIlI, String llIIlIIIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIIlIIlIll) {
            llIIlIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static void lIIIIIIIlII() {
        lIIlIlIIl = new int[8];
        lIIlIlIIl[0] = " ".length();
        lIIlIlIIl[1] = " ".length() & (" ".length() ^ (-1));
        lIIlIlIIl[2] = (-10505) & 12287;
        lIIlIlIIl[3] = (-((-4817) & 23251)) & (-12297) & 32511;
        lIIlIlIIl[4] = 175 ^ 161;
        lIIlIlIIl[5] = "  ".length();
        lIIlIlIIl[6] = (-((-22701) & 31165)) & (-16385) & 28575;
        lIIlIlIIl[7] = (-((-457) & 27097)) & (-4353) & 32767;
    }

    private static boolean lIIIIIIIllI(int i2) {
        return i2 > 0;
    }

    private static boolean lIIIIIIIlIl(int i2) {
        return i2 <= 0;
    }

    private static void lIIIIIIIIll() {
        lIIlIlIII = new String[lIIlIlIIl[5]];
        lIIlIlIII[lIIlIlIIl[1]] = lIIIIIIIIlI("NdBYjni+DgA=", "gHfno");
        lIIlIlIII[lIIlIlIIl[0]] = lIIIIIIIIlI("rXSPMKAg30A=", "cnhsz");
    }

    static {
        lIIIIIIIlII();
        lIIIIIIIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIIlIlIIl[0]];
        iArr[lIIlIlIIl[1]] = lIIlIlIIl[2];
        int count = Inventory.getCount(iArr);
        int[] iArr2 = new int[lIIlIlIIl[0]];
        iArr2[lIIlIlIIl[1]] = lIIlIlIIl[3];
        int count2 = Inventory.getCount(iArr2);
        return ((!lIIIIIIIlIl(count2) || lIIIIIIIllI(count)) && lIIIIIIIlll(count, count2)) ? lIIlIlIIl[1] : lIIIIIIlIII(Bank.isOpen() ? 1 : 0) ? b(count, count2) : aY();
    }

    private static boolean lIIIIIIlIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIIIlIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIIIIlIIl(Object obj) {
        return obj == null;
    }
}
