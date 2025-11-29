/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.Iterables;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.b;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.c;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.d;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.g;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.i;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.o;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Finding Herbiboar")
public class n
extends Task {
    private static /* synthetic */ int[] lllIIllIIllI;
    private static final /* synthetic */ Logger aj;
    private final /* synthetic */ d an;
    private final /* synthetic */ SquireHerbiboarPlugin ak;
    private final /* synthetic */ SquireHerbiboarConfig al;
    @Inject
    private /* synthetic */ i n;
    private static /* synthetic */ String[] lllIIlIlllII;
    private final /* synthetic */ b am;

    private static String lIIIlIlIIllllll(String lllllllllllllllIIllIlIIIlIlIIIIl, String lllllllllllllllIIllIlIIIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIlIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIlIlIIlIl.init(lllIIllIIllI[5], lllllllllllllllIIllIlIIIlIlIIllI);
            return new String(lllllllllllllllIIllIlIIIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIlIlIIlII) {
            lllllllllllllllIIllIlIIIlIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIlIl();
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIlII();
        aj = LoggerFactory.getLogger(n.class);
    }

    private static boolean lIIIlIlIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIlIlIIIlII() {
        lllIIlIlllII = new String[lllIIllIIllI[16]];
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIlIlIIl("HTUmOQ==", "RECWC");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[1]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIlIlIIl("LD40MioGJA==", "ePGBO");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[5]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIlIlIIl("Bwg8LAlkED0zBDEDPQ==", "DdUAk");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[6]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("qVypXgB/uRM=", "SBjDM");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[8]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIIIl("pUC1MxG7MRg=", "qjxHz");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[3]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("DfqHTxFVsio=", "XLocy");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[9]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("XRU0e4h26HM8HdIyKSmpAw==", "PUocE");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[2]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIIIl("8zZeqdEuZUI=", "myEXE");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[10]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIIIl("bWOohBR/AjKDNsloowhyGQ==", "nwVKF");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[11]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("UNhgygeBUNs=", "DLxOQ");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[12]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("BSGcUPfYb2M=", "BvrwM");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[13]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIllllll("zsyE468YB6I=", "DdeUq");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[14]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIIlIlIIl("CzAaCA==", "xQycO");
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[15]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIIIl("ntQ2qgyWJhs=", "VfECw");
    }

    @Inject
    public n(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2, d d2) {
        this.ak = squireHerbiboarPlugin;
        this.al = squireHerbiboarConfig;
        this.am = b2;
        this.an = d2;
    }

    private void a(TileObject tileObject, String string) {
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(tileObject)) {
            tileObject.interact(string);
        }
    }

    private static boolean lIIIlIlIlIIlIII(Object object) {
        return object != null;
    }

    private static String lIIIlIlIlIIIIIl(String lllllllllllllllIIllIlIIIlIllIIII, String lllllllllllllllIIllIlIIIlIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), lllIIllIIllI[10]), "DES");
            Cipher lllllllllllllllIIllIlIIIlIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIlIllIIlI.init(lllIIllIIllI[5], lllllllllllllllIIllIlIIIlIllIIll);
            return new String(lllllllllllllllIIllIlIIIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIlIllIIIl) {
            lllllllllllllllIIllIlIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIlIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIlIlIIIllI(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIlIlIIIlIl() {
        lllIIllIIllI = new int[17];
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0] = (0x19 ^ 0x7B) & ~(0xC9 ^ 0xAB);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[1] = " ".length();
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[2] = 0x51 ^ 0x35 ^ (0x3F ^ 0x5C);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[3] = 0x53 ^ 0x62 ^ (0xBD ^ 0x89);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[4] = 117 + 126 - 42 + 10 ^ 13 + 45 - -73 + 18;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[5] = "  ".length();
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[6] = "   ".length();
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[7] = 0xFFFFD79E & 0x3EE7;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[8] = 0x2D ^ 0x29;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[9] = 88 + 141 - 186 + 105 ^ 33 + 122 - 49 + 40;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[10] = 0xA0 ^ 0xA8;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[11] = 0x4F ^ 0x46;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[12] = 0x31 ^ 0x3B;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[13] = 0xAB ^ 0xA0;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[14] = 36 + 23 - 0 + 75 ^ 16 + 39 - 47 + 130;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[15] = 0x93 ^ 0x9E;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[16] = 101 + 122 - 113 + 60 ^ 90 + 18 - -50 + 6;
    }

    private static boolean lIIIlIlIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        n lllllllllllllllIIllIlIIIllIIIlll;
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(this.ak.f() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Bank.isOpen() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(lllllllllllllllIIllIlIIIllIIIlll.al.useHerbSack() ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Inventory.contains(item -> {
            int n2;
            if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIllIIllI[1]];
                stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[15]];
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllIIllI[1];
                    "".length();
                    if (-(0x80 ^ 0x84) <= 0) return n2 != 0;
                    return (" ".length() & ~" ".length()) != 0;
                }
            }
            n2 = lllIIllIIllI[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[13]])).interact(lllIIlIlllII[lllIIllIIllI[0]]);
            return lllIIllIIllI[1];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        c lllllllllllllllIIllIlIIIllIIIllI = lllllllllllllllIIllIlIIIllIIIlll.am.i();
        List<f> lllllllllllllllIIllIlIIIllIIIlIl = lllllllllllllllIIllIlIIIllIIIlll.n.z();
        switch (o.ao[lllllllllllllllIIllIlIIIllIIIllI.ordinal()]) {
            case 1: {
                WorldPoint lllllllllllllllIIllIlIIIllIIIIll;
                TileObject lllllllllllllllIIllIlIIIllIIIlII = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(b.l.contains(tileObject.getId()) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIllIIllI[1]];
                        stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[12]];
                        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lllIIllIIllI[1];
                            "".length();
                            if (-" ".length() == -" ".length()) return n2 != 0;
                            return ((0xEC ^ 0xC6) & ~(0xE9 ^ 0xC3)) != 0;
                        }
                    }
                    n2 = lllIIllIIllI[0];
                    return n2 != 0;
                });
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(lllllllllllllllIIllIlIIIllIIIlII)) {
                    lllllllllllllllIIllIlIIIllIIIIll = lllllllllllllllIIllIlIIIllIIIlII.getWorldLocation();
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(lllllllllllllllIIllIlIIIllIIIIll.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                        lllllllllllllllIIllIlIIIllIIIlll.a(lllllllllllllllIIllIlIIIllIIIlII, lllIIlIlllII[lllIIllIIllI[1]]);
                        "".length();
                        if (((106 + 15 - 63 + 81 ^ 182 + 110 - 179 + 80) & (87 + 75 - 141 + 191 ^ 67 + 136 - 138 + 93 ^ -" ".length())) != 0) {
                            return ((178 + 145 - 195 + 120 ^ 10 + 115 - 70 + 123) & (0x5E ^ 0x6E ^ (0x51 ^ 0x2B) ^ -" ".length())) != 0;
                        }
                    } else {
                        Movement.walkTo((WorldPoint)lllllllllllllllIIllIlIIIllIIIIll);
                        "".length();
                    }
                }
            }
            case 2: {
                TileObject lllllllllllllllIIllIlIIIllIIIIlI;
                TileObject lllllllllllllllIIllIlIIIllIIIlII = ((f)((Object)Iterables.getLast(lllllllllllllllIIllIlIIIllIIIlIl))).l();
                WorldPoint lllllllllllllllIIllIlIIIllIIIIll = lllllllllllllllIIllIlIIIllIIIlll.n.w().get(lllllllllllllllIIllIlIIIllIIIlII);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIlI((Object)lllllllllllllllIIllIlIIIllIIIlll.n.F(), (Object)g.J) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIll(lllllllllllllllIIllIlIIIllIIIIll.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[3]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(lllllllllllllllIIllIlIIIllIIIIlI = TileObjects.getNearest(tileObject -> {
                    int n2;
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[10]];
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.getName().equals(lllIIlIlllII[lllIIllIIllI[11]]) ? 1 : 0)) {
                        n2 = lllIIllIIllI[1];
                        "".length();
                        if (-" ".length() > -" ".length()) {
                            return ((0xFC ^ 0xAC) & ~(0xC3 ^ 0x93)) != 0;
                        }
                    } else {
                        n2 = lllIIllIIllI[0];
                    }
                    return n2 != 0;
                })) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIllII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lllIIllIIllI[4]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(lllllllllllllllIIllIlIIIllIIIIlI.distanceTo((Locatable)lllllllllllllllIIllIlIIIllIIIIll), lllllllllllllllIIllIlIIIllIIIIll.distanceTo((Locatable)Players.getLocal()))) {
                    lllllllllllllllIIllIlIIIllIIIIlI.interact(lllIIlIlllII[lllIIllIIllI[5]]);
                    return lllIIllIIllI[1];
                }
                Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIIIllIIIlII);
                "".length();
                if (" ".length() > 0) break;
                return ((0x47 ^ 0x37 ^ (0x61 ^ 0xB)) & (0xA1 ^ 0xB1 ^ (0xA3 ^ 0xA9) ^ -" ".length())) != 0;
            }
            case 3: {
                WorldPoint lllllllllllllllIIllIlIIIllIIIlII = ((f)((Object)Iterables.getLast(lllllllllllllllIIllIlIIIllIIIlIl))).l();
                TileObject lllllllllllllllIIllIlIIIllIIIIll = TileObjects.getNearest((WorldPoint)lllllllllllllllIIllIlIIIllIIIlII, tileObject -> {
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[2]];
                    return tileObject.hasAction(stringArray);
                });
                System.out.println(lllllllllllllllIIllIlIIIllIIIIll.getWorldLocation());
                lllllllllllllllIIllIlIIIllIIIIll.interact(lllIIlIlllII[lllIIllIIllI[6]]);
                "".length();
                if (null == null) break;
                return ((0x49 ^ 0x72 ^ (0x24 ^ 0x14)) & (0x9A ^ 0x8A ^ (0x81 ^ 0x9A) ^ -" ".length())) != 0;
            }
            case 4: {
                WorldPoint lllllllllllllllIIllIlIIIllIIIlII = b.m.get(Vars.getBit((int)lllIIllIIllI[7]) - lllIIllIIllI[1]);
                TileObject lllllllllllllllIIllIlIIIllIIIIll = lllllllllllllllIIllIlIIIllIIIlll.am.a(lllllllllllllllIIllIlIIIllIIIlII);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(lllllllllllllllIIllIlIIIllIIIlII.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                    lllllllllllllllIIllIlIIIllIIIlll.a(lllllllllllllllIIllIlIIIllIIIIll, lllIIlIlllII[lllIIllIIllI[8]]);
                    "".length();
                    if (((54 + 199 - 22 + 3 ^ 168 + 54 - 172 + 146) & (0xB9 ^ 0xB5 ^ (0x4C ^ 0x6E) ^ -" ".length())) >= -" ".length()) break;
                    return ((117 + 154 - 142 + 103 ^ 5 + 68 - 51 + 158) & (0x40 ^ 7 ^ (0xB3 ^ 0xA8) ^ -" ".length())) != 0;
                }
                Movement.setDestination((WorldPoint)lllllllllllllllIIllIlIIIllIIIlII);
                "".length();
                if (((20 + 152 - 101 + 135 ^ 73 + 7 - 11 + 62) & (0xD5 ^ 0x82 ^ (0xBF ^ 0xA5) ^ -" ".length())) < " ".length()) break;
                return ((186 + 137 - 174 + 43 ^ 195 + 126 - 265 + 140) & (0x1F ^ 0x2F ^ (0x10 ^ 0x24) ^ -" ".length())) != 0;
            }
            case 5: {
                NPC lllllllllllllllIIllIlIIIllIIIlII = NPCs.getNearest(nPC -> nPC.getName().equals(lllIIlIlllII[lllIIllIIllI[9]]));
                if (!s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(lllllllllllllllIIllIlIIIllIIIlII)) break;
                lllllllllllllllIIllIlIIIllIIIlII.interact(lllIIlIlllII[lllIIllIIllI[3]]);
                "".length();
                if (null == null) break;
                return ((0x6F ^ 0x2A) & ~(0x59 ^ 0x1C)) != 0;
            }
        }
        return lllIIllIIllI[1];
    }

    private static boolean lIIIlIlIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlIlIIlIlIIl(String lllllllllllllllIIllIlIIIlIIlIIll, String lllllllllllllllIIllIlIIIlIIIllIl) {
        lllllllllllllllIIllIlIIIlIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIlIIlIIII = lllllllllllllllIIllIlIIIlIIIllIl.toCharArray();
        int lllllllllllllllIIllIlIIIlIIIllll = lllIIllIIllI[0];
        char[] lllllllllllllllIIllIlIIIlIIIlIIl = lllllllllllllllIIllIlIIIlIIlIIll.toCharArray();
        int lllllllllllllllIIllIlIIIlIIIlIII = lllllllllllllllIIllIlIIIlIIIlIIl.length;
        int lllllllllllllllIIllIlIIIlIIIIlll = lllIIllIIllI[0];
        while (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(lllllllllllllllIIllIlIIIlIIIIlll, lllllllllllllllIIllIlIIIlIIIlIII)) {
            char lllllllllllllllIIllIlIIIlIIlIlII = lllllllllllllllIIllIlIIIlIIIlIIl[lllllllllllllllIIllIlIIIlIIIIlll];
            lllllllllllllllIIllIlIIIlIIlIIIl.append((char)(lllllllllllllllIIllIlIIIlIIlIlII ^ lllllllllllllllIIllIlIIIlIIlIIII[lllllllllllllllIIllIlIIIlIIIllll % lllllllllllllllIIllIlIIIlIIlIIII.length]));
            "".length();
            ++lllllllllllllllIIllIlIIIlIIIllll;
            ++lllllllllllllllIIllIlIIIlIIIIlll;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIlIIlIIIl);
    }
}

