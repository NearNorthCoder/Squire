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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    @Inject
     ClientThread bB;
    @Inject
     AutoEatConfig bF;
    @Inject
     ConfigManager bA;
    private  int bD;
     WorldPoint bC;

    protected Class<?>[] tasks() {
        return new Class[llIIlllI[1]];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int n2;
        Item llIlIllllIIllIl;
        AutoEat llIlIllllIIlllI;
        Item item2;
        if (AutoEat.lIlllIIIII(this.bF.eatHP(), Combat.getCurrentHealth()) && AutoEat.lIlllIIIIl(item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIIlllI[2]];
            stringArray[AutoEat.llIIlllI[1]] = llIIllIl[llIIlllI[5]];
            return item.hasAction(stringArray);
        }))) {
            item2.interact(llIIllIl[llIIlllI[1]]);
            Time.sleep((long)1L);

        }
        if (AutoEat.lIlllIIIII(llIlIllllIIlllI.bF.drinkPrayAt(), Prayers.getPoints()) && AutoEat.lIlllIIIIl(llIlIllllIIllIl = Inventory.getFirst(item -> {
            int n2;
            if (!AutoEat.lIlllIIlIl(item.getName().contains(llIIllIl[llIIlllI[3]]) ? 1 : 0) || AutoEat.lIlllIIIll(item.getName().contains(llIIllIl[llIIlllI[4]]) ? 1 : 0)) {
                n2 = llIIlllI[2];

                if (1 == 0) {
                    return ((0x6E ^ 0x43 ^ (0xE ^ 0x3A)) & (0x74 ^ 0x45 ^ (0x63 ^ 0x4B) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlllI[1];
            }
            return n2 != 0;
        }))) {
            llIlIllllIIllIl.interact(llIIllIl[llIIlllI[2]]);
        }
        if (!AutoEat.lIlllIIIlI(Players.getLocal().getInteracting()) || AutoEat.lIlllIIIIl(NPCs.getNearest(nPC -> {
            boolean bl2;
            if (AutoEat.lIlllIIlII(nPC.getInteracting(), Players.getLocal())) {
                bl2 = llIIlllI[2];

                if (-((0x3A ^ 0x6A) & ~(0x1C ^ 0x4C) ^ (0x3B ^ 0x3F)) >= 0) {
                    return ((106 + 10 - 7 + 22 ^ 181 + 152 - 313 + 177) & (0x8B ^ 0xBC ^ (0x10 ^ 0x61) ^ -1) & ((0x5C ^ 0x40 ^ (7 ^ 0x31)) & (83 + 54 - 50 + 58 ^ 20 + 83 - 77 + 161 ^ -1) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlllI[1];
            }
            return bl2;
        }))) {
            n2 = llIIlllI[2];

            if (3 <= 0) {
                return;
            }
        } else {
            n2 = llIlIllllIIllIl = llIIlllI[1];
        }
        if (AutoEat.lIlllIIIll(llIlIllllIIlllI.bF.drinkBoostPotions() ? 1 : 0) && AutoEat.lIlllIIIll(llIlIllllIIllIl)) {
            Combat.drinkBoostingPotion((int)llIlIllllIIlllI.bF.boostAtPercentage());

        }
    }

    public AutoEat() {
        this.bD = llIIlllI[0];
    }

    private static boolean lIlllIIIIl(Object object) {
        return object != null;
    }

    protected void onStart() {
    }

    private static boolean lIlllIIlIl(int n2) {
        return n2 == 0;
    }

    @Provides
    AutoEatConfig d(ConfigManager configManager) {
        return (AutoEatConfig)configManager.getConfig(AutoEatConfig.class);
    }

    static {
        AutoEat.lIllIlllll();
        AutoEat.lIllIllllI();
    }

    public int ap() {
        return this.bD;
    }

    private static boolean lIlllIIIlI(Object object) {
        return object == null;
    }

    protected void onStop() {
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean lIlllIIlII(Object object, Object object2) {
        return object != object2;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static void lIllIllllI() {
        llIIllIl = new String[llIIlllI[6]];
        AutoEat.llIIllIl[AutoEat.llIIlllI[1]] = "Eat";
        AutoEat.llIIllIl[AutoEat.llIIlllI[2]] = "Drink";
        AutoEat.llIIllIl[AutoEat.llIIlllI[3]] = "Prayer";
        AutoEat.llIIllIl[AutoEat.llIIlllI[4]] = "Super restore";
        AutoEat.llIIllIl[AutoEat.llIIlllI[5]] = "Eat";
    }

    private static boolean lIlllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIll(int n2) {
        return n2 != 0;
    }
}

