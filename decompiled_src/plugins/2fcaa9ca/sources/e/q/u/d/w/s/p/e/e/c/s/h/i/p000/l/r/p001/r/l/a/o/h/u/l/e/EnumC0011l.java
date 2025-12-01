package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/l.class */
public final class EnumC0011l {
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    /* synthetic */ List<Pair<Integer, Integer>> waitPairs;
    public static final /* synthetic */ EnumC0011l SOUTH_III_I;
    private static final /* synthetic */ EnumC0011l[] $VALUES;
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    /* synthetic */ Supplier<WorldPoint> startDestination;
    private static /* synthetic */ String[] lllIIIllIlIl;
    /* synthetic */ EnumC0012m type;
    /* synthetic */ Supplier<WorldArea> dartArea;
    private static /* synthetic */ int[] lllIIIlllIII;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public /* synthetic */ Supplier<TileObject> object;

    private static boolean lIIIlIIllIIIlIl(int i) {
        return i == 0;
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static boolean lIIIlIIllIIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIIllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIllIIIllI(Object obj) {
        return obj != null;
    }

    private static void lIIIlIIlIlllllI() {
        lllIIIllIlIl = new String[lllIIIlllIII[13]];
        lllIIIllIlIl[lllIIIlllIII[0]] = lIIIlIIlIlllIll("AQYMJhgyTyUzCyIaEw==", "VovGj");
        lllIIIllIlIl[lllIIIlllIII[1]] = lIIIlIIlIllllII("7eA3wKxkB7DK5zuonL5zRg==", "uxDfl");
        lllIIIllIlIl[lllIIIlllIII[4]] = lIIIlIIlIlllIll("MjcZKxITKgE1AB9lJSwABTAT", "qEvXa");
        lllIIIllIlIl[lllIIIlllIII[3]] = lIIIlIIlIllllIl("6D/y+DNJpUyr5kpCOX3XOZ/oEAPQqvGr", "kXmWo");
        lllIIIllIlIl[lllIIIlllIII[11]] = lIIIlIIlIlllIll("GwcxIQUXAS08EgE=", "HHduM");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private boolean T() {
        int worldY = this.startPoint.get().getWorldY();
        Player local = Players.getLocal();
        if (lIIIlIIllIIIIlI(local)) {
            return lllIIIlllIII[0];
        }
        int lllllllllllllllIIllIllIlIIIlIIIl = local.getWorldY();
        int i = lllIIIlllIII[4];
        for (Pair<Integer, Integer> pair : this.waitPairs) {
            if (lIIIlIIllIIllIl(lllllllllllllllIIllIllIlIIIlIIIl, ((Integer) pair.getFirst()).intValue() + worldY)) {
                if (!lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIIlIIIl, ((Integer) pair.getSecond()).intValue() + worldY)) {
                    return lllIIIlllIII[1];
                }
                "".length();
                if ((-"   ".length()) >= 0) {
                    return ((((32 + 73) - 58) + 89) ^ (((62 + 80) - 76) + 121)) & (((((22 + 122) - 37) + 75) ^ (((68 + 31) - 0) + 34)) ^ (-" ".length()));
                }
            }
        }
        return lllIIIlllIII[0];
    }

    private int U() {
        int lllllllllllllllIIllIllIlIIIIIIll = this.startPoint.get().getWorldY();
        Player local = Players.getLocal();
        if (lIIIlIIllIIIIlI(local)) {
            return lllIIIlllIII[5];
        }
        int lllllllllllllllIIllIllIlIIIIIIIl = local.getWorldY();
        int i = lllIIIlllIII[4];
        for (Pair<Integer, Integer> pair : this.waitPairs) {
            if (lIIIlIIllIIllIl(lllllllllllllllIIllIllIlIIIIIIIl, ((Integer) pair.getFirst()).intValue() + lllllllllllllllIIllIllIlIIIIIIll)) {
                if (!lIIIlIIllIIlIll(lllllllllllllllIIllIllIlIIIIIIIl, ((Integer) pair.getSecond()).intValue() + lllllllllllllllIIllIllIlIIIIIIll)) {
                    return lIIIlIIllIIlIII(lllllllllllllllIIllIllIlIIIIIIIl, lllllllllllllllIIllIllIlIIIIIIll + ((Integer) pair.getSecond()).intValue()) ? lllIIIlllIII[1] : lllIIIlllIII[0];
                }
                "".length();
                if ("  ".length() == 0) {
                    return ((21 ^ 102) ^ (123 ^ 56)) & (((((187 + 156) - 213) + 59) ^ (((33 + 118) - 106) + 96)) ^ (-" ".length()));
                }
            }
        }
        return lllIIIlllIII[5];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    static {
        lIIIlIIllIIIIIl();
        lIIIlIIlIlllllI();
        SOUTH_III_I = new EnumC0011l(lllIIIllIlIl[lllIIIlllIII[11]], lllIIIlllIII[0], List.of(new Triple(new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[4], lllIIIlllIII[1], C0001b.J), Integer.valueOf(lllIIIlllIII[1]), Integer.valueOf(lllIIIlllIII[11])), new Triple(new RegionPoint(lllIIIlllIII[12], lllIIIlllIII[4], lllIIIlllIII[1], C0001b.J), Integer.valueOf(lllIIIlllIII[1]), Integer.valueOf(lllIIIlllIII[11]))), new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[13], lllIIIlllIII[1], C0001b.J), new RegionPoint(lllIIIlllIII[14], lllIIIlllIII[15], lllIIIlllIII[4], C0001b.J), List.of(new Pair(Integer.valueOf(lllIIIlllIII[16]), Integer.valueOf(lllIIIlllIII[1])), new Pair(Integer.valueOf(lllIIIlllIII[10]), Integer.valueOf(lllIIIlllIII[2]))), new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[18], lllIIIlllIII[1], C0001b.K), lllIIIlllIII[3], lllIIIlllIII[19], new RegionPoint(lllIIIlllIII[17], lllIIIlllIII[12], lllIIIlllIII[4], C0001b.J), EnumC0012m.NORTH_BACK);
        EnumC0011l[] enumC0011lArr = new EnumC0011l[lllIIIlllIII[1]];
        enumC0011lArr[lllIIIlllIII[0]] = SOUTH_III_I;
        $VALUES = enumC0011lArr;
    }

    private static boolean lIIIlIIllIIIlll(int i, int i2) {
        return i == i2;
    }

    private static String lIIIlIIlIlllIll(String lllllllllllllllIIllIllIIllIIIlIl, String lllllllllllllllIIllIllIIllIIIlII) {
        String lllllllllllllllIIllIllIIllIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIllIIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIIllIIIlII.toCharArray();
        int lllllllllllllllIIllIllIIllIIIIIl = lllIIIlllIII[0];
        char[] charArray2 = lllllllllllllllIIllIllIIllIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlllIII[0];
        while (lIIIlIIllIIlIII(i, length)) {
            lllllllllllllllIIllIllIIllIIIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIllIIllIIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIIllIIIIIl++;
            i++;
            "".length();
            if ((85 ^ 81) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllIIllIIIIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean d(C0003d c0003d) {
        WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIlllIII[6], lllIIIlllIII[7], lllIIIlllIII[1], C0001b.J));
        String[] strArr = new String[lllIIIlllIII[1]];
        strArr[lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[0]];
        TileObject nearest = TileObjects.getNearest(a, strArr);
        WorldPoint a2 = SquireSepulchre.a(new RegionPoint(lllIIIlllIII[8], lllIIIlllIII[7], lllIIIlllIII[1], C0001b.J));
        String[] strArr2 = new String[lllIIIlllIII[1]];
        strArr2[lllIIIlllIII[0]] = lllIIIllIlIl[lllIIIlllIII[1]];
        TileObject nearest2 = TileObjects.getNearest(a2, strArr2);
        if (!lIIIlIIllIIIllI(nearest) || lIIIlIIllIIIIlI(nearest2)) {
            return lllIIIlllIII[0];
        }
        J b = c0003d.b(nearest);
        J b2 = c0003d.b(nearest2);
        return ((!lIIIlIIllIIIlll(b.aG(), C0001b.o) || lIIIlIIllIIlllI(b.aF(), lllIIIlllIII[4])) && !(lIIIlIIllIIIlll(b2.aG(), C0001b.o) && lIIIlIIllIIIlll(b2.aF(), lllIIIlllIII[4]))) ? lllIIIlllIII[0] : lllIIIlllIII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIllIIIIll(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIlllIII[1];
            }
            "".length();
            if ("   ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIlllIII[0];
    }

    private EnumC0011l(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, List list, RegionPoint regionPoint4, int i4, int i5, RegionPoint regionPoint5, EnumC0012m enumC0012m) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint4), i4, i5);
        };
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint5);
        };
        this.type = enumC0012m;
    }

    private EnumC0011l(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, List list2, RegionPoint regionPoint3, int i2, int i3, RegionPoint regionPoint4, EnumC0012m enumC0012m) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIllIIIIll(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ((-" ".length()) > (178 ^ 182)) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.type = enumC0012m;
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint3), i2, i3);
        };
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint4);
        };
        this.waitPairs = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean c(C0003d c0003d) {
        Player local = Players.getLocal();
        if (lIIIlIIllIIIIlI(local)) {
            return lllIIIlllIII[0];
        }
        int i = lllIIIlllIII[4];
        if (lIIIlIIllIIIIll(T() ? 1 : 0)) {
            if (lIIIlIIllIIIIll(d(c0003d) ? 1 : 0)) {
                i = lllIIIlllIII[4];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = U();
            }
        }
        List worldPointList = new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() - lllIIIlllIII[3], local.getWorldY() + i, local.getPlane()), lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
        List<TileObject> all = TileObjects.getAll(tileObject -> {
            if (lIIIlIIllIIlIII(Math.abs(local.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && lIIIlIIllIIlIll(Math.abs(local.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[4]) && lIIIlIIllIIIlll(local.getPlane(), tileObject.getPlane()) && lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[4]]) ? 1 : 0)) {
                ?? r0 = lllIIIlllIII[1];
                "".length();
                return 0 != 0 ? ((127 ^ 103) ^ (170 ^ 161)) & (((((90 + 93) - 122) + 82) ^ (((148 + 154) - 255) + 109)) ^ (-" ".length())) : r0;
            }
            return lllIIIlllIII[0];
        });
        ArrayList arrayList = new ArrayList();
        if (lIIIlIIllIIlIlI(all.size())) {
            int i2 = lllIIIlllIII[0];
            int i3 = lllIIIlllIII[0];
            for (TileObject tileObject2 : all) {
                int a = C0002c.a(tileObject2);
                if (lIIIlIIllIIIlll(a, C0001b.x)) {
                    i3++;
                }
                if (lIIIlIIllIIlIll(a, C0001b.y)) {
                    i2++;
                    arrayList.add(Integer.valueOf(tileObject2.getWorldX()));
                    "".length();
                    "".length();
                    if (!((true ^ true) ^ (true ^ true))) {
                        return ((((174 + 197) - 319) + 146) ^ (((20 + 24) - (-40)) + 61)) & (((60 ^ 98) ^ (186 ^ 179)) ^ (-" ".length()));
                    }
                } else {
                    i3++;
                    "".length();
                    if (0 != 0) {
                        return ((((41 + 66) - 23) + 51) ^ (((132 + 24) - 81) + 74)) & (((140 ^ 181) ^ (161 ^ 138)) ^ (-" ".length()));
                    }
                }
            }
            worldPointList.removeIf(worldPoint -> {
                return arrayList.contains(Integer.valueOf(worldPoint.getWorldX()));
            });
            "".length();
            if (lIIIlIIllIIIlll(worldPointList.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint) worldPointList.get(lllIIIlllIII[0]));
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[1];
        }
        List<NPC> all2 = NPCs.getAll(npc -> {
            if (lIIIlIIllIIIIll(C0001b.z.contains(Integer.valueOf(npc.getId())) ? 1 : 0) && lIIIlIIllIIlIII(npc.getWorldY(), local.getWorldY() + lllIIIlllIII[4]) && lIIIlIIllIIlIII(Math.abs(npc.getWorldX() - local.getWorldX()), lllIIIlllIII[3]) && lIIIlIIllIIlIll(npc.getWorldY(), local.getWorldY() - lllIIIlllIII[9]) && lIIIlIIllIIIlll(npc.getPlane(), local.getPlane())) {
                ?? r0 = lllIIIlllIII[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIlllIII[0];
        });
        all2.sort(Comparator.comparingInt(npc2 -> {
            return Math.abs(npc2.getWorldX() - local.getWorldX()) + Math.abs(npc2.getWorldY() - local.getWorldY());
        }));
        arrayList.clear();
        for (NPC npc3 : all2) {
            if (lIIIlIIllIIlIII(arrayList.size(), lllIIIlllIII[4]) && lIIIlIIllIIIlIl(arrayList.contains(Integer.valueOf(npc3.getWorldX())) ? 1 : 0) && lIIIlIIllIIlIII(npc3.getWorldY(), local.getWorldY() + lllIIIlllIII[4])) {
                arrayList.add(Integer.valueOf(npc3.getWorldX()));
                "".length();
            }
            "".length();
            if ((-" ".length()) >= 0) {
                return ((71 ^ 112) ^ (117 ^ 77)) & (((((0 + 119) - 56) + 74) ^ (((115 + 66) - 121) + 74)) ^ (-" ".length()));
            }
        }
        arrayList.stream().sorted();
        "".length();
        worldPointList.removeIf(worldPoint2 -> {
            return arrayList.contains(Integer.valueOf(worldPoint2.getWorldX()));
        });
        "".length();
        if (lIIIlIIllIIIIll(worldPointList.size())) {
            if (lIIIlIIllIIIlll(worldPointList.size(), lllIIIlllIII[1])) {
                Movement.setDestination((WorldPoint) worldPointList.get(lllIIIlllIII[0]));
                return lllIIIlllIII[1];
            }
            Movement.setDestination((WorldPoint) worldPointList.get(lllIIIlllIII[0]));
            return lllIIIlllIII[1];
        }
        return lllIIIlllIII[0];
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static String lIIIlIIlIllllIl(String lllllllllllllllIIllIllIIlIllIIII, String lllllllllllllllIIllIllIIlIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlllIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIlIllIIIl) {
            lllllllllllllllIIllIllIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static boolean lIIIlIIllIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIllIIIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    public boolean S() {
        Player local = Players.getLocal();
        if (!lIIIlIIllIIIIlI(local) && !lIIIlIIllIIIlIl(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            List worldPointList = new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() - lllIIIlllIII[3], local.getWorldY() + lllIIIlllIII[1], local.getPlane()), lllIIIlllIII[3], lllIIIlllIII[1]).toWorldPointList();
            List<TileObject> all = TileObjects.getAll(tileObject -> {
                if (lIIIlIIllIIlIII(Math.abs(local.getWorldY() - tileObject.getWorldY()), lllIIIlllIII[10]) && lIIIlIIllIIlIII(Math.abs(local.getWorldX() - tileObject.getWorldX()), lllIIIlllIII[11]) && lIIIlIIllIIIlll(local.getPlane(), tileObject.getPlane()) && lIIIlIIllIIIIll(tileObject.getName().equals(lllIIIllIlIl[lllIIIlllIII[3]]) ? 1 : 0)) {
                    ?? r0 = lllIIIlllIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIII[0];
            });
            ArrayList arrayList = new ArrayList();
            if (lIIIlIIllIIlIlI(all.size())) {
                int i = lllIIIlllIII[0];
                int i2 = lllIIIlllIII[0];
                for (TileObject tileObject2 : all) {
                    int a = C0002c.a(tileObject2);
                    if (lIIIlIIllIIIlll(a, C0001b.x)) {
                        i2++;
                    }
                    if (lIIIlIIllIIlIll(a, C0001b.x)) {
                        i++;
                        arrayList.add(Integer.valueOf(tileObject2.getWorldX()));
                        "".length();
                        "".length();
                        if ((-" ".length()) > 0) {
                            return ((((11 + 158) - 94) + 149) ^ (((158 + 103) - 118) + 44)) & (((((39 + 205) - 169) + 168) ^ (((31 + 50) - (-73)) + 14)) ^ (-" ".length()));
                        }
                    } else {
                        i2++;
                        "".length();
                        if (((193 ^ 181) ^ (0 ^ 113)) <= 0) {
                            return ((169 ^ 151) ^ (30 ^ 118)) & (((143 ^ 158) ^ (37 ^ 98)) ^ (-" ".length()));
                        }
                    }
                }
                worldPointList.removeIf(worldPoint -> {
                    return arrayList.contains(Integer.valueOf(worldPoint.getWorldX()));
                });
                "".length();
                if (lIIIlIIllIIIlll(worldPointList.size(), lllIIIlllIII[1])) {
                    Movement.setDestination((WorldPoint) worldPointList.get(lllIIIlllIII[0]));
                    return lllIIIlllIII[1];
                }
                return lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (lIIIlIIllIIIIlI(local)) {
            return lllIIIlllIII[0];
        }
        if (!lIIIlIIllIIIIll(b((Locatable) local) ? 1 : 0)) {
            if (lIIIlIIllIIIIll(c((Locatable) local) ? 1 : 0)) {
                b(squireSepulchre);
                if (lIIIlIIllIIIlII(this.type, EnumC0012m.NORTH_BACK)) {
                    c(c0003d);
                    "".length();
                    return lllIIIlllIII[1];
                }
                return lllIIIlllIII[0];
            }
            return lllIIIlllIII[0];
        }
        a(squireSepulchre);
        if (lIIIlIIllIIIlII(this.type, EnumC0012m.NORTH_BACK) && lIIIlIIllIIIIll(S() ? 1 : 0)) {
            b(squireSepulchre);
            return lllIIIlllIII[1];
        } else if (lIIIlIIllIIIIll(R() ? 1 : 0)) {
            Movement.setDestination(this.startDestination.get());
            return lllIIIlllIII[1];
        } else {
            Movement.setDestination(this.startPoint.get());
            return lllIIIlllIII[1];
        }
    }

    public static EnumC0011l valueOf(String str) {
        return (EnumC0011l) Enum.valueOf(EnumC0011l.class, str);
    }

    private static boolean lIIIlIIllIIlllI(int i, int i2) {
        return i != i2;
    }

    private static String lIIIlIIlIllllII(String lllllllllllllllIIllIllIIlIlIIIll, String lllllllllllllllIIllIllIIlIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIlllIII[20]), "DES");
            Cipher lllllllllllllllIIllIllIIlIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIIlIlIIlIl.init(lllIIIlllIII[4], secretKeySpec);
            return new String(lllllllllllllllIIllIllIIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIlIlIIlII) {
            lllllllllllllllIIllIllIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIIlIIllIIIIIl() {
        lllIIIlllIII = new int[21];
        lllIIIlllIII[0] = ((107 ^ 99) ^ (85 ^ 71)) & (((((71 + 56) - 122) + 175) ^ (((124 + 77) - 64) + 37)) ^ (-" ".length()));
        lllIIIlllIII[1] = " ".length();
        lllIIIlllIII[2] = (14 ^ 39) ^ (66 ^ 96);
        lllIIIlllIII[3] = "   ".length();
        lllIIIlllIII[4] = "  ".length();
        lllIIIlllIII[5] = -" ".length();
        lllIIIlllIII[6] = 57 ^ 36;
        lllIIIlllIII[7] = 197 ^ 194;
        lllIIIlllIII[8] = (175 ^ 152) ^ (26 ^ 15);
        lllIIIlllIII[9] = 21 ^ 1;
        lllIIIlllIII[10] = (5 ^ 12) ^ "   ".length();
        lllIIIlllIII[11] = 61 ^ 57;
        lllIIIlllIII[12] = (((154 + 151) - 243) + 119) ^ (((75 + 146) - 219) + 169);
        lllIIIlllIII[13] = (177 ^ 162) ^ (215 ^ 193);
        lllIIIlllIII[14] = 59 ^ 1;
        lllIIIlllIII[15] = (79 ^ 37) ^ (112 ^ 48);
        lllIIIlllIII[16] = -(181 ^ 179);
        lllIIIlllIII[17] = (191 ^ 196) ^ (206 ^ 170);
        lllIIIlllIII[18] = 254 ^ 193;
        lllIIIlllIII[19] = 169 ^ 191;
        lllIIIlllIII[20] = (72 ^ 14) ^ (204 ^ 130);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean R() {
        Player local = Players.getLocal();
        if (!lIIIlIIllIIIIlI(local) && !lIIIlIIllIIIlIl(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            List all = NPCs.getAll(npc -> {
                if (lIIIlIIllIIlIII(npc.getWorldY(), local.getWorldY() + lllIIIlllIII[4])) {
                    ?? r0 = lllIIIlllIII[1];
                    "".length();
                    return (153 ^ 157) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIII[0];
            });
            all.sort(Comparator.comparingInt(npc2 -> {
                return Math.abs(npc2.getWorldX() - local.getWorldX()) + Math.abs(npc2.getWorldY() - local.getWorldY());
            }));
            NPC npc3 = (NPC) all.get(lllIIIlllIII[0]);
            if (lIIIlIIllIIIllI(npc3)) {
                return (lIIIlIIllIIIlll(npc3.getWorldX(), P().get().getWorldX()) && lIIIlIIllIIlIII(Math.abs(npc3.getWorldY() - local.getWorldY()), lllIIIlllIII[2])) ? lllIIIlllIII[0] : lllIIIlllIII[1];
            }
            return lllIIIlllIII[0];
        }
        return lllIIIlllIII[0];
    }

    private static boolean lIIIlIIllIIllIl(int i, int i2) {
        return i >= i2;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    public static EnumC0011l[] values() {
        return (EnumC0011l[]) $VALUES.clone();
    }

    private static boolean lIIIlIIllIIlIlI(int i) {
        return i > 0;
    }
}
