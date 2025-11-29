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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Muttadiles", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aB  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aB.class */
public class aB extends U {
    private static /* synthetic */ String[] lIlIIllIlIII;
    private final /* synthetic */ int dE = 7563;
    private final /* synthetic */ int dD = 7562;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ C0039n al;
    private static /* synthetic */ int[] lIlIIllIlllI;
    private final /* synthetic */ int dC = 7561;
    private /* synthetic */ int am;
    /* synthetic */ int dB;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    private boolean cU() {
        if (llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[20]]) ? 1 : 0) && llIllIlIlIIllI(this.ak.a((Locatable) tileItem) ? 1 : 0) && llIllIlIlIIllI(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIlIIllIlllI[5];
                "".length();
                return 0 != 0 ? ((147 ^ 140) ^ (11 ^ 95)) & (((((132 + 110) - 110) + 83) ^ (((38 + 121) - 21) + 18)) ^ (-" ".length())) : r0;
            }
            return lIlIIllIlllI[0];
        });
        if (llIllIlIlIlIIl(Inventory.contains(item -> {
            return item.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[19]]);
        }) ? 1 : 0)) {
            nearest = TileItems.getNearest(tileItem2 -> {
                if (llIllIlIlIIllI(tileItem2.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[18]]) ? 1 : 0) && llIllIlIlIIllI(this.ak.a((Locatable) tileItem2) ? 1 : 0) && llIllIlIlIIllI(Reachable.isInteractable(tileItem2) ? 1 : 0)) {
                    ?? r0 = lIlIIllIlllI[5];
                    "".length();
                    return (23 ^ 18) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIllIlllI[0];
            });
        }
        if (llIllIlIlIlIII(nearest)) {
            return lIlIIllIlllI[0];
        }
        nearest.interact(lIlIIllIlIII[lIlIIllIlllI[17]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIIlll(int i, int i2) {
        return i <= i2;
    }

    @Inject
    protected aB(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dB = lIlIIllIlllI[0];
        this.dC = lIlIIllIlllI[1];
        this.dD = lIlIIllIlllI[2];
        this.dE = lIlIIllIlllI[3];
        this.am = lIlIIllIlllI[4];
    }

    private static boolean llIllIlIlIlIll(int i, int i2) {
        return i > i2;
    }

    private static String llIllIlIIlIIll(String lllllllllllllllIllIlIllllIlIIIII, String lllllllllllllllIllIlIllllIIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIllllIIlllll.toCharArray();
        int lllllllllllllllIllIlIllllIIlllII = lIlIIllIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIlllI[0];
        while (llIllIlIlIllIl(i, length)) {
            char lllllllllllllllIllIlIllllIlIIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIllIlIllllIlIIIIl ^ charArray[lllllllllllllllIllIlIllllIIlllII % charArray.length]));
            "".length();
            lllllllllllllllIllIlIllllIIlllII++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIllIlIlIIlIl();
        llIllIlIlIIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean cT() {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[23]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIllIlllI[5]];
                strArr[lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[24]];
                if (llIllIlIlIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIllIlllI[5];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIllIlllI[0];
        });
        if (llIllIlIlIlIII(nearest)) {
            System.out.println(lIlIIllIlIII[lIlIIllIlllI[14]]);
            return lIlIIllIlllI[0];
        }
        nearest.interact(lIlIIllIlIII[lIlIIllIlllI[15]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIlIIl(int i) {
        return i == 0;
    }

    private static void llIllIlIlIIlII() {
        lIlIIllIlIII = new String[lIlIIllIlllI[34]];
        lIlIIllIlIII[lIlIIllIlllI[0]] = llIllIlIIlIIll("FQ8vCg==", "AnDoo");
        lIlIIllIlIII[lIlIIllIlllI[5]] = llIllIlIIlIlII("DJg8dXi1NvFGEOTT8tPNfg==", "yjWGr");
        lIlIIllIlIII[lIlIIllIlllI[6]] = llIllIlIIlIlII("+N1tncXoUII=", "pQXCS");
        lIlIIllIlIII[lIlIIllIlllI[7]] = llIllIlIIlIIll("HT4WNzE0Ig4m", "PKbCP");
        lIlIIllIlIII[lIlIIllIlllI[9]] = llIllIlIIlIlIl("WrkEERLcAeM=", "fdmiM");
        lIlIIllIlIII[lIlIIllIlllI[10]] = llIllIlIIlIlIl("Xb3RXSSRHkOlwrVACkweJA==", "SWUly");
        lIlIIllIlIII[lIlIIllIlllI[11]] = llIllIlIIlIlIl("f5uw95NUBQc=", "thTgO");
        lIlIIllIlIII[lIlIIllIlllI[12]] = llIllIlIIlIlIl("v/CT8+/KoCIA2Vu+2BgtRA==", "pxHfn");
        lIlIIllIlIII[lIlIIllIlllI[13]] = llIllIlIIlIlIl("ikQRz+h9C5o=", "vHtuk");
        lIlIIllIlIII[lIlIIllIlllI[14]] = llIllIlIIlIlIl("5UoAee6m5uCkwmi/Urqm4aUsHytHYUWi", "yiVUS");
        lIlIIllIlIII[lIlIIllIlllI[15]] = llIllIlIIlIlII("qKuH5IubYv0=", "ntMHy");
        lIlIIllIlIII[lIlIIllIlllI[16]] = llIllIlIIlIIll("BC8yNwY=", "AAFRt");
        lIlIIllIlIII[lIlIIllIlllI[17]] = llIllIlIIlIlII("v8yACNrao2w=", "Koqvg");
        lIlIIllIlIII[lIlIIllIlllI[18]] = llIllIlIIlIlIl("GtI2VdOdBnQlGlZkZFUpSQ==", "RCpWv");
        lIlIIllIlIII[lIlIIllIlllI[19]] = llIllIlIIlIlII("0lH0MlBqCTM7aIhwWmo5pA==", "NYLff");
        lIlIIllIlIII[lIlIIllIlllI[20]] = llIllIlIIlIIll("LzY7GQBQIA==", "wSIpc");
        lIlIIllIlIII[lIlIIllIlllI[21]] = llIllIlIIlIlIl("mgZdueEa064=", "yWrnN");
        lIlIIllIlIII[lIlIIllIlllI[22]] = llIllIlIIlIlIl("9/+ORbdvBVk5WQGwIdYzJA==", "erqGv");
        lIlIIllIlIII[lIlIIllIlllI[23]] = llIllIlIIlIIll("IS4BDiIaMlkTKAElCw4hHA==", "oAygM");
        lIlIIllIlIII[lIlIIllIlllI[24]] = llIllIlIIlIIll("FiwWFA==", "FMegT");
        lIlIIllIlIII[lIlIIllIlllI[25]] = llIllIlIIlIlII("dIoZT8gsHo8=", "WCJvz");
        lIlIIllIlIII[lIlIIllIlllI[26]] = llIllIlIIlIlIl("l1r+L0Ynk1E=", "kMowe");
        lIlIIllIlIII[lIlIIllIlllI[27]] = llIllIlIIlIlII("W+vP/+anbJYjJk3Br3/HCg==", "REYLM");
        lIlIIllIlIII[lIlIIllIlllI[28]] = llIllIlIIlIlII("fh2wsio8iOg=", "Ysykh");
        lIlIIllIlIII[lIlIIllIlllI[29]] = llIllIlIIlIlII("FrFAm/QbFfY=", "YnUgR");
        lIlIIllIlIII[lIlIIllIlllI[30]] = llIllIlIIlIIll("NBohJgQ8Fg==", "DsBMe");
        lIlIIllIlIII[lIlIIllIlllI[32]] = llIllIlIIlIlII("Qd27xc7YHDo=", "BoVqU");
        lIlIIllIlIII[lIlIIllIlllI[33]] = llIllIlIIlIlII("pDf9zmI8ypjxI37W3MqDJw==", "vSBpK");
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllIlIlIIllI(tileObject.getName().equals(lIlIIllIlIII[lIlIIllIlllI[25]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIllIlllI[5]];
                strArr[lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[26]];
                if (llIllIlIlIIllI(tileObject.hasAction(strArr) ? 1 : 0) && llIllIlIlIIllI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIllIlllI[5];
                    "".length();
                    return "   ".length() <= " ".length() ? ((217 ^ 152) ^ (63 ^ 80)) & (((87 ^ 122) ^ "   ".length()) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIllIlllI[0];
        });
    }

    private static boolean llIllIlIlIllII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private boolean cS() {
        if (llIllIlIlIIllI(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIllIlIlIlIlI(Movement.getDestination()) && llIllIlIlIIllI(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIllIlllI[5];
        }
        TileObject cR = cR();
        if (llIllIlIlIlIII(cR)) {
            return lIlIIllIlllI[0];
        }
        if (!llIllIlIlIlIIl(this.bS.isMoving() ? 1 : 0) || llIllIlIlIIllI(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        cR.interact(lIlIIllIlIII[lIlIIllIlllI[16]]);
        return lIlIIllIlllI[5];
    }

    private WorldArea i(NPC npc) {
        if (llIllIlIlIlIII(npc)) {
            return null;
        }
        int i = lIlIIllIlllI[10];
        return new WorldArea(npc.getWorldLocation().dx(-i).dy(-i), (lIlIIllIlllI[6] * i) + npc.getWorldArea().getWidth(), (lIlIIllIlllI[6] * i) + npc.getWorldArea().getWidth());
    }

    private static String llIllIlIIlIlII(String lllllllllllllllIllIlIllllIllIIII, String lllllllllllllllIllIlIllllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllllIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIIllIlllI[13]), "DES");
            Cipher lllllllllllllllIllIlIllllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIlIllllIllIIlI.init(lIlIIllIlllI[6], lllllllllllllllIllIlIllllIllIIll);
            return new String(lllllllllllllllIllIlIllllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllllIllIIIl) {
            lllllllllllllllIllIlIllllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllIlIlIIlIl() {
        lIlIIllIlllI = new int[35];
        lIlIIllIlllI[0] = ((21 ^ 49) ^ (26 ^ 46)) & (((((151 + 65) - 193) + 146) ^ (((164 + 4) - 67) + 84)) ^ (-" ".length()));
        lIlIIllIlllI[1] = (-8245) & 15805;
        lIlIIllIlllI[2] = (-(59 ^ 46)) & (-514) & 8095;
        lIlIIllIlllI[3] = (-69) & 7631;
        lIlIIllIlllI[4] = -" ".length();
        lIlIIllIlllI[5] = " ".length();
        lIlIIllIlllI[6] = "  ".length();
        lIlIIllIlllI[7] = "   ".length();
        lIlIIllIlllI[8] = (30 ^ 89) ^ (40 ^ 83);
        lIlIIllIlllI[9] = 145 ^ 149;
        lIlIIllIlllI[10] = 87 ^ 82;
        lIlIIllIlllI[11] = (((184 + 172) - 199) + 34) ^ (((66 + 128) - 179) + 170);
        lIlIIllIlllI[12] = (112 ^ 59) ^ (60 ^ 112);
        lIlIIllIlllI[13] = (57 ^ 50) ^ "   ".length();
        lIlIIllIlllI[14] = 108 ^ 101;
        lIlIIllIlllI[15] = 52 ^ 62;
        lIlIIllIlllI[16] = (67 ^ 19) ^ (36 ^ 127);
        lIlIIllIlllI[17] = 151 ^ 155;
        lIlIIllIlllI[18] = 76 ^ 65;
        lIlIIllIlllI[19] = 92 ^ 82;
        lIlIIllIlllI[20] = (((116 + 84) - 126) + 96) ^ (((85 + 81) - 37) + 36);
        lIlIIllIlllI[21] = 185 ^ 169;
        lIlIIllIlllI[22] = 78 ^ 95;
        lIlIIllIlllI[23] = (107 ^ 33) ^ (153 ^ 193);
        lIlIIllIlllI[24] = 161 ^ 178;
        lIlIIllIlllI[25] = 177 ^ 165;
        lIlIIllIlllI[26] = (179 ^ 159) ^ (13 ^ 52);
        lIlIIllIlllI[27] = 30 ^ 8;
        lIlIIllIlllI[28] = (((199 + 102) - 202) + 114) ^ (((145 + 19) - 93) + 123);
        lIlIIllIlllI[29] = (136 ^ 170) ^ (124 ^ 70);
        lIlIIllIlllI[30] = 154 ^ 131;
        lIlIIllIlllI[31] = (-((-20493) & 22382)) & (-5) & 30703;
        lIlIIllIlllI[32] = 185 ^ 163;
        lIlIIllIlllI[33] = 30 ^ 5;
        lIlIIllIlllI[34] = (27 ^ 72) ^ (29 ^ 82);
    }

    private static boolean llIllIlIlIIllI(int i) {
        return i != 0;
    }

    private static boolean llIllIlIlIlIII(Object obj) {
        return obj == null;
    }

    private static String llIllIlIIlIlIl(String lllllllllllllllIllIlIllllIllllIl, String lllllllllllllllIllIlIllllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlllllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIllllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIllllIllllll.init(lIlIIllIlllI[6], lllllllllllllllIllIlIlllllIIIIII);
            return new String(lllllllllllllllIllIlIllllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIllllIlllllI) {
            lllllllllllllllIllIlIllllIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIlIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIllIlIlIllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v158, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIlIlIIllI(cU() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        Player local = Players.getLocal();
        int tickCount = Static.getClient().getTickCount();
        if (llIllIlIlIIlll(local.distanceTo(this.ak.bs), lIlIIllIlllI[5]) && llIllIlIlIIllI(cT() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            String[] strArr = new String[lIlIIllIlllI[5]];
            strArr[lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[32]];
            if (llIllIlIlIIllI(npc.hasAction(strArr) ? 1 : 0) && llIllIlIlIIllI(npc.getName().contains(lIlIIllIlIII[lIlIIllIlllI[33]]) ? 1 : 0)) {
                ?? r0 = lIlIIllIlllI[5];
                "".length();
                return "  ".length() == "   ".length() ? ((244 ^ 144) ^ (250 ^ 185)) & (((39 ^ 1) ^ " ".length()) ^ (-" ".length())) : r0;
            }
            return lIlIIllIlllI[0];
        });
        int[] iArr = new int[lIlIIllIlllI[5]];
        iArr[lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC nearest2 = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIlIIllIlllI[5]];
        iArr2[lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC nearest3 = NPCs.getNearest(iArr2);
        int[] iArr3 = new int[lIlIIllIlllI[5]];
        iArr3[lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC nearest4 = NPCs.getNearest(iArr3);
        if (llIllIlIlIlIII(nearest2) && llIllIlIlIlIII(nearest3) && llIllIlIlIlIII(nearest4)) {
            return cS();
        }
        if (llIllIlIlIlIIl(Inventory.contains(item -> {
            if (llIllIlIlIIllI(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[29]]) ? 1 : 0) && llIllIlIlIlIIl(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[30]]) ? 1 : 0) && llIllIlIlIllII(item.getId(), lIlIIllIlllI[31])) {
                ?? r0 = lIlIIllIlllI[5];
                "".length();
                return "   ".length() == (((((104 + 140) - 197) + 103) ^ (((132 + 162) - 206) + 103)) & (((246 ^ 197) ^ (56 ^ 34)) ^ (-" ".length()))) ? ((97 ^ 101) ^ (99 ^ 53)) & (((((38 + 14) - (-66)) + 112) ^ (((54 + 167) - 107) + 66)) ^ (-" ".length())) : r0;
            }
            return lIlIIllIlllI[0];
        }) ? 1 : 0)) {
            if (llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIIllIlllI[5];
            }
            TileObject nearest5 = TileObjects.getNearest(tileObject -> {
                if (llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[27]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIllIlllI[5]];
                    strArr[lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[28]];
                    if (llIllIlIlIIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIIllIlllI[5];
                        "".length();
                        return ((206 ^ 141) & ((22 ^ 85) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIllIlllI[0];
            });
            if (llIllIlIlIlIII(nearest5)) {
                return lIlIIllIlllI[0];
            }
            nearest5.interact(lIlIIllIlIII[lIlIIllIlllI[0]]);
            return lIlIIllIlllI[5];
        } else if (llIllIlIlIlIlI(nearest)) {
            if ((!llIllIlIlIlIlI(local.getInteracting()) || llIllIlIlIlIIl(local.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[5]]) ? 1 : 0)) && llIllIlIlIlIll(tickCount - this.co.H(), lIlIIllIlllI[6])) {
                nearest.interact(lIlIIllIlIII[lIlIIllIlllI[6]]);
                return lIlIIllIlllI[5];
            }
            if (!llIllIlIlIlIll(tickCount - this.co.H(), lIlIIllIlllI[6]) && !llIllIlIlIlIII(nearest2)) {
                if (llIllIlIlIlIlI(local.getInteracting()) && llIllIlIlIIllI(local.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[7]]) ? 1 : 0)) {
                    return lIlIIllIlllI[0];
                }
                if ((!llIllIlIlIllII(nearest2.getHealthRatio(), lIlIIllIlllI[4]) || !llIllIlIlIllIl(nearest2.getHealthRatio(), lIlIIllIlllI[8])) && llIllIlIlIIllI(nearest2.getWorldArea().isInMeleeDistance(local.getWorldLocation()) ? 1 : 0)) {
                    nearest2.interact(lIlIIllIlIII[lIlIIllIlllI[9]]);
                    return lIlIIllIlllI[5];
                }
                return lIlIIllIlllI[0];
            }
            return lIlIIllIlllI[0];
        } else if (llIllIlIlIlIlI(nearest2)) {
            if (llIllIlIlIlIlI(local.getInteracting()) && llIllIlIlIIllI(local.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[10]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            nearest2.interact(lIlIIllIlIII[lIlIIllIlllI[11]]);
            return lIlIIllIlllI[5];
        } else if (llIllIlIlIlIII(nearest3)) {
            return lIlIIllIlllI[0];
        } else {
            if (llIllIlIlIIlll(nearest3.getWorldArea().distanceTo(local.getWorldLocation()), lIlIIllIlllI[7])) {
                WorldPoint worldPoint = (WorldPoint) i(nearest3).toWorldPointList().stream().filter(worldPoint2 -> {
                    if (llIllIlIlIIllI(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llIllIlIlIllIl(nearest3.getWorldArea().distanceTo(worldPoint2), lIlIIllIlllI[11])) {
                        ?? r0 = lIlIIllIlllI[5];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIllIlllI[0];
                }).max(Comparator.comparingInt(obj -> {
                    return nearest3.getWorldArea().distanceTo((WorldPoint) obj);
                }).thenComparingDouble(obj2 -> {
                    return (-1.0f) * ((WorldPoint) obj2).distanceToHypotenuse(local.getWorldLocation());
                })).orElse(null);
                if (llIllIlIlIlIlI(worldPoint)) {
                    System.out.println("Player: " + String.valueOf(local.getWorldLocation()) + String.valueOf(nearest3.getWorldLocation()));
                    Movement.setDestination(worldPoint);
                    return lIlIIllIlllI[5];
                }
            }
            if (llIllIlIlIlIlI(local.getInteracting()) && llIllIlIlIIllI(local.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[12]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            nearest3.interact(lIlIIllIlIII[lIlIIllIlllI[13]]);
            return lIlIIllIlllI[5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllIlIlIlllI(this.ak.bw, N.MUTTADILES)) {
            ?? r0 = lIlIIllIlllI[5];
            "".length();
            return (-"   ".length()) > 0 ? ((((96 + 159) - 125) + 57) ^ (((69 + 90) - 21) + 9)) & (((33 ^ 39) ^ (119 ^ 89)) ^ (-" ".length())) : r0;
        }
        return lIlIIllIlllI[0];
    }

    private static boolean llIllIlIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        NPCs.getNearest(npc -> {
            String[] strArr = new String[lIlIIllIlllI[5]];
            strArr[lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[21]];
            if (llIllIlIlIIllI(npc.hasAction(strArr) ? 1 : 0) && llIllIlIlIIllI(npc.getName().contains(lIlIIllIlIII[lIlIIllIlllI[22]]) ? 1 : 0)) {
                ?? r0 = lIlIIllIlllI[5];
                "".length();
                return ((((30 + 112) - 61) + 48) ^ (((30 + 27) - 11) + 86)) <= 0 ? ((150 ^ 172) ^ "   ".length()) & (((((30 + 9) - (-14)) + 82) ^ (((93 + 129) - 121) + 89)) ^ (-" ".length())) : r0;
            }
            return lIlIIllIlllI[0];
        });
        return C0044s.b(C0044s.e(N.MUTTADILES));
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Player local = Players.getLocal();
        int[] iArr = new int[lIlIIllIlllI[5]];
        iArr[lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIlIIllIlllI[5]];
        iArr2[lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC nearest2 = NPCs.getNearest(iArr2);
        int[] iArr3 = new int[lIlIIllIlllI[5]];
        iArr3[lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC nearest3 = NPCs.getNearest(iArr3);
        if (llIllIlIlIlIII(nearest2) && llIllIlIlIlIII(nearest3) && llIllIlIlIlIII(nearest)) {
            return null;
        }
        Prayer prayer = Prayer.PROTECT_FROM_MISSILES;
        if (llIllIlIlIlIlI(nearest) && llIllIlIlIIllI(nearest.getWorldArea().isInMeleeDistance(local.getWorldLocation()) ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MELEE;
        }
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        return arrayList;
    }
}
