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

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (x.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0x14 ^ 0x53 ^ (0x25 ^ 0x53)) & (0x12 ^ 0x7D ^ (0x43 ^ 0x1D) ^ -1)) < 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (x.var25(chatMessage.getMessage().contains(var1[var2[7]]) ? 1 : 0)) {
            this.as = var2[1];
        }
    }

    private static void var26() {
        var1 = new String[var2[11]];
        x.var1[x.var2[0]] = "Open (private)";
        x.var1[x.var2[1]] = "Open (private)";
        x.var1[x.var2[4]] = "Open";
        x.var1[x.var2[5]] = "Open (normal)";
        x.var1[x.var2[6]] = "Climb-down";
        x.var1[x.var2[7]] = "There appears to be someone";
        x.var1[x.var2[8]] = "Big door";
        x.var1[x.var2[9]] = "Climb-down";
        x.var1[x.var2[10]] = "Rock";
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    static {
        x.var33();
        x.var26();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean run() {
        void var1_1;
        x var34;
        if (x.var25(this.ar.m() ? 1 : 0)) {
            return var2[0];
        }
        if (x.var21(var34.ar.q(), var34.ar.r())) {
            return var2[0];
        }
        TileObject var35 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[var2[1]];
            stringArray[x.var2[0]] = var1[var2[9]];
            if (x.var25(tileObject.hasAction(stringArray) ? 1 : 0) && x.var25(tileObject.getName().equals(var1[var2[10]]) ? 1 : 0) && x.var11(tileObject.getPlane(), Static.getClient().getPlane()) && x.var25(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (3 <= 0) {
                    return ((0x2A ^ 0x39) & ~(0x94 ^ 0x87)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (x.var4(var35)) {
            TileObject var36 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (x.var25(tileObject.getName().equals(var1[var2[8]]) ? 1 : 0) && x.var25(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && x.var11(tileObject.getPlane(), Static.getClient().getPlane())) {
                    n2 = var2[1];
                    0;
                    if (2 <= 0) {
                        return ((0x6A ^ 0x51) & ~(0x8A ^ 0xB1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
            if (!x.var3(var36)) return var2[0];
            if (x.var25(var34.V() ? 1 : 0)) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (x.var25(world.isNormal() ? 1 : 0) && x.var25(world.isMembers() ? 1 : 0)) {
                        n2 = var2[1];
                        0;
                        if null != null {
                            return ((0x49 ^ 0x14 ^ (0x16 ^ 0x4F)) & (174 + 72 - 125 + 73 ^ 187 + 87 - 217 + 141 ^ -1)) != 0;
                        }
                    } else {
                        n2 = var2[0];
                    }
                    return n2 != 0;
                }));
                var34.as = var2[0];
                return var2[1];
            }
            String[] stringArray = new String[var2[1]];
            stringArray[x.var2[0]] = var1[var2[0]];
            if (x.var25(var36.hasAction(stringArray) ? 1 : 0)) {
                int[] nArray = new int[var2[1]];
                nArray[x.var2[0]] = var2[2];
                if (x.var23(Inventory.getCount((boolean)var2[1], (int[])nArray), var2[3])) {
                    var36.interact(var1[var2[1]]);
                    0;
                    if (((85 + 37 - 56 + 83 ^ 129 + 20 - 116 + 124) & (0x1B ^ 0x7D ^ (0x3D ^ 0x53) ^ -1)) > -1) return var2[1];
                    return ((0x29 ^ 0x63 ^ (0x4D ^ 2)) & (0x51 ^ 0x39 ^ (0x6D ^ 0) ^ -1)) != 0;
                }
            }
            String[] stringArray2 = new String[var2[4]];
            stringArray2[x.var2[0]] = var1[var2[4]];
            stringArray2[x.var2[1]] = var1[var2[5]];
            var36.interact(stringArray2);
            return var2[1];
        }
        var1_1.interact(var1[var2[6]]);
        return var2[1];
    }

    private static void var33() {
        var2 = new int[12];
        x.var2[0] = (0x9C ^ 0xC7) & ~(0xD6 ^ 0x8D);
        x.var2[1] = 1;
        x.var2[2] = 0xFFFF87EF & 0x7BF3;
        x.var2[3] = -(0xFFFFF66F & 0x199F) & (0xFFFFDBFE & 0x27DFF);
        x.var2[4] = 2;
        x.var2[5] = 3;
        x.var2[6] = 0x79 ^ 0x58 ^ (0x1A ^ 0x3F);
        x.var2[7] = 0x26 ^ 0x23;
        x.var2[8] = 0x99 ^ 0x9F;
        x.var2[9] = 0x20 ^ 3 ^ (0x11 ^ 0x35);
        x.var2[10] = 0x3D ^ 0x29 ^ (0 ^ 0x1C);
        x.var2[11] = 0x5B ^ 0x5C ^ (0x69 ^ 0x67);
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

    private boolean V() {
        boolean bl;
        if (!x.var24(this.as) || x.var24(Players.getAll(player -> this.ar.a(player.getWorldLocation())).isEmpty() ? 1 : 0)) {
            bl = var2[1];
            0;
            if ((105 + 136 - 131 + 41 ^ 76 + 10 - 53 + 113) == 0) {
                return ((0x4F ^ 0x34 ^ (0x68 ^ 0x58)) & (0xDB ^ 0xAF ^ (0xBC ^ 0x83) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }
}

