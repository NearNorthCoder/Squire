/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ClientTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.query.results.ItemQueryResults
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import gg.squire.skilling.tasks.GameEnum5;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ClientTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.query.results.ItemQueryResults;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cooking", register=true)
public class CookingTask
extends SkillingManager {

    @Inject
    public CookingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.COOKING);
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var2_4;
        void var1_2;
        v var4;
        if (v.var5(this.j.oneTick() ? 1 : 0)) {
            void var6;
            void var7;
            int[] nArray = new int[var1[0]];
            nArray[v.var1[1]] = this.j.cookingProduct().A();
            Item item = (Item)((ItemQueryResults)Inventory.query().ids(nArray).results()).last();
            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.var3(tileObject.getActions())) {
                    String[] stringArray = new String[var1[0]];
                    stringArray[v.var1[1]] = var2[var1[3]];
                    if (v.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[0];
                        0;
                        if ((0xB7 ^ 0xB3) != 0) return n2 != 0;
                        return ((0xA3 ^ 0xBA) & ~(0x2E ^ 0x37)) != 0;
                    }
                }
                n2 = var1[1];
                return n2 != 0;
            });
            if (v.var5(Production.isOpen() ? 1 : 0)) {
                Production.choosePreviousOption();
            }
            if (v.var3(var7) && v.var3(var6)) {
                var7.useOn((TileObject)var6);
            }
            return var1[0];
        }
        if (v.var5(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)var4.j.cookingProduct().C());
            var4.sleep(var4.i());
            return var1[0];
        }
        int[] nArray = new int[var1[0]];
        nArray[v.var1[1]] = var4.j.cookingProduct().A();
        Item var7 = Inventory.getFirst((int[])nArray);
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            boolean bl;
            block4: {
                block3: {
                    TileObject var8;
                    block2: {
                        if (!v.var3(tileObject.getActions())) break block2;
                        String[] stringArray = new String[var1[0]];
                        stringArray[v.var1[1]] = var2[var1[1]];
                        if (!v.var9(tileObject.hasAction(stringArray) ? 1 : 0)) break block3;
                    }
                    if (!v.var5(var8.getName().equals(var2[var1[0]]) ? 1 : 0)) break block4;
                }
                bl = var1[0];
                0;
                if (2 != 0) return bl;
                return ((157 + 184 - 119 + 3 ^ 128 + 31 - -1 + 2) & (0xF7 ^ 0x82 ^ (0x9C ^ 0xAA) ^ -1)) != 0;
            }
            bl = var1[1];
            return bl;
        });
        if (v.var10(var6)) {
            return var1[1];
        }
        var1_2.useOn((TileObject)var2_4);
        this.sleep(var1[0]);
        return var1[0];
    }

    @Override
    public int i() {
        int n2;
        if (v.var5(this.j.oneTick() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((0x67 ^ 0x1E ^ 32 + 122 - 101 + 74) & (0xAC ^ 0xA5 ^ (0x84 ^ 0x8B) ^ -1)) >= (0xB7 ^ 0x94 ^ (0x13 ^ 0x34))) {
                return (157 + 17 - 39 + 28 ^ 62 + 15 - -62 + 19) & (152 + 84 - 102 + 43 ^ 135 + 127 - 210 + 88 ^ -1);
            }
        } else {
            n2 = var1[2];
        }
        return n2;
    }

    private static void var11() {
        var2 = new String[var1[2]];
        v.var2[v.var1[1]] = "Cook";
        v.var2[v.var1[0]] = "Fire";
        v.var2[v.var1[3]] = "Cook";
    }

    private static void var12() {
        var1 = new int[5];
        v.var1[0] = 1;
        v.var1[1] = (0x5C ^ 0x44) & ~(0x34 ^ 0x2C);
        v.var1[2] = 3;
        v.var1[3] = 2;
        v.var1[4] = 165 + 11 - 112 + 143 ^ 109 + 166 - 191 + 115;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.cookingProduct().A(), var1[0]);
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        v.var12();
        v.var11();
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ClientTick clientTick) {
        v var26;
        if (v.var9(this.j.oneTick() ? 1 : 0)) {
            return;
        }
        if (v.var13((Object)var26.j.cookingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.i.KARAMBWAN)) {
            return;
        }
        Keyboard.sendSpace();
    }
}

