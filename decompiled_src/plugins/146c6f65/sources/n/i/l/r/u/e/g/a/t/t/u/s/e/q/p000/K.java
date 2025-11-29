package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Grabbing harpoon", priority = 15, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.K  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/K.class */
public class K extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlllIIlIl;
    private static /* synthetic */ String[] llIIllIllllI;

    private static boolean llllllllIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llllllllIIlIIl(Object obj) {
        return obj != null;
    }

    private static String llllllllIIIlIl(String lllllllllllllllIlIIlIIlIIllIIlII, String lllllllllllllllIlIIlIIlIIllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), llIIlllIIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIIlIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIlIIllIIlll) {
            lllllllllllllllIlIIlIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIII(int i) {
        return i != 0;
    }

    private static void llllllllIIIllI() {
        llIIllIllllI = new String[llIIlllIIlIl[8]];
        llIIllIllllI[llIIlllIIlIl[1]] = llllllllIIIIll("BSIwCS0iLWIOKykkJw1iOyoxECAhJg==", "MCByB");
        llIIllIllllI[llIIlllIIlIl[0]] = llllllllIIIlII("gxMkz5KfIMA=", "OJsRl");
        llIIllIllllI[llIIlllIIlIl[5]] = llllllllIIIlIl("c+8pTkf/304=", "yvlWI");
    }

    private static void llllllllIIIlll() {
        llIIlllIIlIl = new int[10];
        llIIlllIIlIl[0] = " ".length();
        llIIlllIIlIl[1] = (88 ^ 27) & ((105 ^ 42) ^ (-1));
        llIIlllIIlIl[2] = (-19281) & 12274515;
        llIIlllIIlIl[3] = (121 ^ 22) ^ (21 ^ 73);
        llIIlllIIlIl[4] = 133 ^ 137;
        llIIlllIIlIl[5] = "  ".length();
        llIIlllIIlIl[6] = (-((-25605) & 29717)) & (-8997) & 49085;
        llIIlllIIlIl[7] = (-21010) & 57083;
        llIIlllIIlIl[8] = "   ".length();
        llIIlllIIlIl[9] = (201 ^ 154) ^ (92 ^ 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        List<Integer> ay = EnumC0008i.FISH.ay();
        Predicate predicate = identifiable -> {
            return ay.contains(Integer.valueOf(identifiable.getId()));
        };
        Objects.requireNonNull(predicate);
        "".length();
        if (llllllllIIlIII(Inventory.contains((v1) -> {
            return r0.test(v1);
        }) ? 1 : 0)) {
            return llIIlllIIlIl[1];
        }
        Widget widget = Static.getClient().getWidget(llIIlllIIlIl[2]);
        if (llllllllIIlIIl(widget) && llllllllIIlIII(widget.isVisible() ? 1 : 0)) {
            System.out.println(llIIllIllllI[llIIlllIIlIl[1]]);
            Keyboard.type(llIIlllIIlIl[3]);
            return llIIlllIIlIl[0];
        }
        Objects.requireNonNull(predicate);
        "".length();
        TileItem nearest = TileItems.getNearest((v1) -> {
            return r0.test(v1);
        });
        Player local = Players.getLocal();
        if (llllllllIIlIIl(nearest) && llllllllIIlIlI(nearest.distanceTo(local), llIIlllIIlIl[4])) {
            nearest.interact(llIIllIllllI[llIIlllIIlIl[0]]);
            return llIIlllIIlIl[0];
        }
        C0012m av = this.ba.V().av();
        WorldPoint worldLocation = local.getWorldLocation();
        if (llllllllIIlIll(av.e(worldLocation) ? 1 : 0)) {
            return this.ba.a(av, worldLocation);
        }
        int[] iArr = new int[llIIlllIIlIl[5]];
        iArr[llIIlllIIlIl[1]] = llIIlllIIlIl[6];
        iArr[llIIlllIIlIl[0]] = llIIlllIIlIl[7];
        TileObject nearest2 = TileObjects.getNearest(iArr);
        if (llllllllIIllII(nearest2)) {
            return llIIlllIIlIl[1];
        }
        nearest2.interact(llIIllIllllI[llIIlllIIlIl[5]]);
        Time.sleep(150L);
        "".length();
        Keyboard.type(llIIlllIIlIl[3]);
        return llIIlllIIlIl[0];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIIlIl[0]];
        enumC0003dArr[llIIlllIIlIl[1]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
    }

    private static String llllllllIIIlII(String lllllllllllllllIlIIlIIlIIlIIIIIl, String lllllllllllllllIlIIlIIlIIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIIlIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIlIIlIIIIlI) {
            lllllllllllllllIlIIlIIlIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllllIIlIll(int i) {
        return i == 0;
    }

    private static String llllllllIIIIll(String lllllllllllllllIlIIlIIlIIlIlIllI, String lllllllllllllllIlIIlIIlIIlIlIlIl) {
        String lllllllllllllllIlIIlIIlIIlIlIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIlIIlIIlIlIIll = lllllllllllllllIlIIlIIlIIlIlIlIl.toCharArray();
        int lllllllllllllllIlIIlIIlIIlIlIIlI = llIIlllIIlIl[1];
        char[] charArray = lllllllllllllllIlIIlIIlIIlIlIllI2.toCharArray();
        int length = charArray.length;
        int i = llIIlllIIlIl[1];
        while (llllllllIIlIlI(i, length)) {
            char lllllllllllllllIlIIlIIlIIlIlIlll = charArray[i];
            sb.append((char) (lllllllllllllllIlIIlIIlIIlIlIlll ^ lllllllllllllllIlIIlIIlIIlIlIIll[lllllllllllllllIlIIlIIlIIlIlIIlI % lllllllllllllllIlIIlIIlIIlIlIIll.length]));
            "".length();
            lllllllllllllllIlIIlIIlIIlIlIIlI++;
            i++;
            "".length();
            if (((((156 + 72) - 177) + 117) ^ (((36 + 36) - (-49)) + 52)) == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llllllllIIIlll();
        llllllllIIIllI();
    }
}
