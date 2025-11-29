package m.u.a.p000.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Telekinetic room", priority = 7, blocking = true)
/* renamed from: m.u.a.-.e.s.q.t.i.r.x  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/x.class */
public class x extends w<n> {
    private static /* synthetic */ int[] lllIllIIlllI;
    private static /* synthetic */ String[] lllIllIIllIl;

    private static String lIIIllIIlllllll(String lllllllllllllllIIllIlIIIIIIIlllI, String lllllllllllllllIIllIlIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), lllIllIIlllI[5]), "DES");
            Cipher lllllllllllllllIIllIlIIIIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIIIlIIII.init(lllIllIIlllI[4], lllllllllllllllIIllIlIIIIIIlIIIl);
            return new String(lllllllllllllllIIllIlIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIIIIIllll) {
            lllllllllllllllIIllIlIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIIllllllI(String lllllllllllllllIIllIIllllllllIIl, String lllllllllllllllIIllIIlllllllllIl) {
        String lllllllllllllllIIllIIllllllllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlllllllllII = new StringBuilder();
        char[] lllllllllllllllIIllIIllllllllIll = lllllllllllllllIIllIIlllllllllIl.toCharArray();
        int lllllllllllllllIIllIIllllllllIlI = lllIllIIlllI[0];
        char[] charArray = lllllllllllllllIIllIIllllllllIIl2.toCharArray();
        int length = charArray.length;
        int i = lllIllIIlllI[0];
        while (lIIIllIlIIIIllI(i, length)) {
            char lllllllllllllllIIllIIlllllllllll = charArray[i];
            lllllllllllllllIIllIIlllllllllII.append((char) (lllllllllllllllIIllIIlllllllllll ^ lllllllllllllllIIllIIllllllllIll[lllllllllllllllIIllIIllllllllIlI % lllllllllllllllIIllIIllllllllIll.length]));
            "".length();
            lllllllllllllllIIllIIllllllllIlI++;
            i++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlllllllllII);
    }

    @Inject
    private x(n nVar, SquireMTA squireMTA) {
        super(nVar, squireMTA);
    }

    private static boolean lIIIllIlIIIIlIl(int i) {
        return i == 0;
    }

    static {
        lIIIllIlIIIIIIl();
        lIIIllIlIIIIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean M() {
        Player local = Players.getLocal();
        NPC E = ((n) this.aB).E();
        if (lIIIllIlIIIIIll(E)) {
            int[] iArr = new int[lllIllIIlllI[1]];
            iArr[lllIllIIlllI[0]] = lllIllIIlllI[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            String[] strArr = new String[lllIllIIlllI[1]];
            strArr[lllIllIIlllI[0]] = lllIllIIllIl[lllIllIIlllI[1]];
            NPC nearest2 = NPCs.getNearest(strArr);
            if (lIIIllIlIIIIlII(local.distanceTo(nearest2), local.distanceTo(nearest))) {
                Movement.walkTo(nearest2);
                "".length();
                "".length();
                if ((-" ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                Movement.walkTo(nearest);
                "".length();
            }
            return lllIllIIlllI[1];
        } else if (lIIIllIlIIIIIlI(local.isMoving() ? 1 : 0)) {
            return lllIllIIlllI[0];
        } else {
            WorldPoint G = ((n) this.aB).G();
            if (lIIIllIlIIIIIlI(E.getWorldLocation().equals(((n) this.aB).K()) ? 1 : 0)) {
                if (!lIIIllIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    E.interact(lllIllIIlllI[0]);
                    return lllIllIIlllI[1];
                }
                DialogOption[] dialogOptionArr = new DialogOption[lllIllIIlllI[3]];
                dialogOptionArr[lllIllIIlllI[0]] = DialogOption.NPC_CONTINUE;
                dialogOptionArr[lllIllIIlllI[1]] = DialogOption.CHAT_OPTION_ONE;
                dialogOptionArr[lllIllIIlllI[4]] = DialogOption.PLAIN_CONTINUE;
                Dialog.invokeDialog(dialogOptionArr);
                return lllIllIIlllI[1];
            }
            if (lIIIllIlIIIIlIl(local.getWorldLocation().equals(G) ? 1 : 0)) {
                Movement.setDestination(G);
                "".length();
                if ((-" ".length()) >= " ".length()) {
                    return ((((6 + 39) - (-51)) + 45) ^ (((25 + 142) - 12) + 35)) & (((((79 + 59) - 32) + 82) ^ (((122 + 26) - 142) + 137)) ^ (-" ".length()));
                }
            } else if (lIIIllIlIIIIlIl(E.isMoving() ? 1 : 0)) {
                Magic.cast(L(), E);
                sleep(lllIllIIlllI[4]);
            }
            return lllIllIIlllI[1];
        }
    }

    private static boolean lIIIllIlIIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIlIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIlIIIIlII(int i, int i2) {
        return i > i2;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public Spell L() {
        return SpellBook.Standard.TELEKINETIC_GRAB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.w
    public boolean a(Item item) {
        if (lIIIllIlIIIIIlI(item.getName().toLowerCase(Locale.ROOT).contains(lllIllIIllIl[lllIllIIlllI[0]]) ? 1 : 0) && lIIIllIlIIIIIlI(Stream.of((Object[]) Rune.AIR.getRuneNames()).anyMatch(str -> {
            return item.getName().toLowerCase().contains(str.toLowerCase());
        }) ? 1 : 0)) {
            ?? r0 = lllIllIIlllI[1];
            "".length();
            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIIlllI[0];
    }

    private static void lIIIllIlIIIIIII() {
        lllIllIIllIl = new String[lllIllIIlllI[4]];
        lllIllIIllIl[lllIllIIlllI[0]] = lIIIllIIllllllI("OhgpDQI=", "IlHkd");
        lllIllIIllIl[lllIllIIlllI[1]] = lIIIllIIlllllll("inFmW8CQpHvxh3kfUb9eMS8hGTAERxXa", "YrSFa");
    }

    private static void lIIIllIlIIIIIIl() {
        lllIllIIlllI = new int[6];
        lllIllIIlllI[0] = (155 ^ 147) & ((61 ^ 53) ^ (-1));
        lllIllIIlllI[1] = " ".length();
        lllIllIIlllI[2] = (-((-10251) & 11563)) & (-209) & 12275;
        lllIllIIlllI[3] = "   ".length();
        lllIllIIlllI[4] = "  ".length();
        lllIllIIlllI[5] = (19 ^ 94) ^ (40 ^ 109);
    }

    private static boolean lIIIllIlIIIIIlI(int i) {
        return i != 0;
    }
}
