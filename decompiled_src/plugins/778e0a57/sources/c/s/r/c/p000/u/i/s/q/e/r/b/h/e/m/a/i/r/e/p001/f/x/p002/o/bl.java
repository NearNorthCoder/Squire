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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Tightrope", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bl  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bl.class */
public class bl extends U {
    private static /* synthetic */ int[] lIlIlIIIllIl;
    private /* synthetic */ C0039n ak;
    private final /* synthetic */ int eu = 7603;
    private static /* synthetic */ String[] lIlIlIIIllII;
    private /* synthetic */ C0039n al;
    private final /* synthetic */ int et = 29742;
    private /* synthetic */ int am;

    private static void llIlllIIIllIll() {
        lIlIlIIIllIl = new int[36];
        lIlIlIIIllIl[0] = -" ".length();
        lIlIlIIIllIl[1] = (-((-9513) & 10154)) & (-273) & 30655;
        lIlIlIIIllIl[2] = (-16457) & 24059;
        lIlIlIIIllIl[3] = " ".length();
        lIlIlIIIllIl[4] = (99 ^ 71) & ((109 ^ 73) ^ (-1));
        lIlIlIIIllIl[5] = "  ".length();
        lIlIlIIIllIl[6] = "   ".length();
        lIlIlIIIllIl[7] = (199 ^ 173) ^ (71 ^ 41);
        lIlIlIIIllIl[8] = (14 ^ 6) ^ (6 ^ 11);
        lIlIlIIIllIl[9] = (((12 + 59) - (-27)) + 34) ^ (((28 + 60) - 20) + 62);
        lIlIlIIIllIl[10] = 168 ^ 175;
        lIlIlIIIllIl[11] = 138 ^ 130;
        lIlIlIIIllIl[12] = (145 ^ 158) ^ (99 ^ 101);
        lIlIlIIIllIl[13] = 115 ^ 121;
        lIlIlIIIllIl[14] = 118 ^ 125;
        lIlIlIIIllIl[15] = (67 ^ 121) ^ (11 ^ 61);
        lIlIlIIIllIl[16] = (((59 + 99) - 127) + 139) ^ (((128 + 34) - 69) + 74);
        lIlIlIIIllIl[17] = 2 ^ 12;
        lIlIlIIIllIl[18] = (37 ^ 124) ^ (221 ^ 139);
        lIlIlIIIllIl[19] = 53 ^ 37;
        lIlIlIIIllIl[20] = 171 ^ 186;
        lIlIlIIIllIl[21] = "   ".length() ^ (42 ^ 59);
        lIlIlIIIllIl[22] = 166 ^ 181;
        lIlIlIIIllIl[23] = 118 ^ 98;
        lIlIlIIIllIl[24] = 107 ^ 126;
        lIlIlIIIllIl[25] = (((129 + 26) - 100) + 132) ^ (((53 + 19) - (-86)) + 15);
        lIlIlIIIllIl[26] = 137 ^ 158;
        lIlIlIIIllIl[27] = (((51 + 7) - (-47)) + 76) ^ (((11 + 93) - (-62)) + 7);
        lIlIlIIIllIl[28] = 48 ^ 41;
        lIlIlIIIllIl[29] = 175 ^ 181;
        lIlIlIIIllIl[30] = (((170 + 102) - 65) + 9) ^ (((121 + 154) - 115) + 35);
        lIlIlIIIllIl[31] = (((121 + 126) - 118) + 22) ^ (((13 + 83) - (-6)) + 37);
        lIlIlIIIllIl[32] = (((21 + 159) - 129) + 122) ^ (((87 + 42) - (-25)) + 22);
        lIlIlIIIllIl[33] = 30 ^ 0;
        lIlIlIIIllIl[34] = 122 ^ 101;
        lIlIlIIIllIl[35] = (154 ^ 129) ^ (112 ^ 75);
    }

