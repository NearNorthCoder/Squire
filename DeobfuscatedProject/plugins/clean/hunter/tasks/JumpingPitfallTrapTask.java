/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Jumping Pitfall Trap", priority=20, blocking=true)
public class JumpingPitfallTrapTask
extends HunterTaskBase {

    static {
        w.lIIIlllIIIlllll();
        w.lIIIlllIIIllllI();
    }

    private static boolean lIIIlllIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIlIIIII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIIllllI() {
        lllIlllllIlI = new String[lllIlllllIll[3]];
        w.lllIlllllIlI[w.lllIlllllIll[0]] = "Jump";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var2;
        w var3;
        TileObject tileObject = this.F();
        if (w.lIIIlllIIlIIIII(tileObject)) {
            return lllIlllllIll[0];
        }
        NPC var4 = var3.E();
        if (w.lIIIlllIIlIIIII(var4)) {
            return lllIlllllIll[0];
        }
        if (w.lIIIlllIIlIIIIl(((GameObject)var2).getWorldArea().contains(var4.getWorldLocation()) ? 1 : 0)) {
            return lllIlllllIll[0];
        }
        var2.interact(lllIlllllIlI[lllIlllllIll[0]]);
        if (w.lIIIlllIIlIIIlI(var2.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1]) && w.lIIIlllIIlIIIlI(var4.distanceTo((Locatable)Players.getLocal()), lllIlllllIll[1])) {
            var3.sleep(lllIlllllIll[2]);
            return lllIlllllIll[3];
        }
        this.sleep(lllIlllllIll[1]);
        return lllIlllllIll[3];
    }

    private static boolean lIIIlllIIlIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public JumpingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }
}

