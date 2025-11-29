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

import e.t.r.i.s.h.q.n.r.u.-.u.e.b;
import e.t.r.i.s.h.q.n.r.u.-.u.e.c;
import e.t.r.i.s.h.q.n.r.u.-.u.e.d;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import e.t.r.i.s.h.q.n.r.u.-.u.e.g;
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
public class a {
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
        "".length();
    }

    private static String lIIIlllIlllllII(String lllllllllllllllIIlIllIIIlIlIIlIl, String lllllllllllllllIIlIllIIIlIIlllll) {
        lllllllllllllllIIlIllIIIlIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIlIlIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIlIlIIIlI = lllllllllllllllIIlIllIIIlIIlllll.toCharArray();
        int lllllllllllllllIIlIllIIIlIlIIIIl = llllIIIlIlIl[1];
        char[] lllllllllllllllIIlIllIIIlIIllIll = lllllllllllllllIIlIllIIIlIlIIlIl.toCharArray();
        int lllllllllllllllIIlIllIIIlIIllIlI = lllllllllllllllIIlIllIIIlIIllIll.length;
        int lllllllllllllllIIlIllIIIlIIllIIl = llllIIIlIlIl[1];
        while (a.lIIIllllIIIIIlI(lllllllllllllllIIlIllIIIlIIllIIl, lllllllllllllllIIlIllIIIlIIllIlI)) {
            char lllllllllllllllIIlIllIIIlIlIIllI = lllllllllllllllIIlIllIIIlIIllIll[lllllllllllllllIIlIllIIIlIIllIIl];
            lllllllllllllllIIlIllIIIlIlIIIll.append((char)(lllllllllllllllIIlIllIIIlIlIIllI ^ lllllllllllllllIIlIllIIIlIlIIIlI[lllllllllllllllIIlIllIIIlIlIIIIl % lllllllllllllllIIlIllIIIlIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIllIIIlIlIIIIl;
            ++lllllllllllllllIIlIllIIIlIIllIIl;
            "".length();
            if (-"   ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIIlIlIIIll);
    }

    private static void lIIIlllIllllllI() {
        llllIIIlIlIl = new int[19];
        a.llllIIIlIlIl[0] = -" ".length();
        a.llllIIIlIlIl[1] = (0xF5 ^ 0xA9 ^ (0x17 ^ 0xB)) & (0x3C ^ 0 ^ (0x78 ^ 4) ^ -" ".length());
        a.llllIIIlIlIl[2] = " ".length();
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
        a.llllIIIlIlIl[16] = "  ".length();
        a.llllIIIlIlIl[17] = "   ".length();
        a.llllIIIlIlIl[18] = 0x38 ^ 0x66 ^ (0xCD ^ 0x97);
    }

    private static void lIIIlllIlllllIl() {
        llllIIIIlIII = new String[llllIIIlIlIl[17]];
        a.llllIIIIlIII[a.llllIIIlIlIl[1]] = a.lIIIlllIlIlIIIl("ld4IBACGW2rwt+Llgrti1A==", "yZPOZ");
        a.llllIIIIlIII[a.llllIIIlIlIl[2]] = a.lIIIlllIllllIll("+phV8jAfnkM=", "UUmoZ");
        a.llllIIIIlIII[a.llllIIIlIlIl[16]] = a.lIIIlllIlllllII("FycjFhs2Jw==", "EBOsz");
    }

    private static boolean lIIIllllIIIIIll(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint a(c c2) {
        return c2.a(this.e()).stream().filter(worldPoint -> {
            boolean bl;
            if (a.lIIIllllIIIIIII(this.g.containsKey(worldPoint) ? 1 : 0)) {
                bl = llllIIIlIlIl[2];
                "".length();
                if ((0x8E ^ 0x8A) == ((0x32 ^ 0x14) & ~(0x32 ^ 0x14))) {
                    return ((0x82 ^ 0xA1) & ~(0x1E ^ 0x3D)) != 0;
                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    private static String lIIIlllIlIlIIIl(String lllllllllllllllIIlIllIIIlIIIlllI, String lllllllllllllllIIlIllIIIlIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIlIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIlIIlIIlI.init(llllIIIlIlIl[16], lllllllllllllllIIlIllIIIlIIlIIll);
            return new String(lllllllllllllllIIlIllIIIlIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIlIIlIIIl) {
            lllllllllllllllIIlIllIIIlIIlIIIl.printStackTrace();
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
                void lllllllllllllllIIlIllIIIllllIlll;
                void lllllllllllllllIIlIllIIIllllIllI;
                a lllllllllllllllIIlIllIIIlllllIIl;
                if (!a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIlllllIIl.l) || !a.lIIIllllIIIIIII(lllllllllllllllIIlIllIIIllllIllI.distanceTo(lllllllllllllllIIlIllIIIlllllIIl.l))) break;
                lllllllllllllllIIlIllIIIlllllIIl.g.put((WorldPoint)lllllllllllllllIIlIllIIIllllIllI, new f((GameObject)lllllllllllllllIIlIllIIIllllIlll));
                "".length();
                lllllllllllllllIIlIllIIIlllllIIl.k = Instant.now();
                "".length();
                if (((0x6E ^ 0x3A ^ (0xD2 ^ 0xAC)) & (0xAF ^ 0x81 ^ (0xC ^ 8) ^ -" ".length())) < " ".length()) break;
                return;
            }
            case 8731: 
            case 8992: 
            case 9002: 
            case 9343: 
            case 50723: {
                void lllllllllllllllIIlIllIIIllllIlll;
                void lllllllllllllllIIlIllIIIllllIllI;
                a lllllllllllllllIIlIllIIIlllllIIl;
                if (!a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIlllllIIl.l) || !a.lIIIllllIIIIIII(lllllllllllllllIIlIllIIIllllIllI.distanceTo(lllllllllllllllIIlIllIIIlllllIIl.l))) break;
                Direction lllllllllllllllIIlIllIIIllllIIll = new Angle(lllllllllllllllIIlIllIIIllllIlll.getOrientation()).getNearestDirection();
                WorldPoint lllllllllllllllIIlIllIIIllllIIlI = lllllllllllllllIIlIllIIIllllIllI;
                switch (b.m[lllllllllllllllIIlIllIIIllllIIll.ordinal()]) {
                    case 1: {
                        lllllllllllllllIIlIllIIIllllIIlI = lllllllllllllllIIlIllIIIllllIllI.dy(llllIIIlIlIl[0]);
                        "".length();
                        if (-" ".length() < 0) break;
                        return;
                    }
                    case 2: {
                        lllllllllllllllIIlIllIIIllllIIlI = lllllllllllllllIIlIllIIIllllIllI.dx(llllIIIlIlIl[0]);
                    }
                }
                lllllllllllllllIIlIllIIIlllllIIl.g.put(lllllllllllllllIIlIllIIIllllIIlI, new f((GameObject)lllllllllllllllIIlIllIIIllllIlll));
                "".length();
                lllllllllllllllIIlIllIIIlllllIIl.k = Instant.now();
                "".length();
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
                void lllllllllllllllIIlIllIIIllllIlIl;
                if (!a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIllllIlIl)) break;
                lllllllllllllllIIlIllIIIllllIlIl.a(e.t.r.i.s.h.q.n.r.u.-.u.e.g.FULL);
                lllllllllllllllIIlIllIIIllllIlIl.n();
                lllllllllllllllIIlIllIIIlllllIIl.k = Instant.now();
                "".length();
                if (null == null) break;
                return;
            }
            case 9344: 
            case 9385: 
            case 19224: {
                void lllllllllllllllIIlIllIIIllllIlIl;
                if (!a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIllllIlIl)) break;
                lllllllllllllllIIlIllIIIllllIlIl.a(e.t.r.i.s.h.q.n.r.u.-.u.e.g.EMPTY);
                lllllllllllllllIIlIllIIIllllIlIl.n();
                lllllllllllllllIIlIllIIIlllllIIl.k = Instant.now();
                "".length();
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
                void lllllllllllllllIIlIllIIIllllIlIl;
                if (!a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIllllIlIl)) break;
                lllllllllllllllIIlIllIIIllllIlIl.a(e.t.r.i.s.h.q.n.r.u.-.u.e.g.TRANSITION);
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
                "".length();
                if (null != null) {
                    return ((0x65 ^ 1 ^ (0x74 ^ 0x4D)) & (46 + 74 - 108 + 141 ^ 133 + 101 - 183 + 145 ^ -" ".length())) != 0;
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

    private static String lIIIlllIllllIll(String lllllllllllllllIIlIllIIIlIIIIIIl, String lllllllllllllllIIlIllIIIlIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), llllIIIlIlIl[13]), "DES");
            Cipher lllllllllllllllIIlIllIIIlIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIIlIIIIlIl.init(llllIIIlIlIl[16], lllllllllllllllIIlIllIIIlIIIIllI);
            return new String(lllllllllllllllIIlIllIIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIlIIIIlII) {
            lllllllllllllllIIlIllIIIlIIIIlII.printStackTrace();
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
        void lllllllllllllllIIlIllIIIlllIIIlI;
        this.j.set(this.j.get() + 1L);
        Iterator<Map.Entry<WorldPoint, f>> iterator = this.g.entrySet().iterator();
        Instant lllllllllllllllIIlIllIIIlllIIIIl = Instant.now().minus(f.n.multipliedBy(2L));
        while (a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIlllIIIlI.hasNext() ? 1 : 0)) {
            Map.Entry lllllllllllllllIIlIllIIIlllIIIII = (Map.Entry)lllllllllllllllIIlIllIIIlllIIIlI.next();
            f lllllllllllllllIIlIllIIIllIlllll = (f)lllllllllllllllIIlIllIIIlllIIIII.getValue();
            WorldPoint lllllllllllllllIIlIllIIIllIllllI = (WorldPoint)lllllllllllllllIIlIllIIIlllIIIII.getKey();
            if (a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIlllll.p().isBefore(lllllllllllllllIIlIllIIIlllIIIIl) ? 1 : 0)) {
                lllllllllllllllIIlIllIIIlllIIIlI.remove();
                "".length();
                if ("  ".length() == "  ".length()) continue;
                return;
            }
            Tile lllllllllllllllIIlIllIIIllIlllIl = Tiles.getAt((WorldPoint)lllllllllllllllIIlIllIIIllIllllI);
            GameObject[] lllllllllllllllIIlIllIIIllIlllII = lllllllllllllllIIlIllIIIllIlllIl.getGameObjects();
            int lllllllllllllllIIlIllIIIllIllIll = llllIIIlIlIl[1];
            int lllllllllllllllIIlIllIIIllIllIlI = llllIIIlIlIl[1];
            GameObject[] lllllllllllllllIIlIllIIIllIllIIl = lllllllllllllllIIlIllIIIllIlllII;
            int lllllllllllllllIIlIllIIIllIllIII = lllllllllllllllIIlIllIIIllIllIIl.length;
            int lllllllllllllllIIlIllIIIllIlIlll = llllIIIlIlIl[1];
            while (a.lIIIllllIIIIIlI(lllllllllllllllIIlIllIIIllIlIlll, lllllllllllllllIIlIllIIIllIllIII)) {
                GameObject lllllllllllllllIIlIllIIIllIlIllI = lllllllllllllllIIlIllIIIllIllIIl[lllllllllllllllIIlIllIIIllIlIlll];
                if (a.lIIIlllIlllllll(lllllllllllllllIIlIllIIIllIlIllI)) {
                    lllllllllllllllIIlIllIIIllIllIll = llllIIIlIlIl[2];
                    if (!(a.lIIIllllIIIIIll(lllllllllllllllIIlIllIIIllIlIllI.getId(), llllIIIlIlIl[3]) && a.lIIIllllIIIIIll(lllllllllllllllIIlIllIIIllIlIllI.getId(), llllIIIlIlIl[4]) && a.lIIIllllIIIIIll(lllllllllllllllIIlIllIIIllIlIllI.getId(), llllIIIlIlIl[5]) && a.lIIIllllIIIIIll(lllllllllllllllIIlIllIIIllIlIllI.getId(), llllIIIlIlIl[6]) && !a.lIIIllllIIIIlII(lllllllllllllllIIlIllIIIllIlIllI.getId(), llllIIIlIlIl[7]))) {
                        lllllllllllllllIIlIllIIIllIllIlI = llllIIIlIlIl[2];
                    }
                }
                ++lllllllllllllllIIlIllIIIllIlIlll;
                "".length();
                if ("  ".length() <= (0x80 ^ 0x84)) continue;
                return;
            }
            if (!a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIllIll) || a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIllIlI)) {
                lllllllllllllllIIlIllIIIlllIIIlI.remove();
            }
            "".length();
            if (null == null) continue;
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
        void lllllllllllllllIIlIllIIIllIIIIlI;
        int n2 = llllIIIlIlIl[13];
        Iterator lllllllllllllllIIlIllIIIllIIIIIl = Inventory.getAll(item -> item.hasAction(llllIIIIlIII[llllIIIlIlIl[16]]::equals)).iterator();
        while (a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIIIIIl.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIIlIllIIIllIIIIII = (Item)lllllllllllllllIIlIllIIIllIIIIIl.next();
            lllllllllllllllIIlIllIIIllIIIIII.interact(llllIIIIlIII[llllIIIlIlIl[2]]);
            if (a.lIIIllllIIIIlll((int)(--lllllllllllllllIIlIllIIIllIIIIlI))) {
                return llllIIIlIlIl[2];
            }
            "".length();
            if (" ".length() > -" ".length()) continue;
            return ((0x53 ^ 0x65) & ~(0x64 ^ 0x52)) != 0;
        }
        if (a.lIIIllllIIIIIlI((int)lllllllllllllllIIlIllIIIllIIIIlI, llllIIIlIlIl[13])) {
            bl = llllIIIlIlIl[2];
            "".length();
            if (null != null) {
                return ((177 + 105 - 169 + 75 ^ 112 + 119 - 213 + 113) & (0x56 ^ 0x62 ^ (0x11 ^ 0x1A) ^ -" ".length())) != 0;
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
        void lllllllllllllllIIlIllIIIllIIlIII;
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
        Iterator lllllllllllllllIIlIllIIIllIIIlll = lllllllllllllllIIlIllIIIllIIlIII.iterator();
        while (a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIIIlll.hasNext() ? 1 : 0)) {
            TileObject lllllllllllllllIIlIllIIIllIIIllI = (TileObject)lllllllllllllllIIlIllIIIllIIIlll.next();
            if (a.lIIIllllIIIIllI(lllllllllllllllIIlIllIIIllIIIllI.distanceTo((Locatable)Players.getLocal()), llllIIIlIlIl[12])) {
                "".length();
                if (-(80 + 28 - -8 + 27 ^ 1 + 106 - 90 + 122) < 0) continue;
                return ((198 + 128 - 207 + 102 ^ 162 + 132 - 181 + 84) & (88 + 40 - 107 + 107 ^ 82 + 116 - 171 + 125 ^ -" ".length())) != 0;
            }
            String[] stringArray = new String[llllIIIlIlIl[2]];
            stringArray[a.llllIIIlIlIl[1]] = llllIIIIlIII[llllIIIlIlIl[1]];
            return lllllllllllllllIIlIllIIIllIIIllI.hasAction(stringArray);
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
                lllllllllllllllIIlIllIIIllIIllll = Inventory.contains((int[])v0);
            }
            if (a.lIIIllllIIIIlIl(lllllllllllllllIIlIllIIIllIlIIII, (Object)e.CHINS)) {
                v1 = new int[a.llllIIIlIlIl[2]];
                v1[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[9];
                lllllllllllllllIIlIllIIIllIIllll = Inventory.contains((int[])v1);
            }
            if (!a.lIIIllllIIIIlIl(lllllllllllllllIIlIllIIIllIlIIII, (Object)e.SALLIES)) break block8;
            v2 = new int[a.llllIIIlIlIl[2]];
            v2[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[10];
            if (!a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v2))) ** GOTO lbl-1000
            v3 = new int[a.llllIIIlIlIl[2]];
            v3[a.llllIIIlIlIl[1]] = a.llllIIIlIlIl[11];
            if (a.lIIIllllIIIIIIl((int)Inventory.contains((int[])v3))) {
                v4 = a.llllIIIlIlIl[2];
                "".length();
                if (-" ".length() >= (46 ^ 42)) {
                    return (boolean)((225 ^ 163) & ~(78 ^ 12));
                }
            } else lbl-1000:
            // 2 sources

            {
                v4 = lllllllllllllllIIlIllIIIllIIllll = a.llllIIIlIlIl[1];
            }
        }
        if (a.lIIIllllIIIIllI(lllllllllllllllIIlIllIIIllIIlllI = lllllllllllllllIIlIllIIIllIlIIIl.e(), lllllllllllllllIIlIllIIIllIlIIIl.g.size()) && a.lIIIllllIIIIIIl(lllllllllllllllIIlIllIIIllIIllll)) {
            v5 = a.llllIIIlIlIl[2];
            "".length();
            if (("   ".length() & ~"   ".length()) > " ".length()) {
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
                "".length();
                if (((0xE2 ^ 0xC3) & ~(0x57 ^ 0x76)) != 0) {
                    return ((0x64 ^ 0x2E) & ~(1 ^ 0x4B)) != 0;
                }
            } else {
                bl = llllIIIlIlIl[1];
            }
            return bl;
        }).min(Comparator.comparing(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }
}

