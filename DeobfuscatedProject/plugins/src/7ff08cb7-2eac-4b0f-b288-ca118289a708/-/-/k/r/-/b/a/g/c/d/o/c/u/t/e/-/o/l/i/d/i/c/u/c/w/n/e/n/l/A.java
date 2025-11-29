/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.m;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class A
implements ab {
    public static final /* synthetic */ WorldPoint ea;
    public static final /* synthetic */ WorldPoint dV;
    public static final /* synthetic */ WorldPoint dZ;
    public static final /* synthetic */ WorldPoint dW;
    public static final /* synthetic */ WorldPoint dT;
    public static /* synthetic */ List<d> bx;
    public static final /* synthetic */ WorldPoint eb;
    static /* synthetic */ int dk;
    public static final /* synthetic */ WorldPoint dY;
    private static /* synthetic */ int[] lllIllIII;
    private static /* synthetic */ String[] lllIlIlll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint dX;
    private static /* synthetic */ String[] cG;
    static /* synthetic */ int ec;
    public static final /* synthetic */ WorldPoint dU;
    static /* synthetic */ WorldArea ed;

    private static String llIIIllllIlI(String llIllIlIllIlI, String llIllIlIllIIl) {
        llIllIlIllIlI = new String(Base64.getDecoder().decode(llIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIlllIl = new StringBuilder();
        char[] llIllIlIlllII = llIllIlIllIIl.toCharArray();
        int llIllIlIllIll = lllIllIII[1];
        char[] llIllIlIlIlIl = llIllIlIllIlI.toCharArray();
        int llIllIlIlIlII = llIllIlIlIlIl.length;
        int llIllIlIlIIll = lllIllIII[1];
        while (A.llIIIlllllll(llIllIlIlIIll, llIllIlIlIlII)) {
            char llIllIllIIIII = llIllIlIlIlIl[llIllIlIlIIll];
            llIllIlIlllIl.append((char)(llIllIllIIIII ^ llIllIlIlllII[llIllIlIllIll % llIllIlIlllII.length]));
            "".length();
            ++llIllIlIllIll;
            ++llIllIlIlIIll;
            "".length();
            if ("  ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(llIllIlIlllIl);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llIllIlllIIll;
        int[] nArray = new int[lllIllIII[12]];
        nArray[A.lllIllIII[1]] = lllIllIII[13];
        nArray[A.lllIllIII[0]] = lllIllIII[7];
        nArray[A.lllIllIII[5]] = lllIllIII[10];
        nArray[A.lllIllIII[11]] = lllIllIII[14];
        nArray[A.lllIllIII[6]] = lllIllIII[15];
        nArray[A.lllIllIII[16]] = lllIllIII[17];
        int[] nArray2 = nArray;
        int llIllIlllIIlI = lllIllIII[1];
        while (A.llIIIlllllll(llIllIlllIIlI, ((void)llIllIlllIIll).length)) {
            int[] nArray3 = new int[lllIllIII[0]];
            nArray3[A.lllIllIII[1]] = llIllIlllIIll[llIllIlllIIlI];
            if (A.llIIlIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllIllIII[1];
            }
            ++llIllIlllIIlI;
            "".length();
            if (((0x11 ^ 0x77 ^ (0x79 ^ 3)) & (0xEB ^ 0x80 ^ (0x59 ^ 0x2E) ^ -" ".length())) > -" ".length()) continue;
            return ((0x54 ^ 0x5D ^ (0xB8 ^ 0x9F)) & (119 + 61 - 104 + 74 ^ 122 + 177 - 132 + 17 ^ -" ".length())) != 0;
        }
        return lllIllIII[0];
    }

    private static boolean llIIlIIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIIlllllII() {
        lllIlIlll = new String[lllIllIII[112]];
        A.lllIlIlll[A.lllIllIII[1]] = A.llIIIllllIIl("c3s5IViQUvYUddIiBl4NfgrblfyZcZIPALj2E7NbNWDA8VsvMDEWCdeXbczgSRXZ", "NXHqA");
        A.lllIlIlll[A.lllIllIII[0]] = A.llIIIllllIIl("eqD6eN6DGXMORcwZWw1zig==", "qIFcy");
        A.lllIlIlll[A.lllIllIII[5]] = A.llIIIllllIlI("JyonHA0GJS5YAw4lIhEPCA==", "oKIxa");
        A.lllIlIlll[A.lllIllIII[11]] = A.llIIIllllIll("HYAD53kQVF97fvRM2nU4WRz8xrY6EVtFyzpmQBm1C5LkiMRDor/XMjGmX+4kdCTs", "XGozJ");
        A.lllIlIlll[A.lllIllIII[6]] = A.llIIIllllIll("GATU/ttVOhXcEiTW0Q/q6dRxhbZueMJwyZPNPJoNc8BIt2xwFwO44wbASxTix6miOZ6xEWGV9J8=", "ILxDR");
        A.lllIlIlll[A.lllIllIII[16]] = A.llIIIllllIIl("cHQs3C/fJD8=", "aQXka");
        A.lllIlIlll[A.lllIllIII[12]] = A.llIIIllllIll("7qPUQWRMnIs=", "AuQRY");
        A.lllIlIlll[A.lllIllIII[22]] = A.llIIIllllIlI("ITssczMAeiknJh0u", "oZZSG");
        A.lllIlIlll[A.lllIllIII[23]] = A.llIIIllllIIl("TjGt2bZal6O2vRPf1cJebg==", "TkjMk");
        A.lllIlIlll[A.lllIllIII[24]] = A.llIIIllllIll("YTMoBK3i+56sgU6gaT4Rng==", "hqTFv");
        A.lllIlIlll[A.lllIllIII[18]] = A.llIIIllllIIl("/YomaU6/GjSQfiI8e16orA==", "xDqDV");
        A.lllIlIlll[A.lllIllIII[25]] = A.llIIIllllIll("6Fc8QyZ1OB0=", "vjdMS");
        A.lllIlIlll[A.lllIllIII[26]] = A.llIIIllllIIl("9XI3S+jJzLI=", "IwIuT");
        A.lllIlIlll[A.lllIllIII[3]] = A.llIIIllllIlI("GxESFxo=", "Xywdn");
        A.lllIlIlll[A.lllIllIII[27]] = A.llIIIllllIIl("q9Q7VKofrF8=", "cGHys");
        A.lllIlIlll[A.lllIllIII[28]] = A.llIIIllllIlI("PzYQCA==", "pFufs");
        A.lllIlIlll[A.lllIllIII[29]] = A.llIIIllllIIl("QCzDzEinuVk=", "ugvee");
        A.lllIlIlll[A.lllIllIII[30]] = A.llIIIllllIlI("CQUCIgY=", "JmgQr");
        A.lllIlIlll[A.lllIllIII[31]] = A.llIIIllllIIl("Kho6CR0vCsg=", "bmeZe");
        A.lllIlIlll[A.lllIllIII[32]] = A.llIIIllllIll("z9mnbcO4Z6Y=", "Ankgv");
        A.lllIlIlll[A.lllIllIII[33]] = A.llIIIllllIIl("k6xqoWgnbWs=", "laFuK");
        A.lllIlIlll[A.lllIllIII[34]] = A.llIIIllllIlI("MAoQBzU=", "sbutA");
        A.lllIlIlll[A.lllIllIII[35]] = A.llIIIllllIIl("WHcYi3QaH/U=", "MYaqE");
        A.lllIlIlll[A.lllIllIII[36]] = A.llIIIllllIIl("T7pAJx+2WXY=", "CypwH");
        A.lllIlIlll[A.lllIllIII[37]] = A.llIIIllllIll("3e5FoyWMGa8=", "UfjJy");
        A.lllIlIlll[A.lllIllIII[21]] = A.llIIIllllIll("CHA3KL6jZtY=", "hTtkg");
        A.lllIlIlll[A.lllIllIII[40]] = A.llIIIllllIlI("FgYkGQ==", "AcEky");
        A.lllIlIlll[A.lllIllIII[41]] = A.llIIIllllIIl("DTd9ybGIy/yQsmGeqJlvTA==", "sprwv");
        A.lllIlIlll[A.lllIllIII[42]] = A.llIIIllllIll("HGT9k8NSu8Q=", "CLmmc");
        A.lllIlIlll[A.lllIllIII[43]] = A.llIIIllllIIl("SQPYUj+8B2k=", "CzeYv");
        A.lllIlIlll[A.lllIllIII[44]] = A.llIIIllllIIl("qZAftvXUaUoOYl+Ap09OvA==", "QncCO");
        A.lllIlIlll[A.lllIllIII[45]] = A.llIIIllllIll("CZRe8K6veLnDSoOZ1GUZqg==", "BoEKY");
        A.lllIlIlll[A.lllIllIII[46]] = A.llIIIllllIlI("BR8OGARuFR0RGg==", "Nwotm");
        A.lllIlIlll[A.lllIllIII[47]] = A.llIIIllllIIl("+nHDae9kKgFZjViMP+8kEQ==", "LuOHj");
        A.lllIlIlll[A.lllIllIII[48]] = A.llIIIllllIll("9ccGsDO77niTHEzP3fXchw==", "PAzws");
        A.lllIlIlll[A.lllIllIII[49]] = A.llIIIllllIll("dgdm7tiwRpWk9eYeeqMvNA==", "rtQBQ");
        A.lllIlIlll[A.lllIllIII[50]] = A.llIIIllllIlI("Gg80TwM7TiUaFiYK", "TnBow");
        A.lllIlIlll[A.lllIllIII[51]] = A.llIIIllllIll("+0tyiRuqggbwURNNJQOd0g==", "bFnBS");
        A.lllIlIlll[A.lllIllIII[52]] = A.llIIIllllIll("8KIbkvDDB5YrPleRE4pXfw==", "MRPUm");
        A.lllIlIlll[A.lllIllIII[53]] = A.llIIIllllIlI("PSUeTD0cZEgfKB4pEQ==", "sDhlI");
        A.lllIlIlll[A.lllIllIII[54]] = A.llIIIllllIIl("xfxV4FKODDOus3eGpF9wz1TRosjQYbnw", "arUEQ");
        A.lllIlIlll[A.lllIllIII[55]] = A.llIIIllllIlI("PycFHhQGK0QrEgYq", "tOddu");
        A.lllIlIlll[A.lllIllIII[56]] = A.llIIIllllIlI("HxkGHjAmFUcrNiYU", "TqgdQ");
        A.lllIlIlll[A.lllIllIII[57]] = A.llIIIllllIll("5nDeSsPHq/8=", "qsngP");
        A.lllIlIlll[A.lllIllIII[58]] = A.llIIIllllIlI("NRIsAh1GICQdEg8f", "fsAod");
        A.lllIlIlll[A.lllIllIII[2]] = A.llIIIllllIll("m0wjrBHdZwY=", "TkWPU");
        A.lllIlIlll[A.lllIllIII[59]] = A.llIIIllllIIl("7WfOeqUjkoM=", "sgXwC");
        A.lllIlIlll[A.lllIllIII[60]] = A.llIIIllllIll("+rTrl+/C/uI=", "hZnJX");
        A.lllIlIlll[A.lllIllIII[61]] = A.llIIIllllIlI("Hxo1Di8mFnQnLTsAJB0hOg==", "TrTtN");
        A.lllIlIlll[A.lllIllIII[62]] = A.llIIIllllIlI("Py0QFBEGIVE9Exs3AQcfGg==", "tEqnp");
        A.lllIlIlll[A.lllIllIII[20]] = A.llIIIllllIll("atf+7NDJsFM=", "zBAUL");
        A.lllIlIlll[A.lllIllIII[63]] = A.llIIIllllIll("t0n02PxBXlY=", "GVqjT");
        A.lllIlIlll[A.lllIllIII[64]] = A.llIIIllllIIl("lBF+eCSJUWQ=", "HGuct");
        A.lllIlIlll[A.lllIllIII[65]] = A.llIIIllllIlI("NQ4uAzQf", "tzZbW");
        A.lllIlIlll[A.lllIllIII[66]] = A.llIIIllllIlI("IDMrHTEGOmUzKwYsJAon", "gVExC");
        A.lllIlIlll[A.lllIllIII[67]] = A.llIIIllllIIl("E9MrTLyIPZE=", "ILbFr");
        A.lllIlIlll[A.lllIllIII[71]] = A.llIIIllllIIl("5DIypbZPcBuEnf7IQw8zuA==", "qmOQr");
        A.lllIlIlll[A.lllIllIII[72]] = A.llIIIllllIlI("PTUHEjsbPEk8IRsqCAUt", "zPiwI");
        A.lllIlIlll[A.lllIllIII[76]] = A.llIIIllllIIl("QfV8Fg2n7VanIPcNAixe5Q==", "vqJRL");
        A.lllIlIlll[A.lllIllIII[79]] = A.llIIIllllIll("6Pa/2RwaJTw+YZsBNCK8MQ==", "HSCZl");
        A.lllIlIlll[A.lllIllIII[86]] = A.llIIIllllIlI("AxsjBy1lMzYKNyQ=", "ErDoY");
        A.lllIlIlll[A.lllIllIII[87]] = A.llIIIllllIll("y6V86Ii3yPFMciv6+fdpf+C7bMXfwVzc", "IQJvE");
        A.lllIlIlll[A.lllIllIII[88]] = A.llIIIllllIll("BOiz7U/J3Qg=", "MuIix");
        A.lllIlIlll[A.lllIllIII[89]] = A.llIIIllllIlI("FSwNFiwfPg==", "qYhzE");
        A.lllIlIlll[A.lllIllIII[90]] = A.llIIIllllIlI("Fgs4OQkoWRYrEiM=", "FyQJf");
        A.lllIlIlll[A.lllIllIII[109]] = A.llIIIllllIlI("ChIHQj1pGwwOBGkKBhdL", "Isibt");
        A.lllIlIlll[A.lllIllIII[110]] = A.llIIIllllIll("5FFSeL5HD8pYjPoFnMKeznQjfB07MtYvRpx2fs5yi9M=", "NgCoL");
        A.lllIlIlll[A.lllIllIII[111]] = A.llIIIllllIll("UQau+BIkwHM=", "bmRBm");
    }

    private static boolean llIIIllllllI(int n2) {
        return n2 != 0;
    }

    static {
        A.llIIIlllllIl();
        A.llIIIlllllII();
        dT = new WorldPoint(lllIllIII[91], lllIllIII[92], lllIllIII[1]);
        dU = new WorldPoint(lllIllIII[93], lllIllIII[94], lllIllIII[1]);
        dV = new WorldPoint(lllIllIII[95], lllIllIII[96], lllIllIII[1]);
        dW = new WorldPoint(lllIllIII[97], lllIllIII[98], lllIllIII[1]);
        dX = new WorldPoint(lllIllIII[99], lllIllIII[100], lllIllIII[1]);
        dY = new WorldPoint(lllIllIII[101], lllIllIII[102], lllIllIII[1]);
        dZ = new WorldPoint(lllIllIII[103], lllIllIII[104], lllIllIII[1]);
        ea = new WorldPoint(lllIllIII[91], lllIllIII[105], lllIllIII[1]);
        eb = new WorldPoint(lllIllIII[106], lllIllIII[107], lllIllIII[1]);
        bx = new ArrayList<d>();
        ec = lllIllIII[30];
        ed = new WorldArea(lllIllIII[93], lllIllIII[108], lllIllIII[26], lllIllIII[47], lllIllIII[1]);
        String[] stringArray = new String[lllIllIII[11]];
        stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[109]];
        stringArray[A.lllIllIII[0]] = lllIlIlll[lllIllIII[110]];
        stringArray[A.lllIllIII[5]] = lllIlIlll[lllIllIII[111]];
        cG = stringArray;
    }

    private static boolean llIIIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (!A.llIIlIIIlIIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || A.llIIlIIIIIIl(e.j(ec), lllIllIII[27])) {
            bl = lllIllIII[0];
            "".length();
            if (((0x7D ^ 0x4E) & ~(0x6D ^ 0x5E) & ~((0x86 ^ 0x8B) & ~(0x6C ^ 0x61))) >= " ".length()) {
                return ((0x6F ^ 0x5F) & ~(0x10 ^ 0x20)) != 0;
            }
        } else {
            bl = lllIllIII[1];
        }
        return bl;
    }

    private static boolean llIIlIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    public static void bq() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation llIllIllllIII;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (A.llIIIllllllI(bv ? 1 : 0)) {
                                                b.a(bx);
                                                if (A.llIIIlllllll(bx.size(), lllIllIII[0])) {
                                                    System.out.println(lllIlIlll[lllIllIII[1]]);
                                                    bv = lllIllIII[1];
                                                }
                                            }
                                            if (!A.llIIlIIIIIII(bv ? 1 : 0)) break block76;
                                            if (A.llIIIlllllll(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2])) {
                                                aq.ea();
                                            }
                                            if (A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2]) && A.llIIIlllllll(Skills.getLevel((Skill)Skill.MAGIC), lllIllIII[3])) {
                                                m.ak();
                                            }
                                            if (!A.llIIlIIIIIII(A.an() ? 1 : 0) || !A.llIIIlllllll(e.j(ec), lllIllIII[0]) || !A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), lllIllIII[2]) || !A.llIIlIIIIIIl(Skills.getLevel((Skill)Skill.MAGIC), lllIllIII[3])) break block77;
                                            llIllIllllIII = BankLocation.getNearest();
                                            if (A.llIIlIIIIIlI(llIllIllllIII) && A.llIIlIIIIIII(llIllIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIlIlll[lllIllIII[0]];
                                                a.a(llIllIllllIII);
                                            }
                                            if (!A.llIIlIIIIIlI(llIllIllllIII) || !A.llIIIllllllI(llIllIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (A.llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIII[4]);
                                                "".length();
                                            }
                                            if (!A.llIIIllllllI(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderGWD.c = lllIlIlll[lllIllIII[5]];
                                            if (A.llIIlIIIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lllIllIII[6]);
                                                "".length();
                                            }
                                            if (A.llIIlIIIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lllIllIII[5]);
                                                "".length();
                                            }
                                            int[] nArray = new int[lllIllIII[0]];
                                            nArray[A.lllIllIII[1]] = lllIllIII[7];
                                            if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[lllIllIII[0]];
                                            nArray2[A.lllIllIII[1]] = lllIllIII[7];
                                            if (!A.llIIlIIIIIIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIllIII[8])) break block79;
                                        }
                                        int[] nArray = new int[lllIllIII[0]];
                                        nArray[A.lllIllIII[1]] = lllIllIII[9];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[lllIllIII[0]];
                                        nArray3[A.lllIllIII[1]] = lllIllIII[9];
                                        if (!A.llIIlIIIIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIII[8])) break block79;
                                    }
                                    int[] nArray = new int[lllIllIII[0]];
                                    nArray[A.lllIllIII[1]] = lllIllIII[10];
                                    if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[lllIllIII[0]];
                                    nArray4[A.lllIllIII[1]] = lllIllIII[10];
                                    if (!A.llIIIlllllll(Bank.getFirst((int[])nArray4).getQuantity(), lllIllIII[8])) break block81;
                                }
                                A.Q();
                                System.out.println(lllIlIlll[lllIllIII[11]]);
                                bv = lllIllIII[0];
                                return;
                            }
                            int[] nArray = new int[lllIllIII[12]];
                            nArray[A.lllIllIII[1]] = lllIllIII[13];
                            nArray[A.lllIllIII[0]] = lllIllIII[7];
                            nArray[A.lllIllIII[5]] = lllIllIII[10];
                            nArray[A.lllIllIII[11]] = lllIllIII[14];
                            nArray[A.lllIllIII[6]] = lllIllIII[15];
                            nArray[A.lllIllIII[16]] = lllIllIII[17];
                            if (A.llIIlIIIIIII(e.d(nArray) ? 1 : 0)) {
                                A.Q();
                                System.out.println(lllIlIlll[lllIllIII[6]]);
                                bv = lllIllIII[0];
                                return;
                            }
                            int[] nArray5 = new int[lllIllIII[12]];
                            nArray5[A.lllIllIII[1]] = lllIllIII[13];
                            nArray5[A.lllIllIII[0]] = lllIllIII[7];
                            nArray5[A.lllIllIII[5]] = lllIllIII[10];
                            nArray5[A.lllIllIII[11]] = lllIllIII[14];
                            nArray5[A.lllIllIII[6]] = lllIllIII[15];
                            nArray5[A.lllIllIII[16]] = lllIllIII[17];
                            if (A.llIIIllllllI(e.d(nArray5) ? 1 : 0)) {
                                while (A.llIIlIIIIIII(H.bT() ? 1 : 0)) {
                                    H.bR();
                                    Time.sleepTicks((int)lllIllIII[0]);
                                    "".length();
                                    "".length();
                                    if (-(130 + 155 - 260 + 171 ^ 192 + 115 - 190 + 76) < 0) continue;
                                    return;
                                }
                                if (A.llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lllIllIII[12]);
                                    "".length();
                                }
                                a.a(lllIllIII[13], lllIllIII[18]);
                                a.a(lllIllIII[14], lllIllIII[11]);
                                a.a(lllIllIII[7], lllIllIII[8]);
                                a.a(lllIllIII[10], lllIllIII[8]);
                                a.a(lllIllIII[17], lllIllIII[11]);
                                a.a(lllIllIII[15], lllIllIII[18]);
                                a.a(lllIllIII[19], lllIllIII[4]);
                            }
                        }
                        if (A.llIIIllllllI(Inventory.contains((int[])f.bc) ? 1 : 0) && A.llIIIlllllll(Movement.getRunEnergy(), lllIllIII[20])) {
                            Inventory.getFirst((int[])f.bc).interact(lllIlIlll[lllIllIII[16]]);
                            Time.sleepTicks((int)lllIllIII[0]);
                            "".length();
                        }
                        if (A.llIIIlllllll(Prayers.getPoints(), lllIllIII[21]) && A.llIIIllllllI(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aZ).interact(lllIlIlll[lllIllIII[12]]);
                        }
                        if (A.llIIIllllllI(A.an() ? 1 : 0) && A.llIIlIIIIIII(e.j(ec))) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[22]];
                                if (A.llIIIllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)dT);
                                "".length();
                                Time.sleepTicks((int)lllIllIII[0]);
                                "".length();
                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                                g.a(lllIlIlll[lllIllIII[23]], cG);
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[0])) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[6]) && A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dV), lllIllIII[6])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[24]];
                                Movement.walkTo((WorldPoint)dU);
                                "".length();
                                Time.sleepTicks((int)lllIllIII[0]);
                                "".length();
                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[12])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[18]];
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[25]];
                                String[] stringArray2 = new String[lllIllIII[0]];
                                stringArray2[A.lllIllIII[1]] = lllIlIlll[lllIllIII[26]];
                                if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lllIllIII[0]];
                                    stringArray3[A.lllIllIII[1]] = lllIlIlll[lllIllIII[3]];
                                    if (A.llIIlIIIIIII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lllIllIII[0]];
                                        stringArray4[A.lllIllIII[1]] = lllIlIlll[lllIllIII[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lllIlIlll[lllIllIII[28]]);
                                        Time.sleepTicks((int)lllIllIII[6]);
                                        "".length();
                                    }
                                }
                                String[] stringArray5 = new String[lllIllIII[0]];
                                stringArray5[A.lllIllIII[1]] = lllIlIlll[lllIllIII[29]];
                                if (A.llIIIllllllI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lllIllIII[0]];
                                    stringArray6[A.lllIllIII[1]] = lllIlIlll[lllIllIII[30]];
                                    String[] stringArray7 = new String[lllIllIII[0]];
                                    stringArray7[A.lllIllIII[1]] = lllIlIlll[lllIllIII[31]];
                                    if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lllIllIII[0]];
                                        stringArray8[A.lllIllIII[1]] = lllIlIlll[lllIllIII[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lllIlIlll[lllIllIII[33]]);
                                        Time.sleepTicks((int)lllIllIII[5]);
                                        "".length();
                                    }
                                    String[] stringArray9 = new String[lllIllIII[0]];
                                    stringArray9[A.lllIllIII[1]] = lllIlIlll[lllIllIII[34]];
                                    String[] stringArray10 = new String[lllIllIII[0]];
                                    stringArray10[A.lllIllIII[1]] = lllIlIlll[lllIllIII[35]];
                                    if (A.llIIIllllllI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lllIllIII[0]];
                                        stringArray11[A.lllIllIII[1]] = lllIlIlll[lllIllIII[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lllIlIlll[lllIllIII[37]]);
                                        Time.sleepTicks((int)lllIllIII[5]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[5])) {
                            int[] nArray = new int[lllIllIII[0]];
                            nArray[A.lllIllIII[1]] = lllIllIII[38];
                            if (A.llIIIllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIllIII[0]];
                                nArray6[A.lllIllIII[1]] = lllIllIII[38];
                                Inventory.getFirst((int[])nArray6).interact(lllIlIlll[lllIllIII[21]]);
                            }
                            int[] nArray7 = new int[lllIllIII[0]];
                            nArray7[A.lllIllIII[1]] = lllIllIII[39];
                            if (A.llIIIllllllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIllIII[0]];
                                nArray8[A.lllIllIII[1]] = lllIllIII[39];
                                Inventory.getFirst((int[])nArray8).interact(lllIlIlll[lllIllIII[40]]);
                            }
                            if (A.llIIlIIIIIII(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[41]];
                                    Movement.walkTo((WorldPoint)dW);
                                    "".length();
                                    Time.sleepTicks((int)lllIllIII[0]);
                                    "".length();
                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && A.llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIII[0]];
                                    stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlll[lllIllIII[43]]);
                                    Time.sleepTicks((int)lllIllIII[5]);
                                    "".length();
                                }
                            }
                            if (A.llIIIllllllI(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[44]];
                                    Movement.walkTo((WorldPoint)dX);
                                    "".length();
                                    Time.sleepTicks((int)lllIllIII[0]);
                                    "".length();
                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lllIlIlll[lllIllIII[45]], cG);
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[11])) {
                            String[] stringArray = new String[lllIllIII[0]];
                            stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[46]];
                            if (A.llIIlIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[47]];
                                    Movement.walkTo((WorldPoint)ea);
                                    "".length();
                                    Time.sleepTicks((int)lllIllIII[0]);
                                    "".length();
                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[48]], cG);
                                }
                            }
                            String[] stringArray12 = new String[lllIllIII[0]];
                            stringArray12[A.lllIllIII[1]] = lllIlIlll[lllIllIII[49]];
                            if (A.llIIIllllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[50]];
                                if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                                    AccBuilderGWD.c = lllIlIlll[lllIllIII[51]];
                                    Movement.walkTo((WorldPoint)dX);
                                    "".length();
                                    Time.sleepTicks((int)lllIllIII[0]);
                                    "".length();
                                }
                                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[52]], cG);
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[16])) {
                            if (A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                                AccBuilderGWD.c = lllIlIlll[lllIllIII[53]];
                                Movement.walkTo((WorldPoint)eb);
                                "".length();
                                Time.sleepTicks((int)lllIllIII[0]);
                                "".length();
                            }
                            if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11]) && A.llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && A.llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (A.llIIIllllllI(tileObject.getName().contains(lllIlIlll[lllIllIII[90]]) ? 1 : 0) && A.llIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                                        n2 = lllIllIII[0];
                                        "".length();
                                        if (" ".length() <= 0) {
                                            return ("  ".length() & ~"  ".length()) != 0;
                                        }
                                    } else {
                                        n2 = lllIllIII[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lllIllIII[5]);
                                "".length();
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[12])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[55]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lllIllIII[0]];
                                    stringArray13[A.lllIllIII[1]] = lllIlIlll[lllIllIII[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lllIlIlll[lllIllIII[57]]);
                                    Time.sleepTicks((int)lllIllIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[23]) && A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                            g.a(lllIlIlll[lllIllIII[58]], cG);
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[24])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            String[] stringArray = new String[lllIllIII[0]];
                            stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[2]];
                            if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lllIllIII[0]];
                                stringArray14[A.lllIllIII[1]] = lllIlIlll[lllIllIII[59]];
                                if (A.llIIlIIIIlIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIllIII[16])) {
                                    g.a(lllIlIlll[lllIllIII[60]], cG);
                                }
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lllIllIII[0]];
                                stringArray15[A.lllIllIII[1]] = lllIlIlll[lllIllIII[61]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lllIllIII[0]];
                                    stringArray16[A.lllIllIII[1]] = lllIlIlll[lllIllIII[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lllIlIlll[lllIllIII[20]]);
                                    Time.sleepTicks((int)lllIllIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (A.llIIlIIIIllI(e.j(ec), lllIllIII[18])) {
                            if (A.llIIlIIIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.llIIlIIIIIII(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.llIIlIIIIlll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lllIllIII[0]];
                                stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[63]];
                                if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lllIllIII[0]];
                                    stringArray17[A.lllIllIII[1]] = lllIlIlll[lllIllIII[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lllIlIlll[lllIllIII[65]]);
                                    Time.sleepTicks((int)lllIllIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (A.llIIlIIIlIII(e.j(ec), lllIllIII[25]) && !A.llIIlIIIIllI(e.j(ec), lllIllIII[26])) break block82;
                        String[] stringArray = new String[lllIllIII[0]];
                        stringArray[A.lllIllIII[1]] = lllIlIlll[lllIllIII[66]];
                        if (A.llIIlIIIIIlI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lllIllIII[0]];
                            nArray[A.lllIllIII[1]] = lllIllIII[13];
                            Inventory.getFirst((int[])nArray).interact(lllIlIlll[lllIllIII[67]]);
                            Time.sleepTicks((int)lllIllIII[16]);
                            "".length();
                        }
                        llIllIllllIII = new WorldPoint(lllIllIII[68], lllIllIII[69], lllIllIII[1]);
                        if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(b.K), lllIllIII[70]) && A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[6])) {
                            AccBuilderGWD.c = lllIlIlll[lllIllIII[71]];
                            Movement.walkTo((WorldPoint)llIllIllllIII);
                            "".length();
                            Time.sleepTicks((int)lllIllIII[0]);
                            "".length();
                        }
                        if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[6]) && !A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[54])) break block83;
                        if (!A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) break block84;
                        String[] stringArray18 = new String[lllIllIII[0]];
                        stringArray18[A.lllIllIII[1]] = lllIlIlll[lllIllIII[72]];
                        if (!A.llIIlIIIIlll(NPCs.getNearest((String[])stringArray18)) || !A.llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIllllIII), lllIllIII[70])) break block84;
                    }
                    WorldArea llIllIlllIlll = new WorldArea(lllIllIII[73], lllIllIII[74], lllIllIII[43], lllIllIII[37], lllIllIII[1]);
                    if (A.llIIIlllllll(e.j(lllIllIII[75]), lllIllIII[24]) && A.llIIIllllllI(Equipment.contains(item -> item.getName().contains(lllIlIlll[lllIllIII[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lllIlIlll[lllIllIII[88]])).interact(lllIlIlll[lllIllIII[76]]);
                        Time.sleepTicks((int)lllIllIII[12]);
                        "".length();
                    }
                    if (A.llIIIllllllI(llIllIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llIllIlllIllI = new WorldPoint(lllIllIII[77], lllIllIII[78], lllIllIII[1]);
                        Movement.walkTo((WorldPoint)llIllIlllIllI);
                        "".length();
                        Time.sleepTicks((int)lllIllIII[0]);
                        "".length();
                    }
                    if (A.llIIlIIIIIII(llIllIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dT);
                        "".length();
                        Time.sleepTicks((int)lllIllIII[0]);
                        "".length();
                    }
                }
                if (A.llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                    if (A.llIIIlllllll(dk, lllIllIII[0])) {
                        as.ng += lllIllIII[0];
                        as.u(AccBuilderGWD.m);
                        dk += lllIllIII[0];
                        as.ng = lllIllIII[1];
                        dl = lllIllIII[1];
                    }
                    g.a(lllIlIlll[lllIllIII[79]], cG);
                }
            }
            g.a(cG);
        }
    }

    private static String llIIIllllIIl(String llIllIlIIlIlI, String llIllIlIIlIIl) {
        try {
            SecretKeySpec llIllIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIlIIllII = Cipher.getInstance("Blowfish");
            llIllIlIIllII.init(lllIllIII[5], llIllIlIIllIl);
            return new String(llIllIlIIllII.doFinal(Base64.getDecoder().decode(llIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIIlIll) {
            llIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            A.bq();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() >= "   ".length()) {
            return (0x7A ^ 0x4A) & ~(0x15 ^ 0x25);
        }
        return lllIllIII[85];
    }

    private static boolean llIIlIIIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIIIIlll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean ae() {
        return lllIllIII[1];
    }

    private static boolean llIIlIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIlllllIl() {
        lllIllIII = new int[113];
        A.lllIllIII[0] = " ".length();
        A.lllIllIII[1] = (0x2A ^ 1) & ~(0x2F ^ 4);
        A.lllIllIII[2] = 0x64 ^ 0x3B ^ (0xC8 ^ 0xBA);
        A.lllIllIII[3] = 0x74 ^ 0x79;
        A.lllIllIII[4] = 0xFFFFFBFA & 0x178D;
        A.lllIllIII[5] = "  ".length();
        A.lllIllIII[6] = 0xDB ^ 0xBE ^ (0x5B ^ 0x3A);
        A.lllIllIII[7] = -(0xFFFFFFD2 & 0x157F) & (0xFFFFBF7F & 0x57FF);
        A.lllIllIII[8] = 0xFFFF8FEC & 0x73FB;
        A.lllIllIII[9] = -(0xFFFF8DEB & 0x7BD7) & (0xFFFF8BEF & Short.MAX_VALUE);
        A.lllIllIII[10] = -(0xFFFFF4CB & 0x2F35) & (0xFFFFB6FA & 0x6F2F);
        A.lllIllIII[11] = "   ".length();
        A.lllIllIII[12] = 44 + 96 - 51 + 91 ^ 127 + 37 - 105 + 119;
        A.lllIllIII[13] = -" ".length() & (0xFFFFBFCF & 0x5F77);
        A.lllIllIII[14] = 0xFFFFF37B & 0x3DD5;
        A.lllIllIII[15] = -(0xFFFFBDB5 & 0x6E6B) & (0xFFFFBDBF & 0x6FE1);
        A.lllIllIII[16] = 0x9A ^ 0xA5 ^ (0x5F ^ 0x65);
        A.lllIllIII[17] = -(0xFFFF9F5B & 0x74ED) & (0xFFFFDDDA & 0x3FEF);
        A.lllIllIII[18] = 0xA0 ^ 0xAA;
        A.lllIllIII[19] = -(0xFFFFFB7F & 0x2481) & (0xFFFFEFEF & 0x33F3);
        A.lllIllIII[20] = 0x7D ^ 0x4F;
        A.lllIllIII[21] = 0xB ^ 0x12;
        A.lllIllIII[22] = 145 + 95 - 163 + 101 ^ 44 + 19 - -90 + 28;
        A.lllIllIII[23] = 0x5A ^ 0x52;
        A.lllIllIII[24] = 0x42 ^ 0x4B;
        A.lllIllIII[25] = 98 + 111 - 24 + 4 ^ 146 + 99 - 76 + 13;
        A.lllIllIII[26] = 0x12 ^ 0x47 ^ (0xC1 ^ 0x98);
        A.lllIllIII[27] = 6 + 22 - -18 + 131 ^ 4 + 51 - -26 + 110;
        A.lllIllIII[28] = 106 + 112 - 149 + 82 ^ 38 + 13 - 23 + 124;
        A.lllIllIII[29] = 1 + 127 - 5 + 9 ^ 39 + 139 - 62 + 32;
        A.lllIllIII[30] = 0x6D ^ 0x7C;
        A.lllIllIII[31] = 0xE ^ 0x1C;
        A.lllIllIII[32] = 0x41 ^ 0x52;
        A.lllIllIII[33] = 0x3E ^ 0x2A;
        A.lllIllIII[34] = 0x3A ^ 0x36 ^ (0x52 ^ 0x4B);
        A.lllIllIII[35] = 0xB0 ^ 0xA6;
        A.lllIllIII[36] = 102 + 21 - 38 + 73 ^ 4 + 27 - 21 + 127;
        A.lllIllIII[37] = 0xB ^ 0x63 ^ (0x4D ^ 0x3D);
        A.lllIllIII[38] = 0x81 ^ 0xC6 ^ (0x50 ^ 0x5C);
        A.lllIllIII[39] = 0xDE ^ 0xA8 ^ (0xA4 ^ 0x98);
        A.lllIllIII[40] = 0x8B ^ 0x91;
        A.lllIllIII[41] = 0x55 ^ 0x4E;
        A.lllIllIII[42] = 0xBD ^ 0xA1;
        A.lllIllIII[43] = 0x84 ^ 0x8A ^ (0xA5 ^ 0xB6);
        A.lllIllIII[44] = 0x5C ^ 0x42;
        A.lllIllIII[45] = 0x23 ^ 0x3C;
        A.lllIllIII[46] = 0xB9 ^ 0x99;
        A.lllIllIII[47] = 0x41 ^ 0x60;
        A.lllIllIII[48] = 0x48 ^ 0x16 ^ (0xC1 ^ 0xBD);
        A.lllIllIII[49] = 0xAC ^ 0x8F;
        A.lllIllIII[50] = 0xAF ^ 0xBA ^ (0xA6 ^ 0x97);
        A.lllIllIII[51] = 0x7A ^ 0x5F ^ (0xA1 ^ 0xB8) & ~(0x63 ^ 0x7A);
        A.lllIllIII[52] = 0x1D ^ 0x3B;
        A.lllIllIII[53] = 103 + 111 - 73 + 11 ^ 129 + 49 - 110 + 123;
        A.lllIllIII[54] = 0x25 ^ 0xD;
        A.lllIllIII[55] = 0xE ^ 0x23 ^ (0xA5 ^ 0xA1);
        A.lllIllIII[56] = 0x87 ^ 0xA3 ^ (0x6C ^ 0x62);
        A.lllIllIII[57] = 0x7C ^ 0x57;
        A.lllIllIII[58] = 0xB ^ 0x27;
        A.lllIllIII[59] = 0x89 ^ 0xA7;
        A.lllIllIII[60] = 9 ^ 0x2A ^ (0x99 ^ 0x95);
        A.lllIllIII[61] = 165 + 147 - 192 + 57 ^ 7 + 35 - 24 + 111;
        A.lllIllIII[62] = 0x86 ^ 0x8A ^ (7 ^ 0x3A);
        A.lllIllIII[63] = 0xE5 ^ 0xBC ^ (8 ^ 0x62);
        A.lllIllIII[64] = 0x7F ^ 0x28 ^ (0xEE ^ 0x8D);
        A.lllIllIII[65] = 106 + 11 - 77 + 113 ^ 102 + 70 - 67 + 67;
        A.lllIllIII[66] = 0x9E ^ 0xA8;
        A.lllIllIII[67] = 0x7B ^ 0x4C;
        A.lllIllIII[68] = -(0xFFFFB3AF & 0x5FDA) & (0xFFFFDFFD & 0x3FFB);
        A.lllIllIII[69] = -(0xFFFFF19F & 0x4E6D) & (0xFFFFEFBF & 0x5DFF);
        A.lllIllIII[70] = (0x32 ^ 0x79) + (0xDE ^ 0x8E) - (0x38 ^ 0x16) + (0x48 ^ 0x61);
        A.lllIllIII[71] = 0xA9 ^ 0x91;
        A.lllIllIII[72] = 0x85 ^ 0x91 ^ (0x84 ^ 0xA9);
        A.lllIllIII[73] = -(0xFFFFF4E7 & 0x7B5F) & (0xFFFFFDF7 & 0x7BCE);
        A.lllIllIII[74] = 0xFFFFBCE7 & 0x4F1F;
        A.lllIllIII[75] = 0xFA ^ 0x95;
        A.lllIllIII[76] = 0xA1 ^ 0x9B;
        A.lllIllIII[77] = -(0xFFFF878D & 0x7E7F) & (0xFFFF8FED & 0x7FBF);
        A.lllIllIII[78] = 0xFFFFDCBB & 0x2F45;
        A.lllIllIII[79] = 0xB2 ^ 0x89;
        A.lllIllIII[80] = -(0xFFFFE99B & 0x7EE7) & (0xFFFFFDFE & 0x6FFB);
        A.lllIllIII[81] = -(0xFFFFFFEC & 0x5017) & (0xFFFFFEEF & 0x7FDF);
        A.lllIllIII[82] = 0xFFFFE7F8 & 0x79AF;
        A.lllIllIII[83] = 0xFFFFBEDD & 0x73EA;
        A.lllIllIII[84] = 0xFFFFE3A7 & 0x1FDC;
        A.lllIllIII[85] = 0x4E ^ 8 ^ (0xB0 ^ 0x92);
        A.lllIllIII[86] = 0x96 ^ 0xAA;
        A.lllIllIII[87] = 0x12 ^ 0x39 ^ (0x81 ^ 0x97);
        A.lllIllIII[88] = 0x40 ^ 0x7E;
        A.lllIllIII[89] = 0x68 ^ 0x57;
        A.lllIllIII[90] = 6 ^ 0x46;
        A.lllIllIII[91] = -" ".length() & (0xFFFFDAE7 & 0x2F1F);
        A.lllIllIII[92] = -(0xFFFFFFF3 & 0x318E) & (0xFFFFFDFF & 0x3FFF);
        A.lllIllIII[93] = 0xFFFFAAFC & 0x5F33;
        A.lllIllIII[94] = -(0xFFFFAD63 & 0x739D) & (0xFFFFBF75 & 0x6DFF);
        A.lllIllIII[95] = 0xFFFFCAF5 & 0x3F3F;
        A.lllIllIII[96] = 0xFFFFBEFE & 0x4D77;
        A.lllIllIII[97] = -(0xFFFFA5D2 & 0x7FEF) & (0xFFFFFFFB & 0x2FFD);
        A.lllIllIII[98] = -(52 + 40 - -11 + 26) & (0xFFFF8EFD & 0x7DE7);
        A.lllIllIII[99] = 0xFFFF8FBF & 0x7A77;
        A.lllIllIII[100] = -(0xFFFFFDFB & 0x33AD) & (0xFFFFBFFE & 0x7DEF);
        A.lllIllIII[101] = -(0xFFFFE479 & 0x3FE7) & (0xFFFFBF7A & 0x6EFF);
        A.lllIllIII[102] = -(0xFFFFEFB7 & 0x70DB) & (0xFFFFFCF6 & 0x6FDF);
        A.lllIllIII[103] = -(0x68 ^ 1) & (0xFFFFAAFF & 0x5F7A);
        A.lllIllIII[104] = -(0xFFFFD33F & 0x3FC7) & (0xFFFFFFFF & 0x1F4E);
        A.lllIllIII[105] = 0xFFFFAE6F & 0x5DD7;
        A.lllIllIII[106] = 0xFFFFFA7E & 0xFBB;
        A.lllIllIII[107] = -(0xFFFFB6B3 & 0x7B6D) & (0xFFFFFFFF & 0x3E7F);
        A.lllIllIII[108] = 0xFFFFDCE7 & 0x2F5B;
        A.lllIllIII[109] = 0x28 ^ 0x7A ^ (0x54 ^ 0x47);
        A.lllIllIII[110] = 0xF5 ^ 0xB7;
        A.lllIllIII[111] = 229 + 99 - 225 + 146 ^ 11 + 45 - -105 + 25;
        A.lllIllIII[112] = 0xA5 ^ 0xB3 ^ (0xF ^ 0x5D);
    }

    @Override
    public String ag() {
        return lllIlIlll[lllIllIII[86]];
    }

    private static void Q() {
        block35: {
            d llIllIllIlllI;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object llIllIllIllll;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lllIllIII[0]];
                                                                nArray[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lllIllIII[0]];
                                                                nArray2[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lllIllIII[0]];
                                                                nArray3[A.lllIllIII[1]] = lllIllIII[9];
                                                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIII[8])) break block23;
                                                            }
                                                            llIllIllIllll = new d(lllIllIII[9], lllIllIII[8], lllIllIII[18]);
                                                            bx.add((d)llIllIllIllll);
                                                            "".length();
                                                        }
                                                        int[] nArray = new int[lllIllIII[0]];
                                                        nArray[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lllIllIII[0]];
                                                        nArray4[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lllIllIII[0]];
                                                        nArray5[A.lllIllIII[1]] = lllIllIII[7];
                                                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray5).getQuantity(), lllIllIII[8])) break block25;
                                                    }
                                                    llIllIllIllll = new d(lllIllIII[7], lllIllIII[8], lllIllIII[18]);
                                                    bx.add((d)llIllIllIllll);
                                                    "".length();
                                                }
                                                int[] nArray = new int[lllIllIII[0]];
                                                nArray[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lllIllIII[0]];
                                                nArray6[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lllIllIII[0]];
                                                nArray7[A.lllIllIII[1]] = lllIllIII[10];
                                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray7).getQuantity(), lllIllIII[8])) break block27;
                                            }
                                            llIllIllIllll = new d(lllIllIII[10], lllIllIII[8], lllIllIII[18]);
                                            bx.add((d)llIllIllIllll);
                                            "".length();
                                        }
                                        int[] nArray = new int[lllIllIII[0]];
                                        nArray[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lllIllIII[0]];
                                        nArray8[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIllllllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lllIllIII[0]];
                                        nArray9[A.lllIllIII[1]] = lllIllIII[15];
                                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray9).getQuantity(), lllIllIII[28])) break block29;
                                    }
                                    llIllIllIllll = new d(lllIllIII[15], lllIllIII[33], lllIllIII[80]);
                                    bx.add((d)llIllIllIllll);
                                    "".length();
                                }
                                if (A.llIIlIIIIIII(Bank.contains((Predicate)(llIllIllIllll = item -> item.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]))) ? 1 : 0)) {
                                    llIllIllIlllI = new d(lllIllIII[81], lllIllIII[16], lllIllIII[82]);
                                    bx.add(llIllIllIlllI);
                                    "".length();
                                }
                                int[] nArray = new int[lllIllIII[0]];
                                nArray[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lllIllIII[0]];
                                nArray10[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIllllllI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lllIllIII[0]];
                                nArray11[A.lllIllIII[1]] = lllIllIII[14];
                                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray11).getQuantity(), lllIllIII[6])) break block31;
                            }
                            llIllIllIlllI = new d(lllIllIII[14], lllIllIII[6], j.ch);
                            bx.add(llIllIllIlllI);
                            "".length();
                        }
                        int[] nArray = new int[lllIllIII[0]];
                        nArray[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lllIllIII[0]];
                        nArray12[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIllllllI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lllIllIII[0]];
                        nArray13[A.lllIllIII[1]] = lllIllIII[17];
                        if (!A.llIIIlllllll(Bank.getFirst((int[])nArray13).getQuantity(), lllIllIII[5])) break block33;
                    }
                    llIllIllIlllI = new d(lllIllIII[17], lllIllIII[11], lllIllIII[83]);
                    bx.add(llIllIllIlllI);
                    "".length();
                }
                int[] nArray = new int[lllIllIII[0]];
                nArray[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lllIllIII[0]];
                nArray14[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIllllllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lllIllIII[0]];
                nArray15[A.lllIllIII[1]] = lllIllIII[13];
                if (!A.llIIIlllllll(Bank.getFirst((int[])nArray15).getQuantity(), lllIllIII[28])) break block35;
            }
            llIllIllIlllI = new d(lllIllIII[13], lllIllIII[54], lllIllIII[84]);
            bx.add(llIllIllIlllI);
            "".length();
        }
    }

    private static boolean llIIlIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIIIIIII(int n2) {
        return n2 == 0;
    }

    private static String llIIIllllIll(String llIllIIllllIl, String llIllIIlllIlI) {
        try {
            SecretKeySpec llIllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIlllIlI.getBytes(StandardCharsets.UTF_8)), lllIllIII[23]), "DES");
            Cipher llIllIIllllll = Cipher.getInstance("DES");
            llIllIIllllll.init(lllIllIII[5], llIllIlIIIIII);
            return new String(llIllIIllllll.doFinal(Base64.getDecoder().decode(llIllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIlllllI) {
            llIllIIlllllI.printStackTrace();
            return null;
        }
    }
}

