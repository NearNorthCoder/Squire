/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.pathfinder.Walker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Collecting Items")
public class l
extends Task {
    private static /* synthetic */ int[] lIIIllIlIllIl;
    private static /* synthetic */ String[] lIIIllIlIllII;
    private static final /* synthetic */ Logger ag;
    private final /* synthetic */ Client ah;
    private final /* synthetic */ SquireQuesterConfig ai;

    private int a(int n2) {
        Object[] objectArray = new Object[lIIIllIlIllIl[8]];
        objectArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[21];
        objectArray[l.lIIIllIlIllIl[1]] = n2;
        this.ah.runScript(objectArray);
        return this.ah.getIntStack()[lIIIllIlIllIl[0]];
    }

    private static String lIlIIIlIlIlllII(String lllllllllllllllIIIIlIIIIllIIIIll, String lllllllllllllllIIIIlIIIIllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIlIllIl[22]), "DES");
            Cipher lllllllllllllllIIIIlIIIIllIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIIllIIIlll.init(lIIIllIlIllIl[8], lllllllllllllllIIIIlIIIIllIIlIII);
            return new String(lllllllllllllllIIIIlIIIIllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIIllIIIllI) {
            lllllllllllllllIIIIlIIIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllIIlII(Object object) {
        return object != null;
    }

    @Inject
    public l(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ah = client;
        this.ai = squireQuesterConfig;
    }

    private static boolean lIlIIIlIllIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlIlIlllIl(String lllllllllllllllIIIIlIIIIllIllIlI, String lllllllllllllllIIIIlIIIIllIlIlII) {
        lllllllllllllllIIIIlIIIIllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIIllIllIII = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIIllIlIlll = lllllllllllllllIIIIlIIIIllIlIlII.toCharArray();
        int lllllllllllllllIIIIlIIIIllIlIllI = lIIIllIlIllIl[0];
        char[] lllllllllllllllIIIIlIIIIllIlIIII = lllllllllllllllIIIIlIIIIllIllIlI.toCharArray();
        int lllllllllllllllIIIIlIIIIllIIllll = lllllllllllllllIIIIlIIIIllIlIIII.length;
        int lllllllllllllllIIIIlIIIIllIIlllI = lIIIllIlIllIl[0];
        while (l.lIlIIIlIllIIlIl(lllllllllllllllIIIIlIIIIllIIlllI, lllllllllllllllIIIIlIIIIllIIllll)) {
            char lllllllllllllllIIIIlIIIIllIllIll = lllllllllllllllIIIIlIIIIllIlIIII[lllllllllllllllIIIIlIIIIllIIlllI];
            lllllllllllllllIIIIlIIIIllIllIII.append((char)(lllllllllllllllIIIIlIIIIllIllIll ^ lllllllllllllllIIIIlIIIIllIlIlll[lllllllllllllllIIIIlIIIIllIlIllI % lllllllllllllllIIIIlIIIIllIlIlll.length]));
            "".length();
            ++lllllllllllllllIIIIlIIIIllIlIllI;
            ++lllllllllllllllIIIIlIIIIllIIlllI;
            "".length();
            if ("   ".length() != (0x59 ^ 0x4D ^ (0x8C ^ 0x9C))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIIIllIllIII);
    }

    private static boolean lIlIIIlIllIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIIlIlIlllll() {
        lIIIllIlIllIl = new int[29];
        l.lIIIllIlIllIl[0] = "  ".length() & ("  ".length() ^ -" ".length());
        l.lIIIllIlIllIl[1] = " ".length();
        l.lIIIllIlIllIl[2] = -(0xFFFFCF2E & 0x7CDF) & (0xFFFFEFFF & 0x5FBF);
        l.lIIIllIlIllIl[3] = 0xFFFFECCD & 0x1FB7;
        l.lIIIllIlIllIl[4] = -(0xF7 ^ 0x93) & (0xFFFFCCFF & 0x3FEF);
        l.lIIIllIlIllIl[5] = -(0xFFFFE0E7 & 0x5F39) & (0xFFFFCCE7 & 0x7FBE);
        l.lIIIllIlIllIl[6] = 0xFFFFED5E & 0x1AFF;
        l.lIIIllIlIllIl[7] = 0xFFFF9DF6 & 0x6A5F;
        l.lIIIllIlIllIl[8] = "  ".length();
        l.lIIIllIlIllIl[9] = "   ".length();
        l.lIIIllIlIllIl[10] = 0xB ^ 0x52 ^ (0x39 ^ 0x64);
        l.lIIIllIlIllIl[11] = 0xFFFFFE8F & 0xDFB;
        l.lIIIllIlIllIl[12] = 0xFFFFCCFF & 0x3F8F;
        l.lIIIllIlIllIl[13] = -(0xFFFFC835 & 0x77DF) & (0xFFFFFFF7 & 0x43FF);
        l.lIIIllIlIllIl[14] = 0xF1 ^ 0xA6 ^ (0x51 ^ 9);
        l.lIIIllIlIllIl[15] = 0xFFFFFFFF & 0x57F9;
        l.lIIIllIlIllIl[16] = 0x77 ^ 0x72;
        l.lIIIllIlIllIl[17] = -(0xFFFFFAFD & 0x47E3) & (0xFFFFFBE7 & 0x4FFD);
        l.lIIIllIlIllIl[18] = 0x88 ^ 0xC0 ^ (0x45 ^ 0xB);
        l.lIIIllIlIllIl[19] = 0xFFFFBBC5 & 0x4FFF;
        l.lIIIllIlIllIl[20] = 88 + 110 - 41 + 2 ^ 69 + 31 - 5 + 57;
        l.lIIIllIlIllIl[21] = 0xFFFF8FFF & 0x7FB8;
        l.lIIIllIlIllIl[22] = 0x1C ^ 0x14;
        l.lIIIllIlIllIl[23] = 0x54 ^ 0x2E ^ (0x37 ^ 0x44);
        l.lIIIllIlIllIl[24] = 169 + 97 - 87 + 4 ^ 156 + 124 - 190 + 99;
        l.lIIIllIlIllIl[25] = 0xB0 ^ 0xC0 ^ (0xEF ^ 0x94);
        l.lIIIllIlIllIl[26] = -(0xFFFFBB79 & 0x56EF) & (0xFFFF9FFE & 0x7EFF);
        l.lIIIllIlIllIl[27] = -(0xFFFFDBDD & 0x366F) & (0xFFFFFEFF & 0x1FDF);
        l.lIIIllIlIllIl[28] = 0x92 ^ 0x9E;
    }

    public boolean run() {
        TileItem lllllllllllllllIIIIlIIIIlllIlIII;
        l lllllllllllllllIIIIlIIIIlllIlIIl;
        if (l.lIlIIIlIllIIIII((Object)this.ai.quest(), (Object)h.BELOW_ICE_MOUNTAIN)) {
            return lIIIllIlIllIl[0];
        }
        if (l.lIlIIIlIllIIIIl(lllllllllllllllIIIIlIIIIlllIlIIl.a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            return lIIIllIlIllIl[0];
        }
        int[] nArray = new int[lIIIllIlIllIl[1]];
        nArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllIlIllIl[1]];
            nArray2[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[2];
            lllllllllllllllIIIIlIIIIlllIlIII = TileItems.getFirstAt((WorldPoint)new WorldPoint(lIIIllIlIllIl[3], lIIIllIlIllIl[4], lIIIllIlIllIl[0]), (int[])nArray2);
            if (l.lIlIIIlIllIIIll(lllllllllllllllIIIIlIIIIlllIlIII)) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[5], lIIIllIlIllIl[4], lIIIllIlIllIl[0]));
                "".length();
                "".length();
                if (-" ".length() >= ((0xBF ^ 0x9A) & ~(0xAC ^ 0x89))) {
                    return ((0x36 ^ 0x1F) & ~(0x88 ^ 0xA1)) != 0;
                }
            } else {
                lllllllllllllllIIIIlIIIIlllIlIII.interact(lIIIllIlIllII[lIIIllIlIllIl[0]]);
            }
        }
        int[] nArray3 = new int[lIIIllIlIllIl[1]];
        nArray3[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[6];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIllIlIllIl[1]];
            nArray4[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
            if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[1]];
                lllllllllllllllIIIIlIIIIlllIlIII = NPCs.getNearest((String[])stringArray);
                int[] nArray5 = new int[lIIIllIlIllIl[1]];
                nArray5[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                TileItem lllllllllllllllIIIIlIIIIlllIIlll = TileItems.getNearest((int[])nArray5);
                if (l.lIlIIIlIllIIIll(lllllllllllllllIIIIlIIIIlllIIlll)) {
                    if (l.lIlIIIlIllIIlII(lllllllllllllllIIIIlIIIIlllIlIII)) {
                        lllllllllllllllIIIIlIIIIlllIlIII.interact(lIIIllIlIllII[lIIIllIlIllIl[8]]);
                        "".length();
                        if (((22 + 55 - 60 + 135 ^ 84 + 91 - 30 + 46) & (0xB1 ^ 0xBB ^ (5 ^ 0x28) ^ -" ".length())) != 0) {
                            return ((0x78 ^ 0x24 ^ (0xDA ^ 0xAF)) & (16 + 56 - -17 + 55 ^ 135 + 77 - 163 + 136 ^ -" ".length())) != 0;
                        }
                    }
                } else {
                    lllllllllllllllIIIIlIIIIlllIIlll.interact(lIIIllIlIllII[lIIIllIlIllIl[9]]);
                }
                "".length();
                if (((0x71 ^ 0x43) & ~(0x6C ^ 0x5E)) != 0) {
                    return ((0xB7 ^ 0x8F) & ~(4 ^ 0x3C)) != 0;
                }
            } else {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[10]];
                TileObject lllllllllllllllIIIIlIIIIlllIIlll = TileObjects.getNearest((String[])stringArray);
                if (l.lIlIIIlIllIIIll(lllllllllllllllIIIIlIIIIlllIIlll)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[11], lIIIllIlIllIl[12], lIIIllIlIllIl[0]));
                    "".length();
                    "".length();
                    if (null != null) {
                        return ((0x54 ^ 0x17 ^ (0x35 ^ 0x3E)) & (0x38 ^ 0x44 ^ (0xBD ^ 0x89) ^ -" ".length())) != 0;
                    }
                } else {
                    int[] nArray6 = new int[lIIIllIlIllIl[1]];
                    nArray6[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[7];
                    Inventory.getFirst((int[])nArray6).useOn(lllllllllllllllIIIIlIIIIlllIIlll);
                }
            }
        }
        int[] nArray7 = new int[lIIIllIlIllIl[1]];
        nArray7[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
            lllllllllllllllIIIIlIIIIlllIlIIl.x();
        }
        int[] nArray8 = new int[lIIIllIlIllIl[1]];
        nArray8[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
        if (l.lIlIIIlIllIIlIl(Inventory.getCount((boolean)lIIIllIlIllIl[1], (int[])nArray8), lIIIllIlIllIl[14])) {
            int[] nArray9 = new int[lIIIllIlIllIl[1]];
            nArray9[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
            if (l.lIlIIIlIllIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIIIllIlIllIl[1]];
                nArray10[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[15];
                Inventory.getFirst((int[])nArray10).interact(lIIIllIlIllII[lIIIllIlIllIl[16]]);
            }
            lllllllllllllllIIIIlIIIIlllIlIIl.x();
        }
        int[] nArray11 = new int[lIIIllIlIllIl[1]];
        nArray11[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[17];
        if (l.lIlIIIlIllIIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIIllIlIllIl[1]];
            nArray12[l.lIIIllIlIllIl[0]] = lIIIllIlIllIl[13];
            if (l.lIlIIIlIllIIllI(Inventory.getCount((boolean)lIIIllIlIllIl[1], (int[])nArray12), lIIIllIlIllIl[14])) {
                String[] stringArray = new String[lIIIllIlIllIl[1]];
                stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[18]];
                lllllllllllllllIIIIlIIIIlllIlIII = NPCs.getNearest((String[])stringArray);
                if (l.lIlIIIlIllIIIIl(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne((int)lIIIllIlIllIl[17]);
                    "".length();
                    if (((0x27 ^ 0x3E ^ (0x89 ^ 0xA5)) & (0x66 ^ 0x29 ^ (0xCB ^ 0xB1) ^ -" ".length())) != 0) {
                        return ((66 + 0 - -76 + 87 ^ 144 + 95 - 64 + 18) & (0x1B ^ 6 ^ (0x6A ^ 0x53) ^ -" ".length())) != 0;
                    }
                } else if (l.lIlIIIlIllIIIll(lllllllllllllllIIIIlIIIIlllIlIII)) {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[19], lIIIllIlIllIl[3], lIIIllIlIllIl[0]));
                    "".length();
                    "".length();
                    if (((187 + 101 - 158 + 82 ^ 71 + 104 - 174 + 139) & (90 + 164 - 153 + 145 ^ 78 + 75 - 151 + 172 ^ -" ".length())) >= (0x53 ^ 0x2E ^ (0x35 ^ 0x4C))) {
                        return ((0xD3 ^ 0x80 ^ (0xE2 ^ 0xAE)) & (49 + 56 - 45 + 128 ^ 11 + 24 - -104 + 24 ^ -" ".length())) != 0;
                    }
                } else {
                    lllllllllllllllIIIIlIIIIlllIlIII.interact(lIIIllIlIllII[lIIIllIlIllIl[20]]);
                }
            }
        }
        return lIIIllIlIllIl[0];
    }

    private static boolean lIlIIIlIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIllIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIlIIIlIlIllllI() {
        lIIIllIlIllII = new String[lIIIllIlIllIl[28]];
        l.lIIIllIlIllII[l.lIIIllIlIllIl[0]] = l.lIlIIIlIlIlllII("S0JyPn/DLeQ=", "KKakj");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[1]] = l.lIlIIIlIlIlllII("YNgCMCe5jcs8h7Xb/18ztw==", "oCXgL");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[8]] = l.lIlIIIlIlIlllIl("AxECLQAp", "BevLc");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[9]] = l.lIlIIIlIlIlllII("Azha12nCLMk=", "Kunwn");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[10]] = l.lIlIIIlIlIlllII("M41gr1j4D13G8bb6uIO5Cg==", "zrmlv");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[16]] = l.lIlIIIlIlIlllIl("CCE9P38mPTQ=", "GQXQR");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[18]] = l.lIlIIIlIlIlllIl("Mh8mEAM=", "efBym");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[20]] = l.lIlIIIlIlIlllIl("AhktHQc=", "VkLyb");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[22]] = l.lIlIIIlIlIlllII("F9o4clHXcN8=", "QtASy");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[23]] = l.lIlIIIlIlIlllII("roWpDAp5+ZQ=", "JIvEH");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[24]] = l.lIlIIIlIlIlllIl("PB0mOjcDFy40Mw==", "ltEQG");
        l.lIIIllIlIllII[l.lIIIllIlIllIl[25]] = l.lIlIIIlIlIlllIl("PwVvPQEQBjs9SFEdLjwQGAQodRAeSicwBR0=", "qjOUd");
    }

    static {
        l.lIlIIIlIlIlllll();
        l.lIlIIIlIlIllllI();
        ag = LoggerFactory.getLogger(l.class);
    }

    private static boolean lIlIIIlIllIIIll(Object object) {
        return object == null;
    }

    private void x() {
        String[] stringArray = new String[lIIIllIlIllIl[8]];
        stringArray[l.lIIIllIlIllIl[0]] = lIIIllIlIllII[lIIIllIlIllIl[22]];
        stringArray[l.lIIIllIlIllIl[1]] = lIIIllIlIllII[lIIIllIlIllIl[23]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (l.lIlIIIlIllIIlII(nPC)) {
            if (l.lIlIIIlIllIIlll(Combat.getCurrentHealth(), lIIIllIlIllIl[8])) {
                nPC.interact(lIIIllIlIllII[lIIIllIlIllIl[24]]);
                "".length();
                if (((0xA1 ^ 0xB4) & ~(0x79 ^ 0x6C)) != 0) {
                    return;
                }
            } else {
                System.out.println(lIIIllIlIllII[lIIIllIlIllIl[25]]);
                "".length();
                if (((3 ^ 0x52 ^ (0x7E ^ 0x17)) & (0x30 ^ 0x1D ^ (6 ^ 0x13) ^ -" ".length())) != 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIlIllIl[26], lIIIllIlIllIl[27], lIIIllIlIllIl[0]));
            "".length();
        }
    }

    private static boolean lIlIIIlIllIIIIl(int n2) {
        return n2 != 0;
    }
}

