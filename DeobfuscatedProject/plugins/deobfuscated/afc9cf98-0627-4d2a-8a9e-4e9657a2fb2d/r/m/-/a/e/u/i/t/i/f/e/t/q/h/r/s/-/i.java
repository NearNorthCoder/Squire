/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

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
import net.runelite.api.Actor;
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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.f;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.g;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.h;

@Singleton
public class i {
    private static final /* synthetic */ int o;
    private final /* synthetic */ SquireTitheFarm r;
    private final /* synthetic */ Map<g, Player> t;
    private static /* synthetic */ String[] lIlIIIIIIIIll;
    private static final /* synthetic */ int q;
    private /* synthetic */ int u;
    private static final /* synthetic */ int p;
    private static /* synthetic */ int[] lIlIIIIIIIlIl;
    private final /* synthetic */ SquireTitheConfig s;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        i llllllllllllllIlllIIlIlIIIIIllIl;
        void llllllllllllllIlllIIlIlIIIIIlIll;
        Actor actor = animationChanged.getActor();
        if (i.lIllIllIlIIIllI(actor.getAnimation(), lIlIIIIIIIlIl[4])) {
            void llllllllllllllIlllIIlIlIIIIIlIIl;
            g[] gArray = g.values();
            int n2 = gArray.length;
            int llllllllllllllIlllIIlIlIIIIIlIII = lIlIIIIIIIlIl[2];
            while (i.lIllIllIlIIIlIl(llllllllllllllIlllIIlIlIIIIIlIII, (int)llllllllllllllIlllIIlIlIIIIIlIIl)) {
                void llllllllllllllIlllIIlIlIIIIIlIlI;
                void llllllllllllllIlllIIlIlIIIIIIlll = llllllllllllllIlllIIlIlIIIIIlIlI[llllllllllllllIlllIIlIlIIIIIlIII];
                TileObject llllllllllllllIlllIIlIlIIIIIIllI = TileObjects.getNearest(arg_0 -> i.a((g)llllllllllllllIlllIIlIlIIIIIIlll, (Actor)llllllllllllllIlllIIlIlIIIIIlIll, arg_0));
                if (i.lIllIllIlIIIIll(llllllllllllllIlllIIlIlIIIIIIllI)) {
                    0;
                    if (((129 + 80 - 64 + 15 ^ 104 + 2 - 19 + 72) & (1 ^ 0x5A ^ (0xEC ^ 0x88) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    llllllllllllllIlllIIlIlIIIIIllIl.t.put((g)llllllllllllllIlllIIlIlIIIIIIlll, (Player)llllllllllllllIlllIIlIlIIIIIlIll);
                    0;
                    0;
                    if (-(60 + 151 - 207 + 155 ^ 15 + 152 - 78 + 66) < 0) break;
                    return;
                }
                ++llllllllllllllIlllIIlIlIIIIIlIII;
                0;
                if (2 != 0) continue;
                return;
            }
        }
        if (i.lIllIllIlIIIlll(llllllllllllllIlllIIlIlIIIIIlIll, Players.getLocal())) {
            return;
        }
        if (!i.lIllIllIlIIlIII(llllllllllllllIlllIIlIlIIIIIlIll.getAnimation(), lIlIIIIIIIlIl[5]) || i.lIllIllIlIIIllI(llllllllllllllIlllIIlIlIIIIIlIll.getAnimation(), lIlIIIIIIIlIl[6])) {
            llllllllllllllIlllIIlIlIIIIIllIl.p();
            llllllllllllllIlllIIlIlIIIIIllIl.r.b(llllllllllllllIlllIIlIlIIIIIllIl.r.b() - lIlIIIIIIIlIl[1]);
        }
    }

    public int v() {
        int[] nArray = new int[lIlIIIIIIIlIl[1]];
        nArray[i.lIlIIIIIIIlIl[2]] = lIlIIIIIIIlIl[3];
        if (i.lIllIllIlIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return this.r.b();
        }
        return Inventory.getAll(item -> item.getName().startsWith(lIlIIIIIIIIll[lIlIIIIIIIlIl[2]])).stream().mapToInt(item -> Math.max(lIlIIIIIIIlIl[2], item.getId() - lIlIIIIIIIlIl[7] - lIlIIIIIIIlIl[1])).sum();
    }

    public void p() {
        int n2;
        this.u = (this.u + lIlIIIIIIIlIl[1]) % this.rotation().o().length;
        g[] gArray = this.rotation().o();
        g g2 = gArray[n2 = (this.u + lIlIIIIIIIlIl[1]) % gArray.length];
        if (i.lIllIllIlIIIIlI(this.t.containsKey((Object)g2) ? 1 : 0) && i.lIllIllIlIIIIll(TileObjects.getNearest(tileObject -> {
            int n3;
            if (i.lIllIllIlIIIlII(gArray[n2].a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                n3 = lIlIIIIIIIlIl[1];
                0;
                if (-2 > 0) {
                    return ((0x40 ^ 0x46 ^ (0x89 ^ 0x84)) & (0x47 ^ 0x74 ^ (0x48 ^ 0x70) ^ -1)) != 0;
                }
            } else {
                n3 = lIlIIIIIIIlIl[2];
            }
            return n3 != 0;
        }))) {
            this.p();
        }
    }

    public int t() {
        return this.rotation().o().length;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (i.lIllIllIlIIIIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.s();
            return;
        }
        g[] llllllllllllllIlllIIlIlIIIIllIlI = g.values();
        int llllllllllllllIlllIIlIlIIIIllIIl = llllllllllllllIlllIIlIlIIIIllIlI.length;
        int llllllllllllllIlllIIlIlIIIIllIII = lIlIIIIIIIlIl[2];
        while (i.lIllIllIlIIIlIl(llllllllllllllIlllIIlIlIIIIllIII, llllllllllllllIlllIIlIlIIIIllIIl)) {
            g llllllllllllllIlllIIlIlIIIIlIlll = llllllllllllllIlllIIlIlIIIIllIlI[llllllllllllllIlllIIlIlIIIIllIII];
            TileObject llllllllllllllIlllIIlIlIIIIlIllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (i.lIllIllIlIIIlII(llllllllllllllIlllIIlIlIIIIlIlll.a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.EMPTY, (Object)f.d(tileObject.getId()))) {
                    n2 = lIlIIIIIIIlIl[1];
                    0;
                    if (null != null) {
                        return ((0x9A ^ 0xAF ^ (0xD5 ^ 0x83)) & (0 ^ 0x2E ^ (0x6B ^ 0x26) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIIIIIIlIl[2];
                }
                return n2 != 0;
            });
            if (i.lIllIllIlIIIIll(llllllllllllllIlllIIlIlIIIIlIllI)) {
                0;
                if (null != null) {
                    return;
                }
            } else {
                i llllllllllllllIlllIIlIlIIIIllIll;
                llllllllllllllIlllIIlIlIIIIllIll.t.remove((Object)llllllllllllllIlllIIlIlIIIIlIlll);
                0;
                0;
                if (((98 + 112 - 171 + 92 ^ 136 + 8 - 44 + 83) & (105 + 95 - 127 + 116 ^ 46 + 7 - 6 + 90 ^ -1)) == 0) break;
                return;
            }
            ++llllllllllllllIlllIIlIlIIIIllIII;
            0;
            if (-3 < 0) continue;
            return;
        }
    }

    private static void lIllIllIlIIIIIl() {
        lIlIIIIIIIlIl = new int[9];
        i.lIlIIIIIIIlIl[0] = -1;
        i.lIlIIIIIIIlIl[1] = 1;
        i.lIlIIIIIIIlIl[2] = (0x55 ^ 0x12 ^ (0x2E ^ 0xA)) & (75 + 50 - 90 + 203 ^ 48 + 64 - 28 + 57 ^ -1);
        i.lIlIIIIIIIlIl[3] = -(0xFFFFD2FF & 0x6D97) & (0xFFFFF4BF & Short.MAX_VALUE);
        i.lIlIIIIIIIlIl[4] = 0xFFFFBBF7 & 0x4CFB;
        i.lIlIIIIIIIlIl[5] = 0xFFFF9FF5 & 0x68FF;
        i.lIlIIIIIIIlIl[6] = 0xFFFFE77F & 0x1BBE;
        i.lIlIIIIIIIlIl[7] = -(0xFFFFFEAF & 0x4979) & (0xFFFFFCFF & 0x5FFB);
        i.lIlIIIIIIIlIl[8] = 2;
    }

    public Map<g, Player> w() {
        return this.t;
    }

    private static void lIllIllIlIIIIII() {
        lIlIIIIIIIIll = new String[lIlIIIIIIIlIl[1]];
        i.lIlIIIIIIIIll[i.lIlIIIIIIIlIl[2]] = i."Watering can";
    }

    public TileObject a(Predicate<TileObject> predicate, int n2) {
        g[] gArray = this.rotation().o();
        int n3 = (this.u + n2) % gArray.length;
        return TileObjects.getNearest(tileObject -> {
            int n3;
            if (i.lIllIllIlIIIlII(gArray[n3].a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIIlII(predicate.test((TileObject)tileObject) ? 1 : 0)) {
                n3 = lIlIIIIIIIlIl[1];
                0;
                if (3 == 0) {
                    return ((0x5A ^ 0x7B ^ (0xE8 ^ 0x9D)) & (0x31 ^ 0x42 ^ (0x3B ^ 0x1C) ^ -1)) != 0;
                }
            } else {
                n3 = lIlIIIIIIIlIl[2];
            }
            return n3 != 0;
        });
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (i.lIllIllIlIIIlll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.s();
        }
    }

    public void s() {
        this.u = this.s.rotation().o().length - lIlIIIIIIIlIl[1];
        this.t.clear();
    }

    public int q() {
        g[] gArray = this.rotation().o();
        return (this.u + lIlIIIIIIIlIl[1]) % gArray.length;
    }

    private static String lIllIllIIllllIl(String llllllllllllllIlllIIlIIlllIlIIlI, String llllllllllllllIlllIIlIIlllIlIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIlllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIlllIlIllI.init(lIlIIIIIIIlIl[8], llllllllllllllIlllIIlIIlllIlIlll);
            return new String(llllllllllllllIlllIIlIIlllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIIlllIlIlIl) {
            llllllllllllllIlllIIlIIlllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    public int u() {
        return TileObjects.getAll(tileObject -> {
            int n2;
            if (i.lIllIllIlIIIlII(Stream.of(this.rotation().o()).anyMatch(g2 -> g2.a((TileObject)tileObject)) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                n2 = lIlIIIIIIIlIl[1];
                0;
                if (null != null) {
                    return ((0x84 ^ 0x97) & ~(0x87 ^ 0x94)) != 0;
                }
            } else {
                n2 = lIlIIIIIIIlIl[2];
            }
            return n2 != 0;
        }).size();
    }

    private static boolean lIllIllIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIlIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIlIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    public TileObject a(String string) {
        return this.a((TileObject tileObject) -> {
            int n2;
            if (i.lIllIllIlIIlIIl((Object)f.d(tileObject.getId()), (Object)this.s.fruit().i())) {
                String[] stringArray = new String[lIlIIIIIIIlIl[1]];
                stringArray[i.lIlIIIIIIIlIl[2]] = string;
                if (i.lIllIllIlIIIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlIl[1];
                    0;
                    if (-1 < (5 ^ 0x40 ^ (0x36 ^ 0x77))) return n2 != 0;
                    return ((0xC9 ^ 0xA7 ^ (0x48 ^ 8)) & (0x95 ^ 0x86 ^ (0x2E ^ 0x13) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIIIIIlIl[2];
            return n2 != 0;
        });
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (i.lIllIllIlIIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String string = chatMessage.getMessage();
    }

    static {
        i.lIllIllIlIIIIIl();
        i.lIllIllIlIIIIII();
        q = lIlIIIIIIIlIl[4];
        p = lIlIIIIIIIlIl[6];
        o = lIlIIIIIIIlIl[5];
    }

    public TileObject a(Predicate<TileObject> predicate) {
        return this.a(predicate, lIlIIIIIIIlIl[1]);
    }

    @Inject
    public i(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig) {
        this.t = new HashMap<g, Player>();
        this.u = lIlIIIIIIIlIl[0];
        this.r = squireTitheFarm;
        this.s = squireTitheConfig;
    }

    private static boolean lIllIllIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public h rotation() {
        return this.s.rotation();
    }

    private static /* synthetic */ boolean a(g g2, Actor actor, TileObject tileObject) {
        int n2;
        if (i.lIllIllIlIIIlII(g2.a(tileObject) ? 1 : 0) && i.lIllIllIlIIIlII(tileObject instanceof GameObject) && i.lIllIllIlIIIlII(((GameObject)tileObject).getWorldArea().isInMeleeDistance(actor.getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIIIIIIIlIl[1];
            0;
            if ((0x3F ^ 0x3B) <= 3) {
                return ((0x77 ^ 0x2D) & ~(0xCC ^ 0x96)) != 0;
            }
        } else {
            n2 = lIlIIIIIIIlIl[2];
        }
        return n2 != 0;
    }

    private static boolean lIllIllIlIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIllIlIIlIIl(Object object, Object object2) {
        return object == object2;
    }

    public g r() {
        g[] gArray = this.rotation().o();
        int n2 = (this.u + lIlIIIIIIIlIl[1]) % gArray.length;
        return gArray[n2];
    }

    private static boolean lIllIllIlIIIIll(Object object) {
        return object == null;
    }
}

