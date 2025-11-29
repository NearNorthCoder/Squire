/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.H;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.S;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.p;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
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

@TaskDesc(name="Crabs", priority=10000, blocking=true, register=true)
public class bi
extends U {
    private /* synthetic */ n al;
    private /* synthetic */ int am;
    private /* synthetic */ n ak;
    private /* synthetic */ int dB;
    private static /* synthetic */ String[] lIlIlIIIlllI;
    /* synthetic */ List<p> en;
    private static /* synthetic */ int[] lIlIlIIlIlII;

    static {
        bi.llIlllIIllIlIl();
        bi.llIlllIIllIlII();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bi lllllllllllllllIllIlIIllIIIIIIIl;
        if (bi.llIlllIIllIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bi.llIlllIIlllIIl(Movement.getDestination()) && bi.llIlllIIllIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIIlIlII[2];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlIIllIIIIIIIl.al.bs);
            return lIlIlIIlIlII[1];
        }
        TileObject lllllllllllllllIllIlIIllIIIIIIII = lllllllllllllllIllIlIIllIIIIIIIl.cR();
        if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIllIIIIIIII)) {
            return lIlIlIIlIlII[2];
        }
        if (!bi.llIlllIIlllIlI(lllllllllllllllIllIlIIllIIIIIIIl.bS.isMoving() ? 1 : 0) || bi.llIlllIIllIlll(lllllllllllllllIllIlIIllIIIIIIIl.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        var1_1.interact(lIlIlIIIlllI[lIlIlIIlIlII[2]]);
        return lIlIlIIlIlII[1];
    }

    private void en() {
        bi lllllllllllllllIllIlIIlIllllIlIl;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[51]]) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                "".length();
                if (" ".length() < 0) {
                    return ((113 + 83 - 7 + 58 ^ 93 + 64 - 80 + 89) & (0x44 ^ 0x49 ^ (0x2F ^ 0x73) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        this.ep();
        if (bi.llIlllIIlllIIl(nPC2.getInteracting())) {
            return;
        }
        if (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIllllIlIl.cq.getTickCount() - lllllllllllllllIllIlIIlIllllIlIl.dB, lIlIlIIlIlII[4])) {
            return;
        }
        nPC2.interact(lIlIlIIIlllI[lIlIlIIlIlII[5]]);
        this.dB = this.cq.getTickCount();
    }

    @Inject
    protected bi(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIIlIlII[0];
        this.en = new ArrayList<p>();
        this.dB = lIlIlIIlIlII[0];
    }

    private static boolean llIlllIIlllIlI(int n2) {
        return n2 == 0;
    }

    private static void llIlllIIllIlII() {
        lIlIlIIIlllI = new String[lIlIlIIlIlII[60]];
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[2]] = bi.llIlllIIIllIII("jvhLHGb+o7k=", "xhAjs");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[1]] = bi.llIlllIIIllIII("R9QZpv3FVQw=", "oFhNo");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[5]] = bi.llIlllIIIllIII("JKdhEIPAXYI=", "yigTg");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[6]] = bi.llIlllIIIllIII("nsdQGsa/i9YAoJwhUe0qzCsYUU1LXo3gwDPp/85M1yW5NOr9xjGClORzSlEQC2Fs", "gBwxS");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[7]] = bi.llIlllIIIllIII("KMlATokpsEc=", "ZlLDh");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[4]] = bi.llIlllIIIllIII("9mFqFEeo34M=", "uRWXV");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[8]] = bi.llIlllIIIllIIl("32NFwwaAqTc=", "facuL");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[9]] = bi.llIlllIIIllIlI("PwIeHAc=", "zskuw");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[10]] = bi.llIlllIIIllIlI("OAcUBQw=", "onqih");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[11]] = bi.llIlllIIIllIIl("uY8/Kg4/7xA=", "TvmmK");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[12]] = bi.llIlllIIIllIlI("OxMkOA==", "lvEJv");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[13]] = bi.llIlllIIIllIIl("TlTkmwcuTWA=", "BIrCW");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[14]] = bi.llIlllIIIllIII("RyaKHO9oKa4=", "zQRCZ");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[15]] = bi.llIlllIIIllIIl("PvqAfncRUWQ=", "SBqzO");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[16]] = bi.llIlllIIIllIlI("NCsAMzY=", "qZuZF");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[17]] = bi.llIlllIIIllIII("acAtu8Hka7A=", "Emdiw");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[19]] = bi.llIlllIIIllIII("zWWfVCcGvvkCWxjnLVa960dfU+hJvlnn", "tsdDt");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[20]] = bi.llIlllIIIllIIl("K4Q7I1kOUiaQa+KXgHQpFXubij3XpGJF", "dEfUf");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[21]] = bi.llIlllIIIllIIl("WGhyDfWQi2w3ctP0XX9aAw==", "MXpSh");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[23]] = bi.llIlllIIIllIII("OBmLQxw0ZvRCH4uwlAMMA6FWg14RE+O0", "EWzVT");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[24]] = bi.llIlllIIIllIII("Iiy3MK24e8Y=", "uoNuh");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[25]] = bi.llIlllIIIllIIl("c1Ky8RJfeiY=", "KbQHZ");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[26]] = bi.llIlllIIIllIIl("d9zXusfCoeU=", "kPEyR");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[27]] = bi.llIlllIIIllIIl("DRRYBjOg9I0=", "VDfGT");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[28]] = bi.llIlllIIIllIII("c2fwM6UECv0=", "zXvfz");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[29]] = bi.llIlllIIIllIIl("b3l3B2usNfM=", "AHElX");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[30]] = bi.llIlllIIIllIlI("DhsSJgk=", "LwsEb");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[31]] = bi.llIlllIIIllIII("6/lNZJ7sd/c=", "iEvYF");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[32]] = bi.llIlllIIIllIlI("BxkNDC0t", "FmymN");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[33]] = bi.llIlllIIIllIII("NzwKO5e15hElRCtPzDXtww==", "FeeLY");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[34]] = bi.llIlllIIIllIlI("FyQ/FTYuJA==", "ZEXpX");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[35]] = bi.llIlllIIIllIIl("E8qr9gSODsQ=", "qSOmW");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[36]] = bi.llIlllIIIllIII("fOQIY+OGXgM=", "Yakiy");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[37]] = bi.llIlllIIIllIlI("PiAAHgUQ", "gElrj");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[38]] = bi.llIlllIIIllIIl("ZvN+z7C1nyM=", "lQfSU");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[39]] = bi.llIlllIIIllIIl("SAim6zbvcQY=", "tnMLW");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[40]] = bi.llIlllIIIllIIl("IEpuJI0IVI4=", "EQUqp");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[41]] = bi.llIlllIIIllIII("EYibJPuvJ3c=", "FxGRA");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[42]] = bi.llIlllIIIllIlI("NQMVPg==", "vztPO");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[43]] = bi.llIlllIIIllIII("sCic7FGQjTw=", "wUdnv");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[44]] = bi.llIlllIIIllIII("Z9avPazSIV0=", "SPFtK");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[45]] = bi.llIlllIIIllIII("k/ANpe4qiXb+LXcoCIcjJg==", "MSklc");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[46]] = bi.llIlllIIIllIIl("Z0eR8cXucgl8/QDCqFFD0A==", "VoLwc");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[47]] = bi.llIlllIIIllIlI("BBQlFhwiFDZTMzwQMA==", "NqRsp");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[48]] = bi.llIlllIIIllIIl("czVo1XcN8hc8rcmQN41lsQ==", "hyHOe");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[18]] = bi.llIlllIIIllIlI("EhwfAx4QAg==", "qnfpj");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[49]] = bi.llIlllIIIllIII("qAjtlRik6hL8VlaQplNEal4LGWmewiIU", "BExaA");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[50]] = bi.llIlllIIIllIlI("BgQFEx4gBBZWMT4AEA==", "Larvr");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[51]] = bi.llIlllIIIllIIl("53loUN8InFZW/0fGqmp5pg==", "REfpH");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[52]] = bi.llIlllIIIllIII("6BKi+bfb400=", "dNioY");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[53]] = bi.llIlllIIIllIII("dz79GG0hfis=", "JIxQT");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[54]] = bi.llIlllIIIllIIl("Ka/i0XC2jLpYeMGtg3RbDd7FIrY94vdf", "SWADH");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[55]] = bi.llIlllIIIllIlI("Bx8QAxwtTQYFASsMHAkWMQ==", "Cmqds");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[56]] = bi.llIlllIIIllIIl("8nXgZCYv+pA=", "NnPyw");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[57]] = bi.llIlllIIIllIlI("CBsAKAI=", "MutMp");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[58]] = bi.llIlllIIIllIII("RCG4U79TAN4W/dqbaC6riw==", "EhWPf");
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[59]] = bi.llIlllIIIllIlI("KBMfBAoOEwxBJRAXCg==", "bvhaf");
    }

    private boolean ev() {
        bi lllllllllllllllIllIlIIlIlIllllll;
        int lllllllllllllllIllIlIIlIlIlllllI = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIlIlllllI, lllllllllllllllIllIlIIlIlIllllll.en.size())) {
            p lllllllllllllllIllIlIIlIlIllllIl = lllllllllllllllIllIlIIlIlIllllll.en.get(lllllllllllllllIllIlIIlIlIlllllI);
            if (bi.llIlllIIlllIIl(lllllllllllllllIllIlIIlIlIllllIl)) {
                if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIlIllllIl.aP())) {
                    "".length();
                    if (((0x63 ^ 0x64) & ~(0x9E ^ 0x99)) < 0) {
                        return ((0x81 ^ 0x8C) & ~(0x59 ^ 0x54)) != 0;
                    }
                } else {
                    int lllllllllllllllIllIlIIlIlIllllII = lllllllllllllllIllIlIIlIlIllllll.cq.getTickCount() - lllllllllllllllIllIlIIlIlIllllIl.aQ();
                    if (bi.llIlllIIllllIl(lllllllllllllllIllIlIIlIlIllllII, lIlIlIIlIlII[18])) {
                        lllllllllllllllIllIlIIlIlIllllll.en.clear();
                        return lIlIlIIlIlII[1];
                    }
                }
            }
            ++lllllllllllllllIllIlIIlIlIlllllI;
            "".length();
            if ("  ".length() > " ".length()) continue;
            return ((0x60 ^ 0x59) & ~(0x57 ^ 0x6E)) != 0;
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean em() {
        void var3_3;
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = lIlIlIIlIlII[3];
        if (bi.llIlllIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        Item lllllllllllllllIllIlIIlIlllllIlI = Inventory.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[55]]));
        Item lllllllllllllllIllIlIIlIlllllIIl = Equipment.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[54]]));
        if (!bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIlllllIlI) || bi.llIlllIIlllIIl(lllllllllllllllIllIlIIlIlllllIIl)) {
            return lIlIlIIlIlII[2];
        }
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0)) {
            bi lllllllllllllllIllIlIIlIlllllIll;
            lllllllllllllllIllIlIIlIlllllIll.co.x();
            "".length();
            return lIlIlIIlIlII[1];
        }
        TileObject lllllllllllllllIllIlIIlIlllllIII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[52]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIlII[1]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[53]];
                if (bi.llIlllIIllIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];
                    "".length();
                    if (((0x4B ^ 0x5C ^ (0xF0 ^ 0x85)) & (0xF5 ^ 0x9A ^ (0xBC ^ 0xB1) ^ -" ".length())) == 0) return n2 != 0;
                    return ((26 + 17 - -51 + 91 ^ 110 + 149 - 155 + 73) & (0xA8 ^ 0xB2 ^ (0x28 ^ 0x3A) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIlIIlIlII[2];
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIlllllIII)) {
            return lIlIlIIlIlII[2];
        }
        var3_3.interact(lIlIlIIIlllI[lIlIlIIlIlII[1]]);
        return lIlIlIIlIlII[1];
    }

    private WorldPoint a(WorldPoint worldPoint, NPC nPC, List<WorldPoint> list) {
        List list2 = worldPoint.createWorldArea(lIlIlIIlIlII[1]).toWorldPointList();
        WorldPoint worldPoint3 = list2.stream().filter(worldPoint2 -> {
            int n2;
            if (bi.llIlllIIllIlll(Reachable.isWalkable((WorldPoint)worldPoint2) ? 1 : 0) && bi.llIlllIIlllIlI(worldPoint2.equals((Object)worldPoint) ? 1 : 0) && bi.llIlllIIlllIlI(list.contains(worldPoint2) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                "".length();
                if (((0x40 ^ 0x18) & ~(0x55 ^ 0xD)) < -" ".length()) {
                    return ((0xA6 ^ 0x9F) & ~(0x52 ^ 0x6B)) != 0;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        }).min(Comparator.comparingDouble(object -> worldPoint.distanceTo2DHypotenuse((WorldPoint)object)).thenComparingDouble(object -> -nPC.distanceTo((WorldPoint)object))).orElse(null);
        return worldPoint3;
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[47]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = lIlIlIIlIlII[1];
            "".length();
            if (null != null) {
                return ((0xC2 ^ 0x8A) & ~(0x7B ^ 0x33)) != 0;
            }
        } else {
            n2 = lIlIlIIlIlII[2];
        }
        return n2 != 0;
    }

    private int et() {
        EquipmentSetup equipmentSetup = s.bb();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    private int er() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.CAPE);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIlllIIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private int eq() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    @Override
    public List<Prayer> ci() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[58]]));
        if (bi.llIlllIIllIllI(nPC2)) {
            return null;
        }
        return List.of(Prayer.PROTECT_FROM_MELEE);
    }

    /*
     * WARNING - void declaration
     */
    private boolean D(NPC nPC) {
        bi lllllllllllllllIllIlIIlIlllIllll;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[6]]);
            return lIlIlIIlIlII[2];
        }
        int lllllllllllllllIllIlIIlIlllIllIl = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIlllIllIl, lllllllllllllllIllIlIIlIlllIllll.en.size())) {
            p lllllllllllllllIllIlIIlIlllIllII = lllllllllllllllIllIlIIlIlllIllll.en.get(lllllllllllllllIllIlIIlIlllIllIl);
            if (bi.llIlllIIlllIIl(lllllllllllllllIllIlIIlIlllIllII)) {
                void lllllllllllllllIllIlIIlIlllIlllI;
                if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIlllIllII.aP())) {
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0x56 ^ 0x21 ^ (0x27 ^ 0x11)) & (163 + 149 - 285 + 226 ^ 1 + 185 - 121 + 123 ^ -" ".length())) != 0;
                    }
                } else if (!bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlllIllII.aP().equals(lllllllllllllllIllIlIIlIlllIlllI) ? 1 : 0) || bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIlllIlllI.getWorldLocation().equals((Object)lllllllllllllllIllIlIIlIlllIllII.aP().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIIlIlII[1];
                }
            }
            ++lllllllllllllllIllIlIIlIlllIllIl;
            "".length();
            if (null == null) continue;
            return ((0xA ^ 0x6C ^ (0x9D ^ 0xAF)) & (94 + 47 - 87 + 190 ^ 38 + 132 - 126 + 116 ^ -" ".length())) != 0;
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void lllllllllllllllIllIlIIlIIlIlllll;
        List lllllllllllllllIllIlIIlIIlIlllIl;
        int lllllllllllllllIllIlIIlIIlIlllII;
        void lllllllllllllllIllIlIIlIIlIllllI;
        List<Object> list = new ArrayList<WorldPoint>();
        if (bi.llIlllIIllllll(worldPoint.getWorldX(), worldPoint2.getWorldX())) {
            int n2 = Math.abs(worldPoint2.getWorldY() - worldPoint.getWorldY());
            if (bi.llIlllIIllllIl(worldPoint2.getWorldY(), worldPoint.getWorldY())) {
                list = new WorldArea(worldPoint, lIlIlIIlIlII[1], n2).toWorldPointList();
                "".length();
                if (" ".length() == "   ".length()) {
                    return null;
                }
            } else {
                lllllllllllllllIllIlIIlIIlIlllIl = new WorldArea((WorldPoint)lllllllllllllllIllIlIIlIIlIllllI, lIlIlIIlIlII[1], lllllllllllllllIllIlIIlIIlIlllII).toWorldPointList();
            }
        }
        if (bi.llIlllIIllllll(lllllllllllllllIllIlIIlIIlIlllll.getWorldY(), lllllllllllllllIllIlIIlIIlIllllI.getWorldY())) {
            lllllllllllllllIllIlIIlIIlIlllII = Math.abs(lllllllllllllllIllIlIIlIIlIllllI.getWorldX() - lllllllllllllllIllIlIIlIIlIlllll.getWorldX());
            if (bi.llIlllIIllllIl(lllllllllllllllIllIlIIlIIlIllllI.getWorldX(), lllllllllllllllIllIlIIlIIlIlllll.getWorldX())) {
                lllllllllllllllIllIlIIlIIlIlllIl = new WorldArea((WorldPoint)lllllllllllllllIllIlIIlIIlIlllll, lllllllllllllllIllIlIIlIIlIlllII, lIlIlIIlIlII[1]).toWorldPointList();
                "".length();
                if (null != null) {
                    return null;
                }
            } else {
                list = new WorldArea((WorldPoint)lllllllllllllllIllIlIIlIIlIllllI, lllllllllllllllIllIlIIlIIlIlllII, lIlIlIIlIlII[1]).toWorldPointList();
            }
        }
        list.remove(worldPoint2);
        "".length();
        return list;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bi.llIlllIIlllIII((Object)this.ak.bw, (Object)N.CRABS)) {
            bl2 = lIlIlIIlIlII[1];
            "".length();
            if ((0x32 ^ 0x36) != (0x8E ^ 0x8A)) {
                return ((0xE4 ^ 0xBC) & ~(0x7C ^ 0x24)) != 0;
            }
        } else {
            bl2 = lIlIlIIlIlII[2];
        }
        return bl2;
    }

    private int eo() {
        EquipmentSetup equipmentSetup = s.ba();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    /*
     * WARNING - void declaration
     */
    private void ew() {
        bi lllllllllllllllIllIlIIlIlIlIIIlI;
        void lllllllllllllllIllIlIIlIlIIllllI;
        void lllllllllllllllIllIlIIlIlIlIIIII;
        void lllllllllllllllIllIlIIlIlIlIIIIl;
        WorldPoint worldPoint = H.CRABS_BASE_1.c(this.ak);
        WorldPoint worldPoint3 = H.CRABS_BASE_2.c(this.ak);
        WorldPoint worldPoint4 = H.CRABS_MOVABLE_1.c(this.ak);
        WorldPoint worldPoint5 = H.CRABS_MOVABLE_2.c(this.ak);
        WorldPoint worldPoint6 = H.CRABS_MOVABLE_3.c(this.ak);
        WorldPoint worldPoint7 = H.CRABS_MOVABLE_4.c(this.ak);
        if (bi.llIlllIIlllIII((Object)this.ak.bx, (Object)S.TEMPLATE_WEST)) {
            void lllllllllllllllIllIlIIlIlIIlllII;
            void lllllllllllllllIllIlIIlIlIIlllIl;
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = worldPoint;
            worldPointArray[bi.lIlIlIIlIlII[1]] = worldPoint3;
            worldPointArray[bi.lIlIlIIlIlII[5]] = worldPoint4;
            if (bi.llIlllIIlllIlI(this.a(lIlIlIIIlllI[lIlIlIIlIlII[24]], worldPointArray) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray2 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray2[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIlIIIIl;
            worldPointArray2[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIlIIIII;
            worldPointArray2[bi.lIlIlIIlIlII[5]] = lllllllllllllllIllIlIIlIlIIllllI;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[25]], worldPointArray2) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray3 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray3[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIlIIIIl;
            worldPointArray3[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIlIIIII;
            worldPointArray3[bi.lIlIlIIlIlII[5]] = lllllllllllllllIllIlIIlIlIIlllIl;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[26]], worldPointArray3) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray4 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray4[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIlIIIIl;
            worldPointArray4[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIlIIIII;
            worldPointArray4[bi.lIlIlIIlIlII[5]] = lllllllllllllllIllIlIIlIlIIlllII;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[27]], worldPointArray4) ? 1 : 0)) {
                return;
            }
        }
        if (bi.llIlllIIlllIII((Object)lllllllllllllllIllIlIIlIlIlIIIlI.ak.bx, (Object)S.TEMPLATE_EAST)) {
            void lllllllllllllllIllIlIIlIlIIlllll;
            WorldPoint lllllllllllllllIllIlIIlIlIIllIll = H.CRABS_SINGLE.c(lllllllllllllllIllIlIIlIlIlIIIlI.ak);
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[1]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIIllIll;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[28]], worldPointArray) ? 1 : 0)) {
                if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIlIlIIIlI.bS.isMoving() ? 1 : 0)) {
                    return;
                }
                WorldPoint[] worldPointArray5 = new WorldPoint[lIlIlIIlIlII[1]];
                worldPointArray5[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIIllIll;
                List<WorldPoint> lllllllllllllllIllIlIIlIlIIllIlI = lllllllllllllllIllIlIIlIlIlIIIlI.a(worldPointArray5);
                NPC lllllllllllllllIllIlIIlIlIIllIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIlIIllIlI.contains(nPC.getWorldLocation()) ? 1 : 0) && bi.llIlllIIlllIlI(nPC.isMoving() ? 1 : 0) && bi.llIlllIIlllIlI(nPC.getWorldLocation().equals((Object)lllllllllllllllIllIlIIlIlIIllIll) ? 1 : 0)) {
                        n2 = lIlIlIIlIlII[1];
                        "".length();
                        if ((0xA ^ 0xE) <= 0) {
                            return ((0x63 ^ 0x64) & ~(0x2D ^ 0x2A)) != 0;
                        }
                    } else {
                        n2 = lIlIlIIlIlII[2];
                    }
                    return n2 != 0;
                });
                if (bi.llIlllIIlllIIl(lllllllllllllllIllIlIIlIlIIllIIl)) {
                    WorldPoint lllllllllllllllIllIlIIlIlIIllIII = lllllllllllllllIllIlIIlIlIIllIll.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(lllllllllllllllIllIlIIlIlIIllIll))).orElse(null);
                    Movement.setDestination((WorldPoint)lllllllllllllllIllIlIIlIlIIllIII);
                }
                return;
            }
            WorldPoint[] worldPointArray6 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray6[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIlIIIIl;
            worldPointArray6[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIlIIIII;
            worldPointArray6[bi.lIlIlIIlIlII[5]] = lllllllllllllllIllIlIIlIlIIlllll;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[29]], worldPointArray6) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray7 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray7[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIlIIIIl;
            worldPointArray7[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIlIIIII;
            worldPointArray7[bi.lIlIlIIlIlII[5]] = lllllllllllllllIllIlIIlIlIIllllI;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[30]], worldPointArray7) ? 1 : 0)) {
                return;
            }
            WorldPoint lllllllllllllllIllIlIIlIlIIllIlI = H.CRABS_DOUBLE_1.c(lllllllllllllllIllIlIIlIlIlIIIlI.ak);
            WorldPoint lllllllllllllllIllIlIIlIlIIllIIl = H.CRABS_DOUBLE_2.c(lllllllllllllllIllIlIIlIlIlIIIlI.ak);
            WorldPoint[] worldPointArray8 = new WorldPoint[lIlIlIIlIlII[5]];
            worldPointArray8[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIlIIllIlI;
            worldPointArray8[bi.lIlIlIIlIlII[1]] = lllllllllllllllIllIlIIlIlIIllIIl;
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIlIIIlI.a(lIlIlIIIlllI[lIlIlIIlIlII[31]], worldPointArray8) ? 1 : 0)) {
                return;
            }
        }
    }

    private static boolean llIlllIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint ... worldPointArray) {
        void var6_5;
        void lllllllllllllllIllIlIIlIIllIlIll;
        void lllllllllllllllIllIlIIlIIllIlIIl;
        ArrayList arrayList = new ArrayList();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[46]]));
        if (bi.llIlllIIllIllI(tileObject2)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[45]]);
            return null;
        }
        WorldPoint lllllllllllllllIllIlIIlIIllIlIII = lllllllllllllllIllIlIIlIIllIlIIl.getWorldArea().getCenter();
        ArrayList<WorldPoint> lllllllllllllllIllIlIIlIIllIIllI = new ArrayList<WorldPoint>();
        WorldPoint lllllllllllllllIllIlIIlIIllIIlIl = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        int lllllllllllllllIllIlIIlIIllIIlII = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIIllIIlII, ((void)lllllllllllllllIllIlIIlIIllIlIll).length)) {
            bi lllllllllllllllIllIlIIlIIllIllII;
            WorldPoint worldPoint;
            System.out.println("bounce: " + String.valueOf(lllllllllllllllIllIlIIlIIllIIlIl) + " | crab: " + String.valueOf(lllllllllllllllIllIlIIlIIllIlIll[lllllllllllllllIllIlIIlIIllIIlII]));
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIIllIIlII)) {
                worldPoint = lllllllllllllllIllIlIIlIIllIlIII;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            } else {
                worldPoint = lllllllllllllllIllIlIIlIIllIIlIl;
            }
            List<WorldPoint> lllllllllllllllIllIlIIlIIllIIlll = lllllllllllllllIllIlIIlIIllIllII.c(worldPoint, (WorldPoint)lllllllllllllllIllIlIIlIIllIlIll[lllllllllllllllIllIlIIlIIllIIlII]);
            lllllllllllllllIllIlIIlIIllIIllI.addAll(lllllllllllllllIllIlIIlIIllIIlll);
            "".length();
            lllllllllllllllIllIlIIlIIllIIlIl = lllllllllllllllIllIlIIlIIllIIlll.stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(lllllllllllllllIllIlIIlIIllIlIII))).get();
            ++lllllllllllllllIllIlIIlIIllIIlII;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return var6_5;
    }

    private static void llIlllIIllIlIl() {
        lIlIlIIlIlII = new int[61];
        bi.lIlIlIIlIlII[0] = -" ".length();
        bi.lIlIlIIlIlII[1] = " ".length();
        bi.lIlIlIIlIlII[2] = (0x42 ^ 0x59) & ~(0x25 ^ 0x3E);
        bi.lIlIlIIlIlII[3] = 0xFFFF896F & 0x7FBB;
        bi.lIlIlIIlIlII[4] = 0xD ^ 0x73 ^ (0x79 ^ 2);
        bi.lIlIlIIlIlII[5] = "  ".length();
        bi.lIlIlIIlIlII[6] = "   ".length();
        bi.lIlIlIIlIlII[7] = 20 + 24 - 2 + 128 ^ 111 + 149 - 244 + 158;
        bi.lIlIlIIlIlII[8] = 110 + 118 - 149 + 95 ^ 18 + 100 - -31 + 19;
        bi.lIlIlIIlIlII[9] = 0x49 ^ 0x4E;
        bi.lIlIlIIlIlII[10] = 0xFF ^ 0xA6 ^ (0xEF ^ 0xBE);
        bi.lIlIlIIlIlII[11] = 58 + 57 - -26 + 60 ^ 172 + 104 - 111 + 27;
        bi.lIlIlIIlIlII[12] = 0x95 ^ 0x9F;
        bi.lIlIlIIlIlII[13] = 35 + 137 - 68 + 60 ^ 169 + 144 - 176 + 38;
        bi.lIlIlIIlIlII[14] = 3 + 145 - 37 + 69 ^ 154 + 91 - 211 + 150;
        bi.lIlIlIIlIlII[15] = 0xCB ^ 0xC6;
        bi.lIlIlIIlIlII[16] = 0x27 ^ 0x29;
        bi.lIlIlIIlIlII[17] = 0x50 ^ 0x5F;
        bi.lIlIlIIlIlII[18] = 0x94 ^ 0xA6 ^ (0x9C ^ 0x83);
        bi.lIlIlIIlIlII[19] = 0x8F ^ 0x9F;
        bi.lIlIlIIlIlII[20] = 22 + 35 - 47 + 121 ^ 81 + 130 - 127 + 62;
        bi.lIlIlIIlIlII[21] = 0x35 ^ 0x27;
        bi.lIlIlIIlIlII[22] = 13 + 30 - 39 + 241;
        bi.lIlIlIIlIlII[23] = 0xB9 ^ 0xAA;
        bi.lIlIlIIlIlII[24] = 0x16 ^ 2;
        bi.lIlIlIIlIlII[25] = 0xA2 ^ 0xB5 ^ "  ".length();
        bi.lIlIlIIlIlII[26] = 0x40 ^ 0x56;
        bi.lIlIlIIlIlII[27] = 0xD3 ^ 0xA9 ^ (0x59 ^ 0x34);
        bi.lIlIlIIlIlII[28] = 0xA5 ^ 0xA0 ^ (0x7C ^ 0x61);
        bi.lIlIlIIlIlII[29] = 141 + 5 - 57 + 53 ^ 137 + 121 - 186 + 79;
        bi.lIlIlIIlIlII[30] = 0x4D ^ 0x57;
        bi.lIlIlIIlIlII[31] = 77 + 111 - 150 + 110 ^ 123 + 125 - 138 + 33;
        bi.lIlIlIIlIlII[32] = 0x7E ^ 0x62;
        bi.lIlIlIIlIlII[33] = 0x7A ^ 0x55 ^ (0x20 ^ 0x12);
        bi.lIlIlIIlIlII[34] = 0x13 ^ 0xD;
        bi.lIlIlIIlIlII[35] = 81 + 129 - 202 + 211 ^ 69 + 96 - 87 + 118;
        bi.lIlIlIIlIlII[36] = 0x58 ^ 0x62 ^ (0x41 ^ 0x5B);
        bi.lIlIlIIlIlII[37] = 0xB4 ^ 0x95;
        bi.lIlIlIIlIlII[38] = 0x57 ^ 0x38 ^ (0x16 ^ 0x5B);
        bi.lIlIlIIlIlII[39] = 0xA0 ^ 0x83;
        bi.lIlIlIIlIlII[40] = 0x62 ^ 0x46;
        bi.lIlIlIIlIlII[41] = 7 ^ 0x22;
        bi.lIlIlIIlIlII[42] = 0x94 ^ 0xB2;
        bi.lIlIlIIlIlII[43] = 0x20 ^ 7;
        bi.lIlIlIIlIlII[44] = 0xEE ^ 0xC6;
        bi.lIlIlIIlIlII[45] = 0x54 ^ 0x52 ^ (0xE ^ 0x21);
        bi.lIlIlIIlIlII[46] = 0x70 ^ 0x5A;
        bi.lIlIlIIlIlII[47] = 0x94 ^ 0xBF;
        bi.lIlIlIIlIlII[48] = 0x81 ^ 0x88 ^ (0x33 ^ 0x16);
        bi.lIlIlIIlIlII[49] = 0xF4 ^ 0x91 ^ (0xFA ^ 0xB1);
        bi.lIlIlIIlIlII[50] = 68 + 54 - 77 + 130 ^ 72 + 100 - 160 + 116;
        bi.lIlIlIIlIlII[51] = 0x22 ^ 0x5E ^ (0xD4 ^ 0x98);
        bi.lIlIlIIlIlII[52] = 0x59 ^ 0x68;
        bi.lIlIlIIlIlII[53] = 0x1D ^ 0x2F;
        bi.lIlIlIIlIlII[54] = 0x6B ^ 0x58;
        bi.lIlIlIIlIlII[55] = 0x52 ^ 0x6C ^ (0x72 ^ 0x78);
        bi.lIlIlIIlIlII[56] = 0x4F ^ 0x7A;
        bi.lIlIlIIlIlII[57] = 0x32 ^ 4;
        bi.lIlIlIIlIlII[58] = 0x84 ^ 0xB3;
        bi.lIlIlIIlIlII[59] = 0x52 ^ 0x6A;
        bi.lIlIlIIlIlII[60] = 0xED ^ 0x90 ^ (0x30 ^ 0x74);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, NPC nPC) {
        void lllllllllllllllIllIlIIlIlIIIIIIl;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[33]]);
            return lIlIlIIlIlII[2];
        }
        void lllllllllllllllIllIlIIlIIlllllll = lllllllllllllllIllIlIIlIlIIIIIIl;
        int lllllllllllllllIllIlIIlIIllllllI = lIlIlIIlIlII[0];
        switch (lllllllllllllllIllIlIIlIIlllllll.hashCode()) {
            case -1801391991: {
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllllll.equals(lIlIlIIIlllI[lIlIlIIlIlII[34]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIllllllI = lIlIlIIlIlII[2];
                "".length();
                if (" ".length() != "  ".length()) break;
                return ((0x44 ^ 0x2C ^ (0x16 ^ 0x2C)) & (61 + 186 - 107 + 100 ^ 111 + 158 - 200 + 93 ^ -" ".length())) != 0;
            }
            case 2115395: {
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllllll.equals(lIlIlIIIlllI[lIlIlIIlIlII[35]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIllllllI = lIlIlIIlIlII[1];
                "".length();
                if ("  ".length() == "  ".length()) break;
                return ((91 + 131 - 188 + 192 ^ 28 + 30 - -58 + 72) & (0x5B ^ 0x41 ^ (0x56 ^ 0x12) ^ -" ".length())) != 0;
            }
            case 64266207: {
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllllll.equals(lIlIlIIIlllI[lIlIlIIlIlII[36]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIllllllI = lIlIlIIlIlII[5];
                "".length();
                if ((0x8E ^ 0xA7 ^ (0x89 ^ 0xA4)) > " ".length()) break;
                return ((0x97 ^ 0xBD ^ (0x4D ^ 0x5D)) & (0x36 ^ 0x76 ^ (0xF3 ^ 0x89) ^ -" ".length())) != 0;
            }
            case -1650372460: {
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllllll.equals(lIlIlIIIlllI[lIlIlIIlIlII[37]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIllllllI = lIlIlIIlIlII[6];
            }
        }
        switch (lllllllllllllllIllIlIIlIIllllllI) {
            case 0: {
                boolean bl2;
                void lllllllllllllllIllIlIIlIlIIIIIII;
                if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIIIIIII.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[38]]) ? 1 : 0)) {
                    bl2 = lIlIlIIlIlII[1];
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((" ".length() ^ (0x41 ^ 2)) & (7 + 80 - -64 + 82 ^ 129 + 150 - 191 + 83 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = lIlIlIIlIlII[2];
                }
                return bl2;
            }
            case 1: {
                boolean bl3;
                void lllllllllllllllIllIlIIlIlIIIIIII;
                if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIIIIIII.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[39]]) ? 1 : 0)) {
                    bl3 = lIlIlIIlIlII[1];
                    "".length();
                    if (null != null) {
                        return ((0x81 ^ 0xC5 ^ (0x98 ^ 0x83)) & (149 + 148 - 271 + 190 ^ 106 + 41 - 83 + 71 ^ -" ".length())) != 0;
                    }
                } else {
                    bl3 = lIlIlIIlIlII[2];
                }
                return bl3;
            }
            case 2: {
                return lIlIlIIlIlII[2];
            }
            case 3: {
                boolean bl4;
                void lllllllllllllllIllIlIIlIlIIIIIII;
                if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIIIIIII.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[40]]) ? 1 : 0)) {
                    bl4 = lIlIlIIlIlII[1];
                    "".length();
                    if (((0x7F ^ 0x4A) & ~(0xBE ^ 0x8B)) != 0) {
                        return ((0xB ^ 0x3D) & ~(0x7C ^ 0x4A)) != 0;
                    }
                } else {
                    bl4 = lIlIlIIlIlII[2];
                }
                return bl4;
            }
        }
        System.out.println("couldnt find color: " + string);
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlllIIIllIlI(String lllllllllllllllIllIlIIlIIIIIllII, String lllllllllllllllIllIlIIlIIIIlIIII) {
        lllllllllllllllIllIlIIlIIIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIlIIIIIllll = new StringBuilder();
        char[] lllllllllllllllIllIlIIlIIIIIlllI = lllllllllllllllIllIlIIlIIIIlIIII.toCharArray();
        int lllllllllllllllIllIlIIlIIIIIllIl = lIlIlIIlIlII[2];
        char[] lllllllllllllllIllIlIIlIIIIIIlll = lllllllllllllllIllIlIIlIIIIIllII.toCharArray();
        int lllllllllllllllIllIlIIlIIIIIIllI = lllllllllllllllIllIlIIlIIIIIIlll.length;
        int lllllllllllllllIllIlIIlIIIIIIlIl = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIIIIIIlIl, lllllllllllllllIllIlIIlIIIIIIllI)) {
            char lllllllllllllllIllIlIIlIIIIlIIlI = lllllllllllllllIllIlIIlIIIIIIlll[lllllllllllllllIllIlIIlIIIIIIlIl];
            lllllllllllllllIllIlIIlIIIIIllll.append((char)(lllllllllllllllIllIlIIlIIIIlIIlI ^ lllllllllllllllIllIlIIlIIIIIlllI[lllllllllllllllIllIlIIlIIIIIllIl % lllllllllllllllIllIlIIlIIIIIlllI.length]));
            "".length();
            ++lllllllllllllllIllIlIIlIIIIIllIl;
            ++lllllllllllllllIllIlIIlIIIIIIlIl;
            "".length();
            if ((0xB0 ^ 0x92 ^ (0x2C ^ 0xA)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIIlIIIIIllll);
    }

    private static boolean llIlllIIlllIIl(Object object) {
        return object != null;
    }

    private static String llIlllIIIllIII(String lllllllllllllllIllIlIIlIIIlIllII, String lllllllllllllllIllIlIIlIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIlIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIlIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIlIIIllIIII.init(lIlIlIIlIlII[5], lllllllllllllllIllIlIIlIIIllIIIl);
            return new String(lllllllllllllllIllIlIIlIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIlIIIlIllll) {
            lllllllllllllllIllIlIIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(GraphicChanged graphicChanged) {
        Actor actor = graphicChanged.getActor();
        if (bi.llIlllIIllIlll(actor.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[21]]) ? 1 : 0) && bi.llIlllIIllllll(actor.getGraphic(), lIlIlIIlIlII[22])) {
            this.F((NPC)actor);
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[23]]);
        }
    }

    private void E(NPC nPC) {
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[49]]));
        if (bi.llIlllIIlllIIl(item2)) {
            item2.interact(lIlIlIIIlllI[lIlIlIIlIlII[7]]);
        }
        nPC.interact(lIlIlIIIlllI[lIlIlIIlIlII[4]]);
    }

    private static int llIlllIIllllII(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    private void n(String string) {
        int lllllllllllllllIllIlIIlIIlllIllI;
        String string2 = string;
        int n2 = lIlIlIIlIlII[0];
        switch (string2.hashCode()) {
            case -1801391991: {
                void lllllllllllllllIllIlIIlIIlllIlll;
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllIlll.equals(lIlIlIIIlllI[lIlIlIIlIlII[41]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIlllIllI = lIlIlIIlIlII[2];
                "".length();
                if (" ".length() >= -" ".length()) break;
                return;
            }
            case 2115395: {
                void lllllllllllllllIllIlIIlIIlllIlll;
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllIlll.equals(lIlIlIIIlllI[lIlIlIIlIlII[42]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIlllIllI = lIlIlIIlIlII[1];
                "".length();
                if (" ".length() >= 0) break;
                return;
            }
            case 64266207: {
                void lllllllllllllllIllIlIIlIIlllIlll;
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllIlll.equals(lIlIlIIIlllI[lIlIlIIlIlII[43]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIlllIllI = lIlIlIIlIlII[5];
                "".length();
                if (-"  ".length() < 0) break;
                return;
            }
            case -1650372460: {
                void lllllllllllllllIllIlIIlIIlllIlll;
                if (!bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIIlllIlll.equals(lIlIlIIIlllI[lIlIlIIlIlII[44]]) ? 1 : 0)) break;
                lllllllllllllllIllIlIIlIIlllIllI = lIlIlIIlIlII[6];
            }
        }
        switch (lllllllllllllllIllIlIIlIIlllIllI) {
            case 0: {
                bi lllllllllllllllIllIlIIlIIllllIIl;
                lllllllllllllllIllIlIIlIIllllIIl.es();
                return;
            }
            case 1: {
                bi lllllllllllllllIllIlIIlIIllllIIl;
                lllllllllllllllIllIlIIlIIllllIIl.eu();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bi lllllllllllllllIllIlIIlIIllllIIl;
                lllllllllllllllIllIlIIlIIllllIIl.ep();
                return;
            }
        }
    }

    private static boolean llIlllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlllIIIllIIl(String lllllllllllllllIllIlIIlIIIIlllll, String lllllllllllllllIllIlIIlIIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIlIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlII[10]), "DES");
            Cipher lllllllllllllllIllIlIIlIIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIlIIIlIIIll.init(lIlIlIIlIlII[5], lllllllllllllllIllIlIIlIIIlIIlII);
            return new String(lllllllllllllllIllIlIIlIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIlIIIlIIIlI) {
            lllllllllllllllIllIlIIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void ep() {
        void var2_2;
        void lllllllllllllllIllIlIIlIllIlIlIl;
        int n2 = this.eo();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIlIlIl;
        Item lllllllllllllllIllIlIIlIllIlIlII = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIllIlIlII)) {
            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[5]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[8]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[9]];
        var2_2.interact(stringArray);
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().equals(lIlIlIIIlllI[lIlIlIIlIlII[56]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIlII[1]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[57]];
                if (bi.llIlllIIllIlll(tileObject.hasAction(stringArray) ? 1 : 0) && bi.llIlllIIllIlll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];
                    "".length();
                    if ("   ".length() == "   ".length()) return n2 != 0;
                    return (("   ".length() ^ (0x45 ^ 0x67)) & (38 + 33 - 42 + 132 ^ 24 + 127 - 116 + 93 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIlIIlIlII[2];
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private void a(WorldPoint worldPoint, boolean bl2, WorldPoint ... worldPointArray) {
        void var6_6;
        void lllllllllllllllIllIlIIlIlllIIIlI;
        void lllllllllllllllIllIlIIlIlllIIIII;
        void lllllllllllllllIllIlIIlIllIlllll;
        void lllllllllllllllIllIlIIlIlllIIIll;
        bi lllllllllllllllIllIlIIlIlllIIlII;
        System.out.println(Arrays.toString(worldPointArray));
        List<WorldPoint> list = this.a(worldPointArray);
        NPC nPC2 = NPCs.getNearest((WorldPoint)worldPoint, nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[50]]) ? 1 : 0) && bi.llIlllIIlllIIl(nPC.getInteracting()) && bi.llIlllIIllIlll(nPC.getInteracting().equals(this.bS) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                "".length();
                if (null != null) {
                    return ((66 + 74 - 5 + 23 ^ 47 + 26 - -22 + 36) & (0x5B ^ 0x27 ^ (0xD9 ^ 0xB8) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(nPC2)) {
            this.en();
            return;
        }
        WorldPoint lllllllllllllllIllIlIIlIllIllllI = lllllllllllllllIllIlIIlIlllIIlII.a((WorldPoint)lllllllllllllllIllIlIIlIlllIIIll, (NPC)lllllllllllllllIllIlIIlIllIlllll, (List<WorldPoint>)lllllllllllllllIllIlIIlIlllIIIII);
        if (bi.llIlllIIllIlll((int)lllllllllllllllIllIlIIlIlllIIIlI) && bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIllIlllll.getWorldLocation().equals((Object)lllllllllllllllIllIlIIlIlllIIIll) ? 1 : 0) && bi.llIlllIIlllIlI(bi.llIlllIIllllII(lllllllllllllllIllIlIIlIlllIIlII.bS.getWorldLocation().distanceTo2DHypotenuse((WorldPoint)lllllllllllllllIllIlIIlIlllIIIll), 1.0f))) {
            lllllllllllllllIllIlIIlIlllIIlII.E((NPC)lllllllllllllllIllIlIIlIllIlllll);
            return;
        }
        if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIllIlllll.isMoving() ? 1 : 0) && bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIllIlllll.distanceTo((Locatable)lllllllllllllllIllIlIIlIlllIIlII.bS), lIlIlIIlIlII[6])) {
            return;
        }
        Movement.setDestination((WorldPoint)var6_6);
    }

    @Override
    public boolean cg() {
        bi lllllllllllllllIllIlIIllIIIIlIIl;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[59]]));
        if (bi.llIlllIIllIllI(nPC2)) {
            return this.cS();
        }
        if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIllIIIIlIIl.em() ? 1 : 0)) {
            return lIlIlIIlIlII[1];
        }
        this.ev();
        "".length();
        this.ew();
        return lIlIlIIlIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    private void es() {
        void var3_4;
        bi lllllllllllllllIllIlIIlIllIIlllI;
        int n2 = this.er();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIlllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIIlIlII[1]];
            nArray2[bi.lIlIlIIlIlII[2]] = n2;
            Item item = Inventory.getFirst((int[])nArray2);
            if (bi.llIlllIIlllIIl(item)) {
                String[] stringArray = new String[lIlIlIIlIlII[6]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[10]];
                stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[11]];
                stringArray[bi.lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[12]];
                item.interact(stringArray);
            }
        }
        int lllllllllllllllIllIlIIlIllIIllII = lllllllllllllllIllIlIIlIllIIlllI.eq();
        int[] nArray3 = new int[lIlIlIIlIlII[1]];
        nArray3[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIIllII;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        int[] nArray4 = new int[lIlIlIIlIlII[1]];
        nArray4[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIIllII;
        Item lllllllllllllllIllIlIIlIllIIlIll = Inventory.getFirst((int[])nArray4);
        if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIllIIlIll)) {
            return;
        }
        int n3 = Static.getItemManager().getItemStats(lllllllllllllllIllIlIIlIllIIllII, lIlIlIIlIlII[2]).getEquipment().isTwoHanded();
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0) && bi.llIlllIIllIlll(n3)) {
            lllllllllllllllIllIlIIlIllIIlllI.co.x();
            "".length();
            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[5]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[13]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[14]];
        var3_4.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private void eu() {
        void var2_2;
        void lllllllllllllllIllIlIIlIllIIIlIl;
        int n2 = this.et();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = lllllllllllllllIllIlIIlIllIIIlIl;
        Item lllllllllllllllIllIlIIlIllIIIlII = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(lllllllllllllllIllIlIIlIllIIIlII)) {
            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[6]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[15]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[16]];
        stringArray[bi.lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[17]];
        var2_2.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, WorldPoint ... worldPointArray) {
        void var4_4;
        void lllllllllllllllIllIlIIlIlIIIllIl;
        bi lllllllllllllllIllIlIIlIlIIIlllI;
        WorldPoint lllllllllllllllIllIlIIlIlIIIlIII;
        void lllllllllllllllIllIlIIlIlIIIllII;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(string) ? 1 : 0) && bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[18]]) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((113 + 59 - 163 + 205 ^ 142 + 145 - 192 + 53) & (142 + 112 - 244 + 210 ^ 4 + 14 - -44 + 96 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(tileObject2)) {
            return lIlIlIIlIlII[1];
        }
        WorldPoint lllllllllllllllIllIlIIlIlIIIlIlI = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        if (bi.llIlllIIlllIlI(((void)lllllllllllllllIllIlIIlIlIIIllII).length)) {
            return lIlIlIIlIlII[2];
        }
        int lllllllllllllllIllIlIIlIlIIIlIIl = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIlIIIlIIl, ((void)lllllllllllllllIllIlIIlIlIIIllII).length)) {
            NPC nPC2;
            NPC lllllllllllllllIllIlIIlIlIIIIllI;
            lllllllllllllllIllIlIIlIlIIIlIlI = lllllllllllllllIllIlIIlIlIIIllII[lllllllllllllllIllIlIIlIlIIIlIIl];
            lllllllllllllllIllIlIIlIlIIIlIII = lllllllllllllllIllIlIIlIlIIIlIlI;
            List lllllllllllllllIllIlIIlIlIIIIlll = NPCs.getAll(nPC -> {
                int n2;
                if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[48]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)lllllllllllllllIllIlIIlIlIIIlIII) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];
                    "".length();
                    if (null != null) {
                        return ((0xEF ^ 0xB5) & ~(0x41 ^ 0x1B)) != 0;
                    }
                } else {
                    n2 = lIlIlIIlIlII[2];
                }
                return n2 != 0;
            });
            if (bi.llIlllIIllllIl(lllllllllllllllIllIlIIlIlIIIIlll.size(), lIlIlIIlIlII[1])) {
                lllllllllllllllIllIlIIlIlIIIIllI = lllllllllllllllIllIlIIlIlIIIlIII.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(lllllllllllllllIllIlIIlIlIIIlIII))).orElse(null);
                Movement.setDestination((WorldPoint)lllllllllllllllIllIlIIlIlIIIIllI);
                return lIlIlIIlIlII[2];
            }
            if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIlIIIIlll.isEmpty() ? 1 : 0)) {
                nPC2 = null;
                "".length();
                if (-" ".length() > 0) {
                    return ((0x47 ^ 0x4F) & ~(0x75 ^ 0x7D)) != 0;
                }
            } else {
                nPC2 = lllllllllllllllIllIlIIlIlIIIIllI = (NPC)lllllllllllllllIllIlIIlIlIIIIlll.get(lIlIlIIlIlII[2]);
            }
            if (bi.llIlllIIllllll(lllllllllllllllIllIlIIlIlIIIlIIl, ((void)lllllllllllllllIllIlIIlIlIIIllII).length - lIlIlIIlIlII[1])) {
                "".length();
                if (-"  ".length() <= 0) break;
                return ((19 + 108 - 106 + 150 ^ 71 + 121 - 113 + 88) & (157 + 128 - 93 + 8 ^ 18 + 92 - -20 + 66 ^ -" ".length())) != 0;
            }
            if (bi.llIlllIIlllIlI(lllllllllllllllIllIlIIlIlIIIlllI.D(lllllllllllllllIllIlIIlIlIIIIllI) ? 1 : 0)) {
                lllllllllllllllIllIlIIlIlIIIlllI.a(lllllllllllllllIllIlIIlIlIIIlIlI, lIlIlIIlIlII[1], (WorldPoint[])Arrays.copyOfRange(lllllllllllllllIllIlIIlIlIIIllII, lIlIlIIlIlII[2], lllllllllllllllIllIlIIlIlIIIlIIl + lIlIlIIlIlII[1]));
                return lIlIlIIlIlII[2];
            }
            ++lllllllllllllllIllIlIIlIlIIIlIIl;
            "".length();
            if (-" ".length() < "  ".length()) continue;
            return ((0x49 ^ 0x51) & ~(0x3C ^ 0x24)) != 0;
        }
        if (bi.llIlllIIllIlll(lllllllllllllllIllIlIIlIlIIIlllI.a((String)lllllllllllllllIllIlIIlIlIIIllIl, (NPC)(lllllllllllllllIllIlIIlIlIIIlIII = NPCs.getNearest(arg_0 -> bi.a(lllllllllllllllIllIlIIlIlIIIlIIl = lllllllllllllllIllIlIIlIlIIIlIlI, arg_0)))) ? 1 : 0)) {
            lllllllllllllllIllIlIIlIlIIIlllI.n((String)lllllllllllllllIllIlIIlIlIIIllIl);
            lllllllllllllllIllIlIIlIlIIIlIII.interact(lIlIlIIIlllI[lIlIlIIlIlII[32]]);
            lllllllllllllllIllIlIIlIlIIIlllI.sleep(lIlIlIIlIlII[1]);
            return lIlIlIIlIlII[2];
        }
        this.a((WorldPoint)var4_4, lIlIlIIlIlII[2], worldPointArray);
        return lIlIlIIlIlII[2];
    }

    /*
     * WARNING - void declaration
     */
    private void F(NPC nPC) {
        void var2_2;
        void lllllllllllllllIllIlIIlIlIllIllI;
        bi lllllllllllllllIllIlIIlIlIllIlll;
        int lllllllllllllllIllIlIIlIlIllIlIl = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(lllllllllllllllIllIlIIlIlIllIlIl, lllllllllllllllIllIlIIlIlIllIlll.en.size())) {
            NPC lllllllllllllllIllIlIIlIlIllIlII = lllllllllllllllIllIlIIlIlIllIlll.en.get(lllllllllllllllIllIlIIlIlIllIlIl).aP();
            if (bi.llIlllIIlllIIl(lllllllllllllllIllIlIIlIlIllIlII) && bi.llIlllIIlllIII(lllllllllllllllIllIlIIlIlIllIlII, lllllllllllllllIllIlIIlIlIllIllI)) {
                "".length();
                if ("   ".length() >= 0) break;
                return;
            }
            ++lllllllllllllllIllIlIIlIlIllIlIl;
            "".length();
            if (-(0x65 ^ 0x60) < 0) continue;
            return;
        }
        if (bi.llIlllIIlllllI(lllllllllllllllIllIlIIlIlIllIlIl, lllllllllllllllIllIlIIlIlIllIlll.en.size())) {
            lllllllllllllllIllIlIIlIlIllIlll.en.add(new p((NPC)lllllllllllllllIllIlIIlIlIllIllI, lllllllllllllllIllIlIIlIlIllIlll.cq.getTickCount()));
            "".length();
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[19]]);
            return;
        }
        this.en.get((int)var2_2).q(this.cq.getTickCount());
        System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[20]]);
    }

    private static boolean llIlllIIlllIll(int n2, int n3) {
        return n2 < n3;
    }
}

