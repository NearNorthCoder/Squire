/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.query.items.ItemQuery
 *  net.unethicalite.api.query.results.ItemQueryResults
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.query.results.ItemQueryResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Consuming")
public class ConsumingTask
extends Task {
    private static final  Logger q;

    private final  AgilityConfig s;
    private final  SquireAgilityPlugin r;

    private boolean u() {
        return Inventory.contains(item -> item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[6]]));
    }

    static {
        d.lIIlIlIllIlIll();
        d.lIIlIlIlIlIlII();
        q = LoggerFactory.getLogger(ConsumingTask.class);
    }

    private static boolean lIIlIlIlllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIllIllIl(int n) {
        return n != 0;
    }

    private static int lIIlIlIllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIlIllIlllI(int n) {
        return n == 0;
    }

    private boolean t() {
        int n;
        b var1;
        b b2;
        if (d.lIIlIlIllIllIl(this.s.progressive() ? 1 : 0)) {
            b2 = b.j();

            if ((0x19 ^ 0x1D) == 1) {
                return false;
            }
        } else {
            d var2;
            b2 = var2.s.course();
        }
        if (d.lIIlIlIlllIIlI((Object)(var1 = b2), (Object)b.ARDOUGNE) && d.lIIlIlIllIllll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIllIIlIIII[5])) {
            n = lIllIIlIIII[2];

            if (3 != 3) {
                return false;
            }
        } else {
            n = lIllIIlIIII[1];
        }
        return n != 0;
    }

    private static boolean lIIlIlIllIllll(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        Item var3;
        d var4;
        if (d.lIIlIlIllIllIl(this.u() ? 1 : 0) && d.lIIlIlIllIlllI(Movement.isStaminaBoosted() ? 1 : 0) && d.lIIlIlIllIllll(Movement.getRunEnergy(), lIllIIlIIII[0])) {
            Inventory.getFirst(item -> item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[8]])).interact(lIllIIIlIlI[lIllIIlIIII[1]]);
            return lIllIIlIIII[2];
        }
        int n = var4.t();
        if (d.lIIlIlIlllIIII(d.lIIlIlIllIllII(Combat.getHealthPercent(), var4.s.stopAtHp())) && !d.lIIlIlIllIllIl(n) || d.lIIlIlIllIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIlIIII[1];
        }
        ItemQuery var5 = Inventory.query();
        if (d.lIIlIlIllIllIl(n)) {
            var5 = (ItemQuery)var5.filter(item -> item.getName().toLowerCase().contains(lIllIIIlIlI[lIllIIlIIII[7]]));

        } else {
            String[] stringArray = new String[lIllIIlIIII[2]];
            stringArray[d.lIllIIlIIII[1]] = lIllIIIlIlI[lIllIIlIIII[2]];
            var5 = var5.actions(stringArray);
        }
        if (d.lIIlIlIlllIIIl(var3 = (Item)((ItemQueryResults)var5.results()).first())) {
            Log.info((String)lIllIIIlIlI[lIllIIlIIII[3]]);
            var4.r.forceStop();
            return lIllIIlIIII[1];
        }
        var3_3.interact(lIllIIIlIlI[lIllIIlIIII[4]]);
        return lIllIIlIIII[2];
    }

    private static boolean lIIlIlIlllIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ConsumingTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.r = squireAgilityPlugin;
        this.s = agilityConfig;
    }

    private static void lIIlIlIlIlIlII() {
        lIllIIIlIlI = new String[lIllIIlIIII[9]];
        d.lIllIIIlIlI[d.lIllIIlIIII[1]] = "Drink";
        d.lIllIIIlIlI[d.lIllIIlIIII[2]] = "Eat";
        d.lIllIIIlIlI[d.lIllIIlIIII[3]] = "[SquireAgility] - Out of food and low HP, stopping.";
        d.lIllIIIlIlI[d.lIllIIlIIII[4]] = "Eat";
        d.lIllIIIlIlI[d.lIllIIlIIII[6]] = "Stamina";
        d.lIllIIIlIlI[d.lIllIIlIIII[7]] = "summer pie";
        d.lIllIIIlIlI[d.lIllIIlIIII[8]] = "Stamina";
    }

    private static boolean lIIlIlIlllIIII(int n) {
        return n > 0;
    }

        return String.valueOf(var6);
    }
}

