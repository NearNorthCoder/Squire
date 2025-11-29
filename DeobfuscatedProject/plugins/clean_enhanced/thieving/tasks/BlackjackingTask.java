/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.OverheadTextChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum2;
import gg.squire.thieving.tasks.GameEnum4;

@Singleton
@TaskDesc(name="Blackjacking", register=true, priority=1)
public class BlackjackingTask
extends Task {
    public static final  Predicate<String> z;
    private final  SquireThievingConfig C;
    private final  HashMap<Integer, Boolean> A;
    private  int D;
    private final  SquireThieving B;

    private  int E;

    private static void var3() {
        var1 = new String[var2[14]];
        k.var1[k.var2[0]] = "Coin pouch";
        k.var1[k.var2[1]] = "Drop";
        k.var1[k.var2[3]] = "Knock-Out";
        k.var1[k.var2[5]] = "Climb-up";
        k.var1[k.var2[6]] = "Pickpocket";
        k.var1[k.var2[2]] = "You fail to pick";
        k.var1[k.var2[7]] = "You pick the";
        k.var1[k.var2[9]] = "Zzzz";
        k.var1[k.var2[10]] = "my head";
        k.var1[k.var2[11]] = "kill you";
        k.var1[k.var2[12]] = "Eat";
        k.var1[k.var2[13]] = "Drink";
    }

    private boolean a(NPC nPC, Item item) {
        if (k.var4(Combat.getCurrentHealth(), this.C.eatHP())) {
            item.interact(z);
        }
        nPC.interact(var1[var2[3]]);
        this.D = var2[3];
        return var2[1];
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean c(NPC nPC) {
        nPC.interact(var1[var2[6]]);
        return var2[1];
    }

    static {
        k.var6();
        k.var3();
        z = string -> {
            int n2;
            if (k.var7(string) && (!k.var8(string.equals(var1[var2[12]]) ? 1 : 0) || k.var9(string.equals(var1[var2[13]]) ? 1 : 0))) {
                n2 = var2[1];
                0;
                if (((0x3A ^ 0x1D) & ~(0x14 ^ 0x33)) != 0) {
                    return ((0x53 ^ 0x19) & ~(6 ^ 0x4C)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        };
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2_2;
        k var10;
        if (k.var11((Object)this.C.method(), (Object)b.BLACK_JACK)) {
            return var2[0];
        }
        if (k.var11(Game.getState(), GameState.LOGGED_IN)) {
            return var2[0];
        }
        d var12 = var10.B.b();
        NPC var13 = var12.b(var12.t());
        if (!k.var7(var13) || k.var9(Movement.isWalking() ? 1 : 0)) {
            return var2[0];
        }
        Item var14 = Inventory.getFirst(item -> {
            int n2;
            if (k.var7(item.getActions()) && k.var9(item.hasAction(z) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (((0xCA ^ 0x94) & ~(0x9D ^ 0xC3)) > 0) {
                    return ((0x10 ^ 0xB) & ~(0x25 ^ 0x3E)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        Player var15 = Players.getLocal();
        NPC var16 = NPCs.getAll(nPC -> {
            boolean bl;
            if (k.var17(nPC.getInteracting(), var15)) {
                bl = var2[1];
                0;
                if (-(180 + 183 - 253 + 77 ^ 156 + 38 - 35 + 31) >= 0) {
                    return ((0x3C ^ 0x6F ^ (0x1A ^ 0x77)) & (0xA1 ^ 0x88 ^ (0x81 ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).stream().findFirst().orElse(null);
        if (k.var18(var14) && k.var7(var16)) {
            return var10.B();
        }
        if (k.var18(var14)) {
            return var2[0];
        }
        if (k.var8(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            return var2[0];
        }
        c var19 = var10.B.b().t();
        WorldArea[] worldAreaArray = new WorldArea[var2[1]];
        worldAreaArray[k.var2[0]] = var19.p();
        if (k.var8(var15.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            return var2[0];
        }
        int var20 = Static.getClient().getTickCount();
        if (k.var4(var20 - var10.E, var2[2])) {
            var10.A.clear();
            return var2[0];
        }
        int var21 = var10.A.computeIfAbsent(var13.getIndex(), n2 -> var2[0]).booleanValue() ? 1 : 0;
        if (k.var9(var21) && k.var22(var10.D)) {
            var10.B.a(Worlds.getCurrentId());
            if (k.var9(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[k.var2[0]] = var1[var2[0]];
                if (k.var8(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var14.interact(var1[var2[1]]);
                }
            }
            return var10.c(var13);
        }
        return this.a((NPC)var2_2, (Item)var3_3);
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var29;
        Actor actor = animationChanged.getActor();
        if (k.var9(actor instanceof Player)) {
            return;
        }
        NPC var30 = (NPC)var29;
        if (k.var31(var30.getAnimation(), var2[8])) {
            k var32;
            var32.A.put(var30.getIndex(), var2[0]);
            0;
        }
    }

    private static String var33(String var34, String var35) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var37 = var35.toCharArray();
        int var38 = var2[0];
        char[] var39 = var34.toCharArray();
        int var40 = var39.length;
        int var41 = var2[0];
        while (k.var5(var41, var40)) {
            char var42 = var39[var41];
            var36.append((char)(var42 ^ var37[var38 % var37.length]));
            0;
            ++var38;
            ++var41;
            0;
            if ((77 + 3 - -14 + 65 ^ 116 + 101 - 164 + 102) > 0) continue;
            return null;
        }
        return String.valueOf(var36);
    }

    private static boolean var43(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var44(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var17(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var22(int n2) {
        return n2 > 0;
    }

    private static void var6() {
        var2 = new int[15];
        k.var2[0] = (48 + 54 - 19 + 53 ^ 171 + 143 - 185 + 67) & (29 + 80 - 47 + 74 ^ 99 + 176 - 251 + 172 ^ -1);
        k.var2[1] = 1;
        k.var2[2] = 185 + 30 - 149 + 126 ^ 171 + 30 - 6 + 2;
        k.var2[3] = 2;
        k.var2[4] = 0xFFFFDC75 & 0x3BFF;
        k.var2[5] = 3;
        k.var2[6] = 76 + 56 - 90 + 138 ^ 73 + 133 - 178 + 148;
        k.var2[7] = 0x79 ^ 0x7F;
        k.var2[8] = 0xFFFFBFEA & 0x433D;
        k.var2[9] = 115 + 154 - 200 + 121 ^ 2 + 167 - 93 + 109;
        k.var2[10] = 115 + 53 - 57 + 34 ^ 152 + 2 - 69 + 68;
        k.var2[11] = 0x8C ^ 0xC5 ^ (0xC9 ^ 0x89);
        k.var2[12] = 0xDB ^ 0x8E ^ (0x35 ^ 0x6A);
        k.var2[13] = 0x5F ^ 0x22 ^ (0x4D ^ 0x3B);
        k.var2[14] = 0x22 ^ 0x2E;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var45;
        if (k.var11(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && k.var11(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var46 = var45.getMessage();
        if (k.var9(var46.contains(var1[var2[2]]) ? 1 : 0)) {
            var47.D = var2[0];
            var47.E = Static.getClient().getTickCount();
        }
        if (k.var9(var46.contains(var1[var2[7]]) ? 1 : 0)) {
            k var47;
            var47.D = Math.max(var2[0], var47.D - var2[1]);
        }
    }

    @Inject
    public BlackjackingTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.A = new HashMap();
        this.D = var2[0];
        this.B = squireThieving;
        this.C = squireThievingConfig;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverheadTextChanged overheadTextChanged) {
        k var48;
        void var49;
        void var50;
        String string = overheadTextChanged.getOverheadText();
        if (k.var18(string)) {
            return;
        }
        Actor var51 = var50.getActor();
        if (k.var9(var51 instanceof Player)) {
            return;
        }
        NPC var52 = (NPC)var51;
        if (k.var9(var49.contains(var1[var2[9]]) ? 1 : 0)) {
            var48.A.put(var52.getIndex(), var2[1]);
            0;
        }
        if (!k.var8(var49.contains(var1[var2[10]]) ? 1 : 0) || k.var9(var49.contains(var1[var2[11]]) ? 1 : 0)) {
            var48.A.put(var52.getIndex(), var2[0]);
            0;
        }
    }

        catch (Exception var58) {
            var58.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean B() {
        void var1_1;
        if (k.var11((Object)this.B.b().t(), (Object)c.LADDER_HOUSE)) {
            Worlds.hopTo((World)Worlds.getRandom(world -> {
                int n2;
                if (k.var44(world.getId(), Worlds.getCurrentId()) && k.var9(world.isNormal() ? 1 : 0) && k.var9(world.isMembers() ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (((119 + 140 - 191 + 99 ^ 169 + 125 - 150 + 44) & (0x21 ^ 0x63 ^ (0x29 ^ 0x70) ^ -1)) != 0) {
                        return ((0x5D ^ 0x43 ^ (0x68 ^ 0x20)) & (0x8A ^ 0xA8 ^ (0xD0 ^ 0xA4) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }));
            return var2[1];
        }
        int[] nArray = new int[var2[1]];
        nArray[k.var2[0]] = var2[4];
        TileObject var59 = TileObjects.getNearest((int[])nArray);
        if (k.var18(var59)) {
            Worlds.hopTo((World)Worlds.getFirst(world -> {
                int n2;
                if (k.var43(world.getId(), Worlds.getCurrentId()) && k.var9(world.isNormal() ? 1 : 0) && k.var9(world.isMembers() ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            }));
            return var2[0];
        }
        var1_1.interact(var1[var2[5]]);
        return var2[1];
    }

    private static boolean var31(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var7(Object object) {
        return object != null;
    }
}

