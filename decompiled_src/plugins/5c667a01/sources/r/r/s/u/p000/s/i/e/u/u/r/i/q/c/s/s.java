package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "High Alching loot", priority = 60000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.s  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/s.class */
public class s extends Task {
    private static /* synthetic */ String[] lIIlIlIlllIII;
    private static /* synthetic */ int[] lIIlIlIlllIIl;
    private final /* synthetic */ SquireScurriusConfig ad;
    private final /* synthetic */ SquireScurrius ac;

    private static String lIlIllIIIllIIll(String llllllllllllllIllllIllIIllIllIIl, String llllllllllllllIllllIllIIllIllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIIllIllIll.init(lIIlIlIlllIIl[1], llllllllllllllIllllIllIIllIlllII);
            return new String(llllllllllllllIllllIllIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIllIllIlI) {
            llllllllllllllIllllIllIIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIlllIIl(Object obj) {
        return obj == null;
    }

    private static void lIlIllIIIllIlIl() {
        lIIlIlIlllIII = new String[lIIlIlIlllIIl[1]];
        lIIlIlIlllIII[lIIlIlIlllIIl[0]] = lIlIllIIIllIIll("RPLHF1aDweXyZbAKZsVaYw==", "PofWD");
        lIIlIlIlllIII[lIIlIlIlllIIl[2]] = lIlIllIIIllIlII("pZ1RCWNMBHjZbKOyf3tvsw==", "uicmv");
    }

    private static boolean lIlIllIIIllIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIIlllIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public boolean run() {
        if (!lIlIllIIIllIlll(this.ad.highAlch() ? 1 : 0) && !lIlIllIIIllIlll(this.ac.c() ? 1 : 0)) {
            String[] strArr = new String[lIIlIlIlllIIl[1]];
            strArr[lIIlIlIlllIIl[0]] = lIIlIlIlllIII[lIIlIlIlllIIl[0]];
            strArr[lIIlIlIlllIIl[2]] = lIIlIlIlllIII[lIIlIlIlllIIl[2]];
            if (lIlIllIIIlllIII(NPCs.getNearest(strArr))) {
                return lIIlIlIlllIIl[0];
            }
            Item first = Inventory.getFirst(item -> {
                return d.x.contains(item.getName());
            });
            if (lIlIllIIIlllIIl(first)) {
                return lIIlIlIlllIIl[0];
            }
            SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            if (lIlIllIIIllIlll(standard.canCast() ? 1 : 0)) {
                return lIIlIlIlllIIl[0];
            }
            Magic.cast(standard);
            first.interact(lIIlIlIlllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first.getSlot(), WidgetInfo.INVENTORY.getId());
            return lIIlIlIlllIIl[2];
        }
        return lIIlIlIlllIIl[0];
    }

    private static boolean lIlIllIIIlllIll(int i, int i2) {
        return i == i2;
    }

    private static String lIlIllIIIllIlII(String llllllllllllllIllllIllIIlllIIllI, String llllllllllllllIllllIllIIlllIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlllIIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlIlllIIl[1], llllllllllllllIllllIllIIlllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIlllIIlll) {
            llllllllllllllIllllIllIIlllIIlll.printStackTrace();
            return null;
        }
    }

    private List<Prayer> x() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Prayers.getOffensive());
        "".length();
        int[] iArr = new int[lIIlIlIlllIIl[1]];
        iArr[lIIlIlIlllIIl[0]] = d.C;
        iArr[lIIlIlIlllIIl[2]] = d.D;
        Projectile nearest = Projectiles.getNearest(iArr);
        if (!lIlIllIIIlllIII(nearest) || !lIlIllIIIlllIlI(nearest.getRemainingCycles(), lIIlIlIlllIIl[3])) {
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        } else if (lIlIllIIIlllIll(nearest.getId(), d.C)) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    @Inject
    public s(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ac = squireScurrius;
        this.ad = squireScurriusConfig;
    }

    private static boolean lIlIllIIIlllIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lIlIllIIIllIllI() {
        lIIlIlIlllIIl = new int[5];
        lIIlIlIlllIIl[0] = (37 ^ 28) & ((82 ^ 107) ^ (-1));
        lIIlIlIlllIIl[1] = "  ".length();
        lIIlIlIlllIIl[2] = " ".length();
        lIIlIlIlllIIl[3] = 51 ^ 30;
        lIIlIlIlllIIl[4] = (((70 + 12) - 45) + 135) ^ (((78 + 158) - 161) + 89);
    }

    static {
        lIlIllIIIllIllI();
        lIlIllIIIllIlIl();
    }
}
