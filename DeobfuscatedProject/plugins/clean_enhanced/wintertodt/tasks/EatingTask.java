/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Eating", priority=0x7FFFFFFF, blocking=true)
public class EatingTask
extends Task {
    private final  b Q;
    private final  SquireWintertodtConfig R;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public EatingTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.Q = b2;
        this.R = squireWintertodtConfig;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        l var19;
        if (!(this.Q.j( == 0) ? 1 : 0) || (this.Q.i( == 0) ? 1 : 0)) {
            return 0;
        }
        Item var20 = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    String[] stringArray = new String[2];
                    stringArray[0] = var1[3];
                    if (!(item.hasAction(stringArray == 0) ? 1 : 0)) break block2;
                    String[] stringArray2 = new String[2];
                    stringArray2[0] = var1[4];
                    if (!(item.hasActionstringArray2)) break block3;
                }
                n2 = 2;
                0;
                if (-3 < 0) return n2 != 0;
                return (3 & (3 ^ -1)) != 0;
            }
            n2 = 0;
            return n2 != 0;
        });
        if (var20 == null && (var19.Q.d( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.Q.h() >= 1)) {
            return 0;
        }
        if var20 == null {
            Movement.walk((WorldPoint)var19.Q.e());
            return 2;
        }
        var1_1.interact(string -> {
            boolean bl;
            if (!(var1[0].equalsIgnoreCase((String == 0)string) ? 1 : 0) || (var1[2].equalsIgnoreCase(Stringstring) ? 1 : 0)) {
                bl = 2;
                0;
                if (((0xC ^ 0x70 ^ (0x70 ^ 3)) & (30 + 58 - 53 + 171 ^ 103 + 72 - 173 + 191 ^ -1)) != 0) {
                    return ((50 + 107 - 153 + 174 ^ 7 + 68 - 10 + 63) & (0xFC ^ 0xA2 ^ (0xB ^ 0x67) ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        this.sleep(2);
        return 2;
    }

}

