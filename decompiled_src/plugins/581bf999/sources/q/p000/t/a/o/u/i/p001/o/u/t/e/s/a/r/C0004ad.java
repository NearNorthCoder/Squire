package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking Ambrosia", priority = 105)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ad  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ad.class */
public class C0004ad extends Z {
    private final /* synthetic */ C cE;
    private static /* synthetic */ String[] llIIllIllII;
    private static /* synthetic */ int[] llIIllIllIl;
    private final /* synthetic */ SquireAutoTOA cF;

    static {
        lIlIIIlIllllIl();
        lIlIIIlIllllII();
    }

    private static boolean lIlIIIllIIIIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected C0004ad(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cE = c;
        this.cF = squireAutoTOA;
    }

    private static boolean lIlIIIllIIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIlIlllllI(int i) {
        return i != 0;
    }

    private static void lIlIIIlIllllIl() {
        llIIllIllIl = new int[5];
        llIIllIllIl[0] = ((35 ^ 121) ^ (171 ^ 179)) & (((184 ^ 151) ^ (68 ^ 41)) ^ (-" ".length()));
        llIIllIllIl[1] = (24 ^ 18) ^ (125 ^ 99);
        llIIllIllIl[2] = (30 ^ 102) ^ (71 ^ 18);
        llIIllIllIl[3] = 148 ^ 166;
        llIIllIllIl[4] = " ".length();
    }

    private static String lIlIIIlIlllIll(String llllllllllllllllIIlllIllIllIIlll, String llllllllllllllllIIlllIllIllIIllI) {
        String llllllllllllllllIIlllIllIllIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIllIllIIlIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIllIllIIllI.toCharArray();
        int llllllllllllllllIIlllIllIllIIIll = llIIllIllIl[0];
        char[] charArray2 = llllllllllllllllIIlllIllIllIIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIIllIllIl[0];
        while (lIlIIIllIIIIlI(i, length)) {
            llllllllllllllllIIlllIllIllIIlIl.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlllIllIllIIIll % charArray.length]));
            "".length();
            llllllllllllllllIIlllIllIllIIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllIllIllIIlIl);
    }

    private static boolean lIlIIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIllllll(int i) {
        return i == 0;
    }

    private static void lIlIIIlIllllII() {
        llIIllIllII = new String[llIIllIllIl[4]];
        llIIllIllII[llIIllIllIl[0]] = lIlIIIlIlllIll("ABk8NwE=", "DkUYj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        int i;
        if (!lIlIIIlIlllllI(this.cF.e() ? 1 : 0) && !lIlIIIlIllllll(aq() ? 1 : 0) && !lIlIIIlIllllll(this.cE.am() ? 1 : 0)) {
            if (lIlIIIlIlllllI(Inventory.contains(item -> {
                return EnumC0056e.NECTAR.d(item.getId());
            }) ? 1 : 0)) {
                i = llIIllIllIl[1];
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return "   ".length() & ("   ".length() ^ (-1));
                }
            } else {
                i = llIIllIllIl[2];
            }
            int i2 = i;
            if (lIlIIIlIlllllI(bf() ? 1 : 0)) {
                i2 = llIIllIllIl[3];
            }
            if (lIlIIIllIIIIII(Combat.getCurrentHealth(), i2)) {
                return llIIllIllIl[0];
            }
            Item first = Inventory.getFirst(item2 -> {
                return EnumC0056e.AMBROSIA.d(item2.getId());
            });
            if (lIlIIIllIIIIIl(first)) {
                return llIIllIllIl[0];
            }
            first.interact(llIIllIllII[llIIllIllIl[0]]);
            this.cE.ao();
            return llIIllIllIl[4];
        }
        return llIIllIllIl[0];
    }
}
