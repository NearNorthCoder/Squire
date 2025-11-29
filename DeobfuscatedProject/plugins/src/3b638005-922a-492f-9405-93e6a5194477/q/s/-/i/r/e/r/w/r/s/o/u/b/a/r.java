/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=13337, blocking=true)
public class r
extends Task {
    private static /* synthetic */ int[] llllIIIllll;
    private final /* synthetic */ SquireBarrows aa;
    private static /* synthetic */ String[] llllIIIlllI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (r.lIllIIlllllIIl(this.aa.m() ? 1 : 0) && r.lIllIIlllllIIl(this.aa.h() ? 1 : 0)) {
            return llllIIIllll[0];
        }
        int[] nArray = new int[llllIIIllll[1]];
        nArray[r.llllIIIllll[0]] = llllIIIllll[2];
        nArray[r.llllIIIllll[3]] = llllIIIllll[4];
        Item llllllllllllllllIIIlllIIllIllIlI = Inventory.getFirst((int[])nArray);
        if (r.lIllIIlllllIlI(llllllllllllllllIIIlllIIllIllIlI)) {
            return llllIIIllll[0];
        }
        int llllllllllllllllIIIlllIIllIllIIl = Vars.getBit((int)llllIIIllll[5]);
        if (r.lIllIIlllllIll(llllllllllllllllIIIlllIIllIllIIl)) {
            return llllIIIllll[0];
        }
        var1_1.interact(llllIIIlllI[llllIIIllll[0]]);
        return llllIIIllll[3];
    }

    private static boolean lIllIIlllllIll(int n2) {
        return n2 > 0;
    }

    private static void lIllIIllllIlll() {
        llllIIIlllI = new String[llllIIIllll[3]];
        r.llllIIIlllI[r.llllIIIllll[0]] = r.lIllIIllllIllI("/xmqs3aJcBbJBgG/qk4MaQ==", "lEGFK");
    }

    private static String lIllIIllllIllI(String llllllllllllllllIIIlllIIllIIllll, String llllllllllllllllIIIlllIIllIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIIllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIIllIlIIll.init(llllIIIllll[1], llllllllllllllllIIIlllIIllIlIlII);
            return new String(llllllllllllllllIIIlllIIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIIllIlIIlI) {
            llllllllllllllllIIIlllIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIllIIlllllIII();
        r.lIllIIllllIlll();
    }

    @Inject
    public r(SquireBarrows squireBarrows) {
        this.aa = squireBarrows;
    }

    private static boolean lIllIIlllllIlI(Object object) {
        return object == null;
    }

    private static void lIllIIlllllIII() {
        llllIIIllll = new int[6];
        r.llllIIIllll[0] = (0x77 ^ 0x30) & ~(0x43 ^ 4);
        r.llllIIIllll[1] = "  ".length();
        r.llllIIIllll[2] = -(0xFFFFFFA7 & 0x2E5B) & (0xFFFFFFFF & 0x7EF6);
        r.llllIIIllll[3] = " ".length();
        r.llllIIIllll[4] = -" ".length() & (0xFFFFFBFB & 0x6FFD);
        r.llllIIIllll[5] = -(0xFFFFEB7D & 0x7F8B) & (0xFFFFFFFD & 0x7FFB);
    }
}

