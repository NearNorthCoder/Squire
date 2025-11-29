/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameState
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 */
package gg.squire.basics.combat.RingOfLife;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.combat.RingOfLife.RingOfLifeConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.basics.combat.RingOfLife.GameEnum11;
import gg.squire.basics.combat.RingOfLife.GameEnum7;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;

@PluginDescriptor(name="Squire Ring Of Life", description="Auto teleports at hp", enabledByDefault=false)
@SquireUtil
public class RingOfLife
extends SquirePlugin {
    private  boolean cg;
    private  WorldPoint bw;
    private  boolean cf;
    @Inject
     RingOfLifeConfig ce;
    private static  String[] lIIIIlI;
    private static  int[] lIIlIlI;

    private static boolean lIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIIIl() {
        lIIIIlI = new String[lIIlIlI[5]];
        RingOfLife.lIIIIlI[RingOfLife.lIIlIlI[0]] = "Stopping all Squire Plugins as we got Ring of Lifed.";
        RingOfLife.lIIIIlI[RingOfLife.lIIlIlI[1]] = "Wear";
        RingOfLife.lIIIIlI[RingOfLife.lIIlIlI[3]] = "Equip";
        RingOfLife.lIIIIlI[RingOfLife.lIIlIlI[2]] = "Wield";
        RingOfLife.lIIIIlI[RingOfLife.lIIlIlI[4]] = "[Squire RoL] Just saved your life from a misconfiguration, stay safe!";
    }

    private static boolean lIIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIllII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var1;
        RingOfLife var2;
        Player player = Players.getLocal();
        if (RingOfLife.lIIlIlIIl(player)) {
            return;
        }
        if (RingOfLife.lIIlIlIlI(Combat.getCurrentHealth(), var2.ce.teleHP())) {
            var2.cf = lIIlIlI[0];
        }
        if (RingOfLife.lIIlIlIll(var2.cf) && RingOfLife.lIIlIlIll(var2.ce.logOutOnTrigger() ? 1 : 0)) {
            Log.info((String)lIIIIlI[lIIlIlI[0]]);
            Squire.stop();
        }
        WorldPoint var3 = var1.getWorldLocation();
        if (RingOfLife.lIIlIllII(Combat.getCurrentHealth(), var2.ce.teleHP()) && RingOfLife.lIIlIllIl(var2.cf)) {
            var2.cg = lIIlIlI[1];
            var2.bw = var3;
            if (RingOfLife.lIIlIlllI((Object)var2.ce.teleportType(), (Object)I.SPELL) && RingOfLife.lIIlIlIll(Magic.canCast((Spevar2.ce.teleportSpell().getSpell()) ? 1 : 0)) {
                Magic.cast((Spevar2.ce.teleportSpell().getSpell());
                0;
                if (2 > (0x7D ^ 0x79)) {
                    return;
                }
            } else if (!RingOfLife.lIIlIllIl(Inventory.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0) || RingOfLife.lIIlIlIll(Equipment.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0)) {
                if (RingOfLife.lIIlIlIll(var2.ce.teleportItem().aw() ? 1 : 0) && RingOfLife.lIIlIllIl(Equipment.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0) && RingOfLife.lIIlIlIll(Inventory.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlI[2]];
                    stringArray[RingOfLife.lIIlIlI[0]] = lIIIIlI[lIIlIlI[1]];
                    stringArray[RingOfLife.lIIlIlI[1]] = lIIIIlI[lIIlIlI[3]];
                    stringArray[RingOfLife.lIIlIlI[3]] = lIIIIlI[lIIlIlI[2]];
                    Inventory.getFirst((int[])var2.ce.teleportItem().av()).interact(stringArray);
                }
                if (RingOfLife.lIIlIlIll(Equipment.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0)) {
                    Equipment.getFirst((int[])var2.ce.teleportItem().av()).interact(var2.ce.teleportItem().au());
                }
                if (RingOfLife.lIIlIlIll(Inventory.contains((int[])var2.ce.teleportItem().av()) ? 1 : 0)) {
                    Inventory.getFirst((int[])var2.ce.teleportItem().av()).interact(var2.ce.teleportItem().au());
                    0;
                    if (-1 >= 0) {
                        return;
                    }
                }
            } else {
                H[] var4 = H.values();
                int var5 = var4.length;
                int var6 = lIIlIlI[0];
                while (RingOfLife.lIIlIllll(var6, var5)) {
                    H var7 = var4[var6];
                    if (!RingOfLife.lIIlIllIl(Equipment.contains((int[])var7.av()) ? 1 : 0) || RingOfLife.lIIlIlIll(Inventory.contains((int[])var7.av()) ? 1 : 0)) {
                        if (RingOfLife.lIIlIlIll(Equipment.contains((int[])var7.av()) ? 1 : 0)) {
                            Equipment.getFirst((int[])var7.av()).interact(var7.au());
                            0;
                            if ((0xDA ^ 0xBD ^ (0xED ^ 0x8E)) >= 3) break;
                            return;
                        }
                        Inventory.getFirst((int[])var7.av()).interact(var7.au());
                        Log.info((String)lIIIIlI[lIIlIlI[4]]);
                        0;
                        if ((0xE2 ^ 0x95 ^ (2 ^ 0x71)) > ((14 + 21 - -63 + 53 ^ 131 + 118 - 167 + 105) & (169 + 14 - 110 + 100 ^ 93 + 58 - 64 + 42 ^ -1))) break;
                        return;
                    }
                    ++var6;
                    0;
                    if null == null continue;
                    return;
                }
            }
        }
        if (RingOfLife.lIIllIIII(var2.bw) && RingOfLife.lIIllIIIl(var3.getRegionID(), var2.bw.getRegionID()) && RingOfLife.lIIlIlIll(var2.cg)) {
            var2.cf = lIIlIlI[1];
            var2.cg = lIIlIlI[0];
            var2.bw = var3;
        }
    }

    private static boolean lIIlIlllI(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIII() {
        lIIlIlI = new int[7];
        RingOfLife.lIIlIlI[0] = (0x33 ^ 0x41 ^ (0x84 ^ 0xAF)) & (202 + 16 - 189 + 180 ^ 66 + 107 - 117 + 80 ^ -1);
        RingOfLife.lIIlIlI[1] = 1;
        RingOfLife.lIIlIlI[2] = 3;
        RingOfLife.lIIlIlI[3] = 2;
        RingOfLife.lIIlIlI[4] = 0x4F ^ 0x4B;
        RingOfLife.lIIlIlI[5] = 0x2E ^ 7 ^ (0x5E ^ 0x72);
        RingOfLife.lIIlIlI[6] = 0x10 ^ 7 ^ (0x65 ^ 0x7A);
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        RingOfLife var13;
        if (RingOfLife.lIIllIIlI(gameStateChanged.getGameState(), GameState.LOADING)) {
            return;
        }
        if (RingOfLife.lIIlIlIll(var13.cg)) {
            var13.cg = lIIlIlI[0];
            var13.cf = lIIlIlI[1];
        }
    }

    @Provides
    RingOfLifeConfig f(ConfigManager configManager) {
        return (RingOfLifeConfig)configManager.getConfig(RingOfLifeConfig.class);
    }

    private static boolean lIIlIllIl(int n2) {
        return n2 == 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIIlIlI[0]];
    }

    private static String lIIIIIIll(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = lIIlIlI[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = lIIlIlI[0];
        while (RingOfLife.lIIlIllll(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean lIIllIIlI(Object object, Object object2) {
        return object != object2;
    }

    protected void onStop() {
    }

    private static boolean lIIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIIII(Object object) {
        return object != null;
    }

    protected void onStart() {
    }

}

