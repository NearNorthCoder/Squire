package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Crafting gear", priority = 5, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.C  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/C.class */
public class C extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIlIIlI;
    private static /* synthetic */ String[] llIlIIIlIIIl;
    private final /* synthetic */ B bQ;
    private /* synthetic */ int bR;

    private static boolean lIIIIIIlIIlIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        C0007h V = this.ba.V();
        if (!lIIIIIIlIIIlllI(V) || lIIIIIIlIIIllll(local)) {
            return llIlIIIlIIlI[1];
        }
        if (lIIIIIIlIIlIIII(V.av().e(local.getWorldLocation()) ? 1 : 0)) {
            if (lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            C0012m av = this.ba.V().av();
            WorldPoint aQ = av.aQ();
            if (lIIIIIIlIIlIIIl(aQ.isInScene(Static.getClient()) ? 1 : 0)) {
                ScenePoint fromWorld = ScenePoint.fromWorld(aQ);
                Movement.setDestination(fromWorld.getX(), fromWorld.getY());
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                this.ba.a(av, local.getWorldLocation());
                "".length();
            }
            return llIlIIIlIIlI[2];
        }
        List<EnumC0005f> I = this.ba.I();
        if (lIIIIIIlIIlIIII(I.isEmpty() ? 1 : 0)) {
            if (lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            if (lIIIIIIlIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                int[] iArr = new int[llIlIIIlIIlI[2]];
                iArr[llIlIIIlIIlI[1]] = llIlIIIlIIlI[4];
                Item first = Inventory.getFirst(iArr);
                if (lIIIIIIlIIIlllI(first)) {
                    first.interact(llIlIIIlIIIl[llIlIIIlIIlI[1]]);
                    this.ba.V().av().k(llIlIIIlIIlI[2]);
                    return llIlIIIlIIlI[2];
                }
                int[] iArr2 = new int[llIlIIIlIIlI[2]];
                iArr2[llIlIIIlIIlI[1]] = llIlIIIlIIlI[5];
                Item first2 = Inventory.getFirst(iArr2);
                if (lIIIIIIlIIIlllI(first2)) {
                    first2.interact(llIlIIIlIIIl[llIlIIIlIIlI[2]]);
                    return llIlIIIlIIlI[2];
                }
            }
            if (lIIIIIIlIIlIIlI(this.bR)) {
                this.bR -= llIlIIIlIIlI[2];
                return llIlIIIlIIlI[2];
            }
            Widget widget = Widgets.get(llIlIIIlIIlI[6], llIlIIIlIIlI[7]);
            if (lIIIIIIlIIIlllI(widget) && lIIIIIIlIIlIIII(widget.isHidden() ? 1 : 0)) {
                Widget[] staticChildren = widget.getStaticChildren();
                int length = staticChildren.length;
                int i = llIlIIIlIIlI[1];
                while (lIIIIIIlIIlIIll(i, length)) {
                    Widget widget2 = staticChildren[i];
                    String name = widget2.getName();
                    Stream<String> stream = I.get(llIlIIIlIIlI[1]).ae().stream();
                    Objects.requireNonNull(name);
                    "".length();
                    if (lIIIIIIlIIlIIIl(stream.anyMatch((v1) -> {
                        return r1.contains(v1);
                    }) ? 1 : 0)) {
                        widget2.interact(llIlIIIlIIIl[llIlIIIlIIlI[3]]);
                        this.bR = llIlIIIlIIlI[2];
                        return llIlIIIlIIlI[2];
                    }
                    i++;
                    "".length();
                    if ((-" ".length()) == "   ".length()) {
                        return ((((22 + 57) - 70) + 175) ^ (((136 + 102) - 141) + 47)) & (((5 ^ 86) ^ (83 ^ 40)) ^ (-" ".length()));
                    }
                }
                return llIlIIIlIIlI[1];
            }
            String[] strArr = new String[llIlIIIlIIlI[2]];
            strArr[llIlIIIlIIlI[1]] = llIlIIIlIIIl[llIlIIIlIIlI[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIIIIIIlIIIlllI(nearest)) {
                nearest.interact(llIlIIIlIIIl[llIlIIIlIIlI[8]]);
                return llIlIIIlIIlI[2];
            }
        }
        return llIlIIIlIIlI[1];
    }

    private static String lIIIIIIlIIIlIlI(String lllllllllllllllIlIIIllIIlIIIIIll, String lllllllllllllllIlIIIllIIlIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIlIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIlIIIIlIl.init(llIlIIIlIIlI[3], secretKeySpec);
            return new String(lllllllllllllllIlIIIllIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIlIIIIlII) {
            lllllllllllllllIlIIIllIIlIIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIlIIIlIll(String lllllllllllllllIlIIIllIIlIlIIlIl, String lllllllllllllllIlIIIllIIlIlIIlII) {
        String lllllllllllllllIlIIIllIIlIlIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIllIIlIlIIlII.toCharArray();
        int lllllllllllllllIlIIIllIIlIlIIIIl = llIlIIIlIIlI[1];
        char[] charArray2 = lllllllllllllllIlIIIllIIlIlIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIlIIlI[1];
        while (lIIIIIIlIIlIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIIllIIlIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIIllIIlIlIIIIl++;
            i++;
            "".length();
            if (((121 ^ 107) & ((142 ^ 156) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIIIIlIIIllIl() {
        llIlIIIlIIlI = new int[11];
        llIlIIIlIIlI[0] = "   ".length();
        llIlIIIlIIlI[1] = (178 ^ 157) & ((44 ^ 3) ^ (-1));
        llIlIIIlIIlI[2] = " ".length();
        llIlIIIlIIlI[3] = "  ".length();
        llIlIIIlIIlI[4] = (-553) & 24424;
        llIlIIIlIIlI[5] = (-((-18787) & 27631)) & (-17) & 32734;
        llIlIIIlIIlI[6] = (-((-17239) & 24567)) & (-65) & 7662;
        llIlIIIlIIlI[7] = 45 ^ 35;
        llIlIIIlIIlI[8] = (203 ^ 135) ^ (107 ^ 35);
        llIlIIIlIIlI[9] = (249 ^ 197) ^ (255 ^ 198);
        llIlIIIlIIlI[10] = 74 ^ 66;
    }

    private static boolean lIIIIIIlIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIlIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIlIIIlIIl(String lllllllllllllllIlIIIllIIlIIlIIII, String lllllllllllllllIlIIIllIIlIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIlIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIIIllll.getBytes(StandardCharsets.UTF_8)), llIlIIIlIIlI[10]), "DES");
            Cipher lllllllllllllllIlIIIllIIlIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIlIIlIIlI.init(llIlIIIlIIlI[3], lllllllllllllllIlIIIllIIlIIlIIll);
            return new String(lllllllllllllllIlIIIllIIlIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIlIIlIIIl) {
            lllllllllllllllIlIIIllIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(C0002c c0002c, B b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIlIIlI[0]];
        enumC0003dArr[llIlIIIlIIlI[1]] = EnumC0003d.FIRST_ROTATION_CREATE;
        enumC0003dArr[llIlIIIlIIlI[2]] = EnumC0003d.PREPARE_BOSS_FIGHT;
        enumC0003dArr[llIlIIIlIIlI[3]] = EnumC0003d.CREATING_T3_STAFF;
        this.bQ = b;
    }

    private static boolean lIIIIIIlIIIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIlIIlIIlI(int i) {
        return i > 0;
    }

    private static boolean lIIIIIIlIIlIIIl(int i) {
        return i != 0;
    }

    static {
        lIIIIIIlIIIllIl();
        lIIIIIIlIIIllII();
    }

    private static void lIIIIIIlIIIllII() {
        llIlIIIlIIIl = new String[llIlIIIlIIlI[9]];
        llIlIIIlIIIl[llIlIIIlIIlI[1]] = lIIIIIIlIIIlIIl("mTDRH2cHTpw=", "ZiQLd");
        llIlIIIlIIIl[llIlIIIlIIlI[2]] = lIIIIIIlIIIlIlI("agkuUu7ZYWw=", "FGllu");
        llIlIIIlIIIl[llIlIIIlIIlI[3]] = lIIIIIIlIIIlIll("IDUZJw==", "mTrBt");
        llIlIIIlIIIl[llIlIIIlIIlI[0]] = lIIIIIIlIIIlIlI("YFZD3+Ygb3VeBVJHin1GVg==", "SGicC");
        llIlIIIlIIIl[llIlIIIlIIlI[8]] = lIIIIIIlIIIlIIl("QnHz1IrRcdzdNKHcBo9uwA==", "kMcPc");
    }
}
