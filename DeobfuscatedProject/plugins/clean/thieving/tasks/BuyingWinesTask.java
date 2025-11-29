/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum19;
import gg.squire.thieving.tasks.BlackjackingTask;

@TaskDesc(name="Buying wines", priority=6, blocking=true)
public class BuyingWinesTask
extends Task {
    private static final  WorldArea G;

    private static final  int H;
    private static final  WorldPoint F;
    private final  SquireThievingConfig I;
    private  boolean K;
    private final  SquireThieving J;

    private static boolean lIllIIIlIlIlIIl(Object object) {
        return object != null;
    }

    private static void lIllIIIlIlIIlII() {
        lIIllIllIIlll = new String[lIIllIllIlIII[19]];
        l.lIIllIllIIlll[l.lIIllIllIlIII[0]] = "Closing our curtain to keep the guy inside:P";
        l.lIIllIllIIlll[l.lIIllIllIlIII[1]] = "Couldn't find a house for the current location";
        l.lIIllIllIIlll[l.lIIllIllIlIII[5]] = "Couldn't find an NPC to lure. (Trying to leave house)";
        l.lIIllIllIIlll[l.lIIllIllIlIII[6]] = "Lure";
        l.lIIllIllIIlll[l.lIIllIllIlIII[7]] = "Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[4]] = "Talk-to";
        l.lIIllIllIIlll[l.lIIllIllIlIII[9]] = "Walking to the barman";
        l.lIIllIllIIlll[l.lIIllIllIlIII[10]] = "Trading bar guy";
        l.lIIllIllIIlll[l.lIIllIllIlIII[11]] = "Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[12]] = "Lure";
        l.lIIllIllIIlll[l.lIIllIllIlIII[13]] = "Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[14]] = "Talk-to";
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIIlIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIlIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public BuyingWinesTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.I = squireThievingConfig;
        this.J = squireThieving;
    }

    private static boolean lIllIIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var2;
        l var3;
        if (!l.lIllIIIlIlIIllI(Game.getState(), GameState.LOGGED_IN) || !l.lIllIIIlIlIIllI((Object)this.I.method(), (Object)b.BLACK_JACK) || l.lIllIIIlIlIIlll(this.I.buyWines() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        int var4 = Inventory.getCount(item -> item.hasAction(k.z));
        if (l.lIllIIIlIlIIlll(var4)) {
            var3.J.a(lIIllIllIlIII[1]);

            if (2 != 2) {
                return ((139 + 34 - -23 + 0 ^ 14 + 76 - 82 + 147) & (0xB1 ^ 0xB7 ^ (0xA ^ 0x53) ^ -1)) != 0;
            }
        } else if (l.lIllIIIlIlIIlll(Inventory.getFreeSlots())) {
            var3.J.a(lIIllIllIlIII[0]);
        }
        if (l.lIllIIIlIlIIlll(var3.J.i() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        if (l.lIllIIIlIlIlIII(Shop.isOpen() ? 1 : 0)) {
            if (l.lIllIIIlIlIIlll(Shop.getStock((int)lIIllIllIlIII[2]))) {
                var3.K = lIIllIllIlIII[1];
                Keyboard.type((char)lIIllIllIlIII[3]);
                return lIIllIllIlIII[1];
            }
            Shop.buyFifty((int)lIIllIllIlIII[2]);
            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIlIII(var3.K ? 1 : 0)) {
            int var5 = Worlds.getCurrentId();
            World var6 = Worlds.getRandom(world -> {
                int n3;
                if (l.lIllIIIlIlIlIII(world.isNormal() ? 1 : 0) && l.lIllIIIlIlIlIII(world.isMembers() ? 1 : 0) && l.lIllIIIlIlIllII(world.getId(), var5)) {
                    n3 = lIIllIllIlIII[1];

                    if ((0x3E ^ 0x3A) == -1) {
                        return false;
                    }
                } else {
                    n3 = lIIllIllIlIII[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var6);
            var3.K = lIIllIllIlIII[0];
            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIIlll(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return lIIllIllIlIII[1];
        }
        Player var5 = Players.getLocal();
        WorldPoint var6 = var5.getWorldLocation();
        c var7 = var3.J.b().t();
        TileObject var8 = var3.J.a(var7, lIIllIllIlIII[0]);
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIlIII[1]];
        worldAreaArray[l.lIIllIllIlIII[0]] = var7.p();
        if (l.lIllIIIlIlIIlll(var6.isInArea(worldAreaArray) ? 1 : 0) && l.lIllIIIlIlIlIIl(var8) && l.lIllIIIlIlIlIlI(var8.distanceTo((Locatable)var5), lIIllIllIlIII[4])) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[0]]);
            var3.J.a(var5, lIIllIllIlIII[0]);

            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        c var9 = c.b(var5.getWorldLocation());
        if (l.lIllIIIlIlIlIll((Object)var9)) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[1]]);
            var9 = var3.J.b().t();
        }
        c var10 = var9;
        if (l.lIllIIIlIlIlIII(var9.p().contains((Locatable)var5) ? 1 : 0)) {
            var2 = var3.J.a(var9, lIIllIllIlIII[1]);
            if (l.lIllIIIlIlIlIIl(var2)) {
                return var3.J.a(var5, lIIllIllIlIII[1]);
            }
            NPC var11 = NPCs.getNearest(nPC -> {
                int n2;
                block2: {
                    block3: {
                        if (!l.lIllIIIlIlIlIIl(nPC)) break block2;
                        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIlIII[1]];
                        worldAreaArray[l.lIIllIllIlIII[0]] = var10.p();
                        if (!l.lIllIIIlIlIIlll(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[lIIllIllIlIII[1]];
                        stringArray[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[12]];
                        if (!l.lIllIIIlIlIIlll(nPC.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIIllIllIlIII[1]];
                        stringArray2[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[13]];
                        if (!l.lIllIIIlIlIIlll(nPC.hasAction(stringArray2) ? 1 : 0)) break block3;
                        String[] stringArray3 = new String[lIIllIllIlIII[1]];
                        stringArray3[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[14]];
                        if (!l.lIllIIIlIlIlIII(nPC.hasAction(stringArray3) ? 1 : 0)) break block2;
                    }
                    n2 = lIIllIllIlIII[1];

                    if ((0x48 ^ 0x72 ^ (0x68 ^ 0x56)) > -1) return n2 != 0;
                    return false;
                }
                n2 = lIIllIllIlIII[0];
                return n2 != 0;
            });
            if (l.lIllIIIlIlIlIll(var11)) {
                Log.info((String)lIIllIllIIlll[lIIllIllIlIII[5]]);
                return lIIllIllIlIII[0];
            }
            String[] stringArray = new String[lIIllIllIlIII[6]];
            stringArray[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[6]];
            stringArray[l.lIIllIllIlIII[1]] = lIIllIllIIlll[lIIllIllIlIII[7]];
            stringArray[l.lIIllIllIlIII[5]] = lIIllIllIIlll[lIIllIllIlIII[4]];
            var11.interact(stringArray);
        }
        int[] nArray = new int[lIIllIllIlIII[1]];
        nArray[l.lIIllIllIlIII[0]] = lIIllIllIlIII[8];
        var2 = NPCs.getNearest((int[])nArray);
        if (l.lIllIIIlIlIlIll(var2)) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[9]]);
            Movement.walkTo((WorldPoint)G.getRandom(), (boolean)lIIllIllIlIII[0]);

            if (((139 + 57 - 105 + 154 ^ 22 + 68 - -7 + 87) & (0xE4 ^ 0x9F ^ (0xA4 ^ 0x92) ^ -1)) >= 2) {
                return ((0x4A ^ 0x5A ^ (0xE3 ^ 0xBC)) & (54 + 224 - 256 + 218 ^ 156 + 96 - 77 + 16 ^ -1)) != 0;
            }
        } else {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[10]]);
            var2.interact(lIIllIllIIlll[lIIllIllIlIII[11]]);
        }
        return lIIllIllIlIII[1];
    }

    private static boolean lIllIIIlIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        l.lIllIIIlIlIIlIl();
        l.lIllIIIlIlIIlII();
        H = lIIllIllIlIII[8];
        F = new WorldPoint(lIIllIllIlIII[15], lIIllIllIlIII[16], lIIllIllIlIII[0]);
        G = new WorldArea(lIIllIllIlIII[17], lIIllIllIlIII[18], lIIllIllIlIII[14], lIIllIllIlIII[10], lIIllIllIlIII[0]);
    }

    private static boolean lIllIIIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }
}

