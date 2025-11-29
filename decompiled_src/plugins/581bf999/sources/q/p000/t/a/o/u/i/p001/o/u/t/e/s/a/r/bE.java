package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Going to final phase", priority = 1000, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bE  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bE.class */
public class bE extends bG {
    private static final /* synthetic */ int gm;
    private static /* synthetic */ int[] llIIllIllll;
    private static /* synthetic */ String[] llIIllIlllI;
    private static final /* synthetic */ int gl;

    private static void lIlIIIllIIIlIl() {
        llIIllIllll = new int[8];
        llIIllIllll[0] = (-((-1553) & 24145)) & (-514) & 32767;
        llIIllIllll[1] = (189 ^ 137) & ((58 ^ 14) ^ (-1));
        llIIllIllll[2] = (-((-3185) & 7797)) & (-1) & 16367;
        llIIllIllll[3] = (58 ^ 103) ^ (69 ^ 47);
        llIIllIllll[4] = " ".length();
        llIIllIllll[5] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        llIIllIllll[6] = 65 ^ 73;
        llIIllIllll[7] = "  ".length();
    }

    private static void lIlIIIllIIIlII() {
        llIIllIlllI = new String[llIIllIllll[4]];
        llIIllIlllI[llIIllIllll[1]] = lIlIIIllIIIIll("+BYXpYXgwnA=", "usgvn");
    }

    static {
        lIlIIIllIIIlIl();
        lIlIIIllIIIlII();
        gl = llIIllIllll[0];
        gm = llIIllIllll[2];
    }

    private static boolean lIlIIIllIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        NPC co = co();
        if ((!lIlIIIllIIIllI(co) || !lIlIIIllIIIlll(co.getAnimation(), llIIllIllll[0])) && !lIlIIIllIIIlll(aX(), llIIllIllll[2])) {
            if (lIlIIIllIIlIII(Combat.getCurrentHealth(), llIIllIllll[3]) && lIlIIIllIIlIIl(ba() ? 1 : 0)) {
                return llIIllIllll[4];
            }
            if (lIlIIIllIIlIIl(Inventory.isFull() ? 1 : 0)) {
                return llIIllIllll[1];
            }
            TileItem tileItem = (TileItem) TileItems.getAll().stream().filter((v0) -> {
                return Reachable.isInteractable(v0);
            }).max(Comparator.comparingInt(tileItem2 -> {
                if (lIlIIIllIIlIIl(tileItem2.isTradable() ? 1 : 0)) {
                    int itemPrice = Prices.getItemPrice(tileItem2.getId());
                    "".length();
                    return (((91 ^ 39) ^ (193 ^ 146)) & (((50 ^ 73) ^ (57 ^ 109)) ^ (-" ".length()))) != 0 ? ((239 ^ 194) ^ (127 ^ 86)) & (((((71 + 20) - 11) + 83) ^ (((10 + 165) - 165) + 157)) ^ (-" ".length())) : itemPrice;
                }
                return llIIllIllll[5];
            })).orElse(null);
            if (lIlIIIllIIlIlI(tileItem)) {
                return llIIllIllll[1];
            }
            tileItem.interact(llIIllIlllI[llIIllIllll[1]]);
            return llIIllIllll[4];
        }
        return llIIllIllll[1];
    }

    private static boolean lIlIIIllIIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIllIIlIlI(Object obj) {
        return obj == null;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    private static boolean lIlIIIllIIlIIl(int i) {
        return i != 0;
    }

    @Inject
    protected bE(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIIIllIIIlll(int i, int i2) {
        return i != i2;
    }

    private static String lIlIIIllIIIIll(String llllllllllllllllIIlllIllIIllllII, String llllllllllllllllIIlllIllIIlllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIllIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), llIIllIllll[6]), "DES");
            Cipher llllllllllllllllIIlllIllIIlllllI = Cipher.getInstance("DES");
            llllllllllllllllIIlllIllIIlllllI.init(llIIllIllll[7], llllllllllllllllIIlllIllIIllllll);
            return new String(llllllllllllllllIIlllIllIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIllIIllllIl) {
            llllllllllllllllIIlllIllIIllllIl.printStackTrace();
            return null;
        }
    }
}
