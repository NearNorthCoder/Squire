package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Model;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ap.class */
public abstract class AbstractC0016ap extends AbstractC0015ao {
    protected static final /* synthetic */ int cY;
    protected static final /* synthetic */ int cZ;
    private static /* synthetic */ String[] lIllIllIlII;
    protected static final /* synthetic */ int da;
    private static final /* synthetic */ int db;
    private static final /* synthetic */ int dc;
    private static /* synthetic */ int[] lIllIlllIII;

    private static boolean lIIllIIIIIIIII(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIIIIIll(int i, int i2) {
        return i < i2;
    }

    public EnumC0066o bv() {
        switch (C0017aq.dd[bx().ordinal()]) {
            case 1:
                return EnumC0066o.DEATH;
            case 2:
                return EnumC0066o.FIRE;
            case 3:
                return EnumC0066o.AIR;
            case 4:
                return EnumC0066o.LIGHTNING;
            default:
                return EnumC0066o.LIGHTNING;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        String[] strArr = new String[lIllIlllIII[1]];
        strArr[lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[2]];
        strArr[lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIlIlllllllll(nearest) && lIIllIIIIIIIII(Reachable.isInteractable(nearest) ? 1 : 0)) {
            ?? r0 = lIllIlllIII[3];
            "".length();
            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlllIII[2];
    }

    static {
        lIIlIllllllllI();
        lIIlIlllllIlIl();
        cY = lIllIlllIII[9];
        dc = lIllIlllIII[6];
        cZ = lIllIlllIII[5];
        db = lIllIlllIII[0];
        da = lIllIlllIII[7];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return lIllIlllIII[0];
    }

    public boolean bw() {
        int[] iArr = new int[lIllIlllIII[3]];
        iArr[lIllIlllIII[2]] = lIllIlllIII[9];
        return e(iArr);
    }

    private static boolean lIIllIIIIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIllllllllI() {
        lIllIlllIII = new int[20];
        lIllIlllIII[0] = (-169) & 14844;
        lIllIlllIII[1] = "  ".length();
        lIllIlllIII[2] = (42 ^ 48) & ((78 ^ 84) ^ (-1));
        lIllIlllIII[3] = " ".length();
        lIllIlllIII[4] = 156 ^ 152;
        lIllIlllIII[5] = (-((-27239) & 31479)) & (-1) & 16030;
        lIllIlllIII[6] = (-497) & 12287;
        lIllIlllIII[7] = (-4268) & 16059;
        lIllIlllIII[8] = "   ".length();
        lIllIlllIII[9] = (-((-5315) & 21967)) & (-225) & 28671;
        lIllIlllIII[10] = 169 ^ 172;
        lIllIlllIII[11] = 0 ^ 6;
        lIllIlllIII[12] = (((26 + 72) - (-35)) + 19) ^ (((15 + 41) - 22) + 125);
        lIllIlllIII[13] = (54 ^ 19) ^ (99 ^ 78);
        lIllIlllIII[14] = 0 ^ 9;
        lIllIlllIII[15] = (((39 + 163) - 91) + 70) ^ (((10 + 13) - (-68)) + 100);
        lIllIlllIII[16] = (165 ^ 155) ^ (45 ^ 24);
        lIllIlllIII[17] = (((181 + 145) - 273) + 131) ^ (((45 + 22) - (-38)) + 75);
        lIllIlllIII[18] = (((38 + 3) - 13) + 118) ^ (((42 + 98) - 17) + 36);
        lIllIlllIII[19] = 171 ^ 165;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean g(NPC npc) {
        Model model = npc.getModel();
        if (lIIlIlllllllll(model) && lIIllIIIIIIlII(model.getOverrideAmount())) {
            ?? r0 = lIllIlllIII[3];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlllIII[2];
    }

    public void g(WorldPoint worldPoint) {
        Player local = Players.getLocal();
        if (lIIllIIIIIIIIl(NPCs.getNearest(npc -> {
            if (lIIlIlllllllll(npc.getName()) && lIIllIIIIIIIII(npc.getName().contains(lIllIllIlII[lIllIlllIII[18]]) ? 1 : 0) && lIIllIIIIIIIll(npc.getWorldLocation().distanceTo(local), lIllIlllIII[4])) {
                ?? r0 = lIllIlllIII[3];
                "".length();
                return " ".length() == "  ".length() ? ((((155 + 39) - 70) + 67) ^ (((139 + 39) - 62) + 66)) & (((227 ^ 145) ^ (117 ^ 14)) ^ (-" ".length())) : r0;
            }
            return lIllIlllIII[2];
        }))) {
            Movement.setDestination(worldPoint);
        } else {
            Movement.setDestination(c(local.getWorldLocation(), worldPoint));
        }
    }

    private static boolean lIIllIIIIIIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        String[] strArr = new String[lIllIlllIII[3]];
        strArr[lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIllIIIIIIIIl(nearest)) {
            return lIllIlllIII[2];
        }
        r();
        nearest.interact(lIllIllIlII[lIllIlllIII[8]]);
        return lIllIlllIII[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        if (lIIllIIIIIIIII(super.bn() ? 1 : 0)) {
            return lIllIlllIII[3];
        }
        if (lIIllIIIIIIIII(Dialog.isOpen() ? 1 : 0) && lIIllIIIIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIlllIII[3];
        }
        String[] strArr = new String[lIllIlllIII[1]];
        strArr[lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[4]];
        strArr[lIllIlllIII[3]] = lIllIllIlII[lIllIlllIII[10]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIIIIIIIIl(nearest)) {
            return lIllIlllIII[2];
        }
        String[] strArr2 = new String[lIllIlllIII[3]];
        strArr2[lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[11]];
        if (lIIllIIIIIIIII(nearest.hasAction(strArr2) ? 1 : 0)) {
            nearest.interact(lIllIllIlII[lIllIlllIII[12]]);
            return lIllIlllIII[3];
        }
        nearest.interact(lIllIllIlII[lIllIlllIII[13]]);
        return lIllIlllIII[3];
    }

    private static String lIIlIllllIllII(String llllllllllllllllIlIIllllllIllllI, String llllllllllllllllIlIIllllllIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlllIII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllllllIlllll) {
            llllllllllllllllIlIIllllllIlllll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllllIlIl() {
        lIllIllIlII = new String[lIllIlllIII[19]];
        lIllIllIlII[lIllIlllIII[2]] = lIIlIllllIlIlI("7RkKXtmkqFKVu/IDic6oSA==", "jdTSP");
        lIllIllIlII[lIllIlllIII[3]] = lIIlIllllIllII("+1WK9jtfaUY=", "eFTsP");
        lIllIllIlII[lIllIlllIII[1]] = lIIlIllllIllII("5pYzybYGSQI3gl7XTGHPZfHplpcePFKj", "cLemO");
        lIllIllIlII[lIllIlllIII[8]] = lIIlIllllIllII("nK7HmaRHQ+Irz6mUAXqL1A==", "SUBMT");
        lIllIllIlII[lIllIlllIII[4]] = lIIlIllllIlIlI("D1xf+qYOyuw=", "GVLSK");
        lIllIllIlII[lIllIlllIII[10]] = lIIlIllllIllII("ofAMBTTruQbMAjPGLTnl9Q==", "ieLWZ");
        lIllIllIlII[lIllIlllIII[11]] = lIIlIlllllIlII("OxcYDwlHDhQNFA8=", "jbqlb");
        lIllIllIlII[lIllIlllIII[12]] = lIIlIlllllIlII("Cw0bBCR3FBcGOT8=", "ZxrgO");
        lIllIllIlII[lIllIlllIII[13]] = lIIlIlllllIlII("MgkvLEESBw==", "fhCGl");
        lIllIllIlII[lIllIlllIII[14]] = lIIlIlllllIlII("IAoJLhZGEkIVHwAFDTE=", "aabFw");
        lIllIllIlII[lIllIlllIII[15]] = lIIlIllllIllII("AVg0S9SbboyhL+BHlm0Afw==", "DUMMW");
        lIllIllIlII[lIllIlllIII[16]] = lIIlIllllIlIlI("h5P9qfWjcQSkSQmx7S+JjQ==", "nNnGo");
        lIllIllIlII[lIllIlllIII[17]] = lIIlIllllIlIlI("MugSPqiIBkY=", "AHkeK");
        lIllIllIlII[lIllIlllIII[18]] = lIIlIlllllIlII("GjE4", "UCZsp");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0016ap(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    public List<NPC> by() {
        String[] strArr = new String[lIllIlllIII[3]];
        strArr[lIllIlllIII[2]] = lIllIllIlII[lIllIlllIII[14]];
        return NPCs.getAll(strArr);
    }

    public NPC J() {
        int[] iArr = new int[lIllIlllIII[4]];
        iArr[lIllIlllIII[2]] = lIllIlllIII[5];
        iArr[lIllIlllIII[3]] = lIllIlllIII[6];
        iArr[lIllIlllIII[1]] = lIllIlllIII[7];
        iArr[lIllIlllIII[8]] = lIllIlllIII[9];
        return NPCs.getNearest(iArr);
    }

    private static String lIIlIlllllIlII(String llllllllllllllllIlIIllllllllIIll, String llllllllllllllllIlIIllllllllIIlI) {
        String llllllllllllllllIlIIllllllllIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllllllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllllllllIIIl = new StringBuilder();
        char[] llllllllllllllllIlIIllllllllIIII = llllllllllllllllIlIIllllllllIIlI.toCharArray();
        int llllllllllllllllIlIIlllllllIllll = lIllIlllIII[2];
        char[] charArray = llllllllllllllllIlIIllllllllIIll2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIlIIlllllllIIlll = lIllIlllIII[2];
        while (lIIllIIIIIIIll(llllllllllllllllIlIIlllllllIIlll, length)) {
            llllllllllllllllIlIIllllllllIIIl.append((char) (charArray[llllllllllllllllIlIIlllllllIIlll] ^ llllllllllllllllIlIIllllllllIIII[llllllllllllllllIlIIlllllllIllll % llllllllllllllllIlIIllllllllIIII.length]));
            "".length();
            llllllllllllllllIlIIlllllllIllll++;
            llllllllllllllllIlIIlllllllIIlll++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIllllllllIIIl);
    }

    private static boolean lIIlIlllllllll(Object obj) {
        return obj != null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = new int[lIllIlllIII[4]];
        iArr[lIllIlllIII[2]] = lIllIlllIII[5];
        iArr[lIllIlllIII[3]] = lIllIlllIII[6];
        iArr[lIllIlllIII[1]] = lIllIlllIII[7];
        iArr[lIllIlllIII[8]] = lIllIlllIII[9];
        return e(iArr);
    }

    private static String lIIlIllllIlIlI(String llllllllllllllllIlIlIIIIIIIIIIll, String llllllllllllllllIlIlIIIIIIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlllIII[13]), "DES");
            Cipher llllllllllllllllIlIlIIIIIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIIIIIIIlIl.init(lIllIlllIII[1], llllllllllllllllIlIlIIIIIIIIIllI);
            return new String(llllllllllllllllIlIlIIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIIIIIIIlII) {
            llllllllllllllllIlIlIIIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    public EnumC0065n bx() {
        List<NPC> by = by();
        if (lIIllIIIIIIIlI(by.size(), lIllIlllIII[4])) {
            EnumC0065n[] values = EnumC0065n.values();
            int length = values.length;
            int llllllllllllllllIlIlIIIIIIlIlllI = lIllIlllIII[2];
            while (lIIllIIIIIIIll(llllllllllllllllIlIlIIIIIIlIlllI, length)) {
                EnumC0065n enumC0065n = values[llllllllllllllllIlIlIIIIIIlIlllI];
                WorldPoint a = enumC0065n.a(this.cu);
                NPC nearest = NPCs.getNearest(a, npc -> {
                    if (lIIllIIIIIIIII(npc.getName().equals(lIllIllIlII[lIllIlllIII[16]]) ? 1 : 0) && lIIllIIIIIIIll(npc.getWorldLocation().distanceTo(a), lIllIlllIII[11])) {
                        ?? r0 = lIllIlllIII[3];
                        "".length();
                        return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlllIII[2];
                });
                if (lIIlIlllllllll(nearest) && lIIllIIIIIIIII(g(nearest) ? 1 : 0)) {
                    return enumC0065n;
                }
                llllllllllllllllIlIlIIIIIIlIlllI++;
                "".length();
                if ((51 ^ 55) == "   ".length()) {
                    return null;
                }
            }
            NPC orElse = by.stream().filter(this::g).findFirst().orElse(null);
            if (lIIlIlllllllll(orElse)) {
                return EnumC0065n.a(this.cu, orElse.getWorldLocation());
            }
        }
        EnumC0065n[] values2 = EnumC0065n.values();
        int length2 = values2.length;
        int llllllllllllllllIlIlIIIIIIlIlllI2 = lIllIlllIII[2];
        while (lIIllIIIIIIIll(llllllllllllllllIlIlIIIIIIlIlllI2, length2)) {
            EnumC0065n enumC0065n2 = values2[llllllllllllllllIlIlIIIIIIlIlllI2];
            WorldPoint a2 = enumC0065n2.a(this.cu);
            if (lIIllIIIIIIIIl(NPCs.getNearest(a2, npc2 -> {
                if (lIIllIIIIIIIII(npc2.getName().equals(lIllIllIlII[lIllIlllIII[15]]) ? 1 : 0) && lIIllIIIIIIIll(npc2.getWorldLocation().distanceTo(a2), lIllIlllIII[11])) {
                    ?? r0 = lIllIlllIII[3];
                    "".length();
                    return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIlllIII[2];
            }))) {
                return enumC0065n2;
            }
            llllllllllllllllIlIlIIIIIIlIlllI2++;
            "".length();
            if ((-" ".length()) >= (191 ^ 187)) {
                return null;
            }
        }
        return null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        NPC J = J();
        if (lIIllIIIIIIIIl(J)) {
            return this.cW.meleeGearAkkha();
        }
        if (lIIllIIIIIIIlI(J.getId(), lIllIlllIII[5])) {
            return this.cW.mageGearAkkha();
        }
        if (!lIIllIIIIIIIlI(J.getId(), lIllIlllIII[6]) && lIIllIIIIIIIlI(J.getId(), lIllIlllIII[7])) {
            return this.cW.rangeGearAkkha();
        }
        return this.cW.meleeGearAkkha();
    }

    private static boolean lIIllIIIIIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean bu() {
        NPC J = J();
        if (lIIllIIIIIIIIl(J)) {
            return lIllIlllIII[2];
        }
        if (lIIllIIIIIIIII(this.cW.butterfly() ? 1 : 0) && lIIllIIIIIIIlI(J.getId(), lIllIlllIII[5]) && lIIllIIIIIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            ?? r0 = lIllIlllIII[3];
            "".length();
            return (-" ".length()) >= ((76 ^ 127) ^ (241 ^ 198)) ? ((125 ^ 33) ^ (31 ^ 99)) & (((((94 + 96) - 75) + 19) ^ (((4 + 36) - (-93)) + 33)) ^ (-" ".length())) : r0;
        }
        return lIllIlllIII[2];
    }

    public WorldPoint c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        List all = NPCs.getAll(npc -> {
            if (lIIlIlllllllll(npc.getName()) && lIIllIIIIIIIII(npc.getName().toLowerCase().contains(lIllIllIlII[lIllIlllIII[17]]) ? 1 : 0)) {
                ?? r0 = lIllIlllIII[3];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlllIII[2];
        });
        WorldArea offset = worldPoint.toWorldArea().offset(lIllIlllIII[1]);
        Predicate predicate = worldPoint3 -> {
            return all.stream().noneMatch(npc2 -> {
                return npc2.getWorldLocation().equals(worldPoint3);
            });
        };
        Stream filter = offset.toWorldPointList().stream().filter(worldPoint4 -> {
            if (lIIllIIIIIIlII(worldPoint4.equals(worldPoint) ? 1 : 0)) {
                ?? r0 = lIllIlllIII[3];
                "".length();
                return " ".length() <= ((88 ^ 113) & ((235 ^ 194) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlllIII[2];
        }).filter(predicate).filter(worldPoint5 -> {
            List pathTo = worldPoint.pathTo(this.cu, worldPoint5);
            if (!lIIlIlllllllll(pathTo) || lIIllIIIIIIIII(pathTo.stream().allMatch(predicate) ? 1 : 0)) {
                ?? r0 = lIllIlllIII[3];
                "".length();
                return "   ".length() < ((23 ^ 46) & ((37 ^ 28) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlllIII[2];
        }).filter(Reachable::isWalkable);
        Objects.requireNonNull(worldPoint2);
        "".length();
        return (WorldPoint) filter.min(Comparator.comparingInt(this::distanceTo)).orElse(worldPoint2);
    }
}
