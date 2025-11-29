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
import gg.squire.basics.combat.RingOfLife.GameEnum61;
import gg.squire.basics.combat.RingOfLife.GameEnum36;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        void llllIIIIIlllIII;
        RingOfLife llllIIIIIlllIIl;
        Player player = Players.getLocal();
        if (RingOfLife.lIIlIlIIl(player)) {
            return;
        }
        if (RingOfLife.lIIlIlIlI(Combat.getCurrentHealth(), llllIIIIIlllIIl.ce.teleHP())) {
            llllIIIIIlllIIl.cf = lIIlIlI[0];
        }
        if (RingOfLife.lIIlIlIll(llllIIIIIlllIIl.cf ? 1 : 0) && RingOfLife.lIIlIlIll(llllIIIIIlllIIl.ce.logOutOnTrigger() ? 1 : 0)) {
            Log.info((String)lIIIIlI[lIIlIlI[0]]);
            Squire.stop();
        }
        WorldPoint llllIIIIIllIlll = llllIIIIIlllIII.getWorldLocation();
        if (RingOfLife.lIIlIllII(Combat.getCurrentHealth(), llllIIIIIlllIIl.ce.teleHP()) && RingOfLife.lIIlIllIl(llllIIIIIlllIIl.cf ? 1 : 0)) {
            llllIIIIIlllIIl.cg = lIIlIlI[1];
            llllIIIIIlllIIl.bw = llllIIIIIllIlll;
            if (RingOfLife.lIIlIlllI((Object)llllIIIIIlllIIl.ce.teleportType(), (Object)I.SPELL) && RingOfLife.lIIlIlIll(Magic.canCast((Spell)llllIIIIIlllIIl.ce.teleportSpell().getSpell()) ? 1 : 0)) {
                Magic.cast((Spell)llllIIIIIlllIIl.ce.teleportSpell().getSpell());

                if (2 > (0x7D ^ 0x79)) {
                    return;
                }
            } else if (!RingOfLife.lIIlIllIl(Inventory.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0) || RingOfLife.lIIlIlIll(Equipment.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0)) {
                if (RingOfLife.lIIlIlIll(llllIIIIIlllIIl.ce.teleportItem().aw() ? 1 : 0) && RingOfLife.lIIlIllIl(Equipment.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0) && RingOfLife.lIIlIlIll(Inventory.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIlI[2]];
                    stringArray[RingOfLife.lIIlIlI[0]] = lIIIIlI[lIIlIlI[1]];
                    stringArray[RingOfLife.lIIlIlI[1]] = lIIIIlI[lIIlIlI[3]];
                    stringArray[RingOfLife.lIIlIlI[3]] = lIIIIlI[lIIlIlI[2]];
                    Inventory.getFirst((int[])llllIIIIIlllIIl.ce.teleportItem().av()).interact(stringArray);
                }
                if (RingOfLife.lIIlIlIll(Equipment.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0)) {
                    Equipment.getFirst((int[])llllIIIIIlllIIl.ce.teleportItem().av()).interact(llllIIIIIlllIIl.ce.teleportItem().au());
                }
                if (RingOfLife.lIIlIlIll(Inventory.contains((int[])llllIIIIIlllIIl.ce.teleportItem().av()) ? 1 : 0)) {
                    Inventory.getFirst((int[])llllIIIIIlllIIl.ce.teleportItem().av()).interact(llllIIIIIlllIIl.ce.teleportItem().au());

                }
            } else {
                H[] llllIIIIIllIllI = H.values();
                int llllIIIIIllIlIl = llllIIIIIllIllI.length;
                int llllIIIIIllIlII = lIIlIlI[0];
                while (RingOfLife.lIIlIllll(llllIIIIIllIlII, llllIIIIIllIlIl)) {
                    H llllIIIIIllIIll = llllIIIIIllIllI[llllIIIIIllIlII];
                    if (!RingOfLife.lIIlIllIl(Equipment.contains((int[])llllIIIIIllIIll.av()) ? 1 : 0) || RingOfLife.lIIlIlIll(Inventory.contains((int[])llllIIIIIllIIll.av()) ? 1 : 0)) {
                        if (RingOfLife.lIIlIlIll(Equipment.contains((int[])llllIIIIIllIIll.av()) ? 1 : 0)) {
                            Equipment.getFirst((int[])llllIIIIIllIIll.av()).interact(llllIIIIIllIIll.au());

                            if ((0xDA ^ 0xBD ^ (0xED ^ 0x8E)) >= 3) break;
                            return;
                        }
                        Inventory.getFirst((int[])llllIIIIIllIIll.av()).interact(llllIIIIIllIIll.au());
                        Log.info((String)lIIIIlI[lIIlIlI[4]]);

                        if ((0xE2 ^ 0x95 ^ (2 ^ 0x71)) > ((14 + 21 - -63 + 53 ^ 131 + 118 - 167 + 105) & (169 + 14 - 110 + 100 ^ 93 + 58 - 64 + 42 ^ -1))) break;
                        return;
                    }
                    ++llllIIIIIllIlII;

                    return;
                }
            }
        }
        if (RingOfLife.lIIllIIII(llllIIIIIlllIIl.bw) && RingOfLife.lIIllIIIl(llllIIIIIllIlll.getRegionID(), llllIIIIIlllIIl.bw.getRegionID()) && RingOfLife.lIIlIlIll(llllIIIIIlllIIl.cg ? 1 : 0)) {
            llllIIIIIlllIIl.cf = lIIlIlI[1];
            llllIIIIIlllIIl.cg = lIIlIlI[0];
            llllIIIIIlllIIl.bw = llllIIIIIllIlll;
        }
    }

    private static boolean lIIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Subscribe
    public void b(GameStateChanged gameStateChanged) {
        RingOfLife llllIIIIIllIIII;
        if (RingOfLife.lIIllIIlI(gameStateChanged.getGameState(), GameState.LOADING)) {
            return;
        }
        if (RingOfLife.lIIlIlIll(llllIIIIIllIIII.cg ? 1 : 0)) {
            llllIIIIIllIIII.cg = lIIlIlI[0];
            llllIIIIIllIIII.cf = lIIlIlI[1];
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

        return String.valueOf(llllIIIIIlIIIlI);
    }

    private static boolean lIIllIIlI(Object object, Object object2) {
        return object != object2;
    }

    protected void onStop() {
    }

    private static boolean lIIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIIII(Object object) {
        return object != null;
    }

    protected void onStart() {
    }

    static {
        RingOfLife.lIIlIlIII();
        RingOfLife.lIIIlIIIl();
    }
}

