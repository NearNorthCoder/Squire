package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging volatile baboon", priority = 100, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aX  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aX.class */
public class aX extends aT {
    private static /* synthetic */ String[] llIllIIIlII;
    private static /* synthetic */ int[] llIllIIIlIl;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String lIlIlIIIllIlII(String llllllllllllllllIIlIllllIllIllIl, String llllllllllllllllIIlIllllIllIllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllllIllIlIll = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIllllIllIllII.toCharArray();
        int llllllllllllllllIIlIllllIllIlIIl = llIllIIIlIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlIllllIllIIIIl = llIllIIIlIl[1];
        while (lIlIlIIIllllll(llllllllllllllllIIlIllllIllIIIIl, length)) {
            llllllllllllllllIIlIllllIllIlIll.append((char) (charArray2[llllllllllllllllIIlIllllIllIIIIl] ^ charArray[llllllllllllllllIIlIllllIllIlIIl % charArray.length]));
            "".length();
            llllllllllllllllIIlIllllIllIlIIl++;
            llllllllllllllllIIlIllllIllIIIIl++;
            "".length();
            if ((-" ".length()) > ((161 ^ 156) & ((11 ^ 54) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIllllIllIlIll);
    }

    private static boolean lIlIlIIIlllIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlIIIllIlll() {
        llIllIIIlII = new String[llIllIIIlIl[3]];
        llIllIIIlII[llIllIIIlIl[1]] = lIlIlIIIllIlII("GDgIIz0nOwFiCy81Cy0n", "NWdBI");
        llIllIIIlII[llIllIIIlIl[0]] = lIlIlIIIllIlIl("Y9XaqU/ezNlfpYCoY8DfWSZb3NET963D/+1NcPH9nffpQpGrYhZSrg==", "KCpcc");
        llIllIIIlII[llIllIIIlIl[5]] = lIlIlIIIllIllI("S7itfBKJt82ZOpm0kxMZnQ==", "jZyPx");
    }

    private static boolean lIlIlIIIllllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlIIIllIlIl(String llllllllllllllllIIlIlllllIIIlIlI, String llllllllllllllllIIlIlllllIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), llIllIIIlIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIIIlIl[5], llllllllllllllllIIlIlllllIIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlllllIIIlIll) {
            llllllllllllllllIIlIlllllIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aT
    public boolean bC() {
        String[] strArr = new String[llIllIIIlIl[0]];
        strArr[llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIlIlIIIlllIIl(nearest) && !lIlIlIIIlllIlI(nearest.getAnimation(), llIllIIIlIl[2])) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (lIlIlIIIlllIll(worldLocation.distanceTo(nearest), llIllIIIlIl[3])) {
                return llIllIIIlIl[1];
            }
            WorldPoint worldPoint = (WorldPoint) worldLocation.toWorldArea().offset(llIllIIIlIl[4]).toWorldPointList().stream().filter(worldPoint2 -> {
                String[] strArr2 = new String[llIllIIIlIl[0]];
                strArr2[llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[5]];
                return NPCs.getAll(strArr2).stream().filter(npc -> {
                    if (lIlIlIIIlllllI(npc.getAnimation(), llIllIIIlIl[2])) {
                        ?? r0 = llIllIIIlIl[0];
                        "".length();
                        return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIllIIIlIl[1];
                }).noneMatch(npc2 -> {
                    if (lIlIlIIIllllIl(npc2.getWorldLocation().distanceTo(worldPoint2), llIllIIIlIl[5])) {
                        ?? r0 = llIllIIIlIl[0];
                        "".length();
                        return "  ".length() == 0 ? ((98 ^ 14) ^ (26 ^ 122)) & (((90 ^ 97) ^ (8 ^ 63)) ^ (-" ".length())) : r0;
                    }
                    return llIllIIIlIl[1];
                });
            }).filter(worldPoint3 -> {
                if (lIlIlIIIllllII(p(worldPoint3) ? 1 : 0)) {
                    ?? r0 = llIllIIIlIl[0];
                    "".length();
                    return (-"  ".length()) > 0 ? ((((35 + 66) - 88) + 158) ^ (((143 + 4) - 58) + 73)) & (((((35 + 52) - 71) + 127) ^ (((89 + 85) - 169) + 129)) ^ (-" ".length())) & ((((58 ^ 119) ^ (115 ^ 11)) & (((((51 + 146) - 145) + 111) ^ (((115 + 87) - 178) + 126)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                }
                return llIllIIIlIl[1];
            }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.distanceTo(worldLocation);
            })).orElse(null);
            if (lIlIlIIIlllIIl(worldPoint)) {
                Log.info(llIllIIIlII[llIllIIIlIl[0]]);
                return llIllIIIlIl[1];
            }
            g(worldPoint);
            return llIllIIIlIl[0];
        }
        return llIllIIIlIl[1];
    }

    private static boolean lIlIlIIIlllIll(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected aX(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIlIIIllllll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIIIlllIII() {
        llIllIIIlIl = new int[7];
        llIllIIIlIl[0] = " ".length();
        llIllIIIlIl[1] = ((((1 + 17) - (-85)) + 57) ^ (((101 + 1) - 63) + 98)) & (((135 ^ 173) ^ "   ".length()) ^ (-" ".length()));
        llIllIIIlIl[2] = -" ".length();
        llIllIIIlIl[3] = "   ".length();
        llIllIIIlIl[4] = (72 ^ 110) ^ (17 ^ 50);
        llIllIIIlIl[5] = "  ".length();
        llIllIIIlIl[6] = 176 ^ 184;
    }

    private static String lIlIlIIIllIllI(String llllllllllllllllIIlIllllIlllllIl, String llllllllllllllllIIlIllllIlllllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIIIlIl[5], llllllllllllllllIIlIlllllIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllllIllllllI) {
            llllllllllllllllIIlIllllIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllllII(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIIlllllI(int i, int i2) {
        return i != i2;
    }

    static {
        lIlIlIIIlllIII();
        lIlIlIIIllIlll();
    }
}
