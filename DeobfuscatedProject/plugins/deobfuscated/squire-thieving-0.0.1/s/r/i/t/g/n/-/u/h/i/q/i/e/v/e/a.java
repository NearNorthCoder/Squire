/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;

public abstract class a
extends Task {
    protected static final /* synthetic */ int q;
    private static /* synthetic */ String[] lIIllIllllllI;
    private static /* synthetic */ int[] lIIlllIIIlllI;
    protected final /* synthetic */ SquireThievingConfig p;
    protected final /* synthetic */ SquireThieving o;

    private static String lIllIIlIIIIlIIl(String llllllllllllllIlllIllIIIllIIlIlI, String llllllllllllllIlllIllIIIllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlllI[12]), "DES");
            Cipher llllllllllllllIlllIllIIIllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIIllIIlllI.init(lIIlllIIIlllI[6], llllllllllllllIlllIllIIIllIIllll);
            return new String(llllllllllllllIlllIllIIIllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIllIIllIl) {
            llllllllllllllIlllIllIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIlIlIllIll() {
        lIIllIllllllI = new String[lIIlllIIIlllI[61]];
        a.lIIllIllllllI[a.lIIlllIIIlllI[0]] = a."Wear";
        a.lIIllIllllllI[a.lIIlllIIIlllI[2]] = a."Pickpocket";
        a.lIIllIllllllI[a.lIIlllIIIlllI[6]] = a."Anaire";
        a.lIIllIllllllI[a.lIIlllIIIlllI[3]] = a."Aranwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[9]] = a."Aredhel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[1]] = a."Caranthir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[10]] = a."Celebrian";
        a.lIIllIllllllI[a.lIIlllIIIlllI[11]] = a."Celegorm";
        a.lIIllIllllllI[a.lIIlllIIIlllI[12]] = a."Cirdan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[13]] = a."Curufin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[14]] = a."Earwen";
        a.lIIllIllllllI[a.lIIlllIIIlllI[15]] = a."Edrahil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[16]] = a."Elenwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[17]] = a."Elladan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[18]] = a."Enel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[19]] = a."Erestor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[20]] = a."Enerdhil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[21]] = a."Enelye";
        a.lIIllIllllllI[a.lIIlllIIIlllI[22]] = a."Feanor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[23]] = a."Findis";
        a.lIIllIllllllI[a.lIIlllIIIlllI[24]] = a."Finduilas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[25]] = a."Fingolfin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[26]] = a."Fingon";
        a.lIIllIllllllI[a.lIIlllIIIlllI[27]] = a."Galathil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[28]] = a."Gelmir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[29]] = a."Glorfindel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[30]] = a."Guilin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[31]] = a."Hendor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[32]] = a."Idril";
        a.lIIllIllllllI[a.lIIlllIIIlllI[33]] = a."Imin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[34]] = a."Iminye";
        a.lIIllIllllllI[a.lIIlllIIIlllI[35]] = a."Indis";
        a.lIIllIllllllI[a.lIIlllIIIlllI[36]] = a."Ingwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[37]] = a."Ingwion";
        a.lIIllIllllllI[a.lIIlllIIIlllI[38]] = a."Lenwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[39]] = a."Lindir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[40]] = a."Maeglin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[41]] = a."Mahtan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[42]] = a."Miriel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[43]] = a."Mithrellas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[44]] = a."Nellas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[45]] = a."Nerdanel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[46]] = a."Nimloth";
        a.lIIllIllllllI[a.lIIlllIIIlllI[47]] = a."Oropher";
        a.lIIllIllllllI[a.lIIlllIIIlllI[48]] = a."Orophin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[49]] = a."Saeros";
        a.lIIllIllllllI[a.lIIlllIIIlllI[50]] = a."Salgant";
        a.lIIllIllllllI[a.lIIlllIIIlllI[51]] = a."Tatie";
        a.lIIllIllllllI[a.lIIlllIIIlllI[52]] = a."Thingol";
        a.lIIllIllllllI[a.lIIlllIIIlllI[53]] = a."Turgon";
        a.lIIllIllllllI[a.lIIlllIIIlllI[54]] = a."Vaire";
        a.lIIllIllllllI[a.lIIlllIIIlllI[55]] = a."Arvel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[56]] = a."Goreu";
        a.lIIllIllllllI[a.lIIlllIIIlllI[8]] = a."Kelyn";
        a.lIIllIllllllI[a.lIIlllIIIlllI[57]] = a."Mawrth";
        a.lIIllIllllllI[a.lIIlllIIIlllI[58]] = a."Vallessia von Pitt";
        a.lIIllIllllllI[a.lIIlllIIIlllI[60]] = a."Pickpocket";
    }

    protected NPC n() {
        String string = lIIllIllllllI[lIIlllIIIlllI[58]];
        String[] stringArray = new String[lIIlllIIIlllI[2]];
        stringArray[a.lIIlllIIIlllI[0]] = string;
        return NPCs.getNearest((String[])stringArray);
    }

    private static int lIllIIlIlIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIllIIlIlIlllII() {
        lIIlllIIIlllI = new int[62];
        a.lIIlllIIIlllI[0] = (0xAF ^ 0xB3) & ~(0x1F ^ 3);
        a.lIIlllIIIlllI[1] = 0x30 ^ 0x5D ^ (0x78 ^ 0x10);
        a.lIIlllIIIlllI[2] = 1;
        a.lIIlllIIIlllI[3] = 3;
        a.lIIlllIIIlllI[4] = -(0xFFFFEBFF & 0x5E0B) & (0xFFFFDFFF & 0x7FBF);
        a.lIIlllIIIlllI[5] = -(0xFFFFBFCD & 0x607F) & (0xFFFFB7FF & 0x7DFD);
        a.lIIlllIIIlllI[6] = 2;
        a.lIIlllIIIlllI[7] = -(0xFFFFDD23 & 0x6ADD) & (0xFFFFFFBB & 0x5DF7);
        a.lIIlllIIIlllI[8] = 0x8E ^ 0xBB;
        a.lIIlllIIIlllI[9] = 0x6B ^ 0x6F;
        a.lIIlllIIIlllI[10] = 0x1B ^ 0x1D;
        a.lIIlllIIIlllI[11] = 120 + 147 - 225 + 108 ^ 92 + 116 - 174 + 111;
        a.lIIlllIIIlllI[12] = 0x84 ^ 0x91 ^ (0x3B ^ 0x26);
        a.lIIlllIIIlllI[13] = 0xB1 ^ 0xC6 ^ (0x29 ^ 0x57);
        a.lIIlllIIIlllI[14] = 0x8C ^ 0x86;
        a.lIIlllIIIlllI[15] = 0x3F ^ 0x34;
        a.lIIlllIIIlllI[16] = 0x23 ^ 0x71 ^ (0xFB ^ 0xA5);
        a.lIIlllIIIlllI[17] = 0x8C ^ 0xA5 ^ (5 ^ 0x21);
        a.lIIlllIIIlllI[18] = 0x92 ^ 0x9C;
        a.lIIlllIIIlllI[19] = 0x37 ^ 0x27 ^ (0x95 ^ 0x8A);
        a.lIIlllIIIlllI[20] = 0x36 ^ 0x33 ^ (0x48 ^ 0x5D);
        a.lIIlllIIIlllI[21] = 0x96 ^ 0xAB ^ (0x39 ^ 0x15);
        a.lIIlllIIIlllI[22] = 69 + 92 - 117 + 139 ^ 104 + 13 - -14 + 34;
        a.lIIlllIIIlllI[23] = 6 ^ 0x3F ^ (0x37 ^ 0x1D);
        a.lIIlllIIIlllI[24] = 156 + 84 - 221 + 171 ^ 77 + 163 - 163 + 93;
        a.lIIlllIIIlllI[25] = 0x95 ^ 0x80;
        a.lIIlllIIIlllI[26] = 0x6C ^ 0x4C ^ (3 ^ 0x35);
        a.lIIlllIIIlllI[27] = 0x5D ^ 0x4A;
        a.lIIlllIIIlllI[28] = 0x7F ^ 2 ^ (0x4F ^ 0x2A);
        a.lIIlllIIIlllI[29] = 83 + 129 - 179 + 109 ^ 31 + 118 - 92 + 94;
        a.lIIlllIIIlllI[30] = 68 + 42 - -49 + 13 ^ 108 + 147 - 227 + 154;
        a.lIIlllIIIlllI[31] = 5 ^ 0x69 ^ (0x2A ^ 0x5D);
        a.lIIlllIIIlllI[32] = 0x17 ^ 0xB;
        a.lIIlllIIIlllI[33] = 0x9F ^ 0x82;
        a.lIIlllIIIlllI[34] = 3 ^ 0x1D;
        a.lIIlllIIIlllI[35] = 19 + 65 - -6 + 126 ^ 187 + 129 - 137 + 20;
        a.lIIlllIIIlllI[36] = 0xE6 ^ 0xC6;
        a.lIIlllIIIlllI[37] = 0x1A ^ 0x3B;
        a.lIIlllIIIlllI[38] = 0x96 ^ 0xB4;
        a.lIIlllIIIlllI[39] = 0xD7 ^ 0xA7 ^ (0x2B ^ 0x78);
        a.lIIlllIIIlllI[40] = 0x46 ^ 0x29 ^ (0x4A ^ 1);
        a.lIIlllIIIlllI[41] = 0xD8 ^ 0xB3 ^ (0xFE ^ 0xB0);
        a.lIIlllIIIlllI[42] = 0x3A ^ 0x1C;
        a.lIIlllIIIlllI[43] = 0x6E ^ 0x49;
        a.lIIlllIIIlllI[44] = 0x9F ^ 0xB7;
        a.lIIlllIIIlllI[45] = 0xA3 ^ 0xBB ^ (0x14 ^ 0x25);
        a.lIIlllIIIlllI[46] = 0x3A ^ 1 ^ (0x47 ^ 0x56);
        a.lIIlllIIIlllI[47] = 0x5A ^ 0x41 ^ (0xB5 ^ 0x85);
        a.lIIlllIIIlllI[48] = 0x83 ^ 0xAF;
        a.lIIlllIIIlllI[49] = 5 + 55 - -60 + 57 ^ 44 + 11 - -58 + 43;
        a.lIIlllIIIlllI[50] = 0x85 ^ 0xAB;
        a.lIIlllIIIlllI[51] = 0x92 ^ 0xAF ^ (0x1A ^ 8);
        a.lIIlllIIIlllI[52] = 0x90 ^ 0xA0;
        a.lIIlllIIIlllI[53] = 0x38 ^ 9;
        a.lIIlllIIIlllI[54] = 0x8F ^ 0xAF ^ (0x26 ^ 0x34);
        a.lIIlllIIIlllI[55] = 0x38 ^ 0xB;
        a.lIIlllIIIlllI[56] = 0x70 ^ 0x44;
        a.lIIlllIIIlllI[57] = 51 + 91 - 134 + 133 ^ 174 + 108 - 106 + 11;
        a.lIIlllIIIlllI[58] = 0x4B ^ 0x7C;
        a.lIIlllIIIlllI[59] = 195 + 204 - 336 + 180 + (14 + 59 - -44 + 100) - (0xFFFFADFF & 0x53C6) + (210 + 84 - 95 + 40);
        a.lIIlllIIIlllI[60] = 0x8D ^ 0xB2 ^ (0x75 ^ 0x72);
        a.lIIlllIIIlllI[61] = 0x20 ^ 0x7B ^ (0xFF ^ 0x9D);
    }

    private static boolean lIllIIlIllIIIIl(int n2) {
        return n2 <= 0;
    }

    private static String lIllIIlIIIIlIlI(String llllllllllllllIlllIllIIIllIllIIl, String llllllllllllllIlllIllIIIllIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIllIllIll.init(lIIlllIIIlllI[6], llllllllllllllIlllIllIIIllIlllII);
            return new String(llllllllllllllIlllIllIIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIllIllIlI) {
            llllllllllllllIlllIllIIIllIllIlI.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (a.lIllIIlIlIlllIl((Object)this.p.method(), (Object)b.PICKPOCKETING)) {
            return lIIlllIIIlllI[0];
        }
        return this.l();
    }

    private static String lIllIIlIIIIlIII(String llllllllllllllIlllIllIIIlllIlIIl, String llllllllllllllIlllIllIIIlllIllIl) {
        llllllllllllllIlllIllIIIlllIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIlllIllII = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlllIlIll = llllllllllllllIlllIllIIIlllIllIl.toCharArray();
        int llllllllllllllIlllIllIIIlllIlIlI = lIIlllIIIlllI[0];
        char[] llllllllllllllIlllIllIIIlllIIlII = llllllllllllllIlllIllIIIlllIlIIl.toCharArray();
        int llllllllllllllIlllIllIIIlllIIIll = llllllllllllllIlllIllIIIlllIIlII.length;
        int llllllllllllllIlllIllIIIlllIIIlI = lIIlllIIIlllI[0];
        while (a.lIllIIlIllIIlIl(llllllllllllllIlllIllIIIlllIIIlI, llllllllllllllIlllIllIIIlllIIIll)) {
            char llllllllllllllIlllIllIIIlllIllll = llllllllllllllIlllIllIIIlllIIlII[llllllllllllllIlllIllIIIlllIIIlI];
            llllllllllllllIlllIllIIIlllIllII.append((char)(llllllllllllllIlllIllIIIlllIllll ^ llllllllllllllIlllIllIIIlllIlIll[llllllllllllllIlllIllIIIlllIlIlI % llllllllllllllIlllIllIIIlllIlIll.length]));
            0;
            ++llllllllllllllIlllIllIIIlllIlIlI;
            ++llllllllllllllIlllIllIIIlllIIIlI;
            0;
            if ((0xD3 ^ 0xB2 ^ (0xA7 ^ 0xC2)) >= 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIlllIllII);
    }

    static {
        a.lIllIIlIlIlllII();
        a.lIllIIlIlIllIll();
        q = lIIlllIIIlllI[59];
    }

    private static boolean lIllIIlIlIlllll(int n2) {
        return n2 != 0;
    }

    public abstract boolean l();

    protected a(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.o = squireThieving;
        this.p = squireThievingConfig;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(NPC nPC) {
        void llllllllllllllIlllIllIIlIIIIIlII;
        double d2 = (double)(Combat.getCurrentHealth() - lIIlllIIIlllI[1]) / (double)Skills.getLevel((Skill)Skill.HITPOINTS) * 100.0;
        if (a.lIllIIlIlIlllll(this.p.redemptionHeal() ? 1 : 0) && a.lIllIIlIllIIIII(Prayers.getPoints(), lIIlllIIIlllI[2])) {
            if (a.lIllIIlIllIIIIl(a.lIllIIlIlIllllI(d2, 10.0))) {
                Prayers.flick(List.of(Prayer.REDEMPTION));
                0;
                0;
                if ((0x93 ^ 0x97) < 0) {
                    return;
                }
            } else {
                Prayers.disableAll();
            }
        }
        if (a.lIllIIlIlIlllll(Reachable.isInteractable((Locatable)llllllllllllllIlllIllIIlIIIIIlII) ? 1 : 0)) {
            a llllllllllllllIlllIllIIlIIIIIlIl;
            if (a.lIllIIlIllIIIlI((Object)llllllllllllllIlllIllIIlIIIIIlIl.p.pickpocketTarget(), (Object)f.VYRE) && a.lIllIIlIllIIIll(llllllllllllllIlllIllIIlIIIIIlII.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIIlllIIIlllI[3])) {
                int[] nArray = new int[lIIlllIIIlllI[3]];
                nArray[a.lIIlllIIIlllI[0]] = lIIlllIIIlllI[4];
                nArray[a.lIIlllIIIlllI[2]] = lIIlllIIIlllI[5];
                nArray[a.lIIlllIIIlllI[6]] = lIIlllIIIlllI[7];
                Iterator llllllllllllllIlllIllIIlIIIIIIlI = Inventory.getAll((int[])nArray).iterator();
                while (a.lIllIIlIlIlllll(llllllllllllllIlllIllIIlIIIIIIlI.hasNext() ? 1 : 0)) {
                    Item llllllllllllllIlllIllIIlIIIIIIIl = (Item)llllllllllllllIlllIllIIlIIIIIIlI.next();
                    llllllllllllllIlllIllIIlIIIIIIIl.interact(lIIllIllllllI[lIIlllIIIlllI[0]]);
                    0;
                    if (-(0xB6 ^ 0xB3) < 0) continue;
                    return;
                }
            }
            if (a.lIllIIlIlIlllll(llllllllllllllIlllIllIIlIIIIIlIl.p.gemBag() ? 1 : 0) && a.lIllIIlIlIlllll(llllllllllllllIlllIllIIlIIIIIlIl.o.k() ? 1 : 0)) {
                llllllllllllllIlllIllIIlIIIIIlIl.o.c(lIIlllIIIlllI[0]);
            }
            llllllllllllllIlllIllIIlIIIIIlII.interact(lIIllIllllllI[lIIlllIIIlllI[2]]);
            0;
            if (((0x87 ^ 0x82) & ~(0x67 ^ 0x62)) != 0) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)llllllllllllllIlllIllIIlIIIIIlII.getWorldLocation());
            0;
        }
    }

    protected NPC m() {
        String[] stringArray = new String[lIIlllIIIlllI[8]];
        stringArray[a.lIIlllIIIlllI[0]] = lIIllIllllllI[lIIlllIIIlllI[6]];
        stringArray[a.lIIlllIIIlllI[2]] = lIIllIllllllI[lIIlllIIIlllI[3]];
        stringArray[a.lIIlllIIIlllI[6]] = lIIllIllllllI[lIIlllIIIlllI[9]];
        stringArray[a.lIIlllIIIlllI[3]] = lIIllIllllllI[lIIlllIIIlllI[1]];
        stringArray[a.lIIlllIIIlllI[9]] = lIIllIllllllI[lIIlllIIIlllI[10]];
        stringArray[a.lIIlllIIIlllI[1]] = lIIllIllllllI[lIIlllIIIlllI[11]];
        stringArray[a.lIIlllIIIlllI[10]] = lIIllIllllllI[lIIlllIIIlllI[12]];
        stringArray[a.lIIlllIIIlllI[11]] = lIIllIllllllI[lIIlllIIIlllI[13]];
        stringArray[a.lIIlllIIIlllI[12]] = lIIllIllllllI[lIIlllIIIlllI[14]];
        stringArray[a.lIIlllIIIlllI[13]] = lIIllIllllllI[lIIlllIIIlllI[15]];
        stringArray[a.lIIlllIIIlllI[14]] = lIIllIllllllI[lIIlllIIIlllI[16]];
        stringArray[a.lIIlllIIIlllI[15]] = lIIllIllllllI[lIIlllIIIlllI[17]];
        stringArray[a.lIIlllIIIlllI[16]] = lIIllIllllllI[lIIlllIIIlllI[18]];
        stringArray[a.lIIlllIIIlllI[17]] = lIIllIllllllI[lIIlllIIIlllI[19]];
        stringArray[a.lIIlllIIIlllI[18]] = lIIllIllllllI[lIIlllIIIlllI[20]];
        stringArray[a.lIIlllIIIlllI[19]] = lIIllIllllllI[lIIlllIIIlllI[21]];
        stringArray[a.lIIlllIIIlllI[20]] = lIIllIllllllI[lIIlllIIIlllI[22]];
        stringArray[a.lIIlllIIIlllI[21]] = lIIllIllllllI[lIIlllIIIlllI[23]];
        stringArray[a.lIIlllIIIlllI[22]] = lIIllIllllllI[lIIlllIIIlllI[24]];
        stringArray[a.lIIlllIIIlllI[23]] = lIIllIllllllI[lIIlllIIIlllI[25]];
        stringArray[a.lIIlllIIIlllI[24]] = lIIllIllllllI[lIIlllIIIlllI[26]];
        stringArray[a.lIIlllIIIlllI[25]] = lIIllIllllllI[lIIlllIIIlllI[27]];
        stringArray[a.lIIlllIIIlllI[26]] = lIIllIllllllI[lIIlllIIIlllI[28]];
        stringArray[a.lIIlllIIIlllI[27]] = lIIllIllllllI[lIIlllIIIlllI[29]];
        stringArray[a.lIIlllIIIlllI[28]] = lIIllIllllllI[lIIlllIIIlllI[30]];
        stringArray[a.lIIlllIIIlllI[29]] = lIIllIllllllI[lIIlllIIIlllI[31]];
        stringArray[a.lIIlllIIIlllI[30]] = lIIllIllllllI[lIIlllIIIlllI[32]];
        stringArray[a.lIIlllIIIlllI[31]] = lIIllIllllllI[lIIlllIIIlllI[33]];
        stringArray[a.lIIlllIIIlllI[32]] = lIIllIllllllI[lIIlllIIIlllI[34]];
        stringArray[a.lIIlllIIIlllI[33]] = lIIllIllllllI[lIIlllIIIlllI[35]];
        stringArray[a.lIIlllIIIlllI[34]] = lIIllIllllllI[lIIlllIIIlllI[36]];
        stringArray[a.lIIlllIIIlllI[35]] = lIIllIllllllI[lIIlllIIIlllI[37]];
        stringArray[a.lIIlllIIIlllI[36]] = lIIllIllllllI[lIIlllIIIlllI[38]];
        stringArray[a.lIIlllIIIlllI[37]] = lIIllIllllllI[lIIlllIIIlllI[39]];
        stringArray[a.lIIlllIIIlllI[38]] = lIIllIllllllI[lIIlllIIIlllI[40]];
        stringArray[a.lIIlllIIIlllI[39]] = lIIllIllllllI[lIIlllIIIlllI[41]];
        stringArray[a.lIIlllIIIlllI[40]] = lIIllIllllllI[lIIlllIIIlllI[42]];
        stringArray[a.lIIlllIIIlllI[41]] = lIIllIllllllI[lIIlllIIIlllI[43]];
        stringArray[a.lIIlllIIIlllI[42]] = lIIllIllllllI[lIIlllIIIlllI[44]];
        stringArray[a.lIIlllIIIlllI[43]] = lIIllIllllllI[lIIlllIIIlllI[45]];
        stringArray[a.lIIlllIIIlllI[44]] = lIIllIllllllI[lIIlllIIIlllI[46]];
        stringArray[a.lIIlllIIIlllI[45]] = lIIllIllllllI[lIIlllIIIlllI[47]];
        stringArray[a.lIIlllIIIlllI[46]] = lIIllIllllllI[lIIlllIIIlllI[48]];
        stringArray[a.lIIlllIIIlllI[47]] = lIIllIllllllI[lIIlllIIIlllI[49]];
        stringArray[a.lIIlllIIIlllI[48]] = lIIllIllllllI[lIIlllIIIlllI[50]];
        stringArray[a.lIIlllIIIlllI[49]] = lIIllIllllllI[lIIlllIIIlllI[51]];
        stringArray[a.lIIlllIIIlllI[50]] = lIIllIllllllI[lIIlllIIIlllI[52]];
        stringArray[a.lIIlllIIIlllI[51]] = lIIllIllllllI[lIIlllIIIlllI[53]];
        stringArray[a.lIIlllIIIlllI[52]] = lIIllIllllllI[lIIlllIIIlllI[54]];
        stringArray[a.lIIlllIIIlllI[53]] = lIIllIllllllI[lIIlllIIIlllI[55]];
        stringArray[a.lIIlllIIIlllI[54]] = lIIllIllllllI[lIIlllIIIlllI[56]];
        stringArray[a.lIIlllIIIlllI[55]] = lIIllIllllllI[lIIlllIIIlllI[8]];
        stringArray[a.lIIlllIIIlllI[56]] = lIIllIllllllI[lIIlllIIIlllI[57]];
        String[] stringArray2 = stringArray;
        return NPCs.getNearest((String[])stringArray2);
    }

    private static boolean lIllIIlIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean o() {
        boolean bl;
        if (a.lIllIIlIllIIlII(Players.getLocal().getGraphic(), lIIlllIIIlllI[59])) {
            bl = lIIlllIIIlllI[2];
            0;
            if (3 == 0) {
                return ((0x38 ^ 0x2C) & ~(0xB9 ^ 0xAD)) != 0;
            }
        } else {
            bl = lIIlllIIIlllI[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected NPC a(f f2) {
        void llllllllllllllIlllIllIIIllllllIl;
        if (a.lIllIIlIllIIIlI((Object)f2, (Object)f.ELF)) {
            return this.m();
        }
        if (a.lIllIIlIllIIIlI(llllllllllllllIlllIllIIIllllllIl, (Object)f.VYRE)) {
            a llllllllllllllIlllIllIIIlllllllI;
            return llllllllllllllIlllIllIIIlllllllI.n();
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (a.lIllIIlIlIlllll(f2.v().equals(nPC.getName()) ? 1 : 0) && a.lIllIIlIlIlllll(nPC.hasAction(lIIllIllllllI[lIIlllIIIlllI[60]]::equals) ? 1 : 0)) {
                n2 = lIIlllIIIlllI[2];
                0;
                if (3 <= 0) {
                    return ((0x78 ^ 0x61) & ~(0xBB ^ 0xA2)) != 0;
                }
            } else {
                n2 = lIIlllIIIlllI[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIllIIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIllIIIlI(Object object, Object object2) {
        return object == object2;
    }
}

