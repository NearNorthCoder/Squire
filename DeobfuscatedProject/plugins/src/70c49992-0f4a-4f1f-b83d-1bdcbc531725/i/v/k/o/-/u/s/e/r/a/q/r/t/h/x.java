/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Flee", priority=108, register=true)
public class x
extends w {
    public static final /* synthetic */ int ci;
    private static /* synthetic */ int[] lIlIllIIIIlIl;
    private static /* synthetic */ String[] lIlIllIIIIlII;
    public static final /* synthetic */ int cj;
    private /* synthetic */ int ck;

    private boolean Y() {
        int n2 = this.cf.getBoostedSkillLevel(Skill.PRAYER);
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(n2, lIlIllIIIIlIl[6])) {
            return lIlIllIIIIlIl[0];
        }
        return Inventory.contains(item -> item.getName().startsWith(lIlIllIIIIlII[lIlIllIIIIlIl[9]]));
    }

    static {
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIlI();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIIl();
        cj = lIlIllIIIIlIl[5];
        ci = lIlIllIIIIlIl[7];
    }

    private boolean Z() {
        int n2;
        x llllllllllllllIllIlIIllllIIIIIll;
        int n3;
        int n4 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n3 = lIlIllIIIIlIl[6];
            "".length();
            if (((0x73 ^ 0x54) & ~(0x37 ^ 0x10)) != 0) {
                return ((0xBD ^ 0xA0) & ~(0x48 ^ 0x55)) != 0;
            }
        } else {
            n3 = lIlIllIIIIlIl[1];
        }
        int llllllllllllllIllIlIIllllIIIIIlI = n4 + n3;
        String llllllllllllllIllIlIIllllIIIIIIl = lIlIllIIIIlII[lIlIllIIIIlIl[8]];
        if (!i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(llllllllllllllIllIlIIllllIIIIIll.X() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlll(Combat.getCurrentHealth(), llllllllllllllIllIlIIllllIIIIIlI) || i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Inventory.contains(item -> item.getName().startsWith(llllllllllllllIllIlIIllllIIIIIIl)) ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];
            "".length();
            if (" ".length() > "  ".length()) {
                return ((123 + 17 - 85 + 72 ^ (0xC ^ 0x74)) & (0xA2 ^ 0xC3 ^ (0x63 ^ 5) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIIIIIIIIllll(String llllllllllllllIllIlIIlllIlIIlIIl, String llllllllllllllIllIlIIlllIlIIlIII) {
        llllllllllllllIllIlIIlllIlIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIlllIlIIllII = new StringBuilder();
        char[] llllllllllllllIllIlIIlllIlIIlIll = llllllllllllllIllIlIIlllIlIIlIII.toCharArray();
        int llllllllllllllIllIlIIlllIlIIlIlI = lIlIllIIIIlIl[1];
        char[] llllllllllllllIllIlIIlllIlIIIlII = llllllllllllllIllIlIIlllIlIIlIIl.toCharArray();
        int llllllllllllllIllIlIIlllIlIIIIll = llllllllllllllIllIlIIlllIlIIIlII.length;
        int llllllllllllllIllIlIIlllIlIIIIlI = lIlIllIIIIlIl[1];
        while (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIllIIl(llllllllllllllIllIlIIlllIlIIIIlI, llllllllllllllIllIlIIlllIlIIIIll)) {
            char llllllllllllllIllIlIIlllIlIIllll = llllllllllllllIllIlIIlllIlIIIlII[llllllllllllllIllIlIIlllIlIIIIlI];
            llllllllllllllIllIlIIlllIlIIllII.append((char)(llllllllllllllIllIlIIlllIlIIllll ^ llllllllllllllIllIlIIlllIlIIlIll[llllllllllllllIllIlIIlllIlIIlIlI % llllllllllllllIllIlIIlllIlIIlIll.length]));
            "".length();
            ++llllllllllllllIllIlIIlllIlIIlIlI;
            ++llllllllllllllIllIlIIlllIlIIIIlI;
            "".length();
            if (-" ".length() <= ((0x99 ^ 0xC1) & ~(0xE9 ^ 0xB1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIlllIlIIllII);
    }

    private static String llIIIIIIIIIlllI(String llllllllllllllIllIlIIlllIllIlIll, String llllllllllllllIllIlIIlllIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlllIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIlllIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIlllIllIllIl.init(lIlIllIIIIlIl[3], llllllllllllllIllIlIIlllIllIlllI);
            return new String(llllllllllllllIllIlIIlllIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlllIllIllII) {
            llllllllllllllIllIlIIlllIllIllII.printStackTrace();
            return null;
        }
    }

    private boolean X() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(Combat.getCurrentHealth(), this.ce.eatAtHP())) {
            return lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIllI(Inventory.getCount((boolean)lIlIllIIIIlIl[0], item -> {
            String[] stringArray = new String[lIlIllIIIIlIl[0]];
            stringArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlII[lIlIllIIIIlIl[10]];
            return item.hasAction(stringArray);
        }))) {
            bl = lIlIllIIIIlIl[0];
            "".length();
            if (-" ".length() > (0xD4 ^ 0xA9 ^ (0x3A ^ 0x43))) {
                return ((0x1F ^ 0x3B ^ (0xC5 ^ 0xB3)) & (0x46 ^ 8 ^ (0x42 ^ 0x5E) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private static void llIIIIIIIIlIIlI() {
        lIlIllIIIIlIl = new int[12];
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[0] = " ".length();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1] = (0x4B ^ 0x16) & ~(0x16 ^ 0x4B);
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[2] = 0xFFFFF76F & 0x3BDC;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[3] = "  ".length();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[4] = "   ".length();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[5] = 0x1E ^ 0x1A;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[6] = 0x52 ^ 0x34 ^ (0x44 ^ 0x28);
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[7] = 0x34 ^ 0x14;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[8] = 148 + 146 - 272 + 131 ^ 15 + 147 - 125 + 119;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[9] = 0xC1 ^ 0xC7;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[10] = 0xA ^ 0xD;
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[11] = 97 + 71 - 44 + 40 ^ 97 + 67 - 71 + 79;
    }

    private boolean aa() {
        int n2;
        int llllllllllllllIllIlIIlllIllllIIl;
        int n3;
        int llllllllllllllIllIlIIlllIllllIlI;
        int n4;
        x llllllllllllllIllIlIIlllIlllllII;
        int n5;
        int n6 = lIlIllIIIIlIl[7];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Combat.isVenomed() ? 1 : 0)) {
            n5 = lIlIllIIIIlIl[6];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x26 ^ 1) & ~(0x48 ^ 0x6F)) != 0;
            }
        } else {
            n5 = lIlIllIIIIlIl[1];
        }
        int llllllllllllllIllIlIIlllIllllIll = n6 + n5;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlll(llllllllllllllIllIlIIlllIlllllII.cf.getBoostedSkillLevel(Skill.HITPOINTS), lIlIllIIIIlIl[7])) {
            n4 = lIlIllIIIIlIl[0];
            "".length();
            if ((7 ^ 2 ^ (0x2F ^ 0x24) & ~(0x6F ^ 0x64)) == 0) {
                return ((0xC7 ^ 0xA5 ^ (0xF1 ^ 0xC7)) & (56 + 148 - 4 + 7 ^ 93 + 153 - 234 + 143 ^ -" ".length())) != 0;
            }
        } else {
            n4 = llllllllllllllIllIlIIlllIllllIlI = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(llllllllllllllIllIlIIlllIlllllII.cf.getTickCount() - llllllllllllllIllIlIIlllIlllllII.cg.F(), lIlIllIIIIlIl[5])) {
            n3 = lIlIllIIIIlIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x35 ^ 0x6C) & ~(0xE4 ^ 0xBD)) != 0;
            }
        } else {
            n3 = llllllllllllllIllIlIIlllIllllIIl = lIlIllIIIIlIl[1];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(llllllllllllllIllIlIIlllIllllIlI) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(llllllllllllllIllIlIIlllIllllIIl) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(llllllllllllllIllIlIIlllIlllllII.ab() ? 1 : 0)) {
            n2 = lIlIllIIIIlIl[0];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIllIIIIlIl[1];
        }
        return n2 != 0;
    }

    @Inject
    protected x(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIIlIIll(int n2) {
        return n2 != 0;
    }

    private boolean ab() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlIl(this.cf.getTickCount() - this.ck, lIlIllIIIIlIl[8])) {
            bl = lIlIllIIIIlIl[0];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x8F ^ 0xBA) & ~(0x5A ^ 0x6F)) != 0;
            }
        } else {
            bl = lIlIllIIIIlIl[1];
        }
        return bl;
    }

    private static void W() {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else {
            int[] nArray = new int[lIlIllIIIIlIl[0]];
            nArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
            if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIllIIIIlIl[0]];
                nArray2[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = lIlIllIIIIlIl[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIllIIIIlII[lIlIllIIIIlIl[1]]);
            }
        }
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIllIII(hitsplatApplied.getActor(), Players.getLocal())) {
            this.ck = this.cf.getTickCount();
        }
    }

    private static void llIIIIIIIIlIIIl() {
        lIlIllIIIIlII = new String[lIlIllIIIIlIl[11]];
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[1]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIIlllI("i29/ThftPawWEQEwG2l/XQ==", "rPNJt");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[0]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIIllll("HCgRJCo0I1QyKjQnEWE0P2QQLi19MFQpIiwhVCcsNSBUNSs7MFQ2JnoqESQn", "ZDtAC");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[3]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIIlllI("BcMqhPK51Sh1ZrP67BX9YM44FOAn6CC6TCtQW/PtbH3b1LUTyJb4vP3KpRQvW5IL", "UbexJ");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[4]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIII("6jQiWAxiTIv7P2EYtP/LArGv1Ir+m409rSq5ckpHCh5d6cQNGynrwA==", "XiExF");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[5]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIII("gv97puEsoTGYV2Cwd478Bf1gC5ixB54DHjXncTXOlcpIn24bwkJZmpg60Fu7R6Zb", "lYChc");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[8]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIII("7Uj/H982OEM=", "qJlUM");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[9]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIIlllI("vpRDlz0UhIT7E7S46qH0bg==", "yIakt");
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlII[i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.lIlIllIIIIlIl[10]] = i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIII("MFeOVPTc+/k=", "fPMPv");
    }

    private static boolean llIIIIIIIIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIIIIIIIlIIII(String llllllllllllllIllIlIIlllIlIllllI, String llllllllllllllIllIlIIlllIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlllIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlllIlIllIll.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIlIl[11]), "DES");
            Cipher llllllllllllllIllIlIIlllIllIIIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlllIllIIIII.init(lIlIllIIIIlIl[3], llllllllllllllIllIlIIlllIllIIIIl);
            return new String(llllllllllllllIllIlIIlllIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlllIlIlllll) {
            llllllllllllllIllIlIIlllIlIlllll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        x llllllllllllllIllIlIIllllIIIlllI;
        int llllllllllllllIllIlIIllllIIIllIl;
        int n2 = lIlIllIIIIlIl[1];
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(this.X() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[0]]);
            llllllllllllllIllIlIIllllIIIllIl = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(llllllllllllllIllIlIIllllIIIlllI.Y() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[3]]);
            llllllllllllllIllIlIIllllIIIllIl = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(llllllllllllllIllIlIIllllIIIlllI.Z() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[4]]);
            llllllllllllllIllIlIIllllIIIllIl = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIIll(llllllllllllllIllIlIIllllIIIlllI.aa() ? 1 : 0)) {
            Log.info((String)lIlIllIIIIlII[lIlIllIIIIlIl[5]]);
            llllllllllllllIllIlIIllllIIIllIl = lIlIllIIIIlIl[0];
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.llIIIIIIIIlIlII(llllllllllllllIllIlIIllllIIIllIl)) {
            return lIlIllIIIIlIl[1];
        }
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.W();
        this.x.a(lIlIllIIIIlIl[0]);
        return lIlIllIIIIlIl[0];
    }

    private static boolean llIIIIIIIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }
}

