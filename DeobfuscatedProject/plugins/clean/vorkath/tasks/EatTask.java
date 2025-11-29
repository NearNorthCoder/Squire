/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eat", priority=110)
public class EatTask
extends VorkathTaskBase {

    private static boolean lIlllllIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIlIIIIIl(Object object) {
        return object != null;
    }

    static {
        G.lIlllllIIlllllI();
        G.lIlllllIIllllIl();
    }

    private static boolean lIlllllIIllllll(Object object) {
        return object == null;
    }

    @Inject
    protected EatTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIlllllIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIllllIl() {
        lIlIlIlIIIlII = new String[lIlIlIlIIIllI[4]];
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[1]] = "Eat";
        G.lIlIlIlIIIlII[G.lIlIlIlIIIllI[0]] = "Eat";
    }

    @Override
    public boolean Q() {
        G var1;
        if (G.lIlllllIIllllll(this.cg.c(lIlIlIlIIIllI[0]))) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIII(Math.abs(var1.cf.getTickCount() - var1.cg.EatTask()), lIlIlIlIIIllI[2])) {
            return lIlIlIlIIIllI[1];
        }
        int[] nArray = new int[lIlIlIlIIIllI[0]];
        nArray[G.lIlIlIlIIIllI[1]] = lIlIlIlIIIllI[3];
        if (G.lIlllllIlIIIIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIlIlIIIllI[1];
        }
        Item var2 = Inventory.getFirst(item -> item.hasAction(lIlIlIlIIIlII[lIlIlIlIIIllI[0]]::equals));
        if (G.lIlllllIIllllll(var2)) {
            return lIlIlIlIIIllI[1];
        }
        NPC var3 = var1.cg.A();
        if (G.lIlllllIlIIIIIl(var3)) {
            return lIlIlIlIIIllI[1];
        }
        if (G.lIlllllIlIIIIIl(var1.cg.A())) {
            return lIlIlIlIIIllI[1];
        }
        int var4 = Skills.getLevel((Skill)Skill.HITPOINTS);
        int var5 = var1.ce.eatAtHP();
        int var6 = var4 - var5;
        if (G.lIlllllIlIIIIlI(var1.cg.I() ? 1 : 0)) {
            var5 += var6 / lIlIlIlIIIllI[4];
        }
        if (G.lIlllllIlIIIIll(Combat.getCurrentHealth(), var5)) {
            var2.interact(lIlIlIlIIIlII[lIlIlIlIIIllI[1]]);
            var1.cg.a(var1.cf.getTickCount());
            var1.cg.b(var1.cf.getTickCount());
            return lIlIlIlIIIllI[0];
        }
        return lIlIlIlIIIllI[1];
    }

    private static boolean lIlllllIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }
}

