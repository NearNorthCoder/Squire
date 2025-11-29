/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Entering essence portal", priority=5, blocking=true)
public class EnteringEssencePortalTask
extends RunecraftingTaskBase {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Override
    protected boolean aj() {
        return 0;
    }

    @Override
    protected boolean ak() {
        w var13;
        if ((this.aV.g( == 0) ? 1 : 0)) {
            return 1;
        }
        if (!(SquireGOTRPlugin.g.contains((Locatable == 0)Players.getLocal()) ? 1 : 0) || (SquireGOTRPlugin.h.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        int var14 = var13.aV.q() - var13.aV.p();
        if (var14 <= 2) {
            return 1;
        }
        if ((var14 < 3) && (var13.aV.a() > 3)) {
            return 1;
        }
        Instant var15 = var13.aV.J();
        GameObject var16 = var13.aV.C();
        if var16 == null {
            return 1;
        }
        if (!var15 != null || (Instant.now( != 0).isAfter(var15.plus((long)(4 - var16.distanceTo((Locatable)Players.getLocal()) / 2), ChronoUnit.SECONDS)) ? 1 : 0)) {
            return 1;
        }
        if ((var13.b(var16 == 0) ? 1 : 0)) {
            var16.interact(var1[1]);
            var13.c(5, () -> this.a(var16.getWorldLocation()));
        }
        return 0;
    }

    @Inject
    public EnteringEssencePortalTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

}

