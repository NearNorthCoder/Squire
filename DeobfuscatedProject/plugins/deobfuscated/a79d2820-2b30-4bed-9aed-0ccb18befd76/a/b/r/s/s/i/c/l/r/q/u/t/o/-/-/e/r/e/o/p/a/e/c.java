/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Prayers
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class c
extends Task {
    private static /* synthetic */ String[] lIllIIIIIllI;
    private static /* synthetic */ int[] lIllIIIIIlll;

    static {
        c.lllIIIlllIIlll();
        c.lllIIIlllIIllI();
    }

    private static void lllIIIlllIIllI() {
        lIllIIIIIllI = new String[lIllIIIIIlll[0]];
        c.lIllIIIIIllI[c.lIllIIIIIlll[1]] = c."Corporeal Beast";
    }

    private static boolean lllIIIlllIlIII(Object object) {
        return object == null;
    }

    private static void lllIIIlllIIlll() {
        lIllIIIIIlll = new int[4];
        c.lIllIIIIIlll[0] = 1;
        c.lIllIIIIIlll[1] = (39 + 83 - 103 + 110 ^ 120 + 34 - 76 + 77) & (5 + 34 - 12 + 116 ^ 148 + 66 - 161 + 96 ^ -1);
        c.lIllIIIIIlll[2] = 0x41 ^ 0x49;
        c.lIllIIIIIlll[3] = 2;
    }

    public boolean run() {
        String[] stringArray = new String[lIllIIIIIlll[0]];
        stringArray[c.lIllIIIIIlll[1]] = lIllIIIIIllI[lIllIIIIIlll[1]];
        if (c.lllIIIlllIlIII(NPCs.getNearest((String[])stringArray))) {
            Prayers.disableAll();
            return lIllIIIIIlll[1];
        }
        ArrayList<Prayer> lllllllllllllllIllIIIlIlIIlIIIII = new ArrayList<Prayer>(List.of(Prayer.PROTECT_FROM_MAGIC));
        lllllllllllllllIllIIIlIlIIlIIIII.addAll(Prayers.getMeleePrayer());
        0;
        if (c.lllIIIlllIlIIl(Prayers.flick(lllllllllllllllIllIIIlIlIIlIIIII) ? 1 : 0)) {
            c lllllllllllllllIllIIIlIlIIlIIIIl;
            lllllllllllllllIllIIIlIlIIlIIIIl.sleep(lIllIIIIIlll[0]);
        }
        return lIllIIIIIlll[0];
    }

    private static boolean lllIIIlllIlIIl(int n2) {
        return n2 != 0;
    }

    private static String lllIIIlllIIlIl(String lllllllllllllllIllIIIlIlIIIlIllI, String lllllllllllllllIllIIIlIlIIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIlIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlll[2]), "DES");
            Cipher lllllllllllllllIllIIIlIlIIIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIlIlIIIllIlI.init(lIllIIIIIlll[3], lllllllllllllllIllIIIlIlIIIllIll);
            return new String(lllllllllllllllIllIIIlIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIlIlIIIllIIl) {
            lllllllllllllllIllIIIlIlIIIllIIl.printStackTrace();
            return null;
        }
    }
}

