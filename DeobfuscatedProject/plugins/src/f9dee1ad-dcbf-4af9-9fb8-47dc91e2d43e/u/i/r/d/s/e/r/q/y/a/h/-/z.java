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
package u.i.r.d.s.e.r.q.y.a.h.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Burying bones", priority=20)
public class z
extends Task {
    private static /* synthetic */ String[] llllIIlllllI;
    private final /* synthetic */ a aW;
    private static /* synthetic */ int[] llllIIllllll;
    private final /* synthetic */ SquireAlchemicalHydraConfig aX;

    private static void lIIlIIIIIlIllIl() {
        llllIIllllll = new int[4];
        z.llllIIllllll[0] = (0x42 ^ 8) & ~(0x50 ^ 0x1A);
        z.llllIIllllll[1] = " ".length();
        z.llllIIllllll[2] = "  ".length();
        z.llllIIllllll[3] = 0xE7 ^ 0xC2 ^ (0x18 ^ 0x35);
    }

    private static boolean lIIlIIIIIlIlllI(int n2) {
        return n2 == 0;
    }

    static {
        z.lIIlIIIIIlIllIl();
        z.lIIlIIIIIlIllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z lllllllllllllllIIlIlIIlllIIlIllI;
        if (z.lIIlIIIIIlIlllI(this.aX.bury() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIlllI(lllllllllllllllIIlIlIIlllIIlIllI.aW.g() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIllll(lllllllllllllllIIlIlIIlllIIlIllI.aW.k())) {
            return llllIIllllll[0];
        }
        Item lllllllllllllllIIlIlIIlllIIlIlIl = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIllllll[1]];
            stringArray[z.llllIIllllll[0]] = llllIIlllllI[llllIIllllll[1]];
            return item.hasAction(stringArray);
        });
        if (z.lIIlIIIIIllIIII(lllllllllllllllIIlIlIIlllIIlIlIl)) {
            return llllIIllllll[0];
        }
        var1_1.interact(llllIIlllllI[llllIIllllll[0]]);
        return llllIIllllll[1];
    }

    private static void lIIlIIIIIlIllII() {
        llllIIlllllI = new String[llllIIllllll[2]];
        z.llllIIlllllI[z.llllIIllllll[0]] = z.lIIlIIIIIlIlIll("eP2DeyEIEe0=", "BSnWu");
        z.llllIIlllllI[z.llllIIllllll[1]] = z.lIIlIIIIIlIlIll("UMokKNnOXtU=", "hMjUz");
    }

    private static boolean lIIlIIIIIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIlIllll(Object object) {
        return object != null;
    }

    @Inject
    public z(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aW = a2;
        this.aX = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIIlIlIll(String lllllllllllllllIIlIlIIlllIIIllIl, String lllllllllllllllIIlIlIIlllIIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlllIIIllII.getBytes(StandardCharsets.UTF_8)), llllIIllllll[3]), "DES");
            Cipher lllllllllllllllIIlIlIIlllIIIllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlllIIIllll.init(llllIIllllll[2], lllllllllllllllIIlIlIIlllIIlIIII);
            return new String(lllllllllllllllIIlIlIIlllIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlllIIIlllI) {
            lllllllllllllllIIlIlIIlllIIIlllI.printStackTrace();
            return null;
        }
    }
}

