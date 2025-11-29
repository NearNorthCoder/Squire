/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drop task")
public class m
extends Task {
    private static /* synthetic */ String[] lIIllIIllllII;
    private final /* synthetic */ TempleTrekkingPlugin H;
    private static /* synthetic */ int[] lIIllIIlllllI;

    private static void lIllIIIIIIllllI() {
        lIIllIIllllII = new String[lIIllIIlllllI[1]];
        m.lIIllIIllllII[m.lIIllIIlllllI[0]] = m."Logs";
    }

    private static boolean lIllIIIIIlIIIII(int n2) {
        return n2 == 0;
    }

    static {
        m.lIllIIIIIIlllll();
        m.lIllIIIIIIllllI();
    }

    @Inject
    public m(TempleTrekkingPlugin templeTrekkingPlugin) {
        this.H = templeTrekkingPlugin;
    }

    private static String lIllIIIIIIllIlI(String llllllllllllllIllllIIIIIIIIlIIll, String llllllllllllllIllllIIIIIIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlllllI[2]), "DES");
            Cipher llllllllllllllIllllIIIIIIIIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIIIIlIlIl.init(lIIllIIlllllI[3], llllllllllllllIllllIIIIIIIIlIllI);
            return new String(llllllllllllllIllllIIIIIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIIIIlIlII) {
            llllllllllllllIllllIIIIIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIlllll() {
        lIIllIIlllllI = new int[4];
        m.lIIllIIlllllI[0] = (0x2C ^ 0x12 ^ 74 + 121 - 83 + 15) & (0x2C ^ 8 ^ (0x1D ^ 0x78) ^ -1);
        m.lIIllIIlllllI[1] = 1;
        m.lIIllIIlllllI[2] = 0xB3 ^ 0xB4 ^ (0x36 ^ 0x39);
        m.lIIllIIlllllI[3] = 2;
    }

    public boolean run() {
        if (m.lIllIIIIIlIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIIllIIlllllI[0];
        }
        String[] stringArray = new String[lIIllIIlllllI[1]];
        stringArray[m.lIIllIIlllllI[0]] = lIIllIIllllII[lIIllIIlllllI[0]];
        return Inventory.dropAll((String[])stringArray);
    }
}

