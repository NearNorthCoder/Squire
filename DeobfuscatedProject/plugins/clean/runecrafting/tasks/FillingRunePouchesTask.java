/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.GameEnum16;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling rune pouches", priority=20, blocking=true)
public class FillingRunePouchesTask
extends RunecraftingTaskBase {

    private static boolean llllllllIllllI(int n2) {
        return n2 <= 0;
    }

    private static boolean llllllllIllIIl(int n2) {
        return n2 != 0;
    }

    private static void llllllllIlIIII() {
        llIIllllIlIl = new String[llIIllllIlll[0]];
        B.llIIllllIlIl[B.llIIllllIlll[1]] = "Fill";
        B.llIIllllIlIl[B.llIIllllIlll[2]] = "pouch";
    }

    private static boolean llllllllIllIlI(Object object) {
        return object == null;
    }

    private static boolean llllllllIllIII(int n2) {
        return n2 == 0;
    }

    static {
        B.llllllllIlIlll();
        B.llllllllIlIIII();
    }

    @Inject
    public FillingRunePouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIlll[0]];
        cArray[B.llIIllllIlll[1]] = c.ACTIVE;
        cArray[B.llIIllllIlll[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        block15: {
            block14: {
                if (B.llllllllIllIII(this.aV.g() ? 1 : 0)) {
                    return llIIllllIlll[1];
                }
                if (!B.llllllllIllIIl(Inventory.isFull() ? 1 : 0)) break block14;
                int[] nArray = new int[llIIllllIlll[2]];
                nArray[B.llIIllllIlll[1]] = llIIllllIlll[3];
                if (!B.llllllllIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block15;
            }
            return llIIllllIlll[1];
        }
        int var1 = llIIllllIlll[1];
        int[] nArray = new int[llIIllllIlll[2]];
        nArray[B.llIIllllIlll[1]] = llIIllllIlll[3];
        int var2 = Inventory.getCount((int[])nArray);
        int var3 = llIIllllIlll[0];
        Iterator var4 = Inventory.getAll(item -> item.getName().endsWith(llIIllllIlIl[llIIllllIlll[2]])).iterator();
        while (B.llllllllIllIIl(var4.hasNext() ? 1 : 0)) {
            Item var5 = (Item)var4.next();
            if (B.llllllllIllIII(var3)) {

                if ((0x23 ^ 0x27) != 1) break;
                return false;
            }
            e var6 = e.c(var5.getId());
            if (B.llllllllIllIlI((Object)var6)) {

                if (((0xA4 ^ 0xC6) & ~(0x7F ^ 0x1D)) == ((0x21 ^ 0x7E) & ~(0xEA ^ 0xB5))) continue;
                return false;
            }
            if (!B.llllllllIllIll(var5.getId(), llIIllllIlll[4]) || !B.llllllllIllIll(var5.getId(), llIIllllIlll[5]) || !B.llllllllIllIll(var5.getId(), llIIllllIlll[6]) || B.llllllllIlllII(var5.getId(), llIIllllIlll[7])) {
                var6.a(llIIllllIlll[2]);

                if (-1 >= ((0xF3 ^ 0xB0) & ~(0xF1 ^ 0xB2))) {
                    return false;
                }
            } else {
                var6.a(llIIllllIlll[1]);
            }
            if (B.llllllllIlllIl(var6.ae(), var6.ac())) {
                int var7 = Math.min(var2, var6.ac() - var6.ae());
                if (B.llllllllIllllI(var7)) {

                    if (null == null) break;
                    return false;
                }
                var6.d(var7);
                var5.interact(llIIllllIlIl[llIIllllIlll[1]]);
                var1 = llIIllllIlll[2];
                --var3;
                var2 -= var7;
            }

            return ((0x46 ^ 0x36 ^ (0x52 ^ 0x63)) & (0x2A ^ 0x3F ^ (0x6C ^ 0x38) ^ -1)) != 0;
        }
        if (B.llllllllIllIIl(var1)) {
            B var8;
            var8.aV.n();
        }
        return (boolean)var1_1;
    }

    @Override
    protected boolean aj() {
        return llIIllllIlll[2];
    }

    private static boolean llllllllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIllIll(int n2, int n3) {
        return n2 != n3;
    }
}

