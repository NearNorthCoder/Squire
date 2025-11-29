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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.FEnum;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.GEnum;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.HEnum;

@Singleton
public class i_Unknown {
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
        i var4;
        void var3;
        Actor actor = animationChanged.getActor();
        if (i.lIllIllIlIIIllI(actor.getAnimation(), lIlIIIIIIIlIl[4])) {
            void var12;
            g[] gArray = g.values();
            int n2 = gArray.length;
            int var13 = lIlIIIIIIIlIl[2];
            while (i.lIllIllIlIIIlIl(var13, (int)var12)) {
                void var5;
                void var18 = var5[var13];
                TileObject var2 = TileObjects.getNearest(arg_0 -> i.a((g)var18, (Actor)var3, arg_0));
                if (i.lIllIllIlIIIIll(var2)) {
                    0;
                    if (((129 + 80 - 64 + 15 ^ 104 + 2 - 19 + 72) & (1 ^ 0x5A ^ (0xEC ^ 0x88) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    var4.t.put((g)var18, (Player)var3);
                    0;
                    0;
                    if (-(60 + 151 - 207 + 155 ^ 15 + 152 - 78 + 66) < 0) break;
                    return;
                }
                ++var13;
                0;
                if (2 != 0) continue;
                return;
            }
        }
        if (i.lIllIllIlIIIlll(var3, Players.getLocal())) {
            return;
        }
        if (!i.lIllIllIlIIlIII(var3.getAnimation(), lIlIIIIIIIlIl[5]) || i.lIllIllIlIIIllI(var3.getAnimation(), lIlIIIIIIIlIl[6])) {
            var4.p();
            var4.r.b(var4.r.b() - lIlIIIIIIIlIl[1]);
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
        g[] var9 = g.values();
        int var17 = var9.length;
        int var11 = lIlIIIIIIIlIl[2];
        while (i.lIllIllIlIIIlIl(var11, var17)) {
            g var16 = var9[var11];
            TileObject var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (i.lIllIllIlIIIlII(var16.a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.EMPTY, (Object)f.d(tileObject.getId()))) {
                    n2 = lIlIIIIIIIlIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIIIIIIIlIl[2];
                }
                return n2 != 0;
            });
            if (i.lIllIllIlIIIIll(var14)) {
                0;
                
                }
            } else {
                i var6;
                var6.t.remove((Object)var16);
                0;
                0;
                if (((98 + 112 - 171 + 92 ^ 136 + 8 - 44 + 83) & (105 + 95 - 127 + 116 ^ 46 + 7 - 6 + 90 ^ -1)) == 0) break;
                return;
            }
            ++var11;
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

    private static String lIllIllIIllllIl(String var7, String var15) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIIIIIIlIl[8], var8);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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
                return false;
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

