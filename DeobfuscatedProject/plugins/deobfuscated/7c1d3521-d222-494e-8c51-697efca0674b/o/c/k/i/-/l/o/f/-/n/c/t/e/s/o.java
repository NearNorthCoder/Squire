/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;

public class o
implements ac {
    public static /* synthetic */ WorldPoint cx;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldPoint cp;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ WorldPoint cn;
    private static /* synthetic */ String[] llIllIllll;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ String[] cE;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ int cH;
    private static /* synthetic */ int[] llIlllIIIl;
    public static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ int cG;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cA;
    public static /* synthetic */ WorldPoint cu;
    static /* synthetic */ int cI;
    public static /* synthetic */ long cD;
    public static /* synthetic */ WorldPoint ct;
    public static /* synthetic */ WorldPoint cy;
    public static /* synthetic */ WorldPoint cz;
    public static /* synthetic */ WorldArea cF;

    private static boolean lIlllIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIlllIIIlllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIIlIIIII(int n2) {
        return n2 >= 0;
    }

    @Override
    public boolean ah() {
        int n2;
        if (o.lIlllIIlIIIlI(Skills.getLevel((Skill)Skill.RANGED), llIlllIIIl[35]) && o.lIlllIIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIlllIIIl[35])) {
            n2 = llIlllIIIl[0];
            0;
            if (-1 > 0) {
                return ((139 + 123 - 224 + 107 ^ 156 + 110 - 226 + 134) & (0x14 ^ 0x7F ^ (0xD0 ^ 0x84) ^ -1)) != 0;
            }
        } else {
            n2 = llIlllIIIl[1];
        }
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIllIllll[llIlllIIIl[34]];
    }

    private static int lIlllIIIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static void aD() {
        if (o.lIlllIIIlIlIl(cH, llIlllIIIl[0])) {
            cD = System.currentTimeMillis();
            System.out.println(llIllIllll[llIlllIIIl[1]]);
            cH += llIlllIIIl[0];
        }
        int[] nArray = new int[llIlllIIIl[0]];
        nArray[o.llIlllIIIl[1]] = llIlllIIIl[2];
        if (o.lIlllIIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            BankLocation llllllllllllllllllIIIIllIlIIllIl = BankLocation.getNearest();
            if (o.lIlllIIIlIlll(llllllllllllllllllIIIIllIlIIllIl) && o.lIlllIIIlIllI(llllllllllllllllllIIIIllIlIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[0]];
                a.a(llllllllllllllllllIIIIllIlIIllIl);
            }
            if (o.lIlllIIIlIlll(llllllllllllllllllIIIIllIlIIllIl) && o.lIlllIIIllIII(llllllllllllllllllIIIIllIlIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[3]];
                if (o.lIlllIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllIIIl[4]);
                    0;
                }
                if (o.lIlllIIIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (o.lIlllIIIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIlllIIIl[0]);
                        0;
                    }
                    a.a(llIlllIIIl[2], llIlllIIIl[5]);
                    a.a(llIlllIIIl[6], llIlllIIIl[0]);
                    a.a(llIlllIIIl[7], llIlllIIIl[8]);
                }
            }
        }
        int[] nArray2 = new int[llIlllIIIl[0]];
        nArray2[o.llIlllIIIl[1]] = llIlllIIIl[2];
        if (o.lIlllIIIllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            o.aE();
        }
    }

    @Override
    public int af() {
        try {
            o.aD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xBF ^ 0x9E ^ (0xF ^ 0x2A)) < 0) {
            return (0xC ^ 0x56 ^ (0x6E ^ 0x1E)) & (17 + 44 - -65 + 25 ^ 72 + 79 - 112 + 150 ^ -1);
        }
        return llIlllIIIl[33];
    }

    /*
     * WARNING - void declaration
     */
    public static void aH() {
        void llllllllllllllllllIIIIllIIlIlIIl;
        int n2 = e.c(llIlllIIIl[0], llIlllIIIl[13]);
        if (o.lIlllIIlIIIIl(n2, llIlllIIIl[0])) {
            cC = cm;
            cs = cn;
        }
        if (o.lIlllIIlIIIIl((int)llllllllllllllllllIIIIllIIlIlIIl, llIlllIIIl[3])) {
            cC = ct;
            cs = cu;
        }
        if (o.lIlllIIlIIIIl((int)llllllllllllllllllIIIIllIIlIlIIl, llIlllIIIl[10])) {
            cC = cv;
            cs = cw;
        }
        if (o.lIlllIIlIIIIl((int)llllllllllllllllllIIIIllIIlIlIIl, llIlllIIIl[12])) {
            cC = cx;
            cs = cy;
        }
        if (o.lIlllIIlIIIIl((int)llllllllllllllllllIIIIllIIlIlIIl, llIlllIIIl[13])) {
            cC = cz;
            cs = cA;
        }
    }

    private static boolean lIlllIIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlllIIIlIIll() {
        llIllIllll = new String[llIlllIIIl[67]];
        o.llIllIllll[o.llIlllIIIl[1]] = o."reset aggro timer";
        o.llIllIllll[o.llIlllIIIl[0]] = o."Navigating to bank";
        o.llIllIllll[o.llIlllIIIl[3]] = o."Handling banking";
        o.llIllIllll[o.llIlllIIIl[10]] = o."Nav to sand crabs";
        o.llIllIllll[o.llIlllIIIl[12]] = o."Drink";
        o.llIllIllll[o.llIlllIIIl[13]] = o."Nav to veos";
        o.llIllIllll[o.llIlllIIIl[14]] = o."Handle veos chat";
        o.llIllIllll[o.llIlllIIIl[15]] = o."Veos";
        o.llIllIllll[o.llIlllIIIl[16]] = o."Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[17]] = o."Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[8]] = o."Port Piscarilius";
        o.llIllIllll[o.llIlllIIIl[18]] = o."Veos";
        o.llIllIllll[o.llIlllIIIl[19]] = o."Eat";
        o.llIllIllll[o.llIlllIIIl[20]] = o."Afking in spot";
        o.llIllIllll[o.llIlllIIIl[21]] = o."Being crashed";
        o.llIllIllll[o.llIlllIIIl[22]] = o."Attacking crashed";
        o.llIllIllll[o.llIlllIIIl[23]] = o."Attack";
        o.llIllIllll[o.llIlllIIIl[30]] = o."Resetting";
        o.llIllIllll[o.llIlllIIIl[34]] = o."Sand Crabs";
        o.llIllIllll[o.llIlllIIIl[36]] = o."sand crab";
        o.llIllIllll[o.llIlllIIIl[60]] = o."That's great, can you take me there please?";
        o.llIllIllll[o.llIlllIIIl[61]] = o."Can you take me to Great Kourend?";
        o.llIllIllll[o.llIlllIIIl[62]] = o."Goodbye.";
    }

    private static String lIlllIIIlIIlI(String llllllllllllllllllIIIIlIlllllIII, String llllllllllllllllllIIIIlIllllIlll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIlIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIlIllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIlIllllllII.init(llIlllIIIl[3], llllllllllllllllllIIIIlIllllllIl);
            return new String(llllllllllllllllllIIIIlIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIlIlllllIll) {
            llllllllllllllllllIIIIlIlllllIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean aG() {
        WorldArea worldArea = new WorldArea(cC, llIlllIIIl[10], llIlllIIIl[10]);
        List list = Players.getAll();
        if (o.lIlllIIIlIllI(list.isEmpty() ? 1 : 0) && o.lIlllIIIlllIl(list.size(), llIlllIIIl[0])) {
            void llllllllllllllllllIIIIllIIlIllII;
            int llllllllllllllllllIIIIllIIlIlIll = llIlllIIIl[1];
            while (o.lIlllIIIlIlIl(llllllllllllllllllIIIIllIIlIlIll, llllllllllllllllllIIIIllIIlIllII.size())) {
                void llllllllllllllllllIIIIllIIlIllIl;
                if (o.lIlllIIIllIII(((Player)llllllllllllllllllIIIIllIIlIllII.get(llllllllllllllllllIIIIllIIlIlIll)).equals(Players.getLocal()) ? 1 : 0)) {
                    0;
                    if (((0xB ^ 0x4F ^ (0x42 ^ 0x56)) & (1 ^ (0x72 ^ 0x23) ^ -1)) >= (0xBE ^ 0x99 ^ (0x85 ^ 0xA6))) {
                        return ((138 + 83 - 161 + 95 ^ 81 + 143 - 73 + 36) & (0x7E ^ 0x3C ^ (0x42 ^ 0x20) ^ -1)) != 0;
                    }
                } else if (o.lIlllIIIllIII(llllllllllllllllllIIIIllIIlIllIl.contains(((Player)llllllllllllllllllIIIIllIIlIllII.get(llllllllllllllllllIIIIllIIlIlIll)).getWorldLocation()) ? 1 : 0)) {
                    return llIlllIIIl[0];
                }
                ++llllllllllllllllllIIIIllIIlIlIll;
                0;
                if (null == null) continue;
                return ((0x8B ^ 0x84) & ~(1 ^ 0xE)) != 0;
            }
        }
        return llIlllIIIl[1];
    }

    private static boolean lIlllIIIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlllIIIlIIII(String llllllllllllllllllIIIIllIIIlllll, String llllllllllllllllllIIIIllIIIlllII) {
        try {
            SecretKeySpec llllllllllllllllllIIIIllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIllIIIlllII.getBytes(StandardCharsets.UTF_8)), llIlllIIIl[16]), "DES");
            Cipher llllllllllllllllllIIIIllIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllllIIIIllIIlIIIIl.init(llIlllIIIl[3], llllllllllllllllllIIIIllIIlIIIlI);
            return new String(llllllllllllllllllIIIIllIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIllIIlIIIII) {
            llllllllllllllllllIIIIllIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIIIl(String llllllllllllllllllIIIIllIIIIlIlI, String llllllllllllllllllIIIIllIIIIlIIl) {
        llllllllllllllllllIIIIllIIIIlIlI = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIllIIIIllIl = new StringBuilder();
        char[] llllllllllllllllllIIIIllIIIIllII = llllllllllllllllllIIIIllIIIIlIIl.toCharArray();
        int llllllllllllllllllIIIIllIIIIlIll = llIlllIIIl[1];
        char[] llllllllllllllllllIIIIllIIIIIlIl = llllllllllllllllllIIIIllIIIIlIlI.toCharArray();
        int llllllllllllllllllIIIIllIIIIIlII = llllllllllllllllllIIIIllIIIIIlIl.length;
        int llllllllllllllllllIIIIllIIIIIIll = llIlllIIIl[1];
        while (o.lIlllIIIlIlIl(llllllllllllllllllIIIIllIIIIIIll, llllllllllllllllllIIIIllIIIIIlII)) {
            char llllllllllllllllllIIIIllIIIlIIII = llllllllllllllllllIIIIllIIIIIlIl[llllllllllllllllllIIIIllIIIIIIll];
            llllllllllllllllllIIIIllIIIIllIl.append((char)(llllllllllllllllllIIIIllIIIlIIII ^ llllllllllllllllllIIIIllIIIIllII[llllllllllllllllllIIIIllIIIIlIll % llllllllllllllllllIIIIllIIIIllII.length]));
            0;
            ++llllllllllllllllllIIIIllIIIIlIll;
            ++llllllllllllllllllIIIIllIIIIIIll;
            0;
            if (-1 <= ((0x25 ^ 0x28) & ~(0x36 ^ 0x3B))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIllIIIIllIl);
    }

    private static int lIlllIIIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlllIIIlllII(int n2) {
        return n2 < 0;
    }

    private static void lIlllIIIlIlII() {
        llIlllIIIl = new int[68];
        o.llIlllIIIl[0] = 1;
        o.llIlllIIIl[1] = (0x55 ^ 0x6B) & ~(0x90 ^ 0xAE);
        o.llIlllIIIl[2] = 0xFFFFF37F & 0xDFB;
        o.llIlllIIIl[3] = 2;
        o.llIlllIIIl[4] = -(0xFFFFF17B & 0x2EB7) & (0xFFFFB7BA & 0x7BFF);
        o.llIlllIIIl[5] = 189 + 74 - 168 + 124 ^ 99 + 46 - 48 + 98;
        o.llIlllIIIl[6] = -(0xFFFFDEED & 0x6FBB) & (0xFFFFFFF9 & Short.MAX_VALUE);
        o.llIlllIIIl[7] = 0xFFFFDF5F & 0x3FE9;
        o.llIlllIIIl[8] = 0x7B ^ 0x71;
        o.llIlllIIIl[9] = -(0xFFFFFDDF & 0x523B) & (0xFFFFF7DE & 0x97FFB);
        o.llIlllIIIl[10] = 3;
        o.llIlllIIIl[11] = 0x6D ^ 0x4A ^ (0x49 ^ 0x28);
        o.llIlllIIIl[12] = 9 ^ 0xD;
        o.llIlllIIIl[13] = 0xA1 ^ 0xA4;
        o.llIlllIIIl[14] = 0x53 ^ 0x55;
        o.llIlllIIIl[15] = 0x91 ^ 0xB4 ^ (0x58 ^ 0x7A);
        o.llIlllIIIl[16] = 0x19 ^ 0x33 ^ (0xA8 ^ 0x8A);
        o.llIlllIIIl[17] = 0x26 ^ 0x2F;
        o.llIlllIIIl[18] = 0x19 ^ 0x3C ^ (4 ^ 0x2A);
        o.llIlllIIIl[19] = 154 + 74 - 201 + 157 ^ 70 + 1 - 40 + 149;
        o.llIlllIIIl[20] = 0x3D ^ 0x30;
        o.llIlllIIIl[21] = 0x4E ^ 0x40;
        o.llIlllIIIl[22] = 0xBF ^ 0xB0;
        o.llIlllIIIl[23] = 0xAA ^ 0x9D ^ (0x92 ^ 0xB5);
        o.llIlllIIIl[24] = -(0xFFFFF77B & 0x2C85) & (0xFFFFAFBF & 0x7FFC);
        o.llIlllIIIl[25] = 0xFFFF8DAE & 0x7EF1;
        o.llIlllIIIl[26] = 0x6C ^ 0x2D;
        o.llIlllIIIl[27] = 0x8D ^ 0xAA;
        o.llIlllIIIl[28] = -(0xFFFFFD67 & 0x769B) & (0xFFFFFFFF & 0x7FEF);
        o.llIlllIIIl[29] = 0xFFFF9DBF & 0x6EEF;
        o.llIlllIIIl[30] = 0xAB ^ 0xBA;
        o.llIlllIIIl[31] = 0xFFFFBFDD & 0x7ABA;
        o.llIlllIIIl[32] = -(0xFFFFEABD & 0x1747) & (0xFFFFF7FE & 0x7F35);
        o.llIlllIIIl[33] = 0xA ^ 0x3C ^ (0x34 ^ 0x66);
        o.llIlllIIIl[34] = 0x5D ^ 0x4F;
        o.llIlllIIIl[35] = 0x4A ^ 0x47 ^ (0x3F ^ 0x51);
        o.llIlllIIIl[36] = 0 ^ 0x3B ^ (0x1A ^ 0x32);
        o.llIlllIIIl[37] = 0xFFFFCFF5 & 0x36FA;
        o.llIlllIIIl[38] = 0xFFFFBFFC & 0x4D8F;
        o.llIlllIIIl[39] = -(0xFFFFF67E & 0x59DF) & (0xFFFFD7FF & 0x7F5D);
        o.llIlllIIIl[40] = -(0xFFFF910F & 0x7EF4) & (0xFFFF9DBF & 0x7FF7);
        o.llIlllIIIl[41] = -(0xFFFFC767 & 0x79BD) & (0xFFFFFFEF & 0x47FD);
        o.llIlllIIIl[42] = -(0xFFFFF165 & 0x3E9B) & (0xFFFFBD9F & 0x7FED);
        o.llIlllIIIl[43] = 0xFFFFD6CC & 0x2FF7;
        o.llIlllIIIl[44] = -(0xFFFFFA87 & 0x277F) & (0xFFFFBFB7 & 0x6FFE);
        o.llIlllIIIl[45] = -(0xFFFFFB07 & 0x7CF9) & (0xFFFFFEFF & 0x7FFE);
        o.llIlllIIIl[46] = 0xFFFF9EFB & 0x67FE;
        o.llIlllIIIl[47] = 0xFFFF8DAF & Short.MAX_VALUE;
        o.llIlllIIIl[48] = 0xFFFFBEF7 & 0x47ED;
        o.llIlllIIIl[49] = -(0xFFFFF44D & 0x7BB3) & (0xFFFFF6E6 & Short.MAX_VALUE);
        o.llIlllIIIl[50] = 0xFFFFFDC3 & 0xFFF;
        o.llIlllIIIl[51] = -(0xFFFFFB7D & 0x35A3) & (0xFFFFBFFD & 0x77F7);
        o.llIlllIIIl[52] = 0xFFFFDEEB & 0x279F;
        o.llIlllIIIl[53] = -(0xFFFFE33A & 0x7EEF) & (0xFFFFFFBF & 0x6FFF);
        o.llIlllIIIl[54] = -(0xFFFFDDDD & 0x6323) & (0xFFFFFFB5 & 0x47FF);
        o.llIlllIIIl[55] = -(0xFFFFF3D5 & 0x1E7B) & (0xFFFFFFDF & 0x1FFB);
        o.llIlllIIIl[56] = -(0xFFFFFF35 & 0x59DB) & (0xFFFFFFFF & 0x5FFD);
        o.llIlllIIIl[57] = -(0xFFFFF27F & 0x7D9B) & (0xFFFFFD9F & Short.MAX_VALUE);
        o.llIlllIIIl[58] = 0xFFFF9BEE & 0x6FFF;
        o.llIlllIIIl[59] = 0xFFFFFFFE & 0xCAF;
        o.llIlllIIIl[60] = 0xAA ^ 0xBE;
        o.llIlllIIIl[61] = 0xD1 ^ 0xC4;
        o.llIlllIIIl[62] = 116 + 9 - 118 + 129 ^ 77 + 39 - 8 + 50;
        o.llIlllIIIl[63] = 0xFFFFA58E & 0x5EFF;
        o.llIlllIIIl[64] = -(0xFFFFF745 & 0x4ABE) & (0xFFFFEF3B & 0x5FFF);
        o.llIlllIIIl[65] = -(0xFFFFF0EB & 0x7FFD) & (0xFFFFF7FF & 0x7BFB);
        o.llIlllIIIl[66] = -(0xFFFFB1AB & 0x5F5D) & (0xFFFF97BF & 0x7BFF);
        o.llIlllIIIl[67] = 0xE3 ^ 0x82 ^ (0x6C ^ 0x1A);
    }

    public static void aE() {
        NPC llllllllllllllllllIIIIllIlIIlIIl;
        WorldArea llllllllllllllllllIIIIllIlIIlIlI;
        if (o.lIlllIIIlllII(o.lIlllIIIllIlI(e.a(cD), llIlllIIIl[9] + cI))) {
            if (o.lIlllIIIlIllI(Players.getLocal().getWorldLocation().equals((Object)cC) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllll[llIlllIIIl[10]];
                if (o.lIlllIIIlIlIl(Movement.getRunEnergy(), llIlllIIIl[11]) && o.lIlllIIIllIII(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.ba).interact(llIllIllll[llIlllIIIl[12]]);
                    Time.sleepTicks((int)llIlllIIIl[0]);
                    0;
                }
                if (o.lIlllIIIlIllI(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (o.lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[13]];
                        Movement.walkTo((WorldPoint)cB);
                        0;
                        Time.sleepTicks((int)llIlllIIIl[0]);
                        0;
                    }
                    if (o.lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cB), llIlllIIIl[10])) {
                        AccBuilderSotf.c = llIllIllll[llIlllIIIl[14]];
                        if (o.lIlllIIIlIlIl(cG, llIlllIIIl[0])) {
                            e.x();
                            cG += llIlllIIIl[0];
                        }
                        String[] stringArray = new String[llIlllIIIl[0]];
                        stringArray[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[15]];
                        llllllllllllllllllIIIIllIlIIlIlI = NPCs.getNearest((String[])stringArray);
                        if (o.lIlllIIIlIlll(llllllllllllllllllIIIIllIlIIlIlI)) {
                            String[] stringArray2 = new String[llIlllIIIl[0]];
                            stringArray2[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[16]];
                            if (o.lIlllIIIllIII(llllllllllllllllllIIIIllIlIIlIlI.hasAction(stringArray2) ? 1 : 0)) {
                                llllllllllllllllllIIIIllIlIIlIlI.interact(llIllIllll[llIlllIIIl[17]]);
                                Time.sleepTicks((int)llIlllIIIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[llIlllIIIl[0]];
                            stringArray3[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[8]];
                            if (o.lIlllIIIlIllI(llllllllllllllllllIIIIllIlIIlIlI.hasAction(stringArray3) ? 1 : 0)) {
                                g.b(llIllIllll[llIlllIIIl[18]], cE);
                                Time.sleepTicks((int)llIlllIIIl[0]);
                                0;
                            }
                        }
                    }
                }
                if (o.lIlllIIIllIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)cC);
                    0;
                    Time.sleepTicks((int)llIlllIIIl[0]);
                    0;
                }
            }
            if (o.lIlllIIIllIII(Players.getLocal().getWorldLocation().equals((Object)cC) ? 1 : 0)) {
                if (o.lIlllIIIlllII(o.lIlllIIIllIll(e.w(), 45.0))) {
                    int[] nArray = new int[llIlllIIIl[0]];
                    nArray[o.llIlllIIIl[1]] = llIlllIIIl[2];
                    if (o.lIlllIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIlllIIIl[0]];
                        nArray2[o.llIlllIIIl[1]] = llIlllIIIl[2];
                        Inventory.getFirst((int[])nArray2).interact(llIllIllll[llIlllIIIl[19]]);
                        Time.sleepTicks((int)llIlllIIIl[0]);
                        0;
                    }
                }
                if (o.lIlllIIIlIllI(o.aG() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[20]];
                    Time.sleepTicks((int)llIlllIIIl[15]);
                    0;
                }
                if (o.lIlllIIIllIII(o.aG() ? 1 : 0)) {
                    llllllllllllllllllIIIIllIlIIlIlI = new WorldArea(cC, llIlllIIIl[3], llIlllIIIl[3]);
                    llllllllllllllllllIIIIllIlIIlIIl = o.aF();
                    AccBuilderSotf.c = llIllIllll[llIlllIIIl[21]];
                    if (o.lIlllIIIlllll(Players.getLocal().getInteracting()) && o.lIlllIIIlIlll(llllllllllllllllllIIIIllIlIIlIIl) && o.lIlllIIIlIllI(llllllllllllllllllIIIIllIlIIlIIl.isDead() ? 1 : 0)) {
                        System.out.println(llIllIllll[llIlllIIIl[22]]);
                        llllllllllllllllllIIIIllIlIIlIIl.interact(llIllIllll[llIlllIIIl[23]]);
                        Time.sleepTicks((int)llIlllIIIl[3]);
                        0;
                    }
                    Time.sleepTicks((int)llIlllIIIl[12]);
                    0;
                }
            }
        }
        if (o.lIlllIIlIIIII(o.lIlllIIIllIlI(e.a(cD), llIlllIIIl[9] + cI))) {
            llllllllllllllllllIIIIllIlIIlIlI = new WorldArea(llIlllIIIl[24], llIlllIIIl[25], llIlllIIIl[26], llIlllIIIl[27], llIlllIIIl[1]);
            llllllllllllllllllIIIIllIlIIlIIl = new WorldPoint(llIlllIIIl[28], llIlllIIIl[29], llIlllIIIl[1]);
            if (o.lIlllIIIllIII(llllllllllllllllllIIIIllIlIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIlllIIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIIIIllIlIIlIIl), llIlllIIIl[13])) {
                Movement.walkTo((WorldPoint)llllllllllllllllllIIIIllIlIIlIIl);
                0;
            }
            AccBuilderSotf.c = llIllIllll[llIlllIIIl[30]];
            Movement.walkTo((WorldPoint)cs);
            0;
            Time.sleepTicks((int)llIlllIIIl[0]);
            0;
            if (o.lIlllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(cs), llIlllIIIl[3])) {
                cD = System.currentTimeMillis();
                cI = e.c(llIlllIIIl[31], llIlllIIIl[32]);
            }
        }
    }

    private static boolean lIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIlIllI(int n2) {
        return n2 == 0;
    }

    static {
        o.lIlllIIIlIlII();
        o.lIlllIIIlIIll();
        cm = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cn = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        co = new WorldPoint(llIlllIIIl[41], llIlllIIIl[42], llIlllIIIl[1]);
        cp = new WorldPoint(llIlllIIIl[43], llIlllIIIl[44], llIlllIIIl[1]);
        cq = new WorldPoint(llIlllIIIl[45], llIlllIIIl[38], llIlllIIIl[1]);
        cr = new WorldPoint(llIlllIIIl[46], llIlllIIIl[47], llIlllIIIl[1]);
        cs = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        ct = new WorldPoint(llIlllIIIl[48], llIlllIIIl[38], llIlllIIIl[1]);
        cu = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cv = new WorldPoint(llIlllIIIl[51], llIlllIIIl[42], llIlllIIIl[1]);
        cw = new WorldPoint(llIlllIIIl[49], llIlllIIIl[50], llIlllIIIl[1]);
        cx = new WorldPoint(llIlllIIIl[52], llIlllIIIl[53], llIlllIIIl[1]);
        cy = new WorldPoint(llIlllIIIl[54], llIlllIIIl[55], llIlllIIIl[1]);
        cz = new WorldPoint(llIlllIIIl[56], llIlllIIIl[57], llIlllIIIl[1]);
        cA = new WorldPoint(llIlllIIIl[39], llIlllIIIl[40], llIlllIIIl[1]);
        cB = new WorldPoint(llIlllIIIl[58], llIlllIIIl[59], llIlllIIIl[1]);
        cC = new WorldPoint(llIlllIIIl[37], llIlllIIIl[38], llIlllIIIl[1]);
        cD = System.currentTimeMillis();
        String[] stringArray = new String[llIlllIIIl[10]];
        stringArray[o.llIlllIIIl[1]] = llIllIllll[llIlllIIIl[60]];
        stringArray[o.llIlllIIIl[0]] = llIllIllll[llIlllIIIl[61]];
        stringArray[o.llIlllIIIl[3]] = llIllIllll[llIlllIIIl[62]];
        cE = stringArray;
        cF = new WorldArea(llIlllIIIl[63], llIlllIIIl[64], llIlllIIIl[65], llIlllIIIl[66], llIlllIIIl[1]);
        cG = llIlllIIIl[1];
        cI = e.c(llIlllIIIl[31], llIlllIIIl[32]);
    }

    /*
     * WARNING - void declaration
     */
    static NPC aF() {
        WorldPoint worldPoint = cC;
        WorldPoint worldPoint2 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cC.getX(), cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() + llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cC.getX() + llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cC.getX(), cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY() - llIlllIIIl[0], llIlllIIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cC.getX() - llIlllIIIl[0], cC.getWorldY(), llIlllIIIl[1]);
        List list = NPCs.getAll(nPC -> nPC.getName().equalsIgnoreCase(llIllIllll[llIlllIIIl[36]]));
        if (o.lIlllIIIlIlll(list)) {
            void llllllllllllllllllIIIIllIIllIIll;
            List<WorldPoint> list2 = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int llllllllllllllllllIIIIllIIllIIIl = llIlllIIIl[1];
            while (o.lIlllIIIlIlIl(llllllllllllllllllIIIIllIIllIIIl, llllllllllllllllllIIIIllIIllIIll.size())) {
                void llllllllllllllllllIIIIllIIllIIlI;
                if (o.lIlllIIIllIII(llllllllllllllllllIIIIllIIllIIlI.contains(((NPC)llllllllllllllllllIIIIllIIllIIll.get(llllllllllllllllllIIIIllIIllIIIl)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC)llllllllllllllllllIIIIllIIllIIll.get(llllllllllllllllllIIIIllIIllIIIl);
                }
                ++llllllllllllllllllIIIIllIIllIIIl;
                0;
                if (-(0xE9 ^ 0x92 ^ (0xF5 ^ 0x8B)) < 0) continue;
                return null;
            }
        }
        return null;
    }
}

