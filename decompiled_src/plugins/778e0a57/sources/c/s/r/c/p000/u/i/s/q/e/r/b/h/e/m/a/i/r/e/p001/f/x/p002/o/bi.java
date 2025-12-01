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
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Crabs", priority = 10000, blocking = true, register = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bi  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bi.class */
public class bi extends U {
    private /* synthetic */ C0039n al;
    private /* synthetic */ int am;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ int dB;
    private static /* synthetic */ String[] lIlIlIIIlllI;
    /* synthetic */ List<C0041p> en;
    private static /* synthetic */ int[] lIlIlIIlIlII;

    static {
        llIlllIIllIlIl();
        llIlllIIllIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private boolean cS() {
        if (llIlllIIllIlll(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlllIIlllIIl(Movement.getDestination()) && llIlllIIllIlll(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIlIIlIlII[2];
            }
            Movement.setDestination(this.al.bs);
            return lIlIlIIlIlII[1];
        }
        TileObject cR = cR();
        if (llIlllIIllIllI(cR)) {
            return lIlIlIIlIlII[2];
        }
        if (!llIlllIIlllIlI(this.bS.isMoving() ? 1 : 0) || llIlllIIllIlll(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        cR.interact(lIlIlIIIlllI[lIlIlIIlIlII[2]]);
        return lIlIlIIlIlII[1];
    }

    private void en() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlllIIllIlll(npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[51]]) ? 1 : 0) && llIlllIIlllIlI(D(npc) ? 1 : 0)) {
                ?? r0 = lIlIlIIlIlII[1];
                "".length();
                return " ".length() < 0 ? ((((113 + 83) - 7) + 58) ^ (((93 + 64) - 80) + 89)) & (((68 ^ 73) ^ (47 ^ 115)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIlIlII[2];
        });
        ep();
        if (llIlllIIlllIIl(nearest.getInteracting()) || llIlllIIlllIll(this.cq.getTickCount() - this.dB, lIlIlIIlIlII[4])) {
            return;
        }
        nearest.interact(lIlIlIIIlllI[lIlIlIIlIlII[5]]);
        this.dB = this.cq.getTickCount();
    }

    @Inject
    protected bi(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIIlIlII[0];
        this.en = new ArrayList();
        this.dB = lIlIlIIlIlII[0];
    }

    private static boolean llIlllIIlllIlI(int i) {
        return i == 0;
    }

    private static void llIlllIIllIlII() {
        lIlIlIIIlllI = new String[lIlIlIIlIlII[60]];
        lIlIlIIIlllI[lIlIlIIlIlII[2]] = llIlllIIIllIII("jvhLHGb+o7k=", "xhAjs");
        lIlIlIIIlllI[lIlIlIIlIlII[1]] = llIlllIIIllIII("R9QZpv3FVQw=", "oFhNo");
        lIlIlIIIlllI[lIlIlIIlIlII[5]] = llIlllIIIllIII("JKdhEIPAXYI=", "yigTg");
        lIlIlIIIlllI[lIlIlIIlIlII[6]] = llIlllIIIllIII("nsdQGsa/i9YAoJwhUe0qzCsYUU1LXo3gwDPp/85M1yW5NOr9xjGClORzSlEQC2Fs", "gBwxS");
        lIlIlIIIlllI[lIlIlIIlIlII[7]] = llIlllIIIllIII("KMlATokpsEc=", "ZlLDh");
        lIlIlIIIlllI[lIlIlIIlIlII[4]] = llIlllIIIllIII("9mFqFEeo34M=", "uRWXV");
        lIlIlIIIlllI[lIlIlIIlIlII[8]] = llIlllIIIllIIl("32NFwwaAqTc=", "facuL");
        lIlIlIIIlllI[lIlIlIIlIlII[9]] = llIlllIIIllIlI("PwIeHAc=", "zskuw");
        lIlIlIIIlllI[lIlIlIIlIlII[10]] = llIlllIIIllIlI("OAcUBQw=", "onqih");
        lIlIlIIIlllI[lIlIlIIlIlII[11]] = llIlllIIIllIIl("uY8/Kg4/7xA=", "TvmmK");
        lIlIlIIIlllI[lIlIlIIlIlII[12]] = llIlllIIIllIlI("OxMkOA==", "lvEJv");
        lIlIlIIIlllI[lIlIlIIlIlII[13]] = llIlllIIIllIIl("TlTkmwcuTWA=", "BIrCW");
        lIlIlIIIlllI[lIlIlIIlIlII[14]] = llIlllIIIllIII("RyaKHO9oKa4=", "zQRCZ");
        lIlIlIIIlllI[lIlIlIIlIlII[15]] = llIlllIIIllIIl("PvqAfncRUWQ=", "SBqzO");
        lIlIlIIIlllI[lIlIlIIlIlII[16]] = llIlllIIIllIlI("NCsAMzY=", "qZuZF");
        lIlIlIIIlllI[lIlIlIIlIlII[17]] = llIlllIIIllIII("acAtu8Hka7A=", "Emdiw");
        lIlIlIIIlllI[lIlIlIIlIlII[19]] = llIlllIIIllIII("zWWfVCcGvvkCWxjnLVa960dfU+hJvlnn", "tsdDt");
        lIlIlIIIlllI[lIlIlIIlIlII[20]] = llIlllIIIllIIl("K4Q7I1kOUiaQa+KXgHQpFXubij3XpGJF", "dEfUf");
        lIlIlIIIlllI[lIlIlIIlIlII[21]] = llIlllIIIllIIl("WGhyDfWQi2w3ctP0XX9aAw==", "MXpSh");
        lIlIlIIIlllI[lIlIlIIlIlII[23]] = llIlllIIIllIII("OBmLQxw0ZvRCH4uwlAMMA6FWg14RE+O0", "EWzVT");
        lIlIlIIIlllI[lIlIlIIlIlII[24]] = llIlllIIIllIII("Iiy3MK24e8Y=", "uoNuh");
        lIlIlIIIlllI[lIlIlIIlIlII[25]] = llIlllIIIllIIl("c1Ky8RJfeiY=", "KbQHZ");
        lIlIlIIIlllI[lIlIlIIlIlII[26]] = llIlllIIIllIIl("d9zXusfCoeU=", "kPEyR");
        lIlIlIIIlllI[lIlIlIIlIlII[27]] = llIlllIIIllIIl("DRRYBjOg9I0=", "VDfGT");
        lIlIlIIIlllI[lIlIlIIlIlII[28]] = llIlllIIIllIII("c2fwM6UECv0=", "zXvfz");
        lIlIlIIIlllI[lIlIlIIlIlII[29]] = llIlllIIIllIIl("b3l3B2usNfM=", "AHElX");
        lIlIlIIIlllI[lIlIlIIlIlII[30]] = llIlllIIIllIlI("DhsSJgk=", "LwsEb");
        lIlIlIIIlllI[lIlIlIIlIlII[31]] = llIlllIIIllIII("6/lNZJ7sd/c=", "iEvYF");
        lIlIlIIIlllI[lIlIlIIlIlII[32]] = llIlllIIIllIlI("BxkNDC0t", "FmymN");
        lIlIlIIIlllI[lIlIlIIlIlII[33]] = llIlllIIIllIII("NzwKO5e15hElRCtPzDXtww==", "FeeLY");
        lIlIlIIIlllI[lIlIlIIlIlII[34]] = llIlllIIIllIlI("FyQ/FTYuJA==", "ZEXpX");
        lIlIlIIIlllI[lIlIlIIlIlII[35]] = llIlllIIIllIIl("E8qr9gSODsQ=", "qSOmW");
        lIlIlIIIlllI[lIlIlIIlIlII[36]] = llIlllIIIllIII("fOQIY+OGXgM=", "Yakiy");
        lIlIlIIIlllI[lIlIlIIlIlII[37]] = llIlllIIIllIlI("PiAAHgUQ", "gElrj");
        lIlIlIIIlllI[lIlIlIIlIlII[38]] = llIlllIIIllIIl("ZvN+z7C1nyM=", "lQfSU");
        lIlIlIIIlllI[lIlIlIIlIlII[39]] = llIlllIIIllIIl("SAim6zbvcQY=", "tnMLW");
        lIlIlIIIlllI[lIlIlIIlIlII[40]] = llIlllIIIllIIl("IEpuJI0IVI4=", "EQUqp");
        lIlIlIIIlllI[lIlIlIIlIlII[41]] = llIlllIIIllIII("EYibJPuvJ3c=", "FxGRA");
        lIlIlIIIlllI[lIlIlIIlIlII[42]] = llIlllIIIllIlI("NQMVPg==", "vztPO");
        lIlIlIIIlllI[lIlIlIIlIlII[43]] = llIlllIIIllIII("sCic7FGQjTw=", "wUdnv");
        lIlIlIIIlllI[lIlIlIIlIlII[44]] = llIlllIIIllIII("Z9avPazSIV0=", "SPFtK");
        lIlIlIIIlllI[lIlIlIIlIlII[45]] = llIlllIIIllIII("k/ANpe4qiXb+LXcoCIcjJg==", "MSklc");
        lIlIlIIIlllI[lIlIlIIlIlII[46]] = llIlllIIIllIIl("Z0eR8cXucgl8/QDCqFFD0A==", "VoLwc");
        lIlIlIIIlllI[lIlIlIIlIlII[47]] = llIlllIIIllIlI("BBQlFhwiFDZTMzwQMA==", "NqRsp");
        lIlIlIIIlllI[lIlIlIIlIlII[48]] = llIlllIIIllIIl("czVo1XcN8hc8rcmQN41lsQ==", "hyHOe");
        lIlIlIIIlllI[lIlIlIIlIlII[18]] = llIlllIIIllIlI("EhwfAx4QAg==", "qnfpj");
        lIlIlIIIlllI[lIlIlIIlIlII[49]] = llIlllIIIllIII("qAjtlRik6hL8VlaQplNEal4LGWmewiIU", "BExaA");
        lIlIlIIIlllI[lIlIlIIlIlII[50]] = llIlllIIIllIlI("BgQFEx4gBBZWMT4AEA==", "Larvr");
        lIlIlIIIlllI[lIlIlIIlIlII[51]] = llIlllIIIllIIl("53loUN8InFZW/0fGqmp5pg==", "REfpH");
        lIlIlIIIlllI[lIlIlIIlIlII[52]] = llIlllIIIllIII("6BKi+bfb400=", "dNioY");
        lIlIlIIIlllI[lIlIlIIlIlII[53]] = llIlllIIIllIII("dz79GG0hfis=", "JIxQT");
        lIlIlIIIlllI[lIlIlIIlIlII[54]] = llIlllIIIllIIl("Ka/i0XC2jLpYeMGtg3RbDd7FIrY94vdf", "SWADH");
        lIlIlIIIlllI[lIlIlIIlIlII[55]] = llIlllIIIllIlI("Bx8QAxwtTQYFASsMHAkWMQ==", "Cmqds");
        lIlIlIIIlllI[lIlIlIIlIlII[56]] = llIlllIIIllIIl("8nXgZCYv+pA=", "NnPyw");
        lIlIlIIIlllI[lIlIlIIlIlII[57]] = llIlllIIIllIlI("CBsAKAI=", "MutMp");
        lIlIlIIIlllI[lIlIlIIlIlII[58]] = llIlllIIIllIII("RCG4U79TAN4W/dqbaC6riw==", "EhWPf");
        lIlIlIIIlllI[lIlIlIIlIlII[59]] = llIlllIIIllIlI("KBMfBAoOEwxBJRAXCg==", "bvhaf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean ev() {
        int i = lIlIlIIlIlII[2];
        while (llIlllIIlllIll(i, this.en.size())) {
            C0041p c0041p = this.en.get(i);
            if (llIlllIIlllIIl(c0041p)) {
                if (llIlllIIllIllI(c0041p.aP())) {
                    "".length();
                    if (((99 ^ 100) & ((158 ^ 153) ^ (-1))) < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (llIlllIIllllIl(this.cq.getTickCount() - c0041p.aQ(), lIlIlIIlIlII[18])) {
                    this.en.clear();
                    return lIlIlIIlIlII[1];
                }
            }
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    private boolean em() {
        int[] iArr = new int[lIlIlIIlIlII[1]];
        iArr[lIlIlIIlIlII[2]] = lIlIlIIlIlII[3];
        if (llIlllIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[55]]);
        });
        Item first2 = Equipment.getFirst(item2 -> {
            return item2.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[54]]);
        });
        if (!llIlllIIllIllI(first) || llIlllIIlllIIl(first2)) {
            return lIlIlIIlIlII[2];
        }
        if (llIlllIIllIlll(Inventory.isFull() ? 1 : 0)) {
            this.co.x();
            "".length();
            return lIlIlIIlIlII[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[52]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIlIlII[1]];
                strArr[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[53]];
                if (llIlllIIllIlll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlIlII[1];
                    "".length();
                    return (((75 ^ 92) ^ (240 ^ 133)) & (((245 ^ 154) ^ (188 ^ 177)) ^ (-" ".length()))) != 0 ? ((((26 + 17) - (-51)) + 91) ^ (((110 + 149) - 155) + 73)) & (((168 ^ 178) ^ (40 ^ 58)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIlIlII[2];
        });
        if (llIlllIIllIllI(nearest)) {
            return lIlIlIIlIlII[2];
        }
        nearest.interact(lIlIlIIIlllI[lIlIlIIlIlII[1]]);
        return lIlIlIIlIlII[1];
    }

    private WorldPoint a(WorldPoint worldPoint, NPC npc, List<WorldPoint> list) {
        return (WorldPoint) worldPoint.createWorldArea(lIlIlIIlIlII[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (llIlllIIllIlll(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llIlllIIlllIlI(worldPoint2.equals(worldPoint) ? 1 : 0) && llIlllIIlllIlI(list.contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = lIlIlIIlIlII[1];
                "".length();
                return ((64 ^ 24) & ((85 ^ 13) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlIIlIlII[2];
        }).min(Comparator.comparingDouble(obj -> {
            return worldPoint.distanceTo2DHypotenuse((WorldPoint) obj);
        }).thenComparingDouble(obj2 -> {
            return -npc.distanceTo((WorldPoint) obj2);
        })).orElse(null);
    }

    private int et() {
        return C0044s.bb().get(EquipmentInventorySlot.WEAPON);
    }

    private int er() {
        return C0044s.bc().get(EquipmentInventorySlot.CAPE);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIlllIIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private int eq() {
        return C0044s.bc().get(EquipmentInventorySlot.WEAPON);
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        if (llIlllIIllIllI(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[58]]);
        }))) {
            return null;
        }
        return List.of(Prayer.PROTECT_FROM_MELEE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean D(NPC npc) {
        if (llIlllIIllIllI(npc)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[6]]);
            return lIlIlIIlIlII[2];
        }
        int i = lIlIlIIlIlII[2];
        while (llIlllIIlllIll(i, this.en.size())) {
            C0041p c0041p = this.en.get(i);
            if (llIlllIIlllIIl(c0041p)) {
                if (llIlllIIllIllI(c0041p.aP())) {
                    "".length();
                    if (" ".length() <= 0) {
                        return ((86 ^ 33) ^ (39 ^ 17)) & (((((163 + 149) - 285) + 226) ^ (((1 + 185) - 121) + 123)) ^ (-" ".length()));
                    }
                } else if (!llIlllIIlllIlI(c0041p.aP().equals(npc) ? 1 : 0) || llIlllIIllIlll(npc.getWorldLocation().equals(c0041p.aP().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIIlIlII[1];
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((10 ^ 108) ^ (157 ^ 175)) & (((((94 + 47) - 87) + 190) ^ (((38 + 132) - 126) + 116)) ^ (-" ".length()));
            }
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    private List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        ArrayList arrayList = new ArrayList();
        if (llIlllIIllllll(worldPoint.getWorldX(), worldPoint2.getWorldX())) {
            int abs = Math.abs(worldPoint2.getWorldY() - worldPoint.getWorldY());
            if (llIlllIIllllIl(worldPoint2.getWorldY(), worldPoint.getWorldY())) {
                arrayList = new WorldArea(worldPoint, lIlIlIIlIlII[1], abs).toWorldPointList();
                "".length();
                if (" ".length() == "   ".length()) {
                    return null;
                }
            } else {
                arrayList = new WorldArea(worldPoint2, lIlIlIIlIlII[1], abs).toWorldPointList();
            }
        }
        if (llIlllIIllllll(worldPoint.getWorldY(), worldPoint2.getWorldY())) {
            int abs2 = Math.abs(worldPoint2.getWorldX() - worldPoint.getWorldX());
            if (llIlllIIllllIl(worldPoint2.getWorldX(), worldPoint.getWorldX())) {
                arrayList = new WorldArea(worldPoint, abs2, lIlIlIIlIlII[1]).toWorldPointList();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                arrayList = new WorldArea(worldPoint2, abs2, lIlIlIIlIlII[1]).toWorldPointList();
            }
        }
        arrayList.remove(worldPoint2);
        "".length();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlllIIlllIII(this.ak.bw, N.CRABS)) {
            ?? r0 = lIlIlIIlIlII[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIIlIlII[2];
    }

    private int eo() {
        return C0044s.ba().get(EquipmentInventorySlot.WEAPON);
    }

    private void ew() {
        WorldPoint c2 = H.CRABS_BASE_1.c(this.ak);
        WorldPoint c3 = H.CRABS_BASE_2.c(this.ak);
        WorldPoint c4 = H.CRABS_MOVABLE_1.c(this.ak);
        WorldPoint c5 = H.CRABS_MOVABLE_2.c(this.ak);
        WorldPoint c6 = H.CRABS_MOVABLE_3.c(this.ak);
        WorldPoint c7 = H.CRABS_MOVABLE_4.c(this.ak);
        if (llIlllIIlllIII(this.ak.bx, S.TEMPLATE_WEST)) {
            String str = lIlIlIIIlllI[lIlIlIIlIlII[24]];
            WorldPoint[] worldPointArr = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr[lIlIlIIlIlII[2]] = c2;
            worldPointArr[lIlIlIIlIlII[1]] = c3;
            worldPointArr[lIlIlIIlIlII[5]] = c4;
            if (llIlllIIlllIlI(a(str, worldPointArr) ? 1 : 0)) {
                return;
            }
            String str2 = lIlIlIIIlllI[lIlIlIIlIlII[25]];
            WorldPoint[] worldPointArr2 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr2[lIlIlIIlIlII[2]] = c2;
            worldPointArr2[lIlIlIIlIlII[1]] = c3;
            worldPointArr2[lIlIlIIlIlII[5]] = c5;
            if (llIlllIIlllIlI(a(str2, worldPointArr2) ? 1 : 0)) {
                return;
            }
            String str3 = lIlIlIIIlllI[lIlIlIIlIlII[26]];
            WorldPoint[] worldPointArr3 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr3[lIlIlIIlIlII[2]] = c2;
            worldPointArr3[lIlIlIIlIlII[1]] = c3;
            worldPointArr3[lIlIlIIlIlII[5]] = c6;
            if (llIlllIIlllIlI(a(str3, worldPointArr3) ? 1 : 0)) {
                return;
            }
            String str4 = lIlIlIIIlllI[lIlIlIIlIlII[27]];
            WorldPoint[] worldPointArr4 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr4[lIlIlIIlIlII[2]] = c2;
            worldPointArr4[lIlIlIIlIlII[1]] = c3;
            worldPointArr4[lIlIlIIlIlII[5]] = c7;
            if (llIlllIIlllIlI(a(str4, worldPointArr4) ? 1 : 0)) {
                return;
            }
        }
        if (llIlllIIlllIII(this.ak.bx, S.TEMPLATE_EAST)) {
            WorldPoint c8 = H.CRABS_SINGLE.c(this.ak);
            String str5 = lIlIlIIIlllI[lIlIlIIlIlII[28]];
            WorldPoint[] worldPointArr5 = new WorldPoint[lIlIlIIlIlII[1]];
            worldPointArr5[lIlIlIIlIlII[2]] = c8;
            if (llIlllIIlllIlI(a(str5, worldPointArr5) ? 1 : 0)) {
                if (llIlllIIllIlll(this.bS.isMoving() ? 1 : 0)) {
                    return;
                }
                WorldPoint[] worldPointArr6 = new WorldPoint[lIlIlIIlIlII[1]];
                worldPointArr6[lIlIlIIlIlII[2]] = c8;
                List<WorldPoint> a = a(worldPointArr6);
                if (llIlllIIlllIIl(NPCs.getNearest(npc -> {
                    if (llIlllIIllIlll(a.contains(npc.getWorldLocation()) ? 1 : 0) && llIlllIIlllIlI(npc.isMoving() ? 1 : 0) && llIlllIIlllIlI(npc.getWorldLocation().equals(c8) ? 1 : 0)) {
                        ?? r0 = lIlIlIIlIlII[1];
                        "".length();
                        return (10 ^ 14) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIIlIlII[2];
                }))) {
                    Movement.setDestination((WorldPoint) c8.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint -> {
                        return worldPoint.distanceToHypotenuse(c8);
                    })).orElse(null));
                    return;
                }
                return;
            }
            String str6 = lIlIlIIIlllI[lIlIlIIlIlII[29]];
            WorldPoint[] worldPointArr7 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr7[lIlIlIIlIlII[2]] = c2;
            worldPointArr7[lIlIlIIlIlII[1]] = c3;
            worldPointArr7[lIlIlIIlIlII[5]] = c4;
            if (llIlllIIlllIlI(a(str6, worldPointArr7) ? 1 : 0)) {
                return;
            }
            String str7 = lIlIlIIIlllI[lIlIlIIlIlII[30]];
            WorldPoint[] worldPointArr8 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArr8[lIlIlIIlIlII[2]] = c2;
            worldPointArr8[lIlIlIIlIlII[1]] = c3;
            worldPointArr8[lIlIlIIlIlII[5]] = c5;
            if (llIlllIIlllIlI(a(str7, worldPointArr8) ? 1 : 0)) {
                return;
            }
            WorldPoint c9 = H.CRABS_DOUBLE_1.c(this.ak);
            WorldPoint c10 = H.CRABS_DOUBLE_2.c(this.ak);
            String str8 = lIlIlIIIlllI[lIlIlIIlIlII[31]];
            WorldPoint[] worldPointArr9 = new WorldPoint[lIlIlIIlIlII[5]];
            worldPointArr9[lIlIlIIlIlII[2]] = c9;
            worldPointArr9[lIlIlIIlIlII[1]] = c10;
            if (llIlllIIlllIlI(a(str8, worldPointArr9) ? 1 : 0)) {
            }
        }
    }

    private static boolean llIlllIIllIlll(int i) {
        return i != 0;
    }

    private List<WorldPoint> a(WorldPoint... worldPointArr) {
        WorldPoint worldPoint;
        new ArrayList();
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[46]]);
        });
        if (llIlllIIllIllI(nearest)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[45]]);
            return null;
        }
        WorldPoint center = nearest.getWorldArea().getCenter();
        ArrayList arrayList = new ArrayList();
        WorldPoint worldPoint2 = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        int i = lIlIlIIlIlII[2];
        while (llIlllIIlllIll(i, worldPointArr.length)) {
            System.out.println("bounce: " + String.valueOf(worldPoint2) + " | crab: " + String.valueOf(worldPointArr[i]));
            if (llIlllIIlllIlI(i)) {
                worldPoint = center;
                "".length();
                if ((-"  ".length()) >= 0) {
                    return null;
                }
            } else {
                worldPoint = worldPoint2;
            }
            List<WorldPoint> c2 = c(worldPoint, worldPointArr[i]);
            arrayList.addAll(c2);
            "".length();
            worldPoint2 = c2.stream().max(Comparator.comparingDouble(worldPoint3 -> {
                return worldPoint3.distanceTo2DHypotenuse(center);
            })).get();
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return arrayList;
    }

    private static void llIlllIIllIlIl() {
        lIlIlIIlIlII = new int[61];
        lIlIlIIlIlII[0] = -" ".length();
        lIlIlIIlIlII[1] = " ".length();
        lIlIlIIlIlII[2] = (66 ^ 89) & ((37 ^ 62) ^ (-1));
        lIlIlIIlIlII[3] = (-30353) & 32699;
        lIlIlIIlIlII[4] = (13 ^ 115) ^ (121 ^ 2);
        lIlIlIIlIlII[5] = "  ".length();
        lIlIlIIlIlII[6] = "   ".length();
        lIlIlIIlIlII[7] = (((20 + 24) - 2) + 128) ^ (((111 + 149) - 244) + 158);
        lIlIlIIlIlII[8] = (((110 + 118) - 149) + 95) ^ (((18 + 100) - (-31)) + 19);
        lIlIlIIlIlII[9] = 73 ^ 78;
        lIlIlIIlIlII[10] = (255 ^ 166) ^ (239 ^ 190);
        lIlIlIIlIlII[11] = (((58 + 57) - (-26)) + 60) ^ (((172 + 104) - 111) + 27);
        lIlIlIIlIlII[12] = 149 ^ 159;
        lIlIlIIlIlII[13] = (((35 + 137) - 68) + 60) ^ (((169 + 144) - 176) + 38);
        lIlIlIIlIlII[14] = (((3 + 145) - 37) + 69) ^ (((154 + 91) - 211) + 150);
        lIlIlIIlIlII[15] = 203 ^ 198;
        lIlIlIIlIlII[16] = 39 ^ 41;
        lIlIlIIlIlII[17] = 80 ^ 95;
        lIlIlIIlIlII[18] = (148 ^ 166) ^ (156 ^ 131);
        lIlIlIIlIlII[19] = 143 ^ 159;
        lIlIlIIlIlII[20] = (((22 + 35) - 47) + 121) ^ (((81 + 130) - 127) + 62);
        lIlIlIIlIlII[21] = 53 ^ 39;
        lIlIlIIlIlII[22] = ((13 + 30) - 39) + 241;
        lIlIlIIlIlII[23] = 185 ^ 170;
        lIlIlIIlIlII[24] = 22 ^ 2;
        lIlIlIIlIlII[25] = (162 ^ 181) ^ "  ".length();
        lIlIlIIlIlII[26] = 64 ^ 86;
        lIlIlIIlIlII[27] = (211 ^ 169) ^ (89 ^ 52);
        lIlIlIIlIlII[28] = (165 ^ 160) ^ (124 ^ 97);
        lIlIlIIlIlII[29] = (((141 + 5) - 57) + 53) ^ (((137 + 121) - 186) + 79);
        lIlIlIIlIlII[30] = 77 ^ 87;
        lIlIlIIlIlII[31] = (((77 + 111) - 150) + 110) ^ (((123 + 125) - 138) + 33);
        lIlIlIIlIlII[32] = 126 ^ 98;
        lIlIlIIlIlII[33] = (122 ^ 85) ^ (32 ^ 18);
        lIlIlIIlIlII[34] = 19 ^ 13;
        lIlIlIIlIlII[35] = (((81 + 129) - 202) + 211) ^ (((69 + 96) - 87) + 118);
        lIlIlIIlIlII[36] = (88 ^ 98) ^ (65 ^ 91);
        lIlIlIIlIlII[37] = 180 ^ 149;
        lIlIlIIlIlII[38] = (87 ^ 56) ^ (22 ^ 91);
        lIlIlIIlIlII[39] = 160 ^ 131;
        lIlIlIIlIlII[40] = 98 ^ 70;
        lIlIlIIlIlII[41] = 7 ^ 34;
        lIlIlIIlIlII[42] = 148 ^ 178;
        lIlIlIIlIlII[43] = 32 ^ 7;
        lIlIlIIlIlII[44] = 238 ^ 198;
        lIlIlIIlIlII[45] = (84 ^ 82) ^ (14 ^ 33);
        lIlIlIIlIlII[46] = 112 ^ 90;
        lIlIlIIlIlII[47] = 148 ^ 191;
        lIlIlIIlIlII[48] = (129 ^ 136) ^ (51 ^ 22);
        lIlIlIIlIlII[49] = (244 ^ 145) ^ (250 ^ 177);
        lIlIlIIlIlII[50] = (((68 + 54) - 77) + 130) ^ (((72 + 100) - 160) + 116);
        lIlIlIIlIlII[51] = (34 ^ 94) ^ (212 ^ 152);
        lIlIlIIlIlII[52] = 89 ^ 104;
        lIlIlIIlIlII[53] = 29 ^ 47;
        lIlIlIIlIlII[54] = 107 ^ 88;
        lIlIlIIlIlII[55] = (82 ^ 108) ^ (114 ^ 120);
        lIlIlIIlIlII[56] = 79 ^ 122;
        lIlIlIIlIlII[57] = 50 ^ 4;
        lIlIlIIlIlII[58] = 132 ^ 179;
        lIlIlIIlIlII[59] = 82 ^ 106;
        lIlIlIIlIlII[60] = (237 ^ 144) ^ (48 ^ 116);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    private boolean a(String str, NPC npc) {
        if (llIlllIIllIllI(npc)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[33]]);
            return lIlIlIIlIlII[2];
        }
        int i = lIlIlIIlIlII[0];
        switch (str.hashCode()) {
            case -1801391991:
                if (llIlllIIllIlll(str.equals(lIlIlIIIlllI[lIlIlIIlIlII[34]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[2];
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return ((68 ^ 44) ^ (22 ^ 44)) & (((((61 + 186) - 107) + 100) ^ (((111 + 158) - 200) + 93)) ^ (-" ".length()));
                    }
                }
                break;
            case -1650372460:
                if (llIlllIIllIlll(str.equals(lIlIlIIIlllI[lIlIlIIlIlII[37]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[6];
                    break;
                }
                break;
            case 2115395:
                if (llIlllIIllIlll(str.equals(lIlIlIIIlllI[lIlIlIIlIlII[35]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[1];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((((91 + 131) - 188) + 192) ^ (((28 + 30) - (-58)) + 72)) & (((91 ^ 65) ^ (86 ^ 18)) ^ (-" ".length()));
                    }
                }
                break;
            case 64266207:
                if (llIlllIIllIlll(str.equals(lIlIlIIIlllI[lIlIlIIlIlII[36]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[5];
                    "".length();
                    if (((142 ^ 167) ^ (137 ^ 164)) <= " ".length()) {
                        return ((151 ^ 189) ^ (77 ^ 93)) & (((54 ^ 118) ^ (243 ^ 137)) ^ (-" ".length()));
                    }
                }
                break;
        }
        switch (i) {
            case 0:
                if (llIlllIIlllIlI(npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[38]]) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlIlII[1];
                    "".length();
                    return "   ".length() <= 0 ? (" ".length() ^ (65 ^ 2)) & (((((7 + 80) - (-64)) + 82) ^ (((129 + 150) - 191) + 83)) ^ (-" ".length())) : r0;
                }
                return lIlIlIIlIlII[2];
            case 1:
                if (llIlllIIlllIlI(npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[39]]) ? 1 : 0)) {
                    ?? r02 = lIlIlIIlIlII[1];
                    "".length();
                    return 0 != 0 ? ((129 ^ 197) ^ (152 ^ 131)) & (((((149 + 148) - 271) + 190) ^ (((106 + 41) - 83) + 71)) ^ (-" ".length())) : r02;
                }
                return lIlIlIIlIlII[2];
            case 2:
                return lIlIlIIlIlII[2];
            case 3:
                if (llIlllIIlllIlI(npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[40]]) ? 1 : 0)) {
                    ?? r03 = lIlIlIIlIlII[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
                return lIlIlIIlIlII[2];
            default:
                System.out.println("couldnt find color: " + str);
                return lIlIlIIlIlII[2];
        }
    }

    private static boolean llIlllIIlllllI(int i, int i2) {
        return i >= i2;
    }

    private static String llIlllIIIllIlI(String lllllllllllllllIllIlIIlIIIIlIIIl, String lllllllllllllllIllIlIIlIIIIlIIII) {
        String lllllllllllllllIllIlIIlIIIIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIlIIIIIllll = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIIlIIIIlIIII.toCharArray();
        int lllllllllllllllIllIlIIlIIIIIllIl = lIlIlIIlIlII[2];
        char[] charArray2 = lllllllllllllllIllIlIIlIIIIlIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIIlIlII[2];
        while (llIlllIIlllIll(i, length)) {
            lllllllllllllllIllIlIIlIIIIIllll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIlIIlIIIIIllIl % charArray.length]));
            "".length();
            lllllllllllllllIllIlIIlIIIIIllIl++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIIlIIIIIllll);
    }

    private static boolean llIlllIIlllIIl(Object obj) {
        return obj != null;
    }

    private static String llIlllIIIllIII(String lllllllllllllllIllIlIIlIIIlIlllI, String lllllllllllllllIllIlIIlIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIlIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIlIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIlIIIllIIII.init(lIlIlIIlIlII[5], lllllllllllllllIllIlIIlIIIllIIIl);
            return new String(lllllllllllllllIllIlIIlIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIlIIIlIllll) {
            lllllllllllllllIllIlIIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(GraphicChanged graphicChanged) {
        Actor actor = graphicChanged.getActor();
        if (llIlllIIllIlll(actor.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[21]]) ? 1 : 0) && llIlllIIllllll(actor.getGraphic(), lIlIlIIlIlII[22])) {
            F((NPC) actor);
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[23]]);
        }
    }

    private void E(NPC npc) {
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[49]]);
        });
        if (llIlllIIlllIIl(first)) {
            first.interact(lIlIlIIIlllI[lIlIlIIlIlII[7]]);
        }
        npc.interact(lIlIlIIIlllI[lIlIlIIlIlII[4]]);
    }

    private static int llIlllIIllllII(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private void n(String lllllllllllllllIllIlIIlIIllllIII) {
        int i = lIlIlIIlIlII[0];
        switch (lllllllllllllllIllIlIIlIIllllIII.hashCode()) {
            case -1801391991:
                if (llIlllIIllIlll(lllllllllllllllIllIlIIlIIllllIII.equals(lIlIlIIIlllI[lIlIlIIlIlII[41]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[2];
                    "".length();
                    if (" ".length() < (-" ".length())) {
                        return;
                    }
                }
                break;
            case -1650372460:
                if (llIlllIIllIlll(lllllllllllllllIllIlIIlIIllllIII.equals(lIlIlIIIlllI[lIlIlIIlIlII[44]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[6];
                    break;
                }
                break;
            case 2115395:
                if (llIlllIIllIlll(lllllllllllllllIllIlIIlIIllllIII.equals(lIlIlIIIlllI[lIlIlIIlIlII[42]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[1];
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                break;
            case 64266207:
                if (llIlllIIllIlll(lllllllllllllllIllIlIIlIIllllIII.equals(lIlIlIIIlllI[lIlIlIIlIlII[43]]) ? 1 : 0)) {
                    i = lIlIlIIlIlII[5];
                    "".length();
                    if ((-"  ".length()) >= 0) {
                        return;
                    }
                }
                break;
        }
        switch (i) {
            case 0:
                es();
                return;
            case 1:
                eu();
                return;
            case 2:
                return;
            case 3:
                ep();
                return;
            default:
                return;
        }
    }

    private static boolean llIlllIIllllIl(int i, int i2) {
        return i > i2;
    }

    private static String llIlllIIIllIIl(String lllllllllllllllIllIlIIlIIIlIIIIl, String lllllllllllllllIllIlIIlIIIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIlIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlII[10]), "DES");
            Cipher lllllllllllllllIllIlIIlIIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIlIIIlIIIll.init(lIlIlIIlIlII[5], lllllllllllllllIllIlIIlIIIlIIlII);
            return new String(lllllllllllllllIllIlIIlIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIIlIIIlIIIlI) {
            lllllllllllllllIllIlIIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private void ep() {
        int lllllllllllllllIllIlIIlIllIlIlIl = eo();
        int[] iArr = new int[lIlIlIIlIlII[1]];
        iArr[lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIlIlIl;
        if (llIlllIIllIlll(Equipment.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIlIlIIlIlII[1]];
        iArr2[lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIlIlIl;
        Item first = Inventory.getFirst(iArr2);
        if (llIlllIIllIllI(first)) {
            return;
        }
        String[] strArr = new String[lIlIlIIlIlII[5]];
        strArr[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[8]];
        strArr[lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[9]];
        first.interact(strArr);
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlllIIllIlll(tileObject.getName().equals(lIlIlIIIlllI[lIlIlIIlIlII[56]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIlIlII[1]];
                strArr[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[57]];
                if (llIlllIIllIlll(tileObject.hasAction(strArr) ? 1 : 0) && llIlllIIllIlll(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlIlII[1];
                    "".length();
                    return "   ".length() != "   ".length() ? ("   ".length() ^ (69 ^ 103)) & (((((38 + 33) - 42) + 132) ^ (((24 + 127) - 116) + 93)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIlIlII[2];
        });
    }

    private void a(WorldPoint worldPoint, boolean z, WorldPoint... worldPointArr) {
        System.out.println(Arrays.toString(worldPointArr));
        List<WorldPoint> a = a(worldPointArr);
        NPC nearest = NPCs.getNearest(worldPoint, npc -> {
            if (llIlllIIllIlll(npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[50]]) ? 1 : 0) && llIlllIIlllIIl(npc.getInteracting()) && llIlllIIllIlll(npc.getInteracting().equals(this.bS) ? 1 : 0) && llIlllIIlllIlI(D(npc) ? 1 : 0)) {
                ?? r0 = lIlIlIIlIlII[1];
                "".length();
                return 0 != 0 ? ((((66 + 74) - 5) + 23) ^ (((47 + 26) - (-22)) + 36)) & (((91 ^ 39) ^ (217 ^ 184)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIlIlII[2];
        });
        if (llIlllIIllIllI(nearest)) {
            en();
            return;
        }
        WorldPoint a2 = a(worldPoint, nearest, a);
        if (llIlllIIllIlll(z ? 1 : 0) && llIlllIIllIlll(nearest.getWorldLocation().equals(worldPoint) ? 1 : 0) && llIlllIIlllIlI(llIlllIIllllII(this.bS.getWorldLocation().distanceTo2DHypotenuse(worldPoint), 1.0f))) {
            E(nearest);
        } else if (llIlllIIllIlll(nearest.isMoving() ? 1 : 0) && llIlllIIlllIll(nearest.distanceTo(this.bS), lIlIlIIlIlII[6])) {
        } else {
            Movement.setDestination(a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIlllIIllIllI(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[59]]);
        }))) {
            return cS();
        }
        if (llIlllIIllIlll(em() ? 1 : 0)) {
            return lIlIlIIlIlII[1];
        }
        ev();
        "".length();
        ew();
        return lIlIlIIlIlII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    private void es() {
        int er = er();
        int[] iArr = new int[lIlIlIIlIlII[1]];
        iArr[lIlIlIIlIlII[2]] = er;
        if (llIlllIIlllIlI(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIIlIlII[1]];
            iArr2[lIlIlIIlIlII[2]] = er;
            Item first = Inventory.getFirst(iArr2);
            if (llIlllIIlllIIl(first)) {
                String[] strArr = new String[lIlIlIIlIlII[6]];
                strArr[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[10]];
                strArr[lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[11]];
                strArr[lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[12]];
                first.interact(strArr);
            }
        }
        int eq = eq();
        int[] iArr3 = new int[lIlIlIIlIlII[1]];
        iArr3[lIlIlIIlIlII[2]] = eq;
        if (llIlllIIllIlll(Equipment.contains(iArr3) ? 1 : 0)) {
            return;
        }
        int[] iArr4 = new int[lIlIlIIlIlII[1]];
        iArr4[lIlIlIIlIlII[2]] = eq;
        Item first2 = Inventory.getFirst(iArr4);
        if (llIlllIIllIllI(first2)) {
            return;
        }
        boolean isTwoHanded = Static.getItemManager().getItemStats(eq, (boolean) lIlIlIIlIlII[2]).getEquipment().isTwoHanded();
        if (llIlllIIllIlll(Inventory.isFull() ? 1 : 0) && llIlllIIllIlll(isTwoHanded ? 1 : 0)) {
            this.co.x();
            "".length();
            return;
        }
        String[] strArr2 = new String[lIlIlIIlIlII[5]];
        strArr2[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[13]];
        strArr2[lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[14]];
        first2.interact(strArr2);
    }

    private void eu() {
        int et = et();
        int[] iArr = new int[lIlIlIIlIlII[1]];
        iArr[lIlIlIIlIlII[2]] = et;
        if (llIlllIIllIlll(Equipment.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIlIlIIlIlII[1]];
        iArr2[lIlIlIIlIlII[2]] = et;
        Item first = Inventory.getFirst(iArr2);
        if (llIlllIIllIllI(first)) {
            return;
        }
        String[] strArr = new String[lIlIlIIlIlII[6]];
        strArr[lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[15]];
        strArr[lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[16]];
        strArr[lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[17]];
        first.interact(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    private boolean a(String str, WorldPoint... worldPointArr) {
        NPC npc;
        if (llIlllIIllIllI(TileObjects.getNearest(tileObject -> {
            if (llIlllIIllIlll(tileObject.getName().contains(str) ? 1 : 0) && llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[18]]) ? 1 : 0)) {
                ?? r0 = lIlIlIIlIlII[1];
                "".length();
                return (-" ".length()) != (-" ".length()) ? ((((113 + 59) - 163) + 205) ^ (((142 + 145) - 192) + 53)) & (((((142 + 112) - 244) + 210) ^ (((4 + 14) - (-44)) + 96)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIlIlII[2];
        }))) {
            return lIlIlIIlIlII[1];
        }
        WorldPoint worldPoint = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        if (llIlllIIlllIlI(worldPointArr.length)) {
            return lIlIlIIlIlII[2];
        }
        int i = lIlIlIIlIlII[2];
        do {
            if (llIlllIIlllIll(i, worldPointArr.length)) {
                worldPoint = worldPointArr[i];
                List all = NPCs.getAll(npc2 -> {
                    if (llIlllIIllIlll(npc2.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[48]]) ? 1 : 0) && llIlllIIllIlll(npc2.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                        ?? r0 = lIlIlIIlIlII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIIlIlII[2];
                });
                if (llIlllIIllllIl(all.size(), lIlIlIIlIlII[1])) {
                    Movement.setDestination((WorldPoint) worldPoint.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> {
                        return worldPoint2.distanceToHypotenuse(worldPoint);
                    })).orElse(null));
                    return lIlIlIIlIlII[2];
                }
                if (llIlllIIllIlll(all.isEmpty() ? 1 : 0)) {
                    npc = null;
                    "".length();
                    if ((-" ".length()) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    npc = (NPC) all.get(lIlIlIIlIlII[2]);
                }
                NPC npc3 = npc;
                if (llIlllIIllllll(i, worldPointArr.length - lIlIlIIlIlII[1])) {
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return ((((19 + 108) - 106) + 150) ^ (((71 + 121) - 113) + 88)) & (((((157 + 128) - 93) + 8) ^ (((18 + 92) - (-20)) + 66)) ^ (-" ".length()));
                    }
                } else if (llIlllIIlllIlI(D(npc3) ? 1 : 0)) {
                    a(worldPoint, (boolean) lIlIlIIlIlII[1], (WorldPoint[]) Arrays.copyOfRange(worldPointArr, lIlIlIIlIlII[2], i + lIlIlIIlIlII[1]));
                    return lIlIlIIlIlII[2];
                } else {
                    i++;
                    "".length();
                }
            }
            WorldPoint worldPoint3 = worldPoint;
            NPC nearest = NPCs.getNearest(npc4 -> {
                if (llIlllIIllIlll(npc4.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[47]]) ? 1 : 0) && llIlllIIllIlll(npc4.getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    ?? r0 = lIlIlIIlIlII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlIIlIlII[2];
            });
            if (!llIlllIIllIlll(a(str, nearest) ? 1 : 0)) {
                a(worldPoint, (boolean) lIlIlIIlIlII[2], worldPointArr);
                return lIlIlIIlIlII[2];
            }
            n(str);
            nearest.interact(lIlIlIIIlllI[lIlIlIIlIlII[32]]);
            sleep(lIlIlIIlIlII[1]);
            return lIlIlIIlIlII[2];
        } while ((-" ".length()) < "  ".length());
        return (true ^ true) & ((true ^ true) ^ true);
    }

    private void F(NPC npc) {
        int i = lIlIlIIlIlII[2];
        do {
            if (llIlllIIlllIll(i, this.en.size())) {
                NPC aP = this.en.get(i).aP();
                if (llIlllIIlllIIl(aP) && llIlllIIlllIII(aP, npc)) {
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            if (!llIlllIIlllllI(i, this.en.size())) {
                this.en.get(i).q(this.cq.getTickCount());
                System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[20]]);
                return;
            }
            this.en.add(new C0041p(npc, this.cq.getTickCount()));
            "".length();
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[19]]);
            return;
        } while ((-(101 ^ 96)) < 0);
    }

    private static boolean llIlllIIlllIll(int i, int i2) {
        return i < i2;
    }
}
