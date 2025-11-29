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
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.CEnum;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.DEnum;

@Singleton
/* TASK: Blackjacking -> BlackjackingTask */
@TaskDesc(name="Blackjacking", register=true, priority=1)
public class BlackjackingTask
extends Task {
    public static final /* synthetic */ Predicate<String> z;
    private final /* synthetic */ SquireThievingConfig C;
    private final /* synthetic */ HashMap<Integer, Boolean> A;
    private /* synthetic */ int D;
    private final /* synthetic */ SquireThieving B;
    private static /* synthetic */ String[] lIIlllIIlIIIl;
    private static /* synthetic */ int[] lIIlllIIlIIlI;
    private /* synthetic */ int E;

    private static void lIllIIlIlllIlIl() {
        lIIlllIIlIIIl = new String[lIIlllIIlIIlI[14]];
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[0]] = k."Coin pouch";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[1]] = k."Drop";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[3]] = k."Knock-Out";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[5]] = k."Climb-up";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[6]] = k."Pickpocket";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[2]] = k."You fail to pick";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[7]] = k."You pick the";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[9]] = k."Zzzz";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[10]] = k."my head";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[11]] = k."kill you";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[12]] = k."Eat";
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[13]] = k."Drink";
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
                0;
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
        k var12;
        if (k.lIllIIlIlllIlll((Object)this.C.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIlllIIlIIlI[0];
        }
        d var26 = var12.B.b();
        NPC var19 = var26.b(var26.t());
        if (!k.lIllIIlIllllIII(var19) || k.lIllIIlIllllIIl(Movement.isWalking() ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        Item var9 = Inventory.getFirst(item -> {
            int n2;
            if (k.lIllIIlIllllIII(item.getActions()) && k.lIllIIlIllllIIl(item.hasAction(z) ? 1 : 0)) {
                n2 = lIIlllIIlIIlI[1];
                0;
                if (((0xCA ^ 0x94) & ~(0x9D ^ 0xC3)) > 0) {
                    return false;
                }
            } else {
                n2 = lIIlllIIlIIlI[0];
            }
            return n2 != 0;
        });
        Player var18 = Players.getLocal();
        NPC var28 = NPCs.getAll(nPC -> {
            boolean bl;
            if (k.lIllIIllIIlllII(nPC.getInteracting(), var18)) {
                bl = lIIlllIIlIIlI[1];
                0;
                if (-(180 + 183 - 253 + 77 ^ 156 + 38 - 35 + 31) >= 0) {
                    return ((0x3C ^ 0x6F ^ (0x1A ^ 0x77)) & (0xA1 ^ 0x88 ^ (0x81 ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = lIIlllIIlIIlI[0];
            }
            return bl;
        }).stream().findFirst().orElse(null);
        if (k.lIllIIlIllllIlI(var9) && k.lIllIIlIllllIII(var28)) {
            return var12.B();
        }
        if (k.lIllIIlIllllIlI(var9)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIllllIll(Reachable.isInteractable((Locatable)var19) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        c var4 = var12.B.b().t();
        WorldArea[] worldAreaArray = new WorldArea[lIIlllIIlIIlI[1]];
        worldAreaArray[k.lIIlllIIlIIlI[0]] = var4.p();
        if (k.lIllIIlIllllIll(var18.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        int var27 = Static.getClient().getTickCount();
        if (k.lIllIIlIlllllII(var27 - var12.E, lIIlllIIlIIlI[2])) {
            var12.A.clear();
            return lIIlllIIlIIlI[0];
        }
        int var40 = var12.A.computeIfAbsent(var19.getIndex(), n2 -> lIIlllIIlIIlI[0]).booleanValue() ? 1 : 0;
        if (k.lIllIIlIllllIIl(var40) && k.lIllIIlIlllllIl(var12.D)) {
            var12.B.a(Worlds.getCurrentId());
            if (k.lIllIIlIllllIIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIlIIlI[1]];
                stringArray[k.lIIlllIIlIIlI[0]] = lIIlllIIlIIIl[lIIlllIIlIIlI[0]];
                if (k.lIllIIlIllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    var9.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[1]]);
                }
            }
            return var12.c(var19);
        }
        return this.a((NPC)var2_2, (Item)var3_3);
    }

    private static boolean lIllIIlIllllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIlIlllIlII(String var3, String var35) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var35.getBytes(StandardCharsets.UTF_8)), lIIlllIIlIIlI[10]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIlllIIlIIlI[3], var25);
            return new String(var22.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var31;
        Actor actor = animationChanged.getActor();
        if (k.lIllIIlIllllIIl(actor instanceof Player)) {
            return;
        }
        NPC var39 = (NPC)var31;
        if (k.lIllIIlIllllllI(var39.getAnimation(), lIIlllIIlIIlI[8])) {
            k var33;
            var33.A.put(var39.getIndex(), lIIlllIIlIIlI[0]);
            0;
        }
    }

    private static String lIllIIlIlllIIll(String var5, String var10) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var13 = var10.toCharArray();
        int var24 = lIIlllIIlIIlI[0];
        char[] var6 = var5.toCharArray();
        int var16 = var6.length;
        int var29 = lIIlllIIlIIlI[0];
        while (k.lIllIIllIIlllIl(var29, var16)) {
            char var1 = var6[var29];
            var11.append((char)(var1 ^ var13[var24 % var13.length]));
            0;
            ++var24;
            ++var29;
            0;
            if ((77 + 3 - -14 + 65 ^ 116 + 101 - 164 + 102) > 0) continue;
            return null;
        }
        return String.valueOf(var11);
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

    private static void lIllIIlIlllIllI() {
        lIIlllIIlIIlI = new int[15];
        k.lIIlllIIlIIlI[0] = (48 + 54 - 19 + 53 ^ 171 + 143 - 185 + 67) & (29 + 80 - 47 + 74 ^ 99 + 176 - 251 + 172 ^ -1);
        k.lIIlllIIlIIlI[1] = 1;
        k.lIIlllIIlIIlI[2] = 185 + 30 - 149 + 126 ^ 171 + 30 - 6 + 2;
        k.lIIlllIIlIIlI[3] = 2;
        k.lIIlllIIlIIlI[4] = 0xFFFFDC75 & 0x3BFF;
        k.lIIlllIIlIIlI[5] = 3;
        k.lIIlllIIlIIlI[6] = 76 + 56 - 90 + 138 ^ 73 + 133 - 178 + 148;
        k.lIIlllIIlIIlI[7] = 0x79 ^ 0x7F;
        k.lIIlllIIlIIlI[8] = 0xFFFFBFEA & 0x433D;
        k.lIIlllIIlIIlI[9] = 115 + 154 - 200 + 121 ^ 2 + 167 - 93 + 109;
        k.lIIlllIIlIIlI[10] = 115 + 53 - 57 + 34 ^ 152 + 2 - 69 + 68;
        k.lIIlllIIlIIlI[11] = 0x8C ^ 0xC5 ^ (0xC9 ^ 0x89);
        k.lIIlllIIlIIlI[12] = 0xDB ^ 0x8E ^ (0x35 ^ 0x6A);
        k.lIIlllIIlIIlI[13] = 0x5F ^ 0x22 ^ (0x4D ^ 0x3B);
        k.lIIlllIIlIIlI[14] = 0x22 ^ 0x2E;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var17;
        if (k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var8 = var17.getMessage();
        if (k.lIllIIlIllllIIl(var8.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[2]]) ? 1 : 0)) {
            var37.D = lIIlllIIlIIlI[0];
            var37.E = Static.getClient().getTickCount();
        }
        if (k.lIllIIlIllllIIl(var8.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[7]]) ? 1 : 0)) {
            k var37;
            var37.D = Math.max(lIIlllIIlIIlI[0], var37.D - lIIlllIIlIIlI[1]);
        }
    }

    @Inject
    public k(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
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
        k var34;
        void var38;
        void var23;
        String string = overheadTextChanged.getOverheadText();
        if (k.lIllIIlIllllIlI(string)) {
            return;
        }
        Actor var2 = var23.getActor();
        if (k.lIllIIlIllllIIl(var2 instanceof Player)) {
            return;
        }
        NPC var7 = (NPC)var2;
        if (k.lIllIIlIllllIIl(var38.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[9]]) ? 1 : 0)) {
            var34.A.put(var7.getIndex(), lIIlllIIlIIlI[1]);
            0;
        }
        if (!k.lIllIIlIllllIll(var38.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[10]]) ? 1 : 0) || k.lIllIIlIllllIIl(var38.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[11]]) ? 1 : 0)) {
            var34.A.put(var7.getIndex(), lIIlllIIlIIlI[0]);
            0;
        }
    }

    private static String lIllIIlIlllIIlI(String var32, String var30) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIIlllIIlIIlI[3], var14);
            return new String(var21.doFinal(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var36) {
            var36.printStackTrace();
            return null;
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
                    0;
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
        TileObject var15 = TileObjects.getNearest((int[])nArray);
        if (k.lIllIIlIllllIlI(var15)) {
            Worlds.hopTo((World)Worlds.getFirst(world -> {
                int n2;
                if (k.lIllIIlIlllllll(world.getId(), Worlds.getCurrentId()) && k.lIllIIlIllllIIl(world.isNormal() ? 1 : 0) && k.lIllIIlIllllIIl(world.isMembers() ? 1 : 0)) {
                    n2 = lIIlllIIlIIlI[1];
                    0;
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

