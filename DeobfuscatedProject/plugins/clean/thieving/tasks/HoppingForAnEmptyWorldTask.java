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
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
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
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum19;
import gg.squire.thieving.tasks.GameEnum31;

@TaskDesc(name="Hopping for an empty world", priority=4, blocking=true)
public class HoppingForAnEmptyWorldTask
extends Task {
    private final  SquireThieving O;

    private final  Predicate<NPC> P;
    private final  SquireThievingConfig N;

    @Inject
    public HoppingForAnEmptyWorldTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.P = nPC -> {
            int n2;
            if (n.lIllIIIIIlIllII(nPC.getName().contains(lIIllIlIIlllI[lIIllIlIIllll[9]]) ? 1 : 0) && n.lIllIIIIIlIllII(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[10]]) ? 1 : 0)) {
                n2 = lIIllIlIIllll[2];

                if (((0x6D ^ 0x4E ^ (0xA8 ^ 0x83)) & (0x7B ^ 0x25 ^ (0x7D ^ 0x2B) ^ -1)) != 0) {
                    return ((0x57 ^ 0x10 ^ (0xB0 ^ 0xB8)) & (0x31 ^ 0x72 ^ (0x40 ^ 0x4C) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        };
        this.N = squireThievingConfig;
        this.O = squireThieving;
    }

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIlllI = new String[lIIllIlIIllll[11]];
        n.lIIllIlIIlllI[n.lIIllIlIIllll[0]] = "Hopping to go back to saved world {}";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[2]] = "Housed NPCs: {}";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[3]] = "Hopping because there are {} NPCs in our house";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[4]] = "Hopping because player {} is in the area blackjacking!";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[5]] = "Rana the Dyer";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[6]] = "Villager";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[7]] = "Pick-up";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[8]] = "Dismiss";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[9]] = "Rana";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[10]] = "Villager";
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var2_2;
        World var1;
        n var2;
        if (n.lIllIIIIIlIllII(Shop.isOpen() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
        }
        int var3 = var2.O.e();
        if (n.lIllIIIIIllIIIl(Worlds.getCurrentId(), var3)) {
            var2.O.a(lIIllIlIIllll[1]);
            return lIIllIlIIllll[2];
        }
        if (n.lIllIIIIIlIllIl(var3, lIIllIlIIllll[1])) {
            var1 = Worlds.getFirst((int)var3);

            if (1 == 0) {
                return ((0x1A ^ 0x54 ^ (8 ^ 0x60)) & (0x30 ^ 0x6F ^ (0xD1 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            var1 = Worlds.getFirst(world -> {
                int n2;
                if (n.lIllIIIIIlIllII(world.isNormal() ? 1 : 0) && n.lIllIIIIIllIIIl(world.getLocation(), Worlds.getCurrentWorld().getLocation()) && n.lIllIIIIIlIllII(world.isMembers() ? 1 : 0) && n.lIllIIIIIlIlllI(world.getId(), Worlds.getCurrentId())) {
                    n2 = lIIllIlIIllll[2];

                    if (1 == 2) {
                        return ((0xAA ^ 0xA3 ^ (0xAE ^ 0x8E)) & (0x74 ^ 0x43 ^ (0x19 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIlIIllll[0];
                }
                return n2 != 0;
            });
        }
        if (n.lIllIIIIIllIIII(var1) && n.lIllIIIIIllIIII(var1 = Worlds.getFirst(world -> {
            int n2;
            if (n.lIllIIIIIlIllII(world.isNormal() ? 1 : 0) && n.lIllIIIIIlIllII(world.isMembers() ? 1 : 0) && n.lIllIIIIIllIIIl(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                n2 = lIIllIlIIllll[2];

                if (((0xF ^ 0x79 ^ (0x5B ^ 0x1D)) & (0xE6 ^ 0xBB ^ (0x26 ^ 0x4B) ^ -1)) > 3) {
                    return ((30 + 154 - 74 + 65 ^ 115 + 78 - 124 + 80) & (0x1C ^ 7 ^ (0x1D ^ 0x3C) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        }))) {
            return lIIllIlIIllll[0];
        }
        Worlds.hopTo((World)var2_2);
        return lIIllIlIIllll[2];
    }

    private static boolean lIllIIIIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIIIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIlIllIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        n.lIllIIIIIlIlIlI();
        n.lIllIIIIIlIlIIl();
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIIIIlIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIIIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIIllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        n var5;
        if (n.lIllIIIIIlIlIll((Object)this.N.method(), (Object)b.BLACK_JACK)) {
            return lIIllIlIIllll[0];
        }
        if (n.lIllIIIIIlIllII(var5.O.i() ? 1 : 0)) {
            return lIIllIlIIllll[0];
        }
        d var6 = var5.O.b();
        c var7 = var6.t();
        List var8 = NPCs.getAll(nPC -> {
            int n2;
            if (n.lIllIIIIIlIllII(var6.t().p().contains((Locatable)nPC) ? 1 : 0) && n.lIllIIIIIllIIll(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[5]]) ? 1 : 0) && n.lIllIIIIIllIIll(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlIIllll[2]];
                stringArray[n.lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[7]];
                if (n.lIllIIIIIllIIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIllIlIIllll[2]];
                    stringArray2[n.lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[8]];
                    if (n.lIllIIIIIllIIll(nPC.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lIIllIlIIllll[2];

                        if (((0x6F ^ 0x5C) & ~(0xA1 ^ 0x92)) >= ((0x1D ^ 0x2C) & ~(0x51 ^ 0x60))) return n2 != 0;
                        return false;
                    }
                }
            }
            n2 = lIIllIlIIllll[0];
            return n2 != 0;
        });
        if (n.lIllIIIIIlIllIl(var5.O.e(), lIIllIlIIllll[1]) && n.lIllIIIIIlIllIl(Worlds.getCurrentId(), var5.O.e())) {
            Object[] objectArray = new Object[lIIllIlIIllll[2]];
            objectArray[n.lIIllIlIIllll[0]] = var5.O.e();
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[0]], (Object[])objectArray);
            return var5.C();
        }
        if (n.lIllIIIIIlIlllI(var8.size(), lIIllIlIIllll[2])) {
            Object[] objectArray = new Object[lIIllIlIIllll[2]];
            objectArray[n.lIIllIlIIllll[0]] = var8;
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[2]], (Object[])objectArray);
            Object[] objectArray2 = new Object[lIIllIlIIllll[2]];
            objectArray2[n.lIIllIlIIllll[0]] = var8.size();
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[3]], (Object[])objectArray2);
            return var5.C();
        }
        if (n.lIllIIIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
            boolean bl;
            if (n.lIllIIIIIlIllll(Game.getState(), GameState.HOPPING)) {
                bl = lIIllIlIIllll[2];

                if ((0x11 ^ 0x30 ^ (0x9D ^ 0xB8)) < 0) {
                    return ((103 + 108 - 116 + 73 ^ 121 + 28 - 138 + 118) & (0x74 ^ 0x54 ^ (0xE ^ 7) ^ -1)) != 0;
                }
            } else {
                bl = lIIllIlIIllll[0];
            }
            return bl;
        }
        Player var9 = Players.getLocal();
        Player var10 = Players.getNearest(player2 -> {
            int n2;
            if (n.lIllIIIIIlIlIll(player2, var9) && n.lIllIIIIIlIllII(var7.p().contains((Locatable)player2) ? 1 : 0) && n.lIllIIIIIllIIlI(player2.getInteracting())) {
                n2 = lIIllIlIIllll[2];

                if (((0x31 ^ 0x14) & ~(0xBC ^ 0x99)) != ((0xCD ^ 0xC3) & ~(0x40 ^ 0x4E))) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        });
        if (n.lIllIIIIIllIIII(var10)) {
            return lIIllIlIIllll[0];
        }
        Object[] objectArray = new Object[lIIllIlIIllll[2]];
        objectArray[n.lIIllIlIIllll[0]] = var5_5.getName();
        Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[4]], (Object[])objectArray);
        return this.C();
    }

    private static boolean lIllIIIIIllIIII(Object object) {
        return object == null;
    }

}

