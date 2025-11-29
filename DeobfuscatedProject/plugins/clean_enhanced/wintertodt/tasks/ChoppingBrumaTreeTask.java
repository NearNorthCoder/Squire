/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Chopping bruma tree")
public class ChoppingBrumaTreeTask
extends Task {
    private final  b F;

    public static final  String D;
    private final  SquireWintertodtConfig E;

    @Inject
    public ChoppingBrumaTreeTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.E = squireWintertodtConfig;
        this.F = b2;
    }

    static {
        f.var3();
        f.var4();
        D = var1[7];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var5;
        if (!(this.F.i( != 0) ? 1 : 0) || !(this.F.u( != 0) ? 1 : 0) || (this.F.j( != 0) ? 1 : 0)) {
            return 0;
        }
        a var6 = var5.F.q();
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        TileObject var7 = TileObjects.getNearest((WorldPoint)var6.c(), (String[])stringArray);
        if var7 == null {
            return 0;
        }
        Player var8 = Players.getLocal();
        if (!(var8.isAnimating( == 0) ? 1 : 0) || (var8.isMoving( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.isRunEnabled( == 0) ? 1 : 0) && (Movement.getRunEnergy() > 2)) {
            Movement.toggleRun();
        }
        if ((var5.E.spec( != 0) ? 1 : 0) && (Combat.getSpecEnergy() >= 3) && (var5.B( != 0) ? 1 : 0)) {
            Combat.toggleSpec();
            return 0;
        }
        if ((var8.getWorldLocation( == 0).equals((Object)var6.c()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var6.c());
            return 1;
        }
        var2_2.interact(var1[1]);
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean B() {
        boolean bl;
        block3: {
            block2: {
                if (!(Equipment.contains(item -> item.getName( == 0).contains(var1[6])) ? 1 : 0)) break block2;
                String[] stringArray = new String[1];
                stringArray[0] = var1[4];
                if (!(Equipment.contains((String[] == 0)stringArray) ? 1 : 0)) break block2;
                String[] stringArray2 = new String[1];
                stringArray2[0] = var1[5];
                if (!(Equipment.contains((String[] != 0)stringArray2) ? 1 : 0)) break block3;
            }
            bl = 1;
            0;
            if (((114 + 121 - 214 + 143 ^ 87 + 123 - 110 + 74) & (107 + 144 - 230 + 159 ^ 31 + 86 - 84 + 157 ^ -1)) == 0) return bl;
            return ((0x84 ^ 0xAA ^ (0x77 ^ 0x11)) & (113 + 71 - 18 + 49 ^ 72 + 146 - 173 + 114 ^ -1)) != 0;
        }
        bl = 0;
        return bl;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

}

