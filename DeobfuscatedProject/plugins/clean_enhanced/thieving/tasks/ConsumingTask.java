/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunderConfig;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Consuming", priority=500, register=true)
public class ConsumingTask
extends Task {
    private final  SquirePlunderConfig v;
    
    private  Instant x;
    private final  Duration w;

    private static void var3() {
        var2 = new String[var1[7]];
        e.var2[e.var1[0]] = "Can't find selected food!";
        e.var2[e.var1[1]] = "Eat";
        e.var2[e.var1[3]] = "Can't find selected antipoison!";
        e.var2[e.var1[4]] = "Drink";
        e.var2[e.var1[2]] = "Drink";
        e.var2[e.var1[6]] = "Eat";
    }

    @Inject
    public ConsumingTask(SquirePlunderConfig squirePlunderConfig) {
        this.w = Duration.ofSeconds(12L);
        this.v = squirePlunderConfig;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static int var11(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void var18() {
        var1 = new int[9];
        e.var1[0] = (0xB7 ^ 0xAC) & ~(0x4C ^ 0x57);
        e.var1[1] = 1;
        e.var1[2] = 0x52 ^ 0x56;
        e.var1[3] = 2;
        e.var1[4] = 3;
        e.var1[5] = 0x80 ^ 0x8C ^ (0x77 ^ 0x1D);
        e.var1[6] = 0x51 ^ 0x54;
        e.var1[7] = 0xAE ^ 0xA8;
        e.var1[8] = 0x26 ^ 0x2E;
    }

    static {
        e.var18();
        e.var3();
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var20(int n2) {
        return n2 > 0;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var1[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var1[0];
        while (e.var30(var29, var28)) {
            char var31 = var27[var29];
            var24.append((char)(var31 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (2 != ((0x45 ^ 0x29 ^ (0x19 ^ 0x16)) & (0x6A ^ 0x2E ^ (0xB ^ 0x2C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean var30(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var32(int n2) {
        return n2 == 0;
    }

    private static boolean var33(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var34(Object object) {
        return object == null;
    }

    public boolean run() {
        e var35;
        if (e.var19(Combat.getCurrentHealth(), this.v.eatAt()) && e.var32(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        if (e.var19(var35.v.eatAt(), Combat.getCurrentHealth())) {
            Item var36 = Inventory.getFirst(item -> {
                int n2;
                if (e.var33(item.getId(), this.v.foodID())) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[e.var1[0]] = var2[var1[6]];
                    if (e.var10(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (2 >= 1) return n2 != 0;
                        return ((0x8B ^ 0x8F ^ (0x7E ^ 0x46)) & (0x1F ^ 0x73 ^ (0x4C ^ 0x1C) ^ -1)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (e.var34(var36)) {
                Log.info((String)var2[var1[0]]);
                return var1[0];
            }
            var36.interact(var2[var1[1]]);
            var35.sleep(var1[2]);
            return var1[1];
        }
        if (e.var32(Combat.isPoisoned() ? 1 : 0)) {
            return var1[0];
        }
        System.out.println("time until anti: " + Duration.between(var35.x, Instant.now()).toSeconds());
        if (e.var20(e.var11(Duration.between(var35.x, Instant.now()).toSeconds(), var35.w.toSeconds()))) {
            Item var36 = Inventory.getFirst(item -> {
                int n2;
                if (e.var10(item.getName().startsWith(this.v.antiPoison()) ? 1 : 0)) {
                    String[] stringArray = new String[var1[1]];
                    stringArray[e.var1[0]] = var2[var1[2]];
                    if (e.var10(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (-2 <= 0) return n2 != 0;
                        return ((0xE ^ 0x5C) & ~(0x13 ^ 0x41)) != 0;
                    }
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (e.var34(var36)) {
                Log.info((String)var2[var1[3]]);
                return var1[0];
            }
            var36.interact(var2[var1[4]]);
            var35.sleep(var1[3]);
            return var1[1];
        }
        return var1[0];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (e.var33(varbitChanged.getVarpId(), var1[5])) {
            this.x = Instant.now();
        }
    }
}

