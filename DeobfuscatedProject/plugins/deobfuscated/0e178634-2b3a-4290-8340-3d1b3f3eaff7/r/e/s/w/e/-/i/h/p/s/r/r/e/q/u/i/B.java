/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Entering Realm", priority=100)
public class B
extends u {
    private static /* synthetic */ String[] lIlIllIlllIII;
    private static final /* synthetic */ int af;
    private static /* synthetic */ int[] lIlIllIlllIIl;

    @Override
    public boolean p() {
        B llllllllllllllIllIlIIIIlllIllllI;
        int[] nArray = new int[lIlIllIlllIIl[0]];
        nArray[B.lIlIllIlllIIl[1]] = lIlIllIlllIIl[2];
        Item item = Inventory.getFirst((int[])nArray);
        if (B.llIIIIIllIllIIl(item)) {
            return lIlIllIlllIIl[1];
        }
        if (B.llIIIIIllIllIlI(llllllllllllllIllIlIIIIlllIllllI.W.f() ? 1 : 0)) {
            return lIlIllIlllIIl[1];
        }
        item.interact(lIlIllIlllIII[lIlIllIlllIIl[1]]);
        return lIlIllIlllIIl[0];
    }

    private static void llIIIIIllIllIII() {
        lIlIllIlllIIl = new int[4];
        B.lIlIllIlllIIl[0] = 1;
        B.lIlIllIlllIIl[1] = (0x74 ^ 0x61) & ~(0x8C ^ 0x99);
        B.lIlIllIlllIIl[2] = 0xFFFFEEF6 & 0x7FCD;
        B.lIlIllIlllIIl[3] = 2;
    }

    static {
        B.llIIIIIllIllIII();
        B.llIIIIIllIlIlll();
        af = lIlIllIlllIIl[2];
    }

    private static String llIIIIIllIlIllI(String llllllllllllllIllIlIIIIlllIlIlIl, String llllllllllllllIllIlIIIIlllIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlllIlIlll.init(lIlIllIlllIIl[3], llllllllllllllIllIlIIIIlllIllIII);
            return new String(llllllllllllllIllIlIIIIlllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIlllIlIllI) {
            llllllllllllllIllIlIIIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIllIIl(Object object) {
        return object == null;
    }

    private static void llIIIIIllIlIlll() {
        lIlIllIlllIII = new String[lIlIllIlllIIl[0]];
        B.lIlIllIlllIII[B.lIlIllIlllIIl[1]] = B."Activate";
    }
}

