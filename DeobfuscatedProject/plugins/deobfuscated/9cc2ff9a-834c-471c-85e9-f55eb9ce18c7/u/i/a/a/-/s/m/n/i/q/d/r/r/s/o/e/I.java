/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Equipping Bowfa")
public class I
extends Task {
    private static /* synthetic */ int[] lIIlIlIIIIlII;
    private final /* synthetic */ g aR;
    private final /* synthetic */ SquireSaraConfig aQ;
    private static /* synthetic */ String[] lIIlIlIIIIIll;

    private static void lIlIlIlIlllllIl() {
        lIIlIlIIIIIll = new String[lIIlIlIIIIlII[3]];
        I.lIIlIlIIIIIll[I.lIIlIlIIIIlII[0]] = I."Wield";
        I.lIIlIlIIIIIll[I.lIIlIlIIIIlII[2]] = I."faerdhinen";
    }

    private static boolean lIlIlIllIIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIlIlllllll(int n2) {
        return n2 == 0;
    }

    static {
        I.lIlIlIlIllllllI();
        I.lIlIlIlIlllllIl();
    }

    private static boolean lIlIlIllIIIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public I(SquireSaraConfig squireSaraConfig, g g2) {
        this.aQ = squireSaraConfig;
        this.aR = g2;
    }

    private static void lIlIlIlIllllllI() {
        lIIlIlIIIIlII = new int[4];
        I.lIIlIlIIIIlII[0] = (0xED ^ 0xB7) & ~(0xEF ^ 0xB5);
        I.lIIlIlIIIIlII[1] = 38 + 30 - 14 + 151 ^ 26 + 30 - 6 + 149;
        I.lIIlIlIIIIlII[2] = 1;
        I.lIIlIlIIIIlII[3] = 2;
    }

    private static String lIlIlIlIlllllII(String llllllllllllllIlllllIIIllIIlIlll, String llllllllllllllIlllllIIIllIIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIllIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIllIIllIll.init(lIIlIlIIIIlII[3], llllllllllllllIlllllIIIllIIlllII);
            return new String(llllllllllllllIlllllIIIllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIllIIllIlI) {
            llllllllllllllIlllllIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        I llllllllllllllIlllllIIIllIlIIIlI;
        if (I.lIlIlIlIlllllll(this.aQ.useBlowpipe() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        if (I.lIlIlIllIIIIIII(llllllllllllllIlllllIIIllIlIIIlI.aR.o() ? 1 : 0) && I.lIlIlIlIlllllll(llllllllllllllIlllllIIIllIlIIIlI.aR.l() ? 1 : 0) && I.lIlIlIllIIIIIIl(llllllllllllllIlllllIIIllIlIIIlI.aR.k(), lIIlIlIIIIlII[1])) {
            return lIIlIlIIIIlII[0];
        }
        if (I.lIlIlIllIIIIIlI(llllllllllllllIlllllIIIllIlIIIlI.aR.t()) && I.lIlIlIllIIIIIII(llllllllllllllIlllllIIIllIlIIIlI.aR.t().B() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        Item llllllllllllllIlllllIIIllIlIIIIl = Inventory.getFirst(item -> item.getName().contains(lIIlIlIIIIIll[lIIlIlIIIIlII[2]]));
        if (I.lIlIlIllIIIIIlI(llllllllllllllIlllllIIIllIlIIIIl)) {
            llllllllllllllIlllllIIIllIlIIIIl.interact(lIIlIlIIIIIll[lIIlIlIIIIlII[0]]);
            return lIIlIlIIIIlII[2];
        }
        return lIIlIlIIIIlII[0];
    }

    private static boolean lIlIlIllIIIIIlI(Object object) {
        return object != null;
    }
}