    private static String llIlllIIIlIIIl(String lllllllllllllllIllIlIIlllIIllIIl, String lllllllllllllllIllIlIIlllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIlllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIlllIIllIll.init(lIlIlIIIllIl[5], secretKeySpec);
            return new String(lllllllllllllllIllIlIIlllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIlllIIllIlI) {
            lllllllllllllllIllIlIIlllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    protected bl(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIIIllIl[0];
        this.et = lIlIlIIIllIl[1];
        this.eu = lIlIlIIIllIl[2];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlllIIIlllIl(tileObject.getName().equals(lIlIlIIIllII[lIlIlIIIllIl[25]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIIllIl[3]];
                strArr[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[26]];
                if (llIlllIIIlllIl(tileObject.hasAction(strArr) ? 1 : 0) && llIlllIIIlllIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIlIIIllIl[3];
                    "".length();
                    return ((100 ^ 96) & ((15 ^ 11) ^ (-1))) > " ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIIIllIl[4];
        });
    }

    private static boolean llIlllIIIlllIl(int i) {
        return i != 0;
    }

    private static boolean llIlllIIIlllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private boolean cS() {
        if (llIlllIIIlllIl(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlllIIIllllI(Movement.getDestination()) && llIlllIIIlllIl(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIlIIIllIl[4];
            }
            Movement.setDestination(this.al.bs);
            return lIlIlIIIllIl[3];
        }
        TileObject cR = cR();
        if (llIlllIIIlllII(cR)) {
            return lIlIlIIIllIl[4];
        }
        if (!llIlllIIIlllll(this.bS.isMoving() ? 1 : 0) || llIlllIIIlllIl(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        cR.interact(lIlIlIIIllII[lIlIlIIIllIl[24]]);
        return lIlIlIIIllIl[3];
    }

    private static String llIlllIIIlIIII(String lllllllllllllllIllIlIIlllIIIllII, String lllllllllllllllIllIlIIlllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIlllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlllIIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIllIl[11]), "DES");
            Cipher lllllllllllllllIllIlIIlllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIlllIIIlllI.init(lIlIlIIIllIl[5], lllllllllllllllIllIlIIlllIIIllll);
            return new String(lllllllllllllllIllIlIIlllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIlllIIIllIl) {
            lllllllllllllllIllIlIIlllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIIlllll(int i) {
        return i == 0;
    }

    private static boolean llIlllIIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIIlIIIIl(int i, int i2) {
        return i < i2;
    }

    private static void llIlllIIIlIIlI() {
        lIlIlIIIllII = new String[lIlIlIIIllIl[35]];
        lIlIlIIIllII[lIlIlIIIllIl[4]] = llIlllIIIIllll("BwkzOB0jAi9rCj4VOT8IIA==", "LlJKi");
        lIlIlIIIllII[lIlIlIIIllIl[3]] = llIlllIIIIllll("CxsHKBQj", "OrtXq");
        lIlIlIIIllII[lIlIlIIIllIl[5]] = llIlllIIIIllll("LiAFPj8=", "mRjML");
        lIlIlIIIllII[lIlIlIIIllIl[6]] = llIlllIIIlIIII("8MXvnXiY4U8=", "jtzFp");
        lIlIlIIIllII[lIlIlIIIllIl[7]] = llIlllIIIlIIII("any+KGxoJWw=", "hipxo");
        lIlIlIIIllII[lIlIlIIIllIl[8]] = llIlllIIIlIIIl("M37Q2IFLx9x+YBsTnT2jeQ==", "ilRME");
        lIlIlIIIllII[lIlIlIIIllIl[9]] = llIlllIIIIllll("CAMiARAgH2MYGSsD", "LfCux");
        lIlIlIIIllII[lIlIlIIIllIl[10]] = llIlllIIIlIIII("y8bOGd4d976/q7Xc5UAt0g==", "uQDHD");
        lIlIlIIIllII[lIlIlIIIllIl[11]] = llIlllIIIlIIIl("csfOMi75XwA=", "qQlNw");
        lIlIlIIIllII[lIlIlIIIllIl[12]] = llIlllIIIIllll("BxYbFQYNCwETRRQDARMAFA==", "fbote");
        lIlIlIIIllII[lIlIlIIIllIl[13]] = llIlllIIIlIIIl("3d8qh9nl8vM=", "DNYox");
        lIlIlIIIllII[lIlIlIIIllIl[14]] = llIlllIIIIllll("ETAeNyA1OwJkNygsFDA1Ng==", "ZUgDT");
        lIlIlIIIllII[lIlIlIIIllIl[15]] = llIlllIIIlIIII("aWEDDLGg9W8=", "EDksY");
        lIlIlIIIllII[lIlIlIIIllIl[16]] = llIlllIIIlIIIl("7zhpoMnLHP1KwQpLL6yYS4je17e5KADP", "xTyOD");
        lIlIlIIIllII[lIlIlIIIllIl[17]] = llIlllIIIIllll("DwkgOngKASAqeBgBKSYsHgc+K2c=", "lhNNX");
        lIlIlIIIllII[lIlIlIIIllIl[18]] = llIlllIIIIllll("LiE7GSQ=", "mSTjW");
        lIlIlIIIllII[lIlIlIIIllIl[19]] = llIlllIIIlIIIl("b8HKbhM47ZkJV8/KNAfDrA==", "vuWrZ");
        lIlIlIIIllII[lIlIlIIIllIl[20]] = llIlllIIIlIIIl("d+ijbz8mbxgvYXIQ21rZdw==", "huGTR");
        lIlIlIIIllII[lIlIlIIIllIl[21]] = llIlllIIIlIIIl("6JMhD3iRai4=", "WhaOD");
        lIlIlIIIllII[lIlIlIIIllIl[22]] = llIlllIIIIllll("DAAPHywkHE4ZJSYCCxk=", "HenkD");
        lIlIlIIIllII[lIlIlIIIllIl[23]] = llIlllIIIIllll("MgkiDSQaFWMULREJ", "vlCyL");
        lIlIlIIIllII[lIlIlIIIllIl[24]] = llIlllIIIlIIII("dmr05xRMsxQ=", "JhOxJ");
        lIlIlIIIllII[lIlIlIIIllIl[25]] = llIlllIIIlIIIl("NuXT/bph4uY=", "KIdKB");
        lIlIlIIIllII[lIlIlIIIllIl[26]] = llIlllIIIIllll("BBg9LCM=", "AvIIQ");
        lIlIlIIIllII[lIlIlIIIllIl[27]] = llIlllIIIIllll("KioDLC8CNg==", "nObXG");
        lIlIlIIIllII[lIlIlIIIllIl[28]] = llIlllIIIlIIII("4vl4+G1CHUxQ8sPPgPkQ1Q==", "QcFWH");
        lIlIlIIIllII[lIlIlIIIllIl[29]] = llIlllIIIIllll("MSAYJiQ=", "rRwUW");
        lIlIlIIIllII[lIlIlIIIllIl[30]] = llIlllIIIlIIII("BDjtxelOsw8=", "OmZej");
        lIlIlIIIllII[lIlIlIIIllIl[31]] = llIlllIIIlIIII("jpMPh/8NwTtsoWWictiO0Q==", "tZpKt");
        lIlIlIIIllII[lIlIlIIIllIl[32]] = llIlllIIIlIIIl("0uQj3mWzrJs=", "DxEwj");
        lIlIlIIIllII[lIlIlIIIllIl[33]] = llIlllIIIIllll("HzA7BT8pKjsGNWw6MxogJT0g", "LXRhR");
        lIlIlIIIllII[lIlIlIIIllIl[34]] = llIlllIIIIllll("CScjCTAh", "MNPyU");
    }

    static {
        llIlllIIIllIll();
        llIlllIIIlIIlI();
    }

    private static String llIlllIIIIllll(String lllllllllllllllIllIlIIlllIlIlllI, String lllllllllllllllIllIlIIlllIlIllIl) {
        String lllllllllllllllIllIlIIlllIlIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIlllIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIlllIlIllII = new StringBuilder();
        char[] lllllllllllllllIllIlIIlllIlIlIll = lllllllllllllllIllIlIIlllIlIllIl.toCharArray();
        int lllllllllllllllIllIlIIlllIlIlIlI = lIlIlIIIllIl[4];
        char[] charArray = lllllllllllllllIllIlIIlllIlIlllI2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIllIl[4];
        while (llIlllIIlIIIIl(i, length)) {
            char lllllllllllllllIllIlIIlllIlIllll = charArray[i];
            lllllllllllllllIllIlIIlllIlIllII.append((char) (lllllllllllllllIllIlIIlllIlIllll ^ lllllllllllllllIllIlIIlllIlIlIll[lllllllllllllllIllIlIIlllIlIlIlI % lllllllllllllllIllIlIIlllIlIlIll.length]));
            "".length();
            lllllllllllllllIllIlIIlllIlIlIlI++;
            i++;
            "".length();
            if (" ".length() < ((75 ^ 110) & ((166 ^ 131) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIIlllIlIllII);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[lIlIlIIIllIl[3]];
        strArr[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[19]];
        NPC nearest = NPCs.getNearest(strArr);
        String[] strArr2 = new String[lIlIlIIIllIl[3]];
        strArr2[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[20]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if (llIlllIIIlllII(nearest) && llIlllIIIlllII(nearest2)) {
            return null;
        }
        NPC nearest3 = NPCs.getNearest(npc -> {
            if (llIlllIIIlllIl(npc.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[27]]) ? 1 : 0) && llIlllIIIllllI(npc.getInteracting()) && llIlllIIIlllIl(npc.getInteracting().equals(Players.getLocal()) ? 1 : 0)) {
                ?? r0 = lIlIlIIIllIl[3];
                "".length();
                return ((116 ^ 121) ^ (73 ^ 64)) < (-" ".length()) ? ((137 ^ 162) ^ (250 ^ 157)) & (((254 ^ 190) ^ (87 ^ 91)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIllIl[4];
        });
        Prayer prayer = Prayer.PROTECT_FROM_MISSILES;
        if (!llIlllIIIlllII(nearest2) || (llIlllIIIllllI(nearest3) && llIlllIIIlllll(nearest3.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[21]]) ? 1 : 0))) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlllIIIlllIl(tileObject.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[33]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIIllIl[3]];
                strArr[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[34]];
                if (llIlllIIIlllIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIIllIl[3];
                    "".length();
                    return (-(41 ^ 45)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIIIllIl[4];
        });
        if (llIlllIIIlllII(nearest)) {
            return cS();
        }
        String[] strArr = new String[lIlIlIIIllIl[3]];
        strArr[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[4]];
        if (llIlllIIIlllIl(Inventory.contains(strArr) ? 1 : 0)) {
            if (llIlllIIIlllIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                nearest.interact(lIlIlIIIllII[lIlIlIIIllIl[3]]);
                return lIlIlIIIllIl[3];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (llIlllIIIlllIl(tileObject2.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[31]]) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIlIIIllIl[3]];
                    strArr2[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[32]];
                    if (llIlllIIIlllIl(tileObject2.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = lIlIlIIIllIl[3];
                        "".length();
                        return 0 != 0 ? ((157 ^ 160) ^ (129 ^ 134)) & (((((11 + 100) - 43) + 81) ^ (((2 + 164) - 45) + 54)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIlIIIllIl[4];
            });
            if (llIlllIIIllllI(nearest2)) {
                nearest2.interact(lIlIlIIIllII[lIlIlIIIllIl[5]]);
                return lIlIlIIIllIl[4];
            }
        }
        if (llIlllIIIllllI(this.bS.getInteracting()) && llIlllIIIlllIl(this.bS.getInteracting().getName().contains(lIlIlIIIllII[lIlIlIIIllIl[6]]) ? 1 : 0) && llIlllIIIlllll(this.bS.getInteracting().isDead() ? 1 : 0)) {
            return lIlIlIIIllIl[4];
        }
        NPC nearest3 = NPCs.getNearest(npc -> {
            if (llIlllIIIlllIl(npc.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[30]]) ? 1 : 0) && llIlllIIIlllIl(this.ak.a((Locatable) npc) ? 1 : 0) && llIlllIIIllllI(npc.getInteracting())) {
                ?? r0 = lIlIlIIIllIl[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlIIIllIl[4];
        });
        if (llIlllIIIllllI(nearest3)) {
            nearest3.interact(lIlIlIIIllII[lIlIlIIIllIl[7]]);
            return lIlIlIIIllIl[3];
        }
        String[] strArr2 = new String[lIlIlIIIllIl[3]];
        strArr2[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[8]];
        NPC nearest4 = NPCs.getNearest(strArr2);
        String[] strArr3 = new String[lIlIlIIIllIl[3]];
        strArr3[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[9]];
        NPC nearest5 = NPCs.getNearest(strArr3);
        if (llIlllIIIllllI(nearest5)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[10]]);
            nearest5.interact(lIlIlIIIllII[lIlIlIIIllIl[11]]);
            return lIlIlIIIllIl[3];
        } else if (llIlllIIIllllI(nearest4)) {
            System.out.println(lIlIlIIIllII[lIlIlIIIllIl[12]]);
            nearest4.interact(lIlIlIIIllII[lIlIlIIIllIl[13]]);
            return lIlIlIIIllIl[3];
        } else {
            String[] strArr4 = new String[lIlIlIIIllIl[3]];
            strArr4[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[14]];
            TileObject nearest6 = TileObjects.getNearest(strArr4);
            if (!llIlllIIIllllI(nearest6) || !llIlllIIIlllIl(Reachable.isWalkable(nearest6.getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject3 -> {
                    if (llIlllIIIlllIl(tileObject3.getName().contains(lIlIlIIIllII[lIlIlIIIllIl[28]]) ? 1 : 0)) {
                        String[] strArr5 = new String[lIlIlIIIllIl[3]];
                        strArr5[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[29]];
                        if (llIlllIIIlllIl(tileObject3.hasAction(strArr5) ? 1 : 0)) {
                            ?? r0 = lIlIlIIIllIl[3];
                            "".length();
                            return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIlIlIIIllIl[4];
                });
                if (llIlllIIIlllII(nearest7)) {
                    System.out.println(lIlIlIIIllII[lIlIlIIIllIl[17]]);
                    return lIlIlIIIllIl[4];
                }
                nearest7.interact(lIlIlIIIllII[lIlIlIIIllIl[18]]);
                return lIlIlIIIllIl[3];
            } else if (llIlllIIIlllIl(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIlIIIllIl[3];
            } else {
                nearest6.interact(lIlIlIIIllII[lIlIlIIIllIl[15]]);
                System.out.println(lIlIlIIIllII[lIlIlIIIllIl[16]]);
                return lIlIlIIIllIl[3];
            }
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        if (llIlllIIIlllIl(this.cp.tightropeBody() ? 1 : 0)) {
            String[] strArr = new String[lIlIlIIIllIl[3]];
            strArr[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[22]];
            NPC nearest = NPCs.getNearest(strArr);
            String[] strArr2 = new String[lIlIlIIIllIl[3]];
            strArr2[lIlIlIIIllIl[4]] = lIlIlIIIllII[lIlIlIIIllIl[23]];
            NPC nearest2 = NPCs.getNearest(strArr2);
            if (llIlllIIIllllI(nearest) && llIlllIIIlllII(nearest2)) {
                return C0044s.b(C0044s.e(N.TIGHTROPE)).derive(EquipmentInventorySlot.BODY, C0044s.bb().get(EquipmentInventorySlot.BODY));
            }
        }
        return C0044s.b(C0044s.e(N.TIGHTROPE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlllIIlIIIII(this.ak.bw, N.TIGHTROPE)) {
            ?? r0 = lIlIlIIIllIl[3];
            "".length();
            return 0 != 0 ? ((((74 + 17) - 82) + 171) ^ (((18 + 129) - 29) + 15)) & (((((30 + 99) - (-13)) + 24) ^ (((31 + 9) - (-22)) + 89)) ^ (-" ".length())) : r0;
        }
        return lIlIlIIIllIl[4];
    }
}
