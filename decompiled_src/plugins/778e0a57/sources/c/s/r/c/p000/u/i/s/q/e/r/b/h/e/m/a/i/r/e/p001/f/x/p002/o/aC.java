package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Mystics", priority = 10000, blocking = true, register = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aC  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aC.class */
public class aC extends U {
    private static /* synthetic */ int[] lIlIIlIIIlll;
    private /* synthetic */ boolean dH;
    private /* synthetic */ C0039n al;
    private /* synthetic */ List<C0042q> dG;
    private static /* synthetic */ String[] lIlIIlIIIllI;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ Set<Integer> dF;
    private /* synthetic */ int am;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIllIIIIlIlll(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIllIIIIllIIl(Movement.getDestination()) && llIllIIIIlIlll(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIlIIIlll[2];
        }
        TileObject cR = cR();
        if (llIllIIIIllIII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIlIIIlll[7]).dy(lIlIIlIIIlll[7]));
            return lIlIIlIIIlll[2];
        } else if (!llIllIIIIlllII(this.bS.isMoving() ? 1 : 0) || llIllIIIIlIlll(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIlIIIlll[1];
        } else {
            cR.interact(lIlIIlIIIllI[lIlIIlIIIlll[8]]);
            return lIlIIlIIIlll[2];
        }
    }

    private static boolean llIllIIIIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIIIIllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(Client client, WorldArea worldArea, WorldArea worldArea2) {
        for (WorldPoint worldPoint : worldArea.toWorldPointList()) {
            if (llIllIIIIlllII(b(client, worldPoint.toWorldArea(), worldArea2) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIIlIIIlll[2];
    }

    private static boolean llIllIIIlIIIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    private void cV() {
        List all = NPCs.getAll(npc -> {
            return npc.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[20]]);
        });
        if (llIllIIIIlIlll(all.isEmpty() ? 1 : 0)) {
            cS();
            "".length();
            return;
        }
        int i = lIlIIlIIIlll[1];
        while (llIllIIIIllIlI(i, all.size())) {
            NPC npc2 = (NPC) all.get(i);
            if (llIllIIIIllIII(npc2)) {
                "".length();
                if ("   ".length() > (195 ^ 199)) {
                    return;
                }
            } else {
                C0042q c0042q = new C0042q(npc2);
                if (llIllIIIIlllII(this.dG.contains(c0042q) ? 1 : 0)) {
                    this.dG.add(c0042q);
                    "".length();
                    System.out.println("Adding more mystics | index: " + npc2.getIndex());
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
        this.dG.removeIf(c0042q2 -> {
            if (llIllIIIIllIII(c0042q2.aP())) {
                ?? r0 = lIlIIlIIIlll[2];
                "".length();
                return "   ".length() == ((123 ^ 100) & ((38 ^ 57) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIlIIIlll[1];
        });
        "".length();
        for (C0042q c0042q3 : this.dG) {
            if (llIllIIIIlIlll(c0042q3.aR() ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                Actor interacting = c0042q3.aP().getInteracting();
                if (llIllIIIIlllIl(c0042q3.aP().getWorldArea().distanceTo(this.bS), lIlIIlIIIlll[6]) && llIllIIIIllIIl(interacting) && llIllIIIIlIlll(interacting.equals(this.bS) ? 1 : 0) && llIllIIIIlIlll(c0042q3.aP().isMoving() ? 1 : 0)) {
                    c0042q3.g(lIlIIlIIIlll[2]);
                }
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
    }

    private static boolean llIllIIIIlIlll(int i) {
        return i != 0;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllIIIIlIlll(tileObject.getName().equals(lIlIIlIIIllI[lIlIIlIIIlll[10]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIIlll[2]];
                strArr[lIlIIlIIIlll[1]] = lIlIIlIIIllI[lIlIIlIIIlll[18]];
                if (llIllIIIIlIlll(tileObject.hasAction(strArr) ? 1 : 0) && llIllIIIIlIlll(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIIlll[2];
                    "".length();
                    return "  ".length() <= 0 ? ((178 ^ 148) ^ (78 ^ 116)) & (((((8 + 101) - (-28)) + 84) ^ (((161 + 189) - 249) + 92)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIlIIIlll[1];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Inject
    protected aC(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dF = new HashSet();
        this.dG = new ArrayList();
        this.am = lIlIIlIIIlll[0];
        this.dH = lIlIIlIIIlll[1];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIlllII(int i) {
        return i == 0;
    }

    private static boolean llIllIIIIlllll(int i, int i2) {
        return i != i2;
    }

    private static String llIllIIIIlIIll(String lllllllllllllllIllIllIlllllllIIl, String lllllllllllllllIllIllIllllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIllllllIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlll[10]), "DES");
            Cipher lllllllllllllllIllIllIlllllllIll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlllllllIll.init(lIlIIlIIIlll[3], secretKeySpec);
            return new String(lllllllllllllllIllIllIlllllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlllllllIlI) {
            lllllllllllllllIllIllIlllllllIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIlIlII(String lllllllllllllllIllIllIlllllIllII, String lllllllllllllllIllIllIlllllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlllllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlllllIlllI.init(lIlIIlIIIlll[3], lllllllllllllllIllIllIlllllIllll);
            return new String(lllllllllllllllIllIllIlllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlllllIllIl) {
            lllllllllllllllIllIllIlllllIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    private static boolean a(Client client, Tile tile, Tile tile2) {
        int i;
        int i2;
        int i3;
        int i4;
        if (llIllIIIIlllll(tile.getPlane(), tile2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        CollisionData[] collisionMaps = client.getCollisionMaps();
        if (llIllIIIIllIII(collisionMaps)) {
            return lIlIIlIIIlll[1];
        }
        int[][] flags = collisionMaps[tile.getPlane()].getFlags();
        Point sceneLocation = tile.getSceneLocation();
        Point sceneLocation2 = tile2.getSceneLocation();
        if (llIllIIIIllIll(sceneLocation.getX(), sceneLocation2.getX()) && llIllIIIIllIll(sceneLocation.getY(), sceneLocation2.getY())) {
            return lIlIIlIIIlll[2];
        }
        int x = sceneLocation2.getX() - sceneLocation.getX();
        int y = sceneLocation2.getY() - sceneLocation.getY();
        int abs = Math.abs(x);
        int lllllllllllllllIllIlllIIIIlIllIl = Math.abs(y);
        int i5 = lIlIIlIIIlll[9];
        int i6 = lIlIIlIIIlll[9];
        if (llIllIIIlIIIIl(x)) {
            i = i5 | lIlIIlIIIlll[10];
            "".length();
            if (((((40 + 109) - (-6)) + 4) ^ (((3 + 43) - (-74)) + 35)) <= 0) {
                return ((202 ^ 166) ^ (125 ^ 115)) & (((((83 + 71) - 61) + 149) ^ (((124 + 65) - 168) + 123)) ^ (-" ".length()));
            }
        } else {
            i = i5 | lIlIIlIIIlll[11];
        }
        if (llIllIIIlIIIIl(y)) {
            i2 = i6 | lIlIIlIIIlll[3];
            "".length();
            if ((-"   ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = i6 | lIlIIlIIIlll[12];
        }
        if (llIllIIIlIIIlI(abs, lllllllllllllllIllIlllIIIIlIllIl)) {
            int x2 = sceneLocation.getX();
            int y2 = sceneLocation.getY() << lIlIIlIIIlll[7];
            int i7 = (y << lIlIIlIIIlll[7]) / abs;
            int i8 = y2 + lIlIIlIIIlll[13];
            if (llIllIIIlIIIIl(y)) {
                i8--;
            }
            if (llIllIIIlIIIIl(x)) {
                i4 = lIlIIlIIIlll[0];
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i4 = lIlIIlIIIlll[2];
            }
            int i9 = i4;
            while (llIllIIIIlllll(x2, sceneLocation2.getX())) {
                x2 += i9;
                int i10 = i8 >>> lIlIIlIIIlll[7];
                if (llIllIIIIlIlll(flags[x2][i10] & i)) {
                    return lIlIIlIIIlll[1];
                }
                i8 += i7;
                int i11 = i8 >>> lIlIIlIIIlll[7];
                if (llIllIIIIlllll(i11, i10) && llIllIIIIlIlll(flags[x2][i11] & i2)) {
                    return lIlIIlIIIlll[1];
                }
                "".length();
                if ((-" ".length()) >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            "".length();
            if (((127 ^ 63) & ((35 ^ 99) ^ (-1))) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            int y3 = sceneLocation.getY();
            int x3 = sceneLocation.getX() << lIlIIlIIIlll[7];
            int i12 = (x << lIlIIlIIIlll[7]) / lllllllllllllllIllIlllIIIIlIllIl;
            int i13 = x3 + lIlIIlIIIlll[13];
            if (llIllIIIlIIIIl(x)) {
                i13--;
            }
            if (llIllIIIlIIIIl(y)) {
                i3 = lIlIIlIIIlll[0];
                "".length();
                if (((147 ^ 169) ^ (35 ^ 29)) < 0) {
                    return ((246 ^ 140) ^ (171 ^ 135)) & (((91 ^ 84) ^ (110 ^ 55)) ^ (-" ".length()));
                }
            } else {
                i3 = lIlIIlIIIlll[2];
            }
            int i14 = i3;
            while (llIllIIIIlllll(y3, sceneLocation2.getY())) {
                y3 += i14;
                int i15 = i13 >>> lIlIIlIIIlll[7];
                if (llIllIIIIlIlll(flags[i15][y3] & i2)) {
                    return lIlIIlIIIlll[1];
                }
                i13 += i12;
                int i16 = i13 >>> lIlIIlIIIlll[7];
                if (llIllIIIIlllll(i16, i15) && llIllIIIIlIlll(flags[i16][y3] & i)) {
                    return lIlIIlIIIlll[1];
                }
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIlIIlIIIlll[2];
    }

    private static boolean llIllIIIIllIII(Object obj) {
        return obj == null;
    }

    private static boolean llIllIIIIlllIl(int i, int i2) {
        return i <= i2;
    }

    private static String llIllIIIIlIIlI(String lllllllllllllllIllIllIllllIlllII, String lllllllllllllllIllIllIllllIllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIllIllllIllIIl = lllllllllllllllIllIllIllllIllIll.toCharArray();
        int lllllllllllllllIllIllIllllIllIII = lIlIIlIIIlll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIIlll[1];
        while (llIllIIIIllIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIllIllllIllIIl[lllllllllllllllIllIllIllllIllIII % lllllllllllllllIllIllIllllIllIIl.length]));
            "".length();
            lllllllllllllllIllIllIllllIllIII++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIllIIIIlIllI();
        llIllIIIIlIlIl();
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        if (llIllIIIIllIII(NPCs.getNearest(npc -> {
            if (llIllIIIIlIlll(npc.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[6]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIIIlll[2]];
                strArr[lIlIIlIIIlll[1]] = lIlIIlIIIllI[lIlIIlIIIlll[19]];
                if (llIllIIIIlIlll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIIlll[2];
                    "".length();
                    return ((5 ^ 48) & ((128 ^ 181) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIlIIIlll[1];
        }))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List offensive = Prayers.getOffensive();
        arrayList.add(Prayer.PROTECT_FROM_MAGIC);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        cV();
        if (llIllIIIIlIlll(this.dG.isEmpty() ? 1 : 0)) {
            return cS();
        }
        if (llIllIIIIlIlll(this.dH ? 1 : 0)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[1]]);
            NPC nearest = NPCs.getNearest(npc -> {
                return npc.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[22]]);
            });
            if (llIllIIIIllIII(nearest)) {
                return lIlIIlIIIlll[1];
            }
            if (llIllIIIIllIIl(this.bS.getInteracting()) && llIllIIIIlIlll(this.bS.getInteracting().getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[2]]) ? 1 : 0)) {
                return lIlIIlIIIlll[2];
            }
            nearest.interact(lIlIIlIIIllI[lIlIIlIIIlll[3]]);
            return lIlIIlIIIlll[2];
        }
        C0042q orElse = this.dG.stream().filter(c0042q -> {
            if (llIllIIIIllIIl(c0042q.aP()) && llIllIIIIlllII(c0042q.aR() ? 1 : 0)) {
                ?? r0 = lIlIIlIIIlll[2];
                "".length();
                return "  ".length() <= 0 ? ((((140 + 73) - 184) + 128) ^ (((63 + 60) - 90) + 165)) & (((90 ^ 47) ^ (95 ^ 113)) ^ (-" ".length())) : r0;
            }
            return lIlIIlIIIlll[1];
        }).min(Comparator.comparingInt(c0042q2 -> {
            return this.bS.getWorldLocation().distanceToPath(this.cq, c0042q2.aP().getWorldLocation());
        })).orElse(null);
        if (!llIllIIIIllIII(orElse)) {
            WorldPoint worldPoint = (WorldPoint) orElse.aP().getWorldLocation().createWorldArea(lIlIIlIIIlll[4]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (llIllIIIIlIlll(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llIllIIIlIIIII(orElse.aP().getWorldArea().distanceTo(worldPoint2), lIlIIlIIIlll[3]) && llIllIIIIlIlll(a(this.cq, orElse.aP().getWorldArea(), worldPoint2.toWorldArea()) ? 1 : 0)) {
                    ?? r0 = lIlIIlIIIlll[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIlIIIlll[1];
            }).min(Comparator.comparingInt(worldPoint3 -> {
                return worldPoint3.distanceTo(this.bS);
            })).orElse(null);
            if (llIllIIIIllIII(worldPoint)) {
                System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[5]]);
                return lIlIIlIIIlll[2];
            }
            Movement.setDestination(worldPoint);
            return lIlIIlIIIlll[2];
        }
        System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[4]]);
        WorldPoint c2 = H.MYSTICS_SAFESPOT.c(this.ak);
        if (!llIllIIIIlIlll(this.bS.getWorldLocation().equals(c2) ? 1 : 0)) {
            Movement.setDestination(c2);
            return lIlIIlIIIlll[2];
        }
        int i = lIlIIlIIIlll[1];
        while (llIllIIIIllIlI(i, this.dG.size())) {
            C0042q c0042q3 = this.dG.get(i);
            if (llIllIIIIllIIl(c0042q3.aP()) && llIllIIIIlIlll(c0042q3.aP().isMoving() ? 1 : 0)) {
                return lIlIIlIIIlll[2];
            }
            i++;
            "".length();
            if ((((((215 + 215) - 349) + 160) ^ (((157 + 137) - 219) + 97)) & (((((126 + 20) - 14) + 71) ^ (((74 + 15) - (-28)) + 33)) ^ (-" ".length()))) != 0) {
                return ((161 ^ 130) ^ (254 ^ 134)) & (((125 ^ 56) ^ (160 ^ 190)) ^ (-" ".length()));
            }
        }
        if (llIllIIIIllIll(this.dG.size(), NPCs.getAll(npc2 -> {
            if (llIllIIIIlIlll(npc2.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[21]]) ? 1 : 0) && llIllIIIIlIlll(this.ak.a((Locatable) npc2) ? 1 : 0)) {
                ?? r0 = lIlIIlIIIlll[2];
                "".length();
                return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIlIIIlll[1];
        }).size())) {
            this.dH = lIlIIlIIIlll[2];
        }
        return lIlIIlIIIlll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllIIIIllllI(this.ak.bw, N.MYSTICS)) {
            return lIlIIlIIIlll[2];
        }
        this.dG.clear();
        this.dH = lIlIIlIIIlll[1];
        return lIlIIlIIIlll[1];
    }

    private static void llIllIIIIlIlIl() {
        lIlIIlIIIllI = new String[lIlIIlIIIlll[23]];
        lIlIIlIIIllI[lIlIIlIIIlll[1]] = llIllIIIIlIIlI("PwouDTkoC28dMCsKPB4+OQ==", "MoOnQ");
        lIlIIlIIIllI[lIlIIlIIIlll[2]] = llIllIIIIlIIll("naJ/UcXDfwU=", "NpNTA");
        lIlIIlIIIllI[lIlIIlIIIlll[3]] = llIllIIIIlIIll("gS3ZZeMM07g=", "DYpah");
        lIlIIlIIIllI[lIlIIlIIIlll[4]] = llIllIIIIlIlII("1+YZspLkB2+EPCeFRzimmkZkIKkOnT3sBglPcr9i89M=", "eliuM");
        lIlIIlIIIllI[lIlIIlIIIlll[5]] = llIllIIIIlIlII("dRXIuLINz1ThN/d8t3+/UYvTqAZyBEeq", "nrHTa");
        lIlIIlIIIllI[lIlIIlIIIlll[8]] = llIllIIIIlIIlI("Egk5DBA=", "WgMib");
        lIlIIlIIIllI[lIlIIlIIIlll[14]] = llIllIIIIlIIll("xTXJGcqVL6U=", "IgZit");
        lIlIIlIIIllI[lIlIIlIIIlll[17]] = llIllIIIIlIIll("ewjEcVmpWz2NwWQ2SsTSkVdLgUUvZ/gOkg6XYYguRvQ=", "fqbYj");
        lIlIIlIIIllI[lIlIIlIIIlll[10]] = llIllIIIIlIIlI("Ki0iIQcdKQ==", "zLQRf");
        lIlIIlIIIllI[lIlIIlIIIlll[18]] = llIllIIIIlIIll("eY8rmLssaog=", "Ohrpi");
        lIlIIlIIIllI[lIlIIlIIIlll[6]] = llIllIIIIlIIll("C/9nP8wdDa0=", "tpruD");
        lIlIIlIIIllI[lIlIIlIIIlll[19]] = llIllIIIIlIIll("j51SYi18v2M=", "KYssT");
        lIlIIlIIIllI[lIlIIlIIIlll[20]] = llIllIIIIlIIll("nUVF6PgixU0dZegKB+OJ7A==", "AhbDd");
        lIlIIlIIIllI[lIlIIlIIIlll[21]] = llIllIIIIlIIll("NCjBhynwSCU=", "dAjEw");
        lIlIIlIIIllI[lIlIIlIIIlll[22]] = llIllIIIIlIIlI("IB40EAsO", "mgGdb");
    }

    private static boolean llIllIIIlIIIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    @Subscribe(priority = 1.0f)
    private void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (llIllIIIIlIlll(actor.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[14]]) ? 1 : 0)) {
            int index = actor.getIndex();
            for (C0042q c0042q : this.dG) {
                if (llIllIIIIllIll(c0042q.aP().getIndex(), index)) {
                    if (llIllIIIIllIll(actor.getAnimation(), lIlIIlIIIlll[15])) {
                        Player local = Players.getLocal();
                        if (llIllIIIIllIIl(local)) {
                            Actor interacting = local.getInteracting();
                            if (llIllIIIIllIIl(interacting) && llIllIIIIlIlll(interacting.equals(actor) ? 1 : 0)) {
                                return;
                            }
                        }
                        c0042q.g(lIlIIlIIIlll[1]);
                    }
                    if (llIllIIIIllIll(actor.getAnimation(), lIlIIlIIIlll[16])) {
                        c0042q.g(lIlIIlIIIlll[2]);
                    }
                    System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[17]]);
                }
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean b(Client client, WorldArea worldArea, WorldArea worldArea2) {
        int i;
        int i2;
        int i3;
        int i4;
        int plane = worldArea.getPlane();
        int x = worldArea.getX();
        int y = worldArea.getY();
        int width = worldArea.getWidth();
        int height = worldArea.getHeight();
        if (llIllIIIIlllll(plane, worldArea2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        LocalPoint fromWorld = LocalPoint.fromWorld(client, x, y);
        LocalPoint fromWorld2 = LocalPoint.fromWorld(client, worldArea2.getX(), worldArea2.getY());
        if (!llIllIIIIllIIl(fromWorld) || llIllIIIIllIII(fromWorld2)) {
            return lIlIIlIIIlll[1];
        }
        int sceneX = fromWorld.getSceneX();
        int sceneY = fromWorld.getSceneY();
        int sceneX2 = fromWorld2.getSceneX();
        int sceneY2 = fromWorld2.getSceneY();
        if (llIllIIIIlllIl(sceneX2, sceneX)) {
            i = sceneX;
            "".length();
            if (((121 ^ 124) ^ " ".length()) < (-" ".length())) {
                return ((((146 + 82) - 92) + 32) ^ (((8 + 16) - (-20)) + 110)) & (((((41 + 144) - 119) + 97) ^ (((88 + 74) - 29) + 12)) ^ (-" ".length()));
            }
        } else if (llIllIIIlIIIII(sceneX2, (sceneX + width) - lIlIIlIIIlll[2])) {
            i = (sceneX + width) - lIlIIlIIIlll[2];
            "".length();
            if ((-(120 ^ 124)) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = sceneX2;
        }
        if (llIllIIIIlllIl(sceneY2, sceneY)) {
            i2 = sceneY;
            "".length();
            if ((-"   ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llIllIIIlIIIII(sceneY2, (sceneY + height) - lIlIIlIIIlll[2])) {
            i2 = (sceneY + height) - lIlIIlIIIlll[2];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = sceneY2;
        }
        if (llIllIIIIlllIl(sceneX, sceneX2)) {
            i3 = sceneX2;
            "".length();
            if ((((66 ^ 23) ^ (31 ^ 103)) & (((27 ^ 99) ^ (242 ^ 167)) ^ (-" ".length()))) != 0) {
                return " ".length() & (" ".length() ^ (-" ".length()));
            }
        } else if (llIllIIIlIIIII(sceneX, (sceneX2 + worldArea2.getWidth()) - lIlIIlIIIlll[2])) {
            i3 = (sceneX2 + worldArea2.getWidth()) - lIlIIlIIIlll[2];
            "".length();
            if (0 != 0) {
                return ((33 ^ 118) ^ (18 ^ 26)) & (((244 ^ 159) ^ (157 ^ 169)) ^ (-" ".length()));
            }
        } else {
            i3 = sceneX;
        }
        if (llIllIIIIlllIl(sceneY, sceneY2)) {
            i4 = sceneY2;
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llIllIIIlIIIII(sceneY, (sceneY2 + worldArea2.getHeight()) - lIlIIlIIIlll[2])) {
            i4 = (sceneY2 + worldArea2.getHeight()) - lIlIIlIIIlll[2];
            "".length();
            if ((((40 ^ 21) ^ (42 ^ 54)) & (((33 ^ 74) ^ (238 ^ 164)) ^ (-" ".length()))) != 0) {
                return ((((198 + 111) - 281) + 187) ^ (((26 + 101) - 109) + 122)) & (((((154 + 110) - 213) + 156) ^ (((37 + 18) - 2) + 95)) ^ (-" ".length()));
            }
        } else {
            i4 = sceneY;
        }
        Tile[][][] tiles = client.getScene().getTiles();
        Tile tile = tiles[plane][i][i2];
        Tile tile2 = tiles[worldArea2.getPlane()][i3][i4];
        return (!llIllIIIIllIIl(tile) || llIllIIIIllIII(tile2)) ? lIlIIlIIIlll[1] : a(client, tile, tile2);
    }

    private static boolean llIllIIIlIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllIIIIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIllIIIIllIll(int i, int i2) {
        return i == i2;
    }

    private static void llIllIIIIlIllI() {
        lIlIIlIIIlll = new int[24];
        lIlIIlIIIlll[0] = -" ".length();
        lIlIIlIIIlll[1] = ((140 ^ 157) ^ (105 ^ 68)) & (((67 ^ 85) ^ (58 ^ 16)) ^ (-" ".length()));
        lIlIIlIIIlll[2] = " ".length();
        lIlIIlIIIlll[3] = "  ".length();
        lIlIIlIIIlll[4] = "   ".length();
        lIlIIlIIIlll[5] = (96 ^ 54) ^ (97 ^ 51);
        lIlIIlIIIlll[6] = 12 ^ 6;
        lIlIIlIIIlll[7] = 81 ^ 65;
        lIlIIlIIIlll[8] = (18 ^ 90) ^ (241 ^ 188);
        lIlIIlIIIlll[9] = (-6843) & 2366394;
        lIlIIlIIIlll[10] = (176 ^ 150) ^ (55 ^ 25);
        lIlIIlIIIlll[11] = (("  ".length() + (90 ^ 93)) - (118 ^ 113)) + (185 ^ 199);
        lIlIIlIIIlll[12] = 146 ^ 178;
        lIlIIlIIIlll[13] = (-21687) & 54454;
        lIlIIlIIIlll[14] = 147 ^ 149;
        lIlIIlIIIlll[15] = (-10310) & 15837;
        lIlIIlIIIlll[16] = (-((-4865) & 13201)) & (-16897) & 30719;
        lIlIIlIIIlll[17] = 48 ^ 55;
        lIlIIlIIIlll[18] = (248 ^ 161) ^ (232 ^ 184);
        lIlIIlIIIlll[19] = (((86 + 4) - 55) + 93) ^ (((132 + 130) - 142) + 19);
        lIlIIlIIIlll[20] = 185 ^ 181;
        lIlIIlIIIlll[21] = 105 ^ 100;
        lIlIIlIIIlll[22] = 75 ^ 69;
        lIlIIlIIIlll[23] = 109 ^ 98;
    }
}
