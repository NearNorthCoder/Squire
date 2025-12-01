package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.awt.Point;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Solving Light Puzzle", register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aB  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aB.class */
public class aB extends AbstractC0026az {
    private static /* synthetic */ String[] llIIlIIlIlI;
    private /* synthetic */ boolean dC;
    private static final /* synthetic */ Set<Integer> dz;
    private /* synthetic */ int dD;
    private static final /* synthetic */ int dB;
    private static final /* synthetic */ int dA;
    private static /* synthetic */ int[] llIIlIlIlII;
    private static final /* synthetic */ int dy;

    private static boolean lIlIIIIIllllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIIlllllI(int i) {
        return i == 0;
    }

    private static void lIlIIIIIlllIll() {
        llIIlIlIlII = new int[28];
        llIIlIlIlII[0] = -" ".length();
        llIIlIlIlII[1] = " ".length();
        llIIlIlIlII[2] = ((196 ^ 170) ^ (25 ^ 107)) & (((((76 + 8) - 83) + 219) ^ (((141 + 140) - 228) + 139)) ^ (-" ".length()));
        llIIlIlIlII[3] = (-16897) & 28603;
        llIIlIlIlII[4] = (((87 + 60) - 10) + 20) ^ (((42 + 56) - 62) + 117);
        llIIlIlIlII[5] = "  ".length();
        llIIlIlIlII[6] = "   ".length();
        llIIlIlIlII[7] = (((100 + 116) - 162) + 80) ^ (((72 + 3) - 67) + 123);
        llIIlIlIlII[8] = 76 ^ 74;
        llIIlIlIlII[9] = 45 ^ 42;
        llIIlIlIlII[10] = 152 ^ 144;
        llIIlIlIlII[11] = 144 ^ 153;
        llIIlIlIlII[12] = (-((-12466) & 28915)) & (-4097) & 32251;
        llIIlIlIlII[13] = (113 ^ 40) ^ (101 ^ 54);
        llIIlIlIlII[14] = 32 ^ 43;
        llIIlIlIlII[15] = (-((-8449) & 12640)) & (-1281) & 32767;
        llIIlIlIlII[16] = (-((-21123) & 24307)) & (-16897) & 65535;
        llIIlIlIlII[17] = (5 ^ 79) ^ (208 ^ 150);
        llIIlIlIlII[18] = (59 ^ 86) ^ (160 ^ 192);
        llIIlIlIlII[19] = (((97 + 94) - 28) + 10) ^ (((88 + 151) - 108) + 32);
        llIIlIlIlII[20] = (((73 + 65) - 26) + 15) ^ (24 ^ 71);
        llIIlIlIlII[21] = 135 ^ 136;
        llIIlIlIlII[22] = (244 ^ 168) ^ (127 ^ 51);
        llIIlIlIlII[23] = (47 ^ 94) ^ (88 ^ 56);
        llIIlIlIlII[24] = (-25653) & 27766;
        llIIlIlIlII[25] = (-((-4121) & 22365)) & (-4268) & 24575;
        llIIlIlIlII[26] = (-1047) & 3166;
        llIIlIlIlII[27] = 88 ^ 74;
    }

    static {
        lIlIIIIIlllIll();
        lIlIIIIIlllIlI();
        dA = llIIlIlIlII[16];
        dB = llIIlIlIlII[15];
        dy = llIIlIlIlII[11];
        dz = Set.of(Integer.valueOf(llIIlIlIlII[24]), Integer.valueOf(llIIlIlIlII[25]), Integer.valueOf(llIIlIlIlII[26]));
    }

    @Inject
    protected aB(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.dD = llIIlIlIlII[0];
    }

