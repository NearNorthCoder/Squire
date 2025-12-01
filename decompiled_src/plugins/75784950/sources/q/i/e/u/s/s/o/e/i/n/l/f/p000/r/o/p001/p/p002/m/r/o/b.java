package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
@TaskDesc(name = "Blood moon")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.b  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/b.class */
public class b extends Task {
    /* synthetic */ List<WorldPoint> v;
    /* synthetic */ List<WorldPoint> s;
    private /* synthetic */ long p;
    /* synthetic */ List<WorldPoint> y;
    /* synthetic */ List<WorldPoint> u;
    private static /* synthetic */ int[] lIIIIIIlIIIII;
    /* synthetic */ List<WorldPoint> w;

    /* renamed from: q  reason: collision with root package name */
    /* synthetic */ WorldArea f0q = new WorldArea(lIIIIIIlIIIII[0], lIIIIIIlIIIII[1], lIIIIIIlIIIII[2], lIIIIIIlIIIII[3], lIIIIIIlIIIII[4]);
    /* synthetic */ List<WorldPoint> r;
    private static /* synthetic */ String[] lIIIIIIIlllIl;
    /* synthetic */ List<WorldPoint> t;
    /* synthetic */ List<WorldPoint> x;
    private final /* synthetic */ SquireMoonsOfPerilConfig o;

