/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;

@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class EnteringPortalTask
extends BankingTask {

    private static boolean lIlllllIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIlIllIll(Object object) {
        return object == null;
    }

    private static boolean lIlllllIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllllIlIllIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected EnteringPortalTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        p var2;
        if (!p.lIlllllIlIllIlI(this.bU.c() ? 1 : 0) || p.lIlllllIlIllIlI(this.R() ? 1 : 0)) {
            return lIlIlIlIIllIl[0];
        }
        int[] nArray = new int[lIlIlIlIIllIl[1]];
        nArray[p.lIlIlIlIIllIl[0]] = lIlIlIlIIllIl[2];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (p.lIlllllIlIllIll(var3)) {
            return lIlIlIlIIllIl[0];
        }
        BankLoadout var4 = var2.T();
        if (p.lIlllllIlIlllII(var4.needsToBank() ? 1 : 0)) {
            return lIlIlIlIIllIl[0];
        }
        if (p.lIlllllIlIlllIl(Combat.getMissingHealth()) && p.lIlllllIlIllllI(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            var2.bU.a(lIlIlIlIIllIl[0]);
            return lIlIlIlIIllIl[0];
        }
        var1_1.interact(lIlIlIlIIllII[lIlIlIlIIllIl[0]]);
        return lIlIlIlIIllIl[1];
    }

    private static boolean lIlllllIlIlllIl(int n2) {
        return n2 <= 0;
    }

    private static void lIlllllIlIllIII() {
        lIlIlIlIIllII = new String[lIlIlIlIIllIl[1]];
        p.lIlIlIlIIllII[p.lIlIlIlIIllIl[0]] = "Enter";
    }

    @Override
    public boolean Q() {
        return lIlIlIlIIllIl[0];
    }

    private static boolean lIlllllIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        p.lIlllllIlIllIIl();
        p.lIlllllIlIllIII();
    }
}

