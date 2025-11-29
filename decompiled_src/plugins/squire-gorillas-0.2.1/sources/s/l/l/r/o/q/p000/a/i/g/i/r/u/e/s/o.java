package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@Singleton
@TaskDesc(name = "Attacking Gorilla", priority = 50)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.o  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/o.class */
public class o extends Task {
    private static final /* synthetic */ int Z;
    private static /* synthetic */ String[] llIIllIIIIll;
    private static /* synthetic */ int[] llIIllIIIlII;
    private static final /* synthetic */ RectangularArea Y;

    private static void lllllIllllllIl() {
        llIIllIIIIll = new String[llIIllIIIlII[11]];
        llIIllIIIIll[llIIllIIIlII[1]] = lllllIlllllIlI("u/KgHtXnfWyAnBaHtDOOPW9Gu60hYKL11o9JuGxybYjoc2Yvonl9tQ==", "cMNpC");
        llIIllIIIIll[llIIllIIIlII[3]] = lllllIlllllIlI("2llb1ViRmkwZOuT448MFjYHvYgB+DdRWYJm64450Nb4JNTwR4vsn3g==", "WFYcX");
        llIIllIIIIll[llIIllIIIlII[4]] = lllllIlllllIll("OywJAxwMbQEEHRxtBk0UFz8OAR8ZbRMCUxk5EwwQEw==", "xMgms");
        llIIllIIIIll[llIIllIIIlII[2]] = lllllIllllllII("Lg53t6uLmJM=", "JlARK");
        llIIllIIIIll[llIIllIIIlII[5]] = lllllIllllllII("BKqxvPLHgSk=", "oGwjD");
        llIIllIIIIll[llIIllIIIlII[6]] = lllllIlllllIll("GQgzBjo/AiVSKCIVKB4jLA==", "MgArO");
    }

    private static String lllllIlllllIll(String lllllllllllllllIlIIlllIIlIllllll, String lllllllllllllllIlIIlllIIlIlllllI) {
        String lllllllllllllllIlIIlllIIlIllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIlllIIlIllllII = lllllllllllllllIlIIlllIIlIlllllI.toCharArray();
        int lllllllllllllllIlIIlllIIlIlllIll = llIIllIIIlII[1];
        char[] charArray = lllllllllllllllIlIIlllIIlIllllll2.toCharArray();
        int length = charArray.length;
        int i = llIIllIIIlII[1];
        while (llllllIIIIIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIlllIIlIllllII[lllllllllllllllIlIIlllIIlIlllIll % lllllllllllllllIlIIlllIIlIllllII.length]));
            "".length();
            lllllllllllllllIlIIlllIIlIlllIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllllIIIIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIIIIIIl(Object obj) {
        return obj != null;
    }

