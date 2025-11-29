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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
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

/* TASK: Buying Bones -> BuyingbonesTask */
@TaskDesc(name="Buying Bones")
public class aK
extends Task {
    private static /* synthetic */ String[] lllIIlll;
    private static /* synthetic */ int[] lllIlIll;
    private final /* synthetic */ LooterConfig ez;

    private static void llIIllIlII() {
        lllIIlll = new String[lllIlIll[6]];
        aK.lllIIlll[aK.lllIlIll[0]] = aK."Bury";
        aK.lllIIlll[aK.lllIlIll[1]] = aK."Scatter";
        aK.lllIIlll[aK.lllIlIll[2]] = aK."ashes";
        aK.lllIIlll[aK.lllIlIll[3]] = aK."ashes";
        aK.lllIIlll[aK.lllIlIll[4]] = aK."bones";
        aK.lllIIlll[aK.lllIlIll[5]] = aK."bones";
    }

    private static String llIIllIIIl(String llIlIIlIIlIllII, String llIlIIlIIlIllIl) {
        try {
            SecretKeySpec llIlIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIlIll[7]), "DES");
            Cipher llIlIIlIIllIIII = Cipher.getInstance("DES");
            llIlIIlIIllIIII.init(lllIlIll[2], llIlIIlIIllIIIl);
            return new String(llIlIIlIIllIIII.doFinal(Base64.getDecoder().decode(llIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIIlIllll) {
            llIlIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIlll(int n2) {
        return n2 != 0;
    }

    private static String llIIllIIlI(String llIlIIlIIIllIIl, String llIlIIlIIIlllIl) {
        llIlIIlIIIllIIl = new String(Base64.getDecoder().decode(llIlIIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIlIIIlllII = new StringBuilder();
        char[] llIlIIlIIIllIll = llIlIIlIIIlllIl.toCharArray();
        int llIlIIlIIIllIlI = lllIlIll[0];
        char[] llIlIIlIIIlIlII = llIlIIlIIIllIIl.toCharArray();
        int llIlIIlIIIlIIll = llIlIIlIIIlIlII.length;
        int llIlIIlIIIlIIlI = lllIlIll[0];
        while (aK.llIlIlIIII(llIlIIlIIIlIIlI, llIlIIlIIIlIIll)) {
            char llIlIIlIIIlllll = llIlIIlIIIlIlII[llIlIIlIIIlIIlI];
            llIlIIlIIIlllII.append((char)(llIlIIlIIIlllll ^ llIlIIlIIIllIll[llIlIIlIIIllIlI % llIlIIlIIIllIll.length]));
            0;
            ++llIlIIlIIIllIlI;
            ++llIlIIlIIIlIIlI;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(llIlIIlIIIlllII);
    }

    static {
        aK.llIIllIlIl();
        aK.llIIllIlII();
    }

    private static boolean llIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIllIlIl() {
        lllIlIll = new int[8];
        aK.lllIlIll[0] = (0xE4 ^ 0x80 ^ (0xB9 ^ 0x89)) & (161 + 6 - 62 + 92 ^ 87 + 61 - 98 + 95 ^ -1);
        aK.lllIlIll[1] = 1;
        aK.lllIlIll[2] = 2;
        aK.lllIlIll[3] = 3;
        aK.lllIlIll[4] = 63 + 28 - -45 + 3 ^ 40 + 128 - 58 + 33;
        aK.lllIlIll[5] = 0x3D ^ 0x58 ^ (0x74 ^ 0x14);
        aK.lllIlIll[6] = 58 + 13 - 28 + 98 ^ 113 + 83 - 126 + 69;
        aK.lllIlIll[7] = 127 + 24 - 101 + 90 ^ 115 + 101 - 141 + 57;
    }

    public boolean run() {
        Item llIlIIlIIllIllI;
        if (aK.llIIllIllI(this.ez.buryBones() ? 1 : 0)) {
            return lllIlIll[0];
        }
        if (aK.llIIllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[5]])) ? 1 : 0)) {
            llIlIIlIIllIllI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[4]]));
            llIlIIlIIllIllI.interact(lllIIlll[lllIlIll[0]]);
        }
        if (aK.llIIllIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIIlll[lllIlIll[3]])) ? 1 : 0)) {
            llIlIIlIIllIllI = Inventory.getFirst(item -> item.getName().contains(lllIIlll[lllIlIll[2]]));
            llIlIIlIIllIllI.interact(lllIIlll[lllIlIll[1]]);
        }
        return lllIlIll[1];
    }

    private static boolean llIIllIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public aK(LooterConfig looterConfig) {
        this.ez = looterConfig;
    }
}

