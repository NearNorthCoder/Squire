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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d;

@Singleton
@TaskDesc(name="Blackjacking", register=true, priority=1)
public class k
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
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[0]] = k.lIllIIlIlllIIlI("/9nD9W6KF+/A7crJg5o68Q==", "NRnkq");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[1]] = k.lIllIIlIlllIIlI("sMv/wFQOoc8=", "dWGUk");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[3]] = k.lIllIIlIlllIIll("JicrNjFABjEh", "mIDUZ");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[5]] = k.lIllIIlIlllIlII("Nbkwc4rtNffLLROREAeIxw==", "CfbZy");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[6]] = k.lIllIIlIlllIlII("ZRMPxXvyDF04dkGlHsHTkQ==", "VbCuh");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[2]] = k.lIllIIlIlllIlII("lghiKtWnHxjuL68iZMQOaEQJA8OO/ubs", "qgqwk");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[7]] = k.lIllIIlIlllIIlI("Jy7LrMCzH0GTfc4A6XIQ9Q==", "Gvxvy");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[9]] = k.lIllIIlIlllIlII("v9z9NHFi1jo=", "FTzxa");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[10]] = k.lIllIIlIlllIIll("KhJOOR8mDw==", "GknQz");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[11]] = k.lIllIIlIlllIlII("coRsmjnlQODEYGEDBB0iTg==", "dktfv");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[12]] = k.lIllIIlIlllIIlI("2FUyeHe4Hns=", "uZBTf");
        k.lIIlllIIlIIIl[k.lIIlllIIlIIlI[13]] = k.lIllIIlIlllIIll("FgAFDBk=", "Rrlbr");
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
                "".length();
                if (((0x3A ^ 0x1D) & ~(0x14 ^ 0x33)) != 0) {
                    return ((0x53 ^ 0x19) & ~(6 ^ 0x4C)) != 0;
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
        k llllllllllllllIlllIlIllllIlIlllI;
        if (k.lIllIIlIlllIlll((Object)this.C.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIlllIIlIIlI[0];
        }
        d llllllllllllllIlllIlIllllIlIllIl = llllllllllllllIlllIlIllllIlIlllI.B.b();
        NPC llllllllllllllIlllIlIllllIlIllII = llllllllllllllIlllIlIllllIlIllIl.b(llllllllllllllIlllIlIllllIlIllIl.t());
        if (!k.lIllIIlIllllIII(llllllllllllllIlllIlIllllIlIllII) || k.lIllIIlIllllIIl(Movement.isWalking() ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        Item llllllllllllllIlllIlIllllIlIlIll = Inventory.getFirst(item -> {
            int n2;
            if (k.lIllIIlIllllIII(item.getActions()) && k.lIllIIlIllllIIl(item.hasAction(z) ? 1 : 0)) {
                n2 = lIIlllIIlIIlI[1];
                "".length();
                if (((0xCA ^ 0x94) & ~(0x9D ^ 0xC3)) > 0) {
                    return ((0x10 ^ 0xB) & ~(0x25 ^ 0x3E)) != 0;
                }
            } else {
                n2 = lIIlllIIlIIlI[0];
            }
            return n2 != 0;
        });
        Player llllllllllllllIlllIlIllllIlIlIlI = Players.getLocal();
        NPC llllllllllllllIlllIlIllllIlIlIIl = NPCs.getAll(nPC -> {
            boolean bl;
            if (k.lIllIIllIIlllII(nPC.getInteracting(), llllllllllllllIlllIlIllllIlIlIlI)) {
                bl = lIIlllIIlIIlI[1];
                "".length();
                if (-(180 + 183 - 253 + 77 ^ 156 + 38 - 35 + 31) >= 0) {
                    return ((0x3C ^ 0x6F ^ (0x1A ^ 0x77)) & (0xA1 ^ 0x88 ^ (0x81 ^ 0x96) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIIlllIIlIIlI[0];
            }
            return bl;
        }).stream().findFirst().orElse(null);
        if (k.lIllIIlIllllIlI(llllllllllllllIlllIlIllllIlIlIll) && k.lIllIIlIllllIII(llllllllllllllIlllIlIllllIlIlIIl)) {
            return llllllllllllllIlllIlIllllIlIlllI.B();
        }
        if (k.lIllIIlIllllIlI(llllllllllllllIlllIlIllllIlIlIll)) {
            return lIIlllIIlIIlI[0];
        }
        if (k.lIllIIlIllllIll(Reachable.isInteractable((Locatable)llllllllllllllIlllIlIllllIlIllII) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        c llllllllllllllIlllIlIllllIlIlIII = llllllllllllllIlllIlIllllIlIlllI.B.b().t();
        WorldArea[] worldAreaArray = new WorldArea[lIIlllIIlIIlI[1]];
        worldAreaArray[k.lIIlllIIlIIlI[0]] = llllllllllllllIlllIlIllllIlIlIII.p();
        if (k.lIllIIlIllllIll(llllllllllllllIlllIlIllllIlIlIlI.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            return lIIlllIIlIIlI[0];
        }
        int llllllllllllllIlllIlIllllIlIIlll = Static.getClient().getTickCount();
        if (k.lIllIIlIlllllII(llllllllllllllIlllIlIllllIlIIlll - llllllllllllllIlllIlIllllIlIlllI.E, lIIlllIIlIIlI[2])) {
            llllllllllllllIlllIlIllllIlIlllI.A.clear();
            return lIIlllIIlIIlI[0];
        }
        int llllllllllllllIlllIlIllllIlIIllI = llllllllllllllIlllIlIllllIlIlllI.A.computeIfAbsent(llllllllllllllIlllIlIllllIlIllII.getIndex(), n2 -> lIIlllIIlIIlI[0]).booleanValue() ? 1 : 0;
        if (k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIlIIllI) && k.lIllIIlIlllllIl(llllllllllllllIlllIlIllllIlIlllI.D)) {
            llllllllllllllIlllIlIllllIlIlllI.B.a(Worlds.getCurrentId());
            if (k.lIllIIlIllllIIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIlIIlI[1]];
                stringArray[k.lIIlllIIlIIlI[0]] = lIIlllIIlIIIl[lIIlllIIlIIlI[0]];
                if (k.lIllIIlIllllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    llllllllllllllIlllIlIllllIlIlIll.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[1]]);
                }
            }
            return llllllllllllllIlllIlIllllIlIlllI.c(llllllllllllllIlllIlIllllIlIllII);
        }
        return this.a((NPC)var2_2, (Item)var3_3);
    }

    private static boolean lIllIIlIllllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIlIlllIlII(String llllllllllllllIlllIlIlllIlIllIII, String llllllllllllllIlllIlIlllIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIlIlllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIIlIIlI[10]), "DES");
            Cipher llllllllllllllIlllIlIlllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIlIlllIlIllIlI.init(lIIlllIIlIIlI[3], llllllllllllllIlllIlIlllIlIllIll);
            return new String(llllllllllllllIlllIlIlllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIlllIlIllIIl) {
            llllllllllllllIlllIlIlllIlIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllIlllIlIllllIIIllll;
        Actor actor = animationChanged.getActor();
        if (k.lIllIIlIllllIIl(actor instanceof Player)) {
            return;
        }
        NPC llllllllllllllIlllIlIllllIIIlllI = (NPC)llllllllllllllIlllIlIllllIIIllll;
        if (k.lIllIIlIllllllI(llllllllllllllIlllIlIllllIIIlllI.getAnimation(), lIIlllIIlIIlI[8])) {
            k llllllllllllllIlllIlIllllIIlIIIl;
            llllllllllllllIlllIlIllllIIlIIIl.A.put(llllllllllllllIlllIlIllllIIIlllI.getIndex(), lIIlllIIlIIlI[0]);
            "".length();
        }
    }

    private static String lIllIIlIlllIIll(String llllllllllllllIlllIlIlllIllIlIII, String llllllllllllllIlllIlIlllIllIIlll) {
        llllllllllllllIlllIlIlllIllIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIlllIllIlIll = new StringBuilder();
        char[] llllllllllllllIlllIlIlllIllIlIlI = llllllllllllllIlllIlIlllIllIIlll.toCharArray();
        int llllllllllllllIlllIlIlllIllIlIIl = lIIlllIIlIIlI[0];
        char[] llllllllllllllIlllIlIlllIllIIIll = llllllllllllllIlllIlIlllIllIlIII.toCharArray();
        int llllllllllllllIlllIlIlllIllIIIlI = llllllllllllllIlllIlIlllIllIIIll.length;
        int llllllllllllllIlllIlIlllIllIIIIl = lIIlllIIlIIlI[0];
        while (k.lIllIIllIIlllIl(llllllllllllllIlllIlIlllIllIIIIl, llllllllllllllIlllIlIlllIllIIIlI)) {
            char llllllllllllllIlllIlIlllIllIlllI = llllllllllllllIlllIlIlllIllIIIll[llllllllllllllIlllIlIlllIllIIIIl];
            llllllllllllllIlllIlIlllIllIlIll.append((char)(llllllllllllllIlllIlIlllIllIlllI ^ llllllllllllllIlllIlIlllIllIlIlI[llllllllllllllIlllIlIlllIllIlIIl % llllllllllllllIlllIlIlllIllIlIlI.length]));
            "".length();
            ++llllllllllllllIlllIlIlllIllIlIIl;
            ++llllllllllllllIlllIlIlllIllIIIIl;
            "".length();
            if ((77 + 3 - -14 + 65 ^ 116 + 101 - 164 + 102) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlIlllIllIlIll);
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
        k.lIIlllIIlIIlI[0] = (48 + 54 - 19 + 53 ^ 171 + 143 - 185 + 67) & (29 + 80 - 47 + 74 ^ 99 + 176 - 251 + 172 ^ -" ".length());
        k.lIIlllIIlIIlI[1] = " ".length();
        k.lIIlllIIlIIlI[2] = 185 + 30 - 149 + 126 ^ 171 + 30 - 6 + 2;
        k.lIIlllIIlIIlI[3] = "  ".length();
        k.lIIlllIIlIIlI[4] = 0xFFFFDC75 & 0x3BFF;
        k.lIIlllIIlIIlI[5] = "   ".length();
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
        void llllllllllllllIlllIlIllllIIlIlll;
        if (k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && k.lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String llllllllllllllIlllIlIllllIIlIllI = llllllllllllllIlllIlIllllIIlIlll.getMessage();
        if (k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIIlIllI.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[2]]) ? 1 : 0)) {
            llllllllllllllIlllIlIllllIIllIII.D = lIIlllIIlIIlI[0];
            llllllllllllllIlllIlIllllIIllIII.E = Static.getClient().getTickCount();
        }
        if (k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIIlIllI.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[7]]) ? 1 : 0)) {
            k llllllllllllllIlllIlIllllIIllIII;
            llllllllllllllIlllIlIllllIIllIII.D = Math.max(lIIlllIIlIIlI[0], llllllllllllllIlllIlIllllIIllIII.D - lIIlllIIlIIlI[1]);
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
        k llllllllllllllIlllIlIllllIIIlIII;
        void llllllllllllllIlllIlIllllIIIIllI;
        void llllllllllllllIlllIlIllllIIIIlll;
        String string = overheadTextChanged.getOverheadText();
        if (k.lIllIIlIllllIlI(string)) {
            return;
        }
        Actor llllllllllllllIlllIlIllllIIIIlIl = llllllllllllllIlllIlIllllIIIIlll.getActor();
        if (k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIIIIlIl instanceof Player)) {
            return;
        }
        NPC llllllllllllllIlllIlIllllIIIIlII = (NPC)llllllllllllllIlllIlIllllIIIIlIl;
        if (k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIIIIllI.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[9]]) ? 1 : 0)) {
            llllllllllllllIlllIlIllllIIIlIII.A.put(llllllllllllllIlllIlIllllIIIIlII.getIndex(), lIIlllIIlIIlI[1]);
            "".length();
        }
        if (!k.lIllIIlIllllIll(llllllllllllllIlllIlIllllIIIIllI.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[10]]) ? 1 : 0) || k.lIllIIlIllllIIl(llllllllllllllIlllIlIllllIIIIllI.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[11]]) ? 1 : 0)) {
            llllllllllllllIlllIlIllllIIIlIII.A.put(llllllllllllllIlllIlIllllIIIIlII.getIndex(), lIIlllIIlIIlI[0]);
            "".length();
        }
    }

    private static String lIllIIlIlllIIlI(String llllllllllllllIlllIlIlllIlIIlIll, String llllllllllllllIlllIlIlllIlIIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlIlllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIlllIlIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIlllIlIIllIl.init(lIIlllIIlIIlI[3], llllllllllllllIlllIlIlllIlIIlllI);
            return new String(llllllllllllllIlllIlIlllIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIlllIlIIllII) {
            llllllllllllllIlllIlIlllIlIIllII.printStackTrace();
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
                    "".length();
                    if (((119 + 140 - 191 + 99 ^ 169 + 125 - 150 + 44) & (0x21 ^ 0x63 ^ (0x29 ^ 0x70) ^ -" ".length())) != 0) {
                        return ((0x5D ^ 0x43 ^ (0x68 ^ 0x20)) & (0x8A ^ 0xA8 ^ (0xD0 ^ 0xA4) ^ -" ".length())) != 0;
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
        TileObject llllllllllllllIlllIlIllllIIlllII = TileObjects.getNearest((int[])nArray);
        if (k.lIllIIlIllllIlI(llllllllllllllIlllIlIllllIIlllII)) {
            Worlds.hopTo((World)Worlds.getFirst(world -> {
                int n2;
                if (k.lIllIIlIlllllll(world.getId(), Worlds.getCurrentId()) && k.lIllIIlIllllIIl(world.isNormal() ? 1 : 0) && k.lIllIIlIllllIIl(world.isMembers() ? 1 : 0)) {
                    n2 = lIIlllIIlIIlI[1];
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0x79 ^ 0x49) & ~(0 ^ 0x30)) != 0;
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

