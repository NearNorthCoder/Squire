/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.GameEnum16;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Emptying pouches", priority=20)
public class EmptyingPouchesTask
extends RunecraftingTaskBase {

    @Override
    protected boolean aj() {
        return llIlIIIIIlIl[2];
    }

    private static boolean lIIIIIIIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIIIIIlIIlI() {
        llIlIIIIIIll = new String[llIlIIIIIlIl[4]];
        A.llIlIIIIIIll[A.llIlIIIIIlIl[1]] = "Altar";
        A.llIlIIIIIIll[A.llIlIIIIIlIl[2]] = "Empty";
        A.llIlIIIIIIll[A.llIlIIIIIlIl[0]] = "pouch";
    }

    private static boolean lIIIIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIIIIlIllI(Object object) {
        return object == null;
    }

    static {
        A.lIIIIIIIIIlIIll();
        A.lIIIIIIIIIlIIlI();
    }

    private static boolean lIIIIIIIIIllIII(int n2) {
        return n2 > 0;
    }

    @Override
    protected boolean ak() {
        boolean bl;
        if (A.lIIIIIIIIIlIlII(this.aV.g() ? 1 : 0)) {
            return llIlIIIIIlIl[1];
        }
        if (A.lIIIIIIIIIlIlIl(Inventory.getFreeSlots(), llIlIIIIIlIl[3])) {
            return llIlIIIIIlIl[1];
        }
        String[] stringArray = new String[llIlIIIIIlIl[2]];
        stringArray[A.llIlIIIIIlIl[1]] = llIlIIIIIIll[llIlIIIIIlIl[1]];
        TileObject var1 = TileObjects.getNearest((String[])stringArray);
        if (A.lIIIIIIIIIlIllI(var1)) {
            return llIlIIIIIlIl[1];
        }
        int var2 = llIlIIIIIlIl[1];
        int var3 = llIlIIIIIlIl[0];
        Iterator var4 = Inventory.getAll(item -> item.getName().endsWith(llIlIIIIIIll[llIlIIIIIlIl[0]])).iterator();
        while (A.lIIIIIIIIIlIlII(var4.hasNext() ? 1 : 0)) {
            Item var5 = (Item)var4.next();
            e var6 = e.c(var5.getId());
            if (A.lIIIIIIIIIlIllI((Object)var6)) {

                if (2 <= 3) continue;
                return (2 & ~2) != 0;
            }
            if (A.lIIIIIIIIIlIlll(var3)) {

                if ((0x77 ^ 0x72) != 0) break;
                return (1 & ~1) != 0;
            }
            if (A.lIIIIIIIIIllIII(var6.ae())) {
                A var7;
                int var8 = Math.min(Inventory.getFreeSlots() - var2, var6.ae());
                if (A.lIIIIIIIIIllIIl(var8)) {

                    if (null == null) break;
                    return false;
                }
                var5.interact(llIlIIIIIIll[llIlIIIIIlIl[2]]);
                var6.d(-var8);
                var2 += var8;
                --var3;
                var7.aV.r();
            }

            if (3 >= ((0x26 ^ 0x39) & ~(0x7D ^ 0x62))) continue;
            return false;
        }
        if (A.lIIIIIIIIIllIII(var2)) {
            bl = llIlIIIIIlIl[2];

            if (-1 != -1) {
                return ((0x5E ^ 0x6D ^ (0x55 ^ 4)) & (214 + 179 - 214 + 69 ^ 66 + 84 - 132 + 136 ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIIlIl[1];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIllIIl(int n2) {
        return n2 < 0;
    }

    @Inject
    public EmptyingPouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIlIl[0]];
        cArray[A.llIlIIIIIlIl[1]] = c.ACTIVE;
        cArray[A.llIlIIIIIlIl[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }
}

