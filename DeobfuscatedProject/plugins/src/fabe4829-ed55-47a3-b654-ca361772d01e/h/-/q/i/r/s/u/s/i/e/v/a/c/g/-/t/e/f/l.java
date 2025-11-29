/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.a;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.b;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.e;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.m;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Safe Spotting Task")
public class l
extends Task {
    private final /* synthetic */ n ai;
    private final /* synthetic */ SquireFightCavesConfig ah;
    private static /* synthetic */ int[] llIIIlllllIl;
    private static /* synthetic */ String[] llIIIllllIll;
    private final /* synthetic */ f ag;

    private static boolean llllIllllIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIllllIIIII(Object object) {
        return object != null;
    }

    private boolean a(b b2) {
        switch (m.aj[b2.f().ordinal()]) {
            case 1: 
            case 2: {
                return llIIIlllllIl[2];
            }
            case 3: {
                l lllllllllllllllIlIlIIIIlIllIIlll;
                return lllllllllllllllIlIlIIIIlIllIIlll.A();
            }
            case 4: {
                return llIIIlllllIl[2];
            }
            case 5: {
                return llIIIlllllIl[1];
            }
        }
        return llIIIlllllIl[2];
    }

    private static boolean llllIllllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllIlllIllIll() {
        llIIIlllllIl = new int[8];
        l.llIIIlllllIl[0] = 0x46 ^ 0x40;
        l.llIIIlllllIl[1] = (26 + 34 - -25 + 102 ^ 39 + 59 - -51 + 22) & (43 + 119 - 57 + 84 ^ 9 + 98 - 23 + 89 ^ -" ".length());
        l.llIIIlllllIl[2] = " ".length();
        l.llIIIlllllIl[3] = 0xFFFFDBEC & 0x2FD3;
        l.llIIIlllllIl[4] = "   ".length();
        l.llIIIlllllIl[5] = "  ".length();
        l.llIIIlllllIl[6] = 0x1B ^ 0x36 ^ (0xB7 ^ 0x90);
        l.llIIIlllllIl[7] = 0x5F ^ 0x50;
    }

    private boolean c(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.RANGED)) {
            bl = llIIIlllllIl[2];
            "".length();
            if ("  ".length() < -" ".length()) {
                return ((0x86 ^ 0xB2 ^ (0xC9 ^ 0xC7)) & (0xE8 ^ 0x8A ^ (0xC5 ^ 0x9D) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private Tile a(Client client, WorldPoint worldPoint) {
        LocalPoint localPoint = LocalPoint.fromWorld((Client)client, (WorldPoint)worldPoint);
        if (l.llllIllllIIIlI(localPoint)) {
            return null;
        }
        return client.getScene().getTiles()[worldPoint.getPlane()][localPoint.getSceneX()][localPoint.getSceneY()];
    }

    private static boolean llllIlllIlllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlllIlllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(Tile tile, Client client) {
        void lllllllllllllllIlIlIIIIlIIIIlIlI;
        if (!l.llllIllllIIIlI(tile.getWallObject()) || l.llllIllllIIIII(tile.getDecorativeObject())) {
            return llIIIlllllIl[2];
        }
        GameObject[] lllllllllllllllIlIlIIIIlIIIIlIIl = lllllllllllllllIlIlIIIIlIIIIlIlI.getGameObjects();
        int lllllllllllllllIlIlIIIIlIIIIlIII = lllllllllllllllIlIlIIIIlIIIIlIIl.length;
        int lllllllllllllllIlIlIIIIlIIIIIlll = llIIIlllllIl[1];
        while (l.llllIllllIlIII(lllllllllllllllIlIlIIIIlIIIIIlll, lllllllllllllllIlIlIIIIlIIIIlIII)) {
            GameObject lllllllllllllllIlIlIIIIlIIIIIllI = lllllllllllllllIlIlIIIIlIIIIlIIl[lllllllllllllllIlIlIIIIlIIIIIlll];
            if (l.llllIllllIIIII(lllllllllllllllIlIlIIIIlIIIIIllI)) {
                return llIIIlllllIl[2];
            }
            ++lllllllllllllllIlIlIIIIlIIIIIlll;
            "".length();
            if (-"  ".length() <= 0) continue;
            return ((0x15 ^ 0x54) & ~(0x3C ^ 0x7D)) != 0;
        }
        return llIIIlllllIl[1];
    }

    private static String llllIlllIIllll(String lllllllllllllllIlIlIIIIIllIlIlIl, String lllllllllllllllIlIlIIIIIllIllIIl) {
        lllllllllllllllIlIlIIIIIllIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIIIllIllIII = new StringBuilder();
        char[] lllllllllllllllIlIlIIIIIllIlIlll = lllllllllllllllIlIlIIIIIllIllIIl.toCharArray();
        int lllllllllllllllIlIlIIIIIllIlIllI = llIIIlllllIl[1];
        char[] lllllllllllllllIlIlIIIIIllIlIIII = lllllllllllllllIlIlIIIIIllIlIlIl.toCharArray();
        int lllllllllllllllIlIlIIIIIllIIllll = lllllllllllllllIlIlIIIIIllIlIIII.length;
        int lllllllllllllllIlIlIIIIIllIIlllI = llIIIlllllIl[1];
        while (l.llllIllllIlIII(lllllllllllllllIlIlIIIIIllIIlllI, lllllllllllllllIlIlIIIIIllIIllll)) {
            char lllllllllllllllIlIlIIIIIllIllIll = lllllllllllllllIlIlIIIIIllIlIIII[lllllllllllllllIlIlIIIIIllIIlllI];
            lllllllllllllllIlIlIIIIIllIllIII.append((char)(lllllllllllllllIlIlIIIIIllIllIll ^ lllllllllllllllIlIlIIIIIllIlIlll[lllllllllllllllIlIlIIIIIllIlIllI % lllllllllllllllIlIlIIIIIllIlIlll.length]));
            "".length();
            ++lllllllllllllllIlIlIIIIIllIlIllI;
            ++lllllllllllllllIlIlIIIIIllIIlllI;
            "".length();
            if (((0x63 ^ 0x58) & ~(0x8C ^ 0xB7)) >= ((0x48 ^ 0x66) & ~(0x12 ^ 0x3C))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIIIllIllIII);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, Client client) {
        boolean bl;
        void lllllllllllllllIlIlIIIIlIIlllllI;
        void lllllllllllllllIlIlIIIIlIIllllll;
        void lllllllllllllllIlIlIIIIlIIllllIl;
        void lllllllllllllllIlIlIIIIlIlIIIIII;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] lllllllllllllllIlIlIIIIlIIllllII = lllllllllllllllIlIlIIIIlIlIIIIII.getCollisionMaps()[lllllllllllllllIlIlIIIIlIIllllIl].getFlags();
        if (!l.llllIllllIlIIl((int)lllllllllllllllIlIlIIIIlIIllllll) || !l.llllIllllIlIIl((int)lllllllllllllllIlIlIIIIlIIlllllI) || !l.llllIllllIlIII((int)lllllllllllllllIlIlIIIIlIIllllll, lllllllllllllllIlIlIIIIlIIllllII.length) || l.llllIllllIlIlI((int)lllllllllllllllIlIlIIIIlIIlllllI, lllllllllllllllIlIlIIIIlIIllllII[lllllllllllllllIlIlIIIIlIIllllll].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(lllllllllllllllIlIlIIIIlIIllllII[lllllllllllllllIlIlIIIIlIIllllll][lllllllllllllllIlIlIIIIlIIlllllI])) {
            bl = llIIIlllllIl[2];
            "".length();
            if (((0x3D ^ 0x5D) & ~(0x63 ^ 3)) > 0) {
                return ((0x30 ^ 0x67) & ~(0x91 ^ 0xC6)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean a(Tile tile, NPC nPC, Client client) {
        Tile tile2 = this.a(client, nPC.getWorldLocation());
        return tile.hasLineOfSightTo(tile2);
    }

    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        int n2;
        int n3 = Math.abs(worldPoint.getX() - worldPoint2.getX());
        int n4 = Math.abs(worldPoint.getY() - worldPoint2.getY());
        if (l.llllIlllIlllll(n3, llIIIlllllIl[2]) && l.llllIlllIlllll(n4, llIIIlllllIl[2])) {
            n2 = llIIIlllllIl[2];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x5B ^ 0x3B) & ~(0x4A ^ 0x2A)) != 0;
            }
        } else {
            n2 = llIIIlllllIl[1];
        }
        return n2 != 0;
    }

    private WorldArea a(NPC nPC) {
        if (l.llllIllllIIIlI(nPC)) {
            return null;
        }
        int n2 = llIIIlllllIl[4];
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), llIIIlllllIl[5] * n2 + nPC.getWorldArea().getWidth(), llIIIlllllIl[5] * n2 + nPC.getWorldArea().getWidth());
    }

    private static String llllIlllIlIIII(String lllllllllllllllIlIlIIIIIlllIlIlI, String lllllllllllllllIlIlIIIIIlllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIlllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIlllIllII.init(llIIIlllllIl[5], lllllllllllllllIlIlIIIIIlllIllIl);
            return new String(lllllllllllllllIlIlIIIIIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIlllIlIll) {
            lllllllllllllllIlIlIIIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllllIlIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIllllIIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> b(List<NPC> list) {
        void lllllllllllllllIlIlIIIIlIlIlIIII;
        WorldPoint worldPoint = Static.getClient().getLocalPlayer().getWorldLocation();
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        int n2 = llIIIlllllIl[7];
        int lllllllllllllllIlIlIIIIlIlIIllll = -n2;
        while (l.llllIlllIlllll(lllllllllllllllIlIlIIIIlIlIIllll, (int)lllllllllllllllIlIlIIIIlIlIlIIII)) {
            void lllllllllllllllIlIlIIIIlIlIIlllI = -lllllllllllllllIlIlIIIIlIlIlIIII;
            while (l.llllIlllIlllll((int)lllllllllllllllIlIlIIIIlIlIIlllI, (int)lllllllllllllllIlIlIIIIlIlIlIIII)) {
                void lllllllllllllllIlIlIIIIlIlIlIIll;
                l lllllllllllllllIlIlIIIIlIlIlIlII;
                void lllllllllllllllIlIlIIIIlIlIlIIlI;
                WorldPoint lllllllllllllllIlIlIIIIlIlIIllIl = lllllllllllllllIlIlIIIIlIlIlIIlI.dx(lllllllllllllllIlIlIIIIlIlIIllll).dy((int)lllllllllllllllIlIlIIIIlIlIIlllI);
                Tile lllllllllllllllIlIlIIIIlIlIIllII = lllllllllllllllIlIlIIIIlIlIlIlII.a(Static.getClient(), lllllllllllllllIlIlIIIIlIlIIllIl);
                if (l.llllIllllIIIII(lllllllllllllllIlIlIIIIlIlIIllII) && l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIlIlIlII.a(lllllllllllllllIlIlIIIIlIlIIllII) ? 1 : 0) && l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIlIlIlII.a(lllllllllllllllIlIlIIIIlIlIIllII, (List<NPC>)lllllllllllllllIlIlIIIIlIlIlIIll) ? 1 : 0)) {
                    void lllllllllllllllIlIlIIIIlIlIlIIIl;
                    lllllllllllllllIlIlIIIIlIlIlIIIl.add(lllllllllllllllIlIlIIIIlIlIIllIl);
                    "".length();
                }
                ++lllllllllllllllIlIlIIIIlIlIIlllI;
                "".length();
                if (("  ".length() & ~"  ".length()) == 0) continue;
                return null;
            }
            ++lllllllllllllllIlIlIIIIlIlIIllll;
            "".length();
            if (-(30 + 53 - 64 + 116 ^ 78 + 97 - 63 + 19) < 0) continue;
            return null;
        }
        return arrayList;
    }

    private boolean b(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MELEE)) {
            bl = llIIIlllllIl[2];
            "".length();
            if ("  ".length() <= 0) {
                return ((0xA4 ^ 0x85) & ~(0x40 ^ 0x61)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean a(Tile tile) {
        if (l.llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch(gameObject -> {
            int n2;
            if (l.llllIllllIIIII(gameObject) && l.llllIlllIlllIl(this.b((TileObject)gameObject) ? 1 : 0)) {
                n2 = llIIIlllllIl[2];
                "".length();
                if ((0x88 ^ 0x8C) < 0) {
                    return ((0x22 ^ 0x34) & ~(0x87 ^ 0x91)) != 0;
                }
            } else {
                n2 = llIIIlllllIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        return this.a(tile, Static.getClient());
    }

    public boolean run() {
        l lllllllllllllllIlIlIIIIllIIlllll;
        f.b(llIIIlllllIl[0]);
        if (l.llllIlllIlllIl(this.z() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[1]]);
            return llIIIlllllIl[1];
        }
        Client lllllllllllllllIlIlIIIIllIIllllI = Static.getClient();
        List<NPC> lllllllllllllllIlIlIIIIllIIlllIl = lllllllllllllllIlIlIIIIllIIlllll.a(lllllllllllllllIlIlIIIIllIIllllI);
        WorldPoint lllllllllllllllIlIlIIIIllIIlllII = lllllllllllllllIlIlIIIIllIIllllI.getLocalPlayer().getWorldLocation();
        ArrayList lllllllllllllllIlIlIIIIllIIllIll = new ArrayList();
        if (l.llllIlllIllllI(lllllllllllllllIlIlIIIIllIIlllIl.isEmpty() ? 1 : 0)) {
            System.out.println(llIIIllllIll[llIIIlllllIl[2]]);
            return llIIIlllllIl[1];
        }
        System.out.println("Varbit: " + Vars.getBit((int)llIIIlllllIl[3]));
        System.out.println("Setting: " + String.valueOf(GameThread.invokeLater(() -> Static.getClient().getVarpValue(llIIIlllllIl[3]))));
        int lllllllllllllllIlIlIIIIllIIllIlI = lllllllllllllllIlIlIIIIllIIlllIl.get(llIIIlllllIl[1]).getWorldArea().distanceTo(lllllllllllllllIlIlIIIIllIIlllII);
        if (l.llllIlllIlllll(lllllllllllllllIlIlIIIIllIIllIlI, llIIIlllllIl[4])) {
            List lllllllllllllllIlIlIIIIllIIllIIl = lllllllllllllllIlIlIIIIllIIlllll.a(lllllllllllllllIlIlIIIIllIIlllIl.get(llIIIlllllIl[1])).toWorldPointList();
            WorldPoint lllllllllllllllIlIlIIIIllIIllIII = lllllllllllllllIlIlIIIIllIIllIIl.stream().filter(worldPoint -> {
                int n2;
                if (l.llllIlllIllllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && l.llllIllllIlIII(((NPC)lllllllllllllllIlIlIIIIllIIlllIl.get(llIIIlllllIl[1])).getWorldArea().distanceTo(worldPoint), llIIIlllllIl[0])) {
                    n2 = llIIIlllllIl[2];
                    "".length();
                    if ((" ".length() ^ (0x5C ^ 0x58)) == 0) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIIlllllIl[1];
                }
                return n2 != 0;
            }).max(Comparator.comparingInt(object -> ((NPC)lllllllllllllllIlIlIIIIllIIlllIl.get(llIIIlllllIl[1])).getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(lllllllllllllllIlIlIIIIllIIlllII.getWorldLocation()))).orElse(null);
            if (l.llllIllllIIIII(lllllllllllllllIlIlIIIIllIIllIII)) {
                System.out.println("Player: " + String.valueOf(lllllllllllllllIlIlIIIIllIIlllII.getWorldLocation()) + String.valueOf(lllllllllllllllIlIlIIIIllIIlllIl.get(llIIIlllllIl[1]).getWorldLocation()));
                Movement.setDestination((WorldPoint)lllllllllllllllIlIlIIIIllIIllIII);
                return llIIIlllllIl[2];
            }
            System.out.println(llIIIllllIll[llIIIlllllIl[5]]);
        }
        return llIIIlllllIl[2];
    }

    private List<NPC> a(Client client) {
        int n2 = f.p();
        e e2 = e.values()[n2];
        return NPCs.getAll().stream().filter(nPC -> Arrays.stream(e2.h()).anyMatch(b2 -> {
            int n3;
            if (l.llllIlllIllllI(Arrays.stream(b2.c()).anyMatch(n2 -> {
                boolean bl;
                if (l.llllIllllIIlll(n2, nPC.getId())) {
                    bl = llIIIlllllIl[2];
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return ((1 ^ 0x26) & ~(0xE5 ^ 0xC2)) != 0;
                    }
                } else {
                    bl = llIIIlllllIl[1];
                }
                return bl;
            }) ? 1 : 0) && l.llllIlllIlllIl(n.g(nPC) ? 1 : 0)) {
                n3 = llIIIlllllIl[2];
                "".length();
                if ((0x5E ^ 0x55 ^ (0x53 ^ 0x5C)) < (63 + 121 - 87 + 34 ^ 47 + 96 - 68 + 60)) {
                    return ((0xBF ^ 0xBB ^ (0x97 ^ 0x8B)) & (58 + 143 - 163 + 121 ^ 124 + 80 - 162 + 93 ^ -" ".length())) != 0;
                }
            } else {
                n3 = llIIIlllllIl[1];
            }
            return n3 != 0;
        })).collect(Collectors.toList());
    }

    private boolean b(TileObject tileObject) {
        return llIIIlllllIl[2];
    }

    private static void llllIlllIlIIIl() {
        llIIIllllIll = new String[llIIIlllllIl[4]];
        l.llIIIllllIll[l.llIIIlllllIl[1]] = l.llllIlllIIllll("HxxFKR4mXhFtHy0cAW0FJ1kCKAVoGEU+EC4cRT4BJw1L", "HyeMq");
        l.llIIIllllIll[l.llIIIlllllIl[2]] = l.llllIlllIlIIII("2SyGvUY+OGswisZF82UHFg==", "LKwVK");
        l.llIIIllllIll[l.llIIIlllllIl[5]] = l.llllIlllIIllll("IxANAk9NUQUSAxw=", "pqkgo");
    }

    @Inject
    public l(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ag = f2;
        this.ah = squireFightCavesConfig;
        this.ai = n2;
    }

    /*
     * WARNING - void declaration
     */
    private int a(WorldPoint worldPoint, Client client, List<NPC> list) {
        void lllllllllllllllIlIlIIIIllIIIlIIl;
        void lllllllllllllllIlIlIIIIllIIIIlll;
        void lllllllllllllllIlIlIIIIllIIIlIII;
        void lllllllllllllllIlIlIIIIllIIIIlIl;
        l lllllllllllllllIlIlIIIIllIIIlIlI;
        int n2 = llIIIlllllIl[1];
        Tile tile = this.a(client, worldPoint);
        if (l.llllIlllIlllIl(this.a(tile) ? 1 : 0)) {
            return Integer.MIN_VALUE;
        }
        lllllllllllllllIlIlIIIIllIIIIllI += 100;
        if (l.llllIlllIlllIl(lllllllllllllllIlIlIIIIllIIIlIlI.c((Tile)lllllllllllllllIlIlIIIIllIIIIlIl, (Client)lllllllllllllllIlIlIIIIllIIIlIII) ? 1 : 0)) {
            lllllllllllllllIlIlIIIIllIIIIllI -= 500;
            "".length();
            if (-(0x34 ^ 0x30) > 0) {
                return (6 ^ 0x44) & ~(0x63 ^ 0x21);
            }
        } else {
            lllllllllllllllIlIlIIIIllIIIIllI += 200;
        }
        WorldPoint lllllllllllllllIlIlIIIIllIIIIlII = lllllllllllllllIlIlIIIIllIIIIlll.iterator();
        while (l.llllIlllIllllI(lllllllllllllllIlIlIIIIllIIIIlII.hasNext() ? 1 : 0)) {
            NPC lllllllllllllllIlIlIIIIllIIIIIll = (NPC)lllllllllllllllIlIlIIIIllIIIIlII.next();
            int lllllllllllllllIlIlIIIIllIIIIIlI = lllllllllllllllIlIlIIIIllIIIlIIl.distanceTo(lllllllllllllllIlIlIIIIllIIIIIll.getWorldLocation());
            lllllllllllllllIlIlIIIIllIIIIllI += Math.max(llIIIlllllIl[1], llIIIlllllIl[6] - lllllllllllllllIlIlIIIIllIIIIIlI);
            "".length();
            if (((0xCD ^ 0xAE) & ~(0x7C ^ 0x1F)) < (0x9F ^ 0x9B)) continue;
            return (2 ^ 5) & ~(0x90 ^ 0x97);
        }
        lllllllllllllllIlIlIIIIllIIIIlII = lllllllllllllllIlIlIIIIllIIIlIII.getLocalPlayer().getWorldLocation();
        if (!l.llllIllllIIllI(lllllllllllllllIlIlIIIIllIIIlIIl.getX(), lllllllllllllllIlIlIIIIllIIIIlII.getX()) || l.llllIllllIIlll(lllllllllllllllIlIlIIIIllIIIlIIl.getY(), lllllllllllllllIlIlIIIIllIIIIlII.getY())) {
            lllllllllllllllIlIlIIIIllIIIIllI += 50;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Tile tile, List<NPC> list) {
        void lllllllllllllllIlIlIIIIlIIllIlII;
        if (l.llllIlllIlllIl(this.b(tile, Static.getClient()) ? 1 : 0)) {
            return llIIIlllllIl[1];
        }
        Iterator lllllllllllllllIlIlIIIIlIIllIIll = lllllllllllllllIlIlIIIIlIIllIlII.iterator();
        while (l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIIllIIll.hasNext() ? 1 : 0)) {
            void lllllllllllllllIlIlIIIIlIIllIlIl;
            l lllllllllllllllIlIlIIIIlIIllIllI;
            NPC lllllllllllllllIlIlIIIIlIIllIIlI = (NPC)lllllllllllllllIlIlIIIIlIIllIIll.next();
            if (l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIIllIllI.b(lllllllllllllllIlIlIIIIlIIllIIlI) ? 1 : 0) && l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIIllIllI.a(lllllllllllllllIlIlIIIIlIIllIlIl.getWorldLocation(), lllllllllllllllIlIlIIIIlIIllIIlI.getWorldLocation()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            if ((!l.llllIlllIlllIl(lllllllllllllllIlIlIIIIlIIllIllI.c(lllllllllllllllIlIlIIIIlIIllIIlI) ? 1 : 0) || l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIIllIllI.d(lllllllllllllllIlIlIIIIlIIllIIlI) ? 1 : 0)) && l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIIllIllI.a((Tile)lllllllllllllllIlIlIIIIlIIllIlIl, lllllllllllllllIlIlIIIIlIIllIIlI, Static.getClient()) ? 1 : 0)) {
                return llIIIlllllIl[1];
            }
            "".length();
            if ((0x84 ^ 0x80) > 0) continue;
            return ((0x2B ^ 0x78) & ~(0x28 ^ 0x7B)) != 0;
        }
        return llIIIlllllIl[2];
    }

    private static boolean llllIllllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIllllIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean z() {
        void lllllllllllllllIlIlIIIIlIlllIIII;
        "".length();
        int n3 = f.p();
        e e2 = e.values()[n3];
        List list = NPCs.getAll();
        b[] bArray = e2.h();
        int n4 = bArray.length;
        int lllllllllllllllIlIlIIIIlIllIllll = llIIIlllllIl[1];
        while (l.llllIllllIlIII(lllllllllllllllIlIlIIIIlIllIllll, (int)lllllllllllllllIlIlIIIIlIlllIIII)) {
            void lllllllllllllllIlIlIIIIlIlllIIlI;
            void lllllllllllllllIlIlIIIIlIlllIIIl;
            void lllllllllllllllIlIlIIIIlIllIlllI = lllllllllllllllIlIlIIIIlIlllIIIl[lllllllllllllllIlIlIIIIlIllIllll];
            Iterator lllllllllllllllIlIlIIIIlIllIllIl = lllllllllllllllIlIlIIIIlIlllIIlI.iterator();
            while (l.llllIlllIllllI(lllllllllllllllIlIlIIIIlIllIllIl.hasNext() ? 1 : 0)) {
                l lllllllllllllllIlIlIIIIlIlllIlIl;
                NPC lllllllllllllllIlIlIIIIlIllIllII = (NPC)lllllllllllllllIlIlIIIIlIllIllIl.next();
                n cfr_ignored_0 = lllllllllllllllIlIlIIIIlIlllIlIl.ai;
                "".length();
                int n5 = n.g(lllllllllllllllIlIlIIIIlIllIllII);
                boolean lllllllllllllllIlIlIIIIlIllIlIlI = lllllllllllllllIlIlIIIIlIlllIlIl.a((b)lllllllllllllllIlIlIIIIlIllIlllI);
                System.out.println("NPC ID: " + lllllllllllllllIlIlIIIIlIllIllII.getId() + " isSafeSpotted: " + (n5 != 0) + " shouldSafeSpot: " + lllllllllllllllIlIlIIIIlIllIlIlI);
                if (l.llllIlllIllllI(Arrays.stream(lllllllllllllllIlIlIIIIlIllIlllI.c()).anyMatch(n2 -> {
                    boolean bl;
                    if (l.llllIllllIIlll(n2, lllllllllllllllIlIlIIIIlIllIllII.getId())) {
                        bl = llIIIlllllIl[2];
                        "".length();
                        if (" ".length() < 0) {
                            return ((0x62 ^ 0x2F ^ (0x62 ^ 0x65)) & (0xE1 ^ 0x8C ^ (0x4B ^ 0x6C) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llIIIlllllIl[1];
                    }
                    return bl;
                }) ? 1 : 0) && l.llllIlllIlllIl(n5)) {
                    return lllllllllllllllIlIlIIIIlIllIlIlI;
                }
                "".length();
                if ("   ".length() == "   ".length()) continue;
                return ((0x29 ^ 0x7E) & ~(0 ^ 0x57)) != 0;
            }
            ++lllllllllllllllIlIlIIIIlIllIllll;
            "".length();
            if (-" ".length() <= " ".length()) continue;
            return ((0x47 ^ 0x5D) & ~(0x42 ^ 0x58)) != 0;
        }
        return llIIIlllllIl[1];
    }

    private boolean d(NPC nPC) {
        boolean bl;
        if (l.llllIllllIlIll((Object)b.a(nPC.getId()).b(), (Object)a.MAGIC)) {
            bl = llIIIlllllIl[2];
            "".length();
            if ("   ".length() <= ((0x9D ^ 0x81) & ~(0xBD ^ 0xA1))) {
                return ((0xB4 ^ 0x98) & ~(0x9D ^ 0xB1)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    static {
        l.llllIlllIllIll();
        l.llllIlllIlIIIl();
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(Tile tile, Client client) {
        boolean bl;
        void lllllllllllllllIlIlIIIIlIIlIlIII;
        void lllllllllllllllIlIlIIIIlIIlIlIIl;
        void lllllllllllllllIlIlIIIIlIIlIIlll;
        void lllllllllllllllIlIlIIIIlIIlIlIlI;
        int n2 = tile.getSceneLocation().getX();
        int n3 = tile.getSceneLocation().getY();
        int n4 = client.getPlane();
        if (!l.llllIllllIIIII(client.getCollisionMaps()) || !l.llllIllllIlIIl(n4) || l.llllIllllIlIlI(n4, client.getCollisionMaps().length)) {
            return llIIIlllllIl[1];
        }
        int[][] lllllllllllllllIlIlIIIIlIIlIIllI = lllllllllllllllIlIlIIIIlIIlIlIlI.getCollisionMaps()[lllllllllllllllIlIlIIIIlIIlIIlll].getFlags();
        if (!l.llllIllllIlIIl((int)lllllllllllllllIlIlIIIIlIIlIlIIl) || !l.llllIllllIlIIl((int)lllllllllllllllIlIlIIIIlIIlIlIII) || !l.llllIllllIlIII((int)lllllllllllllllIlIlIIIIlIIlIlIIl, lllllllllllllllIlIlIIIIlIIlIIllI.length) || l.llllIllllIlIlI((int)lllllllllllllllIlIlIIIIlIIlIlIII, lllllllllllllllIlIlIIIIlIIlIIllI[lllllllllllllllIlIlIIIIlIIlIlIIl].length)) {
            return llIIIlllllIl[1];
        }
        if (l.llllIlllIlllIl(lllllllllllllllIlIlIIIIlIIlIIllI[lllllllllllllllIlIlIIIIlIIlIlIIl][lllllllllllllllIlIlIIIIlIIlIlIII])) {
            bl = llIIIlllllIl[2];
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((0x73 ^ 0x13) & ~(3 ^ 0x63)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private static boolean llllIlllIllllI(int n2) {
        return n2 != 0;
    }

    private Optional<WorldPoint> a(List<WorldPoint> list, Client client, WorldPoint worldPoint, List<NPC> list2) {
        return list.stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint)));
    }

    private boolean A() {
        boolean bl;
        int n2;
        Client client = Static.getClient();
        int n3 = client.getRealSkillLevel(Skill.HITPOINTS);
        int n4 = client.getBoostedSkillLevel(Skill.HITPOINTS);
        if (l.llllIlllIlllll(n4, n2 = (int)(0.05 * (double)n3))) {
            bl = llIIIlllllIl[2];
            "".length();
            if (" ".length() < 0) {
                return ((109 + 219 - 81 + 6 ^ 87 + 48 - -19 + 39) & (86 + 121 - 136 + 98 ^ 57 + 72 - 39 + 59 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }

    private boolean b(Tile tile) {
        boolean bl;
        if (!l.llllIllllIIIlI(tile.getWallObject()) || l.llllIlllIllllI(Arrays.stream(tile.getGameObjects()).anyMatch(Objects::nonNull) ? 1 : 0)) {
            bl = llIIIlllllIl[2];
            "".length();
            if (-(0x78 ^ 0x7C) >= 0) {
                return ((0x7C ^ 0x49) & ~(0x7B ^ 0x4E)) != 0;
            }
        } else {
            bl = llIIIlllllIl[1];
        }
        return bl;
    }
}

