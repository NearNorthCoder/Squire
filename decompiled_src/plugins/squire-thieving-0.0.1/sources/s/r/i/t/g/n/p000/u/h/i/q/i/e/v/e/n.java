package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

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
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Hopping for an empty world", priority = 4, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.n  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/n.class */
public class n extends Task {
    private final /* synthetic */ SquireThieving O;
    private static /* synthetic */ int[] lIIllIlIIllll;
    private static /* synthetic */ String[] lIIllIlIIlllI;
    private final /* synthetic */ Predicate<NPC> P = npc -> {
        if (lIllIIIIIlIllII(npc.getName().contains(lIIllIlIIlllI[lIIllIlIIllll[9]]) ? 1 : 0) && lIllIIIIIlIllII(npc.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[10]]) ? 1 : 0)) {
            ?? r0 = lIIllIlIIllll[2];
            "".length();
            return (((109 ^ 78) ^ (168 ^ 131)) & (((123 ^ 37) ^ (125 ^ 43)) ^ (-" ".length()))) != 0 ? ((87 ^ 16) ^ (176 ^ 184)) & (((49 ^ 114) ^ (64 ^ 76)) ^ (-" ".length())) : r0;
        }
        return lIIllIlIIllll[0];
    };
    private final /* synthetic */ SquireThievingConfig N;

    private static void lIllIIIIIlIlIlI() {
        lIIllIlIIllll = new int[12];
        lIIllIlIIllll[0] = (32 ^ 48) & ((125 ^ 109) ^ (-1));
        lIIllIlIIllll[1] = -" ".length();
        lIIllIlIIllll[2] = " ".length();
        lIIllIlIIllll[3] = "  ".length();
        lIIllIlIIllll[4] = "   ".length();
        lIIllIlIIllll[5] = 188 ^ 184;
        lIIllIlIIllll[6] = (45 ^ 42) ^ "  ".length();
        lIIllIlIIllll[7] = 77 ^ 75;
        lIIllIlIIllll[8] = 135 ^ 128;
        lIIllIlIIllll[9] = 145 ^ 153;
        lIIllIlIIllll[10] = (((45 + 73) - (-11)) + 61) ^ (((31 + 62) - 25) + 115);
        lIIllIlIIllll[11] = (237 ^ 128) ^ (112 ^ 23);
    }

    private static String lIllIIIIIlIIllI(String llllllllllllllIllllIIIIlIlIIlIlI, String llllllllllllllIllllIIIIlIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIlIlIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIlIlIIllII.init(lIIllIlIIllll[3], secretKeySpec);
            return new String(llllllllllllllIllllIIIIlIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIlIIlIll) {
            llllllllllllllIllllIIIIlIlIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.N = squireThievingConfig;
        this.O = squireThieving;
    }

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIlllI = new String[lIIllIlIIllll[11]];
        lIIllIlIIlllI[lIIllIlIIllll[0]] = lIllIIIIIlIIllI("9rvzCVIS1xuNks/VtTWjfBg6t1XsmYkjuCs0S3Qtkf9/Mv/7cihdKA==", "nbxWe");
        lIIllIlIIlllI[lIIllIlIIllll[2]] = lIllIIIIIlIIlll("ChUCGSomWjk6DDFAVxEy", "BzwjO");
        lIIllIlIIlllI[lIIllIlIIllll[3]] = lIllIIIIIlIlIII("1nJk3VUyDPmwepf3U+UeHo0I6hKbp68ObNuHgWBmLuSa7Pw8CFNTvwMgq2abi8dN", "LRPJb");
        lIIllIlIIlllI[lIIllIlIIllll[4]] = lIllIIIIIlIlIII("6JiXMyoCcBRR1GNUC2wumDXFQb4Uz76e0F2XeHGz6N2LNOeTGGRgWZf3a1T2KrPGYrUx+shXmkE=", "WuTDP");
        lIIllIlIIlllI[lIIllIlIIllll[5]] = lIllIIIIIlIlIII("95Qtvdn8sNqt3QSoEmybgQ==", "ZADEJ");
        lIIllIlIIlllI[lIIllIlIIllll[6]] = lIllIIIIIlIlIII("/gEbhUHJ0EPYTZr67Wm+Qg==", "yKFJL");
        lIIllIlIIlllI[lIIllIlIIllll[7]] = lIllIIIIIlIlIII("YjVF/ZO28pM=", "ajguf");
        lIIllIlIIlllI[lIIllIlIIllll[8]] = lIllIIIIIlIIllI("ClJqZCLIlO8=", "rojOu");
        lIIllIlIIlllI[lIIllIlIIllll[9]] = lIllIIIIIlIIlll("FgoHMQ==", "DkiPs");
        lIIllIlIIlllI[lIIllIlIIllll[10]] = lIllIIIIIlIlIII("pM6vvudKthJjWaObSXxoXg==", "dZcSc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private boolean C() {
        World first;
        if (lIllIIIIIlIllII(Shop.isOpen() ? 1 : 0)) {
            Movement.setDestination(Players.getLocal().getWorldLocation());
        }
        int e = this.O.e();
        if (lIllIIIIIllIIIl(Worlds.getCurrentId(), e)) {
            this.O.a(lIIllIlIIllll[1]);
            return lIIllIlIIllll[2];
        }
        if (lIllIIIIIlIllIl(e, lIIllIlIIllll[1])) {
            first = Worlds.getFirst(e);
            "".length();
            if (" ".length() == 0) {
                return ((26 ^ 84) ^ (8 ^ 96)) & (((48 ^ 111) ^ (209 ^ 168)) ^ (-" ".length()));
            }
        } else {
            first = Worlds.getFirst(world -> {
                if (lIllIIIIIlIllII(world.isNormal() ? 1 : 0) && lIllIIIIIllIIIl(world.getLocation(), Worlds.getCurrentWorld().getLocation()) && lIllIIIIIlIllII(world.isMembers() ? 1 : 0) && lIllIIIIIlIlllI(world.getId(), Worlds.getCurrentId())) {
                    ?? r0 = lIIllIlIIllll[2];
                    "".length();
                    return " ".length() == "  ".length() ? ((170 ^ 163) ^ (174 ^ 142)) & (((116 ^ 67) ^ (25 ^ 7)) ^ (-" ".length())) : r0;
                }
                return lIIllIlIIllll[0];
            });
        }
        if (lIllIIIIIllIIII(first)) {
            first = Worlds.getFirst(world2 -> {
                if (lIllIIIIIlIllII(world2.isNormal() ? 1 : 0) && lIllIIIIIlIllII(world2.isMembers() ? 1 : 0) && lIllIIIIIllIIIl(world2.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                    ?? r0 = lIIllIlIIllll[2];
                    "".length();
                    return (((15 ^ 121) ^ (91 ^ 29)) & (((230 ^ 187) ^ (38 ^ 75)) ^ (-" ".length()))) > "   ".length() ? ((((30 + 154) - 74) + 65) ^ (((115 + 78) - 124) + 80)) & (((28 ^ 7) ^ (29 ^ 60)) ^ (-" ".length())) : r0;
                }
                return lIIllIlIIllll[0];
            });
            if (lIllIIIIIllIIII(first)) {
                return lIIllIlIIllll[0];
            }
        }
        Worlds.hopTo(first);
        return lIIllIlIIllll[2];
    }

    private static boolean lIllIIIIIlIlllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIIIIlIllII(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIIllIIll(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIIlIllIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIIIIIlIlIlI();
        lIllIIIIIlIlIIl();
    }

    private static String lIllIIIIIlIIlll(String llllllllllllllIllllIIIIlIllIllII, String llllllllllllllIllllIIIIlIllIlIll) {
        String llllllllllllllIllllIIIIlIllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIIIIlIllIlIIl = llllllllllllllIllllIIIIlIllIlIll.toCharArray();
        int llllllllllllllIllllIIIIlIllIlIII = lIIllIlIIllll[0];
        char[] charArray = llllllllllllllIllllIIIIlIllIllII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllllIIIIlIllIIIII = lIIllIlIIllll[0];
        while (lIllIIIIIllIlII(llllllllllllllIllllIIIIlIllIIIII, length)) {
            char llllllllllllllIllllIIIIlIllIllIl = charArray[llllllllllllllIllllIIIIlIllIIIII];
            sb.append((char) (llllllllllllllIllllIIIIlIllIllIl ^ llllllllllllllIllllIIIIlIllIlIIl[llllllllllllllIllllIIIIlIllIlIII % llllllllllllllIllllIIIIlIllIlIIl.length]));
            "".length();
            llllllllllllllIllllIIIIlIllIlIII++;
            llllllllllllllIllllIIIIlIllIIIII++;
            "".length();
            if ((192 ^ 196) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIIIlIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIIIIIllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIIlIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIIIllIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIIllIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        if (!lIllIIIIIlIlIll(this.N.method(), EnumC0001b.BLACK_JACK) && !lIllIIIIIlIllII(this.O.i() ? 1 : 0)) {
            EnumC0003d b = this.O.b();
            EnumC0002c t = b.t();
            List all = NPCs.getAll(npc -> {
                if (lIllIIIIIlIllII(b.t().p().contains(npc) ? 1 : 0) && lIllIIIIIllIIll(npc.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[5]]) ? 1 : 0) && lIllIIIIIllIIll(npc.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[6]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIllIlIIllll[2]];
                    strArr[lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[7]];
                    if (lIllIIIIIllIIll(npc.hasAction(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIllIlIIllll[2]];
                        strArr2[lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[8]];
                        if (lIllIIIIIllIIll(npc.hasAction(strArr2) ? 1 : 0)) {
                            ?? r0 = lIIllIlIIllll[2];
                            "".length();
                            return ((111 ^ 92) & ((161 ^ 146) ^ (-1))) < ((29 ^ 44) & ((81 ^ 96) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
                return lIIllIlIIllll[0];
            });
            if (lIllIIIIIlIllIl(this.O.e(), lIIllIlIIllll[1]) && lIllIIIIIlIllIl(Worlds.getCurrentId(), this.O.e())) {
                String str = lIIllIlIIlllI[lIIllIlIIllll[0]];
                Object[] objArr = new Object[lIIllIlIIllll[2]];
                objArr[lIIllIlIIllll[0]] = Integer.valueOf(this.O.e());
                Log.info(str, objArr);
                return C();
            } else if (lIllIIIIIlIlllI(all.size(), lIIllIlIIllll[2])) {
                String str2 = lIIllIlIIlllI[lIIllIlIIllll[2]];
                Object[] objArr2 = new Object[lIIllIlIIllll[2]];
                objArr2[lIIllIlIIllll[0]] = all;
                Log.info(str2, objArr2);
                String str3 = lIIllIlIIlllI[lIIllIlIIllll[3]];
                Object[] objArr3 = new Object[lIIllIlIIllll[2]];
                objArr3[lIIllIlIIllll[0]] = Integer.valueOf(all.size());
                Log.info(str3, objArr3);
                return C();
            } else if (lIllIIIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
                if (lIllIIIIIlIllll(Game.getState(), GameState.HOPPING)) {
                    ?? r0 = lIIllIlIIllll[2];
                    "".length();
                    return ((17 ^ 48) ^ (157 ^ 184)) < 0 ? ((((103 + 108) - 116) + 73) ^ (((121 + 28) - 138) + 118)) & (((116 ^ 84) ^ (14 ^ 7)) ^ (-" ".length())) : r0;
                }
                return lIIllIlIIllll[0];
            } else {
                Player local = Players.getLocal();
                Player nearest = Players.getNearest(player -> {
                    if (lIllIIIIIlIlIll(player, local) && lIllIIIIIlIllII(t.p().contains(player) ? 1 : 0) && lIllIIIIIllIIlI(player.getInteracting())) {
                        ?? r02 = lIIllIlIIllll[2];
                        "".length();
                        return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? "  ".length() & ("  ".length() ^ (-1)) : r02;
                    }
                    return lIIllIlIIllll[0];
                });
                if (lIllIIIIIllIIII(nearest)) {
                    return lIIllIlIIllll[0];
                }
                String str4 = lIIllIlIIlllI[lIIllIlIIllll[4]];
                Object[] objArr4 = new Object[lIIllIlIIllll[2]];
                objArr4[lIIllIlIIllll[0]] = nearest.getName();
                Log.info(str4, objArr4);
                return C();
            }
        }
        return lIIllIlIIllll[0];
    }

    private static boolean lIllIIIIIllIIII(Object obj) {
        return obj == null;
    }

    private static String lIllIIIIIlIlIII(String llllllllllllllIllllIIIIlIlIlIlll, String llllllllllllllIllllIIIIlIlIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIllll[9]), "DES");
            Cipher llllllllllllllIllllIIIIlIlIllIIl = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIlIllIIl.init(lIIllIlIIllll[3], llllllllllllllIllllIIIIlIlIllIlI);
            return new String(llllllllllllllIllllIIIIlIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIlIllIII) {
            llllllllllllllIllllIIIIlIlIllIII.printStackTrace();
            return null;
        }
    }
}
