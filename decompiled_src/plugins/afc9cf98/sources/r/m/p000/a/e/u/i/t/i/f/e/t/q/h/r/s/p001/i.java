package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import gg.squire.tithefarm.SquireTitheConfig;
import gg.squire.tithefarm.SquireTitheFarm;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/i.class */
public class i {
    private static final /* synthetic */ int o;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ SquireTitheFarm f0r;
    private static /* synthetic */ String[] lIlIIIIIIIIll;
    private static final /* synthetic */ int q;
    private static final /* synthetic */ int p;
    private static /* synthetic */ int[] lIlIIIIIIIlIl;
    private final /* synthetic */ SquireTitheConfig s;
    private final /* synthetic */ Map<g, Player> t = new HashMap();
    private /* synthetic */ int u = lIlIIIIIIIlIl[0];

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        Player actor = animationChanged.getActor();
        if (lIllIllIlIIIllI(actor.getAnimation(), lIlIIIIIIIlIl[4])) {
            g[] values = g.values();
            int length = values.length;
            int i = lIlIIIIIIIlIl[2];
            do {
                if (lIllIllIlIIIlIl(i, length)) {
                    g gVar = values[i];
                    if (lIllIllIlIIIIll(TileObjects.getNearest(tileObject -> {
                        if (lIllIllIlIIIlII(gVar.a(tileObject) ? 1 : 0) && lIllIllIlIIIlII(tileObject instanceof GameObject ? 1 : 0) && lIllIllIlIIIlII(((GameObject) tileObject).getWorldArea().isInMeleeDistance(actor.getWorldLocation()) ? 1 : 0)) {
                            ?? r0 = lIlIIIIIIIlIl[1];
                            "".length();
                            return (63 ^ 59) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIIIIIIlIl[2];
                    }))) {
                        "".length();
                        if ((((((129 + 80) - 64) + 15) ^ (((104 + 2) - 19) + 72)) & (((1 ^ 90) ^ (236 ^ 136)) ^ (-" ".length()))) != 0) {
                            return;
                        }
                        i++;
                        "".length();
                    } else {
                        this.t.put(gVar, actor);
                        "".length();
                        "".length();
                        if ((-((((60 + 151) - 207) + 155) ^ (((15 + 152) - 78) + 66))) >= 0) {
                            return;
                        }
                    }
                }
            } while ("  ".length() != 0);
            return;
        }
        if (lIllIllIlIIIlll(actor, Players.getLocal())) {
            return;
        }
        if (!lIllIllIlIIlIII(actor.getAnimation(), lIlIIIIIIIlIl[5]) || lIllIllIlIIIllI(actor.getAnimation(), lIlIIIIIIIlIl[6])) {
            p();
            this.f0r.b(this.f0r.b() - lIlIIIIIIIlIl[1]);
        }
    }

    public int v() {
        int[] iArr = new int[lIlIIIIIIIlIl[1]];
        iArr[lIlIIIIIIIlIl[2]] = lIlIIIIIIIlIl[3];
        return lIllIllIlIIIlII(Inventory.contains(iArr) ? 1 : 0) ? this.f0r.b() : Inventory.getAll(item -> {
            return item.getName().startsWith(lIlIIIIIIIIll[lIlIIIIIIIlIl[2]]);
        }).stream().mapToInt(item2 -> {
            return Math.max(lIlIIIIIIIlIl[2], (item2.getId() - lIlIIIIIIIlIl[7]) - lIlIIIIIIIlIl[1]);
        }).sum();
    }

