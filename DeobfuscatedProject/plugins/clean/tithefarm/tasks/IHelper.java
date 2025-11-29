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
package gg.squire.tithefarm.tasks;

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
import gg.squire.tithefarm.tasks.GameEnum17;
import gg.squire.tithefarm.tasks.GameEnum;
import gg.squire.tithefarm.tasks.GameEnum19;

@Singleton
public class IHelper {
    private static final  int o;
    private final  SquireTitheFarm r;
    private final  Map<g, Player> t;
    
    private static final  int q;
    private  int u;
    private static final  int p;
    
    private final  SquireTitheConfig s;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        i var1;
        void var2;
        Actor actor = animationChanged.getActor();
        if (i.lIllIllIlIIIllI(actor.getAnimation(), lIlIIIIIIIlIl[4])) {
            void var3;
            g[] gArray = g.values();
            int n2 = gArray.length;
            int var4 = lIlIIIIIIIlIl[2];
            while (i.lIllIllIlIIIlIl(var4, (int)var3)) {
                void var5;
                void var6 = var5[var4];
                TileObject var7 = TileObjects.getNearest(arg_0 -> i.a((GameEnum) ar6, (Actor)var2, arg_0));
                if (i.lIllIllIlIIIIll(var7)) {

                    if (((129 + 80 - 64 + 15 ^ 104 + 2 - 19 + 72) & (1 ^ 0x5A ^ (0xEC ^ 0x88) ^ -1)) != 0) {
                        return;
                    }
                } else {
                    var1.t.put((GameEnum) ar6, (Player)var2);

                    if (-(60 + 151 - 207 + 155 ^ 15 + 152 - 78 + 66) < 0) break;
                    return;
                }
                ++var4;

                if (2 != 0) continue;
                return;
            }
        }
        if (i.lIllIllIlIIIlll(var2, Players.getLocal())) {
            return;
        }
        if (!i.lIllIllIlIIlIII(var2.getAnimation(), lIlIIIIIIIlIl[5]) || i.lIllIllIlIIIllI(var2.getAnimation(), lIlIIIIIIIlIl[6])) {
            var1.p();
            var1.r.b(var1.r.b() - lIlIIIIIIIlIl[1]);
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
        g[] var8 = g.values();
        int var9 = var8.length;
        int var10 = lIlIIIIIIIlIl[2];
        while (i.lIllIllIlIIIlIl(var10, var9)) {
            g var11 = var8[var10];
            TileObject var12 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (i.lIllIllIlIIIlII(var11.a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.EMPTY, (Object)f.d(tileObject.getId()))) {
                    n2 = lIlIIIIIIIlIl[1];

                    }
                } else {
                    n2 = lIlIIIIIIIlIl[2];
                }
                return n2 != 0;
            });
            if (i.lIllIllIlIIIIll(var12)) {

                }
            } else {
                i var13;
                var13.t.remove((Object)var11);

                if (((98 + 112 - 171 + 92 ^ 136 + 8 - 44 + 83) & (105 + 95 - 127 + 116 ^ 46 + 7 - 6 + 90 ^ -1)) == 0) break;
                return;
            }
            ++var10;

            if (-3 < 0) continue;
            return;
        }
    }

    public Map<g, Player> w() {
        return this.t;
    }

    private static void lIllIllIlIIIIII() {
        lIlIIIIIIIIll = new String[lIlIIIIIIIlIl[1]];
        i.lIlIIIIIIIIll[i.lIlIIIIIIIlIl[2]] = "Watering can";
    }

    public TileObject a(Predicate<TileObject> predicate, int n2) {
        g[] gArray = this.rotation().o();
        int n3 = (this.u + n2) % gArray.length;
        return TileObjects.getNearest(tileObject -> {
            int n3;
            if (i.lIllIllIlIIIlII(gArray[n3].a((TileObject)tileObject) ? 1 : 0) && i.lIllIllIlIIIlII(predicate.test((TileObject)tileObject) ? 1 : 0)) {
                n3 = lIlIIIIIIIlIl[1];

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

    private static boolean lIllIllIlIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    public int u() {
        return TileObjects.getAll(tileObject -> {
            int n2;
            if (i.lIllIllIlIIIlII(Stream.of(this.rotation().o()).anyMatch(g2 -> g2.a((TileObject)tileObject)) ? 1 : 0) && i.lIllIllIlIIlIIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                n2 = lIlIIIIIIIlIl[1];

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
            if (i.lIllIllIlIIlIIl((Object)f.d(tileObject.getId()), (Object)this.s.fruit().IHelper())) {
                String[] stringArray = new String[lIlIIIIIIIlIl[1]];
                stringArray[i.lIlIIIIIIIlIl[2]] = string;
                if (i.lIllIllIlIIIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlIl[1];

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
    public IHelper(SquireTitheFarm squireTitheFarm, SquireTitheConfig squireTitheConfig) {
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

    private static  boolean a(g g2, Actor actor, TileObject tileObject) {
        int n2;
        if (i.lIllIllIlIIIlII(g2.a(tileObject) ? 1 : 0) && i.lIllIllIlIIIlII(tileObject instanceof GameObject) && i.lIllIllIlIIIlII(((GameObject)tileObject).getWorldArea().isInMeleeDistance(actor.getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIIIIIIIlIl[1];

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

