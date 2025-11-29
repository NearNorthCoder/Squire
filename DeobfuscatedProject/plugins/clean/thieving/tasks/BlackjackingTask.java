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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.thieving.tasks.GameEnum19;
import gg.squire.thieving.tasks.GameEnum31;

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

    private static void lIllIIlIlllIlIl() {
        lIIlllIIlIIIl = new String[lIIlllIIlIIlI[14]];
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[0]] = "Coin pouch";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[1]] = "Drop";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[3]] = "Knock-Out";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[5]] = "Climb-up";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[6]] = "Pickpocket";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[2]] = "You fail to pick";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[7]] = "You pick the";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[9]] = "Zzzz";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[10]] = "my head";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[11]] = "kill you";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[12]] = "Eat";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[13]] = "Drink";
    }

    private boolean a(NPC nPC, Item item) {
        if (k.lIllIIlIlllllII(Combat.getCurrentHealth(), this.C.eatHP())) {
            item.interact(z);
        }
        nPC.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[3]]);
        this.D = lIIlllIIlIIlI[3];
        return lIIlllIIlIIlI[1];
    }

    private static boolean lIllIIllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIlllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean c(NPC nPC) {
        nPC.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[6]]);
        return lIIlllIIlIIlI[1];
    }

    static {
        k.lIllIIlIlllIllI();
        k.lIllIIlIlllIlIl();
        z = string -> {
            int n2;
            if (k.lIllIIlIllllIII(string) && (!k.lIllIIlIllllIll(string.equals(lIIlllIIlIIIl[lIIlllIIlIIlI[12]]) ? 1 : 0) || k.lIllIIlIllllIIl(string.equals(lIIlllIIlIIIl[lIIlllIIlIIlI[13]]) ? 1 : 0))) {
                n2 = lIIlllIIlIIlI[1];

                if (((0x3A ^ 0x1D) & ~(0x14 ^ 0x33)) != 0) {
                    return false;
                }
            } else {
                n2 = lIIlllIIlIIlI[0];
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
        k var1;
        if (k.lIllIIlIlllIlll((Object)this.C.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIlllIIlIIlI[0];
        }
        d var2 = var1.B.b();
        NPC var3 = var2.b(var2.t());
        if (!k.lIllIIlIllllIII(var3) || k.lIllIIlIllllIIl(Movement.isWalking() ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            if (k.lIllIIlIllllIII(item.getActions()) && k.lIllIIlIllllIIl(item.hasAction(z) ? 1 : 0)) {
                n2 = lIIlllIIlIIlI[1];

                if (((0xCA ^ 0x94) & ~(0x9D ^ 0xC3)) > 0) {
                    return false;
                }
            } else {
                n2 = lIIlllIIlIIlI[0];
            }
            return n2 != 0;
        });
        Player var5 = Players.getLocal();
        NPC var6 = NPCs.getAll(nPC -> {
            boolean bl;
            if (k.lIllIIllIIlllII(nPC.getInteracting(), var5)) {
                bl = lIIlllIIlIIlI[1];

                if (-(180 + 183 - 253 + 77 ^ 156 + 38 - 35 + 31) >= 0) {
                    return ((0x3C ^ 0x6F ^ (0x1A ^ 0x77)) & (0xA1 ^ 0x88 ^ (0x81 ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = lIIlllIIlIIlI[0];
            }
            return bl;
        }).stream().findFirst().orElse(null);
        if (k.lIllIIlIllllIlI(var4) && k.lIllIIlIllllIII(var6)) {
            return var1.B();
        }
        if (k.lIllIIlIllllIlI(var4)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIllllIll(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        c var7 = var1.B.b().t();
        WorldArea[] worldAreaArray = new WorldArea[lIIlllIIlIIlI[1]];
        worldAreaArray[k.lIIlllIIlIIlI[0]] = var7.p();
        if (k.lIllIIlIllllIll(var5.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        int var8 = Static.getClient().getTickCount();
        if (k.lIllIIlIlllllII(var8 - var1.E, lIIlllIIlIIlI[2])) {
            var1.A.clear();
            return lIIlllIIlIIlI[0];
        }
        int var9 = var1.A.computeIfAbsent(var3.getIndex(), n2 -> lIIlllIIlIIlI[0]).booleanValue() ? 1 : 0;
        if (k.lIllIIlIllllIIl(var9) && k.lIllIIlIlllllIl(var1.D)) {
            var1.B.a(Worlds.getCurrentId());
            if (k.lIllIIlIllllIIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIlIIlI[1]];
                stringArray[k.lIIlllIIlIIlI[0]] = lIIlllIIlIIIl[lIIlllIIlIIlI[0]];
                if (k.lIllIIlIllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var4.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[1]]);
                }
            }
            return var1.c(var3);
        }
        return this.a((NPC)var2_2, (Item)var3_3);
    }

    private static boolean lIllIIlIllllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var10;
        Actor actor = animationChanged.getActor();
        if (k.lIllIIlIllllIIl(actor instanceof Player)) {
            return;
        }
        NPC var11 = (NPC)var10;
        if (k.lIllIIlIllllllI(var11.getAnimation(), lIIlllIIlIIlI[8])) {
            k var12;
            var12.A.put(var11.getIndex(), lIIlllIIlIIlI[0]);

        }
    }

        return String.valueOf(var13);
    }

    private static boolean lIllIIlIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIllIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIllIIlllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIlIlllllIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var14;
        if (k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var15 = var14.getMessage();
        if (k.lIllIIlIllllIIl(var15.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[2]]) ? 1 : 0)) {
            var16.D = lIIlllIIlIIlI[0];
            var16.E = Static.getClient().getTickCount();
        }
        if (k.lIllIIlIllllIIl(var15.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[7]]) ? 1 : 0)) {
            k var16;
            var16.D = Math.max(lIIlllIIlIIlI[0], var16.D - lIIlllIIlIIlI[1]);
        }
    }

    @Inject
    public BlackjackingTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.A = new HashMap();
        this.D = lIIlllIIlIIlI[0];
        this.B = squireThieving;
        this.C = squireThievingConfig;
    }

    private static boolean lIllIIlIllllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverheadTextChanged overheadTextChanged) {
        k var17;
        void var18;
        void var19;
        String string = overheadTextChanged.getOverheadText();
        if (k.lIllIIlIllllIlI(string)) {
            return;
        }
        Actor var20 = var19.getActor();
        if (k.lIllIIlIllllIIl(var20 instanceof Player)) {
            return;
        }
        NPC var21 = (NPC)var20;
        if (k.lIllIIlIllllIIl(var18.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[9]]) ? 1 : 0)) {
            var17.A.put(var21.getIndex(), lIIlllIIlIIlI[1]);

        }
        if (!k.lIllIIlIllllIll(var18.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[10]]) ? 1 : 0) || k.lIllIIlIllllIIl(var18.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[11]]) ? 1 : 0)) {
            var17.A.put(var21.getIndex(), lIIlllIIlIIlI[0]);

        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean B() {
        void var1_1;
        if (k.lIllIIlIlllIlll((Object)this.B.b().t(), (Object)c.LADDER_HOUSE)) {
            Worlds.hopTo((World)Worlds.getRandom(world -> {
                int n2;
                if (k.lIllIIllIIIIIII(world.getId(), Worlds.getCurrentId()) && k.lIllIIlIllllIIl(world.isNormal() ? 1 : 0) && k.lIllIIlIllllIIl(world.isMembers() ? 1 : 0)) {
                    n2 = lIIlllIIlIIlI[1];

                    if (((119 + 140 - 191 + 99 ^ 169 + 125 - 150 + 44) & (0x21 ^ 0x63 ^ (0x29 ^ 0x70) ^ -1)) != 0) {
                        return ((0x5D ^ 0x43 ^ (0x68 ^ 0x20)) & (0x8A ^ 0xA8 ^ (0xD0 ^ 0xA4) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIlIIlI[0];
                }
                return n2 != 0;
            }));
            return lIIlllIIlIIlI[1];
        }
        int[] nArray = new int[lIIlllIIlIIlI[1]];
        nArray[k.lIIlllIIlIIlI[0]] = lIIlllIIlIIlI[4];
        TileObject var22 = TileObjects.getNearest((int[])nArray);
        if (k.lIllIIlIllllIlI(var22)) {
            Worlds.hopTo((World)Worlds.getFirst(world -> {
                int n2;
                if (k.lIllIIlIlllllll(world.getId(), Worlds.getCurrentId()) && k.lIllIIlIllllIIl(world.isNormal() ? 1 : 0) && k.lIllIIlIllllIIl(world.isMembers() ? 1 : 0)) {
                    n2 = lIIlllIIlIIlI[1];

                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlllIIlIIlI[0];
                }
                return n2 != 0;
            }));
            return lIIlllIIlIIlI[0];
        }
        var1_1.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[5]]);
        return lIIlllIIlIIlI[1];
    }

    private static boolean lIllIIlIllllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIlllIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIlIllllIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIllllIII(Object object) {
        return object != null;
    }
}

