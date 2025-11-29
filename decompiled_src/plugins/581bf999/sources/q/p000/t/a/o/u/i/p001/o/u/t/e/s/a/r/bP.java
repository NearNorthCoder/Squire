package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Clearing boulder", priority = 150, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bP  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bP.class */
public class bP extends bX {
    private static /* synthetic */ int[] llIIlIIIlIl;
    private static final /* synthetic */ int gT;
    private static /* synthetic */ String[] llIIlIIIlII;
    private /* synthetic */ bQ gY;
    private static final /* synthetic */ int gW;
    private static final /* synthetic */ int gV;
    private final /* synthetic */ SquireAutoTOA gX;
    private static final /* synthetic */ int gS;
    private static final /* synthetic */ int gU;

    static {
        lIlIIIIIIlIIII();
        lIlIIIIIIIllll();
        gV = llIIlIIIlIl[5];
        gU = llIIlIIIlIl[18];
        gW = llIIlIIIlIl[6];
        gS = llIIlIIIlIl[7];
        gT = llIIlIIIlIl[17];
    }

    private static String lIlIIIIIIIlllI(String llllllllllllllllIlIIIIIIIlllllll, String llllllllllllllllIlIIIIIIIllllllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIlIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIlIl[4], llllllllllllllllIlIIIIIIlIIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIIlIIIIIII) {
            llllllllllllllllIlIIIIIIlIIIIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bP(Client client, C0077z c0077z, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, c0077z, tOAConfig);
        this.gX = squireAutoTOA;
    }

