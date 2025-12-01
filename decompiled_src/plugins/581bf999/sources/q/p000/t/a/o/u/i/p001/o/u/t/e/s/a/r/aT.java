package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aT  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aT.class */
public abstract class aT extends AbstractC0015ao {
    private static final /* synthetic */ int eq;
    private static /* synthetic */ String[] lIllIIlllIl;
    private static /* synthetic */ int[] lIllIlIIIII;

    private static boolean lIIlIllIlIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllIlIllIl(int i) {
        return i != 0;
    }

    private static void lIIlIllIlIIIIl() {
        lIllIIlllIl = new String[lIllIlIIIII[21]];
        lIllIIlllIl[lIllIlIIIII[2]] = lIIlIllIIlllII("G4JbdY8KlIE=", "nQJAm");
        lIllIIlllIl[lIllIlIIIII[1]] = lIIlIllIIlllIl("rHo6zHEIIfg=", "hPbvB");
        lIllIIlllIl[lIllIlIIIII[4]] = lIIlIllIIlllIl("tdtgV7Jkhi11KnplLjTUcg==", "Xllor");
        lIllIIlllIl[lIllIlIIIII[3]] = lIIlIllIIlllIl("9MSoI4EJRMo=", "VGoGx");
        lIllIIlllIl[lIllIlIIIII[6]] = lIIlIllIIlllII("1U+Et/aILY0=", "htPEo");
        lIllIIlllIl[lIllIlIIIII[7]] = lIIlIllIIlllII("RPNsw1mrKVE=", "xPZRE");
        lIllIIlllIl[lIllIlIIIII[8]] = lIIlIllIIlllIl("+bxrCzc8Wmg=", "fpNkk");
        lIllIIlllIl[lIllIlIIIII[9]] = lIIlIllIIlllII("ZfaqijV2lKwGEFRUP8kimw==", "aQZiW");
        lIllIIlllIl[lIllIlIIIII[10]] = lIIlIllIIllllI("MRAFOAtHBQQ4Cg==", "gukWf");
        lIllIIlllIl[lIllIlIIIII[11]] = lIIlIllIIlllIl("jesxXqcsD1cyEHblaPYfvw==", "sWQID");
        lIllIIlllIl[lIllIlIIIII[12]] = lIIlIllIIlllIl("uz3Vw647Nao=", "NMGKY");
        lIllIIlllIl[lIllIlIIIII[13]] = lIIlIllIIlllII("zMEPXlG81tc=", "UxZII");
        lIllIIlllIl[lIllIlIIIII[14]] = lIIlIllIIlllIl("w7glBvpJq9o=", "bcUaa");
        lIllIIlllIl[lIllIlIIIII[15]] = lIIlIllIIlllII("r6FtPxD2B5Y=", "ZjOyS");
        lIllIIlllIl[lIllIlIIIII[16]] = lIIlIllIIlllII("DYYbBC3XoA8=", "QIFzJ");
        lIllIIlllIl[lIllIlIIIII[17]] = lIIlIllIIlllII("YIFaj6xcGig=", "BqaZD");
        lIllIIlllIl[lIllIlIIIII[18]] = lIIlIllIIlllII("wWsi3QwW79I=", "Wzvyd");
        lIllIIlllIl[lIllIlIIIII[19]] = lIIlIllIIlllII("4ukh0whpt8s=", "Uqbdq");
        lIllIIlllIl[lIllIlIIIII[20]] = lIIlIllIIlllII("/rNB7gH1Umg=", "VPHnC");
    }

