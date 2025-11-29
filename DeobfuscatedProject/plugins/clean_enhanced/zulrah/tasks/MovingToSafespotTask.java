/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum6;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Moving to safespot", priority=15)
public class MovingToSafespotTask
extends ad {

    /*
     * WARNING - void declaration
     */
    private boolean e(WorldPoint worldPoint) {
        Iterator var2 = TileObjects.getAll().iterator();
        while ((var2.hasNext( != 0) ? 1 : 0)) {
            void var3;
            GameObject var4;
            TileObject var5 = (TileObject)var2.next();
            if ((var5.getId() == 5) && ((var4 = GameObjectllllllllllllllIllIIIllIIlIIIIlll).getWorldArea().contains2D((WorldPoint)var3) ? 1 : 0)) {
                return 4;
            }
            0;
            if (3 != 0) continue;
            return ((3 ^ 0x21) & ~(0x93 ^ 0xB1) & ~((0xC ^ 0x3E) & ~(0x85 ^ 0xB7))) != 0;
        }
        return 0;
    }

    @Inject
    protected MovingToSafespotTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    static {
        Z.var6();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        boolean bl;
        void var7;
        WorldPoint var8;
        WorldPoint worldPoint;
        Z var9;
        Player player = Players.getLocal();
        if player == null {
            return 0;
        }
        WorldPoint var10 = var9.ai();
        if var10 == null {
            return 0;
        }
        if (((Object)var9.az.V().C() == (Object)var9.az.V().C()2)k.JAD_PHASE_W) && (var9.az.aa() >= 1)) {
            worldPoint = var9.az.V().D().get(0).C().a(var9.az.X());
            0;
            if ((0x8D ^ 0x89) <= ((0x8F ^ 0xC3) & ~(0x52 ^ 0x1E))) {
                return ((0x10 ^ 0x42) & ~(0xC0 ^ 0x92)) != 0;
            }
        } else {
            worldPoint = var8 = var10;
        }
        if ((var7.getWorldLocation( != 0).equals((Object)var8) ? 1 : 0)) {
            return 0;
        }
        if ((var9.ellllllllllllllIllIIIllIIlIIlIIII)) {
            return 0;
        }
        int var11 = var8.distanceTo2D(var7.getWorldLocation());
        if ((var11 <= 2) && (var9.az.U( != 0) ? 1 : 0)) {
            return 0;
        }
        ScenePoint var12 = ScenePoint.fromWorld((WorldPoint)var8);
        Movement.setDestination((int)var12.getX(), (int)var12.getY());
        var9.sleep(3);
        if (var11 > 3) {
            bl = 4;
            0;
            if (((0xB1 ^ 0x97) & ~(0x7E ^ 0x58)) != 0) {
                return ((0xD0 ^ 0xC2) & ~(0x1F ^ 0xD)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }
}

