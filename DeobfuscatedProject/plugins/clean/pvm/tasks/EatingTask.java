/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Eating", priority=100)
public class EatingTask
extends Task {
    private final  SquireShamanConfig ac;
    
    private static final  Logger ab;

    static {
        p.lIlIlllIlllIlIl();
        p.lIlIlllIlllIIll();
        ab = LoggerFactory.getLogger(EatingTask.class);
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlllIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public EatingTask(SquireShamanConfig squireShamanConfig) {
        this.ac = squireShamanConfig;
    }

    private static void lIlIlllIlllIIll() {
        lIIllIIIIllll = new String[lIIllIIIlIIII[2]];
        p.lIIllIIIIllll[p.lIIllIIIlIIII[0]] = "Eat";
        p.lIIllIIIIllll[p.lIIllIIIlIIII[1]] = "Eat";
    }

    public boolean run() {
        p var2;
        Item item2 = Inventory.getFirst(item -> item.hasAction(lIIllIIIIllll[lIIllIIIlIIII[1]]::equals));
        if (p.lIlIlllIlllIllI(item2)) {
            return lIIllIIIlIIII[0];
        }
        if (p.lIlIlllIlllIlll(Combat.getCurrentHealth(), var2.ac.eatAt())) {
            return lIIllIIIlIIII[0];
        }
        item2.interact(lIIllIIIIllll[lIIllIIIlIIII[0]]);
        return lIIllIIIlIIII[1];
    }

}