    private static String lIIlIllIIlllII(String llllllllllllllllIlIlIIlIIlIlIIII, String llllllllllllllllIlIlIIlIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIlIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIIII[4], llllllllllllllllIlIlIIlIIlIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIlIIlIlIIll) {
            llllllllllllllllIlIlIIlIIlIlIIll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return lIllIlIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        String[] strArr = new String[lIllIlIIIII[1]];
        strArr[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[2]];
        if (lIIlIllIlIlIlI(TileObjects.getAll(strArr).size(), lIllIlIIIII[3])) {
            ?? r0 = lIllIlIIIII[1];
            "".length();
            return 0 != 0 ? ((((12 + 87) - 37) + 108) ^ (((112 + 159) - 138) + 39)) & (((106 ^ 124) ^ (77 ^ 93)) ^ (-" ".length())) : r0;
        }
        return lIllIlIIIII[2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public aT(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        String[] strArr = new String[lIllIlIIIII[1]];
        strArr[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            if (lIIlIllIlIlllI(tileObject.getWorldX(), nearest.getWorldX()) && lIIlIllIlIllIl(tileObject.getName().equals(lIllIIlllIl[lIllIlIIIII[20]]) ? 1 : 0) && lIIlIllIlIllll(tileObject.getWorldX(), this.cu.getLocalPlayer().getWorldX())) {
                ?? r0 = lIllIlIIIII[1];
                "".length();
                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlIIIII[2];
        });
        if (lIIlIllIlIllII(nearest2)) {
            nearest2.interact(lIllIIlllIl[lIllIlIIIII[4]]);
            return lIllIlIIIII[1];
        }
        int[] iArr = new int[lIllIlIIIII[1]];
        iArr[lIllIlIIIII[2]] = lIllIlIIIII[5];
        if (lIIlIllIlIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
                b(item -> {
                    if (lIIlIllIlIlIll(item.getName().contains(lIllIIlllIl[lIllIlIIIII[19]]) ? 1 : 0)) {
                        ?? r0 = lIllIlIIIII[1];
                        "".length();
                        return (((((125 + 68) - 80) + 64) ^ (((18 + 9) - (-79)) + 34)) & (((124 ^ 61) ^ (8 ^ 116)) ^ (-" ".length()))) != 0 ? ((20 ^ 69) ^ (77 ^ 82)) & (((99 ^ 1) ^ (90 ^ 118)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlIIIII[2];
                });
                return lIllIlIIIII[1];
            }
            TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                if (lIIlIllIlIllIl(tileObject2.getName().equals(lIllIIlllIl[lIllIlIIIII[18]]) ? 1 : 0) && lIIlIllIlIllIl(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                    ?? r0 = lIllIlIIIII[1];
                    "".length();
                    return (-((((130 + 88) - 131) + 66) ^ (((85 + 37) - (-25)) + 9))) >= 0 ? ((51 ^ 40) ^ (47 ^ 10)) & (((5 ^ 116) ^ (222 ^ 145)) ^ (-" ".length())) : r0;
                }
                return lIllIlIIIII[2];
            });
            if (lIIlIllIlIllII(nearest3)) {
                nearest3.interact(lIllIIlllIl[lIllIlIIIII[3]]);
                return lIllIlIIIII[1];
            }
        }
        if (lIIlIllIlIlIll(Inventory.contains(item2 -> {
            if (lIIlIllIlIllIl(item2.getName().toLowerCase().contains(lIllIIlllIl[lIllIlIIIII[16]]) ? 1 : 0) && lIIlIllIlIlIll(item2.getName().contains(lIllIIlllIl[lIllIlIIIII[17]]) ? 1 : 0)) {
                ?? r0 = lIllIlIIIII[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlIIIII[2];
        }) ? 1 : 0)) {
            if (lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
                b(item3 -> {
                    if (lIIlIllIlIlIll(item3.getName().contains(lIllIIlllIl[lIllIlIIIII[15]]) ? 1 : 0)) {
                        ?? r0 = lIllIlIIIII[1];
                        "".length();
                        return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlIIIII[2];
                });
                return lIllIlIIIII[1];
            }
            TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                if (lIIlIllIlIllIl(tileObject3.getName().equals(lIllIIlllIl[lIllIlIIIII[14]]) ? 1 : 0) && lIIlIllIlIllIl(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                    ?? r0 = lIllIlIIIII[1];
                    "".length();
                    return "  ".length() <= 0 ? ((193 ^ 191) ^ (254 ^ 139)) & (((241 ^ 180) ^ (19 ^ 93)) ^ (-" ".length())) : r0;
                }
                return lIllIlIIIII[2];
            });
            if (lIIlIllIlIllII(nearest4)) {
                nearest4.interact(lIllIIlllIl[lIllIlIIIII[6]]);
                return lIllIlIIIII[1];
            }
        }
        if (lIIlIllIlIllIl(Inventory.isFull() ? 1 : 0)) {
            int[] iArr2 = new int[lIllIlIIIII[1]];
            iArr2[lIllIlIIIII[2]] = lIllIlIIIII[5];
            if (!lIIlIllIlIllIl(Inventory.contains(iArr2) ? 1 : 0) || lIIlIllIlIlIll(Inventory.contains(item4 -> {
                return item4.getName().toLowerCase().contains(lIllIIlllIl[lIllIlIIIII[13]]);
            }) ? 1 : 0)) {
                Item first = Inventory.getFirst(item5 -> {
                    String[] strArr2 = new String[lIllIlIIIII[1]];
                    strArr2[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[12]];
                    return item5.hasAction(strArr2);
                });
                if (lIIlIllIlIllII(first)) {
                    first.interact(lIllIIlllIl[lIllIlIIIII[7]]);
                    return lIllIlIIIII[1];
                }
            }
        }
        return bC();
    }

    private static boolean lIIlIllIlIllll(int i, int i2) {
        return i > i2;
    }

    static {
        lIIlIllIlIlIIl();
        lIIlIllIlIIIIl();
        eq = lIllIlIIIII[0];
    }

    public abstract boolean bC();

    private static boolean lIIlIllIlIlIll(int i) {
        return i == 0;
    }

    private static boolean lIIlIllIlIlllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIllIlIlIIl() {
        lIllIlIIIII = new int[22];
        lIllIlIIIII[0] = (-((-18577) & 19638)) & (-16385) & 32631;
        lIllIlIIIII[1] = " ".length();
        lIllIlIIIII[2] = (36 ^ 125) & ((42 ^ 115) ^ (-1));
        lIllIlIIIII[3] = "   ".length();
        lIllIlIIIII[4] = "  ".length();
        lIllIlIIIII[5] = (-1103) & 28399;
        lIllIlIIIII[6] = 133 ^ 129;
        lIllIlIIIII[7] = (124 ^ 46) ^ (2 ^ 85);
        lIllIlIIIII[8] = 133 ^ 131;
        lIllIlIIIII[9] = 32 ^ 39;
        lIllIlIIIII[10] = 39 ^ 47;
        lIllIlIIIII[11] = 176 ^ 185;
        lIllIlIIIII[12] = "   ".length() ^ (34 ^ 43);
        lIllIlIIIII[13] = (91 ^ 42) ^ (113 ^ 11);
        lIllIlIIIII[14] = (29 ^ 122) ^ (79 ^ 36);
        lIllIlIIIII[15] = 109 ^ 96;
        lIllIlIIIII[16] = (((16 + 48) - (-23)) + 41) ^ (((4 + 42) - 40) + 136);
        lIllIlIIIII[17] = (((74 + 84) - 79) + 63) ^ (((50 + 112) - 118) + 85);
        lIllIlIIIII[18] = 163 ^ 179;
        lIllIlIIIII[19] = 68 ^ 85;
        lIllIlIIIII[20] = (138 ^ 194) ^ (116 ^ 46);
        lIllIlIIIII[21] = 96 ^ 115;
    }

    private static String lIIlIllIIlllIl(String llllllllllllllllIlIlIIlIIlllIlll, String llllllllllllllllIlIlIIlIIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIlIIllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIlIIllllIIl.init(lIllIlIIIII[4], secretKeySpec);
            return new String(llllllllllllllllIlIlIIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIlIIllllIII) {
            llllllllllllllllIlIlIIlIIllllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        if (lIIlIllIlIlIll(bj() ? 1 : 0)) {
            ?? r0 = lIllIlIIIII[1];
            "".length();
            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlIIIII[2];
    }

    private static boolean lIIlIllIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean p(WorldPoint worldPoint) {
        String[] strArr = new String[lIllIlIIIII[1]];
        strArr[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[11]];
        if (lIIlIllIlIllII(TileObjects.getFirstAt(worldPoint, strArr))) {
            ?? r0 = lIllIlIIIII[1];
            "".length();
            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlIIIII[2];
    }

    public void g(WorldPoint worldPoint) {
        a(worldPoint, worldPoint2 -> {
            return lIllIlIIIII[1];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIIlIllIlIllIl(super.bn() ? 1 : 0)) {
            return lIllIlIIIII[1];
        }
        String[] strArr = new String[lIllIlIIIII[1]];
        strArr[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[8]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIlIllIlIllII(nearest)) {
            nearest.interact(lIllIIlllIl[lIllIlIIIII[9]]);
            return lIllIlIIIII[1];
        }
        return lIllIlIIIII[2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return (WorldPoint) worldPoint.toWorldArea().offset(lIllIlIIIII[4]).toWorldPointList().stream().filter(worldPoint3 -> {
            if (lIIlIllIlIlIll(p(worldPoint3) ? 1 : 0)) {
                ?? r0 = lIllIlIIIII[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlIIIII[2];
        }).filter(worldPoint4 -> {
            if (lIIlIllIlIlIll(worldPoint4.equals(worldPoint) ? 1 : 0)) {
                ?? r0 = lIllIlIIIII[1];
                "".length();
                return 0 != 0 ? ((162 ^ 173) ^ (213 ^ 198)) & (((228 ^ 130) ^ (12 ^ 118)) ^ (-" ".length())) : r0;
            }
            return lIllIlIIIII[2];
        }).min(Comparator.comparingInt(worldPoint5 -> {
            return worldPoint5.distanceTo(worldPoint2);
        })).orElse(worldPoint2);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.Z
    public void a(WorldPoint worldPoint, Predicate<WorldPoint> predicate) {
        String[] strArr = new String[lIllIlIIIII[1]];
        strArr[lIllIlIIIII[2]] = lIllIIlllIl[lIllIlIIIII[10]];
        Set set = (Set) TileObjects.getAll(strArr).stream().map((v0) -> {
            return v0.getWorldLocation();
        }).collect(Collectors.toSet());
        super.a(worldPoint, worldPoint2 -> {
            if (lIIlIllIlIlIll(set.contains(worldPoint2) ? 1 : 0) && lIIlIllIlIllIl(predicate.test(worldPoint2) ? 1 : 0)) {
                ?? r0 = lIllIlIIIII[1];
                "".length();
                return "   ".length() != "   ".length() ? ((22 ^ 0) ^ "   ".length()) & (((113 ^ 111) ^ (18 ^ 25)) ^ (-" ".length())) : r0;
            }
            return lIllIlIIIII[2];
        });
    }

    private static String lIIlIllIIllllI(String llllllllllllllllIlIlIIlIIllIIIlI, String llllllllllllllllIlIlIIlIIllIIIIl) {
        String llllllllllllllllIlIlIIlIIllIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIlIIllIIlIl = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIIlIIllIIIIl.toCharArray();
        int llllllllllllllllIlIlIIlIIllIIIll = lIllIlIIIII[2];
        char[] charArray2 = llllllllllllllllIlIlIIlIIllIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIIII[2];
        while (lIIlIllIlIlllI(i, length)) {
            char llllllllllllllllIlIlIIlIIllIlIII = charArray2[i];
            llllllllllllllllIlIlIIlIIllIIlIl.append((char) (llllllllllllllllIlIlIIlIIllIlIII ^ charArray[llllllllllllllllIlIlIIlIIllIIIll % charArray.length]));
            "".length();
            llllllllllllllllIlIlIIlIIllIIIll++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIIlIIllIIlIl);
    }
}