    public void p() {
        this.u = (this.u + lIlIIIIIIIlIl[1]) % rotation().o().length;
        g[] o2 = rotation().o();
        int length = (this.u + lIlIIIIIIIlIl[1]) % o2.length;
        if (lIllIllIlIIIIlI(this.t.containsKey(o2[length]) ? 1 : 0) && lIllIllIlIIIIll(TileObjects.getNearest(tileObject -> {
            if (lIllIllIlIIIlII(o2[length].a(tileObject) ? 1 : 0) && lIllIllIlIIlIIl(f.d(tileObject.getId()), f.EMPTY)) {
                ?? r0 = lIlIIIIIIIlIl[1];
                "".length();
                return (-"  ".length()) > 0 ? ((64 ^ 70) ^ (137 ^ 132)) & (((71 ^ 116) ^ (72 ^ 112)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIIIIlIl[2];
        }))) {
            p();
        }
    }

    public int t() {
        return rotation().o().length;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIllIllIlIIIIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            s();
            return;
        }
        g[] values = g.values();
        int length = values.length;
        int i = lIlIIIIIIIlIl[2];
        while (lIllIllIlIIIlIl(i, length)) {
            g gVar = values[i];
            if (!lIllIllIlIIIIll(TileObjects.getNearest(tileObject -> {
                if (lIllIllIlIIIlII(gVar.a(tileObject) ? 1 : 0) && lIllIllIlIIlIIl(f.EMPTY, f.d(tileObject.getId()))) {
                    ?? r0 = lIlIIIIIIIlIl[1];
                    "".length();
                    return 0 != 0 ? ((154 ^ 175) ^ (213 ^ 131)) & (((0 ^ 46) ^ (107 ^ 38)) ^ (-" ".length())) : r0;
                }
                return lIlIIIIIIIlIl[2];
            }))) {
                this.t.remove(gVar);
                "".length();
                "".length();
                if ((((((98 + 112) - 171) + 92) ^ (((136 + 8) - 44) + 83)) & (((((105 + 95) - 127) + 116) ^ (((46 + 7) - 6) + 90)) ^ (-" ".length()))) != 0) {
                    return;
                }
                return;
            }
            "".length();
            if (0 != 0) {
                return;
            }
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return;
            }
        }
    }

    private static void lIllIllIlIIIIIl() {
        lIlIIIIIIIlIl = new int[9];
        lIlIIIIIIIlIl[0] = -" ".length();
        lIlIIIIIIIlIl[1] = " ".length();
        lIlIIIIIIIlIl[2] = ((85 ^ 18) ^ (46 ^ 10)) & (((((75 + 50) - 90) + 203) ^ (((48 + 64) - 28) + 57)) ^ (-" ".length()));
        lIlIIIIIIIlIl[3] = (-((-11521) & 28055)) & (-2881) & 32767;
        lIlIIIIIIIlIl[4] = (-17417) & 19707;
        lIlIIIIIIIlIl[5] = (-24587) & 26879;
        lIlIIIIIIIlIl[6] = (-6273) & 7102;
        lIlIIIIIIIlIl[7] = (-((-337) & 18809)) & (-769) & 24571;
        lIlIIIIIIIlIl[8] = "  ".length();
    }

    public Map<g, Player> w() {
        return this.t;
    }

    private static void lIllIllIlIIIIII() {
        lIlIIIIIIIIll = new String[lIlIIIIIIIlIl[1]];
        lIlIIIIIIIIll[lIlIIIIIIIlIl[2]] = lIllIllIIllllIl("kCMubeL3wR5dNN/PKDKSQg==", "tJqjC");
    }

    public TileObject a(Predicate<TileObject> predicate, int i) {
        g[] o2 = rotation().o();
        int length = (this.u + i) % o2.length;
        return TileObjects.getNearest(tileObject -> {
            if (lIllIllIlIIIlII(o2[length].a(tileObject) ? 1 : 0) && lIllIllIlIIIlII(predicate.test(tileObject) ? 1 : 0)) {
                ?? r0 = lIlIIIIIIIlIl[1];
                "".length();
                return "   ".length() == 0 ? ((90 ^ 123) ^ (232 ^ 157)) & (((49 ^ 66) ^ (59 ^ 28)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIIIIlIl[2];
        });
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIllIllIlIIIlll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            s();
        }
    }

    public void s() {
        this.u = this.s.rotation().o().length - lIlIIIIIIIlIl[1];
        this.t.clear();
    }

    public int q() {
        return (this.u + lIlIIIIIIIlIl[1]) % rotation().o().length;
    }

    private static String lIllIllIIllllIl(String llllllllllllllIlllIIlIIlllIlIlII, String llllllllllllllIlllIIlIIlllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIlllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIlllIlIllI.init(lIlIIIIIIIlIl[8], llllllllllllllIlllIIlIIlllIlIlll);
            return new String(llllllllllllllIlllIIlIIlllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIlllIlIlIl) {
            llllllllllllllIlllIIlIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlIIlIII(int i, int i2) {
        return i != i2;
    }

    public int u() {
        return TileObjects.getAll(tileObject -> {
            if (lIllIllIlIIIlII(Stream.of((Object[]) rotation().o()).anyMatch(gVar -> {
                return gVar.a(tileObject);
            }) ? 1 : 0) && lIllIllIlIIlIIl(f.d(tileObject.getId()), f.EMPTY)) {
                ?? r0 = lIlIIIIIIIlIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIIIlIl[2];
        }).size();
    }

    private static boolean lIllIllIlIIIlII(int i) {
        return i != 0;
    }

    private static boolean lIllIllIlIIIIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIllIlIIIllI(int i, int i2) {
        return i == i2;
    }

    public TileObject a(String str) {
        return a(tileObject -> {
            if (lIllIllIlIIlIIl(f.d(tileObject.getId()), this.s.fruit().i())) {
                String[] strArr = new String[lIlIIIIIIIlIl[1]];
                strArr[lIlIIIIIIIlIl[2]] = str;
                if (lIllIllIlIIIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIIlIl[1];
                    "".length();
                    return (-" ".length()) >= ((5 ^ 64) ^ (54 ^ 119)) ? ((201 ^ 167) ^ (72 ^ 8)) & (((149 ^ 134) ^ (46 ^ 19)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIIIIIlIl[2];
        });
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIllIlIIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        chatMessage.getMessage();
    }

    static {
        lIllIllIlIIIIIl();
        lIllIllIlIIIIII();
        q = lIlIIIIIIIlIl[4];
        p = lIlIIIIIIIlIl[6];
        o = lIlIIIIIIIlIl[5];
    }

    public TileObject a(Predicate<TileObject> predicate) {
        return a(predicate, lIlIIIIIIIlIl[1]);
    }

    @Inject
    public i(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig) {
        this.f0r = squireTitheFarm;
        this.s = squireTitheConfig;
    }

    private static boolean lIllIllIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    public h rotation() {
        return this.s.rotation();
    }

    private static boolean lIllIllIlIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIllIlIIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public g r() {
        g[] o2 = rotation().o();
        return o2[(this.u + lIlIIIIIIIlIl[1]) % o2.length];
    }

    private static boolean lIllIllIlIIIIll(Object obj) {
        return obj == null;
    }
}
