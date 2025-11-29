/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.util.Locale;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Burning at brazier", register=true)
public class BurningAtBrazierTask
extends Task {
    private static final  int H;
    
    private static final  int G;
    private final  b I;
    
    private final  SquireWintertodtConfig J;
    private  int K;

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!(string.contains(var2[6] == 0) ? 1 : 0) || (string.contains(var2[5] != 0) ? 1 : 0)) {
            var3.K = 0;
        }
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public BurningAtBrazierTask(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.K = 0;
        this.J = squireWintertodtConfig;
        this.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        g var10;
        if (!(this.I.i( != 0) ? 1 : 0) || !(this.I.u( == 0) ? 1 : 0) || (this.I.j( != 0) ? 1 : 0)) {
            return 0;
        }
        Player var11 = Players.getLocal();
        a var12 = var10.I.q();
        TileObject var13 = TileObjects.getNearest((WorldPoint)var12.b(), tileObject -> {
            int n2;
            if ((tileObject.getName( != null)) && (tileObject.getName( != 0).toLowerCase(Locale.ROOT).contains(var2[7]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var2[8];
                if ((tileObject.hasActionstringArray) && (var12.b().distanceTo((Locatable)tileObject) <= 5)) {
                    n2 = 1;
                    0;
                    if ((0x57 ^ 0x53) >= (0x51 ^ 0x55)) return n2 != 0;
                    return ((0x86 ^ 0xBD) & ~(0x71 ^ 0x4A)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if (!var13 != null || (var11.isMoving( != 0) ? 1 : 0)) {
            return 0;
        }
        GameObject var14 = (GameObject)var13;
        if ((var14.getWorldArea( == 0).isInMeleeDistance(var11.getWorldLocation()) ? 1 : 0)) {
            Movement.walk((WorldPoint)var12.b());
            return 1;
        }
        if ((Players.getLocal().getAnimation() == 2)) {
            int[] nArray = new int[1];
            nArray[0] = 3;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                return 0;
            }
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        if (!(var14.hasActionstringArray) || (Players.getLocal().getAnimation() == 4)) {
            var10.K = 5;
            return 0;
        }
        if (var10.K > 0) {
            var10.K -= 1;
            return 1;
        }
        var4_4.interact(var2[1]);
        return 1;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        g.var21();
        g.var22();
        G = 4;
        H = 2;
    }

}