    private static String lllllIlllllIlI(String lllllllllllllllIlIIlllIIlIlIlIlI, String lllllllllllllllIlIIlllIIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIIlIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIIlIlIllII.init(llIIllIIIlII[4], lllllllllllllllIlIIlllIIlIlIllIl);
            return new String(lllllllllllllllIlIIlllIIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIIlIlIlIll) {
            lllllllllllllllIlIIlllIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static void lllllIlllllllI() {
        llIIllIIIlII = new int[13];
        llIIllIIIlII[0] = (-((-10577) & 32215)) & (-2082) & 31999;
        llIIllIIIlII[1] = (97 ^ 74) & ((79 ^ 100) ^ (-1));
        llIIllIIIlII[2] = "   ".length();
        llIIllIIIlII[3] = " ".length();
        llIIllIIIlII[4] = "  ".length();
        llIIllIIIlII[5] = 83 ^ 87;
        llIIllIIIlII[6] = (((40 + 112) - 36) + 42) ^ (((132 + 65) - 49) + 7);
        llIIllIIIlII[7] = (-((-2563) & 20183)) & (-8449) & 28157;
        llIIllIIIlII[8] = (-82) & 5717;
        llIIllIIIlII[9] = (-30259) & 32383;
        llIIllIIIlII[10] = (-((-1070) & 11503)) & (-285) & 16383;
        llIIllIIIlII[11] = 55 ^ 49;
        llIIllIIIlII[12] = (107 ^ 120) ^ (8 ^ 19);
    }

    static {
        lllllIlllllllI();
        lllllIllllllIl();
        Z = llIIllIIIlII[0];
        Y = new RectangularArea(llIIllIIIlII[7], llIIllIIIlII[8], llIIllIIIlII[9], llIIllIIIlII[10], llIIllIIIlII[1]);
    }

    private static boolean llllllIIIIIIll(int i, int i2) {
        return i < i2;
    }

    private static String lllllIllllllII(String lllllllllllllllIlIIlllIIllIIllll, String lllllllllllllllIlIIlllIIllIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), llIIllIIIlII[12]), "DES");
            Cipher lllllllllllllllIlIIlllIIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllIIllIlIIIl.init(llIIllIIIlII[4], lllllllllllllllIlIIlllIIllIlIIlI);
            return new String(lllllllllllllllIlIIlllIIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIIllIlIIII) {
            lllllllllllllllIlIIlllIIllIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIIIII(int i) {
        return i != 0;
    }

    private static boolean llllllIIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllIllllllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    public boolean run() {
        if (lllllIllllllll(Locations.isRegionLoaded(llIIllIIIlII[0]) ? 1 : 0)) {
            return llIIllIIIlII[1];
        }
        if (lllllIllllllll(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllllIIIIIIII(N() ? 1 : 0)) {
            String str = llIIllIIIIll[llIIllIIIlII[1]];
            Object[] objArr = new Object[llIIllIIIlII[2]];
            objArr[llIIllIIIlII[1]] = Boolean.valueOf(Y.contains(Players.getLocal().getWorldLocation()));
            objArr[llIIllIIIlII[3]] = Boolean.valueOf(N());
            objArr[llIIllIIIlII[4]] = Players.getLocal().getWorldLocation();
            Log.info(str, objArr);
            Movement.setDestination(Y.getCenter());
            return llIIllIIIlII[3];
        }
        Player local = Players.getLocal();
        if (llllllIIIIIIIl(NPCs.getNearest(npc -> {
            if (llllllIIIIIIII(npc.getName().equals(llIIllIIIIll[llIIllIIIlII[6]]) ? 1 : 0) && llllllIIIIIlIl(npc.getInteracting(), local)) {
                ?? r0 = llIIllIIIlII[3];
                "".length();
                return " ".length() > " ".length() ? ((18 ^ 81) ^ (37 ^ 71)) & (((((108 + 103) - 78) + 37) ^ (((46 + 23) - 14) + 84)) ^ (-" ".length())) : r0;
            }
            return llIIllIIIlII[1];
        }))) {
            Log.info(llIIllIIIIll[llIIllIIIlII[3]]);
            Movement.setDestination(new WorldPoint(Y.getMinX(), Y.getMinY(), llIIllIIIlII[1]));
            return llIIllIIIlII[3];
        }
        NPC nearest = NPCs.getNearest(npc2 -> {
            if (llllllIIIIIlIl(npc2.getInteracting(), Players.getLocal()) && llllllIIIIIIII(Y.contains(npc2) ? 1 : 0) && llllllIIIIIIII(SquireGorillaPlugin.a(npc2.getId()) ? 1 : 0)) {
                ?? r0 = llIIllIIIlII[3];
                "".length();
                return (-(134 ^ 130)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIIIlII[1];
        });
        if (llllllIIIIIIlI(nearest)) {
            nearest = NPCs.getNearest(npc3 -> {
                if (llllllIIIIIIlI(npc3.getInteracting()) && llllllIIIIIIII(Y.contains(npc3) ? 1 : 0) && llllllIIIIIIII(SquireGorillaPlugin.a(npc3.getId()) ? 1 : 0)) {
                    ?? r0 = llIIllIIIlII[3];
                    "".length();
                    return (-((149 ^ 142) ^ (122 ^ 101))) > 0 ? ((((128 + 28) - 88) + 171) ^ (((52 + 105) - 65) + 75)) & (((175 ^ 192) ^ (130 ^ 165)) ^ (-" ".length())) : r0;
                }
                return llIIllIIIlII[1];
            });
            if (llllllIIIIIIlI(nearest)) {
                Log.info(llIIllIIIIll[llIIllIIIlII[4]]);
                return llIIllIIIlII[1];
            }
        }
        if (llllllIIIIIIIl(Players.getLocal().getInteracting())) {
            return llIIllIIIlII[1];
        }
        nearest.interact(llIIllIIIIll[llIIllIIIlII[2]]);
        sleep(llIIllIIIlII[5]);
        return llIIllIIIlII[3];
    }

    private static boolean llllllIIIIIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean N() {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i = llIIllIIIlII[1];
        while (llllllIIIIIIll(i, length)) {
            if (llllllIIIIIlII(mapRegions[i], llIIllIIIlII[0])) {
                if (llllllIIIIIIIl(NPCs.getNearest(npc -> {
                    return npc.getName().toLowerCase().contains(llIIllIIIIll[llIIllIIIlII[5]]);
                }))) {
                    ?? r0 = llIIllIIIlII[3];
                    "".length();
                    return (((127 ^ 45) ^ (67 ^ 88)) & (((((27 + 159) - (-33)) + 17) ^ (((33 + 70) - 31) + 93)) ^ (-" ".length()))) != 0 ? ((35 ^ 103) ^ (52 ^ 62)) & (((((37 + 69) - 31) + 61) ^ (((145 + 77) - 142) + 118)) ^ (-" ".length())) : r0;
                }
                return llIIllIIIlII[1];
            }
            i++;
            "".length();
            if ((((114 ^ 104) ^ (79 ^ 12)) & (((166 ^ 154) ^ (65 ^ 36)) ^ (-" ".length()))) != 0) {
                return ((((102 + 95) - 86) + 27) ^ (((118 + 102) - 180) + 135)) & (((((15 + 125) - 77) + 90) ^ (((144 + 10) - (-18)) + 16)) ^ (-" ".length()));
            }
        }
        return llIIllIIIlII[1];
    }
}
