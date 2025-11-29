package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Enchantment room", priority = 6, blocking = true)
/* renamed from: m.u.a.-.e.s.q.t.i.r.r  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/r.class */
public class r extends w<e> {
    private static final /* synthetic */ int at;
    private static final /* synthetic */ int as;
    private static /* synthetic */ String[] lllIlIIlllll;
    private /* synthetic */ int au;
    private static /* synthetic */ int[] lllIlIlIIIII;

    private static void lIIIlIllllIIlll() {
        lllIlIIlllll = new String[lllIlIlIIIII[10]];
        lllIlIIlllll[lllIlIlIIIII[1]] = lIIIlIllllIIlII("OK0Bc900PgZx8I5wrwV5/Q==", "rnswI");
        lllIlIIlllll[lllIlIlIIIII[2]] = lIIIlIllllIIlIl("H0zE23G3/iQ=", "FLINg");
        lllIlIIlllll[lllIlIlIIIII[3]] = lIIIlIllllIIllI("LgMMCkQuAwkIAQ4YChY=", "mledd");
        lllIlIIlllll[lllIlIlIIIII[6]] = lIIIlIllllIIlIl("uV2lHLdDtH9U0/PGPJAAtTvGyA3WRXE7", "AMYze");
        lllIlIIlllll[lllIlIlIIIII[7]] = lIIIlIllllIIlII("/eyqFv13o0SIMaqTM6yzZDiKUcPJ7m9u", "lBZzD");
        lllIlIIlllll[lllIlIlIIIII[8]] = lIIIlIllllIIllI("HBgHACQ+GA==", "IvlnK");
        lllIlIIlllll[lllIlIlIIIII[9]] = lIIIlIllllIIlII("tg7USPpC4hI=", "wZRjo");
    }

    private static boolean lIIIlIllllIlIIl(Object obj) {
        return obj == null;
    }

