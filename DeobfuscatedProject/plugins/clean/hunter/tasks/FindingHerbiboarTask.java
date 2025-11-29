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
package gg.squire.hunter.tasks;

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
import gg.squire.hunter.tasks.BHelper;
import gg.squire.hunter.tasks.GameEnum7;
import gg.squire.hunter.tasks.CheckingSuppliesTask;
import gg.squire.hunter.tasks.GameEnum13;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.IHelper;
import gg.squire.hunter.tasks.OHelper;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Finding Herbiboar")
public class FindingHerbiboarTask
extends Task {
    
    private static final  Logger aj;
    private final  d an;
    private final  SquireHerbiboarPlugin ak;
    private final  SquireHerbiboarConfig al;
    @Inject
    private  i n;
    
    private final  b am;

    static {
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIlIl();
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIlII();
        aj = LoggerFactory.getLogger(FindingHerbiboarTask.class);
    }

    private static boolean lIIIlIlIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIlIlIIIlII() {
        lllIIlIlllII = new String[lllIIllIIllI[16]];
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Open";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[1]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[5]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[6]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[8]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Attack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[3]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Harvest";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[9]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Herbiboar";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[2]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[10]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[11]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Hole";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[12]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[13]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[14]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIlIlllII[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[15]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Open";
    }

    @Inject
    public FindingHerbiboarTask(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2, d d2) {
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

    private static boolean lIIIlIlIlIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIlIlIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIlIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        n var1;
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(this.ak.f() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Bank.isOpen() ? 1 : 0)) {
            return lllIIllIIllI[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(var1.al.useHerbSack() ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(Inventory.contains(item -> {
            int n2;
            if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.getName().toLowerCase().contains(lllIIlIlllII[lllIIllIIllI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIllIIllI[1]];
                stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[15]];
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIllIIllI[1];

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
        c var2 = var1.am.i();
        List<f> var3 = var1.n.z();
        switch (o.ao[var2.ordinal()]) {
            case 1: {
                WorldPoint var4;
                TileObject var5 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(b.l.contains(tileObject.getId()) ? 1 : 0)) {
                        String[] stringArray = new String[lllIIllIIllI[1]];
                        stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[12]];
                        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lllIIllIIllI[1];

                            if (-1 == -1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lllIIllIIllI[0];
                    return n2 != 0;
                });
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var5)) {
                    var4 = var5.getWorldLocation();
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var4.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                        var1.a(var5, lllIIlIlllII[lllIIllIIllI[1]]);

                        if (((106 + 15 - 63 + 81 ^ 182 + 110 - 179 + 80) & (87 + 75 - 141 + 191 ^ 67 + 136 - 138 + 93 ^ -1)) != 0) {
                            return ((178 + 145 - 195 + 120 ^ 10 + 115 - 70 + 123) & (0x5E ^ 0x6E ^ (0x51 ^ 0x2B) ^ -1)) != 0;
                        }
                    } else {
                        Movement.walkTo((WorldPoint)var4);

                    }
                }
            }
            case 2: {
                TileObject var6;
                TileObject var5 = ((f)((Object)Iterables.getLast(var3))).l();
                WorldPoint var4 = var1.n.w().get(var5);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIlI((Object)var1.n.F(), (Object)g.J) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIll(var4.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[3]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var6 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[10]];
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIIllI(tileObject.getName().equals(lllIIlIlllII[lllIIllIIllI[11]]) ? 1 : 0)) {
                        n2 = lllIIllIIllI[1];

                        if (-1 > -1) {
                            return false;
                        }
                    } else {
                        n2 = lllIIllIIllI[0];
                    }
                    return n2 != 0;
                })) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIllII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lllIIllIIllI[4]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var6.distanceTo((Locatable)var4), var4.distanceTo((Locatable)Players.getLocal()))) {
                    var6.interact(lllIIlIlllII[lllIIllIIllI[5]]);
                    return lllIIllIIllI[1];
                }
                Movement.setDestination((WorldPoint)var5);

                if (1 > 0) break;
                return ((0x47 ^ 0x37 ^ (0x61 ^ 0xB)) & (0xA1 ^ 0xB1 ^ (0xA3 ^ 0xA9) ^ -1)) != 0;
            }
            case 3: {
                WorldPoint var5 = ((f)((Object)Iterables.getLast(var3))).l();
                TileObject var4 = TileObjects.getNearest((WorldPoint)var5, tileObject -> {
                    String[] stringArray = new String[lllIIllIIllI[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lllIIllIIllI[0]] = lllIIlIlllII[lllIIllIIllI[2]];
                    return tileObject.hasAction(stringArray);
                });
                System.out.println(var4.getWorldLocation());
                var4.interact(lllIIlIlllII[lllIIllIIllI[6]]);

                if (null == null) break;
                return ((0x49 ^ 0x72 ^ (0x24 ^ 0x14)) & (0x9A ^ 0x8A ^ (0x81 ^ 0x9A) ^ -1)) != 0;
            }
            case 4: {
                WorldPoint var5 = b.m.get(Vars.getBit((int)lllIIllIIllI[7]) - lllIIllIIllI[1]);
                TileObject var4 = var1.am.a(var5);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIIl(var5.distanceTo((Locatable)Players.getLocal()), lllIIllIIllI[2])) {
                    var1.a(var4, lllIIlIlllII[lllIIllIIllI[8]]);

                    if (((54 + 199 - 22 + 3 ^ 168 + 54 - 172 + 146) & (0xB9 ^ 0xB5 ^ (0x4C ^ 0x6E) ^ -1)) >= -1) break;
                    return ((117 + 154 - 142 + 103 ^ 5 + 68 - 51 + 158) & (0x40 ^ 7 ^ (0xB3 ^ 0xA8) ^ -1)) != 0;
                }
                Movement.setDestination((WorldPoint)var5);

                if (((20 + 152 - 101 + 135 ^ 73 + 7 - 11 + 62) & (0xD5 ^ 0x82 ^ (0xBF ^ 0xA5) ^ -1)) < 1) break;
                return ((186 + 137 - 174 + 43 ^ 195 + 126 - 265 + 140) & (0x1F ^ 0x2F ^ (0x10 ^ 0x24) ^ -1)) != 0;
            }
            case 5: {
                NPC var5 = NPCs.getNearest(nPC -> nPC.getName().equals(lllIIlIlllII[lllIIllIIllI[9]]));
                if (!s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.lIIIlIlIlIIlIII(var5)) break;
                var5.interact(lllIIlIlllII[lllIIllIIllI[3]]);

                if (null == null) break;
                return false;
            }
        }
        return lllIIllIIllI[1];
    }

    private static boolean lIIIlIlIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var7);
    }
}

