/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Force Leaving Altar -> ForceleavingaltarTask */
@TaskDesc(name="Force Leaving Altar")
public class g
extends Task {
    private static /* synthetic */ int[] llIIllIllIII;
    private static /* synthetic */ String[] llIIllIlIlll;
    private final /* synthetic */ SquireGOTRPlugin aQ;

    @Inject
    public g(SquireGOTRPlugin squireGOTRPlugin) {
        this.aQ = squireGOTRPlugin;
    }

    private static boolean llllllIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIlIlIIll(String var5, String var15) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIllIllIII[3], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIllIIl(Object object) {
        return object != null;
    }

    static {
        g.llllllIlIlIlIl();
        g.llllllIlIlIlII();
    }

    private static boolean llllllIlIlIlll(Object object) {
        return object == null;
    }

    private static boolean llllllIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static void llllllIlIlIlIl() {
        llIIllIllIII = new int[5];
        g.llIIllIllIII[0] = (253 + 208 - 265 + 59 ^ 155 + 146 - 210 + 77) & (46 + 120 - 116 + 168 ^ 120 + 20 - 93 + 94 ^ -1) & ((0x42 ^ 0x58 ^ 1) & (142 + 86 - 118 + 72 ^ 56 + 172 - 175 + 120 ^ -1) ^ -1);
        g.llIIllIllIII[1] = 1;
        g.llIIllIllIII[2] = 0xFFFFE8FF & Short.MAX_VALUE;
        g.llIIllIllIII[3] = 2;
        g.llIIllIllIII[4] = 3;
    }

    private static boolean llllllIlIllIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.llllllIlIlIllI(this.aQ.g() ? 1 : 0)) {
            return llIIllIllIII[0];
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (g.llllllIlIlIllI(tileObject.getName().contains(llIIllIlIlll[llIIllIllIII[1]]) ? 1 : 0) && g.llllllIlIlIllI(tileObject.hasAction(string -> {
                int n2;
                if (g.llllllIlIllIIl(string) && g.llllllIlIlIllI(string.equals(llIIllIlIlll[llIIllIllIII[3]]) ? 1 : 0)) {
                    n2 = llIIllIllIII[1];
                    0;
                    if (1 <= -1) {
                        return false;
                    }
                } else {
                    n2 = llIIllIllIII[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                n2 = llIIllIllIII[1];
                0;
                
                }
            } else {
                n2 = llIIllIllIII[0];
            }
            return n2 != 0;
        });
        if (g.llllllIlIlIlll(var13)) {
            return llIIllIllIII[0];
        }
        int[] nArray = new int[llIIllIllIII[1]];
        nArray[g.llIIllIllIII[0]] = llIIllIllIII[2];
        if (g.llllllIlIllIII(Inventory.getCount((int[])nArray))) {
            return llIIllIllIII[0];
        }
        var1_1.interact(llIIllIlIlll[llIIllIllIII[0]]);
        return llIIllIllIII[1];
    }

    private static String llllllIlIlIIlI(String var2, String var14) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var11 = var14.toCharArray();
        int var1 = llIIllIllIII[0];
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;
        int var9 = llIIllIllIII[0];
        while (g.llllllIlIllIlI(var9, var4)) {
            char var10 = var3[var9];
            var6.append((char)(var10 ^ var11[var1 % var11.length]));
            0;
            ++var1;
            ++var9;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void llllllIlIlIlII() {
        llIIllIlIlll = new String[llIIllIllIII[4]];
        g.llIIllIlIlll[g.llIIllIllIII[0]] = g."Enter";
        g.llIIllIlIlll[g.llIIllIllIII[1]] = g."Portal";
        g.llIIllIlIlll[g.llIIllIllIII[3]] = g."Use";
    }
}