    private static String lIIIlIllllIIlIl(String lllllllllllllllIIllIllIlIIllIIII, String lllllllllllllllIIllIllIlIIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIlIIllIIlI.init(lllIlIlIIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIllIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIlIIllIIIl) {
            lllllllllllllllIIllIllIlIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllllIIllI(String lllllllllllllllIIllIllIlIlIlIIlI, String lllllllllllllllIIllIllIlIlIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIlIlIlIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIlIlIlIIIl.toCharArray();
        int lllllllllllllllIIllIllIlIlIIlllI = lllIlIlIIIII[1];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIIllIllIlIlIIIlll = charArray2.length;
        int lllllllllllllllIIllIllIlIlIIIllI = lllIlIlIIIII[1];
        while (lIIIlIlllllIIII(lllllllllllllllIIllIllIlIlIIIllI, lllllllllllllllIIllIllIlIlIIIlll)) {
            char lllllllllllllllIIllIllIlIlIlIIll = charArray2[lllllllllllllllIIllIllIlIlIIIllI];
            lllllllllllllllIIllIllIlIlIlIIII.append((char) (lllllllllllllllIIllIllIlIlIlIIll ^ charArray[lllllllllllllllIIllIllIlIlIIlllI % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIlIlIIlllI++;
            lllllllllllllllIIllIllIlIlIIIllI++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllIlIlIlIIII);
    }

    private static boolean lIIIlIllllIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlIllllIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIllllIllll(int i, int i2) {
        return i == i2;
    }

    @Inject
    private r(e eVar, SquireMTA squireMTA) {
        super(eVar, squireMTA);
        this.au = lllIlIlIIIII[0];
    }

    private static void lIIIlIllllIlIII() {
        lllIlIlIIIII = new int[12];
        lllIlIlIIIII[0] = (-((-17153) & 28436)) & (-4101) & 16383;
        lllIlIlIIIII[1] = (210 ^ 143) & ((96 ^ 61) ^ (-1));
        lllIlIlIIIII[2] = " ".length();
        lllIlIlIIIII[3] = "  ".length();
        lllIlIlIIIII[4] = (-((-2994) & 15287)) & (-19457) & 32549;
        lllIlIlIIIII[5] = (-((-4765) & 31455)) & (-4265) & 32254;
        lllIlIlIIIII[6] = "   ".length();
        lllIlIlIIIII[7] = (((83 + 23) - 41) + 91) ^ (((108 + 101) - 107) + 50);
        lllIlIlIIIII[8] = (179 ^ 132) ^ (20 ^ 38);
        lllIlIlIIIII[9] = 1 ^ 7;
        lllIlIlIIIII[10] = 97 ^ 102;
        lllIlIlIIIII[11] = 207 ^ 199;
    }

    private static boolean lIIIlIllllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public Spell L() {
        return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean a(Item item) {
        return ((e) this.aB).o().contains(item.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean M() {
        g n = ((e) this.aB).n();
        if (lIIIlIllllIlIIl(n)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[1]]);
            Arrays.stream(((e) this.aB).p()).filter(gVar -> {
                return gVar.s().j().equals(lllIlIIlllll[lllIlIlIIIII[9]]);
            }).findFirst().ifPresent(gVar2 -> {
                gVar2.r().interact(lllIlIlIIIII[1]);
            });
            return lllIlIlIIIII[2];
        }
        ?? r0 = lllIlIlIIIII[2];
        String[] strArr = new String[lllIlIlIIIII[2]];
        strArr[lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[2]];
        int count = Inventory.getCount((boolean) r0, strArr);
        if (lIIIlIllllIlIlI(count, this.au)) {
            String[] strArr2 = new String[lllIlIlIIIII[2]];
            strArr2[lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[3]];
            TileObject nearest = TileObjects.getNearest(strArr2);
            if (lIIIlIllllIlIIl(nearest)) {
                return lllIlIlIIIII[1];
            }
            nearest.interact(lllIlIlIIIII[1]);
            return lllIlIlIIIII[2];
        }
        if (lIIIlIllllIlIll(count)) {
            this.au = Rand.nextInt(lllIlIlIIIII[4], lllIlIlIIIII[5]);
        }
        int[] iArr = new int[lllIlIlIIIII[2]];
        iArr[lllIlIlIIIII[1]] = ((e) this.aB).l().i();
        Item first = Inventory.getFirst(iArr);
        if (lIIIlIllllIllII(first)) {
            Magic.cast(L(), first);
            return lllIlIlIIIII[2];
        } else if (lIIIlIllllIllIl(Inventory.isFull() ? 1 : 0)) {
            Item first2 = Inventory.getFirst(item -> {
                return Stream.of((Object[]) d.values()).anyMatch(dVar -> {
                    if (lIIIlIllllIllll(dVar.i(), item.getId())) {
                        ?? r02 = lllIlIlIIIII[2];
                        "".length();
                        return (-"  ".length()) > 0 ? ((244 ^ 157) ^ (194 ^ 182)) & (((((115 + 55) - 65) + 43) ^ (((134 + 4) - 93) + 92)) ^ (-" ".length())) : r02;
                    }
                    return lllIlIlIIIII[1];
                });
            });
            if (lIIIlIllllIlIIl(first2)) {
                return lllIlIlIIIII[1];
            }
            Magic.cast(L(), first2);
            return lllIlIlIIIII[2];
        } else if (lIIIlIllllIlllI(n.s(), d.EMPTY)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[6]]);
            Arrays.stream(((e) this.aB).p()).filter(gVar3 -> {
                return gVar3.s().j().equals(lllIlIIlllll[lllIlIlIIIII[8]]);
            }).findFirst().ifPresent(gVar4 -> {
                gVar4.r().interact(lllIlIlIIIII[1]);
            });
            return lllIlIlIIIII[2];
        } else {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[7]]);
            n.r().interact(lllIlIlIIIII[1]);
            return lllIlIlIIIII[2];
        }
    }

    private static String lIIIlIllllIIlII(String lllllllllllllllIIllIllIlIIllllIl, String lllllllllllllllIIllIllIlIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIIllllII.getBytes(StandardCharsets.UTF_8)), lllIlIlIIIII[11]), "DES");
            Cipher lllllllllllllllIIllIllIlIIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIlIIllllll.init(lllIlIlIIIII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIllIlIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIlIIlllllI) {
            lllllllllllllllIIllIllIlIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIllllIlIll(int i) {
        return i == 0;
    }

    static {
        lIIIlIllllIlIII();
        lIIIlIllllIIlll();
        as = lllIlIlIIIII[4];
        at = lllIlIlIIIII[5];
    }

    private static boolean lIIIlIlllllIIII(int i, int i2) {
        return i < i2;
    }
}
