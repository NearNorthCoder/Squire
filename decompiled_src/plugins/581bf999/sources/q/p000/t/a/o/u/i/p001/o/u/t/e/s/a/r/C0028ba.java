package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking mage scarab", priority = 25, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ba  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ba.class */
public class C0028ba extends AbstractC0035bh {
    private static /* synthetic */ String[] llIIlIlIlIl;
    private static /* synthetic */ int[] llIIlIlIllI;

    private static void lIlIIIIlIIIlll() {
        llIIlIlIlIl = new String[llIIlIlIllI[2]];
        llIIlIlIlIl[llIIlIlIllI[0]] = lIlIIIIlIIIlIl("AzcdGDIp", "BCiyQ");
        llIIlIlIlIl[llIIlIlIllI[1]] = lIlIIIIlIIIllI("wmf20CLvomdHeDKQv/JqxA==", "ElZKV");
    }

    private static boolean lIlIIIIlIIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIIlIIlIll(int i) {
        return i != 0;
    }

    private static String lIlIIIIlIIIllI(String llllllllllllllllIIlllllIlllIIIll, String llllllllllllllllIIlllllIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllllIlllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllllIlllIIlIl.init(llIIlIlIllI[2], secretKeySpec);
            return new String(llllllllllllllllIIlllllIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllIllIlllll) {
            llllllllllllllllIIlllllIllIlllll.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0028ba(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIlIIIIlIIlIII();
        lIlIIIIlIIIlll();
    }

    private static boolean lIlIIIIlIIllIl(int i, int i2) {
        return i < i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriMager();
    }

    private static boolean lIlIIIIlIIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIlIIllII(int i) {
        return i == 0;
    }

    private static void lIlIIIIlIIlIII() {
        llIIlIlIllI = new int[3];
        llIIlIlIllI[0] = (33 ^ 100) & ((122 ^ 63) ^ (-1));
        llIIlIlIllI[1] = " ".length();
        llIIlIlIllI[2] = "  ".length();
    }

    private static String lIlIIIIlIIIlIl(String llllllllllllllllIIlllllIllIlIIll, String llllllllllllllllIIlllllIllIIllIl) {
        String llllllllllllllllIIlllllIllIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllllIllIIllIl.toCharArray();
        int llllllllllllllllIIlllllIllIIllll = llIIlIlIllI[0];
        char[] charArray2 = llllllllllllllllIIlllllIllIlIIll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlllllIllIIIlll = llIIlIlIllI[0];
        while (lIlIIIIlIIllIl(llllllllllllllllIIlllllIllIIIlll, length)) {
            sb.append((char) (charArray2[llllllllllllllllIIlllllIllIIIlll] ^ charArray[llllllllllllllllIIlllllIllIIllll % charArray.length]));
            "".length();
            llllllllllllllllIIlllllIllIIllll++;
            llllllllllllllllIIlllllIllIIIlll++;
            "".length();
            if (((204 ^ 152) & ((62 ^ 106) ^ (-1))) >= (56 ^ 60)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIlIIIIlIIlIll(npc.getName().equals(llIIlIlIlIl[llIIlIlIllI[1]]) ? 1 : 0) && lIlIIIIlIIllII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIlIllI[1];
                "".length();
                return (((((44 + 162) - 194) + 202) ^ (((36 + 6) - (-27)) + 65)) & (((((123 + 89) - 190) + 186) ^ (((98 + 42) - 57) + 45)) ^ (-" ".length()))) > 0 ? ((((39 + 3) - (-9)) + 93) ^ (((42 + 61) - 28) + 61)) & (((47 ^ 16) ^ (97 ^ 70)) ^ (-" ".length())) : r0;
            }
            return llIIlIlIllI[0];
        });
        if (lIlIIIIlIIlIIl(nearest)) {
            return llIIlIlIllI[0];
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (lIlIIIIlIIlIlI(interacting) && lIlIIIIlIIlIll(interacting.equals(nearest) ? 1 : 0)) {
            return llIIlIlIllI[1];
        }
        bp();
        nearest.interact(llIIlIlIlIl[llIIlIlIllI[0]]);
        return llIIlIlIllI[1];
    }
}
