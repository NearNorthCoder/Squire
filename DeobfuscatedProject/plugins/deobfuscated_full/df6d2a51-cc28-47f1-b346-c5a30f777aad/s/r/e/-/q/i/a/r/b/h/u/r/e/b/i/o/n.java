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

/* TASK: Finding Herbiboar -> FindingherbiboarTask */
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

    private static String lIIIlIlIIllllll(String var13, String var23) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lllIIllIIllI[5], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
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
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Open";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[1]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[5]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[6]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[8]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Attack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[3]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Harvest";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[9]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Herbiboar";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[2]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[10]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[11]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Hole";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[12]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[13]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[14]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[15]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n."Open";
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

    private static String lIIIlIlIlIIIIIl(String var17, String var9) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lllIIllIIllI[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lllIIllIIllI[5], var21);
            return new String(var11.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[1] = 1;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[2] = 0x51 ^ 0x35 ^ (0x3F ^ 0x5C);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[3] = 0x53 ^ 0x62 ^ (0xBD ^ 0x89);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[4] = 117 + 126 - 42 + 10 ^ 13 + 45 - -73 + 18;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[5] = 2;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[6] = 3;
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
        n var18;
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(this.ak.f() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Bank.isOpen() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(var18.al.useHerbSack() ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Inventory.contains(item -> {
            int n2;
            if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIllIIllI[1]];
                stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[15]];
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllIIllI[1];
                    0;
                    if (-(0x80 ^ 0x84) <= 0) return n2 != 0;
                    return (1 & ~1) != 0;
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
        c var1 = var18.am.i();
        List<f> var2 = var18.n.z();
        switch (o.ao[var1.ordinal()]) {
            case 1: {
                WorldPoint var16;
                TileObject var19 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(b.l.contains(tileObject.getId()) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIllIIllI[1]];
                        stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[12]];
                        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lllIIllIIllI[1];
                            0;
                            if (-1 == -1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lllIIllIIllI[0];
                    return n2 != 0;
                });
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var19)) {
                    var16 = var19.getWorldLocation();
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var16.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                        var18.a(var19, lllIIlIlllII[lllIIllIIllI[1]]);
                        0;
                        if (((106 + 15 - 63 + 81 ^ 182 + 110 - 179 + 80) & (87 + 75 - 141 + 191 ^ 67 + 136 - 138 + 93 ^ -1)) != 0) {
                            return ((178 + 145 - 195 + 120 ^ 10 + 115 - 70 + 123) & (0x5E ^ 0x6E ^ (0x51 ^ 0x2B) ^ -1)) != 0;
                        }
                    } else {
                        Movement.walkTo((WorldPoint)var16);
                        0;
                    }
                }
            }
            case 2: {
                TileObject var15;
                TileObject var19 = ((f)((Object)Iterables.getLast(var2))).l();
                WorldPoint var16 = var18.n.w().get(var19);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIlI((Object)var18.n.F(), (Object)g.J) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIll(var16.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[3]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var15 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[10]];
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.getName().equals(lllIIlIlllII[lllIIllIIllI[11]]) ? 1 : 0)) {
                        n2 = lllIIllIIllI[1];
                        0;
                        if (-1 > -1) {
                            return false;
                        }
                    } else {
                        n2 = lllIIllIIllI[0];
                    }
                    return n2 != 0;
                })) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIllII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lllIIllIIllI[4]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var15.distanceTo((Locatable)var16), var16.distanceTo((Locatable)Players.getLocal()))) {
                    var15.interact(lllIIlIlllII[lllIIllIIllI[5]]);
                    return lllIIllIIllI[1];
                }
                Movement.setDestination((WorldPoint)var19);
                0;
                if (1 > 0) break;
                return ((0x47 ^ 0x37 ^ (0x61 ^ 0xB)) & (0xA1 ^ 0xB1 ^ (0xA3 ^ 0xA9) ^ -1)) != 0;
            }
            case 3: {
                WorldPoint var19 = ((f)((Object)Iterables.getLast(var2))).l();
                TileObject var16 = TileObjects.getNearest((WorldPoint)var19, tileObject -> {
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[2]];
                    return tileObject.hasAction(stringArray);
                });
                System.out.println(var16.getWorldLocation());
                var16.interact(lllIIlIlllII[lllIIllIIllI[6]]);
                0;
                if (null == null) break;
                return ((0x49 ^ 0x72 ^ (0x24 ^ 0x14)) & (0x9A ^ 0x8A ^ (0x81 ^ 0x9A) ^ -1)) != 0;
            }
            case 4: {
                WorldPoint var19 = b.m.get(Vars.getBit((int)lllIIllIIllI[7]) - lllIIllIIllI[1]);
                TileObject var16 = var18.am.a(var19);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var19.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                    var18.a(var16, lllIIlIlllII[lllIIllIIllI[8]]);
                    0;
                    if (((54 + 199 - 22 + 3 ^ 168 + 54 - 172 + 146) & (0xB9 ^ 0xB5 ^ (0x4C ^ 0x6E) ^ -1)) >= -1) break;
                    return ((117 + 154 - 142 + 103 ^ 5 + 68 - 51 + 158) & (0x40 ^ 7 ^ (0xB3 ^ 0xA8) ^ -1)) != 0;
                }
                Movement.setDestination((WorldPoint)var19);
                0;
                if (((20 + 152 - 101 + 135 ^ 73 + 7 - 11 + 62) & (0xD5 ^ 0x82 ^ (0xBF ^ 0xA5) ^ -1)) < 1) break;
                return ((186 + 137 - 174 + 43 ^ 195 + 126 - 265 + 140) & (0x1F ^ 0x2F ^ (0x10 ^ 0x24) ^ -1)) != 0;
            }
            case 5: {
                NPC var19 = NPCs.getNearest(nPC -> nPC.getName().equals(lllIIlIlllII[lllIIllIIllI[9]]));
                if (!s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var19)) break;
                var19.interact(lllIIlIlllII[lllIIllIIllI[3]]);
                0;
                if (null == null) break;
                return false;
            }
        }
        return lllIIllIIllI[1];
    }

    private static boolean lIIIlIlIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlIlIIlIlIIl(String var25, String var3) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var4 = var3.toCharArray();
        int var6 = lllIIllIIllI[0];
        char[] var20 = var25.toCharArray();
        int var14 = var20.length;
        int var24 = lllIIllIIllI[0];
        while (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var24, var14)) {
            char var5 = var20[var24];
            var8.append((char)(var5 ^ var4[var6 % var4.length]));
            0;
            ++var6;
            ++var24;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }
}

