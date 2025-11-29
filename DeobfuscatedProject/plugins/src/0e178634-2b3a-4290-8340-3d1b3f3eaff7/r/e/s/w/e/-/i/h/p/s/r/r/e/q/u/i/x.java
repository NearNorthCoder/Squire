/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty vials", priority=15)
public class x
extends Task {
    private static /* synthetic */ String[] lIlIllIlIlIlI;
    private static /* synthetic */ int[] lIlIllIlIlIll;

    static {
        x.llIIIIIlIllIIII();
        x.llIIIIIlIlIllll();
    }

    private static boolean llIIIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIlIlIllll() {
        lIlIllIlIlIlI = new String[lIlIllIlIlIll[2]];
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[1]] = x.llIIIIIlIlIllIl("JS8vDw==", "sFNco");
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[0]] = x.llIIIIIlIlIlllI("NdqE0teqVXQ=", "ZKoTO");
    }

    private static String llIIIIIlIlIllIl(String llllllllllllllIllIlIIIlIllllIIII, String llllllllllllllIllIlIIIlIlllIlIlI) {
        llllllllllllllIllIlIIIlIllllIIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlIlllIlllI = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIlllIllIl = llllllllllllllIllIlIIIlIlllIlIlI.toCharArray();
        int llllllllllllllIllIlIIIlIlllIllII = lIlIllIlIlIll[1];
        char[] llllllllllllllIllIlIIIlIlllIIllI = llllllllllllllIllIlIIIlIllllIIII.toCharArray();
        int llllllllllllllIllIlIIIlIlllIIlIl = llllllllllllllIllIlIIIlIlllIIllI.length;
        int llllllllllllllIllIlIIIlIlllIIlII = lIlIllIlIlIll[1];
        while (x.llIIIIIlIllIIlI(llllllllllllllIllIlIIIlIlllIIlII, llllllllllllllIllIlIIIlIlllIIlIl)) {
            char llllllllllllllIllIlIIIlIllllIIIl = llllllllllllllIllIlIIIlIlllIIllI[llllllllllllllIllIlIIIlIlllIIlII];
            llllllllllllllIllIlIIIlIlllIlllI.append((char)(llllllllllllllIllIlIIIlIllllIIIl ^ llllllllllllllIllIlIIIlIlllIllIl[llllllllllllllIllIlIIIlIlllIllII % llllllllllllllIllIlIIIlIlllIllIl.length]));
            "".length();
            ++llllllllllllllIllIlIIIlIlllIllII;
            ++llllllllllllllIllIlIIIlIlllIIlII;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIlIlllIlllI);
    }

    private static void llIIIIIlIllIIII() {
        lIlIllIlIlIll = new int[4];
        x.lIlIllIlIlIll[0] = " ".length();
        x.lIlIllIlIlIll[1] = (0xA0 ^ 0x94 ^ (0x80 ^ 0xA9)) & (0xF5 ^ 0x8E ^ (0x31 ^ 0x57) ^ -" ".length());
        x.lIlIllIlIlIll[2] = "  ".length();
        x.lIlIllIlIlIll[3] = 0xA3 ^ 0xAB;
    }

    public boolean run() {
        String[] stringArray = new String[lIlIllIlIlIll[0]];
        stringArray[x.lIlIllIlIlIll[1]] = lIlIllIlIlIlI[lIlIllIlIlIll[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (x.llIIIIIlIllIIIl(item)) {
            return lIlIllIlIlIll[1];
        }
        item.interact(lIlIllIlIlIlI[lIlIllIlIlIll[0]]);
        return lIlIllIlIlIll[0];
    }

    private static boolean llIIIIIlIllIIIl(Object object) {
        return object == null;
    }

    private static String llIIIIIlIlIlllI(String llllllllllllllIllIlIIIlIllIllIIl, String llllllllllllllIllIlIIIlIllIllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIll[3]), "DES");
            Cipher llllllllllllllIllIlIIIlIllIlllIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIllIlllIl.init(lIlIllIlIlIll[2], llllllllllllllIllIlIIIlIllIllllI);
            return new String(llllllllllllllIllIlIIIlIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIllIlllII) {
            llllllllllllllIllIlIIIlIllIlllII.printStackTrace();
            return null;
        }
    }
}

