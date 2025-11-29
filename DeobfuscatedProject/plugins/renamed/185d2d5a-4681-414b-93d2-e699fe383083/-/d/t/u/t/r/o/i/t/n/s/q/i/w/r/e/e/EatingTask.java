/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Eating -> EatingTask */
@TaskDesc(name="Eating", priority=0x7FFFFFFF, blocking=true)
public class EatingTask
extends Task {
    private final /* synthetic */ b Q;
    private final /* synthetic */ SquireWintertodtConfig R;
    private static /* synthetic */ String[] lIlIllllllIlI;
    private static /* synthetic */ int[] lIlIlllllllII;

    private static boolean llIIIIlllIIIllI(int n2) {
        return n2 == 0;
    }

    private static String llIIIIlllIIIIII(String var5, String var10) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var13 = var10.toCharArray();
        int var1 = lIlIlllllllII[0];
        char[] var16 = var5.toCharArray();
        int var7 = var16.length;
        int var6 = lIlIlllllllII[0];
        while (l.llIIIIlllIIlIlI(var6, var7)) {
            char var3 = var16[var6];
            var14.append((char)(var3 ^ var13[var1 % var13.length]));
            0;
            ++var1;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean llIIIIlllIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public l(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.Q = b2;
        this.R = squireWintertodtConfig;
    }

    private static boolean llIIIIlllIIIlll(Object object) {
        return object == null;
    }

    static {
        l.llIIIIlllIIIlIl();
        l.llIIIIlllIIIIlI();
    }

    private static String llIIIIlllIIIIIl(String var8, String var9) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIlIlllllllII[3], var2);
            return new String(var15.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l var11;
        if (!l.llIIIIlllIIIllI(this.Q.j() ? 1 : 0) || l.llIIIIlllIIIllI(this.Q.i() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        Item var12 = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[lIlIlllllllII[2]];
                    stringArray[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[3]];
                    if (!l.llIIIIlllIIIllI(item.hasAction(stringArray) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[lIlIlllllllII[2]];
                    stringArray2[l.lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[4]];
                    if (!l.llIIIIlllIIlIII(item.hasAction(stringArray2) ? 1 : 0)) break block3;
                }
                n2 = lIlIlllllllII[2];
                0;
                if (-3 < 0) return n2 != 0;
                return (3 & (3 ^ -1)) != 0;
            }
            n2 = lIlIlllllllII[0];
            return n2 != 0;
        });
        if (l.llIIIIlllIIIlll(var12) && l.llIIIIlllIIlIII(var11.Q.d() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIlIIl(var11.Q.h(), lIlIlllllllII[1])) {
            return lIlIlllllllII[0];
        }
        if (l.llIIIIlllIIIlll(var12)) {
            Movement.walk((WorldPoint)var11.Q.e());
            return lIlIlllllllII[2];
        }
        var1_1.interact(string -> {
            boolean bl;
            if (!l.llIIIIlllIIIllI(lIlIllllllIlI[lIlIlllllllII[0]].equalsIgnoreCase((String)string) ? 1 : 0) || l.llIIIIlllIIlIII(lIlIllllllIlI[lIlIlllllllII[2]].equalsIgnoreCase((String)string) ? 1 : 0)) {
                bl = lIlIlllllllII[2];
                0;
                if (((0xC ^ 0x70 ^ (0x70 ^ 3)) & (30 + 58 - 53 + 171 ^ 103 + 72 - 173 + 191 ^ -1)) != 0) {
                    return ((50 + 107 - 153 + 174 ^ 7 + 68 - 10 + 63) & (0xFC ^ 0xA2 ^ (0xB ^ 0x67) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlllllllII[0];
            }
            return bl;
        });
        this.sleep(lIlIlllllllII[2]);
        return lIlIlllllllII[2];
    }

    private static void llIIIIlllIIIIlI() {
        lIlIllllllIlI = new String[lIlIlllllllII[5]];
        l.lIlIllllllIlI[l.lIlIlllllllII[0]] = l."Eat";
        l.lIlIllllllIlI[l.lIlIlllllllII[2]] = l."Drink";
        l.lIlIllllllIlI[l.lIlIlllllllII[3]] = l."Eat";
        l.lIlIllllllIlI[l.lIlIlllllllII[4]] = l."Drink";
    }

    private static void llIIIIlllIIIlIl() {
        lIlIlllllllII = new int[6];
        l.lIlIlllllllII[0] = (0xAA ^ 0x85) & ~(0x72 ^ 0x5D);
        l.lIlIlllllllII[1] = 133 + 182 - 252 + 189 ^ 60 + 29 - -32 + 68;
        l.lIlIlllllllII[2] = 1;
        l.lIlIlllllllII[3] = 2;
        l.lIlIlllllllII[4] = 3;
        l.lIlIlllllllII[5] = 0x6B ^ 0x55 ^ (0x4D ^ 0x77);
    }
}

