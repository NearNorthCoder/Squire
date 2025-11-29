/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=84, register=true, blocking=true)
public class HandlingHouseTask
extends BankingTask {
    
    private  int bX;
    
    private  boolean bW;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    static {
        r.var4();
        r.var5();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (r.var6(animationChanged.getActor().getAnimation(), var2[4])) {
            this.bW = var2[3];
        }
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new String[var2[5]];
        r.var1[r.var2[0]] = "Teleport Menu";
        r.var1[r.var2[3]] = "Jewellery Box";
    }

    @Override
    public boolean run() {
        r var8;
        if (!r.var9(this.S() ? 1 : 0) || r.var9(this.T().needsToBank() ? 1 : 0)) {
            return var2[0];
        }
        if (r.var7(var8.R() ? 1 : 0)) {
            return var2[0];
        }
        if (r.var9(House.isInside() ? 1 : 0)) {
            return var2[0];
        }
        if (!r.var7(Players.getLocal().isIdle() ? 1 : 0) || r.var3(Static.getClient().getGameState(), GameState.LOADING)) {
            return var2[0];
        }
        if (r.var7(House.isPoolDrinkUseful() ? 1 : 0)) {
            return House.drinkFromPool();
        }
        if (r.var10(House.getJewelryBox())) {
            return var2[0];
        }
        if (r.var7(Widgets.isVisible((Widget)Widgets.get((int)var2[1], (int)var2[0])) ? 1 : 0)) {
            Keyboard.type((char)var2[2]);
            return var2[3];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var12(tileObject.getName()) && r.var7(tileObject.getName().contains(var1[var2[3]]) ? 1 : 0)) {
                n2 = var2[3];
                0;
                if (-3 >= 0) {
                    return ((116 + 35 - 134 + 117 ^ 103 + 19 - 109 + 123) & (0x3D ^ 0x64 ^ (0xE2 ^ 0xB5) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (r.var12(var11)) {
            var11.interact(var1[var2[0]]);
            return var2[3];
        }
        return var2[0];
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        return var2[0];
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    protected HandlingHouseTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static void var4() {
        var2 = new int[7];
        r.var2[0] = (0x28 ^ 0x4B) & ~(0x60 ^ 3);
        r.var2[1] = -(0xFFFFFDE6 & 0x569B) & (0xFFFFDECF & 0x77FF);
        r.var2[2] = 0xAC ^ 0x9F;
        r.var2[3] = 1;
        r.var2[4] = -(0xFFFFF1F7 & 0x6F1F) & (0xFFFFFF9F & 0x7DFF);
        r.var2[5] = 2;
        r.var2[6] = 0x55 ^ 0x5D;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }
}

