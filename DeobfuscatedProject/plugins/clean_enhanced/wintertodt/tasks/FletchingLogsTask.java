/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Fletching Logs", priority=1, blocking=true, register=true)
public class FletchingLogsTask
extends Task {
    private static final  int U;

    private final  SquireWintertodtConfig W;
    private final  b V;
    private  int X;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var4_4;
        n var3;
        if (!(this.V.i( != 0) ? 1 : 0) || !(this.V.u( == 0) ? 1 : 0) || (this.V.j( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        int var4 = Inventory.getCount((int[])nArray);
        if (!(var3.W.fletch( != 0) ? 1 : 0) || (var3.V.f() >= 3 - var4 * 4)) {
            return 0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 5;
        if ((var4 + Inventory.getCount((int[])nArray2) > var3.V.g())) {
            return 0;
        }
        Player var5 = Players.getLocal();
        a var6 = var3.V.q();
        if ((var6.b().distanceTo((Locatable)var5) > 6) && (var5.isMoving( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray3 = new int[1];
        nArray3[0] = 2;
        Item var7 = Inventory.getFirst((int[])nArray3);
        int[] nArray4 = new int[1];
        nArray4[0] = 7;
        Item var8 = Inventory.getFirst((int[])nArray4);
        if (!var7 != null || var8 == null) {
            return 0;
        }
        if ((Players.getLocal().getAnimation() == 8)) {
            int n2 = var3.X;
            var3.X = n2 - 1;
            if (n2 >= 0) {
                var3.X = 6;
                return 0;
            }
        }
        var4_4.useOn((Item)var5_5);
        this.X = 6;
        this.V.FletchingLogsTask();
        return 1;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!(string.contains(var2[0] == 0) ? 1 : 0) || (string.contains(var2[1] != 0) ? 1 : 0)) {
            var9.X = 0;
        }
    }

    @Inject
    public FletchingLogsTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.V = b2;
        this.W = squireWintertodtConfig;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    static {
        n.var16();
        n.var17();
        U = 8;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }
}

