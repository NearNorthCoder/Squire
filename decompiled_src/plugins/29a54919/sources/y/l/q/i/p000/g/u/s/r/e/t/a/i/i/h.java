package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Casting Spell", priority = 500)
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.h  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/h.class */
public class h extends Task {
    private static /* synthetic */ String[] lIlIlllllII;
    private static /* synthetic */ int[] lIlIlllllIl;
    private final /* synthetic */ SquireAgilityPlugin w;
    private final /* synthetic */ AgilityConfig x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    private boolean x() {
        Item first;
        int i;
        SpellBook.Standard standard;
        if (lIIlIlIIIlIlll(this.w.a())) {
            return lIlIlllllIl[0];
        }
        String alchIds = this.x.alchIds();
        if (lIIlIlIIIllIlI(alchIds.isEmpty() ? 1 : 0)) {
            first = Inventory.getFirst((v0) -> {
                return v0.isNoted();
            });
            "".length();
            if ((117 ^ 113) <= ((33 ^ 14) & ((52 ^ 27) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            String[] split = alchIds.split(lIlIlllllII[lIlIlllllIl[0]]);
            int[] iArr = new int[split.length];
            int llllllllllllllllIlIlIllIlIIIIlIl = lIlIlllllIl[0];
            while (lIIlIlIIIllIll(llllllllllllllllIlIlIllIlIIIIlIl, split.length)) {
                iArr[llllllllllllllllIlIlIllIlIIIIlIl] = Integer.parseInt(split[llllllllllllllllIlIlIllIlIIIIlIl]);
                llllllllllllllllIlIlIllIlIIIIlIl++;
                "".length();
                if (" ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            first = Inventory.getFirst(iArr);
        }
        if (lIIlIlIIIlIlll(first)) {
            return lIlIlllllIl[0];
        }
        if (lIIlIlIIIlllII(Skills.getBoostedLevel(Skill.MAGIC), lIlIlllllIl[6])) {
            i = lIlIlllllIl[5];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIlIlllllIl[0];
        }
        if (lIIlIlIIIllIlI(i)) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            "".length();
            if ("   ".length() == ((238 ^ 174) & ((78 ^ 14) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        SpellBook.Standard standard2 = standard;
        if (lIIlIlIIIlIllI(Magic.canCast(standard2) ? 1 : 0)) {
            return lIlIlllllIl[0];
        }
        Magic.cast(standard2, first);
        return lIlIlllllIl[5];
    }

    private static boolean lIIlIlIIIlIlll(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIIlIIll() {
        lIlIlllllII = new String[lIlIlllllIl[5]];
        lIlIlllllII[lIlIlllllIl[0]] = lIIlIlIIIlIIlI("MitHVcKWQys=", "ashiw");
    }

    private static boolean lIIlIlIIIllIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIlIIIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIIlIllI(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIIIlllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (!lIIlIlIIIlIlIl(local) || lIIlIlIIIlIllI(local.isMoving() ? 1 : 0)) {
            return lIlIlllllIl[0];
        }
        if (lIIlIlIIIlIlll(this.w.a().k())) {
            return lIlIlllllIl[0];
        }
        if (!lIIlIlIIIllIII(local.getAnimation(), lIlIlllllIl[1]) || lIIlIlIIIllIIl(local.getAnimation(), lIlIlllllIl[2])) {
            sleep(lIlIlllllIl[3]);
        }
        return lIIlIlIIIllIlI(this.x.imbue() ? 1 : 0) ? w() : lIIlIlIIIllIlI(this.x.alch() ? 1 : 0) ? x() : lIlIlllllIl[0];
    }

    private static boolean lIIlIlIIIllIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIlIIIlIlII() {
        lIlIlllllIl = new int[8];
        lIlIlllllIl[0] = (252 ^ 160) & ((120 ^ 36) ^ (-1));
        lIlIlllllIl[1] = (-22583) & 23295;
        lIlIlllllIl[2] = (-((-16718) & 20863)) & (-9219) & 14075;
        lIlIlllllIl[3] = "   ".length();
        lIlIlllllIl[4] = (-((-4206) & 29423)) & (-2049) & 32703;
        lIlIlllllIl[5] = " ".length();
        lIlIlllllIl[6] = (36 ^ 60) ^ (34 ^ 13);
        lIlIlllllIl[7] = "  ".length();
    }

    @Inject
    public h(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.w = squireAgilityPlugin;
        this.x = agilityConfig;
    }

    static {
        lIIlIlIIIlIlII();
        lIIlIlIIIlIIll();
    }

    private static boolean lIIlIlIIIllIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIlIIIlIIlI(String llllllllllllllllIlIlIllIIlllllIl, String llllllllllllllllIlIlIllIIlllllII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIllIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllllIl[7], llllllllllllllllIlIlIllIlIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIllIIllllllI) {
            llllllllllllllllIlIlIllIIllllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean w() {
        if (lIIlIlIIIllIlI(Vars.getBit(lIlIlllllIl[4]))) {
            return lIlIlllllIl[0];
        }
        Magic.cast(SpellBook.Lunar.MAGIC_IMBUE);
        return lIlIlllllIl[5];
    }

    private static boolean lIIlIlIIIlIlIl(Object obj) {
        return obj != null;
    }
}
