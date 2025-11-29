/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.SHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=100, blocking=true)
public class EatingFoodTask
extends CorpTaskBase {
    
    @Inject
    private  s a;

    static {
        g.lllIIIIlllIlII();
        g.lllIIIIlllIIll();
    }

        return String.valueOf(var1);
    }

    private static void lllIIIIlllIIll() {
        lIlIlllIlIll = new String[lIlIlllIllII[3]];
        g.lIlIlllIlIll[g.lIlIlllIllII[1]] = "Eat";
        g.lIlIlllIlIll[g.lIlIlllIllII[2]] = "Eat";
    }

    private static boolean lllIIIIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lllIIIIlllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIIIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        g var2;
        if (g.lllIIIIlllIlIl(this.a.u(), lIlIlllIllII[0])) {
            return lIlIlllIllII[1];
        }
        Item var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlllIllII[2]];
            stringArray[g.lIlIlllIllII[1]] = lIlIlllIlIll[lIlIlllIllII[2]];
            return item.hasAction(stringArray);
        });
        if (g.lllIIIIlllIllI(var3)) {
            return lIlIlllIllII[1];
        }
        if (g.lllIIIIlllIlll(Combat.getCurrentHealth(), var2.o.eatAt())) {
            return lIlIlllIllII[1];
        }
        var1_1.interact(lIlIlllIlIll[lIlIlllIllII[1]]);
        return lIlIlllIllII[2];
    }

    private static boolean lllIIIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }
}

