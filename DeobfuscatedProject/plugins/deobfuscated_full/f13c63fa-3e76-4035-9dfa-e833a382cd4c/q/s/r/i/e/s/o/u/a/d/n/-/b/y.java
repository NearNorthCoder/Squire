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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
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
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

/* TASK: Equipping Bowfa -> EquippingbowfaTask */
@TaskDesc(name="Equipping Bowfa")
public class y
extends Task {
    private static /* synthetic */ int[] llIlllIllII;
    private final /* synthetic */ SquireBandosConfig ay;
    private static /* synthetic */ String[] llIlllIlIlI;
    private final /* synthetic */ e az;

    private static boolean lIlIlIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIllIllIlI(String var9, String var10) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llIlllIllII[2], var8);
            return new String(var12.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIllIllIIl(String var7, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIlllIllII[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIlllIllII[2], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIllIlllII() {
        llIlllIlIlI = new String[llIlllIllII[3]];
        y.llIlllIlIlI[y.llIlllIllII[0]] = y."Wield";
        y.llIlllIlIlI[y.llIlllIllII[1]] = y."faerdhinen";
        y.llIlllIlIlI[y.llIlllIllII[2]] = y."Crystal bow";
    }

    @Inject
    public y(SquireBandosConfig squireBandosConfig, e e2) {
        this.ay = squireBandosConfig;
        this.az = e2;
    }

    static {
        y.lIlIlIlllIIllI();
        y.lIlIlIllIlllII();
    }

    private static void lIlIlIlllIIllI() {
        llIlllIllII = new int[5];
        y.llIlllIllII[0] = (0xF4 ^ 0xC1 ^ (0xAF ^ 0xA6)) & (17 + 145 - 42 + 62 ^ 115 + 84 - 193 + 132 ^ -1);
        y.llIlllIllII[1] = 1;
        y.llIlllIllII[2] = 2;
        y.llIlllIllII[3] = 3;
        y.llIlllIllII[4] = 0x62 ^ 0x6A;
    }

    public boolean run() {
        y var11;
        if (y.lIlIlIlllIIlll(this.ay.useBlowpipe() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        if (y.lIlIlIlllIlIII(var11.az.v() ? 1 : 0) && y.lIlIlIlllIIlll(var11.az.s() ? 1 : 0)) {
            return llIlllIllII[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            boolean bl;
            if (!y.lIlIlIlllIIlll(item.getName().contains(llIlllIlIlI[llIlllIllII[1]]) ? 1 : 0) || y.lIlIlIlllIlIII(item.getName().contains(llIlllIlIlI[llIlllIllII[2]]) ? 1 : 0)) {
                bl = llIlllIllII[1];
                0;
                if (((0x56 ^ 0x75) & ~(0x74 ^ 0x57)) != ((0xB9 ^ 0xA6) & ~(0x6C ^ 0x73))) {
                    return false;
                }
            } else {
                bl = llIlllIllII[0];
            }
            return bl;
        });
        if (y.lIlIlIlllIlIIl(var6)) {
            var6.interact(llIlllIlIlI[llIlllIllII[0]]);
            return llIlllIllII[1];
        }
        return llIlllIllII[0];
    }

    private static boolean lIlIlIlllIlIIl(Object object) {
        return object != null;
    }
}

