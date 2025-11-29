/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Entering room", register=true)
public class EnteringRoomTask
extends Task {
    private final  g ar;

    private  boolean as;

    @Inject
    public EnteringRoomTask(g g2) {
        this.ar = g2;
    }

    private static boolean lIlIlIllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIIlIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIllIIlIlll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (x.lIlIlIllIIlIIlI(chatMessage.getMessage().contains(lIIlIlIIIlIlI[lIIlIlIIIlIll[7]]) ? 1 : 0)) {
            this.as = lIIlIlIIIlIll[1];
        }
    }

    private static void lIlIlIllIIlIIII() {
        lIIlIlIIIlIlI = new String[lIIlIlIIIlIll[11]];
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[0]] = "Open (private)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[1]] = "Open (private)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[4]] = "Open";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[5]] = "Open (normal)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[6]] = "Climb-down";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[7]] = "There appears to be someone";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[8]] = "Big door";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[9]] = "Climb-down";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[10]] = "Rock";
    }

    static {
        x.lIlIlIllIIlIIIl();
        x.lIlIlIllIIlIIII();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean run() {
        void var1_1;
        x var2;
        if (x.lIlIlIllIIlIIlI(this.ar.m() ? 1 : 0)) {
            return lIIlIlIIIlIll[0];
        }
        if (x.lIlIlIllIIlIIll(var2.ar.q(), var2.ar.r())) {
            return lIIlIlIIIlIll[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIlIlIIIlIll[1]];
            stringArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[9]];
            if (x.lIlIlIllIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIllIIlIIlI(tileObject.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[10]]) ? 1 : 0) && x.lIlIlIllIIllIII(tileObject.getPlane(), Static.getClient().getPlane()) && x.lIlIlIllIIlIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lIIlIlIIIlIll[1];

                if (3 <= 0) {
                    return false;
                }
            } else {
                n2 = lIIlIlIIIlIll[0];
            }
            return n2 != 0;
        });
        if (x.lIlIlIllIIlIlII(var3)) {
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (x.lIlIlIllIIlIIlI(tileObject.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[8]]) ? 1 : 0) && x.lIlIlIllIIlIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && x.lIlIlIllIIllIII(tileObject.getPlane(), Static.getClient().getPlane())) {
                    n2 = lIIlIlIIIlIll[1];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIIlIll[0];
                }
                return n2 != 0;
            });
            if (!x.lIlIlIllIIlIlIl(var4)) return lIIlIlIIIlIll[0];
            if (x.lIlIlIllIIlIIlI(var2.V() ? 1 : 0)) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (x.lIlIlIllIIlIIlI(world.isNormal() ? 1 : 0) && x.lIlIlIllIIlIIlI(world.isMembers() ? 1 : 0)) {
                        n2 = lIIlIlIIIlIll[1];

                        }
                    } else {
                        n2 = lIIlIlIIIlIll[0];
                    }
                    return n2 != 0;
                }));
                var2.as = lIIlIlIIIlIll[0];
                return lIIlIlIIIlIll[1];
            }
            String[] stringArray = new String[lIIlIlIIIlIll[1]];
            stringArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[0]];
            if (x.lIlIlIllIIlIIlI(var4.hasAction(stringArray) ? 1 : 0)) {
                int[] nArray = new int[lIIlIlIIIlIll[1]];
                nArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIll[2];
                if (x.lIlIlIllIIlIllI(Inventory.getCount((boolean)lIIlIlIIIlIll[1], (int[])nArray), lIIlIlIIIlIll[3])) {
                    var4.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[1]]);

                    if (((85 + 37 - 56 + 83 ^ 129 + 20 - 116 + 124) & (0x1B ^ 0x7D ^ (0x3D ^ 0x53) ^ -1)) > -1) return lIIlIlIIIlIll[1];
                    return ((0x29 ^ 0x63 ^ (0x4D ^ 2)) & (0x51 ^ 0x39 ^ (0x6D ^ 0) ^ -1)) != 0;
                }
            }
            String[] stringArray2 = new String[lIIlIlIIIlIll[4]];
            stringArray2[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[4]];
            stringArray2[x.lIIlIlIIIlIll[1]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[5]];
            var4.interact(stringArray2);
            return lIIlIlIIIlIll[1];
        }
        var1_1.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[6]]);
        return lIIlIlIIIlIll[1];
    }

    private static boolean lIlIlIllIIlIIlI(int n2) {
        return n2 != 0;
    }

    private boolean V() {
        boolean bl;
        if (!x.lIlIlIllIIlIlll(this.as ? 1 : 0) || x.lIlIlIllIIlIlll(Players.getAll(player -> this.ar.a(player.getWorldLocation())).isEmpty() ? 1 : 0)) {
            bl = lIIlIlIIIlIll[1];

            if ((105 + 136 - 131 + 41 ^ 76 + 10 - 53 + 113) == 0) {
                return ((0x4F ^ 0x34 ^ (0x68 ^ 0x58)) & (0xDB ^ 0xAF ^ (0xBC ^ 0x83) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIlIIIlIll[0];
        }
        return bl;
    }
}

