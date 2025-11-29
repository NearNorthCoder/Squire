/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Checking State", priority=2147482310)
public class CheckingStateTask
extends Task {
    private final  a aq;
    private static  int[] llIllllII;
    private static  String[] llIlllIll;
    private final  SquireCerberus ao;
    private final  SquireCerberusConfig ap;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    @Inject
    public CheckingStateTask(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ao = squireCerberus;
        this.ap = squireCerberusConfig;
        this.aq = a2;
    }

    private static void var2() {
        llIllllII = new int[12];
        m.llIllllII[0] = (0x24 ^ 0x69) & ~(0xF ^ 0x42);
        m.llIllllII[1] = 1;
        m.llIllllII[2] = -(0xFFFFF21D & 0x7FF7) & (0xFFFFFF7F & 0x7B9D);
        m.llIllllII[3] = 2;
        m.llIllllII[4] = 3;
        m.llIllllII[5] = 0xA1 ^ 0xA5;
        m.llIllllII[6] = 0x61 ^ 0x64;
        m.llIllllII[7] = 0x60 ^ 0x66;
        m.llIllllII[8] = 0xA3 ^ 0xA4;
        m.llIllllII[9] = 0x5D ^ 0x55;
        m.llIllllII[10] = 0x29 ^ 0x61 ^ (0x2F ^ 0x6E);
        m.llIllllII[11] = 0x67 ^ 0x56 ^ (0x8E ^ 0xB5);
    }

    public boolean run() {
        Item var3;
        m var4;
        if (m.var5(Game.getState(), GameState.LOGGED_IN)) {
            return llIllllII[0];
        }
        if (m.var6(Players.getLocal())) {
            return llIllllII[0];
        }
        int[] nArray = new int[llIllllII[1]];
        nArray[m.llIllllII[0]] = llIllllII[2];
        Item var7 = Inventory.getFirst((int[])nArray);
        if (m.var8(var7)) {
            var7.interact(llIlllIll[llIllllII[0]]);
        }
        if (m.var9(var4.ao.r() ? 1 : 0)) {
            return llIllllII[0];
        }
        if (m.var8(var4.aq.k())) {
            return llIllllII[0];
        }
        if (m.var1(var4.ao.p().isEmpty() ? 1 : 0)) {
            return llIllllII[0];
        }
        if ((Inventory.getCount(item -> {
            int n2;
            if (m.var1(item.getName().contains(llIlllIll[llIllllII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[llIllllII[1]];
                stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[10]];
                if (m.var9(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIllllII[1];
                    0;
                    if ((0x9A ^ 0x9E) > 2) return n2 != 0;
                    return ((9 ^ 0x38) & ~(0xBA ^ 0x8B)) != 0;
                }
            }
            n2 = llIllllII[0];
            return n2 != 0;
        }) < var4.ap.bankUnderAmount())) {
            Log.info((String)llIlllIll[llIllllII[1]]);
            var4.ao.b(llIllllII[1]);
        }
        Item var10 = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    if (!m.var1(item.getName().toLowerCase().contains(llIlllIll[llIllllII[6]]) ? 1 : 0)) break block2;
                    if (!m.var9(item.getName().toLowerCase().contains(llIlllIll[llIllllII[7]]) ? 1 : 0)) break block3;
                    String[] stringArray = new String[llIllllII[1]];
                    stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[8]];
                    if (!m.var9(item.hasAction(stringArray) ? 1 : 0)) break block3;
                }
                n2 = llIllllII[1];
                0;
                if (3 >= 0) return n2 != 0;
                return ((0x5C ^ 0x12) & ~(0xA ^ 0x44)) != 0;
            }
            n2 = llIllllII[0];
            return n2 != 0;
        });
        if (m.var1(Prayers.getPoints()) && m.var6(var10)) {
            Log.info((String)llIlllIll[llIllllII[3]]);
            var4.ao.b(llIllllII[1]);
        }
        if (m.var6(var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIllllII[1]];
            stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[5]];
            return item.hasAction(stringArray);
        })) && (Combat.getCurrentHealth() < var4.ap.eatAtHealth())) {
            Log.info((String)llIlllIll[llIllllII[4]]);
            var4.ao.b(llIllllII[1]);
        }
        return llIllllII[0];
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var17() {
        llIlllIll = new String[llIllllII[11]];
        m.llIlllIll[m.llIllllII[0]] = "Drop";
        m.llIlllIll[m.llIllllII[1]] = "We're low on food, need to bank";
        m.llIlllIll[m.llIllllII[3]] = "No prayer points, need to bank";
        m.llIlllIll[m.llIllllII[4]] = "No food or not enough food";
        m.llIlllIll[m.llIllllII[5]] = "Eat";
        m.llIlllIll[m.llIllllII[6]] = "prayer";
        m.llIlllIll[m.llIllllII[7]] = "restore";
        m.llIlllIll[m.llIllllII[8]] = "Drink";
        m.llIlllIll[m.llIllllII[9]] = "Summer pie";
        m.llIlllIll[m.llIllllII[10]] = "Eat";
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.var2();
        m.var17();
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = llIllllII[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = llIllllII[0];
        while (var32 < var31) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (((0x2D ^ 0) & ~(0x56 ^ 0x7B)) <= 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }
}

