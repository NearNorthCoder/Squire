package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.chopburn.ChopBurnConfig;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@SquireUtil
@TaskDesc(name = "Chopping and burning")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.C  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/C.class */
public class C extends Task {
    private /* synthetic */ WorldPoint be;
    private /* synthetic */ boolean bd;
    private static final /* synthetic */ int ba;
    private /* synthetic */ int bh;
    private final /* synthetic */ ChopBurnConfig bc;
    private static final /* synthetic */ String aX;
    private static final /* synthetic */ String aZ;
    private static final /* synthetic */ int bb;
    private static /* synthetic */ String[] llIIlIIll;
    private /* synthetic */ List<WorldPoint> bf;
    private static /* synthetic */ int[] llIIlIlII;
    private static final /* synthetic */ String aY;
    private /* synthetic */ int bg;

    private static boolean lIllIIIIIlI(Object obj) {
        return obj == null;
    }

    private Optional<WorldPoint> b(List<WorldPoint> list) {
        return list.stream().filter(worldPoint -> {
            if (lIllIIIIlIl(TileObjects.getAll(tileObject -> {
                if (lIllIIIIlll(tileObject instanceof GameObject ? 1 : 0) && lIllIIIIlll(tileObject.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                    ?? r0 = llIIlIlII[3];
                    "".length();
                    return 0 != 0 ? ((241 ^ 152) ^ (4 ^ 33)) & (((76 ^ 18) ^ (15 ^ 29)) ^ (-" ".length())) : r0;
                }
                return llIIlIlII[1];
            }).size())) {
                ?? r0 = llIIlIlII[3];
                "".length();
                return ((90 ^ 59) ^ (60 ^ 89)) <= 0 ? ((72 ^ 47) ^ (108 ^ 79)) & (((76 ^ 67) ^ (92 ^ 23)) ^ (-" ".length())) : r0;
            }
            return llIIlIlII[1];
        }).max(Comparator.comparingInt((v0) -> {
            return v0.getX();
        }));
    }

    static {
        lIllIIIIIIl();
        lIllIIIIIII();
        aY = llIIlIIll[llIIlIlII[7]];
        aX = llIIlIIll[llIIlIlII[8]];
        bb = llIIlIlII[4];
        ba = llIIlIlII[2];
        aZ = llIIlIIll[llIIlIlII[6]];
    }

    private static void lIllIIIIIIl() {
        llIIlIlII = new int[11];
        llIIlIlII[0] = -"   ".length();
        llIIlIlII[1] = (12 ^ 8) & ((180 ^ 176) ^ (-1));
        llIIlIlII[2] = 117 ^ 115;
        llIIlIlII[3] = " ".length();
        llIIlIlII[4] = (149 ^ 161) ^ (90 ^ 122);
        llIIlIlII[5] = -" ".length();
        llIIlIlII[6] = 68 ^ 64;
        llIIlIlII[7] = "  ".length();
        llIIlIlII[8] = "   ".length();
        llIIlIlII[9] = (35 ^ 106) ^ (94 ^ 18);
        llIIlIlII[10] = (89 ^ 21) ^ (8 ^ 76);
    }

    private static boolean lIllIIIIlIl(int i2) {
        return i2 == 0;
    }

    private WorldPoint a(WorldPoint worldPoint, Direction direction) {
        return lIllIIIIllI(direction, Direction.EAST) ? worldPoint.dx(llIIlIlII[3]) : worldPoint.dx(llIIlIlII[5]);
    }

    private List<WorldPoint> X() {
        if (lIllIIIIIlI(this.be)) {
            this.be = Players.getLocal().getWorldLocation();
        }
        WorldPoint dy = this.be.dy(llIIlIlII[0]);
        List<WorldPoint> c = c(dy);
        int i2 = llIIlIlII[1];
        while (lIllIIIIIll(i2, llIIlIlII[2])) {
            List<WorldPoint> c2 = c(dy.dy(i2));
            if (lIllIIIIlII(c2.size(), c.size())) {
                c = c2;
            }
            List<WorldPoint> c3 = c(dy.dy(-i2));
            if (lIllIIIIlII(c3.size(), c.size())) {
                c = c3;
            }
            i2++;
            "".length();
            if ((1 ^ 5) < ((111 ^ 121) & ((16 ^ 6) ^ (-1)))) {
                return null;
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    private boolean a(List<WorldPoint> list, Direction direction) {
        WorldPoint a = a(direction, list);
        WorldPoint a2 = a(a, direction);
        if (lIllIIIIlIl(a(a, a2, direction) ? 1 : 0)) {
            return llIIlIlII[1];
        }
        list.add(a2);
        "".length();
        return llIIlIlII[3];
    }

    private List<WorldPoint> c(WorldPoint worldPoint) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(worldPoint);
        "".length();
        String[] strArr = new String[llIIlIlII[3]];
        strArr[llIIlIlII[1]] = this.bc.tree().Y();
        int min = Math.min(Inventory.getCount(strArr), llIIlIlII[4]);
        while (true) {
            if (!lIllIIIIIll(arrayList.size(), min)) {
                break;
            } else if (lIllIIIIlIl(a(arrayList, Direction.WEST) ? 1 : 0) && lIllIIIIlIl(a(arrayList, Direction.EAST) ? 1 : 0)) {
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    private WorldPoint a(Direction direction, List<WorldPoint> list) {
        return lIllIIIIllI(direction, Direction.EAST) ? list.stream().max(Comparator.comparingInt((v0) -> {
            return v0.getX();
        })).get() : list.stream().min(Comparator.comparingInt((v0) -> {
            return v0.getX();
        })).get();
    }

    private static boolean lIllIIIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    private boolean a(WorldPoint worldPoint, WorldPoint worldPoint2, Direction direction) {
        int collisionFlag = Reachable.getCollisionFlag(worldPoint);
        int collisionFlag2 = Reachable.getCollisionFlag(worldPoint2);
        if (lIllIIIIlIl(TileObjects.getAll(tileObject -> {
            if (lIllIIIIlll(tileObject instanceof GameObject ? 1 : 0) && lIllIIIIlll(tileObject.getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIlIlII[3];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlII[1];
        }).size()) && lIllIIIIlll(Reachable.canWalk(direction, collisionFlag, collisionFlag2) ? 1 : 0)) {
            ?? r0 = llIIlIlII[3];
            "".length();
            return " ".length() >= "   ".length() ? ((71 ^ 74) ^ (162 ^ 133)) & (((66 ^ 47) ^ (100 ^ 35)) ^ (-" ".length())) : r0;
        }
        return llIIlIlII[1];
    }

    @Inject
    public C(ChopBurnConfig chopBurnConfig) {
        this.bc = chopBurnConfig;
    }

    private static boolean lIllIIIIlll(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
        if (lIllIIIIlIl(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        WorldPoint worldPoint;
        if (lIllIIIIlll(Inventory.isFull() ? 1 : 0)) {
            this.bd = llIIlIlII[3];
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            if (lIllIIIlIII(this.bf)) {
                String[] strArr = new String[llIIlIlII[3]];
                strArr[llIIlIlII[1]] = this.bc.tree().Y();
                if (!lIllIIIlIIl(Inventory.getCount(strArr), llIIlIlII[6]) || lIllIIIlIlI(this.bf.size(), llIIlIlII[6])) {
                    String[] strArr2 = new String[llIIlIlII[3]];
                    strArr2[llIIlIlII[1]] = this.bc.tree().Y();
                }
            }
            this.bf = null;
            this.bd = llIIlIlII[1];
        }
        Player local = Players.getLocal();
        int tickCount = Static.getClient().getTickCount();
        if (lIllIIIIlll(this.bd ? 1 : 0)) {
            if (lIllIIIIIlI(this.bf)) {
                this.bf = X();
                "".length();
                if ((-((195 ^ 196) ^ "   ".length())) >= 0) {
                    return ((((76 + 194) - 223) + 173) ^ (((88 + 126) - 195) + 134)) & (((89 ^ 80) ^ (247 ^ 187)) ^ (-" ".length()));
                }
            } else {
                Optional<WorldPoint> b = b(this.bf);
                if (lIllIIIIlll(b.isEmpty() ? 1 : 0)) {
                    this.bf = null;
                    return llIIlIlII[1];
                }
                if (lIllIIIIlIl(local.getWorldLocation().equals(b.get()) ? 1 : 0)) {
                    if (lIllIIIIlll(local.isMoving() ? 1 : 0)) {
                        return llIIlIlII[1];
                    }
                    Movement.walkTo(b.get());
                    "".length();
                    "".length();
                    if (((170 ^ 147) & ((43 ^ 18) ^ (-1))) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (lIllIIIlIlI(tickCount - this.bh, llIIlIlII[6])) {
                    if (lIllIIIlIll(local.getAnimation(), llIIlIlII[5])) {
                        String[] strArr3 = new String[llIIlIlII[3]];
                        strArr3[llIIlIlII[1]] = this.bc.tree().Y();
                        Item first = Inventory.getFirst(strArr3);
                        String[] strArr4 = new String[llIIlIlII[3]];
                        strArr4[llIIlIlII[1]] = llIIlIIll[llIIlIlII[1]];
                        first.useOn(Inventory.getFirst(strArr4));
                    }
                    this.bh = tickCount;
                }
                "".length();
                if ("  ".length() >= ((177 ^ 168) ^ (153 ^ 132))) {
                    return ((75 ^ 7) ^ (127 ^ 45)) & (((26 ^ 106) ^ (229 ^ 139)) ^ (-" ".length()));
                }
            }
        } else if (lIllIIIlIIl(tickCount - this.bg, llIIlIlII[6])) {
            return llIIlIlII[1];
        } else {
            if (lIllIIIlIII(local) && lIllIIIlIll(local.getAnimation(), llIIlIlII[5])) {
                if (lIllIIIIIlI(this.be)) {
                    worldPoint = local.getWorldLocation();
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return ((((147 + 158) - 251) + 162) ^ (((144 + 23) - 67) + 55)) & (((((96 + 152) - 130) + 103) ^ (((56 + 74) - 88) + 116)) ^ (-" ".length()));
                    }
                } else {
                    worldPoint = this.be;
                }
                String[] strArr5 = new String[llIIlIlII[3]];
                strArr5[llIIlIlII[1]] = this.bc.tree().Z();
                TileObject nearest = TileObjects.getNearest(worldPoint, strArr5);
                if (lIllIIIlIII(nearest)) {
                    nearest.interact(llIIlIIll[llIIlIlII[3]]);
                    this.bg = tickCount;
                    return llIIlIlII[3];
                }
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIllIIIlIII(local)) {
                this.bg = tickCount;
            }
        }
        return llIIlIlII[1];
    }

    private static String lIlIllllllI(String lIllIlIIIIlllIl, String lIllIlIIIIlllII) {
        try {
            SecretKeySpec lIllIlIIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), llIIlIlII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlII[7], lIllIlIIIlIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIIIIllllI) {
            lIllIlIIIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIlllllll(String lIllIlIIIllIIlI, String lIllIlIIIllIIIl) {
        String str = new String(Base64.getDecoder().decode(lIllIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllIlIIIlIllll = lIllIlIIIllIIIl.toCharArray();
        int lIllIlIIIlIlllI = llIIlIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIIlIlII[1];
        while (lIllIIIIIll(i2, length)) {
            sb.append((char) (charArray[i2] ^ lIllIlIIIlIllll[lIllIlIIIlIlllI % lIllIlIIIlIllll.length]));
            "".length();
            lIllIlIIIlIlllI++;
            i2++;
            "".length();
            if (((225 ^ 139) ^ (228 ^ 138)) > (" ".length() ^ (165 ^ 160))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlIIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIllIIIIlII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIllIIIlIlI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIllIIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIIIlIll(int i2, int i3) {
        return i2 == i3;
    }

    private static void lIllIIIIIII() {
        llIIlIIll = new String[llIIlIlII[9]];
        llIIlIIll[llIIlIlII[1]] = lIlIllllllI("C2VBiGpC22n0bCsrFh+2EA==", "jovAu");
        llIIlIIll[llIIlIlII[3]] = lIlIlllllll("MB8FGEoXGB0G", "swjhj");
        llIIlIIll[llIIlIlII[7]] = lIlIllllllI("M43ozwgzVxHF55MRhKA3IQ==", "mOpVv");
        llIIlIIll[llIIlIlII[8]] = lIlIllllllI("stf/NmSY6eZy4hh/gF+/zQ==", "txOVZ");
        llIIlIIll[llIIlIlII[6]] = lIlIllllllI("QhEXUgsWSo4=", "pltAI");
    }
}
