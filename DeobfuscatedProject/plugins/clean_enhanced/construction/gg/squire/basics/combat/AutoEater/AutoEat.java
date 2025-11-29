/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.basics.combat.AutoEater;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.combat.AutoEater.AutoEatConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@PluginDescriptor(name="Squire Auto Eater", description="Auto eats", enabledByDefault=false)
@SquireUtil
public class AutoEat
extends SquirePlugin {
    private static  String[] llIIllIl;
    @Inject
     ClientThread bB;
    @Inject
     AutoEatConfig bF;
    @Inject
     ConfigManager bA;
    private  int bD;
     WorldPoint bC;
    private static  int[] llIIlllI;

    protected Class<?>[] tasks() {
        return new Class[llIIlllI[1]];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int n2;
        Item var1;
        AutoEat var2;
        Item item2;
        if (AutoEat.var3(this.bF.eatHP(), Combat.getCurrentHealth()) && AutoEat.var4(item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIIlllI[2]];
            stringArray[AutoEat.llIIlllI[1]] = llIIllIl[llIIlllI[5]];
            return item.hasAction(stringArray);
        }))) {
            item2.interact(llIIllIl[llIIlllI[1]]);
            Time.sleep((long)1L);
            0;
        }
        if (AutoEat.var3(var2.bF.drinkPrayAt(), Prayers.getPoints()) && AutoEat.var4(var1 = Inventory.getFirst(item -> {
            int n2;
            if (!AutoEat.var5(item.getName().contains(llIIllIl[llIIlllI[3]]) ? 1 : 0) || AutoEat.var6(item.getName().contains(llIIllIl[llIIlllI[4]]) ? 1 : 0)) {
                n2 = llIIlllI[2];
                0;
                
            } else {
                n2 = llIIlllI[1];
            }
            return n2 != 0;
        }))) {
            var1.interact(llIIllIl[llIIlllI[2]]);
        }
        if (!AutoEat.var7(Players.getLocal().getInteracting()) || AutoEat.var4(NPCs.getNearest(nPC -> {
            boolean bl2;
            if (AutoEat.var8(nPC.getInteracting(), Players.getLocal())) {
                bl2 = llIIlllI[2];
                0;
                if (-((0x3A ^ 0x6A) & ~(0x1C ^ 0x4C) ^ (0x3B ^ 0x3F)) >= 0) {
                    return ((106 + 10 - 7 + 22 ^ 181 + 152 - 313 + 177) & (0x8B ^ 0xBC ^ (0x10 ^ 0x61) ^ -1) & ((0x5C ^ 0x40 ^ (7 ^ 0x31)) & (83 + 54 - 50 + 58 ^ 20 + 83 - 77 + 161 ^ -1) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlllI[1];
            }
            return bl2;
        }))) {
            n2 = llIIlllI[2];
            0;
            if (3 <= 0) {
                return;
            }
        } else {
            n2 = var1 = llIIlllI[1];
        }
        if (AutoEat.var6(var2.bF.drinkBoostPotions() ? 1 : 0) && AutoEat.var6(var1)) {
            Combat.drinkBoostingPotion((int)var2.bF.boostAtPercentage());
            0;
        }
    }

    public AutoEat() {
        this.bD = llIIlllI[0];
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    protected void onStart() {
    }

    private static void var9() {
        llIIlllI = new int[8];
        AutoEat.llIIlllI[0] = -1;
        AutoEat.llIIlllI[1] = (125 + 56 - 177 + 124 ^ 113 + 93 - 64 + 57) & (9 ^ 0x38 ^ (0x71 ^ 7) ^ -1);
        AutoEat.llIIlllI[2] = 1;
        AutoEat.llIIlllI[3] = 2;
        AutoEat.llIIlllI[4] = 3;
        AutoEat.llIIlllI[5] = 157 + 92 - 93 + 13 ^ 3 + 126 - 31 + 75;
        AutoEat.llIIlllI[6] = 62 + 38 - -27 + 71 ^ 27 + 135 - 36 + 69;
        AutoEat.llIIlllI[7] = 0x3C ^ 0x34;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    @Provides
    AutoEatConfig d(ConfigManager configManager) {
        return (AutoEatConfig)configManager.getConfig(AutoEatConfig.class);
    }

    static {
        AutoEat.var9();
        AutoEat.var10();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public int ap() {
        return this.bD;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    protected void onStop() {
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static void var10() {
        llIIllIl = new String[llIIlllI[6]];
        AutoEat.llIIllIl[AutoEat.llIIlllI[1]] = "Eat";
        AutoEat.llIIllIl[AutoEat.llIIlllI[2]] = "Drink";
        AutoEat.llIIllIl[AutoEat.llIIlllI[3]] = "Prayer";
        AutoEat.llIIllIl[AutoEat.llIIlllI[4]] = "Super restore";
        AutoEat.llIIllIl[AutoEat.llIIlllI[5]] = "Eat";
    }

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }
}

