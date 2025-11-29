/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping for free world", priority=0x7FFFFFFF, blocking=true, register=true)
public class HoppingForFreeWorldTask
extends CorpTaskBase {
    @Inject
    private  SquireCorp p;

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (l.lllIIIlIIIllIl(gameStateChanged.getGameState(), GameState.HOPPING)) {
            this.p.c(lIlIllllIIlI[0]);
        }
    }

    private static boolean lllIIIlIIIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIIIlIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean lllIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l var1;
        if (l.lllIIIlIIIlIll(this.p.d() ? 1 : 0)) {
            return lIlIllllIIlI[0];
        }
        if (l.lllIIIlIIIlIll(var1.HoppingForFreeWorldTask() ? 1 : 0)) {
            return lIlIllllIIlI[0];
        }
        World var2 = Worlds.getRandom(world -> {
            int n2;
            if (l.lllIIIlIIIlllI(world.isNormal() ? 1 : 0) && l.lllIIIlIIIlllI(world.isMembers() ? 1 : 0)) {
                n2 = lIlIllllIIlI[1];

                if (((0xB9 ^ 0x90) & ~(0x6C ^ 0x45)) != 0) {
                    return false;
                }
            } else {
                n2 = lIlIllllIIlI[0];
            }
            return n2 != 0;
        });
        if (l.lllIIIlIIIllII(var2)) {
            return lIlIllllIIlI[0];
        }
        if (l.lllIIIlIIIlIll(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return lIlIllllIIlI[1];
        }
        Worlds.hopTo((World)var1_1);
        return lIlIllllIIlI[1];
    }

    static {
        l.lllIIIlIIIlIlI();
    }
}

