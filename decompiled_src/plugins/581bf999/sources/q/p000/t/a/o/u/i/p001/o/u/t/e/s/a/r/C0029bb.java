package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
@Singleton
@TaskDesc(name = "Attacking melee scarab", priority = 16, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bb  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bb.class */
public class C0029bb extends AbstractC0035bh {
    private static /* synthetic */ String[] lIlllIIIlII;
    private /* synthetic */ boolean eC;
    private static /* synthetic */ int[] lIlllIIIlll;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        if (lIIllIIIllIlIl(this.eC ? 1 : 0)) {
            ConfigStorageBox<EquipmentSetup> kephriMelee = this.cW.kephriMelee();
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
            return kephriMelee;
        }
        return this.cW.kephriRanger();
    }

    private static boolean lIIllIIIllIllI(Object obj) {
        return obj == null;
    }

    private static String lIIllIIIlIlIlI(String llllllllllllllllIlIIlllIIIllIlII, String llllllllllllllllIlIIlllIIIllIIll) {
        String llllllllllllllllIlIIlllIIIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIlllIIIllIIll.toCharArray();
        int llllllllllllllllIlIIlllIIIllIIII = lIlllIIIlll[0];
        char[] charArray2 = llllllllllllllllIlIIlllIIIllIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIIIlll[0];
        while (lIIllIIIlllIII(i, length)) {
            char llllllllllllllllIlIIlllIIIllIlIl = charArray2[i];
            sb.append((char) (llllllllllllllllIlIIlllIIIllIlIl ^ charArray[llllllllllllllllIlIIlllIIIllIIII % charArray.length]));
            "".length();
            llllllllllllllllIlIIlllIIIllIIII++;
            i++;
            "".length();
            if ((((164 ^ 185) ^ (113 ^ 46)) & (((91 ^ 77) ^ (211 ^ 135)) ^ (-" ".length()))) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllIIIlIlllI() {
        lIlllIIIlII = new String[lIlllIIIlll[5]];
        lIlllIIIlII[lIlllIIIlll[0]] = lIIllIIIlIlIIl("7lylnMmSa8B4ShhIfOQqqA==", "cXcQh");
        lIlllIIIlII[lIlllIIIlll[2]] = lIIllIIIlIlIlI("CBE8Mjoi", "IeHSY");
        lIlllIIIlII[lIlllIIIlll[3]] = lIIllIIIlIlIll("1dY8SXvfH4C+/2TRxjehrw==", "FjIqR");
        lIlllIIIlII[lIlllIIIlll[4]] = lIIllIIIlIlIIl("7k1BEgqS3riHZEBKGM0pFA==", "HIuYT");
    }

    static {
        lIIllIIIllIlII();
        lIIllIIIlIlllI();
    }

    private static boolean lIIllIIIllIlll(int i) {
        return i == 0;
    }

    private static boolean lIIllIIIlllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIIIlllIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIllIIIlIlIll(String llllllllllllllllIlIIlllIIlIIIlII, String llllllllllllllllIlIIlllIIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIlll[3], llllllllllllllllIlIIlllIIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIIlIIIlIl) {
            llllllllllllllllIlIIlllIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllIIIlIlIIl(String llllllllllllllllIlIIlllIIlIlIIIl, String llllllllllllllllIlIIlllIIlIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIlllIIIlll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIIlIlIIlI) {
            llllllllllllllllIlIIlllIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0029bb(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, null);
    }

    private static boolean lIIllIIIllIlIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIllIIIllIlIl(List.of(lIlllIIIlII[lIlllIIIlll[3]], lIlllIIIlII[lIlllIIIlll[4]]).contains(npc.getName()) ? 1 : 0) && lIIllIIIllIlll(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIlllIIIlll[2];
                "".length();
                return (((191 ^ 160) ^ (87 ^ 103)) & (((((83 + 22) - (-126)) + 2) ^ (((10 + 47) - (-110)) + 31)) ^ (-" ".length()))) > 0 ? ((((2 + 108) - 48) + 134) ^ (((95 + 127) - 86) + 17)) & (((((64 + 93) - 116) + 172) ^ (((76 + 27) - 78) + 111)) ^ (-" ".length())) : r0;
            }
            return lIlllIIIlll[0];
        });
        if (lIIllIIIllIllI(nearest)) {
            return lIlllIIIlll[0];
        }
        this.eC = nearest.getName().equals(lIlllIIIlII[lIlllIIIlll[0]]);
        if (lIIllIIIllIlll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            int i = lIlllIIIlll[0];
            int[] a = this.cV.a(br());
            int length = a.length;
            int i2 = lIlllIIIlll[0];
            while (lIIllIIIlllIII(i2, length)) {
                if (lIIllIIIlllIIl(a[i2], lIlllIIIlll[1])) {
                    i = lIlllIIIlll[2];
                }
                i2++;
                "".length();
                if ((-"  ".length()) >= 0) {
                    return ((3 ^ 85) ^ (66 ^ 26)) & (((((12 + 52) - 11) + 78) ^ (((84 + 8) - (-10)) + 39)) ^ (-" ".length()));
                }
            }
            if (lIIllIIIllIlll(i)) {
                return lIlllIIIlll[0];
            }
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (lIIllIIIlllIlI(interacting) && lIIllIIIllIlIl(interacting.equals(nearest) ? 1 : 0)) {
            return lIlllIIIlll[2];
        }
        Set<WorldPoint> bU = bU();
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (!lIIllIIIllIlll(bU.isEmpty() ? 1 : 0) || (lIIllIIIllIlll(bU.contains(worldLocation) ? 1 : 0) && !lIIllIIIllIlll(nearest.getWorldArea().isInMeleeDistance(worldLocation) ? 1 : 0))) {
            bp();
            nearest.interact(lIlllIIIlII[lIlllIIIlll[2]]);
            return lIlllIIIlll[2];
        }
        return lIlllIIIlll[2];
    }

    private static void lIIllIIIllIlII() {
        lIlllIIIlll = new int[7];
        lIlllIIIlll[0] = (162 ^ 186) & ((132 ^ 156) ^ (-1));
        lIlllIIIlll[1] = (-((-16777) & 17821)) & (-1) & 28319;
        lIlllIIIlll[2] = " ".length();
        lIlllIIIlll[3] = "  ".length();
        lIlllIIIlll[4] = "   ".length();
        lIlllIIIlll[5] = (((36 + 104) - (-32)) + 2) ^ (((64 + 129) - 177) + 154);
        lIlllIIIlll[6] = (159 ^ 189) ^ (107 ^ 65);
    }

    private static boolean lIIllIIIlllIIl(int i, int i2) {
        return i == i2;
    }
}
