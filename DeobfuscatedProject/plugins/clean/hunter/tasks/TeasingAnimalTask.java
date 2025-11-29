/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Teasing Animal", priority=10, blocking=true)
public class TeasingAnimalTask
extends HunterTaskBase {
    public static final  int G;

    static {
        z.lIIIlllIIlllIlI();
        z.lIIIlllIIlllIIl();
        G = llllIIIIIIll[0];
    }

    private static boolean lIIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public TeasingAnimalTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var3_3;
        z var1;
        if (z.lIIIlllIIlllIll(Players.getLocal().getAnimation(), llllIIIIIIll[0])) {
            this.sleep(llllIIIIIIll[1]);
            return llllIIIIIIll[2];
        }
        TileObject var2 = var1.F();
        if (z.lIIIlllIIllllII(var2)) {
            return llllIIIIIIll[2];
        }
        NPC var3 = var1.E();
        if (z.lIIIlllIIllllIl(var3)) {
            return llllIIIIIIll[2];
        }
        NPC var4 = var1.D();
        if (z.lIIIlllIIllllII(var4)) {
            return llllIIIIIIll[2];
        }
        if (z.lIIIlllIIlllllI(((GameObject)var2).getWorldArea().contains(var4.getWorldLocation()) ? 1 : 0)) {
            return llllIIIIIIll[2];
        }
        var3_3.interact(llllIIIIIIlI[llllIIIIIIll[2]]);
        return llllIIIIIIll[3];
    }

    private static boolean lIIIlllIIllllII(Object object) {
        return object == null;
    }

    private static void lIIIlllIIlllIIl() {
        llllIIIIIIlI = new String[llllIIIIIIll[3]];
        z.llllIIIIIIlI[z.llllIIIIIIll[2]] = "Tease";
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllIIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIlllIIlllllI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var5);
    }
}

