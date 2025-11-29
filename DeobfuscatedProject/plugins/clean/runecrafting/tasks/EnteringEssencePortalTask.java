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

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Entering essence portal", priority=5, blocking=true)
public class EnteringEssencePortalTask
extends RunecraftingTaskBase {

        return String.valueOf(var1);
    }

    private static boolean lllllllllIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllllllIllIl(Object object) {
        return object == null;
    }

    private static boolean lllllllllIlllI(Object object) {
        return object != null;
    }

    private static boolean lllllllllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllllllIIIIl() {
        llIIlllllIIl = new String[llIIlllllIlI[0]];
        w.llIIlllllIIl[w.llIIlllllIlI[1]] = "Enter";
    }

    @Override
    protected boolean aj() {
        return llIIlllllIlI[0];
    }

    @Override
    protected boolean ak() {
        w var2;
        if (w.lllllllllIIlll(this.aV.g() ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (!w.lllllllllIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0) || w.lllllllllIlIIl(SquireGOTRPlugin.h.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        int var3 = var2.aV.q() - var2.aV.p();
        if (w.lllllllllIlIlI(var3, llIIlllllIlI[2])) {
            return llIIlllllIlI[1];
        }
        if (w.lllllllllIlIll(var3, llIIlllllIlI[3]) && w.lllllllllIllII(var2.aV.a(), llIIlllllIlI[3])) {
            return llIIlllllIlI[1];
        }
        Instant var4 = var2.aV.J();
        GameObject var5 = var2.aV.C();
        if (w.lllllllllIllIl(var5)) {
            return llIIlllllIlI[1];
        }
        if (!w.lllllllllIlllI(var4) || w.lllllllllIlIIl(Instant.now().isAfter(var4.plus((long)(llIIlllllIlI[4] - var5.distanceTo((Locatable)Players.getLocal()) / llIIlllllIlI[2]), ChronoUnit.SECONDS)) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (w.lllllllllIIlll(var2.b(var5) ? 1 : 0)) {
            var5.interact(llIIlllllIIl[llIIlllllIlI[1]]);
            var2.c(llIIlllllIlI[5], () -> this.a(var5.getWorldLocation()));
        }
        return llIIlllllIlI[0];
    }

    private static boolean lllllllllIllII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        w.lllllllllIIlII();
        w.lllllllllIIIIl();
    }

    @Inject
    public EnteringEssencePortalTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllIlI[0]];
        cArray[w.llIIlllllIlI[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllllIIlll(int n2) {
        return n2 == 0;
    }
}

