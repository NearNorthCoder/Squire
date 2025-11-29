/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class j
implements G {
    private static /* synthetic */ int[] lIIlIIlllI;
    private static /* synthetic */ String[] lIIlIIllIl;

    private static boolean lllllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.lllllIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIlllI[39])) {
            bl = lIIlIIlllI[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0xA6 ^ 0xB9 ^ (0xDD ^ 0x94)) & (0xFB ^ 0xB6 ^ (0x3C ^ 0x27) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlIIlllI[1];
        }
        return bl;
    }

    private static boolean lllllIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIlIIllIl[lIIlIIlllI[14]];
    }

    private static String lllllIIlllll(String lllllllllllllllllllllllllIlIllIl, String lllllllllllllllllllllllllIlIllII) {
        lllllllllllllllllllllllllIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllllllllllllIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllllIllIIII = new StringBuilder();
        char[] lllllllllllllllllllllllllIlIllll = lllllllllllllllllllllllllIlIllII.toCharArray();
        int lllllllllllllllllllllllllIlIlllI = lIIlIIlllI[1];
        char[] lllllllllllllllllllllllllIlIlIII = lllllllllllllllllllllllllIlIllIl.toCharArray();
        int lllllllllllllllllllllllllIlIIlll = lllllllllllllllllllllllllIlIlIII.length;
        int lllllllllllllllllllllllllIlIIllI = lIIlIIlllI[1];
        while (j.lllllIlIllll(lllllllllllllllllllllllllIlIIllI, lllllllllllllllllllllllllIlIIlll)) {
            char lllllllllllllllllllllllllIllIIll = lllllllllllllllllllllllllIlIlIII[lllllllllllllllllllllllllIlIIllI];
            lllllllllllllllllllllllllIllIIII.append((char)(lllllllllllllllllllllllllIllIIll ^ lllllllllllllllllllllllllIlIllll[lllllllllllllllllllllllllIlIlllI % lllllllllllllllllllllllllIlIllll.length]));
            "".length();
            ++lllllllllllllllllllllllllIlIlllI;
            ++lllllllllllllllllllllllllIlIIllI;
            "".length();
            if (((82 + 97 - 94 + 50 ^ 94 + 105 - 93 + 91) & (0x46 ^ 0x12 ^ (0x2C ^ 0x3A) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllllllIllIIII);
    }

    private static void lllllIlIIIlI() {
        lIIlIIllIl = new String[lIIlIIlllI[45]];
        j.lIIlIIllIl[j.lIIlIIlllI[1]] = j.lllllIIlllll("OCYVIi4XMwolLlYzDGsrFykI", "vGcKI");
        j.lIIlIIllIl[j.lIIlIIlllI[0]] = j.lllllIIlllll("OzQLDzYaOwJLOBI7DgI0FA==", "sUekZ");
        j.lIIlIIllIl[j.lIIlIIlllI[10]] = j.lllllIIlllll("ACs2", "EJBYV");
        j.lIIlIIllIl[j.lIIlIIlllI[20]] = j.lllllIlIIIII("Y4GB5XwU2/sMU1i+Q1PS+w==", "LXFLw");
        j.lIIlIIllIl[j.lIIlIIlllI[28]] = j.lllllIlIIIII("3Gvt6OaONf9oGrI55BX0fXPb1ih2VC0q", "pFxJJ");
        j.lIIlIIllIl[j.lIIlIIlllI[29]] = j.lllllIlIIIIl("yHdJ2VH3pAk=", "fuiIC");
        j.lIIlIIllIl[j.lIIlIIlllI[27]] = j.lllllIlIIIIl("6VbKrEg5Dq/h0oIC927O3Q==", "hObTq");
        j.lIIlIIllIl[j.lIIlIIlllI[34]] = j.lllllIlIIIII("xhdQEZ/ayUzHCmrJFwRsag==", "WGmSE");
        j.lIIlIIllIl[j.lIIlIIlllI[35]] = j.lllllIIlllll("NxofGzodBwUdeQUBHhY=", "vnkzY");
        j.lIIlIIllIl[j.lIIlIIlllI[36]] = j.lllllIlIIIIl("IHT7SQFqIX0=", "bxvbK");
        j.lIIlIIllIl[j.lIIlIIlllI[7]] = j.lllllIlIIIIl("KrmLIY7YDeQFqlSrl3W5EQ==", "vHCTE");
        j.lIIlIIllIl[j.lIIlIIlllI[13]] = j.lllllIlIIIII("BWa7vB4zYZI=", "HjoCy");
        j.lIIlIIllIl[j.lIIlIIlllI[37]] = j.lllllIlIIIII("aMb0+ornUJROyoRIV5BwGA==", "umnAj");
        j.lIIlIIllIl[j.lIIlIIlllI[14]] = j.lllllIlIIIIl("VA9nSQcSaIPZKltq5OnHHQ==", "JdOUL");
        j.lIIlIIllIl[j.lIIlIIlllI[40]] = j.lllllIlIIIIl("LlWq/X9VxtU=", "UziPY");
        j.lIIlIIllIl[j.lIIlIIlllI[41]] = j.lllllIlIIIIl("duT0/pwDF70=", "tseqV");
        j.lIIlIIllIl[j.lIIlIIlllI[42]] = j.lllllIlIIIII("ZZsD6P3APVA=", "zlwAG");
        j.lIIlIIllIl[j.lIIlIIlllI[43]] = j.lllllIlIIIII("mhrAYdNXdGk=", "dNkIN");
        j.lIIlIIllIl[j.lIIlIIlllI[44]] = j.lllllIlIIIIl("hcb7rQ72QwdKo1jirkprlQ==", "AgcGI");
    }

    private static boolean lllllIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lllllIlIIIII(String lllllllllllllllllllllllllIIIlllI, String lllllllllllllllllllllllllIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllllllllllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllllIIIllll.getBytes(StandardCharsets.UTF_8)), lIIlIIlllI[35]), "DES");
            Cipher lllllllllllllllllllllllllIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllllllllllllIIlIIlI.init(lIIlIIlllI[10], lllllllllllllllllllllllllIIlIIll);
            return new String(lllllllllllllllllllllllllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllllIIlIIIl) {
            lllllllllllllllllllllllllIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIIIll() {
        lIIlIIlllI = new int[46];
        j.lIIlIIlllI[0] = " ".length();
        j.lIIlIIlllI[1] = "   ".length() & ("   ".length() ^ -" ".length());
        j.lIIlIIlllI[2] = 0xFFFFA5FB & 0x5B7F;
        j.lIIlIIlllI[3] = -(0xFFFFFE7F & 0x65B5) & (0xFFFFFFFC & 0x77BF);
        j.lIIlIIlllI[4] = 0x9D ^ 0x85;
        j.lIIlIIlllI[5] = -(0xFFFFDE39 & 0x6BC7) & (0xFFFFFBF9 & 0x7F57);
        j.lIIlIIlllI[6] = -(0xFFFFA1BF & 0x7E73) & (0xFFFFBF7B & Short.MAX_VALUE);
        j.lIIlIIlllI[7] = 0x80 ^ 0x8A;
        j.lIIlIIlllI[8] = 0xFFFFBF5F & 0x48F7;
        j.lIIlIIlllI[9] = -" ".length() & (0xFFFFEBF5 & 0x1FBF);
        j.lIIlIIlllI[10] = "  ".length();
        j.lIIlIIlllI[11] = -(0xFFFFD53F & 0x7FE3) & (0xFFFFDF73 & 0x7DFE);
        j.lIIlIIlllI[12] = -(0xFFFFF617 & 0x39F9) & (0xFFFFFFBE & 0x3BFF);
        j.lIIlIIlllI[13] = 0xAE ^ 0xA5;
        j.lIIlIIlllI[14] = 0x45 ^ 0x17 ^ (0x52 ^ 0xD);
        j.lIIlIIlllI[15] = 0xFFFFFECD & 0x97B;
        j.lIIlIIlllI[16] = 0xFFFFDFDB & 0x2BBE;
        j.lIIlIIlllI[17] = 83 + 64 - 77 + 98 ^ 172 + 144 - 152 + 19;
        j.lIIlIIlllI[18] = 0xB6 ^ 0x95;
        j.lIIlIIlllI[19] = -(0x14 ^ 0x77) & (0xFFFFEFFF & 0x1BFF);
        j.lIIlIIlllI[20] = "   ".length();
        j.lIIlIIlllI[21] = 0xFFFF9C5B & 0x6BBF;
        j.lIIlIIlllI[22] = -(0x18 ^ 0x39) & (0xFFFFDFF7 & 0x2AEE);
        j.lIIlIIlllI[23] = 0xFFFFD793 & 0x297F;
        j.lIIlIIlllI[24] = 123 + 251 - 188 + 66;
        j.lIIlIIlllI[25] = 0xFFFFFC5F & 0xFA9;
        j.lIIlIIlllI[26] = -(0xFFFFB769 & 0x5AD7) & (0xFFFFDFDF & 0x3FF3);
        j.lIIlIIlllI[27] = 0x49 ^ 0x4F;
        j.lIIlIIlllI[28] = 0x98 ^ 0xAB ^ (0x4D ^ 0x7A);
        j.lIIlIIlllI[29] = 0x9C ^ 0x99;
        j.lIIlIIlllI[30] = -(0xFFFFFFAD & 0x77FB) & (0xFFFFFFFE & Short.MAX_VALUE);
        j.lIIlIIlllI[31] = 0xFFFF8FF1 & 0x7BAF;
        j.lIIlIIlllI[32] = 0xFFFFCBAF & 0x3FF7;
        j.lIIlIIlllI[33] = -(0xFFFFDE67 & 0x759F) & (0xFFFFFFF7 & 0x5FBF);
        j.lIIlIIlllI[34] = 0x8D ^ 0x8A;
        j.lIIlIIlllI[35] = 0x7E ^ 0x76;
        j.lIIlIIlllI[36] = 0x5E ^ 0x4C ^ (0x56 ^ 0x4D);
        j.lIIlIIlllI[37] = 0x2F ^ 0x40 ^ (0x60 ^ 3);
        j.lIIlIIlllI[38] = 0xF3 ^ 0x86 ^ (0x4B ^ 0x5A);
        j.lIIlIIlllI[39] = 163 + 186 - 228 + 71 ^ 129 + 44 - 104 + 94;
        j.lIIlIIlllI[40] = 8 ^ 6;
        j.lIIlIIlllI[41] = 0xE0 ^ 0xBF ^ (0x42 ^ 0x12);
        j.lIIlIIlllI[42] = 70 + 73 - 67 + 111 ^ 101 + 103 - 55 + 22;
        j.lIIlIIlllI[43] = 122 + 168 - 254 + 138 ^ 148 + 85 - 199 + 157;
        j.lIIlIIlllI[44] = 0x25 ^ 0x37;
        j.lIIlIIlllI[45] = 0x53 ^ 0x40;
    }

    @Override
    public boolean S() {
        return lIIlIIlllI[1];
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.lllllIlIIllI(tileObject.getName().contains(lIIlIIllIl[lIIlIIlllI[44]]) ? 1 : 0) && j.lllllIlIIllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIIlIIlllI[0];
            "".length();
            if ((0x62 ^ 0x66) <= 0) {
                return ((0xCB ^ 0x8D) & ~(0x4F ^ 9)) != 0;
            }
        } else {
            n2 = lIIlIIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean lllllIlIlIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lllllIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllIlIIlIl(Object object) {
        return object != null;
    }

    private static String lllllIlIIIIl(String lllllllllllllllllllllllllIIlllIl, String lllllllllllllllllllllllllIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllllllllllllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllllIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllllIIlllll.init(lIIlIIlllI[10], lllllllllllllllllllllllllIlIIIII);
            return new String(lllllllllllllllllllllllllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllllllIIllllI) {
            lllllllllllllllllllllllllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlIllII(Object object) {
        return object == null;
    }

    private static int lllllIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllllIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC llllllllllllllllllllllllllIIlIII;
        NPC llllllllllllllllllllllllllIIlIIl;
        void llllllllllllllllllllllllllIIllII;
        WorldPoint worldPoint = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[0]);
        WorldArea worldArea = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIIlIIlllI[15], lIIlIIlllI[16], lIIlIIlllI[17], lIIlIIlllI[18], lIIlIIlllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
        if (j.lllllIlIlIIl(j.lllllIlIlIII(e.u(), 45.0))) {
            int[] nArray = new int[lIIlIIlllI[0]];
            nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
            if (j.lllllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIIlllI[0]];
                nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlIIllIl[lIIlIIlllI[10]]);
                Time.sleepTicks((int)lIIlIIlllI[0]);
                "".length();
            }
        }
        if (j.lllllIlIIlII(llllllllllllllllllllllllllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void llllllllllllllllllllllllllIIlIll;
            AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[20]];
            llllllllllllllllllllllllllIIlIIl = new WorldArea(lIIlIIlllI[21], lIIlIIlllI[22], lIIlIIlllI[23], lIIlIIlllI[24], lIIlIIlllI[1]);
            if (j.lllllIlIIlII(llllllllllllllllllllllllllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllllllllllllllllllllllllIIlIII = new WorldPoint(lIIlIIlllI[25], lIIlIIlllI[26], lIIlIIlllI[1]);
                if (j.lllllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllllllllllIIlIII), lIIlIIlllI[27])) {
                    Movement.walkTo((WorldPoint)llllllllllllllllllllllllllIIlIII);
                    "".length();
                    Time.sleepTicks((int)lIIlIIlllI[0]);
                    "".length();
                }
                if (j.lllllIlIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllllllllllIIlIII), lIIlIIlllI[27])) {
                    String[] stringArray = new String[lIIlIIlllI[0]];
                    stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIllIl[lIIlIIlllI[29]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    "".length();
                }
            }
            if (j.lllllIlIIllI(llllllllllllllllllllllllllIIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lllllIlIIlII(llllllllllllllllllllllllllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void llllllllllllllllllllllllllIIlIlI;
                Movement.walkTo((WorldPoint)llllllllllllllllllllllllllIIlIlI);
                "".length();
                Time.sleepTicks((int)lIIlIIlllI[0]);
                "".length();
            }
            if (j.lllllIlIIllI(llllllllllllllllllllllllllIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllllllllllllllllllllllllIIlIII = TileObjects.getNearest(arg_0 -> j.a((WorldArea)llllllllllllllllllllllllllIIlIll, arg_0));
                if (j.lllllIlIllII(llllllllllllllllllllllllllIIlIII)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIIlIIlllI[28]];
                    worldPointArray[j.lIIlIIlllI[1]] = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[0]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[31], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[10]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[32], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[20]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[33], lIIlIIlllI[1]);
                    WorldPoint[] llllllllllllllllllllllllllIIIlll = worldPointArray;
                    Walker.walkAlong(Arrays.asList(llllllllllllllllllllllllllIIIlll), new HashMap());
                    "".length();
                }
                if (j.lllllIlIIlIl(llllllllllllllllllllllllllIIlIII)) {
                    llllllllllllllllllllllllllIIlIII.interact(lIIlIIllIl[lIIlIIlllI[27]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    "".length();
                }
            }
        }
        if (j.lllllIlIIllI(llllllllllllllllllllllllllIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.lllllIlIllII(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[34]];
                llllllllllllllllllllllllllIIlIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[43]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0) && j.lllllIlIllII(nPC.getInteracting())) {
                            n2 = lIIlIIlllI[0];
                            "".length();
                            if ("  ".length() == "  ".length()) return n2 != 0;
                            return ((0x2F ^ 0x4D) & ~(0xF4 ^ 0x96)) != 0;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                llllllllllllllllllllllllllIIlIII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[40]]) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[41]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIlllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIlIIlllI[0];
                            "".length();
                            if ("  ".length() > 0) return n2 != 0;
                            return ((0x20 ^ 0x77) & ~(0x33 ^ 0x64)) != 0;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                if (j.lllllIlIIlIl(llllllllllllllllllllllllllIIlIIl) && j.lllllIlIllII(llllllllllllllllllllllllllIIlIII)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[35]];
                    llllllllllllllllllllllllllIIlIIl.interact(lIIlIIllIl[lIIlIIlllI[36]]);
                    Time.sleepTicks((int)lIIlIIlllI[10]);
                    "".length();
                }
                if (j.lllllIlIIlIl(llllllllllllllllllllllllllIIlIII)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[7]];
                    llllllllllllllllllllllllllIIlIII.interact(lIIlIIllIl[lIIlIIlllI[13]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    "".length();
                }
            }
            if (j.lllllIlIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[37]];
                Time.sleepTicks((int)lIIlIIlllI[0]);
                "".length();
            }
        }
    }

    static {
        j.lllllIlIIIll();
        j.lllllIlIIIlI();
    }

    @Override
    public int T() {
        try {
            j.Q();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-" ".length() >= ((0x26 ^ 1) & ~(0xBE ^ 0x99))) {
            return (0x79 ^ 0x59) & ~(2 ^ 0x22);
        }
        return lIIlIIlllI[38];
    }

    private static boolean lllllIlIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[lIIlIIlllI[0]];
        nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void llllllllllllllllllllllllllIllIll;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.lllllIlIIlIl(bankLocation) && j.lllllIlIIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[1]];
                a.a(bankLocation);
            }
            if (j.lllllIlIIlIl(llllllllllllllllllllllllllIllIll) && j.lllllIlIIllI(llllllllllllllllllllllllllIllIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[0]];
                if (j.lllllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlllI[3]);
                    "".length();
                }
                if (j.lllllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (j.lllllIlIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIlIIlllI[0]);
                        "".length();
                    }
                    a.a(lIIlIIlllI[2], lIIlIIlllI[4]);
                    a.a(lIIlIIlllI[5], lIIlIIlllI[0]);
                    a.a(lIIlIIlllI[6], lIIlIIlllI[7]);
                }
            }
        }
        int[] nArray2 = new int[lIIlIIlllI[0]];
        nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }
}

