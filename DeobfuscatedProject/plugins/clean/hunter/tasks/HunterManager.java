/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.Angle
 *  net.runelite.api.coords.Direction
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.scene.Tiles
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.BHelper;
import gg.squire.hunter.tasks.GameEnum15;
import gg.squire.hunter.tasks.GameEnum25;
import gg.squire.hunter.tasks.GameEnum16;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import gg.squire.hunter.tasks.GameEnum9;
import gg.squire.hunter.SquireHunter;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.scene.Tiles;

@Singleton
public class HunterManager {
    private final  AtomicLong j;
    private  Instant k;
    
    private final  Map<WorldPoint, f> g;
    private final  SquireHunter h;
    private final  SquireHunterConfig i;
    private  WorldPoint l;

    public AtomicLong i() {
        return this.j;
    }

    private static boolean lIIIllllIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    public void HunterManager(f f2) {
        this.g.remove(f2.o());

    }

        return String.valueOf(var1);
    }

    private static void lIIIlllIlllllIl() {
        llllIIIIlIII = new String[llllIIIlIlIl[17]];
        a.llllIIIIlIII[a.llllIIIlIlIl[1]] = "Set-trap";
        a.llllIIIIlIII[a.llllIIIlIlIl[2]] = "Release";
        a.llllIIIIlIII[a.llllIIIlIlIl[16]] = "Release";
    }

    private static boolean lIIIllllIIIIIll(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint HunterManager(c c2) {
        return c2.HunterManager(this.e()).stream().filter(worldPoint -> {
            boolean bl;
            if (a.lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                bl = llllIIIlIlIl[2];

                if ((0x8E ^ 0x8A) == ((0x32 ^ 0x14) & ~(0x32 ^ 0x14))) {
                    return false;
                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void HunterManager(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        WorldPoint worldPoint = gameObject.getWorldLocation();
        f f2 = this.g.get(worldPoint);
        Player player = Players.getLocal();
        switch (gameObject.getId()) {
            case 9345: 
            case 9380: {
                void var2;
                void var3;
                a var4;
                if (!a.lIIIlllIlllllll(var4.l) || !a.lIIIllllIIIIIII(var3.distanceTo(var4.l))) break;
                var4.g.put((WorldPoint)var3, new f((GameObject)var2));

                var4.k = Instant.now();

                if (((0x6E ^ 0x3A ^ (0xD2 ^ 0xAC)) & (0xAF ^ 0x81 ^ (0xC ^ 8) ^ -1)) < 1) break;
                return;
            }
            case 8731: 
            case 8992: 
            case 9002: 
            case 9343: 
            case 50723: {
                void var2;
                void var3;
                a var4;
                if (!a.lIIIlllIlllllll(var4.l) || !a.lIIIllllIIIIIII(var3.distanceTo(var4.l))) break;
                Direction var5 = new Angle(var2.getOrientation()).getNearestDirection();
                WorldPoint var6 = var3;
                switch (b.m[var5.ordinal()]) {
                    case 1: {
                        var6 = var3.dy(llllIIIlIlIl[0]);

                        if (-1 < 0) break;
                        return;
                    }
                    case 2: {
                        var6 = var3.dx(llllIIIlIlIl[0]);
                    }
                }
                var4.g.put(var6, new f((GameObject)var2));

                var4.k = Instant.now();

                if (-(0x74 ^ 0x70) <= 0) break;
                return;
            }
            case 721: 
            case 8734: 
            case 8986: 
            case 8996: 
            case 9004: 
            case 9348: 
            case 9373: 
            case 9375: 
            case 9377: 
            case 9379: 
            case 9382: 
            case 9383: 
            case 9384: 
            case 19226: 
            case 20648: 
            case 20649: 
            case 20650: 
            case 20651: 
            case 50717: {
                void var7;
                if (!a.lIIIlllIlllllll(var7)) break;
                var7.HunterManager(e.t.r.i.s.h.q.n.r.u.-.u.e.g.FULL);
                var7.n();
                var4.k = Instant.now();

                if (null == null) break;
                return;
            }
            case 9344: 
            case 9385: 
            case 19224: {
                void var7;
                if (!a.lIIIlllIlllllll(var7)) break;
                var7.HunterManager(e.t.r.i.s.h.q.n.r.u.-.u.e.g.EMPTY);
                var7.n();
                var4.k = Instant.now();

                if (-(0x62 ^ 0x66) < 0) break;
                return;
            }
            case 2025: 
            case 2026: 
            case 2028: 
            case 2029: 
            case 8972: 
            case 8974: 
            case 8985: 
            case 8987: 
            case 8993: 
            case 8997: 
            case 9003: 
            case 9005: 
            case 9346: 
            case 9347: 
            case 9349: 
            case 9374: 
            case 9376: 
            case 9378: 
            case 9381: 
            case 9386: 
            case 9387: 
            case 9388: 
            case 9390: 
            case 9391: 
            case 9392: 
            case 9393: 
            case 9394: 
            case 9396: 
            case 9397: 
            case 19218: 
            case 19225: 
            case 19851: 
            case 20128: 
            case 20129: 
            case 20130: 
            case 20131: 
            case 50719: {
                void var7;
                if (!a.lIIIlllIlllllll(var7)) break;
                var7.HunterManager(e.t.r.i.s.h.q.n.r.u.-.u.e.g.TRANSITION);
            }
        }
    }

    private static boolean lIIIllllIIIIlll(int n2) {
        return n2 <= 0;
    }

    public f HunterManager(WorldPoint worldPoint, int n2) {
        return this.g.values().stream().filter(f2 -> {
            boolean bl;
            if (a.lIIIllllIIIlIIl(f2.o().distanceTo(worldPoint), n2)) {
                bl = llllIIIlIlIl[2];

                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(f2 -> f2.o().distanceTo(worldPoint))).orElse(null);
    }

    private static boolean lIIIllllIIIIIII(int n2) {
        return n2 == 0;
    }

    public TileObject f() {
        int[] nArray = new int[llllIIIlIlIl[15]];
        nArray[a.llllIIIlIlIl[1]] = llllIIIlIlIl[3];
        nArray[a.llllIIIlIlIl[2]] = llllIIIlIlIl[4];
        nArray[a.llllIIIlIlIl[16]] = llllIIIlIlIl[5];
        nArray[a.llllIIIlIlIl[17]] = llllIIIlIlIl[6];
        nArray[a.llllIIIlIlIl[18]] = llllIIIlIlIl[7];
        return TileObjects.getNearest((int[])nArray);
    }

    private static boolean lIIIllllIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public HunterManager(SquireHunter squireHunter, SquireHunterConfig squireHunterConfig) {
        this.g = new HashMap<WorldPoint, f>();
        this.j = new AtomicLong(4L);
        this.k = Instant.ofEpochMilli(0L);
        this.h = squireHunter;
        this.i = squireHunterConfig;
    }

    private static boolean lIIIllllIIIlIII(int n2) {
        return n2 > 0;
    }

    public List<TileObject> g() {
        int[] nArray = new int[llllIIIlIlIl[15]];
        nArray[a.llllIIIlIlIl[1]] = llllIIIlIlIl[3];
        nArray[a.llllIIIlIlIl[2]] = llllIIIlIlIl[4];
        nArray[a.llllIIIlIlIl[16]] = llllIIIlIlIl[5];
        nArray[a.llllIIIlIlIl[17]] = llllIIIlIlIl[6];
        nArray[a.llllIIIlIlIl[18]] = llllIIIlIlIl[7];
        return TileObjects.getAll((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void HunterManager(GameTick gameTick) {
        void var8;
        this.j.set(this.j.get() + 1L);
        Iterator<Map.Entry<WorldPoint, f>> iterator = this.g.entrySet().iterator();
        Instant var9 = Instant.now().minus(f.n.multipliedBy(2L));
        while (a.lIIIllllIIIIIIl(var8.hasNext() ? 1 : 0)) {
            Map.Entry var10 = (Map.Entry)var8.next();
            f var11 = (f)var10.getValue();
            WorldPoint var12 = (WorldPoint)var10.getKey();
            if (a.lIIIllllIIIIIIl(var11.p().isBefore(var9) ? 1 : 0)) {
                var8.remove();

                if (2 == 2) continue;
                return;
            }
            Tile var13 = Tiles.getAt((WorldPoint)var12);
            GameObject[] var14 = var13.getGameObjects();
            int var15 = llllIIIlIlIl[1];
            int var16 = llllIIIlIlIl[1];
            GameObject[] var17 = var14;
            int var18 = var17.length;
            int var19 = llllIIIlIlIl[1];
            while (a.lIIIllllIIIIIlI(var19, var18)) {
                GameObject var20 = var17[var19];
                if (a.lIIIlllIlllllll(var20)) {
                    var15 = llllIIIlIlIl[2];
                    if (!(a.lIIIllllIIIIIll(var20.getId(), llllIIIlIlIl[3]) && a.lIIIllllIIIIIll(var20.getId(), llllIIIlIlIl[4]) && a.lIIIllllIIIIIll(var20.getId(), llllIIIlIlIl[5]) && a.lIIIllllIIIIIll(var20.getId(), llllIIIlIlIl[6]) && !a.lIIIllllIIIIlII(var20.getId(), llllIIIlIlIl[7]))) {
                        var16 = llllIIIlIlIl[2];
                    }
                }
                ++var19;

                if (2 <= (0x80 ^ 0x84)) continue;
                return;
            }
            if (!a.lIIIllllIIIIIIl(var15) || a.lIIIllllIIIIIIl(var16)) {
                var8.remove();
            }

            return;
        }
        this.l = Players.getLocal().getWorldLocation();
    }

    private static boolean lIIIlllIlllllll(Object object) {
        return object != null;
    }

    private static boolean lIIIllllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllllIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public Map<WorldPoint, f> h() {
        return this.g;
    }

    public WorldPoint k() {
        return this.l;
    }

    private int e() {
        int n2 = Skills.getLevel((Skill)Skill.HUNTER) / llllIIIlIlIl[14] + llllIIIlIlIl[2];
        if (a.lIIIllllIIIlIII(Game.getWildyLevel()) && a.lIIIllllIIIIIII(Worlds.getCurrentWorld().isAllPkWorld() ? 1 : 0)) {
            ++n2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean d() {
        boolean bl;
        void var21;
        int n2 = llllIIIlIlIl[13];
        Iterator var22 = Inventory.getAll(item -> item.hasAction(llllIIIIlIII[llllIIIlIlIl[16]]::equals)).iterator();
        while (a.lIIIllllIIIIIIl(var22.hasNext() ? 1 : 0)) {
            Item var23 = (Item)var22.next();
            var23.interact(llllIIIIlIII[llllIIIlIlIl[2]]);
            if (a.lIIIllllIIIIlll((int)(--var21))) {
                return llllIIIlIlIl[2];
            }

            if (1 > -1) continue;
            return false;
        }
        if (a.lIIIllllIIIIIlI((int)var21, llllIIIlIlIl[13])) {
            bl = llllIIIlIlIl[2];

            }
        } else {
            bl = llllIIIlIlIl[1];
        }
        return bl;
    }

    public Instant j() {
        return this.k;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var24;
        block7: {
            block6: {
                List<TileObject> list = this.g();
                if (a.lIIIllllIIIIIII(this.b() ? 1 : 0)) {
                    return llllIIIlIlIl[1];
                }
                int[] nArray = new int[llllIIIlIlIl[2]];
                nArray[a.llllIIIlIlIl[1]] = llllIIIlIlIl[11];
                if (!a.lIIIllllIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[llllIIIlIlIl[2]];
                nArray2[a.llllIIIlIlIl[1]] = llllIIIlIlIl[10];
                if (!a.lIIIllllIIIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
            }
            return llllIIIlIlIl[1];
        }
        Iterator var25 = var24.iterator();
        while (a.lIIIllllIIIIIIl(var25.hasNext() ? 1 : 0)) {
            TileObject var26 = (TileObject)var25.next();
            if (a.lIIIllllIIIIllI(var26.distanceTo((Locatable)Players.getLocal()), llllIIIlIlIl[12])) {

                if (-(80 + 28 - -8 + 27 ^ 1 + 106 - 90 + 122) < 0) continue;
                return false;
            }
            String[] stringArray = new String[llllIIIlIlIl[2]];
            stringArray[a.llllIIIlIlIl[1]] = llllIIIIlIII[llllIIIlIlIl[1]];
            return var26.hasAction(stringArray);
        }
        return llllIIIlIlIl[1];
    }

    static {
        a.lIIIlllIllllllI();
        a.lIIIlllIlllllIl();
    }

    private static boolean lIIIllllIIIIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean b() {
        block8: {
            var1_1 = this.i.method();
            var2_2 = a.llllIIIlIlIl[1];
            if (a.lIIIllllIIIIlIl((Object)var1_1, (Object)e.BIRDS)) {
                v0 = new int[a.llllIIIlIlIl[2]];
                v0[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[8];
                var27 = Inventory.contains((int[])v0);
            }
            if (a.lIIIllllIIIIlIl(var28, (Object)e.CHINS)) {
                v1 = new int[a.llllIIIlIlIl[2]];
                v1[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[9];
                var27 = Inventory.contains((int[])v1);
            }
            if (!a.lIIIllllIIIIlIl(var28, (Object)e.SALLIES)) break block8;
            v2 = new int[a.llllIIIlIlIl[2]];
            v2[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[10];
            if (!a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v2))) ** GOTO lbl-1000
            v3 = new int[a.llllIIIlIlIl[2]];
            v3[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[11];
            if (a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v3))) {
                v4 = a.llllIIIlIlIl[2];

                if (-1 >= (46 ^ 42)) {
                    return (boolean)((225 ^ 163) & ~(78 ^ 12));
                }
            } else lbl-1000:
            // 2 sources

            {
                v4 = var27 = a.llllIIIlIlIl[1];
            }
        }
        if (a.lIIIllllIIIIllI(var29 = var30.e(), var30.g.size()) && a.lIIIllllIIIIIIl(var27)) {
            v5 = a.llllIIIlIlIl[2];

            if ((3 & ~3) > 1) {
                return (boolean)((98 ^ 87) & ~(41 ^ 28));
            }
        } else {
            v5 = a.llllIIIlIlIl[1];
        }
        return (boolean)v5;
    }

    private static boolean lIIIllllIIIIIIl(int n2) {
        return n2 != 0;
    }

    public WorldPoint HunterManager(d d2) {
        return d2.HunterManager(this.e()).stream().filter(worldPoint -> {
            boolean bl;
            if (a.lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                bl = llllIIIlIlIl[2];

                if (((0xE2 ^ 0xC3) & ~(0x57 ^ 0x76)) != 0) {
                    return false;
                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }
}

