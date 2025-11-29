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

/* TASK: Burying bones -> BuryingbonesTask */
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
        z.llllIIllllll[1] = 1;
        z.llllIIllllll[2] = 2;
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
        z var7;
        if (z.lIIlIIIIIlIlllI(this.aX.bury() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIlllI(var7.aW.g() ? 1 : 0)) {
            return llllIIllllll[0];
        }
        if (z.lIIlIIIIIlIllll(var7.aW.k())) {
            return llllIIllllll[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIllllll[1]];
            stringArray[z.llllIIllllll[0]] = llllIIlllllI[llllIIllllll[1]];
            return item.hasAction(stringArray);
        });
        if (z.lIIlIIIIIllIIII(var6)) {
            return llllIIllllll[0];
        }
        var1_1.interact(llllIIlllllI[llllIIllllll[0]]);
        return llllIIllllll[1];
    }

    private static void lIIlIIIIIlIllII() {
        llllIIlllllI = new String[llllIIllllll[2]];
        z.llllIIlllllI[z.llllIIllllll[0]] = z."Bury";
        z.llllIIlllllI[z.llllIIllllll[1]] = z."Bury";
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

    private static String lIIlIIIIIlIlIll(String var3, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llllIIllllll[3]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllIIllllll[2], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