    @Inject
    public b(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        WorldPoint[] worldPointArr = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArr[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArr[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArr[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.r = Arrays.asList(worldPointArr);
        WorldPoint[] worldPointArr2 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr2[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArr2[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArr2[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArr2[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.s = Arrays.asList(worldPointArr2);
        WorldPoint[] worldPointArr3 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr3[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArr3[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArr3[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArr3[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.t = Arrays.asList(worldPointArr3);
        WorldPoint[] worldPointArr4 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr4[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArr4[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArr4[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArr4[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.u = Arrays.asList(worldPointArr4);
        WorldPoint[] worldPointArr5 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr5[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArr5[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArr5[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArr5[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.v = Arrays.asList(worldPointArr5);
        WorldPoint[] worldPointArr6 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr6[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArr6[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArr6[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArr6[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.w = Arrays.asList(worldPointArr6);
        WorldPoint[] worldPointArr7 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr7[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArr7[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArr7[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArr7[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.x = Arrays.asList(worldPointArr7);
        WorldPoint[] worldPointArr8 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArr8[lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArr8[lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArr8[lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArr8[lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.y = Arrays.asList(worldPointArr8);
        this.o = squireMoonsOfPerilConfig;
    }

    private static void lIIlIlllIIIlIII() {
        lIIIIIIlIIIII = new int[49];
        lIIIIIIlIIIII[0] = (-((-20767) & 31679)) & (-16385) & 28667;
        lIIIIIIlIIIII[1] = (-23126) & 32735;
        lIIIIIIlIIIII[2] = (51 ^ 95) ^ (29 ^ 87);
        lIIIIIIlIIIII[3] = (18 ^ 4) ^ (172 ^ 150);
        lIIIIIIlIIIII[4] = ((195 ^ 140) ^ (190 ^ 179)) & (((((83 + 131) - 97) + 121) ^ (((47 + 44) - (-41)) + 40)) ^ (-" ".length()));
        lIIIIIIlIIIII[5] = (((24 + 145) - 112) + 134) ^ (((101 + 117) - 155) + 124);
        lIIIIIIlIIIII[6] = (-((-12907) & 15083)) & (-16385) & 19956;
        lIIIIIIlIIIII[7] = (-((-20699) & 23259)) & (-65) & 12255;
        lIIIIIIlIIIII[8] = " ".length();
        lIIIIIIlIIIII[9] = (-10253) & 11647;
        lIIIIIIlIIIII[10] = (-4609) & 14238;
        lIIIIIIlIIIII[11] = "  ".length();
        lIIIIIIlIIIII[12] = "   ".length();
        lIIIIIIlIIIII[13] = (-((-354) & 31207)) & (-521) & 32767;
        lIIIIIIlIIIII[14] = (-6721) & 16349;
        lIIIIIIlIIIII[15] = (-515) & 1907;
        lIIIIIIlIIIII[16] = (-((-17793) & 24513)) & (-16385) & 32732;
        lIIIIIIlIIIII[17] = (-513) & 1903;
        lIIIIIIlIIIII[18] = (-22545) & 23934;
        lIIIIIIlIIIII[19] = (-((-9507) & 32547)) & (-3) & 24431;
        lIIIIIIlIIIII[20] = (-6162) & 7549;
        lIIIIIIlIIIII[21] = (-((-9122) & 27643)) & (-517) & 28671;
        lIIIIIIlIIIII[22] = (-((-26953) & 27471)) & (-22609) & 32759;
        lIIIIIIlIIIII[23] = (-2) & 9637;
        lIIIIIIlIIIII[24] = (-4689) & 14323;
        lIIIIIIlIIIII[25] = (-6282) & 57327;
        lIIIIIIlIIIII[26] = (66 ^ 48) ^ (179 ^ 196);
        lIIIIIIlIIIII[27] = 186 ^ 188;
        lIIIIIIlIIIII[28] = (-((-12433) & 31929)) & (-5) & 32511;
        lIIIIIIlIIIII[29] = (((167 + 135) - 125) + 12) ^ (((7 + 104) - 40) + 115);
        lIIIIIIlIIIII[30] = (53 ^ 23) ^ (122 ^ 80);
        lIIIIIIlIIIII[31] = (-8386) & 30709;
        lIIIIIIlIIIII[32] = 27 ^ 18;
        lIIIIIIlIIIII[33] = 124 ^ 118;
        lIIIIIIlIIIII[34] = 134 ^ 141;
        lIIIIIIlIIIII[35] = (-((-537) & 19225)) & (-35) & 31743;
        lIIIIIIlIIIII[36] = (-20481) & 31446;
        lIIIIIIlIIIII[37] = (((126 + 126) - 121) + 6) ^ (((33 + 33) - (-23)) + 44);
        lIIIIIIlIIIII[38] = 27 ^ 22;
        lIIIIIIlIIIII[39] = 172 ^ 162;
        lIIIIIIlIIIII[40] = 37 ^ 42;
        lIIIIIIlIIIII[41] = -" ".length();
        lIIIIIIlIIIII[42] = (27 ^ 28) ^ (52 ^ 45);
        lIIIIIIlIIIII[43] = (249 ^ 146) ^ (108 ^ 23);
        lIIIIIIlIIIII[44] = 155 ^ 138;
        lIIIIIIlIIIII[45] = 86 ^ 68;
        lIIIIIIlIIIII[46] = 171 ^ 184;
        lIIIIIIlIIIII[47] = (-17409) & 30423;
        lIIIIIIlIIIII[48] = (((119 + 58) - 43) + 24) ^ (((94 + 5) - (-37)) + 2);
    }

    private static boolean lIIlIlllIIIlllI(int i) {
        return i <= 0;
    }

    private static void lIIlIlllIIIIlll() {
        lIIIIIIIlllIl = new String[lIIIIIIlIIIII[48]];
        lIIIIIIIlllIl[lIIIIIIlIIIII[4]] = lIIlIlllIIIIIII("e9FLQqUE3fBGdGMFxA/43w==", "MlZrd");
        lIIIIIIIlllIl[lIIIIIIlIIIII[8]] = lIIlIlllIIIIIIl("XUlBZoNjYLHt9BXQPzqxWA==", "koyKt");
        lIIIIIIIlllIl[lIIIIIIlIIIII[11]] = lIIlIlllIIIIIIl("dwRToSNNp6A=", "gMSUZ");
        lIIIIIIIlllIl[lIIIIIIlIIIII[12]] = lIIlIlllIIIIIlI("LyQbGS0IaxYALQ0m", "lKtrH");
        lIIIIIIIlllIl[lIIIIIIlIIIII[5]] = lIIlIlllIIIIIII("iS8NvP8R+bpNx60Q4brhoTPtZ+Bsbpu5", "znNdM");
        lIIIIIIIlllIl[lIIIIIIlIIIII[26]] = lIIlIlllIIIIIIl("ncR/xKblhIizlR2Vz2+e3w==", "rFoQt");
        lIIIIIIIlllIl[lIIIIIIlIIIII[27]] = lIIlIlllIIIIIII("00PONEgp8+VT2X/Djyr4XiAm+sAolhyE", "DyKRH");
        lIIIIIIIlllIl[lIIIIIIlIIIII[29]] = lIIlIlllIIIIIIl("pSNCBGcgrY1TsJ/D9eo3Lg==", "EAebi");
        lIIIIIIIlllIl[lIIIIIIlIIIII[30]] = lIIlIlllIIIIIlI("AAMuPh0=", "DqGPv");
        lIIIIIIIlllIl[lIIIIIIlIIIII[32]] = lIIlIlllIIIIIII("j++J232qnEo=", "QydFj");
        lIIIIIIIlllIl[lIIIIIIlIIIII[33]] = lIIlIlllIIIIIIl("+2gpBk0F1W+R3OVaN0U5oY6AV6K//opi", "pQmWO");
        lIIIIIIIlllIl[lIIIIIIlIIIII[34]] = lIIlIlllIIIIIlI("OBYzMGUBFmUmJBMcZSY1Gg0=", "uyEUE");
        lIIIIIIIlllIl[lIIIIIIlIIIII[37]] = lIIlIlllIIIIIII("2Qr/aiunSnv8lv/SLoqOL5Zn43gOhMXe", "wyKYj");
        lIIIIIIIlllIl[lIIIIIIlIIIII[38]] = lIIlIlllIIIIIIl("96yGwCuLeRo=", "FzUUp");
        lIIIIIIIlllIl[lIIIIIIlIIIII[39]] = lIIlIlllIIIIIIl("mKP+H56MDZBeqhxrRMSqBA==", "yYgsb");
        lIIIIIIIlllIl[lIIIIIIlIIIII[40]] = lIIlIlllIIIIIII("M7c8SiXm9fk=", "bKnJO");
        lIIIIIIIlllIl[lIIIIIIlIIIII[43]] = lIIlIlllIIIIIIl("4rmN1+O/6zyGMSrRAdT0c5Y0Cv8onbGh", "DceCo");
        lIIIIIIIlllIl[lIIIIIIlIIIII[44]] = lIIlIlllIIIIIII("VxPTpxoH9C1qnTEPDtBP3cMN+Dzo3ZCe", "Vdudx");
        lIIIIIIIlllIl[lIIIIIIlIIIII[45]] = lIIlIlllIIIIIlI("BTspEQIl", "VOHxp");
        lIIIIIIIlllIl[lIIIIIIlIIIII[46]] = lIIlIlllIIIIIIl("c3tzJl8/M9wBQOT+qtzcAA==", "gEcio");
    }

    private static boolean lIIlIlllIIllIlI(int i, int i2) {
        return i <= i2;
    }

    private static int lIIlIlllIIIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIlllIIllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlllIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlllIIlIIII(int i) {
        return i < 0;
    }

    private static boolean lIIlIlllIIlIlIl(int i) {
        return i >= 0;
    }

    private static boolean lIIlIlllIIlIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v175, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v181, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v219, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        if (lIIlIlllIIIlIll(a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIIII[4];
        }
        if (lIIlIlllIIIlIll(b().isFullyEquipped() ? 1 : 0)) {
            if (lIIlIlllIIIllII(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIlIIIII[8]];
                strArr[lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[4]];
                if (lIIlIlllIIIllII(Inventory.contains(strArr) ? 1 : 0) && lIIlIlllIIIllIl(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIIlIlllIIIlllI(b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] strArr2 = new String[lIIIIIIlIIIII[8]];
                    strArr2[lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[8]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[11]]);
                }
            }
            b().swap();
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIlIlllIIlIlII(npc.getId(), lIIIIIIlIIIII[35]) && lIIlIlllIIIllII(a(npc.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIlIIIII[8];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIIlIIIII[4];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if (lIIlIlllIIlIlII(npc2.getId(), lIIIIIIlIIIII[47]) && lIIlIlllIIIllII(a(npc2.getWorldLocation()) ? 1 : 0)) {
                ?? r0 = lIIIIIIlIIIII[8];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIIlIIIII[4];
        });
        int[] iArr = new int[lIIIIIIlIIIII[8]];
        iArr[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        TileObject nearest3 = TileObjects.getNearest(iArr);
        String[] strArr3 = new String[lIIIIIIlIIIII[8]];
        strArr3[lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[12]];
        if (lIIlIlllIIIlIll(Inventory.contains(strArr3) ? 1 : 0) && lIIlIlllIIIllll(nearest) && lIIlIlllIIIllll(nearest3) && lIIlIlllIIlIIII(lIIlIlllIIIlIIl(Combat.getHealthPercent(), 40.0d))) {
            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[5]];
            TileObject nearest4 = TileObjects.getNearest(tileObject -> {
                if (lIIlIlllIIIllII(tileObject.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[45]]) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIIIIlIIIII[8]];
                    strArr4[lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[46]];
                    if (lIIlIlllIIIllII(tileObject.hasAction(strArr4) ? 1 : 0)) {
                        ?? r0 = lIIIIIIlIIIII[8];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIIIIIlIIIII[4];
            });
            if (lIIlIlllIIIllIl(nearest4)) {
                nearest4.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[26]]);
                return lIIIIIIlIIIII[4];
            }
        }
        if (lIIlIlllIIIllll(nearest) && lIIlIlllIIIllIl(nearest2)) {
            boolean b = b(nearest2.getWorldLocation());
            if (lIIlIlllIIIlIll(b ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[27]];
                Movement.setDestination(nearest2.getWorldLocation());
                return lIIIIIIlIIIII[4];
            } else if (lIIlIlllIIIllII(b ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIIlIIIII[8]];
                iArr2[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[28];
                NPC nearest5 = NPCs.getNearest(iArr2);
                if (lIIlIlllIIIllIl(nearest5)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[29]];
                    if (lIIlIlllIIIllII(l.l() ? 1 : 0) && lIIlIlllIIIllII(Inventory.contains(item -> {
                        return item.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[44]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item2 -> {
                            return item2.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[43]]);
                        }).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[30]]);
                        return lIIIIIIlIIIII[4];
                    }
                    int[] iArr3 = new int[lIIIIIIlIIIII[8]];
                    iArr3[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[31];
                    if (lIIlIlllIIIllII(Equipment.contains(iArr3) ? 1 : 0) && lIIlIlllIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
                        Combat.setAttackStyle(Combat.AttackStyle.THIRD);
                        return lIIIIIIlIIIII[4];
                    }
                    nearest5.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[32]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        if (lIIlIlllIIIllll(nearest) && lIIlIlllIIIllIl(nearest3)) {
            Set<WorldPoint> c = c();
            WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIlIIIII[27]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIIlIlllIIIllII(Reachable.isWalkable(worldPoint2) ? 1 : 0) && lIIlIlllIIIlIll(c.contains(worldPoint2) ? 1 : 0)) {
                    ?? r0 = lIIIIIIlIIIII[8];
                    "".length();
                    return 0 != 0 ? (" ".length() ^ (27 ^ 7)) & (((((58 + 167) - 164) + 128) ^ (((75 + 70) - 33) + 48)) ^ (-" ".length())) : r0;
                }
                return lIIIIIIlIIIII[4];
            }).min(Comparator.comparingInt(worldPoint3 -> {
                return worldPoint3.distanceTo(Players.getLocal().getWorldLocation());
            })).orElse(null);
            if (lIIlIlllIIIlIll(c.isEmpty() ? 1 : 0) && lIIlIlllIIIllIl(worldPoint)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[33]];
                Movement.setDestination(worldPoint);
                return lIIIIIIlIIIII[4];
            }
        }
        if (lIIlIlllIIIllIl(nearest) && lIIlIlllIIIllIl(nearest2)) {
            boolean b2 = b(nearest2.getWorldLocation());
            if (lIIlIlllIIIlIll(b2 ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[34]];
                Movement.setDestination(nearest2.getWorldLocation());
                return lIIIIIIlIIIII[4];
            } else if (lIIlIlllIIIllII(b2 ? 1 : 0)) {
                int[] iArr4 = new int[lIIIIIIlIIIII[8]];
                iArr4[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[35];
                NPC nearest6 = NPCs.getNearest(iArr4);
                int[] iArr5 = new int[lIIIIIIlIIIII[8]];
                iArr5[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                TileObject nearest7 = TileObjects.getNearest(iArr5);
                if (lIIlIlllIIIllIl(nearest7)) {
                    if (lIIlIlllIIlIlII(a(nearest7), lIIIIIIlIIIII[36])) {
                        this.p++;
                    }
                    if (lIIlIlllIIlIlIl(lIIlIlllIIIlIlI(this.p, 3L))) {
                        int[] iArr6 = new int[lIIIIIIlIIIII[8]];
                        iArr6[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                        TileObject nearest8 = TileObjects.getNearest(iArr6);
                        if (lIIlIlllIIIllIl(nearest8)) {
                            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[37]];
                            Movement.setDestination(nearest8.getWorldLocation());
                            Time.sleepTicks(lIIIIIIlIIIII[8]);
                            "".length();
                            this.p = 0L;
                            return lIIIIIIlIIIII[8];
                        }
                    }
                }
                if (lIIlIlllIIIllIl(nearest6)) {
                    String[] strArr4 = new String[lIIIIIIlIIIII[8]];
                    strArr4[lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[38]];
                    if (lIIlIlllIIIllII(Equipment.contains(strArr4) ? 1 : 0) && lIIlIlllIIllIII(Players.getLocal().getWorldLocation().distanceTo(nearest6.getWorldLocation()), lIIIIIIlIIIII[8])) {
                        List list = (List) ((List) Tiles.getAll().stream().filter(tile -> {
                            if (lIIlIlllIIlllII(tile.getWorldLocation().distanceTo(nearest6.getWorldLocation()), lIIIIIIlIIIII[42])) {
                                ?? r0 = lIIIIIIlIIIII[8];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIIIlIIIII[4];
                        }).collect(Collectors.toList())).stream().filter(tile2 -> {
                            if (lIIlIlllIIIllII(b(tile2.getWorldLocation()) ? 1 : 0) && lIIlIlllIIllIlI(tile2.getWorldLocation().distanceTo(nearest6.getWorldLocation()), lIIIIIIlIIIII[8])) {
                                ?? r0 = lIIIIIIlIIIII[8];
                                "".length();
                                return (-(27 ^ 30)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIIIlIIIII[4];
                        }).collect(Collectors.toList());
                        if (lIIlIlllIIIlIll(list.isEmpty() ? 1 : 0)) {
                            Movement.setDestination(((Tile) list.get(lIIIIIIlIIIII[4])).getWorldLocation());
                            return lIIIIIIlIIIII[4];
                        }
                    }
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[39]];
                    nearest6.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[40]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        return lIIIIIIlIIIII[8];
    }

    public static int a(TileObject tileObject) {
        GameObject gameObject = (GameObject) tileObject;
        if (lIIlIlllIIIllIl(gameObject) && lIIlIlllIIIllII(gameObject.getRenderable() instanceof DynamicObject ? 1 : 0)) {
            Animation animation = gameObject.getRenderable().getAnimation();
            if (lIIlIlllIIIllIl(animation)) {
                return animation.getId();
            }
        }
        return lIIIIIIlIIIII[41];
    }

    private static String lIIlIlllIIIIIII(String lllllllllllllllIIIllllIllIlIlIII, String lllllllllllllllIIIllllIllIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIllIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlIIIII[11], lllllllllllllllIIIllllIllIlIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIllIlIlIll) {
            lllllllllllllllIIIllllIllIlIlIll.printStackTrace();
            return null;
        }
    }

    public EquipmentSetup b() {
        return (EquipmentSetup) this.o.bloodMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIIIllIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIlllIIIIIIl(String lllllllllllllllIIIllllIllIIIIlIl, String lllllllllllllllIIIllllIllIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIIII[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIIIII[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIllIIIIllI) {
            lllllllllllllllIIIllllIllIIIIllI.printStackTrace();
            return null;
        }
    }

    private static int lIIlIlllIIIlIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIIlIlllIIIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean b(WorldPoint worldPoint) {
        List[] listArr = new List[lIIIIIIlIIIII[30]];
        listArr[lIIIIIIlIIIII[4]] = this.r;
        listArr[lIIIIIIlIIIII[8]] = this.s;
        listArr[lIIIIIIlIIIII[11]] = this.t;
        listArr[lIIIIIIlIIIII[12]] = this.u;
        listArr[lIIIIIIlIIIII[5]] = this.v;
        listArr[lIIIIIIlIIIII[26]] = this.w;
        listArr[lIIIIIIlIIIII[27]] = this.x;
        listArr[lIIIIIIlIIIII[29]] = this.y;
        for (List list : Arrays.asList(listArr)) {
            if (lIIlIlllIIIllII(list.contains(worldPoint) ? 1 : 0) && lIIlIlllIIIllII(list.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lIIIIIIlIIIII[8];
            }
            "".length();
            if (" ".length() < 0) {
                return ((171 ^ 138) ^ (218 ^ 182)) & (((((178 + 134) - 230) + 134) ^ (((32 + 96) - 122) + 143)) ^ (-" ".length()));
            }
        }
        return lIIIIIIlIIIII[4];
    }

    private static String lIIlIlllIIIIIlI(String lllllllllllllllIIIllllIllIIllIlI, String lllllllllllllllIIIllllIllIIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllIllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIllllIllIIllIIl.toCharArray();
        int lllllllllllllllIIIllllIllIIlIllI = lIIIIIIlIIIII[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIlIIIII[4];
        while (lIIlIlllIIlllII(i, length)) {
            char lllllllllllllllIIIllllIllIIllIll = charArray2[i];
            sb.append((char) (lllllllllllllllIIIllllIllIIllIll ^ charArray[lllllllllllllllIIIllllIllIIlIllI % charArray.length]));
            "".length();
            lllllllllllllllIIIllllIllIIlIllI++;
            i++;
            "".length();
            if (((181 ^ 165) ^ (152 ^ 140)) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private Set<WorldPoint> c() {
        HashSet hashSet = new HashSet();
        int[] iArr = new int[lIIIIIIlIIIII[8]];
        iArr[lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        TileObjects.getAll(iArr).forEach(tileObject -> {
            hashSet.add(tileObject.getWorldLocation());
            "".length();
        });
        return hashSet;
    }

    private static boolean lIIlIlllIIIlIll(int i) {
        return i == 0;
    }

    static {
        lIIlIlllIIIlIII();
        lIIlIlllIIIIlll();
    }

    private static boolean lIIlIlllIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIlllIIlllII(int i, int i2) {
        return i < i2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.f0q.contains(worldPoint);
    }
}
