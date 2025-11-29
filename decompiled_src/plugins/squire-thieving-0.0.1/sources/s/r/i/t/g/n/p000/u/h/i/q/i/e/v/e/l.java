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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
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
@TaskDesc(name = "Buying wines", priority = 6, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.l  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/l.class */
public class l extends Task {
    private static final /* synthetic */ WorldArea G;
    private static /* synthetic */ int[] lIIllIllIlIII;
    private static /* synthetic */ String[] lIIllIllIIlll;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ WorldPoint F;
    private final /* synthetic */ SquireThievingConfig I;
    private /* synthetic */ boolean K;
    private final /* synthetic */ SquireThieving J;

    private static void lIllIIIlIlIIlIl() {
        lIIllIllIlIII = new int[20];
        lIIllIllIlIII[0] = ((239 ^ 145) ^ (192 ^ 167)) & (((212 ^ 199) ^ (207 ^ 197)) ^ (-" ".length()));
        lIIllIllIlIII[1] = " ".length();
        lIIllIllIlIII[2] = (-24597) & 26589;
        lIIllIllIlIII[3] = (200 ^ 138) ^ (249 ^ 160);
        lIIllIllIlIII[4] = (206 ^ 182) ^ (44 ^ 81);
        lIIllIllIlIII[5] = "  ".length();
        lIIllIllIlIII[6] = "   ".length();
        lIIllIllIlIII[7] = 187 ^ 191;
        lIIllIllIlIII[8] = (-((-25707) & 25983)) & (-20490) & 32639;
        lIIllIllIlIII[9] = 63 ^ 57;
        lIIllIllIlIII[10] = 26 ^ 29;
        lIIllIllIlIII[11] = (5 ^ 90) ^ (118 ^ 33);
        lIIllIllIlIII[12] = (186 ^ 155) ^ (144 ^ 184);
        lIIllIllIlIII[13] = (((115 + 132) - 179) + 71) ^ (((75 + 98) - 112) + 68);
        lIIllIllIlIII[14] = (((51 + 106) - 149) + 165) ^ (((128 + 51) - 107) + 94);
        lIIllIllIlIII[15] = (-((-23083) & 31275)) & (-16898) & 28447;
        lIIllIllIlIII[16] = (-(107 ^ 73)) & (-21505) & 24493;
        lIIllIllIlIII[17] = (-4773) & 8125;
        lIIllIllIlIII[18] = (-((-547) & 13943)) & (-16385) & 32734;
        lIIllIllIlIII[19] = (((137 + 123) - 157) + 66) ^ (((77 + 159) - 180) + 109);
    }

    private static boolean lIllIIIlIlIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIllIIIlIlIIlII() {
        lIIllIllIIlll = new String[lIIllIllIlIII[19]];
        lIIllIllIIlll[lIIllIllIlIII[0]] = lIllIIIlIlIIIIl("i84El5v3rFCLavha9/TY48LEeq06wS1l8y8o8R93wL3QnrKqFSqgq4mayezsUwbv", "PZUqr");
        lIIllIllIIlll[lIIllIllIlIII[1]] = lIllIIIlIlIIIIl("Wgyq36JDJLQ9IV5F6C+KQagMgPPbQslpfQcF0KR7fURg2OHfx4823qOQdkOh4XiB", "VVnJG");
        lIIllIllIIlll[lIIllIllIlIII[5]] = lIllIIIlIlIIIlI("JCwvKAAJZC5kAg4tPmQFCWMUFCdHNzVkCBIxP2pETxcoPQ0JJHowC0cvPyUSAmMyKxEUJnM=", "gCZDd");
        lIIllIllIIlll[lIIllIllIlIII[6]] = lIllIIIlIlIIIll("JKg375iNDY0=", "RwXJJ");
        lIIllIllIIlll[lIIllIllIlIII[7]] = lIllIIIlIlIIIIl("rAfsmPdCtjs=", "RGVCQ");
        lIIllIllIIlll[lIIllIllIlIII[4]] = lIllIIIlIlIIIll("YcE3znoKo0M=", "tCoxF");
        lIIllIllIIlll[lIIllIllIlIII[9]] = lIllIIIlIlIIIlI("PhIjDDEHFG8TN0kHJwJ4CxI9CjkH", "isOgX");
        lIIllIllIIlll[lIIllIllIlIII[10]] = lIllIIIlIlIIIlI("OhYyAjoAA3MEMhxENBMq", "ndSfS");
        lIIllIllIIlll[lIIllIllIlIII[11]] = lIllIIIlIlIIIIl("UM2sZzpU6GI=", "tXxTU");
        lIIllIllIIlll[lIIllIllIlIII[12]] = lIllIIIlIlIIIIl("XHkbbgykgF0=", "byMfA");
        lIIllIllIIlll[lIIllIllIlIII[13]] = lIllIIIlIlIIIlI("OhEMDxc=", "ncmkr");
        lIIllIllIIlll[lIIllIllIlIII[14]] = lIllIIIlIlIIIlI("OyYvB3wbKA==", "oGClQ");
    }

    private static String lIllIIIlIlIIIlI(String llllllllllllllIlllIlllIlllllIllI, String llllllllllllllIlllIlllIlllllIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlllllIlII = new StringBuilder();
        char[] llllllllllllllIlllIlllIlllllIIll = llllllllllllllIlllIlllIlllllIlIl.toCharArray();
        int llllllllllllllIlllIlllIlllllIIlI = lIIllIllIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIlIII[0];
        while (lIllIIIlIlIlIlI(i, length)) {
            llllllllllllllIlllIlllIlllllIlII.append((char) (charArray[i] ^ llllllllllllllIlllIlllIlllllIIll[llllllllllllllIlllIlllIlllllIIlI % llllllllllllllIlllIlllIlllllIIll.length]));
            "".length();
            llllllllllllllIlllIlllIlllllIIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIlllllIlII);
    }

    private static String lIllIIIlIlIIIll(String llllllllllllllIlllIllllIIIIlIIll, String llllllllllllllIlllIllllIIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllIlIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIIIIlIlII) {
            llllllllllllllIlllIllllIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIlIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIlIlIIlll(int i) {
        return i == 0;
    }

    private static boolean lIllIIIlIlIlIII(int i) {
        return i != 0;
    }

    private static String lIllIIIlIlIIIIl(String llllllllllllllIlllIllllIIIIIIllI, String llllllllllllllIlllIllllIIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIII[11]), "DES");
            Cipher llllllllllllllIlllIllllIIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIIIIIlIII.init(lIIllIllIlIII[5], secretKeySpec);
            return new String(llllllllllllllIlllIllllIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIIIIIIlll) {
            llllllllllllllIlllIllllIIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    public l(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.I = squireThievingConfig;
        this.J = squireThieving;
    }

    private static boolean lIllIIIlIlIlIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v139, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v45, types: [boolean] */
    public boolean run() {
        if (lIllIIIlIlIIllI(Game.getState(), GameState.LOGGED_IN) && lIllIIIlIlIIllI(this.I.method(), EnumC0001b.BLACK_JACK) && !lIllIIIlIlIIlll(this.I.buyWines() ? 1 : 0)) {
            if (lIllIIIlIlIIlll(Inventory.getCount(item -> {
                return item.hasAction(C0010k.z);
            }))) {
                this.J.a((boolean) lIIllIllIlIII[1]);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((((139 + 34) - (-23)) + 0) ^ (((14 + 76) - 82) + 147)) & (((177 ^ 183) ^ (10 ^ 83)) ^ (-" ".length()));
                }
            } else if (lIllIIIlIlIIlll(Inventory.getFreeSlots())) {
                this.J.a((boolean) lIIllIllIlIII[0]);
            }
            if (lIllIIIlIlIIlll(this.J.i() ? 1 : 0)) {
                return lIIllIllIlIII[0];
            }
            if (lIllIIIlIlIlIII(Shop.isOpen() ? 1 : 0)) {
                if (!lIllIIIlIlIIlll(Shop.getStock(lIIllIllIlIII[2]))) {
                    Shop.buyFifty(lIIllIllIlIII[2]);
                    return lIIllIllIlIII[1];
                }
                this.K = lIIllIllIlIII[1];
                Keyboard.type(lIIllIllIlIII[3]);
                return lIIllIllIlIII[1];
            } else if (lIllIIIlIlIlIII(this.K ? 1 : 0)) {
                int currentId = Worlds.getCurrentId();
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (lIllIIIlIlIlIII(world.isNormal() ? 1 : 0) && lIllIIIlIlIlIII(world.isMembers() ? 1 : 0) && lIllIIIlIlIllII(world.getId(), currentId)) {
                        ?? r0 = lIIllIllIlIII[1];
                        "".length();
                        return (62 ^ 58) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllIlIII[0];
                }));
                this.K = lIIllIllIlIII[0];
                return lIIllIllIlIII[1];
            } else if (lIllIIIlIlIIlll(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return lIIllIllIlIII[1];
            } else {
                Player local = Players.getLocal();
                WorldPoint worldLocation = local.getWorldLocation();
                EnumC0002c t = this.J.b().t();
                TileObject a = this.J.a(t, (boolean) lIIllIllIlIII[0]);
                WorldArea[] worldAreaArr = new WorldArea[lIIllIllIlIII[1]];
                worldAreaArr[lIIllIllIlIII[0]] = t.p();
                if (lIllIIIlIlIIlll(worldLocation.isInArea(worldAreaArr) ? 1 : 0) && lIllIIIlIlIlIIl(a) && lIllIIIlIlIlIlI(a.distanceTo(local), lIIllIllIlIII[4])) {
                    Log.info(lIIllIllIIlll[lIIllIllIlIII[0]]);
                    this.J.a(local, (boolean) lIIllIllIlIII[0]);
                    "".length();
                    return lIIllIllIlIII[1];
                } else if (lIllIIIlIlIIlll(Movement.shouldWalk() ? 1 : 0)) {
                    return lIIllIllIlIII[0];
                } else {
                    EnumC0002c b = EnumC0002c.b(local.getWorldLocation());
                    if (lIllIIIlIlIlIll(b)) {
                        Log.info(lIIllIllIIlll[lIIllIllIlIII[1]]);
                        b = this.J.b().t();
                    }
                    EnumC0002c enumC0002c = b;
                    if (lIllIIIlIlIlIII(b.p().contains(local) ? 1 : 0)) {
                        if (lIllIIIlIlIlIIl(this.J.a(b, (boolean) lIIllIllIlIII[1]))) {
                            return this.J.a(local, (boolean) lIIllIllIlIII[1]);
                        }
                        NPC nearest = NPCs.getNearest(npc -> {
                            if (lIllIIIlIlIlIIl(npc)) {
                                WorldPoint worldLocation2 = npc.getWorldLocation();
                                WorldArea[] worldAreaArr2 = new WorldArea[lIIllIllIlIII[1]];
                                worldAreaArr2[lIIllIllIlIII[0]] = enumC0002c.p();
                                if (lIllIIIlIlIIlll(worldLocation2.isInArea(worldAreaArr2) ? 1 : 0)) {
                                    String[] strArr = new String[lIIllIllIlIII[1]];
                                    strArr[lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[12]];
                                    if (lIllIIIlIlIIlll(npc.hasAction(strArr) ? 1 : 0)) {
                                        String[] strArr2 = new String[lIIllIllIlIII[1]];
                                        strArr2[lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[13]];
                                        if (lIllIIIlIlIIlll(npc.hasAction(strArr2) ? 1 : 0)) {
                                            String[] strArr3 = new String[lIIllIllIlIII[1]];
                                            strArr3[lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[14]];
                                        }
                                    }
                                    ?? r0 = lIIllIllIlIII[1];
                                    "".length();
                                    return ((72 ^ 114) ^ (104 ^ 86)) <= (-" ".length()) ? ((((50 + 51) - 28) + 155) ^ (((106 + 121) - 135) + 101)) & (((82 ^ 116) ^ "   ".length()) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIllIllIlIII[0];
                        });
                        if (lIllIIIlIlIlIll(nearest)) {
                            Log.info(lIIllIllIIlll[lIIllIllIlIII[5]]);
                            return lIIllIllIlIII[0];
                        }
                        String[] strArr = new String[lIIllIllIlIII[6]];
                        strArr[lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[6]];
                        strArr[lIIllIllIlIII[1]] = lIIllIllIIlll[lIIllIllIlIII[7]];
                        strArr[lIIllIllIlIII[5]] = lIIllIllIIlll[lIIllIllIlIII[4]];
                        nearest.interact(strArr);
                    }
                    int[] iArr = new int[lIIllIllIlIII[1]];
                    iArr[lIIllIllIlIII[0]] = lIIllIllIlIII[8];
                    NPC nearest2 = NPCs.getNearest(iArr);
                    if (lIllIIIlIlIlIll(nearest2)) {
                        Log.info(lIIllIllIIlll[lIIllIllIlIII[9]]);
                        Movement.walkTo(G.getRandom(), (boolean) lIIllIllIlIII[0]);
                        "".length();
                        "".length();
                        if ((((((139 + 57) - 105) + 154) ^ (((22 + 68) - (-7)) + 87)) & (((228 ^ 159) ^ (164 ^ 146)) ^ (-" ".length()))) >= "  ".length()) {
                            return ((74 ^ 90) ^ (227 ^ 188)) & (((((54 + 224) - 256) + 218) ^ (((156 + 96) - 77) + 16)) ^ (-" ".length()));
                        }
                    } else {
                        Log.info(lIIllIllIIlll[lIIllIllIlIII[10]]);
                        nearest2.interact(lIIllIllIIlll[lIIllIllIlIII[11]]);
                    }
                    return lIIllIllIlIII[1];
                }
            }
        }
        return lIIllIllIlIII[0];
    }

    private static boolean lIllIIIlIlIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIllIIIlIlIIlIl();
        lIllIIIlIlIIlII();
        H = lIIllIllIlIII[8];
        F = new WorldPoint(lIIllIllIlIII[15], lIIllIllIlIII[16], lIIllIllIlIII[0]);
        G = new WorldArea(lIIllIllIlIII[17], lIIllIllIlIII[18], lIIllIllIlIII[14], lIIllIllIlIII[10], lIIllIllIlIII[0]);
    }

    private static boolean lIllIIIlIlIllII(int i, int i2) {
        return i != i2;
    }
}
