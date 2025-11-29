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
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.b_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.CEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.DEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum;
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
public class a_Unknown {
    private final /* synthetic */ AtomicLong j;
    private /* synthetic */ Instant k;
    private static /* synthetic */ String[] llllIIIIlIII;
    private final /* synthetic */ Map<WorldPoint, f> g;
    private final /* synthetic */ SquireHunter h;
    private final /* synthetic */ SquireHunterConfig i;
    private /* synthetic */ WorldPoint l;
    private static /* synthetic */ int[] llllIIIlIlIl;

    public AtomicLong i() {
        return this.j;
    }

    private static boolean lIIIllllIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    public void a(f f2) {
        this.g.remove(f2.o());
        0;
    }

    private static String lIIIlllIlllllII(String var34, String var24) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var45 = new StringBuilder();
        char[] var8 = var24.toCharArray();
        int var43 = llllIIIlIlIl[1];
        char[] var7 = var34.toCharArray();
        int var14 = var7.length;
        int var33 = llllIIIlIlIl[1];
        while (a.lIIIllllIIIIIlI(var33, var14)) {
            char var2 = var7[var33];
            var45.append((char)(var2 ^ var8[var43 % var8.length]));
            0;
            ++var43;
            ++var33;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var45);
    }

    private static void lIIIlllIllllllI() {
        llllIIIlIlIl = new int[19];
        a.llllIIIlIlIl[0] = -1;
        a.llllIIIlIlIl[1] = (0xF5 ^ 0xA9 ^ (0x17 ^ 0xB)) & (0x3C ^ 0 ^ (0x78 ^ 4) ^ -1);
        a.llllIIIlIlIl[2] = 1;
        a.llllIIIlIlIl[3] = -(0xFFFFFDAF & 0x5E72) & (0xFFFFFEBD & 0x7F7F);
        a.llllIIIlIlIl[4] = 0xFFFFB7BF & 0x6B5E;
        a.llllIIIlIlIl[5] = -(0xFFFFCFDF & 0x74A1) & (0xFFFFFFAC & 0x67FB);
        a.llllIIIlIlIl[6] = 0xFFFFAFFD & 0x747F;
        a.llllIIIlIlIl[7] = -(0xFFFFFCDB & 0x2BEF) & (0xFFFFEFFB & 0xFEEF);
        a.llllIIIlIlIl[8] = -(0xFFFF99FB & 0x764D) & (0xFFFFB77F & 0x7FDE);
        a.llllIIIlIlIl[9] = -(0xFFFFD3F7 & 0x6CEE) & (0xFFFFF7FD & 0x6FFF);
        a.llllIIIlIlIl[10] = -(0xFFFFBEFD & 0x5BD3) & (0xFFFFDBFF & 0x3FFF);
        a.llllIIIlIlIl[11] = -(0xFFFFFF0B & 0x7CF5) & (0xFFFFFFBB & 0x7FFE);
        a.llllIIIlIlIl[12] = 0x74 ^ 0x78 ^ (0x2F ^ 7) & ~(0xF ^ 0x27);
        a.llllIIIlIlIl[13] = 0 ^ 8;
        a.llllIIIlIlIl[14] = 9 ^ 0x71 ^ (0xC ^ 0x60);
        a.llllIIIlIlIl[15] = 9 ^ 0xC;
        a.llllIIIlIlIl[16] = 2;
        a.llllIIIlIlIl[17] = 3;
        a.llllIIIlIlIl[18] = 0x38 ^ 0x66 ^ (0xCD ^ 0x97);
    }

    private static void lIIIlllIlllllIl() {
        llllIIIIlIII = new String[llllIIIlIlIl[17]];
        a.llllIIIIlIII[a.llllIIIlIlIl[1]] = a."Set-trap";
        a.llllIIIIlIII[a.llllIIIlIlIl[2]] = a."Release";
        a.llllIIIIlIII[a.llllIIIlIlIl[16]] = a."Release";
    }

    private static boolean lIIIllllIIIIIll(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint a(c c2) {
        return c2.a(this.e()).stream().filter(worldPoint -> {
            boolean bl;
            if (a.lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                bl = llllIIIlIlIl[2];
                0;
                if ((0x8E ^ 0x8A) == ((0x32 ^ 0x14) & ~(0x32 ^ 0x14))) {
                    return false;
                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    private static String lIIIlllIlIlIIIl(String var47, String var9) {
        try {
            SecretKeySpec var32 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llllIIIlIlIl[16], var32);
            return new String(var4.doFinal(Base64.getDecoder().decode(var47.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        WorldPoint worldPoint = gameObject.getWorldLocation();
        f f2 = this.g.get(worldPoint);
        Player player = Players.getLocal();
        switch (gameObject.getId()) {
            case 9345: 
            case 9380: {
                void var41;
                void var30;
                a var11;
                if (!a.lIIIlllIlllllll(var11.l) || !a.lIIIllllIIIIIII(var30.distanceTo(var11.l))) break;
                var11.g.put((WorldPoint)var30, new f((GameObject)var41));
                0;
                var11.k = Instant.now();
                0;
                if (((0x6E ^ 0x3A ^ (0xD2 ^ 0xAC)) & (0xAF ^ 0x81 ^ (0xC ^ 8) ^ -1)) < 1) break;
                return;
            }
            case 8731: 
            case 8992: 
            case 9002: 
            case 9343: 
            case 50723: {
                void var41;
                void var30;
                a var11;
                if (!a.lIIIlllIlllllll(var11.l) || !a.lIIIllllIIIIIII(var30.distanceTo(var11.l))) break;
                Direction var38 = new Angle(var41.getOrientation()).getNearestDirection();
                WorldPoint var17 = var30;
                switch (b.m[var38.ordinal()]) {
                    case 1: {
                        var17 = var30.dy(llllIIIlIlIl[0]);
                        0;
                        if (-1 < 0) break;
                        return;
                    }
                    case 2: {
                        var17 = var30.dx(llllIIIlIlIl[0]);
                    }
                }
                var11.g.put(var17, new f((GameObject)var41));
                0;
                var11.k = Instant.now();
                0;
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
                void var18;
                if (!a.lIIIlllIlllllll(var18)) break;
                var18.a(e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum.FULL);
                var18.n();
                var11.k = Instant.now();
                0;
                if (null == null) break;
                return;
            }
            case 9344: 
            case 9385: 
            case 19224: {
                void var18;
                if (!a.lIIIlllIlllllll(var18)) break;
                var18.a(e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum.EMPTY);
                var18.n();
                var11.k = Instant.now();
                0;
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
                void var18;
                if (!a.lIIIlllIlllllll(var18)) break;
                var18.a(e.t.r.i.s.h.q.n.r.u.-.u.e.GEnum.TRANSITION);
            }
        }
    }

    private static boolean lIIIllllIIIIlll(int n2) {
        return n2 <= 0;
    }

    public f a(WorldPoint worldPoint, int n2) {
        return this.g.values().stream().filter(f2 -> {
            boolean bl;
            if (a.lIIIllllIIIlIIl(f2.o().distanceTo(worldPoint), n2)) {
                bl = llllIIIlIlIl[2];
                0;
                
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

    private static String lIIIlllIllllIll(String var29, String var26) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[13]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIIIlIlIl[16], var15);
            return new String(var10.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    @Inject
    public a(SquireHunter squireHunter, SquireHunterConfig squireHunterConfig) {
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
    public void a(GameTick gameTick) {
        void var19;
        this.j.set(this.j.get() + 1L);
        Iterator<Map.Entry<WorldPoint, f>> iterator = this.g.entrySet().iterator();
        Instant var16 = Instant.now().minus(f.n.multipliedBy(2L));
        while (a.lIIIllllIIIIIIl(var19.hasNext() ? 1 : 0)) {
            Map.Entry var5 = (Map.Entry)var19.next();
            f var21 = (f)var5.getValue();
            WorldPoint var1 = (WorldPoint)var5.getKey();
            if (a.lIIIllllIIIIIIl(var21.p().isBefore(var16) ? 1 : 0)) {
                var19.remove();
                0;
                if (2 == 2) continue;
                return;
            }
            Tile var44 = Tiles.getAt((WorldPoint)var1);
            GameObject[] var46 = var44.getGameObjects();
            int var12 = llllIIIlIlIl[1];
            int var6 = llllIIIlIlIl[1];
            GameObject[] var31 = var46;
            int var36 = var31.length;
            int var40 = llllIIIlIlIl[1];
            while (a.lIIIllllIIIIIlI(var40, var36)) {
                GameObject var27 = var31[var40];
                if (a.lIIIlllIlllllll(var27)) {
                    var12 = llllIIIlIlIl[2];
                    if (!(a.lIIIllllIIIIIll(var27.getId(), llllIIIlIlIl[3]) && a.lIIIllllIIIIIll(var27.getId(), llllIIIlIlIl[4]) && a.lIIIllllIIIIIll(var27.getId(), llllIIIlIlIl[5]) && a.lIIIllllIIIIIll(var27.getId(), llllIIIlIlIl[6]) && !a.lIIIllllIIIIlII(var27.getId(), llllIIIlIlIl[7]))) {
                        var6 = llllIIIlIlIl[2];
                    }
                }
                ++var40;
                0;
                if (2 <= (0x80 ^ 0x84)) continue;
                return;
            }
            if (!a.lIIIllllIIIIIIl(var12) || a.lIIIllllIIIIIIl(var6)) {
                var19.remove();
            }
            0;
            
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
        void var22;
        int n2 = llllIIIlIlIl[13];
        Iterator var37 = Inventory.getAll(item -> item.hasAction(llllIIIIlIII[llllIIIlIlIl[16]]::equals)).iterator();
        while (a.lIIIllllIIIIIIl(var37.hasNext() ? 1 : 0)) {
            Item var13 = (Item)var37.next();
            var13.interact(llllIIIIlIII[llllIIIlIlIl[2]]);
            if (a.lIIIllllIIIIlll((int)(--var22))) {
                return llllIIIlIlIl[2];
            }
            0;
            if (1 > -1) continue;
            return false;
        }
        if (a.lIIIllllIIIIIlI((int)var22, llllIIIlIlIl[13])) {
            bl = llllIIIlIlIl[2];
            0;
            
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
        void var42;
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
        Iterator var39 = var42.iterator();
        while (a.lIIIllllIIIIIIl(var39.hasNext() ? 1 : 0)) {
            TileObject var23 = (TileObject)var39.next();
            if (a.lIIIllllIIIIllI(var23.distanceTo((Locatable)Players.getLocal()), llllIIIlIlIl[12])) {
                0;
                if (-(80 + 28 - -8 + 27 ^ 1 + 106 - 90 + 122) < 0) continue;
                return false;
            }
            String[] stringArray = new String[llllIIIlIlIl[2]];
            stringArray[a.llllIIIlIlIl[1]] = llllIIIIlIII[llllIIIlIlIl[1]];
            return var23.hasAction(stringArray);
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
                var20 = Inventory.contains((int[])v0);
            }
            if (a.lIIIllllIIIIlIl(var25, (Object)e.CHINS)) {
                v1 = new int[a.llllIIIlIlIl[2]];
                v1[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[9];
                var20 = Inventory.contains((int[])v1);
            }
            if (!a.lIIIllllIIIIlIl(var25, (Object)e.SALLIES)) break block8;
            v2 = new int[a.llllIIIlIlIl[2]];
            v2[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[10];
            if (!a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v2))) ** GOTO lbl-1000
            v3 = new int[a.llllIIIlIlIl[2]];
            v3[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[11];
            if (a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v3))) {
                v4 = a.llllIIIlIlIl[2];
                0;
                if (-1 >= (46 ^ 42)) {
                    return (boolean)((225 ^ 163) & ~(78 ^ 12));
                }
            } else lbl-1000:
            // 2 sources

            {
                v4 = var20 = a.llllIIIlIlIl[1];
            }
        }
        if (a.lIIIllllIIIIllI(lllllllllllllllIIlIllIIIllIIlllI = var28.e(), var28.g.size()) && a.lIIIllllIIIIIIl(var20)) {
            v5 = a.llllIIIlIlIl[2];
            0;
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

    public WorldPoint a(d d2) {
        return d2.a(this.e()).stream().filter(worldPoint -> {
            boolean bl;
            if (a.lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                bl = llllIIIlIlIl[2];
                0;
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

