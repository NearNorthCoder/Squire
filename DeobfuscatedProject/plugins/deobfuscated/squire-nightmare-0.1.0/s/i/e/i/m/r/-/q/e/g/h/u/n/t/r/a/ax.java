/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.f;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Avoiding Grasping Claws", priority=0x7FFFFFF9, blocking=true)
public class ax
extends A {
    private /* synthetic */ List<NPC> ew;
    private static final /* synthetic */ Logger et;
    private /* synthetic */ NPC eA;
    private /* synthetic */ List<WorldPoint> ev;
    private /* synthetic */ List<WorldArea> ey;
    private static /* synthetic */ String[] lllIllllIIIl;
    private /* synthetic */ RectangularArea ex;
    private /* synthetic */ List<NPC> eB;
    private /* synthetic */ WorldPoint ez;
    private /* synthetic */ int[] cN;
    private final /* synthetic */ f eu;
    private static /* synthetic */ int[] lllIllllIIlI;

    private static /* synthetic */ int h(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static /* synthetic */ int i(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static String lIIIlllIIIIlIll(String lllllllllllllllIIllIIIllIlIlIllI, String lllllllllllllllIIllIIIllIlIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lllIllllIIlI[10]), "DES");
            Cipher lllllllllllllllIIllIIIllIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIllIlIllIlI.init(lllIllllIIlI[2], lllllllllllllllIIllIIIllIlIllIll);
            return new String(lllllllllllllllIIllIIIllIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIllIlIllIIl) {
            lllllllllllllllIIllIIIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint cG() {
        void var14_16;
        void lllllllllllllllIIllIIIlllIllIllI;
        void lllllllllllllllIIllIIIlllIllIIII;
        ax lllllllllllllllIIllIIIlllIllllIl;
        void lllllllllllllllIIllIIIlllIlllIll;
        NPC nPC = SquireNightmarePlugin.d();
        WorldArea worldArea = nPC.getWorldArea();
        int n2 = worldArea.getX();
        int n3 = worldArea.getY();
        int n4 = n2 + worldArea.getWidth() - lllIllllIIlI[0];
        int n5 = n3 + worldArea.getHeight() - lllIllllIIlI[0];
        RectangularArea rectangularArea = e.ay();
        WorldPoint worldPoint3 = new WorldPoint(n2, n3, lllIllllIIlI[3]);
        WorldPoint worldPoint4 = new WorldPoint(n4, n5, lllIllllIIlI[3]);
        WorldPoint worldPoint5 = new WorldPoint(n2, n5, lllIllllIIlI[3]);
        WorldPoint worldPoint6 = new WorldPoint(n4, n3, lllIllllIIlI[3]);
        WorldPoint[] worldPointArray = new WorldPoint[lllIllllIIlI[4]];
        worldPointArray[ax.lllIllllIIlI[1]] = worldPoint3;
        worldPointArray[ax.lllIllllIIlI[0]] = worldPoint4;
        worldPointArray[ax.lllIllllIIlI[2]] = worldPoint5;
        worldPointArray[ax.lllIllllIIlI[3]] = worldPoint6;
        List<WorldPoint> list = Arrays.asList(worldPointArray);
        WorldPoint worldPoint7 = Players.getLocal().getWorldLocation();
        if (ax.lIIIlllIIIlIIIl(e.ax().isEmpty() ? 1 : 0)) {
            void lllllllllllllllIIllIIIlllIllIIIl;
            Stream<WorldPoint> lllllllllllllllIIllIIIlllIlIllll;
            WorldPoint lllllllllllllllIIllIIIlllIlIlllI;
            Stream<WorldPoint> stream;
            if (ax.lIIIlllIIIlIIII(this.cM.am() ? 1 : 0)) {
                stream = worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint2 -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint7), lllIllllIIlI[3])) {
                        bl = lllIllllIIlI[0];
                        0;
                        if ((0x58 ^ 0x5C) == -1) {
                            return ((0x97 ^ 0x9A) & ~(0x65 ^ 0x68)) != 0;
                        }
                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                });
                0;
                if (null != null) {
                    return null;
                }
            } else {
                stream = lllllllllllllllIIllIIIlllIlllIll.getMeleeTiles(lllllllllllllllIIllIIIlllIllllIl.cL).stream().filter(arg_0 -> ax.o((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0));
            }
            if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIlIlllI = (WorldPoint)lllllllllllllllIIllIIIlllIllllIl.a(lllllllllllllllIIllIIIlllIlIllll = stream).min(Comparator.comparingInt(arg_0 -> ax.n((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null))) {
                List lllllllllllllllIIllIIIlllIlIllIl = lllllllllllllllIIllIIIlllIllIIII.toWorldArea(lllIllllIIlI[5], lllIllllIIlI[5]).toWorldPointList();
                lllllllllllllllIIllIIIlllIlIlllI = lllllllllllllllIIllIIIlllIllllIl.a(lllllllllllllllIIllIIIlllIlIllIl.stream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.getMeleeTiles(this.cL).contains(worldPoint))).min(Comparator.comparingInt(arg_0 -> ax.m((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via pnm melee points. closest melee shroom tile: " + lllllllllllllllIIllIIIlllIlIlllI));
            }
            if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIlIlllI)) {
                Log.info((String)("[AvoidShadows]: Using shroom melee avoidance via player area points. closest melee shroom tile: " + lllllllllllllllIIllIIIlllIlIlllI));
                lllllllllllllllIIllIIIlllIlIlllI = ((Stream)lllllllllllllllIIllIIIlllIllIIIl.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = lllIllllIIlI[0];
                        0;
                        if (((0x44 ^ 0xA) & ~(0xD5 ^ 0x9B)) > 1) {
                            return ((0x9F ^ 0xBB) & ~(0x94 ^ 0xB0)) != 0;
                        }
                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                }).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).parallel()).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint)))).min(Comparator.comparingInt(arg_0 -> ax.l((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
            }
            if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIlIlllI)) {
                Log.warn((String)lllIllllIIIl[lllIllllIIlI[3]]);
                lllllllllllllllIIllIIIlllIlIlllI = lllllllllllllllIIllIIIlllIllIIIl.stream().filter(worldPoint -> {
                    boolean bl;
                    if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                        bl = lllIllllIIlI[0];
                        0;
                        if (-3 >= 0) {
                            return ((0xF0 ^ 0xA8 ^ (0x7F ^ 0x6F)) & (158 + 103 - 167 + 148 ^ 118 + 80 - 154 + 142 ^ -1)) != 0;
                        }
                    } else {
                        bl = lllIllllIIlI[1];
                    }
                    return bl;
                }).min(Comparator.comparingInt(arg_0 -> ax.k((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
            }
            return lllllllllllllllIIllIIIlllIlIlllI;
        }
        if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIllIllI)) {
            WorldPoint lllllllllllllllIIllIIIlllIlIllll = lllllllllllllllIIllIIIlllIllllIl.b(lllllllllllllllIIllIIIlllIlllIll.getMeleeTiles(lllllllllllllllIIllIIIlllIllllIl.cL).stream()).filter(arg_0 -> ax.j((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0)).min(Comparator.comparingInt(arg_0 -> ax.i((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
            if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIlIllll)) {
                Log.info((String)lllIllllIIIl[lllIllllIIlI[4]]);
                List lllllllllllllllIIllIIIlllIlIlllI = lllllllllllllllIIllIIIlllIllIIII.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList();
                lllllllllllllllIIllIIIlllIlIllll = lllllllllllllllIIllIIIlllIllllIl.b(lllllllllllllllIIllIIIlllIlIlllI.stream()).min(Comparator.comparingInt(arg_0 -> ax.h((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
            }
            return lllllllllllllllIIllIIIlllIlIllll;
        }
        WorldPoint lllllllllllllllIIllIIIlllIlIllll = null;
        Stream<WorldPoint> stream = lllllllllllllllIIllIIIlllIllllIl.b(lllllllllllllllIIllIIIlllIlllIll.getMeleeTiles(lllllllllllllllIIllIIIlllIllllIl.cL).stream()).filter(arg_0 -> ax.g((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0));
        void v3 = lllllllllllllllIIllIIIlllIllIllI;
        Objects.requireNonNull(v3);
        0;
        lllllllllllllllIIllIIIlllIlIllll = stream.filter(arg_0 -> ((RectangularArea)v3).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.f((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
        if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIlllIlIllll)) {
            Log.info((String)lllIllllIIIl[lllIllllIIlI[6]]);
            List lllllllllllllllIIllIIIlllIlIlllI = lllllllllllllllIIllIIIlllIllIIII.toWorldArea(lllIllllIIlI[6], lllIllllIIlI[6]).toWorldPointList();
            Stream<WorldPoint> stream2 = lllllllllllllllIIllIIIlllIllllIl.b(lllllllllllllllIIllIIIlllIlIlllI.stream());
            void v5 = lllllllllllllllIIllIIIlllIllIllI;
            Objects.requireNonNull(v5);
            0;
            lllllllllllllllIIllIIIlllIlIllll = stream2.filter(arg_0 -> ((RectangularArea)v5).contains(arg_0)).min(Comparator.comparingInt(arg_0 -> ax.e((WorldPoint)lllllllllllllllIIllIIIlllIllIIII, arg_0))).orElse(null);
        }
        return var14_16;
    }

    private static /* synthetic */ boolean o(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];
            0;
            if (((0xD ^ 0x21) & ~(0x23 ^ 0xF)) != 0) {
                return ((0x7D ^ 0x40) & ~(0x80 ^ 0xBD)) != 0;
            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cH() {
        WorldArea worldArea;
        int[] nArray = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC nPC2 = NPCs.getAll((int[])nArray).stream().filter(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIIl(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[lllIllllIIlI[0]];
                stringArray[ax.lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[7]];
                if (ax.lIIIlllIIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllllIIlI[0];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((121 + 59 - 168 + 121 ^ 77 + 41 - -8 + 11) & (50 + 109 - 157 + 139 ^ 118 + 92 - 109 + 28 ^ -1)) != 0;
                }
            }
            n2 = lllIllllIIlI[1];
            return n2 != 0;
        }).filter(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIII(this.cM.ag.containsKey(nPC.getId()) ? 1 : 0) && ax.lIIIlllIIIlIlIl(this.cM.ag.get(nPC.getId()), lllIllllIIlI[8])) {
                n2 = lllIllllIIlI[0];
                0;
                if (1 >= (0x26 ^ 0x33 ^ (0x61 ^ 0x70))) {
                    return ((150 + 61 - 208 + 155 ^ 137 + 127 - 261 + 151) & (0x48 ^ 0 ^ (0xE8 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                n2 = lllIllllIIlI[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        List<Object> list = this.ev;
        int n2 = lllIllllIIlI[7];
        list = list.stream().filter(worldPoint -> {
            boolean bl;
            if (ax.lIIIlllIIIlIlII(worldPoint.distanceTo(this.ez), n2)) {
                bl = lllIllllIIlI[0];
                0;
                if (1 == 2) {
                    return ((24 + 14 - -75 + 16 ^ 128 + 117 - 192 + 85) & (79 + 125 - 175 + 106 ^ 82 + 126 - 152 + 84 ^ -1)) != 0;
                }
            } else {
                bl = lllIllllIIlI[1];
            }
            return bl;
        }).collect(Collectors.toList());
        Stream<WorldPoint> stream = this.e(list);
        WorldPoint worldPoint2 = SquireNightmarePlugin.e();
        if (ax.lIIIlllIIIlIIlI(nPC2)) {
            worldArea = worldPoint2.toWorldArea();
            0;
            if (null != null) {
                return null;
            }
        } else {
            void lllllllllllllllIIllIIIlllIlIIIlI;
            WorldArea lllllllllllllllIIllIIIlllIIlllIl = lllllllllllllllIIllIIIlllIlIIIlI.getWorldArea();
        }
        return stream.min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo(worldPoint2)).thenComparingInt(object -> ((WorldPoint)object).distanceTo(worldArea)).thenComparingInt(object -> ((WorldPoint)object).distanceTo(this.ez))).orElse(null);
    }

    @Inject
    public ax(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
        this.eu = f2;
    }

    private static /* synthetic */ boolean j(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];
            0;
            if (((175 + 17 - 174 + 159 ^ 70 + 56 - 5 + 19) & (100 + 25 - 65 + 80 ^ 93 + 47 - -25 + 12 ^ -1)) <= -1) {
                return ((0xD5 ^ 0x81 ^ (0x65 ^ 0x37)) & (0x76 ^ 0x4C ^ (0x78 ^ 0x44) ^ -1)) != 0;
            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    private static /* synthetic */ int e(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static String lIIIlllIIIIlIlI(String lllllllllllllllIIllIIIllIlIIlIII, String lllllllllllllllIIllIIIllIlIIIlll) {
        lllllllllllllllIIllIIIllIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIllIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIIllIIIllIlIIIlIl = lllllllllllllllIIllIIIllIlIIIlll.toCharArray();
        int lllllllllllllllIIllIIIllIlIIIlII = lllIllllIIlI[1];
        char[] lllllllllllllllIIllIIIllIIlllllI = lllllllllllllllIIllIIIllIlIIlIII.toCharArray();
        int lllllllllllllllIIllIIIllIIllllIl = lllllllllllllllIIllIIIllIIlllllI.length;
        int lllllllllllllllIIllIIIllIIllllII = lllIllllIIlI[1];
        while (ax.lIIIlllIIIlIlIl(lllllllllllllllIIllIIIllIIllllII, lllllllllllllllIIllIIIllIIllllIl)) {
            char lllllllllllllllIIllIIIllIlIIlIIl = lllllllllllllllIIllIIIllIIlllllI[lllllllllllllllIIllIIIllIIllllII];
            lllllllllllllllIIllIIIllIlIIIllI.append((char)(lllllllllllllllIIllIIIllIlIIlIIl ^ lllllllllllllllIIllIIIllIlIIIlIl[lllllllllllllllIIllIIIllIlIIIlII % lllllllllllllllIIllIIIllIlIIIlIl.length]));
            0;
            ++lllllllllllllllIIllIIIllIlIIIlII;
            ++lllllllllllllllIIllIIIllIIllllII;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIIllIlIIIllI);
    }

    private static /* synthetic */ int l(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static /* synthetic */ int n(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static /* synthetic */ int f(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private Stream<WorldPoint> a(Stream<WorldPoint> stream) {
        return this.b((Stream)stream.parallel()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint))));
    }

    private static boolean lIIIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIIlIIII(int n2) {
        return n2 != 0;
    }

    private static void lIIIlllIIIIllll() {
        lllIllllIIlI = new int[11];
        ax.lllIllllIIlI[0] = 1;
        ax.lllIllllIIlI[1] = (70 + 77 - -17 + 8 ^ 112 + 115 - 202 + 126) & (0xD8 ^ 0x93 ^ (0xFC ^ 0x8C) ^ -1);
        ax.lllIllllIIlI[2] = 2;
        ax.lllIllllIIlI[3] = 3;
        ax.lllIllllIIlI[4] = 0xA8 ^ 0xAC;
        ax.lllIllllIIlI[5] = 3 + 27 - -116 + 28 ^ 74 + 92 - 131 + 127;
        ax.lllIllllIIlI[6] = 0 ^ 5;
        ax.lllIllllIIlI[7] = 173 + 139 - 213 + 86 ^ 127 + 129 - 119 + 54;
        ax.lllIllllIIlI[8] = 157 + 161 - 179 + 61;
        ax.lllIllllIIlI[9] = 0x87 ^ 0x9D ^ (0xAD ^ 0xB0);
        ax.lllIllllIIlI[10] = 0x11 ^ 0x19;
    }

    private Stream<WorldPoint> b(Stream<WorldPoint> stream) {
        return stream.filter(worldPoint -> {
            boolean bl;
            if (ax.lIIIlllIIIlIlII(worldPoint.distanceTo((Locatable)Players.getLocal()), lllIllllIIlI[5])) {
                bl = lllIllllIIlI[0];
                0;
                if (3 == 0) {
                    return ((0xBA ^ 0xBC ^ (0x82 ^ 0x9D)) & (24 + 62 - -7 + 38 ^ 96 + 54 - 72 + 76 ^ -1)) != 0;
                }
            } else {
                bl = lllIllllIIlI[1];
            }
            return bl;
        }).filter(worldPoint -> {
            int n2;
            if (ax.lIIIlllIIIlIIIl(this.cM.Y().contains(worldPoint) ? 1 : 0) && ax.lIIIlllIIIlIIIl(this.cS.getWorldArea().contains(worldPoint) ? 1 : 0)) {
                n2 = lllIllllIIlI[0];
                0;
                if (((0xB2 ^ 0xA0) & ~(0xAC ^ 0xBE)) > 0) {
                    return ((0x33 ^ 0x72) & ~(0x2D ^ 0x6C)) != 0;
                }
            } else {
                n2 = lllIllllIIlI[1];
            }
            return n2 != 0;
        }).filter(worldPoint -> this.ew.stream().noneMatch(nPC -> nPC.getWorldArea().contains(worldPoint)));
    }

    private WorldPoint cI() {
        return this.b(e.aw().toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
    }

    private static /* synthetic */ int m(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private WorldPoint cJ() {
        return this.b(e.aw().toWorldPointList().parallelStream()).filter(worldPoint -> {
            RectangularArea rectangularArea = e.ay();
            if (ax.lIIIlllIIIlIIlI(rectangularArea)) {
                return lllIllllIIlI[0];
            }
            return rectangularArea.contains(worldPoint);
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
    }

    private Stream<WorldPoint> e(List<WorldPoint> list) {
        return this.b(list.parallelStream()).filter(worldPoint -> this.ey.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(worldPoint2 -> this.a(this.ez, (WorldPoint)worldPoint2).stream().noneMatch(worldPoint -> this.ey.stream().anyMatch(worldArea -> worldArea.contains(worldPoint))));
    }

    static {
        ax.lIIIlllIIIIllll();
        ax.lIIIlllIIIIlllI();
        et = LoggerFactory.getLogger(ax.class);
    }

    @Override
    public boolean bY() {
        ax lllllllllllllllIIllIIIllllIlIIIl;
        int n2;
        this.ey = e.ax();
        this.ex = e.ay();
        this.ez = Players.getLocal().getWorldLocation();
        if (ax.lIIIlllIIIlIIII(this.cM.ap())) {
            n2 = lllIllllIIlI[0];
            0;
            if ((60 + 89 - -3 + 13 ^ 74 + 24 - 57 + 120) == ((42 + 81 - -10 + 87 ^ 57 + 85 - -3 + 4) & (0x64 ^ 0x47 ^ (0x78 ^ 0x12) ^ -1))) {
                return ((0x45 ^ 0x49 ^ (0x9D ^ 0x98)) & (0x89 ^ 0xBF ^ (0x79 ^ 0x46) ^ -1)) != 0;
            }
        } else {
            n2 = lllIllllIIlI[1];
        }
        int lllllllllllllllIIllIIIllllIlIIII = n2;
        lllllllllllllllIIllIIIllllIlIIIl.ev = e.aw().toWorldPointList();
        if (ax.lIIIlllIIIlIIIl(lllllllllllllllIIllIIIllllIlIIII)) {
            return lllIllllIIlI[1];
        }
        if (ax.lIIIlllIIIlIIIl(lllllllllllllllIIllIIIllllIlIIIl.cM.Y().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ax.lIIIlllIIIlIIIl(lllllllllllllllIIllIIIllllIlIIIl.cS.getWorldArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lllIllllIIlI[1];
        }
        lllllllllllllllIIllIIIllllIlIIIl.cN = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        lllllllllllllllIIllIIIllllIlIIIl.eA = NPCs.getNearest((WorldPoint)lllllllllllllllIIllIIIllllIlIIIl.ez, (int[])lllllllllllllllIIllIIIllllIlIIIl.cN);
        lllllllllllllllIIllIIIllllIlIIIl.ew = NPCs.getAll((int[])SquireNightmarePlugin.s.stream().mapToInt(Integer::intValue).toArray());
        if (ax.lIIIlllIIIlIIlI(lllllllllllllllIIllIIIllllIlIIIl.eA)) {
            et.info(lllIllllIIIl[lllIllllIIlI[1]]);
            WorldPoint lllllllllllllllIIllIIIllllIIllll = lllllllllllllllIIllIIIllllIlIIIl.cG();
            return lllllllllllllllIIllIIIllllIlIIIl.j(lllllllllllllllIIllIIIllllIIllll);
        }
        lllllllllllllllIIllIIIllllIlIIIl.eB = NPCs.getAll(nPC -> {
            int n2;
            if (ax.lIIIlllIIIlIIII(SquireNightmarePlugin.q.contains(nPC.getId()) ? 1 : 0)) {
                String[] stringArray = new String[lllIllllIIlI[0]];
                stringArray[ax.lllIllllIIlI[1]] = lllIllllIIIl[lllIllllIIlI[9]];
                if (ax.lIIIlllIIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllllIIlI[0];
                    0;
                    if (3 != 0) return n2 != 0;
                    return ((0xC7 ^ 0x82) & ~(0xE4 ^ 0xA1)) != 0;
                }
            }
            n2 = lllIllllIIlI[1];
            return n2 != 0;
        });
        if (ax.lIIIlllIIIlIIll(lllllllllllllllIIllIIIllllIlIIIl.ex)) {
            if (ax.lIIIlllIIIlIIII(lllllllllllllllIIllIIIllllIlIIIl.ex.contains(lllllllllllllllIIllIIIllllIlIIIl.ez) ? 1 : 0)) {
                return lllllllllllllllIIllIIIllllIlIIIl.j(lllllllllllllllIIllIIIllllIlIIIl.cJ());
            }
            WorldPoint lllllllllllllllIIllIIIllllIIllll = lllllllllllllllIIllIIIllllIlIIIl.b(lllllllllllllllIIllIIIllllIlIIIl.ex.toWorldPointList().stream()).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(this.ez))).orElse(null);
            Log.info((String)("[AvoidShadows]: Player is not in flower area, walking to closest safe area point: " + lllllllllllllllIIllIIIllllIIllll));
            return lllllllllllllllIIllIIIllllIlIIIl.j(lllllllllllllllIIllIIIllllIIllll);
        }
        if (ax.lIIIlllIIIlIIIl(lllllllllllllllIIllIIIllllIlIIIl.ey.isEmpty() ? 1 : 0)) {
            Log.info((String)lllIllllIIIl[lllIllllIIlI[0]]);
            WorldPoint lllllllllllllllIIllIIIllllIIllll = lllllllllllllllIIllIIIllllIlIIIl.cH();
            return lllllllllllllllIIllIIIllllIlIIIl.j(lllllllllllllllIIllIIIllllIIllll);
        }
        Log.info((String)lllIllllIIIl[lllIllllIIlI[2]]);
        return this.j(this.cI());
    }

    private static String lIIIlllIIIIllII(String lllllllllllllllIIllIIIllIllIIIll, String lllllllllllllllIIllIIIllIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIllIllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIllIllIIlll.init(lllIllllIIlI[2], lllllllllllllllIIllIIIllIllIlIII);
            return new String(lllllllllllllllIIllIIIllIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIllIllIIllI) {
            lllllllllllllllIIllIIIllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean g(WorldPoint worldPoint, WorldPoint worldPoint2) {
        boolean bl;
        if (ax.lIIIlllIIIlIlII(worldPoint2.distanceTo(worldPoint), lllIllllIIlI[7])) {
            bl = lllIllllIIlI[0];
            0;
            if (null != null) {
                return ((187 + 85 - 113 + 72 ^ 94 + 43 - 36 + 62) & (0x2F ^ 0x46 ^ (0xEB ^ 0xC6) ^ -1)) != 0;
            }
        } else {
            bl = lllIllllIIlI[1];
        }
        return bl;
    }

    private static void lIIIlllIIIIlllI() {
        lllIllllIIIl = new String[lllIllllIIlI[10]];
        ax.lllIllllIIIl[ax.lllIllllIIlI[1]] = ax."[AvoidShadows]: No active totems found, walking to corner";
        ax.lllIllllIIIl[ax.lllIllllIIlI[0]] = ax."[AvoidShadows]: Shrooms are present, using shroom avoidance";
        ax.lllIllllIIIl[ax.lllIllllIIlI[2]] = ax."[AvoidShadows]: No shrooms or flowers present, normal dodging to totem";
        ax.lllIllllIIIl[ax.lllIllllIIlI[3]] = ax."[AvoidShadows]: Final resort to find a pathable tile during shrooms.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[4]] = ax."[AvoidShadows]: (NO FLOWERS) Using normal melee avoidance via player area points.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[6]] = ax."[AvoidShadows]: (FLOWERS) Using normal melee avoidance via player area points.";
        ax.lllIllllIIIl[ax.lllIllllIIlI[7]] = ax."Charge";
        ax.lllIllllIIIl[ax.lllIllllIIlI[9]] = ax."Charge";
    }

    private static boolean lIIIlllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static /* synthetic */ int k(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.distanceTo(worldPoint);
    }

    private static boolean lIIIlllIIIlIIll(Object object) {
        return object != null;
    }
}

