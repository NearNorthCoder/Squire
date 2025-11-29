package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Hunt Cat")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.az  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/az.class */
public class C0026az extends Task {
    private static /* synthetic */ String[] lIIIlII;
    private static /* synthetic */ int[] lIIIlIl;
    private final /* synthetic */ SquireKittenConfig dM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lIIIlIlII(this.dM.huntSpice() ? 1 : 0) && !lIIIlIlIl(Inventory.isFull() ? 1 : 0)) {
            TileItem nearest = TileItems.getNearest(tileItem -> {
                if (lIIIlIlII(tileItem.getName().contains(lIIIlII[lIIIlIl[4]]) ? 1 : 0) && lIIIlIlIl(tileItem.getName().contains(this.dM.spiceType().ax()) ? 1 : 0)) {
                    ?? r0 = lIIIlIl[1];
                    "".length();
                    return (((((60 + 41) - (-4)) + 38) ^ (((99 + 60) - 42) + 61)) & (((205 ^ 167) ^ (35 ^ 116)) ^ (-" ".length()))) != 0 ? ((143 ^ 131) ^ (186 ^ 153)) & (((((166 + 11) - 130) + 128) ^ (((122 + 76) - 76) + 6)) ^ (-" ".length())) : r0;
                }
                return lIIIlIl[0];
            });
            if (lIIIlIllI(nearest)) {
                nearest.interact(lIIIlII[lIIIlIl[0]]);
                return lIIIlIl[1];
            }
            NPC nearest2 = NPCs.getNearest(npc -> {
                if ((!lIIIlIlII(npc.getName().toLowerCase().contains(lIIIlII[lIIIlIl[2]]) ? 1 : 0) || lIIIlIlIl(npc.getName().toLowerCase().contains(lIIIlII[lIIIlIl[3]]) ? 1 : 0)) && lIIIllIII(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIIlIl[1];
                    "".length();
                    return (146 ^ 150) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIIlIl[0];
            });
            if (lIIIlIlll(nearest2)) {
                return lIIIlIl[0];
            }
            nearest2.interact(lIIIlII[lIIIlIl[1]]);
            return lIIIlIl[1];
        }
        return lIIIlIl[0];
    }

    private static String lIIIIlllI(String llllIIIllIlIIII, String llllIIIllIIllll) {
        String str = new String(Base64.getDecoder().decode(llllIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIIIllIIllIl = llllIIIllIIllll.toCharArray();
        int llllIIIllIIllII = lIIIlIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllIIIllIIIlII = lIIIlIl[0];
        while (lIIIllIIl(llllIIIllIIIlII, length)) {
            char llllIIIllIlIIIl = charArray[llllIIIllIIIlII];
            sb.append((char) (llllIIIllIlIIIl ^ llllIIIllIIllIl[llllIIIllIIllII % llllIIIllIIllIl.length]));
            "".length();
            llllIIIllIIllII++;
            llllIIIllIIIlII++;
            "".length();
            if ((-((109 ^ 99) ^ (103 ^ 108))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIIlI() {
        lIIIlII = new String[lIIIlIl[5]];
        lIIIlII[lIIIlIl[0]] = lIIIIlllI("ATARDg==", "UQzkE");
        lIIIlII[lIIIlIl[1]] = lIIIIllll("TElhLviKwBM=", "NFQCC");
        lIIIlII[lIIIlIl[2]] = lIIIIlllI("PTghPAo4", "VQUHo");
        lIIIlII[lIIIlIl[3]] = lIIIlIIII("z7wgnuPuFSw=", "tAfVo");
        lIIIlII[lIIIlIl[4]] = lIIIIllll("/VLR0R9UTTI=", "EMPWA");
    }

    @Inject
    public C0026az(SquireKittenConfig squireKittenConfig) {
        this.dM = squireKittenConfig;
    }

    static {
        lIIIlIIll();
        lIIIlIIlI();
    }

    private static void lIIIlIIll() {
        lIIIlIl = new int[7];
        lIIIlIl[0] = ((62 ^ 47) ^ (216 ^ 146)) & (((64 ^ 56) ^ (24 ^ 59)) ^ (-" ".length()));
        lIIIlIl[1] = " ".length();
        lIIIlIl[2] = "  ".length();
        lIIIlIl[3] = "   ".length();
        lIIIlIl[4] = (91 ^ 23) ^ (67 ^ 11);
        lIIIlIl[5] = (((73 + 43) - 33) + 74) ^ (((75 + 144) - 145) + 78);
        lIIIlIl[6] = (34 ^ 43) ^ " ".length();
    }

    private static boolean lIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIlII(int i2) {
        return i2 == 0;
    }

    private static String lIIIIllll(String llllIIIlllIIIII, String llllIIIllIlllll) {
        try {
            SecretKeySpec llllIIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIllIlllll.getBytes(StandardCharsets.UTF_8)), lIIIlIl[6]), "DES");
            Cipher llllIIIlllIIIlI = Cipher.getInstance("DES");
            llllIIIlllIIIlI.init(lIIIlIl[2], llllIIIlllIIIll);
            return new String(llllIIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIlllIIIIl) {
            llllIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIII(String llllIIIlIlllIIl, String llllIIIlIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIlIllllIl = Cipher.getInstance("Blowfish");
            llllIIIlIllllIl.init(lIIIlIl[2], secretKeySpec);
            return new String(llllIIIlIllllIl.doFinal(Base64.getDecoder().decode(llllIIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIlIllllII) {
            llllIIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIlIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIIlIlll(Object obj) {
        return obj == null;
    }
}
