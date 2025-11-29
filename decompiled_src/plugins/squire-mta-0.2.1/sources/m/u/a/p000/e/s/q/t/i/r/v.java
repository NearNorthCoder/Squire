package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Graveyard room", priority = 4, blocking = true)
/* renamed from: m.u.a.-.e.s.q.t.i.r.v  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/v.class */
public class v extends w<l> {
    private static final /* synthetic */ int az;
    private static final /* synthetic */ int ay;
    private static final /* synthetic */ int aA;
    private static /* synthetic */ int[] lllIlIlIIIlI;
    private static /* synthetic */ String[] lllIlIlIIIIl;

    private static boolean lIIIlIlllllIlIl(int i) {
        return i != 0;
    }

    private void N() {
        SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
        int i = lllIlIlIIIlI[2];
        if (lIIIlIlllllIlll(standard.canCast() ? 1 : 0)) {
            standard = SpellBook.Standard.BONES_TO_BANANAS;
            i = lllIlIlIIIlI[3];
        }
        int[] iArr = new int[lllIlIlIIIlI[1]];
        iArr[lllIlIlIIIlI[0]] = i;
        if (lIIIlIlllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            Magic.cast(standard);
            return;
        }
        int[] iArr2 = new int[lllIlIlIIIlI[1]];
        iArr2[lllIlIlIIIlI[0]] = i;
        Item first = Inventory.getFirst(iArr2);
        if (!lIIIlIllllllIIl(i, lllIlIlIIIlI[3]) || lIIIlIlllllIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            first.interact(lllIlIlIIIIl[lllIlIlIIIlI[5]]);
        }
        String[] strArr = new String[lllIlIlIIIlI[1]];
        strArr[lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[6]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIIlIlllllIllI(nearest)) {
            return;
        }
        nearest.interact(lllIlIlIIIIl[lllIlIlIIIlI[7]]);
    }

    static {
        lIIIlIlllllIlII();
        lIIIlIlllllIIll();
        az = lllIlIlIIIlI[2];
        ay = lllIlIlIIIlI[3];
        aA = lllIlIlIIIlI[4];
    }

    private static String lIIIlIlllllIIIl(String lllllllllllllllIIllIllIIlllllIll, String lllllllllllllllIIllIllIIlllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIIIlI[5], lllllllllllllllIIllIllIIlllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIllllllII) {
            lllllllllllllllIIllIllIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIllllllIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean a(Item item) {
        if (lIIIlIlllllIlIl(item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[0]]) ? 1 : 0) && lIIIlIlllllIlIl(Stream.of((Object[]) Rune.WATER.getRuneNames()).anyMatch(str -> {
            return item.getName().toLowerCase().contains(str.toLowerCase());
        }) ? 1 : 0)) {
            ?? r0 = lllIlIlIIIlI[1];
            "".length();
            return ((((19 + 111) - 102) + 101) ^ (((122 + 116) - 160) + 55)) != ((((6 + 12) - (-161)) + 9) ^ (((146 + 17) - 5) + 26)) ? ((12 ^ 68) ^ (225 ^ 141)) & (((194 ^ 185) ^ (12 ^ 83)) ^ (-" ".length())) : r0;
        }
        return lllIlIlIIIlI[0];
    }

    private static boolean lIIIlIlllllIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean M() {
        String[] strArr = new String[lllIlIlIIIlI[1]];
        strArr[lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIIIlIlllllIllI(nearest)) {
            return lllIlIlIIIlI[0];
        }
        int[] iArr = new int[lllIlIlIIIlI[1]];
        iArr[lllIlIlIIIlI[0]] = lllIlIlIIIlI[2];
        if (lIIIlIlllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIlIlIIIlI[1]];
            iArr2[lllIlIlIIIlI[0]] = lllIlIlIIIlI[3];
            if (lIIIlIlllllIlll(Inventory.contains(iArr2) ? 1 : 0) && !lIIIlIllllllIII(((l) this.aB).B(), lllIlIlIIIlI[4])) {
                b(nearest);
                return lllIlIlIIIlI[1];
            }
        }
        N();
        return lllIlIlIIIlI[1];
    }

    private static boolean lIIIlIllllllIlI(int i, int i2) {
        return i < i2;
    }

    @Inject
    private v(l lVar, SquireMTA squireMTA) {
        super(lVar, squireMTA);
    }

    private static boolean lIIIlIlllllIllI(Object obj) {
        return obj == null;
    }

    private void b(TileObject tileObject) {
        if (lIIIlIlllllIlll(Inventory.isFull() ? 1 : 0)) {
            tileObject.interact(lllIlIlIIIlI[0]);
            "".length();
            if ((-" ".length()) >= "  ".length()) {
            }
        } else if (lIIIlIlllllIlIl(Inventory.isFull() ? 1 : 0) && lIIIlIlllllIlIl(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[8]]);
        }) ? 1 : 0)) {
            Magic.cast(SpellBook.Standard.BONES_TO_BANANAS);
        }
    }

    private static String lIIIlIlllllIIlI(String lllllllllllllllIIllIllIIlllIlIll, String lllllllllllllllIIllIllIIlllIlIlI) {
        String lllllllllllllllIIllIllIIlllIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIIlllIlIlI.toCharArray();
        int lllllllllllllllIIllIllIIlllIIlll = lllIlIlIIIlI[0];
        char[] charArray2 = lllllllllllllllIIllIllIIlllIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIIIlI[0];
        while (lIIIlIllllllIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIllIIlllIIlll % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIIlllIIlll++;
            i++;
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIlllllIIll() {
        lllIlIlIIIIl = new String[lllIlIlIIIlI[9]];
        lllIlIlIIIIl[lllIlIlIIIlI[0]] = lIIIlIlllllIIIl("k7CO+yiD9P4=", "RcxNB");
        lllIlIlIIIIl[lllIlIlIIIlI[1]] = lIIIlIlllllIIlI("KT84FgE=", "kPVsr");
        lllIlIlIIIIl[lllIlIlIIIlI[5]] = lIIIlIlllllIIlI("MxIb", "vsoSe");
        lllIlIlIIIIl[lllIlIlIIIlI[6]] = lIIIlIlllllIIIl("p1FjD7zOPKjw/NFOuqpV9A==", "uyhsd");
        lllIlIlIIIIl[lllIlIlIIIlI[7]] = lIIIlIlllllIIlI("CAQyCDAlFQ==", "LaBgC");
        lllIlIlIIIIl[lllIlIlIIIlI[8]] = lIIIlIlllllIIlI("Gy4qEzk=", "yADvJ");
    }

    private static void lIIIlIlllllIlII() {
        lllIlIlIIIlI = new int[10];
        lllIlIlIIIlI[0] = (113 ^ 109) & ((64 ^ 92) ^ (-1));
        lllIlIlIIIlI[1] = " ".length();
        lllIlIlIIIlI[2] = (-((-20995) & 21255)) & (-1) & 7143;
        lllIlIlIIIlI[3] = (-((-35) & 24611)) & (-4177) & 30715;
        lllIlIlIIIlI[4] = (6 ^ 34) ^ (18 ^ 36);
        lllIlIlIIIlI[5] = "  ".length();
        lllIlIlIIIlI[6] = "   ".length();
        lllIlIlIIIlI[7] = 81 ^ 85;
        lllIlIlIIIlI[8] = (((3 + 42) - (-94)) + 30) ^ (((54 + 145) - 75) + 48);
        lllIlIlIIIlI[9] = 102 ^ 96;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public Spell L() {
        return SpellBook.Standard.BONES_TO_BANANAS;
    }
}
