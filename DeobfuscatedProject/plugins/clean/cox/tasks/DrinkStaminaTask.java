/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.cox.tasks;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drink Stamina", priority=30000)
public class DrinkStaminaTask
extends Task {

     int cD;
     boolean cE;
    private final  SquireChambersPlugin cC;

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ac.llIllIIllIlIlI(item.getName().startsWith(lIlIIlIllIll[lIlIIlIlllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIlllII[3]];
                stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[6]];
                if (ac.llIllIIllIlIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIlllII[3];

                    if (2 != (6 ^ 0x51 ^ (0xCD ^ 0x9E))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIlllII[0];
            return n2 != 0;
        });
        if (ac.llIllIIllIllII(item2)) {
            return lIlIIlIlllII[0];
        }
        item2.interact(lIlIIlIllIll[lIlIIlIlllII[0]]);
        this.sleep(lIlIIlIlllII[4]);
        return lIlIIlIlllII[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static  boolean b(n n2, TileObject tileObject) {
        int n3;
        if (ac.llIllIIllIlIlI(tileObject.getName().equals(lIlIIlIllIll[lIlIIlIlllII[3]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIlIlllII[3]];
            stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[4]];
            if (ac.llIllIIllIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && ac.llIllIIllIlIlI(n2.a((Locatable)tileObject) ? 1 : 0)) {
                n3 = lIlIIlIlllII[3];

                if (-1 <= 0) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIIlIlllII[0];
        return n3 != 0;
    }

    private static boolean llIllIIllIllII(Object object) {
        return object == null;
    }

    static {
        ac.llIllIIllIlIIl();
        ac.llIllIIllIlIII();
    }

    public boolean run() {
        if (ac.llIllIIllIlIlI(this.cw() ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        if (ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[1]) && !ac.llIllIIllIlIlI(Movement.isStaminaBoosted() ? 1 : 0) || ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[2])) {
            ac var1;
            var1.cv();

            return lIlIIlIlllII[3];
        }
        return lIlIIlIlllII[0];
    }

    private static boolean llIllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cw() {
        boolean bl2;
        void var2;
        n n2 = this.cC.L();
        if (!ac.llIllIIllIllIl(n2) || ac.llIllIIllIlllI(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        TileObject var3 = TileObjects.getNearest(arg_0 -> ac.b((n)var2, arg_0));
        if (ac.llIllIIllIllIl(var3)) {
            bl2 = lIlIIlIlllII[3];

            if (3 == 0) {
                return false;
            }
        } else {
            bl2 = lIlIIlIlllII[0];
        }
        return bl2;
    }

    private static void llIllIIllIlIII() {
        lIlIIlIllIll = new String[lIlIIlIlllII[7]];
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[0]] = "Drink";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[3]] = "Energy well";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[4]] = "Touch";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[5]] = "Stamina potion";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[6]] = "Drink";
    }

        return String.valueOf(var4);
    }

    private static boolean llIllIIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public DrinkStaminaTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIlIlllII[0];
        this.cE = lIlIIlIlllII[0];
        this.cC = squireChambersPlugin;
    }

    private static boolean llIllIIllIlllI(int n2) {
        return n2 == 0;
    }
}

