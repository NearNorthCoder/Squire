/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.util.Locale;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Fixing brazier", priority=2, blocking=true)
public class FixingBrazierTask
extends Task {
    private final  SquireWintertodtConfig T;
    
    private final  b S;

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!(string.contains(var1[3] == 0) ? 1 : 0) || (string.contains(var1[2] != 0) ? 1 : 0)) {
            m var3;
            var3.sleep(0);
        }
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0xA1 ^ 0xAF ^ (0x4E ^ 0x44)) >= 2) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    @Inject
    public FixingBrazierTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.S = b2;
        this.T = squireWintertodtConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        m var20;
        if (!(this.S.i( != 0) ? 1 : 0) || !(this.S.u( == 0) ? 1 : 0) || (this.S.j( != 0) ? 1 : 0)) {
            return 0;
        }
        a var21 = var20.S.q();
        Player var22 = Players.getLocal();
        if ((var21.b().distanceTo((Locatable)var22) > 1)) {
            return 0;
        }
        TileObject var23 = TileObjects.getNearest((WorldPoint)var21.b(), tileObject -> {
            int n2;
            if ((tileObject.getName( != null)) && (tileObject.getName( != 0).toLowerCase(Locale.ROOT).contains(var1[1]) ? 1 : 0) && (var21.b().distanceTo((Locatable)tileObject) <= 1)) {
                String[] stringArray = new String[3];
                stringArray[0] = var1[4];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (2 != 3) return n2 != 0;
                    return ((0xF5 ^ 0xB2 ^ (0xC7 ^ 0x9E)) & (2 ^ 0x27 ^ (0x3B ^ 0) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var23 == null {
            return 0;
        }
        var3_3.interact(var1[0]);
        this.sleep(2);
        return 3;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

