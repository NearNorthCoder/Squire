/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
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
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Entering Altar", priority=2, blocking=true)
public class EnteringAltarTask
extends RunecraftingTaskBase {

    private static boolean lllllllIIIIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        int var1;
        int n2;
        int var2;
        int n3;
        q var3;
        void var4;
        d d2 = this.aV.h();
        if (q.lllllllIIIIlII((Object)d2)) {
            return llIIlllIIIlI[1];
        }
        if (!q.lllllllIIIIlIl(var4.V(), Skills.getLevel((Skill)Skill.RUNECRAFT)) || q.lllllllIIIIllI(var3.aV.p())) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        Player var5 = Players.getLocal();
        int var6 = var3.aV.EnteringAltarTask() - var3.aV.p();
        if (q.lllllllIIIIlll(var3.aV.E() ? 1 : 0) && !q.lllllllIIIIlIl(var3.aV.p(), llIIlllIIIlI[3]) || q.lllllllIIIlIII((Object)var3.aV.m(), (Object)c.FINISHING) && q.lllllllIIIlIIl(var3.aV.p())) {
            n3 = llIIlllIIIlI[2];

            }
        } else {
            n3 = llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(var2 = n3) && q.lllllllIIIlIlI(var6, Inventory.getFreeSlots()) && q.lllllllIIIlIll((Object)var3.aV.m(), (Object)c.FINISHING)) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIlIlI(var6, llIIlllIIIlI[0]) && q.lllllllIIIlIIl(var3.aV.a())) {
            n2 = llIIlllIIIlI[2];

            if (-1 > 3) {
                return false;
            }
        } else {
            n2 = var1 = llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(var2) && (!q.lllllllIIIllII(var5.getAnimation(), llIIlllIIIlI[4]) || q.lllllllIIIIlll(var1))) {
            return llIIlllIIIlI[1];
        }
        String[] stringArray = new String[llIIlllIIIlI[2]];
        stringArray[q.llIIlllIIIlI[1]] = var4.T();
        TileObject var7 = TileObjects.getNearest((String[])stringArray);
        if (q.lllllllIIIIlII(var7)) {
            return llIIlllIIIlI[1];
        }
        if (q.lllllllIIIIllI(var3.b((GameObject)var7) ? 1 : 0)) {
            var7.interact(llIIlllIIIIl[llIIlllIIIlI[1]]);
        }
        return llIIlllIIIlI[2];
    }

    private static boolean lllllllIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        q.lllllllIIIIIll();
        q.lllllllIIIIIlI();
    }

    private static boolean lllllllIIIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllllllIIIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllllIIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public EnteringAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIIlI[0]];
        cArray[q.llIIlllIIIlI[1]] = c.ACTIVE;
        cArray[q.llIIlllIIIlI[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIIIlIIl(int n2) {
        return n2 > 0;
    }

    private static void lllllllIIIIIlI() {
        llIIlllIIIIl = new String[llIIlllIIIlI[2]];
        q.llIIlllIIIIl[q.llIIlllIIIlI[1]] = "Enter";
    }

    private static boolean lllllllIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

