/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Stamina handler -> StaminahandlerTask */
@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final /* synthetic */ SquireDukeSucellusConfig am;
    private final /* synthetic */ SquireDukeSucellus al;
    private static /* synthetic */ String[] lIllIllIIlIl;
    private static /* synthetic */ int[] lIllIllIIlll;

    private static boolean lllIlIIlIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        l.lllIlIIlIIlIII();
        l.lllIlIIlIIIlIl();
    }

    private static void lllIlIIlIIlIII() {
        lIllIllIIlll = new int[6];
        l.lIllIllIIlll[0] = (0x41 ^ 0x50) & ~(0x50 ^ 0x41);
        l.lIllIllIIlll[1] = 0x1C ^ 2;
        l.lIllIllIIlll[2] = 0xD6 ^ 0x9D ^ (0x5F ^ 0x1E);
        l.lIllIllIIlll[3] = 1;
        l.lIllIllIIlll[4] = 2;
        l.lIllIllIIlll[5] = 3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIllIllIIlIl[lIllIllIIlll[4]]));
        if (l.lllIlIIlIIlIIl(item2)) {
            return lIllIllIIlll[0];
        }
        if (l.lllIlIIlIIlIlI(Movement.getRunEnergy(), lIllIllIIlll[1])) {
            return lIllIllIIlll[0];
        }
        if (l.lllIlIIlIIlIll(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (l.lllIlIIlIIllII(Movement.getRunEnergy(), lIllIllIIlll[2])) {
                void var2;
                var2.interact(lIllIllIIlIl[lIllIllIIlll[0]]);
                return lIllIllIIlll[3];
            }
            return lIllIllIIlll[0];
        }
        item2.interact(lIllIllIIlIl[lIllIllIIlll[3]]);
        return lIllIllIIlll[3];
    }

    private static String lllIlIIlIIIlII(String var8, String var6) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var5 = var6.toCharArray();
        int var3 = lIllIllIIlll[0];
        char[] var10 = var8.toCharArray();
        int var4 = var10.length;
        int var7 = lIllIllIIlll[0];
        while (l.lllIlIIlIIllII(var7, var4)) {
            char var1 = var10[var7];
            var9.append((char)(var1 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lllIlIIlIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    l(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.al = squireDukeSucellus;
        this.am = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIlIIlIIIlIl() {
        lIllIllIIlIl = new String[lIllIllIIlll[5]];
        l.lIllIllIIlIl[l.lIllIllIIlll[0]] = l."Drink";
        l.lIllIllIIlIl[l.lIllIllIIlll[3]] = l."Drink";
        l.lIllIllIIlIl[l.lIllIllIIlll[4]] = l."Stamina";
    }
}

