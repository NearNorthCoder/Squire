package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving next to rubble", priority = 100, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aP  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aP.class */
public class aP extends aI {
    private /* synthetic */ boolean eh;
    private static final /* synthetic */ int eg;
    private static /* synthetic */ String[] llIIIllllII;
    private static /* synthetic */ int[] llIIIllllIl;

    static {
        lIIlllllIllllI();
        lIIlllllIlllIl();
        eg = llIIIllllIl[3];
    }

    private static void lIIlllllIlllIl() {
        llIIIllllII = new String[llIIIllllIl[4]];
        llIIIllllII[llIIIllllIl[0]] = lIIlllllIllIll("Oz4LLQQM", "iKiOh");
        llIIIllllII[llIIIllllIl[1]] = lIIlllllIlllII("SHmI2unj8QjguZSyM0PWT6z87HeXTGgbo/uvvI2N2zcdxH3JWtgOhw==", "fApWH");
        llIIIllllII[llIIIllllIl[2]] = lIIlllllIlllII("s7EYGgpkv4Q=", "LPiGn");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIIllllllIIIII(npcDespawned.getNpc().getName().contains(llIIIllllII[llIIIllllIl[0]]) ? 1 : 0)) {
            this.eh = llIIIllllIl[0];
        }
    }

    private static String lIIlllllIlllII(String llllllllllllllllIlIIIIlIlIIllIII, String llllllllllllllllIlIIIIlIlIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), llIIIllllIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllllIl[2], llllllllllllllllIlIIIIlIlIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlIlIIllIIl) {
            llllllllllllllllIlIIIIlIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllllIIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIllllllIIIII(chatMessage.getMessage().contains(llIIIllllII[llIIIllllIl[1]]) ? 1 : 0)) {
            this.eh = llIIIllllIl[1];
        }
    }

    private static void lIIlllllIllllI() {
        llIIIllllIl = new int[5];
        llIIIllllIl[0] = (110 ^ 86) & ((88 ^ 96) ^ (-1));
        llIIIllllIl[1] = " ".length();
        llIIIllllIl[2] = "  ".length();
        llIIIllllIl[3] = 41 ^ 33;
        llIIIllllIl[4] = "   ".length();
    }

    private static String lIIlllllIllIll(String llllllllllllllllIlIIIIlIlIIIlIII, String llllllllllllllllIlIIIIlIlIIIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIlIlIIIIllI = new StringBuilder();
        char[] llllllllllllllllIlIIIIlIlIIIIlIl = llllllllllllllllIlIIIIlIlIIIIlll.toCharArray();
        int llllllllllllllllIlIIIIlIlIIIIlII = llIIIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllllIl[0];
        while (lIIllllllIIIlI(i, length)) {
            llllllllllllllllIlIIIIlIlIIIIllI.append((char) (charArray[i] ^ llllllllllllllllIlIIIIlIlIIIIlIl[llllllllllllllllIlIIIIlIlIIIIlII % llllllllllllllllIlIIIIlIlIIIIlIl.length]));
            "".length();
            llllllllllllllllIlIIIIlIlIIIIlII++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIIIlIlIIIIllI);
    }

    private static boolean lIIlllllIlllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIllllllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllllIIIII(int i) {
        return i != 0;
    }

    @Inject
    protected aP(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(llIIIllllII[llIIIllllIl[2]]);
        });
        if (!lIIlllllIlllll(nearest) || lIIllllllIIIII(nearest.isDead() ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        if (lIIllllllIIIIl(this.eh ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        if (lIIllllllIIIII(nearest.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llIIIllllIl[1];
        }
        Movement.setDestination(nearest.getWorldArea().getCenter());
        return llIIIllllIl[1];
    }
}
