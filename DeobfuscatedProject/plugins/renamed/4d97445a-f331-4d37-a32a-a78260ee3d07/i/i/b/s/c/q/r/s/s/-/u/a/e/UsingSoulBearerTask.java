/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

/* TASK: Using Soul Bearer -> UsingsoulbearerTask */
@TaskDesc(name="Using Soul Bearer")
public class UsingSoulBearerTask
extends Task {
    private final /* synthetic */ LooterConfig eI;
    private static /* synthetic */ int[] lIIlllIll;
    private final /* synthetic */ SquireLooter eJ;
    private static /* synthetic */ String[] lIIlllIlI;

    private static String lIIIlIIlIlI(String llIIIlIlIIlIlIl, String llIIIlIlIIllIIl) {
        llIIIlIlIIlIlIl = new String(Base64.getDecoder().decode(llIIIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIlIIllIII = new StringBuilder();
        char[] llIIIlIlIIlIlll = llIIIlIlIIllIIl.toCharArray();
        int llIIIlIlIIlIllI = lIIlllIll[0];
        char[] llIIIlIlIIlIIII = llIIIlIlIIlIlIl.toCharArray();
        int llIIIlIlIIIllll = llIIIlIlIIlIIII.length;
        int llIIIlIlIIIlllI = lIIlllIll[0];
        while (aP.lIIIlIIllll(llIIIlIlIIIlllI, llIIIlIlIIIllll)) {
            char llIIIlIlIIllIll = llIIIlIlIIlIIII[llIIIlIlIIIlllI];
            llIIIlIlIIllIII.append((char)(llIIIlIlIIllIll ^ llIIIlIlIIlIlll[llIIIlIlIIlIllI % llIIIlIlIIlIlll.length]));
            0;
            ++llIIIlIlIIlIllI;
            ++llIIIlIlIIIlllI;
            0;
            
            return null;
        }
        return String.valueOf(llIIIlIlIIllIII);
    }

    private static boolean lIIIlIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIllII() {
        lIIlllIll = new int[5];
        aP.lIIlllIll[0] = (0xAD ^ 0x98) & ~(0x4A ^ 0x7F);
        aP.lIIlllIll[1] = 1;
        aP.lIIlllIll[2] = 0xFFFFECFF & 0x5FB2;
        aP.lIIlllIll[3] = 2;
        aP.lIIlllIll[4] = 0x62 ^ 0x6A;
    }

    static {
        aP.lIIIlIIllII();
        aP.lIIIlIIlIll();
    }

    private static void lIIIlIIlIll() {
        lIIlllIlI = new String[lIIlllIll[3]];
        aP.lIIlllIlI[aP.lIIlllIll[0]] = aP."Fill";
        aP.lIIlllIlI[aP.lIIlllIll[1]] = aP."Ensouled";
    }

    private static boolean lIIIlIIllIl(int n2) {
        return n2 == 0;
    }

    private static String lIIIlIIlIIl(String llIIIlIlIlIlIlI, String llIIIlIlIlIIlll) {
        try {
            SecretKeySpec llIIIlIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIll[4]), "DES");
            Cipher llIIIlIlIlIllII = Cipher.getInstance("DES");
            llIIIlIlIlIllII.init(lIIlllIll[3], llIIIlIlIlIllIl);
            return new String(llIIIlIlIlIllII.doFinal(Base64.getDecoder().decode(llIIIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIlIlIlIll) {
            llIIIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (aP.lIIIlIIllIl(this.eI.useSoulBearer() ? 1 : 0)) {
            return lIIlllIll[0];
        }
        if (aP.lIIIlIIlllI(Inventory.contains(item -> item.getName().contains(lIIlllIlI[lIIlllIll[1]])) ? 1 : 0)) {
            int[] nArray = new int[lIIlllIll[1]];
            nArray[aP.lIIlllIll[0]] = lIIlllIll[2];
            if (aP.lIIIlIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                aP llIIIlIlIllIIlI;
                int[] nArray2 = new int[lIIlllIll[1]];
                nArray2[aP.lIIlllIll[0]] = lIIlllIll[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlllIlI[lIIlllIll[0]]);
                llIIIlIlIllIIlI.sleep(lIIlllIll[1]);
            }
        }
        return lIIlllIll[1];
    }

    @Inject
    public aP(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eI = looterConfig;
        this.eJ = squireLooter;
    }
}

