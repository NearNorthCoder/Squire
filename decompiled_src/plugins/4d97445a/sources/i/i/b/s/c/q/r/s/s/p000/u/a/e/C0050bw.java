package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Dialogue Packet Abuse")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bw  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bw.class */
public class C0050bw extends Task {
    private static /* synthetic */ int[] lIIlIllI;
    private static /* synthetic */ String[] lIIlIlIl;
    private final /* synthetic */ SquireRangingGuild fZ;

    private static boolean lIIIllIlIl(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIllIlll(Object obj) {
        return obj != null;
    }

    @Inject
    public C0050bw(SquireRangingGuild squireRangingGuild) {
        this.fZ = squireRangingGuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIIllIlIl(this.fZ.cq() ? 1 : 0)) {
            return lIIlIllI[0];
        }
        int i2 = lIIlIllI[1];
        WorldPoint worldPoint = new WorldPoint(lIIlIllI[2], lIIlIllI[3], lIIlIllI[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIlIllI[4]];
        dialogOptionArr[lIIlIllI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIlIllI[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIlIllI[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIlIllI[7]] = DialogOption.NPC_CONTINUE;
        a(i2, worldPoint, dialogOptionArr);
        return lIIlIllI[5];
    }

    private static boolean lIIIllIllI(int i2) {
        return i2 != 0;
    }

    private static String lIIIllIIlI(String lllIIIIllllIlIl, String lllIIIIllllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIIllllIlll = Cipher.getInstance("Blowfish");
            lllIIIIllllIlll.init(lIIlIllI[6], secretKeySpec);
            return new String(lllIIIIllllIlll.doFinal(Base64.getDecoder().decode(lllIIIIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIllllIIIl) {
            lllIIIIllllIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIlII();
        lIIIllIIll();
    }

    private static void lIIIllIIll() {
        lIIlIlIl = new String[lIIlIllI[5]];
        lIIlIlIl[lIIlIllI[0]] = lIIIllIIlI("wJEr6W4Ub3U=", "IjJeV");
    }

    private void a(int i2, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIIIllIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIlIllI[5]];
        iArr[lIIlIllI[0]] = i2;
        NPC nearest = NPCs.getNearest(iArr);
        if (lIIIllIlll(nearest) && lIIIllIllI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            nearest.interact(lIIlIlIl[lIIlIllI[0]]);
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
            return;
        }
        System.out.println("Walking to NPC: " + i2 + " at " + worldPoint);
        Movement.walkTo(worldPoint);
        "".length();
        sleep(lIIlIllI[6]);
    }

    private static void lIIIllIlII() {
        lIIlIllI = new int[8];
        lIIlIllI[0] = ((((153 + 141) - 221) + 117) ^ (((94 + 14) - 47) + 70)) & (((80 ^ 104) ^ (95 ^ 90)) ^ (-" ".length()));
        lIIlIllI[1] = (-((-18029) & 26222)) & (-18441) & 32703;
        lIIlIllI[2] = (-5265) & 7934;
        lIIlIllI[3] = (-4230) & 7647;
        lIIlIllI[4] = 58 ^ 62;
        lIIlIllI[5] = " ".length();
        lIIlIllI[6] = "  ".length();
        lIIlIllI[7] = "   ".length();
    }
}
