package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Cancelling attacking bandit/thug", priority = 8, blocking = true, register = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.m  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/m.class */
public class m extends Task {
    private /* synthetic */ boolean M;
    private static /* synthetic */ String[] lIIlllIIIllll;
    private final /* synthetic */ SquireThievingConfig L;
    private static /* synthetic */ int[] lIIlllIIlIIII;

    private static boolean lIllIIlIllIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!lIllIIlIllIlllI(hitsplat.getAmount(), lIIlllIIlIIII[3]) || lIllIIlIllIllll(hitsplat.getAmount(), lIIlllIIlIIII[4]) || lIllIIlIllIllIl(hitsplatApplied.getActor() instanceof NPC ? 1 : 0) || lIllIIlIllIlIlI(hitsplatApplied.getActor(), Players.getLocal())) {
            return;
        }
        this.M = lIIlllIIlIIII[1];
    }

    private static boolean lIllIIlIllIllll(int i, int i2) {
        return i == i2;
    }

    private static void lIllIIlIllIlIIl() {
        lIIlllIIlIIII = new int[6];
        lIIlllIIlIIII[0] = (85 ^ 94) & ((40 ^ 35) ^ (-1));
        lIIlllIIlIIII[1] = " ".length();
        lIIlllIIlIIII[2] = "  ".length();
        lIIlllIIlIIII[3] = 24 ^ 28;
        lIIlllIIlIIII[4] = 170 ^ 175;
        lIIlllIIlIIII[5] = "   ".length();
    }

    private static boolean lIllIIlIllIlIll(int i) {
        return i == 0;
    }

    private static String lIllIIlIllIIlll(String llllllllllllllIlllIllIIIIlllIIll, String llllllllllllllIlllIllIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIIlllIlII) {
            llllllllllllllIlllIllIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlllIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIlIllIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[3]];
        lIIlllIIIllll[lIIlllIIlIIII[0]] = lIllIIlIllIIllI("FjMSLCYpORoiIg==", "FZqGV");
        lIIlllIIIllll[lIIlllIIlIIII[1]] = lIllIIlIllIIllI("FwcUPzoUUgU5ORETEg==", "srfVT");
        lIIlllIIIllll[lIIlllIIlIIII[2]] = lIllIIlIllIIlll("USo6DEHm6MVjrxl4kUsCTQ==", "pvilZ");
        lIIlllIIIllll[lIIlllIIlIIII[5]] = lIllIIlIllIIllI("CSICKwAj", "HVvJc");
    }

    private static boolean lIllIIlIllIllII(Object obj) {
        return obj == null;
    }

    static {
        lIllIIlIllIlIIl();
        lIllIIlIllIlIII();
    }

    private static boolean lIllIIlIllIlllI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIllIlIlI(this.L.method(), EnumC0001b.BLACK_JACK) && !lIllIIlIllIlIll(this.M ? 1 : 0)) {
            Player local = Players.getLocal();
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIllIIlIlllIIII(npc.getInteracting(), local)) {
                    String str = lIIlllIIIllll[lIIlllIIlIIII[5]];
                    if (lIllIIlIllIllIl(npc.hasAction((v1) -> {
                        return r1.equals(v1);
                    }) ? 1 : 0)) {
                        ?? r0 = lIIlllIIlIIII[1];
                        "".length();
                        return (-" ".length()) != (-" ".length()) ? ((((93 + 5) - 12) + 71) ^ (((92 + 104) - 69) + 1)) & (((201 ^ 183) ^ (78 ^ 45)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIlllIIlIIII[0];
            });
            if (lIllIIlIllIllII(nearest)) {
                this.M = lIIlllIIlIIII[0];
                return lIIlllIIlIIII[1];
            }
            nearest.interact(lIIlllIIIllll[lIIlllIIlIIII[0]]);
            return lIIlllIIlIIII[1];
        }
        return lIIlllIIlIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (lIllIIlIllIlIlI(this.L.method(), EnumC0001b.BLACK_JACK)) {
            return;
        }
        if (lIllIIlIllIlIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllIIlIllIlIlI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (!lIllIIlIllIlIll(message.contains(lIIlllIIIllll[lIIlllIIlIIII[1]]) ? 1 : 0) || lIllIIlIllIllIl(message.contains(lIIlllIIIllll[lIIlllIIlIIII[2]]) ? 1 : 0)) {
            this.M = lIIlllIIlIIII[1];
        }
    }

    private static boolean lIllIIlIlllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIIlIllIIllI(String llllllllllllllIlllIllIIIlIIIlIII, String llllllllllllllIlllIllIIIlIIIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlIIIIlIl = llllllllllllllIlllIllIIIlIIIIlll.toCharArray();
        int llllllllllllllIlllIllIIIlIIIIlII = lIIlllIIlIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIlIIII[0];
        while (lIllIIlIlllIIIl(i, length)) {
            char llllllllllllllIlllIllIIIlIIIlIIl = charArray[i];
            sb.append((char) (llllllllllllllIlllIllIIIlIIIlIIl ^ llllllllllllllIlllIllIIIlIIIIlIl[llllllllllllllIlllIllIIIlIIIIlII % llllllllllllllIlllIllIIIlIIIIlIl.length]));
            "".length();
            llllllllllllllIlllIllIIIlIIIIlII++;
            i++;
            "".length();
            if ((-(155 ^ 158)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public m(SquireThievingConfig squireThievingConfig) {
        this.L = squireThievingConfig;
    }

    private static boolean lIllIIlIllIllIl(int i) {
        return i != 0;
    }
}
