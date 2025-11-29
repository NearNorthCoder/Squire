/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Using imbued heart -> UseImbuedHeartTask */
@TaskDesc(name="Using imbued heart")
public class UsingImbuedHeartTask
extends u_Unknown {
    private static /* synthetic */ int[] lIlIlllIllIIl;
    private static /* synthetic */ String[] lIlIlllIllIII;

    private static void llIIIIlIlIIIIlI() {
        lIlIlllIllIII = new String[lIlIlllIllIIl[3]];
        A.lIlIlllIllIII[A.lIlIlllIllIIl[1]] = A."Invigorate";
    }

    @Override
    public boolean p() {
        int[] nArray = new int[lIlIlllIllIIl[0]];
        nArray[A.lIlIlllIllIIl[1]] = lIlIlllIllIIl[2];
        nArray[A.lIlIlllIllIIl[3]] = lIlIlllIllIIl[4];
        Item item = Inventory.getFirst((int[])nArray);
        if (A.llIIIIlIlIIIlII(item)) {
            return lIlIlllIllIIl[1];
        }
        int var1 = Vars.getBit((int)lIlIlllIllIIl[5]);
        if (A.llIIIIlIlIIIlIl(var1)) {
            return lIlIlllIllIIl[1];
        }
        item.interact(lIlIlllIllIII[lIlIlllIllIIl[1]]);
        return lIlIlllIllIIl[3];
    }

    private static boolean llIIIIlIlIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIlIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIlIlIIIIll() {
        lIlIlllIllIIl = new int[6];
        A.lIlIlllIllIIl[0] = 2;
        A.lIlIlllIllIIl[1] = (173 + 78 - 65 + 37 ^ 116 + 120 - 227 + 188) & (52 + 60 - -26 + 14 ^ 1 + 38 - -20 + 71 ^ -1);
        A.lIlIlllIllIIl[2] = 0xFFFFF0FF & 0x5FF4;
        A.lIlIlllIllIIl[3] = 1;
        A.lIlIlllIllIIl[4] = -(0x60 ^ 0x65) & (0xFFFFFBFD & 0x6FFF);
        A.lIlIlllIllIIl[5] = -(0xFFFFFF6F & 0x99F) & (0xFFFFBDFF & 0x5FFF);
    }

    private static String llIIIIlIlIIIIIl(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var4.toCharArray();
        int var8 = lIlIlllIllIIl[1];
        char[] var5 = var6.toCharArray();
        int var3 = var5.length;
        int var7 = lIlIlllIllIIl[1];
        while (A.llIIIIlIlIIIllI(var7, var3)) {
            char var2 = var5[var7];
            var10.append((char)(var2 ^ var9[var8 % var9.length]));
            0;
            ++var8;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    static {
        A.llIIIIlIlIIIIll();
        A.llIIIIlIlIIIIlI();
    }
}

