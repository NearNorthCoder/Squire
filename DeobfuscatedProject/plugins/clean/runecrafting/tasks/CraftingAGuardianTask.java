/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.GameEnum24;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Crafting a guardian", priority=10, blocking=true)
public class CraftingAGuardianTask
extends RunecraftingTaskBase {

    private static boolean lllllllIllIlII(Object object) {
        return object == null;
    }

    private static void lllllllIlIllII() {
        llIIlllIlIll = new String[llIIlllIllIl[2]];
        m.llIIlllIlIll[m.llIIlllIllIl[1]] = "Assemble";
    }

    private static boolean lllllllIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllllIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var3_3;
        GameObject var1;
        GameObject gameObject;
        m var2;
        block15: {
            block14: {
                if (!m.lllllllIllIIll(this.aV.g() ? 1 : 0) || !m.lllllllIllIIll(this.aW.craftGuardian() ? 1 : 0)) break block14;
                int[] nArray = new int[llIIlllIllIl[2]];
                nArray[m.llIIlllIllIl[1]] = llIIlllIllIl[3];
                if (m.lllllllIllIIll(Inventory.contains((int[])nArray) ? 1 : 0) && !m.lllllllIllIIll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) break block15;
            }
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIIll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIllIl[1];
        }
        Item var3 = var2.aV.e();
        if (m.lllllllIllIlII(var3)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIlIl(var3.getId(), llIIlllIllIl[4])) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIllI(var2.aV.O() ? 1 : 0)) {
            return llIIlllIllIl[1];
        }
        d var4 = var2.aV.h();
        if (m.lllllllIllIlII((Object)var4)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIIll(var4.Z() ? 1 : 0)) {
            gameObject = var2.aV.A();

            if (1 >= 3) {
                return false;
            }
        } else {
            gameObject = var2.aV.B();
        }
        if (m.lllllllIllIlII(var1 = gameObject)) {
            return llIIlllIllIl[1];
        }
        if (m.lllllllIllIlll(var1.distanceTo((Locatable)Players.getLocal()), llIIlllIllIl[5]) && m.lllllllIllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIlllIllIl[2];
        }
        var3_3.interact(llIIlllIlIll[llIIlllIllIl[1]]);
        return llIIlllIllIl[2];
    }

    @Inject
    public CraftingAGuardianTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIllIl[0]];
        cArray[m.llIIlllIllIl[1]] = c.ACTIVE;
        cArray[m.llIIlllIllIl[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    static {
        m.lllllllIllIIII();
        m.lllllllIlIllII();
    }

    private static boolean lllllllIllIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

