package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

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
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
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
@Singleton
@TaskDesc(name = "Blackjacking", register = true, priority = 1)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.k  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/k.class */
public class C0010k extends Task {
    public static final /* synthetic */ Predicate<String> z;
    private final /* synthetic */ SquireThievingConfig C;
    private final /* synthetic */ HashMap<Integer, Boolean> A = new HashMap<>();
    private /* synthetic */ int D = lIIlllIIlIIlI[0];
    private final /* synthetic */ SquireThieving B;
    private static /* synthetic */ String[] lIIlllIIlIIIl;
    private static /* synthetic */ int[] lIIlllIIlIIlI;
    private /* synthetic */ int E;

    private static void lIllIIlIlllIlIl() {
        lIIlllIIlIIIl = new String[lIIlllIIlIIlI[14]];
        lIIlllIIlIIIl[lIIlllIIlIIlI[0]] = lIllIIlIlllIIlI("/9nD9W6KF+/A7crJg5o68Q==", "NRnkq");
        lIIlllIIlIIIl[lIIlllIIlIIlI[1]] = lIllIIlIlllIIlI("sMv/wFQOoc8=", "dWGUk");
        lIIlllIIlIIIl[lIIlllIIlIIlI[3]] = lIllIIlIlllIIll("JicrNjFABjEh", "mIDUZ");
        lIIlllIIlIIIl[lIIlllIIlIIlI[5]] = lIllIIlIlllIlII("Nbkwc4rtNffLLROREAeIxw==", "CfbZy");
        lIIlllIIlIIIl[lIIlllIIlIIlI[6]] = lIllIIlIlllIlII("ZRMPxXvyDF04dkGlHsHTkQ==", "VbCuh");
        lIIlllIIlIIIl[lIIlllIIlIIlI[2]] = lIllIIlIlllIlII("lghiKtWnHxjuL68iZMQOaEQJA8OO/ubs", "qgqwk");
        lIIlllIIlIIIl[lIIlllIIlIIlI[7]] = lIllIIlIlllIIlI("Jy7LrMCzH0GTfc4A6XIQ9Q==", "Gvxvy");
        lIIlllIIlIIIl[lIIlllIIlIIlI[9]] = lIllIIlIlllIlII("v9z9NHFi1jo=", "FTzxa");
        lIIlllIIlIIIl[lIIlllIIlIIlI[10]] = lIllIIlIlllIIll("KhJOOR8mDw==", "GknQz");
        lIIlllIIlIIIl[lIIlllIIlIIlI[11]] = lIllIIlIlllIlII("coRsmjnlQODEYGEDBB0iTg==", "dktfv");
        lIIlllIIlIIIl[lIIlllIIlIIlI[12]] = lIllIIlIlllIIlI("2FUyeHe4Hns=", "uZBTf");
        lIIlllIIlIIIl[lIIlllIIlIIlI[13]] = lIllIIlIlllIIll("FgAFDBk=", "Rrlbr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean a(NPC npc, Item item) {
        if (lIllIIlIlllllII(Combat.getCurrentHealth(), this.C.eatHP())) {
            item.interact(z);
        }
        npc.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[3]]);
        this.D = lIIlllIIlIIlI[3];
        return lIIlllIIlIIlI[1];
    }

    private static boolean lIllIIllIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIlllllII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    private boolean c(NPC npc) {
        npc.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[6]]);
        return lIIlllIIlIIlI[1];
    }

    static {
        lIllIIlIlllIllI();
        lIllIIlIlllIlIl();
        z = str -> {
            if (!lIllIIlIllllIII(str) || (lIllIIlIllllIll(str.equals(lIIlllIIlIIIl[lIIlllIIlIIlI[12]]) ? 1 : 0) && !lIllIIlIllllIIl(str.equals(lIIlllIIlIIIl[lIIlllIIlIIlI[13]]) ? 1 : 0))) {
                return lIIlllIIlIIlI[0];
            }
            ?? r0 = lIIlllIIlIIlI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIlllIlll(this.C.method(), EnumC0001b.BLACK_JACK) && !lIllIIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            EnumC0003d b = this.B.b();
            NPC b2 = b.b(b.t());
            if (!lIllIIlIllllIII(b2) || lIllIIlIllllIIl(Movement.isWalking() ? 1 : 0)) {
                return lIIlllIIlIIlI[0];
            }
            Item first = Inventory.getFirst(item -> {
                if (lIllIIlIllllIII(item.getActions()) && lIllIIlIllllIIl(item.hasAction(z) ? 1 : 0)) {
                    ?? r0 = lIIlllIIlIIlI[1];
                    "".length();
                    return ((202 ^ 148) & ((157 ^ 195) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlllIIlIIlI[0];
            });
            Player local = Players.getLocal();
            NPC npc = (NPC) NPCs.getAll(npc2 -> {
                if (lIllIIllIIlllII(npc2.getInteracting(), local)) {
                    ?? r0 = lIIlllIIlIIlI[1];
                    "".length();
                    return (-((((180 + 183) - 253) + 77) ^ (((156 + 38) - 35) + 31))) >= 0 ? ((60 ^ 111) ^ (26 ^ 119)) & (((161 ^ 136) ^ (129 ^ 150)) ^ (-" ".length())) : r0;
                }
                return lIIlllIIlIIlI[0];
            }).stream().findFirst().orElse(null);
            if (lIllIIlIllllIlI(first) && lIllIIlIllllIII(npc)) {
                return B();
            }
            if (!lIllIIlIllllIlI(first) && !lIllIIlIllllIll(Reachable.isInteractable(b2) ? 1 : 0)) {
                EnumC0002c t = this.B.b().t();
                WorldPoint worldLocation = local.getWorldLocation();
                WorldArea[] worldAreaArr = new WorldArea[lIIlllIIlIIlI[1]];
                worldAreaArr[lIIlllIIlIIlI[0]] = t.p();
                if (lIllIIlIllllIll(worldLocation.isInArea(worldAreaArr) ? 1 : 0)) {
                    return lIIlllIIlIIlI[0];
                }
                int llllllllllllllIlllIlIllllIlIIlll = Static.getClient().getTickCount();
                if (lIllIIlIlllllII(llllllllllllllIlllIlIllllIlIIlll - this.E, lIIlllIIlIIlI[2])) {
                    this.A.clear();
                    return lIIlllIIlIIlI[0];
                } else if (lIllIIlIllllIIl(this.A.computeIfAbsent(Integer.valueOf(b2.getIndex()), num -> {
                    return Boolean.valueOf((boolean) lIIlllIIlIIlI[0]);
                }).booleanValue() ? 1 : 0) && lIllIIlIlllllIl(this.D)) {
                    this.B.a(Worlds.getCurrentId());
                    if (lIllIIlIllllIIl(Inventory.isFull() ? 1 : 0)) {
                        String[] strArr = new String[lIIlllIIlIIlI[1]];
                        strArr[lIIlllIIlIIlI[0]] = lIIlllIIlIIIl[lIIlllIIlIIlI[0]];
                        if (lIllIIlIllllIll(Inventory.contains(strArr) ? 1 : 0)) {
                            first.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[1]]);
                        }
                    }
                    return c(b2);
                } else {
                    return a(b2, first);
                }
            }
            return lIIlllIIlIIlI[0];
        }
        return lIIlllIIlIIlI[0];
    }

    private static boolean lIllIIlIllllIIl(int i) {
        return i != 0;
    }

    private static String lIllIIlIlllIlII(String llllllllllllllIlllIlIlllIlIlIllI, String llllllllllllllIlllIlIlllIlIlIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIlIlllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIIlIIlI[10]), "DES");
            Cipher llllllllllllllIlllIlIlllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIlIlllIlIllIlI.init(lIIlllIIlIIlI[3], llllllllllllllIlllIlIlllIlIllIll);
            return new String(llllllllllllllIlllIlIlllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIlllIlIllIIl) {
            llllllllllllllIlllIlIlllIlIllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIllIIlIllllIIl(actor instanceof Player ? 1 : 0)) {
            return;
        }
        NPC npc = actor;
        if (lIllIIlIllllllI(npc.getAnimation(), lIIlllIIlIIlI[8])) {
            this.A.put(Integer.valueOf(npc.getIndex()), Boolean.valueOf((boolean) lIIlllIIlIIlI[0]));
            "".length();
        }
    }

    private static String lIllIIlIlllIIll(String llllllllllllllIlllIlIlllIllIllIl, String llllllllllllllIlllIlIlllIllIllII) {
        String llllllllllllllIlllIlIlllIllIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlIlllIllIlIlI = llllllllllllllIlllIlIlllIllIllII.toCharArray();
        int llllllllllllllIlllIlIlllIllIlIIl = lIIlllIIlIIlI[0];
        char[] charArray = llllllllllllllIlllIlIlllIllIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIlIIlI[0];
        while (lIllIIllIIlllIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIlIlllIllIlIlI[llllllllllllllIlllIlIlllIllIlIIl % llllllllllllllIlllIlIlllIllIlIlI.length]));
            "".length();
            llllllllllllllIlllIlIlllIllIlIIl++;
            i++;
            "".length();
            if (((((77 + 3) - (-14)) + 65) ^ (((116 + 101) - 164) + 102)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIlllllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIllIIIIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIllIIlllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIIlIlllllIl(int i) {
        return i > 0;
    }

    private static void lIllIIlIlllIllI() {
        lIIlllIIlIIlI = new int[15];
        lIIlllIIlIIlI[0] = ((((48 + 54) - 19) + 53) ^ (((171 + 143) - 185) + 67)) & (((((29 + 80) - 47) + 74) ^ (((99 + 176) - 251) + 172)) ^ (-" ".length()));
        lIIlllIIlIIlI[1] = " ".length();
        lIIlllIIlIIlI[2] = (((185 + 30) - 149) + 126) ^ (((171 + 30) - 6) + 2);
        lIIlllIIlIIlI[3] = "  ".length();
        lIIlllIIlIIlI[4] = (-9099) & 15359;
        lIIlllIIlIIlI[5] = "   ".length();
        lIIlllIIlIIlI[6] = (((76 + 56) - 90) + 138) ^ (((73 + 133) - 178) + 148);
        lIIlllIIlIIlI[7] = 121 ^ 127;
        lIIlllIIlIIlI[8] = (-16406) & 17213;
        lIIlllIIlIIlI[9] = (((115 + 154) - 200) + 121) ^ (((2 + 167) - 93) + 109);
        lIIlllIIlIIlI[10] = (((115 + 53) - 57) + 34) ^ (((152 + 2) - 69) + 68);
        lIIlllIIlIIlI[11] = (140 ^ 197) ^ (201 ^ 137);
        lIIlllIIlIIlI[12] = (219 ^ 142) ^ (53 ^ 106);
        lIIlllIIlIIlI[13] = (95 ^ 34) ^ (77 ^ 59);
        lIIlllIIlIIlI[14] = 34 ^ 46;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllIIlIlllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIllIIlIllllIIl(message.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[2]]) ? 1 : 0)) {
            this.D = lIIlllIIlIIlI[0];
            this.E = Static.getClient().getTickCount();
        }
        if (lIllIIlIllllIIl(message.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[7]]) ? 1 : 0)) {
            this.D = Math.max(lIIlllIIlIIlI[0], this.D - lIIlllIIlIIlI[1]);
        }
    }

    @Inject
    public C0010k(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.B = squireThieving;
        this.C = squireThievingConfig;
    }

    private static boolean lIllIIlIllllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    @Subscribe
    public void a(OverheadTextChanged overheadTextChanged) {
        String overheadText = overheadTextChanged.getOverheadText();
        if (lIllIIlIllllIlI(overheadText)) {
            return;
        }
        NPC actor = overheadTextChanged.getActor();
        if (lIllIIlIllllIIl(actor instanceof Player ? 1 : 0)) {
            return;
        }
        NPC npc = actor;
        if (lIllIIlIllllIIl(overheadText.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[9]]) ? 1 : 0)) {
            this.A.put(Integer.valueOf(npc.getIndex()), Boolean.valueOf((boolean) lIIlllIIlIIlI[1]));
            "".length();
        }
        if (!lIllIIlIllllIll(overheadText.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[10]]) ? 1 : 0) || lIllIIlIllllIIl(overheadText.contains(lIIlllIIlIIIl[lIIlllIIlIIlI[11]]) ? 1 : 0)) {
            this.A.put(Integer.valueOf(npc.getIndex()), Boolean.valueOf((boolean) lIIlllIIlIIlI[0]));
            "".length();
        }
    }

    private static String lIllIIlIlllIIlI(String llllllllllllllIlllIlIlllIlIIlIll, String llllllllllllllIlllIlIlllIlIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlIlllIlIIllII) {
            llllllllllllllIlllIlIlllIlIIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    private boolean B() {
        if (lIllIIlIlllIlll(this.B.b().t(), EnumC0002c.LADDER_HOUSE)) {
            Worlds.hopTo(Worlds.getRandom(world -> {
                if (lIllIIllIIIIIII(world.getId(), Worlds.getCurrentId()) && lIllIIlIllllIIl(world.isNormal() ? 1 : 0) && lIllIIlIllllIIl(world.isMembers() ? 1 : 0)) {
                    ?? r0 = lIIlllIIlIIlI[1];
                    "".length();
                    return (((((119 + 140) - 191) + 99) ^ (((169 + 125) - 150) + 44)) & (((33 ^ 99) ^ (41 ^ 112)) ^ (-" ".length()))) != 0 ? ((93 ^ 67) ^ (104 ^ 32)) & (((138 ^ 168) ^ (208 ^ 164)) ^ (-" ".length())) : r0;
                }
                return lIIlllIIlIIlI[0];
            }));
            return lIIlllIIlIIlI[1];
        }
        int[] iArr = new int[lIIlllIIlIIlI[1]];
        iArr[lIIlllIIlIIlI[0]] = lIIlllIIlIIlI[4];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIllIIlIllllIlI(nearest)) {
            Worlds.hopTo(Worlds.getFirst(world2 -> {
                if (lIllIIlIlllllll(world2.getId(), Worlds.getCurrentId()) && lIllIIlIllllIIl(world2.isNormal() ? 1 : 0) && lIllIIlIllllIIl(world2.isMembers() ? 1 : 0)) {
                    ?? r0 = lIIlllIIlIIlI[1];
                    "".length();
                    return "  ".length() == 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
                }
                return lIIlllIIlIIlI[0];
            }));
            return lIIlllIIlIIlI[0];
        }
        nearest.interact(lIIlllIIlIIIl[lIIlllIIlIIlI[5]]);
        return lIIlllIIlIIlI[1];
    }

    private static boolean lIllIIlIllllllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIlllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIlIllllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIlIllllIII(Object obj) {
        return obj != null;
    }
}
