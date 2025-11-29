/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Smelling salts", priority=100)
public class SmellingSaltsTask
extends AutotoaTaskBase {
    
    private final  C cR;

    private static boolean lIIllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected SmellingSaltsTask(Client client, C c2) {
        super(client);
        this.cR = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        am var1;
        if (am.lIIllIlIIIlIlI(this.bc() ? 1 : 0)) {
            return lIlllIlllll[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (am.lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[5]]) ? 1 : 0) && am.lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[6]]) ? 1 : 0)) {
                n2 = lIlllIlllll[1];

                if (1 >= 2) {
                    return ((0x7F ^ 0x3B ^ (0xD0 ^ 0xAB)) & (0xCF ^ 0xBC ^ (0x41 ^ 0xD) ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIlllll[0];
            }
            return n2 != 0;
        });
        if (am.lIIllIlIIIllII(var2) && am.lIIllIlIIIllII(var2 = Inventory.getFirst(item -> item.getName().contains(lIlllIlllIl[lIlllIlllll[4]])))) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIIlllI(var2.getName().contains(lIlllIlllIl[lIlllIlllll[0]]) ? 1 : 0) && am.lIIllIlIIlIIII(var1.cR.av().getOrDefault((Object)e.SMELLING_SALTS, lIlllIlllll[0]), lIlllIlllll[1]) && am.lIIllIlIIIlIlI(var1.aq() ? 1 : 0) && am.lIIllIlIIIlIlI(var1.d.dehydration() ? 1 : 0)) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIIllII(Players.getLocal().getInteracting())) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIlIIll(Vars.getBit((int)lIlllIlllll[2]))) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIlIlII(Skills.getBoostedLevel((Skill)Skill.STRENGTH) - Skills.getLevel((Skill)Skill.STRENGTH), lIlllIlllll[3]) && (!am.lIIllIlIIIlllI(var1.aq() ? 1 : 0) || am.lIIllIlIIIlIlI(var1.d.dehydration() ? 1 : 0))) {
            return lIlllIlllll[0];
        }
        var1_1.interact(lIlllIlllIl[lIlllIlllll[1]]);
        return lIlllIlllll[1];
    }

    private static void lIIllIlIIIIlII() {
        lIlllIlllIl = new String[lIlllIlllll[7]];
        am.lIlllIlllIl[am.lIlllIlllll[0]] = "1";
        am.lIlllIlllIl[am.lIlllIlllll[1]] = "Crush";
        am.lIlllIlllIl[am.lIlllIlllll[4]] = "salts";
        am.lIlllIlllIl[am.lIlllIlllll[5]] = "salts";
        am.lIlllIlllIl[am.lIlllIlllll[6]] = "1";
    }

    private static boolean lIIllIlIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIIIllII(Object object) {
        return object == null;
    }

    static {
        am.lIIllIlIIIlIII();
        am.lIIllIlIIIIlII();
    }

    private static boolean lIIllIlIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIIllIlIIlIIll(int n2) {
        return n2 > 0;
    }
}

