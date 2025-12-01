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
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Attacking Baboons", priority = 10, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aM  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aM.class */
public class aM extends aI {
    private static /* synthetic */ String[] llIIlIllIlI;
    private static /* synthetic */ int[] llIIlIllIll;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIIIllIIIll(chatMessage.getMessage().contains(llIIlIllIlI[llIIlIllIll[2]]) ? 1 : 0)) {
            sleep(llIIlIllIll[3]);
        }
    }

    private static String lIlIIIIlIllllI(String llllllllllllllllIIlllllIIlIIIlll, String llllllllllllllllIIlllllIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllllIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllllIIlIIlIIl.init(llIIlIllIll[4], secretKeySpec);
            return new String(llllllllllllllllIIlllllIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllIIlIIlIII) {
            llllllllllllllllIIlllllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIIllIIIlI();
        lIlIIIIllIIIIl();
    }

    private static boolean lIlIIIIllIIlll(int i) {
        return i == 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.babaBaboonAttackStyle();
    }

    private static boolean lIlIIIIllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIllIIIll(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIllIIllI(int i, int i2) {
        return i > i2;
    }

    private static String lIlIIIIllIIIII(String llllllllllllllllIIlllllIIIlllIlI, String llllllllllllllllIIlllllIIIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), llIIlIllIll[1]), "DES");
            Cipher llllllllllllllllIIlllllIIIllllII = Cipher.getInstance("DES");
            llllllllllllllllIIlllllIIIllllII.init(llIIlIllIll[4], secretKeySpec);
            return new String(llllllllllllllllIIlllllIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllIIIllIllI) {
            llllllllllllllllIIlllllIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIlIlllll(String llllllllllllllllIIlllllIIIlIlIlI, String llllllllllllllllIIlllllIIIlIlIIl) {
        String llllllllllllllllIIlllllIIIlIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllllIIIlIlIII = new StringBuilder();
        char[] llllllllllllllllIIlllllIIIlIIlll = llllllllllllllllIIlllllIIIlIlIIl.toCharArray();
        int llllllllllllllllIIlllllIIIlIIllI = llIIlIllIll[0];
        char[] charArray = llllllllllllllllIIlllllIIIlIlIlI2.toCharArray();
        int length = charArray.length;
        int i = llIIlIllIll[0];
        while (lIlIIIIllIlIII(i, length)) {
            char llllllllllllllllIIlllllIIIlIlIll = charArray[i];
            llllllllllllllllIIlllllIIIlIlIII.append((char) (llllllllllllllllIIlllllIIIlIlIll ^ llllllllllllllllIIlllllIIIlIIlll[llllllllllllllllIIlllllIIIlIIllI % llllllllllllllllIIlllllIIIlIIlll.length]));
            "".length();
            llllllllllllllllIIlllllIIIlIIllI++;
            i++;
            "".length();
            if ("  ".length() < ((121 ^ 67) & ((107 ^ 81) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllllIIIlIlIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        if (lIlIIIIllIIIll(this.cW.redX() ? 1 : 0)) {
            return llIIlIllIll[0];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIlIIIIllIIIll(npc.getName().equals(llIIlIllIlI[llIIlIllIll[5]]) ? 1 : 0) && lIlIIIIllIIlll(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIllIll[2];
                "".length();
                return (((((139 + 157) - 69) + 28) ^ (((77 + 30) - 10) + 78)) & (((((98 + 80) - (-35)) + 10) ^ (((6 + 139) - 61) + 59)) ^ (-" ".length()))) == " ".length() ? ((236 ^ 169) ^ (212 ^ 136)) & (((229 ^ 155) ^ (113 ^ 22)) ^ (-" ".length())) : r0;
            }
            return llIIlIllIll[0];
        });
        if (lIlIIIIllIIlII(nearest)) {
            return llIIlIllIll[0];
        }
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            return npc2.getName().contains(llIIlIllIlI[llIIlIllIll[4]]);
        });
        if (lIlIIIIllIIlIl(nearest2) && lIlIIIIllIIllI(nearest.distanceTo(nearest2), llIIlIllIll[1])) {
            return llIIlIllIll[0];
        }
        bp();
        nearest.interact(llIIlIllIlI[llIIlIllIll[0]]);
        return llIIlIllIll[2];
    }

    @Inject
    protected aM(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIlIIIIllIIIlI() {
        llIIlIllIll = new int[7];
        llIIlIllIll[0] = (18 ^ 40) & ((60 ^ 6) ^ (-1));
        llIIlIllIll[1] = 191 ^ 183;
        llIIlIllIll[2] = " ".length();
        llIIlIllIll[3] = 96 ^ 101;
        llIIlIllIll[4] = "  ".length();
        llIIlIllIll[5] = "   ".length();
        llIIlIllIll[6] = (((124 + 98) - 144) + 70) ^ (((31 + 3) - 27) + 137);
    }

    private static void lIlIIIIllIIIIl() {
        llIIlIllIlI = new String[llIIlIllIll[6]];
        llIIlIllIlI[llIIlIllIll[0]] = lIlIIIIlIllllI("ii5X9KnI3o8=", "gfDAr");
        llIIlIllIlI[llIIlIllIll[2]] = lIlIIIIlIlllll("CyxUOARpOREICj4+WRtFJSwLHQBpLxYPCS0oC1oEPW0AFRA=", "IMyze");
        llIIlIllIlI[llIIlIllIll[4]] = lIlIIIIllIIIII("d9bygSEDhp0=", "fnlKm");
        llIIlIllIlI[llIIlIllIll[5]] = lIlIIIIlIlllll("BCo1NQgo", "FKWZg");
    }
}
