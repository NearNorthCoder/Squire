/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.I;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.o;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.p;
import gg.squire.sepulchre.SquireSepulchre;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

public final class n
extends Enum<n> {
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n BOTTOM_V_II;
    private /* synthetic */ boolean north;
    private static /* synthetic */ int[] lllIIIIllIIl;
    /* synthetic */ Supplier<WorldArea> dartArea;
    /* synthetic */ p type;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    private static /* synthetic */ String[] lllIIIIllIII;
    public /* synthetic */ Supplier<TileObject> object;
    /* synthetic */ o entry;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldPoint> startDestination;

    /*
     * Unable to fully structure code
     */
    private List<WorldPoint> a(List<WorldPoint> var1_1, d var2_2) {
        var3_3 = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(var3_3)) {
            return null;
        }
        lllllllllllllllIIlllIIIllIIIIIIl = I.aC();
        lllllllllllllllIIlllIIIllIIIIIII = new ArrayList<WorldPoint>();
        lllllllllllllllIIlllIIIlIlllllll = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlllllll, lllllllllllllllIIlllIIIllIIIIlII.size())) {
            lllllllllllllllIIlllIIIlIllllllI = (WorldPoint)lllllllllllllllIIlllIIIllIIIIlII.get(lllllllllllllllIIlllIIIlIlllllll);
            if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIllllllI)) {
                "".length();
                if (((135 ^ 155 ^ (231 ^ 190)) & (88 ^ 79 ^ (2 ^ 80) ^ -" ".length())) != 0) {
                    return null;
                }
            } else if (n.lIIIlIIIlIIllII((int)lllllllllllllllIIlllIIIllIIIIIIl.contains(lllllllllllllllIIlllIIIlIllllllI)) && n.lIIIlIIIlIIllll((Object)p.FINAL, (Object)lllllllllllllllIIlllIIIllIIIIlIl.type)) {
                lllllllllllllllIIlllIIIllIIIIIII.add(lllllllllllllllIIlllIIIlIllllllI.dx(n.lllIIIIllIIl[0]));
                "".length();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
            } else {
                lllllllllllllllIIlllIIIllIIIIIII.add(lllllllllllllllIIlllIIIlIllllllI);
                "".length();
            }
            ++lllllllllllllllIIlllIIIlIlllllll;
            "".length();
            if (null == null) continue;
            return null;
        }
        lllllllllllllllIIlllIIIlIlllllll = lllllllllllllllIIlllIIIllIIIIlIl.startPoint.get();
        lllllllllllllllIIlllIIIlIllllllI = lllllllllllllllIIlllIIIlIlllllll.getWorldY() - n.lllIIIIllIIl[0];
        lllllllllllllllIIlllIIIlIlllllIl = lllllllllllllllIIlllIIIlIlllllll.getWorldY() + n.lllIIIIllIIl[5];
        lllllllllllllllIIlllIIIlIlllllII = TileObjects.getNearest((WorldPoint)new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIllllllI, lllllllllllllllIIlllIIIlIlllllll.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, h(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)lllllllllllllllIIlllIIIllIIIIIlI));
        lllllllllllllllIIlllIIIlIllllIll = TileObjects.getNearest((WorldPoint)new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllllIl, lllllllllllllllIIlllIIIlIlllllll.getPlane()), (Predicate<TileObject>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, g(net.runelite.api.Player net.runelite.api.TileObject ), (Lnet/runelite/api/TileObject;)Z)((Player)lllllllllllllllIIlllIIIllIIIIIlI));
        if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIlllllII)) {
            return lllllllllllllllIIlllIIIllIIIIIII;
        }
        if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIllllIll)) {
            return lllllllllllllllIIlllIIIllIIIIIII;
        }
        lllllllllllllllIIlllIIIlIllllIlI = lllllllllllllllIIlllIIIllIIIIIll.b(lllllllllllllllIIlllIIIlIlllllII);
        lllllllllllllllIIlllIIIlIllllIIl = lllllllllllllllIIlllIIIllIIIIIll.b(lllllllllllllllIIlllIIIlIllllIll);
        if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIllllIlI)) {
            return lllllllllllllllIIlllIIIllIIIIIII;
        }
        if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIllllIIl)) {
            return lllllllllllllllIIlllIIIllIIIIIII;
        }
        lllllllllllllllIIlllIIIlIllllIII = new ArrayList<WorldPoint>();
        lllllllllllllllIIlllIIIlIlllIlll = n.lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlllIlll, lllllllllllllllIIlllIIIllIIIIIII.size())) {
            block45: {
                block54: {
                    block53: {
                        block52: {
                            block51: {
                                block50: {
                                    block46: {
                                        block49: {
                                            block47: {
                                                block48: {
                                                    block44: {
                                                        lllllllllllllllIIlllIIIlIlllIlIl = (WorldPoint)lllllllllllllllIIlllIIIllIIIIIII.get(lllllllllllllllIIlllIIIlIlllIlll);
                                                        lllllllllllllllIIlllIIIlIlllIlII = lllllllllllllllIIlllIIIllIIIIlIl.dartArea.get().getX();
                                                        if (!n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIlllIlIl)) break block44;
                                                        "".length();
                                                        if (null != null) {
                                                            return null;
                                                        }
                                                        break block45;
                                                    }
                                                    if (!n.lIIIlIIIlIlIlII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[6], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block46;
                                                    if (!n.lIIIlIIIlIIllII((int)lllllllllllllllIIlllIIIllIIIIlIl.north)) break block47;
                                                    if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[7], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block48;
                                                    if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aF(), n.lllIIIIllIIl[0])) {
                                                        lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                        lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                        "".length();
                                                        "".length();
                                                        if (((80 + 7 - 28 + 89 ^ 39 + 68 - 60 + 134) & (76 ^ 83 ^ (20 ^ 42) ^ -" ".length())) != 0) {
                                                            return null;
                                                        }
                                                    } else if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aF(), n.lllIIIIllIIl[0])) {
                                                        lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                        lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                        "".length();
                                                        "".length();
                                                        if ("   ".length() == 0) {
                                                            return null;
                                                        }
                                                    } else {
                                                        lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX(), lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                        lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                        "".length();
                                                        "".length();
                                                        if (null != null) {
                                                            return null;
                                                        }
                                                    }
                                                    break block45;
                                                }
                                                if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[8], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block47;
                                                lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                "".length();
                                                "".length();
                                                if (-" ".length() >= (79 ^ 75)) {
                                                    return null;
                                                }
                                                break block45;
                                            }
                                            if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[8], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block49;
                                            if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aF(), n.lllIIIIllIIl[0])) {
                                                lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                "".length();
                                                "".length();
                                                if ((152 ^ 156) == 0) {
                                                    return null;
                                                }
                                            } else if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aF(), n.lllIIIIllIIl[0])) {
                                                lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                "".length();
                                                "".length();
                                                if (null != null) {
                                                    return null;
                                                }
                                            } else {
                                                lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX(), lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                                lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                                "".length();
                                                "".length();
                                                if ("  ".length() < 0) {
                                                    return null;
                                                }
                                            }
                                            break block45;
                                        }
                                        if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[9], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block46;
                                        lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                        lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                        "".length();
                                        "".length();
                                        if (" ".length() == "   ".length()) {
                                            return null;
                                        }
                                        break block45;
                                    }
                                    if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[10], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block50;
                                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                    "".length();
                                    "".length();
                                    if (("   ".length() ^ (50 ^ 53)) < 0) {
                                        return null;
                                    }
                                    break block45;
                                }
                                if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[6], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) break block51;
                                if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aF(), n.lllIIIIllIIl[0])) {
                                    lllllllllllllllIIlllIIIllIIIIlIl.north = n.lllIIIIllIIl[0];
                                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                    "".length();
                                    "".length();
                                    if (null != null) {
                                        return null;
                                    }
                                } else if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.o) && n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aF(), n.lllIIIIllIIl[0])) {
                                    lllllllllllllllIIlllIIIllIIIIlIl.north = n.lllIIIIllIIl[1];
                                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                    "".length();
                                    "".length();
                                    if (-" ".length() >= ((52 ^ 14) & ~(155 ^ 161))) {
                                        return null;
                                    }
                                } else {
                                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX(), lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                                    "".length();
                                    "".length();
                                    if ("   ".length() == 0) {
                                        return null;
                                    }
                                }
                                break block45;
                            }
                            lllllllllllllllIIlllIIIlIlllIIll = Math.abs(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - lllllllllllllllIIlllIIIlIlllllII.getWorldX());
                            if ((!n.lIIIlIIIlIlIlIl(lllllllllllllllIIlllIIIlIlllIIll, n.lllIIIIllIIl[4]) || n.lIIIlIIIlIlIIlI(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[11], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) && (!n.lIIIlIIIlIlIIlI(lllllllllllllllIIlllIIIlIlllIIll, n.lllIIIIllIIl[3]) || !n.lIIIlIIIlIlIlIl(lllllllllllllllIIlllIIIlIlllIIll, n.lllIIIIllIIl[5]) || !n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[12], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX()) || !n.lIIIlIIIlIlIlII(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[11], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX()))) ** GOTO lbl-1000
                            if (n.lIIIlIIIlIlIIll(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.r) && !n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.q)) break block52;
                            lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX(), lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                            lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                            "".length();
                            "".length();
                            if ((140 + 165 - 214 + 89 ^ 162 + 127 - 282 + 170) == 0) {
                                return null;
                            }
                            break block45;
                        }
                        if (n.lIIIlIIIlIlIIll(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.r) && !n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.q)) break block53;
                        lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX(), lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                        lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                        "".length();
                        "".length();
                        if (null != null) {
                            return null;
                        }
                        break block45;
                    }
                    if (!n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlllIlII + n.lllIIIIllIIl[11], lllllllllllllllIIlllIIIllIIIIIlI.getWorldX())) ** GOTO lbl-1000
                    if (!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() % n.lllIIIIllIIl[3], n.lllIIIIllIIl[0])) break block54;
                    if ((!n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.o) || n.lIIIlIIIlIlIlIl(lllllllllllllllIIlllIIIlIllllIlI.aF(), n.lllIIIIllIIl[0])) && !n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIlI.aG(), b.n)) ** GOTO lbl-1000
                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                    "".length();
                    "".length();
                    if ((22 ^ 86 ^ (84 ^ 16)) < -" ".length()) {
                        return null;
                    }
                    break block45;
                }
                if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.o) && !n.lIIIlIIIlIlIlIl(lllllllllllllllIIlllIIIlIllllIIl.aF(), n.lllIIIIllIIl[0]) || n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIllllIIl.aG(), b.n)) {
                    lllllllllllllllIIlllIIIlIlllIllI = new WorldPoint(lllllllllllllllIIlllIIIllIIIIIlI.getWorldX() - n.lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllIlIl.getY(), lllllllllllllllIIlllIIIllIIIIIlI.getPlane());
                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIllI);
                    "".length();
                    "".length();
                    if (-" ".length() >= (165 ^ 161)) {
                        return null;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    lllllllllllllllIIlllIIIlIllllIII.add(lllllllllllllllIIlllIIIlIlllIlIl);
                    "".length();
                }
            }
            ++lllllllllllllllIIlllIIIlIlllIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return var13_15;
    }

    private static void lIIIlIIIlIIlIlI() {
        lllIIIIllIIl = new int[27];
        n.lllIIIIllIIl[0] = " ".length();
        n.lllIIIIllIIl[1] = (0x37 ^ 0x71) & ~(0xFF ^ 0xB9);
        n.lllIIIIllIIl[2] = 0x86 ^ 0x89;
        n.lllIIIIllIIl[3] = "  ".length();
        n.lllIIIIllIIl[4] = "   ".length();
        n.lllIIIIllIIl[5] = 2 ^ 0x19 ^ (0xAE ^ 0xB1);
        n.lllIIIIllIIl[6] = 178 + 27 - 145 + 124 ^ 113 + 70 - 166 + 155;
        n.lllIIIIllIIl[7] = 0x69 ^ 0x65;
        n.lllIIIIllIIl[8] = 0x30 ^ 0x3D;
        n.lllIIIIllIIl[9] = 0xAD ^ 0xA3;
        n.lllIIIIllIIl[10] = 0xE1 ^ 0x8A ^ (0x13 ^ 0x6D);
        n.lllIIIIllIIl[11] = 0xDB ^ 0x8D ^ (0x73 ^ 0xD);
        n.lllIIIIllIIl[12] = 70 + 80 - 49 + 29 ^ 7 + 13 - -95 + 39;
        n.lllIIIIllIIl[13] = 0xAF ^ 0xAA;
        n.lllIIIIllIIl[14] = 2 + 69 - 18 + 92 ^ 128 + 134 - 179 + 68;
        n.lllIIIIllIIl[15] = 0x13 ^ 1;
        n.lllIIIIllIIl[16] = 0x2F ^ 4 ^ (0xE ^ 0x22);
        n.lllIIIIllIIl[17] = 0x7D ^ 0x75;
        n.lllIIIIllIIl[18] = 0xB9 ^ 0x96 ^ (0xD6 ^ 0xC2);
        n.lllIIIIllIIl[19] = 0x5F ^ 0x76;
        n.lllIIIIllIIl[20] = 0x24 ^ 0x2E;
        n.lllIIIIllIIl[21] = 0x6C ^ 0x5E;
        n.lllIIIIllIIl[22] = 0x7B ^ 0x41;
        n.lllIIIIllIIl[23] = 0x79 ^ 0x58 ^ (0x4E ^ 0x5C);
        n.lllIIIIllIIl[24] = 0x3F ^ 0x7F;
        n.lllIIIIllIIl[25] = 39 + 113 - 54 + 74 ^ 123 + 74 - 170 + 102;
        n.lllIIIIllIIl[26] = 0x15 ^ 0x1F ^ "   ".length();
    }

    private static String lIIIlIIIlIIIlll(String lllllllllllllllIIlllIIIlIIIIllII, String lllllllllllllllIIlllIIIlIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIlIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIIllIIl[17]), "DES");
            Cipher lllllllllllllllIIlllIIIlIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIIlIIIlIIII.init(lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIIIlIIIl);
            return new String(lllllllllllllllIIlllIIIlIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIlIIIIllll) {
            lllllllllllllllIIlllIIIlIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIIllII(int n2) {
        return n2 != 0;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static String lIIIlIIIlIIlIII(String lllllllllllllllIIlllIIIlIIllIIII, String lllllllllllllllIIlllIIIlIIlIlIlI) {
        lllllllllllllllIIlllIIIlIIllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIlIIlIlllI = new StringBuilder();
        char[] lllllllllllllllIIlllIIIlIIlIllIl = lllllllllllllllIIlllIIIlIIlIlIlI.toCharArray();
        int lllllllllllllllIIlllIIIlIIlIllII = lllIIIIllIIl[1];
        char[] lllllllllllllllIIlllIIIlIIlIIllI = lllllllllllllllIIlllIIIlIIllIIII.toCharArray();
        int lllllllllllllllIIlllIIIlIIlIIlIl = lllllllllllllllIIlllIIIlIIlIIllI.length;
        int lllllllllllllllIIlllIIIlIIlIIlII = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIIlIIlII, lllllllllllllllIIlllIIIlIIlIIlIl)) {
            char lllllllllllllllIIlllIIIlIIllIIIl = lllllllllllllllIIlllIIIlIIlIIllI[lllllllllllllllIIlllIIIlIIlIIlII];
            lllllllllllllllIIlllIIIlIIlIlllI.append((char)(lllllllllllllllIIlllIIIlIIllIIIl ^ lllllllllllllllIIlllIIIlIIlIllIl[lllllllllllllllIIlllIIIlIIlIllII % lllllllllllllllIIlllIIIlIIlIllIl.length]));
            "".length();
            ++lllllllllllllllIIlllIIIlIIlIllII;
            ++lllllllllllllllIIlllIIIlIIlIIlII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIIlIIlIlllI);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2) {
        void lllllllllllllllIIlllIIIllIIlllIl;
        n lllllllllllllllIIlllIIIllIIlllll;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIIlllll.type, (Object)p.FINAL) && n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIllIIlllll.Q().get().getWorldX(), lllllllllllllllIIlllIIIllIIlllIl.getWorldX())) {
            return lllIIIIllIIl[1];
        }
        List<TileObject> lllllllllllllllIIlllIIIllIIlllII = lllllllllllllllIIlllIIIllIIlllll.M();
        int lllllllllllllllIIlllIIIllIIllIll = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIllIIllIll, lllllllllllllllIIlllIIIllIIlllII.size()) && n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIllIIllIll, lllIIIIllIIl[4])) {
            void lllllllllllllllIIlllIIIllIIllllI;
            if (n.lIIIlIIIlIlIIlI(lllllllllllllllIIlllIIIllIIllIll, lllllllllllllllIIlllIIIllIIlllII.size())) {
                "".length();
                if (-"  ".length() <= 0) break;
                return ((127 + 132 - 224 + 120 ^ 120 + 117 - 235 + 143) & (139 + 179 - 292 + 154 ^ 33 + 163 - 120 + 114 ^ -" ".length())) != 0;
            }
            TileObject lllllllllllllllIIlllIIIllIIllIlI = lllllllllllllllIIlllIIIllIIlllII.get(lllllllllllllllIIlllIIIllIIllIll);
            int lllllllllllllllIIlllIIIllIIllIIl = c.a(lllllllllllllllIIlllIIIllIIllIlI);
            if (!n.lIIIlIIIlIlIIll(lllllllllllllllIIlllIIIllIIllIIl, b.y) || n.lIIIlIIIlIlIIII((int)lllllllllllllllIIlllIIIllIIllllI, lllIIIIllIIl[4])) {
                return lllIIIIllIIl[0];
            }
            ++lllllllllllllllIIlllIIIllIIllIll;
            "".length();
            if ("  ".length() <= "  ".length()) continue;
            return ((154 + 46 - 140 + 159 ^ 13 + 56 - 68 + 132) & (" ".length() ^ (0x62 ^ 0x3D) ^ -" ".length())) != 0;
        }
        System.out.println(lllIIIIllIII[lllIIIIllIIl[1]]);
        return lllIIIIllIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    private List<NPC> N() {
        n lllllllllllllllIIlllIIIllIlIlIII;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIlIlIII.type, (Object)p.FINAL)) {
            void lllllllllllllllIIlllIIIllIlIIlll;
            return NPCs.getAll(arg_0 -> n.l((Player)lllllllllllllllIIlllIIIllIlIIlll, arg_0));
        }
        return null;
    }

    private static void lIIIlIIIlIIlIIl() {
        lllIIIIllIII = new String[lllIIIIllIIl[26]];
        n.lllIIIIllIII[n.lllIIIIllIIl[1]] = n.lIIIlIIIlIIIllI("qYjqzrC08lfuZF+K0ZJzC5ZrvpvPB8vN", "aLXUB");
        n.lllIIIIllIII[n.lllIIIIllIIl[0]] = n.lIIIlIIIlIIIlll("ZbKH5q62PKGk7mPeyaBLhA==", "NToUY");
        n.lllIIIIllIII[n.lllIIIIllIIl[3]] = n.lIIIlIIIlIIIllI("aCZ6hZbCjzz5BGK8sGhNFmiJzvDTvoyD", "QPgjJ");
        n.lllIIIIllIII[n.lllIIIIllIIl[4]] = n.lIIIlIIIlIIIlll("874+PVtf7o+JENveKDUsxuK1pS5eYIpV", "jAEVO");
        n.lllIIIIllIII[n.lllIIIIllIIl[5]] = n.lIIIlIIIlIIIlll("YIVPMj0lx9M=", "aUMPD");
        n.lllIIIIllIII[n.lllIIIIllIIl[13]] = n.lIIIlIIIlIIlIII("IggqNh4RQQMjDQEUNQ==", "uaPWl");
        n.lllIIIIllIII[n.lllIIIIllIIl[14]] = n.lIIIlIIIlIIlIII("NS0SGSIGZDsMMRYxDQ==", "bDhxP");
        n.lllIIIIllIII[n.lllIIIIllIIl[16]] = n.lIIIlIIIlIIlIII("OhYMAwMbCxQdERdEMAQRDREG", "ydcpp");
        n.lllIIIIllIII[n.lllIIIIllIIl[17]] = n.lIIIlIIIlIIIlll("oH6VjA1I/9u90Aifyi4gVw==", "uufHo");
    }

    private static String lIIIlIIIlIIIllI(String lllllllllllllllIIlllIIIlIIIllIIl, String lllllllllllllllIIlllIIIlIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIlIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIlIIIlllIl.init(lllIIIIllIIl[3], lllllllllllllllIIlllIIIlIIIllllI);
            return new String(lllllllllllllllIIlllIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIIlIIIlllII) {
            lllllllllllllllIIlllIIIlIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIlIllI(int n2) {
        return n2 > 0;
    }

    private static /* synthetic */ int k(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    private static /* synthetic */ boolean g(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[13]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((6 ^ 0x52) & ~(0xDB ^ 0x8F)) != 0;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIIIlIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIIIlIIllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> L() {
        n lllllllllllllllIIlllIIIllIllIIIl;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIllIIIl.type, (Object)p.FINAL) && n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIllIIIl.entry, (Object)o.SOUTH)) {
            void lllllllllllllllIIlllIIIllIllIIII;
            WorldPoint lllllllllllllllIIlllIIIllIlIllll = new WorldPoint(lllllllllllllllIIlllIIIllIllIIII.getWorldX() - lllIIIIllIIl[3], lllllllllllllllIIlllIIIllIllIIIl.startPoint.get().getWorldY() + lllIIIIllIIl[0], lllllllllllllllIIlllIIIllIllIIII.getPlane());
            return new WorldArea(lllllllllllllllIIlllIIIllIlIllll, lllIIIIllIIl[0], lllIIIIllIIl[4]).toWorldPointList();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void lllllllllllllllIIlllIIIlllIIIIIl;
        void lllllllllllllllIIlllIIIlllIIIIII;
        void lllllllllllllllIIlllIIIllIllllll;
        n lllllllllllllllIIlllIIIlllIIIIlI;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlllIIIIlI.b((Locatable)lllllllllllllllIIlllIIIllIllllll) ? 1 : 0)) {
            lllllllllllllllIIlllIIIlllIIIIlI.a((SquireSepulchre)lllllllllllllllIIlllIIIlllIIIIII);
            if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlllIIIIlI.b((d)lllllllllllllllIIlllIIIlllIIIIIl) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlllIIIIlI.startDestination.get());
                return lllIIIIllIIl[0];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlllIIIIlI.startPoint.get());
            return lllIIIIllIIl[0];
        }
        if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlllIIIIlI.c((Locatable)lllllllllllllllIIlllIIIllIllllll) ? 1 : 0)) {
            lllllllllllllllIIlllIIIlllIIIIlI.b((SquireSepulchre)lllllllllllllllIIlllIIIlllIIIIII);
            lllllllllllllllIIlllIIIlllIIIIlI.e((d)lllllllllllllllIIlllIIIlllIIIIIl);
            "".length();
            return lllIIIIllIIl[0];
        }
        return lllIIIIllIIl[1];
    }

    private n(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int n3, int n4, RegionPoint regionPoint4, p p2, o o2) {
        this.north = lllIIIIllIIl[0];
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIlllIIIlIIllllII = list.iterator();
            while (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIIllllII.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIlllIIIlIIllllIl;
                Triple lllllllllllllllIIlllIIIlIIlllIll = (Triple)lllllllllllllllIIlllIIIlIIllllII.next();
                lllllllllllllllIIlllIIIlIIllllIl.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIlllIIIlIIlllIll.getFirst()), ((Integer)lllllllllllllllIIlllIIIlIIlllIll.getSecond()).intValue(), ((Integer)lllllllllllllllIIlllIIIlIIlllIll.getThird()).intValue()));
                "".length();
                "".length();
                if (" ".length() > ((0x8B ^ 0xB3) & ~(0xA2 ^ 0x9A))) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.startDestination = () -> SquireSepulchre.a(regionPoint2);
        this.type = p2;
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint3), n3, n4);
        this.dartDestination = () -> SquireSepulchre.a(regionPoint4);
        this.entry = o2;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static /* synthetic */ int d(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean lIIIlIIIlIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIIIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    static {
        n.lIIIlIIIlIIlIlI();
        n.lIIIlIIIlIIlIIl();
        BOTTOM_V_II = new n(new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[19], lllIIIIllIIl[1], b.N), lllIIIIllIIl[4], lllIIIIllIIl[20], new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[21], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[22], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), new RegionPoint(lllIIIIllIIl[1], lllIIIIllIIl[23], lllIIIIllIIl[1], b.N), lllIIIIllIIl[24], lllIIIIllIIl[4], new RegionPoint(lllIIIIllIIl[13], lllIIIIllIIl[25], lllIIIIllIIl[1], b.N), p.FINAL, o.SOUTH);
        n[] nArray = new n[lllIIIIllIIl[0]];
        nArray[n.lllIIIIllIIl[1]] = BOTTOM_V_II;
        $VALUES = nArray;
    }

    /*
     * WARNING - void declaration
     */
    private List<TileObject> M() {
        n lllllllllllllllIIlllIIIllIlIllII;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return null;
        }
        if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIlIllII.type, (Object)p.FINAL)) {
            void lllllllllllllllIIlllIIIllIlIlIll;
            return TileObjects.getAll(arg_0 -> n.d((Player)lllllllllllllllIIlllIIIllIlIlIll, arg_0));
        }
        return null;
    }

    private static boolean lIIIlIIIlIIlllI(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean d(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(player.getWorldX() - tileObject.getWorldX(), lllIIIIllIIl[15]) && n.lIIIlIIIlIlIIIl(Math.abs(player.getWorldY() - tileObject.getWorldY()), lllIIIIllIIl[4]) && n.lIIIlIIIlIlIIII(player.getPlane(), tileObject.getPlane()) && n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[16]]) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];
            "".length();
            if (-" ".length() == "  ".length()) {
                return ((0x5B ^ 0x53) & ~(1 ^ 9)) != 0;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ int c(Player player, WorldPoint worldPoint) {
        return Math.abs(worldPoint.getWorldX() - player.getWorldX()) + Math.abs(worldPoint.getWorldY() - player.getWorldY());
    }

    private n(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int n5, int n6, RegionPoint regionPoint5, p p2, o o2) {
        this.north = lllIIIIllIIl[0];
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.startDestination = () -> SquireSepulchre.a(regionPoint3);
        this.dartArea = () -> new WorldArea(SquireSepulchre.a(regionPoint4), n5, n6);
        this.type = p2;
        this.dartDestination = () -> SquireSepulchre.a(regionPoint5);
        this.entry = o2;
    }

    private static boolean lIIIlIIIlIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIIlIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Locatable locatable) {
        Iterator<WorldArea> lllllllllllllllIIlllIIIlIlIlIlII = this.startAreas.get().iterator();
        while (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIlIlIlII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIlllIIIlIlIlIlIl;
            WorldArea lllllllllllllllIIlllIIIlIlIlIIll = lllllllllllllllIIlllIIIlIlIlIlII.next();
            if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIlIlIIll.contains((Locatable)lllllllllllllllIIlllIIIlIlIlIlIl) ? 1 : 0)) {
                return lllIIIIllIIl[0];
            }
            "".length();
            if (null == null) continue;
            return ((0x6D ^ 0x58) & ~(0x95 ^ 0xA0)) != 0;
        }
        return lllIIIIllIIl[1];
    }

    private static /* synthetic */ int f(Player player, NPC nPC) {
        return Math.abs(nPC.getWorldX() - player.getWorldX()) + Math.abs(nPC.getWorldY() - player.getWorldY());
    }

    /*
     * WARNING - void declaration
     */
    public boolean e(d d2) {
        void lllllllllllllllIIlllIIIlIllIIlII;
        void lllllllllllllllIIlllIIIlIllIIlIl;
        n lllllllllllllllIIlllIIIlIllIIllI;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        List<WorldPoint> lllllllllllllllIIlllIIIlIllIIIll = lllllllllllllllIIlllIIIlIllIIllI.L();
        List<WorldPoint> lllllllllllllllIIlllIIIlIllIIIlI = lllllllllllllllIIlllIIIlIllIIllI.a(lllllllllllllllIIlllIIIlIllIIIll, (d)lllllllllllllllIIlllIIIlIllIIlIl);
        List<TileObject> lllllllllllllllIIlllIIIlIllIIIIl = lllllllllllllllIIlllIIIlIllIIllI.M();
        ArrayList<Integer> lllllllllllllllIIlllIIIlIllIIIII = new ArrayList<Integer>();
        if (n.lIIIlIIIlIlIllI(lllllllllllllllIIlllIIIlIllIIIIl.size())) {
            int lllllllllllllllIIlllIIIlIlIlllll = lllIIIIllIIl[1];
            int lllllllllllllllIIlllIIIlIlIllllI = lllIIIIllIIl[1];
            Iterator<TileObject> lllllllllllllllIIlllIIIlIlIlllIl = lllllllllllllllIIlllIIIlIllIIIIl.iterator();
            while (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIlIlllIl.hasNext() ? 1 : 0)) {
                TileObject lllllllllllllllIIlllIIIlIlIlllII = lllllllllllllllIIlllIIIlIlIlllIl.next();
                int lllllllllllllllIIlllIIIlIlIllIll = c.a(lllllllllllllllIIlllIIIlIlIlllII);
                if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlIllIll, b.x)) {
                    ++lllllllllllllllIIlllIIIlIlIllllI;
                }
                if (n.lIIIlIIIlIlIIll(lllllllllllllllIIlllIIIlIlIllIll, b.x)) {
                    if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIlIllIIllI.type, (Object)p.FINAL)) {
                        lllllllllllllllIIlllIIIlIllIIIII.add(lllllllllllllllIIlllIIIlIlIlllII.getWorldY());
                        "".length();
                    }
                    ++lllllllllllllllIIlllIIIlIlIlllll;
                    "".length();
                    if (((102 + 146 - 180 + 156 ^ 40 + 71 - 47 + 106) & (0x6E ^ 0x25 ^ " ".length() ^ -" ".length())) == 0) continue;
                    return ((0x38 ^ 2 ^ (0xBA ^ 0x9E)) & (38 + 127 - 5 + 23 ^ 12 + 41 - 30 + 146 ^ -" ".length())) != 0;
                }
                if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIllIIllI.a(lllllllllllllllIIlllIIIlIlIllllI) ? 1 : 0)) {
                    System.out.println(lllIIIIllIII[lllIIIIllIIl[0]]);
                    Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlIllIIllI.dartDestination.get());
                    return lllIIIIllIIl[0];
                }
                ++lllllllllllllllIIlllIIIlIlIllllI;
                "".length();
                if (-" ".length() == -" ".length()) continue;
                return ((0xD ^ 0x1E ^ (0xCE ^ 0x9D)) & (36 + 145 - 151 + 182 ^ 81 + 22 - 16 + 61 ^ -" ".length())) != 0;
            }
            if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIlIllIIllI.type, (Object)p.FINAL)) {
                lllllllllllllllIIlllIIIlIllIIIlI.removeIf(worldPoint -> lllllllllllllllIIlllIIIlIllIIIII.contains(worldPoint.getWorldY()));
                "".length();
            }
            if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIllIIIlI.size())) {
                lllllllllllllllIIlllIIIlIllIIIlI.sort(Comparator.comparingInt(arg_0 -> n.d((Player)lllllllllllllllIIlllIIIlIllIIlII, arg_0)));
                System.out.println(lllIIIIllIII[lllIIIIllIIl[3]]);
                Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlIllIIIlI.get(lllIIIIllIIl[1]));
                return lllIIIIllIIl[0];
            }
            if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIlIllIIllI.type, (Object)p.FINAL)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlIllIIlII.getWorldLocation());
            }
            return lllIIIIllIIl[0];
        }
        List<NPC> lllllllllllllllIIlllIIIlIlIlllll = lllllllllllllllIIlllIIIlIllIIllI.N();
        lllllllllllllllIIlllIIIlIlIlllll.sort(Comparator.comparingInt(arg_0 -> n.k((Player)lllllllllllllllIIlllIIIlIllIIlII, arg_0)));
        lllllllllllllllIIlllIIIlIllIIIII.clear();
        int lllllllllllllllIIlllIIIlIlIllllI = lllIIIIllIIl[1];
        while (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlIllllI, lllIIIIllIIl[3])) {
            if (n.lIIIlIIIlIlIlIl(lllllllllllllllIIlllIIIlIlIlllll.size(), lllllllllllllllIIlllIIIlIlIllllI)) {
                "".length();
                if ("   ".length() != (0x66 ^ 0x62)) break;
                return ((0xED ^ 0xB7) & ~(0x18 ^ 0x42)) != 0;
            }
            NPC lllllllllllllllIIlllIIIlIlIlllIl = lllllllllllllllIIlllIIIlIlIlllll.get(lllllllllllllllIIlllIIIlIlIllllI);
            if (n.lIIIlIIIlIIlIll(lllllllllllllllIIlllIIIlIlIlllIl)) {
                lllllllllllllllIIlllIIIlIlIlllll.remove(lllllllllllllllIIlllIIIlIlIllllI);
                "".length();
                "".length();
                if (-" ".length() <= -" ".length()) continue;
                return ((0x4B ^ 0xA) & ~(0x81 ^ 0xC0)) != 0;
            }
            if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIlIllIIllI.type, (Object)p.FINAL)) {
                if (n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIlIlIlllIl.getWorldX(), lllllllllllllllIIlllIIIlIllIIlII.getWorldX())) {
                    lllllllllllllllIIlllIIIlIllIIIII.add(lllllllllllllllIIlllIIIlIlIlllIl.getWorldY());
                    "".length();
                    ++lllllllllllllllIIlllIIIlIlIllllI;
                    "".length();
                    if ("  ".length() > 0) continue;
                    return ((0x2A ^ 0x6F) & ~(0x32 ^ 0x77)) != 0;
                }
                lllllllllllllllIIlllIIIlIlIlllll.remove(lllllllllllllllIIlllIIIlIlIllllI);
                "".length();
            }
            "".length();
            if ("   ".length() != -" ".length()) continue;
            return ((0x4F ^ 0x11) & ~(0x79 ^ 0x27)) != 0;
        }
        if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIlIllIIllI.type, (Object)p.FINAL)) {
            lllllllllllllllIIlllIIIlIllIIIlI.removeIf(worldPoint -> lllllllllllllllIIlllIIIlIllIIIII.contains(worldPoint.getWorldY()));
            "".length();
        }
        if (n.lIIIlIIIlIIllII(lllllllllllllllIIlllIIIlIllIIIlI.size())) {
            lllllllllllllllIIlllIIIlIllIIIlI.sort(Comparator.comparingInt(arg_0 -> n.c((Player)lllllllllllllllIIlllIIIlIllIIlII, arg_0)));
            System.out.println(lllIIIIllIII[lllIIIIllIIl[4]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIIlIllIIIlI.get(lllIIIIllIIl[1]));
        }
        System.out.println(lllIIIIllIII[lllIIIIllIIl[5]]);
        return lllIIIIllIIl[1];
    }

    private static boolean lIIIlIIIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(d d2) {
        n lllllllllllllllIIlllIIIllIlllIIl;
        void lllllllllllllllIIlllIIIllIlllIII;
        Player player = Players.getLocal();
        if (n.lIIIlIIIlIIlIll(player)) {
            return lllIIIIllIIl[1];
        }
        if (n.lIIIlIIIlIIllIl(lllllllllllllllIIlllIIIllIlllIII.getWorldLocation().equals((Object)lllllllllllllllIIlllIIIllIlllIIl.startPoint.get()) ? 1 : 0)) {
            return lllIIIIllIIl[1];
        }
        List<NPC> lllllllllllllllIIlllIIIllIllIlll = lllllllllllllllIIlllIIIllIlllIIl.N();
        lllllllllllllllIIlllIIIllIllIlll.sort(Comparator.comparingInt(arg_0 -> n.f((Player)lllllllllllllllIIlllIIIllIlllIII, arg_0)));
        if (n.lIIIlIIIlIIllIl(lllllllllllllllIIlllIIIllIllIlll.size())) {
            return lllIIIIllIIl[0];
        }
        NPC lllllllllllllllIIlllIIIllIllIllI = lllllllllllllllIIlllIIIllIllIlll.get(lllIIIIllIIl[1]);
        if (n.lIIIlIIIlIIlllI(lllllllllllllllIIlllIIIllIllIllI)) {
            if (n.lIIIlIIIlIIllll((Object)lllllllllllllllIIlllIIIllIlllIIl.type, (Object)p.FINAL)) {
                int lllllllllllllllIIlllIIIllIllIlIl = Math.abs(lllllllllllllllIIlllIIIllIllIllI.getWorldX() - lllllllllllllllIIlllIIIllIlllIII.getWorldX());
                if (n.lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIllIllIllI.getWorldY(), lllllllllllllllIIlllIIIllIlllIIl.P().get().getWorldY()) && n.lIIIlIIIlIlIIIl(lllllllllllllllIIlllIIIllIllIlIl, lllIIIIllIIl[2])) {
                    return lllIIIIllIIl[1];
                }
                return lllIIIIllIIl[0];
            }
            return lllIIIIllIIl[1];
        }
        return lllIIIIllIIl[1];
    }

    private static /* synthetic */ boolean l(Player player, NPC nPC) {
        int n2;
        if (n.lIIIlIIIlIlIIIl(nPC.getWorldX(), player.getWorldX() + lllIIIIllIIl[0]) && n.lIIIlIIIlIlIIIl(Math.abs(nPC.getWorldY() - player.getWorldY()), lllIIIIllIIl[5]) && n.lIIIlIIIlIlIlII(nPC.getWorldX(), player.getWorldX() - lllIIIIllIIl[6]) && n.lIIIlIIIlIIllII(b.z.contains(nPC.getId()) ? 1 : 0)) {
            n2 = lllIIIIllIIl[0];
            "".length();
            if (" ".length() == 0) {
                return ((0x73 ^ 0x7A) & ~(0x5C ^ 0x55)) != 0;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean h(Player player, TileObject tileObject) {
        int n2;
        if (n.lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[14]]) ? 1 : 0) && n.lIIIlIIIlIlIIIl(tileObject.getWorldX(), player.getWorldX())) {
            n2 = lllIIIIllIIl[0];
            "".length();
            if (null != null) {
                return ("  ".length() & ~"  ".length() & ~((0x13 ^ 2) & ~(6 ^ 0x17))) != 0;
            }
        } else {
            n2 = lllIIIIllIIl[1];
        }
        return n2 != 0;
    }
}

