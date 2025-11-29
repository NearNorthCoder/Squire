package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import net.runelite.api.Prayer;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/n.class */
public abstract class AbstractC0013n extends Task {
    protected final /* synthetic */ C0002c ba;
    private static /* synthetic */ int[] llIIllIlIlIl;
    private /* synthetic */ int be;
    private final /* synthetic */ Set<EnumC0003d> bb;
    private static /* synthetic */ String[] llIIllIlIlII;
    private /* synthetic */ BooleanSupplier bc;
    private /* synthetic */ int bd;

    public void sleepWhile(int i, BooleanSupplier booleanSupplier) {
        this.bd = i;
        this.bc = booleanSupplier;
        this.be = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean bf() {
        return llIIllIlIlIl[0];
    }

    private static boolean lllllllIIIllII(Object obj) {
        return obj != null;
    }

    @Inject
    public AbstractC0013n(C0002c c0002c, EnumC0003d... enumC0003dArr) {
        this.ba = c0002c;
        this.bb = new HashSet(Arrays.asList(enumC0003dArr));
    }

    public boolean bc() {
        return this.bb.contains(this.ba.W());
    }

    public abstract boolean be();

    private static boolean lllllllIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllllIIIlllI(int i) {
        return i != 0;
    }

    private static boolean lllllllIIlIIII(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Prayer> bd() {
        List list = (List) Equipment.getAll().stream().filter((v0) -> {
            return Objects.nonNull(v0);
        }).map((v0) -> {
            return v0.getComposition();
        }).map((v0) -> {
            return v0.getName();
        }).filter((v0) -> {
            return Objects.nonNull(v0);
        }).collect(Collectors.toList());
        return lllllllIIIlllI(list.stream().anyMatch(str -> {
            return str.contains(llIIllIlIlII[llIIllIlIlIl[1]]);
        }) ? 1 : 0) ? Prayers.getRangePrayers() : lllllllIIIlllI(list.stream().anyMatch(str2 -> {
            return str2.contains(llIIllIlIlII[llIIllIlIlIl[0]]);
        }) ? 1 : 0) ? Prayers.getMagePrayers() : Prayers.getMeleePrayer();
    }

    static {
        lllllllIIIlIll();
        lllllllIIIlIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean run() {
        if (!lllllllIIIllII(this.ba) || lllllllIIIllIl(this.ba.h())) {
            return llIIllIlIlIl[0];
        }
        if (lllllllIIIllII(this.bc) && lllllllIIIlllI(this.bc.getAsBoolean() ? 1 : 0)) {
            this.bd = this.be;
        }
        if (lllllllIIIllll(this.bd)) {
            this.bd -= llIIllIlIlIl[1];
            return llIIllIlIlIl[0];
        }
        this.be = llIIllIlIlIl[0];
        this.bc = null;
        if (lllllllIIIlllI(this.ba.h().onlyHandlePrayers() ? 1 : 0) && lllllllIIlIIII(bf() ? 1 : 0)) {
            Static.getClient().setShowMouseCross((boolean) llIIllIlIlIl[1]);
            return llIIllIlIlIl[0];
        }
        if ((!lllllllIIIlllI(SquireGauntlet.g() ? 1 : 0) || !lllllllIIlIIII(this.bb.contains(EnumC0003d.BOSS_FIGHT) ? 1 : 0)) && lllllllIIIlllI(bc() ? 1 : 0)) {
            return be();
        }
        return llIIllIlIlIl[0];
    }

    private static boolean lllllllIIIllll(int i) {
        return i > 0;
    }

    private static void lllllllIIIlIlI() {
        llIIllIlIlII = new String[llIIllIlIlIl[2]];
        llIIllIlIlII[llIIllIlIlIl[0]] = lllllllIIIlIIl("NDAFDhI=", "GDdht");
        llIIllIlIlII[llIIllIlIlIl[1]] = lllllllIIIlIIl("NS0x", "WBFPh");
    }

    private static String lllllllIIIlIIl(String lllllllllllllllIlIIlIlIIlIlIIIII, String lllllllllllllllIlIIlIlIIlIIlllll) {
        String lllllllllllllllIlIIlIlIIlIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIIlIIllllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlIIlIIlllll.toCharArray();
        int lllllllllllllllIlIIlIlIIlIIlllII = llIIllIlIlIl[0];
        char[] charArray2 = lllllllllllllllIlIIlIlIIlIlIIIII2.toCharArray();
        int length = charArray2.length;
        int i = llIIllIlIlIl[0];
        while (lllllllIIlIIIl(i, length)) {
            lllllllllllllllIlIIlIlIIlIIllllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIlIIlIIlllII % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlIIlIIlllII++;
            i++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlIIlIIllllI);
    }

    public Set<EnumC0003d> bg() {
        return this.bb;
    }

    private static boolean lllllllIIIllIl(Object obj) {
        return obj == null;
    }

    private static void lllllllIIIlIll() {
        llIIllIlIlIl = new int[3];
        llIIllIlIlIl[0] = (225 ^ 180) & ((109 ^ 56) ^ (-1));
        llIIllIlIlIl[1] = " ".length();
        llIIllIlIlIl[2] = "  ".length();
    }
}
