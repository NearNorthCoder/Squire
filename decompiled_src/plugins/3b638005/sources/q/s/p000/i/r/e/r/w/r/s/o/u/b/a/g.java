package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Handling Prayers", priority = Integer.MAX_VALUE)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.g  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/g.class */
public class g extends Task {
    private static /* synthetic */ int[] llllIIlllII;
    private static /* synthetic */ String[] llllIIllIll;
    private final /* synthetic */ SquireBarrowsConfig C;

    private List<Prayer> b(NPC npc) {
        String name = npc.getName();
        if (lIllIlIIlIllII(name)) {
            return List.of();
        }
        ArrayList arrayList = new ArrayList();
        if (lIllIlIIlIlllI(name.contains(llllIIllIll[llllIIlllII[0]]) ? 1 : 0)) {
            arrayList.addAll(this.C.karilOffensive().I());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        } else if (lIllIlIIlIlllI(name.contains(llllIIllIll[llllIIlllII[1]]) ? 1 : 0)) {
            arrayList.addAll(this.C.ahrimOffensive().I());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        } else if (lIllIlIIlIlllI(d.a(npc) ? 1 : 0)) {
            arrayList.addAll(this.C.defaultOffensive().I());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        } else {
            arrayList.addAll(this.C.tunnelOffensive().I());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        }
        return arrayList;
    }

    @Inject
    public g(SquireBarrowsConfig squireBarrowsConfig) {
        this.C = squireBarrowsConfig;
    }

    private static void lIllIlIIlIlIll() {
        llllIIlllII = new int[4];
        llllIIlllII[0] = ((119 ^ 86) ^ (225 ^ 157)) & (((((0 + 35) - (-33)) + 91) ^ (((71 + 69) - (-8)) + 46)) ^ (-" ".length()));
        llllIIlllII[1] = " ".length();
        llllIIlllII[2] = "  ".length();
        llllIIlllII[3] = 78 ^ 70;
    }

    private static String lIllIlIIlIlIIl(String llllllllllllllllIIIllIllIllIIlII, String llllllllllllllllIIIllIllIllIIIll) {
        String llllllllllllllllIIIllIllIllIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIllIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIllIllIIIlI = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIllIllIIIll.toCharArray();
        int llllllllllllllllIIIllIllIllIIIII = llllIIlllII[0];
        char[] charArray2 = llllllllllllllllIIIllIllIllIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llllIIlllII[0];
        while (lIllIlIIllIIIl(i, length)) {
            char llllllllllllllllIIIllIllIllIIlIl = charArray2[i];
            llllllllllllllllIIIllIllIllIIIlI.append((char) (llllllllllllllllIIIllIllIllIIlIl ^ charArray[llllllllllllllllIIIllIllIllIIIII % charArray.length]));
            "".length();
            llllllllllllllllIIIllIllIllIIIII++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllIllIllIIIlI);
    }

    private static boolean lIllIlIIlIllIl(int i) {
        return i == 0;
    }

    private static boolean lIllIlIIllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIlIIlIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIlIIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIIlIlIlI() {
        llllIIllIll = new String[llllIIlllII[2]];
        llllIIllIll[llllIIlllII[0]] = lIllIlIIlIlIII("01tF1GHVyzw=", "kOIEf");
        llllIIllIll[llllIIlllII[1]] = lIllIlIIlIlIIl("LzIkGQw=", "nZVpa");
    }

    private static boolean lIllIlIIlIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIIlIlllI(int i) {
        return i != 0;
    }

    private static String lIllIlIIlIlIII(String llllllllllllllllIIIllIllIlllIlII, String llllllllllllllllIIIllIllIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIllIlllIIll.getBytes(StandardCharsets.UTF_8)), llllIIlllII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIllIlllIlIl) {
            llllllllllllllllIIIllIllIlllIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (!lIllIlIIlIllII(local) && !lIllIlIIlIllIl(Prayers.getPoints())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if ((!lIllIlIIlIlllI(Reachable.isInteractable(npc) ? 1 : 0) || lIllIlIIlIllll(npc.getInteracting(), local)) && !lIllIlIIllIIII(local.getInteracting(), npc)) {
                    return llllIIlllII[0];
                }
                ?? r0 = llllIIlllII[1];
                "".length();
                return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (lIllIlIIlIllII(nearest)) {
                if (lIllIlIIlIlllI(Prayers.anyActive() ? 1 : 0)) {
                    Prayers.disableAll();
                    return llllIIlllII[1];
                }
                return llllIIlllII[0];
            }
            List<Prayer> b = b(nearest);
            if (lIllIlIIlIllII(b)) {
                return llllIIlllII[0];
            }
            Prayers.flick(b);
            "".length();
            return llllIIlllII[1];
        }
        return llllIIlllII[0];
    }

    static {
        lIllIlIIlIlIll();
        lIllIlIIlIlIlI();
    }
}
