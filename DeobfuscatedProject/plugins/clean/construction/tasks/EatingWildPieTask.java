/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating Wild Pie", priority=10)
public class EatingWildPieTask
extends Task {
    private final  a am;

        return String.valueOf(lIlIllllllIIIIl);
    }

    private static boolean lIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!k.lIlllIllIII(this.am.EatingWildPieTask()) || k.lIlllIllIIl(this.am.EatingWildPieTask().y())) {
            return llIlIlIIl[0];
        }
        if (k.lIlllIllIlI(Skills.getBoostedLevel((Skill)Skill.SLAYER), llIlIlIIl[1])) {
            return llIlIlIIl[0];
        }
        Item lIlIllllllIlllI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIlIII[llIlIlIIl[2]]));
        if (k.lIlllIllIIl(lIlIllllllIlllI)) {
            return llIlIlIIl[0];
        }
        var1_1.interact(llIlIlIII[llIlIlIIl[0]]);
        return llIlIlIIl[2];
    }

    static {
        k.lIlllIlIlll();
        k.lIlllIlIllI();
    }

    private static void lIlllIlIllI() {
        llIlIlIII = new String[llIlIlIIl[3]];
        k.llIlIlIII[k.llIlIlIIl[0]] = "Eat";
        k.llIlIlIII[k.llIlIlIIl[2]] = "wild pie";
    }

    @Inject
    public EatingWildPieTask(a a2) {
        this.am = a2;
    }

    private static boolean lIlllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIllIII(Object object) {
        return object != null;
    }
}

