package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging projectile", priority = 100, register = true, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bf  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bf.class */
public class C0033bf extends AbstractC0035bh {
    @Inject
    protected /* synthetic */ C0039bl eH;
    @Inject
    private /* synthetic */ C0029bb eJ;
    @Inject
    private /* synthetic */ C0031bd eK;
    private static /* synthetic */ int[] llIlIllIllI;
    @Inject
    private /* synthetic */ aZ eI;
    private static /* synthetic */ String[] llIlIllIlIl;

    private static boolean lIlIIllllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllllllIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIIllllllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    protected C0033bf(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIlIIlllllIlll();
        lIlIIlllllIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        Set<WorldPoint> bU = bU();
        if (!lIlIIllllllIII(bU.isEmpty() ? 1 : 0) && !lIlIIllllllIII(bR() ? 1 : 0)) {
            Player localPlayer = this.cu.getLocalPlayer();
            if (lIlIIllllllIII(bU.stream().noneMatch(worldPoint -> {
                return worldPoint.equals(localPlayer.getWorldLocation());
            }) ? 1 : 0)) {
                return llIlIllIllI[0];
            }
            Actor interacting = localPlayer.getInteracting();
            NPC bO = bO();
            if (lIlIIllllllIIl(bO)) {
                return llIlIllIllI[0];
            }
            if (lIlIIllllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            this.aY.a(llIlIllIllI[1]);
            WorldPoint bT = bT();
            Comparator thenComparing = Comparator.comparingDouble(obj -> {
                return ((WorldPoint) obj).distanceToPath(this.cu, localPlayer.getWorldLocation());
            }).thenComparing(obj2 -> {
                return Float.valueOf(((WorldPoint) obj2).distanceTo2DHypotenuse(bT));
            });
            if (lIlIIllllllIll(interacting, bO) && lIlIIlllllllII(interacting) && !lIlIIllllllIII(interacting.getName().toLowerCase().contains(llIlIllIlIl[llIlIllIllI[0]]) ? 1 : 0)) {
                WorldPoint worldPoint2 = (WorldPoint) interacting.getWorldArea().offset(llIlIllIllI[2]).toWorldPointList().stream().filter(Reachable::isWalkable).filter(worldPoint3 -> {
                    if (lIlIIllllllIlI(bU.contains(worldPoint3) ? 1 : 0)) {
                        ?? r0 = llIlIllIllI[2];
                        "".length();
                        return " ".length() <= ((59 ^ 3) & ((55 ^ 15) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIllIllI[0];
                }).filter(worldPoint4 -> {
                    return interacting.getWorldArea().isInMeleeDistance(worldPoint4);
                }).filter(worldPoint5 -> {
                    if (lIlIIllllllIlI(interacting.getWorldArea().contains(worldPoint5) ? 1 : 0)) {
                        ?? r0 = llIlIllIllI[2];
                        "".length();
                        return "  ".length() >= ((((7 + 21) - (-134)) + 24) ^ (((148 + 162) - 284) + 164)) ? ((((105 + 31) - 122) + 234) ^ (((94 + 118) - 45) + 3)) & (((118 ^ 123) ^ (218 ^ 133)) ^ (-" ".length())) : r0;
                    }
                    return llIlIllIllI[0];
                }).min(Comparator.comparingInt(worldPoint6 -> {
                    return worldPoint6.distanceTo(localPlayer.getWorldLocation());
                })).orElse(interacting.getWorldLocation());
                Movement.setDestination(worldPoint2);
                if (lIlIIllllllIlI(interacting.getWorldArea().isInMeleeDistance(worldPoint2) ? 1 : 0)) {
                    this.eJ.sleep(llIlIllIllI[3]);
                    this.eK.sleep(llIlIllIllI[3]);
                }
                return llIlIllIllI[2];
            }
            WorldArea worldArea = bO.getWorldArea();
            Stream filter = worldArea.offset(llIlIllIllI[2]).toWorldPointList().stream().filter(worldPoint7 -> {
                if (lIlIIllllllIlI(worldArea.contains(worldPoint7) ? 1 : 0)) {
                    ?? r0 = llIlIllIllI[2];
                    "".length();
                    return (-" ".length()) >= (((1 ^ 25) ^ (68 ^ 97)) & (((((54 + 116) - 112) + 69) ^ (16 ^ 82)) ^ (-" ".length()))) ? ((20 ^ 117) ^ (160 ^ 140)) & (((((179 + 181) - 182) + 58) ^ (((54 + 34) - (-14)) + 59)) ^ (-" ".length())) : r0;
                }
                return llIlIllIllI[0];
            });
            Objects.requireNonNull(worldArea);
            "".length();
            WorldPoint worldPoint8 = (WorldPoint) filter.filter(this::isInMeleeDistance).filter(worldPoint9 -> {
                return bU.stream().noneMatch(worldPoint9 -> {
                    return worldPoint9.equals(worldPoint9);
                });
            }).filter(Reachable::isWalkable).min(thenComparing).orElse(null);
            if (lIlIIllllllIIl(worldPoint8)) {
                worldPoint8 = (WorldPoint) worldArea.offset(llIlIllIllI[3]).toWorldPointList().stream().filter(worldPoint10 -> {
                    if (lIlIIllllllIlI(worldArea.contains(worldPoint10) ? 1 : 0)) {
                        ?? r0 = llIlIllIllI[2];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIllIllI[0];
                }).filter(worldPoint11 -> {
                    return bU.stream().noneMatch(worldPoint11 -> {
                        return worldPoint11.equals(worldPoint11);
                    });
                }).filter(Reachable::isWalkable).min(thenComparing).orElse(null);
                if (lIlIIllllllIIl(worldPoint8)) {
                    worldPoint8 = (WorldPoint) localPlayer.getWorldArea().offset(llIlIllIllI[4]).toWorldPointList().stream().filter(worldPoint12 -> {
                        if (lIlIIllllllIlI(worldArea.contains(worldPoint12) ? 1 : 0)) {
                            ?? r0 = llIlIllIllI[2];
                            "".length();
                            return (-" ".length()) > ((158 ^ 194) & ((30 ^ 66) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIllIllI[0];
                    }).filter(worldPoint13 -> {
                        return bU.stream().noneMatch(worldPoint13 -> {
                            return worldPoint13.equals(worldPoint13);
                        });
                    }).filter(Reachable::isWalkable).min(thenComparing).orElse(null);
                    if (lIlIIllllllIIl(worldPoint8)) {
                        return llIlIllIllI[0];
                    }
                }
                this.eI.sleep(llIlIllIllI[4]);
            }
            Movement.setDestination(worldPoint8);
            return llIlIllIllI[2];
        }
        return llIlIllIllI[0];
    }

    private static void lIlIIlllllIllI() {
        llIlIllIlIl = new String[llIlIllIllI[2]];
        llIlIllIlIl[llIlIllIllI[0]] = lIlIIlllllIlIl("JyYA", "BAgWM");
    }

    private static String lIlIIlllllIlIl(String llllllllllllllllIIllIIIlIlIIIIII, String llllllllllllllllIIllIIIlIIllllll) {
        String llllllllllllllllIIllIIIlIlIIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIIIlIIllllll.toCharArray();
        int llllllllllllllllIIllIIIlIIllllII = llIlIllIllI[0];
        char[] charArray2 = llllllllllllllllIIllIIIlIlIIIIII2.toCharArray();
        int llllllllllllllllIIllIIIlIIllIlIl = charArray2.length;
        int i = llIlIllIllI[0];
        while (lIlIIlllllllIl(i, llllllllllllllllIIllIIIlIIllIlIl)) {
            char llllllllllllllllIIllIIIlIlIIIIIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIllIIIlIlIIIIIl ^ charArray[llllllllllllllllIIllIIIlIIllllII % charArray.length]));
            "".length();
            llllllllllllllllIIllIIIlIIllllII++;
            i++;
            "".length();
            if ((((37 ^ 44) ^ (158 ^ 145)) & (("  ".length() ^ (161 ^ 165)) ^ (-" ".length()))) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIlllllIlll() {
        llIlIllIllI = new int[5];
        llIlIllIllI[0] = ((117 ^ 9) ^ (236 ^ 177)) & (((84 ^ 18) ^ (230 ^ 129)) ^ (-" ".length()));
        llIlIllIllI[1] = 174 ^ 158;
        llIlIllIllI[2] = " ".length();
        llIlIllIllI[3] = "   ".length();
        llIlIllIllI[4] = 157 ^ 152;
    }

    private static boolean lIlIIlllllllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllllllIII(int i) {
        return i != 0;
    }

    private static boolean lIlIIlllllllIl(int i, int i2) {
        return i < i2;
    }
}
