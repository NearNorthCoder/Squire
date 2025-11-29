/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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

@TaskDesc(name="Muttadiles", priority=10000, blocking=true)
public class aB
extends U {
    private static /* synthetic */ String[] lIlIIllIlIII;
    private final /* synthetic */ int dE = 7563;
    private final /* synthetic */ int dD = 7562;
    private /* synthetic */ n ak;
    private /* synthetic */ n al;
    private static /* synthetic */ int[] lIlIIllIlllI;
    private final /* synthetic */ int dC = 7561;
    private /* synthetic */ int am;
    /* synthetic */ int dB;

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aB lllllllllllllllIllIlIllllllIIIII;
        if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        TileItem lllllllllllllllIllIlIlllllIlllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[20]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];
                "".length();
                if (null != null) {
                    return ((0x93 ^ 0x8C ^ (0xB ^ 0x5F)) & (132 + 110 - 110 + 83 ^ 38 + 121 - 21 + 18 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[19]])) ? 1 : 0)) {
            lllllllllllllllIllIlIlllllIlllll = TileItems.getNearest(tileItem -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileItem.getName().startsWith(lIlIIllIlIII[lIlIIllIlllI[18]]) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileItem) ? 1 : 0) && aB.llIllIlIlIIllI(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];
                    "".length();
                    if ((0x17 ^ 0x12) <= 0) {
                        return ((0x1F ^ 0x38) & ~(0x45 ^ 0x62)) != 0;
                    }
                } else {
                    n2 = lIlIIllIlllI[0];
                }
                return n2 != 0;
            });
        }
        if (aB.llIllIlIlIlIII(lllllllllllllllIllIlIlllllIlllll)) {
            return lIlIIllIlllI[0];
        }
        var1_1.interact(lIlIIllIlIII[lIlIIllIlllI[17]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
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

    private static boolean llIllIlIlIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIllIlIIlIIll(String lllllllllllllllIllIlIllllIlIIIII, String lllllllllllllllIllIlIllllIIllIlI) {
        lllllllllllllllIllIlIllllIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIllllIIllllI = new StringBuilder();
        char[] lllllllllllllllIllIlIllllIIlllIl = lllllllllllllllIllIlIllllIIllIlI.toCharArray();
        int lllllllllllllllIllIlIllllIIlllII = lIlIIllIlllI[0];
        char[] lllllllllllllllIllIlIllllIIlIllI = lllllllllllllllIllIlIllllIlIIIII.toCharArray();
        int lllllllllllllllIllIlIllllIIlIlIl = lllllllllllllllIllIlIllllIIlIllI.length;
        int lllllllllllllllIllIlIllllIIlIlII = lIlIIllIlllI[0];
        while (aB.llIllIlIlIllIl(lllllllllllllllIllIlIllllIIlIlII, lllllllllllllllIllIlIllllIIlIlIl)) {
            char lllllllllllllllIllIlIllllIlIIIIl = lllllllllllllllIllIlIllllIIlIllI[lllllllllllllllIllIlIllllIIlIlII];
            lllllllllllllllIllIlIllllIIllllI.append((char)(lllllllllllllllIllIlIllllIlIIIIl ^ lllllllllllllllIllIlIllllIIlllIl[lllllllllllllllIllIlIllllIIlllII % lllllllllllllllIllIlIllllIIlllIl.length]));
            "".length();
            ++lllllllllllllllIllIlIllllIIlllII;
            ++lllllllllllllllIllIlIllllIIlIlII;
            "".length();
            if ((0xA6 ^ 0x80 ^ (0x42 ^ 0x61)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIllllIIllllI);
    }

    static {
        aB.llIllIlIlIIlIl();
        aB.llIllIlIlIIlII();
    }

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[23]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlllI[5]];
                stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[24]];
                if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];
                    "".length();
                    if (((0x6E ^ 0x64) & ~(0x9F ^ 0x95)) == 0) return n2 != 0;
                    return ((0x67 ^ 0x36) & ~(0x6F ^ 0x3E)) != 0;
                }
            }
            n2 = lIlIIllIlllI[0];
            return n2 != 0;
        });
        if (aB.llIllIlIlIlIII(tileObject2)) {
            System.out.println(lIlIIllIlIII[lIlIIllIlllI[14]]);
            return lIlIIllIlllI[0];
        }
        tileObject2.interact(lIlIIllIlIII[lIlIIllIlllI[15]]);
        return lIlIIllIlllI[5];
    }

    private static boolean llIllIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static void llIllIlIlIIlII() {
        lIlIIllIlIII = new String[lIlIIllIlllI[34]];
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[0]] = aB.llIllIlIIlIIll("FQ8vCg==", "AnDoo");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[5]] = aB.llIllIlIIlIlII("DJg8dXi1NvFGEOTT8tPNfg==", "yjWGr");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[6]] = aB.llIllIlIIlIlII("+N1tncXoUII=", "pQXCS");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[7]] = aB.llIllIlIIlIIll("HT4WNzE0Ig4m", "PKbCP");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[9]] = aB.llIllIlIIlIlIl("WrkEERLcAeM=", "fdmiM");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[10]] = aB.llIllIlIIlIlIl("Xb3RXSSRHkOlwrVACkweJA==", "SWUly");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[11]] = aB.llIllIlIIlIlIl("f5uw95NUBQc=", "thTgO");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[12]] = aB.llIllIlIIlIlIl("v/CT8+/KoCIA2Vu+2BgtRA==", "pxHfn");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[13]] = aB.llIllIlIIlIlIl("ikQRz+h9C5o=", "vHtuk");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[14]] = aB.llIllIlIIlIlIl("5UoAee6m5uCkwmi/Urqm4aUsHytHYUWi", "yiVUS");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[15]] = aB.llIllIlIIlIlII("qKuH5IubYv0=", "ntMHy");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[16]] = aB.llIllIlIIlIIll("BC8yNwY=", "AAFRt");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[17]] = aB.llIllIlIIlIlII("v8yACNrao2w=", "Koqvg");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[18]] = aB.llIllIlIIlIlIl("GtI2VdOdBnQlGlZkZFUpSQ==", "RCpWv");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[19]] = aB.llIllIlIIlIlII("0lH0MlBqCTM7aIhwWmo5pA==", "NYLff");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[20]] = aB.llIllIlIIlIIll("LzY7GQBQIA==", "wSIpc");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[21]] = aB.llIllIlIIlIlIl("mgZdueEa064=", "yWrnN");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[22]] = aB.llIllIlIIlIlIl("9/+ORbdvBVk5WQGwIdYzJA==", "erqGv");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[23]] = aB.llIllIlIIlIIll("IS4BDiIaMlkTKAElCw4hHA==", "oAygM");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[24]] = aB.llIllIlIIlIIll("FiwWFA==", "FMegT");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[25]] = aB.llIllIlIIlIlII("dIoZT8gsHo8=", "WCJvz");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[26]] = aB.llIllIlIIlIlIl("l1r+L0Ynk1E=", "kMowe");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[27]] = aB.llIllIlIIlIlII("W+vP/+anbJYjJk3Br3/HCg==", "REYLM");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[28]] = aB.llIllIlIIlIlII("fh2wsio8iOg=", "Ysykh");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[29]] = aB.llIllIlIIlIlII("FrFAm/QbFfY=", "YnUgR");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[30]] = aB.llIllIlIIlIIll("NBohJgQ8Fg==", "DsBMe");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[32]] = aB.llIllIlIIlIlII("Qd27xc7YHDo=", "BoVqU");
        aB.lIlIIllIlIII[aB.lIlIIllIlllI[33]] = aB.llIllIlIIlIlII("pDf9zmI8ypjxI37W3MqDJw==", "vSBpK");
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aB.llIllIlIlIIllI(tileObject.getName().equals(lIlIIllIlIII[lIlIIllIlllI[25]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlllI[5]];
                stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[26]];
                if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIlllI[5];
                    "".length();
                    if ("   ".length() > " ".length()) return n2 != 0;
                    return ((0xD9 ^ 0x98 ^ (0x3F ^ 0x50)) & (0x57 ^ 0x7A ^ "   ".length() ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIllIlllI[0];
            return n2 != 0;
        });
    }

    private static boolean llIllIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aB lllllllllllllllIllIlIllllllIlIII;
        if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aB.llIllIlIlIlIlI(Movement.getDestination()) && aB.llIllIlIlIIllI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlIllllllIlIII.al.bs);
            return lIlIIllIlllI[5];
        }
        TileObject lllllllllllllllIllIlIllllllIIlll = lllllllllllllllIllIlIllllllIlIII.cR();
        if (aB.llIllIlIlIlIII(lllllllllllllllIllIlIllllllIIlll)) {
            return lIlIIllIlllI[0];
        }
        if (!aB.llIllIlIlIlIIl(lllllllllllllllIllIlIllllllIlIII.bS.isMoving() ? 1 : 0) || aB.llIllIlIlIIllI(lllllllllllllllIllIlIllllllIlIII.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        var1_1.interact(lIlIIllIlIII[lIlIIllIlllI[16]]);
        return lIlIIllIlllI[5];
    }

    private WorldArea i(NPC nPC) {
        if (aB.llIllIlIlIlIII(nPC)) {
            return null;
        }
        int n2 = lIlIIllIlllI[10];
        return new WorldArea(nPC.getWorldLocation().dx(-n2).dy(-n2), lIlIIllIlllI[6] * n2 + nPC.getWorldArea().getWidth(), lIlIIllIlllI[6] * n2 + nPC.getWorldArea().getWidth());
    }

    private static String llIllIlIIlIlII(String lllllllllllllllIllIlIllllIllIIII, String lllllllllllllllIllIlIllllIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIllllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllllIlIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIllIlllI[13]), "DES");
            Cipher lllllllllllllllIllIlIllllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIlIllllIllIIlI.init(lIlIIllIlllI[6], lllllllllllllllIllIlIllllIllIIll);
            return new String(lllllllllllllllIllIlIllllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllllIllIIIl) {
            lllllllllllllllIllIlIllllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllIlIlIIlIl() {
        lIlIIllIlllI = new int[35];
        aB.lIlIIllIlllI[0] = (0x15 ^ 0x31 ^ (0x1A ^ 0x2E)) & (151 + 65 - 193 + 146 ^ 164 + 4 - 67 + 84 ^ -" ".length());
        aB.lIlIIllIlllI[1] = 0xFFFFDFCB & 0x3DBD;
        aB.lIlIIllIlllI[2] = -(0x3B ^ 0x2E) & (0xFFFFFDFE & 0x1F9F);
        aB.lIlIIllIlllI[3] = 0xFFFFFFBB & 0x1DCF;
        aB.lIlIIllIlllI[4] = -" ".length();
        aB.lIlIIllIlllI[5] = " ".length();
        aB.lIlIIllIlllI[6] = "  ".length();
        aB.lIlIIllIlllI[7] = "   ".length();
        aB.lIlIIllIlllI[8] = 0x1E ^ 0x59 ^ (0x28 ^ 0x53);
        aB.lIlIIllIlllI[9] = 0x91 ^ 0x95;
        aB.lIlIIllIlllI[10] = 0x57 ^ 0x52;
        aB.lIlIIllIlllI[11] = 184 + 172 - 199 + 34 ^ 66 + 128 - 179 + 170;
        aB.lIlIIllIlllI[12] = 0x70 ^ 0x3B ^ (0x3C ^ 0x70);
        aB.lIlIIllIlllI[13] = 0x39 ^ 0x32 ^ "   ".length();
        aB.lIlIIllIlllI[14] = 0x6C ^ 0x65;
        aB.lIlIIllIlllI[15] = 0x34 ^ 0x3E;
        aB.lIlIIllIlllI[16] = 0x43 ^ 0x13 ^ (0x24 ^ 0x7F);
        aB.lIlIIllIlllI[17] = 0x97 ^ 0x9B;
        aB.lIlIIllIlllI[18] = 0x4C ^ 0x41;
        aB.lIlIIllIlllI[19] = 0x5C ^ 0x52;
        aB.lIlIIllIlllI[20] = 116 + 84 - 126 + 96 ^ 85 + 81 - 37 + 36;
        aB.lIlIIllIlllI[21] = 0xB9 ^ 0xA9;
        aB.lIlIIllIlllI[22] = 0x4E ^ 0x5F;
        aB.lIlIIllIlllI[23] = 0x6B ^ 0x21 ^ (0x99 ^ 0xC1);
        aB.lIlIIllIlllI[24] = 0xA1 ^ 0xB2;
        aB.lIlIIllIlllI[25] = 0xB1 ^ 0xA5;
        aB.lIlIIllIlllI[26] = 0xB3 ^ 0x9F ^ (0xD ^ 0x34);
        aB.lIlIIllIlllI[27] = 0x1E ^ 8;
        aB.lIlIIllIlllI[28] = 199 + 102 - 202 + 114 ^ 145 + 19 - 93 + 123;
        aB.lIlIIllIlllI[29] = 0x88 ^ 0xAA ^ (0x7C ^ 0x46);
        aB.lIlIIllIlllI[30] = 0x9A ^ 0x83;
        aB.lIlIIllIlllI[31] = -(0xFFFFAFF3 & 0x576E) & (0xFFFFFFFB & 0x77EF);
        aB.lIlIIllIlllI[32] = 0xB9 ^ 0xA3;
        aB.lIlIIllIlllI[33] = 0x1E ^ 5;
        aB.lIlIIllIlllI[34] = 0x1B ^ 0x48 ^ (0x1D ^ 0x52);
    }

    private static boolean llIllIlIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlIlIlIII(Object object) {
        return object == null;
    }

    private static String llIllIlIIlIlIl(String lllllllllllllllIllIlIllllIllllIl, String lllllllllllllllIllIlIllllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlllllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIllllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIllllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIllllIllllll.init(lIlIIllIlllI[6], lllllllllllllllIllIlIlllllIIIIII);
            return new String(lllllllllllllllIllIlIllllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIllllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIllllIlllllI) {
            lllllllllllllllIllIlIllllIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIllIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var5_5;
        List lllllllllllllllIllIlIlllllllllII;
        WorldPoint lllllllllllllllIllIlIllllllllIll;
        aB lllllllllllllllIllIllIIIIIIIIlII;
        if (aB.llIllIlIlIIllI(this.cU() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        Player lllllllllllllllIllIllIIIIIIIIIll = Players.getLocal();
        int lllllllllllllllIllIllIIIIIIIIIlI = Static.getClient().getTickCount();
        if (aB.llIllIlIlIIlll(lllllllllllllllIllIllIIIIIIIIIll.distanceTo(lllllllllllllllIllIllIIIIIIIIlII.ak.bs), lIlIIllIlllI[5]) && aB.llIllIlIlIIllI(lllllllllllllllIllIllIIIIIIIIlII.cT() ? 1 : 0)) {
            return lIlIIllIlllI[5];
        }
        NPC lllllllllllllllIllIllIIIIIIIIIIl = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIllIlllI[5]];
            stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[32]];
            if (aB.llIllIlIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(nPC.getName().contains(lIlIIllIlIII[lIlIIllIlllI[33]]) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];
                "".length();
                if ("  ".length() == "   ".length()) {
                    return ((0xF4 ^ 0x90 ^ (0xFA ^ 0xB9)) & (0x27 ^ 1 ^ " ".length() ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        int[] nArray = new int[lIlIIllIlllI[5]];
        nArray[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC lllllllllllllllIllIllIIIIIIIIIII = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIIllIlllI[5]];
        nArray2[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC lllllllllllllllIllIlIlllllllllll = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIlIIllIlllI[5]];
        nArray3[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC lllllllllllllllIllIlIllllllllllI = NPCs.getNearest((int[])nArray3);
        if (aB.llIllIlIlIlIII(lllllllllllllllIllIllIIIIIIIIIII) && aB.llIllIlIlIlIII(lllllllllllllllIllIlIlllllllllll) && aB.llIllIlIlIlIII(lllllllllllllllIllIlIllllllllllI)) {
            return lllllllllllllllIllIllIIIIIIIIlII.cS();
        }
        if (aB.llIllIlIlIlIIl(Inventory.contains(item -> {
            int n2;
            if (aB.llIllIlIlIIllI(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[29]]) ? 1 : 0) && aB.llIllIlIlIlIIl(item.getName().contains(lIlIIllIlIII[lIlIIllIlllI[30]]) ? 1 : 0) && aB.llIllIlIlIllII(item.getId(), lIlIIllIlllI[31])) {
                n2 = lIlIIllIlllI[5];
                "".length();
                if ("   ".length() == ((104 + 140 - 197 + 103 ^ 132 + 162 - 206 + 103) & (0xF6 ^ 0xC5 ^ (0x38 ^ 0x22) ^ -" ".length()))) {
                    return ((0x61 ^ 0x65 ^ (0x63 ^ 0x35)) & (38 + 14 - -66 + 112 ^ 54 + 167 - 107 + 66 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (aB.llIllIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                lllllllllllllllIllIllIIIIIIIIlII.co.x();
                "".length();
                return lIlIIllIlllI[5];
            }
            TileObject lllllllllllllllIllIlIlllllllllIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.llIllIlIlIIllI(tileObject.getName().contains(lIlIIllIlIII[lIlIIllIlllI[27]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIllIlllI[5]];
                    stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[28]];
                    if (aB.llIllIlIlIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIllIlllI[5];
                        "".length();
                        if (((0xCE ^ 0x8D) & ~(0x16 ^ 0x55)) <= " ".length()) return n2 != 0;
                        return ((0xAD ^ 0x8B) & ~(0xC ^ 0x2A)) != 0;
                    }
                }
                n2 = lIlIIllIlllI[0];
                return n2 != 0;
            });
            if (aB.llIllIlIlIlIII(lllllllllllllllIllIlIlllllllllIl)) {
                return lIlIIllIlllI[0];
            }
            lllllllllllllllIllIlIlllllllllIl.interact(lIlIIllIlIII[lIlIIllIlllI[0]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIIl)) {
            if ((!aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting()) || aB.llIllIlIlIlIIl(lllllllllllllllIllIllIIIIIIIIIll.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[5]]) ? 1 : 0)) && aB.llIllIlIlIlIll(lllllllllllllllIllIllIIIIIIIIIlI - lllllllllllllllIllIllIIIIIIIIlII.co.H(), lIlIIllIlllI[6])) {
                lllllllllllllllIllIllIIIIIIIIIIl.interact(lIlIIllIlIII[lIlIIllIlllI[6]]);
                return lIlIIllIlllI[5];
            }
            if (aB.llIllIlIlIlIll(lllllllllllllllIllIllIIIIIIIIIlI - lllllllllllllllIllIllIIIIIIIIlII.co.H(), lIlIIllIlllI[6])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIII(lllllllllllllllIllIllIIIIIIIIIII)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting()) && aB.llIllIlIlIIllI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[7]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIllII(lllllllllllllllIllIllIIIIIIIIIII.getHealthRatio(), lIlIIllIlllI[4]) && aB.llIllIlIlIllIl(lllllllllllllllIllIllIIIIIIIIIII.getHealthRatio(), lIlIIllIlllI[8])) {
                return lIlIIllIlllI[0];
            }
            if (aB.llIllIlIlIIllI(lllllllllllllllIllIllIIIIIIIIIII.getWorldArea().isInMeleeDistance(lllllllllllllllIllIllIIIIIIIIIll.getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIllIllIIIIIIIIIII.interact(lIlIIllIlIII[lIlIIllIlllI[9]]);
                return lIlIIllIlllI[5];
            }
            return lIlIIllIlllI[0];
        }
        if (aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIII)) {
            if (aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting()) && aB.llIllIlIlIIllI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[10]]) ? 1 : 0)) {
                return lIlIIllIlllI[0];
            }
            lllllllllllllllIllIllIIIIIIIIIII.interact(lIlIIllIlIII[lIlIIllIlllI[11]]);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIII(lllllllllllllllIllIlIlllllllllll)) {
            return lIlIIllIlllI[0];
        }
        int lllllllllllllllIllIlIlllllllllIl = lllllllllllllllIllIlIlllllllllll.getWorldArea().distanceTo(lllllllllllllllIllIllIIIIIIIIIll.getWorldLocation());
        if (aB.llIllIlIlIIlll(lllllllllllllllIllIlIlllllllllIl, lIlIIllIlllI[7]) && aB.llIllIlIlIlIlI(lllllllllllllllIllIlIllllllllIll = (WorldPoint)(lllllllllllllllIllIlIlllllllllII = lllllllllllllllIllIllIIIIIIIIlII.i(lllllllllllllllIllIlIlllllllllll).toWorldPointList()).stream().filter(worldPoint -> {
            int n2;
            if (aB.llIllIlIlIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aB.llIllIlIlIllIl(lllllllllllllllIllIlIlllllllllll.getWorldArea().distanceTo(worldPoint), lIlIIllIlllI[11])) {
                n2 = lIlIIllIlllI[5];
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x85 ^ 0xC3) & ~(0x79 ^ 0x3F)) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        }).max(Comparator.comparingInt(object -> lllllllllllllllIllIlIlllllllllll.getWorldArea().distanceTo((WorldPoint)object)).thenComparingDouble(object -> -1.0f * ((WorldPoint)object).distanceToHypotenuse(lllllllllllllllIllIllIIIIIIIIIll.getWorldLocation()))).orElse(null))) {
            System.out.println("Player: " + String.valueOf(lllllllllllllllIllIllIIIIIIIIIll.getWorldLocation()) + String.valueOf(lllllllllllllllIllIlIlllllllllll.getWorldLocation()));
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlIllllllllIll);
            return lIlIIllIlllI[5];
        }
        if (aB.llIllIlIlIlIlI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting()) && aB.llIllIlIlIIllI(lllllllllllllllIllIllIIIIIIIIIll.getInteracting().getName().equals(lIlIIllIlIII[lIlIIllIlllI[12]]) ? 1 : 0)) {
            return lIlIIllIlllI[0];
        }
        var5_5.interact(lIlIIllIlIII[lIlIIllIlllI[13]]);
        return lIlIIllIlllI[5];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aB.llIllIlIlIlllI((Object)this.ak.bw, (Object)N.MUTTADILES)) {
            bl2 = lIlIIllIlllI[5];
            "".length();
            if (-"   ".length() > 0) {
                return ((96 + 159 - 125 + 57 ^ 69 + 90 - 21 + 9) & (0x21 ^ 0x27 ^ (0x77 ^ 0x59) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIllIlllI[0];
        }
        return bl2;
    }

    private static boolean llIllIlIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public EquipmentSetup cj() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIlIIllIlllI[5]];
            stringArray[aB.lIlIIllIlllI[0]] = lIlIIllIlIII[lIlIIllIlllI[21]];
            if (aB.llIllIlIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && aB.llIllIlIlIIllI(nPC.getName().contains(lIlIIllIlIII[lIlIIllIlllI[22]]) ? 1 : 0)) {
                n2 = lIlIIllIlllI[5];
                "".length();
                if ((30 + 112 - 61 + 48 ^ 30 + 27 - 11 + 86) <= 0) {
                    return ((0x96 ^ 0xAC ^ "   ".length()) & (30 + 9 - -14 + 82 ^ 93 + 129 - 121 + 89 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIllIlllI[0];
            }
            return n2 != 0;
        });
        return s.b(s.e(N.MUTTADILES));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var6_6;
        void lllllllllllllllIllIlIllllllIllll;
        void lllllllllllllllIllIlIllllllIlllI;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Player player = Players.getLocal();
        int[] nArray = new int[lIlIIllIlllI[5]];
        nArray[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlIIllIlllI[5]];
        nArray2[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[3];
        NPC nPC2 = NPCs.getNearest((int[])nArray2);
        int[] nArray3 = new int[lIlIIllIlllI[5]];
        nArray3[aB.lIlIIllIlllI[0]] = lIlIIllIlllI[1];
        NPC nPC3 = NPCs.getNearest((int[])nArray3);
        if (aB.llIllIlIlIlIII(nPC2) && aB.llIllIlIlIlIII(nPC3) && aB.llIllIlIlIlIII(nPC)) {
            return null;
        }
        Prayer lllllllllllllllIllIlIllllllIlIll = Prayer.PROTECT_FROM_MISSILES;
        if (aB.llIllIlIlIlIlI(lllllllllllllllIllIlIllllllIlllI) && aB.llIllIlIlIIllI(lllllllllllllllIllIlIllllllIlllI.getWorldArea().isInMeleeDistance(lllllllllllllllIllIlIllllllIllll.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIllIlIllllllIlIll = Prayer.PROTECT_FROM_MELEE;
        }
        arrayList.add((Prayer)var6_6);
        "".length();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        return arrayList;
    }
}

