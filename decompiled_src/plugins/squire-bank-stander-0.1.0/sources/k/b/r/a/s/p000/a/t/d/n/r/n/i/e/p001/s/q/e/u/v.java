package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ClientTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.query.results.ItemQueryResults;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Cooking", register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.v  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/v.class */
public class v extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIIllIll;
    private static /* synthetic */ String[] lllIIIllIlI;

    @Inject
    public v(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.COOKING);
    }

    private static boolean lIlIllIlIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIlIlIIlI(this.j.oneTick() ? 1 : 0)) {
            ItemQuery query = Inventory.query();
            int[] iArr = new int[lllIIIllIll[0]];
            iArr[lllIIIllIll[1]] = this.j.cookingProduct().A();
            Item item = (Item) ((ItemQueryResults) query.ids(iArr).results()).last();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIllIlIlIIll(tileObject.getActions())) {
                    String[] strArr = new String[lllIIIllIll[0]];
                    strArr[lllIIIllIll[1]] = lllIIIllIlI[lllIIIllIll[3]];
                    if (lIlIllIlIlIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIll[0];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIll[1];
            });
            if (lIlIllIlIlIIlI(Production.isOpen() ? 1 : 0)) {
                Production.choosePreviousOption();
            }
            if (lIlIllIlIlIIll(item) && lIlIllIlIlIIll(nearest)) {
                item.useOn(nearest);
            }
            return lllIIIllIll[0];
        } else if (lIlIllIlIlIIlI(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(this.j.cookingProduct().C());
            sleep(i());
            return lllIIIllIll[0];
        } else {
            int[] iArr2 = new int[lllIIIllIll[0]];
            iArr2[lllIIIllIll[1]] = this.j.cookingProduct().A();
            Item first = Inventory.getFirst(iArr2);
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (lIlIllIlIlIIll(tileObject2.getActions())) {
                    String[] strArr = new String[lllIIIllIll[0]];
                    strArr[lllIIIllIll[1]] = lllIIIllIlI[lllIIIllIll[1]];
                }
                if (!lIlIllIlIlIIlI(tileObject2.getName().equals(lllIIIllIlI[lllIIIllIll[0]]) ? 1 : 0)) {
                    return lllIIIllIll[1];
                }
                ?? r0 = lllIIIllIll[0];
                "".length();
                return "  ".length() == 0 ? ((((157 + 184) - 119) + 3) ^ (((128 + 31) - (-1)) + 2)) & (((247 ^ 130) ^ (156 ^ 170)) ^ (-" ".length())) : r0;
            });
            if (lIlIllIlIlIlII(nearest2)) {
                return lllIIIllIll[1];
            }
            first.useOn(nearest2);
            sleep(lllIIIllIll[0]);
            return lllIIIllIll[0];
        }
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        if (lIlIllIlIlIIlI(this.j.oneTick() ? 1 : 0)) {
            int i = lllIIIllIll[1];
            "".length();
            return (((103 ^ 30) ^ (((32 + 122) - 101) + 74)) & (((172 ^ 165) ^ (132 ^ 139)) ^ (-" ".length()))) >= ((183 ^ 148) ^ (19 ^ 52)) ? ((((157 + 17) - 39) + 28) ^ (((62 + 15) - (-62)) + 19)) & (((((152 + 84) - 102) + 43) ^ (((135 + 127) - 210) + 88)) ^ (-" ".length())) : i;
        }
        return lllIIIllIll[2];
    }

    private static void lIlIllIlIlIIII() {
        lllIIIllIlI = new String[lllIIIllIll[2]];
        lllIIIllIlI[lllIIIllIll[1]] = lIlIllIlIIlllI("kxhVkgojWQw=", "qEniw");
        lllIIIllIlI[lllIIIllIll[0]] = lIlIllIlIIllll("2KHJW3hUlOM=", "UzQZS");
        lllIIIllIlI[lllIIIllIll[3]] = lIlIllIlIIlllI("qQ3eUZMy+kA=", "JqIdv");
    }

    private static void lIlIllIlIlIIIl() {
        lllIIIllIll = new int[5];
        lllIIIllIll[0] = " ".length();
        lllIIIllIll[1] = (92 ^ 68) & ((52 ^ 44) ^ (-1));
        lllIIIllIll[2] = "   ".length();
        lllIIIllIll[3] = "  ".length();
        lllIIIllIll[4] = (((165 + 11) - 112) + 143) ^ (((109 + 166) - 191) + 115);
    }

    private static boolean lIlIllIlIlIIlI(int i) {
        return i != 0;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(this.j.cookingProduct().A()), Integer.valueOf(lllIIIllIll[0]));
    }

    private static boolean lIlIllIlIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlIlIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIllIlIlIlII(Object obj) {
        return obj == null;
    }

    private static String lIlIllIlIIlllI(String llllllllllllllllIIlIlIIlIIllllII, String llllllllllllllllIIlIlIIlIIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), lllIIIllIll[4]), "DES");
            Cipher llllllllllllllllIIlIlIIlIIlllllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIlIIlllllI.init(lllIIIllIll[3], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIlIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlIIllllIl) {
            llllllllllllllllIIlIlIIlIIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIllIlIlIIIl();
        lIlIllIlIlIIII();
    }

    private static String lIlIllIlIIllll(String llllllllllllllllIIlIlIIlIlIIlIIl, String llllllllllllllllIIlIlIIlIlIIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIlIlIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIlIlIIlIll.init(lllIIIllIll[3], llllllllllllllllIIlIlIIlIlIIllII);
            return new String(llllllllllllllllIIlIlIIlIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlIlIIlIlI) {
            llllllllllllllllIIlIlIIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ClientTick clientTick) {
        if (lIlIllIlIlIlIl(this.j.oneTick() ? 1 : 0) || lIlIllIlIlIllI(this.j.cookingProduct(), EnumC0008i.KARAMBWAN)) {
            return;
        }
        Keyboard.sendSpace();
    }
}