    private static boolean lIlIIIIIIllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIIIIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIIIlIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v129, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        int[] iArr = new int[llIIlIIIlIl[0]];
        iArr[llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List all = NPCs.getAll(iArr);
        if (lIlIIIIIIlIIIl(all.isEmpty() ? 1 : 0)) {
            this.gY = null;
            return llIIlIIIlIl[1];
        } else if (lIlIIIIIIlIIlI(cG().isEmpty() ? 1 : 0)) {
            return llIIlIIIlIl[1];
        } else {
            this.gX.a(llIIlIIIlIl[3]);
            NPC npc = (NPC) all.stream().filter(npc2 -> {
                return F(npc2).stream().anyMatch(worldPoint -> {
                    if (lIlIIIIIIlIIlI(p(worldPoint) ? 1 : 0)) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return ((3 ^ 7) & ((58 ^ 62) ^ (-1))) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIIlIl[1];
                });
            }).findFirst().orElse(null);
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIlIIIIIIlIIll(npc)) {
                WorldPoint dx = npc.getWorldLocation().dx(llIIlIIIlIl[0]);
                for (WorldPoint worldPoint : F(npc)) {
                    if (lIlIIIIIIlIIlI(p(worldPoint) ? 1 : 0)) {
                        dx = worldPoint;
                    }
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((8 ^ 24) ^ (23 ^ 61)) & (((((91 + 88) - 142) + 100) ^ (((96 + 136) - 230) + 177)) ^ (-" ".length()));
                    }
                }
                if (lIlIIIIIIlIIIl(worldLocation.equals(dx) ? 1 : 0)) {
                    this.gX.c();
                    return llIIlIIIlIl[1];
                }
                a(dx, this::P);
                return llIIlIIIlIl[0];
            }
            NPC nearest = NPCs.getNearest(npc3 -> {
                if (!lIlIIIIIIlIlll(npc3.getId(), llIIlIIIlIl[17]) || lIlIIIIIIllIII(npc3.getId(), llIIlIIIlIl[18])) {
                    ?? r0 = llIIlIIIlIl[0];
                    "".length();
                    return " ".length() > "   ".length() ? ((((82 + 108) - 125) + 70) ^ (((30 + 159) - 124) + 95)) & (((41 ^ 33) ^ (156 ^ 179)) ^ (-" ".length())) : r0;
                }
                return llIIlIIIlIl[1];
            });
            if (!lIlIIIIIIlIIll(nearest)) {
                if (lIlIIIIIIlIlII(this.gY)) {
                    this.gY = p(llIIlIIIlIl[6]);
                    return llIIlIIIlIl[0];
                }
                NPC cv = this.gY.cv();
                if (!lIlIIIIIIlIlII(cv) && !lIlIIIIIIlIlII(this.gY.cu())) {
                    WorldPoint ct = this.gY.ct();
                    if (!lIlIIIIIIlIIIl(worldLocation.equals(ct) ? 1 : 0)) {
                        a(ct, this::P);
                    } else if (lIlIIIIIIlIlIl(cv.getWorldLocation().distanceTo(this.gY.cw()), llIIlIIIlIl[0]) && lIlIIIIIIlIIIl(this.gY.hd ? 1 : 0)) {
                        cv.interact(llIIlIIIlII[llIIlIIIlIl[0]]);
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        cv.interact(llIIlIIIlII[llIIlIIIlIl[4]]);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((21 ^ 66) ^ (201 ^ 134)) & (((154 ^ 147) ^ (71 ^ 86)) ^ (-" ".length()));
                        }
                    }
                    return llIIlIIIlIl[0];
                }
                return llIIlIIIlIl[1];
            } else if (lIlIIIIIIlIIll(this.gY) && lIlIIIIIIlIIlI(this.gY.hd ? 1 : 0)) {
                WorldPoint ct2 = this.gY.ct();
                List<TileObject> cC = cC();
                WorldPoint worldPoint2 = (WorldPoint) ct2.createWorldArea(llIIlIIIlIl[4]).toWorldPointList().stream().filter(worldPoint3 -> {
                    if (lIlIIIIIIlIIlI(k(cC, worldPoint3) ? 1 : 0)) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return 0 != 0 ? ((161 ^ 197) ^ (211 ^ 134)) & (((20 ^ 119) ^ (91 ^ 9)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIIIlIl[1];
                }).min(Comparator.comparingInt(worldPoint4 -> {
                    return worldPoint4.distanceTo(ct2);
                })).orElse(null);
                WorldArea worldArea = cB().getWorldArea();
                a(worldPoint2, worldPoint5 -> {
                    if (lIlIIIIIIlIIlI(k(cC, worldPoint5) ? 1 : 0) && lIlIIIIIIlIIlI(worldArea.isInMeleeDistance(worldPoint5) ? 1 : 0) && lIlIIIIIIlIllI(worldArea.distanceTo2D(worldPoint5), llIIlIIIlIl[0])) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return "  ".length() >= ((((84 + 63) - 86) + 94) ^ (((69 + 76) - 20) + 34)) ? ((108 ^ 90) ^ (5 ^ 31)) & (((196 ^ 193) ^ (124 ^ 85)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIIIlIl[1];
                });
                return llIIlIIIlIl[0];
            } else {
                NPC npc4 = (NPC) all.stream().min(Comparator.comparingDouble(npc5 -> {
                    return npc5.distanceTo(nearest);
                })).orElse(null);
                if (lIlIIIIIIlIlII(npc4)) {
                    if (lIlIIIIIIlIlII(cA())) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return (((((20 + 149) - 53) + 78) ^ (((108 + 85) - 85) + 32)) & (((17 ^ 115) ^ (82 ^ 126)) ^ (-" ".length()))) > " ".length() ? ((251 ^ 168) ^ (100 ^ 13)) & (((((108 + 132) - 110) + 50) ^ (((84 + 63) - 29) + 24)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIIIlIl[1];
                }
                for (WorldPoint worldPoint6 : F(npc4)) {
                    if (lIlIIIIIIlIlIl(nearest.distanceTo(worldPoint6), llIIlIIIlIl[5]) && (!lIlIIIIIIlIIll(this.gY) || lIlIIIIIIlIIIl(this.gY.hd ? 1 : 0))) {
                        bp();
                        nearest.interact(llIIlIIIlII[llIIlIIIlIl[1]]);
                        return llIIlIIIlIl[0];
                    }
                    "".length();
                    if (" ".length() != " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                return llIIlIIIlIl[0];
            }
        }
    }

    private static boolean lIlIIIIIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private List<WorldPoint> E(NPC npc) {
        WorldPoint worldLocation = npc.getWorldLocation();
        WorldPoint dy = worldLocation.getWorldLocation().dy(llIIlIIIlIl[0]);
        WorldPoint dy2 = worldLocation.getWorldLocation().dy(llIIlIIIlIl[8]);
        WorldPoint[] worldPointArr = new WorldPoint[llIIlIIIlIl[9]];
        worldPointArr[llIIlIIIlIl[1]] = worldLocation.dx(llIIlIIIlIl[0]);
        worldPointArr[llIIlIIIlIl[0]] = worldLocation.dx(llIIlIIIlIl[4]);
        worldPointArr[llIIlIIIlIl[4]] = worldLocation.dx(llIIlIIIlIl[5]);
        worldPointArr[llIIlIIIlIl[5]] = worldLocation.dx(llIIlIIIlIl[10]);
        worldPointArr[llIIlIIIlIl[10]] = dy.dx(llIIlIIIlIl[0]);
        worldPointArr[llIIlIIIlIl[11]] = dy.dx(llIIlIIIlIl[4]);
        worldPointArr[llIIlIIIlIl[12]] = dy.dx(llIIlIIIlIl[5]);
        worldPointArr[llIIlIIIlIl[6]] = dy.dx(llIIlIIIlIl[10]);
        worldPointArr[llIIlIIIlIl[13]] = dy2.dx(llIIlIIIlIl[0]);
        worldPointArr[llIIlIIIlIl[14]] = dy2.dx(llIIlIIIlIl[4]);
        worldPointArr[llIIlIIIlIl[15]] = dy2.dx(llIIlIIIlIl[5]);
        worldPointArr[llIIlIIIlIl[16]] = dy2.dx(llIIlIIIlIl[10]);
        return List.of((Object[]) worldPointArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    private bQ p(int i) {
        int[] iArr = new int[llIIlIIIlIl[0]];
        iArr[llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List<NPC> all = NPCs.getAll(iArr);
        if (lIlIIIIIIlIIIl(all.isEmpty() ? 1 : 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Players.getLocal();
        int[] iArr2 = new int[llIIlIIIlIl[0]];
        iArr2[llIIlIIIlIl[1]] = llIIlIIIlIl[7];
        List all2 = NPCs.getAll(iArr2);
        for (NPC npc : all) {
            for (WorldPoint worldPoint : F(npc)) {
                if (lIlIIIIIIlIIlI(p(worldPoint) ? 1 : 0)) {
                    arrayList.add(new bQ(npc, null, npc.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]));
                    "".length();
                }
                "".length();
                if ((-" ".length()) > 0) {
                    return null;
                }
            }
            NPC npc2 = (NPC) all2.stream().filter(npc3 -> {
                if (lIlIIIIIIlIlIl(npc3.getWorldLocation().distanceTo(npc), i)) {
                    ?? r0 = llIIlIIIlIl[0];
                    "".length();
                    return (((((68 + 11) - (-3)) + 149) ^ (((159 + 121) - 250) + 164)) & (((((113 + 35) - 143) + 144) ^ (((71 + 30) - 97) + 172)) ^ (-" ".length()))) >= "  ".length() ? ((35 ^ 66) ^ (61 ^ 97)) & (((114 ^ 2) ^ (119 ^ 58)) ^ (-" ".length())) : r0;
                }
                return llIIlIIIlIl[1];
            }).filter(npc4 -> {
                if (!lIlIIIIIIlIlll(npc4.getWorldY(), npc.getWorldY()) || lIlIIIIIIllIII(npc4.getWorldX(), npc.getWorldX())) {
                    ?? r0 = llIIlIIIlIl[0];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? ((144 ^ 197) ^ (156 ^ 155)) & (((((105 + 40) - (-4)) + 54) ^ (((103 + 113) - 101) + 38)) ^ (-" ".length())) : r0;
                }
                return llIIlIIIlIl[1];
            }).min(Comparator.comparingInt(npc5 -> {
                return npc5.distanceTo(Players.getLocal());
            })).orElse(null);
            if (lIlIIIIIIlIIll(npc2)) {
                bQ bQVar = new bQ(npc, npc2, npc.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]);
                if (lIlIIIIIIlIIIl(p(bQVar.ct()) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return null;
                    }
                } else {
                    arrayList.add(bQVar);
                    "".length();
                }
            }
            "".length();
            if (((99 ^ 61) & ((223 ^ 129) ^ (-1))) > 0) {
                return null;
            }
        }
        for (NPC npc6 : all) {
            NPC npc7 = (NPC) all2.stream().filter(npc8 -> {
                if (lIlIIIIIIlIlIl(npc8.getWorldLocation().distanceTo(npc6), i)) {
                    ?? r0 = llIIlIIIlIl[0];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? ((205 ^ 179) ^ (129 ^ 196)) & ((((90 ^ 97) & ((189 ^ 134) ^ (-1))) ^ (147 ^ 168)) ^ (-" ".length())) : r0;
                }
                return llIIlIIIlIl[1];
            }).filter(npc9 -> {
                if (lIlIIIIIIllIII(Math.abs(npc9.getWorldX() - npc6.getWorldX()), Math.abs(npc9.getWorldY() - npc6.getWorldY()))) {
                    ?? r0 = llIIlIIIlIl[0];
                    "".length();
                    return "   ".length() > "   ".length() ? ((((33 + 160) - 128) + 150) ^ (((79 + 43) - (-9)) + 14)) & (((38 ^ 15) ^ (244 ^ 155)) ^ (-" ".length())) : r0;
                }
                return llIIlIIIlIl[1];
            }).min(Comparator.comparingInt(npc10 -> {
                return npc10.distanceTo(Players.getLocal());
            })).orElse(null);
            if (lIlIIIIIIlIIll(npc7)) {
                bQ bQVar2 = new bQ(npc6, npc7, npc6.getWorldLocation(), llIIlIIIlIl[0], llIIlIIIlIl[1]);
                if (lIlIIIIIIlIIIl(p(bQVar2.ct()) ? 1 : 0)) {
                    "".length();
                    if ((-((((46 + 152) - 66) + 40) ^ (((25 + 23) - 41) + 162))) >= 0) {
                        return null;
                    }
                } else {
                    arrayList.add(bQVar2);
                    "".length();
                }
            }
            "".length();
            if ((((126 ^ 7) ^ (125 ^ 69)) & (((92 ^ 52) ^ (98 ^ 75)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        for (NPC npc11 : all) {
            for (WorldPoint worldPoint2 : E(npc11)) {
                NPC npc12 = (NPC) all2.stream().filter(npc13 -> {
                    if (lIlIIIIIIlIlIl(npc13.getWorldLocation().distanceTo(worldPoint2), i)) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return "  ".length() <= (((24 ^ 94) ^ (54 ^ 62)) & (((113 ^ 66) ^ (216 ^ 165)) ^ (-" ".length()))) ? ((((41 + 106) - 125) + 122) ^ (((115 + 122) - 89) + 47)) & (((9 ^ 74) ^ (160 ^ 176)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIIIlIl[1];
                }).filter(npc14 -> {
                    if (!lIlIIIIIIlIlll(npc14.getWorldX(), worldPoint2.getWorldX()) || lIlIIIIIIllIII(npc14.getWorldY(), worldPoint2.getWorldY())) {
                        ?? r0 = llIIlIIIlIl[0];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIIIlIl[1];
                }).min(Comparator.comparingInt(npc15 -> {
                    return npc15.distanceTo(Players.getLocal());
                })).orElse(null);
                if (lIlIIIIIIlIIll(npc12)) {
                    bQ bQVar3 = new bQ(npc11, npc12, worldPoint2, llIIlIIIlIl[1], llIIlIIIlIl[0]);
                    if (lIlIIIIIIlIIIl(p(bQVar3.ct()) ? 1 : 0)) {
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else {
                        arrayList.add(bQVar3);
                        "".length();
                    }
                }
                "".length();
                if ((-" ".length()) == "   ".length()) {
                    return null;
                }
            }
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        return (bQ) arrayList.stream().filter(bQVar4 -> {
            if (!lIlIIIIIIlIIIl(bQVar4.hd ? 1 : 0) || lIlIIIIIIlIllI(bQVar4.hb.distanceTo(bQVar4.ha), llIIlIIIlIl[0])) {
                ?? r0 = llIIlIIIlIl[0];
                "".length();
                return "   ".length() >= (34 ^ 38) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIlIl[1];
        }).min(Comparator.comparingInt(bQVar5 -> {
            return bQVar5.hb.distanceTo(worldLocation) + bQVar5.ha.getWorldLocation().distanceTo(bQVar5.gZ);
        })).orElse(null);
    }

    private static boolean lIlIIIIIIlIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIIIlIlll(int i, int i2) {
        return i != i2;
    }

    private static void lIlIIIIIIIllll() {
        llIIlIIIlII = new String[llIIlIIIlIl[5]];
        llIIlIIIlII[llIIlIIIlIl[1]] = lIlIIIIIIIllIl("XDVzPSOmjBk=", "mFWyF");
        llIIlIIIlII[llIIlIIIlIl[0]] = lIlIIIIIIIllIl("5fRehgpkowk=", "qejXa");
        llIIlIIIlII[llIIlIIIlIl[4]] = lIlIIIIIIIlllI("pVCG54OXe3Q=", "KszLy");
    }

    private static boolean lIlIIIIIIlIllI(int i, int i2) {
        return i > i2;
    }

    private List<WorldPoint> F(NPC npc) {
        WorldPoint worldLocation = npc.getWorldLocation();
        return List.of(worldLocation.dx(llIIlIIIlIl[0]), worldLocation.dx(llIIlIIIlIl[4]), worldLocation.dx(llIIlIIIlIl[5]));
    }

    private static boolean lIlIIIIIIlIIlI(int i) {
        return i == 0;
    }

    private static void lIlIIIIIIlIIII() {
        llIIlIIIlIl = new int[19];
        llIIlIIIlIl[0] = " ".length();
        llIIlIIIlIl[1] = ((((162 + 90) - 207) + 123) ^ (((75 + 138) - 44) + 5)) & (((109 ^ 50) ^ (220 ^ 133)) ^ (-" ".length()));
        llIIlIIIlIl[2] = (-((-9339) & 30335)) & (-35) & 32767;
        llIIlIIIlIl[3] = (((103 + 3) - (-50)) + 5) ^ (((116 + 123) - 213) + 111);
        llIIlIIIlIl[4] = "  ".length();
        llIIlIIIlIl[5] = "   ".length();
        llIIlIIIlIl[6] = 56 ^ 63;
        llIIlIIIlIl[7] = (-1) & 11735;
        llIIlIIIlIl[8] = -" ".length();
        llIIlIIIlIl[9] = (25 ^ 127) ^ (75 ^ 33);
        llIIlIIIlIl[10] = 39 ^ 35;
        llIIlIIIlIl[11] = 79 ^ 74;
        llIIlIIIlIl[12] = 128 ^ 134;
        llIIlIIIlIl[13] = (253 ^ 142) ^ (79 ^ 52);
        llIIlIIIlIl[14] = (((58 + 143) - 134) + 92) ^ (((9 + 63) - (-58)) + 20);
        llIIlIIIlIl[15] = 124 ^ 118;
        llIIlIIIlIl[16] = 62 ^ 53;
        llIIlIIIlIl[17] = (-4648) & 16383;
        llIIlIIIlIl[18] = (-(136 ^ 147)) & (-20481) & 32251;
    }

    private static String lIlIIIIIIIllIl(String llllllllllllllllIlIIIIIIIlllIIlI, String llllllllllllllllIlIIIIIIIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIl[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIlIl[4], llllllllllllllllIlIIIIIIIlllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIIIlllIIll) {
            llllllllllllllllIlIIIIIIIlllIIll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.gX.c();
        this.gY = null;
    }
}