    private static String lIlIIIIIlIIIll(String llllllllllllllllIIllllllIIlllIIl, String llllllllllllllllIIllllllIIlllIII) {
        try {
            SecretKeySpec llllllllllllllllIIllllllIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllllIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllllIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllllIIlllIll.init(llIIlIlIlII[5], llllllllllllllllIIllllllIIllllII);
            return new String(llllllllllllllllIIllllllIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllllIIlllIlI) {
            llllllllllllllllIIllllllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIIlllIIl(String llllllllllllllllIIllllllIIIlIIlI, String llllllllllllllllIIllllllIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllllIIIlIIll.getBytes(StandardCharsets.UTF_8)), llIIlIlIlII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllllIIIlIlIl) {
            llllllllllllllllIIllllllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlIIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIIllllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(StatChanged statChanged) {
        if (lIlIIIIlIIIlII(statChanged.getSkill(), Skill.MINING)) {
            this.dC = llIIlIlIlII[1];
        }
    }

    private static boolean lIlIIIIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIIlIIIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v205, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int[] iArr = new int[llIIlIlIlII[1]];
        iArr[llIIlIlIlII[2]] = llIIlIlIlII[3];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIIIIIllllII(nearest)) {
            String[] strArr = new String[llIIlIlIlII[1]];
            strArr[llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[2]];
            if (lIlIIIIIllllIl(TileObjects.getAll(strArr).isEmpty() ? 1 : 0)) {
                if (lIlIIIIIlllllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    a((Interactable) nearest, llIIlIIlIlI[llIIlIlIlII[1]], llIIlIlIlII[4]);
                }
                return llIIlIlIlII[1];
            }
        }
        this.dC = llIIlIlIlII[2];
        EnumC0069r aa = EnumC0069r.aa();
        if (lIlIIIIIllllll(aa)) {
            return llIIlIlIlII[2];
        }
        String str = llIIlIIlIlI[llIIlIlIlII[5]];
        Object[] objArr = new Object[llIIlIlIlII[1]];
        objArr[llIIlIlIlII[2]] = aa;
        Log.info(str, objArr);
        String str2 = llIIlIIlIlI[llIIlIlIlII[6]];
        Object[] objArr2 = new Object[llIIlIlIlII[5]];
        objArr2[llIIlIlIlII[2]] = Integer.valueOf(this.dD);
        objArr2[llIIlIlIlII[1]] = Integer.valueOf(this.cu.getTickCount());
        Log.info(str2, objArr2);
        if (lIlIIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String str3 = llIIlIIlIlI[llIIlIlIlII[23]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            String str3 = llIIlIIlIlI[llIIlIlIlII[4]];
            Object[] objArr3 = new Object[llIIlIlIlII[1]];
            objArr3[llIIlIlIlII[2]] = first;
            Log.info(str3, objArr3);
            if (lIlIIIIIllllII(first)) {
                first.interact(llIIlIIlIlI[llIIlIlIlII[7]]);
                return llIIlIlIlII[1];
            }
            Item first2 = Inventory.getFirst(item2 -> {
                String str4 = llIIlIIlIlI[llIIlIlIlII[22]];
                return item2.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            String str4 = llIIlIIlIlI[llIIlIlIlII[8]];
            Object[] objArr4 = new Object[llIIlIlIlII[1]];
            objArr4[llIIlIlIlII[2]] = first2;
            Log.info(str4, objArr4);
            if (lIlIIIIIllllII(first2)) {
                first2.interact(llIIlIIlIlI[llIIlIlIlII[9]]);
                return llIIlIlIlII[1];
            }
        }
        for (Point point : aa.ae()) {
            WorldPoint a = aa.a(point);
            TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                String[] strArr2 = new String[llIIlIlIlII[1]];
                strArr2[llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[21]];
                if (lIlIIIIIllllIl(tileObject.hasAction(strArr2) ? 1 : 0) && lIlIIIIIllllIl(tileObject.getWorldLocation().equals(a) ? 1 : 0)) {
                    ?? r0 = llIIlIlIlII[1];
                    "".length();
                    return (((175 ^ 148) ^ (34 ^ 47)) & (((((1 + 114) - 85) + 111) ^ (((161 + 144) - 270) + 152)) ^ (-" ".length()))) == " ".length() ? ((41 ^ 106) ^ (30 ^ 110)) & (((((37 + 41) - (-39)) + 61) ^ (((5 + 44) - 42) + 122)) ^ (-" ".length())) : r0;
                }
                return llIIlIlIlII[2];
            });
            if (lIlIIIIIllllII(nearest2)) {
                nearest2.interact(llIIlIIlIlI[llIIlIlIlII[10]]);
                sleep(llIIlIlIlII[4]);
                return llIIlIlIlII[1];
            }
            "".length();
            if ("   ".length() >= (38 ^ 34)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        WorldPoint worldPoint = null;
        int i = llIIlIlIlII[2];
        ArrayList<Point> arrayList = new ArrayList(aa.ad().keySet());
        arrayList.sort(Comparator.comparingInt(point2 -> {
            return Math.abs(point2.y - llIIlIlIlII[20]);
        }));
        for (Point point3 : arrayList) {
            WorldPoint a2 = aa.a(point3);
            GameObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                if (lIlIIIIIllllIl(tileObject2.getName().equals(llIIlIIlIlI[llIIlIlIlII[19]]) ? 1 : 0) && lIlIIIIIllllIl(tileObject2.getWorldLocation().equals(a2) ? 1 : 0)) {
                    ?? r0 = llIIlIlIlII[1];
                    "".length();
                    return ((((86 + 33) - (-42)) + 25) ^ (((170 + 116) - 258) + 162)) <= " ".length() ? ((92 ^ 45) ^ (158 ^ 197)) & (((73 ^ 61) ^ (126 ^ 32)) ^ (-" ".length())) : r0;
                }
                return llIIlIlIlII[2];
            });
            if (lIlIIIIIllllII(nearest3) && lIlIIIIlIIIIII(nearest3.getOrientation(), aa.ad().get(point3).intValue())) {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i++;
                worldPoint = a2;
                "".length();
                if ((-" ".length()) > "  ".length()) {
                    return ((202 ^ 148) ^ (236 ^ 136)) & (((((5 + 36) - (-44)) + 98) ^ (((24 + 21) - (-75)) + 21)) ^ (-" ".length()));
                }
            }
        }
        if (lIlIIIIIllllll(worldPoint)) {
            Log.info(llIIlIIlIlI[llIIlIlIlII[11]]);
            int[] iArr2 = new int[llIIlIlIlII[1]];
            iArr2[llIIlIlIlII[2]] = llIIlIlIlII[12];
            NPC nearest4 = NPCs.getNearest(iArr2);
            if (lIlIIIIlIIIIII(this.cu.getTickCount(), this.dD - llIIlIlIlII[1]) && lIlIIIIIllllII(nearest4)) {
                nearest4.interact(llIIlIIlIlI[llIIlIlIlII[13]]);
                return llIIlIlIlII[1];
            }
            if (lIlIIIIIllllII(nearest4) && lIlIIIIIlllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                Point ab = aa.ab();
                if (lIlIIIIIllllll(ab)) {
                    return llIIlIlIlII[2];
                }
                Movement.setDestination(aa.a(ab));
            }
            return llIIlIlIlII[2];
        }
        WorldPoint worldPoint2 = worldPoint;
        GameObject nearest5 = TileObjects.getNearest(tileObject3 -> {
            if (lIlIIIIlIIIIII(tileObject3.getId(), llIIlIlIlII[16]) && lIlIIIIIllllIl(tileObject3.getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIlIlIlII[1];
                "".length();
                return "  ".length() <= 0 ? ((194 ^ 142) ^ (234 ^ 145)) & (("  ".length() ^ (49 ^ 4)) ^ (-" ".length())) : r0;
            }
            return llIIlIlIlII[2];
        });
        if (lIlIIIIIllllII(nearest5)) {
            if (!lIlIIIIlIIIIIl(i, llIIlIlIlII[1]) || lIlIIIIlIIIIlI(Math.abs(this.cu.getTickCount() - this.dD), llIIlIlIlII[8])) {
                nearest5.interact(llIIlIIlIlI[llIIlIlIlII[14]]);
            }
            return llIIlIlIlII[1];
        }
        int[] iArr3 = new int[llIIlIlIlII[1]];
        iArr3[llIIlIlIlII[2]] = llIIlIlIlII[15];
        if (lIlIIIIlIIIIll(Inventory.getCount(iArr3), i)) {
            int[] iArr4 = new int[llIIlIlIlII[1]];
            iArr4[llIIlIlIlII[2]] = llIIlIlIlII[16];
            TileObject tileObject4 = (TileObject) TileObjects.getAll(iArr4).stream().filter(tileObject5 -> {
                if (lIlIIIIIlllllI(aa.d(tileObject5.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = llIIlIlIlII[1];
                    "".length();
                    return " ".length() == 0 ? ((150 ^ 184) ^ (122 ^ 2)) & (((((27 + 131) - 109) + 155) ^ (((73 + 39) - (-24)) + 18)) ^ (-" ".length())) : r0;
                }
                return llIIlIlIlII[2];
            }).min(Comparator.comparingInt(tileObject6 -> {
                return tileObject6.getWorldLocation().distanceTo(this.cu.getLocalPlayer());
            })).orElse(null);
            if (lIlIIIIIllllll(tileObject4)) {
                return llIIlIlIlII[2];
            }
            tileObject4.interact(llIIlIIlIlI[llIIlIlIlII[17]]);
            return llIIlIlIlII[1];
        }
        if (lIlIIIIIlllllI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
            Movement.setDestination(worldPoint);
            "".length();
            if (" ".length() != " ".length()) {
                return ((82 ^ 41) ^ (225 ^ 128)) & (((((34 + 155) - 112) + 109) ^ (((135 + 151) - 157) + 31)) ^ (-" ".length()));
            }
        } else {
            int[] iArr5 = new int[llIIlIlIlII[1]];
            iArr5[llIIlIlIlII[2]] = llIIlIlIlII[15];
            Inventory.getFirst(iArr5).interact(llIIlIIlIlI[llIIlIlIlII[18]]);
        }
        return llIIlIlIlII[1];
    }

    private static boolean lIlIIIIlIIIIII(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIIIIlIIIlI(String llllllllllllllllIIllllllIIlIlIIl, String llllllllllllllllIIllllllIIlIlIII) {
        String llllllllllllllllIIllllllIIlIlIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllllIIlIIlll = new StringBuilder();
        char[] llllllllllllllllIIllllllIIlIIllI = llllllllllllllllIIllllllIIlIlIII.toCharArray();
        int llllllllllllllllIIllllllIIlIIlIl = llIIlIlIlII[2];
        char[] charArray = llllllllllllllllIIllllllIIlIlIIl2.toCharArray();
        int length = charArray.length;
        int i = llIIlIlIlII[2];
        while (lIlIIIIlIIIIll(i, length)) {
            llllllllllllllllIIllllllIIlIIlll.append((char) (charArray[i] ^ llllllllllllllllIIllllllIIlIIllI[llllllllllllllllIIllllllIIlIIlIl % llllllllllllllllIIllllllIIlIIllI.length]));
            "".length();
            llllllllllllllllIIllllllIIlIIlIl++;
            i++;
            "".length();
            if ((44 ^ 40) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllllllIIlIIlll);
    }

    private static boolean lIlIIIIIllllIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIlIIIIIllllIl(dz.contains(Integer.valueOf(graphicsObjectCreated.getGraphicsObject().getId())) ? 1 : 0)) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11];
        }
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        if (lIlIIIIlIIIIII(npcChanged.getOld().getId(), llIIlIlIlII[3]) && lIlIIIIlIIIIII(npcChanged.getNpc().getId(), llIIlIlIlII[12])) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11] + llIIlIlIlII[1];
            "".length();
            if ((-(8 ^ 12)) >= 0) {
            }
        } else if (lIlIIIIlIIIIII(npcChanged.getOld().getId(), llIIlIlIlII[12]) && lIlIIIIlIIIIII(npcChanged.getNpc().getId(), llIIlIlIlII[3])) {
            this.dD = llIIlIlIlII[0];
        }
    }

    private static void lIlIIIIIlllIlI() {
        llIIlIIlIlI = new String[llIIlIlIlII[27]];
        llIIlIIlIlI[llIIlIlIlII[2]] = lIlIIIIIlIIIlI("GyMrJj0k", "VJYTR");
        llIIlIIlIlI[llIIlIlIlII[1]] = lIlIIIIIlIIIll("SQ5jB+ZNh2A=", "xllgZ");
        llIIlIIlIlI[llIIlIlIlII[5]] = lIlIIIIIlIIIll("3I80kgFbbmI=", "swtbZ");
        llIIlIIlIlI[llIIlIlIlII[6]] = lIlIIIIIlIIIlI("DyMZJ1cnLxM2VzUvAjhXOjtBflciMxMhEi8yQSgK", "AFaSw");
        llIIlIIlIlI[llIIlIlIlII[4]] = lIlIIIIIlllIIl("K9Wnom++2Ho=", "spFRX");
        llIIlIIlIlI[llIIlIlIlII[7]] = lIlIIIIIlIIIlI("KCMNKg==", "lQbZF");
        llIIlIIlIlI[llIIlIlIlII[8]] = lIlIIIIIlIIIll("/pimI420y3ZXlHdrZb28bg==", "eNcZk");
        llIIlIIlIlI[llIIlIlIlII[9]] = lIlIIIIIlllIIl("uYWFrNYuspY=", "pIblZ");
        llIIlIIlIlI[llIIlIlIlII[10]] = lIlIIIIIlIIIlI("DRscFRM=", "Oiytx");
        llIIlIIlIlI[llIIlIlIlII[11]] = lIlIIIIIlIIIll("SKS4ojHXAVvPLu5zskBP4M7nVJJCo6+AkbgRRgn10pE=", "hBzEc");
        llIIlIIlIlI[llIIlIlIlII[13]] = lIlIIIIIlIIIll("YxtKNoe+Jho=", "wJXqs");
        llIIlIIlIlI[llIIlIlIlII[14]] = lIlIIIIIlllIIl("JpLHS1FdxfAczgJUJr1QLFdgHPtEaMyX", "lIZPe");
        llIIlIIlIlI[llIIlIlIlII[17]] = lIlIIIIIlllIIl("1h/5h2H3k98=", "tLjrc");
        llIIlIIlIlI[llIIlIlIlII[18]] = lIlIIIIIlllIIl("P9RHdMS53J8=", "pFygn");
        llIIlIIlIlI[llIIlIlIlII[19]] = lIlIIIIIlIIIlI("Cz0VJgA0", "FTgTo");
        llIIlIIlIlI[llIIlIlIlII[21]] = lIlIIIIIlIIIll("nKsdSADfo0o=", "CbLwc");
        llIIlIIlIlI[llIIlIlIlII[22]] = lIlIIIIIlIIIlI("Fz4zLR8=", "SLZCt");
        llIIlIIlIlI[llIIlIlIlII[23]] = lIlIIIIIlllIIl("QzDXrhD7zHM=", "IttME");
    }
}
